package com.netflix.mediaclient.acquisition.components.koreaLegal;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.C8566dqi;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class KoreaCheckBoxesViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final FormCacheSynchronizerFactory formCacheSynchronizerFactory;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public KoreaCheckBoxesViewModelInitializer(FlowMode flowMode, StringProvider stringProvider, FormCacheSynchronizerFactory formCacheSynchronizerFactory, SignupErrorReporter signupErrorReporter) {
        super(signupErrorReporter);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) formCacheSynchronizerFactory, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.formCacheSynchronizerFactory = formCacheSynchronizerFactory;
    }

    private final Integer getSortOrder(BooleanField booleanField) {
        Map<String, Object> data;
        List e;
        if (booleanField == null || (data = booleanField.getData()) == null) {
            return null;
        }
        e = C8566dqi.e(SignupConstants.Field.SORT_ORDER);
        SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) e);
        C8576dqs.d(e, ",", null, null, 0, null, null, 62, null);
        if (pathValue == null || !(pathValue instanceof Long)) {
            pathValue = null;
        }
        Long l = (Long) pathValue;
        if (l != null) {
            return Integer.valueOf((int) l.longValue());
        }
        return null;
    }

    public final KoreaCheckBoxesParsedData extractKoreaCheckBoxesData(GetField getField, String str, BooleanField booleanField, BooleanField booleanField2, BooleanField booleanField3, BooleanField booleanField4, BooleanField booleanField5, FormCache formCache) {
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        BooleanField booleanField6;
        String str5;
        BooleanField booleanField7;
        BooleanField booleanField8;
        String str6;
        C8632dsu.c((Object) str, "");
        if (getField != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = getField.getField(SignupConstants.Field.TERMS_OF_USE_MINIMUM_VERIFICATION_AGE);
            String value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof String)) {
                value = null;
            }
            str2 = value;
        } else {
            str2 = null;
        }
        FlowMode flowMode = this.flowMode;
        OptionField selectedPlan$default = flowMode != null ? BaseViewModelInitializer.getSelectedPlan$default(this, flowMode, false, 1, null) : null;
        if (selectedPlan$default != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = selectedPlan$default.getField(SignupConstants.Field.BILLING_FREQUENCY);
            String value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null || !(value2 instanceof String)) {
                value2 = null;
            }
            str3 = value2;
        } else {
            str3 = null;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = selectedPlan$default.getField(SignupConstants.Field.PLAN_DURATION);
            String value3 = field3 != null ? field3.getValue() : null;
            if (value3 == null || !(value3 instanceof String)) {
                value3 = null;
            }
            str4 = value3;
        } else {
            str4 = null;
        }
        String str7 = str3 == null ? str4 : str3;
        Integer sortOrder = getSortOrder(booleanField);
        Integer sortOrder2 = getSortOrder(booleanField3);
        Integer sortOrder3 = getSortOrder(booleanField4);
        Integer sortOrder4 = getSortOrder(booleanField2);
        Integer sortOrder5 = getSortOrder(booleanField5);
        if (formCache != null) {
            Object readValue = formCache.readValue(str, SignupConstants.Field.TERMS_OF_USE);
            Boolean bool = Boolean.TRUE;
            boolean c = C8632dsu.c(readValue, bool);
            boolean c2 = C8632dsu.c(formCache.readValue(str, SignupConstants.Field.PERSONAL_INFO_THIRD_PARTIES), bool);
            num2 = sortOrder3;
            boolean c3 = C8632dsu.c(formCache.readValue(str, SignupConstants.Field.PERSONAL_INFO_ABROAD), bool);
            num = sortOrder2;
            boolean c4 = C8632dsu.c(formCache.readValue(str, SignupConstants.Field.PERSONAL_INFO_GATEWAY), bool);
            if (booleanField != null) {
                booleanField.setValue(Boolean.valueOf(c));
            }
            if (booleanField2 != null) {
                booleanField2.setValue(Boolean.valueOf(c2));
            }
            if (booleanField3 != null) {
                booleanField3.setValue(Boolean.valueOf(c3));
            }
            if (booleanField4 != null) {
                booleanField4.setValue(Boolean.valueOf(c4));
            }
        } else {
            num = sortOrder2;
            num2 = sortOrder3;
        }
        if (selectedPlan$default != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = selectedPlan$default.getField(SignupConstants.Field.PLAN_PRICE);
            Object value4 = field4 != null ? field4.getValue() : null;
            if (value4 == null) {
                str6 = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else if (value4 instanceof String) {
                booleanField6 = null;
                str5 = (String) value4;
            } else {
                str6 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
            }
            booleanField6 = null;
            signupErrorReporter.onDataError(str6, SignupConstants.Field.PLAN_PRICE, null);
            value4 = null;
            str5 = (String) value4;
        } else {
            booleanField6 = null;
            str5 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = getField.getField(SignupConstants.Field.HAS_ACCEPTED_TERMS_OF_USE);
            if (field5 == null || !(field5 instanceof BooleanField)) {
                field5 = booleanField6;
            }
            booleanField7 = (BooleanField) field5;
        } else {
            booleanField7 = booleanField6;
        }
        if (getField != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field6 = getField.getField(SignupConstants.Field.TERMS_OF_USE);
            booleanField8 = (field6 != null && (field6 instanceof BooleanField)) ? field6 : booleanField6;
        } else {
            booleanField8 = booleanField6;
        }
        return new KoreaCheckBoxesParsedData(str5, str7, sortOrder, num, num2, sortOrder4, sortOrder5, str2, booleanField7, booleanField8);
    }

    public final KoreaCheckBoxesViewModel createKoreaCheckBoxesViewModel(GetField getField, String str, FormCache formCache) {
        BooleanField booleanField;
        BooleanField booleanField2;
        BooleanField booleanField3;
        BooleanField booleanField4;
        BooleanField booleanField5;
        C8632dsu.c((Object) str, "");
        if (getField != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = getField.getField(SignupConstants.Field.TERMS_OF_USE);
            booleanField = (BooleanField) ((field == null || !(field instanceof BooleanField)) ? null : null);
        } else {
            booleanField = null;
        }
        if (getField != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = getField.getField(SignupConstants.Field.PERSONAL_INFO_THIRD_PARTIES);
            booleanField2 = (BooleanField) ((field2 == null || !(field2 instanceof BooleanField)) ? null : null);
        } else {
            booleanField2 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused3 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field3 = getField.getField(SignupConstants.Field.PERSONAL_INFO_ABROAD);
            booleanField3 = (BooleanField) ((field3 == null || !(field3 instanceof BooleanField)) ? null : null);
        } else {
            booleanField3 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused4 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field4 = getField.getField(SignupConstants.Field.PERSONAL_INFO_GATEWAY);
            booleanField4 = (BooleanField) ((field4 == null || !(field4 instanceof BooleanField)) ? null : null);
        } else {
            booleanField4 = null;
        }
        if (getField != null) {
            SignupErrorReporter unused5 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field5 = getField.getField(SignupConstants.Field.CANCEL_MEMBERSHIP_ANYTIME);
            booleanField5 = (BooleanField) ((field5 == null || !(field5 instanceof BooleanField)) ? null : null);
        } else {
            booleanField5 = null;
        }
        BooleanField booleanField6 = booleanField5;
        return new KoreaCheckBoxesViewModel(this.stringProvider, extractKoreaCheckBoxesData(getField, str, booleanField, booleanField2, booleanField3, booleanField4, booleanField5, formCache), booleanField != null ? new BooleanViewModel(booleanField, this.formCacheSynchronizerFactory.createFormCacheSynchronizer(str, booleanField)) : null, booleanField3 != null ? new BooleanViewModel(booleanField3, this.formCacheSynchronizerFactory.createFormCacheSynchronizer(str, booleanField3)) : null, booleanField4 != null ? new BooleanViewModel(booleanField4, this.formCacheSynchronizerFactory.createFormCacheSynchronizer(str, booleanField4)) : null, booleanField2 != null ? new BooleanViewModel(booleanField2, this.formCacheSynchronizerFactory.createFormCacheSynchronizer(str, booleanField2)) : null, booleanField6 != null ? new BooleanViewModel(booleanField6, this.formCacheSynchronizerFactory.createFormCacheSynchronizer(str, booleanField6)) : null);
    }
}
