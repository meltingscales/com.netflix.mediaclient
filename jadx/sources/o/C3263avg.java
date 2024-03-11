package o;

import o.AbstractC8997hK;

/* renamed from: o.avg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3263avg {
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<C3273avq> d;

    public C3263avg() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> d() {
        return this.c;
    }

    public final AbstractC8997hK<C3273avq> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3263avg) {
            C3263avg c3263avg = (C3263avg) obj;
            return C8632dsu.c(this.c, c3263avg.c) && C8632dsu.c(this.d, c3263avg.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<Integer> abstractC8997hK = this.c;
        AbstractC8997hK<C3273avq> abstractC8997hK2 = this.d;
        return "UXConfigBasePageCapabilitiesInput(maxTotalSections=" + abstractC8997hK + ", capabilitiesBySection=" + abstractC8997hK2 + ")";
    }

    public C3263avg(AbstractC8997hK<Integer> abstractC8997hK, AbstractC8997hK<C3273avq> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3263avg(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
