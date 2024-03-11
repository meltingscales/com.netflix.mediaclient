package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import o.dpT;
import o.drM;

/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends dpT<E> implements PersistentList<E> {
    @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public ImmutableList<E> subList(int i, int i2) {
        return super.subList(i, i2);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAll(final Collection<? extends E> collection) {
        return removeAll(new drM<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final Boolean invoke(E e) {
                return Boolean.valueOf(collection.contains(e));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractPersistentList$removeAll$1<E>) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (!contains(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.dpT, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }
}
