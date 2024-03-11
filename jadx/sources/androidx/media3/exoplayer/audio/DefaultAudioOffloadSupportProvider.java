package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* loaded from: classes2.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes) {
        Assertions.checkNotNull(format);
        Assertions.checkNotNull(audioAttributes);
        int i = Util.SDK_INT;
        if (i < 29 || format.sampleRate == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean isOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (encoding == 0 || i < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            if (i >= 31) {
                return Api31.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, isOffloadVariableRateSupported);
            }
            return Api29.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, isOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    private boolean isOffloadVariableRateSupported(Context context) {
        Boolean bool;
        AudioManager audioManager;
        Boolean bool2 = this.isOffloadVariableRateSupported;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            bool = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        this.isOffloadVariableRateSupported = bool;
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    /* loaded from: classes2.dex */
    static final class Api29 {
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
        }
    }

    /* loaded from: classes2.dex */
    static final class Api31 {
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(Util.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
        }
    }
}
