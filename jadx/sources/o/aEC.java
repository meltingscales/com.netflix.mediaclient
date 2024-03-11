package o;

import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import o.C2315adt;
import o.C2570aia;

/* loaded from: classes3.dex */
public final class aEC extends C1537aEz implements ContentAdvisory {
    private final C2315adt a;
    private final C2570aia.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEC(C2570aia c2570aia, C2315adt c2315adt) {
        super(c2570aia);
        C8632dsu.c((Object) c2570aia, "");
        this.a = c2315adt;
        this.d = c2570aia.a();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        Integer a;
        C2570aia.b bVar = this.d;
        return AdvisoryBoard.getAdvisoryBoardById((bVar == null || (a = bVar.a()) == null) ? null : a.toString());
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        Integer d;
        C2570aia.b bVar = this.d;
        if (bVar == null || (d = bVar.d()) == null) {
            return null;
        }
        return d.toString();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.j();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.o();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        Integer f;
        C2570aia.b bVar = this.d;
        if (bVar == null || (f = bVar.f()) == null) {
            return null;
        }
        return f.toString();
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public AdvisoryBoard getBoard() {
        return getAdvisoryBoard();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconLevel() {
        Integer f;
        C2570aia.b bVar = this.d;
        String num = (bVar == null || (f = bVar.f()) == null) ? null : f.toString();
        return num == null ? "" : num;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconValue() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nRating() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nAdvisories() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastReleaseDate() {
        C2315adt.e b;
        Instant a;
        C2315adt c2315adt = this.a;
        if (c2315adt == null || (b = c2315adt.b()) == null || (a = b.a()) == null) {
            return null;
        }
        return a.toString();
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastDistributorName() {
        C2315adt.e b;
        C2315adt c2315adt = this.a;
        if (c2315adt == null || (b = c2315adt.b()) == null) {
            return null;
        }
        return b.b();
    }

    /* loaded from: classes3.dex */
    public static final class e implements ContentAdvisoryIcon {
        final /* synthetic */ C2570aia.a b;

        e(C2570aia.a aVar) {
            this.b = aVar;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
        public String getText() {
            C2570aia.a aVar = this.b;
            String d = aVar != null ? aVar.d() : null;
            return d == null ? "" : d;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
        public String getId() {
            Integer a;
            C2570aia.a aVar = this.b;
            String num = (aVar == null || (a = aVar.a()) == null) ? null : a.toString();
            return num == null ? "" : num;
        }
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public List<ContentAdvisoryIcon> getIcons() {
        List<C2570aia.a> g;
        int d;
        List<ContentAdvisoryIcon> n;
        C2570aia.b bVar = this.d;
        if (bVar == null || (g = bVar.g()) == null) {
            return null;
        }
        d = C8572dqo.d(g, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C2570aia.a aVar : g) {
            arrayList.add(new e(aVar));
        }
        n = C8576dqs.n(arrayList);
        return n;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getCertSystemConfirmationId() {
        C2570aia.b bVar = this.d;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // o.C1537aEz, com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        if (C8168dfL.g(getI18nAdvisories()) && C8168dfL.h(getBroadcastDistributorName()) && C8168dfL.h(getBroadcastReleaseDate())) {
            String broadcastDistributorName = getBroadcastDistributorName();
            String broadcastReleaseDate = getBroadcastReleaseDate();
            return broadcastDistributorName + "  " + broadcastReleaseDate;
        }
        return getI18nAdvisories();
    }

    @Override // o.C1537aEz, com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        String i18nRating = getI18nRating();
        return i18nRating == null ? "" : i18nRating;
    }
}
