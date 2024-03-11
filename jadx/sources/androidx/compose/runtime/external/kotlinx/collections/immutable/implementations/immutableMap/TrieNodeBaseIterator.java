package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import o.C8632dsu;
import o.dsK;

/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, dsK {
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i, int i2) {
        this.buffer = objArr;
        this.dataSize = i;
        this.index = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIndex(int i) {
        this.index = i;
    }

    public final void reset(Object[] objArr, int i) {
        reset(objArr, i, 0);
    }

    public final K currentKey() {
        CommonFunctionsKt.m1044assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m1044assert(hasNextKey());
        this.index += 2;
    }

    public final boolean hasNextNode() {
        CommonFunctionsKt.m1044assert(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m1044assert(hasNextNode());
        Object obj = this.buffer[this.index];
        C8632dsu.d(obj);
        return (TrieNode) obj;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m1044assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }
}
