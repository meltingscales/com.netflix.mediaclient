package o;

import o.AbstractC8997hK;

/* renamed from: o.ast  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3119ast {
    private final AbstractC8997hK<C3112asm> e;

    public C3119ast() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3112asm> a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3119ast) && C8632dsu.c(this.e, ((C3119ast) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3112asm> abstractC8997hK = this.e;
        return "PinotCapabilitiesTrailersSectionTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3119ast(AbstractC8997hK<C3112asm> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3119ast(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
