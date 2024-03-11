package o;

import o.AbstractC8997hK;

/* renamed from: o.arX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3044arX {
    private final AbstractC8997hK<C3046arZ> c;

    public C3044arX() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3046arZ> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3044arX) && C8632dsu.c(this.c, ((C3044arX) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3046arZ> abstractC8997hK = this.c;
        return "PinotCapabilitiesContinueWatchingEntityTreatmentInput(base=" + abstractC8997hK + ")";
    }

    public C3044arX(AbstractC8997hK<C3046arZ> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.c = abstractC8997hK;
    }

    public /* synthetic */ C3044arX(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
