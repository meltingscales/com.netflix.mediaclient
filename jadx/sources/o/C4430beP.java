package o;

import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.service.player.drm.LicenseType;

/* renamed from: o.beP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4430beP extends C4462bev {
    private final String e;

    @Override // o.C4462bev, o.InterfaceC4416beB
    public String i() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4430beP(String str, byte[] bArr, String str2, String str3, long j, ManifestLimitedLicense manifestLimitedLicense, boolean z, String str4) {
        super(LicenseType.LICENSE_TYPE_OFFLINE, str, bArr, str2, str3, j, manifestLimitedLicense, z);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str4, "");
        this.e = str4;
    }
}
