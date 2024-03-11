package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Map;
import o.C8564dqg;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {
    private Object[] keys;
    private int size;
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public IdentityArrayMap(int i) {
        this.keys = new Object[i];
        this.values = new Object[i];
    }

    public /* synthetic */ IdentityArrayMap(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean contains(Key key) {
        return find(key) >= 0;
    }

    public final Value get(Key key) {
        int find = find(key);
        if (find >= 0) {
            return (Value) this.values[find];
        }
        return null;
    }

    public final void set(Key key, Value value) {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i = this.size;
        int find = find(key);
        if (find >= 0) {
            objArr2[find] = value;
            return;
        }
        int i2 = -(find + 1);
        boolean z = i == objArr.length;
        Object[] objArr3 = z ? new Object[i * 2] : objArr;
        int i3 = i2 + 1;
        C8564dqg.d(objArr, objArr3, i3, i2, i);
        if (z) {
            C8564dqg.e(objArr, objArr3, 0, 0, i2, 6, null);
        }
        objArr3[i2] = key;
        this.keys = objArr3;
        Object[] objArr4 = z ? new Object[i * 2] : objArr2;
        C8564dqg.d(objArr2, objArr4, i3, i2, i);
        if (z) {
            C8564dqg.e(objArr2, objArr4, 0, 0, i2, 6, null);
        }
        objArr4[i2] = value;
        this.values = objArr4;
        this.size++;
    }

    public final void clear() {
        this.size = 0;
        C8564dqg.c(this.keys, null, 0, 0, 6, null);
        C8564dqg.c(this.values, null, 0, 0, 6, null);
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.size - 1;
        Object[] objArr = this.keys;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                return obj == obj2 ? i3 : findExactIndex(i3, obj, identityHashCode);
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        Object[] objArr = this.keys;
        int i3 = this.size;
        for (int i4 = i - 1; -1 < i4; i4--) {
            Object obj2 = objArr[i4];
            if (obj2 == obj) {
                return i4;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        while (true) {
            int i5 = i + 1;
            if (i5 >= i3) {
                return -(i3 + 1);
            }
            Object obj3 = objArr[i5];
            if (obj3 == obj) {
                return i5;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                return -(i + 2);
            }
            i = i5;
        }
    }

    public final Map<Key, Value> asMap() {
        return new IdentityArrayMap$asMap$1(this);
    }
}
