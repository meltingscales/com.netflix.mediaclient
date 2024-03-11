package o;

import o.AbstractC8997hK;

/* renamed from: o.avy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3281avy {
    private final AbstractC8997hK<C3267avk> c;

    public C3281avy() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3281avy) && C8632dsu.c(this.c, ((C3281avy) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.c;
        return "UXConfigCreatorHomeSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3281avy(AbstractC8997hK<C3267avk> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3281avy(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
