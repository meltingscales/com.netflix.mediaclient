package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface AdsLoader {

    /* loaded from: classes5.dex */
    public interface EventListener {
    }

    /* loaded from: classes5.dex */
    public interface Provider {
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i2);

    void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException);

    void setSupportedContentTypes(int... iArr);

    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
