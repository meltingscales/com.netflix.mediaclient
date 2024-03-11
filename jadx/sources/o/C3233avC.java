package o;

import o.AbstractC8997hK;

/* renamed from: o.avC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3233avC {
    private final AbstractC8997hK<C3263avg> e;

    public C3233avC() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3263avg> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3233avC) && C8632dsu.c(this.e, ((C3233avC) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3263avg> abstractC8997hK = this.e;
        return "UXConfigEntitySearchPageCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3233avC(AbstractC8997hK<C3263avg> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3233avC(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
