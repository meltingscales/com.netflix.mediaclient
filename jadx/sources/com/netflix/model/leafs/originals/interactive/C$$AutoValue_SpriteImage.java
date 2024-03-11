package com.netflix.model.leafs.originals.interactive;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_SpriteImage  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_SpriteImage extends SpriteImage {
    private final ImageAssetId image;
    private final SourceRect rect;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.SpriteImage
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.SpriteImage
    public SourceRect rect() {
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SpriteImage(ImageAssetId imageAssetId, SourceRect sourceRect) {
        this.image = imageAssetId;
        if (sourceRect == null) {
            throw new NullPointerException("Null rect");
        }
        this.rect = sourceRect;
    }

    public String toString() {
        return "SpriteImage{image=" + this.image + ", rect=" + this.rect + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpriteImage) {
            SpriteImage spriteImage = (SpriteImage) obj;
            ImageAssetId imageAssetId = this.image;
            if (imageAssetId != null ? imageAssetId.equals(spriteImage.image()) : spriteImage.image() == null) {
                if (this.rect.equals(spriteImage.rect())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        ImageAssetId imageAssetId = this.image;
        return (((imageAssetId == null ? 0 : imageAssetId.hashCode()) ^ 1000003) * 1000003) ^ this.rect.hashCode();
    }
}
