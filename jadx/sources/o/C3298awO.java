package o;

import o.AbstractC8997hK;

/* renamed from: o.awO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3298awO {
    private final AbstractC8997hK<C3267avk> b;
    private final AbstractC8997hK<Integer> d;

    public C3298awO() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> a() {
        return this.b;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3298awO) {
            C3298awO c3298awO = (C3298awO) obj;
            return C8632dsu.c(this.b, c3298awO.b) && C8632dsu.c(this.d, c3298awO.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.d;
        return "UXConfigPinotSuggestionsSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3298awO(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3298awO(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
