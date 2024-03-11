package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2951apk;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2734alf {
    private static final List<AbstractC9025hm> a;
    public static final C2734alf b = new C2734alf();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> l;
    private static final List<AbstractC9025hm> n;

    public final List<AbstractC9025hm> d() {
        return l;
    }

    private C2734alf() {
    }

    static {
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e3;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List<C9021hi> e4;
        List<C9021hi> e5;
        List<AbstractC9025hm> j8;
        List e6;
        List j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List<AbstractC9025hm> j12;
        List<AbstractC9025hm> j13;
        List j14;
        List<C9021hi> j15;
        List<AbstractC9025hm> j16;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf d4 = new C9018hf.a("number", cVar.d()).d();
        C9018hf.a aVar = new C9018hf.a("numberLabelV2", eVar.e());
        e2 = C8566dqi.e(new C9021hi.d("label").b("ABBR").b());
        j2 = C8569dql.j(d2, d3, d4, aVar.b(e2).d());
        j = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j3).b(C2794amm.d.c()).a());
        g = j4;
        C9018hf d5 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf d6 = new C9018hf.a("number", cVar.d()).d();
        C9018hf.a c2 = new C9018hf.a("hasTitleBehavior", C2945ape.b.b()).c("hiddenEpisodeNumbers");
        e3 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j5 = C8569dql.j(d5, d6, c2.b(e3).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j2).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j4).d());
        i = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        a = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        e = j7;
        C9018hf d7 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C2951apk.b bVar = C2951apk.b;
        C9018hf.a c3 = new C9018hf.a("artwork", bVar.b()).c("artwork");
        e4 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForRecentlyWatchedRowBoxart")).b());
        C9018hf d8 = c3.b(e4).e(j6).d();
        C9018hf.a c4 = new C9018hf.a("artwork", bVar.b()).c("titleTreatment");
        e5 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForRecentlyWatchedRowTitleTreatment")).b());
        j8 = C8569dql.j(d7, d8, c4.b(e5).e(j7).d());
        h = j8;
        e6 = C8566dqi.e("Episode");
        j9 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e6).b(j5).a(), new C9017he.d("Video", j9).b(j8).a());
        n = j10;
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("reference", C2978aqK.d.b()).e(j10).d());
        f = j11;
        j12 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2977aqJ.c.e()).e(j11).d());
        c = j12;
        j13 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2976aqI.b.a())).e(j12).d());
        d = j13;
        j14 = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        C9018hf.a c5 = new C9018hf.a("entitiesConnection", C2975aqH.e.d()).c("recentlyWatchedEntities");
        j15 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j16 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j14).b(C2741alm.e.e()).a(), c5.b(j15).e(j13).d());
        l = j16;
    }
}
