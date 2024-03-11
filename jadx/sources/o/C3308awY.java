package o;

import o.AbstractC8997hK;

/* renamed from: o.awY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3308awY {
    private final AbstractC8997hK<C3263avg> e;

    public C3308awY() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3263avg> b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3308awY) && C8632dsu.c(this.e, ((C3308awY) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3263avg> abstractC8997hK = this.e;
        return "UXConfigPreQuerySearchPageCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3308awY(AbstractC8997hK<C3263avg> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3308awY(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
