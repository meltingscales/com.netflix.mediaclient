package o;

import o.AbstractC8997hK;

/* renamed from: o.avW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3253avW {
    private final AbstractC8997hK<C3267avk> e;

    public C3253avW() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3267avk> b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3253avW) && C8632dsu.c(this.e, ((C3253avW) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        return "UXConfigIrmaCreatorHomeSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3253avW(AbstractC8997hK<C3267avk> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3253avW(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
