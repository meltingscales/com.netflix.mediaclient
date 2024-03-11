package o;

import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.avw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3279avw {
    private final AbstractC8997hK<C3236avF> a;
    private final AbstractC8997hK<List<C3258avb>> b;
    private final AbstractC8997hK<C3274avr> c;
    private final AbstractC8997hK<C3293awJ> d;
    private final AbstractC8997hK<C3324awo> e;

    public C3279avw() {
        this(null, null, null, null, null, 31, null);
    }

    public final AbstractC8997hK<C3324awo> a() {
        return this.e;
    }

    public final AbstractC8997hK<List<C3258avb>> b() {
        return this.b;
    }

    public final AbstractC8997hK<C3236avF> c() {
        return this.a;
    }

    public final AbstractC8997hK<C3293awJ> d() {
        return this.d;
    }

    public final AbstractC8997hK<C3274avr> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3279avw) {
            C3279avw c3279avw = (C3279avw) obj;
            return C8632dsu.c(this.a, c3279avw.a) && C8632dsu.c(this.b, c3279avw.b) && C8632dsu.c(this.c, c3279avw.c) && C8632dsu.c(this.e, c3279avw.e) && C8632dsu.c(this.d, c3279avw.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3236avF> abstractC8997hK = this.a;
        AbstractC8997hK<List<C3258avb>> abstractC8997hK2 = this.b;
        AbstractC8997hK<C3274avr> abstractC8997hK3 = this.c;
        AbstractC8997hK<C3324awo> abstractC8997hK4 = this.e;
        AbstractC8997hK<C3293awJ> abstractC8997hK5 = this.d;
        return "UXConfigClientCapabilitiesInput(generalProperties=" + abstractC8997hK + ", abTestCapabilities=" + abstractC8997hK2 + ", capabilitiesByPage=" + abstractC8997hK3 + ", lolomoCapabilities=" + abstractC8997hK4 + ", pinotSearchClientCapabilities=" + abstractC8997hK5 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3279avw(AbstractC8997hK<C3236avF> abstractC8997hK, AbstractC8997hK<? extends List<C3258avb>> abstractC8997hK2, AbstractC8997hK<C3274avr> abstractC8997hK3, AbstractC8997hK<C3324awo> abstractC8997hK4, AbstractC8997hK<C3293awJ> abstractC8997hK5) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        this.a = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.c = abstractC8997hK3;
        this.e = abstractC8997hK4;
        this.d = abstractC8997hK5;
    }

    public /* synthetic */ C3279avw(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5);
    }
}
