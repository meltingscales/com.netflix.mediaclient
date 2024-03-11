package com.netflix.mediaclient.acquisition.screens.maturityPin;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MaturityPinViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public MaturityPinViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) maturityPinEntryViewModelInitializer, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
        this.maturityPinEntryViewModelInitializer = maturityPinEntryViewModelInitializer;
    }

    public final MaturityPinParsedData extractMaturityPinParsedData() {
        ActionField actionField;
        ActionField actionField2;
        Long l;
        FlowMode flowMode = this.flowMode;
        String str = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.MATURITY_PIN_ACTION);
            if (field == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Action.MATURITY_PIN_ACTION, null);
            } else {
                if (!(field instanceof ActionField)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Action.MATURITY_PIN_ACTION, null);
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
        return new MaturityPinParsedData(actionField, actionField2, valueOf, String.valueOf(str));
    }

    public final MaturityPinViewModel createMaturityPinViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new MaturityPinViewModel(this.stringProvider, extractMaturityPinParsedData(), (MaturityPinLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(MaturityPinLifecycleData.class), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), this.maturityPinEntryViewModelInitializer.createMaturityPinEntryViewModel());
    }
}
