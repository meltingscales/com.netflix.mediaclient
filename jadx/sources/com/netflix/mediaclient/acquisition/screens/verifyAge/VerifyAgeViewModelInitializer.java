package com.netflix.mediaclient.acquisition.screens.verifyAge;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VerifyAgeViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final BirthDateViewModelInitializer birthDateViewModelInitializer;
    private final BirthMonthViewModelInitializer birthMonthViewModelInitializer;
    private final BirthYearEditTextViewModelInitializer birthYearEditTextViewModelInitializer;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifyAgeViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, BirthMonthViewModelInitializer birthMonthViewModelInitializer, BirthDateViewModelInitializer birthDateViewModelInitializer, BirthYearEditTextViewModelInitializer birthYearEditTextViewModelInitializer, MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) birthMonthViewModelInitializer, "");
        C8632dsu.c((Object) birthDateViewModelInitializer, "");
        C8632dsu.c((Object) birthYearEditTextViewModelInitializer, "");
        C8632dsu.c((Object) maturityPinEntryViewModelInitializer, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
        this.birthMonthViewModelInitializer = birthMonthViewModelInitializer;
        this.birthDateViewModelInitializer = birthDateViewModelInitializer;
        this.birthYearEditTextViewModelInitializer = birthYearEditTextViewModelInitializer;
        this.maturityPinEntryViewModelInitializer = maturityPinEntryViewModelInitializer;
    }

    public final VerifyAgeParsedData extractVerifyAgeParsedData() {
        ActionField actionField;
        ActionField actionField2;
        Long l;
        FlowMode flowMode = this.flowMode;
        String str = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.VERIFY_ACTION);
            if (field == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.VERIFY_ACTION, null);
            } else {
                if (!(field instanceof ActionField)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.VERIFY_ACTION, null);
                }
                actionField = (ActionField) field;
            }
            field = null;
            actionField = (ActionField) field;
        } else {
            actionField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode2.getField(SignupConstants.Action.SKIP_ACTION);
            if (field2 == null) {
                signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.SKIP_ACTION, null);
            } else {
                if (!(field2 instanceof ActionField)) {
                    signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.SKIP_ACTION, null);
                }
                actionField2 = (ActionField) field2;
            }
            field2 = null;
            actionField2 = (ActionField) field2;
        } else {
            actionField2 = null;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode3.getField(SignupConstants.Field.AGE);
            Long value = field3 != null ? field3.getValue() : null;
            if (value == null || !(value instanceof Long)) {
                value = null;
            }
            l = value;
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode4.getField(SignupConstants.Field.PIN_REQUIRED_RATING);
            Object value2 = field4 != null ? field4.getValue() : null;
            if (value2 != null && (value2 instanceof String)) {
                str = value2;
            }
            str = str;
        }
        return new VerifyAgeParsedData(actionField, actionField2, valueOf, String.valueOf(str));
    }

    public final VerifyAgeViewModel createVerifyAgeViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new VerifyAgeViewModel(this.stringProvider, extractVerifyAgeParsedData(), (VerifyAgeLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(VerifyAgeLifecycleData.class), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), this.birthMonthViewModelInitializer.createBirthMonthViewModel(), this.birthDateViewModelInitializer.createBirthDateViewModel(), this.birthYearEditTextViewModelInitializer.createBirthYearViewModel(), this.maturityPinEntryViewModelInitializer.createMaturityPinEntryViewModel());
    }
}
