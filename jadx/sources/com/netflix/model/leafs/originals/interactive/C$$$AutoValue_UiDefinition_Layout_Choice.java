package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_UiDefinition_Layout_Choice  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_UiDefinition_Layout_Choice extends UiDefinition.Layout.Choice {
    private final UiDefinition.Layout.Choice.ChoiceChildren children;
    private final String id;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice
    public UiDefinition.Layout.Choice.ChoiceChildren children() {
        return this.children;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
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
    public C$$$AutoValue_UiDefinition_Layout_Choice(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, UiDefinition.Layout.Choice.ChoiceChildren choiceChildren) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.children = choiceChildren;
    }

    public String toString() {
        return "Choice{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", children=" + this.children + "}";
    }
}
