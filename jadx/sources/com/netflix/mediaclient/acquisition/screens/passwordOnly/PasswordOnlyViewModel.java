package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.ArrayList;
import java.util.List;
import o.C8566dqi;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PasswordOnlyViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final FormViewEditTextViewModel emailEditTextViewModel;
    private final String header;
    private final String header2;
    private final PasswordOnlyLifecycleData lifecycleData;
    private final PasswordOnlyParsedData parsedData;
    private final FormViewEditTextViewModel passwordEditTextViewModel;
    private final NetworkRequestResponseListener registrationListener;
    private final CharSequence stepsText;
    private final StringProvider stringProvider;
    private final List<String> subTitles;

    public final FormViewEditTextViewModel getEmailEditTextViewModel() {
        return this.emailEditTextViewModel;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHeader2() {
        return this.header2;
    }

    public final FormViewEditTextViewModel getPasswordEditTextViewModel() {
        return this.passwordEditTextViewModel;
    }

    public final CharSequence getStepsText() {
        return this.stepsText;
    }

    public final List<String> getSubTitles() {
        return this.subTitles;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordOnlyViewModel(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, NetworkRequestResponseListener networkRequestResponseListener, StepsViewModel stepsViewModel, PasswordOnlyLifecycleData passwordOnlyLifecycleData, PasswordOnlyParsedData passwordOnlyParsedData, FormViewEditTextViewModel formViewEditTextViewModel, FormViewEditTextViewModel formViewEditTextViewModel2, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        List<Number> e;
        int d;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) networkRequestResponseListener, "");
        C8632dsu.c((Object) stepsViewModel, "");
        C8632dsu.c((Object) passwordOnlyLifecycleData, "");
        C8632dsu.c((Object) passwordOnlyParsedData, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.registrationListener = networkRequestResponseListener;
        this.lifecycleData = passwordOnlyLifecycleData;
        this.parsedData = passwordOnlyParsedData;
        this.emailEditTextViewModel = formViewEditTextViewModel;
        this.passwordEditTextViewModel = formViewEditTextViewModel2;
        this.stepsText = stepsViewModel.getStepsText();
        if (passwordOnlyParsedData.getWarnNoFreeTrial()) {
            e = C8566dqi.e(Integer.valueOf(R.string.password_only_free_trial_subheader));
        } else {
            e = C8566dqi.e(Integer.valueOf(R.string.password_only_nft_subheader));
        }
        d = C8572dqo.d(e, 10);
        ArrayList arrayList = new ArrayList(d);
        for (Number number : e) {
            arrayList.add(this.stringProvider.getString(number.intValue()));
        }
        this.subTitles = arrayList;
        this.header = this.parsedData.getFirstName() != null ? this.stringProvider.getFormatter(R.string.password_only_welcome_back).d(SignupConstants.Field.FIRST_NAME, this.parsedData.getFirstName()).c() : null;
        this.header2 = this.stringProvider.getString(R.string.password_only_rejoin_title);
    }

    public final MutableLiveData<Boolean> getLoginLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public final void performLogin() {
        performAction(this.parsedData.getLoginAction(), getLoginLoading(), this.registrationListener);
    }

    public final boolean isFormValid() {
        FormViewEditTextViewModel formViewEditTextViewModel;
        FormViewEditTextViewModel formViewEditTextViewModel2 = this.emailEditTextViewModel;
        return (formViewEditTextViewModel2 == null || formViewEditTextViewModel2.isValid()) && ((formViewEditTextViewModel = this.passwordEditTextViewModel) == null || formViewEditTextViewModel.isValid());
    }
}
