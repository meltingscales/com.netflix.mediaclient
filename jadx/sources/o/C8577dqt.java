package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.dqt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8577dqt implements ListIterator, dsK {
    public static final C8577dqt c = new C8577dqt();

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C8577dqt() {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: e */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b */
    public Void previous() {
        throw new NoSuchElementException();
    }
}
