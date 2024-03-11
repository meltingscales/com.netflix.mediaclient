package o;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dpW<E> extends AbstractList<E> implements List<E>, dsI {
    public abstract int getSize();

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }
}
