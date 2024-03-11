package com.netflix.mediaclient.acquisition.screens.registration;

import com.netflix.android.moneyball.fields.BooleanField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class EmailPreferenceParsedData {
    public static final int $stable = 8;
    private final BooleanField checkedField;
    private final String consentLabelId;

    public static /* synthetic */ EmailPreferenceParsedData copy$default(EmailPreferenceParsedData emailPreferenceParsedData, BooleanField booleanField, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            booleanField = emailPreferenceParsedData.checkedField;
        }
        if ((i & 2) != 0) {
            str = emailPreferenceParsedData.consentLabelId;
        }
        return emailPreferenceParsedData.copy(booleanField, str);
    }

    public final BooleanField component1() {
        return this.checkedField;
    }

    public final String component2() {
        return this.consentLabelId;
    }

    public final EmailPreferenceParsedData copy(BooleanField booleanField, String str) {
        return new EmailPreferenceParsedData(booleanField, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailPreferenceParsedData) {
            EmailPreferenceParsedData emailPreferenceParsedData = (EmailPreferenceParsedData) obj;
            return C8632dsu.c(this.checkedField, emailPreferenceParsedData.checkedField) && C8632dsu.c((Object) this.consentLabelId, (Object) emailPreferenceParsedData.consentLabelId);
        }
        return false;
    }

    public final BooleanField getCheckedField() {
        return this.checkedField;
    }

    public final String getConsentLabelId() {
        return this.consentLabelId;
    }

    public int hashCode() {
        BooleanField booleanField = this.checkedField;
        int hashCode = booleanField == null ? 0 : booleanField.hashCode();
        String str = this.consentLabelId;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        BooleanField booleanField = this.checkedField;
        String str = this.consentLabelId;
        return "EmailPreferenceParsedData(checkedField=" + booleanField + ", consentLabelId=" + str + ")";
    }

    public EmailPreferenceParsedData(BooleanField booleanField, String str) {
        this.checkedField = booleanField;
        this.consentLabelId = str;
    }
}
