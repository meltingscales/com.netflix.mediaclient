package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_LayoutTimer_TimerChildren_TimerBar  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_LayoutTimer_TimerChildren_TimerBar extends LayoutTimer.TimerChildren.TimerBar {
    private final String assetId;
    private final LayoutTimer.TimerChildren.TimerBar.TimerBarChildren children;
    private final String id;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren.TimerBar
    public String assetId() {
        return this.assetId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren.TimerBar
    public LayoutTimer.TimerChildren.TimerBar.TimerBarChildren children() {
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
    public C$$$AutoValue_LayoutTimer_TimerChildren_TimerBar(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, String str4, LayoutTimer.TimerChildren.TimerBar.TimerBarChildren timerBarChildren) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.assetId = str4;
        if (timerBarChildren == null) {
            throw new NullPointerException("Null children");
        }
        this.children = timerBarChildren;
    }

    public String toString() {
        return "TimerBar{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", assetId=" + this.assetId + ", children=" + this.children + "}";
    }
}
