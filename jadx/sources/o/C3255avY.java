package o;

import o.AbstractC8997hK;

/* renamed from: o.avY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3255avY {
    private final AbstractC8997hK<Integer> b;
    private final AbstractC8997hK<C3267avk> c;

    public C3255avY() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.b;
    }

    public final AbstractC8997hK<C3267avk> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3255avY) {
            C3255avY c3255avY = (C3255avY) obj;
            return C8632dsu.c(this.c, c3255avY.c) && C8632dsu.c(this.b, c3255avY.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.c;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.b;
        return "UXConfigIrmaPopularGamesSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3255avY(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3255avY(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
