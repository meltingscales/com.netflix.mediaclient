package o;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class dpY<E> extends AbstractSet<E> implements Set<E>, dsQ {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }
}
