package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dqA<T> implements Iterator<C8578dqu<? extends T>>, dsK {
    private final Iterator<T> c;
    private int d;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dqA(Iterator<? extends T> it) {
        C8632dsu.c((Object) it, "");
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final C8578dqu<T> next() {
        int i = this.d;
        this.d = i + 1;
        if (i < 0) {
            C8569dql.h();
        }
        return new C8578dqu<>(i, this.c.next());
    }
}
