package o;

import com.netflix.model.leafs.RecommendedTrailer;
import o.C1362Yt;
import o.aEX;

/* loaded from: classes3.dex */
public final class aDS implements RecommendedTrailer {
    private final C1362Yt.x e;

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoInterestingUrl() {
        return null;
    }

    public aDS(C1362Yt.x xVar) {
        C8632dsu.c((Object) xVar, "");
        this.e = xVar;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoId() {
        C1362Yt.F c = this.e.c();
        String num = c != null ? Integer.valueOf(c.a()).toString() : null;
        return num == null ? "" : num;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoType() {
        aEX.e eVar = aEX.a;
        C1362Yt.F c = this.e.c();
        return eVar.c((c == null || (r1 = c.e()) == null) ? "" : "").name();
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public int getSupplementalVideoRuntime() {
        C1362Yt.w c;
        Integer b;
        C1362Yt.F c2 = this.e.c();
        if (c2 == null || (c = c2.c()) == null || (b = c.b()) == null) {
            return -1;
        }
        return b.intValue();
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoMerchComputeId() {
        return this.e.b();
    }
}
