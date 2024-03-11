package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_LayoutTimer_TimerChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_LayoutTimer_TimerChildren extends LayoutTimer.TimerChildren {
    private final ImageElement background;
    private final SimpleElement countdownLabel;
    private final ImageElement deviceIcon;
    private final LayoutTimer.TimerChildren.TimerBar fillContainer;
    private final String id;
    private final ImageElement overlay;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren
    public ImageElement background() {
        return this.background;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren
    public SimpleElement countdownLabel() {
        return this.countdownLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren
    public ImageElement deviceIcon() {
        return this.deviceIcon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren
    public LayoutTimer.TimerChildren.TimerBar fillContainer() {
        return this.fillContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren
    public ImageElement overlay() {
        return this.overlay;
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
    public C$$AutoValue_LayoutTimer_TimerChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageElement imageElement, LayoutTimer.TimerChildren.TimerBar timerBar, ImageElement imageElement2, ImageElement imageElement3, SimpleElement simpleElement) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.background = imageElement;
        this.fillContainer = timerBar;
        this.overlay = imageElement2;
        this.deviceIcon = imageElement3;
        this.countdownLabel = simpleElement;
    }

    public String toString() {
        return "TimerChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", background=" + this.background + ", fillContainer=" + this.fillContainer + ", overlay=" + this.overlay + ", deviceIcon=" + this.deviceIcon + ", countdownLabel=" + this.countdownLabel + "}";
    }
}
