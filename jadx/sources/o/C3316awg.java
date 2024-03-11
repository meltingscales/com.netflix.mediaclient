package o;

import o.AbstractC8997hK;

/* renamed from: o.awg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3316awg {
    private final AbstractC8997hK<C3267avk> a;
    private final AbstractC8997hK<Integer> c;

    public C3316awg() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> a() {
        return this.a;
    }

    public final AbstractC8997hK<Integer> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3316awg) {
            C3316awg c3316awg = (C3316awg) obj;
            return C8632dsu.c(this.a, c3316awg.a) && C8632dsu.c(this.c, c3316awg.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        return "UXConfigIrmaTallPanelSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3316awg(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3316awg(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
