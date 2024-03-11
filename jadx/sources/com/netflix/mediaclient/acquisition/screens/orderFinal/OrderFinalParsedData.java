package com.netflix.mediaclient.acquisition.screens.orderFinal;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.StringField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OrderFinalParsedData {
    public static final int $stable = 8;
    private final String accountNumberDisplay;
    private final String address;
    private final String cardType;
    private final ActionField continueAction;
    private final StringField countryIsoCode;
    private final String email;
    private final String firstName;
    private final String giftAmount;
    private final boolean hasLcfmOffer;
    private final String lastName;
    private final String localizedPlanName;
    private final StringField mobilePhone;
    private final String mopType;
    private final String planBillingFrequency;
    private final String planPrice;
    private final String refundDaysRemaining;
    private final BooleanField smsConsent;
    private final String userMessage;

    public final ActionField component1() {
        return this.continueAction;
    }

    public final String component10() {
        return this.accountNumberDisplay;
    }

    public final String component11() {
        return this.cardType;
    }

    public final StringField component12() {
        return this.countryIsoCode;
    }

    public final StringField component13() {
        return this.mobilePhone;
    }

    public final String component14() {
        return this.mopType;
    }

    public final String component15() {
        return this.firstName;
    }

    public final String component16() {
        return this.lastName;
    }

    public final String component17() {
        return this.address;
    }

    public final BooleanField component18() {
        return this.smsConsent;
    }

    public final String component2() {
        return this.refundDaysRemaining;
    }

    public final boolean component3() {
        return this.hasLcfmOffer;
    }

    public final String component4() {
        return this.planPrice;
    }

    public final String component5() {
        return this.giftAmount;
    }

    public final String component6() {
        return this.planBillingFrequency;
    }

    public final String component7() {
        return this.userMessage;
    }

    public final String component8() {
        return this.email;
    }

    public final String component9() {
        return this.localizedPlanName;
    }

    public final OrderFinalParsedData copy(ActionField actionField, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StringField stringField, StringField stringField2, String str10, String str11, String str12, String str13, BooleanField booleanField) {
        return new OrderFinalParsedData(actionField, str, z, str2, str3, str4, str5, str6, str7, str8, str9, stringField, stringField2, str10, str11, str12, str13, booleanField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderFinalParsedData) {
            OrderFinalParsedData orderFinalParsedData = (OrderFinalParsedData) obj;
            return C8632dsu.c(this.continueAction, orderFinalParsedData.continueAction) && C8632dsu.c((Object) this.refundDaysRemaining, (Object) orderFinalParsedData.refundDaysRemaining) && this.hasLcfmOffer == orderFinalParsedData.hasLcfmOffer && C8632dsu.c((Object) this.planPrice, (Object) orderFinalParsedData.planPrice) && C8632dsu.c((Object) this.giftAmount, (Object) orderFinalParsedData.giftAmount) && C8632dsu.c((Object) this.planBillingFrequency, (Object) orderFinalParsedData.planBillingFrequency) && C8632dsu.c((Object) this.userMessage, (Object) orderFinalParsedData.userMessage) && C8632dsu.c((Object) this.email, (Object) orderFinalParsedData.email) && C8632dsu.c((Object) this.localizedPlanName, (Object) orderFinalParsedData.localizedPlanName) && C8632dsu.c((Object) this.accountNumberDisplay, (Object) orderFinalParsedData.accountNumberDisplay) && C8632dsu.c((Object) this.cardType, (Object) orderFinalParsedData.cardType) && C8632dsu.c(this.countryIsoCode, orderFinalParsedData.countryIsoCode) && C8632dsu.c(this.mobilePhone, orderFinalParsedData.mobilePhone) && C8632dsu.c((Object) this.mopType, (Object) orderFinalParsedData.mopType) && C8632dsu.c((Object) this.firstName, (Object) orderFinalParsedData.firstName) && C8632dsu.c((Object) this.lastName, (Object) orderFinalParsedData.lastName) && C8632dsu.c((Object) this.address, (Object) orderFinalParsedData.address) && C8632dsu.c(this.smsConsent, orderFinalParsedData.smsConsent);
        }
        return false;
    }

    public final String getAccountNumberDisplay() {
        return this.accountNumberDisplay;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final ActionField getContinueAction() {
        return this.continueAction;
    }

    public final StringField getCountryIsoCode() {
        return this.countryIsoCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final boolean getHasLcfmOffer() {
        return this.hasLcfmOffer;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLocalizedPlanName() {
        return this.localizedPlanName;
    }

    public final StringField getMobilePhone() {
        return this.mobilePhone;
    }

    public final String getMopType() {
        return this.mopType;
    }

    public final String getPlanBillingFrequency() {
        return this.planBillingFrequency;
    }

    public final String getPlanPrice() {
        return this.planPrice;
    }

    public final String getRefundDaysRemaining() {
        return this.refundDaysRemaining;
    }

    public final BooleanField getSmsConsent() {
        return this.smsConsent;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        ActionField actionField = this.continueAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        String str = this.refundDaysRemaining;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = Boolean.hashCode(this.hasLcfmOffer);
        String str2 = this.planPrice;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.giftAmount;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.planBillingFrequency;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.userMessage;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.email;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.localizedPlanName;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.accountNumberDisplay;
        int hashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cardType;
        int hashCode11 = str9 == null ? 0 : str9.hashCode();
        StringField stringField = this.countryIsoCode;
        int hashCode12 = stringField == null ? 0 : stringField.hashCode();
        StringField stringField2 = this.mobilePhone;
        int hashCode13 = stringField2 == null ? 0 : stringField2.hashCode();
        String str10 = this.mopType;
        int hashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.firstName;
        int hashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.lastName;
        int hashCode16 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.address;
        int hashCode17 = str13 == null ? 0 : str13.hashCode();
        BooleanField booleanField = this.smsConsent;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + (booleanField == null ? 0 : booleanField.hashCode());
    }

    public String toString() {
        ActionField actionField = this.continueAction;
        String str = this.refundDaysRemaining;
        boolean z = this.hasLcfmOffer;
        String str2 = this.planPrice;
        String str3 = this.giftAmount;
        String str4 = this.planBillingFrequency;
        String str5 = this.userMessage;
        String str6 = this.email;
        String str7 = this.localizedPlanName;
        String str8 = this.accountNumberDisplay;
        String str9 = this.cardType;
        StringField stringField = this.countryIsoCode;
        StringField stringField2 = this.mobilePhone;
        String str10 = this.mopType;
        String str11 = this.firstName;
        String str12 = this.lastName;
        String str13 = this.address;
        BooleanField booleanField = this.smsConsent;
        return "OrderFinalParsedData(continueAction=" + actionField + ", refundDaysRemaining=" + str + ", hasLcfmOffer=" + z + ", planPrice=" + str2 + ", giftAmount=" + str3 + ", planBillingFrequency=" + str4 + ", userMessage=" + str5 + ", email=" + str6 + ", localizedPlanName=" + str7 + ", accountNumberDisplay=" + str8 + ", cardType=" + str9 + ", countryIsoCode=" + stringField + ", mobilePhone=" + stringField2 + ", mopType=" + str10 + ", firstName=" + str11 + ", lastName=" + str12 + ", address=" + str13 + ", smsConsent=" + booleanField + ")";
    }

    public OrderFinalParsedData(ActionField actionField, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StringField stringField, StringField stringField2, String str10, String str11, String str12, String str13, BooleanField booleanField) {
        this.continueAction = actionField;
        this.refundDaysRemaining = str;
        this.hasLcfmOffer = z;
        this.planPrice = str2;
        this.giftAmount = str3;
        this.planBillingFrequency = str4;
        this.userMessage = str5;
        this.email = str6;
        this.localizedPlanName = str7;
        this.accountNumberDisplay = str8;
        this.cardType = str9;
        this.countryIsoCode = stringField;
        this.mobilePhone = stringField2;
        this.mopType = str10;
        this.firstName = str11;
        this.lastName = str12;
        this.address = str13;
        this.smsConsent = booleanField;
    }
}
