package o;

import o.AbstractC8997hK;

/* renamed from: o.axh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3370axh {
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<C3267avk> e;

    public C3370axh() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.c;
    }

    public final AbstractC8997hK<C3267avk> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3370axh) {
            C3370axh c3370axh = (C3370axh) obj;
            return C8632dsu.c(this.e, c3370axh.e) && C8632dsu.c(this.c, c3370axh.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        return "UXConfigTallPanelSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3370axh(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3370axh(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
