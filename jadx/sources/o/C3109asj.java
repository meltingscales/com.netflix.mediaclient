package o;

import o.AbstractC8997hK;

/* renamed from: o.asj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3109asj {
    private final AbstractC8997hK<C3036arP> a;

    public C3109asj() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3036arP> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3109asj) && C8632dsu.c(this.a, ((C3109asj) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3036arP> abstractC8997hK = this.a;
        return "PinotCapabilitiesSectionBaseInput(capabilitiesBySectionTreatment=" + abstractC8997hK + ")";
    }

    public C3109asj(AbstractC8997hK<C3036arP> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3109asj(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
