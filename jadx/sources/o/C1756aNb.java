package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: o.aNb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1756aNb implements InterfaceC1757aNc {
    private final InterfaceC1757aNc c;
    private final long e = System.nanoTime();

    private Status d(Status status) {
        return status;
    }

    public C1756aNb(InterfaceC1757aNc interfaceC1757aNc) {
        this.c = interfaceC1757aNc;
    }

    private void b(String str) {
        TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e, TimeUnit.NANOSECONDS);
    }

    @Override // o.InterfaceC1757aNc
    public void h(List<LoMo> list, Status status) {
        b("onLoMosFetched");
        this.c.h(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void d(List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
        b("onCWVideosFetched");
        this.c.d(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void a(List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status) {
        b("onBBVideosFetched");
        this.c.a(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void n(List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status) {
        b("onTallPanelVideosFetched");
        this.c.n(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(InterfaceC5190buA interfaceC5190buA, Status status) {
        b("onPostPlayVideosFetched");
        this.c.b(interfaceC5190buA, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void k(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        b("onVideosFetched");
        this.c.k(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        b("onFlatGenreVideosFetched");
        this.c.d(listOfMoviesSummary, list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(List<InterfaceC5227bul> list, Status status) {
        b("onEpisodesFetched");
        this.c.b(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void i(List<InterfaceC5195buF> list, Status status) {
        b("onSeasonsFetched");
        this.c.i(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(InterfaceC5156btT interfaceC5156btT, Status status) {
        b("onLoLoMoSummaryFetched");
        this.c.e(interfaceC5156btT, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void d(InterfaceC5188btz interfaceC5188btz, Status status) {
        b("onVideoSummaryFetched");
        this.c.d(interfaceC5188btz, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void d(InterfaceC8366diy interfaceC8366diy, Status status) {
        b("onFalkorVideoFetched");
        this.c.d(interfaceC8366diy, status);
    }

    @Override // o.InterfaceC1757aNc
    public void a(InterfaceC5238buw interfaceC5238buw, Status status) {
        b("onMovieDetailsFetched");
        this.c.a(interfaceC5238buw, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(int i, Status status) {
        b("onScenePositionFetched");
        this.c.b(i, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status) {
        b("onKidsCharacterDetailsFetched");
        this.c.b(interfaceC5230buo, bool, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
        b("onEpisodeDetailsFetched");
        this.c.a(interfaceC5227bul, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void c(InterfaceC5194buE interfaceC5194buE, Status status) {
        b("onShowDetailsFetched");
        this.c.c(interfaceC5194buE, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status) {
        b("onShowDetailsAndSeasonsFetched");
        this.c.e(interfaceC5194buE, list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void j(List<GenreItem> list, Status status) {
        b("onGenreListsFetched");
        this.c.j(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(InterfaceC5157btU interfaceC5157btU, Status status) {
        b("onVideoRatingSet");
        this.c.b(interfaceC5157btU, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(Status status) {
        b("onQueueAdd");
        this.c.e(d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(Status status) {
        b("onQueueRemove");
        this.c.b(d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void a(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
        b("onSearchResultsFetched");
        this.c.a(interfaceC5275bvg, d(status), z);
    }

    @Override // o.InterfaceC1757aNc
    public void c(NotificationsListSummary notificationsListSummary, Status status) {
        b("onNotificationsListFetched");
        this.c.c(notificationsListSummary, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(NotificationSummaryItem notificationSummaryItem, Status status) {
        b("onNotificationSummaryFetched");
        this.c.e(notificationSummaryItem, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void g(List<NotificationSummaryItem> list, Status status) {
        b("onNotificationsMarkedAsRead");
        this.c.g(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(List<Advisory> list, Status status) {
        b("onAdvisoriesFetched");
        this.c.e(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void e(Map<String, Boolean> map, Status status) {
        b("onOfflineGeoPlayabilityReceived");
        this.c.e(map, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void l(List<InterfaceC8366diy> list, Status status) {
        b("onSimsFetched");
        this.c.l(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void c(List<InterfaceC5184btv> list, Status status) {
        b("onDownloadedForYouFetched");
        this.c.c(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void a(boolean z, Status status) {
        b("onBooleanResponse");
        this.c.a(z, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(InteractiveMoments interactiveMoments, Status status) {
        b("onInteractiveMomentsFetched");
        this.c.b(interactiveMoments, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void f(List<InteractiveDebugMenuItem> list, Status status) {
        b("onInteractiveDebugMenuItemsFetched");
        this.c.f(list, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void b(StateHistory stateHistory, Status status) {
        b("onInteractiveDebugMenuItemsFetched");
        this.c.b(stateHistory, d(status));
    }

    @Override // o.InterfaceC1757aNc
    public void a(InterfaceC5198buI interfaceC5198buI, Status status) {
        b("onVideoSharingInfoFetched");
        this.c.a(interfaceC5198buI, d(status));
    }
}
