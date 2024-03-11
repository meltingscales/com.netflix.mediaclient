package o;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class dpV<E> extends AbstractCollection<E> implements Collection<E>, dsL {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return getSize();
    }
}
