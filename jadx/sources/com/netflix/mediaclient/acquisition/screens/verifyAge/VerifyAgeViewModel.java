package com.netflix.mediaclient.acquisition.screens.verifyAge;

import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.NumberViewModel;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModel;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateViewModel;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VerifyAgeViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final BirthDateViewModel birthDateViewModel;
    private final BirthMonthViewModel birthMonthViewModel;
    private final NumberViewModel birthYearViewModel;
    private final String headerText;
    private final VerifyAgeLifecycleData lifeCycledata;
    private final MaturityPinEntryViewModel maturityPinEntryViewModel;
    private final VerifyAgeParsedData parsedData;
    private final String skipVerifyExpandingHeaderText;
    private final String skipVerifyExpandingSubheaderText;
    private final String verifyAgeExpandingHeaderText;
    private final String verifyAgeSubheaderText;

    public final BirthDateViewModel getBirthDateViewModel() {
        return this.birthDateViewModel;
    }

    public final BirthMonthViewModel getBirthMonthViewModel() {
        return this.birthMonthViewModel;
    }

    public final NumberViewModel getBirthYearViewModel() {
        return this.birthYearViewModel;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final MaturityPinEntryViewModel getMaturityPinEntryViewModel() {
        return this.maturityPinEntryViewModel;
    }

    public final String getSkipVerifyExpandingHeaderText() {
        return this.skipVerifyExpandingHeaderText;
    }

    public final String getSkipVerifyExpandingSubheaderText() {
        return this.skipVerifyExpandingSubheaderText;
    }

    public final String getVerifyAgeExpandingHeaderText() {
        return this.verifyAgeExpandingHeaderText;
    }

    public final String getVerifyAgeSubheaderText() {
        return this.verifyAgeSubheaderText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyAgeViewModel(StringProvider stringProvider, VerifyAgeParsedData verifyAgeParsedData, VerifyAgeLifecycleData verifyAgeLifecycleData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, BirthMonthViewModel birthMonthViewModel, BirthDateViewModel birthDateViewModel, NumberViewModel numberViewModel, MaturityPinEntryViewModel maturityPinEntryViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) verifyAgeParsedData, "");
        C8632dsu.c((Object) verifyAgeLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.parsedData = verifyAgeParsedData;
        this.lifeCycledata = verifyAgeLifecycleData;
        this.birthMonthViewModel = birthMonthViewModel;
        this.birthDateViewModel = birthDateViewModel;
        this.birthYearViewModel = numberViewModel;
        this.maturityPinEntryViewModel = maturityPinEntryViewModel;
        this.headerText = stringProvider.getFormatter(R.string.age_verify_header).d(SignupConstants.Field.AGE, verifyAgeParsedData.getAge()).c();
        this.verifyAgeExpandingHeaderText = stringProvider.getFormatter(R.string.age_verify_verify_header).d(SignupConstants.Field.AGE, verifyAgeParsedData.getAge()).c();
        this.skipVerifyExpandingHeaderText = stringProvider.getFormatter(R.string.age_verify_skip_header).d(SignupConstants.Field.AGE, verifyAgeParsedData.getAge()).c();
        this.verifyAgeSubheaderText = stringProvider.getFormatter(R.string.verify_age_subheader).d(SignupConstants.Field.PIN_REQUIRED_RATING, verifyAgeParsedData.getPinRequiredRating()).c();
        this.skipVerifyExpandingSubheaderText = stringProvider.getFormatter(R.string.age_verify_skip_message).d(SignupConstants.Field.PIN_REQUIRED_RATING, verifyAgeParsedData.getPinRequiredRating()).c();
    }

    public final MutableLiveData<Boolean> getVerifyAgeLoading() {
        return this.lifeCycledata.getVerifyActionLoading();
    }

    public final MutableLiveData<Boolean> getSkipLoading() {
        return this.lifeCycledata.getSkipActionLoading();
    }

    public final void performVerifyAction() {
        AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getVerifyAction(), getVerifyAgeLoading(), null, 4, null);
    }

    public final void performSkipAction() {
        AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getSkipAction(), getSkipLoading(), null, 4, null);
    }

    public final boolean isDobValid() {
        BirthDateViewModel birthDateViewModel;
        NumberViewModel numberViewModel;
        BirthMonthViewModel birthMonthViewModel = this.birthMonthViewModel;
        return birthMonthViewModel != null && birthMonthViewModel.isValid() && (birthDateViewModel = this.birthDateViewModel) != null && birthDateViewModel.isValid() && (numberViewModel = this.birthYearViewModel) != null && numberViewModel.isValid();
    }

    public final boolean isFormValid() {
        MaturityPinEntryViewModel maturityPinEntryViewModel;
        return isDobValid() && (maturityPinEntryViewModel = this.maturityPinEntryViewModel) != null && maturityPinEntryViewModel.isValid();
    }
}
