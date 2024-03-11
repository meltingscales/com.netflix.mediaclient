package com.netflix.mediaclient.acquisition.screens.signupContainer;

import com.netflix.mediaclient.acquisition.api.SignUpDebugUtilities;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.services.logging.SignupFragmentLifecycleLogger;
import com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;
import o.C1057Nb;
import o.C1634aIo;
import o.InterfaceC1643aIx;
import o.InterfaceC5285bvq;
import o.InterfaceC5844cKl;
import o.InterfaceC6634cgx;
import o.InterfaceC6675chl;
import o.InterfaceC7018coJ;
import o.InterfaceC7249cse;
import o.InterfaceC7303ctf;
import o.InterfaceC7345cuU;
import o.InterfaceC8098ddv;
import o.cNT;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData"})
/* loaded from: classes3.dex */
public final class SignupNativeActivity_MembersInjector implements MembersInjector<SignupNativeActivity> {
    private final Provider<Optional<DebugMenuItems>> debugMenuItemsProvider;
    private final Provider<InterfaceC7249cse> downloadSummaryListenerProvider;
    private final Provider<ErrorDialogHelper> errorDialogHelperProvider;
    private final Provider<LoginApi> loginApiProvider;
    private final Provider<InterfaceC6634cgx> memberRejoinProvider;
    private final Provider<InterfaceC6675chl> messagingProvider;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC7018coJ> nonMemberNavigationProvider;
    private final Provider<InterfaceC7303ctf> offlineApiProvider;
    private final Provider<InterfaceC5844cKl> profileApiProvider;
    private final Provider<InterfaceC5844cKl> profileProvider;
    private final Provider<cNT> profileSelectionLauncherProvider;
    private final Provider<InterfaceC1643aIx> serviceManagerControllerProvider;
    private final Provider<ServiceManager> serviceManagerInstanceProvider;
    private final Provider<InterfaceC5285bvq> shakeDetectorProvider;
    private final Provider<Optional<SignUpDebugUtilities>> signUpDebugUtilitiesProvider;
    private final Provider<SignupFragmentLifecycleLogger> signupFragmentLifecycleLoggerProvider;
    private final Provider<InterfaceC7345cuU> tutorialHelperFactoryProvider;
    private final Provider<InterfaceC8098ddv> voipProvider;

    public SignupNativeActivity_MembersInjector(Provider<ServiceManager> provider, Provider<InterfaceC1643aIx> provider2, Provider<InterfaceC7249cse> provider3, Provider<LoginApi> provider4, Provider<InterfaceC6675chl> provider5, Provider<InterfaceC8098ddv> provider6, Provider<InterfaceC7345cuU> provider7, Provider<Optional<DebugMenuItems>> provider8, Provider<InterfaceC5285bvq> provider9, Provider<InterfaceC5844cKl> provider10, Provider<cNT> provider11, Provider<InterfaceC7303ctf> provider12, Provider<Optional<SignUpDebugUtilities>> provider13, Provider<InterfaceC6634cgx> provider14, Provider<MoneyballDataSource> provider15, Provider<InterfaceC7018coJ> provider16, Provider<SignupFragmentLifecycleLogger> provider17, Provider<SignupMoneyballEntryPoint> provider18, Provider<InterfaceC5844cKl> provider19, Provider<ErrorDialogHelper> provider20) {
        this.serviceManagerInstanceProvider = provider;
        this.serviceManagerControllerProvider = provider2;
        this.downloadSummaryListenerProvider = provider3;
        this.loginApiProvider = provider4;
        this.messagingProvider = provider5;
        this.voipProvider = provider6;
        this.tutorialHelperFactoryProvider = provider7;
        this.debugMenuItemsProvider = provider8;
        this.shakeDetectorProvider = provider9;
        this.profileApiProvider = provider10;
        this.profileSelectionLauncherProvider = provider11;
        this.offlineApiProvider = provider12;
        this.signUpDebugUtilitiesProvider = provider13;
        this.memberRejoinProvider = provider14;
        this.moneyballDataSourceProvider = provider15;
        this.nonMemberNavigationProvider = provider16;
        this.signupFragmentLifecycleLoggerProvider = provider17;
        this.moneyballEntryPointProvider = provider18;
        this.profileProvider = provider19;
        this.errorDialogHelperProvider = provider20;
    }

