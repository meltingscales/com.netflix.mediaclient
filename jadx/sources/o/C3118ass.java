package o;

import o.AbstractC8997hK;

/* renamed from: o.ass  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3118ass {
    private final AbstractC8997hK<C3046arZ> c;

    public C3118ass() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3118ass) && C8632dsu.c(this.c, ((C3118ass) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.c;
        return "PinotCapabilitiesTripleWideBoxshotEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3118ass(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3118ass(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
