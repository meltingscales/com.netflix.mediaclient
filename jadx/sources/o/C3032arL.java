package o;

import o.AbstractC8997hK;

/* renamed from: o.arL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3032arL {
    private final AbstractC8997hK<C3112asm> a;

    public C3032arL() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3112asm> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3032arL) && C8632dsu.c(this.a, ((C3032arL) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3112asm> abstractC8997hK = this.a;
        return "PinotCapabilitiesBannerSectionTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3032arL(AbstractC8997hK<C3112asm> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3032arL(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
