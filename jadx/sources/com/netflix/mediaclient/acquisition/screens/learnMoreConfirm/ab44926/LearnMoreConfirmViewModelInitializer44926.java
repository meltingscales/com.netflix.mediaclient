package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModel;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmViewModelAb44926;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LearnMoreConfirmViewModelInitializer44926 extends LearnMoreConfirmViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public LearnMoreConfirmViewModelInitializer44926(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        super(flowMode, signupErrorReporter, signupNetworkManager, stringProvider, errorMessageViewModelInitializer);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModelInitializer
    public LearnMoreConfirmViewModel createLearnMoreConfirmViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new LearnMoreConfirmViewModelAb44926(this.stringProvider, extractLearnMoreConfirmParsedData(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), (LearnMoreConfirmViewModelAb44926.LifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(LearnMoreConfirmViewModelAb44926.LifecycleData.class));
    }
}
