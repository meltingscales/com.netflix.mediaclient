package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2278adI;

/* loaded from: classes3.dex */
public class aDD implements ContentAdvisory {
    public static final d e = new d(null);
    private final C2278adI.d d;

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getCertSystemConfirmationId() {
        return null;
    }

    public aDD(C2278adI.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.d = dVar;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ContentAdvisory c(C2278adI.d dVar) {
            C8632dsu.c((Object) dVar, "");
            return new aDD(dVar);
        }
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        return AdvisoryBoard.getAdvisoryBoardById(String.valueOf(this.d.a()));
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        return String.valueOf(this.d.d());
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        return this.d.j();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        return this.d.g();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        Integer f = this.d.f();
        if (f != null) {
            return f.toString();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        return this.d.b();
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return Advisory.Type.CONTENT_ADVISORY;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDuration() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDelay() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public AdvisoryBoard getBoard() {
        return getAdvisoryBoard();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconLevel() {
        Integer f = this.d.f();
        String num = f != null ? f.toString() : null;
        return num == null ? "" : num;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconValue() {
        return this.d.b();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nRating() {
        return this.d.e();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nAdvisories() {
        return this.d.i();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastReleaseDate() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastDistributorName() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* loaded from: classes3.dex */
    public static final class a implements ContentAdvisoryIcon {
        final /* synthetic */ C2278adI.e d;

        a(C2278adI.e eVar) {
            this.d = eVar;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
        public String getText() {
            C2278adI.e eVar = this.d;
            String c = eVar != null ? eVar.c() : null;
            return c == null ? "" : c;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
        public String getId() {
            Integer d;
            C2278adI.e eVar = this.d;
            String num = (eVar == null || (d = eVar.d()) == null) ? null : d.toString();
            return num == null ? "" : num;
        }
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public List<ContentAdvisoryIcon> getIcons() {
        int d2;
        List<ContentAdvisoryIcon> n;
        List<C2278adI.e> h = this.d.h();
        if (h != null) {
            d2 = C8572dqo.d(h, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (C2278adI.e eVar : h) {
                arrayList.add(new a(eVar));
            }
            n = C8576dqs.n(arrayList);
            return n;
        }
        return null;
    }
}
