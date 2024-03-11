package o;

/* renamed from: o.dAw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7666dAw {
    private static final Object a = new dAH("CONDITION_FALSE");

    public static final Object c() {
        return a;
    }

    public static final C7664dAu d(Object obj) {
        C7664dAu c7664dAu;
        dAD dad = obj instanceof dAD ? (dAD) obj : null;
        if (dad == null || (c7664dAu = dad.d) == null) {
            C8632dsu.d(obj);
            return (C7664dAu) obj;
        }
        return c7664dAu;
    }
}
