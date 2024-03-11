package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_ElementV2  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ElementV2 extends ElementV2 {
    private final ImageAssetId backgroundImage;
    private final List<ElementV2> childrenList;
    private final String id;
    private final ImageAssetId image;
    private final List<ElementV2.ElementV2Override> overrides;
    private final Map<String, String> preconditionTokens;
    private final String styleId;
    private final String text;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2
    public ImageAssetId backgroundImage() {
        return this.backgroundImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2, com.netflix.model.leafs.originals.interactive.template.ElementChildrenList
    public List<ElementV2> childrenList() {
        return this.childrenList;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2
    public ImageAssetId image() {
        return this.image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2
    public List<ElementV2.ElementV2Override> overrides() {
        return this.overrides;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2
    public Map<String, String> preconditionTokens() {
        return this.preconditionTokens;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2
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
    public C$$AutoValue_ElementV2(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageAssetId imageAssetId, ImageAssetId imageAssetId2, List<ElementV2> list, List<ElementV2.ElementV2Override> list2, String str4, Map<String, String> map3) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.backgroundImage = imageAssetId;
        this.image = imageAssetId2;
        this.childrenList = list;
        this.overrides = list2;
        this.text = str4;
        this.preconditionTokens = map3;
    }

    public String toString() {
        return "ElementV2{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", backgroundImage=" + this.backgroundImage + ", image=" + this.image + ", childrenList=" + this.childrenList + ", overrides=" + this.overrides + ", text=" + this.text + ", preconditionTokens=" + this.preconditionTokens + "}";
    }
}
