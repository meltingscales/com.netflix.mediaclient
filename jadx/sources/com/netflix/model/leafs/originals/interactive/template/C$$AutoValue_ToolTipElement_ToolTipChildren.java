package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_ToolTipElement_ToolTipChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ToolTipElement_ToolTipChildren extends ToolTipElement.ToolTipChildren {
    private final String id;
    private final ImageElement previewImage;
    private final String styleId;
    private final SimpleElement subtitleLabel;
    private final SimpleElement titleLabel;
    private final ImageElement tooltip;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ToolTipElement.ToolTipChildren
    public ImageElement previewImage() {
        return this.previewImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ToolTipElement.ToolTipChildren
    public SimpleElement subtitleLabel() {
        return this.subtitleLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ToolTipElement.ToolTipChildren
    public SimpleElement titleLabel() {
        return this.titleLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ToolTipElement.ToolTipChildren
    public ImageElement tooltip() {
        return this.tooltip;
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
    public C$$AutoValue_ToolTipElement_ToolTipChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, SimpleElement simpleElement, SimpleElement simpleElement2, ImageElement imageElement, ImageElement imageElement2) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.titleLabel = simpleElement;
        this.subtitleLabel = simpleElement2;
        this.previewImage = imageElement;
        this.tooltip = imageElement2;
    }

    public String toString() {
        return "ToolTipChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", titleLabel=" + this.titleLabel + ", subtitleLabel=" + this.subtitleLabel + ", previewImage=" + this.previewImage + ", tooltip=" + this.tooltip + "}";
    }
}
