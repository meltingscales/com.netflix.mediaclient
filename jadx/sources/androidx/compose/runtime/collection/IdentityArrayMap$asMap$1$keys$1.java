package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.C8628dsq;
import o.dsK;
import o.dtQ;
import o.dtV;

/* JADX INFO: Add missing generic type declarations: [Key] */
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1$keys$1<Key> implements Set<Key>, dsK {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    @Override // java.util.Set, java.util.Collection
    public boolean add(Key key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Key> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArrayMap$asMap$1$keys$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Key> iterator() {
        dtQ e;
        e = dtV.e(new IdentityArrayMap$asMap$1$keys$1$iterator$1(this.this$0, null));
        return e.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.this$0.contains(obj);
    }
}
