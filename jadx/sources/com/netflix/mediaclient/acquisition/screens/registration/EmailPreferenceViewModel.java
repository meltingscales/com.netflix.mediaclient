package com.netflix.mediaclient.acquisition.screens.registration;

import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class EmailPreferenceViewModel {
    public static final String EMAIL_CONSENT_KEY = "email_consent_opt_in";
    private final EmailPreferenceParsedData emailPreferenceParsedData;
    private final boolean isVisible;
    private final String userFacingString;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final String getUserFacingString() {
        return this.userFacingString;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public EmailPreferenceViewModel(StringProvider stringProvider, EmailPreferenceParsedData emailPreferenceParsedData) {
        String string;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) emailPreferenceParsedData, "");
        this.emailPreferenceParsedData = emailPreferenceParsedData;
        this.isVisible = emailPreferenceParsedData.getCheckedField() != null;
        if (C8632dsu.c((Object) EMAIL_CONSENT_KEY, (Object) emailPreferenceParsedData.getConsentLabelId())) {
            string = stringProvider.getString(R.string.label_email_consent_opt_in);
        } else {
            string = stringProvider.getString(R.string.label_email_consent_opt_out);
        }
        this.userFacingString = string;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ void getEMAIL_CONSENT_KEY$annotations() {
        }

        private Companion() {
        }
    }

    public final void setChecked(boolean z) {
        BooleanField checkedField = this.emailPreferenceParsedData.getCheckedField();
        if (checkedField == null) {
            return;
        }
        checkedField.setValue(Boolean.valueOf(z));
    }

    public final boolean isChecked() {
        BooleanField checkedField = this.emailPreferenceParsedData.getCheckedField();
        return C8632dsu.c(checkedField != null ? checkedField.getValue() : null, Boolean.TRUE);
    }
}
