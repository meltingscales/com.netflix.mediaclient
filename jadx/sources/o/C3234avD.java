package o;

import o.AbstractC8997hK;

/* renamed from: o.avD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3234avD {
    private final AbstractC8997hK<Integer> a;
    private final AbstractC8997hK<C3263avg> b;

    public C3234avD() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3263avg> b() {
        return this.b;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3234avD) {
            C3234avD c3234avD = (C3234avD) obj;
            return C8632dsu.c(this.b, c3234avD.b) && C8632dsu.c(this.a, c3234avD.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3263avg> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.a;
        return "UXConfigHomePageCapabilitiesInput(base=" + abstractC8997hK + ", viewportWidthInBoxShots=" + abstractC8997hK2 + ")";
    }

    public C3234avD(AbstractC8997hK<C3263avg> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.b = abstractC8997hK;
        this.a = abstractC8997hK2;
    }

    public /* synthetic */ C3234avD(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
