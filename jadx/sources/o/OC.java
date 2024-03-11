package o;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.netflix.android.imageloader.api.BlurProcessor;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.common.di.CoroutinesModule;
import com.netflix.common.di.RxJavaModule;
import com.netflix.mediaclient.acquisition.SignupImpl;
import com.netflix.mediaclient.acquisition.api.Signup;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.components.faq.FaqLogger;
import com.netflix.mediaclient.acquisition.components.faq.FaqModule;
import com.netflix.mediaclient.acquisition.components.faq.FaqModule_ProvidesFaqInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.components.faq.FaqViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditText;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactoryImpl;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry_MembersInjector;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateEditText;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthEditText;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditText;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox_MembersInjector;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.planInfo.PlanInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldLifecycleData;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldLogger;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldModule;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldModule_ProvidesRegenoldInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.tou.TouViewModelInitializer;
import com.netflix.mediaclient.acquisition.di.DependencyInjectionLifecycleDataFactory;
import com.netflix.mediaclient.acquisition.di.SignupModule;
import com.netflix.mediaclient.acquisition.di.SignupModule_ProvidesEmvcoDataServiceFactory;
import com.netflix.mediaclient.acquisition.di.SignupModule_ProvidesMoneyballEntrypointFactory;
import com.netflix.mediaclient.acquisition.di.SignupModule_ProvidesSMSRetrieverManagerFactory;
import com.netflix.mediaclient.acquisition.di.SignupModule_ProvidesTtrEventListenerFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.di.SignupRetainedModule;
import com.netflix.mediaclient.acquisition.di.SignupRetainedModule_ProvidesMoneyballDataFactory;
import com.netflix.mediaclient.acquisition.di.SignupSingletonModule;
import com.netflix.mediaclient.acquisition.di.SignupSingletonModule_ProvidesStringMappingFactory;
import com.netflix.mediaclient.acquisition.di.SignupSingletonModule_ProvidesWebViewBaseUrlFactory;
import com.netflix.mediaclient.acquisition.lib.AcquisitionLibStringMappingModule;
import com.netflix.mediaclient.acquisition.lib.AcquisitionLibStringMappingModule_ProvidesStringMappingFactory;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataModule;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataModule_ProvidesFormCacheFactory;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupLibModule;
import com.netflix.mediaclient.acquisition.lib.SignupLibModule_ProvidesLoggedErrorListenerFactory;
import com.netflix.mediaclient.acquisition.lib.SignupLibSingletonModule;
import com.netflix.mediaclient.acquisition.lib.SignupLibSingletonModule_ProvidesClLoggerFactory;
import com.netflix.mediaclient.acquisition.lib.SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory;
import com.netflix.mediaclient.acquisition.lib.SignupLibSingletonModule_ProvidesExtClLoggerFactory;
import com.netflix.mediaclient.acquisition.lib.SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepoImpl;
import com.netflix.mediaclient.acquisition.lib.rdid.RecordRdidManager;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.ClientNetworkDetails;
import com.netflix.mediaclient.acquisition.lib.services.logging.RequestResponseLogger;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesLifecycleData;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesLogger;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.addProfiles.KidsProfilesFragment;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextModule_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextViewModelInitializer_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEDialogPresenter_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmLifecycleData;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoEventLogger;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyDeviceContainerViewFactory;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyLifecycleData;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyLogger;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmFragmentAb44926;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmViewModelAb44926;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmViewModelInitializer44926;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmViewModelInitializer55548;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinLifecycleData;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampForSecondaryProfilesFragmentAb53426;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampLifecycleData;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampLogger;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampModule;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampModule_ProvidesOnRampNavigatedListenerFactory;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalLifecycleData;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalLogger;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyLifecycleData;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyLogger;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyModule;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.registration.EmailPreferenceViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationLifecycleData;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageForProfileOnboardingFragmentAb53426;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageLifecycleData;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageLogger;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.signupContainer.ErrorDialogHelper;
import com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity;
import com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.upi.UpiModule;
import com.netflix.mediaclient.acquisition.screens.upi.UpiModule_ProvidesUpiWaitingInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingLogger;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeLifecycleData;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCard3dsEventLogger;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardLifecycleData;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardModule;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardModule_ProvidesThreeDsEventListenerFactory;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextEventLogger;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextModule;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextModule_VerifyCardContextClickListenerFactory;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextModule_VerifyCardContextEventListenerFactory;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLifecycleData;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiModule;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.FujiCardFragmentAb44926;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.FujiCardFragmentAb44926_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiViewModelInitializerAb44926;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import com.netflix.mediaclient.acquisition.services.logging.SignupFragmentLifecycleLogger;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import com.netflix.mediaclient.acquisition.services.logging.TtrImageObserver;
import com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager;
import com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.activity.UiServices;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.release.ReleaseNetflixApplication_HiltComponents;
import com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment;
import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import com.netflix.mediaclient.androidprovider.release.AndroidProviderImpl;
import com.netflix.mediaclient.clock.impl.ClockImpl;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagCrashReporter;
import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagErrorHandler;
import com.netflix.mediaclient.flipper.empty.NetflixFlipperEmpty;
import com.netflix.mediaclient.graphqlplatform.impl.GraphQLCacheAccountEventsHandler;
import com.netflix.mediaclient.graphqlrepo.impl.cache.ExpiryHelperImpl;
import com.netflix.mediaclient.graphqlrepo.impl.client.cache.GraphQLCacheHelperImpl;
import com.netflix.mediaclient.graphqlrepo.impl.client.loggedout.LoggedOutGraphQLRepositoryImpl;
import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.AccountScopedApolloClientConfig;
import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.ProfileScopedApolloClientConfig;
import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl;
import com.netflix.mediaclient.hendrixconfig.impl.CoreProfileConfigModule;
import com.netflix.mediaclient.hendrixconfig.impl.CoreSingletonConfigModule;
import com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule;
import com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule;
import com.netflix.mediaclient.imageloadercompose.impl.ImageLoaderComposeImpl;
import com.netflix.mediaclient.insecticide.empty.InsecticideEmpty;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.latencytracker.impl.UiLatencyMarkerImpl;
import com.netflix.mediaclient.latencytracker.impl.UiLatencyTrackerImpl;
import com.netflix.mediaclient.latencytracker.impl.UiLatencyTrackerLogger;
import com.netflix.mediaclient.libs.process.hooks.FoundationalFrameworkInitOrder;
import com.netflix.mediaclient.libs.process.impl.CoreInitModule;
import com.netflix.mediaclient.localdiscovery.impl.LocalDiscoveryProviderConfigModule;
import com.netflix.mediaclient.localdiscovery.impl.UserAgentEventsReceiver;
import com.netflix.mediaclient.log.impl.BreadcrumbLoggerImpl;
import com.netflix.mediaclient.log.impl.ErrorLoggerImpl;
import com.netflix.mediaclient.log.impl.ErrorLoggingDataCollectorImpl;
import com.netflix.mediaclient.log.impl.LoggerConfig;
import com.netflix.mediaclient.log.impl.LoggingRegistrationImpl;
import com.netflix.mediaclient.log.impl.MonitoringLoggerImpl;
import com.netflix.mediaclient.log.impl.NetflixCrashReporterImpl;
import com.netflix.mediaclient.log.impl.OutOfMemoryReporterImpl;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.media.BookmarkStoreRoom;
import com.netflix.mediaclient.net.NetflixCronetProvider;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl;
import com.netflix.mediaclient.netflixactivity.impl.ServiceManagerControllerImpl;
import com.netflix.mediaclient.profilegatepolicy.impl.ProfileGateVariantPolicyImpl;
import com.netflix.mediaclient.service.BrotliContextImpl;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.configuration.sampling.GraphQLSamplingModule;
import com.netflix.mediaclient.service.job.NetflixJobInitializer;
import com.netflix.mediaclient.service.job.NetflixJobSchedulerImpl;
import com.netflix.mediaclient.service.job.NetflixJobService;
import com.netflix.mediaclient.service.job.NetflixWorkManagerImpl;
import com.netflix.mediaclient.service.player.PlayerComponentFactory;
import com.netflix.mediaclient.service.player.capability.AndroidDevicePerformanceDelegateImpl;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.user.UserAgentListener;
import com.netflix.mediaclient.service.user.deviceupgrade.DeviceUpgradeLoginTokenManager;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.service.webclient.networkaware.NetworkAwareImpl;
import com.netflix.mediaclient.servicemgr.IClientLoggingListener;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.shakedetector.empty.ShakeDetectorEmpty;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import com.netflix.mediaclient.storage.db.RdidCtaConsentStateDatabase;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationStartupListener;
import com.netflix.mediaclient.ui.cfouracquisition.impl.CfourAcquisitionImpl;
import com.netflix.mediaclient.ui.cfouracquisition.impl.CfourStringMappingModule;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourSurveyModule;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourSurveyRetainedModule;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.collecttaste.impl.CollectTasteImpl;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag;
import com.netflix.mediaclient.ui.commander.api.TargetsDiscovery;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFactoryImpl;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.deeplink.impl.DeepLinkHandlerImpl;
import com.netflix.mediaclient.ui.deeplink.impl.DeepLinkUtilsImpl;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.details.DetailsActivityApiImpl;
import com.netflix.mediaclient.ui.details.DetailsFragmentApiImpl;
import com.netflix.mediaclient.ui.details.DetailsPagePrefetcher_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.details.DetailsUtilModule;
import com.netflix.mediaclient.ui.details.EpisodeView;
import com.netflix.mediaclient.ui.detailspage.api.DetailsPageRepository_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.ui.error.ErrorHandlerImpl;
import com.netflix.mediaclient.ui.experience.BrowseExperienceModule;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.GameRepoBeaconDataStoreModule;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.real.RealGameControllerMagicPathModule;
import com.netflix.mediaclient.ui.games.api.GamesAssetFetcher_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.games.game_details.GameDetailsActivity;
import com.netflix.mediaclient.ui.games.impl.games.GamesBottomTab_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.games.impl.games.GamesLolomoActivity;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
import com.netflix.mediaclient.ui.home.api.Home_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.home.impl.HomeTab_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding;
import com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity;
import com.netflix.mediaclient.ui.live.api.LiveStateManager_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.ui.login.LoginErrorDialogFrag;
import com.netflix.mediaclient.ui.login.LoginImpl;
import com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl;
import com.netflix.mediaclient.ui.login.OneTimePassCodeFlowModuleAb54131;
import com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131;
import com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.mediaclient.ui.lomo.CwView;
import com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinApplicationImpl;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinFlagsImpl;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinMoneyballModule;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinRetainedModule;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.miniplayer.impl.MiniPlayerUserAgentListener;
import com.netflix.mediaclient.ui.more.MoreFragment;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerActivity;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerModule;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerNavigationImpl;
import com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeApplicationStartupListener;
import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApplicationStartupListener;
import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiDataModule;
import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiEntryPointModule;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionApplicationImpl;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionApplicationStartupListener;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionHelperImpl;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionLaunchHelperImpl;
import com.netflix.mediaclient.ui.notifications.NotificationsActivity;
import com.netflix.mediaclient.ui.notifications.NotificationsUiImpl;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceApplicationImpl;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment;
import com.netflix.mediaclient.ui.offline.OfflineActivityApiImpl;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.ui.offline.OfflineApiImpl;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import com.netflix.mediaclient.ui.offline.OfflinePostplayImpl;
import com.netflix.mediaclient.ui.offline.OfflineTab_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButtonClickListener;
import com.netflix.mediaclient.ui.offline.TutorialHelperFactoryImpl;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouImpl;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment;
import com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.netflix.mediaclient.ui.player.postplay.PlayerPostPlayManagerImpl;
import com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepository_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.player.v2.PlayerRepositoryFactory_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.profile.impl.MyNetflixTab_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.profile.impl.ProfileImpl;
import com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockImpl;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl;
import com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog;
import com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog;
import com.netflix.mediaclient.ui.profiles.AddProfileFragment;
import com.netflix.mediaclient.ui.profiles.MyNetflixActivity;
import com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment;
import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment;
import com.netflix.mediaclient.ui.profiles.MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionLauncherImpl;
import com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo;
import com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment;
import com.netflix.mediaclient.ui.profiles.icons.impl.LolopiModuleImpl;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesModuleImpl;
import com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceImpl;
import com.netflix.mediaclient.ui.profileviewingrestrictions.api.ViewingRestrictionsRepository_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag;
import com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3;
import com.netflix.mediaclient.ui.search.v2.SearchRepositoryFactory_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.settings.SettingsFragment;
import com.netflix.mediaclient.ui.uma.impl.UmaApplicationImpl;
import com.netflix.mediaclient.ui.uma.impl.UmaImpl;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextTab_ActivityComponent_HiltModule;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextUserAgentListener;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment;
import com.netflix.mediaclient.ui.verifyplay.PinVerifierUserAgentListener;
import com.netflix.mediaclient.ui.voip.VoipImpl;
import com.netflix.mediaclient.util.BlockStoreClientModule;
import com.netflix.mediaclient.uxconfigclientcapabilities.api.UxConfigClientCapabilities_ActivityComponent_HiltModule;
import com.netflix.mediaclient.viewportttr.impl.ViewPortTtrTrackerImpl;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.partner.PService;
import com.netflix.profiles.ProfileControlsActivity;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import o.C1709aLi;
import o.C1711aLk;
import o.C1712aLl;
import o.C1812aPd;
import o.C1948aUe;
import o.C3869bNr;
import o.C3952bQt;
import o.C4116bWv;
import o.C6784cjo;
import o.InterfaceC4004bSr;
import o.aCA;
import o.aCD;
import o.aCH;
import o.aCW;
import o.aKS;
import o.aSY;
import o.cMC;
import o.cWS;
import org.chromium.net.ConnectionSubtype;

@DaggerGenerated
/* loaded from: classes.dex */
public final class OC {
    public static j b() {
        return new j();
    }

    /* loaded from: classes.dex */
    public static final class j {
        private BlockStoreClientModule a;
        private ApplicationContextModule b;
        private BrowseExperienceModule c;
        private CfourStringMappingModule d;
        private AcquisitionLibStringMappingModule e;
        private CoreInitModule f;
        private GameControllerModule g;
        private DetailsUtilModule h;
        private CoreSingletonConfigModule i;
        private CoroutinesModule j;
        private GraphQLSamplingModule k;
        private HendrixSingletonConfigModule l;
        private LocalDiscoveryProviderConfigModule m;
        private RealGameControllerMagicPathModule n;

        /* renamed from: o  reason: collision with root package name */
        private GameRepoBeaconDataStoreModule f13383o;
        private SignupLibSingletonModule p;
        private RxJavaModule q;
        private SignupSingletonModule t;

        private j() {
        }

        public j e(ApplicationContextModule applicationContextModule) {
            this.b = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public ReleaseNetflixApplication_HiltComponents.f d() {
            if (this.e == null) {
                this.e = new AcquisitionLibStringMappingModule();
            }
            Preconditions.checkBuilderRequirement(this.b, ApplicationContextModule.class);
            if (this.a == null) {
                this.a = new BlockStoreClientModule();
            }
            if (this.c == null) {
                this.c = new BrowseExperienceModule();
            }
            if (this.d == null) {
                this.d = new CfourStringMappingModule();
            }
            if (this.f == null) {
                this.f = new CoreInitModule();
            }
            if (this.i == null) {
                this.i = new CoreSingletonConfigModule();
            }
            if (this.j == null) {
                this.j = new CoroutinesModule();
            }
            if (this.h == null) {
                this.h = new DetailsUtilModule();
            }
            if (this.g == null) {
                this.g = new GameControllerModule();
            }
            if (this.f13383o == null) {
                this.f13383o = new GameRepoBeaconDataStoreModule();
            }
            if (this.k == null) {
                this.k = new GraphQLSamplingModule();
            }
            if (this.l == null) {
                this.l = new HendrixSingletonConfigModule();
            }
            if (this.m == null) {
                this.m = new LocalDiscoveryProviderConfigModule();
            }
            if (this.n == null) {
                this.n = new RealGameControllerMagicPathModule();
            }
            if (this.q == null) {
                this.q = new RxJavaModule();
            }
            if (this.p == null) {
                this.p = new SignupLibSingletonModule();
            }
            if (this.t == null) {
                this.t = new SignupSingletonModule();
            }
            return new t(this.e, this.b, this.a, this.c, this.d, this.f, this.i, this.j, this.h, this.g, this.f13383o, this.k, this.l, this.m, this.n, this.q, this.p, this.t);
        }
    }

    /* loaded from: classes6.dex */
    static final class k implements InterfaceC1122Pn {
        private final t d;

        private k(t tVar) {
            this.d = tVar;
        }

        @Override // o.InterfaceC8934gA
        /* renamed from: d */
        public ReleaseNetflixApplication_HiltComponents.d a() {
            return new o(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC1115Pg {
        private final t d;
        private MF e;

        private b(t tVar) {
            this.d = tVar;
        }

        @Override // o.ME
        /* renamed from: c */
        public b a(MF mf) {
            this.e = (MF) Preconditions.checkNotNull(mf);
            return this;
        }

        @Override // o.ME
        /* renamed from: d */
        public ReleaseNetflixApplication_HiltComponents.a b() {
            Preconditions.checkBuilderRequirement(this.e, MF.class);
            return new C1082c(this.d, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class s implements InterfaceC1124Pp {
        private C1567aGb b;
        private final t c;

        private s(t tVar) {
            this.c = tVar;
        }

        @Override // o.aFZ
        /* renamed from: e */
        public s d(C1567aGb c1567aGb) {
            this.b = (C1567aGb) Preconditions.checkNotNull(c1567aGb);
            return this;
        }

        @Override // o.aFZ
        /* renamed from: c */
        public ReleaseNetflixApplication_HiltComponents.i a() {
            Preconditions.checkBuilderRequirement(this.b, C1567aGb.class);
            return new p(this.c, new CoreProfileConfigModule(), new HendrixProfileConfigModule(), new InterstitialsImpl.InterstitialClientModule(), this.b);
        }
    }

    /* loaded from: classes6.dex */
    static final class g implements InterfaceC1123Po {
        private final p a;
        private final t c;

        private g(t tVar, p pVar) {
            this.c = tVar;
            this.a = pVar;
        }

        @Override // o.InterfaceC1636aIq
        /* renamed from: b */
        public ReleaseNetflixApplication_HiltComponents.j d() {
            return new n(this.c, this.a);
        }
    }

    /* loaded from: classes3.dex */
    static final class a implements InterfaceC1120Pl {
        private final t b;
        private SavedStateHandleHolder e;

        private a(t tVar) {
            this.b = tVar;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        /* renamed from: e */
        public a savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.e = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        /* renamed from: c */
        public ReleaseNetflixApplication_HiltComponents.b build() {
            Preconditions.checkBuilderRequirement(this.e, SavedStateHandleHolder.class);
            return new i(this.b, new CfourSurveyRetainedModule(), new MemberRejoinRetainedModule(), new MhuEbiDataModule(), new SignupRetainedModule(), this.e);
        }
    }

    /* loaded from: classes3.dex */
    static final class d implements InterfaceC1116Ph {
        private Activity a;
        private final i b;
        private final t e;

        private d(t tVar, i iVar) {
            this.e = tVar;
            this.b = iVar;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        /* renamed from: e */
        public d activity(Activity activity) {
            this.a = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        /* renamed from: e */
        public ReleaseNetflixApplication_HiltComponents.c build() {
            Preconditions.checkBuilderRequirement(this.a, Activity.class);
            return new e(this.e, this.b, new AddProfilesEEContextModule_Ab31697(), new CfourSurveyModule(), new DetailsPagePrefetcher_ActivityComponent_HiltModule(), new DetailsPageRepository_ActivityComponent_HiltModule(), new EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule(), new FaqModule(), new GamesAssetFetcher_ActivityComponent_HiltModule(), new GamesBottomTab_ActivityComponent_HiltModule(), new HomeTab_ActivityComponent_HiltModule(), new Home_ActivityComponent_HiltModule(), new LiveStateManager_ActivityComponent_HiltModule(), new MemberRejoinMoneyballModule(), new MhuEbiEntryPointModule(), new MyNetflixTab_ActivityComponent_HiltModule(), new MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule(), new OfflineTab_ActivityComponent_HiltModule(), new OnRampModule(), new OneTimePassCodeFlowModuleAb54131(), new PasswordOnlyModule(), new PlayerPrefetchRepository_ActivityComponent_HiltModule(), new PlayerRepositoryFactory_ActivityComponent_HiltModule(), new ProfileLockImpl.ProfileLockModule(), new ProfileLockRepositoryImpl.ProfileLockRepositoryModule(), new RegenoldModule(), new SMSRetrieverManager.SMSRetrieverModule(), new SearchRepositoryFactory_ActivityComponent_HiltModule(), new SignupLibModule(), new SignupModule(), new UpNextTab_ActivityComponent_HiltModule(), new UpiModule(), new UxConfigClientCapabilities_ActivityComponent_HiltModule(), new VerifyCardContextModule(), new VerifyCardModule(), new ViewingRestrictionsRepository_ActivityComponent_HiltModule(), new WelcomeFujiModule(), this.a);
        }
    }

    /* loaded from: classes3.dex */
    static final class l implements ReleaseNetflixApplication_HiltComponents.h.b {
        private MoneyballDataSource a;
        private final e b;
        private final i c;
        private final t d;
        private NetworkRequestResponseListener e;

        @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent.Builder
        /* renamed from: d */
        public l moneyballUpdater(NetworkRequestResponseListener networkRequestResponseListener) {
            this.e = networkRequestResponseListener;
            return this;
        }

        private l(t tVar, i iVar, e eVar) {
            this.d = tVar;
            this.c = iVar;
            this.b = eVar;
        }

        @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent.Builder
        /* renamed from: d */
        public l moneyballDataSource(MoneyballDataSource moneyballDataSource) {
            this.a = (MoneyballDataSource) Preconditions.checkNotNull(moneyballDataSource);
            return this;
        }

        @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent.Builder
        /* renamed from: b */
        public ReleaseNetflixApplication_HiltComponents.h build() {
            Preconditions.checkBuilderRequirement(this.a, MoneyballDataSource.class);
            return new m(this.d, this.c, this.b, new MoneyballDataModule(), this.a, this.e);
        }
    }

    /* loaded from: classes3.dex */
    static final class f implements ReleaseNetflixApplication_HiltComponents.e.d {
        private final t a;
        private final e c;
        private final i d;
        private Fragment e;

        private f(t tVar, i iVar, e eVar) {
            this.a = tVar;
            this.d = iVar;
            this.c = eVar;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        /* renamed from: d */
        public f fragment(Fragment fragment) {
            this.e = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        /* renamed from: c */
        public ReleaseNetflixApplication_HiltComponents.e build() {
            Preconditions.checkBuilderRequirement(this.e, Fragment.class);
            return new h(this.a, this.d, this.c, new GdpFragmentModule(), this.e);
        }
    }

    /* loaded from: classes3.dex */
    static final class y implements ReleaseNetflixApplication_HiltComponents.m.b {
        private final e a;
        private final h b;
        private final i c;
        private final t d;
        private View e;

        private y(t tVar, i iVar, e eVar, h hVar) {
            this.d = tVar;
            this.c = iVar;
            this.a = eVar;
            this.b = hVar;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        /* renamed from: c */
        public y view(View view) {
            this.e = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        /* renamed from: a */
        public ReleaseNetflixApplication_HiltComponents.m build() {
            Preconditions.checkBuilderRequirement(this.e, View.class);
            return new C(this.d, this.c, this.a, this.b, this.e);
        }
    }

    /* loaded from: classes3.dex */
    static final class x implements ReleaseNetflixApplication_HiltComponents.o.d {
        private final t a;
        private View b;
        private final e c;
        private final i d;

        private x(t tVar, i iVar, e eVar) {
            this.a = tVar;
            this.d = iVar;
            this.c = eVar;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        /* renamed from: d */
        public x view(View view) {
            this.b = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        /* renamed from: d */
        public ReleaseNetflixApplication_HiltComponents.o build() {
            Preconditions.checkBuilderRequirement(this.b, View.class);
            return new u(this.a, this.d, this.c, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class v implements ReleaseNetflixApplication_HiltComponents.n.c {
        private final t a;
        private SavedStateHandle b;
        private final i c;
        private ViewModelLifecycle e;

        private v(t tVar, i iVar) {
            this.a = tVar;
            this.c = iVar;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        /* renamed from: e */
        public v savedStateHandle(SavedStateHandle savedStateHandle) {
            this.b = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        /* renamed from: a */
        public v viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.e = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        /* renamed from: b */
        public ReleaseNetflixApplication_HiltComponents.n build() {
            Preconditions.checkBuilderRequirement(this.b, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.e, ViewModelLifecycle.class);
            return new w(this.a, this.c, this.b, this.e);
        }
    }

    /* loaded from: classes3.dex */
    static final class q implements InterfaceC1121Pm {
        private final t b;
        private Service e;

        private q(t tVar) {
            this.b = tVar;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        /* renamed from: d */
        public q service(Service service) {
            this.e = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        /* renamed from: c */
        public ReleaseNetflixApplication_HiltComponents.g build() {
            Preconditions.checkBuilderRequirement(this.e, Service.class);
            return new r(this.b, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class o extends ReleaseNetflixApplication_HiltComponents.d {
        private Provider<C6784cjo.b> a;
        private final t b;
        private final o c;
        private Provider<C3869bNr.c> d;

        private o(t tVar) {
            this.c = this;
            this.b = tVar;
            b();
        }

        private void b() {
            this.a = SingleCheck.provider(new b(this.b, this.c, 0));
            this.d = SingleCheck.provider(new b(this.b, this.c, 1));
        }

        @Override // o.InterfaceC8981gv
        public Map<Class<? extends AbstractC8899fS<?>>, InterfaceC8985gz<?, ?>> c() {
            return ImmutableMap.of(C6784cjo.class, (C3869bNr.c) this.a.get(), C3869bNr.class, this.d.get());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b<T> implements Provider<T> {
            private final int a;
            private final o b;
            private final t d;

            b(t tVar, o oVar, int i) {
                this.d = tVar;
                this.b = oVar;
                this.a = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        return (T) new C3869bNr.c() { // from class: o.OC.o.b.5
                            @Override // o.InterfaceC8985gz
                            /* renamed from: e */
                            public C3869bNr d(C3871bNt c3871bNt) {
                                return new C3869bNr(c3871bNt, (InterfaceC3862bNk) b.this.d.bC.get());
                            }
                        };
                    }
                    throw new AssertionError(this.a);
                }
                return (T) new C6784cjo.b() { // from class: o.OC.o.b.3
                    @Override // o.InterfaceC8985gz
                    /* renamed from: c */
                    public C6784cjo d(C6783cjn c6783cjn) {
                        return new C6784cjo(c6783cjn, (InterfaceC6778cji) b.this.d.bJ.get(), (InterfaceC1270Vf) b.this.d.A.get(), (InterfaceC1267Vc) b.this.d.bA.get());
                    }
                };
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.OC$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1082c extends ReleaseNetflixApplication_HiltComponents.a {
        private final C1082c a;
        private final MF b;
        private Provider<StreamingGraphQLRepositoryImpl.d> c;
        private Provider<AccountScopedApolloClientConfig> d;
        private Provider<aCW> e;
        private final t h;

        private C1082c(t tVar, MF mf) {
            this.a = this;
            this.h = tVar;
            this.b = mf;
            e(mf);
        }

        private void e(MF mf) {
            this.c = SingleCheck.provider(new a(this.h, this.a, 0));
            this.d = DoubleCheck.provider(new a(this.h, this.a, 2));
            this.e = DoubleCheck.provider(new a(this.h, this.a, 1));
        }

        @Override // o.aCG.c
        public aCG c() {
            return C1504aDt.c(this.c.get(), this.e.get());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.OC$c$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements Provider<T> {
            private final int a;
            private final t b;
            private final C1082c c;

            a(t tVar, C1082c c1082c, int i) {
                this.b = tVar;
                this.c = c1082c;
                this.a = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            return (T) new AccountScopedApolloClientConfig(ApplicationContextModule_ProvideContextFactory.provideContext(this.b.j), this.c.b, (InterfaceC1477aCt) this.b.af.get(), (InterfaceC1475aCr) this.b.bR.get(), new C1480aCw(), (InterfaceC1473aCp) this.b.bo.get());
                        }
                        throw new AssertionError(this.a);
                    }
                    return (T) C1505aDu.b((aCW.d) this.b.z.get(), (aCJ) this.c.d.get());
                }
                return (T) new StreamingGraphQLRepositoryImpl.d() { // from class: o.OC.c.a.5
                    @Override // com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl.d
                    public StreamingGraphQLRepositoryImpl a(aCW acw) {
                        return new StreamingGraphQLRepositoryImpl(a.this.b.cd(), acw, new C1480aCw());
                    }
                };
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class n extends ReleaseNetflixApplication_HiltComponents.j {
        private Provider<InterfaceC3954bQv> a;
        private Provider<InterfaceC5990cPx> b;
        private Provider<InterfaceC7242csX> c;
        private Provider<InterfaceC3724bIh> d;
        private Provider<InterfaceC3531bBh> e;
        private final n f;
        private Provider<InterfaceC7009coA> g;
        private Provider<cIM> h;
        private Provider<InterfaceC7034coa> i;
        private Provider<InterfaceC7054cov> j;
        private Provider<InterfaceC5532cAx> k;
        private Provider<InterfaceC3730bIn> l;
        private Provider<bYB> m;
        private Provider<InterfaceC1138Qd> n;

        /* renamed from: o  reason: collision with root package name */
        private final p f13385o;
        private Provider<cPO> p;
        private final t q;
        private Provider<InterfaceC7980dbj> s;
        private Provider<InterfaceC7998dcA> t;

        private n(t tVar, p pVar) {
            this.f = this;
            this.q = tVar;
            this.f13385o = pVar;
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3723bIg c() {
            return new C3723bIg(ApplicationContextModule_ProvideContextFactory.provideContext(this.q.j));
        }

        private void e() {
            this.b = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 0));
            this.e = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 1));
            this.c = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 2));
            this.d = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 3));
            this.a = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 4));
            this.g = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 5));
            this.i = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 6));
            this.j = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 7));
            this.h = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 8));
            this.k = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 9));
            this.n = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 10));
            this.l = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 11));
            this.m = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 12));
            this.s = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 13));
            this.t = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 14));
            this.p = SingleCheck.provider(new c(this.q, this.f13385o, this.f, 15));
        }

