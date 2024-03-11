package o;

import o.AbstractC8997hK;

/* renamed from: o.avx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3280avx {
    private final AbstractC8997hK<C3262avf> c;

    public C3280avx() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3280avx) && C8632dsu.c(this.c, ((C3280avx) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.c;
        return "UXConfigCharacterCircleEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3280avx(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3280avx(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
