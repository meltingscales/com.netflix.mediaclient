package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;
import o.C8646dth;
import o.C8654dtp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    private final boolean hasNodeAt(int i) {
        return (i & this.nodeMap) != 0;
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i) {
        return (i & this.dataMap) != 0;
    }

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }

    /* loaded from: classes.dex */
    public static final class ModificationResult<K, V> {
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }

        public ModificationResult(TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.dataMap) * 2;
    }

    public final int nodeIndex$runtime_release(int i) {
        return (this.buffer.length - 1) - Integer.bitCount((i - 1) & this.nodeMap);
    }

    private final K keyAtIndex(int i) {
        return (K) this.buffer[i];
    }

    private final V valueAtKeyIndex(int i) {
        return (V) this.buffer[i + 1];
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i) {
        Object obj = this.buffer[i];
        C8632dsu.d(obj);
        return (TrieNode) obj;
    }

    private final TrieNode<K, V> insertEntryAt(int i, K k, V v) {
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i), k, v));
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i, K k, V v, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v);
            this.dataMap = i | this.dataMap;
            return this;
        }
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v), mutabilityOwnership);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C8632dsu.a(copyOf, "");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i + 1] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C8632dsu.a(copyOf, "");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i, int i2, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            return new TrieNode<>(this.dataMap ^ i2, i2 ^ this.nodeMap, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i, entryKeyIndex$runtime_release(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        C8632dsu.a(copyOf, "");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else if (this.ownedBy == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C8632dsu.a(copyOf, "");
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
        }
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeNodeAtIndex(objArr, i);
            this.nodeMap ^= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i), mutabilityOwnership);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        K keyAtIndex = keyAtIndex(i);
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i, nodeIndex$runtime_release(i2) + 1, makeNode(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, mutabilityOwnership));
    }

    private final TrieNode<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, null));
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership);
            this.dataMap ^= i2;
            this.nodeMap |= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k, v, k2, v2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i);
            this.dataMap ^= i2;
            return this;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership());
    }

    private final boolean collisionContainsKey(K k) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (!C8632dsu.c(k, this.buffer[d2])) {
                if (d2 != e) {
                    d2 += a;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a <= 0 || d2 > e) && (a >= 0 || e > d2)) {
            return null;
        }
        while (!C8632dsu.c(k, keyAtIndex(d2))) {
            if (d2 == e) {
                return null;
            }
            d2 += a;
        }
        return valueAtKeyIndex(d2);
    }

    private final ModificationResult<K, V> collisionPut(K k, V v) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (!C8632dsu.c(k, keyAtIndex(d2))) {
                if (d2 != e) {
                    d2 += a;
                }
            }
            if (v == valueAtKeyIndex(d2)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C8632dsu.a(copyOf, "");
            copyOf[d2 + 1] = v;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k, v)).asInsertResult();
    }

    private final TrieNode<K, V> mutableCollisionPut(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (!C8632dsu.c(k, keyAtIndex(d2))) {
                if (d2 != e) {
                    d2 += a;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(d2));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[d2 + 1] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C8632dsu.a(copyOf, "");
            copyOf[d2 + 1] = v;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k, v), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> collisionRemove(K k) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (!C8632dsu.c(k, keyAtIndex(d2))) {
                if (d2 != e) {
                    d2 += a;
                }
            }
            return collisionRemoveEntryAtIndex(d2);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (!C8632dsu.c(k, keyAtIndex(d2))) {
                if (d2 != e) {
                    d2 += a;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(d2, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (true) {
                if (!C8632dsu.c(k, keyAtIndex(d2)) || !C8632dsu.c(v, valueAtKeyIndex(d2))) {
                    if (d2 == e) {
                        break;
                    }
                    d2 += a;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(d2, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        C8654dtp g;
        C8646dth d;
        CommonFunctionsKt.m1044assert(this.nodeMap == 0);
        CommonFunctionsKt.m1044assert(this.dataMap == 0);
        CommonFunctionsKt.m1044assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m1044assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        C8632dsu.a(copyOf, "");
        int length = this.buffer.length;
        g = C8657dts.g(0, trieNode.buffer.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a > 0 && d2 <= e) || (a < 0 && e <= d2)) {
            while (true) {
                if (!collisionContainsKey(trieNode.buffer[d2])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[d2];
                    copyOf[length + 1] = objArr2[d2 + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (d2 == e) {
                    break;
                }
                d2 += a;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C8632dsu.a(copyOf2, "");
        return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i));
            if (trieNode.hasNodeAt(i)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i)), i2 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i);
                K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, i2 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$runtime_release;
        } else if (trieNode.hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i));
            if (hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                int i3 = i2 + 5;
                if (!nodeAtIndex$runtime_release2.containsKey(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, i3)) {
                    return nodeAtIndex$runtime_release2.mutablePut(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex(entryKeyIndex$runtime_release2), i3, persistentHashMapBuilder);
                }
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return nodeAtIndex$runtime_release2;
        } else {
            int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i);
            K keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
            int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i);
            K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$runtime_release4);
            return makeNode(keyAtIndex3 != null ? keyAtIndex3.hashCode() : 0, keyAtIndex3, valueAtKeyIndex2, keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release4), i2 + 5, persistentHashMapBuilder.getOwnership());
        }
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime_release(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap == trieNode.nodeMap && this.dataMap == trieNode.dataMap) {
            int length = this.buffer.length;
            for (int i = 0; i < length; i++) {
                if (this.buffer[i] != trieNode.buffer[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.collisionContainsKey(k);
            }
            return nodeAtIndex$runtime_release.containsKey(i, k, i2 + 5);
        }
        return false;
    }

    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(entryKeyIndex$runtime_release);
            }
            return null;
        } else if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.collisionGet(k);
            }
            return nodeAtIndex$runtime_release.get(i, k, i2 + 5);
        } else {
            return null;
        }
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] objArr;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        } else {
            int i2 = this.nodeMap | trieNode.nodeMap;
            int i3 = this.dataMap;
            int i4 = trieNode.dataMap;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (C8632dsu.c(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            if ((i2 & i6) != 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            TrieNode<K, V> trieNode2 = (C8632dsu.c(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i6 && this.nodeMap == i2) ? this : new TrieNode<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
            int i7 = 0;
            int i8 = i2;
            int i9 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                trieNode2.buffer[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i, deltaCounter, persistentHashMapBuilder);
                i9++;
                i8 ^= lowestOneBit2;
            }
            while (i6 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i6);
                int i10 = i7 * 2;
                if (!trieNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                    int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i10] = keyAtIndex(entryKeyIndex$runtime_release);
                    trieNode2.buffer[i10 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release);
                } else {
                    int entryKeyIndex$runtime_release2 = trieNode.entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i10] = trieNode.keyAtIndex(entryKeyIndex$runtime_release2);
                    trieNode2.buffer[i10 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (hasEntryAt$runtime_release(lowestOneBit3)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                }
                i7++;
                i6 ^= lowestOneBit3;
            }
            return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
        }
    }

    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime_release, v).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2).asInsertResult();
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                put = nodeAtIndex$runtime_release.collisionPut(k, v);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime_release.put(i, k, v, i2 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, put.getNode()));
            return put;
        } else {
            return insertEntryAt(indexSegment, k, v).asInsertResult();
        }
    }

    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutablePut;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                return valueAtKeyIndex(entryKeyIndex$runtime_release) == v ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2, persistentHashMapBuilder.getOwnership());
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutablePut = nodeAtIndex$runtime_release.mutableCollisionPut(k, v, persistentHashMapBuilder);
            } else {
                mutablePut = nodeAtIndex$runtime_release.mutablePut(i, k, v, i2 + 5, persistentHashMapBuilder);
            }
            return nodeAtIndex$runtime_release == mutablePut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutablePut, persistentHashMapBuilder.getOwnership());
        } else {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(indexSegment, k, v, persistentHashMapBuilder.getOwnership());
        }
    }

    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release)) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex$runtime_release.collisionRemove(k);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i, k, i2 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i, i2);
        }
        return trieNode != trieNode2 ? updateNodeAtIndex(i, i2, trieNode2) : this;
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k, persistentHashMapBuilder);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, i2 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
        } else {
            return this;
        }
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i, i2, mutabilityOwnership);
        }
        return (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i, trieNode2, mutabilityOwnership) : this;
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (C8632dsu.c(k, keyAtIndex(entryKeyIndex$runtime_release)) && C8632dsu.c(v, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k, v, persistentHashMapBuilder);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, v, i2 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
        } else {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }
}
