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
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.List;
import java.util.Map;
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Moment extends C$AutoValue_Moment {
    public static final Parcelable.Creator<AutoValue_Moment> CREATOR = new Parcelable.Creator<AutoValue_Moment>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Moment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            AssetManifest assetManifest = (AssetManifest) parcel.readParcelable(Moment.class.getClassLoader());
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = parcel.readInt() == 1;
            Action action = (Action) parcel.readParcelable(Moment.class.getClassLoader());
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            int readInt = parcel.readInt();
            return new AutoValue_Moment(readString, Long.valueOf(readLong), Long.valueOf(readLong2), assetManifest, readString2, z, action, readString3, Long.valueOf(readLong3), Long.valueOf(readLong4), Integer.valueOf(readInt), parcel.readArrayList(Moment.class.getClassLoader()), parcel.readArrayList(Moment.class.getClassLoader()), (InteractiveSceneConfig) parcel.readParcelable(Moment.class.getClassLoader()), (TrackingInfo) parcel.readParcelable(Moment.class.getClassLoader()), (Moment.TimeoutSegment) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (ImageAssetId) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Condition) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(Moment.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (ImpressionData) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readArrayList(Moment.class.getClassLoader()), parcel.readArrayList(Moment.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(Moment.class.getClassLoader()), (StringsObject) parcel.readParcelable(Moment.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(Moment.class.getClassLoader()), (TrackingInfo) parcel.readParcelable(Moment.class.getClassLoader()), parcel.readArrayList(Moment.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Moment[] newArray(int i) {
            return new AutoValue_Moment[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Moment(String str, Long l, Long l2, AssetManifest assetManifest, String str2, boolean z, Action action, String str3, Long l3, Long l4, Integer num, List<Choice> list, List<Moment> list2, InteractiveSceneConfig interactiveSceneConfig, TrackingInfo trackingInfo, Moment.TimeoutSegment timeoutSegment, String str4, String str5, ImageAssetId imageAssetId, String str6, String str7, Condition condition, String str8, String str9, String str10, String str11, Map<String, String> map, String str12, ImpressionData impressionData, List<Long> list3, List<Integer> list4, ImageAssetId imageAssetId2, StringsObject stringsObject, ImageAssetId imageAssetId3, Integer num2, List<Integer> list5, TrackingInfo trackingInfo2, List<Moment.MomentOverride> list6) {
        new C$$AutoValue_Moment(str, l, l2, assetManifest, str2, z, action, str3, l3, l4, num, list, list2, interactiveSceneConfig, trackingInfo, timeoutSegment, str4, str5, imageAssetId, str6, str7, condition, str8, str9, str10, str11, map, str12, impressionData, list3, list4, imageAssetId2, stringsObject, imageAssetId3, num2, list5, trackingInfo2, list6) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Moment$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Moment> {
                private final TypeAdapter<String> accessibilityDescriptionAdapter;
                private final TypeAdapter<Action> actionAdapter;
                private final TypeAdapter<List<Long>> activationWindowAdapter;
                private final TypeAdapter<List<Integer>> answerSequenceAdapter;
                private final TypeAdapter<String> bodyTextAdapter;
                private final TypeAdapter<List<Choice>> choicesAdapter;
                private final TypeAdapter<InteractiveSceneConfig> configAdapter;
                private final TypeAdapter<Integer> correctIndexAdapter;
                private final TypeAdapter<List<Integer>> correctInputAdapter;
                private final TypeAdapter<String> counterValueAdapter;
                private final TypeAdapter<Integer> defaultChoiceIndexAdapter;
                private final TypeAdapter<Long> endMsAdapter;
                private final TypeAdapter<String> ftueTextAdapter;
                private final TypeAdapter<ImageAssetId> headerImageAdapter;
                private final TypeAdapter<String> headerTextAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<ImpressionData> impressionDataAdapter;
                private final TypeAdapter<Boolean> isFallbackTutorialAdapter;
                private final TypeAdapter<String> layoutTypeAdapter;
                private final TypeAdapter<String> momentTypeAdapter;
                private final TypeAdapter<String> nextSegmentIdAdapter;
                private final TypeAdapter<List<Moment.MomentOverride>> overridesAdapter;
                private final TypeAdapter<Condition> preconditionAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private final TypeAdapter<Map<String, String>> preconditionTokensAdapter;
                private final TypeAdapter<List<Moment>> questionsAdapter;
                private final TypeAdapter<Long> startMsAdapter;
                private final TypeAdapter<String> textAdapter;
                private final TypeAdapter<Moment.TimeoutSegment> timeoutSegmentAdapter;
                private final TypeAdapter<String> toastTextAdapter;
                private final TypeAdapter<Long> uiDisplayMSAdapter;
                private final TypeAdapter<Long> uiHideMSAdapter;
                private final TypeAdapter<ImageAssetId> unlockCharImageAdapter;
                private String defaultId = null;
                private Long defaultStartMs = null;
                private Long defaultEndMs = null;
                private AssetManifest defaultAssetManifest = null;
                private String defaultMomentType = null;
                private boolean defaultIsFallbackTutorial = false;
                private Action defaultAction = null;
                private String defaultLayoutType = null;
                private Long defaultUiDisplayMS = null;
                private Long defaultUiHideMS = null;
                private Integer defaultDefaultChoiceIndex = null;
                private List<Choice> defaultChoices = null;
                private List<Moment> defaultQuestions = null;
                private InteractiveSceneConfig defaultConfig = null;
                private TrackingInfo defaultTrackingInfo = null;
                private Moment.TimeoutSegment defaultTimeoutSegment = null;
                private String defaultHeaderText = null;
                private String defaultCounterValue = null;
                private ImageAssetId defaultImage = null;
                private String defaultBodyText = null;
                private String defaultNextSegmentId = null;
                private Condition defaultPrecondition = null;
                private String defaultPreconditionId = null;
                private String defaultFtueText = null;
                private String defaultToastText = null;
                private String defaultText = null;
                private Map<String, String> defaultPreconditionTokens = null;
                private String defaultAccessibilityDescription = null;
                private ImpressionData defaultImpressionData = null;
                private List<Long> defaultActivationWindow = null;
                private List<Integer> defaultAnswerSequence = null;
                private ImageAssetId defaultHeaderImage = null;
                private StringsObject defaultInteractiveStrings = null;
                private ImageAssetId defaultUnlockCharImage = null;
                private Integer defaultCorrectIndex = null;
                private List<Integer> defaultCorrectInput = null;
                private TrackingInfo defaultTokenizedTrackingInfo = null;
                private List<Moment.MomentOverride> defaultOverrides = null;
                private final TypeAdapter<AssetManifest> assetManifestAdapter = new AssetManifestAdapter();
                private final TypeAdapter<TrackingInfo> trackingInfoAdapter = new TrackingInfoAdapter();
                private final TypeAdapter<StringsObject> interactiveStringsAdapter = new InteractiveStringsAdapter();
                private final TypeAdapter<TrackingInfo> tokenizedTrackingInfoAdapter = new TrackingInfoAdapter();

                public GsonTypeAdapter setDefaultAccessibilityDescription(String str) {
                    this.defaultAccessibilityDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultAction(Action action) {
                    this.defaultAction = action;
                    return this;
                }

                public GsonTypeAdapter setDefaultActivationWindow(List<Long> list) {
                    this.defaultActivationWindow = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultAnswerSequence(List<Integer> list) {
                    this.defaultAnswerSequence = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultAssetManifest(AssetManifest assetManifest) {
                    this.defaultAssetManifest = assetManifest;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyText(String str) {
                    this.defaultBodyText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoices(List<Choice> list) {
                    this.defaultChoices = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultConfig(InteractiveSceneConfig interactiveSceneConfig) {
                    this.defaultConfig = interactiveSceneConfig;
                    return this;
                }

                public GsonTypeAdapter setDefaultCorrectIndex(Integer num) {
                    this.defaultCorrectIndex = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultCorrectInput(List<Integer> list) {
                    this.defaultCorrectInput = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultCounterValue(String str) {
                    this.defaultCounterValue = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultDefaultChoiceIndex(Integer num) {
                    this.defaultDefaultChoiceIndex = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultEndMs(Long l) {
                    this.defaultEndMs = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultFtueText(String str) {
                    this.defaultFtueText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeaderImage(ImageAssetId imageAssetId) {
                    this.defaultHeaderImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeaderText(String str) {
                    this.defaultHeaderText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultImpressionData(ImpressionData impressionData) {
                    this.defaultImpressionData = impressionData;
                    return this;
                }

                public GsonTypeAdapter setDefaultInteractiveStrings(StringsObject stringsObject) {
                    this.defaultInteractiveStrings = stringsObject;
                    return this;
                }

                public GsonTypeAdapter setDefaultIsFallbackTutorial(boolean z) {
                    this.defaultIsFallbackTutorial = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultLayoutType(String str) {
                    this.defaultLayoutType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMomentType(String str) {
                    this.defaultMomentType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextSegmentId(String str) {
                    this.defaultNextSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultOverrides(List<Moment.MomentOverride> list) {
                    this.defaultOverrides = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultPrecondition(Condition condition) {
                    this.defaultPrecondition = condition;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionTokens(Map<String, String> map) {
                    this.defaultPreconditionTokens = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultQuestions(List<Moment> list) {
                    this.defaultQuestions = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartMs(Long l) {
                    this.defaultStartMs = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultText(String str) {
                    this.defaultText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTimeoutSegment(Moment.TimeoutSegment timeoutSegment) {
                    this.defaultTimeoutSegment = timeoutSegment;
                    return this;
                }

                public GsonTypeAdapter setDefaultToastText(String str) {
                    this.defaultToastText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTokenizedTrackingInfo(TrackingInfo trackingInfo) {
                    this.defaultTokenizedTrackingInfo = trackingInfo;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(TrackingInfo trackingInfo) {
                    this.defaultTrackingInfo = trackingInfo;
                    return this;
                }

                public GsonTypeAdapter setDefaultUiDisplayMS(Long l) {
                    this.defaultUiDisplayMS = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultUiHideMS(Long l) {
                    this.defaultUiHideMS = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnlockCharImage(ImageAssetId imageAssetId) {
                    this.defaultUnlockCharImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.startMsAdapter = gson.getAdapter(Long.class);
                    this.endMsAdapter = gson.getAdapter(Long.class);
                    this.momentTypeAdapter = gson.getAdapter(String.class);
                    this.isFallbackTutorialAdapter = gson.getAdapter(Boolean.class);
                    this.actionAdapter = gson.getAdapter(Action.class);
                    this.layoutTypeAdapter = gson.getAdapter(String.class);
                    this.uiDisplayMSAdapter = gson.getAdapter(Long.class);
                    this.uiHideMSAdapter = gson.getAdapter(Long.class);
                    this.defaultChoiceIndexAdapter = gson.getAdapter(Integer.class);
                    this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Choice.class));
                    this.questionsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Moment.class));
                    this.configAdapter = gson.getAdapter(InteractiveSceneConfig.class);
                    this.timeoutSegmentAdapter = gson.getAdapter(Moment.TimeoutSegment.class);
                    this.headerTextAdapter = gson.getAdapter(String.class);
                    this.counterValueAdapter = gson.getAdapter(String.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.bodyTextAdapter = gson.getAdapter(String.class);
                    this.nextSegmentIdAdapter = gson.getAdapter(String.class);
                    this.preconditionAdapter = gson.getAdapter(Condition.class);
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.ftueTextAdapter = gson.getAdapter(String.class);
                    this.toastTextAdapter = gson.getAdapter(String.class);
                    this.textAdapter = gson.getAdapter(String.class);
                    this.preconditionTokensAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                    this.accessibilityDescriptionAdapter = gson.getAdapter(String.class);
                    this.impressionDataAdapter = gson.getAdapter(ImpressionData.class);
                    this.activationWindowAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Long.class));
                    this.answerSequenceAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.headerImageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.unlockCharImageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.correctIndexAdapter = gson.getAdapter(Integer.class);
                    this.correctInputAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.overridesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Moment.MomentOverride.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Moment moment) {
                    if (moment == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, moment.id());
                    jsonWriter.name("startMs");
                    this.startMsAdapter.write(jsonWriter, moment.startMs());
                    jsonWriter.name("endMs");
                    this.endMsAdapter.write(jsonWriter, moment.endMs());
                    jsonWriter.name("assetManifest");
                    this.assetManifestAdapter.write(jsonWriter, moment.assetManifest());
                    jsonWriter.name("type");
                    this.momentTypeAdapter.write(jsonWriter, moment.momentType());
                    jsonWriter.name("isFallbackTutorial");
                    this.isFallbackTutorialAdapter.write(jsonWriter, Boolean.valueOf(moment.isFallbackTutorial()));
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, moment.action());
                    jsonWriter.name("layoutType");
                    this.layoutTypeAdapter.write(jsonWriter, moment.layoutType());
                    jsonWriter.name("uiDisplayMS");
                    this.uiDisplayMSAdapter.write(jsonWriter, moment.uiDisplayMS());
                    jsonWriter.name("uiHideMS");
                    this.uiHideMSAdapter.write(jsonWriter, moment.uiHideMS());
                    jsonWriter.name("defaultChoiceIndex");
                    this.defaultChoiceIndexAdapter.write(jsonWriter, moment.defaultChoiceIndex());
                    jsonWriter.name("choices");
                    this.choicesAdapter.write(jsonWriter, moment.choices());
                    jsonWriter.name("questions");
                    this.questionsAdapter.write(jsonWriter, moment.questions());
                    jsonWriter.name("config");
                    this.configAdapter.write(jsonWriter, moment.config());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, moment.trackingInfo());
                    jsonWriter.name("timeoutSegment");
                    this.timeoutSegmentAdapter.write(jsonWriter, moment.timeoutSegment());
                    jsonWriter.name("headerText");
                    this.headerTextAdapter.write(jsonWriter, moment.headerText());
                    jsonWriter.name("counterValue");
                    this.counterValueAdapter.write(jsonWriter, moment.counterValue());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, moment.image());
                    jsonWriter.name("bodyText");
                    this.bodyTextAdapter.write(jsonWriter, moment.bodyText());
                    jsonWriter.name("nextSegmentId");
                    this.nextSegmentIdAdapter.write(jsonWriter, moment.nextSegmentId());
                    jsonWriter.name("precondition");
                    this.preconditionAdapter.write(jsonWriter, moment.precondition());
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, moment.preconditionId());
                    jsonWriter.name("ftueText");
                    this.ftueTextAdapter.write(jsonWriter, moment.ftueText());
                    jsonWriter.name("toastText");
                    this.toastTextAdapter.write(jsonWriter, moment.toastText());
                    jsonWriter.name("text");
                    this.textAdapter.write(jsonWriter, moment.text());
                    jsonWriter.name("preconditionTokens");
                    this.preconditionTokensAdapter.write(jsonWriter, moment.preconditionTokens());
                    jsonWriter.name("accessibilityDescription");
                    this.accessibilityDescriptionAdapter.write(jsonWriter, moment.accessibilityDescription());
                    jsonWriter.name("impressionData");
                    this.impressionDataAdapter.write(jsonWriter, moment.impressionData());
                    jsonWriter.name("activationWindow");
                    this.activationWindowAdapter.write(jsonWriter, moment.activationWindow());
                    jsonWriter.name("answerSequence");
                    this.answerSequenceAdapter.write(jsonWriter, moment.answerSequence());
                    jsonWriter.name("headerImage");
                    this.headerImageAdapter.write(jsonWriter, moment.headerImage());
                    jsonWriter.name("strings");
                    this.interactiveStringsAdapter.write(jsonWriter, moment.interactiveStrings());
                    jsonWriter.name("unlockCharImage");
                    this.unlockCharImageAdapter.write(jsonWriter, moment.unlockCharImage());
                    jsonWriter.name("correctIndex");
                    this.correctIndexAdapter.write(jsonWriter, moment.correctIndex());
                    jsonWriter.name("correctInput");
                    this.correctInputAdapter.write(jsonWriter, moment.correctInput());
                    jsonWriter.name("tokenizedTrackingInfo");
                    this.tokenizedTrackingInfoAdapter.write(jsonWriter, moment.tokenizedTrackingInfo());
                    jsonWriter.name("overrides");
                    this.overridesAdapter.write(jsonWriter, moment.overrides());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Moment read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    Long l = this.defaultStartMs;
                    Long l2 = this.defaultEndMs;
                    AssetManifest assetManifest = this.defaultAssetManifest;
                    String str2 = this.defaultMomentType;
                    boolean z = this.defaultIsFallbackTutorial;
                    Action action = this.defaultAction;
                    String str3 = this.defaultLayoutType;
                    Long l3 = this.defaultUiDisplayMS;
                    Long l4 = this.defaultUiHideMS;
                    Integer num = this.defaultDefaultChoiceIndex;
                    List<Choice> list = this.defaultChoices;
                    List<Moment> list2 = this.defaultQuestions;
                    InteractiveSceneConfig interactiveSceneConfig = this.defaultConfig;
                    TrackingInfo trackingInfo = this.defaultTrackingInfo;
                    Moment.TimeoutSegment timeoutSegment = this.defaultTimeoutSegment;
                    String str4 = this.defaultHeaderText;
                    String str5 = this.defaultCounterValue;
                    ImageAssetId imageAssetId = this.defaultImage;
                    String str6 = this.defaultBodyText;
                    String str7 = this.defaultNextSegmentId;
                    Condition condition = this.defaultPrecondition;
                    String str8 = this.defaultPreconditionId;
                    String str9 = this.defaultFtueText;
                    String str10 = this.defaultToastText;
                    String str11 = this.defaultText;
                    Map<String, String> map = this.defaultPreconditionTokens;
                    String str12 = this.defaultAccessibilityDescription;
                    ImpressionData impressionData = this.defaultImpressionData;
                    List<Long> list3 = this.defaultActivationWindow;
                    List<Integer> list4 = this.defaultAnswerSequence;
                    ImageAssetId imageAssetId2 = this.defaultHeaderImage;
                    StringsObject stringsObject = this.defaultInteractiveStrings;
                    ImageAssetId imageAssetId3 = this.defaultUnlockCharImage;
                    Integer num2 = this.defaultCorrectIndex;
                    List<Integer> list5 = this.defaultCorrectInput;
                    TrackingInfo trackingInfo2 = this.defaultTokenizedTrackingInfo;
                    List<Moment.MomentOverride> list6 = this.defaultOverrides;
                    Long l5 = l;
                    Long l6 = l2;
                    AssetManifest assetManifest2 = assetManifest;
                    String str13 = str2;
                    boolean z2 = z;
                    Action action2 = action;
                    String str14 = str3;
                    Long l7 = l3;
                    Long l8 = l4;
                    Integer num3 = num;
                    List<Choice> list7 = list;
                    List<Moment> list8 = list2;
                    InteractiveSceneConfig interactiveSceneConfig2 = interactiveSceneConfig;
                    String str15 = str;
                    TrackingInfo trackingInfo3 = trackingInfo;
                    Moment.TimeoutSegment timeoutSegment2 = timeoutSegment;
                    String str16 = str4;
                    String str17 = str5;
                    ImageAssetId imageAssetId4 = imageAssetId;
                    String str18 = str6;
                    String str19 = str7;
                    Condition condition2 = condition;
                    String str20 = str8;
                    String str21 = str9;
                    String str22 = str10;
                    String str23 = str11;
                    Map<String, String> map2 = map;
                    String str24 = str12;
                    ImpressionData impressionData2 = impressionData;
                    List<Long> list9 = list3;
                    List<Integer> list10 = list4;
                    ImageAssetId imageAssetId5 = imageAssetId2;
                    StringsObject stringsObject2 = stringsObject;
                    ImageAssetId imageAssetId6 = imageAssetId3;
                    Integer num4 = num2;
                    List<Integer> list11 = list5;
                    TrackingInfo trackingInfo4 = trackingInfo2;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1983022674:
                                    if (nextName.equals("tokenizedTrackingInfo")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1897185880:
                                    if (nextName.equals("startMs")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1884240891:
                                    if (nextName.equals("trackingInfo")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1881759102:
                                    if (nextName.equals("strings")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1827388792:
                                    if (nextName.equals("correctIndex")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1827376768:
                                    if (nextName.equals("correctInput")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1782234803:
                                    if (nextName.equals("questions")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1771767615:
                                    if (nextName.equals("unlockCharImage")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1675319083:
                                    if (nextName.equals("counterValue")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1422950858:
                                    if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1389667812:
                                    if (nextName.equals("uiHideMS")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1354792126:
                                    if (nextName.equals("config")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -992398924:
                                    if (nextName.equals("uiDisplayMS")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -887141742:
                                    if (nextName.equals("timeoutSegment")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -749969881:
                                    if (nextName.equals("overrides")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -650968616:
                                    if (nextName.equals("precondition")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -499044914:
                                    if (nextName.equals("accessibilityDescription")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -113850029:
                                    if (nextName.equals("impressionData")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3556653:
                                    if (nextName.equals("text")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 85307794:
                                    if (nextName.equals("preconditionTokens")) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 96651233:
                                    if (nextName.equals("endMs")) {
                                        c = 22;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 23;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 262726644:
                                    if (nextName.equals("toastText")) {
                                        c = 24;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 341662084:
                                    if (nextName.equals("layoutType")) {
                                        c = 25;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 407494139:
                                    if (nextName.equals("nextSegmentId")) {
                                        c = 26;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 515393200:
                                    if (nextName.equals("defaultChoiceIndex")) {
                                        c = 27;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 694729259:
                                    if (nextName.equals("ftueText")) {
                                        c = 28;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 751720178:
                                    if (nextName.equals("choices")) {
                                        c = 29;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1010802854:
                                    if (nextName.equals("activationWindow")) {
                                        c = 30;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1163617998:
                                    if (nextName.equals("headerImage")) {
                                        c = 31;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1389268287:
                                    if (nextName.equals("assetManifest")) {
                                        c = ' ';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1484387603:
                                    if (nextName.equals("preconditionId")) {
                                        c = '!';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1544286634:
                                    if (nextName.equals("isFallbackTutorial")) {
                                        c = JsonFactory.DEFAULT_QUOTE_CHAR;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1702646255:
                                    if (nextName.equals("bodyText")) {
                                        c = '#';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1977519450:
                                    if (nextName.equals("headerText")) {
                                        c = '$';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2016443807:
                                    if (nextName.equals("answerSequence")) {
                                        c = '%';
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
                                    trackingInfo4 = this.tokenizedTrackingInfoAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    l5 = this.startMsAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    trackingInfo3 = this.trackingInfoAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    stringsObject2 = this.interactiveStringsAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    num4 = this.correctIndexAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    list11 = this.correctInputAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    list8 = this.questionsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    imageAssetId6 = this.unlockCharImageAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    str17 = this.counterValueAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    action2 = this.actionAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    l8 = this.uiHideMSAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    interactiveSceneConfig2 = this.configAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    l7 = this.uiDisplayMSAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    timeoutSegment2 = this.timeoutSegmentAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    list6 = this.overridesAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    condition2 = this.preconditionAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    str24 = this.accessibilityDescriptionAdapter.read(jsonReader);
                                    continue;
                                case 17:
                                    impressionData2 = this.impressionDataAdapter.read(jsonReader);
                                    continue;
                                case 18:
                                    str15 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 19:
                                    str23 = this.textAdapter.read(jsonReader);
                                    continue;
                                case 20:
                                    str13 = this.momentTypeAdapter.read(jsonReader);
                                    continue;
                                case 21:
                                    map2 = this.preconditionTokensAdapter.read(jsonReader);
                                    continue;
                                case 22:
                                    l6 = this.endMsAdapter.read(jsonReader);
                                    continue;
                                case 23:
                                    imageAssetId4 = this.imageAdapter.read(jsonReader);
                                    continue;
                                case 24:
                                    str22 = this.toastTextAdapter.read(jsonReader);
                                    continue;
                                case 25:
                                    str14 = this.layoutTypeAdapter.read(jsonReader);
                                    continue;
                                case 26:
                                    str19 = this.nextSegmentIdAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                                    num3 = this.defaultChoiceIndexAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                                    str21 = this.ftueTextAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                                    list7 = this.choicesAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                                    list9 = this.activationWindowAdapter.read(jsonReader);
                                    continue;
                                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                                    imageAssetId5 = this.headerImageAdapter.read(jsonReader);
                                    continue;
                                case ' ':
                                    assetManifest2 = this.assetManifestAdapter.read(jsonReader);
                                    continue;
                                case '!':
                                    str20 = this.preconditionIdAdapter.read(jsonReader);
                                    continue;
                                case '\"':
                                    z2 = this.isFallbackTutorialAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '#':
                                    str18 = this.bodyTextAdapter.read(jsonReader);
                                    continue;
                                case '$':
                                    str16 = this.headerTextAdapter.read(jsonReader);
                                    continue;
                                case '%':
                                    list10 = this.answerSequenceAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Moment(str15, l5, l6, assetManifest2, str13, z2, action2, str14, l7, l8, num3, list7, list8, interactiveSceneConfig2, trackingInfo3, timeoutSegment2, str16, str17, imageAssetId4, str18, str19, condition2, str20, str21, str22, str23, map2, str24, impressionData2, list9, list10, imageAssetId5, stringsObject2, imageAssetId6, num4, list11, trackingInfo4, list6);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeLong(startMs().longValue());
        parcel.writeLong(endMs().longValue());
        parcel.writeParcelable(assetManifest(), i);
        if (momentType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(momentType());
        }
        parcel.writeInt(isFallbackTutorial() ? 1 : 0);
        parcel.writeParcelable(action(), i);
        if (layoutType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(layoutType());
        }
        parcel.writeLong(uiDisplayMS().longValue());
        parcel.writeLong(uiHideMS().longValue());
        parcel.writeInt(defaultChoiceIndex().intValue());
        parcel.writeList(choices());
        parcel.writeList(questions());
        parcel.writeParcelable(config(), i);
        parcel.writeParcelable(trackingInfo(), i);
        parcel.writeParcelable(timeoutSegment(), i);
        if (headerText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(headerText());
        }
        if (counterValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(counterValue());
        }
        parcel.writeParcelable(image(), i);
        if (bodyText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(bodyText());
        }
        if (nextSegmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(nextSegmentId());
        }
        parcel.writeParcelable(precondition(), i);
        if (preconditionId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(preconditionId());
        }
        if (ftueText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(ftueText());
        }
        if (toastText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(toastText());
        }
        if (text() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(text());
        }
        parcel.writeMap(preconditionTokens());
        if (accessibilityDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(accessibilityDescription());
        }
        parcel.writeParcelable(impressionData(), i);
        parcel.writeList(activationWindow());
        parcel.writeList(answerSequence());
        parcel.writeParcelable(headerImage(), i);
        parcel.writeParcelable(interactiveStrings(), i);
        parcel.writeParcelable(unlockCharImage(), i);
        if (correctIndex() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(correctIndex().intValue());
        }
        parcel.writeList(correctInput());
        parcel.writeParcelable(tokenizedTrackingInfo(), i);
        parcel.writeList(overrides());
    }
}
