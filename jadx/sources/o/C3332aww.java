package o;

import o.AbstractC8997hK;

/* renamed from: o.aww  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3332aww {
    private final AbstractC8997hK<C3267avk> a;
    private final AbstractC8997hK<Integer> e;

    public C3332aww() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.e;
    }

    public final AbstractC8997hK<C3267avk> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3332aww) {
            C3332aww c3332aww = (C3332aww) obj;
            return C8632dsu.c(this.a, c3332aww.a) && C8632dsu.c(this.e, c3332aww.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.a;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.e;
        return "UXConfigPinotCharacterSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3332aww(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.e = abstractC8997hK2;
    }

    public /* synthetic */ C3332aww(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
