package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ElementV2;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ElementV2_ElementV2Override;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class ElementV2 extends BaseImageElement implements ElementChildrenList {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ImageAssetId backgroundImage();

    public abstract List<ElementV2> childrenList();

    public abstract ImageAssetId image();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<ElementV2Override> overrides();

    public abstract Map<String, String> preconditionTokens();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String text();

    public static TypeAdapter<ElementV2> typeAdapter(Gson gson) {
        return new C$AutoValue_ElementV2.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.BaseImageElement
    public String assetId() {
        ImageAssetId backgroundImage = image() == null ? backgroundImage() : image();
        if (backgroundImage != null) {
            return backgroundImage.assetId();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        List<ElementV2> childrenList = childrenList();
        if (childrenList != null) {
            return new ArrayList(childrenList);
        }
        return null;
    }

    public ElementV2 override(InteractiveMoments interactiveMoments) {
        List<ElementV2Override> overrides = overrides();
        if (overrides != null) {
            for (ElementV2Override elementV2Override : overrides) {
                ElementV2 data = elementV2Override.data();
                Condition condition = interactiveMoments.preconditions().get(elementV2Override.preconditionId());
                if (elementV2Override.preconditionId() == null || (condition != null && condition.meetsCondition(interactiveMoments))) {
                    return data == null ? this : merge(data);
                }
            }
        }
        return this;
    }

    public String text(InteractiveMoments interactiveMoments) {
        String str;
        Map<String, String> preconditionTokens = preconditionTokens();
        String text = text();
        if (C8168dfL.h(text) && preconditionTokens != null && preconditionTokens.size() > 0) {
            for (Map.Entry<String, String> entry : preconditionTokens.entrySet()) {
                Condition condition = interactiveMoments.preconditions().get(entry.getKey());
                if (condition != null) {
                    JsonElement value = condition.getValue(interactiveMoments);
                    if (value == null || !value.isJsonPrimitive()) {
                        str = "";
                    } else if (value.getAsJsonPrimitive().isNumber()) {
                        str = String.valueOf(value.getAsJsonPrimitive().getAsInt());
                    } else {
                        str = value.getAsJsonPrimitive().getAsString();
                    }
                    text = text.replace(entry.getValue(), str);
                }
            }
        }
        return text;
    }

    private ElementV2 merge(ElementV2 elementV2) {
        if (elementV2 == null) {
            return this;
        }
        List<ElementV2> childrenList = childrenList();
        if (childrenList == null) {
            childrenList = elementV2.childrenList();
        } else if (elementV2.childrenList() != null) {
            childrenList.addAll(elementV2.childrenList());
        }
        return new AutoValue_ElementV2(elementV2.id() != null ? elementV2.id() : id(), elementV2.type() != null ? elementV2.type() : type(), elementV2.styleId() != null ? elementV2.styleId() : styleId(), mergeVisualStateTransition(elementV2.visualStateTransitions()), mergeVisualStates(elementV2.visualStates()), elementV2.backgroundImage() != null ? elementV2.backgroundImage() : backgroundImage(), elementV2.image() != null ? elementV2.image() : image(), childrenList, elementV2.overrides() != null ? elementV2.overrides() : overrides(), elementV2.text() != null ? elementV2.text() : text(), elementV2.preconditionTokens() != null ? elementV2.preconditionTokens() : preconditionTokens());
    }

    /* loaded from: classes.dex */
    public static abstract class ElementV2Override implements Parcelable {
        public abstract ElementV2 data();

        public abstract String preconditionId();

        public static TypeAdapter<ElementV2Override> typeAdapter(Gson gson) {
            return new C$AutoValue_ElementV2_ElementV2Override.GsonTypeAdapter(gson);
        }
    }
}
