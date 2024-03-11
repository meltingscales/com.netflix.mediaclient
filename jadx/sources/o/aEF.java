package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2512ahV;
import o.C2580aik;

/* loaded from: classes3.dex */
public class aEF implements InterfaceC5198buI {
    private final C2576aig a;
    private final C2533ahq b;
    private List<? extends Advisory> c;
    private final C2579aij d;
    private final C2572aic e;
    private final C2630ajh f;

    @Override // o.InterfaceC5198buI
    public InterfaceC5198buI K() {
        return null;
    }

    public aEF(C2630ajh c2630ajh, C2579aij c2579aij, C2533ahq c2533ahq, C2576aig c2576aig, C2572aic c2572aic) {
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2579aij, "");
        this.f = c2630ajh;
        this.d = c2579aij;
        this.b = c2533ahq;
        this.a = c2576aig;
        this.e = c2572aic;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.f.e());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return String.valueOf(this.f.c());
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return aEX.a.e(this.f);
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.f.b();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        Boolean i = this.d.d().i();
        if (i != null) {
            return i.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        Boolean f = this.f.f();
        if (f != null) {
            return f.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        Boolean h = this.d.d().h();
        if (h != null) {
            return h.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5173btk
    public String bM_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
    public String k() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public int ag() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String R() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String bP_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> bO_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ao_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> r() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ah() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String v() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public int E() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String Y() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<TaglineMessage> aa() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean au() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean F() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean aU_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean ao() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        return C8632dsu.c((Object) this.f.h(), (Object) C3180auA.c.b().b());
    }

    @Override // o.InterfaceC5198buI
    public String p() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        C2580aik.a d = this.d.d().d();
        String d2 = d != null ? d.d() : null;
        return d2 == null ? "" : d2;
    }

    @Override // o.InterfaceC5198buI
    public String c() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String m() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return new aEB(this.d, this.a, this.e);
    }

    @Override // o.InterfaceC5198buI
    public String Z() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String w() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String ad() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.Sharing X() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<Advisory> e() {
        ArrayList arrayList;
        int d;
        Object c1537aEz;
        if (this.c == null) {
            List<C2512ahV.a> a = this.d.e().a();
            if (a != null) {
                d = C8572dqo.d(a, 10);
                arrayList = new ArrayList(d);
                for (C2512ahV.a aVar : a) {
                    if (aVar.a().a() != null) {
                        c1537aEz = new aEC(aVar.a(), this.d.e().b());
                    } else {
                        c1537aEz = new C1537aEz(aVar.a());
                    }
                    arrayList.add(c1537aEz);
                }
            } else {
                arrayList = null;
            }
            this.c = arrayList;
        }
        return this.c;
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.d.d().b());
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        Boolean e = this.d.d().e();
        if (e != null) {
            return e.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5198buI
    public ContentWarning o() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<TagSummary> ac() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> I() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> z() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String q() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String ae() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5182btt bQ_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public SupplementalMessageType A_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String j() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String U() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
