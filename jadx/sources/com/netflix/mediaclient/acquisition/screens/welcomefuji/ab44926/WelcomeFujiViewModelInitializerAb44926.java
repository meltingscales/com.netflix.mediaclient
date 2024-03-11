package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLifecycleData;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class WelcomeFujiViewModelInitializerAb44926 extends WelcomeFujiViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WelcomeFujiViewModelInitializerAb44926(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        super(flowMode, signupErrorReporter, signupNetworkManager, stringProvider, factory, errorMessageViewModelInitializer, formViewEditTextViewModelInitializer);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) formViewEditTextViewModelInitializer, "");
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer
    public WelcomeFujiViewModelAb44926 createWelcomeFujiViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new WelcomeFujiViewModelAb44926(this.stringProvider, extractWelcomeFujiParsedData(), (WelcomeFujiLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(WelcomeFujiLifecycleData.class), createEmailViewModel(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
