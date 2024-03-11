package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;

/* renamed from: o.cky  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6847cky extends BaseViewModelInitializer {
    private final MoneyballDataSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6847cky(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.c = moneyballDataSource;
    }

    public final C6839ckq d() {
        FlowMode flowMode = this.c.getFlowMode();
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Action.JOIN_NOW);
            if (field == null || !(field instanceof ActionField)) {
                field = null;
            }
            ActionField actionField = (ActionField) field;
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(SignupConstants.Action.BACK_ACTION);
            if (field2 == null || !(field2 instanceof ActionField)) {
                field2 = null;
            }
            ActionField actionField2 = (ActionField) field2;
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = flowMode.getField(SignupConstants.Field.NEXT_NUDGE_HOURS);
            Long value = field3 != null ? field3.getValue() : null;
            if (value == null || !(value instanceof Long)) {
                value = null;
            }
            Long l = value;
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = flowMode.getField("errorCode");
            String value2 = field4 != null ? field4.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            String str = value2;
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode.getField(SignupConstants.Field.EXPIRY_IN_MINUTES);
            Long value3 = field5 != null ? field5.getValue() : null;
            if (value3 == null || !(value3 instanceof Long)) {
                value3 = null;
            }
            Long l2 = value3;
            return new C6839ckq(actionField, actionField2, str, l != null ? Integer.valueOf((int) l.longValue()) : null, l2 != null ? Integer.valueOf((int) l2.longValue()) : null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
