package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Iterator;
import o.AbstractC8558dqa;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PersistentOrderedSet<E> extends AbstractC8558dqa<E> implements PersistentSet<E> {
    private static final PersistentOrderedSet EMPTY;
    private final Object firstElement;
    private final PersistentHashMap<E, Links> hashMap;
    private final Object lastElement;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap<E, Links> persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet<E> add(E e) {
        if (this.hashMap.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(e, e, this.hashMap.put((PersistentHashMap<E, Links>) e, (E) new Links()));
        }
        Object obj = this.lastElement;
        Object obj2 = ((PersistentHashMap<E, Links>) this.hashMap).get(obj);
        C8632dsu.d(obj2);
        return new PersistentOrderedSet(this.firstElement, e, ((PersistentHashMap<E, Links>) this.hashMap).put((ImmutableMap) obj, (Object) ((Links) obj2).withNext(e)).put((PersistentHashMap) e, (E) new Links(obj)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet<E> remove(E e) {
        Links links = this.hashMap.get(e);
        if (links == null) {
            return this;
        }
        PersistentHashMap<E, Links> remove = this.hashMap.remove((PersistentHashMap<E, Links>) e);
        if (links.getHasPrevious()) {
            Links links2 = remove.get(links.getPrevious());
            C8632dsu.d(links2);
            remove = remove.put((PersistentHashMap<E, Links>) links.getPrevious(), (Object) links2.withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            Links links3 = remove.get(links.getNext());
            C8632dsu.d(links3);
            remove = remove.put((PersistentHashMap<E, Links>) links.getNext(), (Object) links3.withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentOrderedSet.EMPTY;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }
}
