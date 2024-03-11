package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import java.util.Map;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_TriviaContainerElement  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_TriviaContainerElement extends TriviaContainerElement {
    private final List<ElementV2> childrenList;
    private final String id;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement, com.netflix.model.leafs.originals.interactive.template.ElementChildrenList
    public List<ElementV2> childrenList() {
        return this.childrenList;
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
    public C$$AutoValue_TriviaContainerElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, List<ElementV2> list) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.childrenList = list;
    }

    public String toString() {
        return "TriviaContainerElement{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", childrenList=" + this.childrenList + "}";
    }

    @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement
    public TriviaContainerElement.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_TriviaContainerElement$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends TriviaContainerElement.Builder {
        private List<ElementV2> childrenList;
        private String id;
        private String styleId;
        private String type;
        private Map<String, AnimationTemplateId> visualStateTransitions;
        private Map<String, VisualStateDefinition> visualStates;

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setChildrenList(List<ElementV2> list) {
            this.childrenList = list;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setStyleId(String str) {
            this.styleId = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setType(String str) {
            this.type = str;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map) {
            this.visualStateTransitions = map;
            return this;
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement.Builder setVisualStates(Map<String, VisualStateDefinition> map) {
            this.visualStates = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(TriviaContainerElement triviaContainerElement) {
            this.id = triviaContainerElement.id();
            this.type = triviaContainerElement.type();
            this.styleId = triviaContainerElement.styleId();
            this.visualStateTransitions = triviaContainerElement.visualStateTransitions();
            this.visualStates = triviaContainerElement.visualStates();
            this.childrenList = triviaContainerElement.childrenList();
        }

        @Override // com.netflix.model.leafs.originals.interactive.TriviaContainerElement.Builder
        public TriviaContainerElement build() {
            return new AutoValue_TriviaContainerElement(this.id, this.type, this.styleId, this.visualStateTransitions, this.visualStates, this.childrenList);
        }
    }
}
