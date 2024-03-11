package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.ckI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6805ckI extends BaseViewModelInitializer {
    private final MoneyballDataSource e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6805ckI(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.e = moneyballDataSource;
    }

    public final C6797ckA b() {
        FlowMode flowMode = this.e.getFlowMode();
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.CURRENT_EMAIL);
            String value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            String str = value;
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(SignupConstants.Field.EXPIRY_IN_MINUTES);
            Long value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null || !(value2 instanceof Long)) {
                value2 = null;
            }
            Long l = value2;
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode.getField(SignupConstants.Field.FORMATTED_PHONE_NUMBER);
            String value3 = field3 != null ? field3.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            String str2 = value3;
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode.getField(SignupConstants.Field.CHALLENGE_OTP);
            if (field4 == null || !(field4 instanceof StringField)) {
                field4 = null;
            }
            StringField stringField = (StringField) field4;
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode.getField(SignupConstants.Action.NEXT_ACTION);
            if (field5 == null || !(field5 instanceof ActionField)) {
                field5 = null;
            }
            ActionField actionField = (ActionField) field5;
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field6 == null || !(field6 instanceof ActionField)) {
                field6 = null;
            }
            ActionField actionField2 = (ActionField) field6;
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = flowMode.getField(SignupConstants.Action.RESEND_CODE_ACTION);
            if (field7 == null || !(field7 instanceof ActionField)) {
                field7 = null;
            }
            ActionField actionField3 = (ActionField) field7;
            SignupErrorReporter unused8 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field8 = flowMode.getField("errorCode");
            String value4 = field8 != null ? field8.getValue() : null;
            if (value4 == null || !(value4 instanceof String)) {
                value4 = null;
            }
            String str3 = value4;
            SignupErrorReporter unused9 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field9 = flowMode.getField(SignupConstants.Field.MFA_DELIVERY_TYPE);
            String value5 = field9 != null ? field9.getValue() : null;
            if (value5 == null || !(value5 instanceof String)) {
                value5 = null;
            }
            String str4 = value5;
            SignupErrorReporter unused10 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field10 = flowMode.getField(SignupConstants.Field.RESENT_MFA_CHALLENGE);
            Object value6 = field10 != null ? field10.getValue() : null;
            if (value6 == null || !(value6 instanceof Boolean)) {
                value6 = null;
            }
            return new C6797ckA(str, str2, l != null ? Integer.valueOf((int) l.longValue()) : null, stringField, actionField, actionField3, actionField2, str3, C8632dsu.c(value6, Boolean.TRUE), str4);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
