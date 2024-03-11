package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

@InterfaceC7700dCc(e = dEC.class)
/* loaded from: classes5.dex */
public final class dEB extends dEI implements List<dEI>, dsK {
    public static final d Companion = new d(null);
    private final List<dEI> b;

    public int a() {
        return this.b.size();
    }

    @Override // java.util.List
    public /* synthetic */ void add(int i, dEI dei) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends dEI> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends dEI> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b(dEI dei) {
        C8632dsu.c((Object) dei, "");
        return this.b.lastIndexOf(dei);
    }

    @Override // java.util.List
    /* renamed from: b */
    public dEI get(int i) {
        return this.b.get(i);
    }

    public int c(dEI dei) {
        C8632dsu.c((Object) dei, "");
        return this.b.indexOf(dei);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.b.containsAll(collection);
    }

    public boolean d(dEI dei) {
        C8632dsu.c((Object) dei, "");
        return this.b.contains(dei);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<dEI> iterator() {
        return this.b.iterator();
    }

    @Override // java.util.List
    public ListIterator<dEI> listIterator() {
        return this.b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<dEI> listIterator(int i) {
        return this.b.listIterator(i);
    }

    @Override // java.util.List
    public /* synthetic */ dEI remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<dEI> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ dEI set(int i, dEI dei) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super dEI> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<dEI> subList(int i, int i2) {
        return this.b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (T[]) C8628dsq.c(this, tArr);
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof dEI) {
            return d((dEI) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof dEI) {
            return c((dEI) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof dEI) {
            return b((dEI) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dEB(List<? extends dEI> list) {
        super(null);
        C8632dsu.c((Object) list, "");
        this.b = list;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return C8632dsu.c(this.b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String d2;
        d2 = C8576dqs.d(this.b, ",", "[", "]", 0, null, null, 56, null);
        return d2;
    }
}
