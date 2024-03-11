package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Config extends C$AutoValue_UiDefinition_Config {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Config> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Config>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Config(parcel.readInt() == 1, (UiDefinition.Config.Logging) parcel.readParcelable(UiDefinition.Config.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Config[] newArray(int i) {
            return new AutoValue_UiDefinition_Config[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Config(boolean z, UiDefinition.Config.Logging logging) {
        new C$$AutoValue_UiDefinition_Config(z, logging) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Config$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Config> {
                private final TypeAdapter<UiDefinition.Config.Logging> loggingAdapter;
                private final TypeAdapter<Boolean> randomizeDefaultAdapter;
                private boolean defaultRandomizeDefault = false;
                private UiDefinition.Config.Logging defaultLogging = null;

                public GsonTypeAdapter setDefaultLogging(UiDefinition.Config.Logging logging) {
                    this.defaultLogging = logging;
                    return this;
                }

                public GsonTypeAdapter setDefaultRandomizeDefault(boolean z) {
                    this.defaultRandomizeDefault = z;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.randomizeDefaultAdapter = gson.getAdapter(Boolean.class);
                    this.loggingAdapter = gson.getAdapter(UiDefinition.Config.Logging.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Config config) {
                    if (config == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("randomizeDefault");
                    this.randomizeDefaultAdapter.write(jsonWriter, Boolean.valueOf(config.randomizeDefault()));
                    jsonWriter.name("logging");
                    this.loggingAdapter.write(jsonWriter, config.logging());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Config read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    boolean z = this.defaultRandomizeDefault;
                    UiDefinition.Config.Logging logging = this.defaultLogging;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("randomizeDefault")) {
                                z = this.randomizeDefaultAdapter.read(jsonReader).booleanValue();
                            } else if (nextName.equals("logging")) {
                                logging = this.loggingAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Config(z, logging);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(randomizeDefault() ? 1 : 0);
        parcel.writeParcelable(logging(), i);
    }
}
