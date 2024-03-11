package o;

import o.AbstractC8997hK;

/* renamed from: o.avq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3273avq {
    private final AbstractC8997hK<C3323awn> a;
    private final AbstractC8997hK<C3237avG> b;
    private final AbstractC8997hK<C3307awX> c;
    private final AbstractC8997hK<C3278avv> d;

    public C3273avq() {
        this(null, null, null, null, 15, null);
    }

    public final AbstractC8997hK<C3307awX> a() {
        return this.c;
    }

    public final AbstractC8997hK<C3323awn> b() {
        return this.a;
    }

    public final AbstractC8997hK<C3278avv> c() {
        return this.d;
    }

    public final AbstractC8997hK<C3237avG> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3273avq) {
            C3273avq c3273avq = (C3273avq) obj;
            return C8632dsu.c(this.d, c3273avq.d) && C8632dsu.c(this.b, c3273avq.b) && C8632dsu.c(this.a, c3273avq.a) && C8632dsu.c(this.c, c3273avq.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3278avv> abstractC8997hK = this.d;
        AbstractC8997hK<C3237avG> abstractC8997hK2 = this.b;
        AbstractC8997hK<C3323awn> abstractC8997hK3 = this.a;
        AbstractC8997hK<C3307awX> abstractC8997hK4 = this.c;
        return "UXConfigCapabilitiesBySectionInput(Carousel=" + abstractC8997hK + ", Gallery=" + abstractC8997hK2 + ", List=" + abstractC8997hK3 + ", SingleItem=" + abstractC8997hK4 + ")";
    }

    public C3273avq(AbstractC8997hK<C3278avv> abstractC8997hK, AbstractC8997hK<C3237avG> abstractC8997hK2, AbstractC8997hK<C3323awn> abstractC8997hK3, AbstractC8997hK<C3307awX> abstractC8997hK4) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        this.d = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.a = abstractC8997hK3;
        this.c = abstractC8997hK4;
    }

    public /* synthetic */ C3273avq(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4);
    }
}
