package com.netflix.mediaclient.ui.home;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.clcs.ui.InterstitialCoordinator;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.api.Params;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;
import javax.inject.Inject;
import o.ActivityC3995bSi;
import o.ActivityC4183bZh;
import o.C1044Mm;
import o.C1333Xq;
import o.C3991bSe;
import o.C4141bXt;
import o.C4987bqJ;
import o.C6193cXh;
import o.C6404ccf;
import o.C6409cck;
import o.C6413cco;
import o.C6414ccp;
import o.C6452cda;
import o.C6455cdd;
import o.C6491ceM;
import o.C8054ddD;
import o.C8076ddZ;
import o.C8126deW;
import o.C8141del;
import o.C8153dex;
import o.C8168dfL;
import o.C8179dfW;
import o.C8187dfe;
import o.C9843xd;
import o.C9954zi;
import o.InterfaceC1077Nv;
import o.InterfaceC1593aHa;
import o.InterfaceC1640aIu;
import o.InterfaceC3853bNb;
import o.InterfaceC3854bNc;
import o.InterfaceC3993bSg;
import o.InterfaceC5091bsH;
import o.InterfaceC5155btS;
import o.InterfaceC5283bvo;
import o.InterfaceC5847cKo;
import o.InterfaceC6068cSu;
import o.InterfaceC6083cTf;
import o.InterfaceC6905cmC;
import o.InterfaceC7088cpc;
import o.InterfaceC7090cpe;
import o.InterfaceC7303ctf;
import o.InterfaceC7343cuS;
import o.InterfaceC8351dij;
import o.MH;
import o.MP;
import o.XD;
import o.aIA;
import o.aIB;
import o.bDG;
import o.bMR;
import o.bRC;
import o.bRJ;
import o.bRL;
import o.bRX;
import o.bRZ;
import o.bXD;
import o.cNT;
import o.dpR;
import o.drO;
import org.chromium.net.NetError;

@aIA
@AndroidEntryPoint
/* loaded from: classes.dex */
public class HomeActivity extends bRL implements bDG, InterfaceC7343cuS.d, InterstitialCoordinator.b {
    private static long a;
    @Inject
    public InterfaceC3853bNb createBeaconWatcher;
    private C9954zi d;
    @Inject
    public InterfaceC3854bNc dismissedBeaconWatcher;
    private String f;
    private C6455cdd g;
    private String h;
    @Inject
    public InterfaceC3993bSg home;
    private GenreItem i;
    @Inject
    public bXD interstitials;
    @Inject
    public UiLatencyMarker latencyMarker;
    private boolean m;
    @Inject
    public InterfaceC6905cmC mylist;
    private boolean n;
    @Inject
    public InterfaceC7090cpe notificationPermission;
    @Inject
    public Lazy<InterfaceC7088cpc> notificationPermissionApplication;

