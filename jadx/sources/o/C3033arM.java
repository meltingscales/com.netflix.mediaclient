package o;

import o.AbstractC8997hK;

/* renamed from: o.arM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3033arM {
    private final AbstractC8997hK<C3046arZ> e;

    public C3033arM() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3033arM) && C8632dsu.c(this.e, ((C3033arM) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.e;
        return "PinotCapabilitiesBoxShotEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3033arM(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3033arM(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
