package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public class DefaultAudioSink implements AudioSink {
    public static boolean failOnSpuriousAudioTimestamp = false;
    private static int pendingReleaseCount;
    private static ExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final AudioOffloadSupportProvider audioOffloadSupportProvider;
    private AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    public AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    public final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    public Configuration configuration;
    private final Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private ByteBuffer outputBuffer;
    private Configuration pendingConfiguration;
    private Looper playbackLooper;
    private PlaybackParameters playbackParameters;
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final boolean preferAudioTrackPlaybackParams;
    private AudioDeviceInfoApi23 preferredDevice;
    private final ConditionVariable releasingConditionVariable;
    private boolean skipSilenceEnabled;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final ImmutableList<AudioProcessor> toFloatPcmAvailableAudioProcessors;
    private final ImmutableList<AudioProcessor> toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* loaded from: classes2.dex */
    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes);
    }

    /* loaded from: classes2.dex */
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    /* loaded from: classes2.dex */
    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    /* loaded from: classes2.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.getMediaDuration(j);
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private AudioCapabilities audioCapabilities;
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private boolean buildCalled;
        private final Context context;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;

        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z) {
            this.enableAudioTrackPlaybackParams = z;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        @Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
        }

        public Builder(Context context) {
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
        }

        public Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public DefaultAudioSink build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new DefaultAudioSink(this);
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public DefaultAudioSink(Builder builder) {
        AudioCapabilities audioCapabilities;
        Context context = builder.context;
        this.context = context;
        if (context == null) {
            audioCapabilities = builder.audioCapabilities;
        } else {
            audioCapabilities = AudioCapabilities.getCapabilities(context);
        }
        this.audioCapabilities = audioCapabilities;
        this.audioProcessorChain = builder.audioProcessorChain;
        int i = Util.SDK_INT;
        boolean z = true;
        this.enableFloatOutput = i >= 21 && builder.enableFloatOutput;
        this.preferAudioTrackPlaybackParams = (i < 23 || !builder.enableAudioTrackPlaybackParams) ? false : z;
        this.offloadMode = 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.audioOffloadSupportProvider = (AudioOffloadSupportProvider) Assertions.checkNotNull(builder.audioOffloadSupportProvider);
        ConditionVariable conditionVariable = new ConditionVariable(Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toIntPcmAvailableAudioProcessors = ImmutableList.of((TrimmingAudioProcessor) new ToInt16PcmAudioProcessor(), (TrimmingAudioProcessor) channelMappingAudioProcessor, trimmingAudioProcessor);
        this.toFloatPcmAvailableAudioProcessors = ImmutableList.of(new ToFloatPcmAudioProcessor());
        this.volume = 1.0f;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
        this.audioOffloadListener = builder.audioOffloadListener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.audioTrackPositionTracker.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!"audio/raw".equals(format.sampleMimeType)) {
            return getAudioCapabilities().isPassthroughPlaybackSupported(format) ? 2 : 0;
        } else if (!Util.isEncodingLinearPcm(format.pcmEncoding)) {
            Log.w("DefaultAudioSink", "Invalid PCM encoding: " + format.pcmEncoding);
            return 0;
        } else {
            int i = format.pcmEncoding;
            return (i == 2 || (this.enableFloatOutput && i == 4)) ? 2 : 1;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        if (this.offloadDisabledUntilNextConfiguration) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        return this.audioOffloadSupportProvider.getAudioOffloadSupport(format, this.audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i, int[] iArr) {
        AudioOffloadSupport audioOffloadSupport;
        AudioProcessingPipeline audioProcessingPipeline;
        int i2;
        int i3;
        boolean z;
        int i4;
        int intValue;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int bufferSizeInBytes;
        int[] iArr2;
        if ("audio/raw".equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            i2 = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                builder.addAll((Iterable) this.toFloatPcmAvailableAudioProcessors);
            } else {
                builder.addAll((Iterable) this.toIntPcmAvailableAudioProcessors);
                builder.add((Object[]) this.audioProcessorChain.getAudioProcessors());
            }
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(builder.build());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr2[i11] = i11;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            try {
                AudioProcessor.AudioFormat configure = audioProcessingPipeline2.configure(new AudioProcessor.AudioFormat(format));
                int i12 = configure.encoding;
                int i13 = configure.sampleRate;
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(configure.channelCount);
                i6 = 0;
                z = false;
                i3 = Util.getPcmFrameSize(i12, configure.channelCount);
                audioProcessingPipeline = audioProcessingPipeline2;
                i4 = i13;
                intValue = audioTrackChannelConfig;
                z2 = this.preferAudioTrackPlaybackParams;
                i5 = i12;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, format);
            }
        } else {
            AudioProcessingPipeline audioProcessingPipeline3 = new AudioProcessingPipeline(ImmutableList.of());
            int i14 = format.sampleRate;
            if (this.offloadMode != 0) {
                audioOffloadSupport = getFormatOffloadSupport(format);
            } else {
                audioOffloadSupport = AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            if (this.offloadMode != 0 && audioOffloadSupport.isFormatSupported) {
                int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                int audioTrackChannelConfig2 = Util.getAudioTrackChannelConfig(format.channelCount);
                audioProcessingPipeline = audioProcessingPipeline3;
                i6 = 1;
                z2 = true;
                i2 = -1;
                i3 = -1;
                i4 = i14;
                z = audioOffloadSupport.isGaplessSupported;
                i5 = encoding;
                intValue = audioTrackChannelConfig2;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = getAudioCapabilities().getEncodingAndChannelConfigForPassthrough(format);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int intValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                audioProcessingPipeline = audioProcessingPipeline3;
                i2 = -1;
                i3 = -1;
                z = false;
                i4 = i14;
                intValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i5 = intValue2;
                z2 = this.preferAudioTrackPlaybackParams;
                i6 = 2;
            }
        }
        if (i5 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i6 + ") for: " + format, format);
        } else if (intValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i6 + ") for: " + format, format);
        } else {
            if (i != 0) {
                bufferSizeInBytes = i;
                i7 = i5;
                i8 = intValue;
                i9 = i3;
                i10 = i4;
            } else {
                i7 = i5;
                i8 = intValue;
                i9 = i3;
                i10 = i4;
                bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i4, intValue, i5), i5, i6, i3 != -1 ? i3 : 1, i4, format.bitrate, z2 ? 8.0d : 1.0d);
            }
            this.offloadDisabledUntilNextConfiguration = false;
            Configuration configuration = new Configuration(format, i2, i6, i9, i10, i8, i7, bufferSizeInBytes, audioProcessingPipeline, z2, z, this.tunneling);
            if (isAudioTrackInitialized()) {
                this.pendingConfiguration = configuration;
            } else {
                this.configuration = configuration;
            }
        }
    }

    private void setupAudioProcessors() {
        AudioProcessingPipeline audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
    }

    private boolean initializeAudioTrack() {
        PlayerId playerId;
        if (this.releasingConditionVariable.isOpen()) {
            AudioTrack buildAudioTrackWithRetry = buildAudioTrackWithRetry();
            this.audioTrack = buildAudioTrackWithRetry;
            if (isOffloadedPlayback(buildAudioTrackWithRetry)) {
                registerStreamEventCallbackV29(this.audioTrack);
                Configuration configuration = this.configuration;
                if (configuration.enableOffloadGapless) {
                    AudioTrack audioTrack = this.audioTrack;
                    Format format = configuration.inputFormat;
                    audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                }
            }
            int i = Util.SDK_INT;
            if (i >= 31 && (playerId = this.playerId) != null) {
                Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
            }
            this.audioSessionId = this.audioTrack.getAudioSessionId();
            AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
            AudioTrack audioTrack2 = this.audioTrack;
            Configuration configuration2 = this.configuration;
            audioTrackPositionTracker.setAudioTrack(audioTrack2, configuration2.outputMode == 2, configuration2.outputEncoding, configuration2.outputPcmFrameSize, configuration2.bufferSize);
            setVolumeInternal();
            int i2 = this.auxEffectInfo.effectId;
            if (i2 != 0) {
                this.audioTrack.attachAuxEffect(i2);
                this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
            }
            AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.preferredDevice;
            if (audioDeviceInfoApi23 != null && i >= 23) {
                Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, audioDeviceInfoApi23);
            }
            this.startMediaTimeUsNeedsInit = true;
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (!this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            } else {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.configuration.enableOffloadGapless) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    Format format = this.configuration.inputFormat;
                    audioTrack2.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            if (this.inputBuffer == null) {
                Assertions.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                Configuration configuration = this.configuration;
                if (configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                    int framesPerEncodedSample = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                    this.framesPerEncodedSample = framesPerEncodedSample;
                    if (framesPerEncodedSample == 0) {
                        return true;
                    }
                }
                if (this.afterDrainParameters != null) {
                    if (!drainToEndOfStream()) {
                        return false;
                    }
                    applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                    this.afterDrainParameters = null;
                }
                long inputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
                if (!this.startMediaTimeUsNeedsSync && Math.abs(inputFramesToDurationUs - j) > 200000) {
                    AudioSink.Listener listener = this.listener;
                    if (listener != null) {
                        listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j, inputFramesToDurationUs));
                    }
                    this.startMediaTimeUsNeedsSync = true;
                }
                if (this.startMediaTimeUsNeedsSync) {
                    if (!drainToEndOfStream()) {
                        return false;
                    }
                    long j2 = j - inputFramesToDurationUs;
                    this.startMediaTimeUs += j2;
                    this.startMediaTimeUsNeedsSync = false;
                    applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                    AudioSink.Listener listener2 = this.listener;
                    if (listener2 != null && j2 != 0) {
                        listener2.onPositionDiscontinuity();
                    }
                }
                if (this.configuration.outputMode == 0) {
                    this.submittedPcmBytes += byteBuffer.remaining();
                } else {
                    this.submittedEncodedFrames += this.framesPerEncodedSample * i;
                }
                this.inputBuffer = byteBuffer;
                this.inputBufferAccessUnitCount = i;
            }
            processBuffers(j);
            if (!this.inputBuffer.hasRemaining()) {
                this.inputBuffer = null;
                this.inputBufferAccessUnitCount = 0;
                return true;
            } else if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private AudioTrack buildAudioTrackWithRetry() {
        try {
            return buildAudioTrack((Configuration) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e) {
            Configuration configuration = this.configuration;
            if (configuration.bufferSize > 1000000) {
                Configuration copyWithBufferSize = configuration.copyWithBufferSize(Prefetch.NANOSECONDS_PER_MILLISECOND);
                try {
                    AudioTrack buildAudioTrack = buildAudioTrack(copyWithBufferSize);
                    this.configuration = copyWithBufferSize;
                    return buildAudioTrack;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private AudioTrack buildAudioTrack(Configuration configuration) {
        try {
            AudioTrack buildAudioTrack = configuration.buildAudioTrack(this.audioAttributes, this.audioSessionId);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener != null) {
                audioOffloadListener.onOffloadedPlayback(isOffloadedPlayback(buildAudioTrack));
            }
            return buildAudioTrack;
        } catch (AudioSink.InitializationException e) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = r2.inputBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r0.hasRemaining() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r2.audioProcessingPipeline.queueInput(r2.inputBuffer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processBuffers(long r3) {
        /*
            r2 = this;
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r2.audioProcessingPipeline
            boolean r0 = r0.isOperational()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r2.inputBuffer
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            java.nio.ByteBuffer r0 = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER
        Lf:
            r2.writeBuffer(r0, r3)
            return
        L13:
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r2.audioProcessingPipeline
            boolean r0 = r0.isEnded()
            if (r0 != 0) goto L44
        L1b:
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r2.audioProcessingPipeline
            java.nio.ByteBuffer r0 = r0.getOutput()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L31
            r2.writeBuffer(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L1b
            return
        L31:
            java.nio.ByteBuffer r0 = r2.inputBuffer
            if (r0 == 0) goto L44
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r2.audioProcessingPipeline
            java.nio.ByteBuffer r1 = r2.inputBuffer
            r0.queueInput(r1)
            goto L13
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.processBuffers(long):void");
    }

    private boolean drainToEndOfStream() {
        ByteBuffer byteBuffer;
        if (this.audioProcessingPipeline.isOperational()) {
            this.audioProcessingPipeline.queueEndOfStream();
            processBuffers(Long.MIN_VALUE);
            return this.audioProcessingPipeline.isEnded() && ((byteBuffer = this.outputBuffer) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        if (byteBuffer2 == null) {
            return true;
        }
        writeBuffer(byteBuffer2, Long.MIN_VALUE);
        return this.outputBuffer == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeBuffer(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.writeBuffer(java.nio.ByteBuffer, long):void");
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (Util.SDK_INT >= 24 && i == -6) || i == -32;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.handledEndOfStream && !hasPendingData());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.playbackParameters = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(playbackParameters);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.skipSilenceEnabled = z;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioTrack.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        this.preferredDevice = audioDeviceInfoApi23;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            Api23.setPreferredDeviceOnAudioTrack(audioTrack, audioDeviceInfoApi23);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i) {
        Assertions.checkState(Util.SDK_INT >= 29);
        this.offloadMode = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i, int i2) {
        Configuration configuration;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (configuration = this.configuration) == null || !configuration.enableOffloadGapless) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            if (this.audioTrackPositionTracker.pause() || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((StreamEventCallbackV29) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            if (Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            AudioSink.AudioTrackConfig buildAudioTrackConfig = this.configuration.buildAudioTrackConfig();
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable, this.listener, buildAudioTrackConfig);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        UnmodifiableIterator<AudioProcessor> it = this.toIntPcmAvailableAudioProcessors.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        UnmodifiableIterator<AudioProcessor> it2 = this.toFloatPcmAvailableAudioProcessors.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        Assertions.checkState(this.playbackLooper == Looper.myLooper());
        if (audioCapabilities.equals(getAudioCapabilities())) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.playbackParameters.speed).setPitch(this.playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.w("DefaultAudioSink", "Failed to set playback params", e);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.playbackParameters = playbackParameters;
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
    }

    private void setAudioProcessorPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        PlaybackParameters playbackParameters;
        if (!useAudioTrackPlaybackParams()) {
            if (shouldApplyAudioProcessorPlaybackParameters()) {
                playbackParameters = this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters);
            } else {
                playbackParameters = PlaybackParameters.DEFAULT;
            }
            this.playbackParameters = playbackParameters;
        } else {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParameters2, Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (!this.tunneling) {
            Configuration configuration = this.configuration;
            if (configuration.outputMode == 0 && !shouldUseFloatOutput(configuration.inputFormat.pcmEncoding)) {
                return true;
            }
        }
        return false;
    }

    private boolean useAudioTrackPlaybackParams() {
        Configuration configuration = this.configuration;
        return configuration != null && configuration.enableAudioTrackPlaybackParams && Util.SDK_INT >= 23;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i);
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j2 = j - mediaPositionParameters.audioTrackPositionUs;
        if (mediaPositionParameters.playbackParameters.equals(PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.mediaTimeUs + j2;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j2);
        }
        MediaPositionParameters first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j) {
        return j + this.configuration.framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    public long getSubmittedFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.submittedPcmBytes / configuration.inputPcmFrameSize : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? Util.ceilDivide(this.writtenPcmBytes, configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private AudioCapabilities getAudioCapabilities() {
        if (this.audioCapabilitiesReceiver == null && this.context != null) {
            this.playbackLooper = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(this.context, new AudioCapabilitiesReceiver.Listener() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda5
                @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
                public final void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                    DefaultAudioSink.this.onAudioCapabilitiesChanged(audioCapabilities);
                }
            });
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver;
            this.audioCapabilities = audioCapabilitiesReceiver.register();
        }
        return this.audioCapabilities;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Util.SDK_INT >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int parseMpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (parseMpegAudioFrameSampleCount != -1) {
                    return parseMpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int findTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (findTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, findTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
            case 20:
                return OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
    }

    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.avSyncHeader = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int remaining = this.avSyncHeader.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.avSyncHeader, remaining, 1);
            if (write < 0) {
                this.bytesUntilNextAvSync = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int writeNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i);
        if (writeNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return writeNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= writeNonBlockingV21;
        return writeNonBlockingV21;
    }

    private static void setVolumeInternalV21(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, final ConditionVariable conditionVariable, final AudioSink.Listener listener, final AudioSink.AudioTrackConfig audioTrackConfig) {
        conditionVariable.close();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (releaseExecutorLock) {
            if (releaseExecutor == null) {
                releaseExecutor = Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
            }
            pendingReleaseCount++;
            releaseExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAudioSink.lambda$releaseAudioTrackAsync$1(audioTrack, listener, handler, audioTrackConfig, conditionVariable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, final AudioSink.Listener listener, Handler handler, final AudioSink.AudioTrackConfig audioTrackConfig, ConditionVariable conditionVariable) {
        try {
            try {
                audioTrack.flush();
                audioTrack.release();
                if (listener != null && handler.getLooper().getThread().isAlive()) {
                    handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioSink.Listener.this.onAudioTrackReleased(audioTrackConfig);
                        }
                    });
                }
                conditionVariable.open();
                synchronized (releaseExecutorLock) {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                }
            } catch (Exception e) {
                Log.e("DefaultAudioSink", "unable to flush", e);
                if (listener != null && handler.getLooper().getThread().isAlive()) {
                    handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioSink.Listener.this.onAudioTrackReleased(audioTrackConfig);
                        }
                    });
                }
                conditionVariable.open();
                synchronized (releaseExecutorLock) {
                    int i2 = pendingReleaseCount - 1;
                    pendingReleaseCount = i2;
                    if (i2 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                }
            }
        } catch (Throwable th) {
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSink.Listener.this.onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i3 = pendingReleaseCount - 1;
                pendingReleaseCount = i3;
                if (i3 == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler = new Handler(Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ConcurrencyHelpers$$ExternalSyntheticLambda1(handler), this.callback);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        private MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioTrackPositionUs = j2;
        }
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    /* loaded from: classes2.dex */
    final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i, long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Configuration {
        public final AudioProcessingPipeline audioProcessingPipeline;
        public final int bufferSize;
        public final boolean enableAudioTrackPlaybackParams;
        public final boolean enableOffloadGapless;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;
        public final boolean tunneling;

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }

        public Configuration(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, AudioProcessingPipeline audioProcessingPipeline, boolean z, boolean z2, boolean z3) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i;
            this.outputMode = i2;
            this.outputPcmFrameSize = i3;
            this.outputSampleRate = i4;
            this.outputChannelConfig = i5;
            this.outputEncoding = i6;
            this.bufferSize = i7;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.enableAudioTrackPlaybackParams = z;
            this.enableOffloadGapless = z2;
            this.tunneling = z3;
        }

        public Configuration copyWithBufferSize(int i) {
            return new Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i, this.audioProcessingPipeline, this.enableAudioTrackPlaybackParams, this.enableOffloadGapless, this.tunneling);
        }

        public boolean canReuseAudioTrack(Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize && configuration.enableAudioTrackPlaybackParams == this.enableAudioTrackPlaybackParams && configuration.enableOffloadGapless == this.enableOffloadGapless;
        }

        public long inputFramesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.inputFormat.sampleRate);
        }

        public long framesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.outputSampleRate);
        }

        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            return new AudioSink.AudioTrackConfig(this.outputEncoding, this.outputSampleRate, this.outputChannelConfig, this.tunneling, this.outputMode == 1, this.bufferSize);
        }

        public AudioTrack buildAudioTrack(AudioAttributes audioAttributes, int i) {
            try {
                AudioTrack createAudioTrack = createAudioTrack(audioAttributes, i);
                int state = createAudioTrack.getState();
                if (state == 1) {
                    return createAudioTrack;
                }
                try {
                    createAudioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e);
            }
        }

        private AudioTrack createAudioTrack(AudioAttributes audioAttributes, int i) {
            int i2 = Util.SDK_INT;
            if (i2 >= 29) {
                return createAudioTrackV29(audioAttributes, i);
            }
            if (i2 >= 21) {
                return createAudioTrackV21(audioAttributes, i);
            }
            return createAudioTrackV9(audioAttributes, i);
        }

        private AudioTrack createAudioTrackV29(AudioAttributes audioAttributes, int i) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, this.tunneling)).setAudioFormat(Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i).setOffloadedPlayback(this.outputMode == 1);
            return offloadedPlayback.build();
        }

        private AudioTrack createAudioTrackV21(AudioAttributes audioAttributes, int i) {
            return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, this.tunneling), Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i);
        }

        private AudioTrack createAudioTrackV9(AudioAttributes audioAttributes, int i) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            if (i == 0) {
                return new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1);
            }
            return new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i);
        }

        private static android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z) {
            if (z) {
                return getAudioTrackTunnelingAttributesV21();
            }
            return audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PendingExceptionHolder<T extends Exception> {
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public void clear() {
            this.pendingException = null;
        }

        public PendingExceptionHolder(long j) {
            this.throwDelayMs = j;
        }

        public void throwExceptionIfDeadlineIsReached(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
                this.throwDeadlineMs = this.throwDelayMs + elapsedRealtime;
            }
            if (elapsedRealtime >= this.throwDeadlineMs) {
                T t2 = this.pendingException;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.pendingException;
                clear();
                throw t3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AudioDeviceInfoApi23 {
        public final AudioDeviceInfo audioDeviceInfo;

        public AudioDeviceInfoApi23(AudioDeviceInfo audioDeviceInfo) {
            this.audioDeviceInfo = audioDeviceInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api23 {
        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api31 {
        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
