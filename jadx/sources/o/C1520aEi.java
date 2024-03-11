package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.graphql.models.type.GameOrientation;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.GameTagRecipe;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.GameInfo;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TrackableListSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import com.netflix.model.leafs.originals.TagSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import o.C1375Yz;
import o.C2331aeI;
import o.C2335aeM;
import o.C2337aeO;
import o.C2340aeR;
import o.C2344aeV;

/* renamed from: o.aEi  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1520aEi implements GameDetails, InterfaceC5137btA, InterfaceC5144btH, InterfaceC5138btB {
    private final C1375Yz.c b;
    private final C1375Yz.g e;

    /* renamed from: o.aEi$b */
    /* loaded from: classes6.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ThumbRating.values().length];
            try {
                iArr[ThumbRating.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThumbRating.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThumbRating.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThumbRating.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ThumbRating.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            c = iArr;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String G() {
        return null;
    }

    @Override // o.InterfaceC5141btE
    public List<TagSummary> e(GameTagRecipe gameTagRecipe) {
        C8632dsu.c((Object) gameTagRecipe, "");
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return true;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return false;
    }

    @Override // o.InterfaceC5139btC
    public RecommendedTrailer l() {
        return null;
    }

    public C1520aEi(C1375Yz.g gVar, C1375Yz.c cVar) {
        C8632dsu.c((Object) gVar, "");
        C8632dsu.c((Object) cVar, "");
        this.e = gVar;
        this.b = cVar;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String B() {
        return this.e.s();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String t() {
        C1375Yz.b c2 = this.e.c();
        if (c2 != null) {
            return c2.d();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String z() {
        C1375Yz.a d2 = this.e.d();
        String c2 = d2 != null ? d2.c() : null;
        return c2 == null ? "" : c2;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String d() {
        return this.e.b();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer v() {
        C1375Yz.a d2 = this.e.d();
        if (d2 != null) {
            return d2.e();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer x() {
        C1375Yz.a d2 = this.e.d();
        if (d2 != null) {
            return d2.a();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String I() {
        return this.e.q();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer A() {
        return this.e.l();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> D() {
        List<String> d2;
        List<String> G;
        C1375Yz.a d3 = this.e.d();
        if (d3 == null || (d2 = d3.d()) == null) {
            return null;
        }
        G = C8576dqs.G(d2);
        return G;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> c() {
        C1375Yz.a d2 = this.e.d();
        if (d2 != null) {
            return d2.b();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> u() {
        List<String> G;
        List<String> n = this.e.n();
        if (n != null) {
            G = C8576dqs.G(n);
            return G;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public GameDetails.Orientation C() {
        return this.e.k() == GameOrientation.a ? GameDetails.Orientation.e : GameDetails.Orientation.c;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String q() {
        C1375Yz.a d2 = this.e.d();
        if (d2 != null) {
            return d2.h();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public int E() {
        ThumbRating r = this.e.r();
        int i = r == null ? -1 : b.c[r.ordinal()];
        if (i != -1) {
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                    if (i == 3) {
                        return 1;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    @Override // o.InterfaceC5141btE
    public String j() {
        C2335aeM.d d2 = this.e.g().d();
        if (d2 != null) {
            return d2.a();
        }
        return null;
    }

    @Override // o.InterfaceC5141btE
    public String n() {
        C2335aeM.c e2;
        C2335aeM.b c2 = this.e.g().c();
        if (c2 == null || (e2 = c2.e()) == null) {
            return null;
        }
        return Integer.valueOf(e2.d()).toString();
    }

    @Override // o.InterfaceC5185btw
    public String a() {
        Object x;
        List<C2344aeV.e> e2 = this.e.i().e();
        if (e2 != null) {
            x = C8576dqs.x(e2);
            C2344aeV.e eVar = (C2344aeV.e) x;
            if (eVar != null) {
                return eVar.d();
            }
        }
        return null;
    }

    @Override // o.InterfaceC5185btw
    public String b() {
        C2337aeO.b d2 = this.e.i().d().d();
        if (d2 != null) {
            return d2.c();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = o.C8566dqi.e(r0);
     */
    @Override // o.InterfaceC5185btw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.netflix.model.leafs.advisory.Advisory> e() {
        /*
            r1 = this;
            o.Yz$g r0 = r1.e
            o.aeV r0 = r0.i()
            if (r0 == 0) goto L15
            com.netflix.model.leafs.advisory.ContentAdvisory r0 = r1.c(r0)
            if (r0 == 0) goto L15
            java.util.List r0 = o.C8570dqm.c(r0)
            if (r0 == 0) goto L15
            goto L19
        L15:
            java.util.List r0 = o.C8570dqm.c()
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1520aEi.e():java.util.List");
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.e.f());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String t = this.e.t();
        return t == null ? "" : t;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.GAMES;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.i().b();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        C2331aeI.a a = this.e.a().a();
        if (a != null) {
            return a.b();
        }
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        C2331aeI.a a = this.e.a().a();
        if (a != null) {
            return a.d();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String k() {
        C2340aeR.c c2 = this.e.h().c();
        if (c2 != null) {
            return c2.a();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer i() {
        C2340aeR.c c2 = this.e.h().c();
        if (c2 != null) {
            return c2.e();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer f() {
        C2340aeR.c c2 = this.e.h().c();
        if (c2 != null) {
            return c2.c();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer o() {
        C2340aeR.c c2 = this.e.h().c();
        if (c2 != null) {
            return c2.d();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String h() {
        C2340aeR.c c2 = this.e.h().c();
        if (c2 != null) {
            return c2.b();
        }
        return null;
    }

    @Override // o.InterfaceC5146btJ
    public boolean m() {
        Boolean d2 = this.e.j().d();
        if (d2 != null) {
            return d2.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5146btJ
    public String g() {
        return String.valueOf(this.e.j().b());
    }

    /* renamed from: o.aEi$c */
    /* loaded from: classes6.dex */
    public static final class c implements ContentAdvisory {
        final /* synthetic */ C2337aeO.b e;

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getBroadcastDistributorName() {
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getBroadcastReleaseDate() {
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getCertSystemConfirmationId() {
            return null;
        }

        c(C2337aeO.b bVar) {
            this.e = bVar;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public AdvisoryBoard getAdvisoryBoard() {
            C2337aeO.b bVar = this.e;
            String e = bVar != null ? bVar.e() : null;
            if (e != null) {
                return AdvisoryBoard.getAdvisoryBoard(e);
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingId() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingDescription() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.h();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingShortDescription() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.g();
            }
            return null;
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

        @Override // com.netflix.model.leafs.advisory.Advisory
        public Advisory.Type getType() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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
            Integer f;
            C2337aeO.b bVar = this.e;
            if (bVar == null || (f = bVar.f()) == null) {
                return null;
            }
            return f.toString();
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getRatingIconValue() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getI18nRating() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getI18nAdvisories() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        /* renamed from: o.aEi$c$d */
        /* loaded from: classes6.dex */
        public static final class d implements ContentAdvisoryIcon {
            final /* synthetic */ C2337aeO.a d;

            d(C2337aeO.a aVar) {
                this.d = aVar;
            }

            @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
            public String getText() {
                C2337aeO.a aVar = this.d;
                String e = aVar != null ? aVar.e() : null;
                return e == null ? "" : e;
            }

            @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
            public String getId() {
                Integer b;
                C2337aeO.a aVar = this.d;
                String num = (aVar == null || (b = aVar.b()) == null) ? null : b.toString();
                return num == null ? "" : num;
            }
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public List<ContentAdvisoryIcon> getIcons() {
            List<ContentAdvisoryIcon> i;
            List<C2337aeO.a> j;
            List<ContentAdvisoryIcon> U;
            C2337aeO.b bVar = this.e;
            if (bVar != null && (j = bVar.j()) != null) {
                ArrayList arrayList = new ArrayList();
                for (C2337aeO.a aVar : j) {
                    arrayList.add(new d(aVar));
                }
                U = C8576dqs.U(arrayList);
                if (U != null) {
                    return U;
                }
            }
            i = C8569dql.i();
            return i;
        }
    }

    private final ContentAdvisory c(C2344aeV c2344aeV) {
        return new c(c2344aeV.d().d());
    }

    @Override // o.InterfaceC5137btA
    public List<GameInfo.GameScreenshot> p() {
        List<GameInfo.GameScreenshot> i;
        int d2;
        List<GameInfo.GameScreenshot> U;
        List<GameInfo.GameScreenshot> i2;
        int d3;
        List<GameInfo.GameScreenshot> U2;
        if (this.e.k() == GameOrientation.a) {
            List<C1375Yz.i> o2 = this.e.o();
            if (o2 != null) {
                d3 = C8572dqo.d(o2, 10);
                ArrayList arrayList = new ArrayList(d3);
                for (C1375Yz.i iVar : o2) {
                    arrayList.add(a(iVar));
                }
                U2 = C8576dqs.U(arrayList);
                if (U2 != null) {
                    return U2;
                }
            }
            i2 = C8569dql.i();
            return i2;
        }
        List<C1375Yz.o> v = this.e.v();
        if (v != null) {
            d2 = C8572dqo.d(v, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (C1375Yz.o oVar : v) {
                arrayList2.add(c(oVar));
            }
            U = C8576dqs.U(arrayList2);
            if (U != null) {
                return U;
            }
        }
        i = C8569dql.i();
        return i;
    }

    /* renamed from: o.aEi$e */
    /* loaded from: classes6.dex */
    public static final class e implements GameInfo.GameScreenshot {
        final /* synthetic */ C1375Yz.i c;

        e(C1375Yz.i iVar) {
            this.c = iVar;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
        public String getScreenshotUrl() {
            return this.c.c();
        }

        @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
        public String getScreenshotKey() {
            return this.c.d();
        }
    }

    private final GameInfo.GameScreenshot a(C1375Yz.i iVar) {
        return new e(iVar);
    }

    /* renamed from: o.aEi$d */
    /* loaded from: classes6.dex */
    public static final class d implements GameInfo.GameScreenshot {
        final /* synthetic */ C1375Yz.o e;

        d(C1375Yz.o oVar) {
            this.e = oVar;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
        public String getScreenshotUrl() {
            return this.e.b();
        }

        @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
        public String getScreenshotKey() {
            return this.e.c();
        }
    }

    private final GameInfo.GameScreenshot c(C1375Yz.o oVar) {
        return new d(oVar);
    }

    @Override // o.InterfaceC5138btB
    public List<InterfaceC5185btw> r() {
        List<InterfaceC5185btw> i;
        List<InterfaceC5185btw> U;
        C2344aeV e2;
        C2331aeI b2;
        List<C1375Yz.n> m = this.e.m();
        if (m != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : m) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                C1375Yz.n nVar = (C1375Yz.n) obj;
                C1514aEc c1514aEc = null;
                if (nVar != null && (e2 = nVar.e()) != null && (b2 = nVar.b()) != null) {
                    C2331aeI.a a = b2.a();
                    String b3 = a != null ? a.b() : null;
                    C2331aeI.a a2 = b2.a();
                    c1514aEc = new C1514aEc(null, i2, e2, b3, a2 != null ? a2.d() : null);
                }
                if (c1514aEc != null) {
                    arrayList.add(c1514aEc);
                }
                i2++;
            }
            U = C8576dqs.U(arrayList);
            if (U != null) {
                return U;
            }
        }
        i = C8569dql.i();
        return i;
    }

    @Override // o.InterfaceC5138btB
    public TrackableListSummary s() {
        return new C1522aEk(this.b, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = o.C8576dqs.G(r0);
     */
    @Override // o.InterfaceC5144btH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<o.InterfaceC5224bui> w() {
        /*
            r4 = this;
            o.Yz$g r0 = r4.e
            o.Yz$l r0 = r0.p()
            if (r0 == 0) goto L3f
            java.util.List r0 = r0.c()
            if (r0 == 0) goto L3f
            java.util.List r0 = o.C8570dqm.e(r0)
            if (r0 == 0) goto L3f
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = o.C8570dqm.a(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            o.Yz$d r2 = (o.C1375Yz.d) r2
            o.aEP r3 = new o.aEP
            r3.<init>(r2)
            r1.add(r3)
            goto L23
        L38:
            java.util.List r0 = o.C8570dqm.w(r1)
            if (r0 == 0) goto L3f
            goto L43
        L3f:
            java.util.List r0 = o.C8570dqm.c()
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1520aEi.w():java.util.List");
    }

    @Override // o.InterfaceC5144btH
    public TrackableListSummary y() {
        C1375Yz.l p = this.e.p();
        if (p != null) {
            return new C1523aEl(this.b, p);
        }
        return null;
    }
}
