package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_MdeConfig extends C$AutoValue_MdeConfig {
    AutoValue_MdeConfig(final boolean z) {
        new MdeConfig(z) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_MdeConfig
            private final boolean disabled;

            public int hashCode() {
                return (this.disabled ? 1231 : 1237) ^ 1000003;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig
            @SerializedName("isDisabled")
            public boolean isDisabled() {
                return this.disabled;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.disabled = z;
            }

            public String toString() {
                return "MdeConfig{disabled=" + this.disabled + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof MdeConfig) && this.disabled == ((MdeConfig) obj).isDisabled();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<MdeConfig> {
        private boolean defaultDisabled = false;
        private final TypeAdapter<Boolean> disabledAdapter;

        public GsonTypeAdapter setDefaultDisabled(boolean z) {
            this.defaultDisabled = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.disabledAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MdeConfig mdeConfig) {
            if (mdeConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("isDisabled");
            this.disabledAdapter.write(jsonWriter, Boolean.valueOf(mdeConfig.isDisabled()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public MdeConfig read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultDisabled;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("isDisabled")) {
                        z = this.disabledAdapter.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_MdeConfig(z);
        }
    }
}
