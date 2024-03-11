package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren extends TriviaStreakIndicatorElement.StreakContainerElementChildren {
    private final BackgroundImageElement backgroundData;
    private final String id;
    private final LabelElement labelElement;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement.StreakContainerElementChildren
    @SerializedName("background")
    public BackgroundImageElement backgroundData() {
        return this.backgroundData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement.StreakContainerElementChildren
    @SerializedName("label")
    public LabelElement labelElement() {
        return this.labelElement;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public Map<String, AnimationTemplateId> visualStateTransitions() {
        return this.visualStateTransitions;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public Map<String, VisualStateDefinition> visualStates() {
        return this.visualStates;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, BackgroundImageElement backgroundImageElement, LabelElement labelElement) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.backgroundData = backgroundImageElement;
        this.labelElement = labelElement;
    }

    public String toString() {
        return "StreakContainerElementChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", backgroundData=" + this.backgroundData + ", labelElement=" + this.labelElement + "}";
    }
}
