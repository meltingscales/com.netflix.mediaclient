package o;

import o.AbstractC8997hK;

/* renamed from: o.asl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3111asl {
    private final AbstractC8997hK<C3046arZ> d;

    public C3111asl() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3111asl) && C8632dsu.c(this.d, ((C3111asl) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.d;
        return "PinotCapabilitiesStandardBillboardEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3111asl(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3111asl(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
