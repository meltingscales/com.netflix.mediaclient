package o;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.netflix.mediaclient.util.DeviceCategory;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;

/* renamed from: o.aQc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1838aQc implements InterfaceC1843aQh {
    protected static String c;
    private static String k;
    protected byte[] b;
    protected String f;
    protected String g;
    protected String h;
    protected String i;
    protected String j;
    protected String l;
    protected String m;
    protected String n;

    /* renamed from: o  reason: collision with root package name */
    protected String f13439o;
    public static final String a = aLS.d();
    protected static final String d = aLS.b();
    protected static final String e = aLS.c();

    protected abstract byte[] a();

    protected abstract DeviceCategory g();

    protected abstract String i();

    @Override // o.InterfaceC1843aQh
    public byte[] j() {
        return this.b;
    }

    @Override // o.InterfaceC1843aQh
    public String k() {
        return this.i;
    }

    @Override // o.InterfaceC1843aQh
    public String l() {
        return this.f;
    }

    @Override // o.InterfaceC1843aQh
    public String m() {
        return this.h;
    }

    @Override // o.InterfaceC1843aQh
    public String n() {
        return null;
    }

    @Override // o.InterfaceC1843aQh
    public String o() {
        return this.g;
    }

    @Override // o.InterfaceC1843aQh
    public String p() {
        return this.f13439o;
    }

    @Override // o.InterfaceC1843aQh
    public String q() {
        return this.l;
    }

    @Override // o.InterfaceC1843aQh
    public String s() {
        return this.m;
    }

    protected static String a(Context context) {
        return C8168dfL.e(b(context), e);
    }

    protected static String b(Context context) {
        String e2 = e(context);
        if (e2 == null) {
            C1044Mm.j("ESN", "Device ID not found, use and save random id");
            return g(context);
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null");
        }
        d(context);
        f(context);
        h();
        this.l = C8157dfA.e(context, "nf_drm_esn", (String) null);
        C8157dfA.a(context, "nf_drm_esn", m());
        this.m = C8157dfA.e(context, "nf_drm_migration_identity", (String) null);
        C8157dfA.a(context, "nf_drm_migration_identity", o());
    }

    protected void h() {
        String str = a;
        int indexOf = str.indexOf("-");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        this.i = str;
    }

    protected void d(Context context) {
        String c2;
        this.n = c(i());
        byte[] a2 = a();
        this.b = a2;
        try {
            c2 = C8137deh.a(a2, aLS.e());
        } catch (Throwable th) {
            C1044Mm.e("ESN", "===> Failed to hash device id. Use plain and report this", th);
            c2 = C8137deh.c(this.b);
        }
        String c3 = c(c2);
        String str = a + this.n + d + '0' + c3;
        this.h = str;
        C1044Mm.a("ESN", "is esn in new scheme:(true) %s", str);
        this.g = new C1846aQk(K_(), c3).b();
        this.f13439o = c();
    }

    private void f(Context context) {
        if (this.j == null) {
            this.j = c(e());
        }
        c = c(context);
        this.f = a + this.j + d + c;
    }

    public static String c(Context context) {
        synchronized (AbstractC1838aQc.class) {
            String str = c;
            if (str != null) {
                return str;
            }
            String a2 = a(context);
            try {
                c = C8137deh.a(a2.getBytes(Charset.forName("UTF-8")), aLS.e());
            } catch (Exception e2) {
                C1044Mm.e("ESN", "===> Failed to hash device id4. Use plain and report this", e2);
                c = a2;
            }
            return c(c);
        }
    }

    public static String c(String str) {
        if (str == null || "".equals(str.trim())) {
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < upperCase.length(); i++) {
            char charAt = upperCase.charAt(i);
            if ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == '=')) {
                sb.append(charAt);
            } else {
                sb.append('=');
            }
        }
        return sb.toString();
    }

    public static String d() {
        return c(e());
    }

    public static String c() {
        int i;
        String str = k;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        C1044Mm.e("ESN", "BRAND " + str2);
        C1044Mm.e("ESN", "MODEL " + str3);
        if (str2 != null && !"".equals(str2.trim())) {
            i = 10;
            if (str2.length() <= 10) {
                i = str2.length();
                sb.append(str2);
            } else {
                sb.append(str2.substring(0, 10));
            }
        } else {
            sb.append("unknown");
            i = 0;
        }
        sb.append("_");
        if (str3 != null && !"".equals(str3.trim())) {
            int i2 = 31 - i;
            if (str3.length() <= i2) {
                sb.append(str3);
            } else {
                sb.append(str3.substring(0, i2));
            }
        } else {
            sb.append("unknown");
        }
        String sb2 = sb.toString();
        k = sb2;
        return sb2;
    }

    public static String e() {
        String str = Build.MODEL;
        if (str.length() > 45) {
            str = str.substring(0, 45);
        }
        return b() + C8168dfL.e(str, e) + "S";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b() {
        String str = Build.MANUFACTURER;
        if (str.length() < 5) {
            str = str + "       ";
        }
        return C8168dfL.c(str.substring(0, 5), e, false);
    }

    private static String g(Context context) {
        String e2;
        synchronized (AbstractC1838aQc.class) {
            e2 = C8157dfA.e(context, "nf_rnd_device_id", (String) null);
            if (e2 == null) {
                e2 = UUID.randomUUID().toString();
                C8157dfA.a(context, "nf_rnd_device_id", e2);
            }
        }
        return e2;
    }

    protected static String e(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @Override // o.InterfaceC1843aQh
    public String f() {
        return C8137deh.c(a());
    }
}
