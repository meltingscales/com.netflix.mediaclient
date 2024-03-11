package com.netflix.mediaclient.drm;

import android.os.Handler;
import android.os.PersistableBundle;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmApi23;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface NetflixMediaDrmApi29 extends NetflixMediaDrmApi28 {
    public static final int OFFLINE_LICENSE_STATE_RELEASED = 2;
    public static final int OFFLINE_LICENSE_STATE_UNKNOWN = 0;
    public static final int OFFLINE_LICENSE_STATE_USABLE = 1;

    /* loaded from: classes6.dex */
    public interface OnSessionLostStateListener {
        void onSessionLostState(NetflixMediaDrmApi29 netflixMediaDrmApi29, byte[] bArr);
    }

    void clearOnEventListener();

    void clearOnExpirationUpdateListener();

    void clearOnKeyStatusChangeListener();

    void clearOnSessionLostStateListener();

    List<byte[]> getKeySetRequestIds();

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi28
    PersistableBundle getMetrics();

    List<byte[]> getOfflineLicenseKeySetIds();

    int getOfflineLicenseState(byte[] bArr);

    void removeOfflineLicense(byte[] bArr);

    void setOnEventListener(NetflixMediaDrm.OnEventListener onEventListener, Handler handler);

    void setOnExpirationUpdateListener(Executor executor, NetflixMediaDrmApi23.OnExpirationUpdateListener onExpirationUpdateListener);

    void setOnKeyStatusChangeListener(Executor executor, NetflixMediaDrmApi23.OnKeyStatusChangeListener onKeyStatusChangeListener);

    void setOnSessionLostStateListener(OnSessionLostStateListener onSessionLostStateListener, Handler handler);

    void setOnSessionLostStateListener(Executor executor, OnSessionLostStateListener onSessionLostStateListener);
}
