package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ExoConfigOverride extends C$AutoValue_ExoConfigOverride {
    AutoValue_ExoConfigOverride(final Map<String, JsonObject> map, final Map<String, Map<String, JsonObject>> map2) {
        new ExoConfigOverride(map, map2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_ExoConfigOverride
            private final Map<String, JsonObject> core;
            private final Map<String, Map<String, JsonObject>> uilabel;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ExoConfigOverride
            @SerializedName("core")
            public Map<String, JsonObject> core() {
                return this.core;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ExoConfigOverride
            @SerializedName("UiLabel")
            public Map<String, Map<String, JsonObject>> uilabel() {
                return this.uilabel;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.core = map;
                this.uilabel = map2;
            }

            public String toString() {
                return "ExoConfigOverride{core=" + this.core + ", uilabel=" + this.uilabel + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ExoConfigOverride) {
                    ExoConfigOverride exoConfigOverride = (ExoConfigOverride) obj;
                    Map<String, JsonObject> map3 = this.core;
                    if (map3 != null ? map3.equals(exoConfigOverride.core()) : exoConfigOverride.core() == null) {
                        Map<String, Map<String, JsonObject>> map4 = this.uilabel;
                        if (map4 == null) {
                            if (exoConfigOverride.uilabel() == null) {
                                return true;
                            }
                        } else if (map4.equals(exoConfigOverride.uilabel())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                Map<String, JsonObject> map3 = this.core;
                int hashCode = map3 == null ? 0 : map3.hashCode();
                Map<String, Map<String, JsonObject>> map4 = this.uilabel;
                return ((hashCode ^ 1000003) * 1000003) ^ (map4 != null ? map4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ExoConfigOverride> {
        private final TypeAdapter<Map<String, JsonObject>> coreAdapter;
        private Map<String, JsonObject> defaultCore = null;
        private Map<String, Map<String, JsonObject>> defaultUilabel = null;
        private final TypeAdapter<Map<String, Map<String, JsonObject>>> uilabelAdapter;

        public GsonTypeAdapter setDefaultCore(Map<String, JsonObject> map) {
            this.defaultCore = map;
            return this;
        }

        public GsonTypeAdapter setDefaultUilabel(Map<String, Map<String, JsonObject>> map) {
            this.defaultUilabel = map;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.coreAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, JsonObject.class));
            this.uilabelAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(Map.class, String.class, JsonObject.class).getType()));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ExoConfigOverride exoConfigOverride) {
            if (exoConfigOverride == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("core");
            this.coreAdapter.write(jsonWriter, exoConfigOverride.core());
            jsonWriter.name("UiLabel");
            this.uilabelAdapter.write(jsonWriter, exoConfigOverride.uilabel());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public ExoConfigOverride read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Map<String, JsonObject> map = this.defaultCore;
            Map<String, Map<String, JsonObject>> map2 = this.defaultUilabel;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("core")) {
                        map = this.coreAdapter.read(jsonReader);
                    } else if (nextName.equals("UiLabel")) {
                        map2 = this.uilabelAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_ExoConfigOverride(map, map2);
        }
    }
}
