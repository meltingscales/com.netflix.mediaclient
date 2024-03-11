package o;

import o.AbstractC8997hK;

/* renamed from: o.awI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3292awI {
    private final AbstractC8997hK<C3267avk> a;
    private final AbstractC8997hK<Integer> b;

    public C3292awI() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.a;
    }

    public final AbstractC8997hK<Integer> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3292awI) {
            C3292awI c3292awI = (C3292awI) obj;
            return C8632dsu.c(this.a, c3292awI.a) && C8632dsu.c(this.b, c3292awI.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.b;
        return "UXConfigPinotKidsFavoritesSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3292awI(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3292awI(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
