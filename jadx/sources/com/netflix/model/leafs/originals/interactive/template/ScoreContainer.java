package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ScoreContainer_ScoreContainerChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ScoreContainer extends Element {
    public abstract ScoreContainerChildren children();

    public static TypeAdapter<ScoreContainer> typeAdapter(Gson gson) {
        return new C$AutoValue_ScoreContainer.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, children());
        return arrayList;
    }

    public ScoreContainer merge(ScoreContainer scoreContainer) {
        if (scoreContainer == null) {
            return this;
        }
        return new AutoValue_ScoreContainer(id() == null ? scoreContainer.id() : id(), type() == null ? scoreContainer.type() : type(), styleId() == null ? scoreContainer.styleId() : styleId(), mergeVisualStateTransition(scoreContainer.visualStateTransitions()), mergeVisualStates(scoreContainer.visualStates()), children() == null ? scoreContainer.children() : children().merge(scoreContainer.children()));
    }

    /* loaded from: classes.dex */
    public static abstract class ScoreContainerChildren extends Element {
        public abstract ImageElement backgroundImage();

        public abstract SimpleElement labelContainer();

        public abstract SimpleElement maxScore();

        public abstract SimpleElement score();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(8);
            Collections.addAll(arrayList, backgroundImage(), score(), maxScore(), labelContainer());
            return arrayList;
        }

        public static TypeAdapter<ScoreContainerChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_ScoreContainer_ScoreContainerChildren.GsonTypeAdapter(gson);
        }

        public ScoreContainerChildren merge(ScoreContainerChildren scoreContainerChildren) {
            if (scoreContainerChildren == null) {
                return this;
            }
            return new AutoValue_ScoreContainer_ScoreContainerChildren(id() == null ? scoreContainerChildren.id() : id(), type() == null ? scoreContainerChildren.type() : type(), styleId() == null ? scoreContainerChildren.styleId() : styleId(), mergeVisualStateTransition(scoreContainerChildren.visualStateTransitions()), mergeVisualStates(scoreContainerChildren.visualStates()), backgroundImage() == null ? scoreContainerChildren.backgroundImage() : backgroundImage().merge(scoreContainerChildren.backgroundImage()), labelContainer() == null ? scoreContainerChildren.labelContainer() : labelContainer().merge(scoreContainerChildren.labelContainer()), score() == null ? scoreContainerChildren.score() : score().merge(scoreContainerChildren.score()), maxScore() == null ? scoreContainerChildren.maxScore() : maxScore().merge(scoreContainerChildren.score()));
        }
    }
}
