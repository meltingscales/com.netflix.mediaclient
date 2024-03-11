package o;

import o.AbstractC8997hK;

/* renamed from: o.awT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3303awT {
    private final AbstractC8997hK<C3267avk> a;

    public C3303awT() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3267avk> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3303awT) && C8632dsu.c(this.a, ((C3303awT) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        return "UXConfigPinotTrailersSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3303awT(AbstractC8997hK<C3267avk> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3303awT(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
