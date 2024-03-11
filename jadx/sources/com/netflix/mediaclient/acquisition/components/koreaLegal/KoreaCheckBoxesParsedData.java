package com.netflix.mediaclient.acquisition.components.koreaLegal;

import com.netflix.android.moneyball.fields.BooleanField;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class KoreaCheckBoxesParsedData {
    public static final int $stable = 8;
    private final Integer abroadCheckedOrder;
    private final Integer cancelAnytimeCheckedOrder;
    private final Integer gatewayCheckedOrder;
    private final BooleanField hasAcceptedTermsOfUse;
    private final String planBillingFrequency;
    private final String planPrice;
    private final Integer termsCheckedOrder;
    private final BooleanField termsOfUse;
    private final String termsOfUseMinimumVerificationAge;
    private final Integer thirdPartyCheckedOrder;

    public final String component1() {
        return this.planPrice;
    }

    public final BooleanField component10() {
        return this.termsOfUse;
    }

    public final String component2() {
        return this.planBillingFrequency;
    }

    public final Integer component3() {
        return this.termsCheckedOrder;
    }

    public final Integer component4() {
        return this.abroadCheckedOrder;
    }

    public final Integer component5() {
        return this.gatewayCheckedOrder;
    }

    public final Integer component6() {
        return this.thirdPartyCheckedOrder;
    }

    public final Integer component7() {
        return this.cancelAnytimeCheckedOrder;
    }

    public final String component8() {
        return this.termsOfUseMinimumVerificationAge;
    }

    public final BooleanField component9() {
        return this.hasAcceptedTermsOfUse;
    }

    public final KoreaCheckBoxesParsedData copy(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, BooleanField booleanField, BooleanField booleanField2) {
        return new KoreaCheckBoxesParsedData(str, str2, num, num2, num3, num4, num5, str3, booleanField, booleanField2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KoreaCheckBoxesParsedData) {
            KoreaCheckBoxesParsedData koreaCheckBoxesParsedData = (KoreaCheckBoxesParsedData) obj;
            return C8632dsu.c((Object) this.planPrice, (Object) koreaCheckBoxesParsedData.planPrice) && C8632dsu.c((Object) this.planBillingFrequency, (Object) koreaCheckBoxesParsedData.planBillingFrequency) && C8632dsu.c(this.termsCheckedOrder, koreaCheckBoxesParsedData.termsCheckedOrder) && C8632dsu.c(this.abroadCheckedOrder, koreaCheckBoxesParsedData.abroadCheckedOrder) && C8632dsu.c(this.gatewayCheckedOrder, koreaCheckBoxesParsedData.gatewayCheckedOrder) && C8632dsu.c(this.thirdPartyCheckedOrder, koreaCheckBoxesParsedData.thirdPartyCheckedOrder) && C8632dsu.c(this.cancelAnytimeCheckedOrder, koreaCheckBoxesParsedData.cancelAnytimeCheckedOrder) && C8632dsu.c((Object) this.termsOfUseMinimumVerificationAge, (Object) koreaCheckBoxesParsedData.termsOfUseMinimumVerificationAge) && C8632dsu.c(this.hasAcceptedTermsOfUse, koreaCheckBoxesParsedData.hasAcceptedTermsOfUse) && C8632dsu.c(this.termsOfUse, koreaCheckBoxesParsedData.termsOfUse);
        }
        return false;
    }

    public final Integer getAbroadCheckedOrder() {
        return this.abroadCheckedOrder;
    }

    public final Integer getCancelAnytimeCheckedOrder() {
        return this.cancelAnytimeCheckedOrder;
    }

    public final Integer getGatewayCheckedOrder() {
        return this.gatewayCheckedOrder;
    }

    public final BooleanField getHasAcceptedTermsOfUse() {
        return this.hasAcceptedTermsOfUse;
    }

    public final String getPlanBillingFrequency() {
        return this.planBillingFrequency;
    }

    public final String getPlanPrice() {
        return this.planPrice;
    }

    public final Integer getTermsCheckedOrder() {
        return this.termsCheckedOrder;
    }

    public final BooleanField getTermsOfUse() {
        return this.termsOfUse;
    }

    public final String getTermsOfUseMinimumVerificationAge() {
        return this.termsOfUseMinimumVerificationAge;
    }

    public final Integer getThirdPartyCheckedOrder() {
        return this.thirdPartyCheckedOrder;
    }

    public int hashCode() {
        String str = this.planPrice;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.planBillingFrequency;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.termsCheckedOrder;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.abroadCheckedOrder;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.gatewayCheckedOrder;
        int hashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.thirdPartyCheckedOrder;
        int hashCode6 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.cancelAnytimeCheckedOrder;
        int hashCode7 = num5 == null ? 0 : num5.hashCode();
        String str3 = this.termsOfUseMinimumVerificationAge;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        BooleanField booleanField = this.hasAcceptedTermsOfUse;
        int hashCode9 = booleanField == null ? 0 : booleanField.hashCode();
        BooleanField booleanField2 = this.termsOfUse;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (booleanField2 != null ? booleanField2.hashCode() : 0);
    }

    public String toString() {
        String str = this.planPrice;
        String str2 = this.planBillingFrequency;
        Integer num = this.termsCheckedOrder;
        Integer num2 = this.abroadCheckedOrder;
        Integer num3 = this.gatewayCheckedOrder;
        Integer num4 = this.thirdPartyCheckedOrder;
        Integer num5 = this.cancelAnytimeCheckedOrder;
        String str3 = this.termsOfUseMinimumVerificationAge;
        BooleanField booleanField = this.hasAcceptedTermsOfUse;
        BooleanField booleanField2 = this.termsOfUse;
        return "KoreaCheckBoxesParsedData(planPrice=" + str + ", planBillingFrequency=" + str2 + ", termsCheckedOrder=" + num + ", abroadCheckedOrder=" + num2 + ", gatewayCheckedOrder=" + num3 + ", thirdPartyCheckedOrder=" + num4 + ", cancelAnytimeCheckedOrder=" + num5 + ", termsOfUseMinimumVerificationAge=" + str3 + ", hasAcceptedTermsOfUse=" + booleanField + ", termsOfUse=" + booleanField2 + ")";
    }

    public KoreaCheckBoxesParsedData(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, BooleanField booleanField, BooleanField booleanField2) {
        this.planPrice = str;
        this.planBillingFrequency = str2;
        this.termsCheckedOrder = num;
        this.abroadCheckedOrder = num2;
        this.gatewayCheckedOrder = num3;
        this.thirdPartyCheckedOrder = num4;
        this.cancelAnytimeCheckedOrder = num5;
        this.termsOfUseMinimumVerificationAge = str3;
        this.hasAcceptedTermsOfUse = booleanField;
        this.termsOfUse = booleanField2;
    }

    public /* synthetic */ KoreaCheckBoxesParsedData(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, BooleanField booleanField, BooleanField booleanField2, int i, C8627dsp c8627dsp) {
        this(str, str2, num, num2, num3, num4, num5, (i & 128) != 0 ? "" : str3, booleanField, booleanField2);
    }
}
