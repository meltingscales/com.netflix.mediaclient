package o;

import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.aoD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2865aoD {
    private final AbstractC8997hK<C2952apl> a;
    private final AbstractC8997hK<ArtworkFormat> b;
    private final AbstractC8997hK<ArtworkType> c;
    private final AbstractC8997hK<List<ArtworkFormat>> d;
    private final AbstractC8997hK<C2864aoC> e;

    public C2865aoD() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C2865aoD c(C2865aoD c2865aoD, AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, int i, Object obj) {
        AbstractC8997hK<ArtworkType> abstractC8997hK6 = abstractC8997hK;
        if ((i & 1) != 0) {
            abstractC8997hK6 = c2865aoD.c;
        }
        AbstractC8997hK<ArtworkFormat> abstractC8997hK7 = abstractC8997hK2;
        if ((i & 2) != 0) {
            abstractC8997hK7 = c2865aoD.b;
        }
        AbstractC8997hK abstractC8997hK8 = abstractC8997hK7;
        AbstractC8997hK<List<ArtworkFormat>> abstractC8997hK9 = abstractC8997hK3;
        if ((i & 4) != 0) {
            abstractC8997hK9 = c2865aoD.d;
        }
        AbstractC8997hK abstractC8997hK10 = abstractC8997hK9;
        AbstractC8997hK<C2864aoC> abstractC8997hK11 = abstractC8997hK4;
        if ((i & 8) != 0) {
            abstractC8997hK11 = c2865aoD.e;
        }
        AbstractC8997hK abstractC8997hK12 = abstractC8997hK11;
        AbstractC8997hK<C2952apl> abstractC8997hK13 = abstractC8997hK5;
        if ((i & 16) != 0) {
            abstractC8997hK13 = c2865aoD.a;
        }
        return c2865aoD.e(abstractC8997hK6, abstractC8997hK8, abstractC8997hK10, abstractC8997hK12, abstractC8997hK13);
    }

    public final AbstractC8997hK<C2952apl> a() {
        return this.a;
    }

    public final AbstractC8997hK<C2864aoC> b() {
        return this.e;
    }

    public final AbstractC8997hK<List<ArtworkFormat>> c() {
        return this.d;
    }

    public final AbstractC8997hK<ArtworkFormat> d() {
        return this.b;
    }

    public final C2865aoD e(AbstractC8997hK<? extends ArtworkType> abstractC8997hK, AbstractC8997hK<? extends ArtworkFormat> abstractC8997hK2, AbstractC8997hK<? extends List<? extends ArtworkFormat>> abstractC8997hK3, AbstractC8997hK<C2864aoC> abstractC8997hK4, AbstractC8997hK<C2952apl> abstractC8997hK5) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        return new C2865aoD(abstractC8997hK, abstractC8997hK2, abstractC8997hK3, abstractC8997hK4, abstractC8997hK5);
    }

    public final AbstractC8997hK<ArtworkType> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2865aoD) {
            C2865aoD c2865aoD = (C2865aoD) obj;
            return C8632dsu.c(this.c, c2865aoD.c) && C8632dsu.c(this.b, c2865aoD.b) && C8632dsu.c(this.d, c2865aoD.d) && C8632dsu.c(this.e, c2865aoD.e) && C8632dsu.c(this.a, c2865aoD.a);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<ArtworkType> abstractC8997hK = this.c;
        AbstractC8997hK<ArtworkFormat> abstractC8997hK2 = this.b;
        AbstractC8997hK<List<ArtworkFormat>> abstractC8997hK3 = this.d;
        AbstractC8997hK<C2864aoC> abstractC8997hK4 = this.e;
        AbstractC8997hK<C2952apl> abstractC8997hK5 = this.a;
        return "ArtworkParams(artworkType=" + abstractC8997hK + ", format=" + abstractC8997hK2 + ", formats=" + abstractC8997hK3 + ", dimension=" + abstractC8997hK4 + ", features=" + abstractC8997hK5 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2865aoD(AbstractC8997hK<? extends ArtworkType> abstractC8997hK, AbstractC8997hK<? extends ArtworkFormat> abstractC8997hK2, AbstractC8997hK<? extends List<? extends ArtworkFormat>> abstractC8997hK3, AbstractC8997hK<C2864aoC> abstractC8997hK4, AbstractC8997hK<C2952apl> abstractC8997hK5) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        this.c = abstractC8997hK;
        this.b = abstractC8997hK2;
        this.d = abstractC8997hK3;
        this.e = abstractC8997hK4;
        this.a = abstractC8997hK5;
    }

    public /* synthetic */ C2865aoD(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5);
    }
}
