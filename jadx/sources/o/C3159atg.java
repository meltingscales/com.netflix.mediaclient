package o;

import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFallbackStrategy;
import o.AbstractC8997hK;

/* renamed from: o.atg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3159atg {
    private final AbstractC8997hK<Boolean> b;
    private final AbstractC8997hK<Boolean> c;
    private final AbstractC8997hK<PinotSearchArtworkFallbackStrategy> d;

    public C3159atg() {
        this(null, null, null, 7, null);
    }

    public final AbstractC8997hK<PinotSearchArtworkFallbackStrategy> c() {
        return this.d;
    }

    public final AbstractC8997hK<Boolean> d() {
        return this.b;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3159atg) {
            C3159atg c3159atg = (C3159atg) obj;
            return C8632dsu.c(this.d, c3159atg.d) && C8632dsu.c(this.b, c3159atg.b) && C8632dsu.c(this.c, c3159atg.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<PinotSearchArtworkFallbackStrategy> abstractC8997hK = this.d;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.b;
        AbstractC8997hK<Boolean> abstractC8997hK3 = this.c;
        return "PinotSearchArtworkFeaturesInput(fallbackStrategy=" + abstractC8997hK + ", enableLockBadgeChecks=" + abstractC8997hK2 + ", enableAvifFormatTest=" + abstractC8997hK3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3159atg(AbstractC8997hK<? extends PinotSearchArtworkFallbackStrategy> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2, AbstractC8997hK<Boolean> abstractC8997hK3) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        this.d = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.c = abstractC8997hK3;
    }

    public /* synthetic */ C3159atg(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3);
    }
}
