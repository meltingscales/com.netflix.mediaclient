package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_StreamingConfigOverride extends C$AutoValue_StreamingConfigOverride {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StreamingConfigOverride(final ExoConfigOverride exoConfigOverride) {
        new StreamingConfigOverride(exoConfigOverride) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_StreamingConfigOverride
            private final ExoConfigOverride exo;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingConfigOverride
            @SerializedName("exo")
            public ExoConfigOverride exo() {
                return this.exo;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.exo = exoConfigOverride;
            }

            public String toString() {
                return "StreamingConfigOverride{exo=" + this.exo + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof StreamingConfigOverride) {
                    ExoConfigOverride exoConfigOverride2 = this.exo;
                    ExoConfigOverride exo = ((StreamingConfigOverride) obj).exo();
                    return exoConfigOverride2 == null ? exo == null : exoConfigOverride2.equals(exo);
                }
                return false;
            }

            public int hashCode() {
                ExoConfigOverride exoConfigOverride2 = this.exo;
                return (exoConfigOverride2 == null ? 0 : exoConfigOverride2.hashCode()) ^ 1000003;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<StreamingConfigOverride> {
        private ExoConfigOverride defaultExo = null;
        private final TypeAdapter<ExoConfigOverride> exoAdapter;

        public GsonTypeAdapter setDefaultExo(ExoConfigOverride exoConfigOverride) {
            this.defaultExo = exoConfigOverride;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.exoAdapter = gson.getAdapter(ExoConfigOverride.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, StreamingConfigOverride streamingConfigOverride) {
            if (streamingConfigOverride == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("exo");
            this.exoAdapter.write(jsonWriter, streamingConfigOverride.exo());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public StreamingConfigOverride read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            ExoConfigOverride exoConfigOverride = this.defaultExo;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("exo")) {
                        exoConfigOverride = this.exoAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_StreamingConfigOverride(exoConfigOverride);
        }
    }
}
