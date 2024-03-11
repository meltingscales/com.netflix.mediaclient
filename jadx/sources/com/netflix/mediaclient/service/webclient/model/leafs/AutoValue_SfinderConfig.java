package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SfinderConfig extends C$AutoValue_SfinderConfig {
    AutoValue_SfinderConfig(final boolean z, final boolean z2) {
        new SfinderConfig(z, z2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_SfinderConfig
            private final boolean forceDisable;
            private final boolean forceEnable;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig
            @SerializedName("forceDisable")
            public boolean forceDisable() {
                return this.forceDisable;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig
            @SerializedName("forceEnable")
            public boolean forceEnable() {
                return this.forceEnable;
            }

            public int hashCode() {
                return (((this.forceEnable ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.forceDisable ? 1231 : 1237);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.forceEnable = z;
                this.forceDisable = z2;
            }

            public String toString() {
                return "SfinderConfig{forceEnable=" + this.forceEnable + ", forceDisable=" + this.forceDisable + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SfinderConfig) {
                    SfinderConfig sfinderConfig = (SfinderConfig) obj;
                    return this.forceEnable == sfinderConfig.forceEnable() && this.forceDisable == sfinderConfig.forceDisable();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<SfinderConfig> {
        private final TypeAdapter<Boolean> forceDisableAdapter;
        private final TypeAdapter<Boolean> forceEnableAdapter;
        private boolean defaultForceEnable = false;
        private boolean defaultForceDisable = false;

        public GsonTypeAdapter setDefaultForceDisable(boolean z) {
            this.defaultForceDisable = z;
            return this;
        }

        public GsonTypeAdapter setDefaultForceEnable(boolean z) {
            this.defaultForceEnable = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.forceEnableAdapter = gson.getAdapter(Boolean.class);
            this.forceDisableAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, SfinderConfig sfinderConfig) {
            if (sfinderConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("forceEnable");
            this.forceEnableAdapter.write(jsonWriter, Boolean.valueOf(sfinderConfig.forceEnable()));
            jsonWriter.name("forceDisable");
            this.forceDisableAdapter.write(jsonWriter, Boolean.valueOf(sfinderConfig.forceDisable()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public SfinderConfig read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultForceEnable;
            boolean z2 = this.defaultForceDisable;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("forceDisable")) {
                        z2 = this.forceDisableAdapter.read(jsonReader).booleanValue();
                    } else if (nextName.equals("forceEnable")) {
                        z = this.forceEnableAdapter.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_SfinderConfig(z, z2);
        }
    }
}
