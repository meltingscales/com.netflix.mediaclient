package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.browse.BrowseDiskCacheCompactionTrigger;
import com.netflix.model.leafs.advisory.ContentAction;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1079Nx;
import o.C5103bsT;

/* renamed from: o.aSx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1913aSx extends aMF implements InterfaceC1912aSw, aSE, IG {
    private static final long b;
    private static final Boolean c;
    private static final Boolean d;
    private InterfaceC0908Hf e;
    private final UserAgent f;
    private boolean g;
    private final aOV h;
    private final InterfaceC5134bsy i;
    private C0953Iy k;
    private final InterfaceC1926aTj l;

    /* renamed from: o  reason: collision with root package name */
    private C0954Iz<C8367diz> f13441o;
    private final a a = new a();
    private final BroadcastReceiver m = new BroadcastReceiver() { // from class: o.aSx.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            C5103bsT.c e = C5103bsT.e(intent);
            if ("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED".equals(action)) {
                if (C8153dex.F()) {
                    return;
                }
                C1913aSx.this.e(e.c, e.h);
            } else if ("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED".equals(action)) {
                C1044Mm.a("FalkorAgent", "Refreshing CW for PLAYER_LOCAL_PLAYBACK_ENDED...");
                if (e.e > -1) {
                    C1913aSx.this.f13441o.a(e.c, e.e, C8170dfN.d());
                }
                if (C5167bte.c(e.a)) {
                    C1913aSx.this.d(false, (String) null);
                }
            }
        }
    };
    private final BroadcastReceiver r = new BroadcastReceiver() { // from class: o.aSx.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            C1044Mm.a("FalkorAgent", "UserAgentIntentReceiver inovoked and received Intent with Action " + intent.getAction());
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(action)) {
                C1913aSx.this.f();
            } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(action)) {
                C1913aSx.this.g();
            } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_TYPE_CHANGED".equals(action)) {
                C1913aSx.this.l();
            } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(action)) {
                C1913aSx.this.j();
            } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_NOT_LOGGED_IN".equals(action)) {
                C1913aSx.this.h();
            } else if ("com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED".equals(action)) {
                C1044Mm.a("FalkorAgent", "BookmarkStore accountDataFetched");
                C1913aSx.this.j.updateValidProfiles(C1913aSx.this.f.b());
            }
        }
    };
    private final Runnable n = new Runnable() { // from class: o.aSB
        @Override // java.lang.Runnable
        public final void run() {
            C1913aSx.this.n();
        }
    };
    private final BookmarkStore j = (BookmarkStore) C1332Xp.b(BookmarkStore.class);

    private boolean m() {
        return this.g;
    }

    @Override // o.aMF
    public String agentName() {
        return "falkor";
    }

    @Override // o.IG
    public BookmarkStore d() {
        return this.j;
    }

    public InterfaceC1240Ub<?> i() {
        return this.f13441o;
    }

    static {
        Boolean bool = Boolean.TRUE;
        d = bool;
        c = Boolean.valueOf(!bool.booleanValue());
        b = TimeUnit.DAYS.toMillis(5L);
    }

    public C1913aSx(aOV aov, UserAgent userAgent, InterfaceC5134bsy interfaceC5134bsy, InterfaceC1926aTj interfaceC1926aTj) {
        this.h = aov;
        this.f = userAgent;
        this.i = interfaceC5134bsy;
        this.l = interfaceC1926aTj;
    }

    @Override // o.aMF
    public void doInit() {
        Context context = getContext();
        GY.d(context);
        C8367diz c8367diz = new C8367diz();
        this.e = GY.c(context, (Gson) C1332Xp.b(Gson.class));
        C0954Iz<C8367diz> c0954Iz = new C0954Iz<>(c8367diz, false, this.e, C0945Iq.b);
        this.f13441o = c0954Iz;
        c8367diz.e(c0954Iz);
        this.k = new C0953Iy(this.f13441o, this);
        this.l.d(this.a);
        C8116deM.a(context, this.r, C5020bqq.b());
        C8116deM.c(context, this.m, "com.netflix.mediaclient.intent.category.PLAYER", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
        initCompleted(InterfaceC1078Nw.aJ);
    }

    @Override // o.aMF
    public void destroy() {
        C8116deM.a(getContext(), this.r);
        C8116deM.a(getContext(), this.m);
        this.l.c(this.a);
        InterfaceC0908Hf interfaceC0908Hf = this.e;
        if (interfaceC0908Hf != null) {
            interfaceC0908Hf.close();
            this.e = null;
        }
        super.destroy();
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.FALKOR_AGENT_LOADED;
    }

    @Override // o.aSE
    public void d(boolean z) {
        this.f13441o.b(z);
    }

    public void e(BrowseDiskCacheCompactionTrigger browseDiskCacheCompactionTrigger) {
        try {
            InterfaceC0914Hl b2 = this.e.b();
            b2.b(System.currentTimeMillis(), b, InterfaceC1659aJm.b.e().e() ? new C1914aSy() : null);
            b2.close();
        } catch (Exception e) {
            InterfaceC1598aHf.a(new C1596aHd().d(e));
        }
    }

    @Override // o.InterfaceC1912aSw
    public aSI c() {
        return aSH.d;
    }

    @Override // o.IG
    public String e() {
        return this.f.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        C1044Mm.a("FalkorAgent", "handleProfileTypeChanged");
        d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        C1044Mm.a("FalkorAgent", "handleAccountNotLoggedIn");
        d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.g = true;
        d(true);
        if (m()) {
            C1044Mm.a("FalkorAgent", "handleProfileActive: Flushing all caches because profile deactivate...");
            d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (m()) {
            C1044Mm.a("FalkorAgent", "handleProfileActive: Flushing all caches because new profile activated...");
            d(false);
        }
        this.g = false;
    }

    @Override // o.InterfaceC1912aSw
    public <T extends IO> void d(T t, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.b((IU) t, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public <T> void d(InterfaceC0986Kf<T> interfaceC0986Kf, InterfaceC1755aNa<T> interfaceC1755aNa) {
        this.k.e((InterfaceC0989Ki) interfaceC0986Kf, interfaceC1755aNa);
    }

    public void d(String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.b(str, i, i2, interfaceC1757aNc);
    }

    public void e(LoMo loMo, int i, int i2, boolean z, InterfaceC1757aNc interfaceC1757aNc, String str) {
        this.k.c(loMo, i, i2, z, false, interfaceC1757aNc, str);
    }

    @Override // o.InterfaceC1912aSw
    public void a(LoMo loMo, int i, int i2, boolean z, InterfaceC1757aNc interfaceC1757aNc, String str) {
        this.k.e(loMo, i, i2, z, interfaceC1757aNc, str);
    }

    public void b(LoMo loMo, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(loMo, i, i2, c.booleanValue(), false, interfaceC1757aNc, "fetchGenreVideos");
    }

    public void e(String str, TaskMode taskMode, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, taskMode, i, i2, interfaceC1757aNc);
    }

    public void c(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.e(str, taskMode, interfaceC1757aNc);
    }

    public void e(int i, int i2, String str, InterfaceC1757aNc interfaceC1757aNc, String str2) {
        this.k.e(i, i2, str, c.booleanValue(), interfaceC1757aNc, str2);
    }

    public void a(int i, int i2, String str, LoMo loMo, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(i, i2, str, loMo, c.booleanValue(), false, interfaceC1757aNc);
    }

    public void c(String str, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.e(str, interfaceC1757aNc);
    }

    public void e(String str, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(str, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public void e(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool) {
        this.k.d(str, str2, false, z, taskMode, interfaceC1757aNc, str3, bool);
    }

    @Override // o.InterfaceC1912aSw
    public void e(String str, String str2, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3) {
        this.k.d(str, str2, false, false, false, taskMode, interfaceC1757aNc, str3, Boolean.FALSE);
    }

    @Override // o.InterfaceC1912aSw
    public void b(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool) {
        c(str, str2, z, false, taskMode, interfaceC1757aNc, str3, bool);
    }

    public void c(String str, String str2, boolean z, boolean z2, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool) {
        this.k.d(str, str2, true, z, false, taskMode, interfaceC1757aNc, str3, bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, taskMode, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public void d(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(str, taskMode, interfaceC1757aNc);
    }

    public void a(String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.a(str, i, i2, interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, TaskMode taskMode, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(str, taskMode, z, interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public void e(String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, videoType, playLocationType, interfaceC1757aNc);
    }

    public void e(String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.a(str, str2, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public void c(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3) {
        this.k.e(str, str2, z, taskMode, interfaceC1757aNc, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(VideoType videoType, String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(videoType, str, str2, interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, VideoType videoType, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.d(str, videoType, i, i2, interfaceC1757aNc);
    }

    public void c(String str, VideoType videoType, int i, String str2, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.a(str, videoType, i, str2, str3, interfaceC1757aNc);
    }

    public void c(String str, VideoType videoType, String str2, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, videoType, str2, str3, interfaceC1757aNc);
    }

    public void b(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map) {
        this.k.d(interfaceC5223buh, billboardInteractionType, map);
    }

    @Override // o.InterfaceC1912aSw
    public void b(String str, ContentAction contentAction) {
        this.k.a(str, contentAction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.b(str, interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, long j) {
        this.f13441o.a(str, j, C8170dfN.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z, final String str) {
        new C1071Np().d(new C1079Nx.b() { // from class: o.aSz
            @Override // o.C1079Nx.b
            public final void run() {
                C1913aSx.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        e(LoMoType.CONTINUE_WATCHING.a(), (String) null, str, "refreshCw");
    }

    @Override // o.InterfaceC1912aSw
    public void e(String str, String str2, String str3, String str4) {
        InterfaceC4004bSr.b(getContext(), str, str2, str3, str4);
    }

    public void a() {
        new C1071Np().d(new C1079Nx.b() { // from class: o.aSF
            @Override // o.C1079Nx.b
            public final void run() {
                C1913aSx.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f13441o.f();
        if (C8153dex.i()) {
            this.f13441o.g();
        }
    }

    public void b(String str) {
        this.f13441o.d(str);
    }

    @Deprecated
    public String b() {
        return this.f13441o.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, VideoType videoType) {
        if (videoType != VideoType.EPISODE) {
            C1044Mm.a("FalkorAgent", "fetchEpisodesForSeason - videoId %s is not an episode - skip!", str);
        } else {
            e(str, new AnonymousClass5(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aSx$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 extends AbstractC1761aNg {
        final /* synthetic */ String e;

        AnonymousClass5(String str) {
            this.e = str;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        public void d(InterfaceC8366diy interfaceC8366diy, Status status) {
            if (interfaceC8366diy == null) {
                if (status == null || status.c() != StatusCode.NET_CRONET_INTERNET_DISCONNECTED) {
                    InterfaceC1598aHf.a("fetchEpisodesForSeason - fetchFalkorVideo - video is null");
                }
            } else if (C8168dfL.g(this.e) || !interfaceC8366diy.aY_() || C8168dfL.g(interfaceC8366diy.aO_())) {
            } else {
                C1913aSx.this.e(interfaceC8366diy.aO_(), interfaceC8366diy.bU_(), TaskMode.FROM_CACHE_OR_NETWORK, new AbstractC1761aNg() { // from class: o.aSx.5.3
                    @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                    public void c(InterfaceC5194buE interfaceC5194buE, Status status2) {
                        if (interfaceC5194buE == null) {
                            return;
                        }
                        String bU_ = interfaceC5194buE.bU_();
                        if (C8168dfL.h(bU_)) {
                            final int u = interfaceC5194buE.u();
                            C1913aSx.this.c(bU_, (String) null, false, TaskMode.FROM_CACHE_OR_NETWORK, (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: o.aSx.5.3.3
                                @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                                public void a(InterfaceC5227bul interfaceC5227bul, Status status3) {
                                    if (interfaceC5227bul == null) {
                                        return;
                                    }
                                    String cc_ = interfaceC5227bul.cc_();
                                    int i = (u / 40) * 40;
                                    C1913aSx.this.e(cc_, TaskMode.FROM_CACHE_OR_NETWORK, i, i + 39, new AbstractC1761aNg() { // from class: o.aSx.5.3.3.3
                                        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                                        public void b(List<InterfaceC5227bul> list, Status status4) {
                                        }
                                    });
                                }
                            }, "FetchEpisodesForSeason");
                        }
                    }
                }, "FetchEpisodesForSeason");
            }
        }
    }

    public void a(InterfaceC1757aNc interfaceC1757aNc) {
        this.k.e(false, interfaceC1757aNc);
    }

    public void d(String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(str, z, interfaceC1757aNc);
    }

    public void a(String str, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(interfaceC1757aNc, str);
    }

    public void e(List<String> list, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.c(interfaceC1757aNc, (String[]) list.toArray(new String[0]));
    }

    @Override // o.InterfaceC1912aSw
    public void e(boolean z, final boolean z2, final boolean z3, final MessageData messageData) {
        if (this.k == null) {
            InterfaceC1598aHf.a("FalkorAgent method called while netflixFalkorTasksDispatcher is null");
            return;
        }
        final String e = e();
        if (e == null) {
            return;
        }
        this.k.e(z, new AbstractC1761aNg() { // from class: o.aSx.4
            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
            public void c(NotificationsListSummary notificationsListSummary, Status status) {
                List<NotificationSummaryItem> notifications;
                if (notificationsListSummary == null || status.c() != StatusCode.OK || (notifications = notificationsListSummary.notifications()) == null) {
                    return;
                }
                NotificationsListStatus a2 = C1913aSx.a(notifications, e);
                NotificationSummaryItem a3 = C1913aSx.a(notifications);
                aSD.a(a2);
                if (z3) {
                    C1913aSx.this.e(notifications);
                }
                if (z2 && C1913aSx.this.c(a3)) {
                    InterfaceC7136cqX a4 = C7085cpZ.a(a3.getNotificationType());
                    if (a4.e()) {
                        a4.b(a3, notificationsListSummary, messageData, C1913aSx.this.getContext());
                    }
                }
            }
        });
        if (this.f.j() != null) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<NotificationSummaryItem> list) {
        AbstractC1761aNg abstractC1761aNg = new AbstractC1761aNg() { // from class: o.aSx.1
            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
            public void c(InterfaceC5194buE interfaceC5194buE, Status status) {
                Object[] objArr = new Object[1];
                objArr[0] = interfaceC5194buE == null ? "null" : interfaceC5194buE.getId();
                C1044Mm.d("FalkorAgent", "RefreshSeasonsAndEpisodes response %s", objArr);
            }
        };
        for (NotificationSummaryItem notificationSummaryItem : list) {
            if (notificationSummaryItem != null && !notificationSummaryItem.read() && notificationSummaryItem.videoId() != null && notificationSummaryItem.getNotificationType() == NotificationTypes.NEW_SEASON_ALERT) {
                C1044Mm.d("FalkorAgent", "RefreshSeasonsAndEpisodes refreshing %s", notificationSummaryItem.videoId());
                this.k.b(new C0997Kq(notificationSummaryItem.videoId(), notificationSummaryItem.videoType() != VideoType.SHOW), abstractC1761aNg);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(NotificationSummaryItem notificationSummaryItem) {
        InterfaceC5134bsy interfaceC5134bsy;
        return (notificationSummaryItem == null || AbstractApplicationC1040Mh.e() || (interfaceC5134bsy = this.i) == null || !interfaceC5134bsy.isOptIn()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (isReady()) {
            e(true, true, false, (MessageData) null);
        }
    }

    private void o() {
        getMainHandler().removeCallbacks(this.n);
        getMainHandler().postDelayed(this.n, 3600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NotificationsListStatus a(List<NotificationSummaryItem> list, String str) {
        if (list.isEmpty()) {
            return NotificationsListStatus.a;
        }
        return new NotificationsListStatus(C8202dft.a(list), list.size(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NotificationSummaryItem a(List<NotificationSummaryItem> list) {
        List e = C8202dft.e(list);
        if (e.size() > 0) {
            return (NotificationSummaryItem) e.get(0);
        }
        return null;
    }

    public void e(String str, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        this.k.a(str, i, i2, z, z2, interfaceC1757aNc);
    }

    @Override // o.InterfaceC1912aSw
    public void d(List<String> list, InterfaceC1757aNc interfaceC1757aNc) {
        if (isReady()) {
            this.k.d(list, interfaceC1757aNc);
        }
    }

    @Override // o.aSE
    public void d(int i) {
        d(i, false, (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: o.aSx.10
            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
            public void k(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
                super.k(list, status);
            }
        });
    }

    @Override // o.InterfaceC1912aSw
    public void d(int i, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        C0953Iy c0953Iy = this.k;
        if (c0953Iy == null) {
            InterfaceC1598aHf.a("FalkorAgent method called while netflixFalkorTasksDispatcher is null");
        } else {
            c0953Iy.b(i - 1, z, interfaceC1757aNc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str, VideoType videoType) {
        this.f13441o.c(str, videoType);
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.N;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_FALKOR;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_FALKOR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aSx$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC1919aTc {
        @Override // o.InterfaceC1919aTc
        public void a() {
        }

        private a() {
        }

        @Override // o.InterfaceC1919aTc
        public void b(int i) {
            C1913aSx.this.k.c(C1913aSx.this.l, this, i, BrowseDiskCacheCompactionTrigger.c);
        }
    }
}
