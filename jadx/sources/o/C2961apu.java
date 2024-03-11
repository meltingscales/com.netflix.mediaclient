package o;

import o.AbstractC8997hK;

/* renamed from: o.apu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2961apu {
    private final AbstractC8997hK<C3046arZ> b;

    public C2961apu() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2961apu) && C8632dsu.c(this.b, ((C2961apu) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.b;
        return "IrmaCapabilitiesAppIconEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C2961apu(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.b = abstractC8997hK;
    }

    public /* synthetic */ C2961apu(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
