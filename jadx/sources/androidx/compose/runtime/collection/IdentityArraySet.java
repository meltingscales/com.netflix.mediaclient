package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.C8564dqg;
import o.C8576dqs;
import o.C8628dsq;
import o.drM;
import o.dsK;

/* loaded from: classes.dex */
public final class IdentityArraySet<T> implements Set<T>, dsK {
    private int size;
    private Object[] values = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && find(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        int i;
        int size = size();
        Object[] objArr = this.values;
        if (size > 0) {
            i = find(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            C8564dqg.d(objArr, objArr2, i2 + 1, i2, size);
            C8564dqg.e(objArr, objArr2, 0, 0, i2, 6, null);
            this.values = objArr2;
        } else {
            C8564dqg.d(objArr, objArr, i2 + 1, i2, size);
        }
        this.values[i2] = t;
        this.size = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        C8564dqg.c(this.values, null, 0, 0, 6, null);
        this.size = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final void addAll(Collection<? extends T> collection) {
        Object[] objArr;
        int i;
        Object obj;
        Object obj2;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            for (T t : collection) {
                add(t);
            }
            return;
        }
        Object[] objArr2 = this.values;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.values;
        int size = size();
        int size2 = identityArraySet.size();
        int i2 = size + size2;
        boolean z = this.values.length < i2;
        boolean z2 = size == 0 || ActualJvm_jvmKt.identityHashCode(objArr2[size + (-1)]) < ActualJvm_jvmKt.identityHashCode(objArr3[0]);
        if (!z && z2) {
            C8564dqg.d(objArr3, objArr2, size, 0, size2);
            this.size = size() + size2;
            return;
        }
        if (z) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i3 = size - 1;
        int i4 = size2 - 1;
        int i5 = i2 - 1;
        while (true) {
            if (i3 < 0 && i4 < 0) {
                break;
            }
            if (i3 < 0) {
                i = i4 - 1;
                obj = objArr3[i4];
            } else {
                if (i4 < 0) {
                    obj2 = objArr2[i3];
                } else {
                    obj2 = objArr2[i3];
                    Object obj3 = objArr3[i4];
                    int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj2);
                    int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj3);
                    if (identityHashCode <= identityHashCode2) {
                        if (identityHashCode >= identityHashCode2) {
                            if (obj2 != obj3) {
                                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                                    Object obj4 = objArr2[i6];
                                    if (ActualJvm_jvmKt.identityHashCode(obj4) != identityHashCode2) {
                                        break;
                                    } else if (obj3 == obj4) {
                                        i4--;
                                        break;
                                    }
                                }
                            } else {
                                i3--;
                                i4--;
                                Object obj5 = obj2;
                                i = i4;
                                obj = obj5;
                            }
                        }
                        i = i4 - 1;
                        obj = obj3;
                    }
                }
                i3--;
                Object obj52 = obj2;
                i = i4;
                obj = obj52;
            }
            objArr[i5] = obj;
            i5--;
            i4 = i;
        }
        if (i5 >= 0) {
            C8564dqg.d(objArr, objArr, 0, i5 + 1, i2);
        }
        int i7 = i2 - (i5 + 1);
        C8564dqg.d(objArr, null, i7, i2);
        this.values = objArr;
        this.size = i7;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t) {
        if (t == null) {
            return false;
        }
        int find = find(t);
        Object[] objArr = this.values;
        int size = size();
        if (find >= 0) {
            int i = size - 1;
            if (find < i) {
                C8564dqg.d(objArr, objArr, find, find + 1, size);
            }
            objArr[i] = null;
            this.size = size() - 1;
            return true;
        }
        return false;
    }

    private final int find(Object obj) {
        int size = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.values;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = objArr[i2];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i2 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                return obj2 == obj ? i2 : findExactIndex(i2, obj, identityHashCode);
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        Object[] objArr = this.values;
        int size = size();
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = objArr[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        while (true) {
            int i4 = i + 1;
            if (i4 >= size) {
                return -(size + 1);
            }
            Object obj3 = objArr[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                return -(i + 2);
            }
            i = i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    public String toString() {
        String d;
        d = C8576dqs.d(this, null, "[", "]", 0, null, new drM<T, CharSequence>() { // from class: androidx.compose.runtime.collection.IdentityArraySet$toString$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final CharSequence invoke(T t) {
                return t.toString();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((IdentityArraySet$toString$1<T>) obj);
            }
        }, 25, null);
        return d;
    }
}
