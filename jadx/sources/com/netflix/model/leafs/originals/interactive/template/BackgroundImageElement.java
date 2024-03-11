package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.C$$$AutoValue_BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_BackgroundImageElement_BackgroundImageElementOverride;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BackgroundImageElement extends BaseImageElement {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract BackgroundImageElement build();

        public abstract Builder setBackgroundImage(ImageAssetId imageAssetId);

        public abstract Builder setId(String str);

        public abstract Builder setOverrides(List<BackgroundImageElementOverride> list);

        public abstract Builder setStyleId(String str);

        public abstract Builder setType(String str);

        public abstract Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map);

        public abstract Builder setVisualStates(Map<String, VisualStateDefinition> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ImageAssetId backgroundImage();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<BackgroundImageElementOverride> overrides();

    public abstract Builder toBuilder();

    @Override // com.netflix.model.leafs.originals.interactive.template.BaseImageElement
    public String assetId() {
        ImageAssetId backgroundImage = backgroundImage();
        if (backgroundImage == null) {
            return null;
        }
        return backgroundImage.assetId();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement override(com.netflix.model.leafs.originals.interactive.InteractiveMoments r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.overrides()
            if (r0 == 0) goto L38
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement$BackgroundImageElementOverride r1 = (com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.BackgroundImageElementOverride) r1
            com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement r2 = r1.data()
            java.util.Map r3 = r5.preconditions()
            java.lang.String r1 = r1.preconditionId()
            java.lang.Object r1 = r3.get(r1)
            com.netflix.model.leafs.originals.interactive.condition.Condition r1 = (com.netflix.model.leafs.originals.interactive.condition.Condition) r1
            if (r1 == 0) goto L30
            boolean r1 = r1.meetsCondition(r5)
            if (r1 == 0) goto La
        L30:
            if (r2 != 0) goto L33
            return r4
        L33:
            com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement r5 = r2.merge(r4)
            return r5
        L38:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.override(com.netflix.model.leafs.originals.interactive.InteractiveMoments):com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement");
    }

    public static Builder builder() {
        return new C$$$AutoValue_BackgroundImageElement.Builder();
    }

    public BackgroundImageElement merge(BackgroundImageElement backgroundImageElement) {
        if (backgroundImageElement == null) {
            return this;
        }
        Builder builder = toBuilder();
        if (id() == null) {
            builder.setId(backgroundImageElement.id());
        }
        if (type() == null) {
            builder.setType(backgroundImageElement.type());
        }
        if (styleId() == null) {
            builder.setStyleId(backgroundImageElement.styleId());
        }
        if (visualStateTransitions() == null) {
            builder.setVisualStateTransitions(mergeVisualStateTransition(backgroundImageElement.visualStateTransitions()));
        }
        if (visualStates() == null) {
            builder.setVisualStates(mergeVisualStates(backgroundImageElement.visualStates()));
        }
        if (backgroundImage() == null) {
            builder.setBackgroundImage(backgroundImageElement.backgroundImage());
        }
        if (overrides() == null) {
            builder.setOverrides(backgroundImageElement.overrides());
        }
        return builder.build();
    }

    public static TypeAdapter<BackgroundImageElement> typeAdapter(Gson gson) {
        return new C$AutoValue_BackgroundImageElement.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public int hashCode() {
        int hashCode = super.hashCode();
        ImageAssetId backgroundImage = backgroundImage();
        return (hashCode ^ (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 1000003;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof BackgroundImageElement)) {
            ImageAssetId backgroundImage = backgroundImage();
            ImageAssetId backgroundImage2 = ((BackgroundImageElement) obj).backgroundImage();
            if (backgroundImage != null) {
                return backgroundImage.equals(backgroundImage2);
            }
            if (backgroundImage2 == null) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static abstract class BackgroundImageElementOverride implements Parcelable {
        public abstract BackgroundImageElement data();

        public abstract String preconditionId();

        public static TypeAdapter<BackgroundImageElementOverride> typeAdapter(Gson gson) {
            return new C$AutoValue_BackgroundImageElement_BackgroundImageElementOverride.GsonTypeAdapter(gson);
        }
    }
}
