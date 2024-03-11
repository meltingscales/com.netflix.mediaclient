package com.netflix.mediaclient.acquisition.screens.registration;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.CreateAccount;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
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
public final class RegistrationViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final EmailPreferenceViewModelInitializer emailPreferenceViewModelInitializer;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer;
    private final SignupLogger signupLogger;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RegistrationViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, SignupLogger signupLogger, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, EmailPreferenceViewModelInitializer emailPreferenceViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) signupLogger, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) emailPreferenceViewModelInitializer, "");
        C8632dsu.c((Object) formViewEditTextViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.signupLogger = signupLogger;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.emailPreferenceViewModelInitializer = emailPreferenceViewModelInitializer;
        this.formViewEditTextViewModelInitializer = formViewEditTextViewModelInitializer;
    }

    public final RegistrationViewModel createRegistrationViewModel(RegistrationFragment registrationFragment) {
        C8632dsu.c((Object) registrationFragment, "");
        RegistrationLifecycleData registrationLifecycleData = (RegistrationLifecycleData) new ViewModelProvider(registrationFragment, this.viewModelProviderFactory).get(RegistrationLifecycleData.class);
        ClNetworkActionCommandLogger clNetworkActionCommandLogger = new ClNetworkActionCommandLogger(this.signupLogger, new drO<Action>() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationViewModelInitializer$createRegistrationViewModel$registerLogger$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Action invoke() {
                return new CreateAccount(null, null, null, null);
            }
        }, null, 4, null);
        RegistrationParsedData extractRegistrationData = extractRegistrationData();
        return new RegistrationViewModel(this.stringProvider, this.signupNetworkManager, clNetworkActionCommandLogger, registrationLifecycleData, extractRegistrationData, this.emailPreferenceViewModelInitializer.createEmailPreferenceViewModel(), FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.EMAIL, AppView.emailInput, InputKind.email, true, true, null, 64, null), FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.PASSWORD, AppView.passwordInput, InputKind.password, false, !extractRegistrationData.isReadOnly(), null, 64, null), this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final RegistrationParsedData extractRegistrationData() {
        boolean z;
        ActionField actionField;
        String str;
        FlowMode flowMode = this.flowMode;
        BooleanField booleanField = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.IS_REG_READ_ONLY);
            Object value = field != null ? field.getValue() : null;
            if (value == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.IS_REG_READ_ONLY, null);
            } else {
                if (!(value instanceof Boolean)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.IS_REG_READ_ONLY, null);
                }
                z = C8632dsu.c(value, Boolean.TRUE);
            }
            value = null;
            z = C8632dsu.c(value, Boolean.TRUE);
        } else {
            z = false;
        }
        boolean z2 = z;
        String str2 = z2 ? SignupConstants.Action.CONTINUE_ACTION : SignupConstants.Action.REGISTER_ONLY_ACTION;
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode2.getField(str2);
            if (field2 == null || !(field2 instanceof ActionField)) {
                field2 = null;
            }
            actionField = (ActionField) field2;
        } else {
            actionField = null;
        }
        FlowMode flowMode3 = this.flowMode;
        String messagesField$default = flowMode3 != null ? BaseViewModelInitializer.getMessagesField$default(this, flowMode3, SignupConstants.Message.REG_TITLE, false, 2, null) : null;
        FlowMode flowMode4 = this.flowMode;
        String messagesField = flowMode4 != null ? getMessagesField(flowMode4, SignupConstants.Message.CTA_BUTTON, true) : null;
        FlowMode flowMode5 = this.flowMode;
        if (flowMode5 != null) {
            SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode5.getField(SignupConstants.Field.EMAIL);
            Object value2 = field3 != null ? field3.getValue() : null;
            if (value2 == null) {
                signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.EMAIL, null);
            } else {
                if (!(value2 instanceof String)) {
                    signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.EMAIL, null);
                }
                str = (String) value2;
            }
            value2 = null;
            str = (String) value2;
        } else {
            str = null;
        }
        FlowMode flowMode6 = this.flowMode;
        String messagesField2 = flowMode6 != null ? getMessagesField(flowMode6, SignupConstants.Message.REG_SUBTITLE, z2) : null;
        FlowMode flowMode7 = this.flowMode;
        String messagesField3 = flowMode7 != null ? getMessagesField(flowMode7, SignupConstants.Message.VALUE_PROP_MESSAGE, !z2) : null;
        FlowMode flowMode8 = this.flowMode;
        String messagesField4 = flowMode8 != null ? getMessagesField(flowMode8, SignupConstants.Message.VALUE_PROP_MESSAGE_SECONDARY, !z2) : null;
        FlowMode flowMode9 = this.flowMode;
        if (flowMode9 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode9.getField(SignupConstants.Field.PIPC_CONSENT);
            if (field4 != null && (field4 instanceof BooleanField)) {
                booleanField = field4;
            }
            booleanField = booleanField;
        }
        return new RegistrationParsedData(actionField, messagesField$default, messagesField, z2, str, messagesField2, messagesField3, messagesField4, booleanField);
    }
}
