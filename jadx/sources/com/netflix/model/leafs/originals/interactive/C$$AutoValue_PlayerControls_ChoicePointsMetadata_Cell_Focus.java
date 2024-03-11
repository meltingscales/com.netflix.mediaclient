package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus extends PlayerControls.ChoicePointsMetadata.Cell.Focus {
    private final ImageAssetId image;
    private final SourceRect rect;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell.Focus
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.Cell.Focus
    public SourceRect rect() {
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus(SourceRect sourceRect, ImageAssetId imageAssetId) {
        this.rect = sourceRect;
        this.image = imageAssetId;
    }

    public String toString() {
        return "Focus{rect=" + this.rect + ", image=" + this.image + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.ChoicePointsMetadata.Cell.Focus) {
            PlayerControls.ChoicePointsMetadata.Cell.Focus focus = (PlayerControls.ChoicePointsMetadata.Cell.Focus) obj;
            SourceRect sourceRect = this.rect;
            if (sourceRect != null ? sourceRect.equals(focus.rect()) : focus.rect() == null) {
                ImageAssetId imageAssetId = this.image;
                if (imageAssetId == null) {
                    if (focus.image() == null) {
                        return true;
                    }
                } else if (imageAssetId.equals(focus.image())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        SourceRect sourceRect = this.rect;
        int hashCode = sourceRect == null ? 0 : sourceRect.hashCode();
        ImageAssetId imageAssetId = this.image;
        return ((hashCode ^ 1000003) * 1000003) ^ (imageAssetId != null ? imageAssetId.hashCode() : 0);
    }
}
