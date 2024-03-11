package androidx.compose.ui.text.caches;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    protected final int indexOf(Object obj, int i) {
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i2, i);
        if (binarySearchInternal >= 0 && !C8632dsu.c(obj, this.keyValues[binarySearchInternal << 1])) {
            int i3 = binarySearchInternal + 1;
            while (i3 < i2 && this.hashes[i3] == i) {
                if (C8632dsu.c(obj, this.keyValues[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = binarySearchInternal - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
                if (C8632dsu.c(obj, this.keyValues[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return binarySearchInternal;
    }

    protected final int indexOfNull() {
        int i = this._size;
        if (i == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i, 0);
        if (binarySearchInternal >= 0 && this.keyValues[binarySearchInternal << 1] != null) {
            int i2 = binarySearchInternal + 1;
            while (i2 < i && this.hashes[i2] == 0) {
                if (this.keyValues[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = binarySearchInternal - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
                if (this.keyValues[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return binarySearchInternal;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i];
            this.keyValues = new Object[i << 1];
        }
        this._size = 0;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final boolean containsKey(K k) {
        return indexOfKey(k) >= 0;
    }

    public final int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public final V get(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final K keyAt(int i) {
        return (K) this.keyValues[i << 1];
    }

    public final V valueAt(int i) {
        return (V) this.keyValues[(i << 1) + 1];
    }

    public final V put(K k, V v) {
        int hashCode;
        int indexOf;
        int i = this._size;
        if (k == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            indexOf = indexOf(k, hashCode);
        }
        if (indexOf >= 0) {
            int i2 = (indexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~indexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            C8632dsu.a(copyOf, "");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i4 << 1);
            C8632dsu.a(copyOf2, "");
            this.keyValues = copyOf2;
            if (i != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            C8564dqg.c(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.keyValues;
            C8564dqg.d(objArr2, objArr2, i5 << 1, i3 << 1, this._size << 1);
        }
        int i6 = this._size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.keyValues;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this._size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this._size;
                if (i != simpleArrayMap._size) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!C8632dsu.c(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if ((obj instanceof Map) && this._size == ((Map) obj).size()) {
                int i3 = this._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    K keyAt2 = keyAt(i4);
                    V valueAt2 = valueAt(i4);
                    Object obj3 = ((Map) obj).get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!C8632dsu.c(valueAt2, obj3)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i = this._size;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
