package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.CreateAccount;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.services.logging.ClNetworkActionCommandLogger;
import javax.inject.Inject;
import o.C8632dsu;
import o.drO;

/* loaded from: classes3.dex */
public final class PasswordOnlyViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer;
    private final SignupLogger signupLogger;
    private final SignupNetworkManager signupNetworkManager;
    private final StepsViewModelInitializer stepsViewModelInitializer;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PasswordOnlyViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, SignupLogger signupLogger, StringProvider stringProvider, ViewModelProvider.Factory factory, StepsViewModelInitializer stepsViewModelInitializer, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) signupLogger, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) stepsViewModelInitializer, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) formViewEditTextViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.signupLogger = signupLogger;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.stepsViewModelInitializer = stepsViewModelInitializer;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.formViewEditTextViewModelInitializer = formViewEditTextViewModelInitializer;
    }

    public final PasswordOnlyViewModel createPasswordOnlyViewModel(PasswordOnlyFragment passwordOnlyFragment) {
        C8632dsu.c((Object) passwordOnlyFragment, "");
        PasswordOnlyLifecycleData passwordOnlyLifecycleData = (PasswordOnlyLifecycleData) new ViewModelProvider(passwordOnlyFragment, this.viewModelProviderFactory).get(PasswordOnlyLifecycleData.class);
        return new PasswordOnlyViewModel(this.stringProvider, this.signupNetworkManager, new ClNetworkActionCommandLogger(this.signupLogger, new drO<Action>() { // from class: com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyViewModelInitializer$createPasswordOnlyViewModel$registerLogger$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Action invoke() {
                return new CreateAccount(null, null, null, null);
            }
        }, null, 4, null), StepsViewModelInitializer.createStepsViewModel$default(this.stepsViewModelInitializer, false, 1, null), passwordOnlyLifecycleData, extractPasswordOnlyData(), FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.EMAIL, AppView.emailInput, InputKind.email, true, true, null, 64, null), FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.PASSWORD, AppView.passwordInput, InputKind.password, false, true, null, 64, null), this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final PasswordOnlyParsedData extractPasswordOnlyData() {
        ActionField actionField;
        String str;
        boolean z;
        FlowMode flowMode = this.flowMode;
        String str2 = null;
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.LOGIN_ACTION);
            if (field == null || !(field instanceof ActionField)) {
                field = null;
            }
            actionField = (ActionField) field;
        } else {
            actionField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode2.getField(SignupConstants.Field.EMAIL);
            Object value = field2 != null ? field2.getValue() : null;
            if (value == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.EMAIL, null);
            } else {
                if (!(value instanceof String)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.EMAIL, null);
                }
                str = (String) value;
            }
            value = null;
            str = (String) value;
        } else {
            str = null;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode3.getField(SignupConstants.Field.WARN_NO_FREE_TRIAL);
            Object value2 = field3 != null ? field3.getValue() : null;
            if (value2 == null || !(value2 instanceof Boolean)) {
                value2 = null;
            }
            z = C8632dsu.c(value2, Boolean.TRUE);
        } else {
            z = false;
        }
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode4.getField(SignupConstants.Field.FIRST_NAME);
            Object value3 = field4 != null ? field4.getValue() : null;
            if (value3 == null) {
                signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.FIRST_NAME, null);
            } else if (value3 instanceof String) {
                str2 = value3;
            } else {
                signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.FIRST_NAME, null);
            }
            str2 = str2;
        }
        return new PasswordOnlyParsedData(actionField, str, str2, z);
    }
}
