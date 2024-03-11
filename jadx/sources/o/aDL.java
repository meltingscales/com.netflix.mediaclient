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
import java.util.List;
import kotlin.NotImplementedError;
import o.C2328aeF;

/* loaded from: classes3.dex */
public final class aDL implements InterfaceC5227bul {
    private final C2328aeF.e b;

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    public aDL(C2328aeF.e eVar) {
        C8632dsu.c((Object) eVar, "");
        this.b = eVar;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.b.k());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String m = this.b.m();
        return m == null ? "" : m;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.EPISODE;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.b.l();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return new aDM(this.b);
    }

    @Override // o.InterfaceC5227bul
    public String bY_() {
        String c = this.b.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return aDE.e.e(textContext, this.b.d());
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public boolean aU_() {
        return C8632dsu.c(this.b.t(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5227bul
    public int aw_() {
        Integer g = this.b.g();
        if (g != null) {
            return g.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5227bul
    public int g() {
        Integer e;
        C2295adZ e2 = this.b.e();
        if (e2 == null || (e = e2.e()) == null) {
            return -1;
        }
        return e.intValue();
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        String i = this.b.i();
        return i == null ? "" : i;
    }

    @Override // o.InterfaceC5227bul
    public String ca_() {
        C2328aeF.a h = this.b.h();
        String e = h != null ? h.e() : null;
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5191buB
    public String ce_() {
        return C8632dsu.c(this.b.a(), Boolean.TRUE) ? "NEW_EPISODE" : "";
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.b.o(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.b.j());
    }

    @Override // o.InterfaceC5227bul
    public long aq_() {
        return aE_().aq_();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
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
    public boolean ao() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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
        return C8632dsu.c(this.b.p(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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
    public String Z() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
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
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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

    @Override // o.InterfaceC5198buI
    public InterfaceC5198buI K() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public int x() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public String cc_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public String cd_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public String bZ_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public String cb_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public String aK_() {
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

    @Override // o.InterfaceC5236buu
    public InterfaceC5231bup bT_() {
        return aDP.a.e(this.b.f(), getId());
    }
}
