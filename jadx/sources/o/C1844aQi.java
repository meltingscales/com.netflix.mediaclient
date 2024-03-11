package o;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.util.DeviceCategory;
import o.InterfaceC5129bst;

/* renamed from: o.aQi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1844aQi extends AbstractC1838aQc {
    public static String k = "ESNUNINITIALIZED";
    private static String q = "2";
    private byte[] p;
    private String r;
    private DeviceCategory s;
    private CryptoProvider t;
    private String v;
    private C1847aQl x;

    @Override // o.InterfaceC1843aQh
    public CryptoProvider J_() {
        return this.t;
    }

    @Override // o.InterfaceC1843aQh
    public String K_() {
        return this.r;
    }

    @Override // o.AbstractC1838aQc
    protected byte[] a() {
        return this.p;
    }

    @Override // o.AbstractC1838aQc
    protected DeviceCategory g() {
        return this.s;
    }

    @Override // o.AbstractC1838aQc
    protected String i() {
        return null;
    }

    @Override // o.AbstractC1838aQc, o.InterfaceC1843aQh
    public String n() {
        return this.v;
    }

    public InterfaceC5129bst.d r() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1844aQi(CryptoProvider cryptoProvider, DeviceCategory deviceCategory) {
        this.t = cryptoProvider;
        this.s = deviceCategory;
        C1044Mm.a("ESN", "Creating Widevine Entity Authorization ESN provider, crypto provider: %s, device category: %s", cryptoProvider, deviceCategory);
        CryptoProvider cryptoProvider2 = CryptoProvider.WIDEVINE_L1;
        if (cryptoProvider != cryptoProvider2 && cryptoProvider != CryptoProvider.WIDEVINE_L3) {
            throw new UnsupportedSchemeException("invalid crypto provider passed in");
        }
        C1842aQg c1842aQg = C1842aQg.a;
        this.r = c1842aQg.h();
        this.p = c1842aQg.b();
        Object[] objArr = new Object[2];
        objArr[0] = cryptoProvider == cryptoProvider2 ? "L1" : "L3";
        objArr[1] = deviceCategory.c();
        C1044Mm.e("ESN", String.format("Widevine EntityAuth %s %s ESN Provider created...", objArr));
    }

    private String u() {
        String str = Build.MODEL;
        if (str.length() > 45) {
            str = str.substring(0, 45);
        }
        return AbstractC1838aQc.c(AbstractC1838aQc.b() + C8168dfL.e(str, AbstractC1838aQc.e));
    }

    @Override // o.AbstractC1838aQc
    protected void h() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(AbstractC1838aQc.a);
        sb.append("PRV-");
        if (g() == DeviceCategory.PHONE) {
            sb.append("P-");
        } else if (g() == DeviceCategory.TABLET) {
            sb.append("T-");
        } else if (g() == DeviceCategory.CHROME_OS) {
            sb.append("C-");
        } else if (g() == DeviceCategory.ANDROID_TV) {
            sb.append("B-");
        } else if (g() == DeviceCategory.ANDROID_STB) {
            sb.append("B-");
        } else if (g() == DeviceCategory.SMART_DISPLAY) {
            sb.append("E-");
        }
        if (J_() == CryptoProvider.WIDEVINE_L3) {
            sb.append("L3-");
        }
        String sb2 = sb.toString();
        this.i = sb2;
        if (!sb2.endsWith("-") || (lastIndexOf = this.i.lastIndexOf("-") + 1) <= 0) {
            return;
        }
        this.i = this.i.substring(0, lastIndexOf);
    }

    @Override // o.AbstractC1838aQc, o.InterfaceC1843aQh
    public String m() {
        return this.x.d();
    }

    private String t() {
        String c;
        try {
            c = C8137deh.a(this.p, aLS.e());
        } catch (Throwable th) {
            C1044Mm.e("ESN", "===> Failed to hash device id. Use plain and report this", th);
            c = C8137deh.c(this.b);
        }
        return AbstractC1838aQc.c(c);
    }

    public boolean a(Long l) {
        return this.x.c(l);
    }

    @Override // o.AbstractC1838aQc
    protected void d(Context context) {
        this.n = null;
        this.h = null;
        this.b = a();
        h();
        String str = this.i + u();
        this.v = str;
        this.x = new C1847aQl(str);
        this.g = new C1846aQk(true, K_(), t(), q).b();
        this.f13439o = AbstractC1838aQc.c();
    }
}
