package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.dva  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8693dva<E> implements ListIterator<E>, dsK {
    private int a;
    private int d;

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.a < this.d;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AbstractC8693dva(int i, int i2) {
        this.a = i;
        this.d = i2;
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }
}
