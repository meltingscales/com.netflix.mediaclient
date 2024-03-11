package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCode;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import o.AbstractActivityC6315caw;
import o.AbstractApplicationC1040Mh;
import o.ActivityC6285caS;
import o.C1044Mm;
import o.C1056Na;
import o.C1596aHd;
import o.C1823aPo;
import o.C4987bqJ;
import o.C5007bqd;
import o.C6321cbB;
import o.C8054ddD;
import o.C8126deW;
import o.C8142dem;
import o.InterfaceC1598aHf;
import o.InterfaceC5091bsH;
import o.InterfaceC5283bvo;
import o.InterfaceC6278caL;
import o.InterfaceC6282caP;
import o.aOV;
import o.bZV;
import o.cNT;
import o.cVB;
import o.dpR;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class LoginActivity extends AbstractActivityC6315caw implements InterfaceC6278caL, C6321cbB.e, InterfaceC5091bsH {
    private final BroadcastReceiver a = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.login.LoginActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginActivity.this.invalidateOptionsMenu();
        }
    };
    private EmailPasswordFragment b;
    private boolean e;
    @Inject
    public InterfaceC6282caP oauth2LoginDelegate;
    @Inject
    public cNT profileSelectionLauncher;

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean alwaysAllowScreenMirroring() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return this;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    public static Intent d(Context context) {
        if (!NetflixApplication.getInstance().M()) {
            try {
                return a(context, null, null);
            } catch (ActivityNotFoundException e) {
                C1044Mm.e("LoginActivity", "Failed to start LoginTabletActivity Activity!", e);
                InterfaceC1598aHf.a(new C1596aHd().d(e));
            }
        }
        return c(context, null, null);
    }

    public static Intent c(Context context, C5007bqd c5007bqd, Status status) {
        Intent intent = new Intent(context, LoginActivity.class);
        C8126deW.d(c5007bqd, status, intent);
        return intent;
    }

    public static Intent a(Context context, C5007bqd c5007bqd, Status status) {
        Intent intent = new Intent(context, ActivityC6285caS.class);
        C8126deW.d(c5007bqd, status, intent);
        return intent;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ServiceManager serviceManager = getServiceManager();
        if (serviceManager != null && serviceManager.c()) {
            serviceManager.d(false);
        }
        super.onResume();
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8054ddD.d((Activity) this);
        setContentView(R.i.au);
        if (bundle != null) {
            this.b = (EmailPasswordFragment) getSupportFragmentManager().findFragmentByTag("EmailPasswordFragment");
        } else {
            PerformanceProfilerImpl.INSTANCE.d(Sessions.LOG_IN);
            h();
        }
        registerReceiverWithAutoUnregister(this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), true);
        d();
        Intent intent = getIntent();
        LoginApi.Oauth2State oauth2State = LoginApi.Oauth2State.e;
        if (intent.getBooleanExtra(oauth2State.e(), false) && Config_FastProperty_OauthTwoViaBrowser.Companion.e()) {
            getIntent().removeExtra(oauth2State.e());
            this.oauth2LoginDelegate.b(this, LifecycleKt.getCoroutineScope(getLifecycle()), C8142dem.d(this, getResources().getDimensionPixelSize(R.b.z)));
        }
        Intent intent2 = getIntent();
        LoginApi.Oauth2State oauth2State2 = LoginApi.Oauth2State.d;
        if (intent2.getBooleanExtra(oauth2State2.e(), false) && Config_FastProperty_OauthTwoViaBrowser.Companion.e()) {
            getIntent().removeExtra(oauth2State2.e());
            this.oauth2LoginDelegate.b(this);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        PerformanceProfilerImpl.INSTANCE.a(Sessions.LOG_IN);
    }

    @Override // o.C6321cbB.e
    public void b(PhoneCode phoneCode) {
        this.b.c(phoneCode);
    }

    @Override // o.InterfaceC6278caL
    public void b() {
        C8126deW.a((NetflixActivity) this);
        if (this.e) {
            C1044Mm.e("LoginActivity", "handleBackToRegularWorkflow:: New profile requested - starting profile selection activity...");
            startActivity(this.profileSelectionLauncher.b(this, getUiScreen()));
            bZV.finishAllAccountActivities(this);
            return;
        }
        C1044Mm.e("LoginActivity", "Back to regular workflow for profile activated...");
        finish();
    }

    @Override // o.InterfaceC6278caL
    public void c() {
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
    }

    private void d() {
        Intent f = NetflixApplication.getInstance().f();
        if (f == null || !f.getBooleanExtra("web_intent", false)) {
            return;
        }
        try {
            startActivity(f);
        } catch (Exception e) {
            InterfaceC1598aHf.e("Exception when starting web intent", e);
        }
        NetflixApplication.getInstance().l();
    }

    private void j() {
        C1044Mm.e("LoginActivity", "New profile requested - starting profile selection activity...");
        if (C8126deW.a((Context) this)) {
            C1044Mm.e("LoginActivity", "SmartLogin save enabled, do save credentials...");
            this.e = true;
            return;
        }
        C1044Mm.e("LoginActivity", "SmartLogin save not enabled, regular workflow...");
        startActivity(this.profileSelectionLauncher.b(this, getUiScreen()));
        bZV.finishAllAccountActivities(this);
    }

    private void e() {
        if (C8126deW.a((Context) this)) {
            C1044Mm.e("LoginActivity", "SmartLogin save enabled, do save credentials for profile activated...");
            this.e = false;
            return;
        }
        C1044Mm.e("LoginActivity", "SmartLogin save not enabled, regular workflow for profile activated...");
        finish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.login;
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        Fragment a = a();
        if (a != null) {
            ((NetflixFrag) a).onManagerReady(serviceManager, status);
        }
        PublishSubject<InterfaceC5283bvo> h = C4987bqJ.h();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        ((ObservableSubscribeProxy) h.as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.caC
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoginActivity.this.b((InterfaceC5283bvo) obj);
            }
        });
        ((ObservableSubscribeProxy) C4987bqJ.i().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.caD
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoginActivity.this.b((dpR) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC5283bvo interfaceC5283bvo) {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(dpR dpr) {
        j();
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C1056Na.a(this, status);
        Fragment a = a();
        if (a != null) {
            ((NetflixFrag) a).onManagerUnavailable(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            EmailPasswordFragment emailPasswordFragment = this.b;
            if (emailPasswordFragment != null) {
                emailPasswordFragment.e(i, i2, intent);
            }
        } else if (i == 23) {
            C1044Mm.c("LoginActivity", "onActivityResult: No action. IN_APP_UPDATE_REQUEST_CODE %d", Integer.valueOf(i2));
            return;
        } else {
            C1044Mm.d("LoginActivity", "onActivityResult: unknown request code" + i);
        }
        b();
    }

    private Fragment a() {
        return b(getSupportFragmentManager());
    }

    private Fragment b(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        C1044Mm.a("LoginActivity", "getBackStackEntryCount %d", Integer.valueOf(backStackEntryCount));
        if (backStackEntryCount == 0) {
            return null;
        }
        return fragmentManager.findFragmentByTag(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName());
    }

    private void h() {
        Bundle bundle;
        C1044Mm.a("LoginActivity", "showEmailPasswordFragment");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (getIntent().getExtras() != null) {
            bundle = new Bundle(getIntent().getExtras());
        } else {
            bundle = new Bundle();
        }
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d != null && d.W() != null) {
            SignInConfigData W = d.W();
            String obj = W.getOTPLayoutType().toString();
            String str = W.nextStep;
            str = (str == null || str.equals(SignInData.MODE_ENTER_CREDENTIALS_REFRESH)) ? "enterMemberCredentials" : "enterMemberCredentials";
            bundle.putString("OtpLayoutArgument", obj);
            bundle.putString("mode_argument", str);
        }
        EmailPasswordFragment c = EmailPasswordFragment.c(bundle);
        this.b = c;
        beginTransaction.replace(R.g.dp, c, "EmailPasswordFragment");
        beginTransaction.commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        b(supportFragmentManager);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showHelpInMenu() {
        if (!ConnectivityUtils.n(this) || getServiceManager() == null || getServiceManager().g() == null) {
            return false;
        }
        return getServiceManager().g().aD();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public CustomerServiceLogging.EntryPoint getEntryPoint() {
        return CustomerServiceLogging.EntryPoint.login;
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasUpAction() {
        return !cVB.e(this);
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        CLv2Utils.d();
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
            return;
        }
        startActivity(cVB.d(this));
        finish();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(false).b(true).b(NetflixActionBar.LogoType.a);
        SignInConfigData a = new C1823aPo(this).a();
        if (a == null || !a.isSignupBlocked()) {
            return;
        }
        c0051b.k(false);
    }
}
