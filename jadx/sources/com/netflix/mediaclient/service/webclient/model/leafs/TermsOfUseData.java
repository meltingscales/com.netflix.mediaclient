package com.netflix.mediaclient.service.webclient.model.leafs;

import o.C8632dsu;

/* loaded from: classes6.dex */
public final class TermsOfUseData {
    private final String minAge;
    private final String region;
    private final String showCheckbox;

    public static /* synthetic */ TermsOfUseData copy$default(TermsOfUseData termsOfUseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termsOfUseData.region;
        }
        if ((i & 2) != 0) {
            str2 = termsOfUseData.showCheckbox;
        }
        if ((i & 4) != 0) {
            str3 = termsOfUseData.minAge;
        }
        return termsOfUseData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.region;
    }

    public final String component2() {
        return this.showCheckbox;
    }

    public final String component3() {
        return this.minAge;
    }

    public final TermsOfUseData copy(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new TermsOfUseData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TermsOfUseData) {
            TermsOfUseData termsOfUseData = (TermsOfUseData) obj;
            return C8632dsu.c((Object) this.region, (Object) termsOfUseData.region) && C8632dsu.c((Object) this.showCheckbox, (Object) termsOfUseData.showCheckbox) && C8632dsu.c((Object) this.minAge, (Object) termsOfUseData.minAge);
        }
        return false;
    }

    public final String getMinAge() {
        return this.minAge;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getShowCheckbox() {
        return this.showCheckbox;
    }

    public int hashCode() {
        return (((this.region.hashCode() * 31) + this.showCheckbox.hashCode()) * 31) + this.minAge.hashCode();
    }

    public String toString() {
        String str = this.region;
        String str2 = this.showCheckbox;
        String str3 = this.minAge;
        return "TermsOfUseData(region=" + str + ", showCheckbox=" + str2 + ", minAge=" + str3 + ")";
    }

    public TermsOfUseData(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.region = str;
        this.showCheckbox = str2;
        this.minAge = str3;
    }
}
