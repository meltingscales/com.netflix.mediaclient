package com.netflix.mediaclient.drm;

import android.annotation.TargetApi;
import android.media.MediaDrm;
import android.os.Handler;
import android.os.PersistableBundle;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmApi23;
import com.netflix.mediaclient.drm.NetflixMediaDrmApi29;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.chromium.net.ConnectionSubtype;

@TargetApi(ConnectionSubtype.SUBTYPE_WIFI_G)
/* loaded from: classes3.dex */
public class PlatformMediaDrmApi29 extends PlatformMediaDrmApi28 implements NetflixMediaDrmApi29 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformMediaDrmApi29(UUID uuid) {
        super(uuid);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void clearOnEventListener() {
        this.mMediaDrm.clearOnEventListener();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void clearOnExpirationUpdateListener() {
        this.mMediaDrm.clearOnExpirationUpdateListener();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void clearOnKeyStatusChangeListener() {
        this.mMediaDrm.clearOnKeyStatusChangeListener();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void clearOnSessionLostStateListener() {
        this.mMediaDrm.clearOnSessionLostStateListener();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public List<byte[]> getOfflineLicenseKeySetIds() {
        List<byte[]> offlineLicenseKeySetIds;
        offlineLicenseKeySetIds = this.mMediaDrm.getOfflineLicenseKeySetIds();
        return offlineLicenseKeySetIds;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public int getOfflineLicenseState(byte[] bArr) {
        int offlineLicenseState;
        offlineLicenseState = this.mMediaDrm.getOfflineLicenseState(bArr);
        return offlineLicenseState;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void removeOfflineLicense(byte[] bArr) {
        this.mMediaDrm.removeOfflineLicense(bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void setOnEventListener(final NetflixMediaDrm.OnEventListener onEventListener, Handler handler) {
        this.mMediaDrm.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrmApi29$$ExternalSyntheticLambda12
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                PlatformMediaDrmApi29.this.lambda$setOnEventListener$0(onEventListener, mediaDrm, bArr, i, i2, bArr2);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnEventListener$0(NetflixMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void setOnExpirationUpdateListener(Executor executor, final NetflixMediaDrmApi23.OnExpirationUpdateListener onExpirationUpdateListener) {
        MediaDrm mediaDrm = this.mMediaDrm;
        Objects.requireNonNull(onExpirationUpdateListener);
        mediaDrm.setOnExpirationUpdateListener(executor, new MediaDrm.OnExpirationUpdateListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrmApi29$$ExternalSyntheticLambda11
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm2, byte[] bArr, long j) {
                NetflixMediaDrmApi23.OnExpirationUpdateListener.this.onExpirationUpdate(mediaDrm2, bArr, j);
            }
        });
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void setOnKeyStatusChangeListener(Executor executor, final NetflixMediaDrmApi23.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        this.mMediaDrm.setOnKeyStatusChangeListener(executor, new MediaDrm.OnKeyStatusChangeListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrmApi29$$ExternalSyntheticLambda10
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
                PlatformMediaDrmApi29.this.lambda$setOnKeyStatusChangeListener$1(onKeyStatusChangeListener, mediaDrm, bArr, list, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnKeyStatusChangeListener$1(NetflixMediaDrmApi23.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, PlatformMediaDrmApi23.convertKeyStatuses(list), z);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void setOnSessionLostStateListener(final NetflixMediaDrmApi29.OnSessionLostStateListener onSessionLostStateListener, Handler handler) {
        this.mMediaDrm.setOnSessionLostStateListener(new MediaDrm.OnSessionLostStateListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrmApi29$$ExternalSyntheticLambda14
            @Override // android.media.MediaDrm.OnSessionLostStateListener
            public final void onSessionLostState(MediaDrm mediaDrm, byte[] bArr) {
                PlatformMediaDrmApi29.this.lambda$setOnSessionLostStateListener$2(onSessionLostStateListener, mediaDrm, bArr);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnSessionLostStateListener$2(NetflixMediaDrmApi29.OnSessionLostStateListener onSessionLostStateListener, MediaDrm mediaDrm, byte[] bArr) {
        onSessionLostStateListener.onSessionLostState(this, bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public void setOnSessionLostStateListener(Executor executor, final NetflixMediaDrmApi29.OnSessionLostStateListener onSessionLostStateListener) {
        this.mMediaDrm.setOnSessionLostStateListener(executor, new MediaDrm.OnSessionLostStateListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrmApi29$$ExternalSyntheticLambda13
            @Override // android.media.MediaDrm.OnSessionLostStateListener
            public final void onSessionLostState(MediaDrm mediaDrm, byte[] bArr) {
                PlatformMediaDrmApi29.this.lambda$setOnSessionLostStateListener$3(onSessionLostStateListener, mediaDrm, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnSessionLostStateListener$3(NetflixMediaDrmApi29.OnSessionLostStateListener onSessionLostStateListener, MediaDrm mediaDrm, byte[] bArr) {
        onSessionLostStateListener.onSessionLostState(this, bArr);
    }

    @Override // com.netflix.mediaclient.drm.PlatformMediaDrmApi28, com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        metrics = this.mMediaDrm.getMetrics();
        return metrics;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi29
    public List<byte[]> getKeySetRequestIds() {
        List<byte[]> offlineLicenseKeySetIds;
        offlineLicenseKeySetIds = this.mMediaDrm.getOfflineLicenseKeySetIds();
        return offlineLicenseKeySetIds != null ? offlineLicenseKeySetIds : Collections.EMPTY_LIST;
    }
}
