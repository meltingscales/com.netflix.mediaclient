package o;

import o.AbstractC8997hK;

/* renamed from: o.asf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3105asf {
    private final AbstractC8997hK<C3103asd> e;

    public C3105asf() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3103asd> a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3105asf) && C8632dsu.c(this.e, ((C3105asf) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3103asd> abstractC8997hK = this.e;
        return "PinotCapabilitiesSearchPageInput(base=" + abstractC8997hK + ")";
    }

    public C3105asf(AbstractC8997hK<C3103asd> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3105asf(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
