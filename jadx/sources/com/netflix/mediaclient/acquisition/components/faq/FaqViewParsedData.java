package com.netflix.mediaclient.acquisition.components.faq;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FaqViewParsedData {
    public static final int $stable = 0;
    private final String highestCostPlanPrice;
    private final boolean isCfourAvailable;
    private final boolean isDownloadsEnabled;
    private final String lowestCostPlanPrice;

    public static /* synthetic */ FaqViewParsedData copy$default(FaqViewParsedData faqViewParsedData, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faqViewParsedData.lowestCostPlanPrice;
        }
        if ((i & 2) != 0) {
            str2 = faqViewParsedData.highestCostPlanPrice;
        }
        if ((i & 4) != 0) {
            z = faqViewParsedData.isCfourAvailable;
        }
        if ((i & 8) != 0) {
            z2 = faqViewParsedData.isDownloadsEnabled;
        }
        return faqViewParsedData.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.lowestCostPlanPrice;
    }

    public final String component2() {
        return this.highestCostPlanPrice;
    }

    public final boolean component3() {
        return this.isCfourAvailable;
    }

    public final boolean component4() {
        return this.isDownloadsEnabled;
    }

    public final FaqViewParsedData copy(String str, String str2, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new FaqViewParsedData(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaqViewParsedData) {
            FaqViewParsedData faqViewParsedData = (FaqViewParsedData) obj;
            return C8632dsu.c((Object) this.lowestCostPlanPrice, (Object) faqViewParsedData.lowestCostPlanPrice) && C8632dsu.c((Object) this.highestCostPlanPrice, (Object) faqViewParsedData.highestCostPlanPrice) && this.isCfourAvailable == faqViewParsedData.isCfourAvailable && this.isDownloadsEnabled == faqViewParsedData.isDownloadsEnabled;
        }
        return false;
    }

    public final String getHighestCostPlanPrice() {
        return this.highestCostPlanPrice;
    }

    public final String getLowestCostPlanPrice() {
        return this.lowestCostPlanPrice;
    }

    public int hashCode() {
        return (((((this.lowestCostPlanPrice.hashCode() * 31) + this.highestCostPlanPrice.hashCode()) * 31) + Boolean.hashCode(this.isCfourAvailable)) * 31) + Boolean.hashCode(this.isDownloadsEnabled);
    }

    public final boolean isCfourAvailable() {
        return this.isCfourAvailable;
    }

    public final boolean isDownloadsEnabled() {
        return this.isDownloadsEnabled;
    }

    public String toString() {
        String str = this.lowestCostPlanPrice;
        String str2 = this.highestCostPlanPrice;
        boolean z = this.isCfourAvailable;
        boolean z2 = this.isDownloadsEnabled;
        return "FaqViewParsedData(lowestCostPlanPrice=" + str + ", highestCostPlanPrice=" + str2 + ", isCfourAvailable=" + z + ", isDownloadsEnabled=" + z2 + ")";
    }

    public FaqViewParsedData(String str, String str2, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.lowestCostPlanPrice = str;
        this.highestCostPlanPrice = str2;
        this.isCfourAvailable = z;
        this.isDownloadsEnabled = z2;
    }
}
