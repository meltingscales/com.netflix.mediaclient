package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2951apk;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2670akU {
    public static final C2670akU a = new C2670akU();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> d() {
        return f;
    }

    private C2670akU() {
    }

    static {
        List e2;
        List e3;
        List e4;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e5;
        List<C9021hi> e6;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List j7;
        List<C9021hi> j8;
        List<AbstractC9025hm> j9;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Game");
        e3 = C8566dqi.e("Game");
        e4 = C8566dqi.e("Game");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e2).b(C2682akg.e.b()).a(), new C9017he.d("Game", e3).b(C2685akj.d.b()).a(), new C9017he.d("Game", e4).b(C2680ake.d.c()).a());
        h = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("reference", C3011aqr.c.c()).e(j).d());
        g = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j4;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("node", C3014aqu.a.d()).e(j2).d();
        C2951apk.b bVar = C2951apk.b;
        C9018hf.a aVar = new C9018hf.a("bannerArtwork", bVar.b());
        e5 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForIPBasedGameBanner")).b());
        C9018hf d4 = aVar.b(e5).e(j3).d();
        C9018hf.a aVar2 = new C9018hf.a("logoArtwork", bVar.b());
        e6 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForIPBasedGameLogo")).b());
        j5 = C8569dql.j(d2, d3, d4, aVar2.b(e6).e(j4).d());
        d = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2971aqD.d.e())).e(j5).d());
        e = j6;
        j7 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C2972aqE.d.b()).c("ipBasedGameEntities");
        j8 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j7).b(C2666akQ.e.d()).a(), c2.b(j8).e(j6).d());
        f = j9;
    }
}
