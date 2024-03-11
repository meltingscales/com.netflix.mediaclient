package o;

import o.AbstractC8997hK;

/* renamed from: o.awL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3295awL {
    private final AbstractC8997hK<Integer> d;
    private final AbstractC8997hK<C3267avk> e;

    public C3295awL() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> a() {
        return this.d;
    }

    public final AbstractC8997hK<C3267avk> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3295awL) {
            C3295awL c3295awL = (C3295awL) obj;
            return C8632dsu.c(this.e, c3295awL.e) && C8632dsu.c(this.d, c3295awL.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.d;
        return "UXConfigPinotStandardSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3295awL(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3295awL(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
