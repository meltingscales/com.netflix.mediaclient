package o;

import o.AbstractC8997hK;

/* renamed from: o.avz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3282avz {
    private final AbstractC8997hK<C3262avf> d;

    public C3282avz() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3282avz) && C8632dsu.c(this.d, ((C3282avz) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.d;
        return "UXConfigCreatorHomeEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3282avz(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3282avz(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
