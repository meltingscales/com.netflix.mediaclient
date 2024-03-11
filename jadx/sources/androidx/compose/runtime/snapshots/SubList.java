package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref;
import o.C8628dsq;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.dqB;
import o.dsI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, dsI {
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    public SubList(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.parentList = snapshotStateList;
        this.offset = i;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i2 - i;
    }

    @Override // java.util.List
    public final T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i) {
        validateModification();
        SnapshotStateListKt.validateRange(i, size());
        return this.parentList.get(this.offset + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        C8654dtp g;
        validateModification();
        int i = this.offset;
        g = C8657dts.g(i, size() + i);
        Iterator<Integer> it = g.iterator();
        while (it.hasNext()) {
            int nextInt = ((dqB) it).nextInt();
            if (C8632dsu.c(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        while (true) {
            size--;
            if (size < this.offset) {
                return -1;
            }
            if (C8632dsu.c(obj, this.parentList.get(size))) {
                return size - this.offset;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        validateModification();
        this.parentList.add(this.offset + size(), t);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        validateModification();
        this.parentList.add(this.offset + i, t);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        validateModification();
        boolean addAll = this.parentList.addAll(i + this.offset, collection);
        if (addAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        validateModification();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.b = i - 1;
        return new SubList$listIterator$1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z;
        while (true) {
            for (Object obj : collection) {
                z = remove(obj) || z;
            }
            return z;
        }
    }

    public T removeAt(int i) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i, size() + i);
        if (retainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        return retainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        SnapshotStateListKt.validateRange(i, size());
        validateModification();
        T t2 = this.parentList.set(i + this.offset, t);
        this.structure = this.parentList.getStructure$runtime_release();
        return t2;
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i3 = this.offset;
        return new SubList(snapshotStateList, i + i3, i2 + i3);
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }
}
