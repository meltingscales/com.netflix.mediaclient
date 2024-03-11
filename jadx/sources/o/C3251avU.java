package o;

import o.AbstractC8997hK;

/* renamed from: o.avU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3251avU {
    private final AbstractC8997hK<C3267avk> b;
    private final AbstractC8997hK<Integer> d;

    public C3251avU() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> a() {
        return this.d;
    }

    public final AbstractC8997hK<C3267avk> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3251avU) {
            C3251avU c3251avU = (C3251avU) obj;
            return C8632dsu.c(this.b, c3251avU.b) && C8632dsu.c(this.d, c3251avU.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.d;
        return "UXConfigIrmaComingSoonSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3251avU(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3251avU(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
