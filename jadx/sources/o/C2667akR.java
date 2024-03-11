package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2667akR {
    private static final List<AbstractC9025hm> a;
    public static final C2667akR b = new C2667akR();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return j;
    }

    private C2667akR() {
    }

    static {
        List<AbstractC9025hm> j2;
        Map b2;
        List<C9021hi> e2;
        List<AbstractC9025hm> j3;
        List e3;
        List e4;
        List e5;
        List e6;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List j8;
        List<C9021hi> j9;
        List<AbstractC9025hm> j10;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j2 = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.LANG_ID, cVar.d()).d(), new C9018hf.a("displayName", eVar.e()).d());
        f = j2;
        C9018hf d3 = new C9018hf.a("gameId", C9019hg.d(cVar.d())).d();
        C9018hf.a aVar = new C9018hf.a("tags", C9019hg.a((AbstractC9026hn) C2881aoT.b.c()));
        C9021hi.d dVar = new C9021hi.d("tagsCriteria");
        b2 = dqD.b(dpD.a("tagsRecipe", "GAME_EVEN_MIX"));
        e2 = C8566dqi.e(dVar.b(b2).b());
        j3 = C8569dql.j(d3, aVar.b(e2).e(j2).d(), new C9018hf.a("isInPlaylist", C2945ape.b.b()).d());
        e = j3;
        e3 = C8566dqi.e("Game");
        e4 = C8566dqi.e("Game");
        e5 = C8566dqi.e("Game");
        e6 = C8566dqi.e("Game");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e3).b(C2677akb.d.e()).a(), new C9017he.d("Game", e4).b(C2680ake.d.c()).a(), new C9017he.d("Game", e5).b(j3).a(), new C9017he.d("Game", e6).b(C2685akj.d.b()).a());
        g = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("reference", C2933apS.b.c()).e(j4).d());
        d = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2938apX.b.b()).e(j5).d(), new C9018hf.a("impressionToken", eVar.e()).d());
        a = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2939apY.c.a())).e(j6).d());
        c = j7;
        j8 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C2994aqa.e.b()).c("gameBillboardEntities");
        j9 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j8).b(C2666akQ.e.d()).a(), c2.b(j9).e(j7).d());
        j = j10;
    }
}
