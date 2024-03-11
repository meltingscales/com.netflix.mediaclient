package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ChoiceMapOverride extends C$AutoValue_ChoiceMapOverride {
    public static final Parcelable.Creator<AutoValue_ChoiceMapOverride> CREATOR = new Parcelable.Creator<AutoValue_ChoiceMapOverride>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_ChoiceMapOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ChoiceMapOverride createFromParcel(Parcel parcel) {
            return new AutoValue_ChoiceMapOverride(parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readHashMap(ChoiceMapOverride.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ChoiceMapOverride[] newArray(int i) {
            return new AutoValue_ChoiceMapOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ChoiceMapOverride(Integer num, Map<String, Integer> map) {
        new C$$AutoValue_ChoiceMapOverride(num, map) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_ChoiceMapOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_ChoiceMapOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ChoiceMapOverride> {
                private final TypeAdapter<Integer> defaultIndexAdapter;
                private final TypeAdapter<Map<String, Integer>> segmentWeightsAdapter;
                private Integer defaultDefaultIndex = null;
                private Map<String, Integer> defaultSegmentWeights = null;

                public GsonTypeAdapter setDefaultDefaultIndex(Integer num) {
                    this.defaultDefaultIndex = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentWeights(Map<String, Integer> map) {
                    this.defaultSegmentWeights = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.defaultIndexAdapter = gson.getAdapter(Integer.class);
                    this.segmentWeightsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Integer.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ChoiceMapOverride choiceMapOverride) {
                    if (choiceMapOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("defaultIndex");
                    this.defaultIndexAdapter.write(jsonWriter, choiceMapOverride.defaultIndex());
                    jsonWriter.name("segmentWeights");
                    this.segmentWeightsAdapter.write(jsonWriter, choiceMapOverride.segmentWeights());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ChoiceMapOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Integer num = this.defaultDefaultIndex;
                    Map<String, Integer> map = this.defaultSegmentWeights;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("defaultIndex")) {
                                num = this.defaultIndexAdapter.read(jsonReader);
                            } else if (nextName.equals("segmentWeights")) {
                                map = this.segmentWeightsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ChoiceMapOverride(num, map);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (defaultIndex() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(defaultIndex().intValue());
        }
        parcel.writeMap(segmentWeights());
    }
}
