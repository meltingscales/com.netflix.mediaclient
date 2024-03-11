package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren extends UiDefinition.Layout.Choice.ChoiceChildren {
    private final ImageElement accessoryView;
    private final ImageElement background;
    private final ImageElement foreground;
    private final ImageElement foregroundMask;
    private final ImageElement icon;
    private final String id;
    private final SimpleElement label;
    private final ImageElement scrim;
    private final String styleId;
    private final ToolTipElement tooltipContainer;
    private final String type;
    private final ImageElement underline;
    private final SimpleElement valueLabel;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement accessoryView() {
        return this.accessoryView;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement background() {
        return this.background;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement foreground() {
        return this.foreground;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement foregroundMask() {
        return this.foregroundMask;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement icon() {
        return this.icon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public SimpleElement label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement scrim() {
        return this.scrim;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ToolTipElement tooltipContainer() {
        return this.tooltipContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public ImageElement underline() {
        return this.underline;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Choice.ChoiceChildren
    public SimpleElement valueLabel() {
        return this.valueLabel;
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
    public C$$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, SimpleElement simpleElement, ImageElement imageElement, ImageElement imageElement2, ImageElement imageElement3, SimpleElement simpleElement2, ToolTipElement toolTipElement, ImageElement imageElement4, ImageElement imageElement5, ImageElement imageElement6, ImageElement imageElement7) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.label = simpleElement;
        this.icon = imageElement;
        this.background = imageElement2;
        this.underline = imageElement3;
        this.valueLabel = simpleElement2;
        this.tooltipContainer = toolTipElement;
        this.foreground = imageElement4;
        this.foregroundMask = imageElement5;
        this.scrim = imageElement6;
        this.accessoryView = imageElement7;
    }

    public String toString() {
        return "ChoiceChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", label=" + this.label + ", icon=" + this.icon + ", background=" + this.background + ", underline=" + this.underline + ", valueLabel=" + this.valueLabel + ", tooltipContainer=" + this.tooltipContainer + ", foreground=" + this.foreground + ", foregroundMask=" + this.foregroundMask + ", scrim=" + this.scrim + ", accessoryView=" + this.accessoryView + "}";
    }
}
