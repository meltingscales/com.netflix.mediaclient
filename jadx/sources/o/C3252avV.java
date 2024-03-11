package o;

import o.AbstractC8997hK;

/* renamed from: o.avV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3252avV {
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<C3267avk> e;

    public C3252avV() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> a() {
        return this.e;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3252avV) {
            C3252avV c3252avV = (C3252avV) obj;
            return C8632dsu.c(this.e, c3252avV.e) && C8632dsu.c(this.c, c3252avV.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        return "UXConfigIrmaCharacterSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3252avV(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3252avV(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
