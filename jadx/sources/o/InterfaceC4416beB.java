package o;

import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import org.json.JSONObject;

/* renamed from: o.beB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4416beB {
    String a();

    JSONObject a(JSONObject jSONObject);

    LicenseRequestFlavor b();

    void b(LicenseType licenseType);

    void b(String str);

    void b(byte[] bArr);

    byte[] c();

    long d();

    void d(byte[] bArr);

    byte[] e();

    Long f();

    byte[] g();

    LicenseType h();

    String i();

    String j();

    ManifestLimitedLicense k();

    boolean l();

    String n();

    boolean o();
}
