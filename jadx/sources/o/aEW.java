package o;

import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.RatingDetails;
import o.C2628ajf;

/* loaded from: classes3.dex */
public final class aEW implements RatingDetails {
    private final C2628ajf.a d;

    public aEW(C2628ajf.a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.d = aVar;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        return AdvisoryBoard.getAdvisoryBoardById(String.valueOf(this.d.c()));
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        Integer e = this.d.e();
        if (e != null) {
            return e.toString();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        return this.d.h();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        Integer d = this.d.d();
        if (d != null) {
            return d.toString();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        return this.d.a();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        return this.d.g();
    }
}
