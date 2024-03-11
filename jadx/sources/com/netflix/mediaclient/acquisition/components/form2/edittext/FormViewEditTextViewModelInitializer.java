package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class FormViewEditTextViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final FormCacheSynchronizerFactory formCacheSynchronizerFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FormViewEditTextViewModelInitializer(FlowMode flowMode, FormCacheSynchronizerFactory formCacheSynchronizerFactory, SignupErrorReporter signupErrorReporter) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        this.flowMode = flowMode;
        this.formCacheSynchronizerFactory = formCacheSynchronizerFactory;
    }

    public static /* synthetic */ FormViewEditTextViewModel extractFormViewEditTextViewModel$default(FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer, String str, String str2, AppView appView, InputKind inputKind, boolean z, boolean z2, GetField getField, int i, Object obj) {
        if (obj == null) {
            return formViewEditTextViewModelInitializer.extractFormViewEditTextViewModel(str, str2, appView, inputKind, z, z2, (i & 64) != 0 ? null : getField);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extractFormViewEditTextViewModel");
    }

    public final FormViewEditTextViewModel extractFormViewEditTextViewModel(String str, String str2, AppView appView, InputKind inputKind, boolean z, boolean z2, GetField getField) {
        String str3;
        FormCacheSynchronizerFactory formCacheSynchronizerFactory;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) inputKind, "");
        if (getField == null) {
            getField = this.flowMode;
        }
        FieldValueChangeListener fieldValueChangeListener = null;
        if (getField != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = getField.getField(str2);
            if (field == null) {
                if (z2) {
                    str3 = SignupConstants.Error.MISSING_FIELD_ERROR;
                    signupErrorReporter.onDataError(str3, str2, null);
                }
                field = null;
            } else if (!(field instanceof StringField)) {
                if (z2) {
                    str3 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                    signupErrorReporter.onDataError(str3, str2, null);
                }
                field = null;
            }
            StringField stringField = (StringField) field;
            if (stringField != null) {
                if (z && (formCacheSynchronizerFactory = this.formCacheSynchronizerFactory) != null) {
                    fieldValueChangeListener = formCacheSynchronizerFactory.createFormCacheSynchronizer(str, stringField);
                }
                return new FormViewEditTextViewModelImpl(stringField, appView, inputKind, fieldValueChangeListener);
            }
            return null;
        }
        return null;
    }
}
