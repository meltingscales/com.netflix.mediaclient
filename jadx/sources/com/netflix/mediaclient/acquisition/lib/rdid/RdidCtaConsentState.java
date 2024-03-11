package com.netflix.mediaclient.acquisition.lib.rdid;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RdidCtaConsentState {
    private final String consentId;
    private final String displayedAt;
    private final boolean isDenied;

    public static /* synthetic */ RdidCtaConsentState copy$default(RdidCtaConsentState rdidCtaConsentState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rdidCtaConsentState.consentId;
        }
        if ((i & 2) != 0) {
            str2 = rdidCtaConsentState.displayedAt;
        }
        if ((i & 4) != 0) {
            z = rdidCtaConsentState.isDenied;
        }
        return rdidCtaConsentState.copy(str, str2, z);
    }

    public final String component1() {
        return this.consentId;
    }

    public final String component2() {
        return this.displayedAt;
    }

    public final boolean component3() {
        return this.isDenied;
    }

    public final RdidCtaConsentState copy(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new RdidCtaConsentState(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RdidCtaConsentState) {
            RdidCtaConsentState rdidCtaConsentState = (RdidCtaConsentState) obj;
            return C8632dsu.c((Object) this.consentId, (Object) rdidCtaConsentState.consentId) && C8632dsu.c((Object) this.displayedAt, (Object) rdidCtaConsentState.displayedAt) && this.isDenied == rdidCtaConsentState.isDenied;
        }
        return false;
    }

    public final String getConsentId() {
        return this.consentId;
    }

    public final String getDisplayedAt() {
        return this.displayedAt;
    }

    public int hashCode() {
        return (((this.consentId.hashCode() * 31) + this.displayedAt.hashCode()) * 31) + Boolean.hashCode(this.isDenied);
    }

    public final boolean isDenied() {
        return this.isDenied;
    }

    public String toString() {
        String str = this.consentId;
        String str2 = this.displayedAt;
        boolean z = this.isDenied;
        return "RdidCtaConsentState(consentId=" + str + ", displayedAt=" + str2 + ", isDenied=" + z + ")";
    }

    public RdidCtaConsentState(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.consentId = str;
        this.displayedAt = str2;
        this.isDenied = z;
    }
}
