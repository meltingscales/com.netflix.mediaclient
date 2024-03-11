package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.condition.Animations;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Animations_Config extends C$AutoValue_Animations_Config {
    public static final Parcelable.Creator<AutoValue_Animations_Config> CREATOR = new Parcelable.Creator<AutoValue_Animations_Config>() { // from class: com.netflix.model.leafs.originals.interactive.condition.AutoValue_Animations_Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Animations_Config createFromParcel(Parcel parcel) {
            return new AutoValue_Animations_Config(parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Animations_Config[] newArray(int i) {
            return new AutoValue_Animations_Config[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Animations_Config(final Integer num) {
        new C$$AutoValue_Animations_Config(num) { // from class: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_Animations_Config

            /* renamed from: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_Animations_Config$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Animations.Config> {
                private Integer defaultDelayIncrement = null;
                private final TypeAdapter<Integer> delayIncrementAdapter;

                public GsonTypeAdapter setDefaultDelayIncrement(Integer num) {
                    this.defaultDelayIncrement = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.delayIncrementAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Animations.Config config) {
                    if (config == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("delayIncrement");
                    this.delayIncrementAdapter.write(jsonWriter, config.delayIncrement());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Animations.Config read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Integer num = this.defaultDelayIncrement;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("delayIncrement")) {
                                num = this.delayIncrementAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Animations_Config(num);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (delayIncrement() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(delayIncrement().intValue());
    }
}
