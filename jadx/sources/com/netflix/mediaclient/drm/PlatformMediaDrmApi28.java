package com.netflix.mediaclient.drm;

import android.annotation.TargetApi;
import android.media.MediaDrm;
import android.os.PersistableBundle;
import java.util.UUID;
import o.C1044Mm;
import o.C8192dfj;
import org.chromium.net.ConnectionSubtype;

@TargetApi(ConnectionSubtype.SUBTYPE_WIFI_B)
/* loaded from: classes3.dex */
public class PlatformMediaDrmApi28 extends PlatformMediaDrmApi23 implements NetflixMediaDrmApi28 {
    private static final String TAG = "PlatformMediaDrmApi28";

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformMediaDrmApi28(UUID uuid) {
        super(uuid);
    }

    @Override // com.netflix.mediaclient.drm.PlatformMediaDrm, com.netflix.mediaclient.drm.NetflixMediaDrm
    public void close() {
        this.mMediaDrm.release();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public int getConnectedHdcpLevel() {
        int connectedHdcpLevel;
        connectedHdcpLevel = this.mMediaDrm.getConnectedHdcpLevel();
        return connectedHdcpLevel;
    }

    @Override // com.netflix.mediaclient.drm.PlatformMediaDrm, com.netflix.mediaclient.drm.NetflixMediaDrm
    public int getMaxHdcpLevel() {
        int maxHdcpLevel;
        maxHdcpLevel = this.mMediaDrm.getMaxHdcpLevel();
        return maxHdcpLevel;
    }

    @Override // com.netflix.mediaclient.drm.PlatformMediaDrm, com.netflix.mediaclient.drm.NetflixMediaDrm
    public int getMaxSecurityLevel() {
        int maxSecurityLevel;
        maxSecurityLevel = MediaDrm.getMaxSecurityLevel();
        return maxSecurityLevel;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public int getOpenSessionCount() {
        int openSessionCount;
        openSessionCount = this.mMediaDrm.getOpenSessionCount();
        return openSessionCount;
    }

    @Override // com.netflix.mediaclient.drm.PlatformMediaDrm, com.netflix.mediaclient.drm.NetflixMediaDrm
    public int getMaxSessionCount() {
        int maxSessionCount;
        try {
            maxSessionCount = this.mMediaDrm.getMaxSessionCount();
            return maxSessionCount;
        } catch (Throwable th) {
            C1044Mm.b(TAG, th, "Failed to get maxSessionCount using MediaDrm API, try hidden API", new Object[0]);
            int a = C8192dfj.a(this.mMediaDrm, NetflixMediaDrm.PROPERTY_MAX_NUMBER_OF_SESSIONS, 8);
            C1044Mm.a(TAG, "maxNumberOfSessions (found by hidden API or default) is %d", Integer.valueOf(a));
            return a;
        }
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        metrics = this.mMediaDrm.getMetrics();
        return metrics;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public int getSecurityLevel(byte[] bArr) {
        int securityLevel;
        securityLevel = this.mMediaDrm.getSecurityLevel(bArr);
        return securityLevel;
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    public byte[] openSession(int i) {
        byte[] openSession;
        openSession = this.mMediaDrm.openSession(i);
        return openSession;
    }
}
