package o;

import o.AbstractC8997hK;

/* renamed from: o.awz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3335awz {
    private final AbstractC8997hK<C3267avk> a;
    private final AbstractC8997hK<Integer> b;

    public C3335awz() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.b;
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3335awz) {
            C3335awz c3335awz = (C3335awz) obj;
            return C8632dsu.c(this.a, c3335awz.a) && C8632dsu.c(this.b, c3335awz.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.b;
        return "UXConfigPinotComingSoonSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3335awz(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3335awz(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
