package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_AudioListAsset;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Config;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Config_Logging;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Config_Logging_Moment;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout_Choice;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout_Config;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout_Config_SubtitleRect;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition_Layout_Elements;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.Element;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class UiDefinition implements Parcelable {
    public abstract Config config();

    public abstract Map<String, Layout> layouts();

    public abstract Map<String, Style> styles();

    /* loaded from: classes.dex */
    public static abstract class Layout implements BaseLayout {
        @Override // com.netflix.model.leafs.originals.interactive.BaseLayout
        public abstract AssetManifest assetManifest();

        public abstract Map<String, AudioListAsset> audio();

        public abstract Config config();

        public abstract Map<String, Map<String, List<InteractiveAnimation>>> elementAnimations();

        public abstract Elements elements();

        public abstract Map<String, TransitionDefinitions> visualStateTransitionDefinitions();

        /* loaded from: classes.dex */
        public static abstract class Elements implements Parcelable {
            /* JADX INFO: Access modifiers changed from: package-private */
            @SerializedName("background")
            public abstract BackgroundImageElement backgroundData();

            public abstract SimpleElement category();

            public abstract SimpleElement categorySubtext();

            public abstract List<Choice> choices();

            public abstract BackgroundImageElement controlsIcon();

            public abstract HeaderLayoutElement header();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract LabelElement leftPointsEarnedLabel();

            /* JADX INFO: Access modifiers changed from: package-private */
            @SerializedName(Moment.TYPE.NOTIFICATION)
            public abstract Notification notificationData();

            public abstract PlayerScoreContainerElement p1ScoreLabel();

            public abstract PlayerScoreContainerElement p2ScoreLabel();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract TriviaContainerElement resultsContent();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract LabelElement rightPointsEarnedLabel();

            public abstract ScoreContainer scoreContainer();

            public abstract TriviaStreakIndicatorElement streakIndicator();

            public abstract LayoutTimer timer();

            public abstract Notification toast();

            public abstract TriviaContainerElement tutorialContent();

            public BackgroundImageElement background(InteractiveMoments interactiveMoments) {
                BackgroundImageElement backgroundData = backgroundData();
                if (backgroundData == null) {
                    return null;
                }
                return backgroundData.override(interactiveMoments);
            }

            public Notification notification(InteractiveMoments interactiveMoments) {
                Notification notificationData = notificationData();
                if (notificationData == null) {
                    return null;
                }
                List<Notification.NotificationOverride> overrides = notificationData.overrides();
                if (overrides != null) {
                    for (Notification.NotificationOverride notificationOverride : overrides) {
                        String preconditionId = notificationOverride.preconditionId();
                        Condition condition = interactiveMoments.preconditions().get(preconditionId);
                        if (preconditionId == null || (condition != null && condition.meetsCondition(interactiveMoments))) {
                            return notificationOverride.data().merge(notificationData);
                        }
                    }
                }
                return notificationData;
            }

            public LabelElement leftPointsEarnedLabel(InteractiveMoments interactiveMoments) {
                LabelElement leftPointsEarnedLabel = leftPointsEarnedLabel();
                if (leftPointsEarnedLabel == null) {
                    return null;
                }
                return leftPointsEarnedLabel.override(interactiveMoments);
            }

            public LabelElement rightPointsEarnedLabel(InteractiveMoments interactiveMoments) {
                LabelElement rightPointsEarnedLabel = rightPointsEarnedLabel();
                if (rightPointsEarnedLabel == null) {
                    return null;
                }
                return rightPointsEarnedLabel.override(interactiveMoments);
            }

            public TriviaContainerElement resultsContent(InteractiveMoments interactiveMoments) {
                TriviaContainerElement resultsContent = resultsContent();
                if (resultsContent != null) {
                    return resultsContent.override(interactiveMoments);
                }
                return null;
            }

            public static TypeAdapter<Elements> typeAdapter(Gson gson) {
                return new C$AutoValue_UiDefinition_Layout_Elements.GsonTypeAdapter(gson);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class Config implements Parcelable {
            public abstract Boolean autoSelectChoiceOnTimeout();

            public abstract Size canvasSize();

            public abstract Integer choiceMaxWidth();

            public abstract Integer choiceMinWidth();

            public abstract Integer choiceSpacing();

            public abstract boolean choicesSupportFallbackLabel();

            public abstract Boolean disableToggleDefault();

            public abstract boolean enablePrefetchingDuringPlayback();

            public abstract boolean pauseAnimations();

            public abstract Boolean queueSelectedChoice();

            public abstract Integer resultsMaxWidth();

            /* JADX INFO: Access modifiers changed from: package-private */
            @SerializedName("subtitlesRect")
            public abstract SubtitleRect subRect();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract SubtitleRect subtitleRect();

            public SubtitleRect subtitlesRect() {
                SubtitleRect subRect = subRect();
                return subRect == null ? subtitleRect() : subRect;
            }

            /* loaded from: classes.dex */
            public static abstract class SubtitleRect implements Parcelable {
                public abstract int height();

                public abstract int y();

                public static TypeAdapter<SubtitleRect> typeAdapter(Gson gson) {
                    return new C$AutoValue_UiDefinition_Layout_Config_SubtitleRect.GsonTypeAdapter(gson);
                }
            }

            public static TypeAdapter<Config> typeAdapter(Gson gson) {
                return new C$AutoValue_UiDefinition_Layout_Config.GsonTypeAdapter(gson).setDefaultCanvasSize(new AutoValue_Size(1080, 720)).setDefaultAutoSelectChoiceOnTimeout(Boolean.TRUE);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class Choice extends Element {
            public abstract ChoiceChildren children();

            public Choice merge(Choice choice) {
                if (choice == null) {
                    return this;
                }
                return new AutoValue_UiDefinition_Layout_Choice(id() == null ? choice.id() : id(), type() == null ? choice.type() : type(), styleId() == null ? choice.styleId() : styleId(), visualStateTransitions() == null ? choice.visualStateTransitions() : visualStateTransitions(), visualStates() == null ? choice.visualStates() : visualStates(), children() == null ? choice.children() : children().merge(choice.children()));
            }

            @Override // com.netflix.model.leafs.originals.interactive.template.Element
            public List<Element> elementChildList() {
                ArrayList arrayList = new ArrayList(1);
                ChoiceChildren children = children();
                if (children == null) {
                    return null;
                }
                Collections.addAll(arrayList, children);
                return arrayList;
            }

            /* loaded from: classes.dex */
            public static abstract class ChoiceChildren extends Element {
                public abstract ImageElement accessoryView();

                public abstract ImageElement background();

                public abstract ImageElement foreground();

                public abstract ImageElement foregroundMask();

                public abstract ImageElement icon();

                public abstract SimpleElement label();

                public abstract ImageElement scrim();

                public abstract ToolTipElement tooltipContainer();

                public abstract ImageElement underline();

                public abstract SimpleElement valueLabel();

                @Override // com.netflix.model.leafs.originals.interactive.template.Element
                public List<Element> elementChildList() {
                    ArrayList arrayList = new ArrayList(1);
                    Collections.addAll(arrayList, label(), icon(), background(), valueLabel(), foregroundMask(), scrim(), tooltipContainer(), underline(), foreground(), accessoryView());
                    return arrayList;
                }

                public static TypeAdapter<ChoiceChildren> typeAdapter(Gson gson) {
                    return new C$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren.GsonTypeAdapter(gson);
                }

                public ChoiceChildren merge(ChoiceChildren choiceChildren) {
                    if (choiceChildren == null) {
                        return this;
                    }
                    return new AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(id() == null ? choiceChildren.id() : id(), type() == null ? choiceChildren.type() : type(), styleId() == null ? choiceChildren.styleId() : styleId(), visualStateTransitions() == null ? choiceChildren.visualStateTransitions() : visualStateTransitions(), visualStates() == null ? choiceChildren.visualStates() : visualStates(), label() == null ? choiceChildren.label() : label().merge(choiceChildren.label()), icon() == null ? choiceChildren.icon() : icon().merge(choiceChildren.icon()), background() == null ? choiceChildren.background() : background().merge(choiceChildren.background()), underline() == null ? choiceChildren.underline() : underline().merge(choiceChildren.underline()), valueLabel() == null ? choiceChildren.valueLabel() : valueLabel().merge(choiceChildren.valueLabel()), tooltipContainer() == null ? choiceChildren.tooltipContainer() : tooltipContainer().merge(choiceChildren.tooltipContainer()), foreground() == null ? choiceChildren.foreground() : foreground().merge(choiceChildren.foreground()), foregroundMask() == null ? choiceChildren.foregroundMask() : foregroundMask().merge(choiceChildren.foregroundMask()), scrim() == null ? choiceChildren.scrim() : scrim().merge(choiceChildren.scrim()), accessoryView() == null ? choiceChildren.accessoryView() : accessoryView().merge(choiceChildren.accessoryView()));
                }
            }

            public static TypeAdapter<Choice> typeAdapter(Gson gson) {
                return new C$AutoValue_UiDefinition_Layout_Choice.GsonTypeAdapter(gson);
            }
        }

        public static TypeAdapter<Layout> typeAdapter(Gson gson) {
            return new C$AutoValue_UiDefinition_Layout.GsonTypeAdapter(gson).setDefaultElements(new AutoValue_UiDefinition_Layout_Elements(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)).setDefaultElementAnimations(Collections.emptyMap()).setDefaultConfig(new AutoValue_UiDefinition_Layout_Config(new AutoValue_Size(1280, 720), null, null, null, null, null, null, null, false, null, Boolean.TRUE, false, false));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Config implements Parcelable {
        public abstract Logging logging();

        public abstract boolean randomizeDefault();

        /* loaded from: classes.dex */
        public static abstract class Logging implements Parcelable {
            public abstract Moment moment();

            /* loaded from: classes.dex */
            public static abstract class Moment implements Parcelable {
                public abstract TrackingInfo trackingInfo();

                public static TypeAdapter<Moment> typeAdapter(Gson gson) {
                    return new C$AutoValue_UiDefinition_Config_Logging_Moment.GsonTypeAdapter(gson);
                }
            }

            public static TypeAdapter<Logging> typeAdapter(Gson gson) {
                return new C$AutoValue_UiDefinition_Config_Logging.GsonTypeAdapter(gson);
            }
        }

        public static TypeAdapter<Config> typeAdapter(Gson gson) {
            return new C$AutoValue_UiDefinition_Config.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AudioListAsset implements Parcelable {
        public abstract String assetId();

        public static TypeAdapter<AudioListAsset> typeAdapter(Gson gson) {
            return new C$AutoValue_UiDefinition_AudioListAsset.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<UiDefinition> typeAdapter(Gson gson) {
        return new C$AutoValue_UiDefinition.GsonTypeAdapter(gson);
    }
}
