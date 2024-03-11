package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dtP<T, K> implements dtQ<T> {
    private final drM<T, K> a;
    private final dtQ<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public dtP(dtQ<? extends T> dtq, drM<? super T, ? extends K> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        this.b = dtq;
        this.a = drm;
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new dtL(this.b.iterator(), this.a);
    }
}
