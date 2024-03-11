package o;

import o.AbstractC8997hK;

/* renamed from: o.aws  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3328aws {
    private final AbstractC8997hK<C3262avf> b;

    public C3328aws() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3328aws) && C8632dsu.c(this.b, ((C3328aws) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.b;
        return "UXConfigPinotBoxShotWithRankEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3328aws(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.b = abstractC8997hK;
    }

    public /* synthetic */ C3328aws(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
