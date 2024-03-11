package o;

import o.AbstractC8997hK;

/* renamed from: o.arT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3040arT {
    private final AbstractC8997hK<C3046arZ> a;

    public C3040arT() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3040arT) && C8632dsu.c(this.a, ((C3040arT) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.a;
        return "PinotCapabilitiesCharacterCircleEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3040arT(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3040arT(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
