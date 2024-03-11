package o;

import o.AbstractC8997hK;

/* renamed from: o.ase  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3104ase {
    private final AbstractC8997hK<C3112asm> b;

    public C3104ase() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3112asm> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3104ase) && C8632dsu.c(this.b, ((C3104ase) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3112asm> abstractC8997hK = this.b;
        return "PinotCapabilitiesReminderHoverSoonSectionTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3104ase(AbstractC8997hK<C3112asm> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.b = abstractC8997hK;
    }

    public /* synthetic */ C3104ase(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
