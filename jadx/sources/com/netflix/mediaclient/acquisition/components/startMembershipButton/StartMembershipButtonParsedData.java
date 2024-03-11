package com.netflix.mediaclient.acquisition.components.startMembershipButton;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StartMembershipButtonParsedData {
    public static final int $stable = 0;
    private final boolean isPaused;
    private final String primaryLabelKey;
    private final String secondaryLabelKey;
    private final boolean willStartMembership;

    public static /* synthetic */ StartMembershipButtonParsedData copy$default(StartMembershipButtonParsedData startMembershipButtonParsedData, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startMembershipButtonParsedData.primaryLabelKey;
        }
        if ((i & 2) != 0) {
            str2 = startMembershipButtonParsedData.secondaryLabelKey;
        }
        if ((i & 4) != 0) {
            z = startMembershipButtonParsedData.willStartMembership;
        }
        if ((i & 8) != 0) {
            z2 = startMembershipButtonParsedData.isPaused;
        }
        return startMembershipButtonParsedData.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.primaryLabelKey;
    }

    public final String component2() {
        return this.secondaryLabelKey;
    }

    public final boolean component3() {
        return this.willStartMembership;
    }

    public final boolean component4() {
        return this.isPaused;
    }

    public final StartMembershipButtonParsedData copy(String str, String str2, boolean z, boolean z2) {
        return new StartMembershipButtonParsedData(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartMembershipButtonParsedData) {
            StartMembershipButtonParsedData startMembershipButtonParsedData = (StartMembershipButtonParsedData) obj;
            return C8632dsu.c((Object) this.primaryLabelKey, (Object) startMembershipButtonParsedData.primaryLabelKey) && C8632dsu.c((Object) this.secondaryLabelKey, (Object) startMembershipButtonParsedData.secondaryLabelKey) && this.willStartMembership == startMembershipButtonParsedData.willStartMembership && this.isPaused == startMembershipButtonParsedData.isPaused;
        }
        return false;
    }

    public final String getPrimaryLabelKey() {
        return this.primaryLabelKey;
    }

    public final String getSecondaryLabelKey() {
        return this.secondaryLabelKey;
    }

    public final boolean getWillStartMembership() {
        return this.willStartMembership;
    }

    public int hashCode() {
        String str = this.primaryLabelKey;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.secondaryLabelKey;
        return (((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.willStartMembership)) * 31) + Boolean.hashCode(this.isPaused);
    }

    public final boolean isPaused() {
        return this.isPaused;
    }

    public String toString() {
        String str = this.primaryLabelKey;
        String str2 = this.secondaryLabelKey;
        boolean z = this.willStartMembership;
        boolean z2 = this.isPaused;
        return "StartMembershipButtonParsedData(primaryLabelKey=" + str + ", secondaryLabelKey=" + str2 + ", willStartMembership=" + z + ", isPaused=" + z2 + ")";
    }

    public StartMembershipButtonParsedData(String str, String str2, boolean z, boolean z2) {
        this.primaryLabelKey = str;
        this.secondaryLabelKey = str2;
        this.willStartMembership = z;
        this.isPaused = z2;
    }

    public /* synthetic */ StartMembershipButtonParsedData(String str, String str2, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
