package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.AutoValue_Notification_NotificationOverride;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Notification;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Notification_NotificationChildren;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.Element;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaThemeContainer;
import com.netflix.model.leafs.originals.interactive.template.UnlockContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Notification extends Element {
    public abstract NotificationChildren children();

    public abstract List<NotificationOverride> overrides();

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        NotificationChildren children = children();
        if (children == null) {
            return null;
        }
        Collections.addAll(arrayList, children);
        return arrayList;
    }

    public Notification merge(Notification notification) {
        if (notification == null) {
            return this;
        }
        return new AutoValue_Notification(id() == null ? notification.id() : id(), type() == null ? notification.type() : type(), styleId() == null ? notification.styleId() : styleId(), visualStateTransitions() == null ? notification.visualStateTransitions() : visualStateTransitions(), visualStates() == null ? notification.visualStates() : visualStates(), children() == null ? notification.children() : children().merge(notification.children()), overrides() == null ? notification.overrides() : overrides());
    }

    /* loaded from: classes.dex */
    public static abstract class NotificationOverride {
        public abstract Notification data();

        public abstract String preconditionId();

        public static TypeAdapter<NotificationOverride> typeAdapter(Gson gson) {
            return new AutoValue_Notification_NotificationOverride.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class NotificationChildren extends Element {
        public abstract ImageElement background();

        public abstract SimpleElement body();

        public abstract SimpleElement contentContainer();

        public abstract SimpleElement currentScoreDescription();

        public abstract SimpleElement divider();

        public abstract SimpleElement header();

        public abstract ImageElement icon();

        public abstract ImageElement image();

        public abstract ImageElement image1();

        public abstract ImageElement image2();

        public abstract ImageElement image3();

        public abstract ImageElement label();

        public abstract ImageElement leftCap();

        public abstract SimpleElement nextPlayerHeader();

        public abstract SimpleElement nextPlayerSubHeader();

        public abstract PlayerScoreContainerElement p1ScoreContainer();

        public abstract PlayerScoreContainerElement p1ScoreContainer2();

        public abstract PlayerScoreContainerElement p2ScoreContainer();

        public abstract PlayerScoreContainerElement p2ScoreContainer2();

        public abstract SimpleElement pointsLabel();

        public abstract ImageElement rightCap();

        public abstract ScoreContainer scoreContainer();

        public abstract ImageElement shareButton();

        public abstract SimpleElement subHeader();

        public abstract BackgroundImageElement targetScoreContainer();

        public abstract SimpleElement targetScoreText();

        public abstract SimpleElement textContainer();

        public abstract TriviaThemeContainer themeContainer();

        public abstract UnlockContainer unlockContainer();

        public abstract SimpleElement unlockLabel();

        public abstract SimpleElement valueLabel();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(8);
            Collections.addAll(arrayList, label(), icon(), background(), leftCap(), rightCap(), divider(), header(), valueLabel(), image(), body(), contentContainer(), textContainer(), image1(), image2(), image3(), pointsLabel(), scoreContainer(), unlockLabel(), unlockContainer(), shareButton(), themeContainer(), targetScoreContainer(), nextPlayerHeader(), subHeader(), nextPlayerSubHeader(), targetScoreText(), p1ScoreContainer(), p1ScoreContainer2(), p2ScoreContainer(), p2ScoreContainer2(), currentScoreDescription());
            return arrayList;
        }

        public static TypeAdapter<NotificationChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_Notification_NotificationChildren.GsonTypeAdapter(gson);
        }

        public NotificationChildren merge(NotificationChildren notificationChildren) {
            if (notificationChildren == null) {
                return this;
            }
            return new AutoValue_Notification_NotificationChildren(id() == null ? notificationChildren.id() : id(), type() == null ? notificationChildren.type() : type(), styleId() == null ? notificationChildren.styleId() : styleId(), visualStateTransitions() == null ? notificationChildren.visualStateTransitions() : visualStateTransitions(), visualStates() == null ? notificationChildren.visualStates() : visualStates(), label() == null ? notificationChildren.label() : label().merge(notificationChildren.label()), icon() == null ? notificationChildren.icon() : icon().merge(notificationChildren.icon()), background() == null ? notificationChildren.background() : background().merge(notificationChildren.background()), leftCap() == null ? notificationChildren.leftCap() : leftCap().merge(notificationChildren.leftCap()), rightCap() == null ? notificationChildren.rightCap() : rightCap().merge(notificationChildren.rightCap()), divider() == null ? notificationChildren.divider() : divider().merge(notificationChildren.divider()), header() == null ? notificationChildren.header() : header().merge(notificationChildren.header()), valueLabel() == null ? notificationChildren.valueLabel() : valueLabel().merge(notificationChildren.valueLabel()), image() == null ? notificationChildren.image() : image().merge(notificationChildren.image()), body() == null ? notificationChildren.body() : body().merge(notificationChildren.body()), contentContainer() == null ? notificationChildren.contentContainer() : contentContainer().merge(notificationChildren.contentContainer()), textContainer() == null ? notificationChildren.textContainer() : textContainer().merge(notificationChildren.textContainer()), image1() == null ? notificationChildren.image1() : image1().merge(notificationChildren.image1()), image2() == null ? notificationChildren.image2() : image2().merge(notificationChildren.image2()), image3() == null ? notificationChildren.image3() : image3().merge(notificationChildren.image3()), pointsLabel() == null ? notificationChildren.pointsLabel() : pointsLabel().merge(notificationChildren.pointsLabel()), scoreContainer() == null ? notificationChildren.scoreContainer() : scoreContainer().merge(notificationChildren.scoreContainer()), unlockLabel() == null ? notificationChildren.unlockLabel() : unlockLabel().merge(notificationChildren.unlockLabel()), unlockContainer() == null ? notificationChildren.unlockContainer() : unlockContainer().merge(notificationChildren.unlockContainer()), shareButton() == null ? notificationChildren.shareButton() : shareButton().merge(notificationChildren.shareButton()), themeContainer() == null ? notificationChildren.themeContainer() : themeContainer().merge(notificationChildren.themeContainer()), targetScoreContainer() == null ? notificationChildren.targetScoreContainer() : targetScoreContainer().merge(notificationChildren.targetScoreContainer()), targetScoreText() == null ? notificationChildren.targetScoreText() : targetScoreText().merge(notificationChildren.targetScoreText()), nextPlayerHeader() == null ? notificationChildren.nextPlayerHeader() : nextPlayerHeader().merge(notificationChildren.nextPlayerHeader()), nextPlayerSubHeader() == null ? notificationChildren.nextPlayerSubHeader() : nextPlayerSubHeader().merge(notificationChildren.nextPlayerSubHeader()), subHeader() == null ? notificationChildren.subHeader() : subHeader().merge(notificationChildren.subHeader()), p1ScoreContainer() == null ? notificationChildren.p1ScoreContainer() : p1ScoreContainer().merge(notificationChildren.p1ScoreContainer()), p1ScoreContainer2() == null ? notificationChildren.p1ScoreContainer2() : p1ScoreContainer2().merge(notificationChildren.p1ScoreContainer2()), p2ScoreContainer() == null ? notificationChildren.p2ScoreContainer() : p2ScoreContainer().merge(notificationChildren.p2ScoreContainer()), p2ScoreContainer2() == null ? notificationChildren.p2ScoreContainer2() : p2ScoreContainer2().merge(notificationChildren.p2ScoreContainer2()), currentScoreDescription() == null ? notificationChildren.currentScoreDescription() : currentScoreDescription().merge(notificationChildren.currentScoreDescription()));
        }
    }

    public static TypeAdapter<Notification> typeAdapter(Gson gson) {
        return new C$AutoValue_Notification.GsonTypeAdapter(gson);
    }
}
