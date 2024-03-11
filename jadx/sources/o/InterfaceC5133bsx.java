package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.survey.Survey;
import java.util.List;

/* renamed from: o.bsx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5133bsx {
    void onAccountDataFetched(int i, AccountData accountData, Status status);

    void onAdvisoriesFetched(int i, List<Advisory> list, Status status);

    void onAutoLoginTokenCreated(int i, String str, Status status);

    void onAvailableAvatarsListFetched(int i, List<AvatarInfo> list, Status status);

    void onBBVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status);

    void onBooleanResponse(int i, boolean z, Status status);

    void onCWVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status);

    void onDownloadedForYouFetched(int i, List<InterfaceC5184btv> list, Status status);

    void onEpisodeDetailsFetched(int i, InterfaceC5227bul interfaceC5227bul, Status status);

    void onEpisodesFetched(int i, List<InterfaceC5227bul> list, Status status);

    void onFalkorVideoFetched(int i, InterfaceC8366diy interfaceC8366diy, Status status);

    void onFlatGenreVideosFetched(int i, ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);

    void onGenreListsFetched(int i, List<GenreItem> list, Status status);

    void onInteractiveDebugMenuItemsFetched(int i, List<InteractiveDebugMenuItem> list, Status status);

    void onInteractiveMomentsFetched(int i, InteractiveMoments interactiveMoments, Status status);

    void onInteractiveResetStateFetched(int i, StateHistory stateHistory, Status status);

    void onKidsCharacterDetailsFetched(int i, InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status);

    void onLoLoMoSummaryFetched(int i, InterfaceC5156btT interfaceC5156btT, Status status);

    void onLoMosFetched(int i, List<LoMo> list, Status status);

    void onLoginComplete(int i, Status status);

    void onLogoutComplete(int i, Status status);

    void onMovieDetailsFetched(int i, InterfaceC5238buw interfaceC5238buw, Status status);

    void onNotificationSummaryFetched(int i, NotificationSummaryItem notificationSummaryItem, Status status);

    void onNotificationsListFetched(int i, NotificationsListSummary notificationsListSummary, Status status);

    void onNotificationsMarkedAsRead(int i, List<NotificationSummaryItem> list, Status status);

    void onPostPlayVideosFetched(int i, InterfaceC5190buA interfaceC5190buA, Status status);

    void onProductChoiceResponse(int i, MembershipChoicesResponse membershipChoicesResponse, Status status);

    void onProfileListUpdateStatus(int i, Status status, AccountData accountData);

    void onQueueAdd(int i, Status status);

    void onQueueRemove(int i, Status status);

    void onResourceCached(int i, String str, String str2, long j, long j2, Status status);

    void onResourceFetched(int i, String str, String str2, Status status);

    void onScenePositionFetched(int i, int i2, Status status);

    void onSearchResultsFetched(int i, InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z);

    void onSeasonsFetched(int i, List<InterfaceC5195buF> list, Status status);

    void onServiceReady(int i, Status status, String str);

    void onShowDetailsAndSeasonsFetched(int i, InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status);

    void onShowDetailsFetched(int i, InterfaceC5194buE interfaceC5194buE, Status status);

    void onSimsFetched(int i, List<InterfaceC8366diy> list, Status status);

    void onSurveyFetched(int i, Survey survey, Status status);

    void onTallPanelVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status);

    void onUmsSimpleUrlPatternResolved(int i, ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status);

    void onUpdateProductChoiceResponse(int i, UpdateProductChoiceResponse updateProductChoiceResponse, Status status);

    void onVideoRatingSet(int i, InterfaceC5157btU interfaceC5157btU, Status status);

    void onVideoSharingInfoFetched(int i, InterfaceC5198buI interfaceC5198buI, Status status);

    void onVideoSummaryFetched(int i, InterfaceC5223buh interfaceC5223buh, Status status);

    void onVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status);
}
