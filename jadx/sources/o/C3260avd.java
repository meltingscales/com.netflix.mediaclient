package o;

import o.AbstractC8997hK;

/* renamed from: o.avd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3260avd {
    private final AbstractC8997hK<C3262avf> d;

    public C3260avd() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3260avd) && C8632dsu.c(this.d, ((C3260avd) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.d;
        return "UXConfigAppIconBillboardEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3260avd(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3260avd(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
