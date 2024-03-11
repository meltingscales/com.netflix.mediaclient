package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C8628dsq;
import o.dsK;
import o.dtQ;
import o.dtV;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1$entries$1<Key, Value> implements Set<Map.Entry<? extends Key, ? extends Value>>, dsK {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends Key, ? extends Value>> collection) {
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
    public IdentityArrayMap$asMap$1$entries$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) ((Map.Entry) obj));
        }
        return false;
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
    public Iterator<Map.Entry<Key, Value>> iterator() {
        dtQ e;
        e = dtV.e(new IdentityArrayMap$asMap$1$entries$1$iterator$1(this.this$0, null));
        return e.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains((Object) ((Map.Entry) it.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean contains(Map.Entry<? extends Key, ? extends Value> entry) {
        return this.this$0.get(entry.getKey()) == entry.getValue();
    }
}
