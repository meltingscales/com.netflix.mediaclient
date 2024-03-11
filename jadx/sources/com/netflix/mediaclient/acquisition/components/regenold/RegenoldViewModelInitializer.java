package com.netflix.mediaclient.acquisition.components.regenold;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegenoldViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    public final FlowMode getFlowMode() {
        return this.flowMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RegenoldViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) formViewEditTextViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.formViewEditTextViewModelInitializer = formViewEditTextViewModelInitializer;
    }

    public final RegenoldParsedData extractRegenoldParsedData(boolean z) {
        String str;
        FlowMode flowMode = this.flowMode;
        ActionField actionField = null;
        r1 = null;
        r1 = null;
        Field field = null;
        if (flowMode != null) {
            SignupErrorReporter access$getSignupErrorReporter = BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field2 = flowMode.getField(SignupConstants.Action.SAVE_ACTION);
            if (field2 == null) {
                if (z) {
                    str = SignupConstants.Error.MISSING_FIELD_ERROR;
                    access$getSignupErrorReporter.onDataError(str, SignupConstants.Action.SAVE_ACTION, null);
                }
                actionField = (ActionField) field;
            } else {
                if (field2 instanceof ActionField) {
                    field = field2;
                } else if (z) {
                    str = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                    access$getSignupErrorReporter.onDataError(str, SignupConstants.Action.SAVE_ACTION, null);
                }
                actionField = (ActionField) field;
            }
        }
        return new RegenoldParsedData(actionField);
    }

    public final RegenoldViewModel createRegenoldViewModel(Fragment fragment, boolean z) {
        C8632dsu.c((Object) fragment, "");
        FormViewEditTextViewModel extractFormViewEditTextViewModel$default = FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.EMAIL, AppView.emailInput, InputKind.email, true, false, null, 64, null);
        return new RegenoldViewModel(this.stringProvider, extractRegenoldParsedData(z), (RegenoldLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(RegenoldLifecycleData.class), extractFormViewEditTextViewModel$default, this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
