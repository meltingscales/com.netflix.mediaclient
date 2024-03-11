package o;

import java.util.List;

/* loaded from: classes5.dex */
public final class E {
    private final List<C> a;
    private final List<F> b;
    private final List<A> c;

    public E() {
        this(null, null, null, 7, null);
    }

    public final List<A> a() {
        return this.c;
    }

    public final List<F> b() {
        return this.b;
    }

    public final List<C> c() {
        return this.a;
    }

    public final List<A> d() {
        return this.c;
    }

    public final List<C> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            E e = (E) obj;
            return C8632dsu.c(this.a, e.a) && C8632dsu.c(this.c, e.c) && C8632dsu.c(this.b, e.b);
        }
        return false;
    }

    public final List<F> g() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        List<C> list = this.a;
        List<A> list2 = this.c;
        List<F> list3 = this.b;
        return "ShowkaseElementsMetadata(componentList=" + list + ", colorList=" + list2 + ", typographyList=" + list3 + ")";
    }

    public E(List<C> list, List<A> list2, List<F> list3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) list3, "");
        this.a = list;
        this.c = list2;
        this.b = list3;
    }

    public /* synthetic */ E(List list, List list2, List list3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C8569dql.i() : list, (i & 2) != 0 ? C8569dql.i() : list2, (i & 4) != 0 ? C8569dql.i() : list3);
    }
}
