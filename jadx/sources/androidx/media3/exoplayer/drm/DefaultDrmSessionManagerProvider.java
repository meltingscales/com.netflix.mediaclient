package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {
    private MediaItem.DrmConfiguration drmConfiguration;
    private DataSource.Factory drmHttpDataSourceFactory;
    private final Object lock = new Object();
    private DrmSessionManager manager;
    private String userAgent;

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager get(MediaItem mediaItem) {
        DrmSessionManager drmSessionManager;
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.DrmConfiguration drmConfiguration = mediaItem.localConfiguration.drmConfiguration;
        if (drmConfiguration == null || Util.SDK_INT < 18) {
            return DrmSessionManager.DRM_UNSUPPORTED;
        }
        synchronized (this.lock) {
            if (!Util.areEqual(drmConfiguration, this.drmConfiguration)) {
                this.drmConfiguration = drmConfiguration;
                this.manager = createManager(drmConfiguration);
            }
            drmSessionManager = (DrmSessionManager) Assertions.checkNotNull(this.manager);
        }
        return drmSessionManager;
    }

    private DrmSessionManager createManager(MediaItem.DrmConfiguration drmConfiguration) {
        DataSource.Factory factory = this.drmHttpDataSourceFactory;
        if (factory == null) {
            factory = new DefaultHttpDataSource.Factory().setUserAgent(this.userAgent);
        }
        Uri uri = drmConfiguration.licenseUri;
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(uri == null ? null : uri.toString(), drmConfiguration.forceDefaultLicenseUri, factory);
        UnmodifiableIterator<Map.Entry<String, String>> it = drmConfiguration.licenseRequestHeaders.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            httpMediaDrmCallback.setKeyRequestProperty(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager build = new DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(drmConfiguration.scheme, FrameworkMediaDrm.DEFAULT_PROVIDER).setMultiSession(drmConfiguration.multiSession).setPlayClearSamplesWithoutKeys(drmConfiguration.playClearContentWithoutKey).setUseDrmSessionsForClearContent(Ints.toArray(drmConfiguration.forcedSessionTrackTypes)).build(httpMediaDrmCallback);
        build.setMode(0, drmConfiguration.getKeySetId());
        return build;
    }
}
