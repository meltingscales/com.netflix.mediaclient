package androidx.media3.common.audio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public class SonicAudioProcessor implements AudioProcessor {
    private ByteBuffer buffer;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private ShortBuffer shortBuffer;
    private Sonic sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;

    public final void setPitch(float f) {
        if (this.pitch != f) {
            this.pitch = f;
            this.pendingSonicRecreation = true;
        }
    }

    public final void setSpeed(float f) {
        if (this.speed != f) {
            this.speed = f;
            this.pendingSonicRecreation = true;
        }
    }

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
    }

    public final long getMediaDuration(long j) {
        if (this.outputBytes >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long pendingInputBytes = this.inputBytes - ((Sonic) Assertions.checkNotNull(this.sonic)).getPendingInputBytes();
            int i = this.outputAudioFormat.sampleRate;
            int i2 = this.inputAudioFormat.sampleRate;
            if (i == i2) {
                return Util.scaleLargeTimestamp(j, pendingInputBytes, this.outputBytes);
            }
            return Util.scaleLargeTimestamp(j, pendingInputBytes * i, this.outputBytes * i2);
        }
        return (long) (this.speed * j);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.pendingOutputAudioFormat.sampleRate != -1 && (Math.abs(this.speed - 1.0f) >= 1.0E-4f || Math.abs(this.pitch - 1.0f) >= 1.0E-4f || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.inputBytes += remaining;
            ((Sonic) Assertions.checkNotNull(this.sonic)).queueInput(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int outputSize;
        Sonic sonic = this.sonic;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.buffer.capacity() < outputSize) {
                ByteBuffer order = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.buffer = order;
                this.shortBuffer = order.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            sonic.getOutput(this.shortBuffer);
            this.outputBytes += outputSize;
            this.buffer.limit(outputSize);
            this.outputBuffer = this.buffer;
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        Sonic sonic;
        return this.inputEnded && ((sonic = this.sonic) == null || sonic.getOutputSize() == 0);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate);
            } else {
                Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }
}
