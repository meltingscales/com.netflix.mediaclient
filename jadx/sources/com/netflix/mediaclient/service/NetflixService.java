package com.netflix.mediaclient.service;

import android.app.AlarmManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.net.NetworkRequestLogger;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.api.diagnostics.IDiagnosis;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.job.NetflixJobInitializer;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.pushnotification.PushNotificationAgent;
import com.netflix.mediaclient.service.pushnotification.PushNotificationAgentFactory;
import com.netflix.mediaclient.service.pushnotification.PushNotificationJobExecutor;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import com.netflix.mediaclient.service.webclient.ftl.FtlController;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.NotificationUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.survey.Survey;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5046brP;
import o.AbstractServiceC1734aMg;
import o.C1044Mm;
import o.C1052Mw;
import o.C1332Xp;
import o.C1596aHd;
import o.C1653aJg;
import o.C1665aJs;
import o.C1735aMh;
import o.C1736aMi;
import o.C1737aMj;
import o.C1753aMz;
import o.C1812aPd;
import o.C1842aQg;
import o.C1879aRq;
import o.C1901aSl;
import o.C1904aSo;
import o.C1913aSx;
import o.C1920aTd;
import o.C1925aTi;
import o.C1928aTl;
import o.C1948aUe;
import o.C4221baS;
import o.C4250bav;
import o.C4312bcD;
import o.C4390bdc;
import o.C4394bdg;
import o.C4627biA;
import o.C4940bpP;
import o.C4944bpT;
import o.C4976bpz;
import o.C5051brU;
import o.C5078brv;
import o.C8054ddD;
import o.C8067ddQ;
import o.C8116deM;
import o.C8153dex;
import o.C8157dfA;
import o.C8159dfC;
import o.C8162dfF;
import o.C8166dfJ;
import o.C8168dfL;
import o.C9816xC;
import o.InterfaceC1078Nw;
import o.InterfaceC1251Um;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1602aHj;
import o.InterfaceC1692aKs;
import o.InterfaceC1843aQh;
import o.InterfaceC1898aSi;
import o.InterfaceC1926aTj;
import o.InterfaceC1929aTm;
import o.InterfaceC1938aTv;
import o.InterfaceC1985aVp;
import o.InterfaceC3856bNe;
import o.InterfaceC3857bNf;
import o.InterfaceC4005bSs;
import o.InterfaceC4208baF;
import o.InterfaceC4348bcn;
import o.InterfaceC5018bqo;
import o.InterfaceC5098bsO;
import o.InterfaceC5109bsZ;
import o.InterfaceC5127bsr;
import o.InterfaceC5128bss;
import o.InterfaceC5129bst;
import o.InterfaceC5130bsu;
import o.InterfaceC5131bsv;
import o.InterfaceC5133bsx;
import o.InterfaceC5160btX;
import o.InterfaceC5170bth;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;
import o.NB;
import o.TN;
import o.TQ;
import o.aCI;
import o.aGL;
import o.aGT;
import o.aHM;
import o.aHR;
import o.aMF;
import o.aMH;
import o.aMI;
import o.aMS;
import o.aMU;
import o.aOV;
import o.aRL;
import o.aSA;
import o.aSE;
import o.aSL;
import o.aVC;
import o.aVM;
import o.aYD;
import o.aZU;
import o.bXD;
import o.dpR;
import o.drM;
import o.dwQ;
import o.dwU;
import org.json.JSONException;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes.dex */
public final class NetflixService extends AbstractServiceC1734aMg implements InterfaceC5130bsu {
    private static boolean c;
    private static long d;
    private NetflixPowerManager C;
    private aYD D;
    private aHM F;
    private C4250bav G;
    private C1052Mw H;

    /* renamed from: J  reason: collision with root package name */
    private C1753aMz f13193J;
    private aMF K;
    private aMI L;
    private C4976bpz M;
    private long O;
    private PushNotificationAgent Q;
    private aZU R;
    private C4944bpT S;
    private UserAgentImpl T;
    private AbstractC5046brP U;
    private C5078brv W;
    private i X;
    @Inject
    public dwU appScope;
    private Handler b;
    @Inject
    public InterfaceC3857bNf cloudGameSSIDBeaconEventHandler;
    @Inject
    public InterfaceC3856bNe cloudGameSSIDBeaconJsonAdapter;
    private aSL h;
    @Inject
    public bXD interstitials;
    private C1920aTd j;
    private C1812aPd k;
    private CryptoErrorManager l;
    @Inject
    public Lazy<aCI> loggedOutGraphQLRepositoryLazy;
    private C1901aSl m;
    @Inject
    public InterfaceC1251Um mCdxAgent;
    @Inject
    public C1948aUe.c mClientLoggingAgentFactory;
    @Inject
    public C1812aPd.e mConfigurationAgentFactory;
    @Inject
    public aGT mLocalDiscovery;
    @Inject
    public Provider<NetflixJobInitializer> mNetflixJobInitializer;
    @Inject
    public InterfaceC1929aTm mNetflixJobScheduler;
    @Inject
    public InterfaceC1692aKs mPlayIntegrityMonitor;
    @Inject
    public dwQ mainDispatcher;
    private C1948aUe n;
    @Inject
    public InterfaceC1602aHj netflixCrashReporter;
    @Inject
    public InterfaceC1938aTv netflixWorkManager;

