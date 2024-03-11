package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Layout_Elements  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_UiDefinition_Layout_Elements extends UiDefinition.Layout.Elements {
    private final BackgroundImageElement backgroundData;
    private final SimpleElement category;
    private final SimpleElement categorySubtext;
    private final List<UiDefinition.Layout.Choice> choices;
    private final BackgroundImageElement controlsIcon;
    private final HeaderLayoutElement header;
    private final LabelElement leftPointsEarnedLabel;
    private final Notification notificationData;
    private final PlayerScoreContainerElement p1ScoreLabel;
    private final PlayerScoreContainerElement p2ScoreLabel;
    private final TriviaContainerElement resultsContent;
    private final LabelElement rightPointsEarnedLabel;
    private final ScoreContainer scoreContainer;
    private final TriviaStreakIndicatorElement streakIndicator;
    private final LayoutTimer timer;
    private final Notification toast;
    private final TriviaContainerElement tutorialContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    @SerializedName("background")
    public BackgroundImageElement backgroundData() {
        return this.backgroundData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public SimpleElement category() {
        return this.category;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public SimpleElement categorySubtext() {
        return this.categorySubtext;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public List<UiDefinition.Layout.Choice> choices() {
        return this.choices;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public BackgroundImageElement controlsIcon() {
        return this.controlsIcon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public HeaderLayoutElement header() {
        return this.header;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public LabelElement leftPointsEarnedLabel() {
        return this.leftPointsEarnedLabel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    @SerializedName(Moment.TYPE.NOTIFICATION)
    public Notification notificationData() {
        return this.notificationData;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public PlayerScoreContainerElement p1ScoreLabel() {
        return this.p1ScoreLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public PlayerScoreContainerElement p2ScoreLabel() {
        return this.p2ScoreLabel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public TriviaContainerElement resultsContent() {
        return this.resultsContent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public LabelElement rightPointsEarnedLabel() {
        return this.rightPointsEarnedLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public ScoreContainer scoreContainer() {
        return this.scoreContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public TriviaStreakIndicatorElement streakIndicator() {
        return this.streakIndicator;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public LayoutTimer timer() {
        return this.timer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public Notification toast() {
        return this.toast;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Elements
    public TriviaContainerElement tutorialContent() {
        return this.tutorialContent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Layout_Elements(HeaderLayoutElement headerLayoutElement, BackgroundImageElement backgroundImageElement, LayoutTimer layoutTimer, List<UiDefinition.Layout.Choice> list, Notification notification, Notification notification2, SimpleElement simpleElement, SimpleElement simpleElement2, ScoreContainer scoreContainer, PlayerScoreContainerElement playerScoreContainerElement, PlayerScoreContainerElement playerScoreContainerElement2, BackgroundImageElement backgroundImageElement2, TriviaStreakIndicatorElement triviaStreakIndicatorElement, LabelElement labelElement, LabelElement labelElement2, TriviaContainerElement triviaContainerElement, TriviaContainerElement triviaContainerElement2) {
        this.header = headerLayoutElement;
        this.backgroundData = backgroundImageElement;
        this.timer = layoutTimer;
        this.choices = list;
        this.notificationData = notification;
        this.toast = notification2;
        this.category = simpleElement;
        this.categorySubtext = simpleElement2;
        this.scoreContainer = scoreContainer;
        this.p1ScoreLabel = playerScoreContainerElement;
        this.p2ScoreLabel = playerScoreContainerElement2;
        this.controlsIcon = backgroundImageElement2;
        this.streakIndicator = triviaStreakIndicatorElement;
        this.leftPointsEarnedLabel = labelElement;
        this.rightPointsEarnedLabel = labelElement2;
        this.tutorialContent = triviaContainerElement;
        this.resultsContent = triviaContainerElement2;
    }

    public String toString() {
        return "Elements{header=" + this.header + ", backgroundData=" + this.backgroundData + ", timer=" + this.timer + ", choices=" + this.choices + ", notificationData=" + this.notificationData + ", toast=" + this.toast + ", category=" + this.category + ", categorySubtext=" + this.categorySubtext + ", scoreContainer=" + this.scoreContainer + ", p1ScoreLabel=" + this.p1ScoreLabel + ", p2ScoreLabel=" + this.p2ScoreLabel + ", controlsIcon=" + this.controlsIcon + ", streakIndicator=" + this.streakIndicator + ", leftPointsEarnedLabel=" + this.leftPointsEarnedLabel + ", rightPointsEarnedLabel=" + this.rightPointsEarnedLabel + ", tutorialContent=" + this.tutorialContent + ", resultsContent=" + this.resultsContent + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Layout.Elements) {
            UiDefinition.Layout.Elements elements = (UiDefinition.Layout.Elements) obj;
            HeaderLayoutElement headerLayoutElement = this.header;
            if (headerLayoutElement != null ? headerLayoutElement.equals(elements.header()) : elements.header() == null) {
                BackgroundImageElement backgroundImageElement = this.backgroundData;
                if (backgroundImageElement != null ? backgroundImageElement.equals(elements.backgroundData()) : elements.backgroundData() == null) {
                    LayoutTimer layoutTimer = this.timer;
                    if (layoutTimer != null ? layoutTimer.equals(elements.timer()) : elements.timer() == null) {
                        List<UiDefinition.Layout.Choice> list = this.choices;
                        if (list != null ? list.equals(elements.choices()) : elements.choices() == null) {
                            Notification notification = this.notificationData;
                            if (notification != null ? notification.equals(elements.notificationData()) : elements.notificationData() == null) {
                                Notification notification2 = this.toast;
                                if (notification2 != null ? notification2.equals(elements.toast()) : elements.toast() == null) {
                                    SimpleElement simpleElement = this.category;
                                    if (simpleElement != null ? simpleElement.equals(elements.category()) : elements.category() == null) {
                                        SimpleElement simpleElement2 = this.categorySubtext;
                                        if (simpleElement2 != null ? simpleElement2.equals(elements.categorySubtext()) : elements.categorySubtext() == null) {
                                            ScoreContainer scoreContainer = this.scoreContainer;
                                            if (scoreContainer != null ? scoreContainer.equals(elements.scoreContainer()) : elements.scoreContainer() == null) {
                                                PlayerScoreContainerElement playerScoreContainerElement = this.p1ScoreLabel;
                                                if (playerScoreContainerElement != null ? playerScoreContainerElement.equals(elements.p1ScoreLabel()) : elements.p1ScoreLabel() == null) {
                                                    PlayerScoreContainerElement playerScoreContainerElement2 = this.p2ScoreLabel;
                                                    if (playerScoreContainerElement2 != null ? playerScoreContainerElement2.equals(elements.p2ScoreLabel()) : elements.p2ScoreLabel() == null) {
                                                        BackgroundImageElement backgroundImageElement2 = this.controlsIcon;
                                                        if (backgroundImageElement2 != null ? backgroundImageElement2.equals(elements.controlsIcon()) : elements.controlsIcon() == null) {
                                                            TriviaStreakIndicatorElement triviaStreakIndicatorElement = this.streakIndicator;
                                                            if (triviaStreakIndicatorElement != null ? triviaStreakIndicatorElement.equals(elements.streakIndicator()) : elements.streakIndicator() == null) {
                                                                LabelElement labelElement = this.leftPointsEarnedLabel;
                                                                if (labelElement != null ? labelElement.equals(elements.leftPointsEarnedLabel()) : elements.leftPointsEarnedLabel() == null) {
                                                                    LabelElement labelElement2 = this.rightPointsEarnedLabel;
                                                                    if (labelElement2 != null ? labelElement2.equals(elements.rightPointsEarnedLabel()) : elements.rightPointsEarnedLabel() == null) {
                                                                        TriviaContainerElement triviaContainerElement = this.tutorialContent;
                                                                        if (triviaContainerElement != null ? triviaContainerElement.equals(elements.tutorialContent()) : elements.tutorialContent() == null) {
                                                                            TriviaContainerElement triviaContainerElement2 = this.resultsContent;
                                                                            if (triviaContainerElement2 == null) {
                                                                                if (elements.resultsContent() == null) {
                                                                                    return true;
                                                                                }
                                                                            } else if (triviaContainerElement2.equals(elements.resultsContent())) {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        HeaderLayoutElement headerLayoutElement = this.header;
        int hashCode = headerLayoutElement == null ? 0 : headerLayoutElement.hashCode();
        BackgroundImageElement backgroundImageElement = this.backgroundData;
        int hashCode2 = backgroundImageElement == null ? 0 : backgroundImageElement.hashCode();
        LayoutTimer layoutTimer = this.timer;
        int hashCode3 = layoutTimer == null ? 0 : layoutTimer.hashCode();
        List<UiDefinition.Layout.Choice> list = this.choices;
        int hashCode4 = list == null ? 0 : list.hashCode();
        Notification notification = this.notificationData;
        int hashCode5 = notification == null ? 0 : notification.hashCode();
        Notification notification2 = this.toast;
        int hashCode6 = notification2 == null ? 0 : notification2.hashCode();
        SimpleElement simpleElement = this.category;
        int hashCode7 = simpleElement == null ? 0 : simpleElement.hashCode();
        SimpleElement simpleElement2 = this.categorySubtext;
        int hashCode8 = simpleElement2 == null ? 0 : simpleElement2.hashCode();
        ScoreContainer scoreContainer = this.scoreContainer;
        int hashCode9 = scoreContainer == null ? 0 : scoreContainer.hashCode();
        PlayerScoreContainerElement playerScoreContainerElement = this.p1ScoreLabel;
        int hashCode10 = playerScoreContainerElement == null ? 0 : playerScoreContainerElement.hashCode();
        PlayerScoreContainerElement playerScoreContainerElement2 = this.p2ScoreLabel;
        int hashCode11 = playerScoreContainerElement2 == null ? 0 : playerScoreContainerElement2.hashCode();
        BackgroundImageElement backgroundImageElement2 = this.controlsIcon;
        int hashCode12 = backgroundImageElement2 == null ? 0 : backgroundImageElement2.hashCode();
        TriviaStreakIndicatorElement triviaStreakIndicatorElement = this.streakIndicator;
        int hashCode13 = triviaStreakIndicatorElement == null ? 0 : triviaStreakIndicatorElement.hashCode();
        LabelElement labelElement = this.leftPointsEarnedLabel;
        int hashCode14 = labelElement == null ? 0 : labelElement.hashCode();
        LabelElement labelElement2 = this.rightPointsEarnedLabel;
        int hashCode15 = labelElement2 == null ? 0 : labelElement2.hashCode();
        TriviaContainerElement triviaContainerElement = this.tutorialContent;
        int hashCode16 = triviaContainerElement == null ? 0 : triviaContainerElement.hashCode();
        TriviaContainerElement triviaContainerElement2 = this.resultsContent;
        return ((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ (triviaContainerElement2 == null ? 0 : triviaContainerElement2.hashCode());
    }
}
