package com.netflix.mediaclient.acquisition.components.paymentInfo;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PaymentInfoParsedData {
    public static final int $stable = 0;
    private final String bankName;
    private final String cardType;
    private final String email;
    private final String firstName;
    private final String lastFour;
    private final String lastName;
    private final String maskedAccountNumber;
    private final String mopType;
    private final String partnerDisplayName;
    private final String paypalEmail;
    private final String upiId;

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.paypalEmail;
    }

    public final String component11() {
        return this.upiId;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.mopType;
    }

    public final String component4() {
        return this.lastFour;
    }

    public final String component5() {
        return this.cardType;
    }

    public final String component6() {
        return this.partnerDisplayName;
    }

    public final String component7() {
        return this.bankName;
    }

    public final String component8() {
        return this.maskedAccountNumber;
    }

    public final String component9() {
        return this.email;
    }

    public final PaymentInfoParsedData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new PaymentInfoParsedData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentInfoParsedData) {
            PaymentInfoParsedData paymentInfoParsedData = (PaymentInfoParsedData) obj;
            return C8632dsu.c((Object) this.firstName, (Object) paymentInfoParsedData.firstName) && C8632dsu.c((Object) this.lastName, (Object) paymentInfoParsedData.lastName) && C8632dsu.c((Object) this.mopType, (Object) paymentInfoParsedData.mopType) && C8632dsu.c((Object) this.lastFour, (Object) paymentInfoParsedData.lastFour) && C8632dsu.c((Object) this.cardType, (Object) paymentInfoParsedData.cardType) && C8632dsu.c((Object) this.partnerDisplayName, (Object) paymentInfoParsedData.partnerDisplayName) && C8632dsu.c((Object) this.bankName, (Object) paymentInfoParsedData.bankName) && C8632dsu.c((Object) this.maskedAccountNumber, (Object) paymentInfoParsedData.maskedAccountNumber) && C8632dsu.c((Object) this.email, (Object) paymentInfoParsedData.email) && C8632dsu.c((Object) this.paypalEmail, (Object) paymentInfoParsedData.paypalEmail) && C8632dsu.c((Object) this.upiId, (Object) paymentInfoParsedData.upiId);
        }
        return false;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMaskedAccountNumber() {
        return this.maskedAccountNumber;
    }

    public final String getMopType() {
        return this.mopType;
    }

    public final String getPartnerDisplayName() {
        return this.partnerDisplayName;
    }

    public final String getPaypalEmail() {
        return this.paypalEmail;
    }

    public final String getUpiId() {
        return this.upiId;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.lastName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mopType;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lastFour;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.cardType;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.partnerDisplayName;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bankName;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maskedAccountNumber;
        int hashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.email;
        int hashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.paypalEmail;
        int hashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.upiId;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.mopType;
        String str4 = this.lastFour;
        String str5 = this.cardType;
        String str6 = this.partnerDisplayName;
        String str7 = this.bankName;
        String str8 = this.maskedAccountNumber;
        String str9 = this.email;
        String str10 = this.paypalEmail;
        String str11 = this.upiId;
        return "PaymentInfoParsedData(firstName=" + str + ", lastName=" + str2 + ", mopType=" + str3 + ", lastFour=" + str4 + ", cardType=" + str5 + ", partnerDisplayName=" + str6 + ", bankName=" + str7 + ", maskedAccountNumber=" + str8 + ", email=" + str9 + ", paypalEmail=" + str10 + ", upiId=" + str11 + ")";
    }

    public PaymentInfoParsedData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.firstName = str;
        this.lastName = str2;
        this.mopType = str3;
        this.lastFour = str4;
        this.cardType = str5;
        this.partnerDisplayName = str6;
        this.bankName = str7;
        this.maskedAccountNumber = str8;
        this.email = str9;
        this.paypalEmail = str10;
        this.upiId = str11;
    }
}
