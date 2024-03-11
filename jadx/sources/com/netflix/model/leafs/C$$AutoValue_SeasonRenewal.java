package com.netflix.model.leafs;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.$$AutoValue_SeasonRenewal  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_SeasonRenewal extends SeasonRenewal {
    private final Map<String, SeasonRenewalAsset> assets;
    private final int autoPlaySeconds;
    private final boolean displayUpNext;
    private final String message;
    private final int watchedTopNodeid;

    @Override // com.netflix.model.leafs.SeasonRenewal
    public Map<String, SeasonRenewalAsset> assets() {
        return this.assets;
    }

    @Override // com.netflix.model.leafs.SeasonRenewal
    public int autoPlaySeconds() {
        return this.autoPlaySeconds;
    }

    @Override // com.netflix.model.leafs.SeasonRenewal
    public boolean displayUpNext() {
        return this.displayUpNext;
    }

    @Override // com.netflix.model.leafs.SeasonRenewal
    public String message() {
        return this.message;
    }

    @Override // com.netflix.model.leafs.SeasonRenewal
    public int watchedTopNodeid() {
        return this.watchedTopNodeid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SeasonRenewal(String str, boolean z, int i, int i2, Map<String, SeasonRenewalAsset> map) {
        this.message = str;
        this.displayUpNext = z;
        this.autoPlaySeconds = i;
        this.watchedTopNodeid = i2;
        this.assets = map;
    }

    public String toString() {
        return "SeasonRenewal{message=" + this.message + ", displayUpNext=" + this.displayUpNext + ", autoPlaySeconds=" + this.autoPlaySeconds + ", watchedTopNodeid=" + this.watchedTopNodeid + ", assets=" + this.assets + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeasonRenewal) {
            SeasonRenewal seasonRenewal = (SeasonRenewal) obj;
            String str = this.message;
            if (str != null ? str.equals(seasonRenewal.message()) : seasonRenewal.message() == null) {
                if (this.displayUpNext == seasonRenewal.displayUpNext() && this.autoPlaySeconds == seasonRenewal.autoPlaySeconds() && this.watchedTopNodeid == seasonRenewal.watchedTopNodeid()) {
                    Map<String, SeasonRenewalAsset> map = this.assets;
                    if (map == null) {
                        if (seasonRenewal.assets() == null) {
                            return true;
                        }
                    } else if (map.equals(seasonRenewal.assets())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.displayUpNext ? 1231 : 1237;
        int i2 = this.autoPlaySeconds;
        int i3 = this.watchedTopNodeid;
        Map<String, SeasonRenewalAsset> map = this.assets;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (map != null ? map.hashCode() : 0);
    }
}
