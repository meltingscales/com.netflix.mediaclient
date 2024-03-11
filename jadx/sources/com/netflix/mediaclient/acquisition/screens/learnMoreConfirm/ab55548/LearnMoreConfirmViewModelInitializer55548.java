package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import androidx.fragment.app.Fragment;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class LearnMoreConfirmViewModelInitializer55548 extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public LearnMoreConfirmViewModelInitializer55548(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
    }

    public LearnMoreConfirmViewModelAb55548 createLearnMoreConfirmViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new LearnMoreConfirmViewModelAb55548(this.stringProvider, extractLearnMoreConfirmParsedData(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final LearnMoreConfirm55548ParsedData extractLearnMoreConfirmParsedData() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        ActionField actionField;
        StringField stringField;
        StringField stringField2;
        String str4;
        FlowMode flowMode = this.flowMode;
        boolean z5 = false;
        String str5 = null;
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.RECENTLY_REGISTERED);
            Object value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof Boolean)) {
                value = null;
            }
            z = C8632dsu.c(value, Boolean.TRUE);
        } else {
            z = false;
        }
        FlowMode flowMode2 = this.flowMode;
        Field field2 = flowMode2 != null ? flowMode2.getField(SignupConstants.Action.GO_TO_NON_MEMBER_HOME_ACTION) : null;
        ActionField actionField2 = field2 instanceof ActionField ? (ActionField) field2 : null;
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode3.getField(SignupConstants.Field.RECOGNIZED_FORMER_MEMBER);
            Object value2 = field3 != null ? field3.getValue() : null;
            if (value2 == null) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.RECOGNIZED_FORMER_MEMBER, null);
            } else {
                if (!(value2 instanceof Boolean)) {
                    signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.RECOGNIZED_FORMER_MEMBER, null);
                }
                z2 = C8632dsu.c(value2, Boolean.TRUE);
            }
            value2 = null;
            z2 = C8632dsu.c(value2, Boolean.TRUE);
        } else {
            z2 = false;
        }
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode4.getField(SignupConstants.Field.EMAIL);
            Object value3 = field4 != null ? field4.getValue() : null;
            if (value3 != null) {
                if (!(value3 instanceof String)) {
                    if (z) {
                        signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.EMAIL, null);
                    }
                }
                str = (String) value3;
            } else if (z) {
                signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.EMAIL, null);
            }
            value3 = null;
            str = (String) value3;
        } else {
            str = null;
        }
        FlowMode flowMode5 = this.flowMode;
        if (flowMode5 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode5.getField(SignupConstants.Field.PLAN_DIALOG_UNAVAILABLE);
            Object value4 = field5 != null ? field5.getValue() : null;
            if (value4 == null || !(value4 instanceof Boolean)) {
                value4 = null;
            }
            z3 = C8632dsu.c(value4, Boolean.TRUE);
        } else {
            z3 = false;
        }
        FlowMode flowMode6 = this.flowMode;
        if (flowMode6 != null) {
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode6.getField(SignupConstants.Field.SHOW_OPEN_EMAIL_CLIENT_BUTTON);
            Object value5 = field6 != null ? field6.getValue() : null;
            if (value5 == null || !(value5 instanceof Boolean)) {
                value5 = null;
            }
            z4 = C8632dsu.c(value5, Boolean.TRUE);
        } else {
            z4 = false;
        }
        FlowMode flowMode7 = this.flowMode;
        if (flowMode7 != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = flowMode7.getField(SignupConstants.Field.COPY_SIGN_UP_URL);
            String value6 = field7 != null ? field7.getValue() : null;
            if (value6 == null || !(value6 instanceof String)) {
                value6 = null;
            }
            str2 = value6;
        } else {
            str2 = null;
        }
        FlowMode flowMode8 = this.flowMode;
        if (flowMode8 != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field8 = flowMode8.getField(SignupConstants.Field.DISPLAY_SIGN_UP_URL);
            String value7 = field8 != null ? field8.getValue() : null;
            if (value7 == null || !(value7 instanceof String)) {
                value7 = null;
            }
            str3 = value7;
        } else {
            str3 = null;
        }
        FlowMode flowMode9 = this.flowMode;
        if (flowMode9 != null) {
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field9 = flowMode9.getField(SignupConstants.Field.SHOW_OPEN_EMAIL_CLIENT_LINK);
            Object value8 = field9 != null ? field9.getValue() : null;
            if (value8 == null || !(value8 instanceof Boolean)) {
                value8 = null;
            }
            z5 = C8632dsu.c(value8, Boolean.TRUE);
        }
        boolean z6 = z5;
        FlowMode flowMode10 = this.flowMode;
        if (flowMode10 != null) {
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field10 = flowMode10.getField(SignupConstants.Action.TEXT_SIGN_UP_LINK_ACTION);
            if (field10 == null || !(field10 instanceof ActionField)) {
                field10 = null;
            }
            actionField = (ActionField) field10;
        } else {
            actionField = null;
        }
        FlowMode flowMode11 = this.flowMode;
        if (flowMode11 != null) {
            SignupErrorReporter unused8 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field11 = flowMode11.getField(SignupConstants.Field.PHONE_NUMBER);
            if (field11 == null || !(field11 instanceof StringField)) {
                field11 = null;
            }
            stringField = (StringField) field11;
        } else {
            stringField = null;
        }
        FlowMode flowMode12 = this.flowMode;
        if (flowMode12 != null) {
            SignupErrorReporter unused9 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field12 = flowMode12.getField(SignupConstants.Field.COUNTRY_CODE);
            if (field12 == null || !(field12 instanceof StringField)) {
                field12 = null;
            }
            stringField2 = (StringField) field12;
        } else {
            stringField2 = null;
        }
        FlowMode flowMode13 = this.flowMode;
        if (flowMode13 != null) {
            SignupErrorReporter unused10 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field13 = flowMode13.getField(SignupConstants.Field.DISPLAY_PHONE_NUMBER);
            String value9 = field13 != null ? field13.getValue() : null;
            if (value9 == null || !(value9 instanceof String)) {
                value9 = null;
            }
            str4 = value9;
        } else {
            str4 = null;
        }
        FlowMode flowMode14 = this.flowMode;
        if (flowMode14 != null) {
            SignupErrorReporter unused11 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field14 = flowMode14.getField(SignupConstants.Field.CLIENT_THEME);
            Object value10 = field14 != null ? field14.getValue() : null;
            if (value10 != null && (value10 instanceof String)) {
                str5 = value10;
            }
            str5 = str5;
        }
        return new LearnMoreConfirm55548ParsedData(z2, str, z, z3, z4, str2, str3, z6, actionField, stringField, stringField2, str4, actionField2, str5);
    }
}
