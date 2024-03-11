package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.ImageAssetId;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_VisualStateDefinition  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_VisualStateDefinition extends VisualStateDefinition {
    private final ImageAssetId image;
    private final String styleId;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition
    public String styleId() {
        return this.styleId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_VisualStateDefinition(String str, ImageAssetId imageAssetId) {
        this.styleId = str;
        this.image = imageAssetId;
    }

    public String toString() {
        return "VisualStateDefinition{styleId=" + this.styleId + ", image=" + this.image + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VisualStateDefinition) {
            VisualStateDefinition visualStateDefinition = (VisualStateDefinition) obj;
            String str = this.styleId;
            if (str != null ? str.equals(visualStateDefinition.styleId()) : visualStateDefinition.styleId() == null) {
                ImageAssetId imageAssetId = this.image;
                if (imageAssetId == null) {
                    if (visualStateDefinition.image() == null) {
                        return true;
                    }
                } else if (imageAssetId.equals(visualStateDefinition.image())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.styleId;
        int hashCode = str == null ? 0 : str.hashCode();
        ImageAssetId imageAssetId = this.image;
        return ((hashCode ^ 1000003) * 1000003) ^ (imageAssetId != null ? imageAssetId.hashCode() : 0);
    }
}
