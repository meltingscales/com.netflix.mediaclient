package o;

import o.AbstractC8997hK;

/* renamed from: o.aqP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2983aqP {
    private final AbstractC8997hK<String> e;

    public C2983aqP() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<String> b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2983aqP) && C8632dsu.c(this.e, ((C2983aqP) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<String> abstractC8997hK = this.e;
        return "LolomoRowRefreshAnnotations(renoMessageId=" + abstractC8997hK + ")";
    }

    public C2983aqP(AbstractC8997hK<String> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C2983aqP(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
