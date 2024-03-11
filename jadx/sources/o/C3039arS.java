package o;

import o.AbstractC8997hK;

/* renamed from: o.arS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3039arS {
    private final AbstractC8997hK<C3106asg> a;
    private final AbstractC8997hK<C3108asi> c;
    private final AbstractC8997hK<C3102asc> d;
    private final AbstractC8997hK<C3043arW> e;

    public C3039arS() {
        this(null, null, null, null, 15, null);
    }

    public final AbstractC8997hK<C3102asc> b() {
        return this.d;
    }

    public final AbstractC8997hK<C3106asg> c() {
        return this.a;
    }

    public final AbstractC8997hK<C3108asi> d() {
        return this.c;
    }

    public final AbstractC8997hK<C3043arW> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3039arS) {
            C3039arS c3039arS = (C3039arS) obj;
            return C8632dsu.c(this.e, c3039arS.e) && C8632dsu.c(this.d, c3039arS.d) && C8632dsu.c(this.a, c3039arS.a) && C8632dsu.c(this.c, c3039arS.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3043arW> abstractC8997hK = this.e;
        AbstractC8997hK<C3102asc> abstractC8997hK2 = this.d;
        AbstractC8997hK<C3106asg> abstractC8997hK3 = this.a;
        AbstractC8997hK<C3108asi> abstractC8997hK4 = this.c;
        return "PinotCapabilitiesBySectionInput(pinotCarousel=" + abstractC8997hK + ", pinotGallery=" + abstractC8997hK2 + ", pinotList=" + abstractC8997hK3 + ", pinotSingleItem=" + abstractC8997hK4 + ")";
    }

    public C3039arS(AbstractC8997hK<C3043arW> abstractC8997hK, AbstractC8997hK<C3102asc> abstractC8997hK2, AbstractC8997hK<C3106asg> abstractC8997hK3, AbstractC8997hK<C3108asi> abstractC8997hK4) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        this.e = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.a = abstractC8997hK3;
        this.c = abstractC8997hK4;
    }

    public /* synthetic */ C3039arS(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4);
    }
}
