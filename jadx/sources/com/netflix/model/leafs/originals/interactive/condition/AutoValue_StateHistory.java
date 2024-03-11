package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_StateHistory extends C$AutoValue_StateHistory {
    public static final Parcelable.Creator<AutoValue_StateHistory> CREATOR = new Parcelable.Creator<AutoValue_StateHistory>() { // from class: com.netflix.model.leafs.originals.interactive.condition.AutoValue_StateHistory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_StateHistory createFromParcel(Parcel parcel) {
            return new AutoValue_StateHistory((State) parcel.readParcelable(StateHistory.class.getClassLoader()), (State) parcel.readParcelable(StateHistory.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_StateHistory[] newArray(int i) {
            return new AutoValue_StateHistory[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StateHistory(final State state, final State state2) {
        new C$$AutoValue_StateHistory(state, state2) { // from class: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_StateHistory

            /* renamed from: com.netflix.model.leafs.originals.interactive.condition.$AutoValue_StateHistory$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<StateHistory> {
                private State defaultPersistent = null;
                private State defaultGlobal = null;
                private final TypeAdapter<State> persistentAdapter = new StateAdapter();
                private final TypeAdapter<State> globalAdapter = new StateAdapter();

                public GsonTypeAdapter setDefaultGlobal(State state) {
                    this.defaultGlobal = state;
                    return this;
                }

                public GsonTypeAdapter setDefaultPersistent(State state) {
                    this.defaultPersistent = state;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, StateHistory stateHistory) {
                    if (stateHistory == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("persistent");
                    this.persistentAdapter.write(jsonWriter, stateHistory.persistent());
                    jsonWriter.name("global");
                    this.globalAdapter.write(jsonWriter, stateHistory.global());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public StateHistory read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    State state = this.defaultPersistent;
                    State state2 = this.defaultGlobal;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("global")) {
                                state2 = this.globalAdapter.read(jsonReader);
                            } else if (nextName.equals("persistent")) {
                                state = this.persistentAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_StateHistory(state, state2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(persistent(), i);
        parcel.writeParcelable(global(), i);
    }
}
