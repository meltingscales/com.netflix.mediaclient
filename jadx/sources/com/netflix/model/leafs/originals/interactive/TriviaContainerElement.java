package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$$AutoValue_TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.Element;
import com.netflix.model.leafs.originals.interactive.template.ElementChildrenList;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class TriviaContainerElement extends Element implements ElementChildrenList {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract TriviaContainerElement build();

        public abstract Builder setChildrenList(List<ElementV2> list);

        public abstract Builder setId(String str);

        public abstract Builder setStyleId(String str);

        public abstract Builder setType(String str);

        public abstract Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map);

        public abstract Builder setVisualStates(Map<String, VisualStateDefinition> map);
    }

    public abstract List<ElementV2> childrenList();

    public abstract Builder toBuilder();

    public static TypeAdapter<TriviaContainerElement> typeAdapter(Gson gson) {
        return new C$AutoValue_TriviaContainerElement.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        List<ElementV2> childrenList = childrenList();
        if (childrenList != null) {
            return new ArrayList(childrenList);
        }
        return null;
    }

    public static Builder builder() {
        return new C$$AutoValue_TriviaContainerElement.Builder();
    }

    public TriviaContainerElement override(final InteractiveMoments interactiveMoments) {
        List<ElementV2> childrenList = childrenList();
        if (childrenList != null) {
            final ArrayList arrayList = new ArrayList(childrenList.size());
            childrenList.forEach(new Consumer() { // from class: com.netflix.model.leafs.originals.interactive.TriviaContainerElement$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    TriviaContainerElement.lambda$override$0(arrayList, interactiveMoments, (ElementV2) obj);
                }
            });
            return toBuilder().setChildrenList(arrayList).build();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$override$0(List list, InteractiveMoments interactiveMoments, ElementV2 elementV2) {
        list.add(elementV2.override(interactiveMoments));
    }

    public TriviaContainerElement merge(TriviaContainerElement triviaContainerElement) {
        if (triviaContainerElement == null) {
            return this;
        }
        Builder builder = toBuilder();
        if (id() == null) {
            builder.setId(triviaContainerElement.id());
        }
        if (type() == null) {
            builder.setType(triviaContainerElement.type());
        }
        if (styleId() == null) {
            builder.setStyleId(triviaContainerElement.styleId());
        }
        if (visualStateTransitions() == null) {
            builder.setVisualStateTransitions(triviaContainerElement.visualStateTransitions());
        }
        if (visualStates() == null) {
            builder.setVisualStates(mergeVisualStates(triviaContainerElement.visualStates()));
        }
        if (childrenList() == null) {
            builder.setChildrenList(triviaContainerElement.childrenList());
        }
        return builder.build();
    }
}
