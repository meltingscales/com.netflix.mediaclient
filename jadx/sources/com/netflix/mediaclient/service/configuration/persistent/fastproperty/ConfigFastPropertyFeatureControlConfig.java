package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8151dev;
import o.C8627dsp;
import o.C8632dsu;
import o.aRT;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyFeatureControlConfig extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("confidentialVideoExpiration")
    private String confidentialVideoExpiration;
    @SerializedName("disableAvifDecoder")
    private boolean disableAvifDecoder;
    @SerializedName("isDetailsSheetForGameRatingsEnabled")
    private boolean isDetailsSheetForGameRatingsEnabled;
    @SerializedName("myCoolFeatureOn")
    private boolean myCoolFeatureOn = true;
    @SerializedName("playEventRepoConfig")
    private aRT playEventRepoFeatureConfig = new aRT();
    @SerializedName("forceActivateOnFg")
    private boolean forceActivateOnFg = true;
    @SerializedName("mdxDevicePersistForced")
    private boolean mdxDevicePersistForced = true;
    @SerializedName("isDefaultToPQS")
    private boolean isDefaultToPQS = true;
    @SerializedName("isViewPortTtrTrackingEnabled")
    private boolean isViewPortTtrTrackingEnabled = true;
    @SerializedName("isAppExitLoggingEnabled")
    private boolean isAppExitLoggingEnabled = true;
    @SerializedName("isSecondaryLanguagesEnabled")
    private boolean isSecondaryLanguagesEnabled = true;
    @SerializedName("isLaunchActivityRecreateFixEnabled")
    private boolean isLaunchActivityRecreateFixEnabled = true;
    @SerializedName("isSystemPerformanceTraceAtStartup")
    private boolean isSystemPerformanceTraceAtStartup = true;
    @SerializedName("isGenreProminenceEnabled")
    private boolean isGenreProminenceEnabled = true;
    @SerializedName("isAndroidSearchLolomoEnabled")
    private boolean isAndroidSearchLolomoEnabled = true;
    @SerializedName("isSearchLolomoEnabledOnTablet")
    private boolean isSearchLolomoEnabledOnTablet = true;
    @SerializedName("enableLaunchActivityFix")
    private boolean enableLaunchActivityFix = true;
    @SerializedName("requireNetworkForPushNotifications")
    private boolean requireNetworkForPushNotifications = true;
    @SerializedName("sendLegacyNetworkPerfTrace")
    private boolean sendLegacyNetworkPerfTrace = true;
    @SerializedName("sendDataAccessPerfTrace")
    private boolean sendDataAccessPerfTrace = true;
    @SerializedName("scrollableTabBarRestoreSkip")
    private boolean scrollableTabBarRestoreSkip = true;
    @SerializedName("isCatchAllBugsnagLoggingEnabled")
    private boolean isCatchAllBugsnagLoggingEnabled = true;
    @SerializedName("isTriviaQuestInGamesRowEnabled")
    private boolean isTriviaQuestInGamesRowEnabled = true;
    @SerializedName("stopSelfOnBGErrors")
    private boolean stopOnBackgroundErrors = true;
    @SerializedName("enableSupportsDetach")
    private boolean enableSupportsDetach = true;
    @SerializedName("enableProfileChangeRenoEventHandling")
    private boolean enableProfileChangeRenoEventHandling = true;
    @SerializedName("enableNotificationPermission")
    private boolean enableNotificationPermission = true;
    @SerializedName("enableNotificationPermissionInSettings")
    private boolean enableNotificationPermissionInSettings = true;
    @SerializedName("enablePlaybackInterstitials")
    private boolean enablePlaybackInterstitials = true;
    @SerializedName("enableAds3P")
    private boolean enableAds3P = true;
    @SerializedName("showSpatialAudioBadge")
    private boolean showSpatialAudioBadge = true;
    @SerializedName("isHomepageNUXV2")
    private boolean isHomepageNUXV2 = true;
    @SerializedName("ab49591HomeAndSearchTooltipEnabled")
    private boolean ab49591HomeAndSearchTooltipEnabled = true;
    @SerializedName("ab49591CWTooltipEnabled")
    private boolean ab49591CWTooltipEnabled = true;
    @SerializedName("detailsHelperDetachEnabled")
    private boolean detailsHelperDetachEnabled = true;
    @SerializedName("enableLogblobCrashReport")
    private boolean enableLogblobCrashReport = true;
    @SerializedName("enableActionBarPaddingFix")
    private boolean enableActionBarPaddingFix = true;
    @SerializedName("refreshLolomoOnMismatchedRowException")
    private boolean refreshLolomoOnMismatchedRowException = true;
    @SerializedName("brotliEnabled")
    private boolean brotliEnabled = true;
    @SerializedName("localMomentsRefinementEnabled")
    private boolean localMomentsRefinementEnabled = true;
    @SerializedName("enableProfileGateUiBugFix")
    private boolean enableProfileGateUiBugFix = true;
    @SerializedName("myListGraphql")
    private boolean enableMyListGraphql = true;
    @SerializedName("lolomoRowTitle")
    private boolean lolomoRowTitle = true;

    public static final boolean enableProfileGateUiBugFix() {
        return Companion.k();
    }

    public final boolean getBrotliEnabled() {
        return this.brotliEnabled;
    }

    public final String getConfidentialVideoExpiration() {
        return this.confidentialVideoExpiration;
    }

    public final boolean getDetailsHelperDetachEnabled() {
        return this.detailsHelperDetachEnabled;
    }

    public final boolean getDisableAvifDecoder() {
        return this.disableAvifDecoder;
    }

    public final boolean getEnableActionBarPaddingFix() {
        return this.enableActionBarPaddingFix;
    }

    public final boolean getEnableAds3P() {
        return this.enableAds3P;
    }

    public final boolean getEnableLaunchActivityFix() {
        return this.enableLaunchActivityFix;
    }

    public final boolean getEnableLogblobCrashReport() {
        return this.enableLogblobCrashReport;
    }

    public final boolean getEnableNotificationPermission() {
        return this.enableNotificationPermission;
    }

    public final boolean getEnableNotificationPermissionInSettings() {
        return this.enableNotificationPermissionInSettings;
    }

    public final boolean getEnablePlaybackInterstitials() {
        return this.enablePlaybackInterstitials;
    }

    public final boolean getEnableProfileChangeRenoEventHandling() {
        return this.enableProfileChangeRenoEventHandling;
    }

    public final boolean getEnableProfileGateUiBugFix() {
        return this.enableProfileGateUiBugFix;
    }

    public final boolean getEnableSupportsDetach() {
        return this.enableSupportsDetach;
    }

    public final boolean getForceActivateOnFg() {
        return this.forceActivateOnFg;
    }

    public final boolean getLocalMomentsRefinementEnabled() {
        return this.localMomentsRefinementEnabled;
    }

    public final boolean getLolomoRowTitle() {
        return this.lolomoRowTitle;
    }

    public final boolean getMdxDevicePersistForced() {
        return this.mdxDevicePersistForced;
    }

    @Override // o.aRW
    public String getName() {
        return "feature_control_config";
    }

    public final aRT getPlayEventRepoFeatureConfig() {
        return this.playEventRepoFeatureConfig;
    }

    public final boolean getRefreshLolomoOnMismatchedRowException() {
        return this.refreshLolomoOnMismatchedRowException;
    }

    public final boolean getRequireNetworkForPushNotifications() {
        return this.requireNetworkForPushNotifications;
    }

    public final boolean getScrollableTabBarRestoreSkip() {
        return this.scrollableTabBarRestoreSkip;
    }

    public final boolean getSendDataAccessPerfTrace() {
        return this.sendDataAccessPerfTrace;
    }

    public final boolean getSendLegacyNetworkPerfTrace() {
        return this.sendLegacyNetworkPerfTrace;
    }

    public final boolean getShowSpatialAudioBadge() {
        return this.showSpatialAudioBadge;
    }

    public final boolean getStopOnBackgroundErrors() {
        return this.stopOnBackgroundErrors;
    }

    public final boolean isAppExitLoggingEnabled() {
        return this.isAppExitLoggingEnabled;
    }

    public final boolean isCatchAllBugsnagLoggingEnabled() {
        return this.isCatchAllBugsnagLoggingEnabled;
    }

    public final boolean isDefaultToPQS() {
        return this.isDefaultToPQS;
    }

    public final boolean isDetailsSheetForGameRatingsEnabled() {
        return this.isDetailsSheetForGameRatingsEnabled;
    }

    public final boolean isGenreProminenceEnabled() {
        return this.isGenreProminenceEnabled;
    }

    public final boolean isHomepageNUXV2() {
        return this.isHomepageNUXV2;
    }

    public final boolean isLaunchActivityRecreateFixEnabled() {
        return this.isLaunchActivityRecreateFixEnabled;
    }

    public final boolean isSearchLolomoEnabledOnTablet() {
        return this.isSearchLolomoEnabledOnTablet;
    }

    public final boolean isSecondaryLanguagesEnabled() {
        return this.isSecondaryLanguagesEnabled;
    }

    public final boolean isSystemPerformanceTraceAtStartup() {
        return this.isSystemPerformanceTraceAtStartup;
    }

    public final boolean isTriviaQuestInGamesRowEnabled() {
        return this.isTriviaQuestInGamesRowEnabled;
    }

    public final boolean isViewPortTtrTrackingEnabled() {
        return this.isViewPortTtrTrackingEnabled;
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final ConfigFastPropertyFeatureControlConfig n() {
            aRW b = C1822aPn.b("feature_control_config");
            C8632dsu.a(b, "");
            return (ConfigFastPropertyFeatureControlConfig) b;
        }

        public final aRT s() {
            return n().getPlayEventRepoFeatureConfig();
        }

        public final boolean b() {
            return n().getForceActivateOnFg();
        }

        public final boolean I() {
            return n().getMdxDevicePersistForced();
        }

        public final boolean p() {
            return n().isDefaultToPQS();
        }

        public final boolean z() {
            return n().isViewPortTtrTrackingEnabled();
        }

        public final boolean r() {
            return n().isAppExitLoggingEnabled();
        }

        public final boolean x() {
            return n().isSecondaryLanguagesEnabled();
        }

        public final boolean w() {
            return n().isLaunchActivityRecreateFixEnabled();
        }

        public final boolean y() {
            return n().isSystemPerformanceTraceAtStartup();
        }

        public final boolean t() {
            return n().isGenreProminenceEnabled() && !C8151dev.f();
        }

        public final boolean C() {
            return n().isSearchLolomoEnabledOnTablet() && C8151dev.f();
        }

        public final boolean v() {
            return n().getEnableLaunchActivityFix();
        }

        public final boolean A() {
            return n().isTriviaQuestInGamesRowEnabled();
        }

        public final boolean q() {
            return n().isDetailsSheetForGameRatingsEnabled();
        }

        public final boolean G() {
            return n().getStopOnBackgroundErrors();
        }

        public final boolean l() {
            return n().getEnableSupportsDetach();
        }

        public final boolean m() {
            return n().getEnableProfileChangeRenoEventHandling();
        }

        public final boolean i() {
            return n().getEnableNotificationPermission();
        }

        public final boolean j() {
            return i() && n().getEnableNotificationPermissionInSettings();
        }

        public final boolean f() {
            return n().getEnablePlaybackInterstitials();
        }

        public final boolean e() {
            return n().getEnableAds3P();
        }

        public final boolean H() {
            return n().getShowSpatialAudioBadge();
        }

        public final boolean a() {
            return n().getDisableAvifDecoder();
        }

        public final boolean u() {
            return n().isHomepageNUXV2();
        }

        public final boolean d() {
            return n().getDetailsHelperDetachEnabled();
        }

        public final boolean h() {
            return n().getEnableLogblobCrashReport();
        }

        public final boolean c() {
            return n().getEnableActionBarPaddingFix();
        }

        public final boolean E() {
            return n().getRefreshLolomoOnMismatchedRowException();
        }

        public final boolean g() {
            return n().getBrotliEnabled();
        }

        public final boolean B() {
            return n().getLocalMomentsRefinementEnabled();
        }

        public final boolean k() {
            return n().getEnableProfileGateUiBugFix();
        }

        public final boolean D() {
            return n().getLolomoRowTitle();
        }

        public final String o() {
            return n().getConfidentialVideoExpiration();
        }
    }
}
