package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SecondaryLanguageViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StepsViewModelInitializer stepsViewModelInitializer;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SecondaryLanguageViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, StepsViewModelInitializer stepsViewModelInitializer, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stepsViewModelInitializer, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.stepsViewModelInitializer = stepsViewModelInitializer;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
        if (r4 == false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageParsedData extractSecondaryLanguageParsedData() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModelInitializer.extractSecondaryLanguageParsedData():com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageParsedData");
    }

    public final SecondaryLanguageViewModel createSecondaryLanguageViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        SecondaryLanguageParsedData extractSecondaryLanguageParsedData = extractSecondaryLanguageParsedData();
        return new SecondaryLanguageViewModel(this.stringProvider, (SecondaryLanguageLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(SecondaryLanguageLifecycleData.class), extractSecondaryLanguageParsedData, this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
