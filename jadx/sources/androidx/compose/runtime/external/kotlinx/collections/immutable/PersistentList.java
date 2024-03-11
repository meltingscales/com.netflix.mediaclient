package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.List;
import o.drM;
import o.dsI;

/* loaded from: classes.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* loaded from: classes.dex */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, dsI {
        PersistentList<E> build();
    }

    @Override // java.util.List
    PersistentList<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    PersistentList<E> add(E e);

    @Override // java.util.List, java.util.Collection
    PersistentList<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.List, java.util.Collection
    PersistentList<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    PersistentList<E> removeAll(Collection<? extends E> collection);

    PersistentList<E> removeAll(drM<? super E, Boolean> drm);

    PersistentList<E> removeAt(int i);

    @Override // java.util.List
    PersistentList<E> set(int i, E e);
}
