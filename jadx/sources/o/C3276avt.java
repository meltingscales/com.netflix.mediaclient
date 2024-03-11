package o;

import o.AbstractC8997hK;

/* renamed from: o.avt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3276avt {
    private final AbstractC8997hK<C3267avk> b;
    private final AbstractC8997hK<Integer> e;

    public C3276avt() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> a() {
        return this.e;
    }

    public final AbstractC8997hK<C3267avk> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3276avt) {
            C3276avt c3276avt = (C3276avt) obj;
            return C8632dsu.c(this.b, c3276avt.b) && C8632dsu.c(this.e, c3276avt.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.e;
        return "UXConfigCharacterSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3276avt(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.e = abstractC8997hK2;
    }

    public /* synthetic */ C3276avt(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
