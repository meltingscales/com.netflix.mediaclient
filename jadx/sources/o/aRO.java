package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyContentPlaygraph;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyInitialRequestSize;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyKeepConnectionOnCancel;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyLocalMoments;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyLolomoRowIcon;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyMdxMediaVolume;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ABPerformanceTraceSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AdaptiveSearchPreQuery;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AllowHevc;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AmazonSingup;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AndroidGamesCustomPlayStoreUrl;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AnimatedSplashScreen;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AutoLogin;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_BaselineUIPart1Complete;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CLHandledExceptionSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CategoriesRowExplicitAllocation;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cdx;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cfour;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CfourSettingsScreenLinkEnabled_CfourPlan;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CfourSettingsScreenLinkEnabled_RegularPlan;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ComedyFeed;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ComedyFeedAsARowHoldback;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ConsumptionOnlyHelpCenter;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CurrentEpisodeForAgeDialog;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DarkKidsTheme;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ddr;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DisplayCutoutDisable;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DownloadsEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DpHawkinsBadges;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableBaselineAdultProfileAnimation;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableCTAsForGamesBillboardOnTablet;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableExtremePipRatio;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableFalkorLolomoImagesPrefetchHelper;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableLottieRemindMeIcons;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableTrailersMVP3ForKids;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_FixAccountPageRefresh;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ftl;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GameController;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GameControllerMagicPath;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Games;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GamesInMyList;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_HomepageNuxKillSwitch;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive_Data;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive_Prefetch;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_IpProbing;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_KidsBrandRealignment;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_LearnMoreConfirmCompose;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_LocaleSpecificSharing;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Localization;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MSLTransport;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxDiscoveryLogging;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxOnlyDeviceEsnPrefixes;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxPinLogin;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MediaResourceConstraints;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MhuMisdetection;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MobileOnly;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MyListActionsUsingGraphQL;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MyNetflix;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NetworkProbing;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NgpConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NonMemberUiLatencyTracker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OfflineRecovery;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OnboardingTweaks;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PartnerPlaybackTests;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PaymentPickerPhoneMopLogos;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PerfProfilerDebugEventLoggingSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PerfProfilerDebugSessionLoggingSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayApiPlaybackLogs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayIntegrity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackFallback;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackSpecificationDiagnostics;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayerUI;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PushConsentOnRemindMe;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_QoE_Metrics;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RecordRdid;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RefreshUmaPreProfile;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyCL;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyLogblobs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyPds;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SearchOnNapaHoldback;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SendServiceTokensPolicy;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ServiceTokenCAD;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SimplifiedPlayerEpisodesListRepo;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SimplifiedProfileSpinnerAmazon;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmartDisplay;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmartLockConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmsOtpVersionCheck;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_TabletopModeDisable;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_VideoMerchAutoPlayProfileLevelSetting;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_WidevineFailureHandling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Zuul;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_forceAllowPip;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_isFoldableModel;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_xHEAAC;

