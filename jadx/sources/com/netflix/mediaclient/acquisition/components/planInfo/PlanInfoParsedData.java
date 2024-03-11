package com.netflix.mediaclient.acquisition.components.planInfo;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PlanInfoParsedData {
    public static final int $stable = 8;
    private final boolean hasEligibleOffer;
    private final boolean isPreTax;
    private final String offerType;
    private String planBillingFrequency;
    private final String planName;
    private final String planPrice;

    public static /* synthetic */ PlanInfoParsedData copy$default(PlanInfoParsedData planInfoParsedData, boolean z, String str, String str2, String str3, boolean z2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = planInfoParsedData.isPreTax;
        }
        if ((i & 2) != 0) {
            str = planInfoParsedData.planBillingFrequency;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = planInfoParsedData.planPrice;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = planInfoParsedData.planName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            z2 = planInfoParsedData.hasEligibleOffer;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            str4 = planInfoParsedData.offerType;
        }
        return planInfoParsedData.copy(z, str5, str6, str7, z3, str4);
    }

    public final boolean component1() {
        return this.isPreTax;
    }

    public final String component2() {
        return this.planBillingFrequency;
    }

    public final String component3() {
        return this.planPrice;
    }

    public final String component4() {
        return this.planName;
    }

    public final boolean component5() {
        return this.hasEligibleOffer;
    }

    public final String component6() {
        return this.offerType;
    }

    public final PlanInfoParsedData copy(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        return new PlanInfoParsedData(z, str, str2, str3, z2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlanInfoParsedData) {
            PlanInfoParsedData planInfoParsedData = (PlanInfoParsedData) obj;
            return this.isPreTax == planInfoParsedData.isPreTax && C8632dsu.c((Object) this.planBillingFrequency, (Object) planInfoParsedData.planBillingFrequency) && C8632dsu.c((Object) this.planPrice, (Object) planInfoParsedData.planPrice) && C8632dsu.c((Object) this.planName, (Object) planInfoParsedData.planName) && this.hasEligibleOffer == planInfoParsedData.hasEligibleOffer && C8632dsu.c((Object) this.offerType, (Object) planInfoParsedData.offerType);
        }
        return false;
    }

    public final boolean getHasEligibleOffer() {
        return this.hasEligibleOffer;
    }

    public final String getOfferType() {
        return this.offerType;
    }

    public final String getPlanBillingFrequency() {
        return this.planBillingFrequency;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPlanPrice() {
        return this.planPrice;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isPreTax);
        String str = this.planBillingFrequency;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.planPrice;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.planName;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        int hashCode5 = Boolean.hashCode(this.hasEligibleOffer);
        String str4 = this.offerType;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isPreTax() {
        return this.isPreTax;
    }

    public final void setPlanBillingFrequency(String str) {
        this.planBillingFrequency = str;
    }

    public String toString() {
        boolean z = this.isPreTax;
        String str = this.planBillingFrequency;
        String str2 = this.planPrice;
        String str3 = this.planName;
        boolean z2 = this.hasEligibleOffer;
        String str4 = this.offerType;
        return "PlanInfoParsedData(isPreTax=" + z + ", planBillingFrequency=" + str + ", planPrice=" + str2 + ", planName=" + str3 + ", hasEligibleOffer=" + z2 + ", offerType=" + str4 + ")";
    }

    public PlanInfoParsedData(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        this.isPreTax = z;
        this.planBillingFrequency = str;
        this.planPrice = str2;
        this.planName = str3;
        this.hasEligibleOffer = z2;
        this.offerType = str4;
        if (str == null) {
            this.planBillingFrequency = "Monthly";
        }
    }

    public /* synthetic */ PlanInfoParsedData(boolean z, String str, String str2, String str3, boolean z2, String str4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, str, str2, str3, z2, str4);
    }
}
