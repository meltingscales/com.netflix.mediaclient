package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_BackgroundImageElement  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_BackgroundImageElement extends BackgroundImageElement {
    private final ImageAssetId backgroundImage;
    private final String id;
    private final List<BackgroundImageElement.BackgroundImageElementOverride> overrides;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement
    public ImageAssetId backgroundImage() {
        return this.backgroundImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement
    public List<BackgroundImageElement.BackgroundImageElementOverride> overrides() {
        return this.overrides;
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
    public C$$$AutoValue_BackgroundImageElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageAssetId imageAssetId, List<BackgroundImageElement.BackgroundImageElementOverride> list) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.backgroundImage = imageAssetId;
        this.overrides = list;
    }

    public String toString() {
        return "BackgroundImageElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", backgroundImage=" + this.backgroundImage + ", overrides=" + this.overrides + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement
    public BackgroundImageElement.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_BackgroundImageElement$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends BackgroundImageElement.Builder {
        private ImageAssetId backgroundImage;
        private String id;
        private List<BackgroundImageElement.BackgroundImageElementOverride> overrides;
        private String styleId;
        private String type;
        private Map<String, AnimationTemplateId> visualStateTransitions;
        private Map<String, VisualStateDefinition> visualStates;

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setBackgroundImage(ImageAssetId imageAssetId) {
            this.backgroundImage = imageAssetId;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setOverrides(List<BackgroundImageElement.BackgroundImageElementOverride> list) {
            this.overrides = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setStyleId(String str) {
            this.styleId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setType(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map) {
            this.visualStateTransitions = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement.Builder setVisualStates(Map<String, VisualStateDefinition> map) {
            this.visualStates = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(BackgroundImageElement backgroundImageElement) {
            this.id = backgroundImageElement.id();
            this.type = backgroundImageElement.type();
            this.styleId = backgroundImageElement.styleId();
            this.visualStateTransitions = backgroundImageElement.visualStateTransitions();
            this.visualStates = backgroundImageElement.visualStates();
            this.backgroundImage = backgroundImageElement.backgroundImage();
            this.overrides = backgroundImageElement.overrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.Builder
        public BackgroundImageElement build() {
            return new AutoValue_BackgroundImageElement(this.id, this.type, this.styleId, this.visualStateTransitions, this.visualStates, this.backgroundImage, this.overrides);
        }
    }
}
