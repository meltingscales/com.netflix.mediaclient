package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_TriviaStreakIndicatorElement  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_TriviaStreakIndicatorElement extends TriviaStreakIndicatorElement {
    private final TriviaStreakIndicatorElement.StreakContainerElementChildren children;
    private final String id;
    private final Map<String, String> preconditionTokens;
    private final String styleId;
    private final String text;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement
    public TriviaStreakIndicatorElement.StreakContainerElementChildren children() {
        return this.children;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.BaseLabelElement
    public Map<String, String> preconditionTokens() {
        return this.preconditionTokens;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.BaseLabelElement
    public String text() {
        return this.text;
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
    public C$$AutoValue_TriviaStreakIndicatorElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, String str4, Map<String, String> map3, TriviaStreakIndicatorElement.StreakContainerElementChildren streakContainerElementChildren) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.text = str4;
        this.preconditionTokens = map3;
        this.children = streakContainerElementChildren;
    }

    public String toString() {
        return "TriviaStreakIndicatorElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", text=" + this.text + ", preconditionTokens=" + this.preconditionTokens + ", children=" + this.children + "}";
    }
}
