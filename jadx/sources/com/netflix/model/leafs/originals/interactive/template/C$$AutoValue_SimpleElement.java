package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_SimpleElement  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_SimpleElement extends SimpleElement {
    private final String id;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

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
    public C$$AutoValue_SimpleElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
    }

    public String toString() {
        return "SimpleElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement
    public SimpleElement.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_SimpleElement$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends SimpleElement.Builder {
        private String id;
        private String styleId;
        private String type;
        private Map<String, AnimationTemplateId> visualStateTransitions;
        private Map<String, VisualStateDefinition> visualStates;

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement.Builder setStyleId(String str) {
            this.styleId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement.Builder setType(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement.Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map) {
            this.visualStateTransitions = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement.Builder setVisualStates(Map<String, VisualStateDefinition> map) {
            this.visualStates = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(SimpleElement simpleElement) {
            this.id = simpleElement.id();
            this.type = simpleElement.type();
            this.styleId = simpleElement.styleId();
            this.visualStateTransitions = simpleElement.visualStateTransitions();
            this.visualStates = simpleElement.visualStates();
        }

        @Override // com.netflix.model.leafs.originals.interactive.template.SimpleElement.Builder
        public SimpleElement build() {
            return new AutoValue_SimpleElement(this.id, this.type, this.styleId, this.visualStateTransitions, this.visualStates);
        }
    }
}
