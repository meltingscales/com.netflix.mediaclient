package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren extends TriviaVerseScoreContainer.ScoreContainerChildren {
    private final ImageElement backgroundImage;
    private final String id;
    private final SimpleElement labelContainer;
    private final SimpleElement maxScore;
    private final SimpleElement score;
    private final String styleId;
    private final String type;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer.ScoreContainerChildren
    public ImageElement backgroundImage() {
        return this.backgroundImage;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer.ScoreContainerChildren
    public SimpleElement labelContainer() {
        return this.labelContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer.ScoreContainerChildren
    public SimpleElement maxScore() {
        return this.maxScore;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer.ScoreContainerChildren
    public SimpleElement score() {
        return this.score;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public Map<String, AnimationTemplateId> visualStateTransitions() {
        return this.visualStateTransitions;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public Map<String, VisualStateDefinition> visualStates() {
        return this.visualStates;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageElement imageElement, SimpleElement simpleElement, SimpleElement simpleElement2, SimpleElement simpleElement3) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.backgroundImage = imageElement;
        this.labelContainer = simpleElement;
        this.score = simpleElement2;
        this.maxScore = simpleElement3;
    }

    public String toString() {
        return "ScoreContainerChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", backgroundImage=" + this.backgroundImage + ", labelContainer=" + this.labelContainer + ", score=" + this.score + ", maxScore=" + this.maxScore + "}";
    }
}
