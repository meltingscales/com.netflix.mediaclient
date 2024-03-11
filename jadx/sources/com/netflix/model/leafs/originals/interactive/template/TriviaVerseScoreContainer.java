package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaVerseScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TriviaVerseScoreContainer extends Element {
    public abstract ScoreContainerChildren children();

    public static TypeAdapter<TriviaVerseScoreContainer> typeAdapter(Gson gson) {
        return new C$AutoValue_TriviaVerseScoreContainer.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, children());
        return arrayList;
    }

    public TriviaVerseScoreContainer merge(TriviaVerseScoreContainer triviaVerseScoreContainer) {
        if (triviaVerseScoreContainer == null) {
            return this;
        }
        return new AutoValue_TriviaVerseScoreContainer(id() == null ? triviaVerseScoreContainer.id() : id(), type() == null ? triviaVerseScoreContainer.type() : type(), styleId() == null ? triviaVerseScoreContainer.styleId() : styleId(), mergeVisualStateTransition(triviaVerseScoreContainer.visualStateTransitions()), mergeVisualStates(triviaVerseScoreContainer.visualStates()), children() == null ? triviaVerseScoreContainer.children() : children().merge(triviaVerseScoreContainer.children()));
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
            return new C$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren.GsonTypeAdapter(gson);
        }

        public ScoreContainerChildren merge(ScoreContainerChildren scoreContainerChildren) {
            if (scoreContainerChildren == null) {
                return this;
            }
            return new AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(id() == null ? scoreContainerChildren.id() : id(), type() == null ? scoreContainerChildren.type() : type(), styleId() == null ? scoreContainerChildren.styleId() : styleId(), mergeVisualStateTransition(scoreContainerChildren.visualStateTransitions()), mergeVisualStates(scoreContainerChildren.visualStates()), backgroundImage() == null ? scoreContainerChildren.backgroundImage() : backgroundImage().merge(scoreContainerChildren.backgroundImage()), labelContainer() == null ? scoreContainerChildren.labelContainer() : labelContainer().merge(scoreContainerChildren.labelContainer()), score() == null ? scoreContainerChildren.score() : score().merge(scoreContainerChildren.score()), maxScore() == null ? scoreContainerChildren.maxScore() : maxScore().merge(scoreContainerChildren.score()));
        }
    }
}
