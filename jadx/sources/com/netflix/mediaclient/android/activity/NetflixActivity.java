package com.netflix.mediaclient.android.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.transition.Transition;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.netflix.android.widgetry.widget.tabs.BottomTabView;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppStartType;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.MetadataRendered;
import com.netflix.cl.model.event.discrete.android.CachedMetadataRendered;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.RenderNavigationLevel;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.debug.A11yVisionSimulator;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_isFoldableModel;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.mdx2.NetflixMdxController;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.EchoShowUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC1073Nr;
import o.AbstractC5349bxA;
import o.ActivityC4183bZh;
import o.C1044Mm;
import o.C1058Nc;
import o.C1059Nd;
import o.C1125Pq;
import o.C1129Pu;
import o.C1163Rc;
import o.C1332Xp;
import o.C1584aGs;
import o.C1596aHd;
import o.C4145bXx;
import o.C4984bqG;
import o.C4987bqJ;
import o.C6539cfH;
import o.C6582cfy;
import o.C7437cwG;
import o.C8005dcH;
import o.C8054ddD;
import o.C8067ddQ;
import o.C8076ddZ;
import o.C8119deP;
import o.C8126deW;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8159dfC;
import o.C8166dfJ;
import o.C8169dfM;
import o.C8183dfa;
import o.C8241dgf;
import o.C8263dhA;
import o.C8310dhv;
import o.C9702vQ;
import o.C9720vi;
import o.C9834xU;
import o.C9867yA;
import o.C9870yD;
import o.C9872yF;
import o.C9935zP;
import o.C9936zQ;
import o.DialogC6583cfz;
import o.InterfaceC1077Nv;
import o.InterfaceC1078Nw;
import o.InterfaceC1576aGk;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1905aSp;
import o.InterfaceC3655bFx;
import o.InterfaceC4208baF;
import o.InterfaceC5091bsH;
import o.InterfaceC5128bss;
import o.InterfaceC5131bsv;
import o.InterfaceC5283bvo;
import o.InterfaceC5285bvq;
import o.InterfaceC5350bxB;
import o.InterfaceC5844cKl;
import o.InterfaceC6580cfw;
import o.InterfaceC6675chl;
import o.InterfaceC7216cry;
import o.InterfaceC7249cse;
import o.InterfaceC7303ctf;
import o.InterfaceC7343cuS;
import o.InterfaceC7345cuU;
import o.InterfaceC8018dcU;
import o.InterfaceC8098ddv;
import o.MM;
import o.MP;
import o.MT;
import o.NB;
import o.NF;
import o.NL;
import o.RO;
import o.SQ;
import o.SY;
import o.XH;
import o.aIB;
import o.aSC;
import o.aVM;
import o.bFE;
import o.bMZ;
import o.bXE;
import o.cNT;
import o.cVB;
import o.dpR;

