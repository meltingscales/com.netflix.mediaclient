package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import javax.inject.Inject;

/* renamed from: o.clz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6901clz extends BaseViewModelInitializer {
    private final MoneyballDataSource e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6901clz(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.e = moneyballDataSource;
    }

    public final C6890clo a() {
        FlowMode flowMode = this.e.getFlowMode();
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.EMAIL_OTP_ACTION);
            if (field == null || !(field instanceof ActionField)) {
                field = null;
            }
            ActionField actionField = (ActionField) field;
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(SignupConstants.Action.SMS_OTP_ACTION);
            if (field2 == null || !(field2 instanceof ActionField)) {
                field2 = null;
            }
            ActionField actionField2 = (ActionField) field2;
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field3 == null || !(field3 instanceof ActionField)) {
                field3 = null;
            }
            ActionField actionField3 = (ActionField) field3;
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode.getField(SignupConstants.Field.CURRENT_EMAIL);
            String value = field4 != null ? field4.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            String str = value;
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode.getField(SignupConstants.Field.FORMATTED_PHONE_NUMBER);
            String value2 = field5 != null ? field5.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            String str2 = value2;
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode.getField(SignupConstants.Field.MFA_TARGET_MODE);
            String value3 = field6 != null ? field6.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            String str3 = value3;
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = flowMode.getField(SignupConstants.Field.TRAVEL_DAYS_OF_ACCESS);
            Long value4 = field7 != null ? field7.getValue() : null;
            if (value4 == null || !(value4 instanceof Long)) {
                value4 = null;
            }
            Long l = value4;
            MoneyballData value5 = this.e.getLiveMoneyballData().getValue();
            return new C6890clo(str, str2, str3, actionField, actionField2, actionField3, l != null ? Integer.valueOf((int) l.longValue()) : null, value5 != null ? value5.flwssn : null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
