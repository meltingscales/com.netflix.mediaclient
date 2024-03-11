package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.originals.interactive.Choice;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Choice_ChoiceAction extends C$AutoValue_Choice_ChoiceAction {
    public static final Parcelable.Creator<AutoValue_Choice_ChoiceAction> CREATOR = new Parcelable.Creator<AutoValue_Choice_ChoiceAction>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Choice_ChoiceAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice_ChoiceAction createFromParcel(Parcel parcel) {
            return new AutoValue_Choice_ChoiceAction(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice_ChoiceAction[] newArray(int i) {
            return new AutoValue_Choice_ChoiceAction[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Choice_ChoiceAction(final String str, final String str2, final Integer num, final String str3, final Float f, final String str4, final String str5, final String str6, final Long l, final String str7, final String str8) {
        new C$$AutoValue_Choice_ChoiceAction(str, str2, num, str3, f, str4, str5, str6, l, str7, str8) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice_ChoiceAction

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice_ChoiceAction$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Choice.ChoiceAction> {
                private final TypeAdapter<String> ancestorIdAdapter;
                private final TypeAdapter<Float> bookmarkPositionAdapter;
                private final TypeAdapter<String> momentsIntentAdapter;
                private final TypeAdapter<String> requestIdAdapter;
                private final TypeAdapter<String> segmentIdAdapter;
                private final TypeAdapter<String> sourceOfPlayAdapter;
                private final TypeAdapter<Long> startTimeMsAdapter;
                private final TypeAdapter<Integer> trackIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<String> uiLabelAdapter;
                private final TypeAdapter<String> videoIdAdapter;
                private String defaultType = null;
                private String defaultVideoId = null;
                private Integer defaultTrackId = null;
                private String defaultAncestorId = null;
                private Float defaultBookmarkPosition = null;
                private String defaultUiLabel = null;
                private String defaultSourceOfPlay = null;
                private String defaultSegmentId = null;
                private Long defaultStartTimeMs = null;
                private String defaultMomentsIntent = null;
                private String defaultRequestId = null;

                public GsonTypeAdapter setDefaultAncestorId(String str) {
                    this.defaultAncestorId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBookmarkPosition(Float f) {
                    this.defaultBookmarkPosition = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultMomentsIntent(String str) {
                    this.defaultMomentsIntent = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultRequestId(String str) {
                    this.defaultRequestId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSourceOfPlay(String str) {
                    this.defaultSourceOfPlay = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTimeMs(Long l) {
                    this.defaultStartTimeMs = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackId(Integer num) {
                    this.defaultTrackId = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUiLabel(String str) {
                    this.defaultUiLabel = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoId(String str) {
                    this.defaultVideoId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.videoIdAdapter = gson.getAdapter(String.class);
                    this.trackIdAdapter = gson.getAdapter(Integer.class);
                    this.ancestorIdAdapter = gson.getAdapter(String.class);
                    this.bookmarkPositionAdapter = gson.getAdapter(Float.class);
                    this.uiLabelAdapter = gson.getAdapter(String.class);
                    this.sourceOfPlayAdapter = gson.getAdapter(String.class);
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                    this.startTimeMsAdapter = gson.getAdapter(Long.class);
                    this.momentsIntentAdapter = gson.getAdapter(String.class);
                    this.requestIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Choice.ChoiceAction choiceAction) {
                    if (choiceAction == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, choiceAction.type());
                    jsonWriter.name(SignupConstants.Field.VIDEO_ID);
                    this.videoIdAdapter.write(jsonWriter, choiceAction.videoId());
                    jsonWriter.name("trackId");
                    this.trackIdAdapter.write(jsonWriter, choiceAction.trackId());
                    jsonWriter.name("ancestorId");
                    this.ancestorIdAdapter.write(jsonWriter, choiceAction.ancestorId());
                    jsonWriter.name("bookmarkPosition");
                    this.bookmarkPositionAdapter.write(jsonWriter, choiceAction.bookmarkPosition());
                    jsonWriter.name("uiLabel");
                    this.uiLabelAdapter.write(jsonWriter, choiceAction.uiLabel());
                    jsonWriter.name("sourceOfPlay");
                    this.sourceOfPlayAdapter.write(jsonWriter, choiceAction.sourceOfPlay());
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, choiceAction.segmentId());
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, choiceAction.startTimeMs());
                    jsonWriter.name("momentsIntent");
                    this.momentsIntentAdapter.write(jsonWriter, choiceAction.momentsIntent());
                    jsonWriter.name(Payload.PARAM_RENO_REQUEST_ID);
                    this.requestIdAdapter.write(jsonWriter, choiceAction.requestId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Choice.ChoiceAction read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultType;
                    String str2 = this.defaultVideoId;
                    Integer num = this.defaultTrackId;
                    String str3 = this.defaultAncestorId;
                    Float f = this.defaultBookmarkPosition;
                    String str4 = this.defaultUiLabel;
                    String str5 = this.defaultSourceOfPlay;
                    String str6 = this.defaultSegmentId;
                    Long l = this.defaultStartTimeMs;
                    String str7 = str;
                    String str8 = str2;
                    Integer num2 = num;
                    String str9 = str3;
                    Float f2 = f;
                    String str10 = str4;
                    String str11 = str5;
                    String str12 = str6;
                    Long l2 = l;
                    String str13 = this.defaultMomentsIntent;
                    String str14 = this.defaultRequestId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1847837611:
                                    if (nextName.equals("startTimeMs")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1829827457:
                                    if (nextName.equals("bookmarkPosition")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1627805778:
                                    if (nextName.equals("segmentId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1210253585:
                                    if (nextName.equals("momentsIntent")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1067396154:
                                    if (nextName.equals("trackId")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -457016128:
                                    if (nextName.equals("uiLabel")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 452553294:
                                    if (nextName.equals("ancestorId")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 452782838:
                                    if (nextName.equals(SignupConstants.Field.VIDEO_ID)) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 693933066:
                                    if (nextName.equals(Payload.PARAM_RENO_REQUEST_ID)) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1199365542:
                                    if (nextName.equals("sourceOfPlay")) {
                                        c = '\n';
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
                                    l2 = this.startTimeMsAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    f2 = this.bookmarkPositionAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str12 = this.segmentIdAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str13 = this.momentsIntentAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    num2 = this.trackIdAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str10 = this.uiLabelAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str7 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str9 = this.ancestorIdAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    str8 = this.videoIdAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    str14 = this.requestIdAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    str11 = this.sourceOfPlayAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Choice_ChoiceAction(str7, str8, num2, str9, f2, str10, str11, str12, l2, str13, str14);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(type());
        if (videoId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(videoId());
        }
        if (trackId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(trackId().intValue());
        }
        if (ancestorId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(ancestorId());
        }
        if (bookmarkPosition() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(bookmarkPosition().floatValue());
        }
        if (uiLabel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(uiLabel());
        }
        if (sourceOfPlay() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(sourceOfPlay());
        }
        if (segmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(segmentId());
        }
        if (startTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(startTimeMs().longValue());
        }
        if (momentsIntent() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(momentsIntent());
        }
        if (requestId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(requestId());
    }
}
