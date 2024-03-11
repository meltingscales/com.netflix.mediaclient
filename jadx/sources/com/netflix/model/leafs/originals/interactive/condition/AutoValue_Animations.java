package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.condition.Animations;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Animations extends C$AutoValue_Animations {
    public static final Parcelable.Creator<AutoValue_Animations> CREATOR = new Parcelable.Creator<AutoValue_Animations>() { // from class: com.netflix.model.leafs.originals.interactive.condition.AutoValue_Animations.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Animations createFromParcel(Parcel parcel) {
            return new AutoValue_Animations((Animations.Config) parcel.readParcelable(Animations.class.getClassLoader()), parcel.readArrayList(Animations.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Animations[] newArray(int i) {
            return new AutoValue_Animations[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Animations(Animations.Config config, List<List<InteractiveAnimation>> list) {
        new C$$AutoValue_Animations(config, list) { // from class: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_Animations

            /* renamed from: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_Animations$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Animations> {
                private final TypeAdapter<List<List<InteractiveAnimation>>> animationsAdapter;
                private final TypeAdapter<Animations.Config> configAdapter;
                private Animations.Config defaultConfig = null;
                private List<List<InteractiveAnimation>> defaultAnimations = null;

                public GsonTypeAdapter setDefaultAnimations(List<List<InteractiveAnimation>> list) {
                    this.defaultAnimations = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultConfig(Animations.Config config) {
                    this.defaultConfig = config;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.configAdapter = gson.getAdapter(Animations.Config.class);
                    this.animationsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, InteractiveAnimation.class).getType()));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Animations animations) {
                    if (animations == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("config");
                    this.configAdapter.write(jsonWriter, animations.config());
                    jsonWriter.name("animations");
                    this.animationsAdapter.write(jsonWriter, animations.animations());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Animations read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Animations.Config config = this.defaultConfig;
                    List<List<InteractiveAnimation>> list = this.defaultAnimations;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("config")) {
                                config = this.configAdapter.read(jsonReader);
                            } else if (nextName.equals("animations")) {
                                list = this.animationsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Animations(config, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(config(), i);
        parcel.writeList(animations());
    }
}
