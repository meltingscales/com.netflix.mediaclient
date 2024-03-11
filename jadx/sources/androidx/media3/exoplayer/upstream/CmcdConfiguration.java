package androidx.media3.exoplayer.upstream;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.common.collect.ImmutableListMultimap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class CmcdConfiguration {
    public final String contentId;
    public final int dataTransmissionMode;
    public final RequestConfig requestConfig;
    public final String sessionId;

    /* loaded from: classes5.dex */
    public interface Factory {
        public static final Factory DEFAULT = new Factory() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration$Factory$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
            public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
                CmcdConfiguration lambda$static$0;
                lambda$static$0 = CmcdConfiguration.Factory.lambda$static$0(mediaItem);
                return lambda$static$0;
            }
        };

        CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ CmcdConfiguration lambda$static$0(MediaItem mediaItem) {
            String uuid = UUID.randomUUID().toString();
            String str = mediaItem.mediaId;
            if (str == null) {
                str = "";
            }
            return new CmcdConfiguration(uuid, str, new RequestConfig() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.1
            });
        }
    }

    /* loaded from: classes5.dex */
    public interface RequestConfig {
        default int getRequestedMaximumThroughputKbps(int i) {
            return -2147483647;
        }

        default boolean isKeyAllowed(String str) {
            return true;
        }

        default ImmutableListMultimap<String, String> getCustomData() {
            return ImmutableListMultimap.of();
        }
    }

    public CmcdConfiguration(String str, String str2, RequestConfig requestConfig) {
        this(str, str2, requestConfig, 0);
    }

    public CmcdConfiguration(String str, String str2, RequestConfig requestConfig, int i) {
        boolean z = true;
        Assertions.checkArgument(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        Assertions.checkArgument(z);
        Assertions.checkNotNull(requestConfig);
        this.sessionId = str;
        this.contentId = str2;
        this.requestConfig = requestConfig;
        this.dataTransmissionMode = i;
    }

    public boolean isBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("bl");
    }

    public boolean isContentIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("cid");
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("sid");
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("rtp");
    }

    public boolean isStreamingFormatLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("sf");
    }

    public boolean isStreamTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("st");
    }

    public boolean isTopBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("tb");
    }

    public boolean isObjectDurationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("d");
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("mtp");
    }

    public boolean isObjectTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("ot");
    }

    public boolean isBufferStarvationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("bs");
    }

    public boolean isDeadlineLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("dl");
    }

    public boolean isPlaybackRateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("pr");
    }

    public boolean isStartupLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("su");
    }

    public boolean isNextObjectRequestLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("nor");
    }

    public boolean isNextRangeRequestLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("nrr");
    }
}
