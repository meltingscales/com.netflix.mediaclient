package o;

import o.AbstractC8997hK;

/* renamed from: o.asX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3097asX {
    private final AbstractC8997hK<C3112asm> c;

    public C3097asX() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3112asm> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3097asX) && C8632dsu.c(this.c, ((C3097asX) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3112asm> abstractC8997hK = this.c;
        return "PinotMultiHeadlineSectionTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3097asX(AbstractC8997hK<C3112asm> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3097asX(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
