package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.Ie  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0933Ie extends HJ implements List<HZ> {
    private final List<HZ> d;

    @Override // o.HJ
    public int a(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.d.lastIndexOf(hz);
    }

    @Override // o.HJ
    public int b(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.d.indexOf(hz);
    }

    @Override // java.util.List
    /* renamed from: b */
    public HZ get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.d.containsAll(collection);
    }

    @Override // o.HJ
    public int e() {
        return this.d.size();
    }

    @Override // o.HJ
    public boolean e(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.d.contains(hz);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<HZ> iterator() {
        return this.d.iterator();
    }

    @Override // o.HJ, java.util.List
    public ListIterator<HZ> listIterator() {
        return this.d.listIterator();
    }

    @Override // o.HJ, java.util.List
    public ListIterator<HZ> listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // o.HJ, java.util.List
    public List<HZ> subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933Ie(List<HZ> list) {
        super(null);
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof HK) {
            return C8632dsu.c(this.d, ((HK) obj).c());
        }
        if (obj instanceof C0930Ib) {
            return C8632dsu.c(this.d, ((C0930Ib) obj).values());
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.d.hashCode();
    }
}
