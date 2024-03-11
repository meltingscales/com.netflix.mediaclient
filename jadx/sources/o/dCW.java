package o;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
final class dCW<T> implements InterfaceC7753dEb<T> {
    private final ConcurrentHashMap<Class<?>, dCK<T>> a;
    private final drM<InterfaceC8660dtv<?>, dBT<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public dCW(drM<? super InterfaceC8660dtv<?>, ? extends dBT<T>> drm) {
        C8632dsu.c((Object) drm, "");
        this.b = drm;
        this.a = new ConcurrentHashMap<>();
    }

    @Override // o.InterfaceC7753dEb
    public dBT<T> c(InterfaceC8660dtv<Object> interfaceC8660dtv) {
        dCK<T> putIfAbsent;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        ConcurrentHashMap<Class<?>, dCK<T>> concurrentHashMap = this.a;
        Class<?> e = drI.e(interfaceC8660dtv);
        dCK<T> dck = concurrentHashMap.get(e);
        if (dck == null && (putIfAbsent = concurrentHashMap.putIfAbsent(e, (dck = new dCK<>(this.b.invoke(interfaceC8660dtv))))) != null) {
            dck = putIfAbsent;
        }
        return dck.c;
    }
}
