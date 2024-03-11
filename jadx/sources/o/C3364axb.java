package o;

import o.AbstractC8997hK;

/* renamed from: o.axb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3364axb {
    private final AbstractC8997hK<Integer> b;
    private final AbstractC8997hK<C3267avk> e;

    public C3364axb() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> a() {
        return this.e;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3364axb) {
            C3364axb c3364axb = (C3364axb) obj;
            return C8632dsu.c(this.e, c3364axb.e) && C8632dsu.c(this.b, c3364axb.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.b;
        return "UXConfigStandardSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3364axb(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3364axb(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
