package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLifecycleData;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiParsedData;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class WelcomeFujiViewModelAb44926 extends WelcomeFujiViewModel {
    public static final int $stable = 8;
    private final WelcomeFujiParsedData parsedData;
    private final boolean showEmailTray;

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModel
    public boolean getShowEmailTray() {
        return this.showEmailTray;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFujiViewModelAb44926(StringProvider stringProvider, WelcomeFujiParsedData welcomeFujiParsedData, WelcomeFujiLifecycleData welcomeFujiLifecycleData, FormViewEditTextViewModel formViewEditTextViewModel, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(stringProvider, welcomeFujiParsedData, welcomeFujiLifecycleData, formViewEditTextViewModel, signupNetworkManager, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) welcomeFujiParsedData, "");
        C8632dsu.c((Object) welcomeFujiLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.parsedData = welcomeFujiParsedData;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModel
    public void performNextRequest() {
        AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getSaveEmailAction(), getFujiLoading(), null, 4, null);
    }
}
