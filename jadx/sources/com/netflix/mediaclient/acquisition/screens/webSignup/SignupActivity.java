package com.netflix.mediaclient.acquisition.screens.webSignup;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.action.SignIn;
import com.netflix.cl.model.event.session.action.StoreSharedCredentials;
import com.netflix.cl.model.event.session.command.SignInCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.screens.signupContainer.ErrorDialogHelper;
import com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.model.leafs.PostPlayItem;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.inject.Inject;
import o.C1044Mm;
import o.C1332Xp;
import o.C1569aGd;
import o.C1596aHd;
import o.C1815aPg;
import o.C4984bqG;
import o.C4987bqJ;
import o.C8126deW;
import o.C8150deu;
import o.C8159dfC;
import o.C8168dfL;
import o.C8169dfM;
import o.C8284dhV;
import o.C8313dhy;
import o.InterfaceC1598aHf;
import o.InterfaceC5109bsZ;
import o.InterfaceC6276caJ;
import o.InterfaceC6280caN;
import o.MP;
import o.aIB;
import o.bDI;
import o.bDM;
import o.bXE;
import o.bZV;
import o.cNT;
import o.cVB;
import o.cVG;
import o.dpR;
import o.drO;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"SetJavaScriptEnabled"})
@AndroidEntryPoint
/* loaded from: classes3.dex */
public class SignupActivity extends Hilt_SignupActivity implements InterfaceC6276caJ {
    private static final String BOOTURL = "booturl";
    public static final String EXTRA_USE_DARK_BACKGROUND = "useDarkBackground";
    private static final String GET_MODE_JS_SCRIPT = "!(netflix && netflix.reactContext) || (netflix && netflix.reactContext && netflix.reactContext.models && netflix.reactContext.models.flow && netflix.reactContext.models.flow.data && netflix.reactContext.models.flow.data.mode)";
    private static final String IS_WELCOME_JS_SCRIPT = "!(netflix && netflix.reactContext) || (netflix && netflix.reactContext && netflix.reactContext.models && netflix.reactContext.models.flow && netflix.reactContext.models.flow.data && netflix.reactContext.models.flow.data.mode === \"welcome\")";
    private static final String TAG = "SignupActivity";
    private static int c = 1;
    private static int e = 0;
    private static byte e$ss2$9028 = 24;
    @Inject
    public ErrorDialogHelper errorDialogHelper;
    @Inject
    protected LoginApi loginApi;
    private String mDeviceCategory;
    private String mESN;
    private String mESNPrefix;
    private String mEmail;
    private String mErrHandler;
    private boolean mIsLoginActivityInFocus;
    private boolean mIsSignupFromPlayback;
    protected InterfaceC6280caN mLoginProvider;
    private String mPassword;
    private InterfaceC5109bsZ mSignUpParams;
    private String mSoftwareVersion;
    private boolean nmTTRComplete;
    @Inject
    public bDI playerUI;
    @Inject
    protected cNT profileSelectionLauncher;
    private boolean mSignupMenuItem = true;
    private boolean mSignupLoaded = false;
    private boolean mSignupOngoing = false;
    private final BroadcastReceiver mNetworkChangeReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SignupActivity.this.invalidateOptionsMenu();
        }
    };
    Runnable mJumpToSignInTask = new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.6
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.e(SignupActivity.TAG, "Timeout triggered, switching to LoginActivity");
            if (SignupActivity.this.mSignupLoaded) {
                return;
            }
            SignupActivity signupActivity = SignupActivity.this;
            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
            SignupActivity.this.finish();
        }
    };
    Runnable mHandleError = new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.8
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.e(SignupActivity.TAG, "Handling error during signup");
            SignupActivity signupActivity = SignupActivity.this;
            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
            SignupActivity.this.finish();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface LogoutResponseHandler {
        void onLogoutComplete(Status status);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean alwaysAllowScreenMirroring() {
        return true;
    }

    @Override // o.cVD
    public Runnable getErrorHandler() {
        return this.mHandleError;
    }

    @Override // o.cVD
    public Runnable getNextTask() {
        return this.mJumpToSignInTask;
    }

    @Override // o.InterfaceC6276caJ
    public Activity getOwnerActivity() {
        return this;
    }

    @Override // o.InterfaceC6276caJ
    public void handleBackToRegularWorkflow() {
    }

    public static Intent createStartIntent(Context context, Intent intent) {
        if (C8150deu.h()) {
            try {
                return new Intent(context, SignupTabletActivity.class);
            } catch (ActivityNotFoundException e2) {
                C1044Mm.e(TAG, "Failed to start SignupTabletActivity Activity!", e2);
                InterfaceC1598aHf.a(new C1596aHd().d(e2));
            }
        }
        return new Intent(context, SignupActivity.class);
    }

    public static Intent createShowIntent(Context context) {
        if (C8150deu.h()) {
            try {
                Intent intent = new Intent(context, SignupTabletActivity.class);
                intent.addFlags(67141632);
                return intent;
            } catch (ActivityNotFoundException e2) {
                C1044Mm.e(TAG, "Failed to start LoginTabletActivity Activity!", e2);
                InterfaceC1598aHf.a(new C1596aHd().d(e2));
            }
        }
        Intent intent2 = new Intent(context, SignupActivity.class);
        intent2.addFlags(67141632);
        return intent2;
    }

    public void showNativeActivity(Context context) {
        startActivity(SignupNativeActivity.Companion.createStartIntent(context));
        finish();
    }

    @Override // o.cVD, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        getWebView().evaluateJavascript(IS_WELCOME_JS_SCRIPT, new ValueCallback() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda4
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SignupActivity.this.lambda$handleBackPressed$1((String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if ((r5 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        finish();
        r5 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (isBackPressHandledByGoBackFeature() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        r5 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.c + 103;
        com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.e = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if ((r5 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        r5 = getString(com.netflix.mediaclient.acquisition.R.string.signup_interrupt_by_user);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r5.startsWith("'!#+") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        r0 = new java.lang.Object[1];
        f(r5.substring(4), r0);
        r5 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        provideTwoButtonDialog(r5, new com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda0(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        getString(com.netflix.mediaclient.acquisition.R.string.signup_interrupt_by_user).startsWith("'!#+");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((!java.lang.Boolean.valueOf(r5).booleanValue()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (java.lang.Boolean.valueOf(r5).booleanValue() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        r5 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.e + 63;
        com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.c = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$handleBackPressed$1(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.e
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.c = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            r1 = 1
            int r1 = r1 / r2
            r5 = r5 ^ r3
            if (r5 == 0) goto L28
            goto L3e
        L1e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3e
        L28:
            int r5 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.e
            int r5 = r5 + 63
            int r1 = r5 % 128
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.c = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L3a
            r4.finish()
            r5 = 73
            int r5 = r5 / r2
            goto L83
        L3a:
            r4.finish()
            goto L83
        L3e:
            boolean r5 = r4.isBackPressHandledByGoBackFeature()
            if (r5 != 0) goto L83
            int r5 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.c
            int r5 = r5 + 103
            int r1 = r5 % 128
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.e = r1
            int r5 = r5 % r0
            java.lang.String r0 = "'!#+"
            if (r5 != 0) goto L78
            int r5 = com.netflix.mediaclient.acquisition.R.string.signup_interrupt_by_user
            java.lang.String r5 = r4.getString(r5)
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L6f
            r0 = 4
            java.lang.String r5 = r5.substring(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r4.f(r5, r0)
            r5 = r0[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
        L6f:
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda0 r0 = new com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda0
            r0.<init>()
            r4.provideTwoButtonDialog(r5, r0)
            goto L83
        L78:
            int r5 = com.netflix.mediaclient.acquisition.R.string.signup_interrupt_by_user
            java.lang.String r5 = r4.getString(r5)
            r5.startsWith(r0)
            r5 = 0
            throw r5
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.lambda$handleBackPressed$1(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleBackPressed$0() {
        if (cVB.g(getBaseContext())) {
            showNativeActivity(getBaseContext());
        } else {
            reload(getServiceManager().g(), false);
        }
    }

    @Override // o.cVD, o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setBackgroundColorFromExtras();
        super.onCreate(bundle);
        if (bundle == null) {
            PerformanceProfilerImpl.INSTANCE.d(Sessions.SIGN_UP);
        }
        if (cVB.e(getBaseContext())) {
            startNextActivity(this.loginApi.c(this));
            finish();
        }
        startSaveCredentialsWorkflow();
        registerReceiverWithAutoUnregister(this.mNetworkChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), false);
        aIB.b(this, new aIB.e() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda1
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                SignupActivity.this.setViews(serviceManager);
            }
        });
        ((ObservableSubscribeProxy) C4987bqJ.i().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY)))).e(new Consumer() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SignupActivity.this.lambda$onCreate$2((dpR) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(dpR dpr) {
        handleProfileReadyToSelect();
    }

    private void setBackgroundColorFromExtras() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.getBoolean(EXTRA_USE_DARK_BACKGROUND)) {
            return;
        }
        getWindow().setBackgroundDrawableResource(R.e.h);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(false).b(true).b(NetflixActionBar.LogoType.a);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        setTheme(com.netflix.mediaclient.acquisition.R.style.Theme_Signup);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ServiceManager serviceManager = getServiceManager();
        if (serviceManager != null && serviceManager.c() && serviceManager.A() && !this.mIsSignupFromPlayback) {
            this.mSignupLoaded = false;
            getBootLoader().a(this.mSignUpParams.b());
            runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    C1044Mm.e(SignupActivity.TAG, "Disabling webview visibility");
                    SignupActivity.this.webViewVisibility(false);
                }
            });
            getWebView().loadUrl(getBootLoader().c());
            serviceManager.d(false);
        }
        this.mIsSignupFromPlayback = false;
        super.onResume();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        PerformanceProfilerImpl.INSTANCE.a(Sessions.SIGN_UP);
    }

    @Override // o.cVD, com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC6280caN interfaceC6280caN = this.mLoginProvider;
        if (interfaceC6280caN != null) {
            interfaceC6280caN.a();
        }
    }

    @Override // com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.InterfaceC1576aGk
    public void endRenderNavigationLevelSession(IClientLogging.CompletionReason completionReason, Status status) {
        super.endRenderNavigationLevelSession(completionReason, status);
        if (this.nmTTRComplete) {
            return;
        }
        this.nmTTRComplete = true;
        Logger.INSTANCE.flush();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showHelpInMenu() {
        if (!ConnectivityUtils.n(this) || getServiceManager() == null || getServiceManager().g() == null) {
            return false;
        }
        return getServiceManager().g().aD();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public String getHelpMenuText() {
        int i = 2 % 2;
        int i2 = e + 21;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            String string = getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_help);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            int i3 = c + 105;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            return string;
        }
        getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_help).startsWith("'!#+");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        MenuItem add;
        int i;
        String string;
        int i2;
        int i3 = 2 % 2;
        int i4 = e + 13;
        int i5 = i4 % 128;
        c = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.mSignupMenuItem) {
            int i6 = i5 + 39;
            e = i6 % 128;
            if (i6 % 2 != 0) {
                i = R.g.dI;
                string = getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_sign_in);
                if (string.startsWith("'!#+")) {
                    i2 = 1;
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    add = menu.add(0, i, i2, string);
                    add.setShowAsAction(1);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.3
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            C1044Mm.e(SignupActivity.TAG, "User tapped sign-in button");
                            SignupActivity.this.mIsLoginActivityInFocus = true;
                            Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
                            SignupActivity signupActivity = SignupActivity.this;
                            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
                            return true;
                        }
                    });
                } else {
                    i2 = 1;
                    add = menu.add(0, i, i2, string);
                    add.setShowAsAction(1);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.3
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            C1044Mm.e(SignupActivity.TAG, "User tapped sign-in button");
                            SignupActivity.this.mIsLoginActivityInFocus = true;
                            Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
                            SignupActivity signupActivity = SignupActivity.this;
                            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
                            return true;
                        }
                    });
                }
            } else {
                i = R.g.dI;
                string = getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_sign_in);
                if (!(!string.startsWith("'!#+"))) {
                    i2 = 0;
                    Object[] objArr2 = new Object[1];
                    f(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                    add = menu.add(0, i, i2, string);
                    add.setShowAsAction(1);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.3
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            C1044Mm.e(SignupActivity.TAG, "User tapped sign-in button");
                            SignupActivity.this.mIsLoginActivityInFocus = true;
                            Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
                            SignupActivity signupActivity = SignupActivity.this;
                            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
                            return true;
                        }
                    });
                } else {
                    i2 = 0;
                    add = menu.add(0, i, i2, string);
                    add.setShowAsAction(1);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.3
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            C1044Mm.e(SignupActivity.TAG, "User tapped sign-in button");
                            SignupActivity.this.mIsLoginActivityInFocus = true;
                            Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
                            SignupActivity signupActivity = SignupActivity.this;
                            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
                            return true;
                        }
                    });
                }
            }
        } else {
            int i7 = R.g.dG;
            String string2 = getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_sign_out);
            if (string2.startsWith("'!#+")) {
                int i8 = c + 7;
                e = i8 % 128;
                int i9 = i8 % 2;
                String substring = string2.substring(4);
                Object[] objArr3 = new Object[1];
                f(substring, objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            add = menu.add(0, i7, 0, string2);
            add.setShowAsAction(1);
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.4
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    SignupActivity.this.signUserOut();
                    return true;
                }
            });
        }
        View actionView = add.getActionView();
        if (actionView == null || actionView.isInTouchMode()) {
            return;
        }
        actionView.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signUserOut() {
        webViewVisibility(false);
        aIB.b(this, new aIB.e() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda6
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                SignupActivity.this.lambda$signUserOut$3(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signUserOut$3(final ServiceManager serviceManager) {
        UserAgent c2 = C8126deW.c(this);
        if (c2 != null) {
            sendLogoutRequest(c2, new LogoutResponseHandler() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.5
                @Override // com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.LogoutResponseHandler
                public void onLogoutComplete(Status status) {
                    if (!cVB.g(SignupActivity.this.getBaseContext())) {
                        SignupActivity.this.webViewVisibility(true);
                        SignupActivity.this.reload(serviceManager.g(), true);
                        return;
                    }
                    SignupActivity signupActivity = SignupActivity.this;
                    signupActivity.showNativeActivity(signupActivity.getBaseContext());
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    class signUpWebChromeClient extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        private signUpWebChromeClient() {
        }
    }

    /* loaded from: classes3.dex */
    public class SignUpJSBridge {
        private static int a = 0;
        private static int b = 1;
        private static byte e$ss2$412 = 24;

        @JavascriptInterface
        public void logIDFAEvent(String str) {
        }

        @JavascriptInterface
        public void notifyOnRendered() {
        }

        @JavascriptInterface
        public void onSuccess() {
        }

        @JavascriptInterface
        public void updateCookies() {
        }

        public SignUpJSBridge() {
        }

        @JavascriptInterface
        public void toSignIn() {
            C1044Mm.e(SignupActivity.TAG, "Redirecting to Login screen");
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$SignUpJSBridge$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SignupActivity.SignUpJSBridge.this.lambda$toSignIn$0();
                }
            });
            SignupActivity.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$toSignIn$0() {
            SignupActivity signupActivity = SignupActivity.this;
            signupActivity.startNextActivity(signupActivity.loginApi.c(signupActivity));
        }

        @JavascriptInterface
        public void passNonMemberInfo(String str) {
            C1044Mm.e(SignupActivity.TAG, "passNonMemberInfo %s", str);
        }

        @JavascriptInterface
        public void showSignIn() {
            C1044Mm.e(SignupActivity.TAG, "Show SignIn: ");
            SignupActivity.this.mSignupMenuItem = true;
            SignupActivity.this.updateMenuItems();
        }

        @JavascriptInterface
        public void showSignOut() {
            C1044Mm.e(SignupActivity.TAG, "Show SignOut");
            SignupActivity.this.mSignupMenuItem = false;
            SignupActivity.this.updateMenuItems();
        }

        @JavascriptInterface
        public void loginCompleted() {
            C1044Mm.e(SignupActivity.TAG, "loginCompleted, noop");
        }

        @JavascriptInterface
        public void signupCompleted() {
            C1044Mm.e(SignupActivity.TAG, "signupCompleted, noop");
        }

        @JavascriptInterface
        public void launchUrl(String str) {
            final String trim;
            if (str == null) {
                trim = "http://netflix.com";
            } else {
                trim = str.trim();
                if (!trim.toLowerCase(Locale.ENGLISH).startsWith("http")) {
                    trim = "http://" + trim;
                }
            }
            C1044Mm.e(SignupActivity.TAG, "Final launch url: " + trim);
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$SignUpJSBridge$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SignupActivity.SignUpJSBridge.this.lambda$launchUrl$1(trim);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$launchUrl$1(String str) {
            SignupActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }

        @JavascriptInterface
        public String getESN() {
            return SignupActivity.this.mESN != null ? SignupActivity.this.mESN : "";
        }

        @JavascriptInterface
        public String getESNPrefix() {
            return SignupActivity.this.mESNPrefix != null ? SignupActivity.this.mESNPrefix : "";
        }

        @JavascriptInterface
        public String getSoftwareVersion() {
            return SignupActivity.this.mSoftwareVersion != null ? SignupActivity.this.mSoftwareVersion : "";
        }

        @JavascriptInterface
        public String getDeviceCategory() {
            return SignupActivity.this.mDeviceCategory != null ? SignupActivity.this.mDeviceCategory : "phone";
        }

        @JavascriptInterface
        public String getLanguage() {
            return SignupActivity.this.getDeviceLanguage();
        }

        @JavascriptInterface
        public void setLanguage(String str) {
            boolean equals = str.equals(getLanguage());
            C1044Mm.e(SignupActivity.TAG, "Update language to " + str);
            if (equals) {
                return;
            }
            if (SignupActivity.this.getServiceManager().c()) {
                C4984bqG.b.b(SignupActivity.this.getApplicationContext(), new C8313dhy(str));
                SignupActivity.this.updateMenuItems();
                return;
            }
            C1044Mm.j(SignupActivity.TAG, "setLanguage  failed, invalid state");
        }

        @JavascriptInterface
        public void supportsSignUp(String str) {
            C1044Mm.e(SignupActivity.TAG, "SupportSignUp flag: " + str);
        }

        @JavascriptInterface
        public String isNetflixPreloaded() {
            return C8159dfC.d(SignupActivity.this) ? "true" : "false";
        }

        @JavascriptInterface
        public void notifyReady() {
            C1044Mm.e(SignupActivity.TAG, "Signup UI ready to interact");
            SignupActivity.this.getHandler().removeCallbacks(SignupActivity.this.mJumpToSignInTask);
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.1
                @Override // java.lang.Runnable
                public void run() {
                    if (SignupActivity.this.mSignupLoaded) {
                        return;
                    }
                    SignupActivity.this.endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
                    SignupActivity.this.webViewVisibility(true);
                    SignupActivity.this.mSignupLoaded = true;
                }
            });
        }

        @JavascriptInterface
        public void switchToNative(String str) {
            final Intent createStartIntent = SignupNativeActivity.Companion.createStartIntent(SignupActivity.this);
            createStartIntent.putExtra("extra_mode", str);
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$SignUpJSBridge$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    SignupActivity.SignUpJSBridge.this.lambda$switchToNative$2(createStartIntent);
                }
            });
            SignupActivity.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$switchToNative$2(Intent intent) {
            SignupActivity.this.startActivity(intent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            o.C1044Mm.e(com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.TAG, "Login with Tokens " + r7 + " ErrHandler: " + r8);
            r6.this$0.mErrHandler = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
            if (com.netflix.mediaclient.util.ConnectivityUtils.n(r6.this$0) != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            r6.this$0.noConnectivityWarning();
            r7 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.a + 13;
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.b = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
            r7 = new o.C1569aGd(new org.json.JSONObject(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
            if (o.C8126deW.c(r6.this$0) == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
            com.netflix.cl.Logger.INSTANCE.startSession(new com.netflix.cl.model.event.session.action.SignIn(null, null, null, null));
            r6.this$0.mUserAgentRepository.b(r7).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).takeUntil(r6.this$0.mActivityDestroy).subscribe(new com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.AnonymousClass2(r6, "sendLoginUserByTokens"));
            r6.this$0.mSignupOngoing = true;
            r6.this$0.runOnUiThread(new com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.AnonymousClass3(r6));
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
            r7 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.a + 61;
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.b = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
            o.C1044Mm.e(com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.TAG, "loginToApp, invalid state to Login, bailing out");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
            o.C1044Mm.e(com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.TAG, "Failed to LoginToApp", r7);
            r6.this$0.mSignupOngoing = false;
            r7 = r6.this$0;
            r1 = r7.getString(com.netflix.mediaclient.ui.R.o.lv);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
            if (r1.startsWith("'!#+") == true) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
            r3 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.b + 85;
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.a = r3 % 128;
            r3 = r3 % 2;
            r8 = new java.lang.Object[1];
            c(r1.substring(4), r8);
            r1 = ((java.lang.String) r8[0]).intern();
            r8 = com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.b + 65;
            com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.a = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0106, code lost:
            r7.provideDialog(r1, r6.this$0.mHandleError);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            if (r6.this$0.mSignupOngoing != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
            if (r6.this$0.mSignupOngoing != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            o.C1044Mm.e(com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.TAG, "loginToApp ongoing, returning NULL operation");
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void loginToApp(java.lang.String r7, java.lang.String r8) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.loginToApp(java.lang.String, java.lang.String):void");
        }

        @JavascriptInterface
        public void logoutOfApp() {
            SignupActivity.this.signUserOut();
        }

        @JavascriptInterface
        public void saveUserCredentials(String str, String str2) {
            SignupActivity.this.mEmail = str;
            SignupActivity.this.mPassword = str2;
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.4
                @Override // java.lang.Runnable
                public void run() {
                    SignupActivity.this.saveCredentials();
                }
            });
        }

        @JavascriptInterface
        public void playVideo(int i, int i2, String str, String str2) {
            ServiceManager serviceManager = SignupActivity.this.getServiceManager();
            if (serviceManager != null && serviceManager.c()) {
                serviceManager.d(true);
            }
            VideoType videoType = PostPlayItem.POST_PLAY_ITEM_EPISODE.equals(str) ? VideoType.EPISODE : VideoType.MOVIE;
            PlayContextImp playContextImp = new PlayContextImp("mcplayer", i2, 0, 0);
            SignupActivity.this.getBootLoader().b(Integer.toString(i));
            SignupActivity signupActivity = SignupActivity.this;
            final Intent e = signupActivity.playerUI.e(signupActivity, Integer.toString(i), videoType, playContextImp);
            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$SignUpJSBridge$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SignupActivity.SignUpJSBridge.this.lambda$playVideo$3(e);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$playVideo$3(Intent intent) {
            SignupActivity.this.startActivityForResult(intent, 20);
        }

        @JavascriptInterface
        public void playbackTokenActivate(String str, final String str2) {
            int i = 2 % 2;
            int i2 = a + 33;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (SignupActivity.this.mSignupOngoing) {
                C1044Mm.e(SignupActivity.TAG, "Another potential token activate ongoing, returning NULL operation");
                return;
            }
            C1044Mm.e(SignupActivity.TAG, "Token Activate with Tokens " + str);
            if (ConnectivityUtils.n(SignupActivity.this)) {
                try {
                    C1569aGd c1569aGd = new C1569aGd(new JSONObject(str));
                    UserAgent c = C8126deW.c(SignupActivity.this);
                    if (c != null) {
                        if (c.v()) {
                            SignupActivity.this.runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    SignUpJSBridge.this.invokeJsCallback(str2, null);
                                }
                            });
                        } else {
                            Logger.INSTANCE.startSession(new SignInCommand());
                            SignupActivity.this.mUserAgentRepository.b(c1569aGd).observeOn(AndroidSchedulers.mainThread()).takeUntil(SignupActivity.this.mActivityDestroy).subscribe(new bDM<Status>("sendLoginUserByTokens") { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.6
                                @Override // io.reactivex.Observer
                                public void onNext(Status status) {
                                    SignUpJSBridge.this.handleTokenActivate(status, str2);
                                }
                            });
                        }
                    } else {
                        C1044Mm.e(SignupActivity.TAG, "tokenActivate, invalid state to token activate, bailing out");
                    }
                    return;
                } catch (JSONException e) {
                    C1044Mm.e(SignupActivity.TAG, "Failed to TokenActivate", e);
                    SignupActivity.this.mSignupOngoing = false;
                    SignupActivity signupActivity = SignupActivity.this;
                    String string = signupActivity.getString(R.o.lv);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        c(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                    }
                    signupActivity.provideDialog(string, SignupActivity.this.mHandleError);
                    return;
                }
            }
            int i4 = a + 83;
            b = i4 % 128;
            int i5 = i4 % 2;
            SignupActivity.this.noConnectivityWarning();
        }

        @JavascriptInterface
        public void exit() {
            UserCookies e = C8284dhV.e(C1815aPg.d(SignupActivity.this).a());
            if (e.isValid()) {
                SignupActivity.this.mUserAgentRepository.l().observeOn(AndroidSchedulers.mainThread()).takeUntil(SignupActivity.this.mActivityDestroy).subscribe(new bDM<Status>("SignupActivity JS bridge exit") { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.7
                    @Override // io.reactivex.Observer
                    public void onNext(Status status) {
                        SignupActivity.this.handleLoginComplete(status);
                    }
                });
                return;
            }
            try {
                SignupActivity.this.mUserAgentRepository.b(new C1569aGd(e.netflixId, e.secureNetflixId)).observeOn(AndroidSchedulers.mainThread()).takeUntil(SignupActivity.this.mActivityDestroy).subscribe(new bDM<Status>("SignupActivity JS bridge exit") { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.SignUpJSBridge.8
                    @Override // io.reactivex.Observer
                    public void onNext(Status status) {
                        SignupActivity.this.handleLoginComplete(status);
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleTokenActivate(Status status, String str) {
            if (status.l() != null) {
                status.l();
            }
            SignupActivity.this.mSignupOngoing = false;
            StatusCode c = status.c();
            if (status.j() || c == StatusCode.NRD_REGISTRATION_EXISTS) {
                ExtLogger.INSTANCE.endExclusiveAction("SignIn");
                invokeJsCallback(str, null);
                return;
            }
            ExtLogger.INSTANCE.failedExclusiveAction("SignIn", C8169dfM.b(status));
            SignupActivity.this.provideDialog(SignupActivity.this.getString(R.o.lv) + " (" + c.getValue() + ")", SignupActivity.this.mHandleError);
            if (str != null) {
                String str2 = "javascript:" + str + "('" + c.getValue() + "')";
                C1044Mm.e(SignupActivity.TAG, "Executing the following javascript:" + str2);
                SignupActivity.this.getWebView().loadUrl(str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invokeJsCallback(String str, JSONObject jSONObject) {
            WebView webView = SignupActivity.this.getWebView();
            webView.loadUrl("javascript:" + str + "('" + jSONObject + "')");
        }

        private void c(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$412);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMenuItems() {
        runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.7
            @Override // java.lang.Runnable
            public void run() {
                SignupActivity.this.invalidateOptionsMenu();
            }
        });
    }

    @Override // o.cVD
    public String getBootUrl() {
        return this.mSignUpParams.b();
    }

    @Override // o.cVD
    public long getTimeout() {
        return this.mSignUpParams.e();
    }

    @Override // o.cVD
    public void setViews(ServiceManager serviceManager) {
        this.mESN = serviceManager.k().m();
        this.mESNPrefix = serviceManager.k().k();
        this.mSoftwareVersion = serviceManager.v();
        this.mDeviceCategory = serviceManager.i().c();
        this.mSignUpParams = serviceManager.s();
        super.setViews(serviceManager);
        getWebView().setWebChromeClient(new signUpWebChromeClient());
    }

    @Override // o.cVD
    public Object createJSBridge() {
        return new SignUpJSBridge();
    }

    private void handleProfileReadyToSelect() {
        if (this.mIsLoginActivityInFocus) {
            C1044Mm.a(TAG, "Login activity is in focus, leave it to finish all account activities when it is ready");
            return;
        }
        C1044Mm.a(TAG, "New profile requested - starting profile selection activity...");
        startActivity(this.profileSelectionLauncher.b(this, getUiScreen()));
        bZV.finishAllAccountActivities(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoginComplete(Status status) {
        if (status.l() != null) {
            status.l();
        }
        this.mSignupOngoing = false;
        StatusCode c2 = status.c();
        if (status.j() || c2 == StatusCode.NRD_REGISTRATION_EXISTS) {
            showToast(R.o.gp);
            ExtLogger.INSTANCE.endExclusiveAction("SignIn");
            return;
        }
        ExtLogger.INSTANCE.failedExclusiveAction("SignIn", C8169dfM.b(status));
        provideDialog(getString(R.o.lv) + " (" + c2.getValue() + ")", this.mHandleError);
        if (this.mErrHandler != null) {
            String str = "javascript:" + this.mErrHandler + "('" + c2.getValue() + "')";
            C1044Mm.e(TAG, "Executing the following javascript:" + str);
            getWebView().loadUrl(str);
            this.mErrHandler = null;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.nmLanding;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.mIsLoginActivityInFocus = false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            InterfaceC6280caN interfaceC6280caN = this.mLoginProvider;
            if (interfaceC6280caN != null) {
                interfaceC6280caN.e(i, i2, intent);
            }
        } else if (i == 20 && i2 == 21) {
            getServiceManager();
            String stringExtra = intent.getStringExtra("nextUrl");
            String b = this.mSignUpParams.b();
            Uri parse = Uri.parse(b);
            if (stringExtra != null) {
                b = parse.getScheme() + "://" + parse.getHost() + stringExtra;
            }
            getBootLoader().a(b);
            this.mIsSignupFromPlayback = true;
            this.mSignupLoaded = false;
            runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    C1044Mm.e(SignupActivity.TAG, "Disabling webview visibility");
                    SignupActivity.this.webViewVisibility(false);
                }
            });
            getWebView().loadUrl(getBootLoader().c());
            UserAgent c2 = C8126deW.c(this);
            if (c2 != null) {
                sendLogoutRequest(c2, null);
            }
        } else if (i == MP.h) {
            ((bXE) C1332Xp.b(bXE.class)).a(i2);
        } else {
            C1044Mm.d(TAG, "onActivityResult: unknown request code" + i);
        }
    }

    private void startSaveCredentialsWorkflow() {
        if (C8126deW.a((Context) this)) {
            InterfaceC6280caN d = this.loginApi.d((InterfaceC6276caJ) this);
            this.mLoginProvider = d;
            d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCredentials() {
        synchronized (this) {
            if (C8126deW.a((Context) this)) {
                if (this.mLoginProvider == null) {
                    C1044Mm.e(TAG, "Login provider, unable to attempt to save credentials");
                    return;
                }
                C1044Mm.e(TAG, "Login Provider is available. Trying to save credential...");
                C1044Mm.e(TAG, "Trying to save credential...");
                if (!C8168dfL.g(this.mEmail) && !C8168dfL.g(this.mPassword)) {
                    Logger.INSTANCE.startSession(new StoreSharedCredentials(AppView.webView, null, null, null));
                    this.mLoginProvider.a(this.mEmail, this.mPassword);
                    return;
                }
                C1044Mm.j(TAG, "Credential is empty, do not save it.");
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public CustomerServiceLogging.EntryPoint getEntryPoint() {
        return CustomerServiceLogging.EntryPoint.nonMemberLanding;
    }

    private void sendLogoutRequest(UserAgent userAgent, final LogoutResponseHandler logoutResponseHandler) {
        this.mUserAgentRepository.k().observeOn(AndroidSchedulers.mainThread()).takeUntil(this.mActivityDestroy).subscribe(new bDM<Status>("SignupActivity logoutError") { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.10
            @Override // io.reactivex.Observer
            public void onNext(Status status) {
                LogoutResponseHandler logoutResponseHandler2 = logoutResponseHandler;
                if (logoutResponseHandler2 != null) {
                    logoutResponseHandler2.onLogoutComplete(status);
                }
            }
        });
    }

    @Override // o.cVD
    public void onWebViewLoaded(cVG cvg) {
        super.onWebViewLoaded(cvg);
        if (cvg != null) {
            endRenderNavigationLevelSession(IClientLogging.CompletionReason.failed, null);
            getWebView().setVisibility(8);
            logWebViewLoadError(cvg);
            this.errorDialogHelper.showError(com.netflix.mediaclient.acquisition.R.string.generic_retryable_failure, new drO() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda5
                @Override // o.drO
                public final Object invoke() {
                    dpR lambda$onWebViewLoaded$4;
                    lambda$onWebViewLoaded$4 = SignupActivity.this.lambda$onWebViewLoaded$4();
                    return lambda$onWebViewLoaded$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR lambda$onWebViewLoaded$4() {
        this.errorDialogHelper.relaunchApp();
        return null;
    }

    private static void logWebViewLoadError(cVG cvg) {
        int c2 = cvg.c();
        C1044Mm.e(TAG, "Url failed to load. code='%d', description='%s', url='%s'", Integer.valueOf(c2), cvg.e(), cvg.d());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", cvg.c());
            jSONObject.put("description", cvg.e());
            jSONObject.put(SignupConstants.Field.URL, cvg.d());
            ExtLogger.INSTANCE.logError(new Error(SignupConstants.Error.WEB_VIEW_ERROR, null, jSONObject));
        } catch (JSONException unused) {
        }
    }

    private boolean isBackPressHandledByGoBackFeature() {
        if (cVB.g(getBaseContext())) {
            if (getWebView() == null || getWebView().getUrl() == null) {
                showNativeActivity(getBaseContext());
                return true;
            } else if (getWebView().getUrl().contains("orderfinal")) {
                showNativeActivity(getBaseContext());
                return true;
            } else {
                getWebView().evaluateJavascript(GET_MODE_JS_SCRIPT, new ValueCallback() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity$$ExternalSyntheticLambda3
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        SignupActivity.this.lambda$isBackPressHandledByGoBackFeature$5((String) obj);
                    }
                });
            }
        } else {
            reload(getServiceManager().g(), false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBackPressHandledByGoBackFeature$5(String str) {
        if (getWebView().canGoBackOrForward(-1)) {
            getWebView().goBack();
        } else {
            showNativeActivity(getBaseContext());
        }
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$9028);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
