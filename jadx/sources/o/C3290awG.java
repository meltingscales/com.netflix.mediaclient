package o;

import o.AbstractC8997hK;

/* renamed from: o.awG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3290awG {
    private final AbstractC8997hK<C3267avk> b;
    private final AbstractC8997hK<Integer> c;

    public C3290awG() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> c() {
        return this.b;
    }

    public final AbstractC8997hK<Integer> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3290awG) {
            C3290awG c3290awG = (C3290awG) obj;
            return C8632dsu.c(this.b, c3290awG.b) && C8632dsu.c(this.c, c3290awG.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        return "UXConfigPinotPopularGamesSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3290awG(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3290awG(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
