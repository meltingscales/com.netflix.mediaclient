package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Choice extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Choice {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Choice> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Choice>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Choice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Choice createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Choice(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (ImageAssetId) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Choice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Choice[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Choice[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Choice(String str, String str2, String str3, String str4, ImageAssetId imageAssetId) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Choice(str, str2, str3, str4, imageAssetId) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Choice

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Choice$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Choice> {
                private final TypeAdapter<String> choicePointAdapter;
                private final TypeAdapter<String> descriptionAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<String> segmentIdAdapter;
                private final TypeAdapter<String> startTimeMsAdapter;
                private String defaultStartTimeMs = null;
                private String defaultChoicePoint = null;
                private String defaultSegmentId = null;
                private String defaultDescription = null;
                private ImageAssetId defaultImage = null;

                public GsonTypeAdapter setDefaultChoicePoint(String str) {
                    this.defaultChoicePoint = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultDescription(String str) {
                    this.defaultDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTimeMs(String str) {
                    this.defaultStartTimeMs = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.startTimeMsAdapter = gson.getAdapter(String.class);
                    this.choicePointAdapter = gson.getAdapter(String.class);
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                    this.descriptionAdapter = gson.getAdapter(String.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Choice choice) {
                    if (choice == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, choice.startTimeMs());
                    jsonWriter.name("choicePoint");
                    this.choicePointAdapter.write(jsonWriter, choice.choicePoint());
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, choice.segmentId());
                    jsonWriter.name("description");
                    this.descriptionAdapter.write(jsonWriter, choice.description());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, choice.image());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Choice read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultStartTimeMs;
                    String str2 = this.defaultChoicePoint;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.defaultSegmentId;
                    String str6 = this.defaultDescription;
                    ImageAssetId imageAssetId = this.defaultImage;
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
                                case -1724546052:
                                    if (nextName.equals("description")) {
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
                                case -582196113:
                                    if (nextName.equals("choicePoint")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                str3 = this.startTimeMsAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str6 = this.descriptionAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str5 = this.segmentIdAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str4 = this.choicePointAdapter.read(jsonReader);
                            } else if (c == 4) {
                                imageAssetId = this.imageAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Choice(str3, str4, str5, str6, imageAssetId);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (startTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(startTimeMs());
        }
        if (choicePoint() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(choicePoint());
        }
        if (segmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(segmentId());
        }
        if (description() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(description());
        }
        parcel.writeParcelable(image(), i);
    }
}
