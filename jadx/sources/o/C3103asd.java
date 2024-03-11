package o;

import o.AbstractC8997hK;

/* renamed from: o.asd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3103asd {
    private final AbstractC8997hK<C3039arS> b;
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<Integer> d;

    public C3103asd() {
        this(null, null, null, 7, null);
    }

    public final AbstractC8997hK<Integer> b() {
        return this.d;
    }

    public final AbstractC8997hK<Integer> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3039arS> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3103asd) {
            C3103asd c3103asd = (C3103asd) obj;
            return C8632dsu.c(this.b, c3103asd.b) && C8632dsu.c(this.d, c3103asd.d) && C8632dsu.c(this.c, c3103asd.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3039arS> abstractC8997hK = this.b;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.d;
        AbstractC8997hK<Integer> abstractC8997hK3 = this.c;
        return "PinotCapabilitiesPageBaseInput(capabilitiesBySection=" + abstractC8997hK + ", maxTotalSections=" + abstractC8997hK2 + ", viewportWidthInBoxshots=" + abstractC8997hK3 + ")";
    }

    public C3103asd(AbstractC8997hK<C3039arS> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2, AbstractC8997hK<Integer> abstractC8997hK3) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        this.b = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.c = abstractC8997hK3;
    }

    public /* synthetic */ C3103asd(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3);
    }
}
