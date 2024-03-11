package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TransitionDefinitions_TransitionIds extends C$AutoValue_TransitionDefinitions_TransitionIds {
    public static final Parcelable.Creator<AutoValue_TransitionDefinitions_TransitionIds> CREATOR = new Parcelable.Creator<AutoValue_TransitionDefinitions_TransitionIds>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_TransitionDefinitions_TransitionIds.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransitionDefinitions_TransitionIds createFromParcel(Parcel parcel) {
            return new AutoValue_TransitionDefinitions_TransitionIds(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransitionDefinitions_TransitionIds[] newArray(int i) {
            return new AutoValue_TransitionDefinitions_TransitionIds[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TransitionDefinitions_TransitionIds(final String str) {
        new C$$AutoValue_TransitionDefinitions_TransitionIds(str) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_TransitionDefinitions_TransitionIds

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_TransitionDefinitions_TransitionIds$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TransitionDefinitions.TransitionIds> {
                private String defaultTransitionId = null;
                private final TypeAdapter<String> transitionIdAdapter;

                public GsonTypeAdapter setDefaultTransitionId(String str) {
                    this.defaultTransitionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.transitionIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TransitionDefinitions.TransitionIds transitionIds) {
                    if (transitionIds == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("transitionId");
                    this.transitionIdAdapter.write(jsonWriter, transitionIds.transitionId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TransitionDefinitions.TransitionIds read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultTransitionId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("transitionId")) {
                                str = this.transitionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_TransitionDefinitions_TransitionIds(str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(transitionId());
    }
}
