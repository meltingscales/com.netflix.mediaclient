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
import java.util.Properties;

/* renamed from: o.btf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5168btf implements InterfaceC5133bsx {
    public static final int $stable = 0;

    @Override // o.InterfaceC5133bsx
    public void onAccountDataFetched(int i, AccountData accountData, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onAdvisoriesFetched(int i, List<? extends Advisory> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public void onAllProfilesAuthorizationCredentialsFetched(int i, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public void onAllocateABTestCompleted(int i, int i2, Integer num, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onAutoLoginTokenCreated(int i, String str, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onAvailableAvatarsListFetched(int i, List<? extends AvatarInfo> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onBBVideosFetched(int i, List<? extends InterfaceC5222bug<InterfaceC5180btr>> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onBooleanResponse(int i, boolean z, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onCWVideosFetched(int i, List<? extends InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onDownloadedForYouFetched(int i, List<? extends InterfaceC5184btv> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onEpisodeDetailsFetched(int i, InterfaceC5227bul interfaceC5227bul, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onEpisodesFetched(int i, List<? extends InterfaceC5227bul> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onFalkorVideoFetched(int i, InterfaceC8366diy interfaceC8366diy, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onFlatGenreVideosFetched(int i, ListOfMoviesSummary listOfMoviesSummary, List<? extends InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onGenreListsFetched(int i, List<? extends GenreItem> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onInteractiveDebugMenuItemsFetched(int i, List<? extends InteractiveDebugMenuItem> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onInteractiveMomentsFetched(int i, InteractiveMoments interactiveMoments, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onInteractiveResetStateFetched(int i, StateHistory stateHistory, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onKidsCharacterDetailsFetched(int i, InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public void onLoLoMoPrefetched(int i, InterfaceC5155btS interfaceC5155btS, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onLoLoMoSummaryFetched(int i, InterfaceC5156btT interfaceC5156btT, Status status) {
        C8632dsu.c((Object) interfaceC5156btT, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onLoMosFetched(int i, List<? extends LoMo> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onLoginComplete(int i, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onLogoutComplete(int i, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onMovieDetailsFetched(int i, InterfaceC5238buw interfaceC5238buw, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onNotificationSummaryFetched(int i, NotificationSummaryItem notificationSummaryItem, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onNotificationsListFetched(int i, NotificationsListSummary notificationsListSummary, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onNotificationsMarkedAsRead(int i, List<NotificationSummaryItem> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onPostPlayVideosFetched(int i, InterfaceC5190buA interfaceC5190buA, Status status) {
        C8632dsu.c((Object) interfaceC5190buA, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onProductChoiceResponse(int i, MembershipChoicesResponse membershipChoicesResponse, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onProfileListUpdateStatus(int i, Status status, AccountData accountData) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onQueueAdd(int i, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onQueueRemove(int i, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onResourceCached(int i, String str, String str2, long j, long j2, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onResourceFetched(int i, String str, String str2, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) status, "");
    }

    public void onResourceRawFetched(int i, String str, byte[] bArr, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onScenePositionFetched(int i, int i2, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onSearchResultsFetched(int i, InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onSeasonsFetched(int i, List<? extends InterfaceC5195buF> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onServiceReady(int i, Status status, String str) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onShowDetailsAndSeasonsFetched(int i, InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5195buF> list, Status status) {
        C8632dsu.c((Object) interfaceC5194buE, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onShowDetailsFetched(int i, InterfaceC5194buE interfaceC5194buE, Status status) {
        C8632dsu.c((Object) interfaceC5194buE, "");
        C8632dsu.c((Object) status, "");
    }

    public void onSimilarVideosFetched(int i, InterfaceC5276bvh interfaceC5276bvh, Status status) {
        C8632dsu.c((Object) interfaceC5276bvh, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onSimsFetched(int i, List<InterfaceC8366diy> list, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onSurveyFetched(int i, Survey survey, Status status) {
        C8632dsu.c((Object) survey, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onTallPanelVideosFetched(int i, List<? extends InterfaceC5222bug<InterfaceC5216bua>> list, Status status) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) status, "");
    }

    public void onTrackableListFetched(int i, List<InterfaceC5281bvm> list, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onUmsSimpleUrlPatternResolved(int i, ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onUpdateProductChoiceResponse(int i, UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
    }

    @Override // o.InterfaceC5133bsx
    public void onVideoRatingSet(int i, InterfaceC5157btU interfaceC5157btU, Status status) {
        C8632dsu.c((Object) interfaceC5157btU, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onVideoSharingInfoFetched(int i, InterfaceC5198buI interfaceC5198buI, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onVideoSummaryFetched(int i, InterfaceC5223buh interfaceC5223buh, Status status) {
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5133bsx
    public void onVideosFetched(int i, List<? extends InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public void onYellowSquarePropertiesResponse(int i, Properties properties, Status status) {
        C8632dsu.c((Object) status, "");
    }
}