    /* renamed from: o  reason: collision with root package name */
    private C1736aMi f13194o;
    private aSA q;
    private C1913aSx r;
    private C1904aSo s;
    private aVM v;
    private b x;
    private InterfaceC1926aTj y;
    private aMS z;
    private final Map<NetflixJob.NetflixJobId, NetflixJobExecutor> B = new HashMap();
    private final C1737aMj i = new C1737aMj();
    private volatile boolean p = false;
    private a w = new a(InterfaceC1078Nw.aJ, null, null);
    private final ArrayList<d> t = new ArrayList<>();
    private boolean u = false;
    private final Set<Integer> N = new HashSet();
    private List<NetflixDataRequest> A = new ArrayList();
    private PublishSubject<dpR> P = PublishSubject.create();
    private CompositeDisposable g = null;
    private final aMF.b a = new aMF.b() { // from class: com.netflix.mediaclient.service.NetflixService.5
        @Override // o.aMF.b
        public TQ f() {
            return NetflixService.this;
        }

        @Override // o.aMF.b
        public InterfaceC5098bsO n() {
            return NetflixService.this;
        }

        @Override // o.aMF.b
        public Context b() {
            return NetflixService.this.getApplicationContext();
        }

        @Override // o.aMF.b
        public UserAgent l() {
            return NetflixService.this.T;
        }

        @Override // o.aMF.b
        public aOV a() {
            return NetflixService.this.k;
        }

        @Override // o.aMF.b
        public aMU c() {
            return NetflixService.this.z;
        }

        @Override // o.aMF.b
        /* renamed from: k */
        public C4944bpT m() {
            return NetflixService.this.S;
        }

        @Override // o.aMF.b
        public InterfaceC5128bss e() {
            return NetflixService.this.s;
        }

        @Override // o.aMF.b
        public IClientLogging h() {
            return NetflixService.this.n;
        }

        @Override // o.aMF.b
        public InterfaceC5129bst g() {
            return NetflixService.this.D;
        }

        @Override // o.aMF.b
        public InterfaceC4208baF j() {
            return NetflixService.this.G;
        }

        @Override // o.aMF.b
        public InterfaceC4348bcn i() {
            return NetflixService.this.G;
        }

        @Override // o.aMF.b
        public InterfaceC5170bth o() {
            return NetflixService.this.D;
        }

        @Override // o.aMF.b
        public ZuulAgent p() {
            return NetflixService.this.z();
        }

        @Override // o.aMF.b
        public InterfaceC1251Um d() {
            return NetflixService.this.h();
        }
    };
    private final IBinder f = new e();
    private final Runnable e = new Runnable() { // from class: o.aMu
        @Override // java.lang.Runnable
        public final void run() {
            NetflixService.this.aa();
        }
    };
    private final BroadcastReceiver I = new BroadcastReceiver() { // from class: com.netflix.mediaclient.service.NetflixService.6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1044Mm.a("NetflixService", "mNetworkChangeReceiver onReceive");
            NetflixService.this.b.removeCallbacks(NetflixService.this.E);
            NetflixService.this.b.postDelayed(NetflixService.this.E, 1000L);
        }
    };
    private final Runnable E = new Runnable() { // from class: com.netflix.mediaclient.service.NetflixService.7
        @Override // java.lang.Runnable
        public void run() {
            NetflixService.this.ac();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void e();
    }

    private void ae() {
    }

    public static long b() {
        return d;
    }

    public static boolean i() {
        return c;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC1898aSi B() {
        return this.W;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC5127bsr g() {
        return this.q;
    }

    public InterfaceC1251Um h() {
        return this.mCdxAgent;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC5128bss m() {
        return this.s;
    }

    @Override // o.InterfaceC5130bsu
    public aOV n() {
        return this.k;
    }

    @Override // o.InterfaceC5130bsu
    public IClientLogging o() {
        return this.n;
    }

    @Override // o.InterfaceC5130bsu
    public aSE p() {
        return this.r;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC4208baF q() {
        return this.G;
    }

    @Override // o.InterfaceC5130bsu
    public aMU s() {
        return this.z;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC5131bsv t() {
        return this.v;
    }

    @Override // o.InterfaceC5130bsu
    public UserAgent v() {
        return this.T;
    }

    public long x() {
        return this.O;
    }

    public ZuulAgent z() {
        return this.U;
    }

    /* loaded from: classes.dex */
    public class i extends BroadcastReceiver {
        private i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b = C8116deM.b(intent);
            if (C8168dfL.h(b)) {
                b.hashCode();
                if (b.equals("com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED")) {
                    if (C8162dfF.d(NetflixService.this.T)) {
                        NetflixService.this.O();
                    } else if (!Config_FastProperty_MdxEnabledViaFeatureConfig.isFeatureConfigMdxCheckEnabled() || NetflixService.this.u) {
                    } else {
                        NetflixService netflixService = NetflixService.this;
                        netflixService.d(netflixService.a, new aMF.c() { // from class: o.aMD
                            @Override // o.aMF.c
                            public final void d(aMF amf, Status status) {
                                NetflixService.i.this.d(amf, status);
                            }
                        });
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(aMF amf, Status status) {
            if (status.i()) {
                NetflixService.this.O();
            }
        }
    }

    @Override // o.AbstractServiceC1734aMg, android.app.Service
    public void onCreate() {
        C1044Mm.a("NetflixService", "NetflixService.onCreate.");
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.NETFLIX_SERVICE_LOADED);
        super.onCreate();
        R();
        Context applicationContext = getApplicationContext();
        C1052Mw i2 = AbstractApplicationC1040Mh.getInstance().i();
        this.H = i2;
        i2.x();
        C1736aMi c1736aMi = new C1736aMi(getApplicationContext(), this.loggedOutGraphQLRepositoryLazy);
        this.f13194o = c1736aMi;
        this.H.a(c1736aMi.b());
        c = true;
        d++;
        this.O = System.currentTimeMillis();
        MdxConnectionLogblobLogger.a();
        if (C8067ddQ.c()) {
            C9816xC.d(true);
            ((aHR) C1332Xp.b(aHR.class)).c(applicationContext);
        }
        this.b = new Handler();
        this.l = (CryptoErrorManager) C1332Xp.b(CryptoErrorManager.class);
        this.F = new aHM(applicationContext);
        NetworkRequestLogger networkRequestLogger = NetworkRequestLogger.INSTANCE;
        networkRequestLogger.c(this.a, this.O);
        this.F.b(networkRequestLogger);
        C1812aPd e2 = this.mConfigurationAgentFactory.e(this.l);
        this.k = e2;
        this.H.a(e2);
        aMS ams = new aMS(applicationContext, this.k);
        this.z = ams;
        this.H.a(ams);
        aYD ayd = new aYD(this.F, this.l, this.mPlayIntegrityMonitor);
        this.D = ayd;
        UserAgentImpl userAgentImpl = new UserAgentImpl(applicationContext, this.interstitials, this.k, ayd, this.appScope, this.mainDispatcher, this.loggedOutGraphQLRepositoryLazy);
        this.T = userAgentImpl;
        this.H.b((UserAgent) userAgentImpl);
        C4944bpT c4944bpT = new C4944bpT(applicationContext, this.F);
        this.S = c4944bpT;
        this.H.d(c4944bpT);
        C4390bdc c4390bdc = new C4390bdc(this, new C4394bdg(this.k, this.T, this.D));
        this.n = this.mClientLoggingAgentFactory.b(this.k, this.T, this.D);
        this.C = new NetflixPowerManager(applicationContext);
        if (C1879aRq.c()) {
            this.y = new C1925aTi(applicationContext, this.k, this.n, this.netflixWorkManager);
        } else {
            this.y = new C1928aTl(applicationContext, this.mNetflixJobScheduler, this.k, this.n);
        }
        this.H.e(this.y);
        this.G = new C4250bav(applicationContext, c4390bdc, this.k, this.T, this.y, this.F, this.C);
        Context applicationContext2 = getApplicationContext();
        C1812aPd c1812aPd = this.k;
        UserAgentImpl userAgentImpl2 = this.T;
        C4944bpT c4944bpT2 = this.S;
        C1948aUe c1948aUe = this.n;
        aHM ahm = this.F;
        C4250bav c4250bav = this.G;
        aMF b2 = C4312bcD.b(applicationContext2, c1812aPd, userAgentImpl2, c4944bpT2, c1948aUe, ahm, c4250bav, c4250bav, c4390bdc, this);
        this.K = b2;
        this.H.b(b2);
        this.Q = PushNotificationAgentFactory.createPushNotificationAgent(applicationContext, this.k, this.T, this.cloudGameSSIDBeaconEventHandler, this.cloudGameSSIDBeaconJsonAdapter);
        AbstractC5046brP b3 = C5051brU.d.b(applicationContext, this.k, this.T, this.P);
        this.U = b3;
        this.H.e(b3);
        this.H.d((IClientLogging) this.n);
        this.m = new C1901aSl();
        AbstractApplicationC1040Mh.getInstance().i().d((IDiagnosis) this.m);
        C1913aSx c1913aSx = new C1913aSx(this.k, this.T, this.Q, this.y);
        this.r = c1913aSx;
        this.H.a(c1913aSx);
        this.H.c(this.r);
        this.q = new aSA(this.r, this.i);
        C1904aSo c1904aSo = new C1904aSo();
        this.s = c1904aSo;
        this.H.b((InterfaceC5128bss) c1904aSo);
        this.W = new C5078brv(this.k, this.T);
        e(NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE, (NetflixJobExecutor) this.y);
        C1920aTd e3 = C1920aTd.e(this.mNetflixJobScheduler, this.r, this.T, this.G, this.k);
        this.j = e3;
        e(NetflixJob.NetflixJobId.INSOMNIA, e3);
        this.H.c(this.G);
        this.M = new C4976bpz(this.y, this.T);
        this.R = new aZU();
        this.l.b(x(), this.T, this.G, this.s);
        e(NetflixJob.NetflixJobId.PUSH_NOTIFICATION, new PushNotificationJobExecutor(applicationContext, this.mNetflixJobScheduler));
        this.H.e(this.mCdxAgent);
        ag();
        StartupErrorTracker.a.d();
        W();
    }

    private void R() {
        PublishSubject<dpR> publishSubject = this.P;
        if (publishSubject != null) {
            publishSubject.onComplete();
        }
        this.P = PublishSubject.create();
    }

    private void b(Intent intent) {
        if (C8054ddD.f() && intent.getBooleanExtra("start_foreground", false)) {
            C1044Mm.e("NetflixService", "Start service foreground...");
            Notification c2 = intent.getIntExtra("start_requester", -1) != 1 ? null : NotificationUtils.c(getApplicationContext());
            if (c2 != null) {
                C1044Mm.e("NetflixService", "sending foreground notification");
                c(30, c2, 1);
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null) {
            b(intent);
            if (this.p) {
                d(intent);
                return 2;
            }
            this.t.add(new h(intent, i2, i3));
            return 2;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        PushNotificationAgent pushNotificationAgent;
        InterfaceC1251Um interfaceC1251Um;
        C1044Mm.b("NetflixService", "Received start command intent ", intent);
        String action = intent.getAction();
        if (C8168dfL.g(action)) {
            return;
        }
        if ("com.netflix.mediaclient.service.ACTION_SHUTDOWN_SERVICE".equals(action)) {
            C1044Mm.a("NetflixService", "Stopping service via shutdown intent...");
            c = false;
            String stringExtra = intent.getStringExtra("stop_reason");
            c(stringExtra == null ? StopReason.UNKNOWN : StopReason.valueOf(stringExtra));
        } else if (this.w.a.j()) {
            M();
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.offline")) {
                C1044Mm.e("NetflixService", "Offline command intent ");
                if (this.G.isReady() && this.G.s()) {
                    this.G.j().e(intent);
                } else {
                    C1044Mm.d("NetflixService", "received a command while offline agent is not ready");
                }
            }
            if (C8153dex.l() && intent.hasCategory("com.netflix.mediaclient.intent.category.CDX") && (interfaceC1251Um = this.mCdxAgent) != null && interfaceC1251Um.a()) {
                C1044Mm.e("NetflixService", "CDX command intent ");
                this.mCdxAgent.c(intent);
            }
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX") && this.u && this.v != null) {
                C1044Mm.e("NetflixService", "MDX command intent ");
                this.v.c(intent);
            }
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.PUSH") && (((pushNotificationAgent = this.Q) != null && pushNotificationAgent.isSupported()) || intent.hasExtra("swiped_notification_id"))) {
                C1044Mm.e("NetflixService", "Push notification command intent ");
                this.Q.handleCommand(intent, this.r);
            }
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.LOGGING")) {
                C1044Mm.e("NetflixService", "Client logging command intent ");
                this.n.c(intent);
            }
        } else {
            InterfaceC1598aHf.a(new C1596aHd("SPY-15398 init failed, ignore command " + intent.getAction()).b(false));
            C1044Mm.d("NetflixService", "service init failed, not sending commands to agents");
        }
    }

    /* loaded from: classes.dex */
    final class h implements d {
        private final int a;
        private final int b;
        private final Intent e;

        public h(Intent intent, int i, int i2) {
            this.e = intent;
            this.a = i;
            this.b = i2;
        }

        @Override // com.netflix.mediaclient.service.NetflixService.d
        public void e() {
            if (NetflixService.this.w.a.j()) {
                NetflixService.this.d(this.e);
            }
        }
    }

    private ArrayList<aMF> S() {
        return new ArrayList<aMF>() { // from class: com.netflix.mediaclient.service.NetflixService.1
            {
                add(NetflixService.this.s);
                add(NetflixService.this.m);
                add(NetflixService.this.U);
            }
        };
    }

    private ArrayList<aMF> Q() {
        return new ArrayList<aMF>() { // from class: com.netflix.mediaclient.service.NetflixService.2
            {
                add(NetflixService.this.r);
                add(NetflixService.this.T);
                add(NetflixService.this.z);
                add(NetflixService.this.M);
                add(NetflixService.this.G);
                add(NetflixService.this.K);
                add(NetflixService.this.R);
                if (NetflixService.this.Q != null) {
                    add(NetflixService.this.Q);
                }
                add((aMF) NetflixService.this.mCdxAgent);
                add(NetflixService.this.W);
            }
        };
    }

    private void W() {
        synchronized (this) {
            e(getApplicationContext());
            AbstractApplicationC1040Mh.getInstance().m();
            ArrayList<aMF> arrayList = new ArrayList<aMF>() { // from class: com.netflix.mediaclient.service.NetflixService.3
                {
                    add(NetflixService.this.W);
                }
            };
            aMF.c d2 = d(arrayList);
            aMF.c K = K();
            aMF.c b2 = b(arrayList, K, d(arrayList, K, a(arrayList, K, d2)));
            C1044Mm.a("NetflixService", "NetflixService initing...");
            this.S.init(this.a, b2);
            C1735aMh.e.e(this.A, this.S, this.D);
            C1044Mm.a("NetflixService", "Service has 90 seconds to init or else we fail...");
            this.b.postDelayed(this.e, 90000L);
        }
    }

    private aMF.c K() {
        return new aMF.c() { // from class: o.aMv
            @Override // o.aMF.c
            public final void d(aMF amf, Status status) {
                NetflixService.a(amf, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(aMF amf, Status status) {
        C1044Mm.a("NetflixService", "agentsToInitOnErrorCallback agent inited: %s ", amf.agentName());
    }

    private aMF.c d(final ArrayList<aMF> arrayList) {
        final ArrayList<aMF> S = S();
        final ArrayList<aMF> Q = Q();
        final ArrayList<aMF> arrayList2 = new ArrayList<aMF>() { // from class: com.netflix.mediaclient.service.NetflixService.4
            {
                add(NetflixService.this.r);
                add(NetflixService.this.T);
            }
        };
        return new aMF.c() { // from class: com.netflix.mediaclient.service.NetflixService.10
            @Override // o.aMF.c
            public void d(aMF amf, Status status) {
                C8166dfJ.d();
                if (NetflixService.this.b(amf, status, arrayList, this)) {
                    return;
                }
                C1044Mm.a("NetflixService", "NetflixService successfully initiated ServiceAgent %s", amf.agentName());
                if (amf == NetflixService.this.D) {
                    NetflixService.this.b(this, S);
                } else if (S.contains(amf)) {
                    NetflixService.this.b(amf, this, S, Q);
                } else {
                    NetflixService.this.c(status, amf, this, Q, arrayList2);
                }
            }
        };
    }

    private void c(aMF amf, ArrayList<aMF> arrayList) {
        boolean remove = arrayList.remove(amf);
        if (remove) {
            boolean isEmpty = arrayList.isEmpty();
            if (remove && isEmpty) {
                Y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Status status, aMF amf, aMF.c cVar, ArrayList<aMF> arrayList, ArrayList<aMF> arrayList2) {
        C1044Mm.a("NetflixService", "Remove %s from batch2", amf.agentName());
        c(amf, arrayList2);
        arrayList.remove(amf);
        e(status, arrayList);
        Iterator<aMF> it = arrayList.iterator();
        while (it.hasNext()) {
            aMF next = it.next();
            if (!next.isReady()) {
                C1044Mm.a("NetflixService", "NetflixService still waiting for init of ServiceAgent %s", next.agentName());
            }
        }
    }

    private void e(Status status, ArrayList<aMF> arrayList) {
        if (arrayList.isEmpty()) {
            C1044Mm.a("NetflixService", "NetflixService successfully inited all ServiceAgents ");
            if (this.w.a.j()) {
                if (this.k.ad()) {
                    status = InterfaceC1078Nw.aE;
                    C1044Mm.j("NetflixService", "Current app is obsolete. It should not run!");
                } else if (!this.k.aH()) {
                    C1044Mm.j("NetflixService", "Current app is not recommended. User should be warned!");
                    status = InterfaceC1078Nw.az;
                }
            }
            b(status, "", (aMF) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(aMF amf, aMF.c cVar, ArrayList<aMF> arrayList, ArrayList<aMF> arrayList2) {
        C1044Mm.a("NetflixService", "Remove %s from batch1", amf.agentName());
        arrayList.remove(amf);
        if (arrayList.isEmpty()) {
            C1044Mm.e("NetflixService", "NetflixService successfully inited batch1 of ServiceAgents");
            Iterator<aMF> it = arrayList2.iterator();
            while (it.hasNext()) {
                aMF next = it.next();
                if (!next.isInitCalled()) {
                    next.init(this.a, cVar);
                } else {
                    C1044Mm.j("NetflixService", "Agent %s from batch2 already initialized!", next.agentName());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(aMF.c cVar, ArrayList<aMF> arrayList) {
        C1044Mm.e("NetflixService", "Go for batch1!");
        Iterator<aMF> it = arrayList.iterator();
        while (it.hasNext()) {
            aMF next = it.next();
            if (!next.isInitCalled()) {
                next.init(this.a, cVar);
            } else {
                C1044Mm.j("NetflixService", "Agent %s from batch1 already initialized!", next.agentName());
            }
        }
    }

    private aMF.c a(final ArrayList<aMF> arrayList, final aMF.c cVar, final aMF.c cVar2) {
        return new aMF.c() { // from class: o.aMp
            @Override // o.aMF.c
            public final void d(aMF amf, Status status) {
                NetflixService.this.a(arrayList, cVar, cVar2, amf, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ArrayList arrayList, aMF.c cVar, aMF.c cVar2, aMF amf, Status status) {
        C8166dfJ.d();
        if (b(amf, status, arrayList, cVar)) {
            return;
        }
        C1044Mm.c("NetflixService", "NetflixService successfully inited ServiceAgent %s", amf.agentName());
        this.D.init(this.a, cVar2);
    }

    private aMF.c b(final ArrayList<aMF> arrayList, final aMF.c cVar, final aMF.c cVar2) {
        return new aMF.c() { // from class: o.aMt
            @Override // o.aMF.c
            public final void d(aMF amf, Status status) {
                NetflixService.this.b(arrayList, cVar, cVar2, amf, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ArrayList arrayList, aMF.c cVar, aMF.c cVar2, aMF amf, Status status) {
        C8166dfJ.d();
        if (b(amf, status, arrayList, cVar)) {
            return;
        }
        C1044Mm.c("NetflixService", "NetflixService successfully inited ServiceAgent %s", amf.agentName());
        this.n.init(this.a, cVar2);
    }

    private aMF.c d(final ArrayList<aMF> arrayList, final aMF.c cVar, final aMF.c cVar2) {
        return new aMF.c() { // from class: o.aMx
            @Override // o.aMF.c
            public final void d(aMF amf, Status status) {
                NetflixService.this.d(arrayList, cVar, cVar2, amf, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ArrayList arrayList, aMF.c cVar, aMF.c cVar2, aMF amf, Status status) {
        C8166dfJ.d();
        if (b(amf, status, arrayList, cVar)) {
            return;
        }
        C1044Mm.c("NetflixService", "NetflixService successfully inited ServiceAgent %s", amf.agentName());
        Schedulers.io().scheduleDirect(new Runnable() { // from class: com.netflix.mediaclient.service.NetflixService.9
            @Override // java.lang.Runnable
            public void run() {
                C1842aQg.a.f();
            }
        });
        this.k.init(this.a, cVar2);
    }

    private void Y() {
        if (U() && I()) {
            InterfaceC5283bvo j2 = this.T.j();
            if (C8153dex.S()) {
                aGL.b(this, j2).c();
            }
            C1044Mm.j("NetflixService", "onFalkorAgentReady prefetch");
            InterfaceC4005bSs.a(this, j2).e(0, null, aRL.a().d(), true, true).onErrorComplete().takeUntil(this.P.ignoreElements()).subscribe();
        }
    }

    private boolean U() {
        int e2 = NB.c().e();
        C1044Mm.a("NetflixService", "Number of activities count = %d", Integer.valueOf(e2));
        return e2 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(aMF amf, Status status, List<aMF> list, aMF.c cVar) {
        if (status.i()) {
            C1044Mm.d("NetflixService", "NetflixService init failed with ServiceAgent " + amf.agentName() + " statusCode=" + status.c());
            if (this.n != null && status.c() == StatusCode.NET_CRONET_HOSTNAME_NOT_RESOLVED && U()) {
                new aVC(this.appScope, this.n).e(this);
            }
            for (aMF amf2 : list) {
                if (!amf2.isInitCalled()) {
                    amf2.init(this.a, cVar);
                } else {
                    C1044Mm.j("NetflixService", "Agent %s from error batch already initialized!", amf2.agentName());
                }
            }
            b(status, "failedAgent=" + amf.agentName(), amf);
            c(amf.getStopReasonForInitFailed());
            return true;
        }
        return false;
    }

    private void af() {
        C1653aJg.c(getApplicationContext());
        this.netflixCrashReporter.d();
    }

    private void e(Status status, String str, Map<String, String> map) {
        if (status.i()) {
            map.put("errorMsg", str);
            map.put("status", status.c().name());
            String l = status.l();
            if (l != null) {
                map.put("statusErrorMsg", l);
            }
            String str2 = "NetflixService initialization failed " + str;
            InterfaceC1593aHa.b(str2);
            InterfaceC1598aHf.a(new C1596aHd(str2).b(false).b(ErrorType.j).c(true).e(map));
        }
    }

    private void b(Status status, String str, aMF amf) {
        C8166dfJ.d();
        this.w = new a(status, str, amf);
        HashMap hashMap = new HashMap();
        e(status, str, hashMap);
        hashMap.put("createCount", String.valueOf(d));
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.NETFLIX_SERVICE_LOADED, hashMap);
        this.b.removeCallbacks(this.e);
        this.K.onNetflixPlatformInitComplete(status.j());
        if (status.j()) {
            AbstractApplicationC1040Mh.getInstance().i().s();
        } else {
            AbstractApplicationC1040Mh.getInstance().i().q();
        }
        af();
        C1044Mm.e("NetflixService", "Invoking InitCallbacks...");
        Iterator<d> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        this.t.clear();
        this.p = true;
        if (status.j()) {
            getApplicationContext().registerReceiver(this.I, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            PushNotificationAgent pushNotificationAgent = this.Q;
            if (pushNotificationAgent != null) {
                pushNotificationAgent.onServiceStarted();
            }
            C1044Mm.e("NetflixService", "Send local intent that Netflix service is ready");
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE");
            intent.putExtra("status_code", status.c());
            intent.addCategory("com.netflix.mediaclient.intent.category.NETFLIX_SERVICE");
            LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
            d(this.a, new aMF.c() { // from class: com.netflix.mediaclient.service.NetflixService.12
                @Override // o.aMF.c
                public void d(aMF amf2, Status status2) {
                    if (status2.i()) {
                        NetflixService.this.O();
                    }
                }
            });
            c(P());
            this.n.m();
            this.mNetflixJobInitializer.get().e();
            this.f13194o.b(new drM() { // from class: o.aMr
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR b2;
                    b2 = NetflixService.this.b((String) obj);
                    return b2;
                }
            });
        } else {
            StartupErrorTracker.a(status, str);
            ad();
            this.n.b();
        }
        ae();
        C1044Mm.a("NetflixService", "StopService runnable posted - service will die in %d seconds unless bound to or started...", 60);
        b(60000, StopReason.DELAYED_WAITING_FOR_FIRST_BIND);
        C1044Mm.b("NetflixService", "NetflixService init took=%d", Long.valueOf(System.currentTimeMillis() - this.O));
        C8159dfC.d(this.k);
        if (!status.j() && ConfigFastPropertyFeatureControlConfig.Companion.G() && AbstractApplicationC1040Mh.getInstance().o().j()) {
            C1044Mm.a("NetflixService", "NetflixService stopping self on bg errors");
            AbstractApplicationC1040Mh.getInstance().h().b(NetflixJob.NetflixJobId.INSOMNIA);
            C8054ddD.d(getApplicationContext(), TimeUnit.SECONDS.toMillis(2L));
            return;
        }
        C1044Mm.a("NetflixService", "NetflixService not stopping self on bg errors");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR b(String str) {
        this.H.a(str);
        return null;
    }

    private void ad() {
        this.n.l();
        C1044Mm.e("NetflixService", "startupError is scheduled to be sent");
    }

    private void e(Context context) {
        String e2 = C8157dfA.e(context, "preference_install_referrer_log", "");
        if (C8168dfL.h(e2)) {
            C1044Mm.a("NetflixService", "nf_install deeplink context %s ", e2);
            Logger.INSTANCE.addContext(new DeepLinkInput(Boolean.FALSE, e2, Double.valueOf(1.0d)));
            C8157dfA.e(context, "preference_install_referrer_log");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void aa() {
        StopReason timeoutStopReason;
        Status status;
        C1044Mm.a("NetflixService", "Service init has timed out, found which agent is not initialized");
        aMF V = V();
        if (V == null) {
            C1044Mm.j("NetflixService", "All agents are reported as initialized, check!");
            if (this.p) {
                C1044Mm.j("NetflixService", "Service was initialized since timeout was triggered, ignore");
                return;
            }
            C1044Mm.j("NetflixService", "Service was NOT initialized since timeout was triggered, but we where not able to detect which service agent caused it, report generic timeout...");
            status = InterfaceC1078Nw.A;
            timeoutStopReason = StopReason.INIT_TIMED_OUT;
        } else {
            Status timeoutStatus = V.getTimeoutStatus();
            timeoutStopReason = V.getTimeoutStopReason();
            status = timeoutStatus;
        }
        InterfaceC1598aHf.a(new C1596aHd("Service timeout: " + status.c().name()).b(false).e(true).e(new HashMap<String, String>(status) { // from class: com.netflix.mediaclient.service.NetflixService.8
            final /* synthetic */ Status b;

            {
                this.b = status;
                put("status", status.c().toString());
                put("appAge", AbstractApplicationC1040Mh.getInstance().c().toString());
                put("serviceAge", NetflixService.this.X().toString());
            }
        }));
        b(status, Audio.TYPE.timeout, (aMF) null);
        c(timeoutStopReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long X() {
        return Long.valueOf(this.O - System.currentTimeMillis());
    }

    private aMF b(List<aMF> list) {
        for (aMF amf : list) {
            if (amf.inInitialization()) {
                return amf;
            }
        }
        return null;
    }

    private aMF V() {
        if (this.S.inInitialization()) {
            return this.S;
        }
        if (this.k.inInitialization()) {
            return this.k;
        }
        if (this.D.inInitialization()) {
            return this.D;
        }
        aMF b2 = b(S());
        if (b2 != null) {
            C1044Mm.j("NetflixService", "Found agent that did not completed initialization in first batch %s", b2.agentName());
            return b2;
        }
        aMF b3 = b(Q());
        if (b3 != null) {
            C1044Mm.j("NetflixService", "Found agent that did not completed initialization in second batch %s", b3.agentName());
            return b3;
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        aVM avm;
        super.onDestroy();
        CompositeDisposable compositeDisposable = this.g;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
            this.g = null;
        }
        ab();
        this.P.onComplete();
        C1044Mm.a("NetflixService", "NetflixService.onDestroy.");
        M();
        C1044Mm.e("NetflixService", "Send local intent that Netflix service is destroyed");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED");
        intent.addCategory("com.netflix.mediaclient.intent.category.NETFLIX_SERVICE");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        C1753aMz c1753aMz = this.f13193J;
        if (c1753aMz != null) {
            b(c1753aMz, "PartnerOfflineBroadcastReceiver");
        }
        aMI ami = this.L;
        if (ami != null) {
            b(ami, "PartnerUserAgentBroadcastReceiver");
        }
        b(this.I, "network receiver");
        am();
        aj();
        this.i.clear();
        if (this.u && (avm = this.v) != null) {
            avm.destroy();
        }
        C1913aSx c1913aSx = this.r;
        if (c1913aSx != null) {
            c1913aSx.destroy();
        }
        aMF amf = this.K;
        if (amf != null) {
            amf.destroy();
        }
        UserAgentImpl userAgentImpl = this.T;
        if (userAgentImpl != null) {
            userAgentImpl.destroy();
        }
        C1812aPd c1812aPd = this.k;
        if (c1812aPd != null) {
            c1812aPd.destroy();
        }
        aMS ams = this.z;
        if (ams != null) {
            ams.destroy();
        }
        C4944bpT c4944bpT = this.S;
        if (c4944bpT != null) {
            c4944bpT.destroy();
        }
        C1948aUe c1948aUe = this.n;
        if (c1948aUe != null) {
            c1948aUe.destroy();
        }
        C1901aSl c1901aSl = this.m;
        if (c1901aSl != null) {
            c1901aSl.destroy();
        }
        C5078brv c5078brv = this.W;
        if (c5078brv != null) {
            c5078brv.destroy();
        }
        C4250bav c4250bav = this.G;
        if (c4250bav != null) {
            c4250bav.destroy();
        }
        aYD ayd = this.D;
        if (ayd != null) {
            ayd.destroy();
        }
        NetflixPowerManager netflixPowerManager = this.C;
        if (netflixPowerManager != null) {
            netflixPowerManager.d();
        }
        InterfaceC1926aTj interfaceC1926aTj = this.y;
        if (interfaceC1926aTj != null) {
            interfaceC1926aTj.e();
        }
        aZU azu = this.R;
        if (azu != null) {
            azu.destroy();
        }
        C1920aTd c1920aTd = this.j;
        if (c1920aTd != null) {
            c1920aTd.e();
        }
        this.B.clear();
        c = false;
        int myPid = Process.myPid();
        C1044Mm.e("NetflixService", "Destroying app process " + myPid + "...");
        Process.killProcess(myPid);
        C1044Mm.e("NetflixService", "Destroying app process " + myPid + " done.");
    }

    @Override // o.InterfaceC5130bsu
    public ImageLoader r() {
        return this.S.e();
    }

    @Override // o.InterfaceC5130bsu
    public void e(String str, AssetType assetType, int i2, int i3) {
        this.S.a(str, assetType, new g(i2, i3));
    }

    /* loaded from: classes.dex */
    class g extends C4940bpP {
        private final int a;
        private final int c;

        g(int i, int i2) {
            this.a = i;
            this.c = i2;
        }

        @Override // o.C4940bpP, o.InterfaceC4943bpS
        public void b(String str, String str2, Status status) {
            super.b(str, str2, status);
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.a);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onResourceFetched");
                return;
            }
            interfaceC5133bsx.onResourceFetched(this.c, str, str2, status);
            C4221baS.a(NetflixService.this.getApplicationContext());
        }

        @Override // o.C4940bpP, o.InterfaceC4943bpS
        public void b(String str, String str2, long j, long j2, Status status) {
            super.b(str, str2, j, j2, status);
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.a);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onResourceCached");
            } else {
                interfaceC5133bsx.onResourceCached(this.c, str, str2, j, j2, status);
            }
        }
    }

    @Override // o.InterfaceC5130bsu
    public void b(boolean z) {
        this.T.b(z);
    }

    @Override // o.InterfaceC5130bsu
    public boolean C() {
        return this.T.D();
    }

    @Override // o.InterfaceC5130bsu
    public boolean I() {
        return this.T.v();
    }

    @Override // o.InterfaceC5130bsu
    public boolean E() {
        return this.T.u();
    }

    @Override // o.InterfaceC5130bsu
    public String u() {
        return this.T.h();
    }

    @Override // o.InterfaceC5130bsu
    public void e(String str, String str2) {
        this.T.d(str, str2);
    }

    @Override // o.InterfaceC5130bsu
    public void G() {
        this.T.G();
    }

    @Override // o.InterfaceC5130bsu
    public void a(String str, int i2, int i3) {
        this.T.a(new j(i2, i3), str);
    }

    @Override // o.InterfaceC5130bsu
    public void d(String str) {
        this.T.f(str);
    }

    @Override // o.InterfaceC5130bsu
    public Single<Status> J() {
        return this.T.E();
    }

    @Override // o.InterfaceC5130bsu
    public Observable<Status> L() {
        return this.T.F();
    }

    @Override // o.InterfaceC5130bsu
    public void d(boolean z, String str, String str2) {
        this.T.e(z, str, str2);
    }

    @Override // o.InterfaceC5130bsu
    public UmaAlert D() {
        return this.T.z();
    }

    @Override // o.InterfaceC5130bsu
    public void j() {
        this.T.C();
    }

    @Override // o.InterfaceC5130bsu
    public List<? extends InterfaceC5283bvo> f() {
        return this.T.b();
    }

    @Override // o.InterfaceC5130bsu
    public void a(String str, Long l) {
        this.T.c(str, l);
    }

    @Override // o.InterfaceC5130bsu
    public boolean F() {
        UserAgentImpl userAgentImpl = this.T;
        if (userAgentImpl != null) {
            return userAgentImpl.I();
        }
        C1044Mm.j("NetflixService", "isProfileSwitchInProgress is false because user agent is null");
        return false;
    }

    @Override // o.InterfaceC5130bsu
    public void d(String str, boolean z, String str2, Integer num, int i2, int i3) {
        this.T.c(str, z, str2, num, new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void c(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, int i2, int i3) {
        this.T.e(str, str2, bool, str3, num, str4, list, bool2, bool3, new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void d(String str, int i2, int i3) {
        this.T.b(str, new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void b(String str, InterfaceC5284bvp interfaceC5284bvp, int i2, int i3) {
        this.T.e(str, interfaceC5284bvp, new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void d(int i2, int i3) {
        this.T.h(new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void e(int i2, int i3) {
        this.T.f(new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void e(int i2, int i3, String str) {
        this.T.c(new j(i2, i3), str);
    }

    @Override // o.InterfaceC5130bsu
    public void b(int i2, int i3, String str, String str2, String str3, String str4, Boolean bool) {
        this.T.e(new j(i2, i3), str, str2, str3, str4, bool);
    }

    /* loaded from: classes.dex */
    class j implements InterfaceC5018bqo {
        private final int b;
        private final int c;

        @Override // o.InterfaceC5018bqo
        public void e(Status status) {
        }

        j(int i, int i2) {
            this.c = i;
            this.b = i2;
        }

        @Override // o.InterfaceC5018bqo
        public void c(Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onLoginComplete");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onLoginComplete");
            interfaceC5133bsx.onLoginComplete(this.b, status);
        }

        @Override // o.InterfaceC5018bqo
        public void b(Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onLogoutComplete");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onLogoutComplete");
            interfaceC5133bsx.onLogoutComplete(this.b, status);
        }

        @Override // o.InterfaceC5018bqo
        public void a(boolean z, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onVerified");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onVerified");
            interfaceC5133bsx.onBooleanResponse(this.b, z, status);
        }

        @Override // o.InterfaceC5018bqo
        public void d(List<AvatarInfo> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onAvailableAvatarsListFetched");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onAvailableAvatarsListFetched");
            interfaceC5133bsx.onAvailableAvatarsListFetched(this.b, list, status);
        }

        @Override // o.InterfaceC5018bqo
        public void a(Status status, AccountData accountData) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onProfilesListUpdateResult");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onProfilesListUpdateResult");
            interfaceC5133bsx.onProfileListUpdateStatus(this.b, status, accountData);
        }

        @Override // o.InterfaceC5018bqo
        public void b(String str, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onAutoLoginTokenCreated");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onAutoLoginTokenCreated");
            interfaceC5133bsx.onAutoLoginTokenCreated(this.b, str, status);
        }

        @Override // o.InterfaceC5018bqo
        public void a(Survey survey, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onSurveyFetched");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onSurveyFetched");
            interfaceC5133bsx.onSurveyFetched(this.b, survey, status);
        }

        @Override // o.InterfaceC5018bqo
        public void a(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onUmsSimpleUrlPatternResolved");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onUmsSimpleUrlPatternResolved");
            interfaceC5133bsx.onUmsSimpleUrlPatternResolved(this.b, resolveSimpleUrlPatternResponse, status);
        }

        @Override // o.InterfaceC5018bqo
        public void e(AccountData accountData, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onAccountDataFetched");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onAccountDataFetched");
            interfaceC5133bsx.onAccountDataFetched(this.b, accountData, status);
        }

        @Override // o.InterfaceC5018bqo
        public void d(MembershipChoicesResponse membershipChoicesResponse, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onProductChoiceResponse");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onProductChoiceResponse");
            interfaceC5133bsx.onProductChoiceResponse(this.b, membershipChoicesResponse, status);
        }

        @Override // o.InterfaceC5018bqo
        public void a(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = NetflixService.this.i.get(this.c);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("NetflixService", "No client callback found for onUpdateProductChoiceResponse");
                return;
            }
            C1044Mm.e("NetflixService", "Notified onProductChoiceResponse");
            interfaceC5133bsx.onUpdateProductChoiceResponse(this.b, updateProductChoiceResponse, status);
        }
    }

    @Override // o.InterfaceC5130bsu
    public void c(int i2, int i3) {
        this.T.i(new j(i2, i3));
    }

    @Override // o.InterfaceC5130bsu
    public void H() {
        this.T.H();
    }

    @Override // o.InterfaceC5130bsu
    public void c(int i2, String str, String str2, Boolean bool, int i3, int i4) {
        this.T.d(i2, str, str2, bool, new j(i3, i4));
    }

    @Override // o.InterfaceC5130bsu
    public String w() {
        return this.k.aK();
    }

    @Override // o.InterfaceC5130bsu
    public DeviceCategory k() {
        return this.k.r();
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC5109bsZ y() {
        return new InterfaceC5109bsZ() { // from class: com.netflix.mediaclient.service.NetflixService.11
            @Override // o.InterfaceC5109bsZ
            public long e() {
                return NetflixService.this.k.aI();
            }

            @Override // o.InterfaceC5109bsZ
            public String b() {
                return NetflixService.this.k.aE();
            }
        };
    }

    /* loaded from: classes.dex */
    public class e extends Binder {
        public InterfaceC5130bsu b() {
            return NetflixService.this;
        }

        public e() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C1044Mm.e("NetflixService", "NetflixService is onBind");
        M();
        return this.f;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        aVM avm;
        C1044Mm.e("NetflixService", "NetflixService is onUnbind");
        int size = this.i.size();
        if (size > 0) {
            C1044Mm.a("NetflixService", "We still have " + size + " callbacks - not stopping service");
            return true;
        }
        if (this.u && (avm = this.v) != null && avm.k()) {
            C1044Mm.a("NetflixService", "has active mdx session");
        } else if (this.w.a == InterfaceC1078Nw.aG) {
            C1044Mm.a("NetflixService", "Service init failed due to no connectivity - calling stopSelf()");
            c(StopReason.NO_CONNECTIVITY);
        } else {
            b(28800000L, StopReason.DELAYED_ALL_CLIENTS_UNBOUND);
        }
        return true;
    }

    @Override // o.InterfaceC5130bsu
    public void b(InterfaceC5133bsx interfaceC5133bsx) {
        C8166dfJ.d();
        M();
        if (interfaceC5133bsx == null) {
            throw new IllegalStateException(" registerCallback - cb is null");
        }
        int e2 = this.i.e(interfaceC5133bsx);
        C1044Mm.a("NetflixService", "registerCallback, client: " + interfaceC5133bsx.hashCode());
        if (this.p) {
            c(e2, this.w);
            if (this.i.size() == 1) {
                C1044Mm.e("NetflixService", "UI started, notify MDX");
                Z();
                return;
            }
            return;
        }
        this.t.add(new c(e2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, a aVar) {
        C1044Mm.a("NetflixService", "Notifying client %s that service is ready, status code: %s", Integer.valueOf(i2), aVar.a);
        InterfaceC5133bsx interfaceC5133bsx = this.i.get(i2);
        if (interfaceC5133bsx != null) {
            interfaceC5133bsx.onServiceReady(i2, aVar.a, aVar.e);
        }
        if (this.k.isReady()) {
            this.f13194o.b(new drM() { // from class: o.aMs
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR e2;
                    e2 = NetflixService.this.e((String) obj);
                    return e2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(String str) {
        this.H.a(str);
        return null;
    }

    /* loaded from: classes.dex */
    class c implements d {
        private final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // com.netflix.mediaclient.service.NetflixService.d
        public void e() {
            NetflixService netflixService = NetflixService.this;
            netflixService.c(this.b, netflixService.w);
        }
    }

    @Override // o.InterfaceC5130bsu
    public void e(InterfaceC5133bsx interfaceC5133bsx) {
        if (interfaceC5133bsx == null) {
            return;
        }
        InterfaceC5133bsx a2 = this.i.a(interfaceC5133bsx);
        if (a2 == null) {
            C1044Mm.j("NetflixService", "Client callback was either not-registered/removed");
            return;
        }
        C1044Mm.a("NetflixService", "unregisterCallback, client: " + a2.hashCode());
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        C8157dfA.d(getApplicationContext(), "prefs_app_task_removed_user", true);
    }

    @Override // o.TQ
    public void a(long j2) {
        b(j2, StopReason.DELAYED_AFTER_PUSH_MESSAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j2, StopReason stopReason) {
        AlarmManager alarmManager = (AlarmManager) getApplicationContext().getSystemService("alarm");
        if (alarmManager == null) {
            C1044Mm.j("NetflixService", "Can't access alarm manager to set shutdown alarm");
            return;
        }
        try {
            alarmManager.set(2, SystemClock.elapsedRealtime() + j2, b(stopReason));
        } catch (Exception e2) {
            InterfaceC1598aHf.a(new C1596aHd("SPY-8729 - Exception trying to schedule an AlarmManager: " + e2).b(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AlarmManager alarmManager = (AlarmManager) getApplicationContext().getSystemService("alarm");
        if (alarmManager == null) {
            C1044Mm.j("NetflixService", "Can't access alarm manager to cancel shutdown alarm");
        } else {
            alarmManager.cancel(b((StopReason) null));
        }
    }

    private PendingIntent b(StopReason stopReason) {
        Intent intent = new Intent("com.netflix.mediaclient.service.ACTION_SHUTDOWN_SERVICE").setClass(getApplicationContext(), NetflixService.class);
        if (stopReason != null) {
            intent.putExtra("stop_reason", stopReason.name());
        }
        return PendingIntent.getService(this, 0, intent, 201326592);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String action = intent.getAction();
            if (action == null) {
                C1044Mm.a("NetflixService", "intent action is not set.");
                return;
            }
            InterfaceC5160btX d = d();
            int hashCode = action.hashCode();
            boolean z5 = false;
            if (hashCode == -1622678632) {
                if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE")) {
                    z = false;
                }
                z = true;
            } else if (hashCode != -675501401) {
                if (hashCode == -603676882 && action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART")) {
                    z = true;
                }
                z = true;
            } else {
                if (action.equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND")) {
                    z = true;
                }
                z = true;
            }
            if (!z) {
                int intExtra = intent.getIntExtra("time", -1);
                C1044Mm.b("NetflixService", "on MDX state update - received updated mdx position: " + intExtra);
                long millis = intExtra >= 0 ? TimeUnit.SECONDS.toMillis(intExtra) : -1L;
                if (d != null) {
                    C1044Mm.b("NetflixService", "updating cached video position");
                    NetflixService.this.g().c(d.aH_(), millis);
                    z5 = d.aX_();
                    z2 = d.H();
                } else {
                    z2 = false;
                }
                aMH.c().b(z5, z2);
            } else if (!z) {
                if (z) {
                    if (NetflixService.this.v != null && NetflixService.this.v.k()) {
                        C1044Mm.a("NetflixService", "start mdx notification");
                        NetflixService.this.M();
                        if (d != null) {
                            C1044Mm.e("NetflixService", "refreshing episodes data on play start");
                            NetflixService.this.g().a(d.aH_(), a());
                            return;
                        }
                        return;
                    }
                    C1044Mm.d("NetflixService", "false MDX_ACTION_UPDATE_PLAYBACKSTART");
                    return;
                }
                C1044Mm.d("NetflixService", "invalid action type.");
            } else {
                C1044Mm.a("NetflixService", "mdx exit, stop service in %sms", 28800000L);
                NetflixService.this.b(28800000L, StopReason.DELAYED_MDX_EXIT);
                if (d != null) {
                    z3 = d.aX_();
                    z4 = d.H();
                } else {
                    z3 = false;
                    z4 = false;
                }
                aMH.c().b(z3, z4);
                if (intent.getBooleanExtra("updateCW", true)) {
                    C1044Mm.e("NetflixService", "Refreshing CW for MDX_ACTION_UPDATE_PLAYBACKEND...");
                    InterfaceC1593aHa.b("mdx.cw.refresh");
                    NetflixService.this.g().a(false, (String) null);
                }
            }
        }

        private InterfaceC5160btX d() {
            if (NetflixService.this.v != null) {
                InterfaceC5160btX aE_ = NetflixService.this.v.o() != null ? NetflixService.this.v.o().aE_() : null;
                if (aE_ != null && C8168dfL.h(aE_.aH_())) {
                    return aE_;
                }
            }
            return null;
        }

        private VideoType a() {
            return (NetflixService.this.v == null || NetflixService.this.v.o() == null) ? VideoType.UNKNOWN : NetflixService.this.v.o().getType();
        }
    }

    private void aj() {
        b bVar = this.x;
        if (bVar != null) {
            e(bVar, "MDX receiver");
            this.x = null;
        }
    }

    private void ah() {
        aj();
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        this.x = new b();
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.x, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aMF.b bVar, aMF.c cVar) {
        O();
        this.u = !this.k.H().a();
        if (C8162dfF.d(this.T)) {
            this.u = false;
        }
        if (this.u) {
            aVM avm = new aVM(this.k, this.F, this.mLocalDiscovery);
            this.v = avm;
            this.H.b((InterfaceC5131bsv) avm);
            ah();
            this.v.init(bVar, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        C1044Mm.a("NetflixService", "disableMdxAgent");
        aVM avm = this.v;
        if (avm != null && avm.isInitCalled()) {
            this.v.destroy();
            this.v = null;
        }
        this.H.b((InterfaceC5131bsv) null);
        this.u = false;
    }

    @Override // o.InterfaceC5130bsu
    public InterfaceC1843aQh l() {
        return this.k.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        C1044Mm.a("NetflixService", "onNetworkChange");
        ConnectivityUtils.NetType e2 = ConnectivityUtils.e(getApplicationContext());
        TN.a.e(e2);
        FtlController.INSTANCE.e();
        this.K.handleConnectivityChange(e2);
        this.n.handleConnectivityChange(e2);
        this.R.handleConnectivityChange(e2);
        aVM avm = this.v;
        if (avm != null) {
            avm.handleConnectivityChange(e2);
        }
        this.G.handleConnectivityChange(e2);
        this.k.handleConnectivityChange(e2);
        this.z.handleConnectivityChange(e2);
        if (e2 == null || !this.k.isReady()) {
            return;
        }
        this.f13194o.b(new drM() { // from class: o.aMy
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a2;
                a2 = NetflixService.this.a((String) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(String str) {
        this.H.a(str);
        return null;
    }

    private void b(BroadcastReceiver broadcastReceiver, String str) {
        if (broadcastReceiver == null) {
            C1044Mm.e("NetflixService", "Unable to unregister, receiver is null");
            return;
        }
        try {
            unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
            C1044Mm.d("NetflixService", "Unregister " + str + " failed.");
        }
    }

    private void e(BroadcastReceiver broadcastReceiver, String str) {
        if (broadcastReceiver == null) {
            C1044Mm.e("NetflixService", "Unable to unregister, receiver is null");
            return;
        }
        try {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
            C1044Mm.d("NetflixService", "Unregister " + str + " failed.");
        }
    }

    private void Z() {
        aVM avm;
        if (!this.u || (avm = this.v) == null || avm.k()) {
            return;
        }
        this.v.D();
    }

    @Override // o.InterfaceC5130bsu
    public void N() {
        C1044Mm.e("NetflixService", "UI coming from background, notify MDX");
        Z();
        if (this.k.isReady()) {
            this.f13194o.b(new drM() { // from class: o.aMq
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR c2;
                    c2 = NetflixService.this.c((String) obj);
                    return c2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR c(String str) {
        this.H.a(str);
        return null;
    }

    @Override // o.InterfaceC5130bsu
    public IVoip A() {
        return this.W.c();
    }

    @Override // o.TQ
    public void e(NetflixJob.NetflixJobId netflixJobId, NetflixJobExecutor netflixJobExecutor) {
        synchronized (this.B) {
            this.B.put(netflixJobId, netflixJobExecutor);
        }
    }

    @Override // o.InterfaceC5130bsu
    public NetflixJobExecutor d(NetflixJob.NetflixJobId netflixJobId) {
        NetflixJobExecutor netflixJobExecutor;
        synchronized (this.B) {
            netflixJobExecutor = this.B.get(netflixJobId);
        }
        return netflixJobExecutor;
    }

    @Override // o.InterfaceC5098bsO
    public void c(int i2, Notification notification, int i3) {
        C8166dfJ.d();
        if (this.N.contains(Integer.valueOf(i2))) {
            return;
        }
        if (C8054ddD.j()) {
            try {
                startForeground(i2, notification, i3);
                this.N.add(Integer.valueOf(i2));
                return;
            } catch (ForegroundServiceStartNotAllowedException unused) {
                InterfaceC1598aHf.a(new C1596aHd("unable to start foreground service for " + i2).b(false));
                return;
            }
        }
        startForeground(i2, notification);
        this.N.add(Integer.valueOf(i2));
    }

    @Override // o.InterfaceC5098bsO
    public void d(int i2, boolean z) {
        C8166dfJ.d();
        this.N.remove(Integer.valueOf(i2));
        if (C8054ddD.f()) {
            z = true;
        }
        stopForeground(z);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (this.p) {
            if (i2 >= 60) {
                this.G.onTrimMemory(i2);
            }
            this.K.onTrimMemory(i2);
            this.S.onTrimMemory(i2);
        }
    }

    @Override // o.InterfaceC5130bsu
    public void e(Intent intent) {
        d(intent);
    }

    @Override // o.TQ
    public boolean c(NetflixDataRequest netflixDataRequest) {
        return C1735aMh.e.b(netflixDataRequest);
    }

    @Override // o.TQ
    public void e() {
        synchronized (this) {
            if (this.A.size() > 0) {
                C1044Mm.a("NetflixService", "Crypto is initialized with delay, MSL is ready, send MSL requests: %d", Integer.valueOf(this.A.size()));
                for (NetflixDataRequest netflixDataRequest : this.A) {
                    this.S.a(netflixDataRequest);
                }
                this.A.clear();
            } else {
                C1044Mm.e("NetflixService", "No pending MSL requests...");
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context, o.InterfaceC5130bsu
    public Context getApplicationContext() {
        return AbstractApplicationC1040Mh.d();
    }

    private void c(JSONObject jSONObject) {
        this.n.c(NetworkRequestLogger.INSTANCE.c(), C4627biA.d().c(), jSONObject);
        C1044Mm.e("NetflixService", "BLOB: startup is scheduled to be sent");
    }

    private void ag() {
        am();
        this.X = new i();
        C8116deM.c(getApplicationContext(), this.X, null, "com.netflix.mediaclient.intent.action.ACCOUNT_DATA_FETCHED");
    }

    private void am() {
        if (this.X != null) {
            C8116deM.a(getApplicationContext(), this.X);
            this.X = null;
        }
    }

    private JSONObject P() {
        if (this.h == null) {
            aSL asl = new aSL(this.P, getApplicationContext(), n());
            this.h = asl;
            return asl.a();
        }
        return null;
    }

    private void c(StopReason stopReason) {
        C1044Mm.c("NetflixService", "stopServiceAndLogReason, reason: %s, create count: %d", stopReason, Long.valueOf(d));
        C1665aJs c1665aJs = new C1665aJs();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", stopReason.name());
        } catch (JSONException e2) {
            C1044Mm.e("NetflixService", "error creating trace", e2);
        }
        c1665aJs.e("NetflixServiceStopSelf", d, NetflixTraceCategory.device, null, null, jSONObject);
        Logger.INSTANCE.logEvent(c1665aJs.c());
        stopSelf();
    }

    private void ab() {
        C1044Mm.c("NetflixService", "logOnDestroy, create count: %d", Long.valueOf(d));
        C1665aJs c1665aJs = new C1665aJs();
        c1665aJs.e("NetflixServiceOnDestroy", d, NetflixTraceCategory.device, null, null, null);
        Logger.INSTANCE.logEvent(c1665aJs.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        final Status a;
        final String d;
        final String e;

        a(Status status, String str, aMF amf) {
            this.a = status;
            this.e = str;
            this.d = amf == null ? null : amf.agentName();
        }
    }
}
