package o;

import o.AbstractC8997hK;

/* renamed from: o.avZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3256avZ {
    private final AbstractC8997hK<Integer> a;
    private final AbstractC8997hK<C3267avk> b;

    public C3256avZ() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.a;
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3256avZ) {
            C3256avZ c3256avZ = (C3256avZ) obj;
            return C8632dsu.c(this.b, c3256avZ.b) && C8632dsu.c(this.a, c3256avZ.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.a;
        return "UXConfigIrmaKidsFavoritesSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3256avZ(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.a = abstractC8997hK2;
    }

    public /* synthetic */ C3256avZ(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
