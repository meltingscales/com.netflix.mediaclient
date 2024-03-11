package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ScopeMap<T> {
    private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean remove(Object obj, T t) {
        Object obj2 = this.map.get(obj);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            boolean remove = mutableScatterSet.remove(t);
            if (remove && mutableScatterSet.isEmpty()) {
                this.map.remove(obj);
            }
            return remove;
        } else if (C8632dsu.c(obj2, t)) {
            this.map.remove(obj);
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.MutableScatterSet] */
    public final void add(Object obj, T t) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        boolean z = findInsertIndex < 0;
        T t2 = z ? null : mutableScatterMap.values[findInsertIndex];
        if (t2 != null) {
            if (t2 instanceof MutableScatterSet) {
                C8632dsu.d(t2);
                ((MutableScatterSet) t2).add(t);
            } else if (t2 != t) {
                ?? mutableScatterSet = new MutableScatterSet(0, 1, null);
                C8632dsu.d(t2);
                mutableScatterSet.add(t2);
                mutableScatterSet.add(t);
                t = mutableScatterSet;
            }
            t = t2;
        }
        if (z) {
            int i = ~findInsertIndex;
            mutableScatterMap.keys[i] = obj;
            mutableScatterMap.values[i] = t;
            return;
        }
        mutableScatterMap.values[findInsertIndex] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r14.isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r14 == r31) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r1.removeValueAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r2 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeScope(T r31) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.removeScope(java.lang.Object):void");
    }
}
