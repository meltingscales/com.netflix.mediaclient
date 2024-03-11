package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background extends CommonMetaData.Layout.ChoiceLayout.Background {
    private final SpriteImage defaultImg;
    private final SpriteImage selected;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout.Background
    @SerializedName("default")
    public SpriteImage defaultImg() {
        return this.defaultImg;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout.Background
    public SpriteImage selected() {
        return this.selected;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background(SpriteImage spriteImage, SpriteImage spriteImage2) {
        this.defaultImg = spriteImage;
        this.selected = spriteImage2;
    }

    public String toString() {
        return "Background{defaultImg=" + this.defaultImg + ", selected=" + this.selected + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout.ChoiceLayout.Background) {
            CommonMetaData.Layout.ChoiceLayout.Background background = (CommonMetaData.Layout.ChoiceLayout.Background) obj;
            SpriteImage spriteImage = this.defaultImg;
            if (spriteImage != null ? spriteImage.equals(background.defaultImg()) : background.defaultImg() == null) {
                SpriteImage spriteImage2 = this.selected;
                if (spriteImage2 == null) {
                    if (background.selected() == null) {
                        return true;
                    }
                } else if (spriteImage2.equals(background.selected())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        SpriteImage spriteImage = this.defaultImg;
        int hashCode = spriteImage == null ? 0 : spriteImage.hashCode();
        SpriteImage spriteImage2 = this.selected;
        return ((hashCode ^ 1000003) * 1000003) ^ (spriteImage2 != null ? spriteImage2.hashCode() : 0);
    }
}
