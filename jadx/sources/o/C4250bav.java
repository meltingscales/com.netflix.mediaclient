package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.DownloadType;
import com.netflix.cl.model.event.session.AddCachedVideoEnded;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.AddCachedVideo;
import com.netflix.cl.model.event.session.action.RemoveCachedVideo;
import com.netflix.cl.model.event.session.action.android.RemoveCachedVideoWithFeature;
import com.netflix.cl.util.CLUtils;
import com.netflix.cl.util.NamedLogSessionLookup;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.service.NetflixPowerManager;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DownloadsEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.agent.IntentCommandGroupType;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import com.netflix.mediaclient.service.offline.registry.PersistRegistryException;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.AbstractC4213baK;
import o.C4214baL;
import o.C4239bak;
import o.C4244bap;
import o.C4252bax;
import o.C4278bbW;
import o.InterfaceC4208baF;
import o.InterfaceC4262bbG;
import o.InterfaceC4290bbi;
import o.InterfaceC4348bcn;
import o.XH;

/* renamed from: o.bav  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4250bav extends aMF implements InterfaceC4348bcn, InterfaceC4208baF, InterfaceC1740aMm, C4239bak.d, C4252bax.d {
    private final InterfaceC5298bwC A;
    private long C;
    private String D;
    private final UserAgent E;
    private final C4278bbW F;
    private final C4278bbW.d G;
    private InterfaceC4251baw H;
    private C9865xz I;
    private d a;
    private HandlerThread c;
    private final aOV f;
    private final Context g;
    private C4239bak h;
    private C4244bap i;
    private final C4390bdc j;
    private final C4244bap.b k;
    private InterfaceC4245baq m;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC4247bas f13562o;
    private int p;
    private final aHJ q;
    private final InterfaceC1926aTj r;
    private final NetflixPowerManager s;
    private C4252bax t;
    private InterfaceC4268bbM u;
    private InterfaceC4262bbG v;
    private C4214baL y;
    private final OfflineRegistryInterface z;
    private final List<InterfaceC4290bbi> x = new ArrayList();
    private boolean B = false;
    @SuppressLint({"UseSparseArrays"})
    private final Map<Long, InterfaceC4348bcn.a> w = new HashMap();
    private boolean b = false;
    private final C4212baJ d = new C4212baJ();
    private final e n = new e();
    private C4260bbE e = new C4260bbE();
    private final XH.d M = new XH.d() { // from class: o.bav.5
        @Override // o.XH.d
        public void d() {
            C4250bav.this.P();
        }
    };
    private final InterfaceC4300bbs l = new InterfaceC4300bbs() { // from class: o.bav.12
        @Override // o.InterfaceC4300bbs
        public void c(InterfaceC4290bbi interfaceC4290bbi, Status status) {
            C1044Mm.c("nf_offlineAgent", "onInitialized playableId=%s status=%s", interfaceC4290bbi.aH_(), status);
            if (C4250bav.this.b) {
                C4250bav.this.d(interfaceC4290bbi.aH_(), status);
            } else {
                C1044Mm.d("nf_offlineAgent", "onInitialized no longer available");
            }
        }

        @Override // o.InterfaceC4300bbs
        public void b(InterfaceC4290bbi interfaceC4290bbi, Status status) {
            C1044Mm.c("nf_offlineAgent", "onNetworkError playableId=%s status=%s", interfaceC4290bbi.aH_(), status);
            C4250bav.this.a(interfaceC4290bbi);
            C4250bav.this.z.d(interfaceC4290bbi.i());
            C4250bav.this.i.e(interfaceC4290bbi.aH_());
        }

        @Override // o.InterfaceC4300bbs
        public void c(InterfaceC4290bbi interfaceC4290bbi) {
            String aH_ = interfaceC4290bbi.aH_();
            C1044Mm.c("nf_offlineAgent", "onDownloadCompletedSuccess playableId=%s", aH_);
            C4250bav.this.z.d(interfaceC4290bbi.i());
            C4250bav.this.c((InterfaceC5206buQ) interfaceC4290bbi);
            C4250bav.this.i.a(aH_);
            C4250bav.this.T();
        }

        @Override // o.InterfaceC4300bbs
        public void d(InterfaceC4290bbi interfaceC4290bbi) {
            C4250bav.this.c(interfaceC4290bbi, interfaceC4290bbi.aD_());
        }

        @Override // o.InterfaceC4300bbs
        public void a() {
            C4250bav.this.R();
        }

        @Override // o.InterfaceC4300bbs
        public void d(InterfaceC4290bbi interfaceC4290bbi, Status status) {
            C1044Mm.c("nf_offlineAgent", "onStorageError status=%s", status);
            if (status.c().getValue() == StatusCode.DL_VIEWABLE_DIRECTORY_MISSING.getValue()) {
                C4250bav.this.x.remove(interfaceC4290bbi);
                C4250bav.this.R();
                C4250bav.this.G.a();
                return;
            }
            C4250bav.this.R();
            C4250bav.this.a(interfaceC4290bbi);
            C4250bav.this.i.t();
        }

        @Override // o.InterfaceC4300bbs
        public void e(InterfaceC4290bbi interfaceC4290bbi, Status status) {
            C1044Mm.e("nf_offlineAgent", "onUnRecoverableError playableId=%s status=%s", interfaceC4290bbi.aH_(), status);
            C4250bav.this.a(interfaceC4290bbi);
            C4250bav.this.z.d(interfaceC4290bbi.i());
            C4250bav.this.i.e(interfaceC4290bbi.aH_(), status);
            C4250bav.this.T();
        }

        @Override // o.InterfaceC4300bbs
        public void d(InterfaceC4299bbr interfaceC4299bbr) {
            C4250bav.this.z.b(interfaceC4299bbr);
        }
    };

    @Override // o.aMF
    public String agentName() {
        return "offline";
    }

    public InterfaceC1740aMm j() {
        return this;
    }

    @Override // o.InterfaceC4208baF
    public InterfaceC4245baq k() {
        return this.m;
    }

    @Override // o.InterfaceC4208baF
    public InterfaceC4251baw r() {
        return this.H;
    }

    public C4250bav(Context context, C4390bdc c4390bdc, aOV aov, UserAgent userAgent, InterfaceC1926aTj interfaceC1926aTj, aHJ ahj, NetflixPowerManager netflixPowerManager) {
        C4278bbW.d dVar = new C4278bbW.d() { // from class: o.bav.6
            @Override // o.C4278bbW.d
            public void a() {
                OfflineUnavailableReason offlineUnavailableReason;
                if (C4250bav.this.E.v()) {
                    boolean aw = C4250bav.this.f.aw();
                    if (aw) {
                        C1044Mm.c("nf_offlineAgent", "onStorageAddedOrRemoved ignored disabledFromConfig=%b", Boolean.valueOf(aw));
                        return;
                    }
                    boolean e2 = C4250bav.this.e(StopReason.WaitingToBeStarted);
                    OfflineRegistryInterface.RegistryState e3 = C4250bav.this.z.e(C4250bav.this.F);
                    C1044Mm.c("nf_offlineAgent", "onStorageAddedOrRemoved state=%s", e3.toString());
                    int i = AnonymousClass13.a[e3.ordinal()];
                    if (i == 1) {
                        C4250bav.this.b = false;
                    } else if (i == 2) {
                        C4250bav.this.b = true;
                        C4250bav.this.v();
                    } else if (i == 3 || i == 4) {
                        C4250bav.this.b = false;
                        if (e3 == OfflineRegistryInterface.RegistryState.STORAGE_ERROR) {
                            offlineUnavailableReason = OfflineUnavailableReason.NA_OFFLINE_STORAGE_NOT_AVAILABLE;
                        } else {
                            offlineUnavailableReason = OfflineUnavailableReason.NA_OFFLINE_SQL_DB_ERROR;
                        }
                        OfflineErrorLogblob.e(C4250bav.this.getLoggingAgent().e(), offlineUnavailableReason);
                    }
                    if (e2) {
                        C4250bav.this.T();
                    }
                    OfflineErrorLogblob.d(C4250bav.this.getLoggingAgent().e(), C4250bav.this.z.g());
                    C4250bav.this.d.e(C4250bav.this.getMainHandler(), C4250bav.this.b);
                }
            }
        };
        this.G = dVar;
        this.k = new C4244bap.b() { // from class: o.bav.9
            @Override // o.C4244bap.b
            public void e() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "continueDownloadOnBackOff");
                C4250bav.this.T();
            }

            @Override // o.C4244bap.b
            public void c() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "continueDownloadOnNetworkChanged");
                C4250bav.this.T();
            }

            @Override // o.C4244bap.b
            public void f() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "stopDownloadsNotAllowedByNetwork");
                C4250bav.this.d(StopReason.NotAllowedOnCurrentNetwork);
            }

            @Override // o.C4244bap.b
            public void i() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "stopDownloadsNoNetwork");
                C4250bav.this.d(StopReason.NoNetworkConnectivity);
            }

            @Override // o.C4244bap.b
            public void d() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "continueDownloadOnStreamingStopped");
                C4250bav.this.T();
            }

            @Override // o.C4244bap.b
            public void a() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "stopDownloadOnStreamingStarted");
                if (C4250bav.this.d(StopReason.PlayerStreaming)) {
                    C4250bav.this.d.c(C4250bav.this.getMainHandler());
                }
            }

            @Override // o.C4244bap.b
            public void b() {
                C8166dfJ.c();
                C1044Mm.a("nf_offlineAgent", "onDownloadResumeJob");
                if (C4250bav.this.E.v()) {
                    C4250bav.this.c(6);
                }
            }
        };
        this.f = aov;
        this.j = c4390bdc;
        this.E = userAgent;
        this.g = context;
        this.r = interfaceC1926aTj;
        this.q = ahj;
        this.s = netflixPowerManager;
        X();
        this.F = new C4278bbW(context, this.c.getLooper(), dVar);
        this.z = new C4272bbQ(context);
        InterfaceC5298bwC interfaceC5298bwC = (InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class);
        this.A = interfaceC5298bwC;
        interfaceC5298bwC.b(this.a);
        this.a.post(new Runnable() { // from class: o.bav.14
            @Override // java.lang.Runnable
            public void run() {
                C4250bav.this.w();
                C4250bav.this.z.e(C4250bav.this.F);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.H = this.A.c(this);
        this.m = this.A.b(this, this.E);
    }

    private void f(String str) {
        C1044Mm.a("nf_offlineAgent", "processNextCreateRequest");
        String str2 = this.D;
        if (str2 == null) {
            InterfaceC4290bbi a = C4206baD.a(this.x);
            if (a != null) {
                C1044Mm.c("nf_offlineAgent", "processNextCreateRequest processing playableId=%s", a.aH_());
                this.D = a.aH_();
                if (!this.E.v()) {
                    d(this.D, new NetflixStatus(StatusCode.DL_USER_NOT_LOGGED_IN));
                    return;
                }
                long a2 = C8054ddD.a(new File(this.z.d()));
                OfflineErrorLogblob.c(getLoggingAgent().e(), a.e(), a2, this.z.d(), str);
                if (!C4206baD.e(a2, this.z.d(), this.x)) {
                    C1044Mm.d("nf_offlineAgent", "handleCreateRequest not enough space");
                    d(this.D, new NetflixStatus(StatusCode.DL_NOT_ENOUGH_FREE_SPACE));
                    return;
                }
                a.j();
                return;
            }
            Y();
            return;
        }
        C1044Mm.c("nf_offlineAgent", "processNextCreateRequest already processing, mPlayableIdInFlight=%s", str2);
    }

    private void Y() {
        if (this.E.v() && this.b) {
            InterfaceC4290bbi a = C4206baD.a(this.x);
            if (this.i.e() != null || this.i.i() || a != null || this.D != null) {
                return;
            }
            C1044Mm.a("nf_offlineAgent", "no downloadable item found");
            this.f13562o.b();
        } else {
            C1044Mm.d("nf_offlineAgent", "startDownloadIfAllowed user is not logged in or offline not available");
        }
        this.f13562o.b();
        this.i.l();
    }

    protected void p() {
        OfflineUnavailableReason offlineUnavailableReason;
        OfflineUnavailableReason L = this.f.L();
        if (L != null) {
            OfflineErrorLogblob.e(getLoggingAgent().e(), L);
            initCompleted(InterfaceC1078Nw.aJ);
            return;
        }
        this.F.g();
        this.d.c(this.s);
        this.u = new C4270bbO(this.j, this.c, getLoggingAgent().j(), getLoggingAgent());
        this.v = new C4266bbK(getContext(), this.c.getLooper(), this.j, getLoggingAgent());
        OfflineRegistryInterface.RegistryState n = this.z.n();
        int i = AnonymousClass13.a[n.ordinal()];
        if (i == 1) {
            initCompleted(new NetflixStatus(StatusCode.DL_OFFLINE_AGENT_NOT_READY));
        } else if (i == 3 || i == 4) {
            if (n == OfflineRegistryInterface.RegistryState.STORAGE_ERROR) {
                offlineUnavailableReason = OfflineUnavailableReason.NA_OFFLINE_STORAGE_NOT_AVAILABLE;
            } else {
                offlineUnavailableReason = OfflineUnavailableReason.NA_OFFLINE_SQL_DB_ERROR;
            }
            OfflineErrorLogblob.e(getLoggingAgent().e(), offlineUnavailableReason);
            initCompleted(InterfaceC1078Nw.aJ);
        } else {
            v();
            this.f13562o = ((InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class)).d(getMainHandler(), getContext(), getServiceNotificationHelper(), this.f.am(), this);
            this.i = new C4244bap(getContext(), this.r, this.n, this.x, this.c.getLooper(), this.k, this.z.e(), getLoggingAgent(), getNetflixPlatform(), this.z.k());
            getNetflixPlatform().e(NetflixJob.NetflixJobId.SMART_DOWNLOAD_RESUME, this.H);
            this.c.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: o.bav.11
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    C4250bav.this.a(thread, th);
                }
            });
            C4239bak c4239bak = new C4239bak(getContext(), this, this.c.getLooper());
            this.h = c4239bak;
            c4239bak.c();
            C1044Mm.e("nf_offlineAgent", "OfflineAgent doInit success.");
            this.b = true;
            C8157dfA.d(this.g, "offline_ever_worked", true);
            this.H.a();
            this.m.d();
            C8187dfe.c(new Runnable() { // from class: o.bay
                @Override // java.lang.Runnable
                public final void run() {
                    C4250bav.this.K();
                }
            });
            initCompleted(InterfaceC1078Nw.aJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void K() {
        XH.c.d(this.g).c(this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void L() {
        XH.c.d(this.g).a(this.M);
    }

    private void O() {
        final d dVar = this.a;
        this.A.d(C4206baD.e(this.x), new InterfaceC4243bao() { // from class: o.bav.16
            @Override // o.InterfaceC4243bao
            public void b(final Map<String, Boolean> map) {
                if (C4250bav.this.s()) {
                    dVar.post(new Runnable() { // from class: o.bav.16.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C4250bav.this.e(map);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Thread thread, Throwable th) {
        C1044Mm.b("nf_offlineAgent", th, "uncaughtException threadName=%s", Thread.currentThread().getName());
        try {
            C1044Mm.d("nf_offlineAgent", "uncaughtException stopping all downloads");
            this.a.removeCallbacksAndMessages(null);
            e(StopReason.WaitingToBeStarted);
            this.i.s();
            C1044Mm.d("nf_offlineAgent", "uncaughtException stopped all downloads");
        } catch (Exception e2) {
            C1044Mm.b("nf_offlineAgent", e2, "setUncaughtExceptionHandler error stopping downloads", new Object[0]);
        }
        C1044Mm.d("nf_offlineAgent", "passing to defaultExceptionHandler");
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        C1044Mm.a("nf_offlineAgent", "handleAgentDestroyRequest");
        C8187dfe.c(new Runnable() { // from class: o.baz
            @Override // java.lang.Runnable
            public final void run() {
                C4250bav.this.L();
            }
        });
        C4278bbW c4278bbW = this.F;
        if (c4278bbW != null) {
            c4278bbW.j();
        }
        C4239bak c4239bak = this.h;
        if (c4239bak != null) {
            c4239bak.b();
        }
        InterfaceC4262bbG interfaceC4262bbG = this.v;
        if (interfaceC4262bbG != null) {
            interfaceC4262bbG.c();
        }
        C4244bap c4244bap = this.i;
        if (c4244bap != null) {
            c4244bap.c();
        }
        d(StopReason.WaitingToBeStarted);
        if (this.I != null) {
            C1044Mm.a("nf_offlineAgent", "Stopping Volley RequestQueue");
            this.I.b();
            this.I = null;
        }
        for (InterfaceC4290bbi interfaceC4290bbi : this.x) {
            interfaceC4290bbi.b();
        }
        this.x.clear();
        W();
        super.destroy();
        C1044Mm.a("nf_offlineAgent", "destroyInBgThread done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CreateRequest createRequest) {
        String str = createRequest.e;
        V();
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 != null && d2.au_() == DownloadState.CreateFailed) {
            C1044Mm.a("nf_offlineAgent", "handleCreateRequest removing CreateFailed item");
            this.x.remove(d2);
            this.z.d(d2.i(), false);
            d2 = null;
        }
        if (d2 == null) {
            C1044Mm.c("nf_offlineAgent", "handleCreateRequest creating new item %s", str);
            InterfaceC4299bbr b2 = this.z.b(createRequest, createRequest.d(), createRequest.b(), B().a());
            NamedLogSessionLookup.INSTANCE.addSession(b2.i(), Logger.INSTANCE.startSession(new AddCachedVideo(null, null, e(createRequest.d), null, null)));
            this.x.add(d(this.z.d(), b2));
            this.i.n();
            f("handleCreateRequest");
            this.d.b(getMainHandler(), str);
            return;
        }
        C1044Mm.d("nf_offlineAgent", "handleCreateRequest already requested");
        this.d.b(getMainHandler(), str, new NetflixStatus(StatusCode.DL_TITTLE_ALREADY_REQUESTED_FOR_DOWNLOAD));
    }

    private DownloadType e(CreateRequest.DownloadRequestType downloadRequestType) {
        if (downloadRequestType == null) {
            return DownloadType.unknown;
        }
        int i = AnonymousClass13.d[downloadRequestType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return DownloadType.unknown;
                        }
                        return DownloadType.unknown;
                    }
                    return DownloadType.downloadedForYou;
                }
                return DownloadType.userInitiated;
            }
            return DownloadType.smartDownload;
        }
        return DownloadType.scheduled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 == null) {
            C1044Mm.e("nf_offlineAgent", "handleResumeRequest not found playableId=%s", str);
        } else if (d2.au_() != DownloadState.Stopped) {
            C1044Mm.e("nf_offlineAgent", "handleResumeRequest not stopped, state=%s", d2.au_().toString());
        } else {
            d2.i().d(StopReason.WaitingToBeStarted);
            d2.i().Q();
            if (d2.bb_()) {
                d2.i().c(true);
                this.i.n();
            }
            boolean c2 = c(d2);
            if (c2) {
                e(d2);
            } else {
                a(d2);
            }
            this.z.d(d2.i());
            C1044Mm.c("nf_offlineAgent", "handleResumeRequest playableId=%s resumed=%b", d2.aH_(), Boolean.valueOf(c2));
        }
    }

    private boolean c(InterfaceC4290bbi interfaceC4290bbi) {
        if (this.i.d(interfaceC4290bbi)) {
            interfaceC4290bbi.f();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        C1044Mm.c("nf_offlineAgent", "handlePauseRequest playableId=%s", str);
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 == null) {
            C1044Mm.e("nf_offlineAgent", "handlePauseRequest playableId=%s not found", str);
        } else if (d2.au_() != DownloadState.Complete) {
            d2.d(StopReason.StoppedFromAgentAPI);
            this.z.d(d2.i());
            a(d2);
        } else {
            C1044Mm.d("nf_offlineAgent", "handlePauseRequest trying to pause a completed item");
        }
    }

    private void e(boolean z) {
        this.z.e(z);
        this.i.d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        C1044Mm.a("nf_offlineAgent", "handleDownloadMaintenanceJob");
        C4252bax c4252bax = this.t;
        if (c4252bax != null) {
            c4252bax.b();
        }
        OfflineErrorLogblob.c(getLoggingAgent().e(), NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE);
        C4252bax c4252bax2 = new C4252bax(this, this, this.v, this.x, this.z);
        this.t = c4252bax2;
        c4252bax2.d(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        C1044Mm.a("nf_offlineAgent", "handleDownloadResumeJob");
        OfflineErrorLogblob.c(getLoggingAgent().e(), NetflixJob.NetflixJobId.DOWNLOAD_RESUME);
        if (!T()) {
            this.i.l();
        } else if (this.f13562o.a()) {
            this.i.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, Boolean> map) {
        C1044Mm.a("nf_offlineAgent", "handleGeoPlayabilityUpdated");
        if (N()) {
            return;
        }
        C4206baD.a(map, this.x);
        this.z.b(this.f.v());
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C4242ban c4242ban, C4241bam c4241bam) {
        C1044Mm.c("nf_offlineAgent", "handleDeleteRequest playableId=%s", str);
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 == null) {
            C1044Mm.d("nf_offlineAgent", "handleDeleteRequest offlinePlayable not found");
        } else if (d2.aH_().equals(this.D)) {
            C1044Mm.a("nf_offlineAgent", "handleDeleteRequest not deleting in-flight item");
            d(str, new NetflixStatus(StatusCode.DL_BUSY_TRY_DELETE_AGAIN), null);
            this.m.a(str, d2, c4241bam);
        } else {
            a(d2.y(), c4241bam);
            this.x.remove(d2);
            Status e2 = d2.e(false);
            this.z.d(d2.i(), true);
            C4206baD.a(e2, d2);
            this.i.b(str);
            this.H.e(str);
            this.m.a(str, d2, c4241bam);
            if (c4242ban == null) {
                this.A.c(C4206baD.d(this.x), Collections.singletonList(d2));
            } else {
                C4206baD.b(this.E, d2, c4242ban);
            }
            d(str, e2, c4242ban);
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list) {
        Status status = InterfaceC1078Nw.aJ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            C1044Mm.c("nf_offlineAgent", "handleDeletePlayables playableId=%s", str);
            InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
            if (d2 == null) {
                C1044Mm.d("nf_offlineAgent", "handleDeletePlayables offlinePlayable not found");
            } else if (d2.aH_().equals(this.D)) {
                C1044Mm.a("nf_offlineAgent", "handleDeletePlayables not deleting in-flight item");
                status = new NetflixStatus(StatusCode.DL_BUSY_TRY_DELETE_AGAIN);
            } else {
                a(d2.y(), (C4241bam) null);
                this.x.remove(d2);
                arrayList.add(d2.i());
                arrayList2.add(d2);
                Status e2 = d2.e(false);
                if (status.j()) {
                    status = e2;
                }
                C4206baD.a(e2, d2);
                this.i.b(str);
                this.H.e(str);
            }
        }
        this.z.c(arrayList, true);
        this.A.c(C4206baD.d(this.x), arrayList2);
        e(list, status);
        T();
    }

    private void H() {
        for (InterfaceC4290bbi interfaceC4290bbi : this.x) {
            interfaceC4290bbi.b((InterfaceC4290bbi.c) null);
        }
    }

    private void a(String str, C4241bam c4241bam) {
        long parseLong = Long.parseLong(str);
        if (c4241bam != null && c4241bam.c() != null) {
            CLUtils.startNamedSession(str, new RemoveCachedVideoWithFeature(c4241bam.c(), Long.valueOf(parseLong), null, null, null, null));
        } else {
            CLUtils.startNamedSession(str, new RemoveCachedVideo(Long.valueOf(parseLong), null, null, null, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (this.b) {
            C1044Mm.c("nf_offlineAgent", "handleDeleteAllRequest deletePermanently=%b", Boolean.valueOf(z));
            Status status = InterfaceC1078Nw.aJ;
            x();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC4290bbi interfaceC4290bbi : this.x) {
                if (interfaceC4290bbi.aH_().equals(this.D)) {
                    C1044Mm.a("nf_offlineAgent", "handleDeleteRequest not deleting in-flight item");
                } else {
                    a(interfaceC4290bbi.y(), (C4241bam) null);
                    arrayList.add(interfaceC4290bbi.i());
                    arrayList2.add(interfaceC4290bbi);
                    Status e2 = interfaceC4290bbi.e(z);
                    if (e2.i()) {
                        C1044Mm.e("nf_offlineAgent", "handleDeleteAllRequest can't delete playableId=%s status=%s", interfaceC4290bbi.aH_(), e2);
                        status = e2;
                    }
                    C4206baD.a(e2, interfaceC4290bbi);
                }
            }
            this.z.e("");
            this.x.clear();
            this.i.m();
            this.H.e();
            if (z) {
                C4206baD.e(this.g);
            }
            this.z.c(arrayList, !z);
            q();
            e(status);
            this.A.c(C4206baD.d(this.x), arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        ArrayList<String> arrayList = new ArrayList();
        for (InterfaceC4290bbi interfaceC4290bbi : this.x) {
            if (interfaceC4290bbi.aZ_() && C4338bcd.e(interfaceC4290bbi)) {
                arrayList.add(interfaceC4290bbi.aH_());
            }
        }
        for (String str : arrayList) {
            a(str, (C4242ban) null, (C4241bam) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 != null) {
            d2.i().e(true);
            this.z.d(d2.i());
            this.i.n();
            this.d.b(getMainHandler(), str, InterfaceC1078Nw.aJ);
            c(d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final b bVar) {
        C1044Mm.a("nf_offlineAgent", "handleReplaceAllLicenses " + Arrays.toString(bVar.d.toArray()));
        if (this.y == null) {
            C4214baL c4214baL = new C4214baL(this.z, this.x, bVar, this.u, this.v);
            this.y = c4214baL;
            c4214baL.c(new C4214baL.b() { // from class: o.baC
                @Override // o.C4214baL.b
                public final void a() {
                    C4250bav.this.b(bVar);
                }
            });
            return;
        }
        C1044Mm.a("nf_offlineAgent", "handleReplaceAllLicenses already replacing licenses");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        this.y = null;
        InterfaceC4348bcn.b bVar2 = bVar.a;
        if (bVar2 != null) {
            bVar2.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        e(this.g);
        this.r.a(this.n, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.b) {
            C1044Mm.a("nf_offlineAgent", "handlePlanChangeDeleteDownloads");
            d(StopReason.AccountIneligible);
            if (this.f13562o != null) {
                getMainHandler().post(new Runnable() { // from class: o.baA
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4250bav.this.M();
                    }
                });
            }
            this.H.f();
            if (this.x.size() > 0) {
                d(true);
                aa();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.f13562o.e();
    }

    private void x() {
        c(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Map<String, InterfaceC5206buQ> map) {
        this.A.d(map);
    }

    private void X() {
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("nf_of_bg", 10);
            this.c = handlerThread;
            handlerThread.start();
            this.a = new d(this.c.getLooper());
        }
    }

    private void W() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
            this.a = null;
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            this.c = null;
            handlerThread.quit();
        }
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.OFFLINE_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.a("nf_offlineAgent", "OfflineAgent doInit");
        this.b = false;
        X();
        c(0);
    }

    @Override // o.aMF
    public void destroy() {
        C1044Mm.a("nf_offlineAgent", "destroy");
        this.b = false;
        this.F.j();
        this.d.c();
        if (this.a != null) {
            c(5);
        }
        this.r.c(this.n);
    }

    @Override // o.aMF
    public void onTrimMemory(int i) {
        InterfaceC4268bbM interfaceC4268bbM = this.u;
        if (interfaceC4268bbM != null) {
            interfaceC4268bbM.a(i);
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        C4244bap c4244bap;
        super.handleConnectivityChange(netType);
        if (!this.b || (c4244bap = this.i) == null) {
            return;
        }
        c4244bap.f();
    }

    @Override // o.InterfaceC4208baF
    public boolean s() {
        return !N();
    }

    @Override // o.InterfaceC4208baF
    public void b(CreateRequest createRequest) {
        C1044Mm.a("request offline viewing started.");
        if (N()) {
            InterfaceC1598aHf.a("SPY-12255 got requestOfflineViewing while offline feature disabled.");
            return;
        }
        c(new AbstractC4213baK.i(createRequest.e, createRequest.d(), createRequest.d));
        C4206baD.e(this.g, 0);
        createRequest.c(this.E.g());
        ac();
        e(false);
        this.A.d(C4206baD.b(this.E, createRequest), createRequest, this.z.b());
        Message obtainMessage = this.a.obtainMessage(1, createRequest);
        this.f13562o.a();
        if (createRequest.e()) {
            this.a.sendMessage(obtainMessage);
        } else {
            this.a.sendMessageAtFrontOfQueue(obtainMessage);
        }
    }

    private void ac() {
        String n = this.E.n();
        String h = this.z.h();
        if (C8168dfL.h(n) && C8168dfL.g(h)) {
            this.z.e(n);
            C1044Mm.c("nf_offlineAgent", "updatePrimaryProfileGuidIfMissing %s", n);
        }
    }

    private InterfaceC4290bbi d(String str, InterfaceC4299bbr interfaceC4299bbr) {
        return new C4295bbn(getContext(), interfaceC4299bbr, new C4256bbA(), C4336bcb.b(str, interfaceC4299bbr.h()), this.I, this.u, this.v, this.l, this.c, getLoggingAgent(), this.e);
    }

    @Override // o.InterfaceC4208baF
    public void d(String str) {
        C8166dfJ.d();
        e(false);
        a(2, str);
    }

    @Override // o.InterfaceC4208baF
    public void c(C4241bam c4241bam) {
        C8166dfJ.d();
        e(false);
        this.a.obtainMessage(19, c4241bam).sendToTarget();
    }

    @Override // o.InterfaceC4208baF
    public void e(String str, VideoType videoType, PlayContext playContext) {
        C8166dfJ.d();
        this.a.obtainMessage(14, new C4242ban(str, playContext, videoType, false)).sendToTarget();
    }

    @Override // o.InterfaceC4208baF
    public void a(String str, VideoType videoType, PlayContext playContext) {
        C8166dfJ.d();
        this.a.obtainMessage(14, new C4242ban(str, playContext, videoType, true)).sendToTarget();
    }

    @Override // o.InterfaceC4208baF
    public void e(List<String> list) {
        C8166dfJ.d();
        if (list.size() > 0) {
            e(false);
            this.a.sendMessage(this.a.obtainMessage(13, list));
            return;
        }
        C1044Mm.a("nf_offlineAgent", "deleteOfflinePlayables nothing to be done");
    }

    private void u() {
        final Map<String, InterfaceC5206buQ> d2 = C4206baD.d(this.x);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.post(new Runnable() { // from class: o.bav.17
                @Override // java.lang.Runnable
                public void run() {
                    C1044Mm.a("nf_offlineAgent", "buildNewUiList now on worker thread.. regenerate");
                    C4250bav.this.c(d2);
                }
            });
            return;
        }
        C1044Mm.a("nf_offlineAgent", "buildNewUiList already in worker.. regenerate");
        c(d2);
    }

    @Override // o.InterfaceC4208baF
    public void e(String str) {
        C8166dfJ.d();
        e(true);
        a(3, str);
    }

    @Override // o.InterfaceC4208baF
    public void h(String str) {
        C8166dfJ.d();
        e(false);
        a(4, str);
    }

    @Override // o.InterfaceC4208baF
    public InterfaceC4209baG e(InterfaceC4209baG interfaceC4209baG) {
        C8166dfJ.d();
        this.d.c(getMainHandler(), interfaceC4209baG);
        return interfaceC4209baG;
    }

    @Override // o.InterfaceC4208baF
    public void d(InterfaceC4209baG interfaceC4209baG) {
        C8166dfJ.d();
        if (interfaceC4209baG != null) {
            this.d.d(getMainHandler(), interfaceC4209baG);
        }
    }

    @Override // o.InterfaceC4208baF
    public void c(final boolean z) {
        C8166dfJ.d();
        C1044Mm.c("nf_offlineAgent", "setRequiresUnmeteredNetwork requires=%b", Boolean.valueOf(z));
        this.a.post(new Runnable() { // from class: o.bav.18
            @Override // java.lang.Runnable
            public void run() {
                C4250bav.this.i.b(z);
            }
        });
    }

    @Override // o.InterfaceC4208baF
    public boolean o() {
        C8166dfJ.d();
        C4244bap c4244bap = this.i;
        return c4244bap == null || c4244bap.p();
    }

    @Override // o.InterfaceC4208baF
    public void e(DownloadVideoQuality downloadVideoQuality) {
        C8157dfA.a(getContext(), "download_video_quality", downloadVideoQuality.a());
    }

    @Override // o.InterfaceC4208baF
    public DownloadVideoQuality m() {
        return B();
    }

    @Override // o.InterfaceC4208baF
    public void g() {
        C8166dfJ.d();
        c(8);
    }

    @Override // o.InterfaceC4208baF
    public void i() {
        C8166dfJ.d();
        c(16);
    }

    @Override // o.InterfaceC4208baF
    public void b(String str) {
        C8166dfJ.d();
        a(17, str);
    }

    @Override // o.InterfaceC4208baF
    public void c(AbstractC4213baK abstractC4213baK) {
        this.e.c(abstractC4213baK);
    }

    @Override // o.InterfaceC4208baF
    public InterfaceC4218baP n() {
        return C4220baR.d;
    }

    @Override // o.InterfaceC4208baF
    public void c(final String str) {
        C1044Mm.c("nf_offlineAgent", "requestRefreshLicenseForPlayable playableId=%s", str);
        this.a.post(new Runnable() { // from class: o.bav.20
            @Override // java.lang.Runnable
            public void run() {
                final InterfaceC4290bbi d2 = C4206baD.d(str, C4250bav.this.x);
                if (d2 != null) {
                    d2.e(true, new InterfaceC4208baF.d() { // from class: o.bav.20.2
                        @Override // o.InterfaceC4208baF.d
                        public void a(Status status) {
                            d2.i().a(status);
                            C4250bav c4250bav = C4250bav.this;
                            c4250bav.e(c4250bav.getContext());
                            C4250bav.this.b(d2, status);
                        }
                    });
                }
            }
        });
    }

    @Override // o.InterfaceC4208baF
    public void a(final String str) {
        C1044Mm.c("nf_offlineAgent", "requestRenewPlayWindowForPlayable playableId=%s", str);
        this.a.post(new Runnable() { // from class: o.bav.19
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4290bbi d2 = C4206baD.d(str, C4250bav.this.x);
                if (d2 != null) {
                    InterfaceC4299bbr i = d2.i();
                    Status a = C4221baS.a(C4250bav.this.getContext(), i);
                    i.a(a);
                    C4250bav c4250bav = C4250bav.this;
                    c4250bav.e(c4250bav.getContext());
                    C4250bav.this.e(d2, a);
                }
            }
        });
    }

    private DownloadVideoQuality B() {
        return DownloadVideoQuality.c(C8157dfA.e(getContext(), "download_video_quality", DownloadVideoQuality.DEFAULT.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        if (this.E.v() && this.b) {
            InterfaceC4290bbi e2 = this.i.e();
            if (e2 != null) {
                C1044Mm.c("nf_offlineAgent", "starting the download for %s", e2.aH_());
                e2.f();
                return true;
            }
            C1044Mm.c("nf_offlineAgent", "no downloadable item found, count=%d", Integer.valueOf(this.x.size()));
        } else {
            C1044Mm.d("nf_offlineAgent", "startDownloadIfAllowed user is not logged in or offline not available");
        }
        Y();
        return false;
    }

    private void V() {
        if (this.I != null) {
            return;
        }
        int s = this.f.s();
        C9865xz a = this.q.a((InterfaceC9854xo) new C9829xP(), (InterfaceC9857xr) new aZM(new C4945bpU(this.q)), s < 4 ? 4 : s, false, "offline");
        this.I = a;
        a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(StopReason stopReason) {
        boolean z = false;
        for (InterfaceC4290bbi interfaceC4290bbi : this.x) {
            if (C4338bcd.e(interfaceC4290bbi)) {
                interfaceC4290bbi.d(stopReason);
                a(interfaceC4290bbi);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(StopReason stopReason) {
        boolean e2 = e(stopReason);
        if (e2) {
            C1044Mm.a("nf_offlineAgent", "stopAllDownloadsAndPersistRegistry something was stopped");
            e(getContext());
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        C1044Mm.a("nf_offlineAgent", "buildFalkorDataAndPlayableListFromPersistentStore");
        if (this.z.f() == null) {
            this.z.b(this.f.v());
        }
        if (this.z.o()) {
            V();
        }
        this.x.clear();
        for (C4281bbZ c4281bbZ : this.z.j()) {
            for (C4276bbU c4276bbU : c4281bbZ.e()) {
                this.x.add(d(c4281bbZ.d(), c4276bbU));
            }
        }
        C4244bap c4244bap = this.i;
        if (c4244bap != null) {
            c4244bap.n();
        }
        q();
    }

    @Override // o.InterfaceC4208baF
    public void q() {
        u();
    }

    @Override // o.InterfaceC4208baF
    public InterfaceC5204buO l() {
        return this.z.l();
    }

    @Override // o.InterfaceC4208baF
    public void a(int i) {
        this.a.obtainMessage(11, Integer.valueOf(i)).sendToTarget();
    }

    @Override // o.InterfaceC4208baF
    public void t() {
        this.a.obtainMessage(12).sendToTarget();
    }

    @Override // o.InterfaceC4208baF
    public void d(final String str, final InterfaceC4208baF.c cVar) {
        if (N()) {
            b(str, StatusCode.DL_OFFLINE_AGENT_NOT_READY, cVar);
        } else {
            this.a.post(new Runnable() { // from class: o.bav.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC4290bbi d2 = C4206baD.d(str, C4250bav.this.x);
                    if (d2 == null) {
                        C4250bav.this.b(str, StatusCode.DL_OFFLINE_PLAYABLE_NOT_FOUND, cVar);
                    } else {
                        d2.d(cVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final StatusCode statusCode, final InterfaceC4208baF.c cVar) {
        getMainHandler().post(new Runnable() { // from class: o.bav.1
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(str, null, new NetflixStatus(statusCode));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        C1044Mm.a("nf_offlineAgent", "saveToRegistry");
        this.B = true;
        this.a.post(new Runnable() { // from class: o.bav.3
            @Override // java.lang.Runnable
            public void run() {
                if (!C4250bav.this.B) {
                    C1044Mm.a("nf_offlineAgent", "saveToRegistry avoiding duplicate save.");
                    return;
                }
                C4250bav c4250bav = C4250bav.this;
                c4250bav.e(c4250bav.getContext());
                C4250bav.this.B = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context != null) {
            try {
                this.z.m();
                return;
            } catch (PersistRegistryException e2) {
                C1044Mm.d("nf_offlineAgent", "doSaveToRegistryInBGThread can't persist registry");
                OfflineErrorLogblob.c(getLoggingAgent().e(), "-1", e2.getMessage());
                b(new NetflixStatus(StatusCode.DL_CANT_PERSIST_REGISTRY));
                InterfaceC1598aHf.e(e2.getMessage(), e2);
                long j = this.C;
                long currentTimeMillis = System.currentTimeMillis();
                this.C = currentTimeMillis;
                if (currentTimeMillis - j >= TimeUnit.MINUTES.toMillis(30L)) {
                    this.G.a();
                    return;
                }
                return;
            }
        }
        C1044Mm.d("nf_offlineAgent", "doSaveToRegistryInBGThread context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, Status status) {
        C1044Mm.c("nf_offlineAgent", "sendResponseForCreate, status: %s", status);
        InterfaceC4290bbi d2 = C4206baD.d(str, this.x);
        if (d2 == null) {
            C1044Mm.e("nf_offlineAgent", "sendResponseForCreate not found playableId=%s", str);
            InterfaceC5090bsG e2 = getLoggingAgent().e();
            OfflineErrorLogblob.c(e2, str, "mPlayableIdInFlight " + this.D);
            d dVar = this.a;
            C4206baD.a(dVar, "sendResponseForCreate notFound " + str);
            return;
        }
        if (d2.au_() != DownloadState.Creating) {
            C1044Mm.e("nf_offlineAgent", "sendResponseForCreate STATE %s", d2.au_());
            InterfaceC5090bsG e3 = getLoggingAgent().e();
            InterfaceC4299bbr e4 = d2.e();
            OfflineErrorLogblob.a(e3, e4, "STATE " + d2.au_());
            d dVar2 = this.a;
            C4206baD.a(dVar2, "STATE " + d2.au_());
        }
        this.D = null;
        if (status.j()) {
            Long removeSessionId = NamedLogSessionLookup.INSTANCE.removeSessionId(d2.y());
            Logger logger = Logger.INSTANCE;
            Session session = logger.getSession(removeSessionId);
            if (session != null) {
                logger.endSession(new AddCachedVideoEnded((AddCachedVideo) session, Long.valueOf(Long.parseLong(d2.y()))));
            }
            if (status.c() == StatusCode.DL_WARNING_DL_N_TIMES_BEFORE_DATE) {
                d2.i().c(status);
                d2.i().d(StopReason.DownloadLimitRequiresManualResume);
            } else {
                d2.i().d(StopReason.WaitingToBeStarted);
            }
        } else {
            d2.i().a(status);
            Logger.INSTANCE.endSession(Action.createActionFailedEvent(NamedLogSessionLookup.INSTANCE.removeSessionId(d2.y()), C8169dfM.d(status)));
            d2.i().U();
            if (status.c() == StatusCode.DL_TOTAL_LICENSE_PER_DEVICE_LIMIT) {
                C4206baD.e(this.g);
                ab();
            } else if (status.c() == StatusCode.DL_NOT_ENOUGH_FREE_SPACE) {
                this.z.a(this.x);
            }
        }
        this.z.c(d2.i());
        u();
        this.d.b(getMainHandler(), str, status);
        f("sendResponseForCreate");
        if (!status.j() || this.z.e() || this.i.g()) {
            return;
        }
        boolean c2 = c(d2);
        if (!c2 && d2.au_() == DownloadState.Stopped && d2.aM_() != StopReason.WaitingToBeStarted) {
            a(d2);
        }
        C1044Mm.c("nf_offlineAgent", "sendResponseForCreate playableId=%s resumed=%b", str, Boolean.valueOf(c2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        this.d.b(getMainHandler(), interfaceC5206buQ, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(InterfaceC5206buQ interfaceC5206buQ) {
        this.d.b(getMainHandler(), interfaceC5206buQ);
    }

    private void d(String str, Status status, C4242ban c4242ban) {
        if (c4242ban != null && c4242ban.b && this.z.g() == 2) {
            e(this.z.a() == 0 ? 1 : 0);
        }
        this.d.e(getMainHandler(), str, status, this, c4242ban);
    }

    private void e(List<String> list, Status status) {
        this.d.c(getMainHandler(), list, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InterfaceC4290bbi interfaceC4290bbi) {
        StopReason aM_ = interfaceC4290bbi.aM_();
        OfflineErrorLogblob.a(getLoggingAgent().e(), interfaceC4290bbi.e(), interfaceC4290bbi.aM_(), (aM_ == StopReason.EncodesAreNotAvailableAnyMore || aM_ == StopReason.ManifestError) ? C4206baD.c(interfaceC4290bbi.i()) : null);
        this.d.a(getMainHandler(), interfaceC4290bbi, aM_);
        Y();
    }

    private void e(InterfaceC4290bbi interfaceC4290bbi) {
        this.d.e(getMainHandler(), interfaceC4290bbi);
    }

    private void b(Status status) {
        this.d.a(getMainHandler(), status);
    }

    private void e(Status status) {
        this.d.c(getMainHandler(), status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC4290bbi interfaceC4290bbi, Status status) {
        this.d.c(getMainHandler(), interfaceC4290bbi, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC4290bbi interfaceC4290bbi, Status status) {
        this.d.a(getMainHandler(), interfaceC4290bbi, status);
    }

    private void a(int i, String str) {
        this.a.obtainMessage(i, str).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.a.obtainMessage(i).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bav$13  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass13 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[IntentCommandGroupType.values().length];
            e = iArr;
            try {
                iArr[IntentCommandGroupType.DownloadNotification.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[CreateRequest.DownloadRequestType.values().length];
            d = iArr2;
            try {
                iArr2[CreateRequest.DownloadRequestType.Scheduled.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CreateRequest.DownloadRequestType.SmartDownload.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[CreateRequest.DownloadRequestType.UserInitiated.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[CreateRequest.DownloadRequestType.DownloadForYou.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[CreateRequest.DownloadRequestType.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[OfflineRegistryInterface.RegistryState.values().length];
            a = iArr3;
            try {
                iArr3[OfflineRegistryInterface.RegistryState.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[OfflineRegistryInterface.RegistryState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[OfflineRegistryInterface.RegistryState.STORAGE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[OfflineRegistryInterface.RegistryState.SQL_DB_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // o.InterfaceC1740aMm
    public void e(Intent intent) {
        IntentCommandGroupType a = IntentCommandGroupType.a(intent);
        if (AnonymousClass13.e[a.ordinal()] == 1) {
            this.f13562o.c(intent);
        } else {
            C1044Mm.e("nf_offlineAgent", "unsupported IntentCommandGroupType=%s", a.toString());
        }
    }

    private boolean N() {
        return !this.b || this.f.aw() || this.i == null || !J();
    }

    private boolean J() {
        if (Config_FastProperty_DownloadsEnabledViaFeatureConfig.isFeatureConfigDownloadCheckEnabled() && C8153dex.h()) {
            return XH.c.d(getContext()).c().a();
        }
        return true;
    }

    @Override // o.C4239bak.d
    public void d() {
        C8166dfJ.c();
        if (N()) {
            return;
        }
        d(StopReason.AccountInActive);
        getMainHandler().post(new Runnable() { // from class: o.bav.4
            @Override // java.lang.Runnable
            public void run() {
                C4250bav.this.f13562o.e();
            }
        });
        this.H.f();
    }

    @Override // o.C4239bak.d
    public void b() {
        C8166dfJ.c();
        C1044Mm.a("nf_offlineAgent", "onUserAccountActive");
        if (N()) {
            return;
        }
        G();
        this.H.d();
    }

    @Override // o.C4239bak.d
    public void a() {
        C8166dfJ.c();
        C1044Mm.a("nf_offlineAgent", "onAccountDataFetched");
        if (N()) {
            return;
        }
        G();
        if (!C4206baD.a(C1842aQg.a.j(), this.x)) {
            H();
            if (C4246bar.d(this.z.f(), this.f.v(), this.x)) {
                O();
            }
            aa();
            return;
        }
        ab();
    }

    private void aa() {
        if (U()) {
            boolean z = this.x.size() == 0;
            int c2 = C4206baD.c(this.g);
            if (z && c2 >= 3) {
                C1044Mm.c("nf_offlineAgent", "Not calling sync, already did %d syncs", 3);
                return;
            }
            C4206baD.b(this.g);
            if (z) {
                int i = c2 + 1;
                C1044Mm.c("nf_offlineAgent", "zeroPlayableSyncCount %d", Integer.valueOf(i));
                C4206baD.e(this.g, i);
            }
            this.a.postDelayed(new Runnable() { // from class: o.bav.8
                @Override // java.lang.Runnable
                public void run() {
                    C4250bav.this.ab();
                }
            }, 10000L);
            return;
        }
        C1044Mm.a("nf_offlineAgent", "Not calling sync, too early");
    }

    private boolean U() {
        if (this.f.ao()) {
            C1044Mm.a("nf_offlineAgent", "ESN migration required, do license sync if any license exist.");
            return true;
        }
        C1044Mm.a("nf_offlineAgent", "ESN migration is NOT required, regular workflow.");
        return C4206baD.a(this.g);
    }

    private void G() {
        if (C4206baD.d(this.E, this.z)) {
            d(true);
            this.H.j();
        }
    }

    @Override // o.C4239bak.d
    public void c() {
        C8166dfJ.c();
        if (N()) {
            return;
        }
        this.i.k();
    }

    @Override // o.C4239bak.d
    public void e() {
        C8166dfJ.c();
        if (N()) {
            return;
        }
        this.i.o();
    }

    @Override // o.C4252bax.d
    public void h() {
        C1044Mm.a("nf_offlineAgent", "onAllMaintenanceJobDone");
        c(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bav$d */
    /* loaded from: classes3.dex */
    public class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C4250bav.this.p();
                    return;
                case 1:
                    C4250bav.this.a((CreateRequest) message.obj);
                    return;
                case 2:
                    C4250bav.this.a((String) message.obj, (C4242ban) null, (C4241bam) null);
                    return;
                case 3:
                    C4250bav.this.j((String) message.obj);
                    return;
                case 4:
                    C4250bav.this.g((String) message.obj);
                    return;
                case 5:
                    C4250bav.this.z();
                    return;
                case 6:
                    C4250bav.this.A();
                    return;
                case 7:
                    C4250bav.this.D();
                    return;
                case 8:
                    C4250bav.this.d(false);
                    return;
                case 9:
                    C4250bav.this.e((Long) message.obj);
                    return;
                case 10:
                    C4250bav.this.I();
                    C4250bav.this.t = null;
                    return;
                case 11:
                    C4250bav.this.e(((Integer) message.obj).intValue());
                    return;
                case 12:
                    C4250bav.this.F();
                    return;
                case 13:
                    C4250bav.this.a((List) message.obj);
                    return;
                case 14:
                    C4242ban c4242ban = (C4242ban) message.obj;
                    C4250bav.this.a(c4242ban.e, c4242ban, (C4241bam) null);
                    return;
                case 15:
                    C4250bav.this.d(true);
                    return;
                case 16:
                    C4250bav.this.C();
                    return;
                case 17:
                    C4250bav.this.i((String) message.obj);
                    return;
                case 18:
                    C4250bav.this.c((b) message.obj);
                    return;
                case 19:
                    C4241bam c4241bam = (C4241bam) message.obj;
                    C4250bav.this.a(c4241bam.d(), (C4242ban) null, c4241bam);
                    return;
                case 20:
                    C4250bav.this.E();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bav$e */
    /* loaded from: classes3.dex */
    public class e implements InterfaceC1919aTc {
        @Override // o.InterfaceC1919aTc
        public void a() {
        }

        private e() {
        }

        @Override // o.InterfaceC1919aTc
        public void b(int i) {
            if (C4250bav.this.E.v()) {
                C4250bav.this.p = i;
                C4250bav.this.c(7);
            }
        }
    }

    @Override // o.InterfaceC4348bcn
    public void c(final long j, final InterfaceC4348bcn.a aVar) {
        C1044Mm.c("nf_offlineAgent", "requestOfflineManifest movieId=%d", Long.valueOf(j));
        if (N()) {
            aVar.c(j, null, "-1", new NetflixStatus(StatusCode.DL_OFFLINE_AGENT_NOT_READY));
        } else {
            this.a.post(new Runnable() { // from class: o.bav.10
                @Override // java.lang.Runnable
                public void run() {
                    C4250bav.this.w.put(Long.valueOf(j), aVar);
                    InterfaceC4290bbi d2 = C4206baD.d(j + "", C4250bav.this.x);
                    if (d2 != null) {
                        d2.b(new InterfaceC4290bbi.a() { // from class: o.bav.10.4
                            @Override // o.InterfaceC4290bbi.a
                            public void c(InterfaceC4348bcn.c cVar, String str, Status status) {
                                C1044Mm.a("nf_offlineAgent", "onPlayableManifestReady");
                                InterfaceC4348bcn.a aVar2 = (InterfaceC4348bcn.a) C4250bav.this.w.remove(Long.valueOf(j));
                                if (aVar2 != null) {
                                    AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                                    C4250bav.this.d(cVar, aVar2, j, str, status);
                                    if (status.c().getValue() == StatusCode.DL_MANIFEST_DATA_MISSING.getValue()) {
                                        C4250bav.this.T();
                                        return;
                                    } else if (status.c().getValue() == StatusCode.DL_MANIFEST_NOT_FOUND_IN_CACHE.getValue()) {
                                        C4250bav.this.G.a();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                C1044Mm.a("nf_offlineAgent", "onPlayableManifestReady originalCallback not found");
                            }
                        });
                    } else {
                        C4250bav.this.d(null, aVar, j, "-1", new NetflixStatus(StatusCode.DL_OFFLINE_PLAYABLE_NOT_FOUND));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Long l) {
        InterfaceC4290bbi d2 = C4206baD.d(l.toString(), this.x);
        if (d2 != null) {
            d2.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        C1044Mm.c("nf_offlineAgent", "handleChangeCurrentOfflineStorageVolume newVolumeIndex=%d", Integer.valueOf(i));
        if (C4206baD.c(this.x)) {
            C1044Mm.d("nf_offlineAgent", "handleChangeCurrentOfflineStorageVolume can't change volume while active create operations");
            return;
        }
        boolean e2 = e(StopReason.WaitingToBeStarted);
        if (this.z.a(i)) {
            e(this.g);
            if (e2) {
                T();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.z.t();
        LocalBroadcastManager.getInstance(this.g).sendBroadcast(new Intent("com.netflix.mediaclient.intent.offline.osv.space.usage.updated"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.a.sendMessageDelayed(this.a.obtainMessage(9, Long.valueOf(j)), 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        this.a.removeMessages(9, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        this.a.removeMessages(9, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final InterfaceC4348bcn.c cVar, final InterfaceC4348bcn.a aVar, final long j, final String str, final Status status) {
        getMainHandler().post(new Runnable() { // from class: o.bav.7
            @Override // java.lang.Runnable
            public void run() {
                aVar.c(j, cVar, str, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        C1044Mm.a("nf_offlineAgent", "syncLicensesToServer");
        if (this.E.v()) {
            Q();
            this.v.a(C4206baD.b(this.z.i()), new InterfaceC4262bbG.b() { // from class: o.bav.15
                @Override // o.InterfaceC4262bbG.b
                public void d(final Map<String, ClientActionFromLase> map, final Status status) {
                    C4250bav.this.a.post(new Runnable() { // from class: o.bav.15.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C1044Mm.c("nf_offlineAgent", "onLicenseSyncDone res=%s", status);
                            for (Map.Entry entry : map.entrySet()) {
                                InterfaceC4290bbi d2 = C4206baD.d((String) entry.getKey(), C4250bav.this.x);
                                if (d2 != null) {
                                    d2.b((ClientActionFromLase) entry.getValue());
                                }
                            }
                            if (map.size() > 0) {
                                try {
                                    C4250bav.this.z.m();
                                } catch (PersistRegistryException unused) {
                                }
                            }
                            C4250bav.this.y();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        boolean z;
        C1044Mm.a("nf_offlineAgent", "afterLicenseSyncDone");
        if (this.x.isEmpty()) {
            C1044Mm.a("nf_offlineAgent", "afterLicenseSyncDone noOfflineContent");
        } else if (!ConnectivityUtils.o(this.g)) {
            C1044Mm.a("nf_offlineAgent", "afterLicenseSyncDone noInternet");
            OfflineErrorLogblob.c(getLoggingAgent().e(), "-1", "noInternet");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.x);
            C4225baW d2 = C4206baD.d(arrayList, C1842aQg.a.j());
            boolean z2 = false;
            String str = null;
            if (d2.e().isEmpty()) {
                z = false;
            } else {
                this.a.obtainMessage(18, new b(d2.e(), (InterfaceC4348bcn.b) null, true)).sendToTarget();
                z = true;
            }
            for (InterfaceC4290bbi interfaceC4290bbi : d2.a()) {
                a(interfaceC4290bbi.aH_(), C4206baD.e(interfaceC4290bbi), (C4241bam) null);
                z2 = true;
            }
            if (z && z2) {
                str = "replaceAndReDownloadDone";
            } else if (z) {
                str = "onlyReplaceDone";
            } else if (z2) {
                str = "onlyReDownloadDone";
            }
            if (str != null) {
                C1044Mm.c("nf_offlineAgent", "afterLicenseSyncDone sending logblobMsg=%s", str);
                OfflineErrorLogblob.c(getLoggingAgent().e(), "-1", str);
            }
        }
    }

    private void Q() {
        final Map<String, C4240bal> d2 = C4238baj.d(this.z);
        getMainHandler().post(new Runnable() { // from class: o.baB
            @Override // java.lang.Runnable
            public final void run() {
                C4250bav.this.a(d2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        this.A.a(map);
    }

    @Override // o.InterfaceC4348bcn
    public InterfaceC5097bsN f() {
        return new c();
    }

    @Override // o.InterfaceC4348bcn
    public void d(String str, InterfaceC4348bcn.b bVar) {
        if (C8159dfC.j()) {
            this.a.sendMessage(this.a.obtainMessage(18, new b(str, bVar, false)));
        } else if (bVar != null) {
            bVar.e();
        }
    }

    @Override // o.InterfaceC4348bcn
    public void c(InterfaceC4348bcn.d dVar) {
        this.d.c(dVar);
    }

    /* renamed from: o.bav$c */
    /* loaded from: classes3.dex */
    class c implements InterfaceC5097bsN {
        private PlayerManifestData b;

        @Override // o.InterfaceC5097bsN
        public void a(PlayerManifestData playerManifestData) {
            this.b = playerManifestData;
        }

        @Override // o.InterfaceC5097bsN
        public boolean b() {
            return true;
        }

        @Override // o.InterfaceC5097bsN
        public void c() {
        }

        @Override // o.InterfaceC5097bsN
        public void d() {
        }

        @Override // o.InterfaceC5097bsN
        public void d(long j) {
        }

        private c() {
        }

        @Override // o.InterfaceC5097bsN
        public void i() {
            PlayerManifestData playerManifestData = this.b;
            if (playerManifestData != null && playerManifestData.isOffline()) {
                C4250bav.this.a(this.b.getPlayableId());
            } else if (this.b == null || C4250bav.this.i == null) {
            } else {
                C4250bav.this.i.q();
            }
        }

        @Override // o.InterfaceC5097bsN
        public void d(IPlayer.c cVar) {
            PlayerManifestData playerManifestData = this.b;
            if (playerManifestData == null || !playerManifestData.isOffline()) {
                return;
            }
            C4250bav.this.d(this.b.getPlayableId());
        }

        @Override // o.InterfaceC5097bsN
        public void a() {
            PlayerManifestData playerManifestData = this.b;
            if (playerManifestData == null || !playerManifestData.isOffline()) {
                return;
            }
            C4250bav.this.b(this.b.getPlayableId());
        }
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.V;
    }

    @Override // o.aMF
    public com.netflix.mediaclient.service.StopReason getTimeoutStopReason() {
        return com.netflix.mediaclient.service.StopReason.INIT_TIMED_OUT_OFFLINE;
    }

    @Override // o.aMF
    public com.netflix.mediaclient.service.StopReason getStopReasonForInitFailed() {
        return com.netflix.mediaclient.service.StopReason.INIT_FAILED_OFFLINE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bav$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final InterfaceC4348bcn.b a;
        public final boolean b;
        public final List<String> d;

        public b(String str, InterfaceC4348bcn.b bVar, boolean z) {
            this(C4206baD.c(str), bVar, false);
        }

        public b(List<String> list, InterfaceC4348bcn.b bVar, boolean z) {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            this.a = bVar;
            this.b = z;
            arrayList.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        C1044Mm.a("nf_offlineAgent", "onPacsFeaturesUpdated");
        if (!this.b || J()) {
            return;
        }
        c(20);
    }
}
