package o;

import o.AbstractC8997hK;

/* renamed from: o.avT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3250avT {
    private final AbstractC8997hK<Boolean> b;
    private final AbstractC8997hK<C3262avf> d;

    public C3250avT() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Boolean> a() {
        return this.b;
    }

    public final AbstractC8997hK<C3262avf> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3250avT) {
            C3250avT c3250avT = (C3250avT) obj;
            return C8632dsu.c(this.d, c3250avT.d) && C8632dsu.c(this.b, c3250avT.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.d;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.b;
        return "UXConfigIrmaContinueWatchingEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", allowEmpty=" + abstractC8997hK2 + ")";
    }

    public C3250avT(AbstractC8997hK<C3262avf> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.d = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3250avT(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
