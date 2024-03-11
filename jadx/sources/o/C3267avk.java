package o;

import o.AbstractC8997hK;

/* renamed from: o.avk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3267avk {
    private final AbstractC8997hK<C3271avo> d;

    public C3267avk() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3271avo> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3267avk) && C8632dsu.c(this.d, ((C3267avk) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3271avo> abstractC8997hK = this.d;
        return "UXConfigBaseSectionTreatmentCapabilitiesInput(capabilitiesByEntityTreatment=" + abstractC8997hK + ")";
    }

    public C3267avk(AbstractC8997hK<C3271avo> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3267avk(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
