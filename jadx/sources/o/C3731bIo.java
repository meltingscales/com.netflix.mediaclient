package o;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus;
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
import java.util.Collection;
import java.util.List;

/* renamed from: o.bIo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3731bIo implements InterfaceC5198buI {
    private final InterfaceC5233bur a;
    private final InterfaceC5198buI c;

    @Override // o.InterfaceC5198buI
    public SupplementalMessageType A_() {
        return this.c.A_();
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        return this.c.B();
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        return this.c.D();
    }

    @Override // o.InterfaceC5198buI
    public int E() {
        return this.c.E();
    }

    @Override // o.InterfaceC5198buI
    public boolean F() {
        return this.c.F();
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> I() {
        return this.c.I();
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        return this.c.J();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5198buI K() {
        return this.c.K();
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        return this.c.L();
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        return this.c.M();
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        return this.c.O();
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        return this.c.Q();
    }

    @Override // o.InterfaceC5198buI
    public String R() {
        return this.c.R();
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        return this.c.S();
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        return this.c.T();
    }

    @Override // o.InterfaceC5198buI
    public String U() {
        return this.c.U();
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.Sharing X() {
        return this.c.X();
    }

    @Override // o.InterfaceC5198buI
    public String Y() {
        return this.c.Y();
    }

    @Override // o.InterfaceC5198buI
    public String Z() {
        return this.c.Z();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return this.c.aE_();
    }

    @Override // o.InterfaceC5198buI
    public boolean aU_() {
        return this.c.aU_();
    }

    @Override // o.InterfaceC5198buI
    public List<TaglineMessage> aa() {
        return this.c.aa();
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        return this.c.ab();
    }

    @Override // o.InterfaceC5198buI
    public List<TagSummary> ac() {
        return this.c.ac();
    }

    @Override // o.InterfaceC5198buI
    public String ad() {
        return this.c.ad();
    }

    @Override // o.InterfaceC5198buI
    public String ae() {
        return this.c.ae();
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        return this.c.af();
    }

    @Override // o.InterfaceC5198buI
    public int ag() {
        return this.c.ag();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ah() {
        return this.c.ah();
    }

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        return this.c.ai();
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        return this.c.aj();
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        return this.c.ak();
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        return this.c.al();
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        return this.c.am();
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        return this.c.an();
    }

    @Override // o.InterfaceC5198buI
    public boolean ao() {
        return this.c.ao();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ao_() {
        return this.c.ao_();
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        return this.c.ap();
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        return this.c.aq();
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        return this.c.ar();
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        return this.c.as();
    }

    @Override // o.InterfaceC5198buI
    public boolean au() {
        return this.c.au();
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        return this.c.av();
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        return this.c.aw();
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        return this.c.az_();
    }

    @Override // o.InterfaceC5173btk
    public String bM_() {
        return this.c.bM_();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> bO_() {
        return this.c.bO_();
    }

    @Override // o.InterfaceC5198buI
    public String bP_() {
        return this.c.bP_();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5182btt bQ_() {
        return this.c.bQ_();
    }

    @Override // o.InterfaceC5198buI
    public String c() {
        return this.c.c();
    }

    @Override // o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return this.c.e(textContext);
    }

    @Override // o.InterfaceC5198buI
    public List<Advisory> e() {
        return this.c.e();
    }

    public final InterfaceC5233bur g() {
        return this.a;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.c.getBoxartId();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.c.getBoxshotUrl();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.c.getId();
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        return this.c.getMatchPercentage();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return this.c.getTitle();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return this.c.getType();
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.c.getUnifiedEntityId();
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        return this.c.getUserThumbRating();
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return this.c.getVideoMerchComputeId();
    }

    public final InterfaceC5198buI h() {
        return this.c;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return this.c.isAvailableForDownload();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return this.c.isAvailableToPlay();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        return this.c.isOriginal();
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return this.c.isPlayable();
    }

    @Override // o.InterfaceC5198buI
    public String j() {
        return this.c.j();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
    public String k() {
        return this.c.k();
    }

    @Override // o.InterfaceC5198buI
    public String m() {
        return this.c.m();
    }

    @Override // o.InterfaceC5198buI
    public ContentWarning o() {
        return this.c.o();
    }

    @Override // o.InterfaceC5198buI
    public String p() {
        return this.c.p();
    }

    @Override // o.InterfaceC5198buI
    public String q() {
        return this.c.q();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> r() {
        return this.c.r();
    }

    @Override // o.InterfaceC5198buI
    public String v() {
        return this.c.v();
    }

    @Override // o.InterfaceC5198buI
    public String w() {
        return this.c.w();
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> z() {
        return this.c.z();
    }

    public C3731bIo(InterfaceC5198buI interfaceC5198buI, InterfaceC5233bur interfaceC5233bur) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) interfaceC5233bur, "");
        this.c = interfaceC5198buI;
        this.a = interfaceC5233bur;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        InterfaceC5194buE P = this.c.P();
        if (P != null) {
            return new b(P, this);
        }
        return null;
    }

    /* renamed from: o.bIo$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5194buE {
        final /* synthetic */ InterfaceC5194buE a;
        private final /* synthetic */ InterfaceC5194buE b;
        final /* synthetic */ C3731bIo c;

        @Override // o.InterfaceC5194buE
        public InterfaceC5195buF A() {
            return this.b.A();
        }

        @Override // o.InterfaceC5198buI
        public SupplementalMessageType A_() {
            return this.b.A_();
        }

        @Override // o.InterfaceC5198buI
        public VideoInfo.TimeCodes B() {
            return this.b.B();
        }

        @Override // o.InterfaceC5194buE
        public String C_() {
            return this.b.C_();
        }

        @Override // o.InterfaceC5198buI
        public String D() {
            return this.b.D();
        }

        @Override // o.InterfaceC5194buE
        public int D_() {
            return this.b.D_();
        }

        @Override // o.InterfaceC5198buI
        public int E() {
            return this.b.E();
        }

        @Override // o.InterfaceC5198buI
        public boolean F() {
            return this.b.F();
        }

        @Override // o.InterfaceC5198buI
        public List<GenreItem> I() {
            return this.b.I();
        }

        @Override // o.InterfaceC5201buL
        public InterfaceC5196buG J() {
            return this.b.J();
        }

        @Override // o.InterfaceC5198buI
        public InterfaceC5198buI K() {
            return this.b.K();
        }

        @Override // o.InterfaceC5201buL
        public InterfaceC5202buM L() {
            return this.b.L();
        }

        @Override // o.InterfaceC5198buI
        public boolean M() {
            return this.b.M();
        }

        @Override // o.InterfaceC5201buL
        public RecommendedTrailer O() {
            return this.b.O();
        }

        @Override // o.InterfaceC5200buK
        public InterfaceC5194buE P() {
            return this.b.P();
        }

        @Override // o.InterfaceC5200buK
        public InterfaceC5238buw Q() {
            return this.b.Q();
        }

        @Override // o.InterfaceC5198buI
        public String R() {
            return this.b.R();
        }

        @Override // o.InterfaceC5201buL
        public InterfaceC5199buJ S() {
            return this.b.S();
        }

        @Override // o.InterfaceC5197buH
        public String T() {
            return this.b.T();
        }

        @Override // o.InterfaceC5198buI
        public String U() {
            return this.b.U();
        }

        @Override // o.InterfaceC5194buE
        public int V() {
            return this.b.V();
        }

        @Override // o.InterfaceC5194buE
        public String W() {
            return this.b.W();
        }

        @Override // o.InterfaceC5198buI
        public VideoInfo.Sharing X() {
            return this.b.X();
        }

        @Override // o.InterfaceC5198buI
        public String Y() {
            return this.b.Y();
        }

        @Override // o.InterfaceC5198buI
        public String Z() {
            return this.b.Z();
        }

        @Override // o.InterfaceC5198buI
        public InterfaceC5160btX aE_() {
            return this.b.aE_();
        }

        @Override // o.InterfaceC5198buI
        public boolean aU_() {
            return this.b.aU_();
        }

        @Override // o.InterfaceC5198buI
        public List<TaglineMessage> aa() {
            return this.b.aa();
        }

        @Override // o.InterfaceC5198buI
        public String ab() {
            return this.b.ab();
        }

        @Override // o.InterfaceC5198buI
        public List<TagSummary> ac() {
            return this.b.ac();
        }

        @Override // o.InterfaceC5198buI
        public String ad() {
            return this.b.ad();
        }

        @Override // o.InterfaceC5198buI
        public String ae() {
            return this.b.ae();
        }

        @Override // o.InterfaceC5198buI
        public String af() {
            return this.b.af();
        }

        @Override // o.InterfaceC5198buI
        public int ag() {
            return this.b.ag();
        }

        @Override // o.InterfaceC5198buI
        public List<PersonSummary> ah() {
            return this.b.ah();
        }

        @Override // o.InterfaceC5187bty
        public boolean ai() {
            return this.b.ai();
        }

        @Override // o.InterfaceC5187bty
        public boolean aj() {
            return this.b.aj();
        }

        @Override // o.InterfaceC5187bty
        public boolean ak() {
            return this.b.ak();
        }

        @Override // o.InterfaceC5187bty
        public boolean al() {
            return this.b.al();
        }

        @Override // o.InterfaceC5198buI
        public boolean am() {
            return this.b.am();
        }

        @Override // o.InterfaceC5187bty
        public boolean an() {
            return this.b.an();
        }

        @Override // o.InterfaceC5198buI
        public boolean ao() {
            return this.b.ao();
        }

        @Override // o.InterfaceC5198buI
        public List<PersonSummary> ao_() {
            return this.b.ao_();
        }

        @Override // o.InterfaceC5198buI
        public boolean ap() {
            return this.b.ap();
        }

        @Override // o.InterfaceC5198buI
        public boolean aq() {
            return this.b.aq();
        }

        @Override // o.InterfaceC5187bty
        public boolean ar() {
            return this.b.ar();
        }

        @Override // o.InterfaceC5198buI
        public boolean as() {
            return this.b.as();
        }

        @Override // o.InterfaceC5198buI
        public boolean au() {
            return this.b.au();
        }

        @Override // o.InterfaceC5187bty
        public boolean av() {
            return this.b.av();
        }

        @Override // o.InterfaceC5187bty
        public boolean aw() {
            return this.b.aw();
        }

        @Override // o.InterfaceC5198buI
        public InteractiveSummary az_() {
            return this.b.az_();
        }

        @Override // o.InterfaceC5173btk
        public String bM_() {
            return this.b.bM_();
        }

        @Override // o.InterfaceC5198buI
        public List<PersonSummary> bO_() {
            return this.b.bO_();
        }

        @Override // o.InterfaceC5198buI
        public String bP_() {
            return this.b.bP_();
        }

        @Override // o.InterfaceC5198buI
        public InterfaceC5182btt bQ_() {
            return this.b.bQ_();
        }

        @Override // o.InterfaceC5196buG
        public List<InterfaceC5223buh> bR_() {
            return this.b.bR_();
        }

        @Override // o.InterfaceC5199buJ
        public List<InterfaceC5240buy> bS_() {
            return this.b.bS_();
        }

        @Override // o.InterfaceC5194buE
        public String bU_() {
            return this.b.bU_();
        }

        @Override // o.InterfaceC5194buE
        public int bV_() {
            return this.b.bV_();
        }

        @Override // o.InterfaceC5194buE
        public InterfaceC5231bup bW_() {
            return this.b.bW_();
        }

        @Override // o.InterfaceC5194buE
        public int bX_() {
            return this.b.bX_();
        }

        @Override // o.InterfaceC5198buI
        public String c() {
            return this.b.c();
        }

        @Override // o.InterfaceC5194buE
        public ContextualText d(ContextualText.TextContext textContext) {
            return this.b.d(textContext);
        }

        @Override // o.InterfaceC5198buI
        public ContextualText e(ContextualText.TextContext textContext) {
            return this.b.e(textContext);
        }

        @Override // o.InterfaceC5198buI
        public List<Advisory> e() {
            return this.b.e();
        }

        @Override // o.InterfaceC5223buh
        public String getBoxartId() {
            return this.b.getBoxartId();
        }

        @Override // o.InterfaceC5223buh
        public String getBoxshotUrl() {
            return this.b.getBoxshotUrl();
        }

        @Override // o.InterfaceC5175btm
        public String getId() {
            return this.b.getId();
        }

        @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
        public int getMatchPercentage() {
            return this.b.getMatchPercentage();
        }

        @Override // o.InterfaceC5175btm
        public String getTitle() {
            return this.b.getTitle();
        }

        @Override // o.InterfaceC5175btm
        public VideoType getType() {
            return this.b.getType();
        }

        @Override // o.InterfaceC5175btm
        public String getUnifiedEntityId() {
            return this.b.getUnifiedEntityId();
        }

        @Override // o.InterfaceC5158btV
        public int getUserThumbRating() {
            return this.b.getUserThumbRating();
        }

        @Override // o.InterfaceC5223buh
        public String getVideoMerchComputeId() {
            return this.b.getVideoMerchComputeId();
        }

        @Override // o.InterfaceC5196buG
        public TrackableListSummary h() {
            return this.b.h();
        }

        @Override // o.InterfaceC5151btO
        public boolean isAvailableForDownload() {
            return this.b.isAvailableForDownload();
        }

        @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
        public boolean isAvailableToPlay() {
            return this.b.isAvailableToPlay();
        }

        @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
        public boolean isOriginal() {
            return this.b.isOriginal();
        }

        @Override // o.InterfaceC5151btO
        public boolean isPlayable() {
            return this.b.isPlayable();
        }

        @Override // o.InterfaceC5198buI
        public String j() {
            return this.b.j();
        }

        @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
        public String k() {
            return this.b.k();
        }

        @Override // o.InterfaceC5199buJ
        public TrackableListSummary l() {
            return this.b.l();
        }

        @Override // o.InterfaceC5198buI
        public String m() {
            return this.b.m();
        }

        @Override // o.InterfaceC5198buI
        public ContentWarning o() {
            return this.b.o();
        }

        @Override // o.InterfaceC5198buI
        public String p() {
            return this.b.p();
        }

        @Override // o.InterfaceC5198buI
        public String q() {
            return this.b.q();
        }

        @Override // o.InterfaceC5198buI
        public List<PersonSummary> r() {
            return this.b.r();
        }

        @Override // o.InterfaceC5194buE
        public String t() {
            return this.b.t();
        }

        @Override // o.InterfaceC5194buE
        public int u() {
            return this.b.u();
        }

        @Override // o.InterfaceC5198buI
        public String v() {
            return this.b.v();
        }

        @Override // o.InterfaceC5198buI
        public String w() {
            return this.b.w();
        }

        @Override // o.InterfaceC5198buI
        public List<GenreItem> z() {
            return this.b.z();
        }

        b(InterfaceC5194buE interfaceC5194buE, C3731bIo c3731bIo) {
            this.a = interfaceC5194buE;
            this.c = c3731bIo;
            this.b = interfaceC5194buE;
        }

        @Override // o.InterfaceC5194buE
        public List<InterfaceC5195buF> at() {
            int d;
            List<InterfaceC5195buF> at = this.a.at();
            if (at != null) {
                C3731bIo c3731bIo = this.c;
                d = C8572dqo.d(at, 10);
                ArrayList arrayList = new ArrayList(d);
                for (InterfaceC5195buF interfaceC5195buF : at) {
                    if (C8632dsu.c((Object) interfaceC5195buF.getId(), (Object) c3731bIo.g().b())) {
                        interfaceC5195buF = new e(interfaceC5195buF, c3731bIo);
                    }
                    arrayList.add(interfaceC5195buF);
                }
                return arrayList;
            }
            return null;
        }

        /* renamed from: o.bIo$b$e */
        /* loaded from: classes4.dex */
        public static final class e implements InterfaceC5195buF {
            final /* synthetic */ InterfaceC5195buF b;
            private final /* synthetic */ InterfaceC5195buF c;
            final /* synthetic */ C3731bIo d;

            @Override // o.InterfaceC5195buF
            public int D_() {
                return this.c.D_();
            }

            @Override // o.InterfaceC5195buF
            public String cd_() {
                return this.c.cd_();
            }

            @Override // o.InterfaceC5195buF
            public String ch_() {
                return this.c.ch_();
            }

            @Override // o.InterfaceC5175btm
            public String getId() {
                return this.c.getId();
            }

            @Override // o.InterfaceC5175btm
            public String getTitle() {
                return this.c.getTitle();
            }

            @Override // o.InterfaceC5175btm
            public VideoType getType() {
                return this.c.getType();
            }

            @Override // o.InterfaceC5175btm
            public String getUnifiedEntityId() {
                return this.c.getUnifiedEntityId();
            }

            @Override // o.InterfaceC5195buF
            public int x() {
                return this.c.x();
            }

            e(InterfaceC5195buF interfaceC5195buF, C3731bIo c3731bIo) {
                this.b = interfaceC5195buF;
                this.d = c3731bIo;
                this.c = interfaceC5195buF;
            }

            @Override // o.InterfaceC5195buF
            public List<InterfaceC5227bul> cf_() {
                List<InterfaceC5227bul> g;
                List<InterfaceC5227bul> cf_ = this.b.cf_();
                if (cf_ == null) {
                    cf_ = C8569dql.i();
                }
                g = C8576dqs.g((Collection) cf_, (Iterable) this.d.g().e());
                return g;
            }

            @Override // o.InterfaceC5195buF
            public C5239bux cg_() {
                return this.d.g().d();
            }
        }
    }

    @Override // o.InterfaceC5198buI
    public WatchStatus B_() {
        WatchStatus B_ = this.c.B_();
        C8632dsu.a(B_, "");
        return B_;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(C3731bIo.class, obj != null ? obj.getClass() : null)) {
            C8632dsu.d(obj);
            C3731bIo c3731bIo = (C3731bIo) obj;
            return C8632dsu.c(this.c, c3731bIo.c) && C8632dsu.c(this.a, c3731bIo.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }
}
