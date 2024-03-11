package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.C$$AutoValue_SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_SimpleElement;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SimpleElement extends Element {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract SimpleElement build();

        public abstract Builder setId(String str);

        public abstract Builder setStyleId(String str);

        public abstract Builder setType(String str);

        public abstract Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map);

        public abstract Builder setVisualStates(Map<String, VisualStateDefinition> map);
    }

    public abstract Builder toBuilder();

    public static TypeAdapter<SimpleElement> typeAdapter(Gson gson) {
        return new C$AutoValue_SimpleElement.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$$AutoValue_SimpleElement.Builder();
    }

    public SimpleElement merge(SimpleElement simpleElement) {
        if (simpleElement == null) {
            return this;
        }
        Builder builder = toBuilder();
        if (id() == null) {
            builder.setId(simpleElement.id());
        }
        if (type() == null) {
            builder.setType(simpleElement.type());
        }
        if (styleId() == null) {
            builder.setStyleId(simpleElement.styleId());
        }
        if (visualStateTransitions() == null) {
            builder.setVisualStateTransitions(mergeVisualStateTransition(simpleElement.visualStateTransitions()));
        }
        if (visualStates() == null) {
            builder.setVisualStates(mergeVisualStates(simpleElement.visualStates()));
        }
        return builder.build();
    }
}
