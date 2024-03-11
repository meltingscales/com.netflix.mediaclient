package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout_ChoiceLayout  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout_ChoiceLayout extends CommonMetaData.Layout.ChoiceLayout {
    private final ChoicePointAnimations animation;
    private final CommonMetaData.Layout.ChoiceLayout.Background background;
    private final CommonMetaData.Layout.ChoiceLayout.InnerChoice choice;
    private final SpriteImage foreground;
    private final SourceRect icon;
    private final Label label;
    private final String name;
    private final SpriteImage selected;
    private final String text;
    private final boolean visible;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public ChoicePointAnimations animation() {
        return this.animation;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public CommonMetaData.Layout.ChoiceLayout.Background background() {
        return this.background;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public CommonMetaData.Layout.ChoiceLayout.InnerChoice choice() {
        return this.choice;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public SpriteImage foreground() {
        return this.foreground;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public SourceRect icon() {
        return this.icon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public Label label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public String name() {
        return this.name;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public SpriteImage selected() {
        return this.selected;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public String text() {
        return this.text;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout
    public boolean visible() {
        return this.visible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout_ChoiceLayout(String str, SpriteImage spriteImage, SpriteImage spriteImage2, Label label, ChoicePointAnimations choicePointAnimations, SourceRect sourceRect, CommonMetaData.Layout.ChoiceLayout.Background background, boolean z, CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice, String str2) {
        this.name = str;
        this.foreground = spriteImage;
        this.selected = spriteImage2;
        this.label = label;
        this.animation = choicePointAnimations;
        this.icon = sourceRect;
        this.background = background;
        this.visible = z;
        this.choice = innerChoice;
        this.text = str2;
    }

    public String toString() {
        return "ChoiceLayout{name=" + this.name + ", foreground=" + this.foreground + ", selected=" + this.selected + ", label=" + this.label + ", animation=" + this.animation + ", icon=" + this.icon + ", background=" + this.background + ", visible=" + this.visible + ", choice=" + this.choice + ", text=" + this.text + "}";
    }

    public boolean equals(Object obj) {
        CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout.ChoiceLayout) {
            CommonMetaData.Layout.ChoiceLayout choiceLayout = (CommonMetaData.Layout.ChoiceLayout) obj;
            String str = this.name;
            if (str != null ? str.equals(choiceLayout.name()) : choiceLayout.name() == null) {
                SpriteImage spriteImage = this.foreground;
                if (spriteImage != null ? spriteImage.equals(choiceLayout.foreground()) : choiceLayout.foreground() == null) {
                    SpriteImage spriteImage2 = this.selected;
                    if (spriteImage2 != null ? spriteImage2.equals(choiceLayout.selected()) : choiceLayout.selected() == null) {
                        Label label = this.label;
                        if (label != null ? label.equals(choiceLayout.label()) : choiceLayout.label() == null) {
                            ChoicePointAnimations choicePointAnimations = this.animation;
                            if (choicePointAnimations != null ? choicePointAnimations.equals(choiceLayout.animation()) : choiceLayout.animation() == null) {
                                SourceRect sourceRect = this.icon;
                                if (sourceRect != null ? sourceRect.equals(choiceLayout.icon()) : choiceLayout.icon() == null) {
                                    CommonMetaData.Layout.ChoiceLayout.Background background = this.background;
                                    if (background != null ? background.equals(choiceLayout.background()) : choiceLayout.background() == null) {
                                        if (this.visible == choiceLayout.visible() && ((innerChoice = this.choice) != null ? innerChoice.equals(choiceLayout.choice()) : choiceLayout.choice() == null)) {
                                            String str2 = this.text;
                                            if (str2 == null) {
                                                if (choiceLayout.text() == null) {
                                                    return true;
                                                }
                                            } else if (str2.equals(choiceLayout.text())) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        SpriteImage spriteImage = this.foreground;
        int hashCode2 = spriteImage == null ? 0 : spriteImage.hashCode();
        SpriteImage spriteImage2 = this.selected;
        int hashCode3 = spriteImage2 == null ? 0 : spriteImage2.hashCode();
        Label label = this.label;
        int hashCode4 = label == null ? 0 : label.hashCode();
        ChoicePointAnimations choicePointAnimations = this.animation;
        int hashCode5 = choicePointAnimations == null ? 0 : choicePointAnimations.hashCode();
        SourceRect sourceRect = this.icon;
        int hashCode6 = sourceRect == null ? 0 : sourceRect.hashCode();
        CommonMetaData.Layout.ChoiceLayout.Background background = this.background;
        int hashCode7 = background == null ? 0 : background.hashCode();
        int i = this.visible ? 1231 : 1237;
        CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice = this.choice;
        int hashCode8 = innerChoice == null ? 0 : innerChoice.hashCode();
        String str2 = this.text;
        return ((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i) * 1000003) ^ hashCode8) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
