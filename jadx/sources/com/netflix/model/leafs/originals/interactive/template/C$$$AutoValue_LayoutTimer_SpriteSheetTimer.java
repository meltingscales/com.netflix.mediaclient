package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_LayoutTimer_SpriteSheetTimer  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_LayoutTimer_SpriteSheetTimer extends LayoutTimer.SpriteSheetTimer {
    private final ImageAssetId fail;
    private final String id;
    private final ImageAssetId image;
    private final ImageAssetId pass;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;
    private final List<Integer> yOffsets;

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.SpriteSheetTimer
    public ImageAssetId fail() {
        return this.fail;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.SpriteSheetTimer
    public ImageAssetId image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.SpriteSheetTimer
    public ImageAssetId pass() {
        return this.pass;
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

    @Override // com.netflix.model.leafs.originals.interactive.template.LayoutTimer.SpriteSheetTimer
    public List<Integer> yOffsets() {
        return this.yOffsets;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_LayoutTimer_SpriteSheetTimer(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageAssetId imageAssetId, List<Integer> list, ImageAssetId imageAssetId2, ImageAssetId imageAssetId3) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.image = imageAssetId;
        this.yOffsets = list;
        this.pass = imageAssetId2;
        this.fail = imageAssetId3;
    }

    public String toString() {
        return "SpriteSheetTimer{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", image=" + this.image + ", yOffsets=" + this.yOffsets + ", pass=" + this.pass + ", fail=" + this.fail + "}";
    }
}
