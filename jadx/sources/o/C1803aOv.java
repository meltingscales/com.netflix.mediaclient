package o;

import java.util.List;
import java.util.Map;
import o.AbstractC1804aOw;

/* renamed from: o.aOv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1803aOv extends C1045Mp {
    public static final C1803aOv d = new C1803aOv();

    private C1803aOv() {
        super("nf_cdx_pairing_rules");
    }

    public final AbstractC1804aOw a(String str, C1255Uq c1255Uq, C1255Uq c1255Uq2, Map<String, C1801aOt> map) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) c1255Uq2, "");
        C8632dsu.c((Object) map, "");
        C1801aOt c1801aOt = map.get(c1255Uq2.a());
        if (c1801aOt == null) {
            return b(str, c1255Uq, c1255Uq2);
        }
        return a(c1801aOt, str, c1255Uq, c1255Uq2);
    }

    private final AbstractC1804aOw a(C1801aOt c1801aOt, String str, C1255Uq c1255Uq, C1255Uq c1255Uq2) {
        if (!C8632dsu.c((Object) c1255Uq.b(), (Object) c1255Uq2.b())) {
            return d(c1801aOt, str, c1255Uq, c1255Uq2);
        }
        getLogTag();
        return new AbstractC1804aOw.d(c1255Uq2);
    }

    private final AbstractC1804aOw d(C1801aOt c1801aOt, String str, C1255Uq c1255Uq, C1255Uq c1255Uq2) {
        if (C8632dsu.c((Object) c1255Uq2.b(), (Object) c1801aOt.c()) && C8632dsu.c((Object) c1255Uq.b(), (Object) c1801aOt.b()) && C8632dsu.c((Object) str, (Object) c1255Uq2.e()) && C8632dsu.c((Object) c1255Uq2.e(), (Object) c1801aOt.e())) {
            getLogTag();
            return new AbstractC1804aOw.d(c1255Uq2);
        }
        getLogTag();
        return C1807aOz.a.c(c1255Uq2);
    }

    public final AbstractC1804aOw c(String str, C1255Uq c1255Uq, List<C1255Uq> list, Map<String, C1801aOt> map) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) map, "");
        List<C1255Uq> d2 = C1807aOz.a.d(list, map);
        int size = d2.size();
        if (size != 0) {
            if (size == 1) {
                C1801aOt c1801aOt = map.get(d2.get(0).a());
                C8632dsu.d(c1801aOt);
                return d(str, c1255Uq, d2.get(0), c1801aOt);
            }
            return AbstractC1804aOw.b.b;
        }
        return c(str, c1255Uq, list);
    }

    private final AbstractC1804aOw c(String str, C1255Uq c1255Uq, List<C1255Uq> list) {
        List<C1255Uq> c = C1807aOz.a.c(c1255Uq, list);
        int size = c.size();
        if (size != 0) {
            if (size == 1) {
                return e(str, c1255Uq, c.get(0));
            }
            return a(str, c1255Uq, c);
        }
        return d(str, c1255Uq, list);
    }

    private final AbstractC1804aOw d(String str, C1255Uq c1255Uq, List<C1255Uq> list) {
        C1807aOz c1807aOz = C1807aOz.a;
        List<C1255Uq> b = c1807aOz.b(str, list);
        int size = b.size();
        if (size == 0) {
            getLogTag();
            return AbstractC1804aOw.b.b;
        } else if (size == 1) {
            getLogTag();
            return AbstractC1804aOw.b.b;
        } else {
            getLogTag();
            return c1807aOz.a(b);
        }
    }

    private final AbstractC1804aOw e(String str, C1255Uq c1255Uq, C1255Uq c1255Uq2) {
        if (C8632dsu.c((Object) str, (Object) c1255Uq.e())) {
            return C1807aOz.a.c(c1255Uq2);
        }
        return AbstractC1804aOw.b.b;
    }

    private final AbstractC1804aOw a(String str, C1255Uq c1255Uq, List<C1255Uq> list) {
        C1807aOz c1807aOz = C1807aOz.a;
        List<C1255Uq> b = c1807aOz.b(str, list);
        int size = b.size();
        if (size != 0) {
            if (size == 1) {
                return c1807aOz.c(b.get(0));
            }
            return c1807aOz.a(b);
        }
        return c1807aOz.a(list);
    }

    private final AbstractC1804aOw c(String str, C1255Uq c1255Uq, C1255Uq c1255Uq2, C1801aOt c1801aOt) {
        if (C8632dsu.c((Object) c1255Uq2.b(), (Object) c1801aOt.c()) && C8632dsu.c((Object) c1255Uq.b(), (Object) c1801aOt.b()) && C8632dsu.c((Object) str, (Object) c1255Uq2.e()) && C8632dsu.c((Object) c1255Uq2.e(), (Object) c1801aOt.e())) {
            getLogTag();
            return new AbstractC1804aOw.d(c1255Uq2);
        }
        getLogTag();
        return C1807aOz.a.c(c1255Uq2);
    }

    private final AbstractC1804aOw b(String str, C1255Uq c1255Uq, C1255Uq c1255Uq2) {
        getLogTag();
        if (C8632dsu.c((Object) c1255Uq.b(), (Object) c1255Uq2.b())) {
            getLogTag();
            return C1807aOz.a.c(c1255Uq2);
        }
        getLogTag();
        return AbstractC1804aOw.b.b;
    }

    private final AbstractC1804aOw d(String str, C1255Uq c1255Uq, C1255Uq c1255Uq2, C1801aOt c1801aOt) {
        getLogTag();
        if (C8632dsu.c((Object) c1255Uq.e(), (Object) c1255Uq2.e())) {
            getLogTag();
            return c(str, c1255Uq, c1255Uq2, c1801aOt);
        }
        getLogTag();
        return C1807aOz.a.c(c1255Uq2);
    }
}
