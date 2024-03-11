package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class HK extends HJ implements List<HZ> {
    private final List<HZ> e;

    @Override // o.HJ
    public int a(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.e.lastIndexOf(hz);
    }

    @Override // o.HJ
    public int b(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.e.indexOf(hz);
    }

    @Override // java.util.List
    /* renamed from: b */
    public HZ get(int i) {
        return this.e.get(i);
    }

    public final List<HZ> c() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.e.containsAll(collection);
    }

    @Override // o.HJ
    public int e() {
        return this.e.size();
    }

    @Override // o.HJ
    public boolean e(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.e.contains(hz);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<HZ> iterator() {
        return this.e.iterator();
    }

    @Override // o.HJ, java.util.List
    public ListIterator<HZ> listIterator() {
        return this.e.listIterator();
    }

    @Override // o.HJ, java.util.List
    public ListIterator<HZ> listIterator(int i) {
        return this.e.listIterator(i);
    }

    @Override // o.HJ, java.util.List
    public List<HZ> subList(int i, int i2) {
        return this.e.subList(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HK(List<? extends HZ> list) {
        super(null);
        C8632dsu.c((Object) list, "");
        this.e = list;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof HK) {
            return C8632dsu.c(this.e, ((HK) obj).e);
        }
        if (obj instanceof C0930Ib) {
            return C8632dsu.c(this.e, ((C0930Ib) obj).values());
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.e.hashCode();
    }
}
