package o;

import o.AbstractC8997hK;

/* renamed from: o.arK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3031arK {
    private final AbstractC8997hK<C3046arZ> b;

    public C3031arK() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3031arK) && C8632dsu.c(this.b, ((C3031arK) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.b;
        return "PinotCapabilitiesBannerWithTrailerEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3031arK(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.b = abstractC8997hK;
    }

    public /* synthetic */ C3031arK(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
