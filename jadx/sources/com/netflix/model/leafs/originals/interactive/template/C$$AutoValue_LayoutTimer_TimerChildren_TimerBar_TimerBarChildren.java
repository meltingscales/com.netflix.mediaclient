package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren extends LayoutTimer.TimerChildren.TimerBar.TimerBarChildren {
    private final ImageElement fill;
    private final String id;
    private final ImageElement leftCap;
    private final ImageElement rightCap;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren.TimerBar.TimerBarChildren
    public ImageElement fill() {
        return this.fill;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren.TimerBar.TimerBarChildren
    public ImageElement leftCap() {
        return this.leftCap;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.TimerChildren.TimerBar.TimerBarChildren
    public ImageElement rightCap() {
        return this.rightCap;
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
    public C$$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageElement imageElement, ImageElement imageElement2, ImageElement imageElement3) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        if (imageElement == null) {
            throw new NullPointerException("Null fill");
        }
        this.fill = imageElement;
        this.leftCap = imageElement2;
        this.rightCap = imageElement3;
    }

    public String toString() {
        return "TimerBarChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", fill=" + this.fill + ", leftCap=" + this.leftCap + ", rightCap=" + this.rightCap + "}";
    }
}
