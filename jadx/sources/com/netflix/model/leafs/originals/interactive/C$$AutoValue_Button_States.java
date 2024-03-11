package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Button;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Button_States  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Button_States extends Button.States {
    private final SpriteImage defaultState;
    private final SpriteImage selectedState;

    @Override // com.netflix.model.leafs.originals.interactive.Button.States
    @SerializedName("default")
    public SpriteImage defaultState() {
        return this.defaultState;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button.States
    @SerializedName(VisualStateDefinition.ELEMENT_STATE.SELECTED)
    public SpriteImage selectedState() {
        return this.selectedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Button_States(SpriteImage spriteImage, SpriteImage spriteImage2) {
        if (spriteImage == null) {
            throw new NullPointerException("Null defaultState");
        }
        this.defaultState = spriteImage;
        if (spriteImage2 == null) {
            throw new NullPointerException("Null selectedState");
        }
        this.selectedState = spriteImage2;
    }

    public String toString() {
        return "States{defaultState=" + this.defaultState + ", selectedState=" + this.selectedState + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Button.States) {
            Button.States states = (Button.States) obj;
            return this.defaultState.equals(states.defaultState()) && this.selectedState.equals(states.selectedState());
        }
        return false;
    }

    public int hashCode() {
        return ((this.defaultState.hashCode() ^ 1000003) * 1000003) ^ this.selectedState.hashCode();
    }
}
