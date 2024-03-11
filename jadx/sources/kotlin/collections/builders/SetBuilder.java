package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.dpY;

/* loaded from: classes5.dex */
public final class SetBuilder<E> extends dpY<E> implements Set<E>, Serializable {
    private final MapBuilder<E, ?> b;
    private static final b d = new b(null);
    private static final SetBuilder c = new SetBuilder(MapBuilder.a.b());

    /* loaded from: classes5.dex */
    static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        C8632dsu.c((Object) mapBuilder, "");
        this.b = mapBuilder;
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }

    public final Set<E> e() {
        this.b.d();
        return size() > 0 ? this : c;
    }

    private final Object writeReplace() {
        if (this.b.j()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // o.dpY
    public int getSize() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.b.d((MapBuilder<E, ?>) e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.b.b((MapBuilder<E, ?>) obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.b.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        this.b.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.b.c();
        return super.retainAll(collection);
    }
}
