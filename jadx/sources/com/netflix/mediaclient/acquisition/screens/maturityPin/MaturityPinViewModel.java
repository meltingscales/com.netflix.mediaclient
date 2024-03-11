package com.netflix.mediaclient.acquisition.screens.maturityPin;

import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MaturityPinViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final MaturityPinLifecycleData lifeCycledata;
    private final MaturityPinEntryViewModel maturityPinEntryViewModel;
    private final String maturityPinSubheader;
    private final String pageHeader;
    private final MaturityPinParsedData parsedData;
    private final String skipPinHeader;
    private final StringProvider stringProvider;

    public final MaturityPinEntryViewModel getMaturityPinEntryViewModel() {
        return this.maturityPinEntryViewModel;
    }

    public final String getMaturityPinSubheader() {
        return this.maturityPinSubheader;
    }

    public final String getPageHeader() {
        return this.pageHeader;
    }

    public final String getSkipPinHeader() {
        return this.skipPinHeader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaturityPinViewModel(StringProvider stringProvider, MaturityPinParsedData maturityPinParsedData, MaturityPinLifecycleData maturityPinLifecycleData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, MaturityPinEntryViewModel maturityPinEntryViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) maturityPinParsedData, "");
        C8632dsu.c((Object) maturityPinLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.parsedData = maturityPinParsedData;
        this.lifeCycledata = maturityPinLifecycleData;
        this.maturityPinEntryViewModel = maturityPinEntryViewModel;
        String c = stringProvider.getFormatter(R.string.maturity_pin_header).d(SignupConstants.Field.AGE, maturityPinParsedData.getAge()).c();
        C8632dsu.a(c, "");
        this.pageHeader = c;
        String c2 = stringProvider.getFormatter(R.string.maturity_pin_skip_pin_header).d(SignupConstants.Field.AGE, maturityPinParsedData.getAge()).c();
        C8632dsu.a(c2, "");
        this.skipPinHeader = c2;
        String c3 = stringProvider.getFormatter(R.string.maturity_pin_entry_body).d(SignupConstants.Field.PIN_REQUIRED_RATING, maturityPinParsedData.getPinRequiredRating()).c();
        C8632dsu.a(c3, "");
        this.maturityPinSubheader = c3;
    }

    public final MutableLiveData<Boolean> getMaturityPinActionLoading() {
        return this.lifeCycledata.getMaturityPinActionLoading();
    }

    public final MutableLiveData<Boolean> getSkipLoading() {
        return this.lifeCycledata.getSkipActionLoading();
    }

    public final void performMaturityPinAction() {
        AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getMaturityPinAction(), getMaturityPinActionLoading(), null, 4, null);
    }

    public final void performSkipAction() {
        AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getSkipAction(), getSkipLoading(), null, 4, null);
    }
}
