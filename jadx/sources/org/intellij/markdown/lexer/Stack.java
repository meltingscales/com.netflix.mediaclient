package org.intellij.markdown.lexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.C8576dqs;
import o.C8628dsq;
import o.C8632dsu;
import o.dsI;

/* loaded from: classes5.dex */
public final class Stack<E> implements List<E>, dsI {
    private final /* synthetic */ ArrayList<E> $$delegate_0 = new ArrayList<>();

    @Override // java.util.List
    public void add(int i, E e) {
        this.$$delegate_0.add(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.$$delegate_0.add(e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        return this.$$delegate_0.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        return this.$$delegate_0.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.$$delegate_0.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.$$delegate_0.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.$$delegate_0.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.$$delegate_0.get(i);
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.$$delegate_0.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it = this.$$delegate_0.iterator();
        C8632dsu.a(it, "");
        return it;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.$$delegate_0.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        ListIterator<E> listIterator = this.$$delegate_0.listIterator();
        C8632dsu.a(listIterator, "");
        return listIterator;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        ListIterator<E> listIterator = this.$$delegate_0.listIterator(i);
        C8632dsu.a(listIterator, "");
        return listIterator;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.$$delegate_0.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.$$delegate_0.removeAll(collection);
    }

    public E removeAt(int i) {
        return this.$$delegate_0.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.$$delegate_0.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.$$delegate_0.set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        List<E> subList = this.$$delegate_0.subList(i, i2);
        C8632dsu.a(subList, "");
        return subList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final boolean push(E e) {
        return add(e);
    }

    public final E pop() {
        Object B;
        B = C8576dqs.B((List<? extends Object>) this);
        E e = (E) B;
        remove(size() - 1);
        return e;
    }

    public final E peek() {
        Object B;
        B = C8576dqs.B((List<? extends Object>) this);
        return (E) B;
    }
}
