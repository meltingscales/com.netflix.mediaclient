package o;

import android.util.Base64;
import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bev  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4462bev implements InterfaceC4416beB {
    public static final c b = new c(null);
    private final boolean a;
    private byte[] c;
    private long d;
    private byte[] e;
    private LicenseType f;
    private final byte[] g;
    private final String h;
    private LicenseRequestFlavor i;
    private String j;
    private final ManifestLimitedLicense k;
    private String l;
    private String m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13580o;
    private AbstractC4561bgo r;

    /* renamed from: o.bev$b */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LicenseType.values().length];
            try {
                iArr[LicenseType.LICENSE_TYPE_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LicenseType.LICENSE_TYPE_LDL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LicenseType.LICENSE_TYPE_OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    @Override // o.InterfaceC4416beB
    public String a() {
        return this.j;
    }

    public void a(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.c = bArr;
    }

    @Override // o.InterfaceC4416beB
    public LicenseRequestFlavor b() {
        return this.i;
    }

    @Override // o.InterfaceC4416beB
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        this.l = str;
    }

    @Override // o.InterfaceC4416beB
    public byte[] c() {
        return this.c;
    }

    @Override // o.InterfaceC4416beB
    public long d() {
        return this.d;
    }

    @Override // o.InterfaceC4416beB
    public void d(byte[] bArr) {
        this.e = bArr;
    }

    @Override // o.InterfaceC4416beB
    public byte[] e() {
        return this.g;
    }

    @Override // o.InterfaceC4416beB
    public byte[] g() {
        return this.e;
    }

    @Override // o.InterfaceC4416beB
    public LicenseType h() {
        return this.f;
    }

    @Override // o.InterfaceC4416beB
    public String i() {
        return null;
    }

    @Override // o.InterfaceC4416beB
    public ManifestLimitedLicense k() {
        return this.k;
    }

    @Override // o.InterfaceC4416beB
    public boolean l() {
        return this.a;
    }

    public AbstractC4561bgo m() {
        return this.r;
    }

    @Override // o.InterfaceC4416beB
    public String n() {
        return this.l;
    }

    public C4462bev(LicenseType licenseType, String str, byte[] bArr, String str2, String str3, long j, ManifestLimitedLicense manifestLimitedLicense, boolean z) {
        C8632dsu.c((Object) licenseType, "");
        C8632dsu.c((Object) str, "");
        this.f = licenseType;
        this.l = str;
        this.g = bArr;
        this.n = str2;
        this.h = str3;
        this.f13580o = j;
        this.k = manifestLimitedLicense;
        this.a = z;
        this.j = "";
        this.i = a(licenseType);
    }

    @Override // o.InterfaceC4416beB
    public Long f() {
        return Long.valueOf(this.f13580o);
    }

    @Override // o.InterfaceC4416beB
    public void b(LicenseType licenseType) {
        C8632dsu.c((Object) licenseType, "");
        this.f = licenseType;
        this.i = a(licenseType);
    }

    private final LicenseRequestFlavor a(LicenseType licenseType) {
        int i = b.d[licenseType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LicenseRequestFlavor.OFFLINE;
                }
                return LicenseRequestFlavor.UNKNOWN;
            }
            return LicenseRequestFlavor.LIMITED;
        }
        return LicenseRequestFlavor.STANDARD;
    }

    @Override // o.InterfaceC4416beB
    public void b(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.d = System.currentTimeMillis();
        String encodeToString = Base64.encodeToString(bArr, 2);
        C8632dsu.a(encodeToString, "");
        this.j = encodeToString;
    }

    @Override // o.InterfaceC4416beB
    public JSONObject a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        C1044Mm.e("NfPlayerDrmManager", "parsing license response start.");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("links");
            if (jSONObject2.has("releaseLicense")) {
                this.r = AbstractC4561bgo.d(jSONObject2.getJSONObject("releaseLicense"));
            }
        } catch (JSONException e) {
            C1044Mm.e("NfPlayerDrmManager", "error parsing license", e);
        }
        this.m = jSONObject.optString("providerSessionToken");
        this.e = Base64.decode(jSONObject.optString("licenseResponseBase64"), 2);
        C1044Mm.e("NfPlayerDrmManager", "parsing license response end.");
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4462bev) {
            C4462bev c4462bev = (C4462bev) obj;
            if (Arrays.equals(e(), c4462bev.e()) && C8168dfL.d(this.n, c4462bev.n)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC4416beB
    public String j() {
        return this.i == LicenseRequestFlavor.LIMITED ? this.h : this.n;
    }

    @Override // o.InterfaceC4416beB
    public boolean o() {
        byte[] bArr = this.e;
        return bArr != null && bArr.length > 0;
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        int hashCode2 = this.l.hashCode();
        byte[] bArr = this.g;
        int hashCode3 = bArr != null ? Arrays.hashCode(bArr) : 0;
        String str = this.n;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.h;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        int hashCode6 = Long.hashCode(this.f13580o);
        ManifestLimitedLicense manifestLimitedLicense = this.k;
        int hashCode7 = manifestLimitedLicense != null ? manifestLimitedLicense.hashCode() : 0;
        String str3 = this.j;
        int hashCode8 = str3 != null ? str3.hashCode() : 0;
        LicenseRequestFlavor licenseRequestFlavor = this.i;
        int hashCode9 = licenseRequestFlavor != null ? licenseRequestFlavor.hashCode() : 0;
        AbstractC4561bgo abstractC4561bgo = this.r;
        int hashCode10 = abstractC4561bgo != null ? abstractC4561bgo.hashCode() : 0;
        String str4 = this.m;
        int hashCode11 = str4 != null ? str4.hashCode() : 0;
        byte[] bArr2 = this.e;
        int hashCode12 = bArr2 != null ? Arrays.hashCode(bArr2) : 0;
        byte[] bArr3 = this.c;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31) + Long.hashCode(this.d)) * 31) + Boolean.hashCode(this.a);
    }

    /* renamed from: o.bev$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
