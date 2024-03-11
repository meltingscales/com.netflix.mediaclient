package o;

import o.AbstractC8997hK;

/* renamed from: o.awD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3287awD {
    private final AbstractC8997hK<C3262avf> a;

    public C3287awD() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3287awD) && C8632dsu.c(this.a, ((C3287awD) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.a;
        return "UXConfigPinotDoubleWideBoxshotEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3287awD(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3287awD(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
