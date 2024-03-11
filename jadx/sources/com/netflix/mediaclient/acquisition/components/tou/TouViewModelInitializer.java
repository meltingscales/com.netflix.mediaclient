package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TouViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final MoneyballDataSource moneyballDataSource;
    private final StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TouViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) startMembershipButtonViewModelInitializer, "");
        this.moneyballDataSource = moneyballDataSource;
        this.stringProvider = stringProvider;
        this.startMembershipButtonViewModelInitializer = startMembershipButtonViewModelInitializer;
    }

    private final FlowMode getFlowMode() {
        return this.moneyballDataSource.getFlowMode();
    }

    public static /* synthetic */ TouPaymentViewModel createTermsOfUsePaymentViewModel$default(TouViewModelInitializer touViewModelInitializer, GetField getField, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return touViewModelInitializer.createTermsOfUsePaymentViewModel(getField, str);
    }

    public final TouPaymentViewModel createTermsOfUsePaymentViewModel(GetField getField, String str) {
        return new TouPaymentViewModel(this.stringProvider, extractTermsOfUseData(getField), new TouSettingsFactory(), this.startMembershipButtonViewModelInitializer.createStartMembershipButtonViewModel(), str);
    }

    public final TouParsedData extractTermsOfUseData(GetField getField) {
        BooleanField booleanField;
        ChoiceField choiceField;
        String str;
        BooleanField booleanField2;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str5;
        OptionField selectedPlan$default;
        OptionField selectedPlan$default2;
        Map<String, Object> data;
        Object obj = null;
        if (getField != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = getField.getField(SignupConstants.Field.RIGHT_OF_WITHDRAWAL);
            if (field == null || !(field instanceof BooleanField)) {
                field = null;
            }
            booleanField = (BooleanField) field;
        } else {
            booleanField = null;
        }
        Object obj2 = (booleanField == null || (data = booleanField.getData()) == null) ? null : data.get("required");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z5 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (getField != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = getField.getField(SignupConstants.Field.MOP_SUB_TYPE);
            if (field2 == null || !(field2 instanceof ChoiceField)) {
                field2 = null;
            }
            choiceField = (ChoiceField) field2;
        } else {
            choiceField = null;
        }
        if (choiceField == null && getField != null) {
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = getField.getField(SignupConstants.Field.PAYMENT_PROVIDER_DISPLAY_NAME);
            String value = field3 != null ? field3.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str = value;
        } else {
            str = null;
        }
        if (getField != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = getField.getField(SignupConstants.Field.HAS_ACCEPTED_TERMS_OF_USE);
            if (field4 == null || !(field4 instanceof BooleanField)) {
                field4 = null;
            }
            booleanField2 = (BooleanField) field4;
        } else {
            booleanField2 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = getField.getField(SignupConstants.Field.TERMS_OF_USE_REGION);
            String value2 = field5 != null ? field5.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            str2 = value2;
        } else {
            str2 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = getField.getField(SignupConstants.Field.TERMS_OF_USE_MINIMUM_VERIFICATION_AGE);
            String value3 = field6 != null ? field6.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            str3 = value3;
        } else {
            str3 = null;
        }
        FlowMode flowMode = getFlowMode();
        String planPriceString = flowMode != null ? getPlanPriceString(flowMode) : null;
        if (getField != null) {
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = getField.getField(SignupConstants.Field.CASH_PAYMENT_MOP_DISPLAY_NAME);
            String value4 = field7 != null ? field7.getValue() : null;
            if (value4 == null || !(value4 instanceof String)) {
                value4 = null;
            }
            str4 = value4;
        } else {
            str4 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused8 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field8 = getField.getField(SignupConstants.Field.INTERNATIONAL_TRANSACTION_MESSAGE);
            Object value5 = field8 != null ? field8.getValue() : null;
            if (value5 == null || !(value5 instanceof Boolean)) {
                value5 = null;
            }
            z = C8632dsu.c(value5, Boolean.TRUE);
        } else {
            z = false;
        }
        if (getField != null) {
            SignupErrorReporter unused9 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field9 = getField.getField(SignupConstants.Field.IS_SCHUFA);
            Object value6 = field9 != null ? field9.getValue() : null;
            if (value6 == null || !(value6 instanceof Boolean)) {
                value6 = null;
            }
            z2 = C8632dsu.c(value6, Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (getField != null) {
            SignupErrorReporter unused10 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field10 = getField.getField(SignupConstants.Field.SHOW_CARD_CHAINING_DISCLOSURE);
            Object value7 = field10 != null ? field10.getValue() : null;
            if (value7 == null || !(value7 instanceof Boolean)) {
                value7 = null;
            }
            z3 = C8632dsu.c(value7, Boolean.TRUE);
        } else {
            z3 = false;
        }
        if (getField != null) {
            SignupErrorReporter unused11 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field11 = getField.getField(SignupConstants.Field.SHOW_MANDATE_MODIFICATION_TERM_OF_USE);
            Object value8 = field11 != null ? field11.getValue() : null;
            if (value8 == null || !(value8 instanceof Boolean)) {
                value8 = null;
            }
            z4 = C8632dsu.c(value8, Boolean.TRUE);
        } else {
            z4 = false;
        }
        BooleanField booleanField3 = booleanValue ? booleanField : null;
        FlowMode flowMode2 = getFlowMode();
        if (flowMode2 == null || (selectedPlan$default2 = BaseViewModelInitializer.getSelectedPlan$default(this, flowMode2, false, 1, null)) == null) {
            str5 = null;
        } else {
            SignupErrorReporter unused12 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field12 = selectedPlan$default2.getField(SignupConstants.Field.BILLING_FREQUENCY);
            Object value9 = field12 != null ? field12.getValue() : null;
            if (value9 == null || !(value9 instanceof String)) {
                value9 = null;
            }
            str5 = value9;
        }
        FlowMode flowMode3 = getFlowMode();
        if (flowMode3 != null && (selectedPlan$default = BaseViewModelInitializer.getSelectedPlan$default(this, flowMode3, false, 1, null)) != null) {
            SignupErrorReporter unused13 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field13 = selectedPlan$default.getField(SignupConstants.Field.IS_PRETAX);
            Object value10 = field13 != null ? field13.getValue() : null;
            if (value10 != null && (value10 instanceof Boolean)) {
                obj = value10;
            }
            z5 = C8632dsu.c(obj, Boolean.TRUE);
        }
        return new TouParsedData(booleanField2, str2, str3, planPriceString, str, str4, z, z2, z3, z4, booleanField3, str5, z5);
    }
}
