package com.netflix.mediaclient.ui.launch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.VideoView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.SignOutReason;
import com.netflix.cl.model.event.session.action.SignIn;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AnimatedSplashScreen;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RefreshUmaPreProfile;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.ActivityC4183bZh;
import o.C1044Mm;
import o.C1056Na;
import o.C1090Oh;
import o.C1332Xp;
import o.C4145bXx;
import o.C4187bZl;
import o.C4192bZq;
import o.C4932bpH;
import o.C4987bqJ;
import o.C5007bqd;
import o.C5020bqq;
import o.C6365cbt;
import o.C8010dcM;
import o.C8054ddD;
import o.C8116deM;
import o.C8120deQ;
import o.C8126deW;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8153dex;
import o.C8159dfC;
import o.C8168dfL;
import o.C8169dfM;
import o.C8187dfe;
import o.C9694vI;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1639aIt;
import o.InterfaceC1659aJm;
import o.InterfaceC1666aJt;
import o.InterfaceC3859bNh;
import o.InterfaceC4185bZj;
import o.InterfaceC4189bZn;
import o.InterfaceC5091bsH;
import o.InterfaceC5283bvo;
import o.InterfaceC5844cKl;
import o.InterfaceC6235cYw;
import o.InterfaceC6713ciW;
import o.InterfaceC7084cpY;
import o.InterfaceC7306cti;
import o.MI;
import o.aHO;
import o.bDM;
import o.bEX;
import o.bEY;
import o.bXE;
import o.bYE;
import o.bYP;
import o.cNT;
import o.cQQ;
import o.cVB;
import o.dpR;

