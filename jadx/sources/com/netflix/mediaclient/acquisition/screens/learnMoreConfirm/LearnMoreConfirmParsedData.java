package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LearnMoreConfirmParsedData {
    public static final int $stable = 0;
    private final String email;
    private final boolean isRecognizedFormerMember;
    private final boolean recentlyRegistered;
    private final boolean showPlanUnavailableDialog;

    public static /* synthetic */ LearnMoreConfirmParsedData copy$default(LearnMoreConfirmParsedData learnMoreConfirmParsedData, boolean z, String str, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = learnMoreConfirmParsedData.isRecognizedFormerMember;
        }
        if ((i & 2) != 0) {
            str = learnMoreConfirmParsedData.email;
        }
        if ((i & 4) != 0) {
            z2 = learnMoreConfirmParsedData.recentlyRegistered;
        }
        if ((i & 8) != 0) {
            z3 = learnMoreConfirmParsedData.showPlanUnavailableDialog;
        }
        return learnMoreConfirmParsedData.copy(z, str, z2, z3);
    }

    public final boolean component1() {
        return this.isRecognizedFormerMember;
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

    public final LearnMoreConfirmParsedData copy(boolean z, String str, boolean z2, boolean z3) {
        return new LearnMoreConfirmParsedData(z, str, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LearnMoreConfirmParsedData) {
            LearnMoreConfirmParsedData learnMoreConfirmParsedData = (LearnMoreConfirmParsedData) obj;
            return this.isRecognizedFormerMember == learnMoreConfirmParsedData.isRecognizedFormerMember && C8632dsu.c((Object) this.email, (Object) learnMoreConfirmParsedData.email) && this.recentlyRegistered == learnMoreConfirmParsedData.recentlyRegistered && this.showPlanUnavailableDialog == learnMoreConfirmParsedData.showPlanUnavailableDialog;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getRecentlyRegistered() {
        return this.recentlyRegistered;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRecognizedFormerMember);
        String str = this.email;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recentlyRegistered)) * 31) + Boolean.hashCode(this.showPlanUnavailableDialog);
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    public String toString() {
        boolean z = this.isRecognizedFormerMember;
        String str = this.email;
        boolean z2 = this.recentlyRegistered;
        boolean z3 = this.showPlanUnavailableDialog;
        return "LearnMoreConfirmParsedData(isRecognizedFormerMember=" + z + ", email=" + str + ", recentlyRegistered=" + z2 + ", showPlanUnavailableDialog=" + z3 + ")";
    }

    public LearnMoreConfirmParsedData(boolean z, String str, boolean z2, boolean z3) {
        this.isRecognizedFormerMember = z;
        this.email = str;
        this.recentlyRegistered = z2;
        this.showPlanUnavailableDialog = z3;
    }
}
