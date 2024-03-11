package o;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.Xp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332Xp {
    public static final C1332Xp b = new C1332Xp();
    private static final ConcurrentHashMap<Class<?>, Object> c = new ConcurrentHashMap<>(8, 0.9f, 1);

    private C1332Xp() {
    }

    public static final <T> void a(Class<? super T> cls, T t) {
        synchronized (C1332Xp.class) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) t, "");
            ConcurrentHashMap<Class<?>, Object> concurrentHashMap = c;
            if (concurrentHashMap.containsKey(cls)) {
                Object obj = concurrentHashMap.get(cls);
                throw new IllegalArgumentException("Registry already contains instance for " + cls + " - " + obj + " ");
            }
            concurrentHashMap.put(cls, t);
        }
    }

    public static final <T> void d(Class<? super T> cls, T t, boolean z) {
        synchronized (C1332Xp.class) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) t, "");
            if (!z) {
                ConcurrentHashMap<Class<?>, Object> concurrentHashMap = c;
                if (concurrentHashMap.containsKey(cls)) {
                    Object obj = concurrentHashMap.get(cls);
                    throw new IllegalArgumentException("Registry already contains instance for " + cls + " - " + obj + " ");
                }
            }
            c.put(cls, t);
        }
    }

    public static final <T> T b(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        T t = (T) c.get(cls);
        if (cls.isInstance(t)) {
            C8632dsu.d(t);
            return t;
        }
        throw new IllegalArgumentException("No object associated with " + cls);
    }
}