@InterfaceC1639aIt
@AndroidEntryPoint
/* loaded from: classes.dex */
public class LaunchActivity extends bYP implements InterfaceC4185bZj {
    private static boolean e = true;
    private static byte e$ss2$9029 = 24;
    private static int q = 0;
    private static int r = 1;
    public boolean d;
    @Inject
    public bEX deepLinkHandler;
    @Inject
    public bEY deepLinkUtils;
    private boolean f;
    private String g;
    @Inject
    public InterfaceC3859bNh gameControllerMagicPathInboundNavigation;
    @Inject
    public InterfaceC6713ciW gameControllerRunState;
    private BroadcastReceiver h;
    private Status j;
    private Runnable k;
    private InterfaceC4189bZn l;
    @Inject
    public UiLatencyMarker latencyMarker;
    @Inject
    public LoginApi loginApi;
    private Long m;
    @Inject
    public InterfaceC7084cpY notificationsUi;
    @Inject
    public InterfaceC5844cKl profileApi;
    @Inject
    public C4187bZl profileGatePolicy;
    @Inject
    public cNT profileSelectionLauncher;
    private long s;
    private boolean t;
    private boolean a = true;
    private boolean b = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13278o = false;
    private final AtomicBoolean i = new AtomicBoolean(false);
    bYE c = new bYE();
    private final Runnable n = new Runnable() { // from class: o.bZb
        @Override // java.lang.Runnable
        public final void run() {
            LaunchActivity.this.p();
        }
    };
    private final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.netflix.mediaclient.intent.action.HANDLER_RESULT".equals(intent.getAction())) {
                C1044Mm.e("LaunchActivity", "Delayed nflx action completed, finish activity");
                LaunchActivity.this.b = true;
                LaunchActivity.this.j();
            }
        }
    };

    @Override // o.InterfaceC4185bZj
    public NetflixActivity a() {
        return this;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean allowTransitionAnimation() {
        return false;
    }

    @Override // o.InterfaceC4185bZj
    public Long c() {
        return this.m;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return null;
    }

    public boolean h() {
        return false;
    }

    protected boolean i() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.a;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAddSystemBarBackgroundViews() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldFinishOnManagerError() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("wasActivityExplicitlyFinished")) {
            if (ConfigFastPropertyFeatureControlConfig.Companion.w()) {
                C1044Mm.d("LaunchActivity", "Launch activity was recreated after we explicitly called finish(). Closing again to avoid processing the same deep link multiple times. See SPY-34055.");
                InterfaceC1593aHa.b("SPY-34055 - LaunchActivity recreated after finish");
                super.onCreate(bundle);
                finish();
                return;
            }
            C1044Mm.d("LaunchActivity", "Launch activity was recreated after we explicitly called finish(). Falling through because workaround has been disabled by kill switch. See See SPY-34055.");
        }
        this.s = System.currentTimeMillis();
        super.onCreate(bundle);
        InterfaceC5283bvo b = C8126deW.b();
        boolean z = b == null || b.isProfileLocked();
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction()) && ConfigFastPropertyFeatureControlConfig.Companion.v() && !z) {
            finish();
            return;
        }
        boolean a = this.gameControllerRunState.a();
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction()) && ConfigFastPropertyFeatureControlConfig.Companion.v() && a) {
            finish();
            return;
        }
        if (h()) {
            this.latencyMarker.e(UiLatencyMarker.Mark.RELAUNCH_ACTIVITY_CREATE, this.s);
        } else {
            this.latencyMarker.e(UiLatencyMarker.Mark.LAUNCH_ACTIVITY_CREATE, this.s);
        }
        if (NetflixApplication.getInstance().M() && !C8150deu.w(this)) {
            setRequestedOrientation(1);
        }
        if (bundle == null) {
            HashMap hashMap = new HashMap();
            boolean z2 = !NetflixService.i();
            this.d = z2;
            hashMap.put("isColdStart", String.valueOf(z2));
            hashMap.put("isColdStartV2", String.valueOf(e));
            e = false;
            String c = aHO.c(this);
            if (c != null) {
                hashMap.put("network_type", c);
            }
            if (i()) {
                PerformanceProfilerImpl performanceProfilerImpl = PerformanceProfilerImpl.INSTANCE;
                performanceProfilerImpl.a();
                performanceProfilerImpl.c(Sessions.TTI, hashMap);
                performanceProfilerImpl.c(Sessions.TTR, hashMap);
                performanceProfilerImpl.c(Sessions.DEBUG_TTR_FINISHED, hashMap);
                getNetflixApplication().a(this.d, e);
            }
        }
        e(getIntent());
        v();
        try {
            if (Config_FastProperty_AnimatedSplashScreen.Companion.e()) {
                if (getNetflixApplication().A()) {
                    C1044Mm.e("LaunchActivity", "Service is ready, just use loading view...");
                    f();
                } else {
                    C1044Mm.e("LaunchActivity", "Service is NOT ready, use splash screen... nf_config: splashscreen");
                    setContentView(R.i.bv);
                    this.c.a(this, (VideoView) findViewById(R.g.fS), findViewById(R.g.fT));
                }
            } else if (getNetflixApplication().A()) {
                C1044Mm.e("LaunchActivity", "Service is ready, just use loading view...");
                f();
            } else {
                C1044Mm.e("LaunchActivity", "Service is NOT ready, use splash screen... nf_config: splashscreen");
                setContentView(R.i.bw);
            }
        } catch (Exception e2) {
            try {
                getDrawable(R.e.aC);
                InterfaceC1598aHf.e("SPY-18624 - Creating LaunchActivity failed", e2);
            } catch (Exception unused) {
                C4145bXx.b.a();
            }
        }
        if (badInstallation()) {
            showMissingSplitError();
        }
        if (getIntent() != null && getIntent().getBooleanExtra(NetflixActivity.EXTRA_EXPAND_MDX_PLAYER, false)) {
            C8187dfe.a(new Runnable() { // from class: o.bYU
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.q();
                }
            }, 400L);
        }
        ((ObservableSubscribeProxy) C4987bqJ.i().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY)))).e(new Consumer() { // from class: o.bYT
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LaunchActivity.this.d((dpR) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        C1044Mm.b("LaunchActivity", "Sending show mini player intent");
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("com.netflix.mediaclient.service.ACTION_EXPAND_CAST_PLAYER"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(dpR dpr) {
        m();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        this.t = true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("wasActivityExplicitlyFinished", this.t);
    }

    protected void f() {
        setContentView(new C1090Oh(this));
        findViewById(R.g.dk).setVisibility(0);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.c.b(this);
        Status status = this.j;
        if (status == null || !status.i() || this.f) {
            return;
        }
        this.f = C1056Na.a(this, this.j);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f = false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        B();
        C();
        x();
        InterfaceC4189bZn interfaceC4189bZn = this.l;
        if (interfaceC4189bZn != null) {
            interfaceC4189bZn.c();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.1
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                LaunchActivity.this.j = status;
                LaunchActivity.this.a = false;
                if (C1056Na.a(LaunchActivity.this, status)) {
                    LaunchActivity.this.f = true;
                } else if (C8159dfC.c() && !C8151dev.c() && C1056Na.a(LaunchActivity.this, InterfaceC1078Nw.d)) {
                    LaunchActivity.this.f = true;
                } else {
                    LaunchActivity.this.b(serviceManager);
                }
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                LaunchActivity.this.a = false;
                LaunchActivity.this.j = status;
                LaunchActivity launchActivity = LaunchActivity.this;
                launchActivity.f = C1056Na.a(launchActivity, status);
            }
        };
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a(getServiceManager().E()) == NflxHandler.Response.HANDLING) {
            NetflixApplication.getInstance().l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ServiceManager serviceManager) {
        if (isFinishing()) {
            return;
        }
        C1044Mm.a("LaunchActivity", "LaunchActivity::handleManagerReady: starts loggedIn: %s, notActive: %s", Boolean.valueOf(serviceManager.E()), Boolean.valueOf(serviceManager.D()));
        boolean E = serviceManager.E();
        View findViewById = findViewById(R.g.fV);
        this.latencyMarker.b(UiLatencyMarker.Mark.LAUNCH_ACTIVITY_READY);
        this.latencyMarker.b(UiLatencyMarker.Condition.USER_LOGGED_IN, E);
        Intent f = NetflixApplication.getInstance().f();
        if (f != null) {
            setIntent(f);
        }
        if (!E && findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (!E || serviceManager.D()) {
            C1044Mm.e("LaunchActivity", "LaunchActivity::handleManagerReady: user not logged in ");
            this.c.e(C9694vI.a(this), new Runnable() { // from class: o.bYS
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.f(serviceManager);
                }
            });
            return;
        }
        C1044Mm.e("LaunchActivity", "LaunchActivity::handleManagerReady: user logged in ");
        m(serviceManager);
        C8010dcM.e(serviceManager);
        g(serviceManager);
    }

    private void g(final ServiceManager serviceManager) {
        boolean a = ((bXE) C1332Xp.b(bXE.class)).a();
        this.latencyMarker.b(UiLatencyMarker.Condition.LANGUAGE_INSTALL_PENDING, a);
        this.latencyMarker.b(UiLatencyMarker.Condition.NETWORK_CONNECTED, ConnectivityUtils.l(this));
        if (!a) {
            C1044Mm.e("LaunchActivity", "handleUserSignedIn, no request pending");
            o(serviceManager);
            return;
        }
        this.latencyMarker.b(UiLatencyMarker.Mark.LANGUAGE_INSTALL_START);
        C();
        x();
        this.k = new Runnable() { // from class: o.bZe
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.i(serviceManager);
            }
        };
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C1044Mm.e("LaunchActivity", "handleUserSignedIn, mLanguageInstallReceiver onReceive");
                LaunchActivity.this.o(serviceManager);
            }
        };
        this.h = broadcastReceiver;
        C8116deM.c(this, broadcastReceiver, null, bXE.e);
        C8187dfe.a(this.k, 5000L);
        String action = getIntent().getAction();
        if (action == null || !action.equals("com.netflix.mediaclient.LOGOUT")) {
            return;
        }
        c(serviceManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ServiceManager serviceManager) {
        C1044Mm.e("LaunchActivity", "handleUserSignedIn mPostLanguageInstallRunnable");
        o(serviceManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final ServiceManager serviceManager) {
        C();
        x();
        if (Config_FastProperty_RefreshUmaPreProfile.Companion.b()) {
            serviceManager.N();
        }
        this.c.e(C9694vI.a(this), new Runnable() { // from class: o.bYZ
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.h(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void h(ServiceManager serviceManager) {
        InterfaceC5283bvo a = C8126deW.a((NetflixActivity) this);
        NflxHandler.Response a2 = a != null ? a(true) : null;
        if (a2 == NflxHandler.Response.HANDLING) {
            C1044Mm.e("LaunchActivity", "Handled by nflx workflow");
            finish();
        } else if (a2 == NflxHandler.Response.HANDLING_WITH_DELAY) {
            C1044Mm.e("LaunchActivity", "Handled by nflx workflow with delay. Stay on splash screen...");
        } else {
            if (a == null || this.profileGatePolicy.b(getIntent(), h(), this.d) || (!h() && a.isProfileLocked())) {
                g();
            } else {
                n(serviceManager);
            }
            this.gameControllerMagicPathInboundNavigation.e(this);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f13278o = true;
        j();
    }

    public void g() {
        Intent c;
        if (this.d) {
            c = this.profileSelectionLauncher.b(this, AppView.appLoading);
        } else {
            c = this.profileSelectionLauncher.c(this, AppView.appLoading);
        }
        d(c);
    }

    public static void a(NetflixActivity netflixActivity) {
        Intent putExtra;
        C1044Mm.a("LaunchActivity", "Redirect to offline activity with profile %s, %s", C8126deW.d(netflixActivity).getProfileName(), C8126deW.b(netflixActivity));
        if (C8153dex.B()) {
            putExtra = InterfaceC5844cKl.e(netflixActivity).b();
        } else {
            putExtra = InterfaceC7306cti.d((Context) netflixActivity).d((Activity) netflixActivity).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false);
        }
        b(netflixActivity, putExtra);
    }

    @SuppressLint({"AutoDispose"})
    private void n(ServiceManager serviceManager) {
        if (d((NetflixActivity) this, serviceManager)) {
            a((NetflixActivity) this);
        } else {
            s();
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void s() {
        C1044Mm.a("LaunchActivity", "Redirect to home with profile %s, %s", C8126deW.d(this).getProfileName(), C8126deW.b((NetflixActivity) this));
        if (C8153dex.S()) {
            d(InterfaceC6235cYw.a(this).d());
        } else if (h()) {
            ActivityC4183bZh activityC4183bZh = (ActivityC4183bZh) this;
            d(HomeActivity.d(this, activityC4183bZh.j(), activityC4183bZh.l()).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false).putExtra("force_new_lolomo", activityC4183bZh.m()));
        } else {
            d(HomeActivity.d(this, AppView.appLoading, this.d).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false));
        }
    }

    private void m(ServiceManager serviceManager) {
        if (serviceManager.H()) {
            return;
        }
        C1044Mm.e("LaunchActivity", "Offline feature not available!");
    }

    public static boolean d(NetflixActivity netflixActivity, ServiceManager serviceManager) {
        if (ConnectivityUtils.n(netflixActivity)) {
            C1044Mm.e("LaunchActivity", "Network connectivity exist, go to LOLOMO");
            return false;
        } else if (!serviceManager.H()) {
            C1044Mm.e("LaunchActivity", "Offline feature not available!");
            return false;
        } else if (serviceManager.t() != null && netflixActivity.offlineApi.a().c() > 0) {
            C1044Mm.a("LaunchActivity", "Network connectivity do NOT exist, we have %d offline titles available, load Offline UI...", Integer.valueOf(netflixActivity.offlineApi.a().c()));
            return true;
        } else {
            C1044Mm.e("LaunchActivity", "Network connectivity do NOT exist, we do NOT have any offline titles available, load LOLOMO...");
            return false;
        }
    }

    protected boolean d() {
        return C8126deW.a((Context) this);
    }

    private void w() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.getBoolean("hasDeepLinks")) {
            return;
        }
        NetflixApplication.getInstance().c(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void f(ServiceManager serviceManager) {
        C1044Mm.e("LaunchActivity", "handleUserNotSignedIn starts");
        w();
        String action = getIntent().getAction();
        if (action != null && action.equals("com.netflix.mediaclient.LOGIN")) {
            j(serviceManager);
        } else if (serviceManager.E() && serviceManager.D()) {
            C1044Mm.e("LaunchActivity", "cookie'd in former member case");
            b();
        } else if (e(serviceManager)) {
            a(serviceManager);
        } else {
            NflxHandler.Response a = a(false);
            if (a == NflxHandler.Response.HANDLING) {
                NetflixApplication.getInstance().l();
                finish();
            } else if (a == NflxHandler.Response.HANDLING_WITH_DELAY) {
                C1044Mm.e("LaunchActivity", "Handled by nflx workflow with delay. Stay on splash screen...");
            } else if (d() && getUserAgent() != null && !getUserAgent().p()) {
                InterfaceC4189bZn e2 = C4192bZq.e.e(this);
                this.l = e2;
                e2.a();
                this.handler.postDelayed(this.n, 30000L);
            } else {
                C1044Mm.e("LaunchActivity", "Google Play Services are not available, go with regular workflow");
                e();
            }
        }
    }

    private boolean e(ServiceManager serviceManager) {
        if (serviceManager == null || serviceManager.u() == null) {
            e();
            return false;
        }
        return C8168dfL.h(serviceManager.u().o());
    }

    private void a(ServiceManager serviceManager) {
        C1044Mm.e("LaunchActivity", "handleCredentialTransfer: ");
        if (serviceManager == null || serviceManager.u() == null) {
            e();
            return;
        }
        String o2 = serviceManager.u().o();
        if (C8168dfL.g(o2)) {
            e();
            return;
        }
        serviceManager.u().y();
        C1044Mm.a("LaunchActivity", "handleCredentialTransferFromStub using autoLogin token %s", o2);
        c(o2);
    }

    private void j(ServiceManager serviceManager) {
        if (!ConnectivityUtils.n(this) || serviceManager == null || !serviceManager.c()) {
            C1044Mm.a("no connectivity, exiting...");
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString(SignupConstants.Field.EMAIL);
            String string2 = extras.getString(SignupConstants.Field.PASSWORD);
            C8150deu.d((Activity) this);
            if (serviceManager.E()) {
                C1044Mm.e("LaunchActivity", "we shouldn't really be here. ");
                return;
            }
            Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
            if (C8126deW.c(this) != null) {
                b(string, string2, false);
            }
        }
    }

    private void c(ServiceManager serviceManager) {
        if (!ConnectivityUtils.n(this) || serviceManager == null || !serviceManager.c()) {
            C1044Mm.a("no connectivity, exiting...");
        } else if (serviceManager.E()) {
            UserAgent c = C8126deW.c(this);
            if (c != null) {
                C1044Mm.e("LaunchActivity", "Forcing logout.");
                c.e(SignOutReason.userForced, true);
            }
        } else {
            C1044Mm.e("LaunchActivity", "User is already logged out.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (this.i.get()) {
            C1044Mm.e("LaunchActivity", "Callback already returned, login workflow in progress, do nothing");
            return;
        }
        C1044Mm.e("LaunchActivity", "=====> Timeout on Google Play Services, go with regular workflow");
        e();
    }

    @Override // o.InterfaceC4185bZj
    public void e() {
        y();
        if (ConnectivityUtils.n(this) && !getNetflixApplication().C()) {
            o();
        } else {
            l();
        }
        InterfaceC1593aHa.b("handleUserNotSignedInWithoutCredentials");
        C5020bqq.c(this);
    }

    private void r() {
        if (a(false) == NflxHandler.Response.HANDLING) {
            NetflixApplication.getInstance().l();
            C1044Mm.e("LaunchActivity", "Handled by nflx workflow when user is not signed in.");
            return;
        }
        C1044Mm.e("LaunchActivity", "Not handled by nflx workflow when user is not signed in.");
    }

    public void b() {
        y();
        o();
        InterfaceC1593aHa.b("handleUserNotActiveWithCredentials");
        C5020bqq.c(this);
    }

    private void y() {
        this.i.set(true);
        this.handler.removeCallbacks(this.n);
    }

    private void o() {
        if (!((bXE) C1332Xp.b(bXE.class)).c(cVB.b(getApplicationContext()))) {
            C1044Mm.e("LaunchActivity", "handleUserSignUp, no request pending");
            t();
            return;
        }
        C();
        x();
        this.k = new Runnable() { // from class: o.bYX
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.k();
            }
        };
        ViewUtils.a(findViewById(R.g.cM), 0);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C1044Mm.e("LaunchActivity", "handleUserSignUp, mLanguageInstallReceiver onReceive");
                LaunchActivity.this.t();
            }
        };
        this.h = broadcastReceiver;
        C8116deM.c(this, broadcastReceiver, null, bXE.e);
        C8187dfe.a(this.k, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        C1044Mm.e("LaunchActivity", "handleUserSignUp signUpLauncher");
        t();
    }

    private void x() {
        Runnable runnable = this.k;
        if (runnable != null) {
            C8187dfe.e(runnable);
            this.k = null;
        }
    }

    private void C() {
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            C8116deM.a(this, broadcastReceiver);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.latencyMarker.b(UiLatencyMarker.Mark.LANGUAGE_INSTALL_END);
        if (C8054ddD.l(this)) {
            return;
        }
        C1044Mm.e("LaunchActivity", "User has not signed up, redirect to Signup screen");
        C();
        x();
        cVB.c(this);
        d(cVB.d(this));
        r();
    }

    private void l() {
        C1044Mm.e("LaunchActivity", "User is NOT logged in, redirect to Login screen");
        Intent c = this.loginApi.c(this);
        if (C8168dfL.h(this.g)) {
            c.putExtra(SignupConstants.Field.EMAIL, this.g);
        }
        d(c);
        r();
    }

    private void d(C5007bqd c5007bqd, Status status) {
        Intent c;
        C1044Mm.e("LaunchActivity", "User is NOT logged in, redirect to Login screen");
        if (status.c() == StatusCode.USER_SIGNIN_FAILURE_TRY_SIGNUP) {
            c = cVB.a(this);
        } else {
            c = this.loginApi.c(this, c5007bqd, status);
        }
        d(c);
    }

    private NflxHandler.Response a(boolean z) {
        Intent e2;
        Intent intent = getIntent();
        if (this.deepLinkHandler.a(intent)) {
            if (z && this.profileSelectionLauncher.c(intent, this, AppView.webLink)) {
                C1044Mm.e("LaunchActivity", "User is signed in, profile gate launched!");
                return NflxHandler.Response.HANDLING;
            }
            C1044Mm.a("LaunchActivity", "User is signed in %b, handling deep link", Boolean.valueOf(z));
            return this.deepLinkHandler.a(intent, z);
        }
        try {
            if (C4932bpH.a(intent) && (e2 = C4932bpH.e(intent)) != null && this.deepLinkHandler.a(e2)) {
                if (z && this.profileSelectionLauncher.c(e2, this, AppView.webLink)) {
                    return NflxHandler.Response.HANDLING;
                }
                return this.deepLinkHandler.a(e2, z);
            }
        } catch (Throwable th) {
            C1044Mm.e("LaunchActivity", "Failed to parse partner intents ", th);
        }
        try {
            NflxHandler d = this.deepLinkHandler.d(intent, this.s);
            if (z && this.deepLinkUtils.b(d) && this.profileSelectionLauncher.c(intent, this, AppView.webLink)) {
                return NflxHandler.Response.HANDLING;
            }
            this.notificationsUi.e(this, intent);
            if (d.j() && !z) {
                C1044Mm.j("LaunchActivity", "handle:: Authorization is required and user is NOT signed in for handler %s!", this.handler.getClass().getSimpleName());
                return NflxHandler.Response.NOT_HANDLING;
            }
            return d.I_();
        } catch (Throwable th2) {
            C1044Mm.e("LaunchActivity", "Failed to parse nflx url ", th2);
            return NflxHandler.Response.NOT_HANDLING;
        }
    }

    private void d(Intent intent) {
        u();
        b(this, intent);
    }

    public static void b(final NetflixActivity netflixActivity, final Intent intent) {
        if (C8141del.c(netflixActivity)) {
            return;
        }
        if (netflixActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            netflixActivity.startActivity(intent);
            netflixActivity.overridePendingTransition(0, 0);
            netflixActivity.finish();
            return;
        }
        netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.5
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner) {
                NetflixActivity.this.startActivity(intent);
                NetflixActivity.this.overridePendingTransition(0, 0);
                NetflixActivity.this.finish();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner) {
                NetflixActivity.this.getLifecycle().removeObserver(this);
            }
        });
    }

    private void v() {
        C1044Mm.e("LaunchActivity", "Register receiver");
        C8116deM.c(this, this.p, "LocalIntentNflxUi", "com.netflix.mediaclient.intent.action.HANDLER_RESULT");
    }

    private void B() {
        C1044Mm.e("LaunchActivity", "Unregistering Nflx receiver");
        C8116deM.a(this, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        C1044Mm.c("LaunchActivity", "delayedHandlerActivityFinish mOnStopDone=%b mDelayedHandlerActionDone=%b", Boolean.valueOf(this.f13278o), Boolean.valueOf(this.b));
        if (this.f13278o && this.b && !C8054ddD.l(this)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Status status, C5007bqd c5007bqd) {
        int i = 2 % 2;
        C1044Mm.e("LaunchActivity", "Login Complete - Status: " + status);
        C1044Mm.a("Login complete - Status: " + status);
        setRequestedOrientation(-1);
        if (!status.j()) {
            int i2 = q + 41;
            r = i2 % 128;
            if (i2 % 2 == 0) {
                status.c();
                StatusCode statusCode = StatusCode.NRD_REGISTRATION_EXISTS;
                throw null;
            } else if (status.c() != StatusCode.NRD_REGISTRATION_EXISTS) {
                C1044Mm.d("LaunchActivity", "Login failed, redirect to LoginActivity with credential and status");
                ExtLogger.INSTANCE.failedExclusiveAction("SignIn", C8169dfM.b(status));
                d(c5007bqd, status);
                return;
            }
        }
        this.handler.removeCallbacks(this.n);
        String string = getString(R.o.gp);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            z(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = r + 7;
            q = i3 % 128;
            int i4 = i3 % 2;
        }
        showDebugToast(string);
        ExtLogger.INSTANCE.endExclusiveAction("SignIn");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i == 23) {
                C1044Mm.c("LaunchActivity", "onActivityResult: No action. IN_APP_UPDATE_REQUEST_CODE %d", Integer.valueOf(i2));
                return;
            }
            C1044Mm.d("LaunchActivity", "onActivityResult: unknown request code" + i);
            e();
            return;
        }
        InterfaceC4189bZn interfaceC4189bZn = this.l;
        boolean z = interfaceC4189bZn != null;
        boolean z2 = intent != null;
        if (z && z2) {
            interfaceC4189bZn.b(i, i2, intent);
            return;
        }
        C1044Mm.j("LaunchActivity", "onActivityResult: signIn provider null %b, intent is null %b, activity destroyed?", Boolean.valueOf(!z), Boolean.valueOf(!z2));
        e();
    }

    private void m() {
        C1044Mm.a("LaunchActivity", "New profile requested - starting profile selection activity...");
        if (C8054ddD.l(this)) {
            return;
        }
        C1044Mm.a("LaunchActivity", "New profile requested - continuing selection activity...");
        AbstractApplicationC1040Mh.getInstance().i().k();
        getIntent().getDataString();
        g();
        this.loginApi.a((Context) this);
    }

    private void e(Intent intent) {
        String stringExtra;
        if (intent == null || !intent.hasExtra("isAutomation") || (stringExtra = intent.getStringExtra("isAutomation")) == null) {
            return;
        }
        MI.a.d(Boolean.parseBoolean(stringExtra));
    }

    @Override // o.InterfaceC4185bZj
    @SuppressLint({"AutoDispose"})
    public void b(final String str, final String str2, final boolean z) {
        final C5007bqd[] c5007bqdArr = {null};
        ((SingleSubscribeProxy) this.loginApi.a((Activity) this).flatMap(new Function() { // from class: o.bZa
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c;
                c = LaunchActivity.c(c5007bqdArr, str, str2, z, (C6365cbt) obj);
                return c;
            }
        }).observeOn(AndroidSchedulers.mainThread()).as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY)))).a(new Consumer() { // from class: o.bYY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LaunchActivity.this.a(c5007bqdArr, (Status) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SingleSource c(C5007bqd[] c5007bqdArr, String str, String str2, boolean z, C6365cbt c6365cbt) {
        c5007bqdArr[0] = new C5007bqd(str, str2, null, null, z, c6365cbt.b(), c6365cbt.a(), c6365cbt.d());
        return new cQQ().e(c5007bqdArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C5007bqd[] c5007bqdArr, Status status) {
        a(status, c5007bqdArr[0]);
    }

    @SuppressLint({"AutoDispose"})
    private void c(String str) {
        new cQQ().e(str).observeOn(AndroidSchedulers.mainThread()).takeUntil(this.mActivityDestroy).subscribe(new bDM<Status>("LaunchActivity AutoLoginError") { // from class: com.netflix.mediaclient.ui.launch.LaunchActivity.9
            @Override // io.reactivex.Observer
            /* renamed from: d */
            public void onNext(Status status) {
                LaunchActivity.this.a(status, (C5007bqd) null);
            }
        });
    }

    private void u() {
        if (ConfigFastPropertyFeatureControlConfig.Companion.y()) {
            InterfaceC1659aJm.c cVar = InterfaceC1659aJm.b;
            if (cVar.e().e()) {
                InterfaceC1666aJt e2 = cVar.e().e(true);
                try {
                    C1332Xp.a(InterfaceC1666aJt.class, e2);
                    CaptureType captureType = CaptureType.d;
                    e2.a(captureType, AppView.playback);
                    if (C8120deQ.a()) {
                        e2.d(captureType);
                    }
                    e2.a();
                } catch (IllegalArgumentException unused) {
                    C1044Mm.e("LaunchActivity", "PerformanceMetricsManager was already registered");
                }
            }
        }
    }

    private void z(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$9029);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
