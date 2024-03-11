package o;

import o.AbstractC8997hK;

/* renamed from: o.apz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2966apz {
    private final AbstractC8997hK<C3046arZ> d;

    public C2966apz() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2966apz) && C8632dsu.c(this.d, ((C2966apz) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.d;
        return "IrmaCapabilitiesBoxShotEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C2966apz(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C2966apz(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
