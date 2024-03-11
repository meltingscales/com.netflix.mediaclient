package com.netflix.mediaclient;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.AndroidConsumptionOnly;
import com.netflix.cl.model.context.AppVersion;
import com.netflix.cl.model.context.Device;
import com.netflix.cl.model.context.DeviceLocale;
import com.netflix.cl.model.context.Esn;
import com.netflix.cl.model.context.MdxJs;
import com.netflix.cl.model.context.MdxLib;
import com.netflix.cl.model.context.NrdSessionId;
import com.netflix.cl.model.context.OsVersion;
import com.netflix.cl.model.context.UiVersion;
import com.netflix.cl.model.context.android.LiteProductMode;
import com.netflix.cl.model.context.tvui.NrdAppId;
import com.netflix.cl.model.event.session.UserInteraction;
import com.netflix.cl.model.event.session.VisitorDeviceId;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.media.BookmarkStoreRoom;
import com.netflix.mediaclient.net.NetworkRequestLogger;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import com.netflix.mediaclient.storage.db.OfflineDatabase;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.ui.home.api.repository.MismatchedRowException;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.NotificationUtils;
import com.uber.rxdogtag.RxDogTag;
import com.uber.rxdogtag.autodispose.AutoDisposeConfigurer;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.CompletableSubject;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractApplicationC1040Mh;
import o.AbstractC0944Ip;
import o.AbstractC0947Is;
import o.AbstractC1036Md;
import o.AbstractC1054My;
import o.AbstractC1243Ue;
import o.AbstractC1838aQc;
import o.C1044Mm;
import o.C1052Mw;
import o.C1071Np;
import o.C1079Nx;
import o.C1249Uk;
import o.C1278Vn;
import o.C1332Xp;
import o.C1333Xq;
import o.C1596aHd;
import o.C1742aMo;
import o.C1814aPf;
import o.C1848aQm;
import o.C2808an;
import o.C4984bqG;
import o.C5043brM;
import o.C5342bwu;
import o.C6046cRz;
import o.C6534cfC;
import o.C7437cwG;
import o.C7531cxv;
import o.C8003dcF;
import o.C8054ddD;
import o.C8055ddE;
import o.C8067ddQ;
import o.C8068ddR;
import o.C8116deM;
import o.C8120deQ;
import o.C8127deX;
import o.C8128deY;
import o.C8150deu;
import o.C8157dfA;
import o.C8168dfL;
import o.C8206dfx;
import o.C8268dhF;
import o.C8269dhG;
import o.C8271dhI;
import o.C8272dhJ;
import o.C8284dhV;
import o.C8310dhv;
import o.C8930fx;
import o.IB;
import o.InterfaceC1276Vl;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1659aJm;
import o.InterfaceC1666aJt;
import o.InterfaceC1926aTj;
import o.InterfaceC1929aTm;
import o.InterfaceC1985aVp;
import o.InterfaceC3643bFl;
import o.InterfaceC5091bsH;
import o.InterfaceC5297bwB;
import o.InterfaceC5298bwC;
import o.InterfaceC5300bwE;
import o.InterfaceC5301bwF;
import o.InterfaceC5344bww;
import o.InterfaceC5346bwy;
import o.InterfaceC5841cKi;
import o.InterfaceC6616cgf;
import o.InterfaceC7084cpY;
import o.InterfaceC7303ctf;
import o.InterfaceC9638uF;
import o.NB;
import o.NC;
import o.NK;
import o.NL;
import o.NM;
import o.NN;
import o.NQ;
import o.NR;
import o.NW;
import o.NZ;
import o.TN;
import o.TR;
import o.aCN;
import o.aHH;
import o.aHR;
import o.aIE;
import o.aMH;
import o.aMN;
import o.aRO;
import o.bDL;
import o.bMQ;
import o.bXB;
import o.bXE;