@SuppressLint({"DefaultLocale"})
@AndroidEntryPoint
/* loaded from: classes.dex */
public abstract class NetflixActivity extends MT implements bFE, InterfaceC1077Nv, InterfaceC8018dcU, InterfaceC1576aGk {
    private static final String ACTION_FINISH_ALL_ACTIVITIES = "com.netflix.mediaclient.ui.login.ACTION_FINISH_ALL_ACTIVITIES";
    public static final String DP_LITE_DIALOG_TAG = "DPLiteDialogTag";
    public static final String EXTRA_DISMISS_NOTIFICATION_ID = "extra_dismiss_notification";
    public static final String EXTRA_DL_PLAYABLE_ID = "extra_download_playableId";
    public static final String EXTRA_DL_VIDEO_TYPE_STRING = "extra_download_videoType_string";
    public static final String EXTRA_ENABLE_TRANSITION_ANIMATION = "com.netflix.mediaclient._TRANSITION_ANIMATION";
    public static final String EXTRA_ENTRY = "entry";
    public static final String EXTRA_EPISODE_ID = "extra_episode_id";
    public static final String EXTRA_EXPAND_MDX_PLAYER = "com.netflix.mediaclient.EXPAND_MDX_PLAYER";
    public static final String EXTRA_FROM = "from";
    private static final String EXTRA_IS_MDX_CONNECTING = "mdx_connecting";
    public static final String EXTRA_PLAYER_EXTRAS = "player_extras";
    public static final String EXTRA_PLAYER_ID = "extra_player_id";
    public static final String EXTRA_PLAY_CONTEXT = "extra_play_context";
    private static final String EXTRA_SHOULD_EXPAND_CAST_PLAYER = "cast_player_expanded";
    public static final String EXTRA_SOURCE = "source";
    public static final String EXTRA_SS_STATUS_BAR_HEIGHT = "extra_ss_status_bar_height";
    public static final String EXTRA_TRACKINGINFO_HOLDER = "extra_trackinginfo_holder";
    public static final String EXTRA_TRAILER_BOOKMARK_MS = "extra_trailer_bookmark_ms";
    public static final String EXTRA_TRAILER_ID = "extra_trailer_id";
    public static final String EXTRA_VIDEO_ID = "extra_video_id";
    public static final String EXTRA_VIDEO_TYPE_STRING_VALUE = "extra_video_type_string_value";
    public static final String FRAG_DIALOG_TAG = "frag_dialog";
    public static final String FULL_SCREEN_DIALOG_TAG = "FullScreenDialogTag";
    private static final String TAG = "NetflixActivity";
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$26284 = 0;
    private static boolean isFirstRenderNavigationLevelForProcess = true;
    private static boolean isTutorialOn = true;
    private int actionBarHeight;
    InterfaceC7216cry activityPageOfflineAgentListener;
    @Inject
    public Optional<DebugMenuItems> debugMenuItems;
    @Inject
    public InterfaceC7249cse downloadSummaryListener;
    public Handler handler;
    private boolean hasSavedInstance;
    protected boolean isVisible;
    private WindowInsets lastWindowInsets;
    @Inject
    public Lazy<LoginApi> loginApi;
    private InterfaceC5350bxB mAppUpdateHandler;
    private FloatingActionButton mBackToCustomerSupportCallFAB;
    private CoordinatorLayout mFabAnchor;
    protected MenuItem mHelpMenuItem;
    protected InterfaceC1077Nv.e mLoadingStatusCallback;
    private RelativeLayout mNoNetworkOverlay;
    @Inject
    public InterfaceC6675chl messaging;
    private NetflixActionBar netflixActionBar;
    public NetflixBottomNavBar netflixBottomNavBar;
    private NetflixMdxController netflixMdxController;
    @Inject
    public InterfaceC7303ctf offlineApi;
    @Inject
    public InterfaceC5844cKl profileApi;
    @Inject
    public Lazy<cNT> profileSelectionLauncher;
    private RenderNavigationLevel renderSession;
    private int savedStatusBarHeight;
    @Inject
    public InterfaceC5285bvq shakeDetector;
    public SQ statusBarBackground;
    protected RO systemNavBarBackground;
    protected int systemNavBarHeight;
    private InterfaceC7343cuS tutorialHelper;
    @Inject
    public InterfaceC7345cuU tutorialHelperFactory;
    protected Dialog visibleDialog;
    @Inject
    public InterfaceC8098ddv voip;
    private final Set<BroadcastReceiver> autoUnregisterReceivers = new HashSet();
    private final Set<BroadcastReceiver> autoUnregisterLocalReceivers = new HashSet();
    private Set<MM> fragmentLifecycleCallbacks = Collections.emptySet();
    public bMZ fragmentHelper = bMZ.d;
    private String currentTrackerId = "";
    private boolean finishingAllActivities = false;
    private C9867yA keyboardState = null;
    public final PublishSubject<dpR> mActivityDestroy = PublishSubject.create();
    private final C7437cwG mSecondaryDisplay = NetflixApplication.getInstance().z();
    private final List<Runnable> postResumeRunnables = new CopyOnWriteArrayList();
    public C1059Nd orientationHandler = new C1059Nd(this);
    public final C9872yF composeViewOverlayManager = new C9872yF(this);
    private DismissingDialogConfig mDismissingDialogConfiguration = DismissingDialogConfig.dismissOnStop;
    public final Object visibleDialogLock = new Object();
    protected boolean mIsTablet = false;
    private boolean mConnectingToTarget = false;
    protected Map<String, Long> mPresentationSessionMap = new ConcurrentHashMap();
    private final LinkedList<PopupMenu> mShownPopupMenus = new LinkedList<>();
    private NF navigationVisualizer = null;
    private boolean mMdxStatusUpdated = false;
    private final BroadcastReceiver autokillReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetflixActivity.this.finishAndCleanupAllActivities();
        }
    };
    private final BroadcastReceiver expandCastPlayerReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.11
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C8054ddD.l(NetflixActivity.this)) {
                return;
            }
            if (intent == null || !"com.netflix.mediaclient.service.ACTION_EXPAND_CAST_PLAYER".equals(intent.getAction())) {
                C1044Mm.b(NetflixActivity.TAG, "Invalid intent: ", intent);
            } else {
                NetflixActivity.this.expandCastPlayerIfVisible();
            }
        }
    };
    private final BroadcastReceiver closeCastPlayerReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.13
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C8054ddD.l(NetflixActivity.this)) {
                return;
            }
            if (intent == null || !"com.netflix.mediaclient.service.ACTION_CLOSE_CAST_PLAYER".equals(intent.getAction())) {
                C1044Mm.b(NetflixActivity.TAG, "Invalid intent: ", intent);
            } else {
                NetflixActivity.this.notifyCastPlayerEndOfPostPlay();
            }
        }
    };
    private final BroadcastReceiver localBroadcastReceiver = new BroadcastReceiver() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            char c2;
            if (NetflixActivity.this.isFinishing() || (action = intent.getAction()) == null) {
                return;
            }
            int hashCode = action.hashCode();
            if (hashCode == 1272812214) {
                if (action.equals("com.netflix.mediaclient.ui.cs.ACTION_CALL_ENDED")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else if (hashCode != 1439017466) {
                if (hashCode == 1456775694 && action.equals("com.netflix.mediaclient.ui.error.ACTION_ACCOUNT_INACTIVE")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else {
                if (action.equals("com.netflix.mediaclient.ui.error.ACTION_DISPLAY_ERROR")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                NetflixActivity.this.handleCustomerSupportCallEnded();
            } else if (c2 == 1) {
                NetflixActivity.this.handleErrorDialog();
            } else if (c2 != 2) {
            } else {
                C1044Mm.e(NetflixActivity.TAG, "got account inactive error - to signup cookied in");
                NetflixActivity netflixActivity = NetflixActivity.this;
                cVB.a(netflixActivity, cVB.d(netflixActivity));
            }
        }
    };

    /* loaded from: classes.dex */
    public enum DismissingDialogConfig {
        dismissOnStop,
        doNotDismissOnStop,
        doNotDismissOnStopOnce
    }

    static {
        n();
    }

    private int getReEnterTransitionAnimation() {
        return C9834xU.d.d;
    }

    public static boolean isTutorialOn() {
        return isTutorialOn;
    }

    static void n() {
        e$ss2$26284 = (byte) 24;
    }

    public static void setTutorialOn(boolean z) {
    }

    protected boolean alwaysAllowScreenMirroring() {
        return false;
    }

    protected boolean canApplyBrowseExperience() {
        return false;
    }

    protected boolean canShowActionBar() {
        return true;
    }

    public boolean canShowDownloadProgressBar() {
        return false;
    }

    protected InterfaceC5091bsH createManagerStatusListener() {
        return null;
    }

    public boolean disableShakeToReportBugs() {
        return false;
    }

    public PublishSubject<dpR> getActivityDestroy() {
        return this.mActivityDestroy;
    }

    public NetflixBottomNavBar getBottomNavBar() {
        return this.netflixBottomNavBar;
    }

    public C8263dhA getDataContext() {
        return null;
    }

    public int getDialogContainerId() {
        return R.g.aZ;
    }

    protected CustomerServiceLogging.EntryPoint getEntryPoint() {
        return null;
    }

    protected int getExitTransitionAnimation() {
        return C9834xU.d.e;
    }

    public bMZ getFragmentHelper() {
        return this.fragmentHelper;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public NetflixActionBar getNetflixActionBar() {
        return this.netflixActionBar;
    }

    public NetflixMdxController getNetflixMdxController() {
        return this.netflixMdxController;
    }

    public InterfaceC7343cuS getTutorialHelper() {
        return this.tutorialHelper;
    }

    public abstract AppView getUiScreen();

    public Dialog getVisibleDialog() {
        return this.visibleDialog;
    }

    public boolean handleBackPressed() {
        return false;
    }

    public boolean hasBottomNavBar() {
        return false;
    }

    protected boolean hasProfileAvatarInActionBar() {
        return false;
    }

    public boolean hasSavedInstance() {
        return this.hasSavedInstance;
    }

    public void invalidateDebugOverlay() {
    }

    public boolean isConnectingToTarget() {
        return this.mConnectingToTarget;
    }

    public boolean isPlayerActivity() {
        return false;
    }

    public boolean isTablet() {
        return this.mIsTablet;
    }

    public void mdxStatusUpdatedByMdxReceiver() {
        this.mMdxStatusUpdated = true;
    }

    public void onActivityRefreshed(int i) {
    }

    protected void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
    }

    protected void onCreateOptionsMenu(Menu menu, Menu menu2) {
    }

    public void onDialogFragmentDismissed() {
    }

    public void onDialogFragmentShown() {
    }

    public boolean overridePendingTransitionAnimationOnFinish() {
        return true;
    }

    public void setConnectingToTarget(boolean z) {
        this.mConnectingToTarget = z;
    }

    public void setFragmentsHiddenState(boolean z, Transition transition) {
    }

    protected boolean shouldAttachToolbar() {
        return true;
    }

    protected boolean shouldFinishOnManagerError() {
        return true;
    }

    protected boolean shouldStartLaunchActivityIfVisibleOnManagerUnavailable() {
        return true;
    }

    protected boolean showHelpInMenu() {
        return false;
    }

    protected boolean showMdxInMenu() {
        return true;
    }

    protected boolean showNoNetworkOverlayIfNeeded() {
        return false;
    }

    public boolean updateActionBar() {
        return false;
    }

    public static NetflixActivity requireNetflixActivity(View view) {
        return requireNetflixActivity(view.getContext());
    }

    public static NetflixActivity requireNetflixActivity(Context context) {
        return (NetflixActivity) C8141del.e(context, NetflixActivity.class);
    }

    public boolean wasMdxStatusUpdatedByMdxReceiver() {
        try {
            return this.mMdxStatusUpdated;
        } finally {
            this.mMdxStatusUpdated = false;
        }
    }

    public void sendIntentToNetflixService(Intent intent) {
        if (this.serviceManagerInstance.c()) {
            this.serviceManagerInstance.a(intent);
        } else {
            InterfaceC1598aHf.a("trying to send intent while serviceManager is not ready");
        }
    }

    public void mdxTargetListChanged() {
        if (C8054ddD.l(this)) {
            InterfaceC1598aHf.a("mdxTargetListChanged is called on finishing or destroyed activity");
        } else if (showMdxInMenu()) {
            invalidateOptionsMenu();
        }
    }

    public static void finishAllActivities(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(ACTION_FINISH_ALL_ACTIVITIES));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (hasBottomNavBar()) {
            overridePendingTransition(0, 0);
        } else if (!overridePendingTransitionAnimationOnFinish() || this.finishingAllActivities) {
        } else {
            overridePendingTransitionAnimation(getReEnterTransitionAnimation(), getSlidingOutTransition());
        }
    }

    public void setupCastPlayerFrag() {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.g.aG);
        if (coordinatorLayout != null) {
            this.netflixMdxController = new NetflixMdxController(this, coordinatorLayout, getBottomNavBar());
            getLifecycle().addObserver(this.netflixMdxController);
        }
    }

    public void registerFragmentLifecycleCallbacks(MM mm) {
        if (this.fragmentLifecycleCallbacks == Collections.EMPTY_SET) {
            this.fragmentLifecycleCallbacks = new HashSet();
        }
        this.fragmentLifecycleCallbacks.add(mm);
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(mm, true);
    }

    public void unregisterFragmentLifecycleCallbacks(MM mm) {
        this.fragmentLifecycleCallbacks.remove(mm);
        getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(mm);
    }

    public void onFragmentHiddenChanged(NetflixFrag netflixFrag, boolean z) {
        for (MM mm : this.fragmentLifecycleCallbacks) {
            mm.e(netflixFrag, z);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.orientationHandler.c();
    }

    @Override // com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
        }
        EchoShowUtils.a(this);
        this.orientationHandler.b();
        setTheme();
        setupWindow();
        super.onCreate(bundle);
        C1058Nc.d(this);
        this.tutorialHelper = this.tutorialHelperFactory.e();
        if (badInstallation()) {
            return;
        }
        this.actionBarHeight = ViewUtils.d(this);
        if (bundle != null) {
            this.savedStatusBarHeight = bundle.getInt(EXTRA_SS_STATUS_BAR_HEIGHT, 0);
        }
        boolean z = true;
        this.hasSavedInstance = bundle != null;
        if (bundle == null || !bundle.getBoolean(EXTRA_IS_MDX_CONNECTING, false)) {
            z = false;
        }
        this.mConnectingToTarget = z;
        registerFinishReceiverLocallyWithAutoUnregister(ACTION_FINISH_ALL_ACTIVITIES);
        registerReceiverLocallyWithAutoUnregister(this.expandCastPlayerReceiver, "com.netflix.mediaclient.service.ACTION_EXPAND_CAST_PLAYER");
        registerReceiverLocallyWithAutoUnregister(this.closeCastPlayerReceiver, "com.netflix.mediaclient.service.ACTION_CLOSE_CAST_PLAYER");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.ui.error.ACTION_ACCOUNT_INACTIVE");
        intentFilter.addAction("com.netflix.mediaclient.ui.error.ACTION_DISPLAY_ERROR");
        intentFilter.addAction("com.netflix.mediaclient.ui.cs.ACTION_CALL_ENDED");
        registerReceiverLocallyWithAutoUnregister(this.localBroadcastReceiver, intentFilter);
        try {
            CastContext.getSharedInstance(this, Executors.newSingleThreadExecutor());
        } catch (Exception e) {
            C1044Mm.j(TAG, "Failed to initialize CastContext.  Error: %s", e.getMessage());
        }
        setupServiceManager();
        this.handler = new Handler();
        if (hasBottomNavBar()) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransitionAnimation(getSlidingInTransition(), getExitTransitionAnimation());
        }
        this.mAppUpdateHandler = AbstractC5349bxA.c.c(getApplicationContext());
        setupOfflineAgentListener();
        setupVisionSimulator();
        C8076ddZ.n(this);
    }

    protected void setupWindow() {
        if (getTheme().resolveAttribute(C9834xU.b.s, new TypedValue(), false)) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            if (!shouldShowKidsTheme()) {
                systemUiVisibility |= 512;
            } else if (Build.VERSION.SDK_INT >= 26) {
                systemUiVisibility |= 528;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
        }
    }

    protected boolean shouldUseFullscreenTheme() {
        return hasBottomNavBar();
    }

    public void setTheme() {
        if (canApplyBrowseExperience()) {
            if (shouldShowKidsTheme()) {
                setTheme(shouldUseFullscreenTheme() ? R.l.x : R.l.v);
            } else {
                setTheme(shouldUseFullscreenTheme() ? R.l.l : R.l.m);
            }
        }
    }

    protected boolean handleIntentInternally(Intent intent) {
        return this.fragmentHelper.b(intent);
    }

    @Override // com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (handleIntentInternally(intent)) {
            return;
        }
        super.startActivityForResult(intent, i, bundle);
    }

    protected boolean allowTransitionAnimation() {
        return getIntent() == null || getIntent().getBooleanExtra(EXTRA_ENABLE_TRANSITION_ANIMATION, true);
    }

    protected void overridePendingTransitionAnimation(int i, int i2) {
        if (allowTransitionAnimation()) {
            overridePendingTransition(i, i2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        setIntent(intent);
        super.onNewIntent(intent);
        if (hasBottomNavBar() && NetflixBottomNavBar.e(intent)) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 24 || i == 25 || i == 164) {
            onSystemVolumeChanged();
        }
        return super.onKeyUp(i, keyEvent);
    }

    private void onSystemVolumeChanged() {
        AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(this, AudioManager.class);
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            double d = streamMaxVolume > 0 ? (1.0d / streamMaxVolume) * streamVolume : 0.0d;
            boolean z = streamVolume == 0;
            ((C1125Pq) C1129Pu.b(C1125Pq.class)).a(z, false);
            CLv2Utils.d(d, z);
        }
    }

    protected void setupServiceManager() {
        this.serviceManagerController.c(this.serviceManagerInstance, new a(createManagerStatusListener(), isComingFromBackground()));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        initWindowInsetView();
        activateShakeForReport();
        C1044Mm.e("Orientation on start", String.valueOf(getRequestedOrientation()));
    }

    private void initWindowInsetView() {
        final View findViewById = findViewById(R.g.gv);
        if (findViewById != null) {
            findViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.MR
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$initWindowInsetView$0;
                    lambda$initWindowInsetView$0 = NetflixActivity.this.lambda$initWindowInsetView$0(view, windowInsets);
                    return lambda$initWindowInsetView$0;
                }
            });
            findViewById.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: o.MU
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i) {
                    NetflixActivity.this.lambda$initWindowInsetView$1(findViewById, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets lambda$initWindowInsetView$0(View view, WindowInsets windowInsets) {
        this.lastWindowInsets = new WindowInsets(windowInsets);
        updateInsets(view);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWindowInsetView$1(View view, int i) {
        updateInsets(view);
    }

    public void activateShakeForReport() {
        if (disableShakeToReportBugs()) {
            return;
        }
        this.shakeDetector.c(this);
    }

    private void updateInsets(View view) {
        if (this.lastWindowInsets != null) {
            this.systemNavBarHeight = C9702vQ.c(view) ? 0 : this.lastWindowInsets.getSystemWindowInsetBottom();
            if (C9702vQ.c(view)) {
                view.setPadding(0, 0, 0, 0);
            } else {
                view.setPadding(this.lastWindowInsets.getSystemWindowInsetLeft(), 0, this.lastWindowInsets.getSystemWindowInsetRight(), this.systemNavBarHeight);
            }
            onPaddingChanged();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        contentViewSetup();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        contentViewSetup();
    }

    protected void contentViewSetup() {
        if (hasBottomNavBar()) {
            initNetflixBottomNavBar();
        }
        if (shouldAddSystemBarBackgroundViews()) {
            initStatusBarBackground();
            initSystemNavBarBackground();
        }
        if (shouldAttachToolbar()) {
            initToolbar();
        }
        invalidateDebugOverlay();
    }

    protected void initStatusBarBackground() {
        ViewGroup viewGroup = (ViewGroup) findViewById(getActionBarParentViewId());
        SQ sq = (SQ) getLayoutInflater().inflate(R.i.by, viewGroup, false);
        this.statusBarBackground = sq;
        if (viewGroup != null) {
            viewGroup.addView(sq);
            this.statusBarBackground.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    NetflixActivity.this.onPaddingChanged();
                }
            });
        }
    }

    protected void initNetflixBottomNavBar() {
        ViewStub viewStub;
        NetflixBottomNavBar netflixBottomNavBar = (NetflixBottomNavBar) findViewById(R.g.V);
        this.netflixBottomNavBar = netflixBottomNavBar;
        if (netflixBottomNavBar == null && hasBottomNavBar() && (viewStub = (ViewStub) findViewById(R.g.X)) != null) {
            this.netflixBottomNavBar = (NetflixBottomNavBar) viewStub.inflate();
        }
        NetflixBottomNavBar netflixBottomNavBar2 = this.netflixBottomNavBar;
        if (netflixBottomNavBar2 != null) {
            netflixBottomNavBar2.e(new NetflixBottomNavBar.c() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.8
                @Override // com.netflix.mediaclient.android.widget.NetflixBottomNavBar.c
                public void c(boolean z) {
                    NetflixActivity.this.onPaddingChanged();
                }
            });
        }
    }

    protected void initSystemNavBarBackground() {
        ViewGroup viewGroup = (ViewGroup) findViewById(getActionBarParentViewId());
        RO ro = (RO) getLayoutInflater().inflate(R.i.aK, viewGroup, false);
        this.systemNavBarBackground = ro;
        if (viewGroup != null) {
            viewGroup.addView(ro);
        }
    }

    public void setFragmentHelper(bMZ bmz) {
        this.fragmentHelper = bmz;
        bmz.a(getStatusBarHeight(), this.actionBarHeight, getGlobalNavStickyHeaderHeight(), getFragmentBottomPadding());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (!hasBottomNavBar() || getBottomNavBar() == null) {
            return;
        }
        getBottomNavBar().a().setOnTabReselectedListener(new BottomTabView.b() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.7
            @Override // com.netflix.android.widgetry.widget.tabs.BottomTabView.b
            public void c(C9936zQ c9936zQ) {
                NetflixActivity.this.bottomTabReselected(c9936zQ);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 232) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                return;
            }
            PerformanceProfilerImpl.INSTANCE.e(this);
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z) {
        if (z) {
            ((NetflixApplication) getApplication()).a(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        UserAgent k;
        final InterfaceC6580cfw mdxTargetCallback;
        super.onResume();
        if (badInstallation()) {
            return;
        }
        NetflixApplication netflixApplication = (NetflixApplication) getApplication();
        NetflixApplication.p();
        if (isComingFromBackground()) {
            onFromBackground();
        }
        if (!C8054ddD.a()) {
            netflixApplication.a(this);
        }
        this.isVisible = true;
        netflixApplication.L();
        addFab();
        displayNoNetworkOverlay();
        if (hasBottomNavBar()) {
            aIB.b(this, new aIB.e() { // from class: o.MX
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    NetflixActivity.this.lambda$onResume$2(serviceManager);
                }
            });
        }
        boolean a2 = XH.c.d(this).a().a();
        this.mSecondaryDisplay.c(this, C1584aGs.d(this).g() ? true : !Config_FastProperty_MdxEnabledViaFeatureConfig.isFeatureConfigMdxCheckEnabled() ? !((k = AbstractApplicationC1040Mh.getInstance().i().k()) == null || !k.r()) : !(a2 || alwaysAllowScreenMirroring()));
        if (!a2 && (mdxTargetCallback = getMdxTargetCallback()) != null) {
            aIB.b(this, new aIB.e() { // from class: o.MV
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    NetflixActivity.this.lambda$onResume$3(mdxTargetCallback, serviceManager);
                }
            });
        }
        ((bXE) C1332Xp.b(bXE.class)).a(this);
        InterfaceC5350bxB interfaceC5350bxB = this.mAppUpdateHandler;
        if (interfaceC5350bxB != null) {
            interfaceC5350bxB.b(this);
        }
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null) {
            netflixActionBar.s();
        }
        C8076ddZ.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$3(InterfaceC6580cfw interfaceC6580cfw, ServiceManager serviceManager) {
        C6539cfH.a(this, interfaceC6580cfw);
    }

    public void setupVisionSimulator() {
        A11yVisionSimulator.Companion companion = A11yVisionSimulator.b;
        if (companion.a()) {
            companion.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: irisRefresh */
    public void lambda$onResume$2(final ServiceManager serviceManager) {
        ((CompletableSubscribeProxy) NetflixApplication.getInstance().j().as(AutoDispose.b(AndroidLifecycleScopeProvider.c(this)))).e(new Action() { // from class: o.MW
            @Override // io.reactivex.functions.Action
            public final void run() {
                NetflixActivity.lambda$irisRefresh$4(ServiceManager.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$irisRefresh$4(ServiceManager serviceManager) {
        C1044Mm.e(TAG, "from homeLolomoLoadEnded: irisFetch");
        C8119deP.a(serviceManager);
    }

    protected void initToolbar() {
        NetflixActionBar createActionBar = createActionBar();
        this.netflixActionBar = createActionBar;
        ((ObservableSubscribeProxy) createActionBar.r().as(AutoDispose.b(AndroidLifecycleScopeProvider.c(this)))).e(new Consumer() { // from class: o.MQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixActivity.this.lambda$initToolbar$5((dpR) obj);
            }
        });
        this.netflixActionBar.c(getActionBarStateBuilder().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initToolbar$5(dpR dpr) {
        onPaddingChanged();
    }

    private void onFromBackground() {
        showCastPlayerPostPlayOnResume();
        this.serviceManagerInstance.S();
    }

    protected void showCastPlayerPostPlayOnResume() {
        IMdxSharedState sharedState;
        C8241dgf.e m;
        if (!C8005dcH.a(this.serviceManagerInstance) || (sharedState = getSharedState()) == null || TextUtils.isEmpty(sharedState.e()) || !(this.serviceManagerInstance.q() instanceof aVM) || (m = ((aVM) this.serviceManagerInstance.q()).m()) == null || m.e == null) {
            return;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_TITLE_NEXT");
        intent.putExtra(SignupConstants.Field.LANG_ID, m.e);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    protected IMdxSharedState getSharedState() {
        return this.serviceManagerInstance.q().g();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        for (Runnable runnable : this.postResumeRunnables) {
            runnable.run();
        }
        this.postResumeRunnables.clear();
    }

    public void addPostResumeRunnable(Runnable runnable) {
        this.postResumeRunnables.add(runnable);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (badInstallation()) {
            return;
        }
        NetflixApplication netflixApplication = (NetflixApplication) getApplication();
        NetflixApplication.r();
        netflixApplication.c(this);
        this.isVisible = false;
        netflixApplication.J();
        this.mSecondaryDisplay.d(this);
        ((bXE) C1332Xp.b(bXE.class)).c(this);
        InterfaceC5350bxB interfaceC5350bxB = this.mAppUpdateHandler;
        if (interfaceC5350bxB != null) {
            interfaceC5350bxB.e(this);
        }
    }

    private void removeOfflineAgentListener() {
        InterfaceC4208baF l;
        if (this.activityPageOfflineAgentListener == null || (l = AbstractApplicationC1040Mh.getInstance().i().l()) == null) {
            return;
        }
        l.d(this.activityPageOfflineAgentListener);
    }

    public void dismissAllVisibleDialog() {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Throwable th) {
            C1044Mm.e(TAG, "Failed to dismiss dialog!", th);
        }
        this.visibleDialog = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        synchronized (this.visibleDialogLock) {
            if (shouldDismissVisibleDialog()) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        }
        reportPresentationSessionEnded(AppView.errorDialog);
        if (!disableShakeToReportBugs()) {
            this.shakeDetector.c();
        }
        super.onStop();
    }

    private boolean isErrorDialogVisible() {
        return this.mPresentationSessionMap.get(AppView.errorDialog.name()) != null;
    }

    private Long removePresentationSessionId(AppView appView) {
        if (appView != null) {
            return this.mPresentationSessionMap.remove(appView.name());
        }
        return null;
    }

    private boolean shouldDismissVisibleDialog() {
        if (isErrorDialogVisible()) {
            return false;
        }
        boolean z = this.visibleDialog != null;
        DismissingDialogConfig dismissingDialogConfig = this.mDismissingDialogConfiguration;
        if (dismissingDialogConfig == null) {
            this.mDismissingDialogConfiguration = DismissingDialogConfig.dismissOnStop;
            return z;
        }
        int i = AnonymousClass9.e[dismissingDialogConfig.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            this.mDismissingDialogConfiguration = DismissingDialogConfig.dismissOnStop;
            return false;
        }
        return z;
    }

    @Override // o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        for (MM mm : this.fragmentLifecycleCallbacks) {
            getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(mm);
        }
        this.fragmentLifecycleCallbacks.clear();
        this.mActivityDestroy.onComplete();
        ((NetflixApplication) getApplication()).c(this);
        if (isFinishing()) {
            endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
        }
        for (BroadcastReceiver broadcastReceiver : this.autoUnregisterReceivers) {
            unregisterReceiver(broadcastReceiver);
        }
        for (BroadcastReceiver broadcastReceiver2 : this.autoUnregisterLocalReceivers) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver2);
        }
        cleanUpInteractiveTrackers();
        ServiceManager serviceManager = this.serviceManagerInstance;
        if (serviceManager != null) {
            serviceManager.M();
        }
        removeOfflineAgentListener();
        super.onDestroy();
    }

    public boolean closeCastPanel() {
        NetflixMdxController netflixMdxController = this.netflixMdxController;
        return netflixMdxController != null && netflixMdxController.g();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CLv2Utils.b();
        exit();
    }

    public void exit() {
        if (getSupportFragmentManager().isStateSaved() || closeCastPanel()) {
            return;
        }
        if (C8076ddZ.d(this)) {
            CLv2Utils.b();
        } else if (dismissFullScreenDialog(false) || dismissFullScreenDPLiteDialog()) {
        } else {
            if (this.fragmentHelper.e()) {
                if (this.fragmentHelper.i() && this.fragmentHelper.c() == null) {
                    finish();
                }
            } else if (handleBackPressed()) {
            } else {
                try {
                    super.onBackPressed();
                } catch (IllegalStateException e) {
                    C1044Mm.j(TAG, "Error handling onBackPressed", e);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        addHelpMenu(menu);
        onCreateOptionsMenu(menu, null);
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        NetflixActionBar netflixActionBar = this.netflixActionBar;
        if (netflixActionBar != null) {
            netflixActionBar.n();
        }
        return onCreateOptionsMenu;
    }

    public void addHelpMenu(Menu menu) {
        if (showHelpInMenu()) {
            this.mHelpMenuItem = getHelpMenuItem(menu);
            Intent d = this.voip.d((Context) this);
            AppView uiScreen = getUiScreen();
            if (uiScreen != null) {
                d.putExtra(EXTRA_SOURCE, uiScreen.name());
            }
            if (getEntryPoint() != null) {
                d.putExtra(EXTRA_ENTRY, getEntryPoint().name());
            }
            this.mHelpMenuItem.setIntent(d);
            if (!getServiceManager().c() || getServiceManager().B() == null) {
                return;
            }
            this.mHelpMenuItem.setVisible(getServiceManager().B().b());
        }
    }

    protected MenuItem getHelpMenuItem(Menu menu) {
        MenuItem add = menu.add(0, R.g.dE, 0, getHelpMenuText());
        add.setShowAsAction(1);
        return add;
    }

    protected String getHelpMenuText() {
        int i = 2 % 2;
        int i2 = c + 5;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            getString(R.o.dO).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = getString(R.o.dO);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            A(string.substring(4), objArr);
            String intern = ((String) objArr[0]).intern();
            int i3 = c + 101;
            a = i3 % 128;
            int i4 = i3 % 2;
            return intern;
        }
        return string;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        NetflixActionBar netflixActionBar;
        if (menuItem == null || (netflixActionBar = this.netflixActionBar) == null || !netflixActionBar.a(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void bottomTabReselected(C9936zQ c9936zQ) {
        if (this.fragmentHelper.f()) {
            return;
        }
        performUpAction();
    }

    protected NetflixActionBar createActionBar() {
        return new NetflixActionBar(this, this.statusBarBackground, hasProfileAvatarInActionBar(), null);
    }

    public NetflixActionBar.b.C0051b getActionBarStateBuilder() {
        NetflixActionBar.b.C0051b b = this.fragmentHelper.h() ? this.fragmentHelper.b() : null;
        if (b == null) {
            NetflixActionBar.b.C0051b p = this.netflixActionBar.p();
            p.e(getTitle()).l(true).d(0).k(hasUpAction()).b(NetflixActionBar.LogoType.b).b(false);
            onConfigureActionBarState(p);
            return p;
        }
        return b;
    }

    protected boolean hasUpAction() {
        if (hasBottomNavBar()) {
            return this.fragmentHelper.h();
        }
        return true;
    }

    public void performUpAction() {
        if (this.fragmentHelper.g()) {
            return;
        }
        if (!getServiceManager().c()) {
            finish();
        } else if (getServiceManager().E()) {
            if (!isTaskRoot()) {
                if (!hasBottomNavBar()) {
                    finish();
                }
            } else {
                startActivity(HomeActivity.b((Context) this, getUiScreen(), false));
            }
        } else {
            startActivity(cVB.d(this));
        }
        overridePendingTransitionAnimation(getReEnterTransitionAnimation(), getSlidingOutTransition());
    }

    public int getGlobalNavBarHeight() {
        return getActionBarHeight() + getGlobalNavStickyHeaderHeight();
    }

    public int getGlobalNavStickyHeaderHeight() {
        NetflixActionBar netflixActionBar = this.netflixActionBar;
        if (netflixActionBar == null || !netflixActionBar.m()) {
            return 0;
        }
        return this.netflixActionBar.e();
    }

    public int getActionBarHeight() {
        NetflixActionBar netflixActionBar = this.netflixActionBar;
        if (netflixActionBar == null || !netflixActionBar.l()) {
            return 0;
        }
        return this.actionBarHeight;
    }

    public int getBottomNavBarHeight() {
        NetflixBottomNavBar bottomNavBar = getBottomNavBar();
        if (bottomNavBar == null || !bottomNavBar.g()) {
            return 0;
        }
        return getResources().getDimensionPixelSize(C9834xU.a.a);
    }

    public DialogFragment getDialogFragment() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag(FRAG_DIALOG_TAG);
        return dialogFragment != null ? dialogFragment : this.messaging.e();
    }

    public InterfaceC6580cfw requireMdxTargetCallback() {
        InterfaceC6580cfw mdxTargetCallback = getMdxTargetCallback();
        Objects.requireNonNull(mdxTargetCallback);
        return mdxTargetCallback;
    }

    private InterfaceC6580cfw getMdxTargetCallback() {
        NetflixMdxController netflixMdxController = this.netflixMdxController;
        if (netflixMdxController != null) {
            return netflixMdxController.q();
        }
        return null;
    }

    @Override // o.bFE
    public InterfaceC3655bFx getEpisodeRowListener() {
        NetflixMdxController netflixMdxController = this.netflixMdxController;
        if (netflixMdxController != null) {
            return netflixMdxController.q();
        }
        return null;
    }

    public NetflixActionBar requireNetflixActionBar() {
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        Objects.requireNonNull(netflixActionBar);
        return netflixActionBar;
    }

    public void registerFinishReceiverLocallyWithAutoUnregister(String str) {
        registerReceiverLocallyWithAutoUnregister(this.autokillReceiver, str);
    }

    public void registerReceiverWithAutoUnregister(BroadcastReceiver broadcastReceiver, String str, boolean z) {
        registerReceiverWithAutoUnregister(broadcastReceiver, new IntentFilter(str), z);
    }

    public void registerReceiverWithAutoUnregister(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        ContextCompat.registerReceiver(this, broadcastReceiver, intentFilter, z ? 2 : 4);
        this.autoUnregisterReceivers.add(broadcastReceiver);
    }

    public void registerReceiverLocallyWithAutoUnregister(BroadcastReceiver broadcastReceiver, String str) {
        registerReceiverLocallyWithAutoUnregister(broadcastReceiver, new IntentFilter(str));
    }

    public void registerReceiverLocallyWithAutoUnregister(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, intentFilter);
        this.autoUnregisterLocalReceivers.add(broadcastReceiver);
    }

    public boolean shouldShowKidsTheme() {
        return canApplyBrowseExperience() && BrowseExperience.e();
    }

    public boolean showSettingsInMenu() {
        return canApplyBrowseExperience() && !BrowseExperience.a();
    }

    public boolean showAccountInMenu() {
        return canApplyBrowseExperience() && !BrowseExperience.a();
    }

    public boolean showSignOutInMenu() {
        return ConnectivityUtils.l(this) && canApplyBrowseExperience() && !BrowseExperience.a();
    }

    public boolean showContactUsInSlidingMenu() {
        return canApplyBrowseExperience() && !BrowseExperience.a();
    }

    public void showFetchErrorsToast() {
        showDebugToast(aSC.e() ? "Fetch errors ENABLED" : "Fetch errors DISABLED");
    }

    public final boolean shouldAddCastToMenu() {
        C1044Mm.e(TAG, "shouldAddCastToMenu");
        return C8076ddZ.a(this, showMdxInMenu(), this.serviceManagerInstance);
    }

    public final boolean shouldServiceMdxBroadcast() {
        C1044Mm.e(TAG, "shouldServiceMdxBroadcast");
        ServiceManager serviceManager = this.serviceManagerInstance;
        if (!serviceManager.c()) {
            C1044Mm.j(TAG, "Service manager is %s or service manager is not ready.", serviceManager);
            return false;
        } else if (!serviceManager.E()) {
            C1044Mm.e(TAG, "User is not logged in, not adding MDX icon");
            return false;
        } else {
            C1044Mm.e(TAG, "Checking isAnyMdxTargetAvailable " + getClass().getSimpleName());
            return C8183dfa.e(getServiceManager().q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMdxReceiver() {
        if (!showMdxInMenu()) {
            C1044Mm.e(TAG, "Activity does not required MDX, skipping add of MDX receiver." + getClass().getSimpleName());
            return;
        }
        C1044Mm.e(TAG, "Listen to update from MDX service, add " + getClass().getSimpleName());
        C6582cfy c6582cfy = new C6582cfy(this);
        registerReceiverLocallyWithAutoUnregister(c6582cfy, c6582cfy.b());
        registerReceiverWithAutoUnregister((BroadcastReceiver) c6582cfy, c6582cfy.d(), true);
        C1044Mm.e(TAG, "Listen to update from MDX service, added  " + getClass().getSimpleName());
    }

    public void updateTargetSelectionDialog() {
        Dialog dialog = this.visibleDialog;
        if (dialog != null && dialog.isShowing() && (this.visibleDialog instanceof DialogC6583cfz)) {
            InterfaceC5131bsv q = this.serviceManagerInstance.q();
            if (q == null) {
                InterfaceC1597aHe.b(new C1596aHd("SPY-35546: Mdx agent was null"));
                return;
            }
            InterfaceC6580cfw mdxTargetCallback = getMdxTargetCallback();
            if (mdxTargetCallback != null) {
                C6539cfH.a(this, mdxTargetCallback.c(q));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserAgentUpdateReceiver() {
        PublishSubject<dpR> g = C4987bqJ.g();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        ((ObservableSubscribeProxy) g.as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.MY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixActivity.this.lambda$addUserAgentUpdateReceiver$6((dpR) obj);
            }
        });
        ((ObservableSubscribeProxy) C4987bqJ.b().as(AutoDispose.b(AndroidLifecycleScopeProvider.a(this, event)))).e(new Consumer() { // from class: o.MZ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixActivity.this.lambda$addUserAgentUpdateReceiver$7((dpR) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addUserAgentUpdateReceiver$6(dpR dpr) {
        handleAccountDeactivated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addUserAgentUpdateReceiver$7(dpR dpr) {
        handleInvalidCurrentProfile();
    }

    boolean isComingFromBackground() {
        return getNetflixApplication().K();
    }

    public int getActionBarParentViewId() {
        if (hasBottomNavBar()) {
            return R.g.aG;
        }
        return 16908290;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupOfflineAgentListener() {
        ServiceManager serviceManager = getServiceManager();
        if (serviceManager.c()) {
            if (hasBottomNavBar()) {
                this.downloadSummaryListener.c(serviceManager.t());
            }
            if (serviceManager.H()) {
                removeOfflineAgentListener();
                InterfaceC7216cry interfaceC7216cry = this.activityPageOfflineAgentListener;
                if (interfaceC7216cry != null) {
                    interfaceC7216cry.d();
                }
                this.activityPageOfflineAgentListener = this.offlineApi.d((ViewGroup) findViewById(16908290), true);
                serviceManager.t().e((InterfaceC4208baF) this.activityPageOfflineAgentListener);
                this.activityPageOfflineAgentListener.d();
            }
        }
    }

    public InteractiveTrackerInterface setupInteractiveTracking(InteractiveTrackerInterface interactiveTrackerInterface, InteractiveTrackerInterface.c cVar) {
        this.currentTrackerId = interactiveTrackerInterface.a();
        C1044Mm.b(TAG, "setupInteractiveTracking -> " + interactiveTrackerInterface.toString());
        if (getServiceManager() == null || !getServiceManager().c()) {
            throw new IllegalStateException("service not ready");
        }
        if (!hasSavedInstance()) {
            requireImageLoader(this).b(interactiveTrackerInterface);
        }
        InteractiveTrackerInterface a2 = requireImageLoader(this).a(interactiveTrackerInterface.a());
        if (a2 == null) {
            requireImageLoader(this).b(interactiveTrackerInterface);
        } else {
            interactiveTrackerInterface = a2;
        }
        interactiveTrackerInterface.a(cVar);
        return interactiveTrackerInterface;
    }

    public void cleanUpInteractiveTrackers() {
        InteractiveTrackerInterface a2;
        ServiceManager serviceManager = this.serviceManagerInstance;
        if (serviceManager == null || !serviceManager.c() || this.currentTrackerId.isEmpty() || (a2 = requireImageLoader(this).a(this.currentTrackerId)) == null) {
            return;
        }
        a2.a(null);
    }

    public void onLayoutInfoChanged(WindowLayoutInfo windowLayoutInfo) {
        if (Config_FastProperty_isFoldableModel.isEnabled()) {
            List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
            C1044Mm.e(TAG, "onLayoutInfoChanged");
            if (displayFeatures.isEmpty()) {
                if (C8151dev.j(this)) {
                    C1044Mm.e(TAG, "onLayoutInfoChanged no display Feature setting fulluser ");
                    this.orientationHandler.c(13);
                    return;
                }
                C1044Mm.e(TAG, "onLayoutInfoChanged no display Feature setting portrait ");
                this.orientationHandler.c(1);
                return;
            }
            for (DisplayFeature displayFeature : displayFeatures) {
                C1044Mm.e(TAG, "onLayoutInfoChanged feature " + displayFeature.toString());
                if (displayFeature instanceof FoldingFeature) {
                    FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                    if (this.orientationHandler.c(foldingFeature)) {
                        C1044Mm.e(TAG, "onLayoutInfoChanged enter portrait");
                        this.orientationHandler.c(1);
                        return;
                    } else if (this.orientationHandler.b(foldingFeature)) {
                        C1044Mm.e(TAG, "onLayoutInfoChanged enter book");
                    } else if (this.orientationHandler.d(foldingFeature)) {
                        if (foldingFeature.getOrientation() == FoldingFeature.Orientation.HORIZONTAL) {
                            C1044Mm.e(TAG, "onLayoutInfoChanged enter tablet");
                            this.orientationHandler.c(13);
                        } else {
                            C1044Mm.e(TAG, "onLayoutInfoChanged enter bookmode");
                            this.orientationHandler.c(13);
                        }
                    } else {
                        C1044Mm.e(TAG, "onLayoutInfoChanged enter normal mode");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5091bsH {
        private boolean a;
        private final InterfaceC5091bsH b;

        public a(InterfaceC5091bsH interfaceC5091bsH, boolean z) {
            this.b = interfaceC5091bsH;
            this.a = z;
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            UserAgent L = serviceManager.L();
            NetflixActivity.this.setUserAgent(L);
            InterfaceC5283bvo j = L.j();
            if (j != null) {
                NetflixActivity netflixActivity = NetflixActivity.this;
                netflixActivity.tutorialHelper = netflixActivity.tutorialHelperFactory.d(netflixActivity, j);
            }
            NetflixActivity.this.mIsTablet = C8150deu.h();
            if (status.i() && NetflixActivity.this.shouldStartLaunchActivityIfVisibleOnManagerUnavailable()) {
                NetflixActivity.this.startLaunchActivityIfVisible();
            }
            if (NetflixActivity.this.netflixActionBar != null) {
                NetflixActivity.this.netflixActionBar.q();
            }
            DialogFragment dialogFragment = NetflixActivity.this.getDialogFragment();
            if (dialogFragment instanceof InterfaceC5091bsH) {
                ((InterfaceC5091bsH) dialogFragment).onManagerReady(serviceManager, status);
            }
            NetflixActivity.this.addMdxReceiver();
            NetflixActivity.this.addUserAgentUpdateReceiver();
            NetflixActivity.this.updateHelpInMenuStatus();
            if (NetflixActivity.this.showMdxInMenu()) {
                NetflixActivity.this.invalidateOptionsMenu();
            }
            InterfaceC5091bsH interfaceC5091bsH = this.b;
            if (interfaceC5091bsH != null) {
                interfaceC5091bsH.onManagerReady(serviceManager, status);
            }
            NetflixActivity.this.addFab();
            NetflixActivity.this.displayNoNetworkOverlay();
            if (this.a) {
                NetflixActivity.this.showCastPlayerPostPlayOnResume();
            }
            NetflixActivity.this.displayErrorDialogIfExist();
            NetflixActivity.this.setupOfflineAgentListener();
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            DialogFragment dialogFragment = NetflixActivity.this.getDialogFragment();
            if (dialogFragment instanceof InterfaceC5091bsH) {
                ((InterfaceC5091bsH) dialogFragment).onManagerUnavailable(serviceManager, status);
            }
            InterfaceC5091bsH interfaceC5091bsH = this.b;
            if (interfaceC5091bsH != null) {
                interfaceC5091bsH.onManagerUnavailable(serviceManager, status);
            }
            if (NetflixActivity.this.shouldStartLaunchActivityIfVisibleOnManagerUnavailable()) {
                NetflixActivity.this.startLaunchActivityIfVisible();
            }
            if (NetflixActivity.this.shouldFinishOnManagerError()) {
                NetflixActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHelpInMenuStatus() {
        if (this.mHelpMenuItem == null || !getServiceManager().c() || getServiceManager().B() == null) {
            return;
        }
        this.mHelpMenuItem.setVisible(getServiceManager().B().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayNoNetworkOverlay() {
        synchronized (this) {
            if (ConnectivityUtils.n(this)) {
                removeNoNetworkOverlay();
            } else {
                addNoNetworkOverlay();
            }
        }
    }

    private void addNoNetworkOverlay() {
        if (showNoNetworkOverlayIfNeeded()) {
            C1044Mm.a(TAG, "Add No network overlay to %s ", getLocalClassName());
            RelativeLayout relativeLayout = this.mNoNetworkOverlay;
            if (relativeLayout != null) {
                ViewUtils.a((View) relativeLayout, true);
                return;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.g.aG);
            this.mFabAnchor = coordinatorLayout;
            if (coordinatorLayout == null) {
                return;
            }
            LayoutInflater.from(this).inflate(R.i.aJ, (ViewGroup) this.mFabAnchor, true);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.mFabAnchor.findViewById(R.g.dR);
            this.mNoNetworkOverlay = relativeLayout2;
            if (relativeLayout2 == null) {
                C1044Mm.d(TAG, "No network overlay is not found in root layout! This should NOT happen!");
                return;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) relativeLayout2.getLayoutParams();
            layoutParams.gravity = 80;
            this.mNoNetworkOverlay.setLayoutParams(layoutParams);
            this.mNoNetworkOverlay.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1044Mm.e(NetflixActivity.TAG, "Handle click on No Network overlay");
                    NetflixActivity.this.handleActionOnNoNetworkOverlay();
                }
            });
        }
    }

    public void removeNoNetworkOverlay() {
        RelativeLayout relativeLayout = this.mNoNetworkOverlay;
        if (relativeLayout != null) {
            ViewUtils.a((View) relativeLayout, false);
        }
    }

    protected void handleActionOnNoNetworkOverlay() {
        recreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFab() {
        synchronized (this) {
            if (this.voip.a((Activity) this)) {
                return;
            }
            boolean d = this.voip.d((Activity) this);
            FloatingActionButton floatingActionButton = this.mBackToCustomerSupportCallFAB;
            if (floatingActionButton != null && d) {
                floatingActionButton.show();
                return;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.g.aG);
            this.mFabAnchor = coordinatorLayout;
            if (coordinatorLayout == null) {
                return;
            }
            if (!d) {
                C1044Mm.j(TAG, "Customer support call is NOT in progress for " + getLocalClassName());
                return;
            }
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) this.voip.a(this, coordinatorLayout);
            if (floatingActionButton2 == null) {
                C1044Mm.d(TAG, "Fab is not found in root layout! This should NOT happen!");
                return;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton2.getLayoutParams();
            layoutParams.gravity = 81;
            layoutParams.setMargins(0, 0, 0, getBottomNavBarHeight() + this.systemNavBarHeight + this.voip.e(this));
            floatingActionButton2.setLayoutParams(layoutParams);
            floatingActionButton2.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NetflixActivity netflixActivity = NetflixActivity.this;
                    Intent d2 = netflixActivity.voip.d((Context) netflixActivity);
                    if (NetflixActivity.this.getUiScreen() != null) {
                        d2.putExtra(NetflixActivity.EXTRA_SOURCE, NetflixActivity.this.getUiScreen().name());
                    }
                    d2.putExtra(NetflixActivity.EXTRA_FROM, CustomerServiceLogging.ReturnToDialScreenFrom.fab.name());
                    NetflixActivity.this.startActivity(d2);
                }
            });
            floatingActionButton2.show();
            this.mBackToCustomerSupportCallFAB = floatingActionButton2;
        }
    }

    private void removeFab() {
        synchronized (this) {
            if (this.mFabAnchor != null && this.mBackToCustomerSupportCallFAB != null) {
                C1044Mm.e(TAG, "Hiding FAB...");
                this.mBackToCustomerSupportCallFAB.hide();
            }
            C1044Mm.j(TAG, "Unable to remove FAB!");
        }
    }

    protected void startLaunchActivityIfVisible() {
        if (this.isVisible && !(this instanceof LaunchActivity)) {
            C1044Mm.a(TAG, "Activity is visible, starting launch activity");
            startActivity(ActivityC4183bZh.d(this, getUiScreen()).addFlags(131072));
            return;
        }
        C1044Mm.b(TAG, "Activity is not visible, skipping launch of new activity");
    }

    public static ImageLoader requireImageLoader(Context context) {
        Objects.requireNonNull(context);
        ImageLoader imageLoader = getImageLoader(context);
        Objects.requireNonNull(imageLoader);
        return imageLoader;
    }

    public static ImageLoader getImageLoader(Context context) {
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        if (netflixActivity == null) {
            InterfaceC1598aHf.a("getImageLoader passed a non activity context");
            return null;
        }
        return netflixActivity.serviceManagerInstance.l();
    }

    public NetflixApplication getNetflixApplication() {
        return (NetflixApplication) getApplication();
    }

    public void runInUiThread(Runnable runnable) {
        if (runnable == null || C8054ddD.l(this)) {
            return;
        }
        runOnUiThread(runnable);
    }

    protected void expandCastPlayerIfVisible() {
        if (getNetflixMdxController() != null) {
            getNetflixMdxController().a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCastPlayerEndOfPostPlay() {
        C1044Mm.b(TAG, "CastPlayer end of postplay");
        hideCastPlayer();
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_HIDE"));
    }

    protected void hideCastPlayer() {
        this.handler.post(new Runnable() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.15
            @Override // java.lang.Runnable
            public void run() {
                NetflixActionBar netflixActionBar = NetflixActivity.this.getNetflixActionBar();
                if (netflixActionBar != null && !netflixActionBar.l() && NetflixActivity.this.canShowActionBar()) {
                    netflixActionBar.c(true);
                }
                NetflixBottomNavBar bottomNavBar = NetflixActivity.this.getBottomNavBar();
                if (bottomNavBar == null || bottomNavBar.g()) {
                    return;
                }
                bottomNavBar.d(true);
            }
        });
        onPaddingChanged();
    }

    public void closeAllPopupMenus() {
        while (!this.mShownPopupMenus.isEmpty()) {
            this.mShownPopupMenus.pop().dismiss();
        }
    }

    public boolean showMenu(PopupMenu popupMenu) {
        if (popupMenu == null || C8054ddD.l(this)) {
            return false;
        }
        popupMenu.show();
        this.mShownPopupMenus.push(popupMenu);
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.5
            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu2) {
                NetflixActivity.this.mShownPopupMenus.remove(popupMenu2);
            }
        });
        return true;
    }

    public boolean showFullScreenDPLiteDialog(NetflixDialogFrag netflixDialogFrag) {
        C8166dfJ.b("showFullScreenDPLiteDialog should be executed on main thread");
        if (C8054ddD.l(this) || getSupportFragmentManager().isStateSaved()) {
            return false;
        }
        final View findViewById = findViewById(getDialogContainerId());
        if (findViewById == null) {
            throw new IllegalStateException();
        }
        AccessibilityUtils.d((ViewGroup) findViewById.getParent(), findViewById, true);
        netflixDialogFrag.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.1
            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
            public void a(NetflixDialogFrag netflixDialogFrag2) {
                NetflixActivity.this.onDialogFragmentDismissed();
                AccessibilityUtils.d((ViewGroup) findViewById.getParent(), findViewById, false);
            }
        });
        getSupportFragmentManager().beginTransaction().add(getDialogContainerId(), netflixDialogFrag, DP_LITE_DIALOG_TAG).commitNow();
        onDialogFragmentShown();
        return true;
    }

    public boolean showFullScreenDialog(NetflixDialogFrag netflixDialogFrag) {
        C8166dfJ.b("showFullScreenDialog should be executed on main thread");
        if (C8054ddD.l(this) || getSupportFragmentManager().isStateSaved() || isDialogFragmentVisible()) {
            return false;
        }
        final View findViewById = findViewById(getDialogContainerId());
        if (findViewById != null) {
            AccessibilityUtils.d((ViewGroup) findViewById.getParent(), findViewById, true);
            netflixDialogFrag.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.4
                @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
                public void a(NetflixDialogFrag netflixDialogFrag2) {
                    NetflixActivity.this.onDialogFragmentDismissed();
                    AccessibilityUtils.d((ViewGroup) findViewById.getParent(), findViewById, false);
                }
            });
            getSupportFragmentManager().beginTransaction().add(getDialogContainerId(), netflixDialogFrag, FULL_SCREEN_DIALOG_TAG).commitNow();
            onDialogFragmentShown();
            return true;
        }
        return showDialog(netflixDialogFrag);
    }

    public boolean dismissFullScreenDPLiteDialog() {
        NetflixDialogFrag netflixDialogFrag;
        if (C8054ddD.l(this) || getSupportFragmentManager().isStateSaved() || (netflixDialogFrag = (NetflixDialogFrag) getSupportFragmentManager().findFragmentByTag(DP_LITE_DIALOG_TAG)) == null) {
            return false;
        }
        if (netflixDialogFrag.handleBackPressed()) {
            return true;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.remove(netflixDialogFrag);
        beginTransaction.commitNow();
        return true;
    }

    public boolean dismissFullScreenDialog(boolean z) {
        NetflixDialogFrag netflixDialogFrag;
        if (C8054ddD.l(this) || getSupportFragmentManager().isStateSaved() || (netflixDialogFrag = (NetflixDialogFrag) getSupportFragmentManager().findFragmentByTag(FULL_SCREEN_DIALOG_TAG)) == null) {
            return false;
        }
        if (z || !netflixDialogFrag.handleBackPressed()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.remove(netflixDialogFrag);
            beginTransaction.commitNow();
            return true;
        }
        return true;
    }

    public boolean showDialog(DialogFragment dialogFragment) {
        C8166dfJ.b("showDialog should be executed on main thread");
        if (dialogFragment == null || C8054ddD.l(this) || isDialogFragmentVisible()) {
            return false;
        }
        if (getSupportFragmentManager().isStateSaved()) {
            C1044Mm.e(TAG, "Instance state has been saved - skipping showing dialog");
            return false;
        }
        try {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            DialogFragment dialogFragment2 = getDialogFragment();
            if (dialogFragment2 != null) {
                C1044Mm.b(TAG, "Dismissing previous dialog");
                dialogFragment2.dismiss();
                C1044Mm.b(TAG, "Removing previous dialog");
                beginTransaction.remove(dialogFragment2);
            }
            beginTransaction.addToBackStack(null);
            InterfaceC1593aHa.b("showDialog: " + dialogFragment + " Thread: " + Thread.currentThread().getName() + " Activity: " + this);
            C1044Mm.b(TAG, "Showing dialog");
            ViewUtils.d(dialogFragment, getSupportFragmentManager(), beginTransaction, FRAG_DIALOG_TAG);
            return true;
        } catch (Throwable th) {
            String str = "Failed to show dialog, " + th;
            C1044Mm.d(TAG, str);
            InterfaceC1598aHf.a(new C1596aHd(str).b(false));
            return false;
        }
    }

    public void showOfflineErrorDialog(NetflixDialogFrag netflixDialogFrag) {
        if (C8054ddD.l(this) || getSupportFragmentManager().isStateSaved()) {
            return;
        }
        InterfaceC1593aHa.b("showOfflineErrorDialog: " + netflixDialogFrag + " Thread: " + Thread.currentThread().getName() + " Activity: " + this);
        netflixDialogFrag.showNow(getSupportFragmentManager(), FRAG_DIALOG_TAG);
        C1163Rc.b(netflixDialogFrag.getDialog());
    }

    public NetflixDialogFrag getFullscreenDialogFragment() {
        return (NetflixDialogFrag) getSupportFragmentManager().findFragmentByTag(FULL_SCREEN_DIALOG_TAG);
    }

    public boolean isDialogFragmentVisible() {
        return isFullscreenDialogFragmentVisible() || isNonFullscreenDialogFragmentVisible();
    }

    private boolean isFullscreenDialogFragmentVisible() {
        return ((NetflixDialogFrag) getSupportFragmentManager().findFragmentByTag(FULL_SCREEN_DIALOG_TAG)) != null;
    }

    private boolean isNonFullscreenDialogFragmentVisible() {
        DialogFragment dialogFragment = getDialogFragment();
        return dialogFragment != null && dialogFragment.isVisible();
    }

    public boolean isDpLiteDialogFragmentVisible() {
        return ((NetflixDialogFrag) getSupportFragmentManager().findFragmentByTag(DP_LITE_DIALOG_TAG)) != null;
    }

    public void removeDialogFrag() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        DialogFragment dialogFragment = getDialogFragment();
        if (dialogFragment != null) {
            dialogFragment.dismiss();
            beginTransaction.remove(dialogFragment);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public void removeVisibleDialog() {
        synchronized (this.visibleDialogLock) {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.visibleDialog = null;
            }
        }
    }

    public Dialog displayDialog(AlertDialog.Builder builder) {
        AlertDialog create;
        if (builder == null) {
            return null;
        }
        synchronized (this.visibleDialogLock) {
            create = builder.create();
            displayDialog(create);
        }
        return create;
    }

    public void displayDialog(Dialog dialog) {
        if (dialog == null || C8054ddD.l(this)) {
            return;
        }
        synchronized (this.visibleDialogLock) {
            if (C8054ddD.l(this)) {
                return;
            }
            if (isErrorDialogVisible()) {
                C1044Mm.j(TAG, "Error dialog is displayed, do not remove it!");
                return;
            }
            Dialog dialog2 = this.visibleDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            showPreservingWindowFlagsFromActivity(dialog);
            this.visibleDialog = dialog;
        }
    }

    private void showPreservingWindowFlagsFromActivity(Dialog dialog) {
        dialog.getWindow().setFlags(8, 8);
        dialog.show();
        dialog.getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility());
        dialog.getWindow().clearFlags(8);
    }

    public Dialog displayDialog(SY.e eVar) {
        SY d;
        if (eVar == null || C8054ddD.l(this)) {
            return null;
        }
        synchronized (this.visibleDialogLock) {
            d = eVar.d();
            displayDialog(d);
        }
        return d;
    }

    public void updateVisibleDialog(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        synchronized (this.visibleDialogLock) {
            Dialog dialog2 = this.visibleDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.visibleDialog = dialog;
        }
    }

    private void handleAccountDeactivated() {
        LoginApi loginApi = this.loginApi.get();
        boolean b = loginApi.b(this);
        if (this.isVisible && !b) {
            startActivity(loginApi.e(this));
        }
        if (b) {
            C1044Mm.j(TAG, "Account deactivated, leave to LogoutActivity to complete transition...");
        } else {
            finishAndCleanupAllActivities();
        }
    }

    protected void finishAndCleanupAllActivities() {
        C8076ddZ.a((Activity) this);
        this.finishingAllActivities = true;
        finish();
    }

    private void handleInvalidCurrentProfile() {
        finishAllActivities(this);
        startActivity(this.profileSelectionLauncher.get().d(this, getUiScreen()));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(EXTRA_IS_MDX_CONNECTING, isConnectingToTarget());
        SQ sq = this.statusBarBackground;
        if (sq != null && sq.isLaidOut()) {
            bundle.putInt(EXTRA_SS_STATUS_BAR_HEIGHT, this.statusBarBackground.getMeasuredHeight());
        }
        this.fragmentHelper.c(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        NB D = getNetflixApplication().D();
        boolean z = true;
        if (actionMasked != 1 && actionMasked != 6) {
            z = false;
        }
        D.d(z);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        NB D = getNetflixApplication().D();
        boolean z = true;
        if (actionMasked != 1 && actionMasked != 6) {
            z = false;
        }
        D.d(z);
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getNetflixApplication().D().d(true);
        return super.dispatchKeyEvent(keyEvent);
    }

    public C9867yA getKeyboardState() {
        C9867yA c9867yA;
        synchronized (this) {
            if (this.keyboardState == null) {
                this.keyboardState = new C9867yA(this);
            }
            c9867yA = this.keyboardState;
        }
        return c9867yA;
    }

    @Override // o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        if (isLoadingData() || eVar == null) {
            this.mLoadingStatusCallback = eVar;
        } else {
            eVar.c(InterfaceC1078Nw.aJ);
        }
    }

    public void onLoaded(Status status) {
        InterfaceC1077Nv.e eVar = this.mLoadingStatusCallback;
        if (eVar != null) {
            eVar.c(status);
        }
    }

    public void reportPresentationSessionStart(AppView appView) {
        Long put;
        if (appView == null) {
            C1044Mm.d(TAG, "reportPresentationSessionStart:: view is NULL!");
            return;
        }
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new Presentation(appView, getDataContext()));
        if (startSession == null || (put = this.mPresentationSessionMap.put(appView.name(), startSession)) == null) {
            return;
        }
        C1044Mm.j(TAG, "We had older session that we removed!");
        logger.endSession(Session.createSessionCanceledEvent(put));
    }

    public void reportPresentationSessionEnded(AppView appView) {
        Logger.INSTANCE.endSession(removePresentationSessionId(appView));
    }

    public void hideActionAndBottomBars() {
        hideActionBar();
        if (getBottomNavBar() == null || !getBottomNavBar().g()) {
            return;
        }
        getBottomNavBar().b(true);
        onPaddingChanged();
    }

    private void hideActionBar() {
        NetflixActionBar netflixActionBar = this.netflixActionBar;
        if (netflixActionBar == null || !netflixActionBar.l()) {
            return;
        }
        this.netflixActionBar.a(true);
    }

    public void showActionAndBottomBars() {
        showActionBar();
        if (getBottomNavBar() == null || getBottomNavBar().g()) {
            return;
        }
        getBottomNavBar().d(true);
        onPaddingChanged();
    }

    private void showActionBar() {
        NetflixActionBar netflixActionBar = this.netflixActionBar;
        if (netflixActionBar == null || netflixActionBar.l() || !canShowActionBar()) {
            return;
        }
        this.netflixActionBar.c(true);
    }

    @Override // o.InterfaceC8018dcU
    public void onPlayVerified(boolean z, Object obj) {
        throw new IllegalStateException(String.format("onPlayVerified vault: %s", obj));
    }

    @Override // o.InterfaceC8018dcU
    public void onOfflineDownloadPinAndAgeVerified(boolean z, Object obj) {
        throw new IllegalStateException(String.format("onPlayVerified vault: %s", obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomerSupportCallEnded() {
        removeFab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleErrorDialog() {
        if (this.isVisible) {
            C1044Mm.e(TAG, "Display error dialog");
            displayErrorDialogIfExist();
            return;
        }
        C1044Mm.e(TAG, "Not visible, can not display error dialog");
    }

    public boolean displayErrorDialogIfExist() {
        return displayErrorDialogIfExist(getServiceManager());
    }

    private boolean displayErrorDialogIfExist(final ServiceManager serviceManager) {
        InterfaceC5128bss n;
        final InterfaceC1905aSp b;
        if (serviceManager == null || (n = serviceManager.n()) == null || (b = n.b()) == null) {
            return false;
        }
        if (b.a() != null) {
            C1044Mm.e(TAG, "Display error dialog");
            SY.e c2 = C1163Rc.c(this, this.handler, b.a(), new Runnable() { // from class: com.netflix.mediaclient.android.activity.NetflixActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    serviceManager.n().e(b);
                }
            });
            reportPresentationSessionStart(AppView.errorDialog);
            synchronized (this.visibleDialogLock) {
                if (C8054ddD.l(this)) {
                    return false;
                }
                Dialog dialog = this.visibleDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                SY d = c2.d();
                d.show();
                C1163Rc.b(d);
                this.visibleDialog = d;
                return true;
            }
        }
        C1044Mm.d(TAG, "Unable to display an error dialog, data not found!");
        return false;
    }

    private void filterDeadObjectException(Throwable th) {
        boolean z = th.getCause() instanceof DeadObjectException;
        C1044Mm.b(TAG, th, "Failed to show error dialog. Dead object: %b", Boolean.valueOf(z));
        if (z) {
            return;
        }
        InterfaceC1598aHf.a(new C1596aHd().d(th));
    }

    protected int getSlidingOutTransition() {
        return C8150deu.h() ? R.d.e : R.d.c;
    }

    protected int getSlidingInTransition() {
        return C8150deu.h() ? R.d.a : R.d.d;
    }

    public void showDebugToast(String str) {
        C9720vi.a(this, str);
    }

    public static InterfaceC4208baF getOfflineAgentOrNull(NetflixActivity netflixActivity) {
        ServiceManager c2 = ServiceManager.c(netflixActivity);
        if (c2 != null) {
            return c2.t();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == MP.a) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra(EXTRA_DL_PLAYABLE_ID);
                VideoType create = VideoType.create(intent.getStringExtra(EXTRA_DL_VIDEO_TYPE_STRING));
                InterfaceC4208baF offlineAgentOrNull = getOfflineAgentOrNull(this);
                if (offlineAgentOrNull != null) {
                    offlineAgentOrNull.b(new CreateRequest(stringExtra, create, PlayContextImp.f13167o));
                    return;
                }
                return;
            }
        } else if (i == MP.h) {
            ((bXE) C1332Xp.b(bXE.class)).a(i2);
        } else if (i == 23) {
            C1044Mm.c(TAG, "onActivityResult: IN_APP_UPDATE_REQUEST_CODE %d", Integer.valueOf(i2));
            this.mAppUpdateHandler.c(this, i2);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void requestDownloadButtonRefresh(String str) {
        InterfaceC7216cry interfaceC7216cry = this.activityPageOfflineAgentListener;
        if (interfaceC7216cry == null || str == null) {
            return;
        }
        interfaceC7216cry.b(this, str);
    }

    public void flushPerformanceProfilerEvents() {
        if (this.serviceManagerInstance.z()) {
            PerformanceProfilerImpl.INSTANCE.b();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        applyOverrideConfiguration(C8310dhv.a(new Configuration(), getCurrentLocale(context)));
        SplitCompat.install(this);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(C8310dhv.a(configuration, getCurrentLocale(getBaseContext())));
    }

    @Deprecated
    protected ContextWrapper wrapContextLocale(Context context) {
        return C8310dhv.e(context, getCurrentLocale(context));
    }

    private Locale getCurrentLocale(Context context) {
        Locale c2;
        if (C8126deW.e(context)) {
            return cVB.b(context);
        }
        return (!((NL) C1332Xp.b(NL.class)).e() || (c2 = ((NL) C1332Xp.b(NL.class)).c(context)) == null) ? C4984bqG.b.e(context).c() : c2;
    }

    public void startRenderNavigationLevelSession() {
        if (this.renderSession != null || Logger.INSTANCE.existExclusiveSession("RenderNavigationLevel")) {
            if (!C8067ddQ.c() && !C8141del.a()) {
                AppView uiScreen = getUiScreen();
                StringBuilder sb = new StringBuilder();
                sb.append("RenderNavigationLevel: Cancelling the current session in progress. view=");
                sb.append(uiScreen == null ? "null" : uiScreen.name());
                InterfaceC1598aHf.a(new C1596aHd(sb.toString()).b(false));
            }
            endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
        }
        boolean b = this.profileApi.d().b();
        if (isFirstRenderNavigationLevelForProcess) {
            isFirstRenderNavigationLevelForProcess = false;
            this.renderSession = new RenderNavigationLevel(Long.valueOf(NetflixApplication.getInstance().g()), null, null, AppStartType.cold, null, Boolean.valueOf(b), null);
        } else {
            this.renderSession = new RenderNavigationLevel(null, null, null, null, null, Boolean.valueOf(b), null);
        }
        Logger.INSTANCE.startSession(this.renderSession);
    }

    public void endRenderNavigationLevelSession(IClientLogging.CompletionReason completionReason, Status status) {
        if (this.renderSession == null) {
            C1044Mm.e(TAG, "EndRenderNavigationLevelSession: No start render session in progress");
            return;
        }
        int i = AnonymousClass9.b[completionReason.ordinal()];
        if (i == 1) {
            ExtLogger.INSTANCE.endExclusiveAction("RenderNavigationLevel");
        } else if (i == 2) {
            ExtLogger.INSTANCE.cancelExclusiveAction("RenderNavigationLevel");
        } else {
            ExtLogger.INSTANCE.failedExclusiveAction("RenderNavigationLevel", C8169dfM.b(status));
        }
        this.renderSession = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.android.activity.NetflixActivity$9  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[IClientLogging.CompletionReason.values().length];
            b = iArr;
            try {
                iArr[IClientLogging.CompletionReason.success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[IClientLogging.CompletionReason.canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[IClientLogging.CompletionReason.failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DismissingDialogConfig.values().length];
            e = iArr2;
            try {
                iArr2[DismissingDialogConfig.dismissOnStop.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[DismissingDialogConfig.doNotDismissOnStop.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[DismissingDialogConfig.doNotDismissOnStopOnce.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void logMetadataRenderedEvent(boolean z) {
        RenderNavigationLevel renderNavigationLevel = this.renderSession;
        if (renderNavigationLevel != null) {
            Logger.INSTANCE.logEvent(z ? new CachedMetadataRendered(Long.valueOf(renderNavigationLevel.getId())) : new MetadataRendered(Long.valueOf(renderNavigationLevel.getId())));
        }
    }

    public boolean shouldAddSystemBarBackgroundViews() {
        return (getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024 && getTheme().resolveAttribute(C9834xU.b.s, new TypedValue(), false);
    }

    protected int getFragmentBottomPadding() {
        int bottomNavBarHeight = getBottomNavBarHeight();
        NetflixMdxController netflixMdxController = this.netflixMdxController;
        return bottomNavBarHeight + (netflixMdxController != null ? netflixMdxController.a() : 0);
    }

    public void onPaddingChanged() {
        NetflixMdxController netflixMdxController = this.netflixMdxController;
        boolean z = true;
        if (netflixMdxController != null) {
            C9867yA c9867yA = this.keyboardState;
            netflixMdxController.d(c9867yA != null && c9867yA.d());
        }
        C9867yA c9867yA2 = this.keyboardState;
        if (c9867yA2 == null || !c9867yA2.d()) {
            z = false;
        }
        C8076ddZ.a(this, z);
        this.fragmentHelper.a(getStatusBarHeight(), this.actionBarHeight, getGlobalNavStickyHeaderHeight(), getFragmentBottomPadding());
        View findViewById = findViewById(R.g.bU);
        if (findViewById != null) {
            C9870yD.d(findViewById, 3, getBottomNavBarHeight());
        }
    }

    public int getStatusBarHeight() {
        SQ sq = this.statusBarBackground;
        if (sq == null) {
            return 0;
        }
        return sq.getMeasuredHeight() > 0 ? this.statusBarBackground.getMeasuredHeight() : this.savedStatusBarHeight;
    }

    public void setFragmentPadding(Fragment fragment) {
        if (fragment instanceof NetflixFrag) {
            ((NetflixFrag) fragment).d(getStatusBarHeight(), getActionBarHeight(), getGlobalNavStickyHeaderHeight(), getFragmentBottomPadding());
        }
    }

    public boolean handleAppUpdateNeed(boolean z) {
        if (C8159dfC.b()) {
            return false;
        }
        return this.mAppUpdateHandler.e(this, z);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        C9935zP.d(this).b(AbstractC1073Nr.class, z ? AbstractC1073Nr.a.b : AbstractC1073Nr.b.e);
    }

    public boolean badInstallation() {
        return C4145bXx.b.c();
    }

    public void showMissingSplitError() {
        C4145bXx.b.d(this);
    }

    public void showDeviceSheet() {
        if (C8076ddZ.e(this)) {
            C8076ddZ.d(this, showMdxInMenu(), hasBottomNavBar(), this.serviceManagerInstance);
        }
    }

    public void updateCdxIconMenu() {
        if (C8076ddZ.e(this) && showMdxInMenu()) {
            invalidateOptionsMenu();
        }
    }

    public void setupCdxControllerSheet() {
        if (C8076ddZ.e(this)) {
            C8076ddZ.b(this, showMdxInMenu(), hasBottomNavBar(), this.serviceManagerInstance);
        }
    }

    public void onScrolled(int i) {
        if (C8076ddZ.e(this)) {
            C8076ddZ.e(this, i);
        }
    }

    public void profileAnimationCompleted() {
        if (C8076ddZ.e(this)) {
            C8076ddZ.b(this);
        }
    }

    private void A(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$26284);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
