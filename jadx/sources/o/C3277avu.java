package o;

import o.AbstractC8997hK;

/* renamed from: o.avu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3277avu {
    private final AbstractC8997hK<Integer> a;
    private final AbstractC8997hK<C3267avk> c;

    public C3277avu() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3267avk> a() {
        return this.c;
    }

    public final AbstractC8997hK<Integer> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3277avu) {
            C3277avu c3277avu = (C3277avu) obj;
            return C8632dsu.c(this.c, c3277avu.c) && C8632dsu.c(this.a, c3277avu.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3267avk> abstractC8997hK = this.c;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.a;
        return "UXConfigComingSoonSectionTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", maxTotalEntities=" + abstractC8997hK2 + ")";
    }

    public C3277avu(AbstractC8997hK<C3267avk> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = abstractC8997hK;
        this.a = abstractC8997hK2;
    }

    public /* synthetic */ C3277avu(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
