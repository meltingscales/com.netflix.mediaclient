package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Choice extends C$AutoValue_Choice {
    public static final Parcelable.Creator<AutoValue_Choice> CREATOR = new Parcelable.Creator<AutoValue_Choice>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Choice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice createFromParcel(Parcel parcel) {
            return new AutoValue_Choice(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readLong(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Choice.ChoiceAction) parcel.readParcelable(Choice.class.getClassLoader()), (TrackingInfo) parcel.readParcelable(Choice.class.getClassLoader()), (ImpressionData) parcel.readParcelable(Choice.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (ImageAssetId) parcel.readParcelable(Choice.class.getClassLoader()), (ImageElement) parcel.readParcelable(Choice.class.getClassLoader()), (ImageElement) parcel.readParcelable(Choice.class.getClassLoader()), (ImageElement) parcel.readParcelable(Choice.class.getClassLoader()), (ImageElement) parcel.readParcelable(Choice.class.getClassLoader()), (Choice) parcel.readParcelable(Choice.class.getClassLoader()), parcel.readArrayList(Choice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice[] newArray(int i) {
            return new AutoValue_Choice[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Choice(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, Choice.ChoiceAction choiceAction, TrackingInfo trackingInfo, ImpressionData impressionData, String str9, ImageAssetId imageAssetId, ImageElement imageElement, ImageElement imageElement2, ImageElement imageElement3, ImageElement imageElement4, Choice choice, List<Choice.ChoiceOverride> list) {
        new C$$AutoValue_Choice(str, str2, str3, j, str4, str5, str6, str7, str8, choiceAction, trackingInfo, impressionData, str9, imageAssetId, imageElement, imageElement2, imageElement3, imageElement4, choice, list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Choice> {
                private final TypeAdapter<String> accessibilityDescriptionAdapter;
                private final TypeAdapter<Choice.ChoiceAction> actionAdapter;
                private final TypeAdapter<ImageElement> backgroundAdapter;
                private final TypeAdapter<String> choiceSegmentIdAdapter;
                private final TypeAdapter<String> codeAdapter;
                private final TypeAdapter<Choice> defaultDataAdapter;
                private final TypeAdapter<ImageElement> foregroundAdapter;
                private final TypeAdapter<ImageElement> iconAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<ImpressionData> impressionDataAdapter;
                private final TypeAdapter<String> optionTypeAdapter;
                private final TypeAdapter<List<Choice.ChoiceOverride>> overridesAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private final TypeAdapter<ImageElement> previewImageAdapter;
                private final TypeAdapter<String> segmentGroupAdapter;
                private final TypeAdapter<Long> startTimeMsAdapter;
                private final TypeAdapter<String> subTextAdapter;
                private final TypeAdapter<String> textAdapter;
                private String defaultId = null;
                private String defaultChoiceSegmentId = null;
                private String defaultSegmentGroup = null;
                private long defaultStartTimeMs = 0;
                private String defaultText = null;
                private String defaultSubText = null;
                private String defaultAccessibilityDescription = null;
                private String defaultOptionType = null;
                private String defaultCode = null;
                private Choice.ChoiceAction defaultAction = null;
                private TrackingInfo defaultTrackingInfo = null;
                private ImpressionData defaultImpressionData = null;
                private String defaultPreconditionId = null;
                private ImageAssetId defaultImage = null;
                private ImageElement defaultBackground = null;
                private ImageElement defaultPreviewImage = null;
                private ImageElement defaultIcon = null;
                private ImageElement defaultForeground = null;
                private Choice defaultDefaultData = null;
                private List<Choice.ChoiceOverride> defaultOverrides = null;
                private final TypeAdapter<TrackingInfo> trackingInfoAdapter = new TrackingInfoAdapter();

                public GsonTypeAdapter setDefaultAccessibilityDescription(String str) {
                    this.defaultAccessibilityDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultAction(Choice.ChoiceAction choiceAction) {
                    this.defaultAction = choiceAction;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackground(ImageElement imageElement) {
                    this.defaultBackground = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceSegmentId(String str) {
                    this.defaultChoiceSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultCode(String str) {
                    this.defaultCode = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultDefaultData(Choice choice) {
                    this.defaultDefaultData = choice;
                    return this;
                }

                public GsonTypeAdapter setDefaultForeground(ImageElement imageElement) {
                    this.defaultForeground = imageElement;
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

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultImpressionData(ImpressionData impressionData) {
                    this.defaultImpressionData = impressionData;
                    return this;
                }

                public GsonTypeAdapter setDefaultOptionType(String str) {
                    this.defaultOptionType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultOverrides(List<Choice.ChoiceOverride> list) {
                    this.defaultOverrides = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreviewImage(ImageElement imageElement) {
                    this.defaultPreviewImage = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentGroup(String str) {
                    this.defaultSegmentGroup = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTimeMs(long j) {
                    this.defaultStartTimeMs = j;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubText(String str) {
                    this.defaultSubText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultText(String str) {
                    this.defaultText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(TrackingInfo trackingInfo) {
                    this.defaultTrackingInfo = trackingInfo;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.choiceSegmentIdAdapter = gson.getAdapter(String.class);
                    this.segmentGroupAdapter = gson.getAdapter(String.class);
                    this.startTimeMsAdapter = gson.getAdapter(Long.class);
                    this.textAdapter = gson.getAdapter(String.class);
                    this.subTextAdapter = gson.getAdapter(String.class);
                    this.accessibilityDescriptionAdapter = gson.getAdapter(String.class);
                    this.optionTypeAdapter = gson.getAdapter(String.class);
                    this.codeAdapter = gson.getAdapter(String.class);
                    this.actionAdapter = gson.getAdapter(Choice.ChoiceAction.class);
                    this.impressionDataAdapter = gson.getAdapter(ImpressionData.class);
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.backgroundAdapter = gson.getAdapter(ImageElement.class);
                    this.previewImageAdapter = gson.getAdapter(ImageElement.class);
                    this.iconAdapter = gson.getAdapter(ImageElement.class);
                    this.foregroundAdapter = gson.getAdapter(ImageElement.class);
                    this.defaultDataAdapter = gson.getAdapter(Choice.class);
                    this.overridesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Choice.ChoiceOverride.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Choice choice) {
                    if (choice == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, choice.id());
                    jsonWriter.name("segmentId");
                    this.choiceSegmentIdAdapter.write(jsonWriter, choice.choiceSegmentId());
                    jsonWriter.name("sg");
                    this.segmentGroupAdapter.write(jsonWriter, choice.segmentGroup());
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, Long.valueOf(choice.startTimeMs()));
                    jsonWriter.name("text");
                    this.textAdapter.write(jsonWriter, choice.text());
                    jsonWriter.name("subText");
                    this.subTextAdapter.write(jsonWriter, choice.subText());
                    jsonWriter.name("accessibilityDescription");
                    this.accessibilityDescriptionAdapter.write(jsonWriter, choice.accessibilityDescription());
                    jsonWriter.name("optionType");
                    this.optionTypeAdapter.write(jsonWriter, choice.optionType());
                    jsonWriter.name("code");
                    this.codeAdapter.write(jsonWriter, choice.code());
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, choice.action());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, choice.trackingInfo());
                    jsonWriter.name("impressionData");
                    this.impressionDataAdapter.write(jsonWriter, choice.impressionData());
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, choice.preconditionId());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, choice.image());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, choice.background());
                    jsonWriter.name("previewImage");
                    this.previewImageAdapter.write(jsonWriter, choice.previewImage());
                    jsonWriter.name("icon");
                    this.iconAdapter.write(jsonWriter, choice.icon());
                    jsonWriter.name("foreground");
                    this.foregroundAdapter.write(jsonWriter, choice.foreground());
                    jsonWriter.name("default");
                    this.defaultDataAdapter.write(jsonWriter, choice.defaultData());
                    jsonWriter.name("overrides");
                    this.overridesAdapter.write(jsonWriter, choice.overrides());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Choice read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultChoiceSegmentId;
                    String str3 = this.defaultSegmentGroup;
                    long j = this.defaultStartTimeMs;
                    String str4 = this.defaultText;
                    String str5 = this.defaultSubText;
                    String str6 = this.defaultAccessibilityDescription;
                    String str7 = this.defaultOptionType;
                    String str8 = this.defaultCode;
                    Choice.ChoiceAction choiceAction = this.defaultAction;
                    TrackingInfo trackingInfo = this.defaultTrackingInfo;
                    ImpressionData impressionData = this.defaultImpressionData;
                    String str9 = this.defaultPreconditionId;
                    ImageAssetId imageAssetId = this.defaultImage;
                    ImageElement imageElement = this.defaultBackground;
                    ImageElement imageElement2 = this.defaultPreviewImage;
                    ImageElement imageElement3 = this.defaultIcon;
                    ImageElement imageElement4 = this.defaultForeground;
                    Choice choice = this.defaultDefaultData;
                    List<Choice.ChoiceOverride> list = this.defaultOverrides;
                    String str10 = str2;
                    String str11 = str3;
                    long j2 = j;
                    String str12 = str4;
                    String str13 = str5;
                    String str14 = str6;
                    String str15 = str7;
                    String str16 = str8;
                    Choice.ChoiceAction choiceAction2 = choiceAction;
                    TrackingInfo trackingInfo2 = trackingInfo;
                    ImpressionData impressionData2 = impressionData;
                    String str17 = str9;
                    String str18 = str;
                    ImageAssetId imageAssetId2 = imageAssetId;
                    ImageElement imageElement5 = imageElement;
                    ImageElement imageElement6 = imageElement2;
                    ImageElement imageElement7 = imageElement3;
                    ImageElement imageElement8 = imageElement4;
                    Choice choice2 = choice;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1884240891:
                                    if (nextName.equals("trackingInfo")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1868540019:
                                    if (nextName.equals("subText")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1847837611:
                                    if (nextName.equals("startTimeMs")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1627805778:
                                    if (nextName.equals("segmentId")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1422950858:
                                    if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1383206285:
                                    if (nextName.equals("previewImage")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -749969881:
                                    if (nextName.equals("overrides")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -499044914:
                                    if (nextName.equals("accessibilityDescription")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -113850029:
                                    if (nextName.equals("impressionData")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3668:
                                    if (nextName.equals("sg")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3059181:
                                    if (nextName.equals("code")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3226745:
                                    if (nextName.equals("icon")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3556653:
                                    if (nextName.equals("text")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1373587791:
                                    if (nextName.equals("optionType")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1484387603:
                                    if (nextName.equals("preconditionId")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1544803905:
                                    if (nextName.equals("default")) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1984457027:
                                    if (nextName.equals("foreground")) {
                                        c = 19;
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
                                    trackingInfo2 = this.trackingInfoAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str13 = this.subTextAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    j2 = this.startTimeMsAdapter.read(jsonReader).longValue();
                                    continue;
                                case 3:
                                    str10 = this.choiceSegmentIdAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    choiceAction2 = this.actionAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageElement6 = this.previewImageAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    imageElement5 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    list = this.overridesAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    str14 = this.accessibilityDescriptionAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    impressionData2 = this.impressionDataAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    str18 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    str11 = this.segmentGroupAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    str16 = this.codeAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    imageElement7 = this.iconAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    str12 = this.textAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    imageAssetId2 = this.imageAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    str15 = this.optionTypeAdapter.read(jsonReader);
                                    continue;
                                case 17:
                                    str17 = this.preconditionIdAdapter.read(jsonReader);
                                    continue;
                                case 18:
                                    choice2 = this.defaultDataAdapter.read(jsonReader);
                                    continue;
                                case 19:
                                    imageElement8 = this.foregroundAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Choice(str18, str10, str11, j2, str12, str13, str14, str15, str16, choiceAction2, trackingInfo2, impressionData2, str17, imageAssetId2, imageElement5, imageElement6, imageElement7, imageElement8, choice2, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        if (choiceSegmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(choiceSegmentId());
        }
        if (segmentGroup() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(segmentGroup());
        }
        parcel.writeLong(startTimeMs());
        if (text() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(text());
        }
        if (subText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(subText());
        }
        if (accessibilityDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(accessibilityDescription());
        }
        if (optionType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(optionType());
        }
        if (code() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(code());
        }
        parcel.writeParcelable(action(), i);
        parcel.writeParcelable(trackingInfo(), i);
        parcel.writeParcelable(impressionData(), i);
        if (preconditionId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(preconditionId());
        }
        parcel.writeParcelable(image(), i);
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(previewImage(), i);
        parcel.writeParcelable(icon(), i);
        parcel.writeParcelable(foreground(), i);
        parcel.writeParcelable(defaultData(), i);
        parcel.writeList(overrides());
    }
}
