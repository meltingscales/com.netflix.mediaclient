package o;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.TrackableListSummary;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2283adN;
import o.C2546aiC;

/* loaded from: classes3.dex */
public class aEA implements InterfaceC5194buE {
    private final C2553aiJ e;

    @Override // o.InterfaceC5198buI
    public boolean M() {
        return false;
    }

    public aEA(C2553aiJ c2553aiJ) {
        C8632dsu.c((Object) c2553aiJ, "");
        this.e = c2553aiJ;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.e.b().b());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.e.b().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.SHOW;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.b().e();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.e.b().i(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return C8632dsu.c(this.e.b().f(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return C8632dsu.c(this.e.b().g(), Boolean.TRUE);
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
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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

    @Override // o.InterfaceC5196buG
    public List<InterfaceC5223buh> bR_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5196buG
    public TrackableListSummary h() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5199buJ
    public List<InterfaceC5240buy> bS_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5199buJ
    public TrackableListSummary l() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public String t() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public int bX_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public int D_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public int V() {
        List<C2546aiC.d> e;
        C2546aiC.e a = this.e.a().a();
        if (a == null || (e = a.e()) == null) {
            return 0;
        }
        return e.size();
    }

    @Override // o.InterfaceC5194buE
    public int u() {
        Integer d;
        C2283adN.c a = this.e.c().a();
        if (a == null || (d = a.d()) == null) {
            return -1;
        }
        return d.intValue();
    }

    @Override // o.InterfaceC5194buE
    public String bU_() {
        C2283adN.c a = this.e.c().a();
        String num = a != null ? Integer.valueOf(a.a()).toString() : null;
        return num == null ? "" : num;
    }

    @Override // o.InterfaceC5194buE
    public String C_() {
        C2283adN.c a = this.e.c().a();
        String c = a != null ? a.c() : null;
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5194buE
    public ContextualText d(ContextualText.TextContext textContext) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public int bV_() {
        C2283adN.b e;
        C2547aiD d;
        Integer c;
        C2283adN.c a = this.e.c().a();
        if (a == null || (e = a.e()) == null || (d = e.d()) == null || (c = d.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5194buE
    public InterfaceC5195buF A() {
        C2283adN.b e;
        C2283adN.c a = this.e.c().a();
        C2547aiD d = (a == null || (e = a.e()) == null) ? null : e.d();
        if (d != null) {
            return new aEE(d, null);
        }
        return null;
    }

    @Override // o.InterfaceC5194buE
    public String W() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5194buE
    public List<InterfaceC5195buF> at() {
        List<C2546aiC.d> e;
        int d;
        C2546aiC.c d2;
        C2546aiC.e a = this.e.a().a();
        if (a == null || (e = a.e()) == null) {
            return null;
        }
        d = C8572dqo.d(e, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C2546aiC.d dVar : e) {
            C2547aiD e2 = (dVar == null || (d2 = dVar.d()) == null) ? null : d2.e();
            if (e2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            arrayList.add(new aEE(e2, null));
        }
        return arrayList;
    }

    @Override // o.InterfaceC5194buE
    public InterfaceC5231bup bW_() {
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

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
