package o;

import o.AbstractC8997hK;

/* renamed from: o.axc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3365axc {
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<C3267avk> d;

    public C3365axc() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3365axc) {
            C3365axc c3365axc = (C3365axc) obj;
            return C8632dsu.c(this.d, c3365axc.d) && C8632dsu.c(this.c, c3365axc.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.d;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        return "UXConfigSuggestionsSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3365axc(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.d = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3365axc(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
