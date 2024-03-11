package com.netflix.mediaclient.acquisition.components.planInfo;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PlanInfoViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final MoneyballDataSource moneyballDataSource;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PlanInfoViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.moneyballDataSource = moneyballDataSource;
        this.stringProvider = stringProvider;
    }

    private final FlowMode getFlowMode() {
        return this.moneyballDataSource.getFlowMode();
    }

    public final PlanInfoParsedData extractChangePlanData() {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z3;
        String str5;
        String str6;
        String str7;
        String str8;
        Map<String, Object> data;
        List j;
        String d;
        Map<String, Object> data2;
        List j2;
        String d2;
        Map<String, Object> data3;
        List j3;
        String d3;
        Map<String, Object> data4;
        List j4;
        String d4;
        FlowMode flowMode = getFlowMode();
        boolean z4 = false;
        Object obj = null;
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.PLAN_OVERRIDEN_BY_GIFT_CODE);
            Object value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof Boolean)) {
                value = null;
            }
            z = C8632dsu.c(value, Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            FlowMode flowMode2 = getFlowMode();
            Field field2 = flowMode2 != null ? flowMode2.getField(SignupConstants.Field.GIFT_CODE_PLAN) : null;
            FlowMode flowMode3 = getFlowMode();
            if (flowMode3 != null) {
                SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
                Field field3 = flowMode3.getField(SignupConstants.Field.HAS_ELIGIBLE_OFFER);
                Object value2 = field3 != null ? field3.getValue() : null;
                if (value2 == null || !(value2 instanceof Boolean)) {
                    value2 = null;
                }
                z3 = C8632dsu.c(value2, Boolean.TRUE);
            } else {
                z3 = false;
            }
            FlowMode flowMode4 = getFlowMode();
            if (flowMode4 != null) {
                SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
                Field field4 = flowMode4.getField(SignupConstants.Field.OFFER_TYPE);
                String value3 = field4 != null ? field4.getValue() : null;
                if (value3 == null || !(value3 instanceof String)) {
                    value3 = null;
                }
                str5 = value3;
            } else {
                str5 = null;
            }
            if (field2 == null || (data4 = field2.getData()) == null) {
                str6 = null;
            } else {
                j4 = C8569dql.j(SignupConstants.Field.LOCALIZED_PLAN_NAME, "value");
                SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
                Object pathValue = KeyPathEvaluationKt.getPathValue((Object) data4, (List<String>) j4);
                d4 = C8576dqs.d(j4, ",", null, null, 0, null, null, 62, null);
                if (pathValue != null) {
                    if (!(pathValue instanceof String)) {
                        if (z) {
                            signupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, d4, null);
                        }
                    }
                    str6 = (String) pathValue;
                } else if (z) {
                    signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d4, null);
                }
                pathValue = null;
                str6 = (String) pathValue;
            }
            if (field2 == null || (data3 = field2.getData()) == null) {
                str7 = null;
            } else {
                j3 = C8569dql.j(SignupConstants.Field.PLAN_PRICE, "value");
                SignupErrorReporter signupErrorReporter2 = ((BaseViewModelInitializer) this).signupErrorReporter;
                Object pathValue2 = KeyPathEvaluationKt.getPathValue((Object) data3, (List<String>) j3);
                d3 = C8576dqs.d(j3, ",", null, null, 0, null, null, 62, null);
                if (pathValue2 != null) {
                    if (!(pathValue2 instanceof String)) {
                        if (z) {
                            signupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, d3, null);
                        }
                    }
                    str7 = (String) pathValue2;
                } else if (z) {
                    signupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d3, null);
                }
                pathValue2 = null;
                str7 = (String) pathValue2;
            }
            if (field2 == null || (data2 = field2.getData()) == null) {
                str8 = null;
            } else {
                j2 = C8569dql.j(SignupConstants.Field.BILLING_FREQUENCY, "value");
                SignupErrorReporter signupErrorReporter3 = ((BaseViewModelInitializer) this).signupErrorReporter;
                Object pathValue3 = KeyPathEvaluationKt.getPathValue((Object) data2, (List<String>) j2);
                d2 = C8576dqs.d(j2, ",", null, null, 0, null, null, 62, null);
                if (pathValue3 != null) {
                    if (!(pathValue3 instanceof String)) {
                        if (z) {
                            signupErrorReporter3.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, d2, null);
                        }
                    }
                    str8 = (String) pathValue3;
                } else if (z) {
                    signupErrorReporter3.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d2, null);
                }
                pathValue3 = null;
                str8 = (String) pathValue3;
            }
            if (field2 != null && (data = field2.getData()) != null) {
                j = C8569dql.j(SignupConstants.Field.IS_PRETAX, "value");
                SignupErrorReporter signupErrorReporter4 = ((BaseViewModelInitializer) this).signupErrorReporter;
                Object pathValue4 = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
                d = C8576dqs.d(j, ",", null, null, 0, null, null, 62, null);
                if (pathValue4 == null) {
                    if (z) {
                        signupErrorReporter4.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
                    }
                } else if (pathValue4 instanceof Boolean) {
                    obj = pathValue4;
                } else if (z) {
                    signupErrorReporter4.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, d, null);
                }
                z4 = C8632dsu.c(obj, Boolean.TRUE);
            }
            return new PlanInfoParsedData(z4, str8, str7, str6, z3, str5);
        }
        FlowMode flowMode5 = getFlowMode();
        OptionField selectedPlan$default = flowMode5 != null ? BaseViewModelInitializer.getSelectedPlan$default(this, flowMode5, false, 1, null) : null;
        FlowMode flowMode6 = getFlowMode();
        if (flowMode6 != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = flowMode6.getField(SignupConstants.Field.HAS_ELIGIBLE_OFFER);
            Object value4 = field5 != null ? field5.getValue() : null;
            if (value4 == null || !(value4 instanceof Boolean)) {
                value4 = null;
            }
            z2 = C8632dsu.c(value4, Boolean.TRUE);
        } else {
            z2 = false;
        }
        FlowMode flowMode7 = getFlowMode();
        if (flowMode7 != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = flowMode7.getField(SignupConstants.Field.OFFER_TYPE);
            String value5 = field6 != null ? field6.getValue() : null;
            if (value5 == null || !(value5 instanceof String)) {
                value5 = null;
            }
            str = value5;
        } else {
            str = null;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter unused6 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field7 = selectedPlan$default.getField(SignupConstants.Field.LOCALIZED_PLAN_NAME);
            String value6 = field7 != null ? field7.getValue() : null;
            if (value6 == null || !(value6 instanceof String)) {
                value6 = null;
            }
            str2 = value6;
        } else {
            str2 = null;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter unused7 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field8 = selectedPlan$default.getField(SignupConstants.Field.PLAN_PRICE);
            String value7 = field8 != null ? field8.getValue() : null;
            if (value7 == null || !(value7 instanceof String)) {
                value7 = null;
            }
            str3 = value7;
        } else {
            str3 = null;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter unused8 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field9 = selectedPlan$default.getField(SignupConstants.Field.BILLING_FREQUENCY);
            String value8 = field9 != null ? field9.getValue() : null;
            if (value8 == null || !(value8 instanceof String)) {
                value8 = null;
            }
            str4 = value8;
        } else {
            str4 = null;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter unused9 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field10 = selectedPlan$default.getField(SignupConstants.Field.IS_PRETAX);
            Object value9 = field10 != null ? field10.getValue() : null;
            if (value9 != null && (value9 instanceof Boolean)) {
                obj = value9;
            }
            z4 = C8632dsu.c(obj, Boolean.TRUE);
        }
        return new PlanInfoParsedData(z4, str4, str3, str2, z2, str);
    }

    public final PlanInfoViewModel createChangePlanViewModel() {
        return new PlanInfoViewModel(this.stringProvider, extractChangePlanData());
    }
}
