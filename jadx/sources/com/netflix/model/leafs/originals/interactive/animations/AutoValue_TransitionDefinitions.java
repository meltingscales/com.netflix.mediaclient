package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TransitionDefinitions extends C$AutoValue_TransitionDefinitions {
    public static final Parcelable.Creator<AutoValue_TransitionDefinitions> CREATOR = new Parcelable.Creator<AutoValue_TransitionDefinitions>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_TransitionDefinitions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransitionDefinitions createFromParcel(Parcel parcel) {
            return new AutoValue_TransitionDefinitions(parcel.readArrayList(TransitionDefinitions.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransitionDefinitions[] newArray(int i) {
            return new AutoValue_TransitionDefinitions[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TransitionDefinitions(List<TransitionDefinitions.TransitionIds> list) {
        new C$$AutoValue_TransitionDefinitions(list) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_TransitionDefinitions

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_TransitionDefinitions$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TransitionDefinitions> {
                private List<TransitionDefinitions.TransitionIds> defaultTransitionIds = null;
                private final TypeAdapter<List<TransitionDefinitions.TransitionIds>> transitionIdsAdapter;

                public GsonTypeAdapter setDefaultTransitionIds(List<TransitionDefinitions.TransitionIds> list) {
                    this.defaultTransitionIds = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.transitionIdsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, TransitionDefinitions.TransitionIds.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TransitionDefinitions transitionDefinitions) {
                    if (transitionDefinitions == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("transitionIds");
                    this.transitionIdsAdapter.write(jsonWriter, transitionDefinitions.transitionIds());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TransitionDefinitions read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<TransitionDefinitions.TransitionIds> list = this.defaultTransitionIds;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("transitionIds")) {
                                list = this.transitionIdsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_TransitionDefinitions(list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(transitionIds());
    }
}
