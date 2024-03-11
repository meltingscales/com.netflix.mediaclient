package o;

import com.netflix.mediaclient.graphql.models.type.DimensionMatchStrategy;
import com.netflix.mediaclient.graphql.models.type.ScaleStrategy;
import o.AbstractC8997hK;

/* renamed from: o.aoC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2864aoC {
    private final AbstractC8997hK<Integer> a;
    private final AbstractC8997hK<DimensionMatchStrategy> b;
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<ScaleStrategy> d;
    private final AbstractC8997hK<Integer> e;
    private final AbstractC8997hK<Integer> h;

    public C2864aoC() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final AbstractC8997hK<ScaleStrategy> a() {
        return this.d;
    }

    public final AbstractC8997hK<Integer> b() {
        return this.a;
    }

    public final AbstractC8997hK<DimensionMatchStrategy> c() {
        return this.b;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.e;
    }

    public final AbstractC8997hK<Integer> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2864aoC) {
            C2864aoC c2864aoC = (C2864aoC) obj;
            return C8632dsu.c(this.c, c2864aoC.c) && C8632dsu.c(this.a, c2864aoC.a) && C8632dsu.c(this.b, c2864aoC.b) && C8632dsu.c(this.h, c2864aoC.h) && C8632dsu.c(this.e, c2864aoC.e) && C8632dsu.c(this.d, c2864aoC.d);
        }
        return false;
    }

    public final AbstractC8997hK<Integer> h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.h.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<Integer> abstractC8997hK = this.c;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.a;
        AbstractC8997hK<DimensionMatchStrategy> abstractC8997hK3 = this.b;
        AbstractC8997hK<Integer> abstractC8997hK4 = this.h;
        AbstractC8997hK<Integer> abstractC8997hK5 = this.e;
        AbstractC8997hK<ScaleStrategy> abstractC8997hK6 = this.d;
        return "ArtworkDimension(width=" + abstractC8997hK + ", height=" + abstractC8997hK2 + ", matchStrategy=" + abstractC8997hK3 + ", widthVariance=" + abstractC8997hK4 + ", heightVariance=" + abstractC8997hK5 + ", scaleStrategy=" + abstractC8997hK6 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2864aoC(AbstractC8997hK<Integer> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2, AbstractC8997hK<? extends DimensionMatchStrategy> abstractC8997hK3, AbstractC8997hK<Integer> abstractC8997hK4, AbstractC8997hK<Integer> abstractC8997hK5, AbstractC8997hK<? extends ScaleStrategy> abstractC8997hK6) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        this.c = abstractC8997hK;
        this.a = abstractC8997hK2;
        this.b = abstractC8997hK3;
        this.h = abstractC8997hK4;
        this.e = abstractC8997hK5;
        this.d = abstractC8997hK6;
    }

    public /* synthetic */ C2864aoC(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6);
    }
}
