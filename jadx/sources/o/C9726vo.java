package o;

/* renamed from: o.vo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9726vo {
    public static final <T1, T2, R> R d(T1 t1, T2 t2, drX<? super T1, ? super T2, ? extends R> drx) {
        C8632dsu.c((Object) drx, "");
        if (t1 == null || t2 == null) {
            return null;
        }
        return drx.invoke(t1, t2);
    }

    public static final <T1, T2, T3, R> R d(T1 t1, T2 t2, T3 t3, InterfaceC8612dsa<? super T1, ? super T2, ? super T3, ? extends R> interfaceC8612dsa) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return interfaceC8612dsa.invoke(t1, t2, t3);
    }

    public static final <T1, T2, T3, T4, R> R c(T1 t1, T2 t2, T3 t3, T4 t4, InterfaceC8613dsb<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC8613dsb) {
        C8632dsu.c((Object) interfaceC8613dsb, "");
        if (t1 == null || t2 == null || t3 == null || t4 == null) {
            return null;
        }
        return interfaceC8613dsb.invoke(t1, t2, t3, t4);
    }

    public static final <T> T d(Object obj, Class<T> cls) {
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) cls, "");
        return cls.cast(obj);
    }

    public static final <T> T c(Object obj, Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        Class<?> cls2 = obj != null ? obj.getClass() : null;
        C8632dsu.d(cls2);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(obj);
        }
        return null;
    }
}
