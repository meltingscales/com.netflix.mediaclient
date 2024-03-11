package o;

import o.AbstractC8997hK;

/* renamed from: o.avB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3232avB {
    private final AbstractC8997hK<C3262avf> a;
    private final AbstractC8997hK<Boolean> c;

    public C3232avB() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Boolean> a() {
        return this.c;
    }

    public final AbstractC8997hK<C3262avf> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3232avB) {
            C3232avB c3232avB = (C3232avB) obj;
            return C8632dsu.c(this.a, c3232avB.a) && C8632dsu.c(this.c, c3232avB.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.a;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.c;
        return "UXConfigContinueWatchingEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ", allowEmpty=" + abstractC8997hK2 + ")";
    }

    public C3232avB(AbstractC8997hK<C3262avf> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3232avB(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
