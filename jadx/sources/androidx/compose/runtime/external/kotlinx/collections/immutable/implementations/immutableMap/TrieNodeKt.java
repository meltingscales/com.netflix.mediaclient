package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import o.C8564dqg;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final /* synthetic */ Object[] access$insertEntryAtIndex(Object[] objArr, int i, Object obj, Object obj2) {
        return insertEntryAtIndex(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] access$removeEntryAtIndex(Object[] objArr, int i) {
        return removeEntryAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$removeNodeAtIndex(Object[] objArr, int i) {
        return removeNodeAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode trieNode) {
        return replaceEntryWithNode(objArr, i, i2, trieNode);
    }

    public static final /* synthetic */ Object[] access$replaceNodeWithEntry(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return replaceNodeWithEntry(objArr, i, i2, obj, obj2);
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = trieNode;
        C8564dqg.d(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        C8632dsu.a(copyOf, "");
        C8564dqg.d(copyOf, copyOf, i + 2, i + 1, objArr.length);
        C8564dqg.d(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }

    public static final Object[] removeEntryAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] removeNodeAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C8564dqg.e(objArr, objArr2, 0, 0, i, 6, null);
        C8564dqg.d(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
