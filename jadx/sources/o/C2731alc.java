package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2731alc {
    private static final List<AbstractC9025hm> a;
    public static final C2731alc e = new C2731alc();

    public final List<AbstractC9025hm> e() {
        return a;
    }

    private C2731alc() {
    }

    static {
        List j;
        List e2;
        List e3;
        List e4;
        List e5;
        List e6;
        List e7;
        List e8;
        List e9;
        List e10;
        List e11;
        List e12;
        List e13;
        List e14;
        List e15;
        List e16;
        List e17;
        List e18;
        List e19;
        List e20;
        List e21;
        List e22;
        List e23;
        List e24;
        List e25;
        List e26;
        List e27;
        List e28;
        List e29;
        List e30;
        List e31;
        List e32;
        List e33;
        List e34;
        List e35;
        List e36;
        List e37;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("ABBulkRaterRecommendationRow", "ABBulkRaterRow", "ABLolomoFeedStyleRow", "ABLolomoTudumPromoRow", "ABLolomoWeeklyDropRow", "EclipseBillboardRow", "EclipseContinueWatchingRow", "EclipseGamesRow", "EclipseMediumRow", "EclipseSimilarTitleRow", "EclipseSmallRow", "EclipseSpecialPromotionRow", "EclipseTopTenRow", "LolomoBehindTheScenesRow", "LolomoBillboardRow", "LolomoBillboardSpecialPromotionRow", "LolomoCategoryCraversRow", "LolomoCharacterRow", "LolomoComingSoonRow", "LolomoContainerPageEvidenceRow", "LolomoContinueWatchingRow", "LolomoDefaultGamesRow", "LolomoDefaultRow", "LolomoDownloadsForYouRow", "LolomoFastLaughsRow", "LolomoFavoriteTitlesRow", "LolomoFeedRow", "LolomoFreePlanDeprecationMarkerRow", "LolomoGamesBillboardRow", "LolomoGamesFeatureEducationBillboardOnHomeRow", "LolomoGamesFeatureEducationBillboardRow", "LolomoGamesGenreRow", "LolomoGamesIdentityRow", "LolomoGamesPlaylistRow", "LolomoGamesTrailersRow", "LolomoGenreGalleryRow", "LolomoIPBasedGamesRow", "LolomoJustForYouFeatureEducationRow", "LolomoKidsFavoritesRow", "LolomoKidsFavoritesRowV2", "LolomoMyDownloadsMarkerRow", "LolomoMyListRow", "LolomoMyProfilesMarkerRow", "LolomoMyRemindersRow", "LolomoNotificationMarkerRow", "LolomoPopularGamesRow", "LolomoReadyToPlayGamesRow", "LolomoRecentlyWatchedRow", "LolomoTallPanelRow", "LolomoTopTenFeedRow", "LolomoTopTenRow", "LolomoTrailersYouWatchedRow", "LolomoTrendingNowRow", "LolomoWatchNowRow");
        e2 = C8566dqi.e("LolomoDefaultRow");
        e3 = C8566dqi.e("LolomoContinueWatchingRow");
        e4 = C8566dqi.e("LolomoTallPanelRow");
        e5 = C8566dqi.e("LolomoTopTenRow");
        e6 = C8566dqi.e("LolomoCharacterRow");
        e7 = C8566dqi.e("LolomoKidsFavoritesRowV2");
        e8 = C8566dqi.e("LolomoBillboardRow");
        e9 = C8566dqi.e("LolomoPopularGamesRow");
        e10 = C8566dqi.e("LolomoIPBasedGamesRow");
        e11 = C8566dqi.e("LolomoDownloadsForYouRow");
        e12 = C8566dqi.e("LolomoContainerPageEvidenceRow");
        e13 = C8566dqi.e("LolomoGenreGalleryRow");
        e14 = C8566dqi.e("LolomoGamesBillboardRow");
        e15 = C8566dqi.e("LolomoReadyToPlayGamesRow");
        e16 = C8566dqi.e("LolomoGamesTrailersRow");
        e17 = C8566dqi.e("LolomoGamesFeatureEducationBillboardRow");
        e18 = C8566dqi.e("ABBulkRaterRow");
        e19 = C8566dqi.e("ABBulkRaterRecommendationRow");
        e20 = C8566dqi.e("LolomoFeedRow");
        e21 = C8566dqi.e("LolomoTopTenFeedRow");
        e22 = C8566dqi.e("LolomoDefaultGamesRow");
        e23 = C8566dqi.e("LolomoGamesPlaylistRow");
        e24 = C8566dqi.e("LolomoGamesGenreRow");
        e25 = C8566dqi.e("LolomoGamesIdentityRow");
        e26 = C8566dqi.e("LolomoMyListRow");
        e27 = C8566dqi.e("LolomoTrendingNowRow");
        e28 = C8566dqi.e("LolomoComingSoonRow");
        e29 = C8566dqi.e("LolomoMyRemindersRow");
        e30 = C8566dqi.e("LolomoTrailersYouWatchedRow");
        e31 = C8566dqi.e("LolomoBehindTheScenesRow");
        e32 = C8566dqi.e("LolomoMyProfilesMarkerRow");
        e33 = C8566dqi.e("LolomoMyDownloadsMarkerRow");
        e34 = C8566dqi.e("LolomoFavoriteTitlesRow");
        e35 = C8566dqi.e("LolomoRecentlyWatchedRow");
        e36 = C8566dqi.e("LolomoNotificationMarkerRow");
        e37 = C8566dqi.e("LolomoCategoryCraversRow");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT, C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRow", j).b(C2737ali.a.c()).a(), new C9017he.d("LolomoDefaultRow", e2).b(C2662akM.c.b()).a(), new C9017he.d("LolomoContinueWatchingRow", e3).b(C2653akD.b.d()).a(), new C9017he.d("LolomoTallPanelRow", e4).b(C2739alk.d.a()).a(), new C9017he.d("LolomoTopTenRow", e5).b(C2742aln.b.d()).a(), new C9017he.d("LolomoCharacterRow", e6).b(C2655akF.e.d()).a(), new C9017he.d("LolomoKidsFavoritesRowV2", e7).b(C2668akS.b.c()).a(), new C9017he.d("LolomoBillboardRow", e8).b(C2650akA.d.b()).a(), new C9017he.d("LolomoPopularGamesRow", e9).b(C2732ald.a.b()).a(), new C9017he.d("LolomoIPBasedGamesRow", e10).b(C2670akU.a.d()).a(), new C9017he.d("LolomoDownloadsForYouRow", e11).b(C2658akI.a.c()).a(), new C9017he.d("LolomoContainerPageEvidenceRow", e12).b(C2657akH.b.b()).a(), new C9017he.d("LolomoGenreGalleryRow", e13).b(C2672akW.d.a()).a(), new C9017he.d("LolomoGamesBillboardRow", e14).b(C2667akR.b.e()).a(), new C9017he.d("LolomoReadyToPlayGamesRow", e15).b(C2733ale.b.c()).a(), new C9017he.d("LolomoGamesTrailersRow", e16).b(C2669akT.c.a()).a(), new C9017he.d("LolomoGamesFeatureEducationBillboardRow", e17).b(C2664akO.b.d()).a(), new C9017he.d("ABBulkRaterRow", e18).b(C2640ajr.a.d()).a(), new C9017he.d("ABBulkRaterRecommendationRow", e19).b(C2643aju.d.e()).a(), new C9017he.d("LolomoFeedRow", e20).b(C2661akL.c.a()).a(), new C9017he.d("LolomoTopTenFeedRow", e21).b(C2745alq.b.a()).a(), new C9017he.d("LolomoDefaultGamesRow", e22).b(C2659akJ.c.b()).a(), new C9017he.d("LolomoGamesPlaylistRow", e23).b(C2671akV.b.b()).a(), new C9017he.d("LolomoGamesGenreRow", e24).b(C2663akN.c.c()).a(), new C9017he.d("LolomoGamesIdentityRow", e25).b(C2665akP.c.b()).a(), new C9017he.d("LolomoMyListRow", e26).b(C2675akZ.d.e()).a(), new C9017he.d("LolomoTrendingNowRow", e27).b(C2744alp.c.b()).a(), new C9017he.d("LolomoComingSoonRow", e28).b(C2656akG.d.c()).a(), new C9017he.d("LolomoMyRemindersRow", e29).b(C2730alb.c.b()).a(), new C9017he.d("LolomoTrailersYouWatchedRow", e30).b(C2743alo.c.d()).a(), new C9017he.d("LolomoBehindTheScenesRow", e31).b(C2651akB.d.c()).a(), new C9017he.d("LolomoMyProfilesMarkerRow", e32).b(C2729ala.d.a()).a(), new C9017he.d("LolomoMyDownloadsMarkerRow", e33).b(C2674akY.e.d()).a(), new C9017he.d("LolomoFavoriteTitlesRow", e34).b(C2660akK.e.a()).a(), new C9017he.d("LolomoRecentlyWatchedRow", e35).b(C2734alf.b.d()).a(), new C9017he.d("LolomoNotificationMarkerRow", e36).b(C2673akX.c.c()).a(), new C9017he.d("LolomoCategoryCraversRow", e37).b(C2654akE.e.a()).a());
        a = j2;
    }
}
