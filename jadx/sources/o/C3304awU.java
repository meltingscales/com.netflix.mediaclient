package o;

import o.AbstractC8997hK;

/* renamed from: o.awU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3304awU {
    private final AbstractC8997hK<C3262avf> b;

    public C3304awU() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3304awU) && C8632dsu.c(this.b, ((C3304awU) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.b;
        return "UXConfigPinotTitleSuggestionEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3304awU(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.b = abstractC8997hK;
    }

    public /* synthetic */ C3304awU(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
