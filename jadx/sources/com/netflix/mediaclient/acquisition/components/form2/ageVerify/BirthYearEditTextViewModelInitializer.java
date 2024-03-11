package com.netflix.mediaclient.acquisition.components.form2.ageVerify;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.components.form2.NumberViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class BirthYearEditTextViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final FormCacheSynchronizerFactory formCacheSynchronizerFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BirthYearEditTextViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, FormCacheSynchronizerFactory formCacheSynchronizerFactory) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) formCacheSynchronizerFactory, "");
        this.flowMode = flowMode;
        this.formCacheSynchronizerFactory = formCacheSynchronizerFactory;
    }

    public final NumberViewModel createBirthYearViewModel() {
        NumberField numberField;
        FlowMode flowMode = this.flowMode;
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.BIRTH_YEAR);
            if (field == null || !(field instanceof NumberField)) {
                field = null;
            }
            numberField = (NumberField) field;
        } else {
            numberField = null;
        }
        if (numberField != null) {
            return new NumberViewModel(numberField, this.formCacheSynchronizerFactory.createFormCacheSynchronizer("verifyAge", numberField));
        }
        return null;
    }
}