@Deprecated
/* loaded from: classes.dex */
public class aRO {
    public static void a() {
        C1822aPn.d(Config_FastProperty_Ftl.class, Config_FastProperty_Interactive.class, Config_FastProperty_Interactive_Data.class, Config_FastProperty_Interactive_Prefetch.class, Config_FastProperty_RetryPolicyCL.class, Config_FastProperty_RetryPolicyLogblobs.class, Config_FastProperty_RetryPolicyPds.class, Config_FastProperty_ServiceTokenCAD.class, Config_FastProperty_PlaybackFallback.class, Config_FastProperty_QoE_Metrics.class, Config_FastProperty_MobileOnly.class, Config_FastProperty_OfflineRecovery.class, Config_FastProperty_MdxOnlyDeviceEsnPrefixes.class, Config_FastProperty_MdxDiscoveryLogging.class, Config_FastProperty_SendServiceTokensPolicy.class, Config_FastProperty_xHEAAC.class, Config_FastProperty_PlaybackSpecificationDiagnostics.class, Config_FastProperty_MSLTransport.class, Config_FastProperty_CurrentEpisodeForAgeDialog.class, Config_FastProperty_VideoMerchAutoPlayProfileLevelSetting.class, Config_FastProperty_WidevineFailureHandling.class, Config_FastProperty_AutoLogin.class, Config_FastProperty_Crypto.class, Config_FastProperty_PlayerUI.class, ConfigFastPropertyFeatureControlConfig.class, Config_FastProperty_SmsOtpVersionCheck.class, Config_FastProperty_AndroidGamesCustomPlayStoreUrl.class, Config_FastProperty_LearnMoreConfirmCompose.class, Config_FastProperty_FixAccountPageRefresh.class, Config_FastProperty_EnableTrailersMVP3ForKids.class, Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade.class, Config_FastProperty_RecordRdid.class, Config_FastProperty_MhuMisdetection.class, Config_FastProperty_OauthTwoViaBrowser.class, Config_FastProperty_EnableBaselineAdultProfileAnimation.class, Config_FastProperty_EnableLottieRemindMeIcons.class, Config_FastProperty_PushConsentOnRemindMe.class, Config_FastProperty_DpHawkinsBadges.class, Config_FastProperty_SimplifiedProfileSpinnerAmazon.class, Config_FastProperty_ConsumptionOnlyHelpCenter.class, Config_FastProperty_LocaleSpecificSharing.class, Config_FastProperty_DarkKidsTheme.class, Config_FastProperty_NonMemberUiLatencyTracker.class, Config_FastProperty_ABPerformanceTraceSampling.class, Config_FastProperty_CLHandledExceptionSampling.class, Config_FastProperty_PerfProfilerDebugSessionLoggingSampling.class, Config_FastProperty_PerfProfilerDebugEventLoggingSampling.class, Config_FastProperty_SmartDisplay.class, Config_FastProperty_MdxPinLogin.class, ConfigFastPropertyMdxMediaVolume.class, Config_FastProperty_PlayApiPlaybackLogs.class, Config_FastProperty_SearchOnNapaHoldback.class, Config_FastProperty_PaymentPickerPhoneMopLogos.class, Config_FastProperty_AmazonSingup.class, Config_FastProperty_PlaybackConfig.class, Config_FastProperty_Mdx.class, Config_FastProperty_OnboardingTweaks.class, Config_FastProperty_DisplayCutoutDisable.class, Config_FastProperty_SmartLockConfig.class, Config_FastProperty_MdxEnabledViaFeatureConfig.class, Config_FastProperty_DownloadsEnabledViaFeatureConfig.class, Config_FastProperty_Localization.class, Config_FastProperty_NgpConfig.class, Config_FastProperty_NetworkProbing.class, Config_FastProperty_ComedyFeed.class, Config_FastProperty_HomepageNuxKillSwitch.class, Config_FastProperty_RefreshUmaPreProfile.class, ConfigFastPropertyContentPlaygraph.class, Config_FastProperty_GameController.class, Config_FastProperty_ComedyFeedAsARowHoldback.class, Config_FastProperty_EnableFalkorLolomoImagesPrefetchHelper.class, ConfigFastPropertyInitialRequestSize.class, Config_FastProperty_Cfour.class, Config_FastProperty_Ddr.class, Config_FastProperty_TabletopModeDisable.class, ConfigFastPropertyC4PlayerControls.class, Config_FastProperty_CfourSettingsScreenLinkEnabled_RegularPlan.class, Config_FastProperty_CfourSettingsScreenLinkEnabled_CfourPlan.class, Config_FastProperty_AnimatedSplashScreen.class, ConfigFastPropertyKeepConnectionOnCancel.class, Config_FastProperty_KidsBrandRealignment.class, Config_FastProperty_IpProbing.class, Config_FastProperty_AllowHevc.class, Config_FastProperty_GameControllerMagicPath.class, Config_FastProperty_AdaptiveSearchPreQuery.class, Config_FastProperty_Zuul.class, Config_FastProperty_CategoriesRowExplicitAllocation.class, Config_FastProperty_Cdx.class, Config_FastProperty_BaselineUIPart1Complete.class, Config_FastProperty_PlayIntegrity.class, Config_FastProperty_forceAllowPip.class, Config_FastProperty_isFoldableModel.class, Config_FastProperty_SimplifiedPlayerEpisodesListRepo.class, Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError.class, Config_FastProperty_EnableExtremePipRatio.class, Config_FastProperty_MyNetflix.class, ConfigFastPropertyLocalMoments.class, ConfigFastPropertyLolomoRowIcon.class, Config_FastProperty_GamesInMyList.class, Config_FastProperty_Games.class, Config_FastProperty_MyListActionsUsingGraphQL.class, Config_FastProperty_PartnerPlaybackTests.class, Config_FastProperty_MediaResourceConstraints.class, Config_FastProperty_EnableCTAsForGamesBillboardOnTablet.class);
    }

    public static void a(Context context) {
        try {
            C1822aPn.c(C1819aPk.d(context));
        } catch (RuntimeException e) {
            C1819aPk.b(context);
            InterfaceC1597aHe.b(new C1596aHd("Error loading FP config").b(ErrorType.g).d(e));
        }
    }
}
