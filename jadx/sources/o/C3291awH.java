package o;

import o.AbstractC8997hK;

/* renamed from: o.awH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3291awH {
    private final AbstractC8997hK<Integer> b;
    private final AbstractC8997hK<C3267avk> e;

    public C3291awH() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> c() {
        return this.e;
    }

    public final AbstractC8997hK<Integer> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3291awH) {
            C3291awH c3291awH = (C3291awH) obj;
            return C8632dsu.c(this.e, c3291awH.e) && C8632dsu.c(this.b, c3291awH.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.b;
        return "UXConfigPinotMyListSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3291awH(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3291awH(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
