package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_LabelElement  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_LabelElement extends LabelElement {
    private final String id;
    private final List<LabelElement.LabelElementOverride> overrides;
    private final Map<String, String> preconditionTokens;
    private final String styleId;
    private final String text;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement
    public List<LabelElement.LabelElementOverride> overrides() {
        return this.overrides;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.BaseLabelElement
    public Map<String, String> preconditionTokens() {
        return this.preconditionTokens;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.template.BaseLabelElement
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
    public C$$AutoValue_LabelElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, String str4, Map<String, String> map3, List<LabelElement.LabelElementOverride> list) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.text = str4;
        this.preconditionTokens = map3;
        this.overrides = list;
    }

    public String toString() {
        return "LabelElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", text=" + this.text + ", preconditionTokens=" + this.preconditionTokens + ", overrides=" + this.overrides + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement
    public LabelElement.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_LabelElement$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends LabelElement.Builder {
        private String id;
        private List<LabelElement.LabelElementOverride> overrides;
        private Map<String, String> preconditionTokens;
        private String styleId;
        private String text;
        private String type;
        private Map<String, AnimationTemplateId> visualStateTransitions;
        private Map<String, VisualStateDefinition> visualStates;

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setOverrides(List<LabelElement.LabelElementOverride> list) {
            this.overrides = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setPreconditionTokens(Map<String, String> map) {
            this.preconditionTokens = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setStyleId(String str) {
            this.styleId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setText(String str) {
            this.text = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setType(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map) {
            this.visualStateTransitions = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement.Builder setVisualStates(Map<String, VisualStateDefinition> map) {
            this.visualStates = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(LabelElement labelElement) {
            this.id = labelElement.id();
            this.type = labelElement.type();
            this.styleId = labelElement.styleId();
            this.visualStateTransitions = labelElement.visualStateTransitions();
            this.visualStates = labelElement.visualStates();
            this.text = labelElement.text();
            this.preconditionTokens = labelElement.preconditionTokens();
            this.overrides = labelElement.overrides();
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.Builder
        public LabelElement build() {
            return new AutoValue_LabelElement(this.id, this.type, this.styleId, this.visualStateTransitions, this.visualStates, this.text, this.preconditionTokens, this.overrides);
        }
    }
}
