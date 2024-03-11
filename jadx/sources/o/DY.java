package o;

import j$.time.Instant;
import o.AbstractC8997hK;

/* loaded from: classes2.dex */
public final class DY {
    private final AbstractC8997hK<Boolean> a;
    private final AbstractC8997hK<Instant> b;
    private final AbstractC8997hK<String> c;

    public DY() {
        this(null, null, null, 7, null);
    }

    public final AbstractC8997hK<Boolean> a() {
        return this.a;
    }

    public final AbstractC8997hK<String> b() {
        return this.c;
    }

    public final AbstractC8997hK<Instant> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DY) {
            DY dy = (DY) obj;
            return C8632dsu.c(this.c, dy.c) && C8632dsu.c(this.b, dy.b) && C8632dsu.c(this.a, dy.a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<String> abstractC8997hK = this.c;
        AbstractC8997hK<Instant> abstractC8997hK2 = this.b;
        AbstractC8997hK<Boolean> abstractC8997hK3 = this.a;
        return "CLCSRdidConsentStateInput(consentId=" + abstractC8997hK + ", displayedAt=" + abstractC8997hK2 + ", isDenied=" + abstractC8997hK3 + ")";
    }

    public DY(AbstractC8997hK<String> abstractC8997hK, AbstractC8997hK<Instant> abstractC8997hK2, AbstractC8997hK<Boolean> abstractC8997hK3) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        this.c = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.a = abstractC8997hK3;
    }

    public /* synthetic */ DY(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3);
    }
}
