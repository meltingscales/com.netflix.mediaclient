package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C3148atV;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2651akB {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2651akB d = new C2651akB();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> c() {
        return j;
    }

    private C2651akB() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List e3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List e4;
        List e5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        List j10;
        List<C9021hi> j11;
        List<AbstractC9025hm> j12;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("PulseTitleSummary");
        C9017he.d dVar = new C9017he.d("PulseTitleSummary", e2);
        C2791amj c2791amj = C2791amj.d;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), dVar.b(c2791amj.b()).a());
        i = j2;
        C2949api.c cVar = C2949api.a;
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C3148atV.e eVar2 = C3148atV.e;
        j3 = C8569dql.j(d2, new C9018hf.a("tudumTitle", eVar2.c()).e(j2).d());
        e = j3;
        e3 = C8566dqi.e("PulseTitleSummary");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PulseTitleSummary", e3).b(c2791amj.b()).a());
        g = j4;
        j5 = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("tudumTitle", eVar2.c()).e(j4).d());
        h = j5;
        e4 = C8566dqi.e("Movie");
        e5 = C8566dqi.e("Show");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Movie", e4).b(j3).a(), new C9017he.d("Show", e5).b(j5).a());
        f = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("reference", C3002aqi.e.e()).e(j6).d());
        b = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3001aqh.e.e()).e(j7).d());
        c = j8;
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3010aqq.d.c())).e(j8).d());
        a = j9;
        j10 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3005aql.e.e()).c("tudumEntities");
        j11 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j12 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j10).b(C2741alm.e.e()).a(), c2.b(j11).e(j9).d());
        j = j12;
    }
}
