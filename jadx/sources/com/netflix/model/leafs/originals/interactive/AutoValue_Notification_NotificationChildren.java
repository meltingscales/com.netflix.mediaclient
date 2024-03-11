package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
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
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Notification_NotificationChildren extends C$AutoValue_Notification_NotificationChildren {
    public static final Parcelable.Creator<AutoValue_Notification_NotificationChildren> CREATOR = new Parcelable.Creator<AutoValue_Notification_NotificationChildren>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Notification_NotificationChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Notification_NotificationChildren createFromParcel(Parcel parcel) {
            return new AutoValue_Notification_NotificationChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(Notification.NotificationChildren.class.getClassLoader()), parcel.readHashMap(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ScoreContainer) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (UnlockContainer) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (TriviaThemeContainer) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (BackgroundImageElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (PlayerScoreContainerElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(Notification.NotificationChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Notification_NotificationChildren[] newArray(int i) {
            return new AutoValue_Notification_NotificationChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Notification_NotificationChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageElement imageElement, final ImageElement imageElement2, final ImageElement imageElement3, final ImageElement imageElement4, final ImageElement imageElement5, final SimpleElement simpleElement, final SimpleElement simpleElement2, final SimpleElement simpleElement3, final ImageElement imageElement6, final SimpleElement simpleElement4, final SimpleElement simpleElement5, final SimpleElement simpleElement6, final ImageElement imageElement7, final ImageElement imageElement8, final ImageElement imageElement9, final SimpleElement simpleElement7, final ScoreContainer scoreContainer, final SimpleElement simpleElement8, final UnlockContainer unlockContainer, final ImageElement imageElement10, final TriviaThemeContainer triviaThemeContainer, final BackgroundImageElement backgroundImageElement, final SimpleElement simpleElement9, final SimpleElement simpleElement10, final SimpleElement simpleElement11, final SimpleElement simpleElement12, final PlayerScoreContainerElement playerScoreContainerElement, final PlayerScoreContainerElement playerScoreContainerElement2, final PlayerScoreContainerElement playerScoreContainerElement3, final PlayerScoreContainerElement playerScoreContainerElement4, final SimpleElement simpleElement13) {
        new C$$AutoValue_Notification_NotificationChildren(str, str2, str3, map, map2, imageElement, imageElement2, imageElement3, imageElement4, imageElement5, simpleElement, simpleElement2, simpleElement3, imageElement6, simpleElement4, simpleElement5, simpleElement6, imageElement7, imageElement8, imageElement9, simpleElement7, scoreContainer, simpleElement8, unlockContainer, imageElement10, triviaThemeContainer, backgroundImageElement, simpleElement9, simpleElement10, simpleElement11, simpleElement12, playerScoreContainerElement, playerScoreContainerElement2, playerScoreContainerElement3, playerScoreContainerElement4, simpleElement13) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Notification_NotificationChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Notification_NotificationChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Notification.NotificationChildren> {
                private final TypeAdapter<ImageElement> backgroundAdapter;
                private final TypeAdapter<SimpleElement> bodyAdapter;
                private final TypeAdapter<SimpleElement> contentContainerAdapter;
                private final TypeAdapter<SimpleElement> currentScoreDescriptionAdapter;
                private final TypeAdapter<SimpleElement> dividerAdapter;
                private final TypeAdapter<SimpleElement> headerAdapter;
                private final TypeAdapter<ImageElement> iconAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageElement> image1Adapter;
                private final TypeAdapter<ImageElement> image2Adapter;
                private final TypeAdapter<ImageElement> image3Adapter;
                private final TypeAdapter<ImageElement> imageAdapter;
                private final TypeAdapter<ImageElement> labelAdapter;
                private final TypeAdapter<ImageElement> leftCapAdapter;
                private final TypeAdapter<SimpleElement> nextPlayerHeaderAdapter;
                private final TypeAdapter<SimpleElement> nextPlayerSubHeaderAdapter;
                private final TypeAdapter<PlayerScoreContainerElement> p1ScoreContainer2Adapter;
                private final TypeAdapter<PlayerScoreContainerElement> p1ScoreContainerAdapter;
                private final TypeAdapter<PlayerScoreContainerElement> p2ScoreContainer2Adapter;
                private final TypeAdapter<PlayerScoreContainerElement> p2ScoreContainerAdapter;
                private final TypeAdapter<SimpleElement> pointsLabelAdapter;
                private final TypeAdapter<ImageElement> rightCapAdapter;
                private final TypeAdapter<ScoreContainer> scoreContainerAdapter;
                private final TypeAdapter<ImageElement> shareButtonAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<SimpleElement> subHeaderAdapter;
                private final TypeAdapter<BackgroundImageElement> targetScoreContainerAdapter;
                private final TypeAdapter<SimpleElement> targetScoreTextAdapter;
                private final TypeAdapter<SimpleElement> textContainerAdapter;
                private final TypeAdapter<TriviaThemeContainer> themeContainerAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<UnlockContainer> unlockContainerAdapter;
                private final TypeAdapter<SimpleElement> unlockLabelAdapter;
                private final TypeAdapter<SimpleElement> valueLabelAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private ImageElement defaultLabel = null;
                private ImageElement defaultIcon = null;
                private ImageElement defaultBackground = null;
                private ImageElement defaultLeftCap = null;
                private ImageElement defaultRightCap = null;
                private SimpleElement defaultDivider = null;
                private SimpleElement defaultHeader = null;
                private SimpleElement defaultValueLabel = null;
                private ImageElement defaultImage = null;
                private SimpleElement defaultBody = null;
                private SimpleElement defaultContentContainer = null;
                private SimpleElement defaultTextContainer = null;
                private ImageElement defaultImage1 = null;
                private ImageElement defaultImage2 = null;
                private ImageElement defaultImage3 = null;
                private SimpleElement defaultPointsLabel = null;
                private ScoreContainer defaultScoreContainer = null;
                private SimpleElement defaultUnlockLabel = null;
                private UnlockContainer defaultUnlockContainer = null;
                private ImageElement defaultShareButton = null;
                private TriviaThemeContainer defaultThemeContainer = null;
                private BackgroundImageElement defaultTargetScoreContainer = null;
                private SimpleElement defaultTargetScoreText = null;
                private SimpleElement defaultNextPlayerHeader = null;
                private SimpleElement defaultNextPlayerSubHeader = null;
                private SimpleElement defaultSubHeader = null;
                private PlayerScoreContainerElement defaultP1ScoreContainer = null;
                private PlayerScoreContainerElement defaultP1ScoreContainer2 = null;
                private PlayerScoreContainerElement defaultP2ScoreContainer = null;
                private PlayerScoreContainerElement defaultP2ScoreContainer2 = null;
                private SimpleElement defaultCurrentScoreDescription = null;

                public GsonTypeAdapter setDefaultBackground(ImageElement imageElement) {
                    this.defaultBackground = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultBody(SimpleElement simpleElement) {
                    this.defaultBody = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultContentContainer(SimpleElement simpleElement) {
                    this.defaultContentContainer = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultCurrentScoreDescription(SimpleElement simpleElement) {
                    this.defaultCurrentScoreDescription = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultDivider(SimpleElement simpleElement) {
                    this.defaultDivider = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeader(SimpleElement simpleElement) {
                    this.defaultHeader = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultIcon(ImageElement imageElement) {
                    this.defaultIcon = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage(ImageElement imageElement) {
                    this.defaultImage = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage1(ImageElement imageElement) {
                    this.defaultImage1 = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage2(ImageElement imageElement) {
                    this.defaultImage2 = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage3(ImageElement imageElement) {
                    this.defaultImage3 = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(ImageElement imageElement) {
                    this.defaultLabel = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultLeftCap(ImageElement imageElement) {
                    this.defaultLeftCap = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextPlayerHeader(SimpleElement simpleElement) {
                    this.defaultNextPlayerHeader = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextPlayerSubHeader(SimpleElement simpleElement) {
                    this.defaultNextPlayerSubHeader = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultP1ScoreContainer(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP1ScoreContainer = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultP1ScoreContainer2(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP1ScoreContainer2 = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultP2ScoreContainer(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP2ScoreContainer = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultP2ScoreContainer2(PlayerScoreContainerElement playerScoreContainerElement) {
                    this.defaultP2ScoreContainer2 = playerScoreContainerElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultPointsLabel(SimpleElement simpleElement) {
                    this.defaultPointsLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultRightCap(ImageElement imageElement) {
                    this.defaultRightCap = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultScoreContainer(ScoreContainer scoreContainer) {
                    this.defaultScoreContainer = scoreContainer;
                    return this;
                }

                public GsonTypeAdapter setDefaultShareButton(ImageElement imageElement) {
                    this.defaultShareButton = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubHeader(SimpleElement simpleElement) {
                    this.defaultSubHeader = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTargetScoreContainer(BackgroundImageElement backgroundImageElement) {
                    this.defaultTargetScoreContainer = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTargetScoreText(SimpleElement simpleElement) {
                    this.defaultTargetScoreText = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTextContainer(SimpleElement simpleElement) {
                    this.defaultTextContainer = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultThemeContainer(TriviaThemeContainer triviaThemeContainer) {
                    this.defaultThemeContainer = triviaThemeContainer;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnlockContainer(UnlockContainer unlockContainer) {
                    this.defaultUnlockContainer = unlockContainer;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnlockLabel(SimpleElement simpleElement) {
                    this.defaultUnlockLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultValueLabel(SimpleElement simpleElement) {
                    this.defaultValueLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStateTransitions(Map<String, AnimationTemplateId> map) {
                    this.defaultVisualStateTransitions = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStates(Map<String, VisualStateDefinition> map) {
                    this.defaultVisualStates = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.styleIdAdapter = gson.getAdapter(String.class);
                    this.visualStateTransitionsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AnimationTemplateId.class));
                    this.visualStatesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, VisualStateDefinition.class));
                    this.labelAdapter = gson.getAdapter(ImageElement.class);
                    this.iconAdapter = gson.getAdapter(ImageElement.class);
                    this.backgroundAdapter = gson.getAdapter(ImageElement.class);
                    this.leftCapAdapter = gson.getAdapter(ImageElement.class);
                    this.rightCapAdapter = gson.getAdapter(ImageElement.class);
                    this.dividerAdapter = gson.getAdapter(SimpleElement.class);
                    this.headerAdapter = gson.getAdapter(SimpleElement.class);
                    this.valueLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.imageAdapter = gson.getAdapter(ImageElement.class);
                    this.bodyAdapter = gson.getAdapter(SimpleElement.class);
                    this.contentContainerAdapter = gson.getAdapter(SimpleElement.class);
                    this.textContainerAdapter = gson.getAdapter(SimpleElement.class);
                    this.image1Adapter = gson.getAdapter(ImageElement.class);
                    this.image2Adapter = gson.getAdapter(ImageElement.class);
                    this.image3Adapter = gson.getAdapter(ImageElement.class);
                    this.pointsLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.scoreContainerAdapter = gson.getAdapter(ScoreContainer.class);
                    this.unlockLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.unlockContainerAdapter = gson.getAdapter(UnlockContainer.class);
                    this.shareButtonAdapter = gson.getAdapter(ImageElement.class);
                    this.themeContainerAdapter = gson.getAdapter(TriviaThemeContainer.class);
                    this.targetScoreContainerAdapter = gson.getAdapter(BackgroundImageElement.class);
                    this.targetScoreTextAdapter = gson.getAdapter(SimpleElement.class);
                    this.nextPlayerHeaderAdapter = gson.getAdapter(SimpleElement.class);
                    this.nextPlayerSubHeaderAdapter = gson.getAdapter(SimpleElement.class);
                    this.subHeaderAdapter = gson.getAdapter(SimpleElement.class);
                    this.p1ScoreContainerAdapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.p1ScoreContainer2Adapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.p2ScoreContainerAdapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.p2ScoreContainer2Adapter = gson.getAdapter(PlayerScoreContainerElement.class);
                    this.currentScoreDescriptionAdapter = gson.getAdapter(SimpleElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Notification.NotificationChildren notificationChildren) {
                    if (notificationChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, notificationChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, notificationChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, notificationChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, notificationChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, notificationChildren.visualStates());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, notificationChildren.label());
                    jsonWriter.name("icon");
                    this.iconAdapter.write(jsonWriter, notificationChildren.icon());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, notificationChildren.background());
                    jsonWriter.name("leftCap");
                    this.leftCapAdapter.write(jsonWriter, notificationChildren.leftCap());
                    jsonWriter.name("rightCap");
                    this.rightCapAdapter.write(jsonWriter, notificationChildren.rightCap());
                    jsonWriter.name("divider");
                    this.dividerAdapter.write(jsonWriter, notificationChildren.divider());
                    jsonWriter.name("header");
                    this.headerAdapter.write(jsonWriter, notificationChildren.header());
                    jsonWriter.name("valueLabel");
                    this.valueLabelAdapter.write(jsonWriter, notificationChildren.valueLabel());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, notificationChildren.image());
                    jsonWriter.name("body");
                    this.bodyAdapter.write(jsonWriter, notificationChildren.body());
                    jsonWriter.name("contentContainer");
                    this.contentContainerAdapter.write(jsonWriter, notificationChildren.contentContainer());
                    jsonWriter.name("textContainer");
                    this.textContainerAdapter.write(jsonWriter, notificationChildren.textContainer());
                    jsonWriter.name("image1");
                    this.image1Adapter.write(jsonWriter, notificationChildren.image1());
                    jsonWriter.name("image2");
                    this.image2Adapter.write(jsonWriter, notificationChildren.image2());
                    jsonWriter.name("image3");
                    this.image3Adapter.write(jsonWriter, notificationChildren.image3());
                    jsonWriter.name("pointsLabel");
                    this.pointsLabelAdapter.write(jsonWriter, notificationChildren.pointsLabel());
                    jsonWriter.name("scoreContainer");
                    this.scoreContainerAdapter.write(jsonWriter, notificationChildren.scoreContainer());
                    jsonWriter.name("unlockLabel");
                    this.unlockLabelAdapter.write(jsonWriter, notificationChildren.unlockLabel());
                    jsonWriter.name("unlockContainer");
                    this.unlockContainerAdapter.write(jsonWriter, notificationChildren.unlockContainer());
                    jsonWriter.name("shareButton");
                    this.shareButtonAdapter.write(jsonWriter, notificationChildren.shareButton());
                    jsonWriter.name("themeContainer");
                    this.themeContainerAdapter.write(jsonWriter, notificationChildren.themeContainer());
                    jsonWriter.name("targetScoreContainer");
                    this.targetScoreContainerAdapter.write(jsonWriter, notificationChildren.targetScoreContainer());
                    jsonWriter.name("targetScoreText");
                    this.targetScoreTextAdapter.write(jsonWriter, notificationChildren.targetScoreText());
                    jsonWriter.name("nextPlayerHeader");
                    this.nextPlayerHeaderAdapter.write(jsonWriter, notificationChildren.nextPlayerHeader());
                    jsonWriter.name("nextPlayerSubHeader");
                    this.nextPlayerSubHeaderAdapter.write(jsonWriter, notificationChildren.nextPlayerSubHeader());
                    jsonWriter.name("subHeader");
                    this.subHeaderAdapter.write(jsonWriter, notificationChildren.subHeader());
                    jsonWriter.name("p1ScoreContainer");
                    this.p1ScoreContainerAdapter.write(jsonWriter, notificationChildren.p1ScoreContainer());
                    jsonWriter.name("p1ScoreContainer2");
                    this.p1ScoreContainer2Adapter.write(jsonWriter, notificationChildren.p1ScoreContainer2());
                    jsonWriter.name("p2ScoreContainer");
                    this.p2ScoreContainerAdapter.write(jsonWriter, notificationChildren.p2ScoreContainer());
                    jsonWriter.name("p2ScoreContainer2");
                    this.p2ScoreContainer2Adapter.write(jsonWriter, notificationChildren.p2ScoreContainer2());
                    jsonWriter.name("currentScoreDescription");
                    this.currentScoreDescriptionAdapter.write(jsonWriter, notificationChildren.currentScoreDescription());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Notification.NotificationChildren read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultType;
                    String str3 = this.defaultStyleId;
                    Map<String, AnimationTemplateId> map = this.defaultVisualStateTransitions;
                    Map<String, VisualStateDefinition> map2 = this.defaultVisualStates;
                    ImageElement imageElement = this.defaultLabel;
                    ImageElement imageElement2 = this.defaultIcon;
                    ImageElement imageElement3 = this.defaultBackground;
                    ImageElement imageElement4 = this.defaultLeftCap;
                    ImageElement imageElement5 = this.defaultRightCap;
                    SimpleElement simpleElement = this.defaultDivider;
                    SimpleElement simpleElement2 = this.defaultHeader;
                    SimpleElement simpleElement3 = this.defaultValueLabel;
                    ImageElement imageElement6 = this.defaultImage;
                    SimpleElement simpleElement4 = this.defaultBody;
                    SimpleElement simpleElement5 = this.defaultContentContainer;
                    SimpleElement simpleElement6 = this.defaultTextContainer;
                    ImageElement imageElement7 = this.defaultImage1;
                    ImageElement imageElement8 = this.defaultImage2;
                    ImageElement imageElement9 = this.defaultImage3;
                    SimpleElement simpleElement7 = this.defaultPointsLabel;
                    ScoreContainer scoreContainer = this.defaultScoreContainer;
                    SimpleElement simpleElement8 = this.defaultUnlockLabel;
                    UnlockContainer unlockContainer = this.defaultUnlockContainer;
                    ImageElement imageElement10 = this.defaultShareButton;
                    TriviaThemeContainer triviaThemeContainer = this.defaultThemeContainer;
                    BackgroundImageElement backgroundImageElement = this.defaultTargetScoreContainer;
                    SimpleElement simpleElement9 = this.defaultTargetScoreText;
                    SimpleElement simpleElement10 = this.defaultNextPlayerHeader;
                    SimpleElement simpleElement11 = this.defaultNextPlayerSubHeader;
                    SimpleElement simpleElement12 = this.defaultSubHeader;
                    PlayerScoreContainerElement playerScoreContainerElement = this.defaultP1ScoreContainer;
                    PlayerScoreContainerElement playerScoreContainerElement2 = this.defaultP1ScoreContainer2;
                    PlayerScoreContainerElement playerScoreContainerElement3 = this.defaultP2ScoreContainer;
                    PlayerScoreContainerElement playerScoreContainerElement4 = this.defaultP2ScoreContainer2;
                    SimpleElement simpleElement13 = this.defaultCurrentScoreDescription;
                    String str4 = str2;
                    String str5 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageElement imageElement11 = imageElement;
                    ImageElement imageElement12 = imageElement2;
                    ImageElement imageElement13 = imageElement3;
                    ImageElement imageElement14 = imageElement4;
                    ImageElement imageElement15 = imageElement5;
                    SimpleElement simpleElement14 = simpleElement;
                    SimpleElement simpleElement15 = simpleElement2;
                    SimpleElement simpleElement16 = simpleElement3;
                    ImageElement imageElement16 = imageElement6;
                    String str6 = str;
                    SimpleElement simpleElement17 = simpleElement4;
                    SimpleElement simpleElement18 = simpleElement5;
                    SimpleElement simpleElement19 = simpleElement6;
                    ImageElement imageElement17 = imageElement7;
                    ImageElement imageElement18 = imageElement8;
                    ImageElement imageElement19 = imageElement9;
                    SimpleElement simpleElement20 = simpleElement7;
                    ScoreContainer scoreContainer2 = scoreContainer;
                    SimpleElement simpleElement21 = simpleElement8;
                    UnlockContainer unlockContainer2 = unlockContainer;
                    ImageElement imageElement20 = imageElement10;
                    TriviaThemeContainer triviaThemeContainer2 = triviaThemeContainer;
                    BackgroundImageElement backgroundImageElement2 = backgroundImageElement;
                    SimpleElement simpleElement22 = simpleElement9;
                    SimpleElement simpleElement23 = simpleElement10;
                    SimpleElement simpleElement24 = simpleElement11;
                    SimpleElement simpleElement25 = simpleElement12;
                    PlayerScoreContainerElement playerScoreContainerElement5 = playerScoreContainerElement;
                    PlayerScoreContainerElement playerScoreContainerElement6 = playerScoreContainerElement2;
                    PlayerScoreContainerElement playerScoreContainerElement7 = playerScoreContainerElement3;
                    PlayerScoreContainerElement playerScoreContainerElement8 = playerScoreContainerElement4;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1875214676:
                                    if (nextName.equals("styleId")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1436106730:
                                    if (nextName.equals("rightCap")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1221270899:
                                    if (nextName.equals("header")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1185250762:
                                    if (nextName.equals("image1")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1185250761:
                                    if (nextName.equals("image2")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1185250760:
                                    if (nextName.equals("image3")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1104173520:
                                    if (nextName.equals("p1ScoreContainer")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -879650288:
                                    if (nextName.equals("unlockLabel")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -714875667:
                                    if (nextName.equals("subHeader")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -421347343:
                                    if (nextName.equals("shareButton")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -380174879:
                                    if (nextName.equals("p2ScoreContainer2")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -136074796:
                                    if (nextName.equals("textContainer")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3029410:
                                    if (nextName.equals("body")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3226745:
                                    if (nextName.equals("icon")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 18956366:
                                    if (nextName.equals("targetScoreText")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 55416395:
                                    if (nextName.equals("leftCap")) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 130359298:
                                    if (nextName.equals("p1ScoreContainer2")) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 387478031:
                                    if (nextName.equals("scoreContainer")) {
                                        c = 22;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 403378289:
                                    if (nextName.equals("p2ScoreContainer")) {
                                        c = 23;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 569932189:
                                    if (nextName.equals("unlockContainer")) {
                                        c = 24;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 599354787:
                                    if (nextName.equals("currentScoreDescription")) {
                                        c = 25;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 654350233:
                                    if (nextName.equals("nextPlayerSubHeader")) {
                                        c = 26;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 27;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 985007969:
                                    if (nextName.equals("nextPlayerHeader")) {
                                        c = 28;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1134938065:
                                    if (nextName.equals("pointsLabel")) {
                                        c = 29;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = 30;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1674318617:
                                    if (nextName.equals("divider")) {
                                        c = 31;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1707945992:
                                    if (nextName.equals("contentContainer")) {
                                        c = ' ';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1813866680:
                                    if (nextName.equals("themeContainer")) {
                                        c = '!';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1904942592:
                                    if (nextName.equals("targetScoreContainer")) {
                                        c = JsonFactory.DEFAULT_QUOTE_CHAR;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2025208835:
                                    if (nextName.equals("valueLabel")) {
                                        c = '#';
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
                                    str5 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    imageElement15 = this.rightCapAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    imageElement13 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    simpleElement15 = this.headerAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    imageElement17 = this.image1Adapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageElement18 = this.image2Adapter.read(jsonReader);
                                    continue;
                                case 6:
                                    imageElement19 = this.image3Adapter.read(jsonReader);
                                    continue;
                                case 7:
                                    playerScoreContainerElement5 = this.p1ScoreContainerAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    simpleElement21 = this.unlockLabelAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    simpleElement25 = this.subHeaderAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    imageElement20 = this.shareButtonAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    playerScoreContainerElement8 = this.p2ScoreContainer2Adapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    simpleElement19 = this.textContainerAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    str6 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    simpleElement17 = this.bodyAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    imageElement12 = this.iconAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    str4 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 17:
                                    simpleElement22 = this.targetScoreTextAdapter.read(jsonReader);
                                    continue;
                                case 18:
                                    imageElement14 = this.leftCapAdapter.read(jsonReader);
                                    continue;
                                case 19:
                                    imageElement16 = this.imageAdapter.read(jsonReader);
                                    continue;
                                case 20:
                                    imageElement11 = this.labelAdapter.read(jsonReader);
                                    continue;
                                case 21:
                                    playerScoreContainerElement6 = this.p1ScoreContainer2Adapter.read(jsonReader);
                                    continue;
                                case 22:
                                    scoreContainer2 = this.scoreContainerAdapter.read(jsonReader);
                                    continue;
                                case 23:
                                    playerScoreContainerElement7 = this.p2ScoreContainerAdapter.read(jsonReader);
                                    continue;
                                case 24:
                                    unlockContainer2 = this.unlockContainerAdapter.read(jsonReader);
                                    continue;
                                case 25:
                                    simpleElement13 = this.currentScoreDescriptionAdapter.read(jsonReader);
                                    continue;
                                case 26:
                                    simpleElement24 = this.nextPlayerSubHeaderAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                                    simpleElement23 = this.nextPlayerHeaderAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                                    simpleElement20 = this.pointsLabelAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                                    simpleElement14 = this.dividerAdapter.read(jsonReader);
                                    continue;
                                case ' ':
                                    simpleElement18 = this.contentContainerAdapter.read(jsonReader);
                                    continue;
                                case '!':
                                    triviaThemeContainer2 = this.themeContainerAdapter.read(jsonReader);
                                    continue;
                                case '\"':
                                    backgroundImageElement2 = this.targetScoreContainerAdapter.read(jsonReader);
                                    continue;
                                case '#':
                                    simpleElement16 = this.valueLabelAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Notification_NotificationChildren(str6, str4, str5, map3, map4, imageElement11, imageElement12, imageElement13, imageElement14, imageElement15, simpleElement14, simpleElement15, simpleElement16, imageElement16, simpleElement17, simpleElement18, simpleElement19, imageElement17, imageElement18, imageElement19, simpleElement20, scoreContainer2, simpleElement21, unlockContainer2, imageElement20, triviaThemeContainer2, backgroundImageElement2, simpleElement22, simpleElement23, simpleElement24, simpleElement25, playerScoreContainerElement5, playerScoreContainerElement6, playerScoreContainerElement7, playerScoreContainerElement8, simpleElement13);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (id() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(id());
        }
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        if (styleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(styleId());
        }
        parcel.writeMap(visualStateTransitions());
        parcel.writeMap(visualStates());
        parcel.writeParcelable(label(), i);
        parcel.writeParcelable(icon(), i);
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(leftCap(), i);
        parcel.writeParcelable(rightCap(), i);
        parcel.writeParcelable(divider(), i);
        parcel.writeParcelable(header(), i);
        parcel.writeParcelable(valueLabel(), i);
        parcel.writeParcelable(image(), i);
        parcel.writeParcelable(body(), i);
        parcel.writeParcelable(contentContainer(), i);
        parcel.writeParcelable(textContainer(), i);
        parcel.writeParcelable(image1(), i);
        parcel.writeParcelable(image2(), i);
        parcel.writeParcelable(image3(), i);
        parcel.writeParcelable(pointsLabel(), i);
        parcel.writeParcelable(scoreContainer(), i);
        parcel.writeParcelable(unlockLabel(), i);
        parcel.writeParcelable(unlockContainer(), i);
        parcel.writeParcelable(shareButton(), i);
        parcel.writeParcelable(themeContainer(), i);
        parcel.writeParcelable(targetScoreContainer(), i);
        parcel.writeParcelable(targetScoreText(), i);
        parcel.writeParcelable(nextPlayerHeader(), i);
        parcel.writeParcelable(nextPlayerSubHeader(), i);
        parcel.writeParcelable(subHeader(), i);
        parcel.writeParcelable(p1ScoreContainer(), i);
        parcel.writeParcelable(p1ScoreContainer2(), i);
        parcel.writeParcelable(p2ScoreContainer(), i);
        parcel.writeParcelable(p2ScoreContainer2(), i);
        parcel.writeParcelable(currentScoreDescription(), i);
    }
}
