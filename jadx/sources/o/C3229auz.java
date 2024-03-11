package o;

import com.netflix.mediaclient.graphql.models.type.TVUIArtworkRoundingStrategy;
import com.netflix.mediaclient.graphql.models.type.TVUIResolution;

/* renamed from: o.auz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3229auz {
    private final TVUIResolution a;
    private final AbstractC8997hK<Boolean> b;
    private final AbstractC8997hK<Boolean> c;
    private final AbstractC8997hK<TVUIArtworkRoundingStrategy> d;
    private final TVUIResolution e;
    private final AbstractC8997hK<Boolean> i;

    public final TVUIResolution a() {
        return this.a;
    }

    public final TVUIResolution b() {
        return this.e;
    }

    public final AbstractC8997hK<Boolean> c() {
        return this.c;
    }

    public final AbstractC8997hK<TVUIArtworkRoundingStrategy> d() {
        return this.d;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3229auz) {
            C3229auz c3229auz = (C3229auz) obj;
            return this.a == c3229auz.a && this.e == c3229auz.e && C8632dsu.c(this.d, c3229auz.d) && C8632dsu.c(this.b, c3229auz.b) && C8632dsu.c(this.i, c3229auz.i) && C8632dsu.c(this.c, c3229auz.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + this.c.hashCode();
    }

    public final AbstractC8997hK<Boolean> j() {
        return this.i;
    }

    public String toString() {
        TVUIResolution tVUIResolution = this.a;
        TVUIResolution tVUIResolution2 = this.e;
        AbstractC8997hK<TVUIArtworkRoundingStrategy> abstractC8997hK = this.d;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.b;
        AbstractC8997hK<Boolean> abstractC8997hK3 = this.i;
        AbstractC8997hK<Boolean> abstractC8997hK4 = this.c;
        return "TVUIArtworkCapability(deviceResolution=" + tVUIResolution + ", artworkResolution=" + tVUIResolution2 + ", roundingStrategy=" + abstractC8997hK + ", supportsAstcFormat=" + abstractC8997hK2 + ", useWebPForLargeImages=" + abstractC8997hK3 + ", useWebPForAllImages=" + abstractC8997hK4 + ")";
    }
}
