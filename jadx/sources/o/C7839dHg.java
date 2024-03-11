package o;

import java.net.Proxy;

/* renamed from: o.dHg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7839dHg {
    public static final C7839dHg b = new C7839dHg();

    private C7839dHg() {
    }

    public final String b(C7826dGu c7826dGu, Proxy.Type type) {
        C8632dsu.d(c7826dGu, "");
        C8632dsu.d(type, "");
        StringBuilder sb = new StringBuilder();
        sb.append(c7826dGu.i());
        sb.append(' ');
        C7839dHg c7839dHg = b;
        if (c7839dHg.e(c7826dGu, type)) {
            sb.append(c7826dGu.j());
        } else {
            sb.append(c7839dHg.b(c7826dGu.j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }

    private final boolean e(C7826dGu c7826dGu, Proxy.Type type) {
        return !c7826dGu.a() && type == Proxy.Type.HTTP;
    }

    public final String b(C7818dGm c7818dGm) {
        C8632dsu.d(c7818dGm, "");
        String b2 = c7818dGm.b();
        String g = c7818dGm.g();
        if (g != null) {
            return b2 + '?' + g;
        }
        return b2;
    }
}
