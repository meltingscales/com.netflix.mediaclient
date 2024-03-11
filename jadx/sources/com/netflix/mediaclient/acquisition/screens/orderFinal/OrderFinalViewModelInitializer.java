package com.netflix.mediaclient.acquisition.screens.orderFinal;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
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
public final class OrderFinalViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public OrderFinalViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
    }

    public final OrderFinalViewModel createOrderFinalViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new OrderFinalViewModel(this.stringProvider, extractOrderFinalParsedData(), (OrderFinalLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(OrderFinalLifecycleData.class), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final OrderFinalParsedData extractOrderFinalParsedData() {
        ActionField actionField;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        StringField stringField;
        StringField stringField2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        FlowMode flowMode = this.flowMode;
        BooleanField booleanField = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.CONTINUE_ACTION);
            if (field == null) {
                str13 = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else {
                if (!(field instanceof ActionField)) {
                    str13 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                }
                actionField = (ActionField) field;
            }
            signupErrorReporter.onDataError(str13, SignupConstants.Action.CONTINUE_ACTION, null);
            field = null;
            actionField = (ActionField) field;
        } else {
            actionField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode2.getField(SignupConstants.Field.REFUND_DAYS_REMAINING);
            String value = field2 != null ? field2.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str = value;
        } else {
            str = null;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode3.getField(SignupConstants.Field.HAS_LCFM_OFFER);
            Object value2 = field3 != null ? field3.getValue() : null;
            if (value2 == null || !(value2 instanceof Boolean)) {
                value2 = null;
            }
            z = C8632dsu.c(value2, Boolean.TRUE);
        } else {
            z = false;
        }
        boolean z2 = z;
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode4.getField(SignupConstants.Field.PLAN_PRICE);
            String value3 = field4 != null ? field4.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            str2 = value3;
        } else {
            str2 = null;
        }
        FlowMode flowMode5 = this.flowMode;
        if (flowMode5 != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode5.getField(SignupConstants.Field.PLAN_DURATION);
            String value4 = field5 != null ? field5.getValue() : null;
            if (value4 == null || !(value4 instanceof String)) {
                value4 = null;
            }
            str3 = value4;
        } else {
            str3 = null;
        }
        FlowMode flowMode6 = this.flowMode;
        if (flowMode6 != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode6.getField(SignupConstants.Field.GIFT_AMOUNT);
            String value5 = field6 != null ? field6.getValue() : null;
            if (value5 == null || !(value5 instanceof String)) {
                value5 = null;
            }
            str4 = value5;
        } else {
            str4 = null;
        }
        FlowMode flowMode7 = this.flowMode;
        if (flowMode7 != null) {
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = flowMode7.getField(SignupConstants.Field.EMAIL);
            String value6 = field7 != null ? field7.getValue() : null;
            if (value6 == null || !(value6 instanceof String)) {
                value6 = null;
            }
            str5 = value6;
        } else {
            str5 = null;
        }
        FlowMode flowMode8 = this.flowMode;
        if (flowMode8 != null) {
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field8 = flowMode8.getField(SignupConstants.Field.LOCALIZED_PLAN_NAME);
            String value7 = field8 != null ? field8.getValue() : null;
            if (value7 == null || !(value7 instanceof String)) {
                value7 = null;
            }
            str6 = value7;
        } else {
            str6 = null;
        }
        FlowMode flowMode9 = this.flowMode;
        if (flowMode9 != null) {
            SignupErrorReporter unused8 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field9 = flowMode9.getField(SignupConstants.Field.ACCOUNT_NUMBER_DISPLAY);
            String value8 = field9 != null ? field9.getValue() : null;
            if (value8 == null || !(value8 instanceof String)) {
                value8 = null;
            }
            str7 = value8;
        } else {
            str7 = null;
        }
        FlowMode flowMode10 = this.flowMode;
        if (flowMode10 != null) {
            SignupErrorReporter unused9 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field10 = flowMode10.getField(SignupConstants.Field.CARD_TYPE);
            String value9 = field10 != null ? field10.getValue() : null;
            if (value9 == null || !(value9 instanceof String)) {
                value9 = null;
            }
            str8 = value9;
        } else {
            str8 = null;
        }
        FlowMode flowMode11 = this.flowMode;
        if (flowMode11 != null) {
            SignupErrorReporter unused10 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field11 = flowMode11.getField(SignupConstants.Field.COUNTRY_CODE);
            if (field11 == null || !(field11 instanceof StringField)) {
                field11 = null;
            }
            stringField = (StringField) field11;
        } else {
            stringField = null;
        }
        FlowMode flowMode12 = this.flowMode;
        if (flowMode12 != null) {
            SignupErrorReporter unused11 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field12 = flowMode12.getField(SignupConstants.Field.MOBILE_PHONE);
            if (field12 == null || !(field12 instanceof StringField)) {
                field12 = null;
            }
            stringField2 = (StringField) field12;
        } else {
            stringField2 = null;
        }
        FlowMode flowMode13 = this.flowMode;
        if (flowMode13 != null) {
            SignupErrorReporter unused12 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field13 = flowMode13.getField(SignupConstants.Field.MOP_TYPE);
            String value10 = field13 != null ? field13.getValue() : null;
            if (value10 == null || !(value10 instanceof String)) {
                value10 = null;
            }
            str9 = value10;
        } else {
            str9 = null;
        }
        FlowMode flowMode14 = this.flowMode;
        if (flowMode14 != null) {
            SignupErrorReporter unused13 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field14 = flowMode14.getField(SignupConstants.Field.FIRST_NAME);
            String value11 = field14 != null ? field14.getValue() : null;
            if (value11 == null || !(value11 instanceof String)) {
                value11 = null;
            }
            str10 = value11;
        } else {
            str10 = null;
        }
        FlowMode flowMode15 = this.flowMode;
        if (flowMode15 != null) {
            SignupErrorReporter unused14 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field15 = flowMode15.getField(SignupConstants.Field.LAST_NAME);
            String value12 = field15 != null ? field15.getValue() : null;
            if (value12 == null || !(value12 instanceof String)) {
                value12 = null;
            }
            str11 = value12;
        } else {
            str11 = null;
        }
        FlowMode flowMode16 = this.flowMode;
        if (flowMode16 != null) {
            SignupErrorReporter unused15 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field16 = flowMode16.getField(SignupConstants.Field.POSTAL_CODE);
            String value13 = field16 != null ? field16.getValue() : null;
            if (value13 == null || !(value13 instanceof String)) {
                value13 = null;
            }
            str12 = value13;
        } else {
            str12 = null;
        }
        FlowMode flowMode17 = this.flowMode;
        if (flowMode17 != null) {
            SignupErrorReporter unused16 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field17 = flowMode17.getField(SignupConstants.Field.SMS_CONSENT);
            if (field17 != null && (field17 instanceof BooleanField)) {
                booleanField = field17;
            }
            booleanField = booleanField;
        }
        return new OrderFinalParsedData(actionField, str, z2, str2, str4, str3, null, str5, str6, str7, str8, stringField, stringField2, str9, str10, str11, str12, booleanField);
    }
}
