package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import o.C8564dqg;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.dsQ;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, dsQ {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public ArraySet() {
        this(0, 1, null);
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void setArray$collection(Object[] objArr) {
        C8632dsu.c((Object) objArr, "");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    public ArraySet(int i) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            ArraySetKt.allocArrays(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }

    public /* synthetic */ ArraySet(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] d;
        d = C8564dqg.d(this.array, 0, this._size);
        return d;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        T[] tArr2 = (T[]) ArraySetJvmUtil.resizeForToArray(tArr, this._size);
        C8564dqg.d(this.array, tArr2, 0, 0, this._size);
        C8632dsu.a(tArr2, "");
        return tArr2;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    /* loaded from: classes.dex */
    final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i) {
            return ArraySet.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i) {
            ArraySet.this.removeAt(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int i) {
        int i2 = get_size$collection();
        if (getHashes$collection().length < i) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i);
            if (get_size$collection() > 0) {
                C8564dqg.b(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                C8564dqg.e(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    public final E valueAt(int i) {
        return (E) getArray$collection()[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int indexOf;
        int i2 = get_size$collection();
        if (e == null) {
            indexOf = ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            indexOf = ArraySetKt.indexOf(this, e, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i3 = ~indexOf;
        if (i2 >= getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                C8564dqg.b(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                C8564dqg.e(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            C8564dqg.c(getHashes$collection(), getHashes$collection(), i5, i3, i2);
            C8564dqg.d(getArray$collection(), getArray$collection(), i5, i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i3] = i;
        getArray$collection()[i3] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final E removeAt(int i) {
        int i2 = get_size$collection();
        E e = (E) getArray$collection()[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            if (getHashes$collection().length > 8 && get_size$collection() < getHashes$collection().length / 3) {
                int i4 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i4);
                if (i > 0) {
                    C8564dqg.b(hashes$collection, getHashes$collection(), 0, 0, i, 6, null);
                    C8564dqg.e(array$collection, getArray$collection(), 0, 0, i, 6, null);
                }
                if (i < i3) {
                    int i5 = i + 1;
                    C8564dqg.c(hashes$collection, getHashes$collection(), i, i5, i2);
                    C8564dqg.d(array$collection, getArray$collection(), i, i5, i2);
                }
            } else {
                if (i < i3) {
                    int i6 = i + 1;
                    C8564dqg.c(getHashes$collection(), getHashes$collection(), i, i6, i2);
                    C8564dqg.d(getArray$collection(), getArray$collection(), i, i6, i2);
                }
                getArray$collection()[i3] = null;
            }
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i3);
        }
        return e;
    }

    public final boolean removeAll(ArraySet<? extends E> arraySet) {
        C8632dsu.c((Object) arraySet, "");
        int i = arraySet.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 != r6) goto L3
            goto L2e
        L3:
            boolean r0 = r6 instanceof java.util.Set
            r1 = 0
            if (r0 == 0) goto L2f
            int r0 = r5.size()
            r2 = r6
            java.util.Set r2 = (java.util.Set) r2
            int r2 = r2.size()
            if (r0 == r2) goto L16
            goto L2f
        L16:
            int r0 = r5.get_size$collection()     // Catch: java.lang.Throwable -> L2f
            r2 = r1
        L1b:
            if (r2 >= r0) goto L2e
            java.lang.Object r3 = r5.valueAt(r2)     // Catch: java.lang.Throwable -> L2f
            r4 = r6
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            int r2 = r2 + 1
            goto L1b
        L2e:
            r1 = 1
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ArraySet.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        ensureCapacity(get_size$collection() + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean b;
        C8632dsu.c((Object) collection, "");
        boolean z = false;
        for (int i = get_size$collection() - 1; -1 < i; i--) {
            b = C8576dqs.b((Iterable<? extends Object>) collection, getArray$collection()[i]);
            if (!b) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }
}
