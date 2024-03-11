package o;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class dtL<T, K> extends dpU<T> {
    private final Iterator<T> a;
    private final drM<T, K> b;
    private final HashSet<K> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dtL(Iterator<? extends T> it, drM<? super T, ? extends K> drm) {
        C8632dsu.c((Object) it, "");
        C8632dsu.c((Object) drm, "");
        this.a = it;
        this.b = drm;
        this.d = new HashSet<>();
    }

    @Override // o.dpU
    public void b() {
        while (this.a.hasNext()) {
            T next = this.a.next();
            if (this.d.add(this.b.invoke(next))) {
                b(next);
                return;
            }
        }
        e();
    }
}