        @Override // o.InterfaceC1630aIk
        public Map<Class<? extends AbstractC8899fS<?>>, InterfaceC8985gz<?, ?>> b() {
            return ImmutableMap.builderWithExpectedSize(16).put(C5989cPw.class, this.b.get()).put(C3533bBj.class, this.e.get()).put(C7239csU.class, this.c.get()).put(C3726bIj.class, this.d.get()).put(C3952bQt.class, this.a.get()).put(C7010coB.class, this.g.get()).put(C6975cnT.class, this.i.get()).put(C7052cot.class, this.j.get()).put(cIF.class, this.h.get()).put(C5533cAy.class, this.k.get()).put(C1135Qa.class, this.n.get()).put(C3732bIp.class, this.l.get()).put(bYA.class, this.m.get()).put(C7975dbe.class, this.s.get()).put(C8002dcE.class, this.t.get()).put(cPN.class, this.p.get()).build();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class c<T> implements Provider<T> {
            private final t b;
            private final int c;
            private final n d;
            private final p e;

            c(t tVar, p pVar, n nVar, int i) {
                this.b = tVar;
                this.e = pVar;
                this.d = nVar;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.c) {
                    case 0:
                        return (T) new InterfaceC5990cPx() { // from class: o.OC.n.c.3
                            @Override // o.InterfaceC8985gz
                            /* renamed from: e */
                            public C5989cPw d(cPA cpa) {
                                return new C5989cPw(cpa, c.this.e.aj());
                            }
                        };
                    case 1:
                        return (T) new InterfaceC3531bBh() { // from class: o.OC.n.c.10
                            @Override // o.InterfaceC8985gz
                            /* renamed from: a */
                            public C3533bBj d(C3528bBe c3528bBe) {
                                return new C3533bBj(c3528bBe, DoubleCheck.lazy(c.this.e.k));
                            }
                        };
                    case 2:
                        return (T) new InterfaceC7242csX() { // from class: o.OC.n.c.7
                            @Override // o.InterfaceC8985gz
                            /* renamed from: e */
                            public C7239csU d(C7243csY c7243csY) {
                                return new C7239csU(c7243csY);
                            }
                        };
                    case 3:
                        return (T) new InterfaceC3724bIh() { // from class: o.OC.n.c.15
                            @Override // o.InterfaceC8985gz
                            /* renamed from: e */
                            public C3726bIj d(C3727bIk c3727bIk) {
                                return new C3726bIj(c3727bIk, c.this.e.U(), c.this.d.c(), (C3706bHq) c.this.b.ao.get());
                            }
                        };
                    case 4:
                        return (T) new InterfaceC3954bQv() { // from class: o.OC.n.c.13
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // o.InterfaceC3954bQv, o.InterfaceC8985gz
                            public C3952bQt d(C3952bQt.c cVar) {
                                return new C3952bQt(cVar, c.this.e.T(), new C4311bcC());
                            }
                        };
                    case 5:
                        return (T) new InterfaceC7009coA() { // from class: o.OC.n.c.11
                            @Override // o.InterfaceC7009coA, o.InterfaceC8985gz
                            /* renamed from: b */
                            public C7010coB d(C7056cox c7056cox) {
                                return new C7010coB(c7056cox, (C7003cnv) c.this.e.t.get());
                            }
                        };
                    case 6:
                        return (T) new InterfaceC7034coa() { // from class: o.OC.n.c.14
                            @Override // o.InterfaceC7034coa, o.InterfaceC8985gz
                            /* renamed from: c */
                            public C6975cnT d(C7011coC c7011coC) {
                                return new C6975cnT(c7011coC, (C6977cnV) c.this.e.r.get(), c.this.b.E());
                            }
                        };
                    case 7:
                        return (T) new InterfaceC7054cov() { // from class: o.OC.n.c.12
                            @Override // o.InterfaceC7054cov, o.InterfaceC8985gz
                            /* renamed from: c */
                            public C7052cot d(C7011coC c7011coC) {
                                return new C7052cot(c7011coC, DoubleCheck.lazy(c.this.e.n), (aDB) c.this.b.av.get(), c.this.e.Y(), c.this.b.E());
                            }
                        };
                    case 8:
                        return (T) new cIM() { // from class: o.OC.n.c.19
                            @Override // o.InterfaceC8985gz
                            /* renamed from: c */
                            public cIF d(C5836cKd c5836cKd) {
                                return new cIF(c5836cKd, DoubleCheck.lazy(c.this.e.f13386o), c.this.b.E());
                            }
                        };
                    case 9:
                        return (T) new InterfaceC5532cAx() { // from class: o.OC.n.c.5
                            @Override // o.InterfaceC8985gz
                            public C5533cAy d(C5530cAv c5530cAv) {
                                return new C5533cAy(c5530cAv);
                            }
                        };
                    case 10:
                        return (T) new InterfaceC1138Qd() { // from class: o.OC.n.c.1
                            @Override // o.InterfaceC8985gz
                            /* renamed from: c */
                            public C1135Qa d(C1137Qc c1137Qc) {
                                return new C1135Qa(c1137Qc, ApplicationContextModule_ProvideContextFactory.provideContext(c.this.b.j), c.this.e.r(), new C1479aCv());
                            }
                        };
                    case 11:
                        return (T) new InterfaceC3730bIn() { // from class: o.OC.n.c.2
                            @Override // o.InterfaceC8985gz
                            /* renamed from: b */
                            public C3732bIp d(C3729bIm c3729bIm) {
                                return new C3732bIp(c3729bIm, DoubleCheck.lazy(c.this.e.n), c.this.b.E(), c.this.e.r(), (aDB) c.this.b.av.get(), (C1567aGb) c.this.e.A.get(), (BookmarkStore) c.this.b.s.get(), c.this.e.ae());
                            }
                        };
                    case 12:
                        return (T) new bYB() { // from class: o.OC.n.c.4
                            @Override // o.InterfaceC8985gz
                            /* renamed from: c */
                            public bYA d(C4171bYw c4171bYw) {
                                return new bYA(c4171bYw, DoubleCheck.lazy(c.this.e.n), c.this.b.E(), c.this.e.r(), (aDB) c.this.b.av.get(), (C1567aGb) c.this.e.A.get(), (BookmarkStore) c.this.b.s.get(), c.this.e.ae());
                            }
                        };
                    case 13:
                        return (T) new InterfaceC7980dbj() { // from class: o.OC.n.c.8
                            @Override // o.InterfaceC8985gz
                            public C7975dbe d(C7978dbh c7978dbh) {
                                return new C7975dbe(c7978dbh, c.this.e.p(), (InterfaceC1270Vf) c.this.b.A.get(), (InterfaceC3993bSg) c.this.e.k.get(), ApplicationContextModule_ProvideContextFactory.provideContext(c.this.b.j), (C7981dbk) c.this.e.E.get());
                            }
                        };
                    case 14:
                        return (T) new InterfaceC7998dcA() { // from class: o.OC.n.c.9
                            @Override // o.InterfaceC8985gz
                            /* renamed from: c */
                            public C8002dcE d(C8049dcz c8049dcz) {
                                return new C8002dcE(c8049dcz, c.this.b.E());
                            }
                        };
                    case 15:
                        return (T) new cPO() { // from class: o.OC.n.c.6
                            @Override // o.InterfaceC8985gz
                            /* renamed from: a */
                            public cPN d(cPM cpm) {
                                return new cPN(cpm, c.this.e.aj());
                            }
                        };
                    default:
                        throw new AssertionError(this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class p extends ReleaseNetflixApplication_HiltComponents.i {
        private Provider<C1567aGb> A;
        private Provider<StreamingGraphQLRepositoryImpl.d> B;
        private final t C;
        private Provider<C7012coD> D;
        private Provider<C7981dbk> E;
        private Provider<C6004cQk> a;
        private Provider<InterfaceC1551aFm<Boolean>> b;
        private Provider<aCW.a> c;
        private Provider<InterfaceC1551aFm<String>> d;
        private Provider<InterfaceC1551aFm<Boolean>> e;
        private final HendrixProfileConfigModule f;
        private Provider<InterfaceC1551aFm<Boolean>> g;
        private final CoreProfileConfigModule h;
        private Provider<aFC> i;
        private Provider<GraphQLHomeLolomoRepositoryImpl> j;
        private Provider<bSN> k;
        private Provider<aFL> l;
        private final InterstitialsImpl.InterstitialClientModule m;
        private Provider<bZM> n;

        /* renamed from: o  reason: collision with root package name */
        private Provider<bZP> f13386o;
        private Provider<InterfaceC4051bUk> p;
        private Provider<C7014coF> q;
        private Provider<C6977cnV> r;
        private Provider<C5607cBr> s;
        private Provider<C7003cnv> t;
        private final p u;
        private Provider<InterfaceC4005bSs> v;
        private Provider<ProfileScopedApolloClientConfig> w;
        private Provider<C1555aFq> x;
        private Provider<aFR> y;
        private Provider<C4116bWv.b> z;

        private p(t tVar, CoreProfileConfigModule coreProfileConfigModule, HendrixProfileConfigModule hendrixProfileConfigModule, InterstitialsImpl.InterstitialClientModule interstitialClientModule, C1567aGb c1567aGb) {
            this.u = this;
            this.C = tVar;
            this.f = hendrixProfileConfigModule;
            this.h = coreProfileConfigModule;
            this.m = interstitialClientModule;
            a(coreProfileConfigModule, hendrixProfileConfigModule, interstitialClientModule, c1567aGb);
        }

        private C8354dim ak() {
            return new C8354dim(ApplicationContextModule_ProvideContextFactory.provideContext(this.C.j), r(), new C1479aCv(), this.A.get(), (dwU) this.C.g.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3701bHl U() {
            return new C3701bHl(r(), this.C.E(), (C3705bHp) this.C.an.get(), (C8191dfi) this.C.aU.get());
        }

        private C3728bIl ad() {
            return new C3728bIl(this.C.E());
        }

        private C3648bFq V() {
            return new C3648bFq(U(), ad());
        }

        private C3620bEp X() {
            return new C3620bEp((aLN) this.C.ak.get(), r(), (aDB) this.C.av.get(), this.A.get(), (BookmarkStore) this.C.s.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3911bPf T() {
            return new C3911bPf(r(), (aDB) this.C.av.get(), this.C.E());
        }

        private C3974bRo W() {
            return new C3974bRo(ApplicationContextModule_ProvideContextFactory.provideContext(this.C.j), DoubleCheck.lazy(this.A));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5600cBk ae() {
            return new C5600cBk(r(), (aDB) this.C.av.get(), (C8191dfi) this.C.aU.get(), (dwU) this.C.g.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bZD aa() {
            return new bZD(this.C.bp());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4136bXo al() {
            return new C4136bXo(l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4137bXp ac() {
            return new C4137bXp(al());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4132bXk ab() {
            return new C4132bXk(ac());
        }

        private C4134bXm ai() {
            return new C4134bXm(l());
        }

        private C4133bXl ah() {
            return new C4133bXl(ai());
        }

        private C4135bXn af() {
            return new C4135bXn(ah());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4107bWm Z() {
            return new C4107bWm(this.j.get(), af(), ah(), af());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6914cmL Y() {
            return new C6914cmL(r(), (aDB) this.C.av.get());
        }

        private C5608cBs ag() {
            return new C5608cBs((aLN) this.C.ak.get(), r(), (aDB) this.C.av.get(), this.A.get(), this.C.K);
        }

        private C6090cTm am() {
            return new C6090cTm((aLN) this.C.ak.get(), r(), this.A.get(), (aCN) this.C.ax.get(), (aDB) this.C.av.get(), new C1479aCv());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public cPH aj() {
            return new cPH(r(), am());
        }

        private void a(CoreProfileConfigModule coreProfileConfigModule, HendrixProfileConfigModule hendrixProfileConfigModule, InterstitialsImpl.InterstitialClientModule interstitialClientModule, C1567aGb c1567aGb) {
            this.A = InstanceFactory.create(c1567aGb);
            this.x = DoubleCheck.provider(new b(this.C, this.u, 2));
            this.d = DoubleCheck.provider(new b(this.C, this.u, 1));
            this.b = DoubleCheck.provider(new b(this.C, this.u, 3));
            this.y = new b(this.C, this.u, 4);
            this.l = DoubleCheck.provider(new b(this.C, this.u, 0));
            this.B = SingleCheck.provider(new b(this.C, this.u, 5));
            this.c = DoubleCheck.provider(new b(this.C, this.u, 6));
            this.w = DoubleCheck.provider(new b(this.C, this.u, 7));
            this.E = DoubleCheck.provider(new b(this.C, this.u, 8));
            this.f13386o = new b(this.C, this.u, 9);
            this.e = DoubleCheck.provider(new b(this.C, this.u, 10));
            this.g = DoubleCheck.provider(new b(this.C, this.u, 11));
            this.i = DoubleCheck.provider(new b(this.C, this.u, 12));
            this.s = new b(this.C, this.u, 16);
            this.j = DoubleCheck.provider(new b(this.C, this.u, 15));
            this.v = new b(this.C, this.u, 14);
            this.k = new b(this.C, this.u, 13);
            this.n = new b(this.C, this.u, 18);
            this.q = new b(this.C, this.u, 19);
            this.D = new b(this.C, this.u, 20);
            this.a = new b(this.C, this.u, 21);
            this.p = SingleCheck.provider(new b(this.C, this.u, 17));
            this.z = SingleCheck.provider(new b(this.C, this.u, 22));
            this.t = DoubleCheck.provider(new b(this.C, this.u, 23));
            this.r = DoubleCheck.provider(new b(this.C, this.u, 24));
        }

        @Override // o.C0987Kg.c
        public C0987Kg b() {
            return new C0987Kg(ApplicationContextModule_ProvideContextFactory.provideContext(this.C.j), (dwU) this.C.g.get(), this.C.bB(), this.C.E(), r());
        }

        @Override // o.MN.c, o.C6705ciO.c, o.C8130dea.b
        public InterfaceC8351dij d() {
            return ak();
        }

        @Override // o.MS
        public InterfaceC1547aFi a() {
            return this.l.get();
        }

        @Override // o.aCG.a
        public aCG r() {
            return C1507aDw.e(this.B.get(), this.c.get(), this.w.get());
        }

        @Override // o.C1564aFz.b
        public InterfaceC1545aFg j() {
            return this.x.get();
        }

        @Override // o.InterfaceC1583aGr
        public cYC t() {
            return this.E.get();
        }

        @Override // o.InterfaceC1590aGy
        public InterfaceC3645bFn e() {
            return V();
        }

        @Override // o.aGJ
        public bZB o() {
            return this.f13386o.get();
        }

        @Override // o.InterfaceC1628aIi
        public InterfaceC1636aIq q() {
            return new g(this.C, this.u);
        }

        @Override // o.aRD.d
        public InterfaceC1551aFm<Boolean> S() {
            return this.e.get();
        }

        @Override // o.aRD.d
        public InterfaceC1551aFm<Boolean> P() {
            return this.g.get();
        }

        @Override // o.aRK.b
        public InterfaceC1542aFd f() {
            return this.i.get();
        }

        @Override // o.C4985bqH.c
        public InterfaceC1547aFi g() {
            return this.l.get();
        }

        @Override // o.InterfaceC3623bEs
        public InterfaceC3619bEo y() {
            return X();
        }

        @Override // o.InterfaceC3649bFr
        public InterfaceC3645bFn x() {
            return V();
        }

        @Override // o.InterfaceC3660bGb
        public InterfaceC3663bGe v() {
            return U();
        }

        @Override // o.bNO
        public bNF u() {
            return T();
        }

        @Override // o.bNQ
        public bNL w() {
            return W();
        }

        @Override // o.bOS
        public bOT B() {
            return new bOT(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.C.j), (bNR) this.C.au.get());
        }

        @Override // o.InterfaceC3993bSg.b
        public InterfaceC3993bSg k() {
            return this.k.get();
        }

        @Override // o.InterfaceC3999bSm
        public InterfaceC3993bSg z() {
            return this.k.get();
        }

        @Override // o.InterfaceC4005bSs.c
        public InterfaceC4005bSs c() {
            return this.v.get();
        }

        @Override // o.bSG.e
        public bSG l() {
            return new bSG(this.C.bm(), this.C.bo());
        }

        @Override // o.InterfaceC4014bTa
        public bSZ C() {
            return new bSZ(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.C.j));
        }

        @Override // o.InterfaceC4057bUq
        public InterfaceC4051bUk h() {
            return this.p.get();
        }

        @Override // com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding.a
        public C4116bWv.b i() {
            return this.z.get();
        }

        @Override // com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.d
        public InterstitialClient m() {
            return bXC.e(this.m, r());
        }

        @Override // o.bZJ
        public bZB A() {
            return this.f13386o.get();
        }

        @Override // o.bZH
        public bZI D() {
            return this.n.get();
        }

        @Override // o.AbstractC6337cbR.c
        public InterfaceC5606cBq n() {
            return this.s.get();
        }

        @Override // o.InterfaceC6908cmF
        public InterfaceC6910cmH F() {
            return this.q.get();
        }

        @Override // o.InterfaceC6912cmJ
        public InterfaceC6909cmG L() {
            return this.D.get();
        }

        @Override // o.InterfaceC6957cnB
        public InterfaceC7005cnx G() {
            return Y();
        }

        @Override // o.InterfaceC7354cud
        public C7296ctY E() {
            return new C7296ctY((InterfaceC7303ctf) this.C.bh.get(), (InterfaceC7249cse) this.C.V.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.C.j), this.C.be());
        }

        @Override // o.InterfaceC5598cBi
        public InterfaceC5602cBm N() {
            return ae();
        }

        @Override // o.InterfaceC5605cBp
        public InterfaceC5606cBq M() {
            return this.s.get();
        }

        @Override // o.InterfaceC5609cBt
        public InterfaceC5603cBn K() {
            return ag();
        }

        @Override // o.InterfaceC5853cKu
        public C5845cKm H() {
            return new C5845cKm((InterfaceC5844cKl) this.C.bu.get(), (InterfaceC7303ctf) this.C.bh.get(), this.C.be(), this.A.get());
        }

        @Override // com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.b
        public InterfaceC8351dij s() {
            return ak();
        }

        @Override // o.cMM
        public cMK I() {
            return new cMK(r());
        }

        @Override // o.InterfaceC5988cPv
        public InterfaceC5984cPr R() {
            return aj();
        }

        @Override // o.InterfaceC6088cTk
        public InterfaceC6083cTf J() {
            return am();
        }

        @Override // o.InterfaceC7908daQ
        public C7904daM Q() {
            return new C7904daM(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.C.j), this.A.get());
        }

        public C7972dbb p() {
            return new C7972dbb(this.A.get());
        }

        @Override // o.InterfaceC8355din
        public InterfaceC8351dij O() {
            return ak();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b<T> implements Provider<T> {
            private final int a;
            private final p b;
            private final t e;

            b(t tVar, p pVar, int i) {
                this.e = tVar;
                this.b = pVar;
                this.a = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.a) {
                    case 0:
                        return (T) new aFL((C1567aGb) this.b.A.get(), new C1481aCx(), this.e.bD, (InterfaceC1551aFm) this.b.d.get(), (InterfaceC1551aFm) this.b.b.get(), this.b.y);
                    case 1:
                        return (T) aFE.e(this.b.f, (C1555aFq) this.b.x.get());
                    case 2:
                        return (T) C1562aFx.b(this.b.h, ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (C1567aGb) this.b.A.get(), (dwU) this.e.g.get(), ImmutableSet.of(), ImmutableSet.of());
                    case 3:
                        return (T) aFH.e(this.b.f, (C1555aFq) this.b.x.get());
                    case 4:
                        return (T) C1559aFu.a(this.b.h, (C1555aFq) this.b.x.get());
                    case 5:
                        return (T) new StreamingGraphQLRepositoryImpl.d() { // from class: o.OC.p.b.1
                            @Override // com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl.d
                            public StreamingGraphQLRepositoryImpl a(aCW acw) {
                                return new StreamingGraphQLRepositoryImpl(b.this.e.cd(), acw, new C1480aCw());
                            }
                        };
                    case 6:
                        return (T) new aCW.a((aCW.d) this.e.z.get());
                    case 7:
                        return (T) new ProfileScopedApolloClientConfig(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (C1567aGb) this.b.A.get(), (InterfaceC1477aCt) this.e.af.get(), (InterfaceC1475aCr) this.e.bR.get(), new C1480aCw(), (InterfaceC1473aCp) this.e.bo.get());
                    case 8:
                        return (T) new C7981dbk((C1567aGb) this.b.A.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 9:
                        return (T) new bZP(this.b.r(), (InterfaceC1270Vf) this.e.A.get());
                    case 10:
                        return (T) aFF.a(this.b.f, (C1555aFq) this.b.x.get());
                    case 11:
                        return (T) aFG.c(this.b.f, (C1555aFq) this.b.x.get());
                    case 12:
                        return (T) new aFC(this.b.y);
                    case 13:
                        return (T) new bSN((InterfaceC3643bFl) this.e.P.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), DoubleCheck.lazy(this.b.v));
                    case 14:
                        return (T) C4114bWt.d((GraphQLHomeLolomoRepositoryImpl) this.b.j.get(), this.b.Z());
                    case 15:
                        return (T) new GraphQLHomeLolomoRepositoryImpl((InterfaceC9638uF) this.e.aA.get(), (C1567aGb) this.b.A.get(), (aCN) this.e.ax.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), this.b.r(), GA.c(this.e.bM), (bNS) this.e.aw.get(), (aDB) this.e.av.get(), DoubleCheck.lazy(this.e.ap), DoubleCheck.lazy(this.b.s), DoubleCheck.lazy(this.e.s), this.b.aa(), this.b.al(), this.b.ac(), this.b.ab());
                    case 16:
                        return (T) new C5607cBr(this.b.ae(), (dwU) this.e.g.get());
                    case 17:
                        return (T) new InterfaceC4051bUk() { // from class: o.OC.p.b.2
                            @Override // o.InterfaceC4051bUk
                            public bTF d(C4049bUi c4049bUi, InterfaceC4004bSr interfaceC4004bSr, bSG bsg) {
                                return new bTF(c4049bUi, interfaceC4004bSr, (C1567aGb) b.this.b.A.get(), (bZI) b.this.b.n.get(), DoubleCheck.lazy(b.this.e.bh), DoubleCheck.lazy(b.this.b.q), DoubleCheck.lazy(b.this.b.D), DoubleCheck.lazy(b.this.b.a), ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), (aDB) b.this.e.av.get(), b.this.e.E(), bsg);
                            }
                        };
                    case 18:
                        return (T) new bZM((bZB) this.b.f13386o.get(), (InterfaceC1270Vf) this.e.A.get(), (InterfaceC9638uF) this.e.aA.get());
                    case 19:
                        return (T) new C7014coF(this.b.r());
                    case 20:
                        return (T) new C7012coD(this.b.r());
                    case 21:
                        return (T) new C6004cQk();
                    case 22:
                        return (T) new C4116bWv.b() { // from class: o.OC.p.b.4
                            @Override // o.C4116bWv.b
                            public C4116bWv c(String str) {
                                return new C4116bWv(b.this.b.r(), (C1567aGb) b.this.b.A.get(), ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), str, GA.c(b.this.e.bM), (bNS) b.this.e.aw.get(), (aDB) b.this.e.av.get(), DoubleCheck.lazy(b.this.e.ap), DoubleCheck.lazy(b.this.b.s), DoubleCheck.lazy(b.this.e.s), b.this.b.aa(), b.this.b.al(), b.this.b.ac(), b.this.b.ab());
                            }
                        };
                    case 23:
                        return (T) new C7003cnv(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (C1567aGb) this.b.A.get());
                    case 24:
                        return (T) new C6977cnV(this.b.r());
                    default:
                        throw new AssertionError(this.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class m extends ReleaseNetflixApplication_HiltComponents.h {
        private final i a;
        private Provider<C6846ckx> b;
        private Provider<C6817ckU> c;
        private final e d;
        private Provider<C6803ckG> e;
        private final m f;
        private Provider<C6883clh> g;
        private final MoneyballDataSource h;
        private final NetworkRequestResponseListener i;
        private final MoneyballDataModule j;
        private final t k;
        private Provider<Map<String, Integer>> l;
        private Provider<C6807ckK> m;
        private Provider<C6851clB> n;

        /* renamed from: o  reason: collision with root package name */
        private Provider<C6891clp> f13384o;

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6803ckG> a() {
            return this.e;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6817ckU> b() {
            return this.c;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6883clh> c() {
            return this.g;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6846ckx> d() {
            return this.b;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6807ckK> g() {
            return this.m;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6891clp> h() {
            return this.f13384o;
        }

        @Override // o.InterfaceC6829ckg
        public javax.inject.Provider<C6851clB> j() {
            return this.n;
        }

        private m(t tVar, i iVar, e eVar, MoneyballDataModule moneyballDataModule, MoneyballDataSource moneyballDataSource, NetworkRequestResponseListener networkRequestResponseListener) {
            this.f = this;
            this.k = tVar;
            this.a = iVar;
            this.d = eVar;
            this.h = moneyballDataSource;
            this.j = moneyballDataModule;
            this.i = networkRequestResponseListener;
            e(moneyballDataModule, moneyballDataSource, networkRequestResponseListener);
        }

        private FlowMode p() {
            return this.j.providesFlowMode(this.h);
        }

        private StepsViewModelInitializer E() {
            return new StepsViewModelInitializer(p(), signupErrorReporter(), stringProvider());
        }

        private ErrorMessageViewModelInitializer t() {
            return new ErrorMessageViewModelInitializer(this.h, signupErrorReporter(), stringProvider());
        }

        private ProfileEntryEditTextCheckboxViewModelInitializer H() {
            return new ProfileEntryEditTextCheckboxViewModelInitializer(p(), signupErrorReporter(), stringProvider());
        }

        private StartMembershipButtonViewModelInitializer I() {
            return new StartMembershipButtonViewModelInitializer(this.h, signupErrorReporter(), stringProvider());
        }

        private FormCache q() {
            return MoneyballDataModule_ProvidesFormCacheFactory.providesFormCache(this.j, this.h);
        }

        private FormCacheSynchronizerFactory y() {
            return new FormCacheSynchronizerFactory(q());
        }

        private KoreaCheckBoxesViewModelInitializer w() {
            return new KoreaCheckBoxesViewModelInitializer(p(), stringProvider(), y(), signupErrorReporter());
        }

        private PlanInfoViewModelInitializer F() {
            return new PlanInfoViewModelInitializer(this.h, signupErrorReporter(), stringProvider());
        }

        private PaymentInfoViewModelInitializer D() {
            return new PaymentInfoViewModelInitializer(this.h, signupErrorReporter(), stringProvider());
        }

        private MaturityPinEntryViewModelInitializer z() {
            return new MaturityPinEntryViewModelInitializer(p(), signupErrorReporter(), y());
        }

        private FormViewEditTextViewModelInitializer u() {
            return new FormViewEditTextViewModelInitializer(p(), y(), signupErrorReporter());
        }

        private EmailPreferenceViewModelInitializer m() {
            return new EmailPreferenceViewModelInitializer(p(), signupErrorReporter(), stringProvider());
        }

        private BirthMonthViewModelInitializer l() {
            return new BirthMonthViewModelInitializer(p(), signupErrorReporter(), stringProvider(), y());
        }

        private BirthDateViewModelInitializer i() {
            return new BirthDateViewModelInitializer(p(), signupErrorReporter(), y());
        }

        private BirthYearEditTextViewModelInitializer n() {
            return new BirthYearEditTextViewModelInitializer(p(), signupErrorReporter(), y());
        }

        private RequestResponseLogger G() {
            return new RequestResponseLogger(this.k.ba(), this.d.ar());
        }

        private EmvcoEventLogger s() {
            return new EmvcoEventLogger(this.d.ar());
        }

        private TouViewModelInitializer K() {
            return new TouViewModelInitializer(this.h, signupErrorReporter(), stringProvider(), I());
        }

        private C6834ckl v() {
            return new C6834ckl(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6836ckn x() {
            return new C6836ckn(stringProvider(), this.d.c, v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6842ckt B() {
            return new C6842ckt(stringProvider(), t());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6818ckV A() {
            return new C6818ckV(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ErrorMessageViewModel r() {
            return new ErrorMessageViewModel(stringProvider(), t());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6889cln J() {
            return new C6889cln(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6808ckL N() {
            return new C6808ckL(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6901clz M() {
            return new C6901clz(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6805ckI k() {
            return new C6805ckI(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6847cky o() {
            return new C6847cky(signupErrorReporter(), this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6881clf C() {
            return new C6881clf(signupErrorReporter(), this.h);
        }

        private void e(MoneyballDataModule moneyballDataModule, MoneyballDataSource moneyballDataSource, NetworkRequestResponseListener networkRequestResponseListener) {
            this.l = SingleCheck.provider(new a(this.k, this.a, this.d, this.f, 0));
            this.c = new a(this.k, this.a, this.d, this.f, 1);
            this.f13384o = new a(this.k, this.a, this.d, this.f, 2);
            this.m = new a(this.k, this.a, this.d, this.f, 3);
            this.n = new a(this.k, this.a, this.d, this.f, 4);
            this.e = new a(this.k, this.a, this.d, this.f, 5);
            this.b = new a(this.k, this.a, this.d, this.f, 6);
            this.g = new a(this.k, this.a, this.d, this.f, 7);
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public AddProfilesViewModelInitializer addProfilesViewModelInitializer() {
            return new AddProfilesViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), E(), t(), H());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public AddProfilesEEContextViewModelInitializer_Ab31697 addProfilesEEContextViewModelInitializer_Ab31697() {
            return new AddProfilesEEContextViewModelInitializer_Ab31697(stringProvider(), signupErrorReporter());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public ConfirmViewModelInitializer confirmViewModelInitializer() {
            return new ConfirmViewModelInitializer(this.h, signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), t(), I(), w(), q(), this.d.I(), F(), D());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public DeviceSurveyViewModelInitializer deviceSurveyViewModelInitializer() {
            return new DeviceSurveyViewModelInitializer(p(), signupErrorReporter(), y(), stringProvider(), signupNetworkManager(), t(), this.k.bd());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public FaqViewModelInitializer faqViewModelInitializer() {
            return new FaqViewModelInitializer(p(), signupErrorReporter(), stringProvider(), new CfourAcquisitionImpl());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public LearnMoreConfirmViewModelInitializer44926 learnMoreConfirmViewModelInitializer44926() {
            return new LearnMoreConfirmViewModelInitializer44926(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), t());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public LearnMoreConfirmViewModelInitializer55548 learnMoreConfirmViewModelInitializer55548() {
            return new LearnMoreConfirmViewModelInitializer55548(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), t());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public LearnMoreConfirmViewModelInitializer learnMoreConfirmViewModelInitializer() {
            return new LearnMoreConfirmViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), t());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public MaturityPinViewModelInitializer maturityPinViewModelInitializer() {
            return new MaturityPinViewModelInitializer(p(), signupErrorReporter(), stringProvider(), signupNetworkManager(), t(), this.k.bd(), z());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public OnRampViewModelInitializer onRampViewModelInitializer() {
            return new OnRampViewModelInitializer(p(), signupErrorReporter(), stringProvider(), signupNetworkManager(), t(), E(), this.k.bd());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public OrderFinalViewModelInitializer orderFinalViewModelInitializer() {
            return new OrderFinalViewModelInitializer(p(), signupErrorReporter(), stringProvider(), signupNetworkManager(), t(), this.k.bd());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public PasswordOnlyViewModelInitializer passwordOnlyViewModelInitializer() {
            return new PasswordOnlyViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), this.d.ar(), stringProvider(), this.k.bd(), E(), t(), u());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public RegenoldViewModelInitializer regenoldViewModelInitializer() {
            return new RegenoldViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), t(), u());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public RegistrationViewModelInitializer registrationViewModelInitializer() {
            return new RegistrationViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), this.d.ar(), stringProvider(), this.k.bd(), t(), m(), u());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public SecondaryLanguageViewModelInitializer secondaryLanguageViewModelInitializer() {
            return new SecondaryLanguageViewModelInitializer(p(), signupErrorReporter(), stringProvider(), signupNetworkManager(), E(), t(), this.k.bd());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public UpiWaitingViewModelInitializer upiWaitingViewModelInitializer() {
            return new UpiWaitingViewModelInitializer(p(), signupNetworkManager(), stringProvider(), t(), this.k.bd(), (InterfaceC1270Vf) this.k.A.get(), signupErrorReporter());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public VerifyAgeViewModelInitializer verifyAgeViewModelInitializer() {
            return new VerifyAgeViewModelInitializer(p(), signupErrorReporter(), stringProvider(), signupNetworkManager(), t(), this.k.bd(), l(), i(), n(), z());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public VerifyCardViewModelInitializer verifyCardViewModelInitializer() {
            return new VerifyCardViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), this.d.ar(), stringProvider(), this.k.bd(), t());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public VerifyCardContextViewModelInitializer verifyCardContextViewModelInitializer() {
            return new VerifyCardContextViewModelInitializer(p(), signupErrorReporter(), stringProvider(), this.k.bd(), (InterfaceC1270Vf) this.k.A.get());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public WelcomeFujiViewModelInitializer welcomeFujiViewModelInitializer() {
            return new WelcomeFujiViewModelInitializer(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), t(), u());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public WelcomeFujiViewModelInitializerAb44926 welcomeFujiViewModelInitializerAb44926() {
            return new WelcomeFujiViewModelInitializerAb44926(p(), signupErrorReporter(), signupNetworkManager(), stringProvider(), this.k.bd(), t(), u());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint, o.InterfaceC5427byZ, o.InterfaceC6829ckg
        public SignupErrorReporter signupErrorReporter() {
            return new SignupErrorReporter(this.d.ar(), this.h, this.d.P());
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint, o.InterfaceC6829ckg
        public SignupNetworkManager signupNetworkManager() {
            return new SignupNetworkManager((aIB) this.d.aS.get(), signupErrorReporter(), G(), this.i, this.h);
        }

        @Override // com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint
        public StringProvider stringProvider() {
            return new StringProvider(this.l.get(), signupErrorReporter());
        }

        @Override // o.InterfaceC5427byZ
        public C5460bzF e() {
            return new C5460bzF(this.h, signupErrorReporter(), stringProvider(), t(), signupNetworkManager());
        }

        @Override // o.InterfaceC6590cgF
        public C6673chj f() {
            return new C6673chj(this.h, signupErrorReporter(), signupNetworkManager(), stringProvider(), t(), this.d.I(), s(), K(), w(), D());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<T> implements Provider<T> {
            private final int a;
            private final t b;
            private final e c;
            private final m d;
            private final i e;

            a(t tVar, i iVar, e eVar, m mVar, int i) {
                this.b = tVar;
                this.e = iVar;
                this.c = eVar;
                this.d = mVar;
                this.a = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.a) {
                    case 0:
                        return (T) SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory.providesMultiModuleStringMapping(this.b.bN, AcquisitionLibStringMappingModule_ProvidesStringMappingFactory.providesStringMapping(this.b.b), SignupSingletonModule_ProvidesStringMappingFactory.providesStringMapping(this.b.bQ), C5426byY.e(this.b.D));
                    case 1:
                        return (T) new C6817ckU(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.x(), this.d.B(), this.d.A(), this.c.c);
                    case 2:
                        return (T) new C6891clp(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.r(), this.d.J(), this.c.c);
                    case 3:
                        return (T) new C6807ckK(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.r(), this.d.N(), this.c.c);
                    case 4:
                        return (T) new C6851clB(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.r(), this.d.M(), this.c.c);
                    case 5:
                        return (T) new C6803ckG(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.B(), this.d.k(), this.c.c);
                    case 6:
                        return (T) new C6846ckx(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.B(), this.d.o(), this.c.c);
                    case 7:
                        return (T) new C6883clh(this.d.stringProvider(), this.d.signupNetworkManager(), this.d.r(), this.d.C(), this.c.c);
                    default:
                        throw new AssertionError(this.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class C extends ReleaseNetflixApplication_HiltComponents.m {
        private final i a;
        private final e b;
        private final C c;
        private final t d;
        private final h e;

        private C(t tVar, i iVar, e eVar, h hVar, View view) {
            this.c = this;
            this.d = tVar;
            this.a = iVar;
            this.b = eVar;
            this.e = hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h extends ReleaseNetflixApplication_HiltComponents.e {
        private final e a;
        private Provider<bLW> b;
        private final i c;
        private Provider<InterfaceC4004bSr.b> d;
        private Provider<AppView> e;
        private Provider<cMC.b> f;
        private final Fragment g;
        private Provider<WelcomeFujiLogger.Factory> h;
        private Provider<C9935zP> i;
        private final h j;
        private Provider<MiniPlayerVideoGroupViewModel> k;
        private Provider<C4019bTf> l;
        private Provider<GdpEpoxyController> m;
        private final GdpFragmentModule n;

        /* renamed from: o  reason: collision with root package name */
        private Provider<GraphQLHomeRepositoryBinding> f13382o;
        private Provider<C5898cMl> p;
        private Provider<InterfaceC3994bSh> q;
        private Provider<InterfaceC7606czQ> r;
        private Provider<bLU> s;
        private final t t;
        private Provider<C1619aI> u;
        private Provider<TrackingInfoHolder> v;
        private Provider<bLW> w;
        private Provider<C7898daG> x;

        private h(t tVar, i iVar, e eVar, GdpFragmentModule gdpFragmentModule, Fragment fragment) {
            this.j = this;
            this.t = tVar;
            this.c = iVar;
            this.a = eVar;
            this.n = gdpFragmentModule;
            this.g = fragment;
            a(gdpFragmentModule, fragment);
        }

        private KeyboardController g() {
            return new KeyboardController(this.a.c);
        }

        private LastFormViewEditTextBinding h() {
            return new LastFormViewEditTextBinding(g());
        }

        private AddProfilesLogger b() {
            return new AddProfilesLogger(this.a.J(), this.a.ar());
        }

        private EmvcoEventLogger d() {
            return new EmvcoEventLogger(this.a.ar());
        }

        private DeviceSurveyLogger e() {
            return new DeviceSurveyLogger(this.a.ar());
        }

        private OnRampLogger f() {
            return new OnRampLogger(this.a.ar());
        }

        private OrderFinalLogger n() {
            return new OrderFinalLogger(this.a.J(), this.a.ar());
        }

        private SecondaryLanguageLogger m() {
            return new SecondaryLanguageLogger(this.a.ar());
        }

        private TtrImageObserver k() {
            return new TtrImageObserver(this.a.an());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public dwU c() {
            return bPN.e(this.n, this.g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3896bOr j() {
            return new C3896bOr(this.t.bs());
        }

        private bPG i() {
            return new bPG(this.m);
        }

        private C6488ceJ o() {
            return new C6488ceJ(this.d.get());
        }

        private C7474cwr l() {
            return new C7474cwr(this.t.E());
        }

        private C8308dht a() {
            return new C8308dht((aCI) this.t.aP.get());
        }

        private void a(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
            this.h = SingleCheck.provider(new e(this.t, this.c, this.a, this.j, 0));
            this.u = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 1));
            this.w = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 2));
            this.b = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 3));
            this.v = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 4));
            this.i = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 5));
            this.k = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 6));
            this.e = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 8));
            this.s = DoubleCheck.provider(new e(this.t, this.c, this.a, this.j, 9));
            this.m = new e(this.t, this.c, this.a, this.j, 7);
            e eVar = new e(this.t, this.c, this.a, this.j, 10);
            this.f13382o = eVar;
            this.d = SingleCheck.provider(eVar);
            this.x = new e(this.t, this.c, this.a, this.j, 11);
            e eVar2 = new e(this.t, this.c, this.a, this.j, 12);
            this.l = eVar2;
            this.q = DoubleCheck.provider(eVar2);
            this.r = SingleCheck.provider(new e(this.t, this.c, this.a, this.j, 13));
            this.p = new e(this.t, this.c, this.a, this.j, 14);
            this.f = SingleCheck.provider(new e(this.t, this.c, this.a, this.j, 15));
        }

        @Override // com.netflix.mediaclient.acquisition.components.faq.FaqFragment_GeneratedInjector
        public void injectFaqFragment(FaqFragment faqFragment) {
            e(faqFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment_GeneratedInjector
        public void injectRegenoldFragment(RegenoldFragment regenoldFragment) {
            d(regenoldFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_GeneratedInjector
        public void injectSignupFragment(SignupFragment signupFragment) {
            c(signupFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment_GeneratedInjector
        public void injectAddProfilesFragment(AddProfilesFragment addProfilesFragment) {
            d(addProfilesFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.KidsProfilesFragment_GeneratedInjector
        public void injectKidsProfilesFragment(KidsProfilesFragment kidsProfilesFragment) {
            b(kidsProfilesFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697_GeneratedInjector
        public void injectAddProfilesEEContextFragment_Ab31697(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697) {
            d(addProfilesEEContextFragment_Ab31697);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697_GeneratedInjector
        public void injectAddProfilesEEFragment_Ab31697(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697) {
            d(addProfilesEEFragment_Ab31697);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment_GeneratedInjector
        public void injectConfirmFragment(ConfirmFragment confirmFragment) {
            d(confirmFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment_GeneratedInjector
        public void injectDeviceSurveyFragment(DeviceSurveyFragment deviceSurveyFragment) {
            e(deviceSurveyFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment_GeneratedInjector
        public void injectLearnMoreConfirmFragment(LearnMoreConfirmFragment learnMoreConfirmFragment) {
            d(learnMoreConfirmFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmFragmentAb44926_GeneratedInjector
        public void injectLearnMoreConfirmFragmentAb44926(LearnMoreConfirmFragmentAb44926 learnMoreConfirmFragmentAb44926) {
            c(learnMoreConfirmFragmentAb44926);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548_GeneratedInjector
        public void injectLearnMoreConfirmFragmentAb55548(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548) {
            c(learnMoreConfirmFragmentAb55548);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment_GeneratedInjector
        public void injectMaturityPinFragment(MaturityPinFragment maturityPinFragment) {
            c(maturityPinFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampForSecondaryProfilesFragmentAb53426_GeneratedInjector
        public void injectOnRampForSecondaryProfilesFragmentAb53426(OnRampForSecondaryProfilesFragmentAb53426 onRampForSecondaryProfilesFragmentAb53426) {
            c(onRampForSecondaryProfilesFragmentAb53426);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment_GeneratedInjector
        public void injectOnRampFragment(OnRampFragment onRampFragment) {
            a(onRampFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment_GeneratedInjector
        public void injectOrderFinalFragment(OrderFinalFragment orderFinalFragment) {
            a(orderFinalFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment_GeneratedInjector
        public void injectPasswordOnlyFragment(PasswordOnlyFragment passwordOnlyFragment) {
            d(passwordOnlyFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment_GeneratedInjector
        public void injectRegistrationFragment(RegistrationFragment registrationFragment) {
            e(registrationFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageForProfileOnboardingFragmentAb53426_GeneratedInjector
        public void injectSecondaryLanguageForProfileOnboardingFragmentAb53426(SecondaryLanguageForProfileOnboardingFragmentAb53426 secondaryLanguageForProfileOnboardingFragmentAb53426) {
            e(secondaryLanguageForProfileOnboardingFragmentAb53426);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment_GeneratedInjector
        public void injectSecondaryLanguageFragment(SecondaryLanguageFragment secondaryLanguageFragment) {
            a(secondaryLanguageFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment_GeneratedInjector
        public void injectUpiWaitingFragment(UpiWaitingFragment upiWaitingFragment) {
            c(upiWaitingFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment_GeneratedInjector
        public void injectVerifyAgeFragment(VerifyAgeFragment verifyAgeFragment) {
            c(verifyAgeFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment_GeneratedInjector
        public void injectVerifyCardFragment(VerifyCardFragment verifyCardFragment) {
            b(verifyCardFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment_GeneratedInjector
        public void injectVerifyCardContextFragment(VerifyCardContextFragment verifyCardContextFragment) {
            a(verifyCardContextFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment_GeneratedInjector
        public void injectFujiCardFragment(FujiCardFragment fujiCardFragment) {
            b(fujiCardFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment_GeneratedInjector
        public void injectWelcomeFujiFragment(WelcomeFujiFragment welcomeFujiFragment) {
            d(welcomeFujiFragment);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.FujiCardFragmentAb44926_GeneratedInjector
        public void injectFujiCardFragmentAb44926(FujiCardFragmentAb44926 fujiCardFragmentAb44926) {
            c(fujiCardFragmentAb44926);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926_GeneratedInjector
        public void injectWelcomeFujiFragmentAb44926(WelcomeFujiFragmentAb44926 welcomeFujiFragmentAb44926) {
            d(welcomeFujiFragmentAb44926);
        }

        @Override // o.InterfaceC1087Oe
        public void d(NetflixDialogFrag netflixDialogFrag) {
            e(netflixDialogFrag);
        }

        @Override // o.InterfaceC1093Ok
        public void d(NetflixFrag netflixFrag) {
            c(netflixFrag);
        }

        @Override // o.PW
        public void e(ShareSheetFragment shareSheetFragment) {
            a(shareSheetFragment);
        }

        @Override // o.InterfaceC5493bzm
        public void c(DemographicCollectionFragment demographicCollectionFragment) {
            d(demographicCollectionFragment);
        }

        @Override // o.InterfaceC5476bzV
        public void a(CollectPhoneFragment collectPhoneFragment) {
            d(collectPhoneFragment);
        }

        @Override // o.bAY
        public void a(CollectTasteDialogFrag collectTasteDialogFrag) {
            e(collectTasteDialogFrag);
        }

        @Override // o.InterfaceC3618bEn
        public void b(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment) {
            e(episodesListSelectorDialogFragment);
        }

        @Override // o.InterfaceC3720bId
        public void e(FullDpFrag fullDpFrag) {
            c(fullDpFrag);
        }

        @Override // o.bMY
        public void c(bMX bmx) {
            d(bmx);
        }

        @Override // o.InterfaceC3863bNl
        public void d(MagicPathFragment magicPathFragment) {
            b(magicPathFragment);
        }

        @Override // o.bPQ
        public void b(GdpFragment gdpFragment) {
            c(gdpFragment);
        }

        @Override // o.InterfaceC3936bQd
        public void a(InstallInterstitialFragment installInterstitialFragment) {
            d(installInterstitialFragment);
        }

        @Override // o.bQG
        public void c(bQD bqd) {
            d(bqd);
        }

        @Override // o.InterfaceC4023bTj
        public void b(FeedLolomoFragment feedLolomoFragment) {
            d(feedLolomoFragment);
        }

        @Override // o.bTB
        public void a(GamesLolomoFragment gamesLolomoFragment) {
            d(gamesLolomoFragment);
        }

        @Override // o.bTI
        public void c(bTK btk) {
            b(btk);
        }

        @Override // o.InterfaceC4046bUf
        public void e(LolomoMvRxFragment lolomoMvRxFragment) {
            d(lolomoMvRxFragment);
        }

        @Override // o.InterfaceC4104bWj
        public void e(MyNetflixFragment myNetflixFragment) {
            c(myNetflixFragment);
        }

        @Override // o.InterfaceC4165bYq
        public void b(KidsCharacterFrag kidsCharacterFrag) {
            e(kidsCharacterFrag);
        }

        @Override // o.InterfaceC4197bZv
        public void a(C4194bZs c4194bZs) {
            c(c4194bZs);
        }

        @Override // o.InterfaceC6307cao
        public void b(EmailPasswordFragment emailPasswordFragment) {
            e(emailPasswordFragment);
        }

        @Override // o.InterfaceC6275caI
        public void c(LoginErrorDialogFrag loginErrorDialogFrag) {
            a(loginErrorDialogFrag);
        }

        @Override // o.InterfaceC6357cbl
        public void a(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131) {
            b(oneTimePassCodeFragmentAb54131);
        }

        @Override // o.InterfaceC6354cbi
        public void b(OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131) {
            c(oneTimePasscodeChoiceFragmentAb54131);
        }

        @Override // o.InterfaceC6329cbJ
        public void e(RecaptchaEmailPasswordFragment recaptchaEmailPasswordFragment) {
            a(recaptchaEmailPasswordFragment);
        }

        @Override // o.InterfaceC6408ccj
        public void d(C6409cck c6409cck) {
            c(c6409cck);
        }

        @Override // o.InterfaceC6511ceg
        public void a(ContinueWatchingMenuDialogFragment continueWatchingMenuDialogFragment) {
            d(continueWatchingMenuDialogFragment);
        }

        @Override // o.InterfaceC6480ceB
        public void e(QuickDrawDialogFrag quickDrawDialogFrag) {
            a(quickDrawDialogFrag);
        }

        @Override // o.InterfaceC6561cfd
        public void d(CastSheetDialogFrag castSheetDialogFrag) {
            b(castSheetDialogFrag);
        }

        @Override // o.InterfaceC6701ciK
        public void d(MoreFragment moreFragment) {
            e(moreFragment);
        }

        @Override // o.InterfaceC6771cjb
        public void c(C6716ciZ c6716ciZ) {
            e(c6716ciZ);
        }

        @Override // o.InterfaceC6997cnp
        public void e(MyListFragment myListFragment) {
            d(myListFragment);
        }

        @Override // o.InterfaceC7043coj
        public void c(MyListFragmentTab myListFragmentTab) {
            b(myListFragmentTab);
        }

        @Override // o.InterfaceC7117cqE
        public void c(MultiTitleNotificationsFrag multiTitleNotificationsFrag) {
            a(multiTitleNotificationsFrag);
        }

        @Override // o.InterfaceC7234csP
        public void c(ErrorDownloadSheetFragment errorDownloadSheetFragment) {
            d(errorDownloadSheetFragment);
        }

        @Override // o.InterfaceC7276ctE
        public void d(OfflineFragmentV2 offlineFragmentV2) {
            e(offlineFragmentV2);
        }

        @Override // o.InterfaceC7420cvq
        public void d(DownloadedForYouSettingsFragment downloadedForYouSettingsFragment) {
            e(downloadedForYouSettingsFragment);
        }

        @Override // o.InterfaceC7472cwp
        public void e(PauseAdsDialogFragment pauseAdsDialogFragment) {
            c(pauseAdsDialogFragment);
        }

        @Override // o.InterfaceC7553cyQ
        public void d(PlayerFragmentV2 playerFragmentV2) {
            c(playerFragmentV2);
        }

        @Override // o.cKH
        public void e(DeletePinDialog deletePinDialog) {
            a(deletePinDialog);
        }

        @Override // o.InterfaceC5861cLb
        public void c(cKP ckp) {
            b(ckp);
        }

        @Override // o.cKY
        public void c(ProfileLockPinDialog profileLockPinDialog) {
            b(profileLockPinDialog);
        }

        @Override // o.InterfaceC5869cLj
        public void c(ValidatePasswordDialog validatePasswordDialog) {
            e(validatePasswordDialog);
        }

        @Override // o.InterfaceC5872cLm
        public void c(VerifyPinDialog verifyPinDialog) {
            d(verifyPinDialog);
        }

        @Override // o.cLF
        public void b(AddProfileFragment addProfileFragment) {
            c(addProfileFragment);
        }

        @Override // o.InterfaceC5901cMo
        public void b(MyNetflixMenuSheetFragment myNetflixMenuSheetFragment) {
            d(myNetflixMenuSheetFragment);
        }

        @Override // o.cMG
        public void a(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment) {
            b(myNetflixRecentlyWatchedMenuFragment);
        }

        @Override // o.InterfaceC5925cNl
        public void a(ProfileDetailsFragment profileDetailsFragment) {
            c(profileDetailsFragment);
        }

        @Override // o.InterfaceC5954cOo
        public void b(SwitchProfileSheetFragment switchProfileSheetFragment) {
            e(switchProfileSheetFragment);
        }

        @Override // o.cOS
        public void d(ProfileLanguagesFragment profileLanguagesFragment) {
            b(profileLanguagesFragment);
        }

        @Override // o.InterfaceC5978cPl
        public void c(C5972cPf c5972cPf) {
            e(c5972cPf);
        }

        @Override // o.cPB
        public void b(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment) {
            a(profileViewingRestrictionsFragment);
        }

        @Override // o.cRQ
        public void d(SearchResultsOnNapaFrag searchResultsOnNapaFrag) {
            e(searchResultsOnNapaFrag);
        }

        @Override // o.cRU
        public void a(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment) {
            c(searchSuggestionOnNapaFragment);
        }

        @Override // o.cRY
        public void e(PreQuerySearchFragmentV3 preQuerySearchFragmentV3) {
            a(preQuerySearchFragmentV3);
        }

        @Override // o.InterfaceC6153cVv
        public void e(SettingsFragment settingsFragment) {
            c(settingsFragment);
        }

        @Override // o.InterfaceC7897daF
        public void c(UpNextFeedFragment upNextFeedFragment) {
            d(upNextFeedFragment);
        }

        @Override // o.InterfaceC8040dcq
        public void b(UserMarksFragment userMarksFragment) {
            d(userMarksFragment);
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.a.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new y(this.t, this.c, this.a, this.j);
        }

        private FaqFragment e(FaqFragment faqFragment) {
            C1095Om.d(faqFragment, DoubleCheck.lazy(this.a.be));
            FaqFragment_MembersInjector.injectFaqInteractionListener(faqFragment, this.a.L());
            FaqFragment_MembersInjector.injectMoneyballEntryPoint(faqFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            return faqFragment;
        }

        private RegenoldFragment d(RegenoldFragment regenoldFragment) {
            C1095Om.d(regenoldFragment, DoubleCheck.lazy(this.a.be));
            RegenoldFragment_MembersInjector.injectFormDataObserverFactory(regenoldFragment, new FormDataObserverFactory());
            RegenoldFragment_MembersInjector.injectMoneyballEntryPoint(regenoldFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            RegenoldFragment_MembersInjector.injectKeyboardController(regenoldFragment, g());
            RegenoldFragment_MembersInjector.injectLastFormViewEditTextBinding(regenoldFragment, h());
            RegenoldFragment_MembersInjector.injectRegenoldInteractionListener(regenoldFragment, this.a.aj());
            return regenoldFragment;
        }

        private SignupFragment c(SignupFragment signupFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(signupFragment, DoubleCheck.lazy(this.a.be));
            return signupFragment;
        }

        private AddProfilesFragment d(AddProfilesFragment addProfilesFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(addProfilesFragment, g());
            AddProfilesFragment_MembersInjector.injectMoneyballEntryPoint(addProfilesFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            AddProfilesFragment_MembersInjector.injectFormDataObserverFactory(addProfilesFragment, new FormDataObserverFactory());
            AddProfilesFragment_MembersInjector.injectAddProfilesLogger(addProfilesFragment, b());
            return addProfilesFragment;
        }

        private KidsProfilesFragment b(KidsProfilesFragment kidsProfilesFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(kidsProfilesFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(kidsProfilesFragment, g());
            AddProfilesFragment_MembersInjector.injectMoneyballEntryPoint(kidsProfilesFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            AddProfilesFragment_MembersInjector.injectFormDataObserverFactory(kidsProfilesFragment, new FormDataObserverFactory());
            AddProfilesFragment_MembersInjector.injectAddProfilesLogger(kidsProfilesFragment, b());
            return kidsProfilesFragment;
        }

        private AddProfilesEEContextFragment_Ab31697 d(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesEEContextFragment_Ab31697, DoubleCheck.lazy(this.a.be));
            AddProfilesEEContextFragment_Ab31697_MembersInjector.injectAddProfilesEEContextClickListener(addProfilesEEContextFragment_Ab31697, this.a.C());
            AddProfilesEEContextFragment_Ab31697_MembersInjector.injectMoneyballEntryPoint(addProfilesEEContextFragment_Ab31697, (SignupMoneyballEntryPoint) this.a.aI.get());
            return addProfilesEEContextFragment_Ab31697;
        }

        private AddProfilesEEFragment_Ab31697 d(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesEEFragment_Ab31697, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(addProfilesEEFragment_Ab31697, g());
            AddProfilesFragment_MembersInjector.injectMoneyballEntryPoint(addProfilesEEFragment_Ab31697, (SignupMoneyballEntryPoint) this.a.aI.get());
            AddProfilesFragment_MembersInjector.injectFormDataObserverFactory(addProfilesEEFragment_Ab31697, new FormDataObserverFactory());
            AddProfilesFragment_MembersInjector.injectAddProfilesLogger(addProfilesEEFragment_Ab31697, b());
            AddProfilesEEFragment_Ab31697_MembersInjector.injectEarlyEducationDialogPresenter(addProfilesEEFragment_Ab31697, new AddProfilesEEDialogPresenter_Ab31697());
            return addProfilesEEFragment_Ab31697;
        }

        private ConfirmFragment d(ConfirmFragment confirmFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(confirmFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(confirmFragment, g());
            ConfirmFragment_MembersInjector.injectMoneyballEntryPoint(confirmFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            ConfirmFragment_MembersInjector.injectFormDataObserverFactory(confirmFragment, new FormDataObserverFactory());
            ConfirmFragment_MembersInjector.injectEmvcoEventLogger(confirmFragment, d());
            return confirmFragment;
        }

        private DeviceSurveyFragment e(DeviceSurveyFragment deviceSurveyFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(deviceSurveyFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(deviceSurveyFragment, g());
            DeviceSurveyFragment_MembersInjector.injectDeviceSurveyDeviceContainerViewFactory(deviceSurveyFragment, new DeviceSurveyDeviceContainerViewFactory());
            DeviceSurveyFragment_MembersInjector.injectMoneyballEntryPoint(deviceSurveyFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            DeviceSurveyFragment_MembersInjector.injectFormDataObserverFactory(deviceSurveyFragment, new FormDataObserverFactory());
            DeviceSurveyFragment_MembersInjector.injectDeviceSurveyLogger(deviceSurveyFragment, e());
            return deviceSurveyFragment;
        }

        private LearnMoreConfirmFragment d(LearnMoreConfirmFragment learnMoreConfirmFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(learnMoreConfirmFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(learnMoreConfirmFragment, g());
            LearnMoreConfirmFragment_MembersInjector.injectMoneyballEntryPoint(learnMoreConfirmFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            LearnMoreConfirmFragment_MembersInjector.injectTtrEventListener(learnMoreConfirmFragment, this.a.an());
            return learnMoreConfirmFragment;
        }

        private LearnMoreConfirmFragmentAb44926 c(LearnMoreConfirmFragmentAb44926 learnMoreConfirmFragmentAb44926) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(learnMoreConfirmFragmentAb44926, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(learnMoreConfirmFragmentAb44926, g());
            LearnMoreConfirmFragment_MembersInjector.injectMoneyballEntryPoint(learnMoreConfirmFragmentAb44926, (SignupMoneyballEntryPoint) this.a.aI.get());
            LearnMoreConfirmFragment_MembersInjector.injectTtrEventListener(learnMoreConfirmFragmentAb44926, this.a.an());
            return learnMoreConfirmFragmentAb44926;
        }

        private LearnMoreConfirmFragmentAb55548 c(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(learnMoreConfirmFragmentAb55548, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(learnMoreConfirmFragmentAb55548, g());
            LearnMoreConfirmFragmentAb55548_MembersInjector.injectMoneyballEntryPoint(learnMoreConfirmFragmentAb55548, (SignupMoneyballEntryPoint) this.a.aI.get());
            LearnMoreConfirmFragmentAb55548_MembersInjector.injectTtrEventListener(learnMoreConfirmFragmentAb55548, this.a.an());
            LearnMoreConfirmFragmentAb55548_MembersInjector.injectImageLoaderCompose(learnMoreConfirmFragmentAb55548, (InterfaceC1570aGe) this.a.m.get());
            return learnMoreConfirmFragmentAb55548;
        }

        private MaturityPinFragment c(MaturityPinFragment maturityPinFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(maturityPinFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(maturityPinFragment, g());
            MaturityPinFragment_MembersInjector.injectFormDataObserverFactory(maturityPinFragment, new FormDataObserverFactory());
            MaturityPinFragment_MembersInjector.injectMoneyballEntryPoint(maturityPinFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            return maturityPinFragment;
        }

        private OnRampForSecondaryProfilesFragmentAb53426 c(OnRampForSecondaryProfilesFragmentAb53426 onRampForSecondaryProfilesFragmentAb53426) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(onRampForSecondaryProfilesFragmentAb53426, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(onRampForSecondaryProfilesFragmentAb53426, g());
            OnRampFragment_MembersInjector.injectMoneyballEntryPoint(onRampForSecondaryProfilesFragmentAb53426, (SignupMoneyballEntryPoint) this.a.aI.get());
            OnRampFragment_MembersInjector.injectOnRampNavigationListener(onRampForSecondaryProfilesFragmentAb53426, this.a.Z());
            OnRampFragment_MembersInjector.injectOnRampLogger(onRampForSecondaryProfilesFragmentAb53426, f());
            return onRampForSecondaryProfilesFragmentAb53426;
        }

        private OnRampFragment a(OnRampFragment onRampFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(onRampFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(onRampFragment, g());
            OnRampFragment_MembersInjector.injectMoneyballEntryPoint(onRampFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            OnRampFragment_MembersInjector.injectOnRampNavigationListener(onRampFragment, this.a.Z());
            OnRampFragment_MembersInjector.injectOnRampLogger(onRampFragment, f());
            return onRampFragment;
        }

        private OrderFinalFragment a(OrderFinalFragment orderFinalFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(orderFinalFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(orderFinalFragment, g());
            OrderFinalFragment_MembersInjector.injectMoneyballEntryPoint(orderFinalFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            OrderFinalFragment_MembersInjector.injectFormDataObserverFactory(orderFinalFragment, new FormDataObserverFactory());
            OrderFinalFragment_MembersInjector.injectOrderFinalLogger(orderFinalFragment, n());
            return orderFinalFragment;
        }

        private PasswordOnlyFragment d(PasswordOnlyFragment passwordOnlyFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(passwordOnlyFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(passwordOnlyFragment, g());
            PasswordOnlyFragment_MembersInjector.injectFormDataObserverFactory(passwordOnlyFragment, new FormDataObserverFactory());
            PasswordOnlyFragment_MembersInjector.injectMoneyballEntryPoint(passwordOnlyFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            PasswordOnlyFragment_MembersInjector.injectLastFormViewEditTextBinding(passwordOnlyFragment, h());
            PasswordOnlyFragment_MembersInjector.injectPasswordOnlyInteractionListener(passwordOnlyFragment, this.a.aa());
            return passwordOnlyFragment;
        }

        private RegistrationFragment e(RegistrationFragment registrationFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(registrationFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(registrationFragment, g());
            RegistrationFragment_MembersInjector.injectFormDataObserverFactory(registrationFragment, new FormDataObserverFactory());
            RegistrationFragment_MembersInjector.injectMoneyballEntryPoint(registrationFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            RegistrationFragment_MembersInjector.injectLastFormViewEditTextBinding(registrationFragment, h());
            return registrationFragment;
        }

        private SecondaryLanguageForProfileOnboardingFragmentAb53426 e(SecondaryLanguageForProfileOnboardingFragmentAb53426 secondaryLanguageForProfileOnboardingFragmentAb53426) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(secondaryLanguageForProfileOnboardingFragmentAb53426, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(secondaryLanguageForProfileOnboardingFragmentAb53426, g());
            SecondaryLanguageFragment_MembersInjector.injectTtrEventListener(secondaryLanguageForProfileOnboardingFragmentAb53426, this.a.an());
            SecondaryLanguageFragment_MembersInjector.injectMoneyballEntryPoint(secondaryLanguageForProfileOnboardingFragmentAb53426, (SignupMoneyballEntryPoint) this.a.aI.get());
            SecondaryLanguageFragment_MembersInjector.injectFormDataObserverFactory(secondaryLanguageForProfileOnboardingFragmentAb53426, new FormDataObserverFactory());
            SecondaryLanguageFragment_MembersInjector.injectSecondaryLanguageLogger(secondaryLanguageForProfileOnboardingFragmentAb53426, m());
            return secondaryLanguageForProfileOnboardingFragmentAb53426;
        }

        private SecondaryLanguageFragment a(SecondaryLanguageFragment secondaryLanguageFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(secondaryLanguageFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(secondaryLanguageFragment, g());
            SecondaryLanguageFragment_MembersInjector.injectTtrEventListener(secondaryLanguageFragment, this.a.an());
            SecondaryLanguageFragment_MembersInjector.injectMoneyballEntryPoint(secondaryLanguageFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            SecondaryLanguageFragment_MembersInjector.injectFormDataObserverFactory(secondaryLanguageFragment, new FormDataObserverFactory());
            SecondaryLanguageFragment_MembersInjector.injectSecondaryLanguageLogger(secondaryLanguageFragment, m());
            return secondaryLanguageFragment;
        }

        private UpiWaitingFragment c(UpiWaitingFragment upiWaitingFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(upiWaitingFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(upiWaitingFragment, g());
            UpiWaitingFragment_MembersInjector.injectMoneyballEntryPoint(upiWaitingFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            UpiWaitingFragment_MembersInjector.injectFormDataObserverFactory(upiWaitingFragment, new FormDataObserverFactory());
            UpiWaitingFragment_MembersInjector.injectInteractionListener(upiWaitingFragment, this.a.Q());
            return upiWaitingFragment;
        }

        private VerifyAgeFragment c(VerifyAgeFragment verifyAgeFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(verifyAgeFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(verifyAgeFragment, g());
            VerifyAgeFragment_MembersInjector.injectFormDataObserverFactory(verifyAgeFragment, new FormDataObserverFactory());
            VerifyAgeFragment_MembersInjector.injectMoneyballEntryPoint(verifyAgeFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            return verifyAgeFragment;
        }

        private VerifyCardFragment b(VerifyCardFragment verifyCardFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(verifyCardFragment, DoubleCheck.lazy(this.a.be));
            VerifyCardFragment_MembersInjector.injectMoneyballEntryPoint(verifyCardFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            VerifyCardFragment_MembersInjector.injectVerifyCard3dsEventListener(verifyCardFragment, this.a.at());
            VerifyCardFragment_MembersInjector.injectFormDataObserverFactory(verifyCardFragment, new FormDataObserverFactory());
            return verifyCardFragment;
        }

        private VerifyCardContextFragment a(VerifyCardContextFragment verifyCardContextFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(verifyCardContextFragment, DoubleCheck.lazy(this.a.be));
            VerifyCardContextFragment_MembersInjector.injectMoneyballEntryPoint(verifyCardContextFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            VerifyCardContextFragment_MembersInjector.injectVerifyCardContextClickListener(verifyCardContextFragment, this.a.as());
            VerifyCardContextFragment_MembersInjector.injectEventListener(verifyCardContextFragment, this.a.N());
            return verifyCardContextFragment;
        }

        private FujiCardFragment b(FujiCardFragment fujiCardFragment) {
            FujiCardFragment_MembersInjector.injectTtrImageObserver(fujiCardFragment, k());
            return fujiCardFragment;
        }

        private WelcomeFujiFragment d(WelcomeFujiFragment welcomeFujiFragment) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(welcomeFujiFragment, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(welcomeFujiFragment, g());
            WelcomeFujiFragment_MembersInjector.injectFujiNavigationListener(welcomeFujiFragment, this.a.ay());
            WelcomeFujiFragment_MembersInjector.injectFormDataObserverFactory(welcomeFujiFragment, new FormDataObserverFactory());
            WelcomeFujiFragment_MembersInjector.injectMoneyballEntryPoint(welcomeFujiFragment, (SignupMoneyballEntryPoint) this.a.aI.get());
            WelcomeFujiFragment_MembersInjector.injectFactory(welcomeFujiFragment, this.h.get());
            WelcomeFujiFragment_MembersInjector.injectTtrEventListener(welcomeFujiFragment, this.a.an());
            WelcomeFujiFragment_MembersInjector.injectLoginApi(welcomeFujiFragment, (LoginApi) this.t.aO.get());
            return welcomeFujiFragment;
        }

        private FujiCardFragmentAb44926 c(FujiCardFragmentAb44926 fujiCardFragmentAb44926) {
            FujiCardFragment_MembersInjector.injectTtrImageObserver(fujiCardFragmentAb44926, k());
            FujiCardFragmentAb44926_MembersInjector.injectKeyboardState(fujiCardFragmentAb44926, (C9867yA) this.a.O.get());
            return fujiCardFragmentAb44926;
        }

        private WelcomeFujiFragmentAb44926 d(WelcomeFujiFragmentAb44926 welcomeFujiFragmentAb44926) {
            SignupFragment_MembersInjector.injectUiLatencyTracker(welcomeFujiFragmentAb44926, DoubleCheck.lazy(this.a.be));
            AbstractNetworkFragment2_MembersInjector.injectKeyboardController(welcomeFujiFragmentAb44926, g());
            WelcomeFujiFragment_MembersInjector.injectFujiNavigationListener(welcomeFujiFragmentAb44926, this.a.ay());
            WelcomeFujiFragment_MembersInjector.injectFormDataObserverFactory(welcomeFujiFragmentAb44926, new FormDataObserverFactory());
            WelcomeFujiFragment_MembersInjector.injectMoneyballEntryPoint(welcomeFujiFragmentAb44926, (SignupMoneyballEntryPoint) this.a.aI.get());
            WelcomeFujiFragment_MembersInjector.injectFactory(welcomeFujiFragmentAb44926, this.h.get());
            WelcomeFujiFragment_MembersInjector.injectTtrEventListener(welcomeFujiFragmentAb44926, this.a.an());
            WelcomeFujiFragment_MembersInjector.injectLoginApi(welcomeFujiFragmentAb44926, (LoginApi) this.t.aO.get());
            WelcomeFujiFragmentAb44926_MembersInjector.injectLastFormViewEditTextBinding(welcomeFujiFragmentAb44926, h());
            return welcomeFujiFragmentAb44926;
        }

        private NetflixDialogFrag e(NetflixDialogFrag netflixDialogFrag) {
            C1095Om.d(netflixDialogFrag, DoubleCheck.lazy(this.a.be));
            return netflixDialogFrag;
        }

        private NetflixFrag c(NetflixFrag netflixFrag) {
            C1092Oj.e(netflixFrag, this.a.be);
            return netflixFrag;
        }

        private ShareSheetFragment a(ShareSheetFragment shareSheetFragment) {
            C1095Om.d(shareSheetFragment, DoubleCheck.lazy(this.a.be));
            PV.d(shareSheetFragment, (InterfaceC1570aGe) this.a.m.get());
            return shareSheetFragment;
        }

        private DemographicCollectionFragment d(DemographicCollectionFragment demographicCollectionFragment) {
            C1095Om.d(demographicCollectionFragment, DoubleCheck.lazy(this.a.be));
            C5497bzq.b(demographicCollectionFragment, (InterfaceC5427byZ) this.a.aK.get());
            C5497bzq.e(demographicCollectionFragment, (MoneyballDataSource) this.c.j.get());
            return demographicCollectionFragment;
        }

        private CollectPhoneFragment d(CollectPhoneFragment collectPhoneFragment) {
            C1095Om.d(collectPhoneFragment, DoubleCheck.lazy(this.a.be));
            C5474bzT.d(collectPhoneFragment, this.a.H());
            return collectPhoneFragment;
        }

        private CollectTasteDialogFrag e(CollectTasteDialogFrag collectTasteDialogFrag) {
            C1095Om.d(collectTasteDialogFrag, DoubleCheck.lazy(this.a.be));
            bAZ.d(collectTasteDialogFrag, DoubleCheck.lazy(this.a.f13381o));
            return collectTasteDialogFrag;
        }

        private EpisodesListSelectorDialogFragment e(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment) {
            C1095Om.d(episodesListSelectorDialogFragment, DoubleCheck.lazy(this.a.be));
            C3615bEk.a(episodesListSelectorDialogFragment, this.a.F());
            return episodesListSelectorDialogFragment;
        }

        private FullDpFrag c(FullDpFrag fullDpFrag) {
            C1092Oj.e(fullDpFrag, this.a.be);
            C3721bIe.b(fullDpFrag, (C3705bHp) this.t.an.get());
            C3721bIe.e(fullDpFrag, (InterfaceC7303ctf) this.t.bh.get());
            C3721bIe.c(fullDpFrag, (InterfaceC1126Pr) this.a.aT.get());
            C3721bIe.c(fullDpFrag, (InterfaceC1270Vf) this.t.A.get());
            C3721bIe.e(fullDpFrag, DoubleCheck.lazy(this.a.aO));
            C3721bIe.a(fullDpFrag, this.a.ao());
            C3721bIe.a(fullDpFrag, (InterfaceC5303bwH) this.a.j.get());
            C3721bIe.a(fullDpFrag, (C3706bHq) this.t.ao.get());
            return fullDpFrag;
        }

        private bMX d(bMX bmx) {
            C1092Oj.e(bmx, this.a.be);
            return bmx;
        }

        private MagicPathFragment b(MagicPathFragment magicPathFragment) {
            C3867bNp.d(magicPathFragment, this.t.bV());
            return magicPathFragment;
        }

        private GdpFragment c(GdpFragment gdpFragment) {
            C1092Oj.e(gdpFragment, this.a.be);
            bPR.a(gdpFragment, this.u.get());
            bPR.e(gdpFragment, DoubleCheck.lazy(this.w));
            bPR.c(gdpFragment, DoubleCheck.lazy(this.b));
            bPR.c(gdpFragment, new C3909bPd());
            bPR.e(gdpFragment, this.v.get());
            bPR.b(gdpFragment, this.i.get());
            bPR.d(gdpFragment, DoubleCheck.lazy(this.k));
            bPR.d(gdpFragment, (InterfaceC1126Pr) this.a.aT.get());
            bPR.b(gdpFragment, i());
            bPR.e(gdpFragment, (bNS) this.t.aw.get());
            return gdpFragment;
        }

        private InstallInterstitialFragment d(InstallInterstitialFragment installInterstitialFragment) {
            C1095Om.d(installInterstitialFragment, DoubleCheck.lazy(this.a.be));
            C3939bQg.e(installInterstitialFragment, (bNS) this.t.aw.get());
            C3939bQg.b(installInterstitialFragment, DoubleCheck.lazy(this.a.ax));
            return installInterstitialFragment;
        }

        private bQD d(bQD bqd) {
            C1092Oj.e(bqd, this.a.be);
            return bqd;
        }

        private FeedLolomoFragment d(FeedLolomoFragment feedLolomoFragment) {
            C1092Oj.e(feedLolomoFragment, this.a.be);
            C4047bUg.b(feedLolomoFragment, DoubleCheck.lazy(this.a.f13381o));
            C4047bUg.a(feedLolomoFragment, DoubleCheck.lazy(this.a.H));
            C4047bUg.h(feedLolomoFragment, DoubleCheck.lazy(this.t.aw));
            C4047bUg.f(feedLolomoFragment, DoubleCheck.lazy(this.t.as));
            C4047bUg.i(feedLolomoFragment, DoubleCheck.lazy(this.t.au));
            C4047bUg.j(feedLolomoFragment, DoubleCheck.lazy(this.a.N));
            C4047bUg.d(feedLolomoFragment, DoubleCheck.lazy(this.t.ac));
            C4047bUg.d(feedLolomoFragment, (InterfaceC5303bwH) this.a.j.get());
            C4047bUg.a(feedLolomoFragment, this.a.O());
            C4047bUg.a(feedLolomoFragment, new C3894bOp());
            C4047bUg.g(feedLolomoFragment, DoubleCheck.lazy(this.a.Y));
            C4047bUg.n(feedLolomoFragment, DoubleCheck.lazy(this.x));
            C4047bUg.c(feedLolomoFragment, DoubleCheck.lazy(this.a.ax));
            C4047bUg.d(feedLolomoFragment, this.t.E());
            C4047bUg.a(feedLolomoFragment, (InterfaceC5844cKl) this.t.bu.get());
            C4047bUg.d(feedLolomoFragment, new C4311bcC());
            C4047bUg.c(feedLolomoFragment, this.a.S());
            C4047bUg.d(feedLolomoFragment, this.q.get());
            C4047bUg.e(feedLolomoFragment, (InterfaceC5304bwI) this.t.f.get());
            C4047bUg.a(feedLolomoFragment, this.a.ao());
            C4047bUg.d(feedLolomoFragment, (bXD) this.t.n.get());
            C4047bUg.e(feedLolomoFragment, DoubleCheck.lazy(this.a.aF));
            C4025bTl.e(feedLolomoFragment, (InterfaceC1126Pr) this.a.aT.get());
            C4025bTl.d(feedLolomoFragment, (InterfaceC7090cpe) this.a.k.get());
            C4025bTl.e(feedLolomoFragment, this.t.bP());
            C4025bTl.d(feedLolomoFragment, DoubleCheck.lazy(this.t.aw));
            C4025bTl.c(feedLolomoFragment, DoubleCheck.lazy(this.a.aO));
            return feedLolomoFragment;
        }

        private GamesLolomoFragment d(GamesLolomoFragment gamesLolomoFragment) {
            C1092Oj.e(gamesLolomoFragment, this.a.be);
            C4047bUg.b(gamesLolomoFragment, DoubleCheck.lazy(this.a.f13381o));
            C4047bUg.a(gamesLolomoFragment, DoubleCheck.lazy(this.a.H));
            C4047bUg.h(gamesLolomoFragment, DoubleCheck.lazy(this.t.aw));
            C4047bUg.f(gamesLolomoFragment, DoubleCheck.lazy(this.t.as));
            C4047bUg.i(gamesLolomoFragment, DoubleCheck.lazy(this.t.au));
            C4047bUg.j(gamesLolomoFragment, DoubleCheck.lazy(this.a.N));
            C4047bUg.d(gamesLolomoFragment, DoubleCheck.lazy(this.t.ac));
            C4047bUg.d(gamesLolomoFragment, (InterfaceC5303bwH) this.a.j.get());
            C4047bUg.a(gamesLolomoFragment, this.a.O());
            C4047bUg.a(gamesLolomoFragment, new C3894bOp());
            C4047bUg.g(gamesLolomoFragment, DoubleCheck.lazy(this.a.Y));
            C4047bUg.n(gamesLolomoFragment, DoubleCheck.lazy(this.x));
            C4047bUg.c(gamesLolomoFragment, DoubleCheck.lazy(this.a.ax));
            C4047bUg.d(gamesLolomoFragment, this.t.E());
            C4047bUg.a(gamesLolomoFragment, (InterfaceC5844cKl) this.t.bu.get());
            C4047bUg.d(gamesLolomoFragment, new C4311bcC());
            C4047bUg.c(gamesLolomoFragment, this.a.S());
            C4047bUg.d(gamesLolomoFragment, this.q.get());
            C4047bUg.e(gamesLolomoFragment, (InterfaceC5304bwI) this.t.f.get());
            C4047bUg.a(gamesLolomoFragment, this.a.ao());
            C4047bUg.d(gamesLolomoFragment, (bXD) this.t.n.get());
            C4047bUg.e(gamesLolomoFragment, DoubleCheck.lazy(this.a.aF));
            bTC.e(gamesLolomoFragment, (InterfaceC6068cSu) this.a.aU.get());
            return gamesLolomoFragment;
        }

        private bTK b(bTK btk) {
            C1092Oj.e(btk, this.a.be);
            C4047bUg.b(btk, DoubleCheck.lazy(this.a.f13381o));
            C4047bUg.a(btk, DoubleCheck.lazy(this.a.H));
            C4047bUg.h(btk, DoubleCheck.lazy(this.t.aw));
            C4047bUg.f(btk, DoubleCheck.lazy(this.t.as));
            C4047bUg.i(btk, DoubleCheck.lazy(this.t.au));
            C4047bUg.j(btk, DoubleCheck.lazy(this.a.N));
            C4047bUg.d(btk, DoubleCheck.lazy(this.t.ac));
            C4047bUg.d(btk, (InterfaceC5303bwH) this.a.j.get());
            C4047bUg.a(btk, this.a.O());
            C4047bUg.a(btk, new C3894bOp());
            C4047bUg.g(btk, DoubleCheck.lazy(this.a.Y));
            C4047bUg.n(btk, DoubleCheck.lazy(this.x));
            C4047bUg.c(btk, DoubleCheck.lazy(this.a.ax));
            C4047bUg.d(btk, this.t.E());
            C4047bUg.a(btk, (InterfaceC5844cKl) this.t.bu.get());
            C4047bUg.d(btk, new C4311bcC());
            C4047bUg.c(btk, this.a.S());
            C4047bUg.d(btk, this.q.get());
            C4047bUg.e(btk, (InterfaceC5304bwI) this.t.f.get());
            C4047bUg.a(btk, this.a.ao());
            C4047bUg.d(btk, (bXD) this.t.n.get());
            C4047bUg.e(btk, DoubleCheck.lazy(this.a.aF));
            return btk;
        }

        private LolomoMvRxFragment d(LolomoMvRxFragment lolomoMvRxFragment) {
            C1092Oj.e(lolomoMvRxFragment, this.a.be);
            C4047bUg.b(lolomoMvRxFragment, DoubleCheck.lazy(this.a.f13381o));
            C4047bUg.a(lolomoMvRxFragment, DoubleCheck.lazy(this.a.H));
            C4047bUg.h(lolomoMvRxFragment, DoubleCheck.lazy(this.t.aw));
            C4047bUg.f(lolomoMvRxFragment, DoubleCheck.lazy(this.t.as));
            C4047bUg.i(lolomoMvRxFragment, DoubleCheck.lazy(this.t.au));
            C4047bUg.j(lolomoMvRxFragment, DoubleCheck.lazy(this.a.N));
            C4047bUg.d(lolomoMvRxFragment, DoubleCheck.lazy(this.t.ac));
            C4047bUg.d(lolomoMvRxFragment, (InterfaceC5303bwH) this.a.j.get());
            C4047bUg.a(lolomoMvRxFragment, this.a.O());
            C4047bUg.a(lolomoMvRxFragment, new C3894bOp());
            C4047bUg.g(lolomoMvRxFragment, DoubleCheck.lazy(this.a.Y));
            C4047bUg.n(lolomoMvRxFragment, DoubleCheck.lazy(this.x));
            C4047bUg.c(lolomoMvRxFragment, DoubleCheck.lazy(this.a.ax));
            C4047bUg.d(lolomoMvRxFragment, this.t.E());
            C4047bUg.a(lolomoMvRxFragment, (InterfaceC5844cKl) this.t.bu.get());
            C4047bUg.d(lolomoMvRxFragment, new C4311bcC());
            C4047bUg.c(lolomoMvRxFragment, this.a.S());
            C4047bUg.d(lolomoMvRxFragment, this.q.get());
            C4047bUg.e(lolomoMvRxFragment, (InterfaceC5304bwI) this.t.f.get());
            C4047bUg.a(lolomoMvRxFragment, this.a.ao());
            C4047bUg.d(lolomoMvRxFragment, (bXD) this.t.n.get());
            C4047bUg.e(lolomoMvRxFragment, DoubleCheck.lazy(this.a.aF));
            return lolomoMvRxFragment;
        }

        private MyNetflixFragment c(MyNetflixFragment myNetflixFragment) {
            C1092Oj.e(myNetflixFragment, this.a.be);
            C4047bUg.b(myNetflixFragment, DoubleCheck.lazy(this.a.f13381o));
            C4047bUg.a(myNetflixFragment, DoubleCheck.lazy(this.a.H));
            C4047bUg.h(myNetflixFragment, DoubleCheck.lazy(this.t.aw));
            C4047bUg.f(myNetflixFragment, DoubleCheck.lazy(this.t.as));
            C4047bUg.i(myNetflixFragment, DoubleCheck.lazy(this.t.au));
            C4047bUg.j(myNetflixFragment, DoubleCheck.lazy(this.a.N));
            C4047bUg.d(myNetflixFragment, DoubleCheck.lazy(this.t.ac));
            C4047bUg.d(myNetflixFragment, (InterfaceC5303bwH) this.a.j.get());
            C4047bUg.a(myNetflixFragment, this.a.O());
            C4047bUg.a(myNetflixFragment, new C3894bOp());
            C4047bUg.g(myNetflixFragment, DoubleCheck.lazy(this.a.Y));
            C4047bUg.n(myNetflixFragment, DoubleCheck.lazy(this.x));
            C4047bUg.c(myNetflixFragment, DoubleCheck.lazy(this.a.ax));
            C4047bUg.d(myNetflixFragment, this.t.E());
            C4047bUg.a(myNetflixFragment, (InterfaceC5844cKl) this.t.bu.get());
            C4047bUg.d(myNetflixFragment, new C4311bcC());
            C4047bUg.c(myNetflixFragment, this.a.S());
            C4047bUg.d(myNetflixFragment, this.q.get());
            C4047bUg.e(myNetflixFragment, (InterfaceC5304bwI) this.t.f.get());
            C4047bUg.a(myNetflixFragment, this.a.ao());
            C4047bUg.d(myNetflixFragment, (bXD) this.t.n.get());
            C4047bUg.e(myNetflixFragment, DoubleCheck.lazy(this.a.aF));
            C4106bWl.d(myNetflixFragment, (InterfaceC7303ctf) this.t.bh.get());
            return myNetflixFragment;
        }

        private KidsCharacterFrag e(KidsCharacterFrag kidsCharacterFrag) {
            C1092Oj.e(kidsCharacterFrag, this.a.be);
            C4167bYs.e(kidsCharacterFrag, DoubleCheck.lazy(this.a.aO));
            return kidsCharacterFrag;
        }

        private C4194bZs c(C4194bZs c4194bZs) {
            C1092Oj.e(c4194bZs, this.a.be);
            return c4194bZs;
        }

        private EmailPasswordFragment e(EmailPasswordFragment emailPasswordFragment) {
            C1092Oj.e(emailPasswordFragment, this.a.be);
            C6308cap.e(emailPasswordFragment, (LoginApi) this.t.aO.get());
            C6308cap.b(emailPasswordFragment, (C6283caQ) this.a.aD.get());
            return emailPasswordFragment;
        }

        private LoginErrorDialogFrag a(LoginErrorDialogFrag loginErrorDialogFrag) {
            C1095Om.d(loginErrorDialogFrag, DoubleCheck.lazy(this.a.be));
            C6277caK.b(loginErrorDialogFrag, (C6283caQ) this.a.aD.get());
            return loginErrorDialogFrag;
        }

        private OneTimePassCodeFragmentAb54131 b(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131) {
            C6358cbm.d(oneTimePassCodeFragmentAb54131, this.a.am());
            C6358cbm.d(oneTimePassCodeFragmentAb54131, (C6283caQ) this.a.aD.get());
            return oneTimePassCodeFragmentAb54131;
        }

        private OneTimePasscodeChoiceFragmentAb54131 c(OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131) {
            C6362cbq.e(oneTimePasscodeChoiceFragmentAb54131, (C6283caQ) this.a.aD.get());
            return oneTimePasscodeChoiceFragmentAb54131;
        }

        private RecaptchaEmailPasswordFragment a(RecaptchaEmailPasswordFragment recaptchaEmailPasswordFragment) {
            C1092Oj.e(recaptchaEmailPasswordFragment, this.a.be);
            C6308cap.e(recaptchaEmailPasswordFragment, (LoginApi) this.t.aO.get());
            C6308cap.b(recaptchaEmailPasswordFragment, (C6283caQ) this.a.aD.get());
            C6330cbK.b(recaptchaEmailPasswordFragment, (RecaptchaV3Manager.c) this.t.am.get());
            return recaptchaEmailPasswordFragment;
        }

        private C6409cck c(C6409cck c6409cck) {
            C1092Oj.e(c6409cck, this.a.be);
            C3989bSc.b(c6409cck, this.q.get());
            return c6409cck;
        }

        private ContinueWatchingMenuDialogFragment d(ContinueWatchingMenuDialogFragment continueWatchingMenuDialogFragment) {
            C1095Om.d(continueWatchingMenuDialogFragment, DoubleCheck.lazy(this.a.be));
            C6508ced.b(continueWatchingMenuDialogFragment, (InterfaceC7303ctf) this.t.bh.get());
            return continueWatchingMenuDialogFragment;
        }

        private QuickDrawDialogFrag a(QuickDrawDialogFrag quickDrawDialogFrag) {
            C1095Om.d(quickDrawDialogFrag, DoubleCheck.lazy(this.a.be));
            C6481ceC.b(quickDrawDialogFrag, (InterfaceC7303ctf) this.t.bh.get());
            C6481ceC.b(quickDrawDialogFrag, o());
            C6481ceC.e(quickDrawDialogFrag, (InterfaceC5303bwH) this.a.j.get());
            C6481ceC.e(quickDrawDialogFrag, DoubleCheck.lazy(this.a.aO));
            return quickDrawDialogFrag;
        }

        private CastSheetDialogFrag b(CastSheetDialogFrag castSheetDialogFrag) {
            C1095Om.d(castSheetDialogFrag, DoubleCheck.lazy(this.a.be));
            C6560cfc.c(castSheetDialogFrag, (bZN) this.a.Q.get());
            return castSheetDialogFrag;
        }

        private MoreFragment e(MoreFragment moreFragment) {
            C1092Oj.e(moreFragment, this.a.be);
            C6707ciQ.c(moreFragment, (InterfaceC5844cKl) this.t.bu.get());
            C6707ciQ.e(moreFragment, (cNT) this.t.bq.get());
            C6707ciQ.d(moreFragment, (InterfaceC7084cpY) this.t.be.get());
            C6707ciQ.c(moreFragment, (LoginApi) this.t.aO.get());
            C6707ciQ.d(moreFragment, (InterfaceC7967dbW) this.a.bk.get());
            C6707ciQ.c(moreFragment, this.a.O());
            return moreFragment;
        }

        private C6716ciZ e(C6716ciZ c6716ciZ) {
            C1092Oj.e(c6716ciZ, this.a.be);
            return c6716ciZ;
        }

        private MyListFragment d(MyListFragment myListFragment) {
            C1092Oj.e(myListFragment, this.a.be);
            C7001cnt.d(myListFragment, DoubleCheck.lazy(this.a.aO));
            C7001cnt.b(myListFragment, (bNS) this.t.aw.get());
            C7001cnt.e(myListFragment, (bNR) this.t.au.get());
            C7001cnt.b(myListFragment, (C6923cmU) this.a.ac.get());
            return myListFragment;
        }

        private MyListFragmentTab b(MyListFragmentTab myListFragmentTab) {
            C1092Oj.e(myListFragmentTab, this.a.be);
            C7050cor.c(myListFragmentTab, (C6923cmU) this.a.ac.get());
            return myListFragmentTab;
        }

        private MultiTitleNotificationsFrag a(MultiTitleNotificationsFrag multiTitleNotificationsFrag) {
            C1092Oj.e(multiTitleNotificationsFrag, this.a.be);
            C7120cqH.c(multiTitleNotificationsFrag, (InterfaceC7303ctf) this.t.bh.get());
            return multiTitleNotificationsFrag;
        }

        private ErrorDownloadSheetFragment d(ErrorDownloadSheetFragment errorDownloadSheetFragment) {
            C1095Om.d(errorDownloadSheetFragment, DoubleCheck.lazy(this.a.be));
            C7236csR.e(errorDownloadSheetFragment, DoubleCheck.lazy(this.t.bh));
            return errorDownloadSheetFragment;
        }

        private OfflineFragmentV2 e(OfflineFragmentV2 offlineFragmentV2) {
            C1092Oj.e(offlineFragmentV2, this.a.be);
            C7280ctI.b(offlineFragmentV2, (InterfaceC7221csC) this.t.ab.get());
            return offlineFragmentV2;
        }

        private DownloadedForYouSettingsFragment e(DownloadedForYouSettingsFragment downloadedForYouSettingsFragment) {
            C1092Oj.e(downloadedForYouSettingsFragment, this.a.be);
            C7419cvp.d(downloadedForYouSettingsFragment, (InterfaceC7221csC) this.t.ab.get());
            return downloadedForYouSettingsFragment;
        }

        private PauseAdsDialogFragment c(PauseAdsDialogFragment pauseAdsDialogFragment) {
            C1095Om.d(pauseAdsDialogFragment, DoubleCheck.lazy(this.a.be));
            C7471cwo.a(pauseAdsDialogFragment, (InterfaceC1570aGe) this.a.m.get());
            return pauseAdsDialogFragment;
        }

        private PlayerFragmentV2 c(PlayerFragmentV2 playerFragmentV2) {
            C1092Oj.e(playerFragmentV2, this.a.be);
            C7555cyS.b(playerFragmentV2, (InterfaceC1126Pr) this.a.aT.get());
            C7555cyS.e(playerFragmentV2, (InterfaceC5303bwH) this.a.j.get());
            C7555cyS.b(playerFragmentV2, this.a.S());
            C7555cyS.e(playerFragmentV2, DoubleCheck.lazy(this.a.aO));
            C7555cyS.d(playerFragmentV2, DoubleCheck.lazy(this.a.aC));
            C7555cyS.b(playerFragmentV2, DoubleCheck.lazy(this.t.n));
            C7555cyS.a(playerFragmentV2, DoubleCheck.lazy(this.a.Q));
            C7555cyS.b(playerFragmentV2, this.t.N);
            C7555cyS.c(playerFragmentV2, this.t.B);
            C7555cyS.c(playerFragmentV2, l());
            C7555cyS.e(playerFragmentV2, new C7498cxO());
            C7555cyS.c(playerFragmentV2, (bDI) this.a.aP.get());
            C7555cyS.e(playerFragmentV2, this.a.ac());
            C7555cyS.d(playerFragmentV2, (InterfaceC9638uF) this.t.aA.get());
            C7555cyS.b(playerFragmentV2, (InterfaceC7303ctf) this.t.bh.get());
            C7555cyS.e(playerFragmentV2, (InterfaceC7282ctK) this.t.bj.get());
            C7555cyS.g(playerFragmentV2, DoubleCheck.lazy(this.a.bk));
            C7555cyS.c(playerFragmentV2, DoubleCheck.lazy(this.t.bt));
            C7555cyS.a(playerFragmentV2, this.r.get());
            return playerFragmentV2;
        }

        private DeletePinDialog a(DeletePinDialog deletePinDialog) {
            cKG.c(deletePinDialog, (cKA) this.a.r.get());
            return deletePinDialog;
        }

        private cKP b(cKP ckp) {
            C1092Oj.e(ckp, this.a.be);
            return ckp;
        }

        private ProfileLockPinDialog b(ProfileLockPinDialog profileLockPinDialog) {
            C5866cLg.e(profileLockPinDialog, (cKA) this.a.r.get());
            C5866cLg.b(profileLockPinDialog, this.t.bB());
            return profileLockPinDialog;
        }

        private ValidatePasswordDialog e(ValidatePasswordDialog validatePasswordDialog) {
            C5871cLl.d(validatePasswordDialog, (cKA) this.a.r.get());
            C5871cLl.a(validatePasswordDialog, this.a.A());
            C5871cLl.a(validatePasswordDialog, this.t.bB());
            return validatePasswordDialog;
        }

        private VerifyPinDialog d(VerifyPinDialog verifyPinDialog) {
            C5866cLg.e(verifyPinDialog, (cKA) this.a.r.get());
            C5866cLg.b(verifyPinDialog, this.t.bB());
            C5876cLq.a(verifyPinDialog, this.a.A());
            return verifyPinDialog;
        }

        private AddProfileFragment c(AddProfileFragment addProfileFragment) {
            C1092Oj.e(addProfileFragment, this.a.be);
            cLE.d(addProfileFragment, new LolopiModuleImpl());
            return addProfileFragment;
        }

        private MyNetflixMenuSheetFragment d(MyNetflixMenuSheetFragment myNetflixMenuSheetFragment) {
            C1095Om.d(myNetflixMenuSheetFragment, DoubleCheck.lazy(this.a.be));
            C5899cMm.a(myNetflixMenuSheetFragment, DoubleCheck.lazy(this.p));
            return myNetflixMenuSheetFragment;
        }

        private MyNetflixRecentlyWatchedMenuFragment b(MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment) {
            C1095Om.d(myNetflixRecentlyWatchedMenuFragment, DoubleCheck.lazy(this.a.be));
            cMF.a(myNetflixRecentlyWatchedMenuFragment, this.f.get());
            cMF.a(myNetflixRecentlyWatchedMenuFragment, (InterfaceC7303ctf) this.t.bh.get());
            return myNetflixRecentlyWatchedMenuFragment;
        }

        private ProfileDetailsFragment c(ProfileDetailsFragment profileDetailsFragment) {
            C1092Oj.e(profileDetailsFragment, this.a.be);
            C5923cNj.c(profileDetailsFragment, new LolopiModuleImpl());
            C5923cNj.a(profileDetailsFragment, (cKD) this.a.aN.get());
            C5923cNj.a(profileDetailsFragment, this.t.M);
            C5923cNj.d(profileDetailsFragment, this.t.f13387J);
            return profileDetailsFragment;
        }

        private SwitchProfileSheetFragment e(SwitchProfileSheetFragment switchProfileSheetFragment) {
            C1095Om.d(switchProfileSheetFragment, DoubleCheck.lazy(this.a.be));
            C5953cOm.e(switchProfileSheetFragment, (InterfaceC5844cKl) this.t.bu.get());
            C5953cOm.d(switchProfileSheetFragment, DoubleCheck.lazy(this.p));
            return switchProfileSheetFragment;
        }

        private ProfileLanguagesFragment b(ProfileLanguagesFragment profileLanguagesFragment) {
            C1092Oj.e(profileLanguagesFragment, this.a.be);
            cOT.d(profileLanguagesFragment, (C8242dgg) this.t.C.get());
            return profileLanguagesFragment;
        }

        private C5972cPf e(C5972cPf c5972cPf) {
            C1092Oj.e(c5972cPf, this.a.be);
            return c5972cPf;
        }

        private ProfileViewingRestrictionsFragment a(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment) {
            C1092Oj.e(profileViewingRestrictionsFragment, this.a.be);
            cPE.e(profileViewingRestrictionsFragment, this.a.aB());
            cPE.d(profileViewingRestrictionsFragment, (cKD) this.a.aN.get());
            cPE.e(profileViewingRestrictionsFragment, (C8242dgg) this.t.C.get());
            return profileViewingRestrictionsFragment;
        }

        private SearchResultsOnNapaFrag e(SearchResultsOnNapaFrag searchResultsOnNapaFrag) {
            C1092Oj.e(searchResultsOnNapaFrag, this.a.be);
            cRN.a(searchResultsOnNapaFrag, (InterfaceC1270Vf) this.t.A.get());
            cRN.a(searchResultsOnNapaFrag, this.a.G());
            cRN.b(searchResultsOnNapaFrag, DoubleCheck.lazy(this.a.aB));
            cRN.d(searchResultsOnNapaFrag, DoubleCheck.lazy(this.a.H));
            cRN.a(searchResultsOnNapaFrag, DoubleCheck.lazy(this.a.aO));
            cRN.d(searchResultsOnNapaFrag, (InterfaceC6083cTf) this.a.aE.get());
            cRN.d(searchResultsOnNapaFrag, (aDB) this.t.av.get());
            return searchResultsOnNapaFrag;
        }

        private SearchSuggestionOnNapaFragment c(SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment) {
            C1092Oj.e(searchSuggestionOnNapaFragment, this.a.be);
            cRS.e(searchSuggestionOnNapaFragment, this.a.G());
            cRS.b(searchSuggestionOnNapaFragment, DoubleCheck.lazy(this.a.H));
            cRS.b(searchSuggestionOnNapaFragment, (InterfaceC6083cTf) this.a.aE.get());
            return searchSuggestionOnNapaFragment;
        }

        private PreQuerySearchFragmentV3 a(PreQuerySearchFragmentV3 preQuerySearchFragmentV3) {
            C1092Oj.e(preQuerySearchFragmentV3, this.a.be);
            C6050cSc.a(preQuerySearchFragmentV3, (InterfaceC6083cTf) this.a.aE.get());
            C6050cSc.b(preQuerySearchFragmentV3, DoubleCheck.lazy(this.a.aB));
            C6050cSc.e(preQuerySearchFragmentV3, DoubleCheck.lazy(this.a.H));
            C6050cSc.a(preQuerySearchFragmentV3, DoubleCheck.lazy(this.a.aO));
            C6050cSc.d(preQuerySearchFragmentV3, (aDB) this.t.av.get());
            return preQuerySearchFragmentV3;
        }

        private SettingsFragment c(SettingsFragment settingsFragment) {
            C6156cVy.b(settingsFragment, (InterfaceC7303ctf) this.t.bh.get());
            C6156cVy.d(settingsFragment, new OfflineActivityApiImpl());
            C6156cVy.e(settingsFragment, (InterfaceC7407cvd) this.t.ac.get());
            C6156cVy.c(settingsFragment, (InterfaceC7221csC) this.t.ab.get());
            C6156cVy.a(settingsFragment, this.t.bP());
            C6156cVy.d(settingsFragment, this.a.T());
            C6156cVy.d(settingsFragment, a());
            C6156cVy.d(settingsFragment, (aGT) this.t.aH.get());
            C6156cVy.b(settingsFragment, (bZN) this.a.Q.get());
            return settingsFragment;
        }

        private UpNextFeedFragment d(UpNextFeedFragment upNextFeedFragment) {
            C1092Oj.e(upNextFeedFragment, this.a.be);
            C7899daH.a(upNextFeedFragment, (InterfaceC1126Pr) this.a.aT.get());
            C7899daH.j(upNextFeedFragment, DoubleCheck.lazy(this.t.be));
            C7899daH.d(upNextFeedFragment, (InterfaceC5304bwI) this.t.f.get());
            C7899daH.d(upNextFeedFragment, DoubleCheck.lazy(this.t.aw));
            C7899daH.b(upNextFeedFragment, DoubleCheck.lazy(this.a.aA));
            C7899daH.a(upNextFeedFragment, this.a.S());
            C7899daH.g(upNextFeedFragment, DoubleCheck.lazy(this.a.aO));
            C7899daH.b(upNextFeedFragment, (InterfaceC5303bwH) this.a.j.get());
            C7899daH.e(upNextFeedFragment, (InterfaceC6068cSu) this.a.aU.get());
            C7899daH.e(upNextFeedFragment, (InterfaceC7090cpe) this.a.k.get());
            C7899daH.a(upNextFeedFragment, this.t.bP());
            C7899daH.e(upNextFeedFragment, DoubleCheck.lazy(this.a.H));
            C7899daH.a(upNextFeedFragment, DoubleCheck.lazy(this.t.aw));
            C7899daH.c(upNextFeedFragment, DoubleCheck.lazy(this.t.as));
            C7899daH.a(upNextFeedFragment, this.t.bM());
            return upNextFeedFragment;
        }

        private UserMarksFragment d(UserMarksFragment userMarksFragment) {
            C1092Oj.e(userMarksFragment, this.a.be);
            C8046dcw.e(userMarksFragment, DoubleCheck.lazy(this.a.aO));
            C8046dcw.e(userMarksFragment, (InterfaceC1126Pr) this.a.aT.get());
            return userMarksFragment;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class e<T> implements Provider<T> {
            private final int a;
            private final h b;
            private final i c;
            private final t d;
            private final e e;

            e(t tVar, i iVar, e eVar, h hVar, int i) {
                this.d = tVar;
                this.c = iVar;
                this.e = eVar;
                this.b = hVar;
                this.a = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.a) {
                    case 0:
                        return (T) new WelcomeFujiLogger.Factory() { // from class: o.OC.h.e.1
                            @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger.Factory
                            public WelcomeFujiLogger create(AppView appView) {
                                return new WelcomeFujiLogger(e.this.e.ar(), appView);
                            }
                        };
                    case 1:
                        return (T) bPU.b(this.b.n);
                    case 2:
                        return (T) bPT.e(this.b.n, this.b.c(), (C1619aI) this.b.u.get(), this.b.g);
                    case 3:
                        return (T) bPM.e(this.b.n, this.b.c(), (C1619aI) this.b.u.get(), this.b.g);
                    case 4:
                        return (T) bPS.c(this.b.n, this.b.g);
                    case 5:
                        return (T) bPL.e(this.b.n, this.b.g);
                    case 6:
                        return (T) bPP.e(this.b.n, this.b.g);
                    case 7:
                        return (T) new GdpEpoxyController(this.e.c, (C9935zP) this.b.i.get(), (TrackingInfoHolder) this.b.v.get(), this.b.c(), (MiniPlayerVideoGroupViewModel) this.b.k.get(), (AppView) this.b.e.get(), (bLU) this.b.s.get(), (bLW) this.b.b.get(), (bLW) this.b.w.get(), new C3909bPd(), (bNV) this.d.as.get(), (bNS) this.d.aw.get(), (bNN) this.e.H.get(), this.b.j());
                    case 8:
                        return (T) bPI.d(this.b.n, this.b.g);
                    case 9:
                        return (T) bPO.d(this.b.n, this.b.g, this.b.c(), (C1619aI) this.b.u.get());
                    case 10:
                        return (T) new GraphQLHomeRepositoryBinding(ApplicationContextModule_ProvideContextFactory.provideContext(this.d.j));
                    case 11:
                        return (T) new C7898daG();
                    case 12:
                        return (T) new C4019bTf(this.b.g);
                    case 13:
                        return (T) new InterfaceC7606czQ() { // from class: o.OC.h.e.2
                            @Override // o.InterfaceC7606czQ
                            public PlayerPostPlayManagerImpl a(IPlayer.PlaybackType playbackType, boolean z, String str, boolean z2, PostPlayExperience postPlayExperience) {
                                return new PlayerPostPlayManagerImpl((InterfaceC7282ctK) e.this.d.bj.get(), new C7608czS(), new C5525cAq(), playbackType, z, str, z2, postPlayExperience);
                            }
                        };
                    case 14:
                        return (T) new C5898cMl(this.e.c, DoubleCheck.lazy(this.d.bu), DoubleCheck.lazy(this.d.aO), DoubleCheck.lazy(this.d.bq), DoubleCheck.lazy(this.d.bY));
                    case 15:
                        return (T) new cMC.b() { // from class: o.OC.h.e.3
                            @Override // o.cMC.b
                            public cMC c(RecentlyWatchedVideoInfo recentlyWatchedVideoInfo) {
                                return new cMC(recentlyWatchedVideoInfo, DoubleCheck.lazy(e.this.e.aO), DoubleCheck.lazy(e.this.e.aT), DoubleCheck.lazy(e.this.d.P), e.this.e.c, DoubleCheck.lazy(e.this.e.ay), e.this.d.E());
                            }
                        };
                    default:
                        throw new AssertionError(this.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class u extends ReleaseNetflixApplication_HiltComponents.o {
        private final t a;
        private final u c;
        private final i d;
        private final e e;

        @Override // o.aJZ
        public void b(aJY ajy) {
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateEditText_GeneratedInjector
        public void injectBirthDateEditText(BirthDateEditText birthDateEditText) {
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthEditText_GeneratedInjector
        public void injectBirthMonthEditText(BirthMonthEditText birthMonthEditText) {
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditText_GeneratedInjector
        public void injectBirthYearEditText(BirthYearEditText birthYearEditText) {
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditText_GeneratedInjector
        public void injectPopupEditText(PopupEditText popupEditText) {
        }

        @Override // com.netflix.mediaclient.acquisition.components.banner.SignupBannerView_GeneratedInjector
        public void injectSignupBannerView(SignupBannerView signupBannerView) {
        }

        private u(t tVar, i iVar, e eVar, View view) {
            this.c = this;
            this.a = tVar;
            this.d = iVar;
            this.e = eVar;
        }

        private KeyboardController b() {
            return new KeyboardController(this.e.c);
        }

        private Set<InterfaceC9934zO> c() {
            return ImmutableSet.of((C7904daM) this.e.K(), (C7904daM) this.e.R(), (C7904daM) this.e.U(), (C7904daM) this.e.Y(), this.e.aq());
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry_GeneratedInjector
        public void injectMaturityPinEntry(MaturityPinEntry maturityPinEntry) {
            a(maturityPinEntry);
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox_GeneratedInjector
        public void injectProfileEntryEditTextCheckbox(ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox) {
            a(profileEntryEditTextCheckbox);
        }

        @Override // o.RT
        public void a(NetflixActionBarInterstitials netflixActionBarInterstitials) {
            e(netflixActionBarInterstitials);
        }

        @Override // o.InterfaceC1188Sb
        public void e(NetflixBottomNavBar netflixBottomNavBar) {
            d(netflixBottomNavBar);
        }

        @Override // o.InterfaceC1201So
        public void a(NetflixImageView netflixImageView) {
            e(netflixImageView);
        }

        @Override // o.InterfaceC1200Sn
        public void e(NetflixTagsTextView netflixTagsTextView) {
            a(netflixTagsTextView);
        }

        @Override // o.bFD
        public void b(EpisodeView episodeView) {
            d(episodeView);
        }

        @Override // o.InterfaceC6471cdt
        public void b(BillboardView billboardView) {
            d(billboardView);
        }

        @Override // o.InterfaceC6427cdB
        public void e(CwView cwView) {
            b(cwView);
        }

        @Override // o.InterfaceC7185crT
        public void d(DownloadButton downloadButton) {
            e(downloadButton);
        }

        @Override // o.InterfaceC7325cuA
        public void c(SeasonDownloadButton seasonDownloadButton) {
            d(seasonDownloadButton);
        }

        @Override // o.cXS
        public void d(UserMessageAreaView userMessageAreaView) {
            b(userMessageAreaView);
        }

        private MaturityPinEntry a(MaturityPinEntry maturityPinEntry) {
            MaturityPinEntry_MembersInjector.injectKeyboardController(maturityPinEntry, b());
            return maturityPinEntry;
        }

        private ProfileEntryEditTextCheckbox a(ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox) {
            ProfileEntryEditTextCheckbox_MembersInjector.injectInteractionListenerFactory(profileEntryEditTextCheckbox, this.e.J());
            return profileEntryEditTextCheckbox;
        }

        private NetflixActionBarInterstitials e(NetflixActionBarInterstitials netflixActionBarInterstitials) {
            RU.c(netflixActionBarInterstitials, (bXD) this.a.n.get());
            RU.e(netflixActionBarInterstitials, this.a.bB());
            return netflixActionBarInterstitials;
        }

        private NetflixBottomNavBar d(NetflixBottomNavBar netflixBottomNavBar) {
            C1187Sa.a(netflixBottomNavBar, (InterfaceC5844cKl) this.a.bu.get());
            C1187Sa.c(netflixBottomNavBar, (cNT) this.a.bq.get());
            C1187Sa.b(netflixBottomNavBar, c());
            return netflixBottomNavBar;
        }

        private NetflixImageView e(NetflixImageView netflixImageView) {
            C1198Sl.b(netflixImageView, DoubleCheck.lazy(this.a.aC));
            C1198Sl.a(netflixImageView, DoubleCheck.lazy(this.a.aA));
            return netflixImageView;
        }

        private NetflixTagsTextView a(NetflixTagsTextView netflixTagsTextView) {
            C1197Sk.c(netflixTagsTextView, DoubleCheck.lazy(this.a.g));
            return netflixTagsTextView;
        }

        private EpisodeView d(EpisodeView episodeView) {
            bFF.c(episodeView, (InterfaceC7303ctf) this.a.bh.get());
            return episodeView;
        }

        private BillboardView d(BillboardView billboardView) {
            C6475cdx.d(billboardView, bFA.d(this.a.U));
            C6475cdx.a(billboardView, DoubleCheck.lazy(this.a.P));
            C6475cdx.c(billboardView, DoubleCheck.lazy(this.e.A));
            C6475cdx.e(billboardView, DoubleCheck.lazy(this.e.aO));
            return billboardView;
        }

        private CwView b(CwView cwView) {
            C6477cdz.a(cwView, DoubleCheck.lazy(this.e.aO));
            return cwView;
        }

        private DownloadButton e(DownloadButton downloadButton) {
            C7183crR.d(downloadButton, this.a.aW());
            C7183crR.d(downloadButton, (InterfaceC7303ctf) this.a.bh.get());
            return downloadButton;
        }

        private SeasonDownloadButton d(SeasonDownloadButton seasonDownloadButton) {
            C7183crR.d(seasonDownloadButton, this.a.aW());
            C7183crR.d((DownloadButton) seasonDownloadButton, (InterfaceC7303ctf) this.a.bh.get());
            C7328cuD.a(seasonDownloadButton, new SeasonDownloadButtonClickListener());
            C7328cuD.e(seasonDownloadButton, (InterfaceC7303ctf) this.a.bh.get());
            return seasonDownloadButton;
        }

        private UserMessageAreaView b(UserMessageAreaView userMessageAreaView) {
            cXX.c(userMessageAreaView, (InterfaceC5844cKl) this.a.bu.get());
            cXX.a(userMessageAreaView, (cNT) this.a.bq.get());
            cXX.d(userMessageAreaView, new C5470bzP());
            cXX.c(userMessageAreaView, (LoginApi) this.a.aO.get());
            cXX.b(userMessageAreaView, DoubleCheck.lazy(this.e.n));
            return userMessageAreaView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends ReleaseNetflixApplication_HiltComponents.c {
        private Provider<C3671bGi> A;
        private Provider<DeepLinkHandlerImpl> B;
        private Provider<C3651bFt> C;
        private final DetailsPagePrefetcher_ActivityComponent_HiltModule D;
        private final FaqModule E;
        private final GamesBottomTab_ActivityComponent_HiltModule F;
        private final EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule G;
        private Provider<bNW> H;
        private final GamesAssetFetcher_ActivityComponent_HiltModule I;

        /* renamed from: J  reason: collision with root package name */
        private final HomeTab_ActivityComponent_HiltModule f13380J;
        private Provider<C1306Wp> K;
        private final Home_ActivityComponent_HiltModule L;
        private Provider<ImageLoaderComposeImpl> M;
        private Provider<C3957bQy> N;
        private Provider<C9867yA> O;
        private Provider<MemberRejoinImpl> P;
        private Provider<bZO> Q;
        private final MemberRejoinMoneyballModule R;
        private final LiveStateManager_ActivityComponent_HiltModule S;
        private Provider<ReleaseNetflixApplication_HiltComponents.h.b> T;
        private Provider<C6755cjL> U;
        private final MhuEbiEntryPointModule V;
        private Provider<C6765cjV> W;
        private Provider<C1315Wy> X;
        private Provider<C5895cMi> Y;
        private Provider<C5900cMn> Z;
        private Provider<InterfaceC3993bSg> aA;
        private Provider<bZI> aB;
        private Provider<InterfaceC5602cBm> aC;
        private Provider<C6283caQ> aD;
        private Provider<InterfaceC6083cTf> aE;
        private Provider<InterfaceC5425byX> aF;
        private Provider<InterfaceC8351dij> aG;
        private Provider<InterfaceC6634cgx> aH;
        private Provider<SignupMoneyballEntryPoint> aI;
        private Provider<InterfaceC6590cgF> aJ;
        private Provider<InterfaceC5427byZ> aK;
        private Provider<InterfaceC6829ckg> aL;
        private final RegenoldModule aM;
        private Provider<cKD> aN;
        private Provider<PlaybackLauncher> aO;
        private Provider<bDI> aP;
        private final SMSRetrieverManager.SMSRetrieverModule aQ;
        private final SearchRepositoryFactory_ActivityComponent_HiltModule aR;
        private Provider<ServiceManagerControllerImpl> aS;
        private Provider<C1139Qe> aT;
        private Provider<C6085cTh> aU;
        private final SignupLibModule aV;
        private final SignupModule aW;
        private Provider<C1311Wu> aX;
        private final t aY;
        private Provider<C1309Ws> aZ;
        private Provider<cLW> aa;
        private Provider<C5889cMc> ab;
        private Provider<C6923cmU> ac;
        private Provider<C5907cMu> ad;
        private final MyNetflixTab_ActivityComponent_HiltModule ae;
        private final MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule af;
        private Provider<C5904cMr> ag;
        private Provider<NotificationPermissionImpl> ah;
        private final PasswordOnlyModule ai;
        private final OfflineTab_ActivityComponent_HiltModule aj;
        private Provider<C1313Ww> ak;
        private final OneTimePassCodeFlowModuleAb54131 al;
        private final OnRampModule am;
        private final PlayerRepositoryFactory_ActivityComponent_HiltModule an;
        private final PlayerPrefetchRepository_ActivityComponent_HiltModule ao;
        private Provider<bDN> ap;
        private Provider<bDH> aq;
        private Provider<cID> ar;
        private final ProfileLockRepositoryImpl.ProfileLockRepositoryModule as;
        private Provider<bBL> at;
        private Provider<C1307Wq> au;
        private final ProfileLockImpl.ProfileLockModule av;
        private Provider<C1305Wo> aw;
        private Provider<bNL> ax;
        private Provider<cMK> ay;
        private Provider<InterfaceC3663bGe> az;
        private final e b;
        private Provider<bBO> ba;
        private Provider<C1312Wv> bb;
        private Provider<C1316Wz> bc;
        private Provider<UiLatencyTrackerLogger> bd;
        private Provider<UiLatencyTrackerImpl> be;
        private Provider<cWS.d> bf;
        private final UpiModule bg;
        private final UxConfigClientCapabilities_ActivityComponent_HiltModule bh;
        private Provider<C7900daI> bi;
        private final UpNextTab_ActivityComponent_HiltModule bj;
        private Provider<C8048dcy> bk;
        private final WelcomeFujiModule bl;
        private final VerifyCardModule bm;
        private final VerifyCardContextModule bn;
        private final ViewingRestrictionsRepository_ActivityComponent_HiltModule bo;
        private final Activity c;
        private final i d;
        private final AddProfilesEEContextModule_Ab31697 e;
        private Provider<C1302Wl> f;
        private Provider<C5305bwJ> g;
        private Provider<C1296Wf> h;
        private Provider<C1297Wg> i;
        private Provider<InterfaceC5303bwH> j;
        private Provider<InterfaceC7090cpe> k;
        private Provider<InterfaceC6746cjC> l;
        private Provider<InterfaceC1570aGe> m;
        private Provider<InterfaceC6761cjR> n;

        /* renamed from: o  reason: collision with root package name */
        private Provider<CollectTaste> f13381o;
        private final CfourSurveyModule p;
        private Provider<cIH> q;
        private Provider<cKA> r;
        private Provider<C1298Wh> s;
        private Provider<CollectTasteImpl> t;
        private Provider<C1301Wk> u;
        private Provider<bBJ> v;
        private Provider<bBF> w;
        private Provider<C1299Wi> x;
        private Provider<C1310Wt> y;
        private final DetailsPageRepository_ActivityComponent_HiltModule z;

        private e(t tVar, i iVar, AddProfilesEEContextModule_Ab31697 addProfilesEEContextModule_Ab31697, CfourSurveyModule cfourSurveyModule, DetailsPagePrefetcher_ActivityComponent_HiltModule detailsPagePrefetcher_ActivityComponent_HiltModule, DetailsPageRepository_ActivityComponent_HiltModule detailsPageRepository_ActivityComponent_HiltModule, EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule, FaqModule faqModule, GamesAssetFetcher_ActivityComponent_HiltModule gamesAssetFetcher_ActivityComponent_HiltModule, GamesBottomTab_ActivityComponent_HiltModule gamesBottomTab_ActivityComponent_HiltModule, HomeTab_ActivityComponent_HiltModule homeTab_ActivityComponent_HiltModule, Home_ActivityComponent_HiltModule home_ActivityComponent_HiltModule, LiveStateManager_ActivityComponent_HiltModule liveStateManager_ActivityComponent_HiltModule, MemberRejoinMoneyballModule memberRejoinMoneyballModule, MhuEbiEntryPointModule mhuEbiEntryPointModule, MyNetflixTab_ActivityComponent_HiltModule myNetflixTab_ActivityComponent_HiltModule, MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule myNetflixWatchHistoryRepository_ActivityComponent_HiltModule, OfflineTab_ActivityComponent_HiltModule offlineTab_ActivityComponent_HiltModule, OnRampModule onRampModule, OneTimePassCodeFlowModuleAb54131 oneTimePassCodeFlowModuleAb54131, PasswordOnlyModule passwordOnlyModule, PlayerPrefetchRepository_ActivityComponent_HiltModule playerPrefetchRepository_ActivityComponent_HiltModule, PlayerRepositoryFactory_ActivityComponent_HiltModule playerRepositoryFactory_ActivityComponent_HiltModule, ProfileLockImpl.ProfileLockModule profileLockModule, ProfileLockRepositoryImpl.ProfileLockRepositoryModule profileLockRepositoryModule, RegenoldModule regenoldModule, SMSRetrieverManager.SMSRetrieverModule sMSRetrieverModule, SearchRepositoryFactory_ActivityComponent_HiltModule searchRepositoryFactory_ActivityComponent_HiltModule, SignupLibModule signupLibModule, SignupModule signupModule, UpNextTab_ActivityComponent_HiltModule upNextTab_ActivityComponent_HiltModule, UpiModule upiModule, UxConfigClientCapabilities_ActivityComponent_HiltModule uxConfigClientCapabilities_ActivityComponent_HiltModule, VerifyCardContextModule verifyCardContextModule, VerifyCardModule verifyCardModule, ViewingRestrictionsRepository_ActivityComponent_HiltModule viewingRestrictionsRepository_ActivityComponent_HiltModule, WelcomeFujiModule welcomeFujiModule, Activity activity) {
            this.b = this;
            this.aY = tVar;
            this.d = iVar;
            this.aW = signupModule;
            this.c = activity;
            this.R = memberRejoinMoneyballModule;
            this.z = detailsPageRepository_ActivityComponent_HiltModule;
            this.L = home_ActivityComponent_HiltModule;
            this.aR = searchRepositoryFactory_ActivityComponent_HiltModule;
            this.bh = uxConfigClientCapabilities_ActivityComponent_HiltModule;
            this.V = mhuEbiEntryPointModule;
            this.av = profileLockModule;
            this.aV = signupLibModule;
            this.E = faqModule;
            this.aM = regenoldModule;
            this.e = addProfilesEEContextModule_Ab31697;
            this.am = onRampModule;
            this.ai = passwordOnlyModule;
            this.bg = upiModule;
            this.bm = verifyCardModule;
            this.bn = verifyCardContextModule;
            this.bl = welcomeFujiModule;
            this.p = cfourSurveyModule;
            this.G = episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule;
            this.I = gamesAssetFetcher_ActivityComponent_HiltModule;
            this.ae = myNetflixTab_ActivityComponent_HiltModule;
            this.al = oneTimePassCodeFlowModuleAb54131;
            this.aQ = sMSRetrieverModule;
            this.ao = playerPrefetchRepository_ActivityComponent_HiltModule;
            this.an = playerRepositoryFactory_ActivityComponent_HiltModule;
            this.as = profileLockRepositoryModule;
            this.af = myNetflixWatchHistoryRepository_ActivityComponent_HiltModule;
            this.bo = viewingRestrictionsRepository_ActivityComponent_HiltModule;
            this.D = detailsPagePrefetcher_ActivityComponent_HiltModule;
            this.S = liveStateManager_ActivityComponent_HiltModule;
            this.F = gamesBottomTab_ActivityComponent_HiltModule;
            this.f13380J = homeTab_ActivityComponent_HiltModule;
            this.aj = offlineTab_ActivityComponent_HiltModule;
            this.bj = upNextTab_ActivityComponent_HiltModule;
            c(addProfilesEEContextModule_Ab31697, cfourSurveyModule, detailsPagePrefetcher_ActivityComponent_HiltModule, detailsPageRepository_ActivityComponent_HiltModule, episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule, faqModule, gamesAssetFetcher_ActivityComponent_HiltModule, gamesBottomTab_ActivityComponent_HiltModule, homeTab_ActivityComponent_HiltModule, home_ActivityComponent_HiltModule, liveStateManager_ActivityComponent_HiltModule, memberRejoinMoneyballModule, mhuEbiEntryPointModule, myNetflixTab_ActivityComponent_HiltModule, myNetflixWatchHistoryRepository_ActivityComponent_HiltModule, offlineTab_ActivityComponent_HiltModule, onRampModule, oneTimePassCodeFlowModuleAb54131, passwordOnlyModule, playerPrefetchRepository_ActivityComponent_HiltModule, playerRepositoryFactory_ActivityComponent_HiltModule, profileLockModule, profileLockRepositoryModule, regenoldModule, sMSRetrieverModule, searchRepositoryFactory_ActivityComponent_HiltModule, signupLibModule, signupModule, upNextTab_ActivityComponent_HiltModule, upiModule, uxConfigClientCapabilities_ActivityComponent_HiltModule, verifyCardContextModule, verifyCardModule, viewingRestrictionsRepository_ActivityComponent_HiltModule, welcomeFujiModule, activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SignupLogger ar() {
            return new SignupLogger(SignupLibSingletonModule_ProvidesClLoggerFactory.providesClLogger(this.aY.bN), SignupLibSingletonModule_ProvidesExtClLoggerFactory.providesExtClLogger(this.aY.bN));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FormViewEditTextInteractionListenerFactoryImpl J() {
            return new FormViewEditTextInteractionListenerFactoryImpl(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C6680chq S() {
            return new C6680chq(this.c);
        }

        private C7032coY X() {
            return new C7032coY(this.c);
        }

        private SignupFragmentLifecycleLogger ap() {
            return new SignupFragmentLifecycleLogger(ar());
        }

        private ErrorDialogHelper E() {
            return new ErrorDialogHelper(this.c, (LoginApi) this.aY.aO.get());
        }

        private NetflixActivityErrorHandlerImpl W() {
            return new NetflixActivityErrorHandlerImpl(this.c, this.aY.aO, this.aY.bq);
        }

        private C6040cRt ak() {
            return new C6040cRt(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C7002cnu O() {
            return new C7002cnu(this.c, new C3894bOp());
        }

        private C7197crf V() {
            return new C7197crf(this.c, S());
        }

        private C4187bZl ag() {
            return new C4187bZl(ApplicationContextModule_ProvideContextFactory.provideContext(this.aY.j), new ProfileGateVariantPolicyImpl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NotificationPermissionLaunchHelperImpl T() {
            return new NotificationPermissionLaunchHelperImpl(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UmaImpl ao() {
            return new UmaImpl(this.c, S());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1587aGv ax() {
            return new C1587aGv((InterfaceC1270Vf) this.aY.A.get());
        }

        private cPW ad() {
            return new cPW(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ProfileLockImpl af() {
            return new ProfileLockImpl(this.c);
        }

        private cPK ah() {
            return new cPK(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EmvcoDataService I() {
            return SignupModule_ProvidesEmvcoDataServiceFactory.providesEmvcoDataService(this.aW, this.c, this.aY.bK());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SignupErrorReporter.LoggedErrorListener P() {
            return SignupLibModule_ProvidesLoggedErrorListenerFactory.providesLoggedErrorListener(this.aV, this.c);
        }

        private FaqLogger M() {
            return new FaqLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FaqFragment.FaqInteractionListener L() {
            return FaqModule_ProvidesFaqInteractionListenerFactory.providesFaqInteractionListener(this.E, M());
        }

        private RegenoldLogger al() {
            return new RegenoldLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RegenoldFragment.RegenoldInteractionListener aj() {
            return RegenoldModule_ProvidesRegenoldInteractionListenerFactory.providesRegenoldInteractionListener(this.aM, al());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener C() {
            return AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory.onAddProfilesEEContextConfirm(this.e, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TtrEventListener an() {
            return SignupModule_ProvidesTtrEventListenerFactory.providesTtrEventListener(this.aW, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OnRampFragment.OnRampNavigationListener Z() {
            return OnRampModule_ProvidesOnRampNavigatedListenerFactory.providesOnRampNavigatedListener(this.am, this.c);
        }

        private PasswordOnlyLogger ab() {
            return new PasswordOnlyLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PasswordOnlyFragment.PasswordOnlyInteractionListener aa() {
            return PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory.providesPasswordOnlyInteractionListener(this.ai, ab());
        }

        private UpiWaitingLogger av() {
            return new UpiWaitingLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpiWaitingFragment.InteractionListener Q() {
            return UpiModule_ProvidesUpiWaitingInteractionListenerFactory.providesUpiWaitingInteractionListener(this.bg, av());
        }

        private VerifyCard3dsEventLogger aw() {
            return new VerifyCard3dsEventLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VerifyCardFragment.VerifyCard3dsEventListener at() {
            return VerifyCardModule_ProvidesThreeDsEventListenerFactory.providesThreeDsEventListener(this.bm, aw());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VerifyCardContextFragment.VerifyCardContextClickListener as() {
            return VerifyCardContextModule_VerifyCardContextClickListenerFactory.verifyCardContextClickListener(this.bn, this.c);
        }

        private VerifyCardContextEventLogger au() {
            return new VerifyCardContextEventLogger(ar());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VerifyCardContextFragment.EventListener N() {
            return VerifyCardContextModule_VerifyCardContextEventListenerFactory.verifyCardContextEventListener(this.bn, au());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public WelcomeFujiFragment.WelcomeFujiNavigationListener ay() {
            return WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory.providesWelcomeFujiNavigationListener(this.bl, this.c);
        }

        private SMSRetrieverManager ai() {
            return SignupModule_ProvidesSMSRetrieverManagerFactory.providesSMSRetrieverManager(this.aW, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5463bzI H() {
            return new C5463bzI(ai());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC3619bEo F() {
            return C3621bEq.d(this.G, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5845cKm U() {
            return C5854cKv.b(this.ae, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C5424byW D() {
            return new C5424byW(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SMSRetriever am() {
            return SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory.providesSMSRetriever(this.aQ, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC5603cBn ac() {
            return C5610cBu.b(this.an, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ProfileLockRepositoryImpl ae() {
            return new ProfileLockRepositoryImpl(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TZ A() {
            return new TZ(this.c, this.aY.bB(), this.aY.E(), this.aY.bb(), this.aY.aR());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC5984cPr aB() {
            return C5985cPs.a(this.bo, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC3645bFn G() {
            return C3653bFv.d(this.D, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bOT K() {
            return bOW.e(this.F, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bSZ R() {
            return C4016bTc.b(this.f13380J, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C7296ctY Y() {
            return C7356cuf.c(this.aj, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C7904daM aq() {
            return C7910daS.b(this.bj, this.c);
        }

        private void c(AddProfilesEEContextModule_Ab31697 addProfilesEEContextModule_Ab31697, CfourSurveyModule cfourSurveyModule, DetailsPagePrefetcher_ActivityComponent_HiltModule detailsPagePrefetcher_ActivityComponent_HiltModule, DetailsPageRepository_ActivityComponent_HiltModule detailsPageRepository_ActivityComponent_HiltModule, EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule, FaqModule faqModule, GamesAssetFetcher_ActivityComponent_HiltModule gamesAssetFetcher_ActivityComponent_HiltModule, GamesBottomTab_ActivityComponent_HiltModule gamesBottomTab_ActivityComponent_HiltModule, HomeTab_ActivityComponent_HiltModule homeTab_ActivityComponent_HiltModule, Home_ActivityComponent_HiltModule home_ActivityComponent_HiltModule, LiveStateManager_ActivityComponent_HiltModule liveStateManager_ActivityComponent_HiltModule, MemberRejoinMoneyballModule memberRejoinMoneyballModule, MhuEbiEntryPointModule mhuEbiEntryPointModule, MyNetflixTab_ActivityComponent_HiltModule myNetflixTab_ActivityComponent_HiltModule, MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule myNetflixWatchHistoryRepository_ActivityComponent_HiltModule, OfflineTab_ActivityComponent_HiltModule offlineTab_ActivityComponent_HiltModule, OnRampModule onRampModule, OneTimePassCodeFlowModuleAb54131 oneTimePassCodeFlowModuleAb54131, PasswordOnlyModule passwordOnlyModule, PlayerPrefetchRepository_ActivityComponent_HiltModule playerPrefetchRepository_ActivityComponent_HiltModule, PlayerRepositoryFactory_ActivityComponent_HiltModule playerRepositoryFactory_ActivityComponent_HiltModule, ProfileLockImpl.ProfileLockModule profileLockModule, ProfileLockRepositoryImpl.ProfileLockRepositoryModule profileLockRepositoryModule, RegenoldModule regenoldModule, SMSRetrieverManager.SMSRetrieverModule sMSRetrieverModule, SearchRepositoryFactory_ActivityComponent_HiltModule searchRepositoryFactory_ActivityComponent_HiltModule, SignupLibModule signupLibModule, SignupModule signupModule, UpNextTab_ActivityComponent_HiltModule upNextTab_ActivityComponent_HiltModule, UpiModule upiModule, UxConfigClientCapabilities_ActivityComponent_HiltModule uxConfigClientCapabilities_ActivityComponent_HiltModule, VerifyCardContextModule verifyCardContextModule, VerifyCardModule verifyCardModule, ViewingRestrictionsRepository_ActivityComponent_HiltModule viewingRestrictionsRepository_ActivityComponent_HiltModule, WelcomeFujiModule welcomeFujiModule, Activity activity) {
            this.T = new a(this.aY, this.d, this.b, 1);
            this.aI = DoubleCheck.provider(new a(this.aY, this.d, this.b, 0));
            this.aS = DoubleCheck.provider(new a(this.aY, this.d, this.b, 2));
            this.aJ = DoubleCheck.provider(new a(this.aY, this.d, this.b, 4));
            a aVar = new a(this.aY, this.d, this.b, 3);
            this.P = aVar;
            this.aH = DoubleCheck.provider(aVar);
            a aVar2 = new a(this.aY, this.d, this.b, 5);
            this.ap = aVar2;
            this.aP = DoubleCheck.provider(aVar2);
            a aVar3 = new a(this.aY, this.d, this.b, 6);
            this.g = aVar3;
            this.j = DoubleCheck.provider(aVar3);
            this.B = new a(this.aY, this.d, this.b, 7);
            a aVar4 = new a(this.aY, this.d, this.b, 8);
            this.M = aVar4;
            this.m = DoubleCheck.provider(aVar4);
            a aVar5 = new a(this.aY, this.d, this.b, 9);
            this.aq = aVar5;
            this.aO = DoubleCheck.provider(aVar5);
            this.az = new a(this.aY, this.d, this.b, 11);
            this.C = new a(this.aY, this.d, this.b, 10);
            this.A = new a(this.aY, this.d, this.b, 12);
            this.aA = new a(this.aY, this.d, this.b, 13);
            this.aE = new a(this.aY, this.d, this.b, 14);
            this.aU = new a(this.aY, this.d, this.b, 15);
            a aVar6 = new a(this.aY, this.d, this.b, 16);
            this.ah = aVar6;
            this.k = DoubleCheck.provider(aVar6);
            this.aG = new a(this.aY, this.d, this.b, 17);
            a aVar7 = new a(this.aY, this.d, this.b, 18);
            this.U = aVar7;
            this.l = DoubleCheck.provider(aVar7);
            this.aL = DoubleCheck.provider(new a(this.aY, this.d, this.b, 19));
            this.ac = DoubleCheck.provider(new a(this.aY, this.d, this.b, 20));
            a aVar8 = new a(this.aY, this.d, this.b, 21);
            this.ar = aVar8;
            this.q = DoubleCheck.provider(aVar8);
            this.bd = new a(this.aY, this.d, this.b, 23);
            this.be = new a(this.aY, this.d, this.b, 22);
            this.bf = SingleCheck.provider(new a(this.aY, this.d, this.b, 24));
            this.bi = new a(this.aY, this.d, this.b, 25);
            this.s = DoubleCheck.provider(new a(this.aY, this.d, this.b, 29));
            this.f = DoubleCheck.provider(new a(this.aY, this.d, this.b, 30));
            this.au = DoubleCheck.provider(new a(this.aY, this.d, this.b, 31));
            this.x = DoubleCheck.provider(new a(this.aY, this.d, this.b, 28));
            this.aZ = DoubleCheck.provider(new a(this.aY, this.d, this.b, 33));
            this.aw = DoubleCheck.provider(new a(this.aY, this.d, this.b, 35));
            this.aX = DoubleCheck.provider(new a(this.aY, this.d, this.b, 34));
            this.bb = DoubleCheck.provider(new a(this.aY, this.d, this.b, 37));
            this.h = DoubleCheck.provider(new a(this.aY, this.d, this.b, 36));
            this.u = DoubleCheck.provider(new a(this.aY, this.d, this.b, 32));
            this.y = DoubleCheck.provider(new a(this.aY, this.d, this.b, 27));
            this.X = DoubleCheck.provider(new a(this.aY, this.d, this.b, 38));
            this.ak = DoubleCheck.provider(new a(this.aY, this.d, this.b, 39));
            this.K = DoubleCheck.provider(new a(this.aY, this.d, this.b, 41));
            this.i = DoubleCheck.provider(new a(this.aY, this.d, this.b, 42));
            this.bc = DoubleCheck.provider(new a(this.aY, this.d, this.b, 40));
            this.w = DoubleCheck.provider(new a(this.aY, this.d, this.b, 26));
            this.v = DoubleCheck.provider(new a(this.aY, this.d, this.b, 43));
            this.at = DoubleCheck.provider(new a(this.aY, this.d, this.b, 44));
            this.ba = DoubleCheck.provider(new a(this.aY, this.d, this.b, 45));
            this.Q = new a(this.aY, this.d, this.b, 46);
            this.aN = DoubleCheck.provider(new a(this.aY, this.d, this.b, 47));
            this.O = DoubleCheck.provider(new a(this.aY, this.d, this.b, 48));
            this.aK = DoubleCheck.provider(new a(this.aY, this.d, this.b, 49));
            a aVar9 = new a(this.aY, this.d, this.b, 50);
            this.t = aVar9;
            this.f13381o = DoubleCheck.provider(aVar9);
            this.aT = new a(this.aY, this.d, this.b, 51);
            this.H = new a(this.aY, this.d, this.b, 52);
            this.ax = new a(this.aY, this.d, this.b, 53);
            this.N = new a(this.aY, this.d, this.b, 54);
            this.ag = new a(this.aY, this.d, this.b, 57);
            this.ad = new a(this.aY, this.d, this.b, 56);
            this.Z = new a(this.aY, this.d, this.b, 58);
            this.ab = new a(this.aY, this.d, this.b, 59);
            this.aa = new a(this.aY, this.d, this.b, 60);
            this.Y = new a(this.aY, this.d, this.b, 55);
            this.aF = DoubleCheck.provider(new a(this.aY, this.d, this.b, 61));
            this.aD = DoubleCheck.provider(new a(this.aY, this.d, this.b, 62));
            this.bk = new a(this.aY, this.d, this.b, 63);
            this.aC = new a(this.aY, this.d, this.b, 64);
            this.r = DoubleCheck.provider(new a(this.aY, this.d, this.b, 65));
            this.ay = new a(this.aY, this.d, this.b, 66);
            this.aB = new a(this.aY, this.d, this.b, 67);
            a aVar10 = new a(this.aY, this.d, this.b, 68);
            this.W = aVar10;
            this.n = DoubleCheck.provider(aVar10);
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.ActivityAccessor
        public SignupMoneyballEntryPoint getSignupEntryPoint() {
            return this.aI.get();
        }

        @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.ActivityAccessor
        public FormViewEditTextInteractionListenerFactory getFormViewEditTextInteractionListenerFactory() {
            return J();
        }

        @Override // com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity_GeneratedInjector
        public void injectSignupNativeActivity(SignupNativeActivity signupNativeActivity) {
            c(signupNativeActivity);
        }

        @Override // com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity_GeneratedInjector
        public void injectSignupActivity(SignupActivity signupActivity) {
            c(signupActivity);
        }

        @Override // o.InterfaceC1060Ne
        public void a(NetflixActivity netflixActivity) {
            d(netflixActivity);
        }

        @Override // o.InterfaceC1586aGu
        public InterfaceC5303bwH c() {
            return this.j.get();
        }

        @Override // o.InterfaceC1591aGz
        public bEX j() {
            return this.B.get();
        }

        @Override // o.aGF, o.InterfaceC6679chp
        public InterfaceC1570aGe f() {
            return this.m.get();
        }

        @Override // o.aGG
        public PlaybackLauncher r() {
            return this.aO.get();
        }

        @Override // o.aGI
        public bDI s() {
            return this.aP.get();
        }

        @Override // o.InterfaceC1637aIr
        public void b(NetflixActivityBase netflixActivityBase) {
            c(netflixActivityBase);
        }

        @Override // o.InterfaceC1640aIu.d
        public InterfaceC1640aIu k() {
            return W();
        }

        @Override // o.aIB.c
        public aIB x() {
            return this.aS.get();
        }

        @Override // o.C1702aLb.d
        public InterfaceC6042cRv u() {
            return ak();
        }

        @Override // o.InterfaceC3640bFi
        public void c(DetailsActivity detailsActivity) {
            a(detailsActivity);
        }

        @Override // o.bFR
        public void a(bFS bfs) {
            e(bfs);
        }

        @Override // o.InterfaceC3661bGc.e
        public InterfaceC3661bGc h() {
            return this.A.get();
        }

        @Override // o.bNU
        public void e(GameDetailsActivity gameDetailsActivity) {
            b(gameDetailsActivity);
        }

        @Override // o.bOU
        public void b(GamesLolomoActivity gamesLolomoActivity) {
            e(gamesLolomoActivity);
        }

        @Override // o.bRW
        public void d(HomeActivity homeActivity) {
            e(homeActivity);
        }

        @Override // o.InterfaceC3988bSb
        public void d(MoreTabActivity moreTabActivity) {
            e(moreTabActivity);
        }

        @Override // o.InterfaceC4161bYm
        public void e(KidsCharacterDetailsActivity kidsCharacterDetailsActivity) {
            d(kidsCharacterDetailsActivity);
        }

        @Override // o.InterfaceC4182bZg
        public void a(LaunchActivity launchActivity) {
            c(launchActivity);
        }

        @Override // o.InterfaceC4181bZf
        public void d(NetflixComLaunchActivity netflixComLaunchActivity) {
            e(netflixComLaunchActivity);
        }

        @Override // o.InterfaceC4184bZi
        public void d(ActivityC4183bZh activityC4183bZh) {
            a(activityC4183bZh);
        }

        @Override // o.InterfaceC4196bZu
        public void d(ActivityC4195bZt activityC4195bZt) {
            b(activityC4195bZt);
        }

        @Override // o.InterfaceC6268caB
        public void a(LoginActivity loginActivity) {
            d(loginActivity);
        }

        @Override // com.netflix.mediaclient.ui.lolomo.FragmentHelper.c
        public bNH b() {
            return new bOY();
        }

        @Override // o.InterfaceC6634cgx.d
        public InterfaceC6634cgx i() {
            return this.aH.get();
        }

        @Override // com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl.e
        public InterfaceC6675chl o() {
            return S();
        }

        @Override // o.InterfaceC6709ciS
        public void c(GameControllerActivity gameControllerActivity) {
            d(gameControllerActivity);
        }

        @Override // o.InterfaceC6746cjC.b
        public InterfaceC6746cjC m() {
            return this.l.get();
        }

        @Override // o.InterfaceC6766cjW
        public C6765cjV l() {
            return new C6765cjV(this.c, S(), (LoginApi) this.aY.aO.get(), this.aL.get(), (MoneyballDataSource) this.d.h.get());
        }

        @Override // o.InterfaceC6916cmN
        public void d(MyListActivity myListActivity) {
            a(myListActivity);
        }

        @Override // o.InterfaceC7026coS
        public void e(NonMemberHomeActivity nonMemberHomeActivity) {
            d(nonMemberHomeActivity);
        }

        @Override // o.InterfaceC7090cpe.e
        public InterfaceC7090cpe p() {
            return this.k.get();
        }

        @Override // o.InterfaceC7066cpG
        public void e(NotificationsActivity notificationsActivity) {
            d(notificationsActivity);
        }

        @Override // o.InterfaceC7116cqD
        public void b(MultiTitleNotificationsActivity multiTitleNotificationsActivity) {
            e(multiTitleNotificationsActivity);
        }

        @Override // o.InterfaceC7194crc.a
        public InterfaceC7194crc n() {
            return V();
        }

        @Override // o.InterfaceC7305cth
        public void c(OfflineActivityV2 offlineActivityV2) {
            e(offlineActivityV2);
        }

        @Override // o.InterfaceC7489cxF
        public void c(PlayerActivity playerActivity) {
            a(playerActivity);
        }

        @Override // o.cWC.a
        public cWC z() {
            return ao();
        }

        @Override // o.cIH.d
        public cIH q() {
            return this.q.get();
        }

        @Override // o.cLZ
        public void c(MyNetflixActivity myNetflixActivity) {
            e(myNetflixActivity);
        }

        @Override // o.cNR
        public void c(ProfileSelectionActivity profileSelectionActivity) {
            e(profileSelectionActivity);
        }

        @Override // o.cPU.a
        public cPU v() {
            return ad();
        }

        @Override // o.InterfaceC6068cSu.d
        public InterfaceC6068cSu y() {
            return this.aU.get();
        }

        @Override // com.netflix.mediaclient.ui.settings.DebugMenuPreference.e
        public Optional<DebugMenuItems> e() {
            return Optional.empty();
        }

        @Override // o.InterfaceC6235cYw.b
        public InterfaceC6235cYw B() {
            return this.bi.get();
        }

        @Override // o.InterfaceC7943daz
        public void c(UpNextFeedActivity upNextFeedActivity) {
            b(upNextFeedActivity);
        }

        @Override // o.C8076ddZ.a
        public InterfaceC3549bBz d() {
            return this.w.get();
        }

        @Override // o.C8076ddZ.e
        public bBG a() {
            return this.v.get();
        }

        @Override // o.C8076ddZ.c
        public bBI t() {
            return this.at.get();
        }

        @Override // o.C8076ddZ.b
        public TargetsDiscovery w() {
            return this.ba.get();
        }

        @Override // o.C8129deZ.a
        public bZN g() {
            return this.Q.get();
        }

        @Override // o.dlX
        public void e(ProfileControlsActivity profileControlsActivity) {
            a(profileControlsActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new v(this.aY, this.d));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Set<String> getViewModelKeys() {
            return ImmutableSet.of(C6727cik.d());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new v(this.aY, this.d);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new f(this.aY, this.d, this.b);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new x(this.aY, this.d, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MemberRejoinImpl a(MemberRejoinImpl memberRejoinImpl) {
            C6594cgJ.e(memberRejoinImpl, (InterfaceC6636cgz) this.aY.bE.get());
            C6594cgJ.c(memberRejoinImpl, this.aJ.get());
            C6594cgJ.d(memberRejoinImpl, (C8242dgg) this.aY.C.get());
            return memberRejoinImpl;
        }

        private SignupNativeActivity c(SignupNativeActivity signupNativeActivity) {
            C1634aIo.d(signupNativeActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(signupNativeActivity, this.aS.get());
            C1057Nb.d(signupNativeActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(signupNativeActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(signupNativeActivity, S());
            C1057Nb.c(signupNativeActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(signupNativeActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(signupNativeActivity, Optional.empty());
            C1057Nb.a(signupNativeActivity, new ShakeDetectorEmpty());
            C1057Nb.b(signupNativeActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(signupNativeActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(signupNativeActivity, (InterfaceC7303ctf) this.aY.bh.get());
            SignupNativeActivity_MembersInjector.injectSignUpDebugUtilities(signupNativeActivity, Optional.empty());
            SignupNativeActivity_MembersInjector.injectMemberRejoin(signupNativeActivity, this.aH.get());
            SignupNativeActivity_MembersInjector.injectMoneyballDataSource(signupNativeActivity, (MoneyballDataSource) this.d.i.get());
            SignupNativeActivity_MembersInjector.injectNonMemberNavigation(signupNativeActivity, X());
            SignupNativeActivity_MembersInjector.injectSignupFragmentLifecycleLogger(signupNativeActivity, ap());
            SignupNativeActivity_MembersInjector.injectMoneyballEntryPoint(signupNativeActivity, this.aI.get());
            SignupNativeActivity_MembersInjector.injectProfile(signupNativeActivity, (InterfaceC5844cKl) this.aY.bu.get());
            SignupNativeActivity_MembersInjector.injectErrorDialogHelper(signupNativeActivity, E());
            return signupNativeActivity;
        }

        private SignupActivity c(SignupActivity signupActivity) {
            C1634aIo.d(signupActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(signupActivity, this.aS.get());
            C1057Nb.d(signupActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(signupActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(signupActivity, S());
            C1057Nb.c(signupActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(signupActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(signupActivity, Optional.empty());
            C1057Nb.a(signupActivity, new ShakeDetectorEmpty());
            C1057Nb.b(signupActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(signupActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(signupActivity, (InterfaceC7303ctf) this.aY.bh.get());
            SignupActivity_MembersInjector.injectErrorDialogHelper(signupActivity, E());
            SignupActivity_MembersInjector.injectPlayerUI(signupActivity, this.aP.get());
            SignupActivity_MembersInjector.injectProfileSelectionLauncher(signupActivity, (cNT) this.aY.bq.get());
            SignupActivity_MembersInjector.injectLoginApi(signupActivity, (LoginApi) this.aY.aO.get());
            return signupActivity;
        }

        private NetflixActivity d(NetflixActivity netflixActivity) {
            C1634aIo.d(netflixActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(netflixActivity, this.aS.get());
            C1057Nb.d(netflixActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(netflixActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(netflixActivity, S());
            C1057Nb.c(netflixActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(netflixActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(netflixActivity, Optional.empty());
            C1057Nb.a(netflixActivity, new ShakeDetectorEmpty());
            C1057Nb.b(netflixActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(netflixActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(netflixActivity, (InterfaceC7303ctf) this.aY.bh.get());
            return netflixActivity;
        }

        private NetflixActivityBase c(NetflixActivityBase netflixActivityBase) {
            C1634aIo.d(netflixActivityBase, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(netflixActivityBase, this.aS.get());
            return netflixActivityBase;
        }

        private DetailsActivity a(DetailsActivity detailsActivity) {
            C1634aIo.d(detailsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(detailsActivity, this.aS.get());
            C1057Nb.d(detailsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(detailsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(detailsActivity, S());
            C1057Nb.c(detailsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(detailsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(detailsActivity, Optional.empty());
            C1057Nb.a(detailsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(detailsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(detailsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(detailsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C3642bFk.b(detailsActivity, DoubleCheck.lazy(this.C));
            return detailsActivity;
        }

        private bFS e(bFS bfs) {
            C1634aIo.d(bfs, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(bfs, this.aS.get());
            C1057Nb.d(bfs, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(bfs, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(bfs, S());
            C1057Nb.c(bfs, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(bfs, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(bfs, Optional.empty());
            C1057Nb.a(bfs, new ShakeDetectorEmpty());
            C1057Nb.b(bfs, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(bfs, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(bfs, (InterfaceC7303ctf) this.aY.bh.get());
            C3642bFk.b(bfs, DoubleCheck.lazy(this.C));
            return bfs;
        }

        private GameDetailsActivity b(GameDetailsActivity gameDetailsActivity) {
            C1634aIo.d(gameDetailsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(gameDetailsActivity, this.aS.get());
            C1057Nb.d(gameDetailsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(gameDetailsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(gameDetailsActivity, S());
            C1057Nb.c(gameDetailsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(gameDetailsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(gameDetailsActivity, Optional.empty());
            C1057Nb.a(gameDetailsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(gameDetailsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(gameDetailsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(gameDetailsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C3642bFk.b(gameDetailsActivity, DoubleCheck.lazy(this.C));
            bNY.a(gameDetailsActivity, new bOY());
            return gameDetailsActivity;
        }

        private GamesLolomoActivity e(GamesLolomoActivity gamesLolomoActivity) {
            C1634aIo.d(gamesLolomoActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(gamesLolomoActivity, this.aS.get());
            C1057Nb.d(gamesLolomoActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(gamesLolomoActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(gamesLolomoActivity, S());
            C1057Nb.c(gamesLolomoActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(gamesLolomoActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(gamesLolomoActivity, Optional.empty());
            C1057Nb.a(gamesLolomoActivity, new ShakeDetectorEmpty());
            C1057Nb.b(gamesLolomoActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(gamesLolomoActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(gamesLolomoActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C3906bPa.e(gamesLolomoActivity, this.aA.get());
            return gamesLolomoActivity;
        }

        private HomeActivity e(HomeActivity homeActivity) {
            C1634aIo.d(homeActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(homeActivity, this.aS.get());
            C1057Nb.d(homeActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(homeActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(homeActivity, S());
            C1057Nb.c(homeActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(homeActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(homeActivity, Optional.empty());
            C1057Nb.a(homeActivity, new ShakeDetectorEmpty());
            C1057Nb.b(homeActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(homeActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(homeActivity, (InterfaceC7303ctf) this.aY.bh.get());
            bRY.a(homeActivity, (UiLatencyMarker) this.aY.bX.get());
            bRY.a(homeActivity, this.aA.get());
            bRY.a(homeActivity, DoubleCheck.lazy(this.aE));
            bRY.b(homeActivity, this.aU.get());
            bRY.c(homeActivity, (cNT) this.aY.bq.get());
            bRY.c(homeActivity, this.k.get());
            bRY.c(homeActivity, DoubleCheck.lazy(this.aY.bc));
            bRY.c(homeActivity, this.aY.bU());
            bRY.c(homeActivity, (bXD) this.aY.n.get());
            bRY.a(homeActivity, O());
            bRY.e(homeActivity, this.aY.bX());
            bRY.b(homeActivity, DoubleCheck.lazy(this.aG));
            return homeActivity;
        }

        private MoreTabActivity e(MoreTabActivity moreTabActivity) {
            C1634aIo.d(moreTabActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(moreTabActivity, this.aS.get());
            C1057Nb.d(moreTabActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(moreTabActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(moreTabActivity, S());
            C1057Nb.c(moreTabActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(moreTabActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(moreTabActivity, Optional.empty());
            C1057Nb.a(moreTabActivity, new ShakeDetectorEmpty());
            C1057Nb.b(moreTabActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(moreTabActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(moreTabActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C3997bSk.c(moreTabActivity, this.aU.get());
            return moreTabActivity;
        }

        private KidsCharacterDetailsActivity d(KidsCharacterDetailsActivity kidsCharacterDetailsActivity) {
            C1634aIo.d(kidsCharacterDetailsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(kidsCharacterDetailsActivity, this.aS.get());
            C1057Nb.d(kidsCharacterDetailsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(kidsCharacterDetailsActivity, S());
            C1057Nb.c(kidsCharacterDetailsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(kidsCharacterDetailsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(kidsCharacterDetailsActivity, Optional.empty());
            C1057Nb.a(kidsCharacterDetailsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(kidsCharacterDetailsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(kidsCharacterDetailsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C3642bFk.b(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.C));
            C4159bYk.d(kidsCharacterDetailsActivity, Optional.empty());
            return kidsCharacterDetailsActivity;
        }

        private LaunchActivity c(LaunchActivity launchActivity) {
            C1634aIo.d(launchActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(launchActivity, this.aS.get());
            C1057Nb.d(launchActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(launchActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(launchActivity, S());
            C1057Nb.c(launchActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(launchActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(launchActivity, Optional.empty());
            C1057Nb.a(launchActivity, new ShakeDetectorEmpty());
            C1057Nb.b(launchActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(launchActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(launchActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C4179bZd.d(launchActivity, ag());
            C4179bZd.c(launchActivity, (UiLatencyMarker) this.aY.bX.get());
            C4179bZd.e(launchActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C4179bZd.a(launchActivity, (InterfaceC7084cpY) this.aY.be.get());
            C4179bZd.c(launchActivity, (LoginApi) this.aY.aO.get());
            C4179bZd.b(launchActivity, (cNT) this.aY.bq.get());
            C4179bZd.e(launchActivity, this.B.get());
            C4179bZd.a(launchActivity, this.aY.bf());
            C4179bZd.b(launchActivity, this.aY.bW());
            C4179bZd.e(launchActivity, (InterfaceC6713ciW) this.aY.aq.get());
            return launchActivity;
        }

        private NetflixComLaunchActivity e(NetflixComLaunchActivity netflixComLaunchActivity) {
            C4178bZc.a(netflixComLaunchActivity, (InterfaceC7084cpY) this.aY.be.get());
            C4178bZc.b(netflixComLaunchActivity, (bXD) this.aY.n.get());
            return netflixComLaunchActivity;
        }

        private ActivityC4183bZh a(ActivityC4183bZh activityC4183bZh) {
            C1634aIo.d(activityC4183bZh, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(activityC4183bZh, this.aS.get());
            C1057Nb.d(activityC4183bZh, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(activityC4183bZh, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(activityC4183bZh, S());
            C1057Nb.c(activityC4183bZh, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(activityC4183bZh, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(activityC4183bZh, Optional.empty());
            C1057Nb.a(activityC4183bZh, new ShakeDetectorEmpty());
            C1057Nb.b(activityC4183bZh, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(activityC4183bZh, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(activityC4183bZh, (InterfaceC7303ctf) this.aY.bh.get());
            C4179bZd.d(activityC4183bZh, ag());
            C4179bZd.c(activityC4183bZh, (UiLatencyMarker) this.aY.bX.get());
            C4179bZd.e(activityC4183bZh, (InterfaceC5844cKl) this.aY.bu.get());
            C4179bZd.a(activityC4183bZh, (InterfaceC7084cpY) this.aY.be.get());
            C4179bZd.c(activityC4183bZh, (LoginApi) this.aY.aO.get());
            C4179bZd.b(activityC4183bZh, (cNT) this.aY.bq.get());
            C4179bZd.e(activityC4183bZh, this.B.get());
            C4179bZd.a(activityC4183bZh, this.aY.bf());
            C4179bZd.b(activityC4183bZh, this.aY.bW());
            C4179bZd.e(activityC4183bZh, (InterfaceC6713ciW) this.aY.aq.get());
            return activityC4183bZh;
        }

        private ActivityC4195bZt b(ActivityC4195bZt activityC4195bZt) {
            C1634aIo.d(activityC4195bZt, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(activityC4195bZt, this.aS.get());
            C1057Nb.d(activityC4195bZt, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(activityC4195bZt, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(activityC4195bZt, S());
            C1057Nb.c(activityC4195bZt, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(activityC4195bZt, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(activityC4195bZt, Optional.empty());
            C1057Nb.a(activityC4195bZt, new ShakeDetectorEmpty());
            C1057Nb.b(activityC4195bZt, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(activityC4195bZt, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(activityC4195bZt, (InterfaceC7303ctf) this.aY.bh.get());
            return activityC4195bZt;
        }

        private LoginActivity d(LoginActivity loginActivity) {
            C1634aIo.d(loginActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(loginActivity, this.aS.get());
            C1057Nb.d(loginActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(loginActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(loginActivity, S());
            C1057Nb.c(loginActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(loginActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(loginActivity, Optional.empty());
            C1057Nb.a(loginActivity, new ShakeDetectorEmpty());
            C1057Nb.b(loginActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(loginActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(loginActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C6267caA.e(loginActivity, (cNT) this.aY.bq.get());
            C6267caA.e(loginActivity, this.aY.bT());
            return loginActivity;
        }

        private GameControllerActivity d(GameControllerActivity gameControllerActivity) {
            C1634aIo.d(gameControllerActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(gameControllerActivity, this.aS.get());
            C1057Nb.d(gameControllerActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(gameControllerActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(gameControllerActivity, S());
            C1057Nb.c(gameControllerActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(gameControllerActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(gameControllerActivity, Optional.empty());
            C1057Nb.a(gameControllerActivity, new ShakeDetectorEmpty());
            C1057Nb.b(gameControllerActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(gameControllerActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(gameControllerActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C6711ciU.d(gameControllerActivity, (InterfaceC6779cjj) this.aY.aq.get());
            return gameControllerActivity;
        }

        private MyListActivity a(MyListActivity myListActivity) {
            C1634aIo.d(myListActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(myListActivity, this.aS.get());
            C1057Nb.d(myListActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(myListActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(myListActivity, S());
            C1057Nb.c(myListActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(myListActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(myListActivity, Optional.empty());
            C1057Nb.a(myListActivity, new ShakeDetectorEmpty());
            C1057Nb.b(myListActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(myListActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(myListActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C6917cmO.c(myListActivity, this.ac.get());
            C6917cmO.e(myListActivity, new C3894bOp());
            return myListActivity;
        }

        private NonMemberHomeActivity d(NonMemberHomeActivity nonMemberHomeActivity) {
            C1634aIo.d(nonMemberHomeActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(nonMemberHomeActivity, this.aS.get());
            C1057Nb.d(nonMemberHomeActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(nonMemberHomeActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(nonMemberHomeActivity, S());
            C1057Nb.c(nonMemberHomeActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(nonMemberHomeActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(nonMemberHomeActivity, Optional.empty());
            C1057Nb.a(nonMemberHomeActivity, new ShakeDetectorEmpty());
            C1057Nb.b(nonMemberHomeActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(nonMemberHomeActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(nonMemberHomeActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C7030coW.e(nonMemberHomeActivity, DoubleCheck.lazy(this.aY.n));
            C7030coW.e(nonMemberHomeActivity, this.aY.bM());
            C7030coW.d(nonMemberHomeActivity, this.aY.E);
            C7030coW.c(nonMemberHomeActivity, this.aY.bv());
            C7030coW.d(nonMemberHomeActivity, this.aY.by());
            return nonMemberHomeActivity;
        }

        private NotificationsActivity d(NotificationsActivity notificationsActivity) {
            C1634aIo.d(notificationsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(notificationsActivity, this.aS.get());
            C1057Nb.d(notificationsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(notificationsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(notificationsActivity, S());
            C1057Nb.c(notificationsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(notificationsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(notificationsActivity, Optional.empty());
            C1057Nb.a(notificationsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(notificationsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(notificationsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(notificationsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C7075cpP.b(notificationsActivity, this.aU.get());
            return notificationsActivity;
        }

        private MultiTitleNotificationsActivity e(MultiTitleNotificationsActivity multiTitleNotificationsActivity) {
            C1634aIo.d(multiTitleNotificationsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(multiTitleNotificationsActivity, this.aS.get());
            C1057Nb.d(multiTitleNotificationsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(multiTitleNotificationsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(multiTitleNotificationsActivity, S());
            C1057Nb.c(multiTitleNotificationsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(multiTitleNotificationsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(multiTitleNotificationsActivity, Optional.empty());
            C1057Nb.a(multiTitleNotificationsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(multiTitleNotificationsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(multiTitleNotificationsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(multiTitleNotificationsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C7113cqA.b(multiTitleNotificationsActivity, this.aU.get());
            return multiTitleNotificationsActivity;
        }

        private OfflineActivityV2 e(OfflineActivityV2 offlineActivityV2) {
            C1634aIo.d(offlineActivityV2, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(offlineActivityV2, this.aS.get());
            C1057Nb.d(offlineActivityV2, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(offlineActivityV2, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(offlineActivityV2, S());
            C1057Nb.c(offlineActivityV2, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(offlineActivityV2, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(offlineActivityV2, Optional.empty());
            C1057Nb.a(offlineActivityV2, new ShakeDetectorEmpty());
            C1057Nb.b(offlineActivityV2, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(offlineActivityV2, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(offlineActivityV2, (InterfaceC7303ctf) this.aY.bh.get());
            C7304ctg.e(offlineActivityV2, this.aU.get());
            return offlineActivityV2;
        }

        private PlayerActivity a(PlayerActivity playerActivity) {
            C1634aIo.d(playerActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(playerActivity, this.aS.get());
            C1057Nb.d(playerActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(playerActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(playerActivity, S());
            C1057Nb.c(playerActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(playerActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(playerActivity, Optional.empty());
            C1057Nb.a(playerActivity, new ShakeDetectorEmpty());
            C1057Nb.b(playerActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(playerActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(playerActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C7492cxI.b(playerActivity, DoubleCheck.lazy(this.aY.n));
            return playerActivity;
        }

        private MyNetflixActivity e(MyNetflixActivity myNetflixActivity) {
            C1634aIo.d(myNetflixActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(myNetflixActivity, this.aS.get());
            C1057Nb.d(myNetflixActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(myNetflixActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(myNetflixActivity, S());
            C1057Nb.c(myNetflixActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(myNetflixActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(myNetflixActivity, Optional.empty());
            C1057Nb.a(myNetflixActivity, new ShakeDetectorEmpty());
            C1057Nb.b(myNetflixActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(myNetflixActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(myNetflixActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C5887cMa.b(myNetflixActivity, (InterfaceC7084cpY) this.aY.be.get());
            C5887cMa.d(myNetflixActivity, this.aA.get());
            return myNetflixActivity;
        }

        private ProfileSelectionActivity e(ProfileSelectionActivity profileSelectionActivity) {
            C1634aIo.d(profileSelectionActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(profileSelectionActivity, this.aS.get());
            C1057Nb.d(profileSelectionActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(profileSelectionActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(profileSelectionActivity, S());
            C1057Nb.c(profileSelectionActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(profileSelectionActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(profileSelectionActivity, Optional.empty());
            C1057Nb.a(profileSelectionActivity, new ShakeDetectorEmpty());
            C1057Nb.b(profileSelectionActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(profileSelectionActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(profileSelectionActivity, (InterfaceC7303ctf) this.aY.bh.get());
            cNU.b(profileSelectionActivity, this.be.get());
            cNU.c(profileSelectionActivity, (UiLatencyMarker) this.aY.bX.get());
            cNU.a(profileSelectionActivity, this.bf.get());
            cNU.e(profileSelectionActivity, ao());
            cNU.c(profileSelectionActivity, (InterfaceC1270Vf) this.aY.A.get());
            return profileSelectionActivity;
        }

        private UpNextFeedActivity b(UpNextFeedActivity upNextFeedActivity) {
            C1634aIo.d(upNextFeedActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(upNextFeedActivity, this.aS.get());
            C1057Nb.d(upNextFeedActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(upNextFeedActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(upNextFeedActivity, S());
            C1057Nb.c(upNextFeedActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(upNextFeedActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(upNextFeedActivity, Optional.empty());
            C1057Nb.a(upNextFeedActivity, new ShakeDetectorEmpty());
            C1057Nb.b(upNextFeedActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(upNextFeedActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(upNextFeedActivity, (InterfaceC7303ctf) this.aY.bh.get());
            C7895daD.b(upNextFeedActivity, this.k.get());
            C7895daD.a(upNextFeedActivity, DoubleCheck.lazy(this.aA));
            C7895daD.e(upNextFeedActivity, DoubleCheck.lazy(this.aE));
            C7895daD.c(upNextFeedActivity, DoubleCheck.lazy(this.aY.bc));
            C7895daD.b(upNextFeedActivity, DoubleCheck.lazy(this.aG));
            return upNextFeedActivity;
        }

        private ProfileControlsActivity a(ProfileControlsActivity profileControlsActivity) {
            C1634aIo.d(profileControlsActivity, (ServiceManager) this.aY.bK.get());
            C1634aIo.a(profileControlsActivity, this.aS.get());
            C1057Nb.d(profileControlsActivity, (InterfaceC7249cse) this.aY.V.get());
            C1057Nb.c(profileControlsActivity, DoubleCheck.lazy(this.aY.aO));
            C1057Nb.c(profileControlsActivity, S());
            C1057Nb.c(profileControlsActivity, (InterfaceC8098ddv) this.aY.bY.get());
            C1057Nb.c(profileControlsActivity, (InterfaceC7345cuU) this.aY.bT.get());
            C1057Nb.a(profileControlsActivity, Optional.empty());
            C1057Nb.a(profileControlsActivity, new ShakeDetectorEmpty());
            C1057Nb.b(profileControlsActivity, (InterfaceC5844cKl) this.aY.bu.get());
            C1057Nb.d(profileControlsActivity, DoubleCheck.lazy(this.aY.bq));
            C1057Nb.e(profileControlsActivity, (InterfaceC7303ctf) this.aY.bh.get());
            dlY.c(profileControlsActivity, this.aN.get());
            dlY.c(profileControlsActivity, ah());
            return profileControlsActivity;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<T> implements Provider<T> {
            private final i a;
            private final e b;
            private final t c;
            private final int e;

            a(t tVar, i iVar, e eVar, int i) {
                this.c = tVar;
                this.a = iVar;
                this.b = eVar;
                this.e = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.e) {
                    case 0:
                        return (T) SignupModule_ProvidesMoneyballEntrypointFactory.providesMoneyballEntrypoint(this.b.aW, this.b.T, (MoneyballDataSource) this.a.i.get(), this.b.c);
                    case 1:
                        return (T) new l(this.c, this.a, this.b);
                    case 2:
                        return (T) new ServiceManagerControllerImpl(this.b.c);
                    case 3:
                        e eVar = this.b;
                        return (T) eVar.a(C6593cgI.b(eVar.c, (MoneyballDataSource) this.a.g.get()));
                    case 4:
                        return (T) C6592cgH.a(this.b.R, this.b.T, (MoneyballDataSource) this.a.g.get(), this.b.c);
                    case 5:
                        return (T) new bDN(this.b.c);
                    case 6:
                        return (T) new C5305bwJ(this.b.c, this.b.S(), (InterfaceC1270Vf) this.c.A.get(), (InterfaceC5304bwI) this.c.f.get());
                    case 7:
                        return (T) new DeepLinkHandlerImpl(this.b.c);
                    case 8:
                        return (T) new ImageLoaderComposeImpl(this.b.c);
                    case 9:
                        return (T) new bDH(this.b.c);
                    case 10:
                        return (T) new C3651bFt(DoubleCheck.lazy(this.b.az), this.b.c);
                    case 11:
                        return (T) C3662bGd.d(this.b.z, this.b.c);
                    case 12:
                        return (T) new C3671bGi(new bOY());
                    case 13:
                        return (T) C3998bSl.d(this.b.L, this.b.c);
                    case 14:
                        return (T) C6091cTn.e(this.b.aR, this.b.c);
                    case 15:
                        return (T) new C6085cTh(this.b.c);
                    case 16:
                        return (T) new NotificationPermissionImpl(this.b.c, this.b.S(), this.c.bP());
                    case 17:
                        return (T) C8352dik.c(this.b.bh, this.b.c);
                    case 18:
                        return (T) new C6755cjL(this.b.c, (InterfaceC6748cjE) this.c.p.get(), this.b.S(), (LoginApi) this.c.aO.get());
                    case 19:
                        return (T) C6826ckd.e(this.b.V, this.b.T, (MoneyballDataSource) this.a.h.get());
                    case 20:
                        return (T) new C6923cmU(this.b.c);
                    case 21:
                        return (T) new cID(this.b.c, (InterfaceC1570aGe) this.b.m.get());
                    case 22:
                        return (T) new UiLatencyTrackerImpl((UiLatencyMarker) this.c.bX.get(), (InterfaceC1659aJm) this.c.bm.get(), this.b.bd, ApplicationContextModule_ProvideContextFactory.provideContext(this.c.j));
                    case 23:
                        return (T) new UiLatencyTrackerLogger((UiLatencyMarker) this.c.bX.get(), this.b.ax());
                    case 24:
                        return (T) new cWS.d() { // from class: o.OC.e.a.2
                            @Override // o.cWS.d
                            public cWS b(UmaPresentAt.Point point) {
                                return new cWS(a.this.b.c, point);
                            }
                        };
                    case 25:
                        return (T) new C7900daI(this.b.c);
                    case 26:
                        return (T) new bBF(this.b.c, (InterfaceC1570aGe) this.b.m.get(), (VE) this.b.y.get(), (VK) this.b.X.get(), (VL) this.b.ak.get(), (VJ) this.b.bc.get());
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        return (T) new C1310Wt((VC) this.b.x.get(), (InterfaceC1290Vz) this.b.u.get());
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        return (T) new C1299Wi(this.b.c, (InterfaceC1284Vt) this.b.s.get(), (InterfaceC1285Vu) this.b.f.get(), (VB) this.b.au.get());
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        return (T) new C1298Wh();
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        return (T) new C1302Wl(this.b.c, this.c.E(), this.c.bB());
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        return (T) new C1307Wq((InterfaceC1285Vu) this.b.f.get(), (InterfaceC1300Wj) this.c.Z.get(), (aDB) this.c.av.get(), this.c.bB(), this.c.E(), (dwU) this.c.g.get());
                    case 32:
                        return (T) new C1301Wk(this.b.c, (InterfaceC1284Vt) this.b.s.get(), (VF) this.b.aZ.get(), (VH) this.b.aX.get(), (InterfaceC1286Vv) this.b.h.get(), this.c.bB());
                    case 33:
                        return (T) new C1309Ws((VB) this.b.au.get(), (VA) this.c.aT.get(), this.c.E(), (dwU) this.c.g.get());
                    case 34:
                        return (T) new C1311Wu((VG) this.b.aw.get(), (VA) this.c.aT.get(), (InterfaceC1284Vt) this.b.s.get());
                    case 35:
                        return (T) new C1305Wo((InterfaceC1284Vt) this.b.s.get(), (VB) this.b.au.get());
                    case 36:
                        return (T) new C1296Wf((VD) this.b.bb.get(), (VH) this.b.aX.get());
                    case 37:
                        return (T) new C1312Wv(this.b.c, this.c.bB());
                    case 38:
                        return (T) new C1315Wy((VG) this.b.aw.get(), (InterfaceC1284Vt) this.b.s.get(), (InterfaceC1285Vu) this.b.f.get());
                    case 39:
                        return (T) new C1313Ww((VF) this.b.aZ.get(), (VH) this.b.aX.get(), (InterfaceC1286Vv) this.b.h.get(), new bMS());
                    case JSONzip.substringLimit /* 40 */:
                        return (T) new C1316Wz((InterfaceC1289Vy) this.b.K.get(), (VD) this.b.bb.get(), (InterfaceC1288Vx) this.b.i.get());
                    case 41:
                        return (T) new C1306Wp((InterfaceC1284Vt) this.b.s.get());
                    case 42:
                        return (T) new C1297Wg((InterfaceC1284Vt) this.b.s.get());
                    case 43:
                        return (T) new bBJ((VD) this.b.bb.get());
                    case 44:
                        return (T) new bBL(this.b.c, (VH) this.b.aX.get(), (VG) this.b.aw.get(), (InterfaceC1284Vt) this.b.s.get(), (VD) this.b.bb.get());
                    case 45:
                        return (T) new bBO(this.b.c, (VF) this.b.aZ.get(), (VH) this.b.aX.get(), (InterfaceC1286Vv) this.b.h.get(), (VD) this.b.bb.get());
                    case 46:
                        return (T) new bZO(this.b.c, (aGT) this.c.aH.get());
                    case 47:
                        return (T) C5860cLa.d(this.b.av, this.b.af());
                    case 48:
                        return (T) new C9867yA(this.b.c);
                    case 49:
                        return (T) C5481bza.e(this.b.p, this.b.T, (MoneyballDataSource) this.a.j.get());
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        return (T) new CollectTasteImpl(this.b.c, DoubleCheck.lazy(this.b.aA));
                    case 51:
                        return (T) new C1139Qe(this.b.c);
                    case 52:
                        return (T) new bNW((bNS) this.c.aw.get(), DoubleCheck.lazy(this.b.aO));
                    case 53:
                        return (T) bNM.c(this.b.I, this.b.c);
                    case 54:
                        return (T) new C3957bQy();
                    case 55:
                        return (T) new C5895cMi(this.b.c, (InterfaceC1570aGe) this.b.m.get(), DoubleCheck.lazy(this.b.aT), DoubleCheck.lazy(this.b.ad), DoubleCheck.lazy(this.b.Z), DoubleCheck.lazy(this.b.ab), DoubleCheck.lazy(this.b.aU), DoubleCheck.lazy(this.b.aa));
                    case 56:
                        return (T) new C5907cMu(this.b.c, (InterfaceC1570aGe) this.b.m.get(), (InterfaceC7084cpY) this.c.be.get(), DoubleCheck.lazy(this.b.ag));
                    case 57:
                        return (T) new C5904cMr(this.b.c, DoubleCheck.lazy(this.c.be), DoubleCheck.lazy(this.b.B), DoubleCheck.lazy(this.b.aP), DoubleCheck.lazy(this.c.P));
                    case 58:
                        return (T) new C5900cMn(this.b.c);
                    case 59:
                        return (T) new C5889cMc(this.b.c, DoubleCheck.lazy(this.b.bi));
                    case 60:
                        return (T) new cLW(DoubleCheck.lazy(this.c.bh), this.b.c, this.b.U(), (InterfaceC7249cse) this.c.V.get(), this.c.bt());
                    case 61:
                        return (T) C5484bzd.e(this.b.p, this.b.D());
                    case 62:
                        return (T) C6350cbe.c(this.b.al, this.b.c, (RecaptchaV3Manager.c) this.c.am.get());
                    case 63:
                        return (T) new C8048dcy(this.b.c, ApplicationContextModule_ProvideContextFactory.provideContext(this.c.j), this.c.E());
                    case 64:
                        return (T) C5601cBl.a(this.b.ao, this.b.c);
                    case 65:
                        return (T) C5865cLf.c(this.b.as, this.b.ae());
                    case 66:
                        return (T) cMO.b(this.b.af, this.b.c);
                    case 67:
                        return (T) bZG.c(this.b.S, this.b.c);
                    case 68:
                        return (T) new C6765cjV(this.b.c, this.b.S(), (LoginApi) this.c.aO.get(), (InterfaceC6829ckg) this.b.aL.get(), (MoneyballDataSource) this.a.h.get());
                    default:
                        throw new AssertionError(this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class w extends ReleaseNetflixApplication_HiltComponents.n {
        private Provider<C1339Xw> a;
        private final w b;
        private Provider<MiniPlayerVideoGroupViewModel> c;
        private final i d;
        private final t e;

        private w(t tVar, i iVar, SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.b = this;
            this.e = tVar;
            this.d = iVar;
            a(savedStateHandle, viewModelLifecycle);
        }

        private void a(SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.a = new b(this.e, this.d, this.b, 1);
            this.c = new b(this.e, this.d, this.b, 0);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<String, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
            return ImmutableMap.of("com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel", this.c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<String, Object> getHiltViewModelAssistedMap() {
            return ImmutableMap.of();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b<T> implements Provider<T> {
            private final w b;
            private final int c;
            private final i d;
            private final t e;

            b(t tVar, i iVar, w wVar, int i) {
                this.e = tVar;
                this.d = iVar;
                this.b = wVar;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.c;
                if (i != 0) {
                    if (i == 1) {
                        return (T) new C1339Xw(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    }
                    throw new AssertionError(this.c);
                }
                return (T) new MiniPlayerVideoGroupViewModel(DoubleCheck.lazy(this.b.a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i extends ReleaseNetflixApplication_HiltComponents.b {
        private final MemberRejoinRetainedModule a;
        private Provider<ActivityRetainedLifecycle> b;
        private final i c;
        private final MhuEbiDataModule d;
        private final CfourSurveyRetainedModule e;
        private final SignupRetainedModule f;
        private Provider<MoneyballDataSource> g;
        private Provider<MoneyballDataSource> h;
        private Provider<MoneyballDataSource> i;
        private Provider<MoneyballDataSource> j;
        private final t n;

        private i(t tVar, CfourSurveyRetainedModule cfourSurveyRetainedModule, MemberRejoinRetainedModule memberRejoinRetainedModule, MhuEbiDataModule mhuEbiDataModule, SignupRetainedModule signupRetainedModule, SavedStateHandleHolder savedStateHandleHolder) {
            this.c = this;
            this.n = tVar;
            this.f = signupRetainedModule;
            this.a = memberRejoinRetainedModule;
            this.d = mhuEbiDataModule;
            this.e = cfourSurveyRetainedModule;
            a(cfourSurveyRetainedModule, memberRejoinRetainedModule, mhuEbiDataModule, signupRetainedModule, savedStateHandleHolder);
        }

        private void a(CfourSurveyRetainedModule cfourSurveyRetainedModule, MemberRejoinRetainedModule memberRejoinRetainedModule, MhuEbiDataModule mhuEbiDataModule, SignupRetainedModule signupRetainedModule, SavedStateHandleHolder savedStateHandleHolder) {
            this.b = DoubleCheck.provider(new e(this.n, this.c, 0));
            this.i = DoubleCheck.provider(new e(this.n, this.c, 1));
            this.g = DoubleCheck.provider(new e(this.n, this.c, 2));
            this.h = DoubleCheck.provider(new e(this.n, this.c, 3));
            this.j = DoubleCheck.provider(new e(this.n, this.c, 4));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new d(this.n, this.c);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.b.get();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class e<T> implements Provider<T> {
            private final i a;
            private final t b;
            private final int d;

            e(t tVar, i iVar, int i) {
                this.b = tVar;
                this.a = iVar;
                this.d = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    return (T) C5483bzc.d(this.a.e);
                                }
                                throw new AssertionError(this.d);
                            }
                            return (T) C6823cka.d(this.a.d);
                        }
                        return (T) C6595cgK.c(this.a.a);
                    }
                    return (T) SignupRetainedModule_ProvidesMoneyballDataFactory.providesMoneyballData(this.a.f);
                }
                return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class r extends ReleaseNetflixApplication_HiltComponents.g {
        private Provider<C1812aPd.e> a;
        private final t b;
        private final r c;
        private Provider<C1948aUe.c> e;

        @Override // o.InterfaceC4055bUo
        public void a(ServiceC4053bUm serviceC4053bUm) {
        }

        private r(t tVar, Service service) {
            this.c = this;
            this.b = tVar;
            d(service);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<IClientLoggingListener> a() {
            return ImmutableSet.of((IClientLoggingListener) this.b.aQ.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1823aPo d() {
            return new C1823aPo(ApplicationContextModule_ProvideContextFactory.provideContext(this.b.j));
        }

        private Object e() {
            return C1941aTy.e((ServiceManager) this.b.bK.get());
        }

        private void d(Service service) {
            this.e = SingleCheck.provider(new c(this.b, this.c, 0));
            this.a = SingleCheck.provider(new c(this.b, this.c, 1));
        }

        @Override // o.aMB
        public void d(NetflixService netflixService) {
            b(netflixService);
        }

        @Override // o.InterfaceC1939aTw
        public void a(NetflixJobService netflixJobService) {
            b(netflixJobService);
        }

        @Override // o.dlH
        public void a(PService pService) {
            c(pService);
        }

        private NetflixService b(NetflixService netflixService) {
            aMC.d(netflixService, this.b.aY());
            aMC.d(netflixService, (InterfaceC1929aTm) this.b.aZ.get());
            aMC.b(netflixService, this.b.ba);
            aMC.d(netflixService, (InterfaceC1938aTv) this.b.aX.get());
            aMC.d(netflixService, this.e.get());
            aMC.b(netflixService, this.a.get());
            aMC.e(netflixService, (InterfaceC1602aHj) this.b.aY.get());
            aMC.a(netflixService, (bXD) this.b.n.get());
            aMC.b(netflixService, (dwU) this.b.g.get());
            aMC.d(netflixService, this.b.bB());
            aMC.a(netflixService, this.b.bQ());
            aMC.c(netflixService, new C3877bNz());
            aMC.e(netflixService, this.b.bS());
            aMC.e(netflixService, (aGT) this.b.aH.get());
            aMC.c(netflixService, DoubleCheck.lazy(this.b.aP));
            return netflixService;
        }

        private NetflixJobService b(NetflixJobService netflixJobService) {
            C1940aTx.a(netflixJobService, e());
            C1940aTx.a(netflixJobService, (InterfaceC1929aTm) this.b.aZ.get());
            C1940aTx.c(netflixJobService, ImmutableMap.of());
            return netflixJobService;
        }

        private PService c(PService pService) {
            dlI.c(pService, this.b.bK);
            return pService;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class c<T> implements Provider<T> {
            private final t a;
            private final r c;
            private final int e;

            c(t tVar, r rVar, int i) {
                this.a = tVar;
                this.c = rVar;
                this.e = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.e;
                if (i != 0) {
                    if (i == 1) {
                        return (T) new C1812aPd.e() { // from class: o.OC.r.c.4
                            @Override // o.C1812aPd.e
                            public C1812aPd e(CryptoErrorManager cryptoErrorManager) {
                                return new C1812aPd(ApplicationContextModule_ProvideContextFactory.provideContext(c.this.a.j), c.this.c.d(), new GameControllerNavigationImpl(), c.this.a.q(), cryptoErrorManager);
                            }
                        };
                    }
                    throw new AssertionError(this.e);
                }
                return (T) new C1948aUe.c() { // from class: o.OC.r.c.1
                    @Override // o.C1948aUe.c
                    public C1948aUe b(aOV aov, UserAgent userAgent, InterfaceC5129bst interfaceC5129bst) {
                        return new C1948aUe(ApplicationContextModule_ProvideContextFactory.provideContext(c.this.a.j), c.this.c.a(), (InterfaceC1595aHc) c.this.a.Y.get(), aov, userAgent, interfaceC5129bst, (dwU) c.this.a.g.get());
                    }
                };
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class t extends ReleaseNetflixApplication_HiltComponents.f {
        private Provider<ClockImpl> A;
        private Provider<Boolean> B;
        private Provider<C8242dgg> C;
        private final CfourStringMappingModule D;
        private Provider<Boolean> E;
        private Provider<dEB> F;
        private Provider<dEB> G;
        private Provider<dEB> H;
        private Provider<Boolean> I;

        /* renamed from: J  reason: collision with root package name */
        private Provider<Boolean> f13387J;
        private Provider<Boolean> K;
        private Provider<Boolean> L;
        private Provider<Boolean> M;
        private Provider<Boolean> N;
        private final CoreSingletonConfigModule O;
        private Provider<DetailsActivityApiImpl> P;
        private Provider<ConfirmLifecycleData> Q;
        private final CoreInitModule R;
        private final CoroutinesModule S;
        private Provider<C8258dgw> T;
        private final DetailsUtilModule U;
        private Provider<C7247csc> V;
        private Provider<DeviceSurveyLifecycleData> W;
        private Provider<DeviceUpgradeLoginTokenManager> X;
        private Provider<ErrorLoggingDataCollectorImpl> Y;
        private Provider<C1304Wn> Z;
        private Provider<AndroidDevicePerformanceDelegateImpl> a;
        private Provider<C9650uR> aA;
        private final HendrixSingletonConfigModule aB;
        private Provider<bMP> aC;
        private Provider<InterstitialsImpl> aD;
        private Provider<VerifyCardContextViewModel.LifecycleData> aE;
        private Provider<C9715vd> aF;
        private Provider<aSY.c> aG;
        private Provider<aGW> aH;
        private Provider<UpiWaitingViewModel.LifecycleData> aI;
        private Provider<C1497aDm> aJ;
        private final LocalDiscoveryProviderConfigModule aK;
        private Provider<LearnMoreConfirmViewModelAb44926.LifecycleData> aL;
        private Provider<MaturityPinLifecycleData> aM;
        private Provider<aGN> aN;
        private Provider<LoginImpl> aO;
        private Provider<LoggedOutGraphQLRepositoryImpl> aP;
        private Provider<LoggerConfig> aQ;
        private Provider<MemberRejoinApplicationImpl> aR;
        private Provider<MemberRejoinFlagsImpl> aS;
        private Provider<C1303Wm> aT;
        private Provider<C8191dfi> aU;
        private Provider<C6769cjZ> aV;
        private Provider<C6753cjJ> aW;
        private Provider<NetflixWorkManagerImpl> aX;
        private Provider<NetflixCrashReporterImpl> aY;
        private Provider<NetflixJobSchedulerImpl> aZ;
        private Provider<XE> aa;
        private Provider<C7222csD> ab;
        private Provider<DownloadedForYouImpl> ac;
        private Provider<ExpiryHelperImpl> ad;
        private Provider<aKS.d> ae;
        private Provider<aCD.a> af;
        private Provider<aCH.a> ag;
        private Provider<aCA.d> ah;
        private Provider<C1709aLi.c> ai;
        private Provider<C1711aLk.e> aj;
        private Provider<aLY> ak;
        private Provider<C1712aLl.d> al;
        private Provider<RecaptchaV3Manager.c> am;
        private Provider<C3705bHp> an;
        private Provider<C3706bHq> ao;
        private Provider<XK> ap;
        private Provider<C6786cjq> aq;
        private final GameControllerModule ar;
        private Provider<C3982bRw> as;
        private final GameRepoBeaconDataStoreModule at;
        private Provider<bOZ> au;
        private Provider<aDB> av;
        private Provider<bQU> aw;
        private Provider<GraphQLCacheHelperImpl> ax;
        private Provider<aGN> ay;
        private final GraphQLSamplingModule az;
        private final AcquisitionLibStringMappingModule b;
        private Provider<C1266Vb> bA;
        private Provider<RdidConsentStateRepoImpl> bB;
        private Provider<bND> bC;
        private Provider<Boolean> bD;
        private Provider<InterfaceC6636cgz> bE;
        private Provider<RegenoldLifecycleData> bF;
        private final RealGameControllerMagicPathModule bG;
        private Provider<RecordRdidManager> bH;
        private Provider<RegistrationLifecycleData> bI;
        private Provider<C6744cjA> bJ;
        private Provider<C5101bsR> bK;
        private Provider<SecondaryLanguageLifecycleData> bL;
        private final RxJavaModule bM;
        private final SignupLibSingletonModule bN;
        private Provider<C1728aMa> bO;
        private final t bP;
        private final SignupSingletonModule bQ;
        private Provider<C1483aCz> bR;
        private Provider<C0902Gz> bS;
        private Provider<TutorialHelperFactoryImpl> bT;
        private Provider<VerifyAgeLifecycleData> bU;
        private Provider<C7896daE> bV;
        private Provider<VerifyCardLifecycleData> bW;
        private Provider<UiLatencyMarkerImpl> bX;
        private Provider<VoipImpl> bY;
        private Provider<NetflixJobInitializer> ba;
        private Provider<aIM> bb;
        private Provider<NotificationPermissionApplicationImpl> bc;
        private Provider<NetworkAwareImpl> bd;
        private Provider<NotificationsUiImpl> be;
        private Provider<aIH> bf;
        private Provider<OfflineVideoImageUtil> bg;
        private Provider<OfflineApiImpl> bh;
        private Provider<C7285ctN> bi;
        private Provider<OfflinePostplayImpl> bj;
        private Provider<OnRampLifecycleData> bk;
        private Provider<PasswordOnlyLifecycleData> bl;
        private Provider<C1670aJx> bm;
        private Provider<OrderFinalLifecycleData> bn;
        private Provider<C1482aCy> bo;
        private Provider<C8205dfw> bp;
        private Provider<ProfileSelectionLauncherImpl> bq;
        private Provider<aFY> br;
        private Provider<aGU> bs;
        private Provider<C7611czV> bt;
        private Provider<ProfileImpl> bu;
        private Provider<BlockstoreClient> bv;
        private Provider<InterfaceC5323bwb> bw;
        private Provider<RdidCtaConsentStateDatabase> bx;
        private Provider<aFD> by;
        private Provider<C1555aFq> bz;
        private Provider<AdsPlanApplicationImpl> c;
        private Provider<WelcomeFujiLifecycleData> cc;
        private Provider<MD> d;
        private Provider<AddProfilesLifecycleData> e;
        private Provider<InterfaceC5304bwI> f;
        private Provider<dwU> g;
        private Provider<C8312dhx> h;
        private Provider<aTB> i;
        private final ApplicationContextModule j;
        private Provider<ApplicationStartupListener> k;
        private Provider<InterfaceC1248Uj> l;
        private Provider<UserAgentListener> m;
        private Provider<bXD> n;

        /* renamed from: o  reason: collision with root package name */
        private Provider<InterfaceC6767cjX> f13388o;
        private Provider<InterfaceC6748cjE> p;
        private final BlockStoreClientModule q;
        private Provider<UserAgentListener> r;
        private Provider<BookmarkStoreRoom> s;
        private Provider<RdidConsentStateRepo> t;
        private Provider<BreadcrumbLoggerImpl> u;
        private Provider<C1254Up> v;
        private final BrowseExperienceModule w;
        private Provider<BrotliContextImpl> x;
        private Provider<BugsnagCrashReporter> y;
        private Provider<aCW.d> z;

        @Override // o.InterfaceC1118Pj
        public void d(ApplicationC1117Pi applicationC1117Pi) {
        }

        private t(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule, ApplicationContextModule applicationContextModule, BlockStoreClientModule blockStoreClientModule, BrowseExperienceModule browseExperienceModule, CfourStringMappingModule cfourStringMappingModule, CoreInitModule coreInitModule, CoreSingletonConfigModule coreSingletonConfigModule, CoroutinesModule coroutinesModule, DetailsUtilModule detailsUtilModule, GameControllerModule gameControllerModule, GameRepoBeaconDataStoreModule gameRepoBeaconDataStoreModule, GraphQLSamplingModule graphQLSamplingModule, HendrixSingletonConfigModule hendrixSingletonConfigModule, LocalDiscoveryProviderConfigModule localDiscoveryProviderConfigModule, RealGameControllerMagicPathModule realGameControllerMagicPathModule, RxJavaModule rxJavaModule, SignupLibSingletonModule signupLibSingletonModule, SignupSingletonModule signupSingletonModule) {
            this.bP = this;
            this.j = applicationContextModule;
            this.O = coreSingletonConfigModule;
            this.S = coroutinesModule;
            this.aB = hendrixSingletonConfigModule;
            this.az = graphQLSamplingModule;
            this.at = gameRepoBeaconDataStoreModule;
            this.bG = realGameControllerMagicPathModule;
            this.R = coreInitModule;
            this.q = blockStoreClientModule;
            this.U = detailsUtilModule;
            this.ar = gameControllerModule;
            this.w = browseExperienceModule;
            this.bM = rxJavaModule;
            this.bN = signupLibSingletonModule;
            this.aK = localDiscoveryProviderConfigModule;
            this.bQ = signupSingletonModule;
            this.b = acquisitionLibStringMappingModule;
            this.D = cfourStringMappingModule;
            e(acquisitionLibStringMappingModule, applicationContextModule, blockStoreClientModule, browseExperienceModule, cfourStringMappingModule, coreInitModule, coreSingletonConfigModule, coroutinesModule, detailsUtilModule, gameControllerModule, gameRepoBeaconDataStoreModule, graphQLSamplingModule, hendrixSingletonConfigModule, localDiscoveryProviderConfigModule, realGameControllerMagicPathModule, rxJavaModule, signupLibSingletonModule, signupSingletonModule);
            a(acquisitionLibStringMappingModule, applicationContextModule, blockStoreClientModule, browseExperienceModule, cfourStringMappingModule, coreInitModule, coreSingletonConfigModule, coroutinesModule, detailsUtilModule, gameControllerModule, gameRepoBeaconDataStoreModule, graphQLSamplingModule, hendrixSingletonConfigModule, localDiscoveryProviderConfigModule, realGameControllerMagicPathModule, rxJavaModule, signupLibSingletonModule, signupSingletonModule);
        }

        private C9649uQ aV() {
            return new C9649uQ(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bk() {
            return this.aB.p(this.bz.get());
        }

        private AdsPlanApplicationStartupListener aN() {
            return a(C5310bwO.d());
        }

        private C8214dgE bE() {
            return new C8214dgE(this.A.get(), this.bm.get());
        }

        private C8219dgJ bA() {
            return new C8219dgJ(bE(), new C8213dgD(), this.A.get());
        }

        private C8212dgC bC() {
            return new C8212dgC(this.aF.get(), bA());
        }

        private MhuEbiApplicationStartupListener bG() {
            return b(C6825ckc.e());
        }

        private MultihouseholdNudgeApplicationStartupListener bI() {
            return a(C6750cjG.d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NotificationPermissionHelperImpl bP() {
            return new NotificationPermissionHelperImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.L);
        }

        private NotificationPermissionApplicationStartupListener bO() {
            return d(C7092cpg.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1478aCu cd() {
            return new C1478aCu(this.bX.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public aCX bL() {
            return new aCX(this.ad.get(), this.A.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C8057ddG aS() {
            return new C8057ddG(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public XJ bj() {
            return new XJ(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), new XL());
        }

        private C8032dci cc() {
            return new C8032dci(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.j));
        }

        private MonitoringLoggerImpl bJ() {
            return new MonitoringLoggerImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.aQ.get(), this.Y.get(), new InsecticideEmpty());
        }

        private ErrorLoggerImpl bi() {
            return new ErrorLoggerImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.aQ.get(), K(), this.Y.get(), new InsecticideEmpty());
        }

        private LoggingRegistrationImpl bD() {
            return new LoggingRegistrationImpl(bJ(), bi(), this.u.get(), this.aY.get(), this.Y.get());
        }

        private AndroidProviderImpl aT() {
            return new AndroidProviderImpl(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.j));
        }

        private InterfaceC1342Xz bc$1b5d7a09() {
            try {
                Object[] objArr = {ApplicationContextModule_ProvideContextFactory.provideContext(this.j)};
                Object obj = C9588sW.q.get(1788212202);
                if (obj == null) {
                    obj = ((Class) C9588sW.a(202, (char) 0, 50)).getDeclaredConstructor(Context.class);
                    C9588sW.q.put(1788212202, obj);
                }
                return (InterfaceC1342Xz) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BugsnagErrorHandler aU() {
            return d(XB.d(ApplicationContextModule_ProvideContextFactory.provideContext(this.j)));
        }

        private ViewPortTtrTrackerImpl ca() {
            return new ViewPortTtrTrackerImpl(this.aF.get(), this.A.get());
        }

        private SharedPreferences bN() {
            return C3865bNn.c(this.at, ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bNB bY() {
            return new bNB(bN(), new C3877bNz());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bNC bW() {
            return new bNC(this.bC.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DeepLinkUtilsImpl bf() {
            return new DeepLinkUtilsImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), new GameControllerNavigationImpl(), bW());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<FoundationalFrameworkInitOrder, javax.inject.Provider<aGN>> bF() {
            return ImmutableMap.of(FoundationalFrameworkInitOrder.a, this.ay, FoundationalFrameworkInitOrder.c, this.aN);
        }

        private OutOfMemoryReporterImpl bR() {
            return new OutOfMemoryReporterImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.Y.get());
        }

        private dEB bq() {
            return aFI.c(this.aB, this.bz.get(), this.G);
        }

        private C1252Un aZ() {
            return new C1252Un(Optional.empty());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public dwQ bB() {
            return C0901Gy.a(this.S, ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Oauth2LoginDelegateImpl bT() {
            return new Oauth2LoginDelegateImpl(this.aP.get(), E(), bB());
        }

        private UiServices cb() {
            return d(C1075Nt.c());
        }

        private C1564aFz bw() {
            return new C1564aFz(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bn() {
            return this.aB.q(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long br() {
            return this.aB.s(this.bz.get());
        }

        private C8289dha bx() {
            return new C8289dha(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        private C8211dgB bz() {
            return new C8211dgB(bx());
        }

        private UserAgentListener aX() {
            return C1558aFt.d(this.O, ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.g.get(), this.bz.get());
        }

        private GraphQLCacheAccountEventsHandler bg() {
            return new GraphQLCacheAccountEventsHandler(DoubleCheck.lazy(this.ax));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public aCE bh() {
            return C6781cjl.b(this.ar, ApplicationContextModule_ProvideContextFactory.provideContext(this.j), this.aP.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bp() {
            return this.aB.t(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bm() {
            return this.aB.l(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bo() {
            return this.aB.k(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C7262csr be() {
            return new C7262csr(this.bh.get(), this.V.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3875bNx bU() {
            return new C3875bNx(this.bC.get(), bW());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3874bNw bX() {
            return new C3874bNw(this.bC.get(), bW());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C7086cpa bM() {
            return new C7086cpa(this.I);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String bv() {
            return aFN.c(this.aB, this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String by() {
            return aFP.d(this.aB, this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bl() {
            return this.aB.r(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<String> bu() {
            return aGY.a(this.aK, this.H);
        }

        private Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>> bH() {
            return ImmutableMap.builderWithExpectedSize(16).put(ConfirmLifecycleData.class, this.Q).put(VerifyCardContextViewModel.LifecycleData.class, this.aE).put(VerifyCardLifecycleData.class, this.bW).put(RegistrationLifecycleData.class, this.bI).put(PasswordOnlyLifecycleData.class, this.bl).put(AddProfilesLifecycleData.class, this.e).put(VerifyAgeLifecycleData.class, this.bU).put(SecondaryLanguageLifecycleData.class, this.bL).put(OnRampLifecycleData.class, this.bk).put(MaturityPinLifecycleData.class, this.aM).put(DeviceSurveyLifecycleData.class, this.W).put(OrderFinalLifecycleData.class, this.bn).put(WelcomeFujiLifecycleData.class, this.cc).put(RegenoldLifecycleData.class, this.bF).put(UpiWaitingViewModel.LifecycleData.class, this.aI).put(LearnMoreConfirmViewModelAb44926.LifecycleData.class, this.aL).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DependencyInjectionLifecycleDataFactory bd() {
            return new DependencyInjectionLifecycleDataFactory(bH());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String bK() {
            return SignupSingletonModule_ProvidesWebViewBaseUrlFactory.providesWebViewBaseUrl(this.bQ, ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ClientNetworkDetails ba() {
            return SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory.providesClientNetworkDetails(this.bN, ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bNJ bV() {
            return new bNJ(new GameControllerNavigationImpl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bs() {
            return this.aB.c(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean bt() {
            return this.aB.d(this.bz.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1341Xy bb() {
            return new C1341Xy(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TX aR() {
            return new TX(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object aW() {
            return C7182crQ.a(bt(), this.bh.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CdxAgentImpl aY() {
            return d(C1764aNj.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3876bNy bQ() {
            return new C3876bNy(this.bC.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1693aKt bS() {
            return new C1693aKt(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        private void e(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule, ApplicationContextModule applicationContextModule, BlockStoreClientModule blockStoreClientModule, BrowseExperienceModule browseExperienceModule, CfourStringMappingModule cfourStringMappingModule, CoreInitModule coreInitModule, CoreSingletonConfigModule coreSingletonConfigModule, CoroutinesModule coroutinesModule, DetailsUtilModule detailsUtilModule, GameControllerModule gameControllerModule, GameRepoBeaconDataStoreModule gameRepoBeaconDataStoreModule, GraphQLSamplingModule graphQLSamplingModule, HendrixSingletonConfigModule hendrixSingletonConfigModule, LocalDiscoveryProviderConfigModule localDiscoveryProviderConfigModule, RealGameControllerMagicPathModule realGameControllerMagicPathModule, RxJavaModule rxJavaModule, SignupLibSingletonModule signupLibSingletonModule, SignupSingletonModule signupSingletonModule) {
            this.aC = new b(this.bP, 1);
            this.aF = DoubleCheck.provider(new b(this.bP, 2));
            this.aA = DoubleCheck.provider(new b(this.bP, 0));
            this.g = new b(this.bP, 5);
            this.bz = DoubleCheck.provider(new b(this.bP, 4));
            this.bS = DoubleCheck.provider(new b(this.bP, 3));
            this.ax = new b(this.bP, 8);
            this.C = DoubleCheck.provider(new b(this.bP, 7));
            b bVar = new b(this.bP, 6);
            this.c = bVar;
            this.f = DoubleCheck.provider(bVar);
            this.A = DoubleCheck.provider(new b(this.bP, 9));
            this.bm = DoubleCheck.provider(new b(this.bP, 10));
            this.aR = DoubleCheck.provider(new b(this.bP, 11));
            b bVar2 = new b(this.bP, 12);
            this.aV = bVar2;
            this.f13388o = DoubleCheck.provider(bVar2);
            b bVar3 = new b(this.bP, 13);
            this.aW = bVar3;
            this.p = DoubleCheck.provider(bVar3);
            this.L = new b(this.bP, 15);
            this.bc = new b(this.bP, 14);
            this.bX = DoubleCheck.provider(new b(this.bP, 19));
            this.ag = SingleCheck.provider(new b(this.bP, 22));
            this.ah = SingleCheck.provider(new b(this.bP, 23));
            this.af = SingleCheck.provider(new b(this.bP, 21));
            this.bR = DoubleCheck.provider(new b(this.bP, 24));
            this.aJ = DoubleCheck.provider(new b(this.bP, 20));
            this.ad = DoubleCheck.provider(new b(this.bP, 26));
            this.bo = DoubleCheck.provider(new b(this.bP, 27));
            this.z = SingleCheck.provider(new b(this.bP, 25));
            this.aP = DoubleCheck.provider(new b(this.bP, 18));
            this.bx = DoubleCheck.provider(new b(this.bP, 29));
            this.bw = DoubleCheck.provider(new b(this.bP, 28));
            this.ap = DoubleCheck.provider(new b(this.bP, 30));
            b bVar4 = new b(this.bP, 17);
            this.bB = bVar4;
            this.t = DoubleCheck.provider(bVar4);
            b bVar5 = new b(this.bP, 16);
            this.bH = bVar5;
            this.k = DoubleCheck.provider(bVar5);
            this.aZ = DoubleCheck.provider(new b(this.bP, 31));
            this.bK = new b(this.bP, 32);
            this.bg = DoubleCheck.provider(new b(this.bP, 34));
            this.bu = new b(this.bP, 35);
            this.ab = DoubleCheck.provider(new b(this.bP, 36));
            this.bh = new b(this.bP, 33);
            this.be = new b(this.bP, 37);
            b bVar6 = new b(this.bP, 39);
            this.v = bVar6;
            this.l = DoubleCheck.provider(bVar6);
            this.aQ = DoubleCheck.provider(new b(this.bP, 38));
            this.u = DoubleCheck.provider(new b(this.bP, 41));
            this.Y = DoubleCheck.provider(new b(this.bP, 40));
            this.aY = DoubleCheck.provider(new b(this.bP, 42));
            this.bf = DoubleCheck.provider(new b(this.bP, 43));
            this.d = DoubleCheck.provider(new b(this.bP, 44));
            this.x = DoubleCheck.provider(new b(this.bP, 45));
            this.a = DoubleCheck.provider(new b(this.bP, 46));
            this.aa = DoubleCheck.provider(new b(this.bP, 48));
            this.bO = DoubleCheck.provider(new b(this.bP, 49));
            this.y = DoubleCheck.provider(new b(this.bP, 47));
            this.by = SingleCheck.provider(new b(this.bP, 50));
            this.br = DoubleCheck.provider(new b(this.bP, 51));
            this.bC = DoubleCheck.provider(new b(this.bP, 52));
            this.aw = new b(this.bP, 53);
            this.av = DoubleCheck.provider(new b(this.bP, 54));
            this.ay = new b(this.bP, 56);
            this.aN = new b(this.bP, 57);
            this.bs = DoubleCheck.provider(new b(this.bP, 55));
            this.G = SingleCheck.provider(new b(this.bP, 58));
            this.bb = DoubleCheck.provider(new b(this.bP, 59));
            this.ae = SingleCheck.provider(new b(this.bP, 60));
            this.aj = SingleCheck.provider(new b(this.bP, 61));
            this.al = SingleCheck.provider(new b(this.bP, 62));
            this.am = SingleCheck.provider(new b(this.bP, 64));
            this.aO = new b(this.bP, 63);
            this.ai = SingleCheck.provider(new b(this.bP, 65));
            this.ak = DoubleCheck.provider(new b(this.bP, 66));
            this.aG = SingleCheck.provider(new b(this.bP, 67));
            this.i = DoubleCheck.provider(new b(this.bP, 68));
            b bVar7 = new b(this.bP, 69);
            this.X = bVar7;
            this.m = DoubleCheck.provider(bVar7);
            this.ba = DoubleCheck.provider(new b(this.bP, 70));
            this.bj = DoubleCheck.provider(new b(this.bP, 71));
            this.r = DoubleCheck.provider(this.bH);
            this.bv = DoubleCheck.provider(new b(this.bP, 72));
            this.bd = DoubleCheck.provider(new b(this.bP, 73));
            this.P = new b(this.bP, 74);
            b bVar8 = new b(this.bP, 75);
            this.aS = bVar8;
            this.bE = DoubleCheck.provider(bVar8);
            this.bi = DoubleCheck.provider(new b(this.bP, 76));
            this.bT = DoubleCheck.provider(new b(this.bP, 77));
            this.T = DoubleCheck.provider(new b(this.bP, 79));
            this.ac = new b(this.bP, 78);
            this.bq = new b(this.bP, 80);
            this.bV = DoubleCheck.provider(new b(this.bP, 81));
            this.bY = new b(this.bP, 82);
            this.bp = DoubleCheck.provider(new b(this.bP, 83));
            this.h = DoubleCheck.provider(new b(this.bP, 84));
            this.bJ = DoubleCheck.provider(new b(this.bP, 85));
            this.bA = DoubleCheck.provider(new b(this.bP, 86));
            this.bD = new b(this.bP, 87);
            this.an = DoubleCheck.provider(new b(this.bP, 88));
            this.aU = DoubleCheck.provider(new b(this.bP, 89));
            this.s = new b(this.bP, 90);
        }

        private void a(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule, ApplicationContextModule applicationContextModule, BlockStoreClientModule blockStoreClientModule, BrowseExperienceModule browseExperienceModule, CfourStringMappingModule cfourStringMappingModule, CoreInitModule coreInitModule, CoreSingletonConfigModule coreSingletonConfigModule, CoroutinesModule coroutinesModule, DetailsUtilModule detailsUtilModule, GameControllerModule gameControllerModule, GameRepoBeaconDataStoreModule gameRepoBeaconDataStoreModule, GraphQLSamplingModule graphQLSamplingModule, HendrixSingletonConfigModule hendrixSingletonConfigModule, LocalDiscoveryProviderConfigModule localDiscoveryProviderConfigModule, RealGameControllerMagicPathModule realGameControllerMagicPathModule, RxJavaModule rxJavaModule, SignupLibSingletonModule signupLibSingletonModule, SignupSingletonModule signupSingletonModule) {
            this.au = new b(this.bP, 91);
            this.V = DoubleCheck.provider(new b(this.bP, 92));
            this.K = new b(this.bP, 93);
            this.ao = DoubleCheck.provider(new b(this.bP, 94));
            b bVar = new b(this.bP, 95);
            this.aD = bVar;
            this.n = DoubleCheck.provider(bVar);
            this.aq = DoubleCheck.provider(new b(this.bP, 96));
            this.I = new b(this.bP, 97);
            this.E = new b(this.bP, 98);
            this.Z = DoubleCheck.provider(new b(this.bP, 99));
            this.aT = DoubleCheck.provider(new b(this.bP, 100));
            this.F = SingleCheck.provider(new b(this.bP, 103));
            this.H = new b(this.bP, 102);
            this.aH = DoubleCheck.provider(new b(this.bP, 101));
            this.Q = new b(this.bP, 104);
            this.aE = new b(this.bP, 105);
            this.bW = new b(this.bP, 106);
            this.bI = new b(this.bP, 107);
            this.bl = new b(this.bP, 108);
            this.e = new b(this.bP, 109);
            this.bU = new b(this.bP, 110);
            this.bL = new b(this.bP, 111);
            this.bk = new b(this.bP, 112);
            this.aM = new b(this.bP, 113);
            this.W = new b(this.bP, 114);
            this.bn = new b(this.bP, 115);
            this.cc = new b(this.bP, 116);
            this.bF = new b(this.bP, 117);
            this.aI = new b(this.bP, 118);
            this.aL = new b(this.bP, NetflixImageView.DEFAULT_LAYER_GRAVITY);
            this.as = new b(this.bP, 120);
            this.N = new b(this.bP, 121);
            this.B = new b(this.bP, 122);
            this.bt = DoubleCheck.provider(new b(this.bP, 123));
            this.M = new b(this.bP, 124);
            this.f13387J = new b(this.bP, 125);
            this.aX = DoubleCheck.provider(new b(this.bP, 126));
        }

        @Override // o.InterfaceC8984gy
        public InterfaceC8934gA d() {
            return new k(this.bP);
        }

        @Override // com.netflix.android.imageloader.api.BlurProcessor.a
        public BlurProcessor b() {
            return aV();
        }

        @Override // o.InterfaceC9638uF.b
        public InterfaceC9638uF e() {
            return this.aA.get();
        }

        @Override // o.GD
        public C0902Gz a() {
            return this.bS.get();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d
        public Set<ApplicationStartupListener> c() {
            return ImmutableSet.of((MultihouseholdNudgeApplicationStartupListener) aN(), (MultihouseholdNudgeApplicationStartupListener) bC(), (MultihouseholdNudgeApplicationStartupListener) this.aR.get(), (MultihouseholdNudgeApplicationStartupListener) new MemberRejoinFlagsImpl(), (MultihouseholdNudgeApplicationStartupListener) bG(), bI(), (MultihouseholdNudgeApplicationStartupListener[]) new ApplicationStartupListener[]{new NewUserExperienceApplicationImpl(), bO(), this.k.get(), new UmaApplicationImpl(), cc()});
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d
        public InterfaceC1929aTm j() {
            return this.aZ.get();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d
        public ServiceManager o() {
            return this.bK.get();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d, o.InterfaceC7303ctf.b
        public InterfaceC7303ctf i() {
            return this.bh.get();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d, o.aKQ.e
        public InterfaceC7084cpY f() {
            return this.be.get();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d
        public bMQ h() {
            return new ErrorHandlerImpl();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d
        public InterfaceC1601aHi g() {
            return bD();
        }

        @Override // com.netflix.mediaclient.NetflixApplication.d, o.aRZ.d, o.AbstractC5119bsj.d
        public aIE m() {
            return this.bf.get();
        }

        @Override // o.MD.e
        public MD k() {
            return this.d.get();
        }

        @Override // com.netflix.mediaclient.acquisition.api.Signup.SignupAccessor
        public Signup getSignup() {
            return new SignupImpl();
        }

        @Override // o.C1141Qg.c
        public C1141Qg s() {
            return new C1141Qg(ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        @Override // o.TM
        public TO n() {
            return aT();
        }

        @Override // o.TS.e
        public TS p() {
            return this.x.get();
        }

        @Override // o.TU.b
        public TU l() {
            return this.a.get();
        }

        @Override // o.InterfaceC1245Ug
        public InterfaceC1248Uj w() {
            return this.l.get();
        }

        @Override // o.InterfaceC1270Vf.c
        public InterfaceC1270Vf v() {
            return this.A.get();
        }

        @Override // o.InterfaceC1342Xz.d
        public InterfaceC1342Xz H() {
            return bc$1b5d7a09();
        }

        @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter.b
        public Set<ExternalCrashReporter> K() {
            return ImmutableSet.of(this.y.get());
        }

        @Override // o.XH.b
        public XH R() {
            return this.ap.get();
        }

        @Override // o.aCG.d
        public InterfaceC1476aCs aA() {
            return new C1481aCx();
        }

        @Override // o.aCN.c
        public aCN P() {
            return this.ax.get();
        }

        @Override // o.InterfaceC1549aFk
        public InterfaceC1545aFg X() {
            return this.bz.get();
        }

        @Override // o.aFY.c
        public aFY aw() {
            return this.br.get();
        }

        @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker.a
        public UiLatencyMarker aC() {
            return this.bX.get();
        }

        @Override // o.C1579aGn.a
        public InterfaceC8358diq aL() {
            return ca();
        }

        @Override // o.aGA
        public bEY z() {
            return bf();
        }

        @Override // o.aGB
        public bNS Q() {
            return this.aw.get();
        }

        @Override // o.aGC
        public aDB O() {
            return this.av.get();
        }

        @Override // o.InterfaceC1599aHg.e
        public InterfaceC1599aHg an() {
            return bR();
        }

        @Override // o.aHX
        public List<NetflixCronetProvider.PreferredCronetProvider> as() {
            return C1616aHx.e(bq());
        }

        @Override // o.aHG.d
        public XS ag() {
            return new NetflixFlipperEmpty();
        }

        @Override // o.aIL
        public InterfaceC1246Uh r() {
            return aZ();
        }

        @Override // o.aII.a
        public aII ad() {
            return this.bb.get();
        }

        @Override // o.aIR.d
        public aIR am() {
            return new aIS();
        }

        @Override // o.InterfaceC1659aJm.e
        public InterfaceC1659aJm ar() {
            return this.bm.get();
        }

        @Override // o.aKQ.e
        public aKS.d D() {
            return this.ae.get();
        }

        @Override // o.aKQ.e
        public C1711aLk.e S() {
            return this.aj.get();
        }

        @Override // o.aKQ.e
        public C1712aLl.d aa() {
            return this.al.get();
        }

        @Override // o.aKQ.e
        public C1715aLo ab() {
            return new C1715aLo(bf(), this.bC.get());
        }

        @Override // o.aKQ.e
        public aKW B() {
            return new aKW(this.aO.get());
        }

        @Override // o.aKQ.e
        public C1709aLi.c C() {
            return this.ai.get();
        }

        @Override // o.aLN.a
        public aLN M() {
            return this.ak.get();
        }

        @Override // o.InterfaceC1730aMc.d
        public InterfaceC1730aMc aE() {
            return this.bO.get();
        }

        @Override // o.aMH.d
        public InterfaceC1738aMk aD() {
            return cb();
        }

        @Override // o.C1811aPc.d
        public Set<aEZ> y() {
            return ImmutableSet.of(bw());
        }

        @Override // o.C1823aPo.c
        public InterfaceC1595aHc L() {
            return this.Y.get();
        }

        @Override // o.aRE.a
        public boolean T() {
            return this.aB.j(this.bz.get());
        }

        @Override // o.C1920aTd.e
        public aSY.c ac() {
            return this.aG.get();
        }

        @Override // o.InterfaceC4360bcz.a
        public InterfaceC4360bcz ao() {
            return new C4311bcC();
        }

        @Override // o.InterfaceC4315bcG
        public Optional<PlayerComponentFactory> av() {
            return Optional.empty();
        }

        @Override // o.C4330bcV.c
        public RdidConsentStateRepo aQ() {
            return this.t.get();
        }

        @Override // o.C4944bpT.b
        public InterfaceC8260dgy V() {
            return bz();
        }

        @Override // o.C5020bqq.a
        public Set<UserAgentListener> aI() {
            return ImmutableSet.of((OfflinePostplayImpl) aX(), (OfflinePostplayImpl) this.m.get(), (OfflinePostplayImpl) bg(), (OfflinePostplayImpl) new MiniPlayerUserAgentListener(), (OfflinePostplayImpl) this.ba.get(), this.bj.get(), (OfflinePostplayImpl[]) new UserAgentListener[]{new PinVerifierUserAgentListener(), this.r.get(), new UpNextUserAgentListener(), new UserAgentEventsReceiver(), new com.netflix.mediaclient.service.cdx.UserAgentEventsReceiver(), new com.netflix.mediaclient.service.zuul.UserAgentEventsReceiver(), new com.netflix.mediaclient.playintegrity.impl.UserAgentEventsReceiver()});
        }

        @Override // com.netflix.mediaclient.service.user.deviceupgrade.DeviceUpgradeLoginTokenWorker.b
        public C8246dgk q() {
            return new C8246dgk(this.bv.get());
        }

        @Override // com.netflix.mediaclient.service.user.deviceupgrade.DeviceUpgradeLoginTokenWorker.b
        public dwU x() {
            return this.g.get();
        }

        @Override // com.netflix.mediaclient.service.user.deviceupgrade.DeviceUpgradeLoginTokenWorker.b
        public dwQ E() {
            return GC.d(this.S, ApplicationContextModule_ProvideContextFactory.provideContext(this.j));
        }

        @Override // com.netflix.mediaclient.service.user.deviceupgrade.DeviceUpgradeLoginTokenWorker.b
        public aCI W() {
            return this.aP.get();
        }

        @Override // o.InterfaceC5038brH.e
        public InterfaceC5038brH ae() {
            return this.bd.get();
        }

        @Override // o.AbstractC5039brI.d
        public boolean aF() {
            return this.aB.I(this.bz.get());
        }

        @Override // o.AbstractC3525bBb.a.c
        public InterfaceC9639uG U() {
            return this.aC.get();
        }

        @Override // o.bDE.e, o.InterfaceC5844cKl.c, o.C5965cOz.b
        public InterfaceC5844cKl at() {
            return this.bu.get();
        }

        @Override // o.bDL.b
        public bDL au() {
            return new bDO();
        }

        @Override // o.InterfaceC3612bEh.b
        public InterfaceC3612bEh J() {
            return new EpisodesListSelectorDialogFactoryImpl();
        }

        @Override // o.InterfaceC3643bFl.d
        public InterfaceC3643bFl A() {
            return this.P.get();
        }

        @Override // o.InterfaceC3656bFy.e
        public InterfaceC3656bFy I() {
            return bFA.d(this.U);
        }

        @Override // o.InterfaceC4190bZo.d
        public InterfaceC4190bZo Y() {
            return new bZA();
        }

        @Override // o.C6399cca.e
        public InterfaceC5363bxO u() {
            return new C5373bxY();
        }

        @Override // com.netflix.mediaclient.ui.lolomo.FragmentHelper.e
        public InterfaceC3639bFh F() {
            return new DetailsFragmentApiImpl();
        }

        @Override // o.InterfaceC6636cgz.c
        public InterfaceC6636cgz af() {
            return this.bE.get();
        }

        @Override // o.InterfaceC7089cpd.a
        public InterfaceC7089cpd al() {
            return bP();
        }

        @Override // o.InterfaceC7306cti.a
        public InterfaceC7306cti ai() {
            return new OfflineActivityApiImpl();
        }

        @Override // o.InterfaceC7282ctK.b
        public InterfaceC7282ctK ak() {
            return this.bj.get();
        }

        @Override // o.C7285ctN.a
        public C7285ctN aj() {
            return this.bi.get();
        }

        @Override // com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil.a
        public OfflineVideoImageUtil ap() {
            return this.bg.get();
        }

        @Override // o.C7347cuW.e
        public InterfaceC7345cuU aG() {
            return this.bT.get();
        }

        @Override // o.InterfaceC7407cvd.c
        public InterfaceC7407cvd G() {
            return this.ac.get();
        }

        @Override // o.C7632czq.c
        public boolean aO() {
            return this.aB.D(this.bz.get());
        }

        @Override // o.cNT.b
        public cNT ax() {
            return this.bq.get();
        }

        @Override // o.InterfaceC5958cOs.a
        public InterfaceC5958cOs ah() {
            return new LolopiModuleImpl();
        }

        @Override // o.cOJ.e
        public cOJ ay() {
            return new ProfileLanguagesModuleImpl();
        }

        @Override // o.cOY.e
        public cOY az() {
            return new ProfileSubtitleAppearanceImpl();
        }

        @Override // o.InterfaceC6084cTg.e
        public InterfaceC6084cTg aB() {
            return new C6082cTe();
        }

        @Override // o.cVB.e
        public LoginApi Z() {
            return this.aO.get();
        }

        @Override // o.InterfaceC6236cYx.e
        public InterfaceC6236cYx aH() {
            return this.bV.get();
        }

        @Override // o.InterfaceC8098ddv.d
        public InterfaceC8098ddv aK() {
            return this.bY.get();
        }

        @Override // o.C8153dex.a
        public boolean aP() {
            return this.aB.z(this.bz.get());
        }

        @Override // o.C8153dex.a
        public boolean aJ() {
            return this.aB.a(this.bz.get());
        }

        @Override // o.C8153dex.a
        public boolean aM() {
            return this.aB.e(this.bz.get());
        }

        @Override // o.C8205dfw.a
        public C8205dfw aq() {
            return this.bp.get();
        }

        @Override // o.C8258dgw.c
        public C8258dgw N() {
            return this.T.get();
        }

        @Override // o.C8271dhI.e
        public C8312dhx t() {
            return this.h.get();
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return ImmutableSet.of();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new a(this.bP);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new q(this.bP);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdsPlanApplicationImpl b(AdsPlanApplicationImpl adsPlanApplicationImpl) {
            C5312bwQ.e(adsPlanApplicationImpl, this.C.get());
            return adsPlanApplicationImpl;
        }

        private AdsPlanApplicationStartupListener a(AdsPlanApplicationStartupListener adsPlanApplicationStartupListener) {
            C5313bwR.d(adsPlanApplicationStartupListener, this.f.get());
            return adsPlanApplicationStartupListener;
        }

        private MhuEbiApplicationStartupListener b(MhuEbiApplicationStartupListener mhuEbiApplicationStartupListener) {
            C6824ckb.e(mhuEbiApplicationStartupListener, this.f13388o.get());
            return mhuEbiApplicationStartupListener;
        }

        private MultihouseholdNudgeApplicationStartupListener a(MultihouseholdNudgeApplicationStartupListener multihouseholdNudgeApplicationStartupListener) {
            C6751cjH.d(multihouseholdNudgeApplicationStartupListener, this.p.get());
            return multihouseholdNudgeApplicationStartupListener;
        }

        private NotificationPermissionApplicationStartupListener d(NotificationPermissionApplicationStartupListener notificationPermissionApplicationStartupListener) {
            C7094cpi.d(notificationPermissionApplicationStartupListener, this.bc.get());
            return notificationPermissionApplicationStartupListener;
        }

        private BugsnagErrorHandler d(BugsnagErrorHandler bugsnagErrorHandler) {
            XG.b(bugsnagErrorHandler, this.aa.get());
            return bugsnagErrorHandler;
        }

        private UiServices d(UiServices uiServices) {
            C1074Ns.a(uiServices, new ErrorHandlerImpl());
            C1074Ns.c(uiServices, this.bu.get());
            C1074Ns.b(uiServices, this.aO.get());
            return uiServices;
        }

        private CdxAgentImpl d(CdxAgentImpl cdxAgentImpl) {
            C1770aNp.a(cdxAgentImpl, new com.netflix.mediaclient.service.cdx.UserAgentEventsReceiver());
            C1770aNp.c(cdxAgentImpl, this.aH.get());
            return cdxAgentImpl;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b<T> implements Provider<T> {
            private final int a;
            private final t e;

            b(t tVar, int i) {
                this.e = tVar;
                this.a = i;
            }

            private T b() {
                switch (this.a) {
                    case 0:
                        return (T) new C9650uR(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC9639uG) this.e.aC.get(), (InterfaceC9643uK) this.e.aF.get(), new C9652uT());
                    case 1:
                        return (T) new bMP();
                    case 2:
                        return (T) new C9715vd();
                    case 3:
                        return (T) new C0902Gz(this.e.bk());
                    case 4:
                        return (T) C1561aFw.c(this.e.O, ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (dwU) this.e.g.get(), ImmutableSet.of(), ImmutableSet.of());
                    case 5:
                        return (T) GB.a(this.e.S, ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 6:
                        t tVar = this.e;
                        return (T) tVar.b(C5314bwS.e(ApplicationContextModule_ProvideApplicationFactory.provideApplication(tVar.j)));
                    case 7:
                        return (T) new C8242dgg(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.e.j), (aCN) this.e.ax.get());
                    case 8:
                        return (T) new GraphQLCacheHelperImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), new C1481aCx());
                    case 9:
                        return (T) new ClockImpl();
                    case 10:
                        return (T) new C1670aJx(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 11:
                        return (T) new MemberRejoinApplicationImpl(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.e.j));
                    case 12:
                        return (T) new C6769cjZ(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.e.j));
                    case 13:
                        return (T) new C6753cjJ(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.e.j));
                    case 14:
                        return (T) new NotificationPermissionApplicationImpl(this.e.bP());
                    case 15:
                        return (T) Boolean.valueOf(this.e.aB.G((C1555aFq) this.e.bz.get()));
                    case 16:
                        return (T) new RecordRdidManager((dwU) this.e.g.get(), this.e.E(), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC1270Vf) this.e.A.get(), (RdidConsentStateRepo) this.e.t.get());
                    case 17:
                        return (T) new RdidConsentStateRepoImpl(DoubleCheck.lazy(this.e.aP), (InterfaceC5323bwb) this.e.bw.get(), this.e.aS(), (XH) this.e.ap.get());
                    case 18:
                        return (T) new LoggedOutGraphQLRepositoryImpl(this.e.cd(), (C1497aDm) this.e.aJ.get(), (aCW.d) this.e.z.get(), new C1480aCw());
                    case 19:
                        return (T) new UiLatencyMarkerImpl((InterfaceC1270Vf) this.e.A.get());
                    case 20:
                        return (T) new C1497aDm((InterfaceC1477aCt) this.e.af.get(), (InterfaceC1475aCr) this.e.bR.get(), new C1480aCw());
                    case 21:
                        return (T) new aCD.a() { // from class: o.OC.t.b.1
                            @Override // o.InterfaceC1477aCt
                            /* renamed from: d */
                            public aCD a(C1567aGb c1567aGb, boolean z) {
                                return new aCD((aCH.a) b.this.e.ag.get(), (aCA.d) b.this.e.ah.get(), c1567aGb, z);
                            }
                        };
                    case 22:
                        return (T) new aCH.a() { // from class: o.OC.t.b.2
                            @Override // o.aCH.a
                            public aCH e(C7826dGu c7826dGu, C1567aGb c1567aGb, boolean z) {
                                return new aCH(ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), aRU.a(b.this.e.az), c7826dGu, c1567aGb, z);
                            }
                        };
                    case 23:
                        return (T) new aCA.d() { // from class: o.OC.t.b.5
                            @Override // o.aCA.d
                            public aCA b(C7826dGu c7826dGu, boolean z) {
                                return new aCA(ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), c7826dGu, z);
                            }
                        };
                    case 24:
                        return (T) new C1483aCz();
                    case 25:
                        return (T) new aCW.d() { // from class: o.OC.t.b.4
                            @Override // o.aCW.d
                            public aCW a(aCJ acj) {
                                return new aCW(b.this.e.bL(), ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), acj, (InterfaceC1473aCp) b.this.e.bo.get(), b.this.e.E(), (C0902Gz) b.this.e.bS.get());
                            }
                        };
                    case 26:
                        return (T) new ExpiryHelperImpl();
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        return (T) new C1482aCy(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        return (T) C5247bvE.d((RdidCtaConsentStateDatabase) this.e.bx.get());
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        return (T) C5292bvx.e(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        return (T) new XK(this.e.bj());
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        return (T) new NetflixJobSchedulerImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 32:
                        return (T) new C5101bsR(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 33:
                        return (T) new OfflineApiImpl((OfflineVideoImageUtil) this.e.bg.get(), DoubleCheck.lazy(this.e.bu), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC7221csC) this.e.ab.get());
                    case 34:
                        return (T) new OfflineVideoImageUtil(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC9638uF) this.e.aA.get());
                    case 35:
                        return (T) new ProfileImpl(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.e.j));
                    case 36:
                        return (T) new C7222csD();
                    case 37:
                        return (T) new NotificationsUiImpl();
                    case 38:
                        return (T) new LoggerConfig(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), this.e.K(), (InterfaceC1248Uj) this.e.l.get());
                    case 39:
                        return (T) new C1254Up();
                    case JSONzip.substringLimit /* 40 */:
                        return (T) new ErrorLoggingDataCollectorImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC1593aHa) this.e.u.get(), this.e.K());
                    case 41:
                        return (T) new BreadcrumbLoggerImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (LoggerConfig) this.e.aQ.get(), this.e.K());
                    case 42:
                        return (T) new NetflixCrashReporterImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (ErrorLoggingDataCollectorImpl) this.e.Y.get(), (LoggerConfig) this.e.aQ.get());
                    case 43:
                        return (T) new aIH();
                    case 44:
                        return (T) new MD(new b(this.e));
                    case 45:
                        return (T) new BrotliContextImpl();
                    case 46:
                        return (T) new AndroidDevicePerformanceDelegateImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 47:
                        return (T) new BugsnagCrashReporter(this.e.aU(), (InterfaceC1248Uj) this.e.l.get(), (InterfaceC1730aMc) this.e.bO.get());
                    case 48:
                        return (T) new XE();
                    case 49:
                        return (T) new C1728aMa();
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        return (T) C1560aFv.a(this.e.O, (C1555aFq) this.e.bz.get());
                    case 51:
                        return (T) new aFY(new s(this.e));
                    case 52:
                        return (T) new bND(this.e.bY(), (InterfaceC1270Vf) this.e.A.get(), bNI.d(this.e.bG));
                    case 53:
                        return (T) new bQU(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), new C3909bPd());
                    case 54:
                        return (T) new aDB(new C1479aCv());
                    case 55:
                        return (T) new aGU(this.e.bF());
                    case 56:
                        return (T) aGO.e(this.e.R, (dwU) this.e.g.get(), ImmutableMap.of());
                    case 57:
                        return (T) aGQ.d(this.e.R, (dwU) this.e.g.get(), ImmutableMap.of());
                    case 58:
                        return (T) aFM.d(this.e.aB);
                    case 59:
                        return (T) new aIM();
                    case 60:
                        return (T) new aKS.d() { // from class: o.OC.t.b.8
                            @Override // o.aKS.d
                            public aKS c(Map<String, String> map) {
                                return new aKS((InterfaceC7084cpY) b.this.e.be.get(), map);
                            }
                        };
                    case 61:
                        return (T) new C1711aLk.e() { // from class: o.OC.t.b.9
                            @Override // o.C1711aLk.e
                            public C1711aLk e(Map<String, String> map) {
                                return new C1711aLk(b.this.e.bf(), map);
                            }
                        };
                    case 62:
                        return (T) new C1712aLl.d() { // from class: o.OC.t.b.7
                            @Override // o.C1712aLl.d
                            public C1712aLl b(Map<String, String> map) {
                                return new C1712aLl(b.this.e.bf(), map);
                            }
                        };
                    case 63:
                        return (T) new LoginImpl((RecaptchaV3Manager.c) this.e.am.get());
                    case 64:
                        return (T) new RecaptchaV3Manager.c() { // from class: o.OC.t.b.10
                            @Override // com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager.c
                            public RecaptchaV3Manager b(Activity activity, C6331cbL c6331cbL) {
                                return new RecaptchaV3Manager((InterfaceC1270Vf) b.this.e.A.get(), activity, c6331cbL);
                            }
                        };
                    case 65:
                        return (T) new C1709aLi.c() { // from class: o.OC.t.b.6
                            @Override // o.C1709aLi.c
                            public C1709aLi e(Map<String, String> map) {
                                return new C1709aLi(b.this.e.bT(), (LoginApi) b.this.e.aO.get(), map);
                            }
                        };
                    case 66:
                        return (T) new aLY();
                    case 67:
                        return (T) new aSY.c() { // from class: o.OC.t.b.3
                            @Override // o.aSY.c
                            public aSY c(cQF cqf, cQQ cqq) {
                                return new aSY(ApplicationContextModule_ProvideContextFactory.provideContext(b.this.e.j), cqf, cqq, (InterfaceC1270Vf) b.this.e.A.get(), b.this.e.bn(), b.this.e.br());
                            }
                        };
                    case 68:
                        return (T) new aTB();
                    case 69:
                        return (T) new DeviceUpgradeLoginTokenManager(this.e.q(), ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (dwU) this.e.g.get(), this.e.E());
                    case 70:
                        return (T) new NetflixJobInitializer((InterfaceC1929aTm) this.e.aZ.get(), ImmutableMap.of());
                    case 71:
                        return (T) new OfflinePostplayImpl();
                    case 72:
                        return (T) C8072ddV.b(this.e.q, ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 73:
                        return (T) new NetworkAwareImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 74:
                        return (T) new DetailsActivityApiImpl();
                    case 75:
                        return (T) new MemberRejoinFlagsImpl();
                    case 76:
                        return (T) new C7285ctN(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (InterfaceC9638uF) this.e.aA.get());
                    case 77:
                        return (T) new TutorialHelperFactoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), DoubleCheck.lazy(this.e.bh));
                    case 78:
                        return (T) new DownloadedForYouImpl((C8258dgw) this.e.T.get());
                    case 79:
                        return (T) new C8258dgw();
                    case 80:
                        return (T) new ProfileSelectionLauncherImpl();
                    case 81:
                        return (T) new C7896daE();
                    case 82:
                        return (T) new VoipImpl();
                    case 83:
                        return (T) new C8205dfw(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 84:
                        return (T) new C8312dhx(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 85:
                        return (T) new C6744cjA(this.e.bh());
                    case 86:
                        return (T) new C1266Vb();
                    case 87:
                        return (T) Boolean.valueOf(this.e.w.c());
                    case 88:
                        return (T) new C3705bHp();
                    case 89:
                        return (T) new C8191dfi(this.e.E(), (dwU) this.e.g.get());
                    case 90:
                        return (T) new BookmarkStoreRoom(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 91:
                        return (T) new bOZ();
                    case 92:
                        return (T) new C7247csc();
                    case 93:
                        return (T) Boolean.valueOf(this.e.aB.B((C1555aFq) this.e.bz.get()));
                    case 94:
                        return (T) new C3706bHq();
                    case 95:
                        return (T) new InterstitialsImpl((LoginApi) this.e.aO.get(), (RdidConsentStateRepo) this.e.t.get(), (XH) this.e.ap.get());
                    case 96:
                        return (T) new C6786cjq();
                    case 97:
                        return (T) Boolean.valueOf(this.e.aB.y((C1555aFq) this.e.bz.get()));
                    case 98:
                        return (T) Boolean.valueOf(this.e.aB.u((C1555aFq) this.e.bz.get()));
                    case 99:
                        return (T) new C1304Wn(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), (aDB) this.e.av.get());
                    default:
                        throw new AssertionError(this.a);
                }
            }

            private T d() {
                switch (this.a) {
                    case 100:
                        return (T) new C1303Wm(this.e.bB(), (dwU) this.e.g.get());
                    case 101:
                        return (T) new aGW(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j), this.e.bl(), this.e.bu());
                    case 102:
                        return (T) aFJ.c(this.e.aB, (C1555aFq) this.e.bz.get(), this.e.F);
                    case 103:
                        return (T) aFK.a(this.e.aB);
                    case 104:
                        return (T) new ConfirmLifecycleData();
                    case 105:
                        return (T) new VerifyCardContextViewModel.LifecycleData((InterfaceC1270Vf) this.e.A.get());
                    case 106:
                        return (T) new VerifyCardLifecycleData();
                    case 107:
                        return (T) new RegistrationLifecycleData();
                    case 108:
                        return (T) new PasswordOnlyLifecycleData();
                    case 109:
                        return (T) new AddProfilesLifecycleData();
                    case 110:
                        return (T) new VerifyAgeLifecycleData();
                    case 111:
                        return (T) new SecondaryLanguageLifecycleData();
                    case 112:
                        return (T) new OnRampLifecycleData();
                    case 113:
                        return (T) new MaturityPinLifecycleData();
                    case 114:
                        return (T) new DeviceSurveyLifecycleData();
                    case 115:
                        return (T) new OrderFinalLifecycleData();
                    case 116:
                        return (T) new WelcomeFujiLifecycleData();
                    case 117:
                        return (T) new RegenoldLifecycleData();
                    case 118:
                        return (T) new UpiWaitingViewModel.LifecycleData((InterfaceC1270Vf) this.e.A.get());
                    case NetflixImageView.DEFAULT_LAYER_GRAVITY /* 119 */:
                        return (T) new LearnMoreConfirmViewModelAb44926.LifecycleData();
                    case 120:
                        return (T) new C3982bRw(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    case 121:
                        return (T) Boolean.valueOf(this.e.aB.w((C1555aFq) this.e.bz.get()));
                    case 122:
                        return (T) Boolean.valueOf(this.e.aB.b((C1555aFq) this.e.bz.get()));
                    case 123:
                        return (T) new C7611czV();
                    case 124:
                        return (T) Boolean.valueOf(this.e.aB.C((C1555aFq) this.e.bz.get()));
                    case 125:
                        return (T) Boolean.valueOf(this.e.aB.A((C1555aFq) this.e.bz.get()));
                    case 126:
                        return (T) new NetflixWorkManagerImpl(ApplicationContextModule_ProvideContextFactory.provideContext(this.e.j));
                    default:
                        throw new AssertionError(this.a);
                }
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.a / 100;
                if (i != 0) {
                    if (i == 1) {
                        return d();
                    }
                    throw new AssertionError(this.a);
                }
                return b();
            }
        }
    }
}