/* loaded from: classes.dex */
public abstract class NetflixApplication extends AbstractApplicationC1040Mh {
    private static final Gson f = new GsonBuilder().registerTypeAdapterFactory(AbstractC1036Md.b()).registerTypeAdapterFactory(AbstractC0944Ip.c()).registerTypeAdapterFactory(AbstractC1243Ue.d()).registerTypeAdapterFactory(AbstractC1054My.c()).registerTypeAdapterFactory(IB.b()).create();
    private static boolean n = false;
    private boolean C;
    protected InterfaceC5298bwC h;
    public InterfaceC1666aJt i;
    protected C1052Mw j;
    private NetflixActivity k;
    private long l;
    private long p;
    private long q;
    private boolean r;
    private Timer s;
    private long t;
    private Context v;
    private TimerTask w;
    private ServiceManager x;
    private C7437cwG y;
    protected CompletableSubject a = CompletableSubject.create();
    private boolean B = false;
    protected final NB g = NB.c();
    private final C8272dhJ A = new C8272dhJ();
    private final long m = 600;
    private final AtomicBoolean u = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    private final BroadcastReceiver f13159o = new BroadcastReceiver() { // from class: com.netflix.mediaclient.NetflixApplication.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED".equals(action)) {
                C1044Mm.e("NetflixApplication", "Netflix service is destroyed");
                NetflixApplication.this.u.set(false);
            } else if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE".equals(action)) {
                if (((StatusCode) intent.getSerializableExtra("status_code")).isSucess()) {
                    C1044Mm.e("NetflixApplication", " Netflix application is ready");
                    NetflixApplication.this.u.set(true);
                } else {
                    C1044Mm.e("NetflixApplication", " Netflix application is NOT ready");
                    NetflixApplication.this.u.set(false);
                }
                C1333Xq.a();
                NetflixApplication.this.q();
            }
        }
    };

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface d {
        Set<ApplicationStartupListener> c();

        InterfaceC7084cpY f();

        InterfaceC1601aHi g();

        bMQ h();

        InterfaceC7303ctf i();

        InterfaceC1929aTm j();

        aIE m();

        ServiceManager o();
    }

    public static void p() {
        AbstractApplicationC1040Mh.c = true;
    }

    public static void r() {
        AbstractApplicationC1040Mh.c = false;
    }

    public static boolean v() {
        return n;
    }

    public boolean C() {
        return this.B;
    }

    public NB D() {
        return this.g;
    }

    public void G() {
        this.r = true;
    }

    public boolean K() {
        boolean z = this.C;
        this.C = false;
        return z;
    }

    @Override // o.AbstractApplicationC1040Mh
    public void a(Context context) {
        this.v = context;
    }

    protected void b(Context context) {
    }

    @Override // o.AbstractApplicationC1040Mh
    public long g() {
        return this.d;
    }

    @Override // o.AbstractApplicationC1040Mh
    public C1052Mw i() {
        return this.j;
    }

    @Override // o.AbstractApplicationC1040Mh
    public CompletableSubject j() {
        return this.a;
    }

    @Override // o.AbstractApplicationC1040Mh
    public void t() {
        this.B = true;
    }

    public InterfaceC5298bwC u() {
        return this.h;
    }

    public NetflixActivity x() {
        return this.k;
    }

    public C8272dhJ y() {
        return this.A;
    }

    public C7437cwG z() {
        return this.y;
    }

    public void b(String str) {
        if (this.a.hasComplete()) {
            return;
        }
        C1044Mm.a("NetflixApplication", "signal homeLolomoLoadEnded => %s", str);
        c(str);
        this.a.onComplete();
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.HOME_TTR_DONE"));
        C8128deY.c(this);
        R();
    }

    private void R() {
        if (ConfigFastPropertyFeatureControlConfig.Companion.y()) {
            return;
        }
        InterfaceC1659aJm.c cVar = InterfaceC1659aJm.b;
        if (cVar.e().e()) {
            if (this.i == null) {
                InterfaceC1666aJt e = cVar.e().e(true);
                this.i = e;
                C1332Xp.a(InterfaceC1666aJt.class, e);
            }
            InterfaceC1666aJt interfaceC1666aJt = this.i;
            CaptureType captureType = CaptureType.d;
            interfaceC1666aJt.a(captureType, AppView.playback);
            if (C8120deQ.a()) {
                this.i.d(captureType);
            }
            this.i.a();
        }
    }

    public void a(boolean z, boolean z2) {
        if (this.t == 0) {
            this.t = System.currentTimeMillis() - this.d;
        }
        if (z) {
            this.l++;
        }
        if (z2) {
            this.p++;
        }
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put("appOnCreateLatency", String.valueOf(this.q));
        hashMap.put("latencyFromAppOnCreateToTTRStart", String.valueOf(this.t));
        hashMap.put("debugTtrColdStartCount", String.valueOf(this.l));
        hashMap.put("debugTtrColdStartCountV2", String.valueOf(this.p));
        hashMap.put("netflixServiceCreateCount", String.valueOf(NetflixService.b()));
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DEBUG_TTR_FINISHED, hashMap);
    }

    public static NetflixApplication getInstance() {
        return (NetflixApplication) AbstractApplicationC1040Mh.b;
    }

    @Override // o.AbstractApplicationC1040Mh
    public InterfaceC1929aTm h() {
        return ((d) EntryPointAccessors.fromApplication(this, d.class)).j();
    }

    @Override // o.AbstractApplicationC1040Mh
    public void d(Context context, String str) {
        d(context, str, null);
    }

    public void d(Context context, String str, Intent intent) {
        if (intent == null) {
            intent = aMH.c().b(context, str);
        }
        intent.addFlags(268599296);
        context.startActivity(intent);
        C8054ddD.e(context);
    }

    public static Intent d(Context context) {
        return new Intent(context, LaunchActivity.class).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (!k()) {
            super.onConfigurationChanged(configuration);
            return;
        }
        super.onConfigurationChanged(configuration);
        C1044Mm.e("NetflixApplication", "onConfigurationChanged");
        a((Locale) null);
    }

    public void c(ExternalCrashReporter externalCrashReporter) {
        if (C8067ddQ.c()) {
            C1044Mm.j("NetflixApplication", "Running under test, do NOT enable external crash reporter!");
            return;
        }
        externalCrashReporter.d((Context) this, true);
        externalCrashReporter.c("create");
        externalCrashReporter.d("device_locale", String.valueOf(Locale.getDefault()));
    }

    @Override // o.AbstractApplicationC1040Mh, android.app.Application
    public void onCreate() {
        super.onCreate();
        if (!k() || "robolectric".equals(android.os.Build.FINGERPRINT)) {
            return;
        }
        NB.c().c(C5043brM.a);
        try {
            for (ExternalCrashReporter externalCrashReporter : ExternalCrashReporter.a(this)) {
                c(externalCrashReporter);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        UiLatencyMarker a = UiLatencyMarker.a(this);
        a.e(UiLatencyMarker.Mark.INIT_CRASH_REPORTER_START, this.d);
        a.b(UiLatencyMarker.Mark.INIT_CRASH_REPORTER_END);
        if (C8206dfx.e()) {
            int d2 = C8157dfA.d((Context) this, "prefs_debug_force_product_mode", 0);
            if (d2 == 1) {
                C8120deQ.e("HIGH", this);
            } else if (d2 == 2) {
                C8120deQ.e("LOW", this);
            } else {
                C8120deQ.e(null, this);
            }
        }
        C1332Xp.a(Gson.class, f);
        C8055ddE.g(this);
        j(this);
        a.b(UiLatencyMarker.Mark.INIT_FP_START);
        c((Context) this);
        a.b(UiLatencyMarker.Mark.INIT_FP_END);
        a.b(UiLatencyMarker.Mark.INIT_HENDRIX_START);
        b((Context) this);
        a.b(UiLatencyMarker.Mark.INIT_HENDRIX_END);
        a((Locale) null);
        C8068ddR.c();
        if (C8054ddD.i()) {
            C8068ddR.e();
        }
        OfflineDatabase.d.a(this);
        C1044Mm.e("NetflixApplication", "Application onCreate");
        C8120deQ.c(getApplicationContext());
        this.j = new C1052Mw();
        Q();
        w();
        d dVar = (d) EntryPointAccessors.fromApplication(this, d.class);
        Hashtable hashtable = new Hashtable();
        e(hashtable);
        dVar.g().e(this, hashtable);
        a.b(UiLatencyMarker.Mark.REGISTER_TESTS_START);
        F();
        a.b(UiLatencyMarker.Mark.REGISTER_TESTS_END);
        a.b(UiLatencyMarker.Mark.REGISTER_LOOKUP_START);
        I();
        E();
        a.b(UiLatencyMarker.Mark.REGISTER_LOOKUP_END);
        if (th != null) {
            InterfaceC1597aHe.c("SPY-35111 - unable to initialize Bugsnag", th);
        }
        dVar.f().a();
        B();
        NotificationUtils.a(this);
        AbstractC0947Is.c(new AbstractC0947Is.b() { // from class: o.Mv
            @Override // o.AbstractC0947Is.b
            public final long b() {
                long U;
                U = NetflixApplication.this.U();
                return U;
            }
        });
        registerActivityLifecycleCallbacks(this.g);
        V();
        a.b(UiLatencyMarker.Mark.REGISTER_NONMEMBER_TESTS_START);
        e(this);
        a.b(UiLatencyMarker.Mark.REGISTER_NONMEMBER_TESTS_END);
        RxJavaPlugins.setErrorHandler(new Consumer() { // from class: o.Mz
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixApplication.this.e((Throwable) obj);
            }
        });
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(new Function() { // from class: o.MA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Scheduler e;
                e = NetflixApplication.e((Callable) obj);
                return e;
            }
        });
        RxDogTag.builder().configureWith(new RxDogTag.Configurer() { // from class: o.Mx
            @Override // com.uber.rxdogtag.RxDogTag.Configurer
            public final void apply(RxDogTag.Builder builder) {
                AutoDisposeConfigurer.configure(builder);
            }
        }).install();
        this.y = new C7437cwG(this);
        a.b(UiLatencyMarker.Mark.APP_LISTENER_START);
        for (ApplicationStartupListener applicationStartupListener : dVar.c()) {
            applicationStartupListener.onApplicationCreated(this);
        }
        a.b(UiLatencyMarker.Mark.APP_LISTENER_END);
        C8930fx.c.d(this, null, null);
        N();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.d;
        this.q = currentTimeMillis - j;
        a.e(UiLatencyMarker.Mark.APP_ON_CREATE_START, j);
        a.e(UiLatencyMarker.Mark.APP_ON_CREATE_END, currentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ long U() {
        int d2 = C8157dfA.d((Context) this, "lolomo_cache_expiration_hours_override", -1);
        return TimeUnit.HOURS.toMillis(d2 >= 0 ? d2 : 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Scheduler e(Callable callable) {
        return AndroidSchedulers.from(Looper.getMainLooper(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Throwable th) {
        if (th instanceof UndeliverableException) {
            th = th.getCause();
        }
        if (th instanceof OnErrorNotImplementedException) {
            th = th.getCause();
        }
        if (th != null && InterfaceC9638uF.e(this).e(th)) {
            C1044Mm.e("NetflixApplication", "image load canceled, " + th);
            return;
        }
        boolean z = (th instanceof CancellationException) || (th instanceof MismatchedRowException);
        if (C1079Nx.e(th)) {
            InterfaceC1597aHe.b(new C1596aHd().d(th).e("errorSource", "RxJavaDefaultErrorHandler").e("isBug", "true").e(z));
        } else {
            InterfaceC1598aHf.a(new C1596aHd().d(th).e("errorSource", "RxJavaDefaultErrorHandler").e("isBug", "false").e(z));
        }
    }

    private void N() {
        this.j.b(new Runnable() { // from class: o.Ms
            @Override // java.lang.Runnable
            public final void run() {
                NetflixApplication.this.S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        aCN a = aCN.a(this);
        InterfaceC1926aTj h = this.j.h();
        Objects.requireNonNull(h);
        h.d(a.c(h));
        X();
    }

    private void X() {
        final UserAgent k = this.j.k();
        Objects.requireNonNull(k);
        k.a(new UserAgent.b() { // from class: o.Mu
            @Override // com.netflix.mediaclient.service.user.UserAgent.b
            public final void d(boolean z) {
                NetflixApplication.e(UserAgent.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(UserAgent userAgent, boolean z) {
        C1044Mm.c("NetflixApplication", "performSharedLogoutCheck shouldLogout=%b", Boolean.valueOf(z));
        if (z) {
            userAgent.B();
        } else {
            C1044Mm.a("NetflixApplication", "performSharedLogoutCheck nothing done.");
        }
    }

    public void e(Map<String, String> map) {
        map.put("branch", C1249Uk.e(this).a());
        map.put("rev", C1249Uk.e(this).c());
    }

    protected void j(Context context) {
        C1332Xp.a(C1814aPf.class, new C1814aPf(context));
    }

    protected void F() {
        C1848aQm.a();
    }

    protected void c(Context context) {
        aRO.a();
        aRO.a(context);
    }

    protected void e(Context context) {
        C8003dcF.e();
        C8003dcF.e(context);
    }

    protected void w() {
        Logger.INSTANCE.start(new C8268dhF(this));
        h(this);
    }

    protected void B() {
        C8271dhI.e();
        this.A.a();
        new C1071Np().d(new C1079Nx.b() { // from class: o.Mr
            @Override // o.C1079Nx.b
            public final void run() {
                NetflixApplication.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T() {
        C8269dhG.d(AbstractApplicationC1040Mh.d());
    }

    public void H() {
        h(this);
        ServiceManager serviceManager = this.x;
        if (serviceManager != null && serviceManager.g() != null && this.x.g().w() != null) {
            Logger.INSTANCE.addContext(new Esn(this.x.g().w().m()));
        }
        String a = C8284dhV.a();
        if (C8168dfL.h(a)) {
            Logger.INSTANCE.startSession(new VisitorDeviceId(a));
        }
        ServiceManager serviceManager2 = this.x;
        if (serviceManager2 != null && serviceManager2.u() != null) {
            this.x.u().x();
        }
        Logger.INSTANCE.startSession(new UserInteraction());
        C8271dhI.c();
        C8271dhI.e();
        C8269dhG.a(AbstractApplicationC1040Mh.d());
        C8269dhG.d(AbstractApplicationC1040Mh.d());
        q();
    }

    private long P() {
        return TimeZone.getDefault().getOffset(new Date().getTime());
    }

    private void h(Context context) {
        Logger logger = Logger.INSTANCE;
        logger.addContext(new NrdAppId(C8127deX.b().toString()));
        logger.addContext(new NrdSessionId(C8127deX.a().longValue()));
        logger.addContext(new AppVersion(C8150deu.t(this)));
        logger.addContext(new Device(AbstractC1838aQc.c()));
        logger.addContext(new DeviceLocale(C4984bqG.b.e().b()));
        logger.addContext(new MdxLib("2014.1"));
        logger.addContext(new MdxJs("1.1.6-android"));
        logger.addContext(new OsVersion(String.valueOf(Build.VERSION.SDK_INT)));
        logger.addContext(new com.netflix.cl.model.context.UserAgent("Android"));
        logger.addContext(new com.netflix.cl.model.context.TimeZone(Long.valueOf(P())));
        C1278Vn.a(context);
        String d2 = C8150deu.d(context);
        C1044Mm.a("NetflixApplication", "Build data: %s", d2);
        logger.addContext(new UiVersion(d2));
        if (C8120deQ.a()) {
            logger.addContext(new LiteProductMode());
        }
        ((d) EntryPointAccessors.fromApplication(this, d.class)).m().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        ServiceManager serviceManager = this.x;
        if (serviceManager != null && serviceManager.c() && this.x.C()) {
            Logger.INSTANCE.addContext(new AndroidConsumptionOnly());
        }
    }

    protected void I() {
        d dVar = (d) EntryPointAccessors.fromApplication(this, d.class);
        a((Locale) null);
        InterfaceC5298bwC b = dVar.i().b((Context) this);
        this.h = b;
        C1332Xp.a(InterfaceC5298bwC.class, b);
        C1332Xp.a(InterfaceC1276Vl.class, this.A);
        C1332Xp.a(InterfaceC5346bwy.class, new C6534cfC());
        C1332Xp.a(InterfaceC5297bwB.class, new C7531cxv());
        C1332Xp.a(InterfaceC5301bwF.class, new C6046cRz());
        C1332Xp.a(InterfaceC5344bww.class, InterfaceC3643bFl.a(this).e());
        C1332Xp.a(InterfaceC5300bwE.class, dVar.f().d());
        C1332Xp.a(CryptoErrorManager.class, dVar.h().c());
        C1332Xp.a(TR.class, new TR() { // from class: com.netflix.mediaclient.NetflixApplication.3
        });
        C1332Xp.a(InterfaceC1985aVp.class, PerformanceProfilerImpl.INSTANCE);
        C1332Xp.a(BookmarkStore.class, new BookmarkStoreRoom(this));
        C1332Xp.a(C5342bwu.class, new C5342bwu(C2808an.a()));
        C1332Xp.a(NC.class, this.g);
        C1332Xp.a(aMN.class, C1742aMo.a(this));
        C1332Xp.a(bXE.class, new bXB((aMN) C1332Xp.b(aMN.class)));
        C1332Xp.a(aHH.class, NetworkRequestLogger.INSTANCE);
        C1332Xp.a(NW.class, new NZ());
    }

    protected void E() {
        C1332Xp.a(InterfaceC6616cgf.class, NQ.a);
        C1332Xp.a(InterfaceC5841cKi.class, NR.b);
        C1332Xp.a(NK.class, NN.d);
        C1332Xp.a(NL.class, NM.e);
        C1332Xp.a(aHR.class, new aHR());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (k()) {
            C1044Mm.a("NetflixApplication", "onTrimMemory: " + i);
            if (i != 20) {
                PerformanceProfilerImpl.d(i);
            }
        }
    }

    @Override // o.AbstractApplicationC1040Mh
    public void b() {
        this.B = false;
        C8157dfA.a(this, "useragent_userprofiles_data", (String) null);
    }

    @Override // o.AbstractApplicationC1040Mh
    public NC o() {
        return D();
    }

    public boolean M() {
        return (C8150deu.h() || C8150deu.f() || C8150deu.a() || C8150deu.r(this)) ? false : true;
    }

    private void V() {
        C1044Mm.e("NetflixApplication", "Registering application broadcast receiver");
        C8116deM.c(this, this.f13159o, "com.netflix.mediaclient.intent.category.NETFLIX_SERVICE", "com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE", "com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED");
    }

    public boolean A() {
        return this.u.get();
    }

    private void Q() {
        TN.a.e(ConnectivityUtils.e(getApplicationContext()));
    }

    public void a(NetflixActivity netflixActivity) {
        if (netflixActivity != null) {
            bDL.e(getApplicationContext()).e((Activity) netflixActivity);
        }
    }

    public void c(NetflixActivity netflixActivity) {
        NetflixActivity netflixActivity2 = this.k;
        if (netflixActivity2 == null || !netflixActivity2.equals(netflixActivity)) {
            return;
        }
        this.k = null;
    }

    public void J() {
        this.s = new Timer();
        TimerTask timerTask = new TimerTask() { // from class: com.netflix.mediaclient.NetflixApplication.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                NetflixApplication.this.C = true;
            }
        };
        this.w = timerTask;
        this.s.schedule(timerTask, 600L);
    }

    public void L() {
        TimerTask timerTask = this.w;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.s;
        if (timer != null) {
            timer.cancel();
        }
        this.C = false;
    }

    @Override // o.AbstractApplicationC1040Mh
    public boolean n() {
        return D().h();
    }

    @Override // o.AbstractApplicationC1040Mh
    public void m() {
        if (Build.VERSION.SDK_INT > 25) {
            ServiceManager serviceManager = this.x;
            if (serviceManager != null) {
                serviceManager.M();
            }
            ServiceManager o2 = ((d) EntryPointAccessors.fromApplication(this, d.class)).o();
            this.x = o2;
            o2.c(new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.NetflixApplication.1
                @Override // o.InterfaceC5091bsH
                public void onManagerReady(ServiceManager serviceManager2, Status status) {
                }

                @Override // o.InterfaceC5091bsH
                public void onManagerUnavailable(ServiceManager serviceManager2, Status status) {
                }
            });
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        SplitCompat.install(this);
    }

    @Override // o.AbstractApplicationC1040Mh
    public void a(Locale locale) {
        if (locale == null) {
            locale = C4984bqG.b.e(this).c();
        }
        C1332Xp.d(Context.class, C8310dhv.e(O(), locale), true);
    }

    private Context O() {
        Context context = this.v;
        if (context != null) {
            C1044Mm.a("NetflixApplication", "using dynamicContext");
            return context;
        }
        return getApplicationContext();
    }
}
