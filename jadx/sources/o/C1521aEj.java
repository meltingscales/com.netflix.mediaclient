package o;

import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.RatingDetails;
import o.C2337aeO;

/* renamed from: o.aEj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1521aEj implements RatingDetails {
    private final C2337aeO b;
    private final C2337aeO.b e;

    public C1521aEj(C2337aeO c2337aeO) {
        C8632dsu.c((Object) c2337aeO, "");
        this.b = c2337aeO;
        this.e = c2337aeO.d();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        C2337aeO.b bVar = this.e;
        return AdvisoryBoard.getAdvisoryBoardById(String.valueOf(bVar != null ? bVar.d() : null));
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        Integer f;
        C2337aeO.b bVar = this.e;
        if (bVar == null || (f = bVar.f()) == null) {
            return null;
        }
        return f.toString();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        C2337aeO.b bVar = this.e;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        Integer b;
        C2337aeO.b bVar = this.e;
        if (bVar == null || (b = bVar.b()) == null) {
            return null;
        }
        return b.toString();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        C2337aeO.b bVar = this.e;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        C2337aeO.b bVar = this.e;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }
}
