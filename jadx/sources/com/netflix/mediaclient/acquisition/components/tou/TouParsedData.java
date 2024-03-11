package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.android.moneyball.fields.BooleanField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TouParsedData {
    public static final int $stable = 8;
    private final String billingFrequency;
    private final String cashPaymentProvider;
    private final String cashPaymentProviderBrandName;
    private final BooleanField hasAcceptedTermsOfUse;
    private final boolean isPreTax;
    private final String minAge;
    private final String price;
    private final String region;
    private final BooleanField rightOfWithdrawal;
    private final boolean showCardChainingDisclosureText;
    private final boolean showInternationalTransactionMessage;
    private final boolean showMandateModificationTermOfUse;
    private final boolean showSchufaText;

    public final BooleanField component1() {
        return this.hasAcceptedTermsOfUse;
    }

    public final boolean component10() {
        return this.showMandateModificationTermOfUse;
    }

    public final BooleanField component11() {
        return this.rightOfWithdrawal;
    }

    public final String component12() {
        return this.billingFrequency;
    }

    public final boolean component13() {
        return this.isPreTax;
    }

    public final String component2() {
        return this.region;
    }

    public final String component3() {
        return this.minAge;
    }

    public final String component4() {
        return this.price;
    }

    public final String component5() {
        return this.cashPaymentProvider;
    }

    public final String component6() {
        return this.cashPaymentProviderBrandName;
    }

    public final boolean component7() {
        return this.showInternationalTransactionMessage;
    }

    public final boolean component8() {
        return this.showSchufaText;
    }

    public final boolean component9() {
        return this.showCardChainingDisclosureText;
    }

    public final TouParsedData copy(BooleanField booleanField, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, BooleanField booleanField2, String str6, boolean z5) {
        return new TouParsedData(booleanField, str, str2, str3, str4, str5, z, z2, z3, z4, booleanField2, str6, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TouParsedData) {
            TouParsedData touParsedData = (TouParsedData) obj;
            return C8632dsu.c(this.hasAcceptedTermsOfUse, touParsedData.hasAcceptedTermsOfUse) && C8632dsu.c((Object) this.region, (Object) touParsedData.region) && C8632dsu.c((Object) this.minAge, (Object) touParsedData.minAge) && C8632dsu.c((Object) this.price, (Object) touParsedData.price) && C8632dsu.c((Object) this.cashPaymentProvider, (Object) touParsedData.cashPaymentProvider) && C8632dsu.c((Object) this.cashPaymentProviderBrandName, (Object) touParsedData.cashPaymentProviderBrandName) && this.showInternationalTransactionMessage == touParsedData.showInternationalTransactionMessage && this.showSchufaText == touParsedData.showSchufaText && this.showCardChainingDisclosureText == touParsedData.showCardChainingDisclosureText && this.showMandateModificationTermOfUse == touParsedData.showMandateModificationTermOfUse && C8632dsu.c(this.rightOfWithdrawal, touParsedData.rightOfWithdrawal) && C8632dsu.c((Object) this.billingFrequency, (Object) touParsedData.billingFrequency) && this.isPreTax == touParsedData.isPreTax;
        }
        return false;
    }

    public final String getBillingFrequency() {
        return this.billingFrequency;
    }

    public final String getCashPaymentProvider() {
        return this.cashPaymentProvider;
    }

    public final String getCashPaymentProviderBrandName() {
        return this.cashPaymentProviderBrandName;
    }

    public final BooleanField getHasAcceptedTermsOfUse() {
        return this.hasAcceptedTermsOfUse;
    }

    public final String getMinAge() {
        return this.minAge;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getRegion() {
        return this.region;
    }

    public final BooleanField getRightOfWithdrawal() {
        return this.rightOfWithdrawal;
    }

    public final boolean getShowCardChainingDisclosureText() {
        return this.showCardChainingDisclosureText;
    }

    public final boolean getShowInternationalTransactionMessage() {
        return this.showInternationalTransactionMessage;
    }

    public final boolean getShowMandateModificationTermOfUse() {
        return this.showMandateModificationTermOfUse;
    }

    public final boolean getShowSchufaText() {
        return this.showSchufaText;
    }

    public int hashCode() {
        BooleanField booleanField = this.hasAcceptedTermsOfUse;
        int hashCode = booleanField == null ? 0 : booleanField.hashCode();
        String str = this.region;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.minAge;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.price;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cashPaymentProvider;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.cashPaymentProviderBrandName;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        int hashCode7 = Boolean.hashCode(this.showInternationalTransactionMessage);
        int hashCode8 = Boolean.hashCode(this.showSchufaText);
        int hashCode9 = Boolean.hashCode(this.showCardChainingDisclosureText);
        int hashCode10 = Boolean.hashCode(this.showMandateModificationTermOfUse);
        BooleanField booleanField2 = this.rightOfWithdrawal;
        int hashCode11 = booleanField2 == null ? 0 : booleanField2.hashCode();
        String str6 = this.billingFrequency;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPreTax);
    }

    public final boolean isPreTax() {
        return this.isPreTax;
    }

    public String toString() {
        BooleanField booleanField = this.hasAcceptedTermsOfUse;
        String str = this.region;
        String str2 = this.minAge;
        String str3 = this.price;
        String str4 = this.cashPaymentProvider;
        String str5 = this.cashPaymentProviderBrandName;
        boolean z = this.showInternationalTransactionMessage;
        boolean z2 = this.showSchufaText;
        boolean z3 = this.showCardChainingDisclosureText;
        boolean z4 = this.showMandateModificationTermOfUse;
        BooleanField booleanField2 = this.rightOfWithdrawal;
        String str6 = this.billingFrequency;
        boolean z5 = this.isPreTax;
        return "TouParsedData(hasAcceptedTermsOfUse=" + booleanField + ", region=" + str + ", minAge=" + str2 + ", price=" + str3 + ", cashPaymentProvider=" + str4 + ", cashPaymentProviderBrandName=" + str5 + ", showInternationalTransactionMessage=" + z + ", showSchufaText=" + z2 + ", showCardChainingDisclosureText=" + z3 + ", showMandateModificationTermOfUse=" + z4 + ", rightOfWithdrawal=" + booleanField2 + ", billingFrequency=" + str6 + ", isPreTax=" + z5 + ")";
    }

    public TouParsedData(BooleanField booleanField, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, BooleanField booleanField2, String str6, boolean z5) {
        this.hasAcceptedTermsOfUse = booleanField;
        this.region = str;
        this.minAge = str2;
        this.price = str3;
        this.cashPaymentProvider = str4;
        this.cashPaymentProviderBrandName = str5;
        this.showInternationalTransactionMessage = z;
        this.showSchufaText = z2;
        this.showCardChainingDisclosureText = z3;
        this.showMandateModificationTermOfUse = z4;
        this.rightOfWithdrawal = booleanField2;
        this.billingFrequency = str6;
        this.isPreTax = z5;
    }
}
