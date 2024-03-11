package o;

import java.util.Map;

/* renamed from: o.gm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8972gm {
    private static final Map<? extends Class<? extends Object>, Class<? extends Object>> e;

    static {
        Map<? extends Class<? extends Object>, Class<? extends Object>> c;
        Class cls = Boolean.TYPE;
        c = dqE.c(dpD.a(cls, cls), dpD.a(Byte.TYPE, Byte.class), dpD.a(Character.TYPE, Character.class), dpD.a(Double.TYPE, Double.class), dpD.a(Float.TYPE, Float.class), dpD.a(Integer.TYPE, Integer.class), dpD.a(Long.TYPE, Long.class), dpD.a(Short.TYPE, Short.class));
        e = c;
    }

    public static final boolean a(Class<?> cls, Class<?> cls2) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        if (!cls2.isPrimitive()) {
            throw new IllegalArgumentException("First argument has to be primitive type".toString());
        }
        return C8632dsu.c(e.get(cls2), cls);
    }

    public static final boolean d(Class<?> cls, Class<?> cls2) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        if (cls2.isAssignableFrom(cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return a(cls2, cls);
        }
        if (cls2.isPrimitive()) {
            return a(cls, cls2);
        }
        return false;
    }
}
