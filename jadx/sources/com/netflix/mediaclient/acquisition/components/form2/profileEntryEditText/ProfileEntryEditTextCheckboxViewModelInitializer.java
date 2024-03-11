package com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ProfileEntryEditTextCheckboxViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final StringProvider stringProvider;

    public final StringProvider getStringProvider() {
        return this.stringProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ProfileEntryEditTextCheckboxViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
    }

    public final ProfileEntryEditTextCheckboxViewModel extractProfileEntryEditTextCheckboxViewModel(String str, String str2) {
        StringField stringField;
        BooleanField booleanField;
        FlowMode flowMode;
        String str3;
        C8632dsu.c((Object) str, "");
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode2.getField(str);
            if (field == null) {
                str3 = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else {
                if (!(field instanceof StringField)) {
                    str3 = SignupConstants.Error.DATA_MANIPULATION_ERROR;
                }
                stringField = (StringField) field;
            }
            signupErrorReporter.onDataError(str3, str, null);
            field = null;
            stringField = (StringField) field;
        } else {
            stringField = null;
        }
        if (str2 == null || (flowMode = this.flowMode) == null) {
            booleanField = null;
        } else {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(str2);
            if (field2 == null || !(field2 instanceof BooleanField)) {
                field2 = null;
            }
            booleanField = (BooleanField) field2;
        }
        if (stringField != null) {
            return new ProfileEntryEditTextCheckboxViewModel(stringField, booleanField, this.stringProvider);
        }
        return null;
    }
}
