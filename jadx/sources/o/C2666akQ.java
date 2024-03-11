package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2666akQ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2666akQ e = new C2666akQ();
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> k;
    private static final List<AbstractC9025hm> l;
    private static final List<AbstractC9025hm> m;
    private static final List<AbstractC9025hm> n;

    public final List<AbstractC9025hm> d() {
        return n;
    }

    private C2666akQ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e5;
        List e6;
        List<AbstractC9025hm> e7;
        List e8;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e9;
        List e10;
        List<AbstractC9025hm> e11;
        List e12;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> e13;
        List e14;
        List e15;
        List e16;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List j9;
        List<C9021hi> j10;
        List<AbstractC9025hm> j11;
        e2 = C8566dqi.e("Game");
        C9017he.d dVar = new C9017he.d("Game", e2);
        C2683akh c2683akh = C2683akh.e;
        e3 = C8566dqi.e(dVar.b(c2683akh.a()).a());
        c = e3;
        C2954apn.e eVar = C2954apn.c;
        e4 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e4).b(e3).a());
        m = j2;
        e5 = C8566dqi.e(new C9018hf.a("reference", C3002aqi.e.e()).e(j2).d());
        i = e5;
        e6 = C8566dqi.e("Game");
        e7 = C8566dqi.e(new C9017he.d("Game", e6).b(c2683akh.a()).a());
        f = e7;
        e8 = C8566dqi.e("Game");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e8).b(e7).a());
        k = j3;
        e9 = C8566dqi.e(new C9018hf.a("reference", C2933apS.b.c()).e(j3).d());
        j = e9;
        e10 = C8566dqi.e("Game");
        e11 = C8566dqi.e(new C9017he.d("Game", e10).b(c2683akh.a()).a());
        h = e11;
        e12 = C8566dqi.e("Game");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e12).b(e11).a());
        l = j4;
        e13 = C8566dqi.e(new C9018hf.a("reference", C3011aqr.c.c()).e(j4).d());
        g = e13;
        e14 = C8566dqi.e("LolomoDefaultNode");
        e15 = C8566dqi.e("LolomoBillboardNode");
        e16 = C8566dqi.e("LolomoGameNode");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoDefaultNode", e14).b(e5).a(), new C9017he.d("LolomoBillboardNode", e15).b(e9).a(), new C9017he.d("LolomoGameNode", e16).b(e13).a());
        d = j5;
        j6 = C8569dql.j("ABBulkRaterRecommendationRowEntitiesEdge", "EclipseBillboardEntitiesEdge", "EclipseContinueWatchingEntitiesEdge", "EclipseDefaultEntitiesEdge", "EclipseGamesEntitiesEdge", "EclipseSimilarTitleEntitiesEdge", "EclipseSpecialPromotionEntitiesEdge", "EclipseTopTenEntitiesEdge", "LolomoBillboardRowEntitiesEdge", "LolomoCategoryCraversRowEntitiesEdge", "LolomoCharacterRowEntitiesEdge", "LolomoDefaultRowEntitiesEdge", "LolomoFeedRowEntitiesEdge", "LolomoGamesRowEntitiesEdge", "LolomoIPBasedGamesRowEntitiesEdge", "LolomoKidsFavoritesRowEntitiesEdge", "LolomoRecentlyWatchedRowEntitiesEdge", "LolomoTrailerRowEntitiesEdge");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("index", C2949api.a.d()).d(), new C9017he.d("LolomoRowEntitiesEdge", j6).b(C2681akf.d.c()).a(), new C9018hf.a("node", C2974aqG.d.c()).e(j5).d());
        b = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2982aqO.e.c())).e(j7).d());
        a = j8;
        j9 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3009aqp.e.e()).c("gameEntities");
        j10 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j9).b(C2737ali.a.c()).a(), c2.b(j10).e(j8).d());
        n = j11;
    }
}
