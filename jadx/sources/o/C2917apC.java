package o;

import o.AbstractC8997hK;

/* renamed from: o.apC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2917apC {
    private final AbstractC8997hK<C3046arZ> c;

    public C2917apC() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2917apC) && C8632dsu.c(this.c, ((C2917apC) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.c;
        return "IrmaCapabilitiesHorizontalArtworkWithPlaybackEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C2917apC(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C2917apC(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
