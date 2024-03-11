package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout_Timer  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout_Timer extends CommonMetaData.Layout.Timer {
    private final ChoicePointAnimations animation;
    private final SpriteImage background;
    private final SpriteImage bar;
    private final Color color;
    private final SpriteImage foreground;
    private final SpriteImage pug;
    private final ScreenPosition timerPosition;
    private final int type;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public ChoicePointAnimations animation() {
        return this.animation;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public SpriteImage background() {
        return this.background;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public SpriteImage bar() {
        return this.bar;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public Color color() {
        return this.color;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public SpriteImage foreground() {
        return this.foreground;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public SpriteImage pug() {
        return this.pug;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public ScreenPosition timerPosition() {
        return this.timerPosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.Timer
    public int type() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout_Timer(Color color, int i, ScreenPosition screenPosition, SpriteImage spriteImage, SpriteImage spriteImage2, SpriteImage spriteImage3, SpriteImage spriteImage4, ChoicePointAnimations choicePointAnimations) {
        this.color = color;
        this.type = i;
        if (screenPosition == null) {
            throw new NullPointerException("Null timerPosition");
        }
        this.timerPosition = screenPosition;
        this.background = spriteImage;
        this.bar = spriteImage2;
        this.foreground = spriteImage3;
        this.pug = spriteImage4;
        this.animation = choicePointAnimations;
    }

    public String toString() {
        return "Timer{color=" + this.color + ", type=" + this.type + ", timerPosition=" + this.timerPosition + ", background=" + this.background + ", bar=" + this.bar + ", foreground=" + this.foreground + ", pug=" + this.pug + ", animation=" + this.animation + "}";
    }

    public boolean equals(Object obj) {
        SpriteImage spriteImage;
        SpriteImage spriteImage2;
        SpriteImage spriteImage3;
        SpriteImage spriteImage4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout.Timer) {
            CommonMetaData.Layout.Timer timer = (CommonMetaData.Layout.Timer) obj;
            Color color = this.color;
            if (color != null ? color.equals(timer.color()) : timer.color() == null) {
                if (this.type == timer.type() && this.timerPosition.equals(timer.timerPosition()) && ((spriteImage = this.background) != null ? spriteImage.equals(timer.background()) : timer.background() == null) && ((spriteImage2 = this.bar) != null ? spriteImage2.equals(timer.bar()) : timer.bar() == null) && ((spriteImage3 = this.foreground) != null ? spriteImage3.equals(timer.foreground()) : timer.foreground() == null) && ((spriteImage4 = this.pug) != null ? spriteImage4.equals(timer.pug()) : timer.pug() == null)) {
                    ChoicePointAnimations choicePointAnimations = this.animation;
                    if (choicePointAnimations == null) {
                        if (timer.animation() == null) {
                            return true;
                        }
                    } else if (choicePointAnimations.equals(timer.animation())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Color color = this.color;
        int hashCode = color == null ? 0 : color.hashCode();
        int i = this.type;
        int hashCode2 = this.timerPosition.hashCode();
        SpriteImage spriteImage = this.background;
        int hashCode3 = spriteImage == null ? 0 : spriteImage.hashCode();
        SpriteImage spriteImage2 = this.bar;
        int hashCode4 = spriteImage2 == null ? 0 : spriteImage2.hashCode();
        SpriteImage spriteImage3 = this.foreground;
        int hashCode5 = spriteImage3 == null ? 0 : spriteImage3.hashCode();
        SpriteImage spriteImage4 = this.pug;
        int hashCode6 = spriteImage4 == null ? 0 : spriteImage4.hashCode();
        ChoicePointAnimations choicePointAnimations = this.animation;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (choicePointAnimations != null ? choicePointAnimations.hashCode() : 0);
    }
}
