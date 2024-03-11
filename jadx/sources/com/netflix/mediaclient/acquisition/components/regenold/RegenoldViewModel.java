package com.netflix.mediaclient.acquisition.components.regenold;

import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegenoldViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final FormViewEditTextViewModel emailEditTextViewModel;
    private final RegenoldLifecycleData lifecycleData;
    private final RegenoldParsedData parsedData;

    public final FormViewEditTextViewModel getEmailEditTextViewModel() {
        return this.emailEditTextViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegenoldViewModel(StringProvider stringProvider, RegenoldParsedData regenoldParsedData, RegenoldLifecycleData regenoldLifecycleData, FormViewEditTextViewModel formViewEditTextViewModel, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) regenoldParsedData, "");
        C8632dsu.c((Object) regenoldLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.parsedData = regenoldParsedData;
        this.lifecycleData = regenoldLifecycleData;
        this.emailEditTextViewModel = formViewEditTextViewModel;
    }

    public final MutableLiveData<Boolean> getRegenoldLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public final boolean isFormValid() {
        FormViewEditTextViewModel formViewEditTextViewModel = this.emailEditTextViewModel;
        return !((formViewEditTextViewModel == null || formViewEditTextViewModel.isValid()) ? false : true);
    }

    public final void performSaveEmailAction(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.parsedData.getSaveEmailAction(), getRegenoldLoading(), networkRequestResponseListener);
    }
}
