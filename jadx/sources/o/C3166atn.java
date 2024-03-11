package o;

import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkType;
import java.util.List;

/* renamed from: o.atn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3166atn {
    private final C3163atk a;
    private final List<PinotSearchArtworkFormat> c;
    private final AbstractC8997hK<C3159atg> d;
    private final PinotSearchArtworkType e;

    public final PinotSearchArtworkType b() {
        return this.e;
    }

    public final List<PinotSearchArtworkFormat> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3159atg> d() {
        return this.d;
    }

    public final C3163atk e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3166atn) {
            C3166atn c3166atn = (C3166atn) obj;
            return this.e == c3166atn.e && C8632dsu.c(this.c, c3166atn.c) && C8632dsu.c(this.a, c3166atn.a) && C8632dsu.c(this.d, c3166atn.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        PinotSearchArtworkType pinotSearchArtworkType = this.e;
        List<PinotSearchArtworkFormat> list = this.c;
        C3163atk c3163atk = this.a;
        AbstractC8997hK<C3159atg> abstractC8997hK = this.d;
        return "PinotSearchArtworkParamsInput(artworkType=" + pinotSearchArtworkType + ", formats=" + list + ", dimension=" + c3163atk + ", features=" + abstractC8997hK + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3166atn(PinotSearchArtworkType pinotSearchArtworkType, List<? extends PinotSearchArtworkFormat> list, C3163atk c3163atk, AbstractC8997hK<C3159atg> abstractC8997hK) {
        C8632dsu.c((Object) pinotSearchArtworkType, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c3163atk, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = pinotSearchArtworkType;
        this.c = list;
        this.a = c3163atk;
        this.d = abstractC8997hK;
    }
}
