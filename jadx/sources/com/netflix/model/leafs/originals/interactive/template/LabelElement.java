package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.C$$AutoValue_LabelElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LabelElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LabelElement_LabelElementOverride;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LabelElement extends BaseLabelElement {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract LabelElement build();

        public abstract Builder setId(String str);

        public abstract Builder setOverrides(List<LabelElementOverride> list);

        public abstract Builder setPreconditionTokens(Map<String, String> map);

        public abstract Builder setStyleId(String str);

        public abstract Builder setText(String str);

        public abstract Builder setType(String str);

        public abstract Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map);

        public abstract Builder setVisualStates(Map<String, VisualStateDefinition> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<LabelElementOverride> overrides();

    public abstract Builder toBuilder();

    public static TypeAdapter<LabelElement> typeAdapter(Gson gson) {
        return new C$AutoValue_LabelElement.GsonTypeAdapter(gson);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.model.leafs.originals.interactive.template.LabelElement override(com.netflix.model.leafs.originals.interactive.InteractiveMoments r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.overrides()
            if (r0 == 0) goto L3e
            int r1 = r0.size()
            if (r1 <= 0) goto L3e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            com.netflix.model.leafs.originals.interactive.template.LabelElement$LabelElementOverride r1 = (com.netflix.model.leafs.originals.interactive.template.LabelElement.LabelElementOverride) r1
            com.netflix.model.leafs.originals.interactive.template.LabelElement r2 = r1.data()
            java.util.Map r3 = r5.preconditions()
            java.lang.String r1 = r1.preconditionId()
            java.lang.Object r1 = r3.get(r1)
            com.netflix.model.leafs.originals.interactive.condition.Condition r1 = (com.netflix.model.leafs.originals.interactive.condition.Condition) r1
            if (r1 == 0) goto L36
            boolean r1 = r1.meetsCondition(r5)
            if (r1 == 0) goto L10
        L36:
            if (r2 != 0) goto L39
            return r4
        L39:
            com.netflix.model.leafs.originals.interactive.template.LabelElement r5 = r2.merge(r4)
            return r5
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.template.LabelElement.override(com.netflix.model.leafs.originals.interactive.InteractiveMoments):com.netflix.model.leafs.originals.interactive.template.LabelElement");
    }

    public static Builder builder() {
        return new C$$AutoValue_LabelElement.Builder();
    }

    public LabelElement merge(LabelElement labelElement) {
        if (labelElement == null) {
            return this;
        }
        Builder builder = toBuilder();
        if (id() == null) {
            builder.setId(labelElement.id());
        }
        if (type() == null) {
            builder.setType(labelElement.type());
        }
        if (styleId() == null) {
            builder.setStyleId(labelElement.styleId());
        }
        if (visualStateTransitions() == null) {
            builder.setVisualStateTransitions(mergeVisualStateTransition(labelElement.visualStateTransitions()));
        }
        if (visualStates() == null) {
            builder.setVisualStates(mergeVisualStates(labelElement.visualStates()));
        }
        if (overrides() == null) {
            builder.setOverrides(labelElement.overrides());
        }
        if (text() == null) {
            builder.setText(labelElement.text());
        }
        if (preconditionTokens() == null) {
            builder.setPreconditionTokens(labelElement.preconditionTokens());
        }
        return builder.build();
    }

    /* loaded from: classes.dex */
    public static abstract class LabelElementOverride implements Parcelable {
        public abstract LabelElement data();

        public abstract String preconditionId();

        public static TypeAdapter<LabelElementOverride> typeAdapter(Gson gson) {
            return new C$AutoValue_LabelElement_LabelElementOverride.GsonTypeAdapter(gson);
        }
    }
}
