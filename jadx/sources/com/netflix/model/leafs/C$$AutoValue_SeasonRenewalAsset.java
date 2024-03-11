package com.netflix.model.leafs;

/* renamed from: com.netflix.model.leafs.$$AutoValue_SeasonRenewalAsset  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_SeasonRenewalAsset extends SeasonRenewalAsset {
    private final String assetType;
    private final int height;
    private final boolean isBadged;
    private final int scale;
    private final String url;
    private final int width;

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public String assetType() {
        return this.assetType;
    }

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public int height() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public boolean isBadged() {
        return this.isBadged;
    }

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public int scale() {
        return this.scale;
    }

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public String url() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.SeasonRenewalAsset
    public int width() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SeasonRenewalAsset(String str, int i, int i2, boolean z, int i3, String str2) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.url = str;
        this.width = i;
        this.height = i2;
        this.isBadged = z;
        this.scale = i3;
        if (str2 == null) {
            throw new NullPointerException("Null assetType");
        }
        this.assetType = str2;
    }

    public String toString() {
        return "SeasonRenewalAsset{url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", isBadged=" + this.isBadged + ", scale=" + this.scale + ", assetType=" + this.assetType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeasonRenewalAsset) {
            SeasonRenewalAsset seasonRenewalAsset = (SeasonRenewalAsset) obj;
            return this.url.equals(seasonRenewalAsset.url()) && this.width == seasonRenewalAsset.width() && this.height == seasonRenewalAsset.height() && this.isBadged == seasonRenewalAsset.isBadged() && this.scale == seasonRenewalAsset.scale() && this.assetType.equals(seasonRenewalAsset.assetType());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode();
        int i = this.width;
        int i2 = this.height;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (this.isBadged ? 1231 : 1237)) * 1000003) ^ this.scale) * 1000003) ^ this.assetType.hashCode();
    }
}
