package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i);
        this.keys = new int[idealIntArraySize];
        this.values = new Object[idealIntArraySize];
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* renamed from: clone */
    public SparseArrayCompat<E> m6clone() {
        Object clone = super.clone();
        C8632dsu.d(clone);
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i) {
        return (E) SparseArrayCompatKt.commonGet(this, i);
    }

    public E get(int i, E e) {
        return (E) SparseArrayCompatKt.commonGet(this, i, e);
    }

    public void removeAt(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.values[i];
        obj = SparseArrayCompatKt.DELETED;
        if (obj3 != obj) {
            Object[] objArr = this.values;
            obj2 = SparseArrayCompatKt.DELETED;
            objArr[i] = obj2;
            this.garbage = true;
        }
    }

    public E replace(int i, E e) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey >= 0) {
            Object[] objArr = this.values;
            E e2 = (E) objArr[indexOfKey];
            objArr[indexOfKey] = e;
            return e2;
        }
        return null;
    }

    public void put(int i, E e) {
        Object obj;
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 < this.size) {
            Object obj2 = this.values[i2];
            obj = SparseArrayCompatKt.DELETED;
            if (obj2 == obj) {
                this.keys[i2] = i;
                this.values[i2] = e;
                return;
            }
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            C8632dsu.a(copyOf, "");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            C8632dsu.a(copyOf2, "");
            this.values = copyOf2;
        }
        int i4 = this.size;
        if (i4 - i2 != 0) {
            int[] iArr = this.keys;
            int i5 = i2 + 1;
            C8564dqg.c(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.values;
            C8564dqg.d(objArr, objArr, i5, i2, this.size);
        }
        this.keys[i2] = i;
        this.values[i2] = e;
        this.size++;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public int keyAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i];
    }

    public E valueAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return (E) this.values[i];
    }

    public int indexOfKey(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (this.values[i2] == e) {
                return i2 >= 0;
            }
            i2++;
        }
        return false;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(int i, E e) {
        int i2 = this.size;
        if (i2 != 0 && i <= this.keys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.garbage && i2 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            C8632dsu.a(copyOf, "");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            C8632dsu.a(copyOf2, "");
            this.values = copyOf2;
        }
        this.keys[i3] = i;
        this.values[i3] = e;
        this.size = i3 + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
