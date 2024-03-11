package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_StateData extends C$AutoValue_StateData {
    public static final Parcelable.Creator<AutoValue_StateData> CREATOR = new Parcelable.Creator<AutoValue_StateData>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_StateData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_StateData createFromParcel(Parcel parcel) {
            return new AutoValue_StateData(parcel.readHashMap(StateData.class.getClassLoader()), parcel.readHashMap(StateData.class.getClassLoader()), parcel.readHashMap(StateData.class.getClassLoader()), parcel.readHashMap(StateData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_StateData[] newArray(int i) {
            return new AutoValue_StateData[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StateData(Map<String, Condition> map, Map<String, Condition> map2, Map<String, Condition> map3, Map<String, Condition> map4) {
        new C$$AutoValue_StateData(map, map2, map3, map4) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_StateData

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_StateData$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<StateData> {
                private final TypeAdapter<Map<String, Condition>> globalAdapter;
                private final TypeAdapter<Map<String, Condition>> passthroughAdapter;
                private final TypeAdapter<Map<String, Condition>> persistentAdapter;
                private final TypeAdapter<Map<String, Condition>> sessionAdapter;
                private Map<String, Condition> defaultPersistent = null;
                private Map<String, Condition> defaultSession = null;
                private Map<String, Condition> defaultGlobal = null;
                private Map<String, Condition> defaultPassthrough = null;

                public GsonTypeAdapter setDefaultGlobal(Map<String, Condition> map) {
                    this.defaultGlobal = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultPassthrough(Map<String, Condition> map) {
                    this.defaultPassthrough = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultPersistent(Map<String, Condition> map) {
                    this.defaultPersistent = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultSession(Map<String, Condition> map) {
                    this.defaultSession = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.persistentAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Condition.class));
                    this.sessionAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Condition.class));
                    this.globalAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Condition.class));
                    this.passthroughAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Condition.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, StateData stateData) {
                    if (stateData == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("persistent");
                    this.persistentAdapter.write(jsonWriter, stateData.persistent());
                    jsonWriter.name("session");
                    this.sessionAdapter.write(jsonWriter, stateData.session());
                    jsonWriter.name("global");
                    this.globalAdapter.write(jsonWriter, stateData.global());
                    jsonWriter.name("passthrough");
                    this.passthroughAdapter.write(jsonWriter, stateData.passthrough());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public StateData read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Map<String, Condition> map = this.defaultPersistent;
                    Map<String, Condition> map2 = this.defaultSession;
                    Map<String, Condition> map3 = this.defaultGlobal;
                    Map<String, Condition> map4 = this.defaultPassthrough;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1458789996:
                                    if (nextName.equals("passthrough")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1243020381:
                                    if (nextName.equals("global")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 512462487:
                                    if (nextName.equals("persistent")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1984987798:
                                    if (nextName.equals("session")) {
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
                                map4 = this.passthroughAdapter.read(jsonReader);
                            } else if (c == 1) {
                                map3 = this.globalAdapter.read(jsonReader);
                            } else if (c == 2) {
                                map = this.persistentAdapter.read(jsonReader);
                            } else if (c == 3) {
                                map2 = this.sessionAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_StateData(map, map2, map3, map4);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(persistent());
        parcel.writeMap(session());
        parcel.writeMap(global());
        parcel.writeMap(passthrough());
    }
}
