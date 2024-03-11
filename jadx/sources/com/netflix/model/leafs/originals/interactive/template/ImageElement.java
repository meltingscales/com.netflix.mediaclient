package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.C$$$AutoValue_ImageElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ImageElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ImageElement_ImageElementOverride;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ImageElement extends BaseImageElement {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract ImageElement build();

        public abstract Builder setId(String str);

        public abstract Builder setImage(ImageAssetId imageAssetId);

        public abstract Builder setOverrides(List<ImageElementOverride> list);

        public abstract Builder setStyleId(String str);

        public abstract Builder setType(String str);

        public abstract Builder setVisualStateTransitions(Map<String, AnimationTemplateId> map);

        public abstract Builder setVisualStates(Map<String, VisualStateDefinition> map);
    }

    public abstract ImageAssetId image();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<ImageElementOverride> overrides();

    public abstract Builder toBuilder();

    @Override // com.netflix.model.leafs.originals.interactive.template.BaseImageElement
    public String assetId() {
        ImageAssetId image = image();
        if (image == null) {
            return null;
        }
        return image.assetId();
    }

    public static Builder builder() {
        return new C$$$AutoValue_ImageElement.Builder();
    }

    public ImageElement merge(ImageElement imageElement) {
        if (imageElement == null) {
            return this;
        }
        Builder builder = toBuilder();
        if (id() == null) {
            builder.setId(imageElement.id());
        }
        if (type() == null) {
            builder.setType(imageElement.type());
        }
        if (styleId() == null) {
            builder.setStyleId(imageElement.styleId());
        }
        if (visualStateTransitions() == null) {
            builder.setVisualStateTransitions(mergeVisualStateTransition(imageElement.visualStateTransitions()));
        }
        if (visualStates() == null) {
            builder.setVisualStates(mergeVisualStates(imageElement.visualStates()));
        }
        if (image() == null) {
            builder.setImage(imageElement.image());
        }
        return builder.build();
    }

    public static TypeAdapter<ImageElement> typeAdapter(Gson gson) {
        return new C$AutoValue_ImageElement.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public int hashCode() {
        int hashCode = super.hashCode();
        ImageAssetId image = image();
        return (hashCode ^ (image == null ? 0 : image.hashCode())) * 1000003;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof ImageElement)) {
            ImageAssetId image = image();
            ImageAssetId image2 = ((ImageElement) obj).image();
            if (image != null) {
                return image.equals(image2);
            }
            if (image2 == null) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static abstract class ImageElementOverride implements Parcelable {
        public abstract ImageElement data();

        public abstract String preconditionId();

        public static TypeAdapter<ImageElementOverride> typeAdapter(Gson gson) {
            return new C$AutoValue_ImageElement_ImageElementOverride.GsonTypeAdapter(gson);
        }
    }
}
