package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import o.dsK;

/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, dsK {
    private int index;
    private final Map<E, Links> map;
    private Object nextElement;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentOrderedSetIterator(Object obj, Map<E, Links> map) {
        this.nextElement = obj;
        this.map = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e = (E) this.nextElement;
        this.index++;
        Links links = this.map.get(e);
        if (links == null) {
            throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
        }
        this.nextElement = links.getNext();
        return e;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }
}
