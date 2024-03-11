package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LearnMoreConfirm55548ParsedData {
    public static final int $stable = 8;
    private final String copySignUpUrl;
    private final StringField countryCodeField;
    private final String displayPhoneNumber;
    private final String displaySignUpUrl;
    private final String email;
    private final ActionField goToNonMemberHomeAction;
    private final boolean isRecognizedFormerMember;
    private final StringField phoneNumberField;
    private final boolean recentlyRegistered;
    private final boolean showOpenEmailClientButton;
    private final boolean showOpenEmailClientLink;
    private final boolean showPlanUnavailableDialog;
    private final ActionField textSignUpLinkAction;
    private final String theme;

    public final boolean component1() {
        return this.isRecognizedFormerMember;
    }

    public final StringField component10() {
        return this.phoneNumberField;
    }

    public final StringField component11() {
        return this.countryCodeField;
    }

    public final String component12() {
        return this.displayPhoneNumber;
    }

    public final ActionField component13() {
        return this.goToNonMemberHomeAction;
    }

    public final String component14() {
        return this.theme;
    }

    public final String component2() {
        return this.email;
    }

    public final boolean component3() {
        return this.recentlyRegistered;
    }

    public final boolean component4() {
        return this.showPlanUnavailableDialog;
    }

    public final boolean component5() {
        return this.showOpenEmailClientButton;
    }

    public final String component6() {
        return this.copySignUpUrl;
    }

    public final String component7() {
        return this.displaySignUpUrl;
    }

    public final boolean component8() {
        return this.showOpenEmailClientLink;
    }

    public final ActionField component9() {
        return this.textSignUpLinkAction;
    }

    public final LearnMoreConfirm55548ParsedData copy(boolean z, String str, boolean z2, boolean z3, boolean z4, String str2, String str3, boolean z5, ActionField actionField, StringField stringField, StringField stringField2, String str4, ActionField actionField2, String str5) {
        return new LearnMoreConfirm55548ParsedData(z, str, z2, z3, z4, str2, str3, z5, actionField, stringField, stringField2, str4, actionField2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LearnMoreConfirm55548ParsedData) {
            LearnMoreConfirm55548ParsedData learnMoreConfirm55548ParsedData = (LearnMoreConfirm55548ParsedData) obj;
            return this.isRecognizedFormerMember == learnMoreConfirm55548ParsedData.isRecognizedFormerMember && C8632dsu.c((Object) this.email, (Object) learnMoreConfirm55548ParsedData.email) && this.recentlyRegistered == learnMoreConfirm55548ParsedData.recentlyRegistered && this.showPlanUnavailableDialog == learnMoreConfirm55548ParsedData.showPlanUnavailableDialog && this.showOpenEmailClientButton == learnMoreConfirm55548ParsedData.showOpenEmailClientButton && C8632dsu.c((Object) this.copySignUpUrl, (Object) learnMoreConfirm55548ParsedData.copySignUpUrl) && C8632dsu.c((Object) this.displaySignUpUrl, (Object) learnMoreConfirm55548ParsedData.displaySignUpUrl) && this.showOpenEmailClientLink == learnMoreConfirm55548ParsedData.showOpenEmailClientLink && C8632dsu.c(this.textSignUpLinkAction, learnMoreConfirm55548ParsedData.textSignUpLinkAction) && C8632dsu.c(this.phoneNumberField, learnMoreConfirm55548ParsedData.phoneNumberField) && C8632dsu.c(this.countryCodeField, learnMoreConfirm55548ParsedData.countryCodeField) && C8632dsu.c((Object) this.displayPhoneNumber, (Object) learnMoreConfirm55548ParsedData.displayPhoneNumber) && C8632dsu.c(this.goToNonMemberHomeAction, learnMoreConfirm55548ParsedData.goToNonMemberHomeAction) && C8632dsu.c((Object) this.theme, (Object) learnMoreConfirm55548ParsedData.theme);
        }
        return false;
    }

    public final String getCopySignUpUrl() {
        return this.copySignUpUrl;
    }

    public final StringField getCountryCodeField() {
        return this.countryCodeField;
    }

    public final String getDisplayPhoneNumber() {
        return this.displayPhoneNumber;
    }

    public final String getDisplaySignUpUrl() {
        return this.displaySignUpUrl;
    }

    public final String getEmail() {
        return this.email;
    }

    public final ActionField getGoToNonMemberHomeAction() {
        return this.goToNonMemberHomeAction;
    }

    public final StringField getPhoneNumberField() {
        return this.phoneNumberField;
    }

    public final boolean getRecentlyRegistered() {
        return this.recentlyRegistered;
    }

    public final boolean getShowOpenEmailClientButton() {
        return this.showOpenEmailClientButton;
    }

    public final boolean getShowOpenEmailClientLink() {
        return this.showOpenEmailClientLink;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public final ActionField getTextSignUpLinkAction() {
        return this.textSignUpLinkAction;
    }

    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRecognizedFormerMember);
        String str = this.email;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = Boolean.hashCode(this.recentlyRegistered);
        int hashCode4 = Boolean.hashCode(this.showPlanUnavailableDialog);
        int hashCode5 = Boolean.hashCode(this.showOpenEmailClientButton);
        String str2 = this.copySignUpUrl;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.displaySignUpUrl;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        int hashCode8 = Boolean.hashCode(this.showOpenEmailClientLink);
        ActionField actionField = this.textSignUpLinkAction;
        int hashCode9 = actionField == null ? 0 : actionField.hashCode();
        StringField stringField = this.phoneNumberField;
        int hashCode10 = stringField == null ? 0 : stringField.hashCode();
        StringField stringField2 = this.countryCodeField;
        int hashCode11 = stringField2 == null ? 0 : stringField2.hashCode();
        String str4 = this.displayPhoneNumber;
        int hashCode12 = str4 == null ? 0 : str4.hashCode();
        ActionField actionField2 = this.goToNonMemberHomeAction;
        int hashCode13 = actionField2 == null ? 0 : actionField2.hashCode();
        String str5 = this.theme;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    public String toString() {
        boolean z = this.isRecognizedFormerMember;
        String str = this.email;
        boolean z2 = this.recentlyRegistered;
        boolean z3 = this.showPlanUnavailableDialog;
        boolean z4 = this.showOpenEmailClientButton;
        String str2 = this.copySignUpUrl;
        String str3 = this.displaySignUpUrl;
        boolean z5 = this.showOpenEmailClientLink;
        ActionField actionField = this.textSignUpLinkAction;
        StringField stringField = this.phoneNumberField;
        StringField stringField2 = this.countryCodeField;
        String str4 = this.displayPhoneNumber;
        ActionField actionField2 = this.goToNonMemberHomeAction;
        String str5 = this.theme;
        return "LearnMoreConfirm55548ParsedData(isRecognizedFormerMember=" + z + ", email=" + str + ", recentlyRegistered=" + z2 + ", showPlanUnavailableDialog=" + z3 + ", showOpenEmailClientButton=" + z4 + ", copySignUpUrl=" + str2 + ", displaySignUpUrl=" + str3 + ", showOpenEmailClientLink=" + z5 + ", textSignUpLinkAction=" + actionField + ", phoneNumberField=" + stringField + ", countryCodeField=" + stringField2 + ", displayPhoneNumber=" + str4 + ", goToNonMemberHomeAction=" + actionField2 + ", theme=" + str5 + ")";
    }

    public LearnMoreConfirm55548ParsedData(boolean z, String str, boolean z2, boolean z3, boolean z4, String str2, String str3, boolean z5, ActionField actionField, StringField stringField, StringField stringField2, String str4, ActionField actionField2, String str5) {
        this.isRecognizedFormerMember = z;
        this.email = str;
        this.recentlyRegistered = z2;
        this.showPlanUnavailableDialog = z3;
        this.showOpenEmailClientButton = z4;
        this.copySignUpUrl = str2;
        this.displaySignUpUrl = str3;
        this.showOpenEmailClientLink = z5;
        this.textSignUpLinkAction = actionField;
        this.phoneNumberField = stringField;
        this.countryCodeField = stringField2;
        this.displayPhoneNumber = str4;
        this.goToNonMemberHomeAction = actionField2;
        this.theme = str5;
    }
}
