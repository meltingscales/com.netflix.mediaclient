package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import o.C8632dsu;
import o.dsH;
import o.dsJ;

/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, dsJ {
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K currentKey = currentKey();
            dsH.d(this.builder).remove(this.lastIteratedKey);
            resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            dsH.d(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k, V v) {
        if (this.builder.containsKey(k)) {
            if (hasNext()) {
                K currentKey = currentKey();
                this.builder.put(k, v);
                resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime_release(), currentKey, 0);
            } else {
                this.builder.put(k, v);
            }
            this.expectedModCount = this.builder.getModCount$runtime_release();
        }
    }

    private final void resetPath(int i, TrieNode<?, ?> trieNode, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!C8632dsu.c(getPath()[i2].currentKey(), k)) {
                getPath()[i2].moveToNextKey();
            }
            setPathLastIndex(i2);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i3);
        if (trieNode.hasEntryAt$runtime_release(indexSegment)) {
            getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(indexSegment));
            setPathLastIndex(i2);
            return;
        }
        int nodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(indexSegment);
        TrieNode<?, ?> nodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, nodeIndex$runtime_release);
        resetPath(i, nodeAtIndex$runtime_release, k, i2 + 1);
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
