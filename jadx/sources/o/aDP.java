package o;

import j$.time.Instant;
import o.C2329aeG;
import o.C2436afz;

/* loaded from: classes3.dex */
public final class aDP {
    public static final aDP a = new aDP();

    private aDP() {
    }

    public final InterfaceC5231bup e(C2329aeG c2329aeG, String str) {
        C2436afz e;
        C8632dsu.c((Object) c2329aeG, "");
        C8632dsu.c((Object) str, "");
        C2329aeG.b d = c2329aeG.d();
        if (d == null || (e = d.e()) == null) {
            return null;
        }
        return c(e, Integer.parseInt(str));
    }

    public final InterfaceC5231bup c(C2436afz c2436afz, int i) {
        C2436afz.e b;
        Instant b2;
        C8632dsu.c((Object) c2436afz, "");
        Instant c = c2436afz.c();
        if (c == null || (b = c2436afz.b()) == null || (b2 = b.b()) == null) {
            return null;
        }
        return new C5237buv(c, b2, i);
    }
}
