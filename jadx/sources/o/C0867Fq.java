package o;

/* renamed from: o.Fq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0867Fq {
    public static final String d(FJ fj, Object obj) {
        C8632dsu.c((Object) fj, "");
        C8632dsu.c(obj, "");
        if (fj instanceof C0880Gd) {
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            for (FZ fz : ((C0880Gd) fj).a()) {
                String b = C0874Fx.b(fz, str);
                if (b != null) {
                    return b;
                }
            }
        } else if (fj instanceof C0873Fw) {
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C0873Fw c0873Fw = (C0873Fw) fj;
                if (c0873Fw.d() && !booleanValue) {
                    return c0873Fw.a();
                }
            }
        }
        return null;
    }

    public static final Object a(FJ fj) {
        C8632dsu.c((Object) fj, "");
        if (fj instanceof C0880Gd) {
            return ((C0880Gd) fj).c();
        }
        if (fj instanceof C0873Fw) {
            return ((C0873Fw) fj).b();
        }
        return null;
    }
}
