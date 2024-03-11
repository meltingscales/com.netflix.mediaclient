package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2741alm {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2741alm e = new C2741alm();
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> k;
    private static final List<AbstractC9025hm> l;
    private static final List<AbstractC9025hm> m;
    private static final List<AbstractC9025hm> n;

    /* renamed from: o  reason: collision with root package name */
    private static final List<AbstractC9025hm> f13475o;

    public final List<AbstractC9025hm> e() {
        return l;
    }

    private C2741alm() {
    }

    static {
        List j2;
        List j3;
        List<C9020hh> e2;
        List j4;
        List<C9020hh> e3;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> e4;
        List j6;
        List e5;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> e6;
        List j8;
        List j9;
        List<C9020hh> e7;
        List<AbstractC9025hm> j10;
        List j11;
        List<AbstractC9025hm> j12;
        List<AbstractC9025hm> e8;
        List j13;
        List j14;
        List<C9020hh> e9;
        List j15;
        List<C9020hh> e10;
        List<AbstractC9025hm> j16;
        List j17;
        List<AbstractC9025hm> j18;
        List<AbstractC9025hm> e11;
        List e12;
        List e13;
        List e14;
        List<AbstractC9025hm> j19;
        List j20;
        List<AbstractC9025hm> j21;
        List<AbstractC9025hm> j22;
        List j23;
        List<C9021hi> j24;
        List<AbstractC9025hm> j25;
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar = new C9017he.d("Video", j2);
        C2794amm c2794amm = C2794amm.d;
        C9017he a2 = dVar.b(c2794amm.c()).a();
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar2 = new C9017he.d("Video", j3);
        e2 = C8566dqi.e(new C9020hh("includeLiveData", false));
        C9017he.d d2 = dVar2.d(e2);
        C2700aky c2700aky = C2700aky.b;
        C9017he a3 = d2.b(c2700aky.e()).a();
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar3 = new C9017he.d("Video", j4);
        e3 = C8566dqi.e(new C9020hh("includeLiveData", false));
        C9017he.d d3 = dVar3.d(e3);
        C2701akz c2701akz = C2701akz.e;
        j5 = C8569dql.j(a2, a3, d3.b(c2701akz.b()).a());
        j = j5;
        e4 = C8566dqi.e(new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(C2946apf.d.a())).d());
        a = e4;
        C2954apn.e eVar = C2954apn.c;
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e5 = C8566dqi.e("GenericContainer");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j6).b(j5).a(), new C9017he.d("GenericContainer", e5).b(e4).a());
        n = j7;
        e6 = C8566dqi.e(new C9018hf.a("reference", C3002aqi.e.e()).e(j7).d());
        h = e6;
        j8 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a4 = new C9017he.d("Video", j8).b(c2794amm.c()).a();
        j9 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar4 = new C9017he.d("Video", j9);
        e7 = C8566dqi.e(new C9020hh("includeLiveData", false));
        j10 = C8569dql.j(a4, dVar4.d(e7).b(c2700aky.e()).a());
        f = j10;
        j11 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j12 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j11).b(j10).a());
        m = j12;
        e8 = C8566dqi.e(new C9018hf.a("reference", C2933apS.b.c()).e(j12).d());
        i = e8;
        j13 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a5 = new C9017he.d("Video", j13).b(c2794amm.c()).a();
        j14 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar5 = new C9017he.d("Video", j14);
        e9 = C8566dqi.e(new C9020hh("includeLiveData", false));
        C9017he a6 = dVar5.d(e9).b(c2700aky.e()).a();
        j15 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar6 = new C9017he.d("Video", j15);
        e10 = C8566dqi.e(new C9020hh("includeLiveData", false));
        j16 = C8569dql.j(a5, a6, dVar6.d(e10).b(c2701akz.b()).a());
        k = j16;
        j17 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j18 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j17).b(j16).a());
        f13475o = j18;
        e11 = C8566dqi.e(new C9018hf.a("reference", C2978aqK.d.b()).e(j18).d());
        g = e11;
        e12 = C8566dqi.e("LolomoDefaultNode");
        e13 = C8566dqi.e("LolomoBillboardNode");
        e14 = C8566dqi.e("LolomoRecentlyWatchedNode");
        j19 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoDefaultNode", e12).b(e6).a(), new C9017he.d("LolomoBillboardNode", e13).b(e8).a(), new C9017he.d("LolomoRecentlyWatchedNode", e14).b(e11).a());
        b = j19;
        C2949api.c cVar = C2949api.a;
        j20 = C8569dql.j("ABBulkRaterRecommendationRowEntitiesEdge", "EclipseBillboardEntitiesEdge", "EclipseContinueWatchingEntitiesEdge", "EclipseDefaultEntitiesEdge", "EclipseGamesEntitiesEdge", "EclipseSimilarTitleEntitiesEdge", "EclipseSpecialPromotionEntitiesEdge", "EclipseTopTenEntitiesEdge", "LolomoBillboardRowEntitiesEdge", "LolomoCategoryCraversRowEntitiesEdge", "LolomoCharacterRowEntitiesEdge", "LolomoDefaultRowEntitiesEdge", "LolomoFeedRowEntitiesEdge", "LolomoGamesRowEntitiesEdge", "LolomoIPBasedGamesRowEntitiesEdge", "LolomoKidsFavoritesRowEntitiesEdge", "LolomoRecentlyWatchedRowEntitiesEdge", "LolomoTrailerRowEntitiesEdge");
        j21 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("index", cVar.d()).d(), new C9018hf.a("node", C2974aqG.d.c()).e(j19).d(), new C9017he.d("LolomoRowEntitiesEdge", j20).b(C2697akv.a.b()).a(), new C9018hf.a("impressionToken", eVar.e()).d());
        c = j21;
        j22 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2982aqO.e.c())).e(j21).d());
        d = j22;
        j23 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3009aqp.e.e()).c("videoEntities");
        j24 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j25 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j23).b(C2737ali.a.c()).a(), c2.b(j24).e(j22).d());
        l = j25;
    }
}
