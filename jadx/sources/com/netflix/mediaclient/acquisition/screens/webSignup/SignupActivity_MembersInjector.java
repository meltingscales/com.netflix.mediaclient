package com.netflix.mediaclient.acquisition.screens.webSignup;

import com.netflix.mediaclient.acquisition.screens.signupContainer.ErrorDialogHelper;
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
import o.InterfaceC6675chl;
import o.InterfaceC7249cse;
import o.InterfaceC7303ctf;
import o.InterfaceC7345cuU;
import o.InterfaceC8098ddv;
import o.bDI;
import o.cNT;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SignupActivity_MembersInjector implements MembersInjector<SignupActivity> {
    private final Provider<Optional<DebugMenuItems>> debugMenuItemsProvider;
    private final Provider<InterfaceC7249cse> downloadSummaryListenerProvider;
    private final Provider<ErrorDialogHelper> errorDialogHelperProvider;
    private final Provider<LoginApi> loginApiProvider;
    private final Provider<LoginApi> loginApiProvider2;
    private final Provider<InterfaceC6675chl> messagingProvider;
    private final Provider<InterfaceC7303ctf> offlineApiProvider;
    private final Provider<bDI> playerUIProvider;
    private final Provider<InterfaceC5844cKl> profileApiProvider;
    private final Provider<cNT> profileSelectionLauncherProvider;
    private final Provider<cNT> profileSelectionLauncherProvider2;
    private final Provider<InterfaceC1643aIx> serviceManagerControllerProvider;
    private final Provider<ServiceManager> serviceManagerInstanceProvider;
    private final Provider<InterfaceC5285bvq> shakeDetectorProvider;
    private final Provider<InterfaceC7345cuU> tutorialHelperFactoryProvider;
    private final Provider<InterfaceC8098ddv> voipProvider;

    public SignupActivity_MembersInjector(Provider<ServiceManager> provider, Provider<InterfaceC1643aIx> provider2, Provider<InterfaceC7249cse> provider3, Provider<LoginApi> provider4, Provider<InterfaceC6675chl> provider5, Provider<InterfaceC8098ddv> provider6, Provider<InterfaceC7345cuU> provider7, Provider<Optional<DebugMenuItems>> provider8, Provider<InterfaceC5285bvq> provider9, Provider<InterfaceC5844cKl> provider10, Provider<cNT> provider11, Provider<InterfaceC7303ctf> provider12, Provider<ErrorDialogHelper> provider13, Provider<bDI> provider14, Provider<cNT> provider15, Provider<LoginApi> provider16) {
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
        this.errorDialogHelperProvider = provider13;
        this.playerUIProvider = provider14;
        this.profileSelectionLauncherProvider2 = provider15;
        this.loginApiProvider2 = provider16;
    }

    public static MembersInjector<SignupActivity> create(Provider<ServiceManager> provider, Provider<InterfaceC1643aIx> provider2, Provider<InterfaceC7249cse> provider3, Provider<LoginApi> provider4, Provider<InterfaceC6675chl> provider5, Provider<InterfaceC8098ddv> provider6, Provider<InterfaceC7345cuU> provider7, Provider<Optional<DebugMenuItems>> provider8, Provider<InterfaceC5285bvq> provider9, Provider<InterfaceC5844cKl> provider10, Provider<cNT> provider11, Provider<InterfaceC7303ctf> provider12, Provider<ErrorDialogHelper> provider13, Provider<bDI> provider14, Provider<cNT> provider15, Provider<LoginApi> provider16) {
        return new SignupActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SignupActivity signupActivity) {
        C1634aIo.d(signupActivity, this.serviceManagerInstanceProvider.get());
        C1634aIo.a(signupActivity, this.serviceManagerControllerProvider.get());
        C1057Nb.d(signupActivity, this.downloadSummaryListenerProvider.get());
        C1057Nb.c(signupActivity, DoubleCheck.lazy(this.loginApiProvider));
        C1057Nb.c(signupActivity, this.messagingProvider.get());
        C1057Nb.c(signupActivity, this.voipProvider.get());
        C1057Nb.c(signupActivity, this.tutorialHelperFactoryProvider.get());
        C1057Nb.a(signupActivity, this.debugMenuItemsProvider.get());
        C1057Nb.a(signupActivity, this.shakeDetectorProvider.get());
        C1057Nb.b(signupActivity, this.profileApiProvider.get());
        C1057Nb.d(signupActivity, DoubleCheck.lazy(this.profileSelectionLauncherProvider));
        C1057Nb.e(signupActivity, this.offlineApiProvider.get());
        injectErrorDialogHelper(signupActivity, this.errorDialogHelperProvider.get());
        injectPlayerUI(signupActivity, this.playerUIProvider.get());
        injectProfileSelectionLauncher(signupActivity, this.profileSelectionLauncherProvider2.get());
        injectLoginApi(signupActivity, this.loginApiProvider2.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.errorDialogHelper")
    public static void injectErrorDialogHelper(SignupActivity signupActivity, ErrorDialogHelper errorDialogHelper) {
        signupActivity.errorDialogHelper = errorDialogHelper;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.playerUI")
    public static void injectPlayerUI(SignupActivity signupActivity, bDI bdi) {
        signupActivity.playerUI = bdi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.profileSelectionLauncher")
    public static void injectProfileSelectionLauncher(SignupActivity signupActivity, cNT cnt) {
        signupActivity.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity.loginApi")
    public static void injectLoginApi(SignupActivity signupActivity, LoginApi loginApi) {
        signupActivity.loginApi = loginApi;
    }
}
