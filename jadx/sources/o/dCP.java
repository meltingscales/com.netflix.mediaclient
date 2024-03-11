package o;

import o.dCK;
import o.dCP;

/* loaded from: classes5.dex */
public final class dCP<T> implements InterfaceC7753dEb<T> {
    private final drM<InterfaceC8660dtv<?>, dBT<T>> a;
    private final dCS<dCK<T>> e;

    public final drM<InterfaceC8660dtv<?>, dBT<T>> d() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dCP(drM<? super InterfaceC8660dtv<?>, ? extends dBT<T>> drm) {
        C8632dsu.c((Object) drm, "");
        this.a = drm;
        this.e = new dCS<>();
    }

    @Override // o.InterfaceC7753dEb
    public dBT<T> c(final InterfaceC8660dtv<Object> interfaceC8660dtv) {
        Object obj;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        obj = this.e.get(drI.e(interfaceC8660dtv));
        C8632dsu.a(obj, "");
        dDD ddd = (dDD) obj;
        T t = ddd.c.get();
        if (t == null) {
            t = (T) ddd.c(new drO<T>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public final T invoke() {
                    return (T) new dCK(dCP.this.d().invoke(interfaceC8660dtv));
                }
            });
        }
        return ((dCK) t).c;
    }
}
