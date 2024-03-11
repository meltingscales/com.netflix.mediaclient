package o;

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
import j$.time.Instant;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2363aeo;
import o.C2580aik;
import o.C2587air;

/* loaded from: classes3.dex */
public class aED implements InterfaceC5227bul, InterfaceC5225buj {
    private final C2576aig a;
    private final C2363aeo b;
    private final C2547aiD c;
    private final String d;
    private final C2572aic e;

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        return null;
    }

    @Override // o.InterfaceC5225buj
    public String at() {
        return this.d;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    public aED(C2363aeo c2363aeo, C2572aic c2572aic, C2576aig c2576aig, C2547aiD c2547aiD, String str) {
        C8632dsu.c((Object) c2363aeo, "");
        C8632dsu.c((Object) c2547aiD, "");
        this.b = c2363aeo;
        this.e = c2572aic;
        this.a = c2576aig;
        this.c = c2547aiD;
        this.d = str;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.b.h().b().e());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.b.h().b().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.EPISODE;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.b.h().b().b();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.b.h().d().i(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return C8632dsu.c(this.b.h().b().f(), Boolean.TRUE);
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
    public String ab() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return aDE.e.e(textContext, this.b.d());
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

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public boolean aU_() {
        return C8632dsu.c(this.b.c(), Boolean.TRUE);
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
        return C8632dsu.c((Object) this.b.i(), (Object) C3180auA.c.b().b());
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
    public InterfaceC5160btX aE_() {
        return new C1534aEw(this.b.h(), this.e, this.a);
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
        return aE_().e();
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
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
        return aE_().B();
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

    @Override // o.InterfaceC5191buB
    public String ce_() {
        return C8632dsu.c(this.b.e(), Boolean.TRUE) ? "NEW_EPISODE" : "";
    }

    @Override // o.InterfaceC5227bul
    public String ca_() {
        C2363aeo.e a = this.b.a();
        String c = a != null ? a.c() : null;
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5227bul
    public long aq_() {
        return aE_().aq_();
    }

    public long ay() {
        C2587air b;
        C2587air.b b2;
        Instant d;
        C2580aik.d c = this.b.h().d().c();
        if (c == null || (b = c.b()) == null || (b2 = b.b()) == null || (d = b2.d()) == null) {
            return 0L;
        }
        return d.b();
    }

    @Override // o.InterfaceC5227bul
    public int aw_() {
        Integer f = this.b.f();
        if (f != null) {
            return f.intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC5227bul
    public int x() {
        Integer c = this.c.c();
        if (c != null) {
            return c.intValue();
        }
        return 0;
    }

    @Override // o.InterfaceC5227bul
    public String cc_() {
        return String.valueOf(this.c.j());
    }

    @Override // o.InterfaceC5227bul
    public String cd_() {
        C2576aig c2576aig = this.a;
        return String.valueOf(c2576aig != null ? Integer.valueOf(c2576aig.a()) : null);
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
    public String bY_() {
        String b = this.b.b();
        return b == null ? "" : b;
    }

    @Override // o.InterfaceC5227bul
    public String aK_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5227bul
    public int g() {
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

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
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

    @Override // o.InterfaceC5236buu
    public InterfaceC5231bup bT_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
