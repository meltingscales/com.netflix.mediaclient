package com.netflix.mediaclient.ui.profiles;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RefreshUmaPreProfile;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.ActivityC4183bZh;
import o.C1026Lt;
import o.C1044Mm;
import o.C1180Rt;
import o.C1332Xp;
import o.C1567aGb;
import o.C4987bqJ;
import o.C5062brf;
import o.C5855cKw;
import o.C6706ciP;
import o.C8054ddD;
import o.C8126deW;
import o.C8150deu;
import o.C8151dev;
import o.C8153dex;
import o.C8168dfL;
import o.C8187dfe;
import o.C8254dgs;
import o.C8271dhI;
import o.C8310dhv;
import o.C9694vI;
import o.InterfaceC1078Nw;
import o.InterfaceC1270Vf;
import o.InterfaceC1573aGh;
import o.InterfaceC1577aGl;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1631aIl;
import o.InterfaceC1640aIu;
import o.InterfaceC1985aVp;
import o.InterfaceC5091bsH;
import o.InterfaceC5283bvo;
import o.InterfaceC5847cKo;
import o.InterfaceC6235cYw;
import o.InterfaceC8351dij;
import o.RG;
import o.SL;
import o.aFU;
import o.aIB;
import o.bDE;
import o.cLB;
import o.cLT;
import o.cMQ;
import o.cMX;
import o.cNO;
import o.cNV;
import o.cNW;
import o.cQQ;
import o.cWC;
import o.cWS;
import o.dpR;
import o.drO;

