package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class dtI<T> implements dtQ<T> {
    private final AtomicReference<dtQ<T>> e;

    public dtI(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        this.e = new AtomicReference<>(dtq);
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        dtQ<T> andSet = this.e.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}
