package o;

import android.media.MediaCrypto;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.drm.LicenseType;

/* renamed from: o.beJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4424beJ {

    /* renamed from: o.beJ$c */
    /* loaded from: classes3.dex */
    public interface c {
        void b(Long l, String str);

        void c(Status status, LicenseType licenseType);

        void c(Long l, LicenseType licenseType);
    }

    void c(c cVar);

    void l();

    byte[] m();

    Exception o();

    int p();

    int r();

    MediaCrypto s();
}
