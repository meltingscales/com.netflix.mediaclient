package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import o.C8632dsu;
import o.C8657dts;
import o.dsR;

/* loaded from: classes.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, dsR {
    private final PersistentVectorBuilder<T> builder;
    private int expectedModCount;
    private int lastIteratedIndex;
    private TrieIterator<? extends T> trieIterator;

    public PersistentVectorMutableIterator(PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkForComodification();
        checkHasPrevious$runtime_release();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release[getIndex()];
        } else if (getIndex() > trieIterator.getSize()) {
            Object[] tail$runtime_release2 = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release2[getIndex() - trieIterator.getSize()];
        } else {
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        checkHasNext$runtime_release();
        this.lastIteratedIndex = getIndex();
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.builder.getTail$runtime_release();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime_release[index];
        } else if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        } else {
            Object[] tail$runtime_release2 = this.builder.getTail$runtime_release();
            int index2 = getIndex();
            setIndex(index2 + 1);
            return (T) tail$runtime_release2[index2 - trieIterator.getSize()];
        }
    }

    private final void reset() {
        setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        int i;
        Object[] root$runtime_release = this.builder.getRoot$runtime_release();
        if (root$runtime_release == null) {
            this.trieIterator = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.builder.size());
        i = C8657dts.i(getIndex(), rootSize);
        int rootShift$runtime_release = (this.builder.getRootShift$runtime_release() / 5) + 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator<>(root$runtime_release, i, rootSize, rootShift$runtime_release);
            return;
        }
        C8632dsu.d(trieIterator);
        trieIterator.reset$runtime_release(root$runtime_release, i, rootSize, rootShift$runtime_release);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T t) {
        checkForComodification();
        this.builder.add(getIndex(), t);
        setIndex(getIndex() + 1);
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            setIndex(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T t) {
        checkForComodification();
        checkHasIterated();
        this.builder.set(this.lastIteratedIndex, t);
        this.expectedModCount = this.builder.getModCount$runtime_release();
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.expectedModCount != this.builder.getModCount$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }
}
