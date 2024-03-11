package com.netflix.mediaclient.acquisition.screens.registration;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegistrationParsedData {
    public static final int $stable = 8;
    private final String initialEmail;
    private final boolean isReadOnly;
    private final BooleanField pipcConsent;
    private final ActionField registerAction;
    private final String registerCtaKey;
    private final String subtitleRegSubtitleKey;
    private final String subtitleValuePropKey;
    private final String subtitleValuePropSecondaryKey;
    private final String titleKey;

    public final ActionField component1() {
        return this.registerAction;
    }

    public final String component2() {
        return this.titleKey;
    }

    public final String component3() {
        return this.registerCtaKey;
    }

    public final boolean component4() {
        return this.isReadOnly;
    }

    public final String component5() {
        return this.initialEmail;
    }

    public final String component6() {
        return this.subtitleRegSubtitleKey;
    }

    public final String component7() {
        return this.subtitleValuePropKey;
    }

    public final String component8() {
        return this.subtitleValuePropSecondaryKey;
    }

    public final BooleanField component9() {
        return this.pipcConsent;
    }

    public final RegistrationParsedData copy(ActionField actionField, String str, String str2, boolean z, String str3, String str4, String str5, String str6, BooleanField booleanField) {
        return new RegistrationParsedData(actionField, str, str2, z, str3, str4, str5, str6, booleanField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegistrationParsedData) {
            RegistrationParsedData registrationParsedData = (RegistrationParsedData) obj;
            return C8632dsu.c(this.registerAction, registrationParsedData.registerAction) && C8632dsu.c((Object) this.titleKey, (Object) registrationParsedData.titleKey) && C8632dsu.c((Object) this.registerCtaKey, (Object) registrationParsedData.registerCtaKey) && this.isReadOnly == registrationParsedData.isReadOnly && C8632dsu.c((Object) this.initialEmail, (Object) registrationParsedData.initialEmail) && C8632dsu.c((Object) this.subtitleRegSubtitleKey, (Object) registrationParsedData.subtitleRegSubtitleKey) && C8632dsu.c((Object) this.subtitleValuePropKey, (Object) registrationParsedData.subtitleValuePropKey) && C8632dsu.c((Object) this.subtitleValuePropSecondaryKey, (Object) registrationParsedData.subtitleValuePropSecondaryKey) && C8632dsu.c(this.pipcConsent, registrationParsedData.pipcConsent);
        }
        return false;
    }

    public final String getInitialEmail() {
        return this.initialEmail;
    }

    public final BooleanField getPipcConsent() {
        return this.pipcConsent;
    }

    public final ActionField getRegisterAction() {
        return this.registerAction;
    }

    public final String getRegisterCtaKey() {
        return this.registerCtaKey;
    }

    public final String getSubtitleRegSubtitleKey() {
        return this.subtitleRegSubtitleKey;
    }

    public final String getSubtitleValuePropKey() {
        return this.subtitleValuePropKey;
    }

    public final String getSubtitleValuePropSecondaryKey() {
        return this.subtitleValuePropSecondaryKey;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public int hashCode() {
        ActionField actionField = this.registerAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        String str = this.titleKey;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.registerCtaKey;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = Boolean.hashCode(this.isReadOnly);
        String str3 = this.initialEmail;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subtitleRegSubtitleKey;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subtitleValuePropKey;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subtitleValuePropSecondaryKey;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        BooleanField booleanField = this.pipcConsent;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (booleanField != null ? booleanField.hashCode() : 0);
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public String toString() {
        ActionField actionField = this.registerAction;
        String str = this.titleKey;
        String str2 = this.registerCtaKey;
        boolean z = this.isReadOnly;
        String str3 = this.initialEmail;
        String str4 = this.subtitleRegSubtitleKey;
        String str5 = this.subtitleValuePropKey;
        String str6 = this.subtitleValuePropSecondaryKey;
        BooleanField booleanField = this.pipcConsent;
        return "RegistrationParsedData(registerAction=" + actionField + ", titleKey=" + str + ", registerCtaKey=" + str2 + ", isReadOnly=" + z + ", initialEmail=" + str3 + ", subtitleRegSubtitleKey=" + str4 + ", subtitleValuePropKey=" + str5 + ", subtitleValuePropSecondaryKey=" + str6 + ", pipcConsent=" + booleanField + ")";
    }

    public RegistrationParsedData(ActionField actionField, String str, String str2, boolean z, String str3, String str4, String str5, String str6, BooleanField booleanField) {
        this.registerAction = actionField;
        this.titleKey = str;
        this.registerCtaKey = str2;
        this.isReadOnly = z;
        this.initialEmail = str3;
        this.subtitleRegSubtitleKey = str4;
        this.subtitleValuePropKey = str5;
        this.subtitleValuePropSecondaryKey = str6;
        this.pipcConsent = booleanField;
    }
}
