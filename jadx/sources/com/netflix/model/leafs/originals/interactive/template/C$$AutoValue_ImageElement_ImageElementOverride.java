package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.template.ImageElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_ImageElement_ImageElementOverride  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ImageElement_ImageElementOverride extends ImageElement.ImageElementOverride {
    private final ImageElement data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.ImageElementOverride
    public ImageElement data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.ImageElementOverride
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ImageElement_ImageElementOverride(String str, ImageElement imageElement) {
        this.preconditionId = str;
        this.data = imageElement;
    }

    public String toString() {
        return "ImageElementOverride{preconditionId=" + this.preconditionId + ", data=" + this.data + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageElement.ImageElementOverride) {
            ImageElement.ImageElementOverride imageElementOverride = (ImageElement.ImageElementOverride) obj;
            String str = this.preconditionId;
            if (str != null ? str.equals(imageElementOverride.preconditionId()) : imageElementOverride.preconditionId() == null) {
                ImageElement imageElement = this.data;
                if (imageElement == null) {
                    if (imageElementOverride.data() == null) {
                        return true;
                    }
                } else if (imageElement.equals(imageElementOverride.data())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.preconditionId;
        int hashCode = str == null ? 0 : str.hashCode();
        ImageElement imageElement = this.data;
        return ((hashCode ^ 1000003) * 1000003) ^ (imageElement != null ? imageElement.hashCode() : 0);
    }
}
