package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Button  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Button extends Button {
    private final Action action;
    private final Integer baselineY;
    private final Integer fontSize;
    private final Button.Label label;
    private final SourceRect rect;
    private final ScreenPosition screenPosition;
    private final Button.States states;

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public Action action() {
        return this.action;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public Integer baselineY() {
        return this.baselineY;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public Integer fontSize() {
        return this.fontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public Button.Label label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public SourceRect rect() {
        return this.rect;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public ScreenPosition screenPosition() {
        return this.screenPosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button
    public Button.States states() {
        return this.states;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Button(Action action, Button.Label label, Integer num, Integer num2, SourceRect sourceRect, ScreenPosition screenPosition, Button.States states) {
        this.action = action;
        this.label = label;
        if (num == null) {
            throw new NullPointerException("Null fontSize");
        }
        this.fontSize = num;
        if (num2 == null) {
            throw new NullPointerException("Null baselineY");
        }
        this.baselineY = num2;
        if (sourceRect == null) {
            throw new NullPointerException("Null rect");
        }
        this.rect = sourceRect;
        if (screenPosition == null) {
            throw new NullPointerException("Null screenPosition");
        }
        this.screenPosition = screenPosition;
        this.states = states;
    }

    public String toString() {
        return "Button{action=" + this.action + ", label=" + this.label + ", fontSize=" + this.fontSize + ", baselineY=" + this.baselineY + ", rect=" + this.rect + ", screenPosition=" + this.screenPosition + ", states=" + this.states + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Button) {
            Button button = (Button) obj;
            Action action = this.action;
            if (action != null ? action.equals(button.action()) : button.action() == null) {
                Button.Label label = this.label;
                if (label != null ? label.equals(button.label()) : button.label() == null) {
                    if (this.fontSize.equals(button.fontSize()) && this.baselineY.equals(button.baselineY()) && this.rect.equals(button.rect()) && this.screenPosition.equals(button.screenPosition())) {
                        Button.States states = this.states;
                        if (states == null) {
                            if (button.states() == null) {
                                return true;
                            }
                        } else if (states.equals(button.states())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Action action = this.action;
        int hashCode = action == null ? 0 : action.hashCode();
        Button.Label label = this.label;
        int hashCode2 = label == null ? 0 : label.hashCode();
        int hashCode3 = this.fontSize.hashCode();
        int hashCode4 = this.baselineY.hashCode();
        int hashCode5 = this.rect.hashCode();
        int hashCode6 = this.screenPosition.hashCode();
        Button.States states = this.states;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (states != null ? states.hashCode() : 0);
    }
}
