package o;

import o.AbstractC8997hK;

/* renamed from: o.ave  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3261ave {
    private final AbstractC8997hK<C3272avp> d;

    public C3261ave() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3272avp> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3261ave) && C8632dsu.c(this.d, ((C3261ave) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3272avp> abstractC8997hK = this.d;
        return "UXConfigBaseSectionCapabilitiesInput(capabilitiesBySectionTreatment=" + abstractC8997hK + ")";
    }

    public C3261ave(AbstractC8997hK<C3272avp> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3261ave(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
