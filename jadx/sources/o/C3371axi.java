package o;

import o.AbstractC8997hK;

/* renamed from: o.axi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3371axi {
    private final AbstractC8997hK<C3267avk> a;

    public C3371axi() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3371axi) && C8632dsu.c(this.a, ((C3371axi) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        return "UXConfigTrailersSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3371axi(AbstractC8997hK<C3267avk> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3371axi(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
