package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_ImageElement  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_ImageElement extends ImageElement {
    private final String id;
    private final ImageAssetId image;
    private final List<ImageElement.ImageElementOverride> overrides;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement
    public ImageAssetId image() {
        return this.image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement
    public List<ImageElement.ImageElementOverride> overrides() {
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
    public C$$$AutoValue_ImageElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageAssetId imageAssetId, List<ImageElement.ImageElementOverride> list) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.image = imageAssetId;
        this.overrides = list;
    }

    public String toString() {
        return "ImageElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", image=" + this.image + ", overrides=" + this.overrides + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement
    public ImageElement.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.template.$$$AutoValue_ImageElement$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends ImageElement.Builder {
        private String id;
        private ImageAssetId image;
        private List<ImageElement.ImageElementOverride> overrides;
        private String styleId;
        private String type;
        private Map<String, AnimationTemplateId> visualStateTransitions;
        private Map<String, VisualStateDefinition> visualStates;

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setImage(ImageAssetId imageAssetId) {
            this.image = imageAssetId;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setOverrides(List<ImageElement.ImageElementOverride> list) {
            this.overrides = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setStyleId(String str) {
            this.styleId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setType(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map) {
            this.visualStateTransitions = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement.Builder setVisualStates(Map<String, VisualStateDefinition> map) {
            this.visualStates = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(ImageElement imageElement) {
            this.id = imageElement.id();
            this.type = imageElement.type();
            this.styleId = imageElement.styleId();
            this.visualStateTransitions = imageElement.visualStateTransitions();
            this.visualStates = imageElement.visualStates();
            this.image = imageElement.image();
            this.overrides = imageElement.overrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.ImageElement.Builder
        public ImageElement build() {
            return new AutoValue_ImageElement(this.id, this.type, this.styleId, this.visualStateTransitions, this.visualStates, this.image, this.overrides);
        }
    }
}
