package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView extends PlayerControls.ChoicePointsMetadata.Cell.MainView {
    private final ImageAssetId image;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell.MainView
    public ImageAssetId image() {
        return this.image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView(ImageAssetId imageAssetId) {
        this.image = imageAssetId;
    }

    public String toString() {
        return "MainView{image=" + this.image + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Cell.MainView) {
            ImageAssetId imageAssetId = this.image;
            ImageAssetId image = ((PlayerControls.ChoicePointsMetadata.Cell.MainView) obj).image();
            return imageAssetId == null ? image == null : imageAssetId.equals(image);
        }
        return false;
    }

    public int hashCode() {
        ImageAssetId imageAssetId = this.image;
        return (imageAssetId == null ? 0 : imageAssetId.hashCode()) ^ 1000003;
    }
}
