package o;

import o.AbstractC8997hK;

/* renamed from: o.avr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3274avr {
    private final AbstractC8997hK<C3234avD> a;
    private final AbstractC8997hK<C3308awY> b;
    private final AbstractC8997hK<C3233avC> c;
    private final AbstractC8997hK<C3275avs> d;
    private final AbstractC8997hK<C3309awZ> e;

    public C3274avr() {
        this(null, null, null, null, null, 31, null);
    }

    public final AbstractC8997hK<C3233avC> a() {
        return this.c;
    }

    public final AbstractC8997hK<C3234avD> b() {
        return this.a;
    }

    public final AbstractC8997hK<C3275avs> c() {
        return this.d;
    }

    public final AbstractC8997hK<C3309awZ> d() {
        return this.e;
    }

    public final AbstractC8997hK<C3308awY> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3274avr) {
            C3274avr c3274avr = (C3274avr) obj;
            return C8632dsu.c(this.b, c3274avr.b) && C8632dsu.c(this.e, c3274avr.e) && C8632dsu.c(this.c, c3274avr.c) && C8632dsu.c(this.a, c3274avr.a) && C8632dsu.c(this.d, c3274avr.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3308awY> abstractC8997hK = this.b;
        AbstractC8997hK<C3309awZ> abstractC8997hK2 = this.e;
        AbstractC8997hK<C3233avC> abstractC8997hK3 = this.c;
        AbstractC8997hK<C3234avD> abstractC8997hK4 = this.a;
        AbstractC8997hK<C3275avs> abstractC8997hK5 = this.d;
        return "UXConfigCapabilitiesByPageInput(PreQuerySearch=" + abstractC8997hK + ", QuerySearch=" + abstractC8997hK2 + ", EntitySearch=" + abstractC8997hK3 + ", Home=" + abstractC8997hK4 + ", Browse=" + abstractC8997hK5 + ")";
    }

    public C3274avr(AbstractC8997hK<C3308awY> abstractC8997hK, AbstractC8997hK<C3309awZ> abstractC8997hK2, AbstractC8997hK<C3233avC> abstractC8997hK3, AbstractC8997hK<C3234avD> abstractC8997hK4, AbstractC8997hK<C3275avs> abstractC8997hK5) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        this.b = abstractC8997hK;
        this.e = abstractC8997hK2;
        this.c = abstractC8997hK3;
        this.a = abstractC8997hK4;
        this.d = abstractC8997hK5;
    }

    public /* synthetic */ C3274avr(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5);
    }
}
