package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aln  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2742aln {
    private static final List<AbstractC9025hm> a;
    public static final C2742aln b = new C2742aln();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> d() {
        return i;
    }

    private C2742aln() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List j6;
        List<C9021hi> j7;
        List<AbstractC9025hm> j8;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j).b(C2786ame.d.b()).a());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("reference", C3002aqi.e.e()).e(j2).d());
        c = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3001aqh.e.e()).e(j3).d());
        d = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3010aqq.d.c())).e(j4).d());
        e = j5;
        j6 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3005aql.e.e()).c("topTenEntities");
        j7 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j6).b(C2741alm.e.e()).a(), c2.b(j7).e(j5).d());
        i = j8;
    }
}
