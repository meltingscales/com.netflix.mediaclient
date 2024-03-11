package o;

import o.AbstractC8997hK;

/* renamed from: o.awA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3284awA {
    private final AbstractC8997hK<C3262avf> a;
    private final AbstractC8997hK<Boolean> d;

    public C3284awA() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<C3262avf> b() {
        return this.a;
    }

    public final AbstractC8997hK<Boolean> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3284awA) {
            C3284awA c3284awA = (C3284awA) obj;
            return C8632dsu.c(this.a, c3284awA.a) && C8632dsu.c(this.d, c3284awA.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.a;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.d;
        return "UXConfigPinotContinueWatchingEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", allowEmpty=" + abstractC8997hK2 + ")";
    }

    public C3284awA(AbstractC8997hK<C3262avf> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3284awA(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
