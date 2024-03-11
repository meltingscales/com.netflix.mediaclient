package o;

import o.AbstractC8997hK;

/* renamed from: o.apB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2916apB {
    private final AbstractC8997hK<C3112asm> a;

    public C2916apB() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3112asm> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2916apB) && C8632dsu.c(this.a, ((C2916apB) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3112asm> abstractC8997hK = this.a;
        return "IrmaCapabilitiesCreatorHomeSectionTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C2916apB(AbstractC8997hK<C3112asm> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C2916apB(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
