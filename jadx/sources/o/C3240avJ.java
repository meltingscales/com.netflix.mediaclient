package o;

import o.AbstractC8997hK;

/* renamed from: o.avJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3240avJ {
    private final AbstractC8997hK<C3262avf> d;

    public C3240avJ() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3240avJ) && C8632dsu.c(this.d, ((C3240avJ) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.d;
        return "UXConfigIrmaBannerWithTrailerEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3240avJ(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3240avJ(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
