package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import o.C8561dqd;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public int size() {
        return this.size;
    }

    public SimpleArrayMap(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i];
        }
        this.hashes = iArr;
        if (i == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i << 1];
        }
        this.array = objArr;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private final int indexOf(K k, int i) {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i2, i);
        if (binarySearch >= 0 && !C8632dsu.c(k, this.array[binarySearch << 1])) {
            int i3 = binarySearch + 1;
            while (i3 < i2 && this.hashes[i3] == i) {
                if (C8632dsu.c(k, this.array[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = binarySearch - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
                if (C8632dsu.c(k, this.array[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return binarySearch;
    }

    private final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, 0);
        if (binarySearch >= 0 && this.array[binarySearch << 1] != null) {
            int i2 = binarySearch + 1;
            while (i2 < i && this.hashes[i2] == 0) {
                if (this.array[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = binarySearch - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
                if (this.array[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return binarySearch;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int i) {
        int i2 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            C8632dsu.a(copyOf, "");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i * 2);
            C8632dsu.a(copyOf2, "");
            this.array = copyOf2;
        }
        if (this.size != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        return indexOfKey(k) >= 0;
    }

    public int indexOfKey(K k) {
        if (k == null) {
            return indexOfNull();
        }
        return indexOf(k, k.hashCode());
    }

    public final int __restricted$indexOfValue(V v) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (C8632dsu.c(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V v) {
        return __restricted$indexOfValue(v) >= 0;
    }

    public K keyAt(int i) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        return (K) this.array[i << 1];
    }

    public V valueAt(int i) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        return (V) this.array[(i << 1) + 1];
    }

    public V setValueAt(int i, V v) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.array;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V put(K k, V v) {
        int i = this.size;
        int hashCode = k != null ? k.hashCode() : 0;
        int indexOf = k != null ? indexOf(k, hashCode) : indexOfNull();
        if (indexOf >= 0) {
            int i2 = (indexOf << 1) + 1;
            Object[] objArr = this.array;
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
            Object[] copyOf2 = Arrays.copyOf(this.array, i4 << 1);
            C8632dsu.a(copyOf2, "");
            this.array = copyOf2;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            C8561dqd.b(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.array;
            C8561dqd.e(objArr2, objArr2, i5 << 1, i3 << 1, this.size << 1);
        }
        int i6 = this.size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.array;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        C8632dsu.c((Object) simpleArrayMap, "");
        int i = simpleArrayMap.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2));
            }
        } else if (i > 0) {
            C8561dqd.b(simpleArrayMap.hashes, this.hashes, 0, 0, i);
            C8561dqd.e(simpleArrayMap.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public boolean remove(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !C8632dsu.c(v, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public V removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        Object[] objArr = this.array;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.hashes;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i5);
                C8632dsu.a(copyOf, "");
                this.hashes = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.array, i5 << 1);
                C8632dsu.a(copyOf2, "");
                this.array = copyOf2;
                if (i2 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    C8561dqd.b(iArr, this.hashes, 0, 0, i);
                    C8561dqd.e(objArr, this.array, 0, 0, i3);
                }
                if (i < i4) {
                    int i6 = i + 1;
                    C8561dqd.b(iArr, this.hashes, i, i6, i2);
                    C8561dqd.e(objArr, this.array, i3, i6 << 1, i2 << 1);
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    C8561dqd.b(iArr, iArr, i, i7, i2);
                    Object[] objArr2 = this.array;
                    C8561dqd.e(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                }
                Object[] objArr3 = this.array;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i4;
        }
        return v;
    }

    public V replace(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !C8632dsu.c(v, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v2);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this.size;
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
            } else if ((obj instanceof Map) && size() == ((Map) obj).size()) {
                int i3 = this.size;
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
        Object[] objArr = this.array;
        int i = this.size;
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
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
            if (valueAt != sb) {
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

    public V get(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.array[(indexOfKey << 1) + 1] : v;
    }
}
