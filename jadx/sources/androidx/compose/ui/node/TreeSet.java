package androidx.compose.ui.node;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    public int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }

    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
    }
}
