package o;

import o.AbstractC8997hK;

/* renamed from: o.asc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3102asc {
    private final AbstractC8997hK<C3109asj> c;

    public C3102asc() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3109asj> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3102asc) && C8632dsu.c(this.c, ((C3102asc) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3109asj> abstractC8997hK = this.c;
        return "PinotCapabilitiesGallerySectionInput(base=" + abstractC8997hK + ")";
    }

    public C3102asc(AbstractC8997hK<C3109asj> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3102asc(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
