package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public class TextRenderer extends BaseRenderer implements Handler.Callback {
    private final CueDecoder cueDecoder;
    private final DecoderInputBuffer cueDecoderInputBuffer;
    private CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private SubtitleInputBuffer nextSubtitleInputBuffer;
    private final TextOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    public int renderCount;
    public int skipCount;
    public Format streamFormat;
    private SubtitleOutputBuffer subtitle;
    private SubtitleDecoder subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "TextRenderer";
    }

    public boolean hasSubtitleOutputBuffer() {
        return (this.subtitle == null && this.nextSubtitle == null) ? false : true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.renderCount = -1;
        this.skipCount = -1;
        this.output = (TextOutput) Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new CueDecoder();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (isCuesWithTiming(format) || this.subtitleDecoderFactory.supportsFormat(format)) {
            return RendererCapabilities.create(format.cryptoType == 0 ? 4 : 2);
        } else if (MimeTypes.isText(format.sampleMimeType)) {
            return RendererCapabilities.create(1);
        } else {
            return RendererCapabilities.create(0);
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        CuesResolver replacingCuesResolver;
        boolean equals = formatArr[0].equals(this.streamFormat);
        this.outputStreamOffsetUs = j2;
        Format format = formatArr[0];
        this.streamFormat = format;
        if (isCuesWithTiming(format)) {
            if (this.streamFormat.cueReplacementBehavior == 1) {
                replacingCuesResolver = new MergingCuesResolver();
            } else {
                replacingCuesResolver = new ReplacingCuesResolver();
            }
            this.cuesResolver = replacingCuesResolver;
        } else if (this.subtitleDecoder == null) {
            initSubtitleDecoder();
        } else if (!equals) {
            this.decoderReplacementState = 1;
        }
        this.renderCount = 0;
        this.skipCount = 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z) {
        this.lastRendererPositionUs = j;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).flush();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        if (isCuesWithTiming((Format) Assertions.checkNotNull(this.streamFormat))) {
            Assertions.checkNotNull(this.cuesResolver);
            renderFromCuesWithTiming(j);
            return;
        }
        renderFromSubtitles(j);
    }

    @RequiresNonNull({"this.cuesResolver"})
    private void renderFromCuesWithTiming(long j) {
        boolean readAndDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        int i = (nextCueChangeTimeUs > Long.MIN_VALUE ? 1 : (nextCueChangeTimeUs == Long.MIN_VALUE ? 0 : -1));
        if (i == 0 && this.inputStreamEnded && !readAndDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if ((i != 0 && nextCueChangeTimeUs <= j) || readAndDecodeCuesWithTiming) {
            ImmutableList<Cue> cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j);
            updateOutput(new CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j;
    }

    @RequiresNonNull({"this.cuesResolver"})
    private boolean readAndDecodeCuesWithTiming(long j) {
        if (!this.inputStreamEnded && readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) == -4) {
            if (this.cueDecoderInputBuffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return false;
            }
            this.cueDecoderInputBuffer.flip();
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.cueDecoderInputBuffer.data);
            CuesWithTiming decode = this.cueDecoder.decode(this.cueDecoderInputBuffer.timeUs, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
            this.cueDecoderInputBuffer.clear();
            return this.cuesResolver.addCues(decode, j);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
        if (r6 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void renderFromSubtitles(long r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.TextRenderer.renderFromSubtitles(long):void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        this.subtitleDecoder = this.subtitleDecoderFactory.createDecoder((Format) Assertions.checkNotNull(this.streamFormat));
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
        this.renderCount++;
    }

    private void clearOutput() {
        updateOutput(new CueGroup(ImmutableList.of(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            invokeUpdateOutputInternal((CueGroup) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    protected void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        Log.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex == -1) {
            SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
            return subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1);
        }
        return this.subtitle.getEventTime(nextEventTimeIndex - 1);
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j) {
        Assertions.checkState(j != -9223372036854775807L);
        Assertions.checkState(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }

    public int readTextSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        return super.readSource(formatHolder, decoderInputBuffer, i);
    }

    private static boolean isCuesWithTiming(Format format) {
        return Objects.equals(format.sampleMimeType, "application/x-media3-cues");
    }
}
