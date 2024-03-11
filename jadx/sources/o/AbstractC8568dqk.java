package o;

import java.util.Iterator;

/* renamed from: o.dqk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8568dqk implements Iterator<Character>, dsK {
    public abstract char a();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Character next() {
        return Character.valueOf(a());
    }
}
