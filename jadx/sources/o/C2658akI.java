package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2658akI {
    public static final C2658akI a = new C2658akI();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2658akI() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List j4;
        List<C9020hh> e2;
        List<C9021hi> j5;
        List<AbstractC9025hm> j6;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("ABBulkRaterRecommendationRowEntitiesEdge", "EclipseBillboardEntitiesEdge", "EclipseContinueWatchingEntitiesEdge", "EclipseDefaultEntitiesEdge", "EclipseGamesEntitiesEdge", "EclipseSimilarTitleEntitiesEdge", "EclipseSpecialPromotionEntitiesEdge", "EclipseTopTenEntitiesEdge", "LolomoBillboardRowEntitiesEdge", "LolomoCategoryCraversRowEntitiesEdge", "LolomoCharacterRowEntitiesEdge", "LolomoDefaultRowEntitiesEdge", "LolomoFeedRowEntitiesEdge", "LolomoGamesRowEntitiesEdge", "LolomoIPBasedGamesRowEntitiesEdge", "LolomoKidsFavoritesRowEntitiesEdge", "LolomoRecentlyWatchedRowEntitiesEdge", "LolomoTrailerRowEntitiesEdge");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRowEntitiesEdge", j).b(C2607ajK.d.e()).a());
        d = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3010aqq.d.c())).e(j2).d());
        b = j3;
        j4 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c = new C9018hf.a("entitiesConnection", C3005aql.e.e()).c("firstEntity");
        e2 = C8566dqi.e(new C9020hh("isHorizontalPagination", true));
        C9018hf.a c2 = c.c(e2);
        j5 = C8569dql.j(new C9021hi.d("after").b(null).b(), new C9021hi.d("first").b(1).b());
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j4).b(C2741alm.e.e()).a(), c2.b(j5).e(j3).d());
        e = j6;
    }
}
