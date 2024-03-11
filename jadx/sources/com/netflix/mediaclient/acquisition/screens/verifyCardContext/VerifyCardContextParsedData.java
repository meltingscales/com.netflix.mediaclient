package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VerifyCardContextParsedData {
    public static final int $stable = 0;
    private final boolean is3DSCharge;
    private final boolean shouldAutoSubmit;
    private final String userMessageKey;

    public static /* synthetic */ VerifyCardContextParsedData copy$default(VerifyCardContextParsedData verifyCardContextParsedData, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyCardContextParsedData.is3DSCharge;
        }
        if ((i & 2) != 0) {
            z2 = verifyCardContextParsedData.shouldAutoSubmit;
        }
        if ((i & 4) != 0) {
            str = verifyCardContextParsedData.userMessageKey;
        }
        return verifyCardContextParsedData.copy(z, z2, str);
    }

    public final boolean component1() {
        return this.is3DSCharge;
    }

    public final boolean component2() {
        return this.shouldAutoSubmit;
    }

    public final String component3() {
        return this.userMessageKey;
    }

    public final VerifyCardContextParsedData copy(boolean z, boolean z2, String str) {
        return new VerifyCardContextParsedData(z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyCardContextParsedData) {
            VerifyCardContextParsedData verifyCardContextParsedData = (VerifyCardContextParsedData) obj;
            return this.is3DSCharge == verifyCardContextParsedData.is3DSCharge && this.shouldAutoSubmit == verifyCardContextParsedData.shouldAutoSubmit && C8632dsu.c((Object) this.userMessageKey, (Object) verifyCardContextParsedData.userMessageKey);
        }
        return false;
    }

    public final boolean getShouldAutoSubmit() {
        return this.shouldAutoSubmit;
    }

    public final String getUserMessageKey() {
        return this.userMessageKey;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.is3DSCharge);
        int hashCode2 = Boolean.hashCode(this.shouldAutoSubmit);
        String str = this.userMessageKey;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean is3DSCharge() {
        return this.is3DSCharge;
    }

    public String toString() {
        boolean z = this.is3DSCharge;
        boolean z2 = this.shouldAutoSubmit;
        String str = this.userMessageKey;
        return "VerifyCardContextParsedData(is3DSCharge=" + z + ", shouldAutoSubmit=" + z2 + ", userMessageKey=" + str + ")";
    }

    public VerifyCardContextParsedData(boolean z, boolean z2, String str) {
        this.is3DSCharge = z;
        this.shouldAutoSubmit = z2;
        this.userMessageKey = str;
    }
}
