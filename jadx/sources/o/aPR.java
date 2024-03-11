package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;

/* loaded from: classes3.dex */
public interface aPR {
    NetflixMediaDrm c(Throwable th, CryptoProvider cryptoProvider);

    void c();

    void c(Status status);
}
