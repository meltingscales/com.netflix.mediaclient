package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint extends C$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint(parcel.readArrayList(PlayerControls.ChoicePointsMetadata.ChoicePoint.class.getClassLoader()), parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? parcel.readString() : null, (ImageAssetId) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.ChoicePoint.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint(List<String> list, Long l, String str, ImageAssetId imageAssetId) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint(list, l, str, imageAssetId) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.ChoicePoint> {
                private final TypeAdapter<List<String>> choicesAdapter;
                private final TypeAdapter<String> descriptionAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<Long> startTimeMsAdapter;
                private List<String> defaultChoices = null;
                private Long defaultStartTimeMs = null;
                private String defaultDescription = null;
                private ImageAssetId defaultImage = null;

                public GsonTypeAdapter setDefaultChoices(List<String> list) {
                    this.defaultChoices = list;
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

                public GsonTypeAdapter setDefaultStartTimeMs(Long l) {
                    this.defaultStartTimeMs = l;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.startTimeMsAdapter = gson.getAdapter(Long.class);
                    this.descriptionAdapter = gson.getAdapter(String.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint) {
                    if (choicePoint == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("choices");
                    this.choicesAdapter.write(jsonWriter, choicePoint.choices());
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, choicePoint.startTimeMs());
                    jsonWriter.name("description");
                    this.descriptionAdapter.write(jsonWriter, choicePoint.description());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, choicePoint.image());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.ChoicePoint read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<String> list = this.defaultChoices;
                    Long l = this.defaultStartTimeMs;
                    String str = this.defaultDescription;
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
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 751720178:
                                    if (nextName.equals("choices")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                l = this.startTimeMsAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str = this.descriptionAdapter.read(jsonReader);
                            } else if (c == 2) {
                                imageAssetId = this.imageAdapter.read(jsonReader);
                            } else if (c == 3) {
                                list = this.choicesAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint(list, l, str, imageAssetId);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(choices());
        if (startTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(startTimeMs().longValue());
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
