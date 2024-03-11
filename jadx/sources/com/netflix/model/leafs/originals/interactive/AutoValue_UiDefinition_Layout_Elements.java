package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
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
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Layout_Elements extends C$AutoValue_UiDefinition_Layout_Elements {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Layout_Elements> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Layout_Elements>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Layout_Elements.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Elements createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Layout_Elements((HeaderLayoutElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (BackgroundImageElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (LayoutTimer) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), parcel.readArrayList(UiDefinition.Layout.Elements.class.getClassLoader()), (Notification) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (Notification) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (SimpleElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (SimpleElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (ScoreContainer) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (BackgroundImageElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (TriviaStreakIndicatorElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (LabelElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (LabelElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (TriviaContainerElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()), (TriviaContainerElement) parcel.readParcelable(UiDefinition.Layout.Elements.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Elements[] newArray(int i) {
            return new AutoValue_UiDefinition_Layout_Elements[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Layout_Elements(final HeaderLayoutElement headerLayoutElement, final BackgroundImageElement backgroundImageElement, final LayoutTimer layoutTimer, final List<UiDefinition.Layout.Choice> list, final Notification notification, final Notification notification2, final SimpleElement simpleElement, final SimpleElement simpleElement2, final ScoreContainer scoreContainer, final PlayerScoreContainerElement playerScoreContainerElement, final PlayerScoreContainerElement playerScoreContainerElement2, final BackgroundImageElement backgroundImageElement2, final TriviaStreakIndicatorElement triviaStreakIndicatorElement, final LabelElement labelElement, final LabelElement labelElement2, final TriviaContainerElement triviaContainerElement, final TriviaContainerElement triviaContainerElement2) {
        new C$$AutoValue_UiDefinition_Layout_Elements(headerLayoutElement, backgroundImageElement, layoutTimer, list, notification, notification2, simpleElement, simpleElement2, scoreContainer, playerScoreContainerElement, playerScoreContainerElement2, backgroundImageElement2, triviaStreakIndicatorElement, labelElement, labelElement2, triviaContainerElement, triviaContainerElement2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Elements

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Elements$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Layout.Elements> {
                private final TypeAdapter<BackgroundImageElement> backgroundDataAdapter;
                private final TypeAdapter<SimpleElement> categoryAdapter;
                private final TypeAdapter<SimpleElement> categorySubtextAdapter;
                private final TypeAdapter<List<UiDefinition.Layout.Choice>> choicesAdapter;
                private final TypeAdapter<BackgroundImageElement> controlsIconAdapter;
                private final TypeAdapter<HeaderLayoutElement> headerAdapter;
                private final TypeAdapter<LabelElement> leftPointsEarnedLabelAdapter;
                private final TypeAdapter<Notification> notificationDataAdapter;
                private final TypeAdapter<PlayerScoreContainerElement> p1ScoreLabelAdapter;
                private final TypeAdapter<PlayerScoreContainerElement> p2ScoreLabelAdapter;
                private final TypeAdapter<TriviaContainerElement> resultsContentAdapter;
                private final TypeAdapter<LabelElement> rightPointsEarnedLabelAdapter;
                private final TypeAdapter<ScoreContainer> scoreContainerAdapter;
                private final TypeAdapter<TriviaStreakIndicatorElement> streakIndicatorAdapter;
                private final TypeAdapter<LayoutTimer> timerAdapter;
                private final TypeAdapter<Notification> toastAdapter;
                private final TypeAdapter<TriviaContainerElement> tutorialContentAdapter;
                private HeaderLayoutElement defaultHeader = null;
                private BackgroundImageElement defaultBackgroundData = null;
                private LayoutTimer defaultTimer = null;
                private List<UiDefinition.Layout.Choice> defaultChoices = null;
                private Notification defaultNotificationData = null;
                private Notification defaultToast = null;
                private SimpleElement defaultCategory = null;
                private SimpleElement defaultCategorySubtext = null;
                private ScoreContainer defaultScoreContainer = null;
                private PlayerScoreContainerElement defaultP1ScoreLabel = null;
                private PlayerScoreContainerElement defaultP2ScoreLabel = null;
                private BackgroundImageElement defaultControlsIcon = null;
                private TriviaStreakIndicatorElement defaultStreakIndicator = null;
                private LabelElement defaultLeftPointsEarnedLabel = null;
                private LabelElement defaultRightPointsEarnedLabel = null;
                private TriviaContainerElement defaultTutorialContent = null;
                private TriviaContainerElement defaultResultsContent = null;

                public GsonTypeAdapter setDefaultBackgroundData(BackgroundImageElement backgroundImageElement) {
                    this.defaultBackgroundData = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultCategory(SimpleElement simpleElement) {
                    this.defaultCategory = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultCategorySubtext(SimpleElement simpleElement) {
                    this.defaultCategorySubtext = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoices(List<UiDefinition.Layout.Choice> list) {
                    this.defaultChoices = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultControlsIcon(BackgroundImageElement backgroundImageElement) {
                    this.defaultControlsIcon = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeader(HeaderLayoutElement headerLayoutElement) {
                    this.defaultHeader = headerLayoutElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultLeftPointsEarnedLabel(LabelElement labelElement) {
                    this.defaultLeftPointsEarnedLabel = labelElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultNotificationData(Notification notification) {
                    this.defaultNotificationData = notification;
                    return this;
                }

                public GsonTypeAdapter setDefaultP1ScoreLabel(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP1ScoreLabel = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultP2ScoreLabel(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP2ScoreLabel = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultResultsContent(TriviaContainerElement triviaContainerElement) {
                    this.defaultResultsContent = triviaContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultRightPointsEarnedLabel(LabelElement labelElement) {
                    this.defaultRightPointsEarnedLabel = labelElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultScoreContainer(ScoreContainer scoreContainer) {
                    this.defaultScoreContainer = scoreContainer;
                    return this;
                }

                public GsonTypeAdapter setDefaultStreakIndicator(TriviaStreakIndicatorElement triviaStreakIndicatorElement) {
                    this.defaultStreakIndicator = triviaStreakIndicatorElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTimer(LayoutTimer layoutTimer) {
                    this.defaultTimer = layoutTimer;
                    return this;
                }

                public GsonTypeAdapter setDefaultToast(Notification notification) {
                    this.defaultToast = notification;
                    return this;
                }

                public GsonTypeAdapter setDefaultTutorialContent(TriviaContainerElement triviaContainerElement) {
                    this.defaultTutorialContent = triviaContainerElement;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.headerAdapter = gson.getAdapter(HeaderLayoutElement.class);
                    this.backgroundDataAdapter = gson.getAdapter(BackgroundImageElement.class);
                    this.timerAdapter = gson.getAdapter(LayoutTimer.class);
                    this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UiDefinition.Layout.Choice.class));
                    this.notificationDataAdapter = gson.getAdapter(Notification.class);
                    this.toastAdapter = gson.getAdapter(Notification.class);
                    this.categoryAdapter = gson.getAdapter(SimpleElement.class);
                    this.categorySubtextAdapter = gson.getAdapter(SimpleElement.class);
                    this.scoreContainerAdapter = gson.getAdapter(ScoreContainer.class);
                    this.p1ScoreLabelAdapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.p2ScoreLabelAdapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.controlsIconAdapter = gson.getAdapter(BackgroundImageElement.class);
                    this.streakIndicatorAdapter = gson.getAdapter(TriviaStreakIndicatorElement.class);
                    this.leftPointsEarnedLabelAdapter = gson.getAdapter(LabelElement.class);
                    this.rightPointsEarnedLabelAdapter = gson.getAdapter(LabelElement.class);
                    this.tutorialContentAdapter = gson.getAdapter(TriviaContainerElement.class);
                    this.resultsContentAdapter = gson.getAdapter(TriviaContainerElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Layout.Elements elements) {
                    if (elements == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("header");
                    this.headerAdapter.write(jsonWriter, elements.header());
                    jsonWriter.name("background");
                    this.backgroundDataAdapter.write(jsonWriter, elements.backgroundData());
                    jsonWriter.name("timer");
                    this.timerAdapter.write(jsonWriter, elements.timer());
                    jsonWriter.name("choices");
                    this.choicesAdapter.write(jsonWriter, elements.choices());
                    jsonWriter.name(Moment.TYPE.NOTIFICATION);
                    this.notificationDataAdapter.write(jsonWriter, elements.notificationData());
                    jsonWriter.name("toast");
                    this.toastAdapter.write(jsonWriter, elements.toast());
                    jsonWriter.name("category");
                    this.categoryAdapter.write(jsonWriter, elements.category());
                    jsonWriter.name("categorySubtext");
                    this.categorySubtextAdapter.write(jsonWriter, elements.categorySubtext());
                    jsonWriter.name("scoreContainer");
                    this.scoreContainerAdapter.write(jsonWriter, elements.scoreContainer());
                    jsonWriter.name("p1ScoreLabel");
                    this.p1ScoreLabelAdapter.write(jsonWriter, elements.p1ScoreLabel());
                    jsonWriter.name("p2ScoreLabel");
                    this.p2ScoreLabelAdapter.write(jsonWriter, elements.p2ScoreLabel());
                    jsonWriter.name("controlsIcon");
                    this.controlsIconAdapter.write(jsonWriter, elements.controlsIcon());
                    jsonWriter.name("streakIndicator");
                    this.streakIndicatorAdapter.write(jsonWriter, elements.streakIndicator());
                    jsonWriter.name("leftPointsEarnedLabel");
                    this.leftPointsEarnedLabelAdapter.write(jsonWriter, elements.leftPointsEarnedLabel());
                    jsonWriter.name("rightPointsEarnedLabel");
                    this.rightPointsEarnedLabelAdapter.write(jsonWriter, elements.rightPointsEarnedLabel());
                    jsonWriter.name("tutorialContent");
                    this.tutorialContentAdapter.write(jsonWriter, elements.tutorialContent());
                    jsonWriter.name("resultsContent");
                    this.resultsContentAdapter.write(jsonWriter, elements.resultsContent());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Layout.Elements read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    HeaderLayoutElement headerLayoutElement = this.defaultHeader;
                    BackgroundImageElement backgroundImageElement = this.defaultBackgroundData;
                    LayoutTimer layoutTimer = this.defaultTimer;
                    List<UiDefinition.Layout.Choice> list = this.defaultChoices;
                    Notification notification = this.defaultNotificationData;
                    Notification notification2 = this.defaultToast;
                    SimpleElement simpleElement = this.defaultCategory;
                    SimpleElement simpleElement2 = this.defaultCategorySubtext;
                    ScoreContainer scoreContainer = this.defaultScoreContainer;
                    PlayerScoreContainerElement playerScoreContainerElement = this.defaultP1ScoreLabel;
                    PlayerScoreContainerElement playerScoreContainerElement2 = this.defaultP2ScoreLabel;
                    BackgroundImageElement backgroundImageElement2 = this.defaultControlsIcon;
                    TriviaStreakIndicatorElement triviaStreakIndicatorElement = this.defaultStreakIndicator;
                    LabelElement labelElement = this.defaultLeftPointsEarnedLabel;
                    LabelElement labelElement2 = this.defaultRightPointsEarnedLabel;
                    TriviaContainerElement triviaContainerElement = this.defaultTutorialContent;
                    TriviaContainerElement triviaContainerElement2 = this.defaultResultsContent;
                    BackgroundImageElement backgroundImageElement3 = backgroundImageElement;
                    LayoutTimer layoutTimer2 = layoutTimer;
                    List<UiDefinition.Layout.Choice> list2 = list;
                    Notification notification3 = notification;
                    Notification notification4 = notification2;
                    SimpleElement simpleElement3 = simpleElement;
                    SimpleElement simpleElement4 = simpleElement2;
                    ScoreContainer scoreContainer2 = scoreContainer;
                    PlayerScoreContainerElement playerScoreContainerElement3 = playerScoreContainerElement;
                    PlayerScoreContainerElement playerScoreContainerElement4 = playerScoreContainerElement2;
                    BackgroundImageElement backgroundImageElement4 = backgroundImageElement2;
                    TriviaStreakIndicatorElement triviaStreakIndicatorElement2 = triviaStreakIndicatorElement;
                    LabelElement labelElement3 = labelElement;
                    HeaderLayoutElement headerLayoutElement2 = headerLayoutElement;
                    LabelElement labelElement4 = labelElement2;
                    TriviaContainerElement triviaContainerElement3 = triviaContainerElement;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1605784497:
                                    if (nextName.equals("controlsIcon")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1314650077:
                                    if (nextName.equals("p1ScoreLabel")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1277341789:
                                    if (nextName.equals("resultsContent")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1221270899:
                                    if (nextName.equals("header")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -941941711:
                                    if (nextName.equals("streakIndicator")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 50511102:
                                    if (nextName.equals("category")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 110364485:
                                    if (nextName.equals("timer")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 110532135:
                                    if (nextName.equals("toast")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 330556563:
                                    if (nextName.equals("leftPointsEarnedLabel")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 387478031:
                                    if (nextName.equals("scoreContainer")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 595233003:
                                    if (nextName.equals(Moment.TYPE.NOTIFICATION)) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 751720178:
                                    if (nextName.equals("choices")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1074695966:
                                    if (nextName.equals("rightPointsEarnedLabel")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1183365860:
                                    if (nextName.equals("p2ScoreLabel")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1493419151:
                                    if (nextName.equals("categorySubtext")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2013444923:
                                    if (nextName.equals("tutorialContent")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    backgroundImageElement4 = this.controlsIconAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    backgroundImageElement3 = this.backgroundDataAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    playerScoreContainerElement3 = this.p1ScoreLabelAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    triviaContainerElement2 = this.resultsContentAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    headerLayoutElement2 = this.headerAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    triviaStreakIndicatorElement2 = this.streakIndicatorAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    simpleElement3 = this.categoryAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    layoutTimer2 = this.timerAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    notification4 = this.toastAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    labelElement3 = this.leftPointsEarnedLabelAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    scoreContainer2 = this.scoreContainerAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    notification3 = this.notificationDataAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    list2 = this.choicesAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    labelElement4 = this.rightPointsEarnedLabelAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    playerScoreContainerElement4 = this.p2ScoreLabelAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    simpleElement4 = this.categorySubtextAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    triviaContainerElement3 = this.tutorialContentAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Layout_Elements(headerLayoutElement2, backgroundImageElement3, layoutTimer2, list2, notification3, notification4, simpleElement3, simpleElement4, scoreContainer2, playerScoreContainerElement3, playerScoreContainerElement4, backgroundImageElement4, triviaStreakIndicatorElement2, labelElement3, labelElement4, triviaContainerElement3, triviaContainerElement2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(header(), i);
        parcel.writeParcelable(backgroundData(), i);
        parcel.writeParcelable(timer(), i);
        parcel.writeList(choices());
        parcel.writeParcelable(notificationData(), i);
        parcel.writeParcelable(toast(), i);
        parcel.writeParcelable(category(), i);
        parcel.writeParcelable(categorySubtext(), i);
        parcel.writeParcelable(scoreContainer(), i);
        parcel.writeParcelable(p1ScoreLabel(), i);
        parcel.writeParcelable(p2ScoreLabel(), i);
        parcel.writeParcelable(controlsIcon(), i);
        parcel.writeParcelable(streakIndicator(), i);
        parcel.writeParcelable(leftPointsEarnedLabel(), i);
        parcel.writeParcelable(rightPointsEarnedLabel(), i);
        parcel.writeParcelable(tutorialContent(), i);
        parcel.writeParcelable(resultsContent(), i);
    }
}
