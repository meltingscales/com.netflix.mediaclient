package com.netflix.mediaclient.acquisition.screens.registration;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class EmailPreferenceViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public EmailPreferenceViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
    }

    public final EmailPreferenceParsedData extractEmailPreferenceParsedData() {
        BooleanField booleanField;
        FlowMode flowMode = this.flowMode;
        String str = null;
        if (flowMode != null) {
            SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field = flowMode.getField(SignupConstants.Field.EMAIL_PREFERENCE);
            if (field == null || !(field instanceof BooleanField)) {
                field = null;
            }
            booleanField = (BooleanField) field;
        } else {
            booleanField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter unused2 = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode2.getField(SignupConstants.Field.EMAIL_CONSENT_LABEL_ID);
            Object value = field2 != null ? field2.getValue() : null;
            if (value != null && (value instanceof String)) {
                str = value;
            }
            str = str;
        }
        return new EmailPreferenceParsedData(booleanField, str);
    }

    public final EmailPreferenceViewModel createEmailPreferenceViewModel() {
        return new EmailPreferenceViewModel(this.stringProvider, extractEmailPreferenceParsedData());
    }
}