    /* renamed from: o  reason: collision with root package name */
    private LoMo f13271o;
    private InterfaceC5847cKo p;
    @Inject
    public cNT profileSelectionLauncher;
    private bRC s;
    @Inject
    public InterfaceC6068cSu search;
    @Inject
    public Lazy<InterfaceC6083cTf> searchRepositoryFactory;
    @Inject
    public Lazy<InterfaceC8351dij> uxConfig;
    private boolean y;
    private final LinkedList<Intent> c = new LinkedList<>();
    private NotificationsListStatus q = NotificationsListStatus.a;
    private AppView t = AppView.UNKNOWN;
    private boolean b = false;
    private long l = -1;
    private final boolean j = C8153dex.Z();
    public final C3991bSe e = new C3991bSe(this, new drO() { // from class: o.bRM
        @Override // o.drO
        public final Object invoke() {
            dpR x;
            x = HomeActivity.this.x();
            return x;
        }
    }, new drO() { // from class: o.bRN
        @Override // o.drO
        public final Object invoke() {
            dpR y;
            y = HomeActivity.this.y();
            return y;
        }
    });
    private final InterfaceC5091bsH k = new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.home.HomeActivity.3
        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C1044Mm.b("HomeActivity", "ServiceManager ready");
            HomeActivity.this.u();
            bRZ k = HomeActivity.this.k();
            if (k != null) {
                if (C8153dex.Z()) {
                    k.setLoadingStatusCallback(new d(k));
                    return;
                }
                k.onManagerReady(serviceManager, status);
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.setLoadingStatusCallback(new d(k));
                return;
            }
            HomeActivity.this.e.b();
            HomeActivity.this.finish();
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            HomeActivity.this.e.e(status);
            C1044Mm.j("HomeActivity", "ServiceManager unavailable");
            if (HomeActivity.this.k() != null) {
                HomeActivity.this.p().onManagerUnavailable(serviceManager, status);
            }
            C1044Mm.e("HomeActivity", "LOLOMO failed, report UI startup session ended in case this was on UI startup");
        }
    };
    private final BroadcastReceiver r = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.home.HomeActivity.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C1044Mm.j("HomeActivity", "Received null intent");
                return;
            }
            String action = intent.getAction();
            C1044Mm.c("HomeActivity", "RefreshHomeReceiver invoked and received Intent with Action %s", action);
            if ("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO".equals(action)) {
                HomeActivity.this.c(1, 0, intent.getStringExtra("renoMessageId"));
            }
        }
    };

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return R.g.aG;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasProfileAvatarInActionBar() {
        return true;
    }

    public C6455cdd o() {
        return this.g;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR x() {
        e(10L, true);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR y() {
        q();
        return dpR.c;
    }

    public static Intent b(Context context, AppView appView, boolean z) {
        if (appView == null) {
            appView = AppView.UNKNOWN;
        }
        return new Intent(context, m()).addFlags(131072).putExtra(NetflixActivity.EXTRA_SOURCE, appView.name()).putExtra("is_cold_start", z);
    }

    public static Intent d(Context context, AppView appView, boolean z) {
        return b(context, appView, z).putExtra("genre_id", "lolomo");
    }

    public static Intent b(Context context, AppView appView, boolean z, String str, String str2) {
        return b(context, appView, z).putExtra("cdxDeviceId", str).putExtra("profileId", str2);
    }

    public static void e(NetflixActivity netflixActivity, GenreItem genreItem) {
        d(netflixActivity, genreItem, false);
    }

    public static void d(NetflixActivity netflixActivity, GenreItem genreItem, boolean z) {
        d(netflixActivity, genreItem, z, false);
    }

    public static void d(NetflixActivity netflixActivity, GenreItem genreItem, boolean z, boolean z2) {
        netflixActivity.startActivity(d((Context) netflixActivity, genreItem, z, z2));
    }

    public static Intent d(Context context, GenreItem genreItem, boolean z, boolean z2) {
        Intent putExtra = new Intent(context, m()).putExtra("genre_id", genreItem.getId()).putExtra("genre_parcel", genreItem).putExtra("genre_from_lomo", z);
        if (z2) {
            putExtra.putExtra("started_from_deeplink", true);
        }
        return putExtra;
    }

    public static boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        intent.setExtrasClassLoader(HomeActivity.class.getClassLoader());
        ComponentName component = intent.getComponent();
        return (component == null || component.getClassName() == null || !component.getClassName().equals(m().getCanonicalName())) ? false : true;
    }

    public static boolean a(Intent intent) {
        return c(intent) && intent.hasExtra("genre_id") && !TextUtils.equals(intent.getStringExtra("genre_id"), "lolomo");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        if (shouldShowKidsTheme()) {
            setTheme(R.l.s);
        } else {
            setTheme(R.l.n);
        }
    }

    public void t() {
        this.fragmentHelper.f();
    }

    public void e(GenreItem genreItem, String str) {
        C1044Mm.a("HomeActivity", "showFilteredGenre filter=%s, genre=%s", str, genreItem.getId());
        if (C6452cda.e(str)) {
            t();
        } else if ("queue".equals(genreItem.getId())) {
            startActivity(this.mylist.e(false));
        } else {
            Intent putExtra = new Intent(this, m()).addFlags(67108864).putExtra("genre_id", genreItem.getId()).putExtra("genre_filter", str);
            if (!C6452cda.e(genreItem.getId())) {
                putExtra.putExtra("genre_parcel", genreItem);
            }
            this.fragmentHelper.b(putExtra);
        }
    }

    public static Class<?> m() {
        return NetflixApplication.getInstance().M() ? ActivityC3995bSi.class : HomeActivity.class;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        this.n = bundle == null;
        this.m = getIntent().getBooleanExtra("is_cold_start", false);
        String stringExtra = getIntent().getStringExtra(NetflixActivity.EXTRA_SOURCE);
        if (stringExtra != null) {
            this.t = AppView.valueOf(stringExtra);
        }
        if (bundle != null) {
            this.c.addAll((Collection) bundle.getSerializable("extra_back_stack_intents"));
            this.q = (NotificationsListStatus) bundle.getParcelable("extra_notification_list_status");
        }
        if (!C8153dex.Z()) {
            if (bundle == null && !C6413cco.c(getIntent())) {
                final Intent intent = getIntent();
                e(new Intent(this, m()));
                C8187dfe.c(new Runnable() { // from class: o.bRT
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeActivity.this.f(intent);
                    }
                });
            } else {
                e(getIntent());
            }
        }
        C6452cda.a.e(this);
        super.onCreate(bundle);
        if (ConfigFastPropertyFeatureControlConfig.Companion.i()) {
            this.notificationPermission.b();
        }
        if (!C8153dex.c()) {
            C9954zi c9954zi = new C9954zi((ViewStub) findViewById(R.g.bP));
            this.d = c9954zi;
            c(c9954zi);
        }
        C();
        this.g = C6414ccp.a(requireNetflixActionBar(), this);
        aIB.b(this, new aIB.e() { // from class: o.bRS
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                HomeActivity.this.c(serviceManager);
            }
        });
        this.latencyMarker.e(UiLatencyMarker.Mark.HOME_ACTIVITY_CREATE, currentTimeMillis);
        D();
        ((ObservableSubscribeProxy) C4987bqJ.f().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY)))).e(new Consumer() { // from class: o.bRR
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeActivity.this.b((dpR) obj);
            }
        });
        if (C8153dex.Z()) {
            setFragmentHelper(new FragmentHelper(true, this, MH.c(), new bMR() { // from class: com.netflix.mediaclient.ui.home.HomeActivity.1
                @Override // o.bMR
                public boolean e(Intent intent2) {
                    return C6413cco.c(intent2);
                }

                @Override // o.bMR
                public Intent a() {
                    HomeActivity homeActivity = HomeActivity.this;
                    return HomeActivity.d((Context) homeActivity, homeActivity.t, false);
                }
            }, bundle));
            if (bundle == null) {
                PerformanceProfilerImpl.INSTANCE.d(Sessions.LOLOMO_LOAD);
                this.fragmentHelper.b(getIntent());
            }
        } else {
            setFragmentHelper(new FragmentHelper(false, this, MH.c(), null, bundle));
        }
        bRC brc = new bRC(this, new bRC.b() { // from class: o.bRU
        }, this.searchRepositoryFactory);
        this.s = brc;
        brc.c();
        if (bundle != null && bundle.getBoolean("home_simplification_enabled", this.j) != this.j) {
            finish();
            startActivity(ActivityC4183bZh.d(this, AppView.home));
        }
        this.createBeaconWatcher.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ServiceManager serviceManager) {
        C6455cdd c6455cdd = this.g;
        if (c6455cdd != null) {
            c6455cdd.b(serviceManager);
        }
        if (this.n) {
            g(getIntent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(dpR dpr) {
        Lazy<InterfaceC7088cpc> lazy = this.notificationPermissionApplication;
        Objects.requireNonNull(lazy);
        C4141bXt.a(this, new bRJ(lazy), this).a();
        getTutorialHelper().b(false);
    }

    @Override // o.MO
    public void W_() {
        if (C8153dex.Z()) {
            return;
        }
        super.W_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void f(final Intent intent) {
        String stringExtra = intent.getStringExtra("genre_id");
        GenreItem genreItem = (GenreItem) intent.getParcelableExtra("genre_parcel");
        if (stringExtra == null && genreItem != null) {
            stringExtra = genreItem.getId();
        }
        if (genreItem != null && stringExtra != null && (C6452cda.c(stringExtra) || C6452cda.f(stringExtra))) {
            e(genreItem, stringExtra);
            return;
        }
        aIB.b(this, new aIB.e() { // from class: o.bRQ
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                HomeActivity.this.a(intent, serviceManager);
            }
        });
        this.fragmentHelper.b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, ServiceManager serviceManager) {
        if (C8076ddZ.c(this, intent)) {
            C8076ddZ.d(this, intent);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        C1044Mm.b("HomeActivity", "onNewIntent: %s", intent);
        if (NetflixBottomNavBar.e(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            addPostResumeRunnable(new Runnable() { // from class: o.bRI
                @Override // java.lang.Runnable
                public final void run() {
                    HomeActivity.this.h(intent);
                }
            });
        } else {
            h(intent);
        }
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void h(Intent intent) {
        g(intent);
        if (C6413cco.c(intent)) {
            this.fragmentHelper.f();
        } else {
            f(intent);
        }
    }

    private void g(Intent intent) {
        InterfaceC5283bvo a2 = C8126deW.a((NetflixActivity) this);
        if (!intent.getBooleanExtra("is_clcs_hook", false) || a2 == null) {
            return;
        }
        Uri data = intent.getData();
        this.interstitials.a(data.getLastPathSegment(), C8179dfW.e(data), this, a2, getSupportFragmentManager());
    }

    private boolean e(Intent intent) {
        if (C8168dfL.g(this.f) && this.f13271o == null && this.c.size() == 0 && !intent.hasExtra("genre_id") && !intent.hasExtra("lomo_parcel")) {
            intent.putExtra("genre_id", "lolomo");
        }
        String stringExtra = intent.getStringExtra("genre_id");
        LoMo loMo = (LoMo) intent.getParcelableExtra("lomo_parcel");
        if (C8168dfL.g(stringExtra) && loMo == null) {
            C1044Mm.e("HomeActivity", "No new ID to show");
            return false;
        }
        boolean z = true;
        if ((stringExtra != null && stringExtra.equals(this.f)) || (loMo != null && loMo.equals(this.f13271o))) {
            Object[] objArr = new Object[1];
            objArr[0] = stringExtra != null ? stringExtra : loMo.getId();
            C1044Mm.c("HomeActivity", "Asked to show list that we're already showing - skipping: %s", objArr);
            z = false;
        } else if ("lolomo".equals(this.f)) {
            this.c.add(getIntent());
        }
        if ("lolomo".equals(stringExtra)) {
            this.c.clear();
        }
        this.f = stringExtra;
        this.i = (GenreItem) intent.getParcelableExtra("genre_parcel");
        this.h = intent.getStringExtra("genre_filter");
        this.f13271o = (LoMo) intent.getParcelableExtra("lomo_parcel");
        this.y = intent.getBooleanExtra("genre_from_lomo", false);
        setIntent(intent);
        return z;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (C8153dex.Z() && this.n) {
            this.fragmentHelper.n();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!C8153dex.Z() && this.b) {
            w();
            this.b = false;
        }
        if (!this.e.e()) {
            aIB.b(this, new aIB.e() { // from class: o.bRP
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    HomeActivity.this.b(serviceManager);
                }
            });
        }
        if (C8153dex.V()) {
            bRX.c(this);
        }
    }

    /* renamed from: e */
    public void b(ServiceManager serviceManager) {
        if (C8141del.a() || isDpLiteDialogFragmentVisible()) {
            return;
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            getServiceManager().e(true);
        }
        Lazy<InterfaceC7088cpc> lazy = this.notificationPermissionApplication;
        Objects.requireNonNull(lazy);
        C4141bXt.a(this, new bRJ(lazy), this).d();
    }

    private void c(C9954zi c9954zi) {
        if (c9954zi == null || C8153dex.c()) {
            return;
        }
        XD.d.a(this, c9954zi, getActivityDestroy().singleOrError(), C8153dex.C());
    }

    private void z() {
        C9954zi c9954zi;
        NetflixFrag h;
        if (C8153dex.c() || (c9954zi = this.d) == null) {
            return;
        }
        if (this.fragmentHelper.h()) {
            h = this.fragmentHelper.c();
        } else {
            h = h();
        }
        c9954zi.a(h instanceof bRZ);
    }

    private void w() {
        c(0, 0, null);
    }

    public void c(int i, int i2, String str) {
        if (C8153dex.Z() || isFinishing()) {
            return;
        }
        boolean v = v();
        if (!v && i == 0) {
            C1044Mm.e("HomeActivity", "Lolomo not expired, no ui refresh");
            return;
        }
        bRZ p = p();
        if (v) {
            i = 1;
        }
        p.a(i, i2, str);
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            return;
        }
        getServiceManager().N();
    }

    private boolean v() {
        InterfaceC5155btS ag_ = p().ag_();
        if (ag_ == null) {
            C1044Mm.e("HomeActivity", "frag-lolomosummary is null, lolomo request is perhaps in-flight");
            return false;
        } else if (ag_.getExpiryTimeStamp() <= 0) {
            C1044Mm.a("HomeActivity", "frag-lolomosummary has no expiry value %d", Long.valueOf(ag_.getExpiryTimeStamp()));
            return false;
        } else {
            this.l = ag_.getExpiryTimeStamp();
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.l;
            long j2 = (currentTimeMillis - j) / 1000;
            boolean z = j2 > 0;
            C1044Mm.a("HomeActivity", "lolomo expiry time stamp = %s, FORCE_EXP_DELTA PLT = %s, Lolomo's time to expiry = %s", Long.valueOf(j), Long.valueOf(a), Long.valueOf(j2));
            return z;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.b = true;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    @SuppressLint({"RtlHardcoded"})
    public boolean handleBackPressed() {
        if (k() == null || !p().o()) {
            if (this.c.size() > 0) {
                onNewIntent(this.c.removeLast());
                return true;
            }
            C1044Mm.b("HomeActivity", "No more items in back stack");
            return false;
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        C6491ceM.c(this, menu);
        a(menu);
        z();
        this.dismissedBeaconWatcher.d(this, e(menu));
    }

    private MenuItem e(Menu menu) {
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), HawkinsIcon.dN.d.i(), getBaseContext().getTheme());
        if (drawable != null) {
            drawable = BrowseExperience.e(drawable, this, R.a.c);
        }
        MenuItem add = menu.add(0, R.g.d, 1, R.o.bW);
        add.setIcon(drawable).setShowAsActionFlags(1).setVisible(false).setEnabled(false);
        return add;
    }

    private void a(Menu menu) {
        if (C8153dex.Q()) {
            return;
        }
        this.search.a(menu).setVisible(!C6193cXh.a(this, !getServiceManager().c() ? null : getServiceManager().x()));
    }

    @Override // o.MO
    /* renamed from: s */
    public NetflixFrag h() {
        return (NetflixFrag) super.h();
    }

    public bRZ k() {
        if (C8153dex.Z()) {
            NetflixFrag c = this.fragmentHelper.c();
            if (c instanceof bRZ) {
                return (bRZ) c;
            }
            return null;
        }
        return (bRZ) super.h();
    }

    public bRZ p() {
        bRZ k = k();
        Objects.requireNonNull(k);
        return k;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (this.fragmentHelper.g() || k() == null) {
            return;
        }
        k().a(false);
    }

    @Override // o.MO
    public Fragment d() {
        if (C8153dex.Z()) {
            return null;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("force_new_lolomo", false);
        PerformanceProfilerImpl.INSTANCE.d(Sessions.LOLOMO_LOAD);
        if ("lolomo".equals(this.f)) {
            return d(this.f, this.h, this.i, this.t, this.m, booleanExtra);
        }
        LoMo loMo = this.f13271o;
        if (loMo != null && C6409cck.a(loMo.getId())) {
            if (this.y) {
                return C6409cck.a(this.f13271o, "Lolomo");
            }
            return C6409cck.a(this.f13271o, "");
        }
        GenreItem genreItem = this.i;
        if (genreItem == null || genreItem.getGenreType() != GenreItem.GenreType.GALLERY) {
            return d(this.f, this.h, this.i, this.t, this.m, booleanExtra);
        }
        if (this.y) {
            return C6404ccf.d(this.f, this.h, this.i, "Lolomo");
        }
        return C6404ccf.d(this.f, this.h, this.i, "");
    }

    private Fragment d(String str, String str2, GenreItem genreItem, AppView appView, boolean z, boolean z2) {
        return this.home.a(new Params.Lolomo(str, str2, genreItem, appView, z, z2));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_back_stack_intents", this.c);
        bundle.putParcelable("extra_notification_list_status", this.q);
        bundle.putBoolean("home_simplification_enabled", this.j);
    }

    @Override // o.MO
    public int j() {
        return MH.a();
    }

    private void C() {
        this.p = this.profileApi.g().a((ViewGroup) findViewById(R.g.aZ), true);
        e(7000L, false);
    }

    private void e(long j, final boolean z) {
        final InterfaceC5847cKo interfaceC5847cKo = this.p;
        if (interfaceC5847cKo != null) {
            this.handler.postDelayed(new Runnable() { // from class: o.bRV
                @Override // java.lang.Runnable
                public final void run() {
                    HomeActivity.this.b(interfaceC5847cKo, z);
                }
            }, j);
        } else if (C8153dex.l() && !C8153dex.G() && z) {
            profileAnimationCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC5847cKo interfaceC5847cKo, final boolean z) {
        View b;
        if (!isDestroyed() && !isFinishing()) {
            if (C8153dex.B()) {
                NetflixBottomNavBar netflixBottomNavBar = this.netflixBottomNavBar;
                b = netflixBottomNavBar != null ? netflixBottomNavBar.a().c(this.profileApi.j()) : null;
            } else {
                b = requireNetflixActionBar().b();
            }
            interfaceC5847cKo.d(b, new drO() { // from class: o.bSa
                @Override // o.drO
                public final Object invoke() {
                    dpR e;
                    e = HomeActivity.this.e(z);
                    return e;
                }
            });
        }
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(boolean z) {
        if (z) {
            profileAnimationCompleted();
        }
        return dpR.c;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        this.e.b();
        super.finish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            this.e.b();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.n) {
            InterfaceC1593aHa.b("experience=" + String.valueOf(BrowseExperience.c()));
        }
    }

    @Override // o.InterfaceC7343cuS.d
    public C9843xd a(InterfaceC5283bvo interfaceC5283bvo) {
        if (getBottomNavBar() != null) {
            return this.tutorialHelperFactory.d(getBottomNavBar().findViewById(C8153dex.B() ? this.profileApi.j() : InterfaceC7303ctf.b), this, interfaceC5283bvo);
        }
        return this.tutorialHelperFactory.d(getNetflixActionBar().f(), this, interfaceC5283bvo);
    }

    private void D() {
        if (C8153dex.Z()) {
            return;
        }
        registerReceiverLocallyWithAutoUnregister(this.r, "com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
    }

    public AppView l() {
        if (C8168dfL.g(this.f) && this.f13271o == null) {
            return AppView.browseTitles;
        }
        if ("lolomo".equals(this.f)) {
            return AppView.browseTitles;
        }
        return AppView.browseTitlesGallery;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        if (C8153dex.Z()) {
            return null;
        }
        return AppView.browseTitles;
    }

    @Override // o.bDG
    public PlayContext y_() {
        return this.fragmentHelper.h() ? this.fragmentHelper.d() : new EmptyPlayContext("HomeActivity", NetError.ERR_ENCODING_DETECTION_FAILED);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasBottomNavBar() {
        return NetflixBottomNavBar.e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 2) {
            this.offlineApi.e(this, i, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("MULTI_MONTH_OFFER_DURATION");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            d(stringExtra);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != MP.d) {
            if (i == 1002) {
                startActivity(this.profileSelectionLauncher.d(this, l()));
            }
        } else if (i2 != -1) {
            if (i2 > 1) {
                C8054ddD.c(this, R.o.hz, 1);
            }
        } else {
            String stringExtra = intent != null ? intent.getStringExtra("MULTI_MONTH_OFFER_DURATION") : "";
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            d(stringExtra);
        }
    }

    public boolean r() {
        return getIntent().getBooleanExtra("started_from_deeplink", false);
    }

    private void d(String str) {
        C6193cXh.d(this, C1333Xq.d(R.o.hB).d("duration", str).c());
    }

    private void q() {
        aIB.b(this, new aIB.e() { // from class: o.bRO
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                HomeActivity.this.b(serviceManager);
            }
        });
    }

    /* loaded from: classes4.dex */
    class d implements InterfaceC1077Nv.e {
        private final bRZ a;

        public d(bRZ brz) {
            this.a = brz;
        }

        @Override // o.InterfaceC1077Nv.e
        public void c(Status status) {
            HomeActivity.this.e.c(status);
            InterfaceC5155btS ag_ = this.a.ag_();
            if (ag_ != null) {
                HomeActivity.this.l = ag_.getExpiryTimeStamp();
                C1044Mm.a("HomeActivity", "Setting the mCurrExpiryTimeStamp = %s", Long.valueOf(HomeActivity.this.l));
            } else {
                C1044Mm.e("HomeActivity", "The lolomosummary object is null, so reset the mCurrExpiryTimeStamp in HomeActivity");
                HomeActivity.this.l = -1L;
            }
            this.a.setLoadingStatusCallback(null);
            C1044Mm.e("HomeActivity", "LOLOMO is loaded, report UI browse startup session ended in case this was on UI startup");
            if (status.i()) {
                InterfaceC1640aIu.e(HomeActivity.this, status);
            }
        }
    }

    @Override // com.netflix.clcs.ui.InterstitialCoordinator.b
    public InterstitialCoordinator c() {
        return this.interstitials.e();
    }
}
