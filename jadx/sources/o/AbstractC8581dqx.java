package o;

import java.util.Iterator;

/* renamed from: o.dqx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8581dqx implements Iterator<Long>, dsK {
    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }
}
