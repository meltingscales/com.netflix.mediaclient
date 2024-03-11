package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_LayoutTimer  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_LayoutTimer extends LayoutTimer {
    private final LayoutTimer.TimerChildren children;
    private final String id;
    private final Integer maxSecondsForCountdown;
    private final LayoutTimer.SpriteSheetTimer spritesheet;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer
    public LayoutTimer.TimerChildren children() {
        return this.children;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer
    public Integer maxSecondsForCountdown() {
        return this.maxSecondsForCountdown;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer
    public LayoutTimer.SpriteSheetTimer spritesheet() {
        return this.spritesheet;
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
    public C$$$AutoValue_LayoutTimer(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, LayoutTimer.TimerChildren timerChildren, LayoutTimer.SpriteSheetTimer spriteSheetTimer, Integer num) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.children = timerChildren;
        this.spritesheet = spriteSheetTimer;
        this.maxSecondsForCountdown = num;
    }

    public String toString() {
        return "LayoutTimer{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", children=" + this.children + ", spritesheet=" + this.spritesheet + ", maxSecondsForCountdown=" + this.maxSecondsForCountdown + "}";
    }
}
