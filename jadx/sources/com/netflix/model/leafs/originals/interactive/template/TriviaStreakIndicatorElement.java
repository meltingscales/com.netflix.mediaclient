package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaStreakIndicatorElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TriviaStreakIndicatorElement extends BaseLabelElement {
    public abstract StreakContainerElementChildren children();

    public static TypeAdapter<TriviaStreakIndicatorElement> typeAdapter(Gson gson) {
        return new C$AutoValue_TriviaStreakIndicatorElement.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, children());
        return arrayList;
    }

    public TriviaStreakIndicatorElement merge(TriviaStreakIndicatorElement triviaStreakIndicatorElement) {
        if (triviaStreakIndicatorElement == null) {
            return this;
        }
        return new AutoValue_TriviaStreakIndicatorElement(id() == null ? triviaStreakIndicatorElement.id() : id(), type() == null ? triviaStreakIndicatorElement.type() : type(), styleId() == null ? triviaStreakIndicatorElement.styleId() : styleId(), mergeVisualStateTransition(triviaStreakIndicatorElement.visualStateTransitions()), mergeVisualStates(triviaStreakIndicatorElement.visualStates()), text() == null ? triviaStreakIndicatorElement.text() : text(), preconditionTokens() == null ? triviaStreakIndicatorElement.preconditionTokens() : preconditionTokens(), children() == null ? triviaStreakIndicatorElement.children() : children().merge(triviaStreakIndicatorElement.children()));
    }

    /* loaded from: classes.dex */
    public static abstract class StreakContainerElementChildren extends Element {
        /* JADX INFO: Access modifiers changed from: package-private */
        @SerializedName("background")
        public abstract BackgroundImageElement backgroundData();

        /* JADX INFO: Access modifiers changed from: package-private */
        @SerializedName("label")
        public abstract LabelElement labelElement();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(2);
            Collections.addAll(arrayList, backgroundData(), labelElement());
            return arrayList;
        }

        public BackgroundImageElement background(InteractiveMoments interactiveMoments) {
            BackgroundImageElement backgroundData = backgroundData();
            if (backgroundData == null) {
                return null;
            }
            return backgroundData.override(interactiveMoments);
        }

        public LabelElement label(InteractiveMoments interactiveMoments) {
            LabelElement labelElement = labelElement();
            if (labelElement == null) {
                return null;
            }
            return labelElement.override(interactiveMoments);
        }

        public static TypeAdapter<StreakContainerElementChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren.GsonTypeAdapter(gson);
        }

        public StreakContainerElementChildren merge(StreakContainerElementChildren streakContainerElementChildren) {
            if (streakContainerElementChildren == null) {
                return this;
            }
            return new AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(id() == null ? streakContainerElementChildren.id() : id(), type() == null ? streakContainerElementChildren.type() : type(), styleId() == null ? streakContainerElementChildren.styleId() : styleId(), mergeVisualStateTransition(streakContainerElementChildren.visualStateTransitions()), mergeVisualStates(streakContainerElementChildren.visualStates()), backgroundData() == null ? streakContainerElementChildren.backgroundData() : backgroundData().merge(streakContainerElementChildren.backgroundData()), labelElement() == null ? streakContainerElementChildren.labelElement() : labelElement().merge(streakContainerElementChildren.labelElement()));
        }
    }
}