@InterfaceC1631aIl
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class ProfileSelectionActivity extends cLT {
    private static byte e$ss2$10129 = 0;
    private static final SparseArray<SparseIntArray> h;
    private static int u = 0;
    private static int y = 1;
    protected ServiceManager b;
    protected TextView c;
    @Inject
    public InterfaceC1270Vf clock;
    protected List<? extends InterfaceC5283bvo> d;
    protected boolean e;
    cWS f;
    private c g;
    private int j;
    private View k;
    private boolean l;
    @Inject
    public UiLatencyMarker latencyMarker;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private SL f13312o;
    private RG p;
    private String q;
    private boolean r;
    private boolean t;
    @Inject
    public InterfaceC1573aGh uiLatencyTracker;
    @Inject
    public cWC uma;
    @Inject
    public cWS.d umaControllerFactory;
    private int v;
    private InterfaceC5847cKo w;
    protected boolean a = true;
    private final BroadcastReceiver s = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ProfileSelectionActivity.this.o();
        }
    };
    private ProfileEducationTutorial x = null;
    private cLB i = null;
    private final C1180Rt.d m = new C1180Rt.d() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.7
        @Override // o.C1180Rt.d
        public void e() {
        }
    };

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC8351dij s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cNW.b a(cNW.b bVar, Boolean bool) {
        return bVar;
    }

    static void l() {
        e$ss2$10129 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View p() {
        return this.k;
    }

    private void x() {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean allowTransitionAnimation() {
        return false;
    }

    protected int b() {
        return C5855cKw.d.S;
    }

    protected int d() {
        return C5855cKw.c.k;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return C5855cKw.d.X;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean overridePendingTransitionAnimationOnFinish() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return !this.e;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return !this.e;
    }

    static {
        l();
        SparseArray<SparseIntArray> sparseArray = new SparseArray<>(2);
        h = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(4, 2);
        sparseArray.put(1, sparseIntArray);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1, 2);
        sparseIntArray2.put(2, 3);
        sparseIntArray2.put(3, 3);
        sparseIntArray2.put(4, 3);
        sparseArray.put(2, sparseIntArray2);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            this.d = k.b();
        }
        if (bundle == null) {
            boolean i = ProfileSelectionLauncherImpl.i(getIntent());
            this.e = i;
            this.l = i;
            e(getIntent());
        } else {
            this.n = bundle.getBoolean("is_loading", false);
            this.e = bundle.getBoolean("is_profile_edit_mode", false);
            this.l = ProfileSelectionLauncherImpl.i(getIntent());
        }
        super.onCreate(bundle);
        this.latencyMarker.e(UiLatencyMarker.Mark.PROFILE_SELECTION_ACTIVITY_CREATE, currentTimeMillis);
        this.t = ProfileSelectionLauncherImpl.a(getIntent());
        boolean z = bundle == null;
        cWS b2 = this.umaControllerFactory.b(UmaPresentAt.Point.PROFILES_GATE);
        this.f = b2;
        b2.c();
        this.uiLatencyTracker.a(getUiScreen(), this, this).e(this.t).a(z).c(ProfileSelectionLauncherImpl.h(getIntent())).a();
        if (bundle == null) {
            u();
        }
        this.j = getResources().getDimensionPixelSize(R.b.F);
        setContentView(d());
        this.p = new RG(findViewById(C5855cKw.d.X), this.m);
        this.k = findViewById(b());
        this.c = (TextView) findViewById(C5855cKw.d.T);
        a();
        this.q = ProfileSelectionLauncherImpl.b(getIntent());
        o();
        if (bundle == null) {
            i();
            if (this.a) {
                y();
            }
        } else {
            boolean z2 = bundle.getBoolean("is_loading", false);
            this.n = z2;
            C1044Mm.d("ProfileSelectionActivity", "Recovered state, isLoading: %b", Boolean.valueOf(z2));
            i();
        }
        x();
        c(getIntent());
        PublishSubject<dpR> a = C4987bqJ.a();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        ((ObservableSubscribeProxy) a.as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.cNG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.this.d((dpR) obj);
            }
        });
        ((ObservableSubscribeProxy) C4987bqJ.i().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.cNF
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.this.c((dpR) obj);
            }
        });
        ProfileEducationTutorial.Companion companion = ProfileEducationTutorial.d;
        if (companion.a(this)) {
            ProfileEducationTutorial profileEducationTutorial = new ProfileEducationTutorial((ViewStub) findViewById(C5855cKw.d.C), this.clock);
            this.x = profileEducationTutorial;
            profileEducationTutorial.a = new ProfileEducationTutorial.b() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.2
                @Override // com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.b
                public void b(boolean z3) {
                    if (z3) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.2f, 1.0f, 0.2f, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(750L);
                        scaleAnimation.setInterpolator(PathInterpolatorCompat.create(0.9f, 0.0f, 0.1f, 1.0f));
                        ProfileSelectionActivity.this.k.startAnimation(scaleAnimation);
                    }
                }

                @Override // com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.b
                public void e() {
                    ProfileSelectionActivity.this.invalidateOptionsMenu();
                    if (ProfileSelectionActivity.this.i != null) {
                        ProfileSelectionActivity.this.j();
                    }
                }
            };
            Boolean valueOf = Boolean.valueOf(companion.b());
            if (companion.b(this)) {
                this.x.e(valueOf.booleanValue() ? ProfileEducationTutorial.Companion.DismissMode.b : ProfileEducationTutorial.Companion.DismissMode.d);
                getTutorialHelper().b(this);
            }
            if (valueOf.booleanValue()) {
                View findViewById = findViewById(C5855cKw.d.I);
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: o.cND
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProfileSelectionActivity.this.c(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(dpR dpr) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(dpR dpr) {
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        FirstTimeProfileEducationFlexEventType.a(FirstTimeProfileEducationFlexEventType.a);
        this.x.f();
        invalidateOptionsMenu();
    }

    protected void a() {
        SL sl = (SL) findViewById(C5855cKw.d.V);
        this.f13312o = sl;
        if (sl != null) {
            sl.setVisibility(0);
            this.f13312o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ProfileSelectionActivity.this.s();
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e(intent);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        e(IClientLogging.CompletionReason.canceled);
        super.onDestroy();
        ProfileEducationTutorial profileEducationTutorial = this.x;
        if (profileEducationTutorial != null) {
            profileEducationTutorial.d();
        }
        cWS cws = this.f;
        if (cws != null) {
            cws.e();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.4
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                ProfileSelectionActivity profileSelectionActivity = ProfileSelectionActivity.this;
                profileSelectionActivity.b = serviceManager;
                profileSelectionActivity.a(true);
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                ProfileSelectionActivity.this.b = null;
            }
        };
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1044Mm.d("ProfileSelectionActivity", "Saving loading state: %b", Boolean.valueOf(this.n));
        bundle.putBoolean("is_loading", this.n);
        bundle.putBoolean("is_profile_edit_mode", this.e);
    }

    protected void g() {
        c cVar = new c();
        this.g = cVar;
        SL sl = this.f13312o;
        if (sl != null) {
            sl.setAdapter((ListAdapter) cVar);
        }
        v();
    }

    private void e(Intent intent) {
        final String e2 = ProfileSelectionLauncherImpl.e(intent);
        if (e2 != null) {
            C8187dfe.c(new Runnable() { // from class: o.cNI
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileSelectionActivity.this.e(e2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final String str) {
        aIB.b(this, new aIB.e() { // from class: o.cNz
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                ProfileSelectionActivity.this.c(str, serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, ServiceManager serviceManager) {
        InterfaceC1593aHa.b("Trying to auto-select profile: " + str);
        List<? extends InterfaceC5283bvo> list = this.d;
        if (list == null || list.size() == 0) {
            C1044Mm.j("ProfileSelectionActivity", "No profiles so can't auto-select");
            return;
        }
        for (InterfaceC5283bvo interfaceC5283bvo : this.d) {
            if (str.equals(interfaceC5283bvo.getProfileGuid())) {
                b(interfaceC5283bvo, (View) null);
                return;
            }
        }
        InterfaceC1598aHf.a("auto-select profile not found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        int c2 = C8150deu.c((Context) this);
        int n = C8150deu.n(this);
        int count = this.g.getCount();
        if (C8151dev.h()) {
            this.v = count;
        } else {
            int i = h.get(c2).get(n);
            if (count > 3) {
                count -= 2;
            }
            int min = Math.min(count, i);
            this.v = min;
            C1044Mm.d("ProfileSelectionActivity", "max cols: %d, limited cols: %d, num cols: %d", Integer.valueOf(i), Integer.valueOf(count), Integer.valueOf(min));
        }
        SL sl = this.f13312o;
        if (sl != null) {
            sl.setNumColumns(this.v);
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        int p = C8150deu.p(this);
        int i = this.j * this.v;
        int i2 = (p - i) / 2;
        C1044Mm.d("ProfileSelectionActivity", "screen: %d, grid: %d, padding: %d", Integer.valueOf(p), Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f13312o != null) {
            if (!C8310dhv.a()) {
                this.f13312o.setPadding(i2, 0, 0, 0);
            } else {
                this.f13312o.setPadding(0, 0, i2, 0);
            }
        }
    }

    protected void m() {
        C1044Mm.b("ProfileSelectionActivity", "Showing content view...");
        this.p.b(false);
        this.k.setEnabled(true);
        k();
        if (this.k.getVisibility() == 0) {
            if (this.k.getAlpha() < 1.0f) {
                this.k.animate().alpha(1.0f).setDuration(150L).start();
            }
        } else {
            C8254dgs.d(this.k, false);
            this.k.post(new Runnable() { // from class: o.cNC
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileSelectionActivity.this.r();
                }
            });
        }
        o();
        a(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.k.setScrollY(0);
    }

    protected void k() {
        if (this.f13312o != null) {
            if (ConfigFastPropertyFeatureControlConfig.enableProfileGateUiBugFix()) {
                this.f13312o.setVisibility(0);
            } else {
                this.f13312o.setEnabled(true);
            }
        }
    }

    protected void e() {
        if (this.f13312o != null) {
            if (ConfigFastPropertyFeatureControlConfig.enableProfileGateUiBugFix()) {
                this.f13312o.setVisibility(4);
            } else {
                this.f13312o.setEnabled(false);
            }
        }
    }

    private void b(boolean z) {
        C1044Mm.b("ProfileSelectionActivity", "Showing loading view...");
        InterfaceC5847cKo interfaceC5847cKo = this.w;
        if (interfaceC5847cKo == null || !interfaceC5847cKo.c()) {
            this.p.a(false);
        }
        this.k.setEnabled(false);
        e();
        if (z) {
            this.k.animate().alpha(0.2f).setDuration(400L).start();
        } else {
            this.k.setAlpha(0.2f);
        }
    }

    private void t() {
        C1044Mm.b("ProfileSelectionActivity", "handleProfileReadyToSelect()");
        this.n = false;
        a(false);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        boolean z;
        int i = 2 % 2;
        if (this.n) {
            return;
        }
        int i2 = y + 23;
        u = i2 % 128;
        int i3 = i2 % 2;
        if (this.e || !this.a) {
            return;
        }
        ProfileEducationTutorial profileEducationTutorial = this.x;
        if (profileEducationTutorial == null || !profileEducationTutorial.c) {
            z = false;
        } else {
            int i4 = y;
            int i5 = i4 + 57;
            u = i5 % 128;
            z = i5 % 2 == 0;
            int i6 = i4 + 91;
            u = i6 % 128;
            int i7 = i6 % 2;
        }
        if (C8126deW.a() || Boolean.valueOf(z).booleanValue()) {
            return;
        }
        int i8 = R.g.bn;
        String string = getString(R.o.kx);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            z(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        MenuItem add = menu.add(0, i8, 0, string);
        add.setShowAsAction(1);
        Drawable drawable = ContextCompat.getDrawable(this, C1026Lt.a.CW);
        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        add.setIcon(drawable);
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.3
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                ProfileSelectionActivity.this.f();
                return true;
            }
        });
    }

    protected void f() {
        this.e = !this.e;
        i();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ContextCompat.registerReceiver(this, this.s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
        o();
        if (this.g != null) {
            c();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            unregisterReceiver(this.s);
        } catch (IllegalArgumentException e2) {
            InterfaceC1597aHe.c("ProfileSelectionActivity.onStop", e2);
        }
    }

    protected void a(boolean z, boolean z2) {
        boolean z3 = true;
        NetflixActionBar.b.C0051b b2 = getActionBarStateBuilder().b((z || this.e) ? false : true);
        if ((z2 || !z) && !this.e) {
            z3 = false;
        }
        NetflixActionBar.b.C0051b k = b2.l(z3).k(this.e);
        if (!this.a) {
            k.b(NetflixActionBar.LogoType.b);
            k.e((CharSequence) getResources().getString(R.o.I));
        } else if (this.e) {
            k.e((CharSequence) getResources().getString(R.o.kB));
        } else {
            k.b(NetflixActionBar.LogoType.b);
            k.e((CharSequence) getResources().getString(R.o.R));
        }
        getNetflixActionBar().c(k.c());
        invalidateOptionsMenu();
    }

    protected void i() {
        int i = 0;
        a(false, false);
        if (this.a || this.e) {
            this.c.animate().alpha(this.e ? 0.0f : 1.0f).setDuration(400L).start();
            int i2 = 0;
            while (true) {
                SL sl = this.f13312o;
                if (sl == null || i2 >= sl.getChildCount()) {
                    break;
                }
                View childAt = this.f13312o.getChildAt(i2);
                if (childAt == null) {
                    C1044Mm.d("ProfileSelectionActivity", "Something weird happened: null grid child view!");
                } else {
                    List<? extends InterfaceC5283bvo> list = this.d;
                    if (list != null && i2 < list.size()) {
                        d(childAt, C5855cKw.d.y, this.e ? 0.2f : 1.0f);
                        childAt.findViewById(C5855cKw.d.ae).setVisibility(this.e ? 0 : 8);
                        d(childAt, C5855cKw.d.y, this.e ? 0.2f : 1.0f);
                    }
                    c(childAt, 1.0f);
                }
                i2++;
            }
        } else {
            this.c.animate().alpha(1.0f);
            InterfaceC5283bvo a = C8126deW.a((NetflixActivity) this);
            while (true) {
                SL sl2 = this.f13312o;
                if (sl2 == null || i >= sl2.getChildCount()) {
                    break;
                }
                View childAt2 = this.f13312o.getChildAt(i);
                List<? extends InterfaceC5283bvo> list2 = this.d;
                InterfaceC5283bvo interfaceC5283bvo = (list2 == null || i >= list2.size()) ? null : this.d.get(i);
                if (childAt2 == null) {
                    C1044Mm.d("ProfileSelectionActivity", "Something weird happened: null grid child view!");
                } else {
                    c(childAt2, (a == null || interfaceC5283bvo == null || !a.equals(interfaceC5283bvo)) ? 0.3f : 1.0f);
                    d(childAt2, C5855cKw.d.y, 1.0f);
                    childAt2.findViewById(C5855cKw.d.ae).setVisibility(8);
                }
                i++;
            }
        }
        invalidateOptionsMenu();
    }

    private void d(View view, int i, float f) {
        view.findViewById(i).animate().alpha(f).setDuration(400L).start();
    }

    private void c(View view, float f) {
        view.animate().alpha(f).setDuration(400L).start();
    }

    protected void o() {
        this.a = ConnectivityUtils.n(this);
        i();
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    protected void b(InterfaceC5283bvo interfaceC5283bvo, View view) {
        final InterfaceC5283bvo b2 = C8126deW.b();
        if (b2 == null) {
            return;
        }
        if (!b2.isKidsProfile()) {
            getSupportActionBar().hide();
        }
        this.n = true;
        Observable<Boolean> a = a(interfaceC5283bvo, view);
        b(true);
        final C6706ciP c6706ciP = new C6706ciP("ProfileGateProfileSwitchDuration");
        c6706ciP.c();
        cNV.e.e(this, interfaceC5283bvo, getUiScreen()).zipWith(a, new BiFunction() { // from class: o.cNM
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                cNW.b a2;
                a2 = ProfileSelectionActivity.a((cNW.b) obj, (Boolean) obj2);
                return a2;
            }
        }).takeUntil(C9694vI.a(this)).subscribe(new Consumer() { // from class: o.cNK
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.this.b(c6706ciP, b2, this, (cNW.b) obj);
            }
        }, new Consumer() { // from class: o.cNL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.this.d(c6706ciP, b2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(C6706ciP c6706ciP, InterfaceC5283bvo interfaceC5283bvo, NetflixActivity netflixActivity, cNW.b bVar) {
        c6706ciP.e(bVar);
        int a = bVar.a();
        if (a == 0) {
            C1044Mm.e("ProfileSelectionActivity", "profileChange successful");
            long nanoTime = System.nanoTime();
            C1044Mm.e("ProfileSelectionActivity", "Restarting app, time: " + nanoTime);
            if (C8153dex.V()) {
                cNO.d(this, new C1567aGb(interfaceC5283bvo.getProfileGuid()));
            }
            if (!w()) {
                NetflixActivity.finishAllActivities(netflixActivity);
                netflixActivity.startActivity(ActivityC4183bZh.c(netflixActivity, getUiScreen(), this.r, bVar.e()).addFlags(67108864).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false));
                finish();
            }
            overridePendingTransition(0, 0);
        } else if (a == 1) {
            C1044Mm.e("ProfileSelectionActivity", "profileChange unsuccessful");
            c(interfaceC5283bvo);
            if (bVar.c() == null || C8054ddD.l(netflixActivity)) {
                return;
            }
            InterfaceC1640aIu.e(netflixActivity, bVar.c(), false);
        } else if (a == 2) {
            C1044Mm.e("ProfileSelectionActivity", "profileChange cancelled");
            c(interfaceC5283bvo);
        } else if (a != 3) {
        } else {
            C1044Mm.e("ProfileSelectionActivity", "Selected same profile");
            if (C8153dex.V()) {
                cNO.d(this, new C1567aGb(interfaceC5283bvo.getProfileGuid()));
            }
            if (w()) {
                return;
            }
            if (LaunchActivity.d(netflixActivity, this.b)) {
                LaunchActivity.a(netflixActivity);
            } else if (C8153dex.S()) {
                startActivity(InterfaceC6235cYw.a(this).d());
            } else {
                startActivity(HomeActivity.b(netflixActivity, getUiScreen(), this.t));
            }
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C6706ciP c6706ciP, InterfaceC5283bvo interfaceC5283bvo, Throwable th) {
        C1044Mm.a("ProfileSelectionActivity", "profileChange unsuccessful", th);
        c6706ciP.e(null);
        c(interfaceC5283bvo);
    }

    private View b(View view) {
        if (view == null) {
            return null;
        }
        return view.findViewById(C5855cKw.d.y);
    }

    private Observable<Boolean> a(final InterfaceC5283bvo interfaceC5283bvo, final View view) {
        return Observable.create(new ObservableOnSubscribe() { // from class: o.cNE
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                ProfileSelectionActivity.this.b(interfaceC5283bvo, view, observableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC5283bvo interfaceC5283bvo, View view, final ObservableEmitter observableEmitter) {
        if (interfaceC5283bvo.isKidsProfile() || C8153dex.G()) {
            InterfaceC5847cKo d = this.profileApi.g().d((ViewGroup) findViewById(R.g.fU), b(view), interfaceC5283bvo.isKidsProfile(), interfaceC5283bvo.getAvatarUrl(), new drO() { // from class: o.cNv
                @Override // o.drO
                public final Object invoke() {
                    dpR e2;
                    e2 = ProfileSelectionActivity.e(ObservableEmitter.this);
                    return e2;
                }
            });
            this.w = d;
            if (d != null) {
                return;
            }
        }
        if (observableEmitter.isDisposed()) {
            return;
        }
        observableEmitter.onNext(Boolean.TRUE);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dpR e(ObservableEmitter observableEmitter) {
        if (!observableEmitter.isDisposed()) {
            observableEmitter.onNext(Boolean.TRUE);
            observableEmitter.onComplete();
        }
        return dpR.c;
    }

    private boolean w() {
        final Intent f = NetflixApplication.getInstance().f();
        if (f != null) {
            InterfaceC5847cKo interfaceC5847cKo = this.w;
            if (interfaceC5847cKo != null) {
                interfaceC5847cKo.d(null, new drO() { // from class: o.cNx
                    @Override // o.drO
                    public final Object invoke() {
                        dpR d;
                        d = ProfileSelectionActivity.this.d(f);
                        return d;
                    }
                });
                this.w = null;
                return true;
            }
            NetflixActivity.finishAllActivities(this);
            ProfileSelectionLauncherImpl.g(f);
            NetflixApplication.getInstance().l();
            startActivity(f);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR d(Intent intent) {
        NetflixActivity.finishAllActivities(this);
        ProfileSelectionLauncherImpl.g(intent);
        NetflixApplication.getInstance().l();
        startActivity(intent);
        overridePendingTransition(0, 0);
        return dpR.c;
    }

    private void c(InterfaceC5283bvo interfaceC5283bvo) {
        ActionBar supportActionBar;
        this.n = false;
        InterfaceC5847cKo interfaceC5847cKo = this.w;
        if (interfaceC5847cKo != null) {
            interfaceC5847cKo.a();
            this.w = null;
        }
        m();
        if (interfaceC5283bvo.isKidsProfile() || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.show();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        if (handleBackPressed()) {
            return;
        }
        finish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        InterfaceC5283bvo b2;
        boolean z = this.e;
        if (z && !this.l) {
            this.e = false;
            o();
            i();
            return true;
        } else if (!z && ((b2 = C8126deW.b()) == null || b2.isProfileLocked())) {
            moveTaskToBack(true);
            return true;
        } else {
            return q();
        }
    }

    private boolean q() {
        ServiceManager serviceManager = this.b;
        return serviceManager != null && serviceManager.c() && this.b.F();
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        List<? extends InterfaceC5283bvo> list;
        return this.n || (list = this.d) == null || list.size() <= 0;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        if (this.e) {
            return AppView.editProfiles;
        }
        return AppView.profilesGate;
    }

    protected void h() {
        this.latencyMarker.b(UiLatencyMarker.Mark.PROFILE_SELECTION_CLICKED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        View b2 = b(view);
        e eVar = (e) view.getTag();
        if (b2 == null || eVar == null) {
            return;
        }
        int i = eVar.b;
        h();
        List<? extends InterfaceC5283bvo> list = this.d;
        if (list == null || i > list.size()) {
            C1044Mm.e("ProfileSelectionActivity", "Invalid profiles set");
            return;
        }
        InterfaceC5283bvo interfaceC5283bvo = this.d.get(i);
        if (interfaceC5283bvo != null) {
            e(view, interfaceC5283bvo);
        }
    }

    protected void e(View view, InterfaceC5283bvo interfaceC5283bvo) {
        if (!this.a) {
            if (interfaceC5283bvo.equals(C8126deW.a((NetflixActivity) this))) {
                e(interfaceC5283bvo, view);
            } else {
                C8054ddD.c(this, R.o.kS, 1);
            }
        } else if (this.e) {
            if (!interfaceC5283bvo.isProfileGuidValid()) {
                InterfaceC1640aIu.a(this, InterfaceC1078Nw.ad);
            } else {
                startActivity(cMX.b(this, interfaceC5283bvo.getProfileGuid()));
            }
        } else {
            e(interfaceC5283bvo, view);
        }
    }

    protected void d(ProfileCreator.AgeSetting ageSetting) {
        if (this.a) {
            new cMQ().d(this, ageSetting);
        } else {
            C8054ddD.c(this, R.o.kw, 1);
        }
    }

    private void e(InterfaceC5283bvo interfaceC5283bvo, View view) {
        b(interfaceC5283bvo, view);
        invalidateOptionsMenu();
    }

    protected void c() {
        if (this.b == null || this.g == null) {
            C1044Mm.e("ProfileSelectionActivity", "handleProfilesListUpdated: manager is null. Ignore update until manager is ready");
            return;
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            this.d = k.b();
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.g.notifyDataSetChanged();
        SL sl = this.f13312o;
        if (sl != null) {
            sl.setAdapter((ListAdapter) this.g);
        }
    }

    protected void a(boolean z) {
        boolean z2;
        cWS cws;
        this.latencyMarker.b(UiLatencyMarker.Mark.PROFILE_SELECTION_TTI_END);
        HashMap hashMap = new HashMap();
        hashMap.put("view", AppView.profilesGate.name());
        List<? extends InterfaceC5283bvo> list = this.d;
        if (list == null) {
            C1044Mm.j("ProfileSelectionActivity", "No profiles found for user!");
            this.uiLatencyTracker.e(false).c((Boolean) null).a();
            IClientLogging.CompletionReason completionReason = IClientLogging.CompletionReason.failed;
            e(completionReason);
            hashMap.put("reason", completionReason.name());
            ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.TTI, hashMap);
            InterfaceC1598aHf.a("No profiles found for user!");
            C8271dhI.b();
            return;
        }
        Iterator<? extends InterfaceC5283bvo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            } else if (!C8168dfL.g(it.next().getAvatarUrl())) {
                z2 = false;
                break;
            }
        }
        InterfaceC1577aGl c2 = this.uiLatencyTracker.e(true).b(StatusCode.OK.name()).c((Boolean) null);
        if (z2) {
            c2.e();
        } else {
            c2.e(NetflixActivity.getImageLoader(this), new drO() { // from class: o.cNA
                @Override // o.drO
                public final Object invoke() {
                    View p;
                    p = ProfileSelectionActivity.this.p();
                    return p;
                }
            }, getLifecycle());
        }
        if (Config_FastProperty_RefreshUmaPreProfile.Companion.b() && this.b.x() != null && (cws = this.f) != null) {
            cws.b(this);
        }
        hashMap.put("reason", IClientLogging.CompletionReason.success.name());
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.TTI, hashMap);
        C8271dhI.b();
        g();
        m();
        if (this.n) {
            C1044Mm.e("ProfileSelectionActivity", "We're in loading state - showing loading view");
            b(false);
        }
    }

    private void c(Intent intent) {
        if (intent != null) {
            boolean c2 = ProfileSelectionLauncherImpl.c(getIntent());
            this.r = c2;
            C1044Mm.c("ProfileSelectionActivity", "Got new value for 'app was restorted' flag: %b", Boolean.valueOf(c2));
        }
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    private void y() {
        if (this.d == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList(5);
        arrayList.addAll(this.d);
        new cQQ().o().observeOn(AndroidSchedulers.mainThread()).takeUntil(C9694vI.a(this)).subscribe(new Consumer() { // from class: o.cNy
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.this.d(arrayList, (cQQ.e) obj);
            }
        }, new Consumer() { // from class: o.cNB
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileSelectionActivity.c((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list, cQQ.e eVar) {
        if (eVar.c() == null || eVar.c().getUserProfiles() == null || !b(list, eVar.c().getUserProfiles())) {
            return;
        }
        C1044Mm.j("ProfileSelectionActivity", "refreshProfiles: profiles changed, updating UI");
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) {
        InterfaceC1598aHf.a("refreshProfiles error " + th);
    }

    private boolean b(List<InterfaceC5283bvo> list, List<InterfaceC5283bvo> list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            InterfaceC5283bvo interfaceC5283bvo = list.get(i);
            InterfaceC5283bvo interfaceC5283bvo2 = list2.get(i);
            if (!C8168dfL.d(interfaceC5283bvo.getProfileGuid(), interfaceC5283bvo2.getProfileGuid()) || !C8168dfL.d(interfaceC5283bvo.getAvatarKey(), interfaceC5283bvo2.getAvatarKey()) || !C8168dfL.d(interfaceC5283bvo.getProfileName(), interfaceC5283bvo2.getProfileName()) || !C8168dfL.d(interfaceC5283bvo.getProfileLockPin(), interfaceC5283bvo2.getProfileLockPin()) || interfaceC5283bvo.getMaturityValue() != interfaceC5283bvo2.getMaturityValue()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        aIB.b(this, new aIB.e() { // from class: o.cNJ
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                ProfileSelectionActivity.this.e(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ServiceManager serviceManager) {
        setupInteractiveTracking(new bDE.c(), new InteractiveTrackerInterface.c() { // from class: o.cNH
            @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
            public final void c(InteractiveTrackerInterface.Reason reason, String str, List list) {
                ProfileSelectionActivity.this.e(reason, str, list);
            }
        }).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(InteractiveTrackerInterface.Reason reason, String str, List list) {
        e(IClientLogging.CompletionReason.fromImageLoaderReason(reason));
    }

    public void e(IClientLogging.CompletionReason completionReason) {
        C1044Mm.e("ProfileSelectionActivity", "Profiles Gate Debug TTR event is complete");
        endRenderNavigationLevelSession(completionReason, null);
        if (this.t) {
            NetflixApplication.getInstance().c("onProfilesGateDisplayed");
        }
        this.latencyMarker.b(UiLatencyMarker.Mark.PROFILE_SELECTION_TTR_END);
    }

    public void j() {
        final ScrollView scrollView = (ScrollView) this.f13312o.getParent().getParent();
        scrollView.post(new Runnable() { // from class: o.cNw
            @Override // java.lang.Runnable
            public final void run() {
                ProfileSelectionActivity.this.e(scrollView);
            }
        });
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.i, cLB.a(), 0.0f, 1.0f);
        ofFloat.setDuration(OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.6
            int b = 0;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                int i = this.b;
                if (i < 1) {
                    this.b = i + 1;
                    ofFloat.setStartDelay(2500L);
                    ofFloat.start();
                }
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ScrollView scrollView) {
        scrollView.smoothScrollTo(0, this.f13312o.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class e {
        private final ViewGroup a;
        private int b;
        private final NetflixImageView c;
        private final View d;
        private InterfaceC5283bvo e;
        private final TextView f;
        private final View h;

        public e(ViewGroup viewGroup, NetflixImageView netflixImageView, TextView textView, View view, View view2) {
            this.a = viewGroup;
            this.c = netflixImageView;
            this.f = textView;
            this.h = view;
            this.d = view2;
        }
    }

    /* loaded from: classes4.dex */
    public class c extends BaseAdapter {
        private static int b = 1;
        private static int c = 0;
        private static byte e$ss2$143 = 24;
        private final int[] d;

        private int d() {
            return C5855cKw.c.n;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        private c() {
            this.d = new int[]{C1026Lt.a.PH, C1026Lt.a.kk, C1026Lt.a.rl, C1026Lt.a.lL, C1026Lt.a.kb};
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<? extends InterfaceC5283bvo> list = ProfileSelectionActivity.this.d;
            int size = list != null ? list.size() : 0;
            return (!C5062brf.d() || size >= 5) ? size : size + 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: e */
        public InterfaceC5283bvo getItem(int i) {
            List<? extends InterfaceC5283bvo> list = ProfileSelectionActivity.this.d;
            if (list == null || i >= list.size()) {
                return null;
            }
            return ProfileSelectionActivity.this.d.get(i);
        }

        private int b(int i) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                i = 0;
            }
            return iArr[i];
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ProfileSelectionActivity.this.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            ProfileSelectionActivity.this.d((ProfileCreator.AgeSetting) null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x011a, code lost:
            if ((r6 instanceof android.text.Spanned) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0134, code lost:
            if ((r6 instanceof android.text.Spanned) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0136, code lost:
            r2 = new android.text.SpannableString(r9);
            android.text.TextUtils.copySpansFrom((android.text.SpannedString) r6, 0, r9.length(), java.lang.Object.class, r2, 0);
            r12 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0151, code lost:
            r12 = r9;
            r3 = com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.c.b + 105;
            com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.c.c = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0296, code lost:
            if (r18.e.e != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x02a8, code lost:
            if (r18.e.e != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x02ab, code lost:
            r3 = 8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02ac, code lost:
            r1.setVisibility(r3);
            r1 = r5.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x02b7, code lost:
            if (r18.e.e == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02b9, code lost:
            r3 = com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.c.b + 121;
            com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.c.c = r3 % 128;
            r3 = r3 % 2;
            r10 = 0.2f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x02c5, code lost:
            r1.setAlpha(r10);
         */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
            /*
                Method dump skipped, instructions count: 800
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$143);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    private void z(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$10129);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
