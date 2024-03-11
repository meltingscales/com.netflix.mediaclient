package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PlayerScoreContainerElement extends Element {
    public abstract LabelWithBackgroundContainerChildren children();

    public static TypeAdapter<PlayerScoreContainerElement> typeAdapter(Gson gson) {
        return new C$AutoValue_PlayerScoreContainerElement.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, children());
        return arrayList;
    }

    public PlayerScoreContainerElement merge(PlayerScoreContainerElement playerScoreContainerElement) {
        if (playerScoreContainerElement == null) {
            return this;
        }
        return new AutoValue_PlayerScoreContainerElement(id() == null ? playerScoreContainerElement.id() : id(), type() == null ? playerScoreContainerElement.type() : type(), styleId() == null ? playerScoreContainerElement.styleId() : styleId(), mergeVisualStateTransition(playerScoreContainerElement.visualStateTransitions()), mergeVisualStates(playerScoreContainerElement.visualStates()), children() == null ? playerScoreContainerElement.children() : children().merge(playerScoreContainerElement.children()));
    }

    /* loaded from: classes.dex */
    public static abstract class LabelWithBackgroundContainerChildren extends Element {
        /* JADX INFO: Access modifiers changed from: package-private */
        @SerializedName("background")
        public abstract BackgroundImageElement backgroundData();

        public abstract LabelElement playerIdLabel();

        public abstract LabelElement playerScoreLabel();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(8);
            Collections.addAll(arrayList, backgroundData(), playerIdLabel(), playerScoreLabel());
            return arrayList;
        }

        public BackgroundImageElement background(InteractiveMoments interactiveMoments) {
            BackgroundImageElement backgroundData = backgroundData();
            if (backgroundData == null) {
                return null;
            }
            return backgroundData.override(interactiveMoments);
        }

        public static TypeAdapter<LabelWithBackgroundContainerChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren.GsonTypeAdapter(gson);
        }

        public LabelWithBackgroundContainerChildren merge(LabelWithBackgroundContainerChildren labelWithBackgroundContainerChildren) {
            if (labelWithBackgroundContainerChildren == null) {
                return this;
            }
            return new AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren(id() == null ? labelWithBackgroundContainerChildren.id() : id(), type() == null ? labelWithBackgroundContainerChildren.type() : type(), styleId() == null ? labelWithBackgroundContainerChildren.styleId() : styleId(), mergeVisualStateTransition(labelWithBackgroundContainerChildren.visualStateTransitions()), mergeVisualStates(labelWithBackgroundContainerChildren.visualStates()), backgroundData() == null ? labelWithBackgroundContainerChildren.backgroundData() : backgroundData().merge(labelWithBackgroundContainerChildren.backgroundData()), playerIdLabel() == null ? labelWithBackgroundContainerChildren.playerIdLabel() : playerIdLabel().merge(labelWithBackgroundContainerChildren.playerIdLabel()), playerScoreLabel() == null ? labelWithBackgroundContainerChildren.playerScoreLabel() : playerScoreLabel().merge(labelWithBackgroundContainerChildren.playerScoreLabel()));
        }
    }
}
