package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout_InteractiveNotification  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout_InteractiveNotification extends CommonMetaData.Layout.InteractiveNotification {
    private final ChoicePointAnimations animation;
    private final SpriteImage background;
    private final Label label;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.InteractiveNotification
    public ChoicePointAnimations animation() {
        return this.animation;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.InteractiveNotification
    public SpriteImage background() {
        return this.background;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.InteractiveNotification
    public Label label() {
        return this.label;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout_InteractiveNotification(SpriteImage spriteImage, Label label, ChoicePointAnimations choicePointAnimations) {
        this.background = spriteImage;
        this.label = label;
        this.animation = choicePointAnimations;
    }

    public String toString() {
        return "InteractiveNotification{background=" + this.background + ", label=" + this.label + ", animation=" + this.animation + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout.InteractiveNotification) {
            CommonMetaData.Layout.InteractiveNotification interactiveNotification = (CommonMetaData.Layout.InteractiveNotification) obj;
            SpriteImage spriteImage = this.background;
            if (spriteImage != null ? spriteImage.equals(interactiveNotification.background()) : interactiveNotification.background() == null) {
                Label label = this.label;
                if (label != null ? label.equals(interactiveNotification.label()) : interactiveNotification.label() == null) {
                    ChoicePointAnimations choicePointAnimations = this.animation;
                    if (choicePointAnimations == null) {
                        if (interactiveNotification.animation() == null) {
                            return true;
                        }
                    } else if (choicePointAnimations.equals(interactiveNotification.animation())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        SpriteImage spriteImage = this.background;
        int hashCode = spriteImage == null ? 0 : spriteImage.hashCode();
        Label label = this.label;
        int hashCode2 = label == null ? 0 : label.hashCode();
        ChoicePointAnimations choicePointAnimations = this.animation;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (choicePointAnimations != null ? choicePointAnimations.hashCode() : 0);
    }
}
