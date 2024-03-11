package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.Bookmark;
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
import o.C2295adZ;
import o.C2356aeh;

/* loaded from: classes3.dex */
public final class aEN implements InterfaceC5227bul, InterfaceC5225buj {
    private Bookmark a;
    private final String b;
    private final C2356aeh c;
    private final C2364aep d;

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        return false;
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

    @Override // o.InterfaceC5225buj
    public String at() {
        return this.b;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    public aEN(C2356aeh c2356aeh, C2364aep c2364aep, String str) {
        C8632dsu.c((Object) c2356aeh, "");
        this.c = c2356aeh;
        this.d = c2364aep;
        this.b = str;
        this.a = new d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements Bookmark {
        private long a;
        private long b;
        private final int e;

        @Override // com.netflix.model.leafs.Bookmark
        public long getBookmarkPositionMs() {
            return this.a;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public long getLastModified() {
            return this.b;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public void setBookmarkPositionMs(long j) {
            this.a = j;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public void setLastModified(long j) {
            this.b = j;
        }

        d() {
        }

        @Override // com.netflix.model.leafs.Bookmark
        public Integer getInteractiveProgress() {
            return Integer.valueOf(this.e);
        }
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.c.g().e());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.c.g().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.EPISODE;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.c.g().b();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return new aEK(this.c);
    }

    @Override // o.InterfaceC5227bul
    public String bY_() {
        C2356aeh.c i = this.c.i();
        String d2 = i != null ? i.d() : null;
        return d2 == null ? "" : d2;
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return aDE.e.e(textContext, this.c.a());
    }

    @Override // o.InterfaceC5227bul, o.InterfaceC5198buI
    public boolean aU_() {
        return C8632dsu.c(this.c.l(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5227bul
    public int aw_() {
        Integer c;
        C2356aeh.c i = this.c.i();
        if (i == null || (c = i.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5227bul
    public int g() {
        Integer e;
        C2295adZ b = this.c.b();
        if (b == null || (e = b.e()) == null) {
            return -1;
        }
        return e.intValue();
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        String h = this.c.h();
        return h == null ? "" : h;
    }

    @Override // o.InterfaceC5227bul
    public String ca_() {
        C2356aeh.e c = this.c.c();
        String e = c != null ? c.e() : null;
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5191buB
    public String ce_() {
        C2356aeh.c i = this.c.i();
        return (i == null || !C8632dsu.c(i.a(), Boolean.TRUE)) ? "" : "NEW_EPISODE";
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.c.j(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.c.d());
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
    public String p() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        Boolean c;
        C2364aep c2364aep = this.d;
        if (c2364aep == null || (c = c2364aep.c()) == null) {
            return false;
        }
        return c.booleanValue();
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

    public long az() {
        C2295adZ.e b;
        Instant b2;
        C2295adZ b3 = this.c.b();
        if (b3 == null || (b = b3.b()) == null || (b2 = b.b()) == null) {
            return 0L;
        }
        return b2.b();
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
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
