package o;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* renamed from: o.ckl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6834ckl extends BaseViewModelInitializer {
    private final MoneyballDataSource e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6834ckl(SignupErrorReporter signupErrorReporter, MoneyballDataSource moneyballDataSource) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.e = moneyballDataSource;
    }

    public final C6831cki b() {
        List j;
        String str;
        String str2;
        String str3;
        List j2;
        List j3;
        List j4;
        FlowMode flowMode = this.e.getFlowMode();
        if (flowMode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Map<String, Object> data = flowMode.getData();
        j = C8569dql.j("fields", SignupConstants.Field.OWNER_HOUSEHOLDER_SUMMARY, "value", "fields");
        SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
        C8576dqs.d(j, ",", null, null, 0, null, null, 62, null);
        String str4 = null;
        if (pathValue == null || !dsH.f(pathValue)) {
            pathValue = null;
        }
        Map map = (Map) pathValue;
        if (map != null) {
            j4 = C8569dql.j(SignupConstants.Field.LAST_USED_DEVICE_NAME, "value");
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Object pathValue2 = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) j4);
            C8576dqs.d(j4, ",", null, null, 0, null, null, 62, null);
            if (pathValue2 == null || !(pathValue2 instanceof String)) {
                pathValue2 = null;
            }
            str = (String) pathValue2;
        } else {
            str = null;
        }
        if (map != null) {
            j3 = C8569dql.j(SignupConstants.Field.LAST_USED_PROFILE_NAME, "value");
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Object pathValue3 = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) j3);
            C8576dqs.d(j3, ",", null, null, 0, null, null, 62, null);
            if (pathValue3 == null || !(pathValue3 instanceof String)) {
                pathValue3 = null;
            }
            str2 = (String) pathValue3;
        } else {
            str2 = null;
        }
        if (map != null) {
            j2 = C8569dql.j(SignupConstants.Field.FORMATTED_LOCATION_NAME, "value");
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Object pathValue4 = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) j2);
            C8576dqs.d(j2, ",", null, null, 0, null, null, 62, null);
            if (pathValue4 == null || !(pathValue4 instanceof String)) {
                pathValue4 = null;
            }
            str3 = (String) pathValue4;
        } else {
            str3 = null;
        }
        SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
        Field field = flowMode.getField(SignupConstants.Field.OWNER_HOUSEHOLD_PROFILE_ICON_URL);
        Object value = field != null ? field.getValue() : null;
        if (value != null && (value instanceof String)) {
            str4 = value;
        }
        return new C6831cki(str, str2, str4, str3);
    }
}
