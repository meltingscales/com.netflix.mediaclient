package o;

import o.AbstractC8997hK;

/* renamed from: o.awV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3305awV {
    private final AbstractC8997hK<Boolean> a;
    private final C3279avw b;
    private final int c;
    private final AbstractC8997hK<String> d;
    private final AbstractC8997hK<C3202auW> e;

    public final C3279avw a() {
        return this.b;
    }

    public final AbstractC8997hK<String> b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final AbstractC8997hK<C3202auW> d() {
        return this.e;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3305awV) {
            C3305awV c3305awV = (C3305awV) obj;
            return C8632dsu.c(this.a, c3305awV.a) && C8632dsu.c(this.d, c3305awV.d) && this.c == c3305awV.c && C8632dsu.c(this.e, c3305awV.e) && C8632dsu.c(this.b, c3305awV.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<Boolean> abstractC8997hK = this.a;
        AbstractC8997hK<String> abstractC8997hK2 = this.d;
        int i = this.c;
        AbstractC8997hK<C3202auW> abstractC8997hK3 = this.e;
        C3279avw c3279avw = this.b;
        return "UXConfigSourceInput(isSynthetic=" + abstractC8997hK + ", comment=" + abstractC8997hK2 + ", ttlSeconds=" + i + ", abAllocations=" + abstractC8997hK3 + ", clientCapabilities=" + c3279avw + ")";
    }

    public C3305awV(AbstractC8997hK<Boolean> abstractC8997hK, AbstractC8997hK<String> abstractC8997hK2, int i, AbstractC8997hK<C3202auW> abstractC8997hK3, C3279avw c3279avw) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) c3279avw, "");
        this.a = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.c = i;
        this.e = abstractC8997hK3;
        this.b = c3279avw;
    }

    public /* synthetic */ C3305awV(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, AbstractC8997hK abstractC8997hK3, C3279avw c3279avw, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i2 & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, i, (i2 & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, c3279avw);
    }
}