    public static MembersInjector<SignupNativeActivity> create(Provider<ServiceManager> provider, Provider<InterfaceC1643aIx> provider2, Provider<InterfaceC7249cse> provider3, Provider<LoginApi> provider4, Provider<InterfaceC6675chl> provider5, Provider<InterfaceC8098ddv> provider6, Provider<InterfaceC7345cuU> provider7, Provider<Optional<DebugMenuItems>> provider8, Provider<InterfaceC5285bvq> provider9, Provider<InterfaceC5844cKl> provider10, Provider<cNT> provider11, Provider<InterfaceC7303ctf> provider12, Provider<Optional<SignUpDebugUtilities>> provider13, Provider<InterfaceC6634cgx> provider14, Provider<MoneyballDataSource> provider15, Provider<InterfaceC7018coJ> provider16, Provider<SignupFragmentLifecycleLogger> provider17, Provider<SignupMoneyballEntryPoint> provider18, Provider<InterfaceC5844cKl> provider19, Provider<ErrorDialogHelper> provider20) {
        return new SignupNativeActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SignupNativeActivity signupNativeActivity) {
        C1634aIo.d(signupNativeActivity, this.serviceManagerInstanceProvider.get());
        C1634aIo.a(signupNativeActivity, this.serviceManagerControllerProvider.get());
        C1057Nb.d(signupNativeActivity, this.downloadSummaryListenerProvider.get());
        C1057Nb.c(signupNativeActivity, DoubleCheck.lazy(this.loginApiProvider));
        C1057Nb.c(signupNativeActivity, this.messagingProvider.get());
        C1057Nb.c(signupNativeActivity, this.voipProvider.get());
        C1057Nb.c(signupNativeActivity, this.tutorialHelperFactoryProvider.get());
        C1057Nb.a(signupNativeActivity, this.debugMenuItemsProvider.get());
        C1057Nb.a(signupNativeActivity, this.shakeDetectorProvider.get());
        C1057Nb.b(signupNativeActivity, this.profileApiProvider.get());
        C1057Nb.d(signupNativeActivity, DoubleCheck.lazy(this.profileSelectionLauncherProvider));
        C1057Nb.e(signupNativeActivity, this.offlineApiProvider.get());
        injectSignUpDebugUtilities(signupNativeActivity, this.signUpDebugUtilitiesProvider.get());
        injectMemberRejoin(signupNativeActivity, this.memberRejoinProvider.get());
        injectMoneyballDataSource(signupNativeActivity, this.moneyballDataSourceProvider.get());
        injectNonMemberNavigation(signupNativeActivity, this.nonMemberNavigationProvider.get());
        injectSignupFragmentLifecycleLogger(signupNativeActivity, this.signupFragmentLifecycleLoggerProvider.get());
        injectMoneyballEntryPoint(signupNativeActivity, this.moneyballEntryPointProvider.get());
        injectProfile(signupNativeActivity, this.profileProvider.get());
        injectErrorDialogHelper(signupNativeActivity, this.errorDialogHelperProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.signUpDebugUtilities")
    public static void injectSignUpDebugUtilities(SignupNativeActivity signupNativeActivity, Optional<SignUpDebugUtilities> optional) {
        signupNativeActivity.signUpDebugUtilities = optional;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.memberRejoin")
    public static void injectMemberRejoin(SignupNativeActivity signupNativeActivity, InterfaceC6634cgx interfaceC6634cgx) {
        signupNativeActivity.memberRejoin = interfaceC6634cgx;
    }

    @SignupMoneyballData
    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.moneyballDataSource")
    public static void injectMoneyballDataSource(SignupNativeActivity signupNativeActivity, MoneyballDataSource moneyballDataSource) {
        signupNativeActivity.moneyballDataSource = moneyballDataSource;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.nonMemberNavigation")
    public static void injectNonMemberNavigation(SignupNativeActivity signupNativeActivity, InterfaceC7018coJ interfaceC7018coJ) {
        signupNativeActivity.nonMemberNavigation = interfaceC7018coJ;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.signupFragmentLifecycleLogger")
    public static void injectSignupFragmentLifecycleLogger(SignupNativeActivity signupNativeActivity, SignupFragmentLifecycleLogger signupFragmentLifecycleLogger) {
        signupNativeActivity.signupFragmentLifecycleLogger = signupFragmentLifecycleLogger;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(SignupNativeActivity signupNativeActivity, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        signupNativeActivity.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.profile")
    public static void injectProfile(SignupNativeActivity signupNativeActivity, InterfaceC5844cKl interfaceC5844cKl) {
        signupNativeActivity.profile = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity.errorDialogHelper")
    public static void injectErrorDialogHelper(SignupNativeActivity signupNativeActivity, ErrorDialogHelper errorDialogHelper) {
        signupNativeActivity.errorDialogHelper = errorDialogHelper;
    }
}
