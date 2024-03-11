package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import o.C8628dsq;
import o.C8632dsu;
import o.dsK;
import o.dtQ;
import o.dtV;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1$values$1<Value> implements Collection<Value>, dsK {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    @Override // java.util.Collection
    public boolean add(Value value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Value> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Value> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArrayMap$asMap$1$values$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Value> iterator() {
        dtQ e;
        e = dtV.e(new IdentityArrayMap$asMap$1$values$1$iterator$1(this.this$0, null));
        return e.iterator();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        int size = this.this$0.getSize();
        for (int i = 0; i < size; i++) {
            if (C8632dsu.c(this.this$0.getValues()[i], obj)) {
                return true;
            }
        }
        return false;
    }
}
