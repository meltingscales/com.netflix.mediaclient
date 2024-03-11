package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class dqB implements Iterator<Integer>, dsK {
    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }
}
