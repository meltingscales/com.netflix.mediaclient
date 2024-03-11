package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_ImageAssetId  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_ImageAssetId extends ImageAssetId {
    private final String assetId;

    @Override // com.netflix.model.leafs.originals.interactive.ImageAssetId
    public String assetId() {
        return this.assetId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ImageAssetId(String str) {
        this.assetId = str;
    }

    public String toString() {
        return "ImageAssetId{assetId=" + this.assetId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageAssetId) {
            String str = this.assetId;
            String assetId = ((ImageAssetId) obj).assetId();
            return str == null ? assetId == null : str.equals(assetId);
        }
        return false;
    }

    public int hashCode() {
        String str = this.assetId;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
