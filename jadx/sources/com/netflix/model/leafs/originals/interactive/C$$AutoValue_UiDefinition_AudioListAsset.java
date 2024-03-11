package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_AudioListAsset  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UiDefinition_AudioListAsset extends UiDefinition.AudioListAsset {
    private final String assetId;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.AudioListAsset
    public String assetId() {
        return this.assetId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_AudioListAsset(String str) {
        this.assetId = str;
    }

    public String toString() {
        return "AudioListAsset{assetId=" + this.assetId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.AudioListAsset) {
            String str = this.assetId;
            String assetId = ((UiDefinition.AudioListAsset) obj).assetId();
            return str == null ? assetId == null : str.equals(assetId);
        }
        return false;
    }

    public int hashCode() {
        String str = this.assetId;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
