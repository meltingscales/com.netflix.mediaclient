package androidx.compose.runtime.collection;

import java.util.Iterator;
import o.C8632dsu;
import o.dsK;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class IdentityArraySet$iterator$1<T> implements Iterator<T>, dsK {
    private int index;
    final /* synthetic */ IdentityArraySet<T> this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArraySet$iterator$1(IdentityArraySet<T> identityArraySet) {
        this.this$0 = identityArraySet;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.this$0.size();
    }

    @Override // java.util.Iterator
    public T next() {
        Object[] values = this.this$0.getValues();
        int i = this.index;
        this.index = i + 1;
        T t = (T) values[i];
        C8632dsu.d(t);
        return t;
    }
}
