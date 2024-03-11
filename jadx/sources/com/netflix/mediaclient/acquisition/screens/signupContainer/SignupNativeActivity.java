package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.command.SignInCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.api.SignUpDebugUtilities;
import com.netflix.mediaclient.acquisition.databinding.SignupActivityLayoutBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.screens.SignupBackType;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.cache.FormCacheImpl;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import com.netflix.mediaclient.acquisition.screens.Refreshable;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity;
import com.netflix.mediaclient.acquisition.services.logging.SignupFragmentLifecycleLogger;
import com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData;
import com.netflix.mediaclient.acquisition.util.SignupFlowModeStackManager;
import com.netflix.mediaclient.acquisition.util.SignupMode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.settings.DebugMenuPreference;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.EntryPointAccessors;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.inject.Inject;
import kotlin.Pair;
import o.C1030Lx;
import o.C1044Mm;
import o.C1205Ss;
import o.C1281Vq;
import o.C1332Xp;
import o.C1336Xt;
import o.C1569aGd;
import o.C1596aHd;
import o.C1815aPg;
import o.C1823aPo;
import o.C4984bqG;
import o.C4987bqJ;
import o.C8054ddD;
import o.C8096ddt;
import o.C8128deY;
import o.C8139dej;
import o.C8145dep;
import o.C8150deu;
import o.C8206dfx;
import o.C8284dhV;
import o.C8310dhv;
import o.C8313dhy;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C9725vn;
import o.C9726vo;
import o.C9834xU;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5018bqo;
import o.InterfaceC5091bsH;
import o.InterfaceC5844cKl;
import o.InterfaceC6629cgs;
import o.InterfaceC6634cgx;
import o.InterfaceC7018coJ;
import o.InterfaceC8554dpx;
import o.InterfaceC8660dtv;
import o.MP;
import o.aMU;
import o.aMX;
import o.aRS;
import o.bXE;
import o.cQQ;
import o.cVB;
import o.dpR;
import o.dqE;
import o.dqL;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.duD;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class SignupNativeActivity extends Hilt_SignupNativeActivity implements com.netflix.mediaclient.acquisition.api.SignupNativeActivity, InterfaceC6629cgs {
    public static final int $stable;
    public static final Companion Companion;
    public static final String KEY_SUPPRESS_NAVIGATE_ON_RESTORE = "suppress";
    private static final long PROGRESS_BAR_ANIM_DELAY = 250;
    private static final long PROGRESS_BAR_ANIM_DURATION = 250;
    public static final String TAG = "nf_signup_native";
    private static int a = 1;
    private static int e;
    private static byte e$ss2$17232;
    private SignupActivityLayoutBinding binding;
    @Inject
    public ErrorDialogHelper errorDialogHelper;
    private final FragmentManager fragmentManager;
    private boolean initializedFromPreviousInstance;
    private Long lastNavigationSessionId;
    private LifecycleRegistry lifecycleRegistry;
    private View loading_view;
    private boolean loggingIn;
    @Inject
    public InterfaceC6634cgx memberRejoin;
    @Inject
    public MoneyballDataSource moneyballDataSource;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    private boolean nmTTRComplete;
    @Inject
    public InterfaceC7018coJ nonMemberNavigation;
    private boolean openTrayOnWelcome;
    @Inject
    public InterfaceC5844cKl profile;
    private final Set<String> refreshOnWelcomeModes;
    private boolean refreshWelcomeOnResume;
    @Inject
    public Optional<SignUpDebugUtilities> signUpDebugUtilities;
    public SignupErrorReporter signupErrorReporter;
    @Inject
    public SignupFragmentLifecycleLogger signupFragmentLifecycleLogger;
    public SignupNetworkManager signupNetworkManager;
    public StringProvider stringProvider;
    private Boolean suppressNavigateToFlowMode;
    private final cQQ userAgentRepository;
    private final InterfaceC8554dpx viewModel$delegate;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SignInButtonInHeaderType.values().length];
            try {
                iArr[SignInButtonInHeaderType.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignInButtonInHeaderType.SIGN_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SignupBackType.values().length];
            try {
                iArr2[SignupBackType.NORMAL_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SignupBackType.INTERRUPT_WITH_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SignupBackType.BACK_TO_PREVIOUS_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        b();
        Companion = new Companion(null);
        $stable = 8;
    }

    static void b() {
        e$ss2$17232 = (byte) 24;
    }

    @SignupMoneyballData
    public static /* synthetic */ void getMoneyballDataSource$annotations() {
    }

    public static /* synthetic */ void getSignup_activity_content$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initProgressSpinner$lambda$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean replaceLoadingScreenAb30210$lambda$24(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterruptDialog$lambda$7(DialogInterface dialogInterface, int i) {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean alwaysAllowScreenMirroring() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return R.id.signup_activity_content;
    }

    public final boolean getLoggingIn() {
        return this.loggingIn;
    }

    @Override // o.bZV, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onBeforeNetworkAction(Request request) {
        C8632dsu.c((Object) request, "");
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampNavigationListener
    public void onrampNavigated() {
    }

    @Override // o.InterfaceC6629cgs
    public void openTrayOnNextWelcome(boolean z) {
        this.openTrayOnWelcome = z;
    }

    public final void setErrorDialogHelper(ErrorDialogHelper errorDialogHelper) {
        C8632dsu.c((Object) errorDialogHelper, "");
        this.errorDialogHelper = errorDialogHelper;
    }

    public final void setLoggingIn(boolean z) {
        this.loggingIn = z;
    }

    public final void setMemberRejoin(InterfaceC6634cgx interfaceC6634cgx) {
        C8632dsu.c((Object) interfaceC6634cgx, "");
        this.memberRejoin = interfaceC6634cgx;
    }

    public final void setMoneyballDataSource(MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) moneyballDataSource, "");
        this.moneyballDataSource = moneyballDataSource;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setNonMemberNavigation(InterfaceC7018coJ interfaceC7018coJ) {
        C8632dsu.c((Object) interfaceC7018coJ, "");
        this.nonMemberNavigation = interfaceC7018coJ;
    }

    public final void setProfile(InterfaceC5844cKl interfaceC5844cKl) {
        C8632dsu.c((Object) interfaceC5844cKl, "");
        this.profile = interfaceC5844cKl;
    }

    public final void setSignUpDebugUtilities(Optional<SignUpDebugUtilities> optional) {
        C8632dsu.c((Object) optional, "");
        this.signUpDebugUtilities = optional;
    }

    public final void setSignupErrorReporter(SignupErrorReporter signupErrorReporter) {
        C8632dsu.c((Object) signupErrorReporter, "");
        this.signupErrorReporter = signupErrorReporter;
    }

    public final void setSignupFragmentLifecycleLogger(SignupFragmentLifecycleLogger signupFragmentLifecycleLogger) {
        C8632dsu.c((Object) signupFragmentLifecycleLogger, "");
        this.signupFragmentLifecycleLogger = signupFragmentLifecycleLogger;
    }

    public final void setSignupNetworkManager(SignupNetworkManager signupNetworkManager) {
        C8632dsu.c((Object) signupNetworkManager, "");
        this.signupNetworkManager = signupNetworkManager;
    }

    public final void setStringProvider(StringProvider stringProvider) {
        C8632dsu.c((Object) stringProvider, "");
        this.stringProvider = stringProvider;
    }

    public SignupNativeActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C8632dsu.a(supportFragmentManager, "");
        this.fragmentManager = supportFragmentManager;
        this.suppressNavigateToFlowMode = Boolean.FALSE;
        this.viewModel$delegate = new ViewModelLazy(dsA.a(SignupViewModel.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final ViewModelProvider.Factory invoke() {
                Application application = SignupNativeActivity.this.getApplication();
                C8632dsu.a(application, "");
                return new ViewModelProvider.AndroidViewModelFactory(application);
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                drO dro = drO.this;
                if (dro == null || (creationExtras = (CreationExtras) dro.invoke()) == null) {
                    CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                    C8632dsu.a(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
                return creationExtras;
            }
        });
        this.userAgentRepository = new cQQ();
        this.refreshOnWelcomeModes = dqL.a((Object[]) new String[]{"learnMoreConfirm", SignupConstants.Mode.NON_MEMBER_HOME});
    }

    @Override // com.netflix.mediaclient.acquisition.api.SignupNativeActivity
    public AppView getAppView() {
        AppView appView;
        SignupFragment currentFragment = getCurrentFragment();
        return (currentFragment == null || (appView = currentFragment.getAppView()) == null) ? getUiScreen() : appView;
    }

    public final Optional<SignUpDebugUtilities> getSignUpDebugUtilities() {
        Optional<SignUpDebugUtilities> optional = this.signUpDebugUtilities;
        if (optional != null) {
            return optional;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6634cgx getMemberRejoin() {
        InterfaceC6634cgx interfaceC6634cgx = this.memberRejoin;
        if (interfaceC6634cgx != null) {
            return interfaceC6634cgx;
        }
        C8632dsu.d("");
        return null;
    }

    public final MoneyballDataSource getMoneyballDataSource() {
        MoneyballDataSource moneyballDataSource = this.moneyballDataSource;
        if (moneyballDataSource != null) {
            return moneyballDataSource;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7018coJ getNonMemberNavigation() {
        InterfaceC7018coJ interfaceC7018coJ = this.nonMemberNavigation;
        if (interfaceC7018coJ != null) {
            return interfaceC7018coJ;
        }
        C8632dsu.d("");
        return null;
    }

    public final FrameLayout getSignup_activity_content() {
        SignupActivityLayoutBinding signupActivityLayoutBinding = this.binding;
        if (signupActivityLayoutBinding == null) {
            C8632dsu.d("");
            signupActivityLayoutBinding = null;
        }
        FrameLayout frameLayout = signupActivityLayoutBinding.signupActivityContent;
        C8632dsu.a(frameLayout, "");
        return frameLayout;
    }

    public final SignupViewModel getViewModel() {
        return (SignupViewModel) this.viewModel$delegate.getValue();
    }

    public final SignupFragment getCurrentFragment() {
        Fragment findFragmentById = this.fragmentManager.findFragmentById(R.id.signup_fragment_container);
        if (findFragmentById instanceof SignupFragment) {
            return (SignupFragment) findFragmentById;
        }
        return null;
    }

    public final SignupFragmentLifecycleLogger getSignupFragmentLifecycleLogger() {
        SignupFragmentLifecycleLogger signupFragmentLifecycleLogger = this.signupFragmentLifecycleLogger;
        if (signupFragmentLifecycleLogger != null) {
            return signupFragmentLifecycleLogger;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupErrorReporter getSignupErrorReporter() {
        SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
        if (signupErrorReporter != null) {
            return signupErrorReporter;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupNetworkManager getSignupNetworkManager() {
        SignupNetworkManager signupNetworkManager = this.signupNetworkManager;
        if (signupNetworkManager != null) {
            return signupNetworkManager;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5844cKl getProfile() {
        InterfaceC5844cKl interfaceC5844cKl = this.profile;
        if (interfaceC5844cKl != null) {
            return interfaceC5844cKl;
        }
        C8632dsu.d("");
        return null;
    }

    public final ErrorDialogHelper getErrorDialogHelper() {
        ErrorDialogHelper errorDialogHelper = this.errorDialogHelper;
        if (errorDialogHelper != null) {
            return errorDialogHelper;
        }
        C8632dsu.d("");
        return null;
    }

    public final StringProvider getStringProvider() {
        StringProvider stringProvider = this.stringProvider;
        if (stringProvider != null) {
            return stringProvider;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Intent createStartIntent(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, C8150deu.h() ? SignupNativeTabletActivity.class : SignupNativeActivity.class);
        }
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        injectMoneyballDependencies();
        this.initializedFromPreviousInstance = bundle != null;
        SignupActivityLayoutBinding inflate = SignupActivityLayoutBinding.inflate(getLayoutInflater());
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        if (inflate == null) {
            C8632dsu.d("");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        initWindow();
        initViewModelObserver();
        initSignupHeaderObserver();
        initProgressSpinner();
        initSavedBundleProps(bundle);
        C1332Xp c1332Xp = C1332Xp.b;
        ((bXE) C1332Xp.b(bXE.class)).c();
        checkEmptyFlowMode();
        this.fragmentManager.registerFragmentLifecycleCallbacks(getSignupFragmentLifecycleLogger(), false);
    }

    private final void injectMoneyballDependencies() {
        setStringProvider(getMoneyballEntryPoint().stringProvider());
        setSignupNetworkManager(getMoneyballEntryPoint().signupNetworkManager());
        setSignupErrorReporter(getMoneyballEntryPoint().signupErrorReporter());
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean b;
        super.onResume();
        if (!this.refreshWelcomeOnResume) {
            Set<String> set = this.refreshOnWelcomeModes;
            FlowMode flowMode = getMoneyballDataSource().getFlowMode();
            b = C8576dqs.b((Iterable<? extends String>) set, flowMode != null ? flowMode.getMode() : null);
            if (!b) {
                return;
            }
        }
        fetchWelcomeMode();
        this.refreshWelcomeOnResume = false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.fragmentManager.unregisterFragmentLifecycleCallbacks(getSignupFragmentLifecycleLogger());
        if (isChangingConfigurations()) {
            return;
        }
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.InterfaceC1576aGk
    public void endRenderNavigationLevelSession(IClientLogging.CompletionReason completionReason, Status status) {
        C8632dsu.c((Object) completionReason, "");
        super.endRenderNavigationLevelSession(completionReason, status);
        if (this.nmTTRComplete) {
            return;
        }
        this.nmTTRComplete = true;
        Logger.INSTANCE.flush();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        int i = 2 % 2;
        int i2 = e + 123;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            C8632dsu.c((Object) c0051b, "");
            isProfileOnboarding();
            throw null;
        }
        C8632dsu.c((Object) c0051b, "");
        if (!isProfileOnboarding()) {
            c0051b.k(false).l(false).b(true).b(getLogoType());
            return;
        }
        NetflixActionBar.b.C0051b d = c0051b.k(true).l(true).c(ContextCompat.getColor(getApplicationContext(), C1030Lx.d.c)).g(false).b(NetflixActionBar.LogoType.b).b(false).e(false).d(true);
        String string = getString(R.string.profile_onboarding_actionbar_label);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = a + 45;
            e = i3 % 128;
            int i4 = i3 % 2;
        }
        d.e((CharSequence) string);
    }

    private final void initSavedBundleProps(Bundle bundle) {
        this.suppressNavigateToFlowMode = bundle != null ? Boolean.valueOf(bundle.getBoolean(KEY_SUPPRESS_NAVIGATE_ON_RESTORE)) : null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initProgressSpinner() {
        View findViewById = findViewById(R.id.loading_view);
        C8632dsu.a(findViewById, "");
        this.loading_view = findViewById;
        showProgressSpinner();
        View view = this.loading_view;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean initProgressSpinner$lambda$0;
                initProgressSpinner$lambda$0 = SignupNativeActivity.initProgressSpinner$lambda$0(view2, motionEvent);
                return initProgressSpinner$lambda$0;
            }
        });
    }

    private final void initWindow() {
        C8054ddD.d((Activity) this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.lifecycleRegistry;
        if (lifecycleRegistry == null) {
            LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
            this.lifecycleRegistry = lifecycleRegistry2;
            return lifecycleRegistry2;
        } else if (lifecycleRegistry == null) {
            C8632dsu.d("");
            return null;
        } else {
            return lifecycleRegistry;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onCreateOptionsMenu(Menu menu, Menu menu2) {
        int i = 2 % 2;
        C8632dsu.c((Object) menu, "");
        if (!shouldShowSkipMenu()) {
            if (isCurrentModeNullOrWelcome()) {
                addPrivacyMenuOption(menu);
                int i2 = e + 117;
                a = i2 % 128;
                int i3 = i2 % 2;
            }
            if (!isProfileOnboarding()) {
                int i4 = a + 35;
                e = i4 % 128;
                if (i4 % 2 == 0) {
                    NetflixActionBar netflixActionBar = getNetflixActionBar();
                    if (netflixActionBar != null) {
                        netflixActionBar.c(true, getLogoType());
                    }
                } else {
                    getNetflixActionBar();
                    throw null;
                }
            }
            addSignInSignOutMenu(menu);
            addDebugMenu(menu2);
            setupDogfoodingMenu();
            setTheme();
            if (!shouldApplyOnboardingTextTweaks()) {
                return;
            }
            int i5 = a + 81;
            e = i5 % 128;
            int i6 = i5 % 2;
            addNetflixSansFontToMenu(menu, this);
            if (i6 != 0) {
                int i7 = 17 / 0;
                return;
            }
            return;
        }
        int i8 = e + 93;
        a = i8 % 128;
        int i9 = i8 % 2;
        String string = getString(R.string.profile_onboarding_skip_label);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i10 = e + 3;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        menu.add(0, com.netflix.mediaclient.ui.R.g.fQ, 2, Html.fromHtml(string, 0)).setShowAsAction(2);
    }

    public final void setupDogfoodingMenu() {
        NetflixActionBar netflixActionBar;
        C1205Ss k;
        if (!C8206dfx.a() || (netflixActionBar = getNetflixActionBar()) == null || (k = netflixActionBar.k()) == null) {
            return;
        }
        k.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean z;
                z = SignupNativeActivity.setupDogfoodingMenu$lambda$3(SignupNativeActivity.this, view);
                return z;
            }
        });
    }

    private final void addSignInSignOutMenu(Menu menu) {
        SignInButtonInHeaderType value = getViewModel().getSignInButtonType().getValue();
        int i = value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1) {
            addSignInMenuItem(menu);
        } else if (i == 2 && !shouldApplyOnboardingTextTweaks()) {
            addSignOutMenuItem(menu);
        }
    }

    private final void addDebugMenu(final Menu menu) {
        if (menu != null) {
            Optional<SignUpDebugUtilities> signUpDebugUtilities = getSignUpDebugUtilities();
            final drM<SignUpDebugUtilities, dpR> drm = new drM<SignUpDebugUtilities, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$addDebugMenu$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(SignUpDebugUtilities signUpDebugUtilities2) {
                    invoke2(signUpDebugUtilities2);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(SignUpDebugUtilities signUpDebugUtilities2) {
                    C8632dsu.c((Object) signUpDebugUtilities2, "");
                    signUpDebugUtilities2.addJumpWithMockMenu(SignupNativeActivity.this, menu);
                }
            };
            signUpDebugUtilities.ifPresent(new Consumer() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SignupNativeActivity.addDebugMenu$lambda$4(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDebugMenu$lambda$4(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showHelpInMenu() {
        return !isProfileOnboarding();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1.startsWith("'!#+") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e + 79;
        com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0 = r1.substring(4);
        r1 = new java.lang.Object[1];
        d(r0, r1);
        r1 = ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        r0 = r1.substring(4);
        r1 = new java.lang.Object[1];
        d(r0, r1);
        ((java.lang.String) r1[0]).intern();
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        o.C8632dsu.d((java.lang.Object) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        r1 = getString(com.netflix.mediaclient.acquisition.R.string.signup_toolbar_help);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r1.startsWith("'!#+") == true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        r2 = new java.lang.Object[1];
        d(r1.substring(4), r2);
        r1 = ((java.lang.String) r2[0]).intern();
        r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a + 19;
        com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
        if ((r2 % 2) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
        r2 = 3 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        o.C8632dsu.d((java.lang.Object) r1);
        r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a + 17;
        com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (shouldApplyOnboardingTextTweaks() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (shouldApplyOnboardingTextTweaks() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e + 105;
        com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a = r1 % 128;
        r1 = r1 % 2;
        r1 = getString(com.netflix.mediaclient.ui.R.o.dO);
     */
    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getHelpMenuText() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e = r2
            int r1 = r1 % r0
            java.lang.String r2 = "'!#+"
            r3 = 4
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1d
            boolean r1 = r7.shouldApplyOnboardingTextTweaks()
            r6 = 38
            int r6 = r6 / r5
            if (r1 == 0) goto L6e
            goto L23
        L1d:
            boolean r1 = r7.shouldApplyOnboardingTextTweaks()
            if (r1 == 0) goto L6e
        L23:
            int r1 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e
            int r1 = r1 + 105
            int r6 = r1 % 128
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a = r6
            int r1 = r1 % r0
            int r1 = com.netflix.mediaclient.ui.R.o.dO
            java.lang.String r1 = r7.getString(r1)
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L6a
            int r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e
            int r2 = r2 + 79
            int r6 = r2 % 128
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L55
            java.lang.String r0 = r1.substring(r3)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r7.d(r0, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.intern()
            goto L6a
        L55:
            java.lang.String r0 = r1.substring(r3)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r7.d(r0, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            r0.intern()
            r0 = 0
            r0.hashCode()
            throw r0
        L6a:
            o.C8632dsu.d(r1)
            goto La5
        L6e:
            int r1 = com.netflix.mediaclient.acquisition.R.string.signup_toolbar_help
            java.lang.String r1 = r7.getString(r1)
            boolean r2 = r1.startsWith(r2)
            if (r2 == r4) goto L7b
            goto L99
        L7b:
            java.lang.String r1 = r1.substring(r3)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r7.d(r1, r2)
            r1 = r2[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a
            int r2 = r2 + 19
            int r3 = r2 % 128
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L99
            r2 = 3
            int r2 = r2 / r2
        L99:
            o.C8632dsu.d(r1)
            int r2 = com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.a
            int r2 = r2 + 17
            int r3 = r2 % 128
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.e = r3
            int r2 = r2 % r0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.getHelpMenuText():java.lang.String");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.signupPrompt;
    }

    private final boolean useDarkHeaderForCurrentFlow() {
        return isProfileOnboarding();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean userDarkHeaderForCurrentMode() {
        /*
            r2 = this;
            com.netflix.mediaclient.acquisition.screens.signupContainer.SignupViewModel r0 = r2.getViewModel()
            com.netflix.android.moneyball.FlowMode r0 = r0.getCurrentFlowMode()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.getMode()
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L46
            int r1 = r0.hashCode()
            switch(r1) {
                case -347704702: goto L3c;
                case 162353351: goto L2c;
                case 359153674: goto L23;
                case 1233099618: goto L1a;
                default: goto L19;
            }
        L19:
            goto L44
        L1a:
            java.lang.String r1 = "welcome"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            goto L46
        L23:
            java.lang.String r1 = "enterMemberCredentials"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L44
        L2c:
            java.lang.String r1 = "learnMoreConfirm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L44
        L35:
            o.aRS$e r0 = o.aRS.e
            boolean r0 = r0.d()
            goto L47
        L3c:
            java.lang.String r1 = "switchFlow"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
        L44:
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.userDarkHeaderForCurrentMode():boolean");
    }

    private final boolean shouldApplyOnboardingTextTweaks() {
        FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
        String flow = currentFlowMode != null ? currentFlowMode.getFlow() : null;
        return flow != null && C8632dsu.c((Object) SignupConstants.Flow.MOBILE_ONBOARDING, (Object) flow);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void setTheme() {
        Pair pair;
        final C1205Ss k;
        if (cVB.h(this) && userDarkHeaderForCurrentMode()) {
            pair = new Pair(Integer.valueOf(C9834xU.c.F), Integer.valueOf(C9834xU.c.I));
        } else if (shouldApplyOnboardingTextTweaks()) {
            pair = new Pair(Integer.valueOf(C9834xU.c.I), Integer.valueOf(C9834xU.c.m));
        } else if (useDarkHeaderForCurrentFlow()) {
            pair = new Pair(Integer.valueOf(C9834xU.c.b), Integer.valueOf(C9834xU.c.I));
        } else {
            pair = new Pair(Integer.valueOf(C9834xU.c.I), Integer.valueOf(C9834xU.c.b));
        }
        int intValue = ((Number) pair.b()).intValue();
        final int intValue2 = ((Number) pair.c()).intValue();
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null && (k = netflixActionBar.k()) != null) {
            k.setBackgroundResource(intValue);
            ViewTreeObserver viewTreeObserver = k.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$setTheme$1$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver2 = C1205Ss.this.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(this);
                        }
                        SignupNativeActivity signupNativeActivity = this;
                        C1205Ss c1205Ss = C1205Ss.this;
                        signupNativeActivity.setAllTextColor(c1205Ss, ContextCompat.getColor(c1205Ss.getContext(), intValue2));
                    }
                });
            }
        }
        if (shouldApplyOnboardingTextTweaks()) {
            setTheme(R.style.Theme_Signup_Native_NetflixSans_GlobalNav);
        } else {
            setTheme(com.netflix.mediaclient.ui.R.l.w);
        }
    }

    private final void addNetflixSansFontToMenu(Menu menu, Activity activity) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C8632dsu.a(item, "");
            addNetflixSansFontToMenuItem(item, activity);
        }
    }

    private final void addNetflixSansFontToMenuItem(MenuItem menuItem, Activity activity) {
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new C8145dep(C1336Xt.b(activity)), 0, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(C9834xU.a.T)), 0, spannableString.length(), 17);
        menuItem.setTitle(spannableString);
    }

    private final void hideActionBar() {
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null) {
            netflixActionBar.a(false);
        }
    }

    private final void showActionBar() {
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null) {
            netflixActionBar.c(false);
        }
    }

    public void setAllTextColor(View view, int i) {
        C8632dsu.c((Object) view, "");
        if (view instanceof ViewGroup) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                view2.setBackgroundResource(0);
                setAllTextColor(view2, i);
            }
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText() instanceof Spanned) {
                return;
            }
            textView.setTextColor(i);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$createManagerStatusListener$1
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                boolean z;
                C8632dsu.c((Object) serviceManager, "");
                C8632dsu.c((Object) status, "");
                SignupNativeActivity.this.updateCurrentAppLocale();
                if (C8054ddD.l(SignupNativeActivity.this)) {
                    return;
                }
                z = SignupNativeActivity.this.initializedFromPreviousInstance;
                if (z) {
                    return;
                }
                SignupNativeActivity.this.startNavigation();
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                C8632dsu.c((Object) status, "");
                if (C8054ddD.l(SignupNativeActivity.this)) {
                    return;
                }
                C1044Mm.d(SignupNativeActivity.TAG, "NetflixService is NOT available!");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentAppLocale() {
        Locale b = cVB.b(this);
        C1332Xp c1332Xp = C1332Xp.b;
        ((bXE) C1332Xp.b(bXE.class)).c(b);
        C4984bqG.b.b(this, new C8313dhy(b.toLanguageTag()));
    }

    private final void showInterruptDialog() {
        new AlertDialog.Builder(this, C9834xU.o.c).setMessage(R.string.signup_interrupt_by_user).setPositiveButton(R.string.button_yes, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SignupNativeActivity.showInterruptDialog$lambda$6(SignupNativeActivity.this, dialogInterface, i);
            }
        }).setNegativeButton(R.string.button_no, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SignupNativeActivity.showInterruptDialog$lambda$7(dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterruptDialog$lambda$6(SignupNativeActivity signupNativeActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) signupNativeActivity, "");
        signupNativeActivity.exitFlow();
    }

    private final void exitFlow() {
        FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
        if (C8632dsu.c((Object) (currentFlowMode != null ? currentFlowMode.getFlow() : null), (Object) SignupConstants.Flow.MOBILE_ONBOARDING)) {
            launchProfilesGate();
        } else {
            launchWelcome$default(this, false, 1, null);
        }
    }

    public static /* synthetic */ void launchWelcome$default(SignupNativeActivity signupNativeActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchWelcome");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        signupNativeActivity.launchWelcome(z);
    }

    public final void launchWelcome(boolean z) {
        this.openTrayOnWelcome = z;
        fetchMode("welcome");
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        handleBackPressed();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        int hashCode;
        SignupFragment currentFragment = getCurrentFragment();
        if (currentFragment == null || !currentFragment.handleBackInFragment()) {
            FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
            String mode = currentFlowMode != null ? currentFlowMode.getMode() : null;
            if (mode != null && ((hashCode = mode.hashCode()) == -225774825 ? mode.equals("welcomeBackConfirm") : hashCode == 162353351 ? mode.equals("learnMoreConfirm") : hashCode == 1233099618 && mode.equals("welcome"))) {
                SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
                return false;
            }
            SignupFragment currentFragment2 = getCurrentFragment();
            if (currentFragment2 != null) {
                int i = WhenMappings.$EnumSwitchMapping$1[currentFragment2.backBehavior().ordinal()];
                if (i == 1) {
                    this.fragmentManager.popBackStack();
                } else if (i == 2) {
                    showInterruptDialog();
                } else if (i == 3) {
                    goBackToPreviousMode();
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void fetchMode(final String str) {
        C8632dsu.c((Object) str, "");
        getSignupNetworkManager().performModeRequest(str, new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$fetchMode$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
            }

            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onAfterNetworkAction(Response response) {
                C8632dsu.c((Object) response, "");
                boolean c = C8632dsu.c((Object) str, (Object) "welcome");
                if (c) {
                    this.openFormerMemberTray(SignupConstants.Flow.MOBILE_SIGNUP, "planSelectionAndConfirm");
                }
                if (response.isValidState()) {
                    return;
                }
                ErrorDialogHelper.showError$default(this.getErrorDialogHelper(), response.getStatus(), 0, c ? new SignupNativeActivity$fetchMode$1$onAfterNetworkAction$1(this.getErrorDialogHelper()) : new SignupNativeActivity$fetchMode$1$onAfterNetworkAction$2(this.getErrorDialogHelper()), (drO) null, 10, (Object) null);
                if (c) {
                    this.endRenderNavigationLevelSession(IClientLogging.CompletionReason.failed, response.getStatus());
                }
            }
        });
    }

    public final void fetchFlowAndMode(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        aMU r = getServiceManager().r();
        if (r != null) {
            r.c(str, str2, new aMX() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda0
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    SignupNativeActivity.fetchFlowAndMode$lambda$9(SignupNativeActivity.this, str, str2, moneyballData, status, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchFlowAndMode$lambda$9(final SignupNativeActivity signupNativeActivity, final String str, final String str2, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNativeActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) status, "");
        if (status.j()) {
            if ((moneyballData != null ? moneyballData.getFlowMode() : null) != null) {
                signupNativeActivity.getMoneyballDataSource().getLiveMoneyballData().setValue(moneyballData);
                return;
            }
        }
        signupNativeActivity.showProgressSpinner();
        signupNativeActivity.getErrorDialogHelper().showError(status, C9834xU.h.f, new drO<dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$fetchFlowAndMode$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SignupNativeActivity.this.fetchFlowAndMode(str, str2);
            }
        }, new SignupNativeActivity$fetchFlowAndMode$1$2(signupNativeActivity.getErrorDialogHelper()));
    }

    public final void checkEmptyFlowMode() {
        if (getCurrentFragment() == null || getMoneyballDataSource().getFlowMode() != null) {
            return;
        }
        finish();
        startActivity(cVB.d(this));
    }

    private final void initSignupHeaderObserver() {
        getViewModel().getSignInButtonType().observe(this, new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SignupNativeActivity.initSignupHeaderObserver$lambda$10(SignupNativeActivity.this, (SignInButtonInHeaderType) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSignupHeaderObserver$lambda$10(SignupNativeActivity signupNativeActivity, SignInButtonInHeaderType signInButtonInHeaderType) {
        C8632dsu.c((Object) signupNativeActivity, "");
        signupNativeActivity.invalidateOptionsMenu();
    }

    private final boolean isCurrentModeNullOrWelcome() {
        if (getViewModel().getCurrentFlowMode() != null) {
            FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
            if (!C8632dsu.c((Object) (currentFlowMode != null ? currentFlowMode.getMode() : null), (Object) "welcome")) {
                return false;
            }
        }
        return true;
    }

    private final NetflixActionBar.LogoType getLogoType() {
        FlowMode flowMode = getMoneyballDataSource().getFlowMode();
        String mode = flowMode != null ? flowMode.getMode() : null;
        if ((isCurrentModeNullOrWelcome() && !C8150deu.h() && showMenuAlwaysForLocale()) || C8632dsu.c((Object) mode, (Object) SignupConstants.Mode.NON_MEMBER_HOME) || (C8632dsu.c((Object) mode, (Object) "learnMoreConfirm") && aRS.e.d())) {
            return NetflixActionBar.LogoType.e;
        }
        return NetflixActionBar.LogoType.a;
    }

    private final void initViewModelObserver() {
        getMoneyballDataSource().getLiveMoneyballData().observe(this, new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda10
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SignupNativeActivity.initViewModelObserver$lambda$13(SignupNativeActivity.this, (MoneyballData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewModelObserver$lambda$13(final SignupNativeActivity signupNativeActivity, MoneyballData moneyballData) {
        FlowMode flowMode;
        String mode;
        FlowMode flowMode2;
        C8632dsu.c((Object) signupNativeActivity, "");
        if (signupNativeActivity.isCurrentMember(moneyballData)) {
            if (signupNativeActivity.getMemberRejoin().d().d()) {
                Observable<cQQ.e> o2 = signupNativeActivity.userAgentRepository.o();
                AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(signupNativeActivity, Lifecycle.Event.ON_DESTROY);
                C8632dsu.a(a2, "");
                Object as = o2.as(AutoDispose.b(a2));
                C8632dsu.b(as, "");
                C9725vn.a((ObservableSubscribeProxy) as, null, null, new drM<cQQ.e, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$initViewModelObserver$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(cQQ.e eVar) {
                        invoke2(eVar);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(cQQ.e eVar) {
                        C8632dsu.c((Object) eVar, "");
                        SignupNativeActivity.this.getMemberRejoin().d().b();
                    }
                }, 3, null);
            }
            signupNativeActivity.setResult(MP.e);
        }
        if (moneyballData != null && (flowMode2 = moneyballData.getFlowMode()) != null) {
            signupNativeActivity.setAbAllocationsInRam(flowMode2);
        }
        if (C8632dsu.c(signupNativeActivity.suppressNavigateToFlowMode, Boolean.TRUE) && signupNativeActivity.getCurrentFragment() != null) {
            signupNativeActivity.updateBackground(null);
            signupNativeActivity.suppressNavigateToFlowMode = Boolean.FALSE;
            if ((moneyballData != null ? moneyballData.getFlowMode() : null) != null) {
                signupNativeActivity.hideProgressSpinner(false);
            }
        } else {
            signupNativeActivity.suppressNavigateToFlowMode = Boolean.FALSE;
            if (moneyballData != null && (flowMode = moneyballData.getFlowMode()) != null) {
                SignupFlowModeStackManager signupFlowModeStackManager = SignupFlowModeStackManager.INSTANCE;
                FlowMode confirmFlowMode = signupFlowModeStackManager.confirmFlowMode(flowMode);
                signupNativeActivity.navigateToFlowMode(confirmFlowMode, signupFlowModeStackManager.isUserGoingBack(confirmFlowMode));
            }
        }
        if (moneyballData == null || (mode = moneyballData.getMode()) == null || !SignupMode.INSTANCE.isWelcomeMode(mode)) {
            return;
        }
        signupNativeActivity.getMoneyballDataSource().setFormCache(new FormCacheImpl());
    }

    private final boolean isCurrentMember(MoneyballData moneyballData) {
        boolean z;
        AUIContextData contextData;
        FlowMode flowMode;
        String str = null;
        if (moneyballData == null || (flowMode = moneyballData.getFlowMode()) == null) {
            z = false;
        } else {
            getSignupErrorReporter();
            Field field = flowMode.getField(SignupConstants.Field.RECOGNIZED_CURRENT_MEMBER);
            Object value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof Boolean)) {
                value = null;
            }
            z = C8632dsu.c(value, Boolean.TRUE);
        }
        if (moneyballData != null && (contextData = moneyballData.getContextData()) != null) {
            str = contextData.getMembershipStatus();
        }
        return z || C8632dsu.c((Object) str, (Object) SignupConstants.MemberStatus.CURRENT_MEMBER);
    }

    private final void setAbAllocationsInRam(FlowMode flowMode) {
        List j;
        Context context = (Context) C1332Xp.b(Context.class);
        j = C8569dql.j("fields", "abAllocations");
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) flowMode.getData(), (List<String>) j);
        ArrayList arrayList = pathValue instanceof ArrayList ? (ArrayList) pathValue : null;
        final ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                Object obj = map.get("testId");
                Number number = obj instanceof Number ? (Number) obj : null;
                Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                Object obj2 = map.get("cellId");
                Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
                C9726vo.d(valueOf, number2 != null ? Integer.valueOf(number2.intValue()) : null, new drX<Integer, Integer, Boolean>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$setAbAllocationsInRam$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ Boolean invoke(Integer num, Integer num2) {
                        return invoke(num.intValue(), num2.intValue());
                    }

                    public final Boolean invoke(int i, int i2) {
                        SignInConfigData.NmAbConfig nmAbConfig = new SignInConfigData.NmAbConfig();
                        nmAbConfig.testId = i;
                        nmAbConfig.cellId = i2;
                        return Boolean.valueOf(arrayList2.add(nmAbConfig));
                    }
                });
            }
        }
        C1823aPo.d(context, arrayList2);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(KEY_SUPPRESS_NAVIGATE_ON_RESTORE, true);
    }

    static /* synthetic */ void navigateToFlowMode$default(SignupNativeActivity signupNativeActivity, FlowMode flowMode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToFlowMode");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        signupNativeActivity.navigateToFlowMode(flowMode, z);
    }

    private final void navigateToFlowMode(FlowMode flowMode, boolean z) {
        if (flowMode != null) {
            hideProgressSpinner$default(this, false, 1, null);
            SignupMode signupMode = SignupMode.INSTANCE;
            if (!signupMode.isSwitchFlowMode(flowMode.getMode())) {
                setTheme();
                getViewModel().updateSignInButtonInHeader(flowMode);
            }
            SignupFragment nextFragment = getNextFragment(flowMode);
            if (nextFragment != null) {
                launchFragment(nextFragment, z, flowMode);
            } else if (signupMode.isErrorMode(flowMode.getMode())) {
                onErrorMode();
            } else if (signupMode.isLoginMode(flowMode.getMode())) {
                launchLoginActivity(flowMode);
            } else if (signupMode.isMemberMode(flowMode.getMode())) {
                launchToMemberHome(true);
            } else if (signupMode.isNonMemberMode(flowMode.getMode())) {
                launchToNonMemberHome();
            } else if (signupMode.isRedirectToBrowserMode(flowMode.getMode())) {
                onRedirectToBrowserMode(flowMode);
            } else if (signupMode.isPlanSelectionAndConfirmMode(flowMode.getMode())) {
                launchWelcome(true);
            } else if (signupMode.isSwitchFlowMode(flowMode.getMode())) {
                launchSwitchFlowMode(flowMode);
            } else if (signupMode.isSignupSimplicityFlow(flowMode.getFlow())) {
                launchSimplicityWebFlow(flowMode);
            } else if (signupMode.isMemberSimplicityFlow(flowMode.getFlow())) {
                launchSimplicityWebFlow(flowMode);
            } else {
                onSignUpUnknownMode(flowMode.getFlow(), flowMode.getMode());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onRedirectToBrowserMode(com.netflix.android.moneyball.FlowMode r6) {
        /*
            r5 = this;
            java.lang.String r0 = o.aIJ.a(r5)
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r1 = r5.getSignupErrorReporter()
            java.lang.String r2 = "redirectPath"
            com.netflix.android.moneyball.fields.Field r6 = r6.getField(r2)
            r3 = 0
            if (r6 == 0) goto L16
            java.lang.Object r6 = r6.getValue()
            goto L17
        L16:
            r6 = r3
        L17:
            if (r6 != 0) goto L1c
            java.lang.String r6 = "SignupNativeFieldError"
            goto L22
        L1c:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 != 0) goto L26
            java.lang.String r6 = "SignupNativeDataManipulationError"
        L22:
            r1.onDataError(r6, r2, r3)
            goto L27
        L26:
            r3 = r6
        L27:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.decodeUrl(r6)
            o.deS r0 = new o.deS
            r0.<init>(r5, r6)
            android.os.Handler r6 = r5.handler
            if (r6 == 0) goto L48
            r6.post(r0)
        L48:
            r6 = 1
            r5.refreshWelcomeOnResume = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.onRedirectToBrowserMode(com.netflix.android.moneyball.FlowMode):void");
    }

    private final String decodeUrl(String str) {
        Map d;
        Map k;
        Throwable th;
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C8632dsu.a(decode, "");
            return decode;
        } catch (UnsupportedEncodingException e2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("URL decoding exception should not happen", e2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return str;
        }
    }

    private final void onErrorMode() {
        C1044Mm.e(TAG, "Show onErrorMode dialog");
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        ErrorDialogHelper.showError$default(getErrorDialogHelper(), R.string.generic_retryable_failure, new SignupNativeActivity$onErrorMode$1(getErrorDialogHelper()), null, 4, null);
    }

    private final void onSignUpUnknownMode(String str, String str2) {
        C1044Mm.e(TAG, "Show UnknownMode error dialog: " + str + "." + str2);
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        ErrorDialogHelper.showError$default(getErrorDialogHelper(), R.string.generic_retryable_failure, new SignupNativeActivity$onSignUpUnknownMode$1(getErrorDialogHelper()), null, 4, null);
        SignupErrorReporter signupErrorReporter = getSignupErrorReporter();
        SignupErrorReporter.onDataError$default(signupErrorReporter, SignupConstants.Error.UNKNOWN_MODE, str + "." + str2, null, 4, null);
    }

    private final SignupFragment getNextFragment(FlowMode flowMode) {
        SignupFragment mapToFragment = SignupMode.INSTANCE.mapToFragment(flowMode, this);
        if (mapToFragment != null) {
            InterfaceC8660dtv a2 = dsA.a(mapToFragment.getClass());
            SignupFragment currentFragment = getCurrentFragment();
            if (C8632dsu.c(a2, currentFragment != null ? dsA.a(currentFragment.getClass()) : null) && (mapToFragment instanceof Refreshable)) {
                mapToFragment = getCurrentFragment();
            }
        } else {
            mapToFragment = null;
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.x()) {
            if ((mapToFragment != null ? mapToFragment.getAppView() : null) == AppView.secondaryLanguagesSelector) {
                updateNavigationLevelSecondaryLanguagesEnabled(mapToFragment.getAppView(), flowMode);
                return mapToFragment;
            }
        }
        updateNavigationLevel(mapToFragment != null ? mapToFragment.getAppView() : null);
        return mapToFragment;
    }

    private final void updateNavigationLevel(AppView appView) {
        Long l = this.lastNavigationSessionId;
        if (l != null) {
            l.longValue();
            Logger.INSTANCE.endSession(this.lastNavigationSessionId);
        }
        this.lastNavigationSessionId = appView != null ? Logger.INSTANCE.startSession(new NavigationLevel(appView, null)) : null;
    }

    private final void updateNavigationLevelSecondaryLanguagesEnabled(AppView appView, FlowMode flowMode) {
        Long l;
        Long l2 = this.lastNavigationSessionId;
        if (l2 != null) {
            l2.longValue();
            Logger.INSTANCE.endSession(this.lastNavigationSessionId);
        }
        if (appView != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mode", flowMode.getMode());
            jSONObject.put("flow", flowMode.getFlow());
            l = Logger.INSTANCE.startSession(new NavigationLevel(appView, C1281Vq.d(jSONObject)));
        } else {
            l = null;
        }
        this.lastNavigationSessionId = l;
    }

    private final void launchSwitchFlowMode(FlowMode flowMode) {
        Map d;
        Map k;
        Throwable th;
        getSignupErrorReporter();
        String str = SignupConstants.Field.TARGET_FLOW;
        Field field = flowMode.getField(SignupConstants.Field.TARGET_FLOW);
        String str2 = null;
        Object value = field != null ? field.getValue() : null;
        if (value == null || !(value instanceof String)) {
            value = null;
        }
        String str3 = (String) value;
        getSignupErrorReporter();
        Field field2 = flowMode.getField(SignupConstants.Field.TARGET_MODE);
        Object value2 = field2 != null ? field2.getValue() : null;
        if (value2 == null || !(value2 instanceof String)) {
            value2 = null;
        }
        String str4 = (String) value2;
        getSignupErrorReporter();
        Field field3 = flowMode.getField(SignupConstants.Field.TARGET_NETFLIX_CLIENT_PLATFORM);
        Object value3 = field3 != null ? field3.getValue() : null;
        if (value3 != null && (value3 instanceof String)) {
            str2 = value3;
        }
        String str5 = str2;
        if (str3 == null || str4 == null) {
            if (str3 != null) {
                str = SignupConstants.Field.TARGET_MODE;
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Android Signup Native activity: Switch flow did not provide a " + str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            ErrorDialogHelper.showError$default(getErrorDialogHelper(), R.string.generic_retryable_failure, new SignupNativeActivity$launchSwitchFlowMode$1(getErrorDialogHelper()), null, 4, null);
            return;
        }
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        if (!C8632dsu.c((Object) str5, (Object) SignupConstants.AndroidPlatform.ANDROID_WEBVIEW)) {
            SignupMode signupMode = SignupMode.INSTANCE;
            if (!signupMode.isSignupSimplicityFlow(str3) && !signupMode.isMemberSimplicityFlow(str3)) {
                if (signupMode.isMemberMode(str4)) {
                    launchProfilesGate();
                    return;
                } else {
                    fetchFlowAndMode(str3, str4);
                    return;
                }
            }
        }
        handoffToWebview(str3, str4);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiNavigationListener
    public void handoffToWebview(String str) {
        C8632dsu.c((Object) str, "");
        handoffToWebview(SignupConstants.Flow.SIGNUP_SIMPLICITY, str);
    }

    public static /* synthetic */ void handoffToWebview$default(SignupNativeActivity signupNativeActivity, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handoffToWebview");
        }
        if ((i & 1) != 0) {
            str = SignupConstants.Flow.SIGNUP_SIMPLICITY;
        }
        signupNativeActivity.handoffToWebview(str, str2);
    }

    public final void handoffToWebview(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Intent putExtra = SignupActivity.createShowIntent(this).addFlags(268468224).putExtra("nextUrl", SignupViewModel.Companion.getShaktiInboundUrl(str, str2));
        C8632dsu.a(putExtra, "");
        if (C8632dsu.c((Object) str2, (Object) "welcome")) {
            putExtra.putExtra(SignupActivity.EXTRA_USE_DARK_BACKGROUND, true);
        }
        startActivity(putExtra);
        finish();
    }

    static /* synthetic */ void logAndLaunchFragment$default(SignupNativeActivity signupNativeActivity, SignupFragment signupFragment, boolean z, FlowMode flowMode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logAndLaunchFragment");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        signupNativeActivity.logAndLaunchFragment(signupFragment, z, flowMode);
    }

    private final void logAndLaunchFragment(SignupFragment signupFragment, boolean z, FlowMode flowMode) {
        updateNavigationLevel(signupFragment.getAppView());
        launchFragment(signupFragment, z, flowMode);
    }

    static /* synthetic */ void launchFragment$default(SignupNativeActivity signupNativeActivity, Fragment fragment, boolean z, FlowMode flowMode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchFragment");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        signupNativeActivity.launchFragment(fragment, z, flowMode);
    }

    private final void launchFragment(Fragment fragment, boolean z, FlowMode flowMode) {
        Pair pair;
        if (C8632dsu.c(fragment, getCurrentFragment()) && (getCurrentFragment() instanceof Refreshable)) {
            SignupFragment currentFragment = getCurrentFragment();
            Refreshable refreshable = currentFragment instanceof Refreshable ? (Refreshable) currentFragment : null;
            if (refreshable != null) {
                refreshable.onMoneyballDataRefreshed(getMoneyballDataSource().getLiveMoneyballData().getValue());
                return;
            }
            return;
        }
        SignupFlowModeStackManager.INSTANCE.updateFlowModes(flowMode);
        SignupFragment signupFragment = fragment instanceof SignupFragment ? (SignupFragment) fragment : null;
        boolean z2 = signupFragment != null && signupFragment.backBehavior() == SignupBackType.NORMAL_BACK;
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        C8632dsu.a(beginTransaction, "");
        updateBackground(signupFragment);
        if (getCurrentFragment() != null) {
            if (z) {
                pair = new Pair(Integer.valueOf(R.anim.aui_slide_in_left), Integer.valueOf(R.anim.aui_slide_out_right));
            } else {
                pair = new Pair(Integer.valueOf(R.anim.aui_slide_in_right), Integer.valueOf(R.anim.aui_slide_out_left));
            }
            beginTransaction.setCustomAnimations(((Number) pair.b()).intValue(), ((Number) pair.c()).intValue());
        } else {
            beginTransaction.setTransition(4097);
        }
        beginTransaction.replace(R.id.signup_fragment_container, fragment, fragment.getClass().getSimpleName());
        if (z2) {
            beginTransaction.addToBackStack(fragment.getClass().getName());
        }
        beginTransaction.commitAllowingStateLoss();
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenResumed(new SignupNativeActivity$launchFragment$1(fragment, null));
    }

    private final void updateBackground(SignupFragment signupFragment) {
        int fragmentPreferredBackgroundColorRes = getFragmentPreferredBackgroundColorRes(signupFragment);
        getWindow().setBackgroundDrawableResource(fragmentPreferredBackgroundColorRes);
        getSignup_activity_content().setBackgroundResource(fragmentPreferredBackgroundColorRes);
    }

    static /* synthetic */ int getFragmentPreferredBackgroundColorRes$default(SignupNativeActivity signupNativeActivity, SignupFragment signupFragment, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                signupFragment = null;
            }
            return signupNativeActivity.getFragmentPreferredBackgroundColorRes(signupFragment);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFragmentPreferredBackgroundColorRes");
    }

    private final int getFragmentPreferredBackgroundColorRes(SignupFragment signupFragment) {
        SignupFragment currentFragment = getCurrentFragment();
        return currentFragment != null ? currentFragment.getTransitioningBackgroundColorRes() : signupFragment != null ? signupFragment.getTransitioningBackgroundColorRes() : com.netflix.mediaclient.ui.R.c.s;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public MenuItem getHelpMenuItem(Menu menu) {
        C8632dsu.c((Object) menu, "");
        MenuItem add = menu.add(0, com.netflix.mediaclient.ui.R.g.dE, 3, getHelpMenuText());
        add.setShowAsAction(1);
        C8632dsu.d(add);
        return add;
    }

    private final void addSignInMenuItem(Menu menu) {
        int i = 2 % 2;
        int i2 = a + 85;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            getString(R.string.signup_toolbar_log_in).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = getString(R.string.signup_toolbar_log_in);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = e + 13;
            a = i3 % 128;
            int i4 = i3 % 2;
        }
        C8632dsu.a(string, "");
        menu.add(0, com.netflix.mediaclient.ui.R.g.dI, 5, string).setShowAsAction(2);
    }

    private final void signOut() {
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        updateNavigationLevel(null);
        startActivity(this.loginApi.get().e(this));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiNavigationListener
    public void prefetchCtaClick(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        getMemberRejoin().a(str, str2);
        openFormerMemberTray(str, str2);
    }

    public final void openFormerMemberTray(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (this.openTrayOnWelcome) {
            this.openTrayOnWelcome = false;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SignupNativeActivity.openFormerMemberTray$lambda$23(SignupNativeActivity.this, str, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openFormerMemberTray$lambda$23(SignupNativeActivity signupNativeActivity, String str, String str2) {
        C8632dsu.c((Object) signupNativeActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        signupNativeActivity.getMemberRejoin().d(str, str2, signupNativeActivity);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiNavigationListener
    public void restartCtaClicked(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.restartMembershipButton, null, CommandValue.RestartMembershipCommand, null));
        if (SignupMode.INSTANCE.isPlanSelectionAndConfirmMode(str2)) {
            getMemberRejoin().d(str, str2, this);
        } else {
            fetchFlowAndMode(str, str2);
        }
    }

    public void navigate(FlowMode flowMode) {
        C8632dsu.c((Object) flowMode, "");
        navigateToFlowMode(flowMode, false);
    }

    private final void addSignOutMenuItem(Menu menu) {
        int i = 2 % 2;
        int i2 = com.netflix.mediaclient.ui.R.g.dG;
        String string = getString(R.string.signup_toolbar_sign_out);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = a + 91;
            e = i3 % 128;
            int i4 = i3 % 2;
        }
        menu.add(0, i2, 5, string).setShowAsAction(2);
        int i5 = a + 89;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
    }

    private final void addPrivacyMenuOption(Menu menu) {
        int i = 2 % 2;
        int i2 = com.netflix.mediaclient.ui.R.g.dK;
        String string = getString(R.string.signup_toolbar_privacy);
        if (string.startsWith("'!#+")) {
            int i3 = e + 35;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                d(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            d(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        MenuItem add = menu.add(0, i2, 2, string);
        if (!showMenuAlwaysForLocale()) {
            add.setShowAsAction(1);
            return;
        }
        int i4 = e + 73;
        a = i4 % 128;
        int i5 = i4 % 2;
        add.setShowAsAction(2);
        int i6 = a + 121;
        e = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        C8632dsu.c((Object) menuItem, "");
        CharSequence title = menuItem.getTitle();
        C1044Mm.e(TAG, "User tapped " + ((Object) title));
        int itemId = menuItem.getItemId();
        if (itemId == com.netflix.mediaclient.ui.R.g.dK) {
            int i2 = a + 113;
            e = i2 % 128;
            int i3 = i2 % 2;
            String string = getString(C8096ddt.e.d);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                d(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            C8632dsu.a(string, "");
            openUrl(string);
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.dG) {
            signOut();
            int i4 = a + 7;
            e = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.dI) {
            CLv2Utils.d(new SignInCommand());
            startActivity(this.loginApi.get().c(this));
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    private final void openUrl(String str) {
        Intent data = new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(this, str));
        C8632dsu.a(data, "");
        data.addFlags(268435456);
        if (data.resolveActivity(getPackageManager()) != null) {
            startActivity(data);
            return;
        }
        C1044Mm.d(TAG, "Unable to open browser");
        C8054ddD.c(this, com.netflix.mediaclient.ui.R.o.an, 0);
    }

    private final boolean showMenuAlwaysForLocale() {
        C8313dhy e2 = C4984bqG.b.e(this);
        return C8632dsu.c((Object) e2.b(), (Object) SignupConstants.Language.SPANISH_ES) || C8632dsu.c((Object) e2.b(), (Object) SignupConstants.Language.ENGLISH_EN);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Uri data;
        Uri data2;
        super.onNewIntent(intent);
        String str = null;
        if ((intent != null ? intent.getStringExtra("extra_mode") : null) != null && intent.getStringExtra("extra_flow") != null) {
            startNavigation();
            return;
        }
        if (C8632dsu.c((Object) ((intent == null || (data2 = intent.getData()) == null) ? null : data2.getLastPathSegment()), (Object) SignupConstants.DeepLink.CONFIRM_PAGE_SIGN_OUT)) {
            this.loginApi.get().d(this);
            return;
        }
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getLastPathSegment();
        }
        if (C8632dsu.c((Object) str, (Object) SignupConstants.DeepLink.LOGIN_FROM_REGISTRATION)) {
            startActivity(this.loginApi.get().c(this));
        }
    }

    @Override // com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        C8632dsu.c((Object) intent, "");
        super.startActivity(intent, bundle);
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.aui_slide_in_right, R.anim.aui_slide_out_left);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void replaceLoadingScreenAb30210() {
        FrameLayout signup_activity_content = getSignup_activity_content();
        View view = this.loading_view;
        View view2 = null;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        int indexOfChild = signup_activity_content.indexOfChild(view);
        OnboardingLoadingView onboardingLoadingView = new OnboardingLoadingView(this, null, 0, 6, null);
        onboardingLoadingView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        View view3 = this.loading_view;
        if (view3 == null) {
            C8632dsu.d("");
            view3 = null;
        }
        onboardingLoadingView.setId(view3.getId());
        View view4 = this.loading_view;
        if (view4 == null) {
            C8632dsu.d("");
            view4 = null;
        }
        onboardingLoadingView.setVisibility(view4.getVisibility());
        this.loading_view = onboardingLoadingView;
        FrameLayout signup_activity_content2 = getSignup_activity_content();
        View view5 = this.loading_view;
        if (view5 == null) {
            C8632dsu.d("");
        } else {
            view2 = view5;
        }
        signup_activity_content2.removeView(view2);
        getSignup_activity_content().addView(onboardingLoadingView, indexOfChild);
        onboardingLoadingView.setOnTouchListener(new View.OnTouchListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view6, MotionEvent motionEvent) {
                boolean replaceLoadingScreenAb30210$lambda$24;
                replaceLoadingScreenAb30210$lambda$24 = SignupNativeActivity.replaceLoadingScreenAb30210$lambda$24(view6, motionEvent);
                return replaceLoadingScreenAb30210$lambda$24;
            }
        });
    }

    public final void showProgressSpinner() {
        View view = this.loading_view;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        if (view.getVisibility() == 0) {
            return;
        }
        View view2 = this.loading_view;
        if (view2 == null) {
            C8632dsu.d("");
            view2 = null;
        }
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        if (!(view2 instanceof OnboardingLoadingView)) {
            view2.setBackgroundResource(getFragmentPreferredBackgroundColorRes$default(this, null, 1, null));
        }
        view2.animate().setStartDelay(250L).alpha(1.0f).setDuration(250L).setListener(null);
    }

    public static /* synthetic */ void hideProgressSpinner$default(SignupNativeActivity signupNativeActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideProgressSpinner");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        signupNativeActivity.hideProgressSpinner(z);
    }

    public final void hideProgressSpinner(boolean z) {
        View view = this.loading_view;
        final View view2 = null;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        if (view.getVisibility() == 8) {
            return;
        }
        if (z) {
            View view3 = this.loading_view;
            if (view3 == null) {
                C8632dsu.d("");
            } else {
                view2 = view3;
            }
            view2.animate().setStartDelay(250L).alpha(0.0f).setDuration(250L).setListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$hideProgressSpinner$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C8632dsu.c((Object) animator, "");
                    super.onAnimationEnd(animator);
                    view2.setVisibility(8);
                }
            });
            return;
        }
        View view4 = this.loading_view;
        if (view4 == null) {
            C8632dsu.d("");
        } else {
            view2 = view4;
        }
        view2.setVisibility(8);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public ContextWrapper wrapContextLocale(Context context) {
        C8632dsu.c((Object) context, "");
        ContextWrapper e2 = C8310dhv.e(context, cVB.b(context));
        C8632dsu.a(e2, "");
        return e2;
    }

    private final void launchToMemberHome(boolean z) {
        UserAgent userAgent;
        if (isProfileOnboarding()) {
            if (z && (userAgent = getUserAgent()) != null) {
                userAgent.a((InterfaceC5018bqo) null);
            }
            launchHomeLolomo(z);
            return;
        }
        launchProfilesGate();
    }

    private final void launchToNonMemberHome() {
        if (this.loggingIn) {
            return;
        }
        showProgressSpinner();
        this.loggingIn = true;
        Long l = this.lastNavigationSessionId;
        if (l != null) {
            l.longValue();
            Logger.INSTANCE.endSession(this.lastNavigationSessionId);
        }
        loginObservable(new drM<Status, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$launchToNonMemberHome$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Status status) {
                invoke2(status);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Status status) {
                C8632dsu.c((Object) status, "");
                SignupNativeActivity.this.setLoggingIn(false);
                if (status.j()) {
                    SignupNativeActivity.this.startActivity(SignupNativeActivity.this.getNonMemberNavigation().d());
                }
            }
        });
    }

    private final void launchHomeLolomo(boolean z) {
        Long l = this.lastNavigationSessionId;
        if (l != null) {
            l.longValue();
            Logger.INSTANCE.endSession(this.lastNavigationSessionId);
        }
        C4987bqJ.d().onNext(Boolean.valueOf(z));
        finish();
    }

    private final void launchProfilesGate() {
        Observable<Status> b;
        if (this.loggingIn) {
            return;
        }
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        showProgressSpinner();
        this.loggingIn = true;
        Long l = this.lastNavigationSessionId;
        if (l != null) {
            l.longValue();
            Logger.INSTANCE.endSession(this.lastNavigationSessionId);
        }
        UserCookies e2 = C8284dhV.e(isTestStack(this));
        if (e2.isValid()) {
            b = this.userAgentRepository.l();
        } else {
            b = this.userAgentRepository.b(new C1569aGd(e2.netflixId, e2.secureNetflixId));
        }
        Observable<Status> observeOn = b.observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = observeOn.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.a((ObservableSubscribeProxy) as, null, null, new drM<Status, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$launchProfilesGate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Status status) {
                invoke2(status);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Status status) {
                Map k;
                Throwable th;
                SignupNativeActivity.this.setLoggingIn(false);
                if (status != null && status.j()) {
                    SignupNativeActivity signupNativeActivity = SignupNativeActivity.this;
                    signupNativeActivity.startActivity(HomeActivity.d((Context) signupNativeActivity, signupNativeActivity.getUiScreen(), false));
                } else {
                    StatusCode c = status.c();
                    if (c == null || !c.isNetworkError()) {
                        String obj = status.toString();
                        String a3 = C8128deY.a(status);
                        if (a3 != null) {
                            obj = ((Object) obj) + " (code: " + a3 + ")";
                        }
                        String d = C8128deY.d(status);
                        if (d != null) {
                            obj = ((Object) obj) + " (message: " + d + ")";
                        }
                        if (status.e() != null) {
                            obj = ((Object) obj) + " caused by: " + status.e();
                        }
                        String str = obj;
                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                        Throwable e3 = status.e();
                        if (e3 == null) {
                            e3 = new Exception(status.b());
                        }
                        k = dqE.k(new LinkedHashMap());
                        C1596aHd c1596aHd = new C1596aHd(str, e3, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType.c() + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th = new Throwable(c1596aHd.b());
                        } else {
                            th = c1596aHd.i;
                            if (th == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1597aHe c2 = dVar2.c();
                        if (c2 != null) {
                            c2.d(c1596aHd, th);
                        } else {
                            dVar2.e().b(c1596aHd, th);
                        }
                    }
                }
                SignupNativeActivity.this.finish();
            }
        }, 3, null);
    }

    private final void loginObservable(final drM<? super Status, dpR> drm) {
        Observable<Status> b;
        UserCookies e2 = C8284dhV.e(isTestStack(this));
        if (e2.isValid()) {
            b = this.userAgentRepository.l();
        } else {
            b = this.userAgentRepository.b(new C1569aGd(e2.netflixId, e2.secureNetflixId));
        }
        Observable<Status> observeOn = b.observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = observeOn.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.a((ObservableSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$loginObservable$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("Error has occurred while attempting to login", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th2);
                } else {
                    dVar2.e().b(c1596aHd, th2);
                }
            }
        }, null, new drM<Status, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$loginObservable$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Status status) {
                invoke2(status);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Status status) {
                Map k;
                Throwable th;
                if (!status.j() && !status.c().isNetworkError()) {
                    String obj = status.toString();
                    String a3 = C8128deY.a(status);
                    if (a3 != null) {
                        obj = ((Object) obj) + " (code: " + a3 + ")";
                    }
                    String d = C8128deY.d(status);
                    if (d != null) {
                        obj = ((Object) obj) + " (message: " + d + ")";
                    }
                    if (status.e() != null) {
                        obj = ((Object) obj) + " caused by: " + status.e();
                    }
                    String str = obj;
                    InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                    Throwable e3 = status.e();
                    if (e3 == null) {
                        e3 = new Exception(status.b());
                    }
                    k = dqE.k(new LinkedHashMap());
                    C1596aHd c1596aHd = new C1596aHd(str, e3, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            c1596aHd.a(errorType.c() + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1597aHe c = dVar2.c();
                    if (c != null) {
                        c.d(c1596aHd, th);
                    } else {
                        dVar2.e().b(c1596aHd, th);
                    }
                }
                drM<Status, dpR> drm2 = drm;
                C8632dsu.d(status);
                drm2.invoke(status);
            }
        }, 2, null);
    }

    @Override // com.netflix.mediaclient.acquisition.services.logging.TtrEventListener
    public void onPageRenderSuccess() {
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
    }

    @Override // com.netflix.mediaclient.acquisition.services.logging.TtrEventListener
    public void onPageRenderFail() {
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.failed, null);
    }

    @Override // com.netflix.mediaclient.acquisition.services.logging.TtrEventListener
    public void onPageCtaClick() {
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener
    public void onAddProfilesEEContextConfirm() {
        logAndLaunchFragment$default(this, new AddProfilesEEFragment_Ab31697(), false, SignupFlowModeStackManager.INSTANCE.updateMode(SignupConstants.Mode.ADD_PROFILES), 2, null);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampNavigationListener
    public void onrampSignOut() {
        signOut();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampNavigationListener
    public void onrampFinished() {
        if (!this.loggingIn) {
            replaceLoadingScreenAb30210();
            hideActionBar();
            View view = this.loading_view;
            if (view == null) {
                C8632dsu.d("");
                view = null;
            }
            view.setVisibility(0);
        }
        launchProfilesGate();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampNavigationListener
    public void onrampOutroDisplayed() {
        updateNavigationLevel(AppView.onrampOutro);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.VerifyCardContextClickListener
    public void onVerifyContextConfirm() {
        logAndLaunchFragment$default(this, new VerifyCardFragment(), false, SignupFlowModeStackManager.INSTANCE.updateMode(SignupConstants.Mode.VERIFY_CARD), 2, null);
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onAfterNetworkAction(Response response) {
        C8632dsu.c((Object) response, "");
        if (response.isValidState()) {
            getMoneyballDataSource().getLiveMoneyballData().setValue(response.getMoneyballData());
        }
    }

    private final void fetchPreviousFlowAndMode(String str, String str2) {
        showProgressSpinner();
        aMU r = getServiceManager().r();
        if (r != null) {
            r.c(str, str2, new aMX() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$$ExternalSyntheticLambda6
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    SignupNativeActivity.fetchPreviousFlowAndMode$lambda$30(SignupNativeActivity.this, moneyballData, status, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchPreviousFlowAndMode$lambda$30(SignupNativeActivity signupNativeActivity, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) signupNativeActivity, "");
        C8632dsu.c((Object) status, "");
        hideProgressSpinner$default(signupNativeActivity, false, 1, null);
        if (status.j()) {
            if ((moneyballData != null ? moneyballData.getFlowMode() : null) != null) {
                signupNativeActivity.getMoneyballDataSource().getLiveMoneyballData().setValue(moneyballData);
                return;
            }
        }
        ErrorDialogHelper.showError$default(signupNativeActivity.getErrorDialogHelper(), status, 0, (drO) null, (drO) null, 14, (Object) null);
    }

    private final void fetchWelcomeMode() {
        getSignupNetworkManager().performModeRequest("welcome", new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity$fetchWelcomeMode$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
                SignupNativeActivity.this.showProgressSpinner();
            }

            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onAfterNetworkAction(Response response) {
                C8632dsu.c((Object) response, "");
                SignupNativeActivity.hideProgressSpinner$default(SignupNativeActivity.this, false, 1, null);
                if (response.isValidState()) {
                    return;
                }
                ErrorDialogHelper.showError$default(SignupNativeActivity.this.getErrorDialogHelper(), response.getStatus(), 0, new SignupNativeActivity$fetchWelcomeMode$1$onAfterNetworkAction$1(SignupNativeActivity.this.getErrorDialogHelper()), (drO) null, 10, (Object) null);
                SignupNativeActivity.this.endRenderNavigationLevelSession(IClientLogging.CompletionReason.failed, response.getStatus());
            }
        });
    }

    private final void goBackToPreviousMode() {
        boolean e2;
        FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
        FlowMode previousFlowMode = SignupFlowModeStackManager.INSTANCE.getPreviousFlowMode();
        String stringExtra = getIntent().getStringExtra("extra_launched_from_mode");
        if (previousFlowMode == null) {
            if (C8632dsu.c((Object) stringExtra, (Object) "memberHome")) {
                launchToMemberHome(false);
                return;
            }
            if (C8632dsu.c((Object) (currentFlowMode != null ? currentFlowMode.getFlow() : null), (Object) SignupConstants.Flow.MOBILE_ONBOARDING)) {
                launchProfilesGate();
                return;
            } else {
                fetchWelcomeMode();
                return;
            }
        }
        String mode = previousFlowMode.getMode();
        if (C8632dsu.c((Object) mode, (Object) "welcome")) {
            fetchWelcomeMode();
            return;
        }
        e2 = duD.e((CharSequence) mode, (CharSequence) "context", true);
        if (e2) {
            SignupFragment nextFragment = getNextFragment(previousFlowMode);
            if (nextFragment != null) {
                logAndLaunchFragment(nextFragment, true, previousFlowMode);
                return;
            }
            return;
        }
        fetchPreviousFlowAndMode(previousFlowMode.getFlow(), mode);
    }

    private final void launchSimplicityWebFlow(FlowMode flowMode) {
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        handoffToWebview(flowMode.getFlow(), flowMode.getMode());
    }

    private final void launchLoginActivity(FlowMode flowMode) {
        Intent c = this.loginApi.get().c(this);
        c.putExtra(SignupConstants.Field.EMAIL, getViewModel().getUserLoginId(flowMode));
        c.putExtra("header", getViewModel().getLoginBanner(flowMode, getStringProvider()));
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        startActivity(c);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNavigation() {
        String stringExtra = getIntent().getStringExtra("extra_mode");
        String stringExtra2 = getIntent().getStringExtra("extra_flow");
        if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra)) {
            C8632dsu.d((Object) stringExtra2);
            C8632dsu.d((Object) stringExtra);
            fetchFlowAndMode(stringExtra2, stringExtra);
        } else if (!TextUtils.isEmpty(stringExtra)) {
            C8632dsu.d((Object) stringExtra);
            fetchMode(stringExtra);
        } else if (getViewModel().getCurrentFlowMode() == null) {
            fetchMode("welcome");
        }
    }

    private final boolean shouldShowSkipMenu() {
        return isProfileOnboarding();
    }

    private final boolean isProfileOnboarding() {
        FlowMode currentFlowMode = getViewModel().getCurrentFlowMode();
        if (currentFlowMode == null) {
            return C8632dsu.c((Object) getIntent().getStringExtra("extra_flow"), (Object) SignupConstants.Flow.PROFILE_ONBOARDING);
        }
        return C8632dsu.c((Object) currentFlowMode.getFlow(), (Object) SignupConstants.Flow.PROFILE_ONBOARDING);
    }

    private final boolean isTestStack(Context context) {
        return C1815aPg.d(context).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupDogfoodingMenu$lambda$3(SignupNativeActivity signupNativeActivity, View view) {
        C8632dsu.c((Object) signupNativeActivity, "");
        Optional<DebugMenuItems> e2 = ((DebugMenuPreference.e) EntryPointAccessors.fromActivity(signupNativeActivity, DebugMenuPreference.e.class)).e();
        if (e2.isPresent()) {
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            Menu menu = popupMenu.getMenu();
            C8632dsu.a(menu, "");
            DebugMenuItems debugMenuItems = e2.get();
            C8632dsu.a(debugMenuItems, "");
            debugMenuItems.e(menu);
            menu.setGroupVisible(1337, false);
            popupMenu.show();
            return true;
        }
        return false;
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$17232);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
