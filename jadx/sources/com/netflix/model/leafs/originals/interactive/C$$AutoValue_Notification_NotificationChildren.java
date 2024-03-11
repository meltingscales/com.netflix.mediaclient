package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaThemeContainer;
import com.netflix.model.leafs.originals.interactive.template.UnlockContainer;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Notification_NotificationChildren  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Notification_NotificationChildren extends Notification.NotificationChildren {
    private final ImageElement background;
    private final SimpleElement body;
    private final SimpleElement contentContainer;
    private final SimpleElement currentScoreDescription;
    private final SimpleElement divider;
    private final SimpleElement header;
    private final ImageElement icon;
    private final String id;
    private final ImageElement image;
    private final ImageElement image1;
    private final ImageElement image2;
    private final ImageElement image3;
    private final ImageElement label;
    private final ImageElement leftCap;
    private final SimpleElement nextPlayerHeader;
    private final SimpleElement nextPlayerSubHeader;
    private final PlayerScoreContainerElement p1ScoreContainer;
    private final PlayerScoreContainerElement p1ScoreContainer2;
    private final PlayerScoreContainerElement p2ScoreContainer;
    private final PlayerScoreContainerElement p2ScoreContainer2;
    private final SimpleElement pointsLabel;
    private final ImageElement rightCap;
    private final ScoreContainer scoreContainer;
    private final ImageElement shareButton;
    private final String styleId;
    private final SimpleElement subHeader;
    private final BackgroundImageElement targetScoreContainer;
    private final SimpleElement targetScoreText;
    private final SimpleElement textContainer;
    private final TriviaThemeContainer themeContainer;
    private final String type;
    private final UnlockContainer unlockContainer;
    private final SimpleElement unlockLabel;
    private final SimpleElement valueLabel;
    private final Map<String, AnimationTemplateId> visualStateTransitions;
    private final Map<String, VisualStateDefinition> visualStates;

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement background() {
        return this.background;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement body() {
        return this.body;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement contentContainer() {
        return this.contentContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement currentScoreDescription() {
        return this.currentScoreDescription;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement divider() {
        return this.divider;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement header() {
        return this.header;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement icon() {
        return this.icon;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement image() {
        return this.image;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement image1() {
        return this.image1;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement image2() {
        return this.image2;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement image3() {
        return this.image3;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement leftCap() {
        return this.leftCap;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement nextPlayerHeader() {
        return this.nextPlayerHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement nextPlayerSubHeader() {
        return this.nextPlayerSubHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public PlayerScoreContainerElement p1ScoreContainer() {
        return this.p1ScoreContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public PlayerScoreContainerElement p1ScoreContainer2() {
        return this.p1ScoreContainer2;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public PlayerScoreContainerElement p2ScoreContainer() {
        return this.p2ScoreContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public PlayerScoreContainerElement p2ScoreContainer2() {
        return this.p2ScoreContainer2;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement pointsLabel() {
        return this.pointsLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement rightCap() {
        return this.rightCap;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ScoreContainer scoreContainer() {
        return this.scoreContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public ImageElement shareButton() {
        return this.shareButton;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String styleId() {
        return this.styleId;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement subHeader() {
        return this.subHeader;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public BackgroundImageElement targetScoreContainer() {
        return this.targetScoreContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement targetScoreText() {
        return this.targetScoreText;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement textContainer() {
        return this.textContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public TriviaThemeContainer themeContainer() {
        return this.themeContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public String type() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public UnlockContainer unlockContainer() {
        return this.unlockContainer;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement unlockLabel() {
        return this.unlockLabel;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationChildren
    public SimpleElement valueLabel() {
        return this.valueLabel;
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
    public C$$AutoValue_Notification_NotificationChildren(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, ImageElement imageElement, ImageElement imageElement2, ImageElement imageElement3, ImageElement imageElement4, ImageElement imageElement5, SimpleElement simpleElement, SimpleElement simpleElement2, SimpleElement simpleElement3, ImageElement imageElement6, SimpleElement simpleElement4, SimpleElement simpleElement5, SimpleElement simpleElement6, ImageElement imageElement7, ImageElement imageElement8, ImageElement imageElement9, SimpleElement simpleElement7, ScoreContainer scoreContainer, SimpleElement simpleElement8, UnlockContainer unlockContainer, ImageElement imageElement10, TriviaThemeContainer triviaThemeContainer, BackgroundImageElement backgroundImageElement, SimpleElement simpleElement9, SimpleElement simpleElement10, SimpleElement simpleElement11, SimpleElement simpleElement12, PlayerScoreContainerElement playerScoreContainerElement, PlayerScoreContainerElement playerScoreContainerElement2, PlayerScoreContainerElement playerScoreContainerElement3, PlayerScoreContainerElement playerScoreContainerElement4, SimpleElement simpleElement13) {
        this.id = str;
        this.type = str2;
        this.styleId = str3;
        this.visualStateTransitions = map;
        this.visualStates = map2;
        this.label = imageElement;
        this.icon = imageElement2;
        this.background = imageElement3;
        this.leftCap = imageElement4;
        this.rightCap = imageElement5;
        this.divider = simpleElement;
        this.header = simpleElement2;
        this.valueLabel = simpleElement3;
        this.image = imageElement6;
        this.body = simpleElement4;
        this.contentContainer = simpleElement5;
        this.textContainer = simpleElement6;
        this.image1 = imageElement7;
        this.image2 = imageElement8;
        this.image3 = imageElement9;
        this.pointsLabel = simpleElement7;
        this.scoreContainer = scoreContainer;
        this.unlockLabel = simpleElement8;
        this.unlockContainer = unlockContainer;
        this.shareButton = imageElement10;
        this.themeContainer = triviaThemeContainer;
        this.targetScoreContainer = backgroundImageElement;
        this.targetScoreText = simpleElement9;
        this.nextPlayerHeader = simpleElement10;
        this.nextPlayerSubHeader = simpleElement11;
        this.subHeader = simpleElement12;
        this.p1ScoreContainer = playerScoreContainerElement;
        this.p1ScoreContainer2 = playerScoreContainerElement2;
        this.p2ScoreContainer = playerScoreContainerElement3;
        this.p2ScoreContainer2 = playerScoreContainerElement4;
        this.currentScoreDescription = simpleElement13;
    }

    public String toString() {
        return "NotificationChildren{id=" + this.id + ", type=" + this.type + ", styleId=" + this.styleId + ", visualStateTransitions=" + this.visualStateTransitions + ", visualStates=" + this.visualStates + ", label=" + this.label + ", icon=" + this.icon + ", background=" + this.background + ", leftCap=" + this.leftCap + ", rightCap=" + this.rightCap + ", divider=" + this.divider + ", header=" + this.header + ", valueLabel=" + this.valueLabel + ", image=" + this.image + ", body=" + this.body + ", contentContainer=" + this.contentContainer + ", textContainer=" + this.textContainer + ", image1=" + this.image1 + ", image2=" + this.image2 + ", image3=" + this.image3 + ", pointsLabel=" + this.pointsLabel + ", scoreContainer=" + this.scoreContainer + ", unlockLabel=" + this.unlockLabel + ", unlockContainer=" + this.unlockContainer + ", shareButton=" + this.shareButton + ", themeContainer=" + this.themeContainer + ", targetScoreContainer=" + this.targetScoreContainer + ", targetScoreText=" + this.targetScoreText + ", nextPlayerHeader=" + this.nextPlayerHeader + ", nextPlayerSubHeader=" + this.nextPlayerSubHeader + ", subHeader=" + this.subHeader + ", p1ScoreContainer=" + this.p1ScoreContainer + ", p1ScoreContainer2=" + this.p1ScoreContainer2 + ", p2ScoreContainer=" + this.p2ScoreContainer + ", p2ScoreContainer2=" + this.p2ScoreContainer2 + ", currentScoreDescription=" + this.currentScoreDescription + "}";
    }
}
