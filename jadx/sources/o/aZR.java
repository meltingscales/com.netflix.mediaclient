package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_IpProbing;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aZR {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 0;
    private static char a$s39$95 = 0;
    private static char b$s37$95 = 0;
    private static int c = 1;
    private static char c$s38$95;
    private static char d$s40$95;
    public static final aZR e;

    static {
        b();
        e = new aZR();
        int i = a + 19;
        c = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        b$s37$95 = (char) 24313;
        c$s38$95 = (char) 40734;
        d$s40$95 = (char) 38028;
        a$s39$95 = (char) 16100;
    }

    private aZR() {
    }

    private final void a(StringBuilder sb, String str, String str2) {
        int i = 2 % 2;
        int i2 = a + 107;
        c = i2 % 128;
        int i3 = i2 % 2;
        a(sb, str, str2, false);
        int i4 = c + 101;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void a(StringBuilder sb, String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = c + 115;
        a = i2 % 128;
        int i3 = i2 % 2;
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        if (z) {
            return;
        }
        int i4 = a + 27;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            sb.append("; ");
            return;
        }
        sb.append("; ");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean c(UserAgent userAgent) {
        int i = 2 % 2;
        int i2 = a + 101;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            InterfaceC5034brD l = userAgent.l();
            C8632dsu.a(l, "");
            if (!(!C8168dfL.g(l.i()))) {
                return true;
            }
            int i3 = c + 63;
            a = i3 % 128;
            int i4 = i3 % 2;
            return C8168dfL.g(l.j());
        }
        InterfaceC5034brD l2 = userAgent.l();
        C8632dsu.a(l2, "");
        C8168dfL.g(l2.i());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> c(UserAgent userAgent, aOV aov) {
        boolean g;
        boolean g2;
        boolean g3;
        int i = 2 % 2;
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) aov, "");
        HashMap hashMap = new HashMap();
        InterfaceC5034brD l = userAgent.l();
        C8632dsu.a(l, "");
        StringBuilder sb = new StringBuilder();
        String a2 = C8284dhV.a();
        if (a2 != null) {
            g3 = C8691duz.g(a2);
            if (!g3) {
                a(sb, "nfvdid", a2);
            } else {
                int i2 = c + 79;
                a = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        String b = C8284dhV.b();
        if (b != null) {
            g2 = C8691duz.g(b);
            if (!g2) {
                a(sb, "flwssn", b);
            }
        }
        String c2 = C8284dhV.c();
        if (c2 != null) {
            int i4 = c + 3;
            a = i4 % 128;
            int i5 = i4 % 2;
            g = C8691duz.g(c2);
            if (!g) {
                a(sb, "netflix-mfa-nonce", c2);
            }
        }
        if (!c(userAgent)) {
            String f = l.f();
            C8632dsu.a(f, "");
            String i6 = l.i();
            C8632dsu.d((Object) i6);
            a(sb, f, i6);
            String g4 = l.g();
            C8632dsu.a(g4, "");
            String j = l.j();
            C8632dsu.d((Object) j);
            a(sb, g4, j, true);
        } else {
            C1044Mm.e("IpProbe", "user cookies null. not adding to headers");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        C1044Mm.e("IpProbe", "Request with cookies: " + sb2);
        hashMap.put("Cookie", sb2);
        String d = l.d();
        if (d != null) {
            String str = (String) hashMap.put("X-Netflix.request.client.user.guid", d);
        }
        hashMap.put("Cookie", sb2);
        Object[] objArr = new Object[1];
        d(1, new char[]{21133, 26268}, objArr);
        hashMap.put("X-Netflix.Request.Attempt", ((String) objArr[0]).intern());
        InterfaceC1843aQh w = aov.w();
        if (w != null) {
            String p = w.p();
            hashMap.put("x-devicemodel", p);
        }
        e(userAgent, aov, hashMap);
        return hashMap;
    }

    private final void e(UserAgent userAgent, aOV aov, Map<String, String> map) {
        int i = 2 % 2;
        if (!c(userAgent)) {
            int i2 = a + 105;
            c = i2 % 128;
            int i3 = i2 % 2;
            InterfaceC1843aQh w = aov.w();
            if (w != null) {
                String m = w.m();
                map.put("X-Netflix.esn", m);
            }
            String d = C8127deX.d();
            map.put("X-Netflix.session.id", d);
            int i4 = c + 9;
            a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final String e(String str, String str2) {
        int i = 2 % 2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        String str3 = "https://" + str + Config_FastProperty_IpProbing.Companion.b() + "?muzzle_id=" + str2;
        int i2 = a + 71;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            return str3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9573sE c9573sE = new C9573sE();
        char[] cArr2 = new char[cArr.length];
        c9573sE.b = 0;
        char[] cArr3 = new char[2];
        while (c9573sE.b < cArr.length) {
            cArr3[0] = cArr[c9573sE.b];
            cArr3[1] = cArr[c9573sE.b + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10;
                int i6 = i5 + 49;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + ((char) (a$s39$95 ^ (-3358735357273865631L))))) ^ ((c3 >>> 5) + ((char) (d$s40$95 ^ (-3358735357273865631L))))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (c$s38$95 ^ (-3358735357273865631L)))) ^ ((c4 + i3) ^ ((c4 << 4) + ((char) (b$s37$95 ^ (-3358735357273865631L)))))));
                i3 -= 40503;
                i4++;
                int i8 = i5 + 31;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr2[c9573sE.b] = cArr3[0];
            cArr2[c9573sE.b + 1] = cArr3[1];
            c9573sE.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
