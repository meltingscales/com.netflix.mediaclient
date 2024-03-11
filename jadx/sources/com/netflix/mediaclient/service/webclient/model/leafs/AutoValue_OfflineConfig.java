package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_OfflineConfig extends C$AutoValue_OfflineConfig {
    AutoValue_OfflineConfig(final boolean z, final int i) {
        new OfflineConfig(z, i) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_OfflineConfig
            private final int maintenanceJobPeriodInHrs;
            private final boolean offlineFeatureDisabled;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.OfflineConfig
            @SerializedName("maintenanceJobPeriodInHrs")
            public int getMaintenanceJobPeriodInHrs() {
                return this.maintenanceJobPeriodInHrs;
            }

            public int hashCode() {
                return (((this.offlineFeatureDisabled ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.maintenanceJobPeriodInHrs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.OfflineConfig
            @SerializedName("disableOfflineFeature")
            public boolean isOfflineFeatureDisabled() {
                return this.offlineFeatureDisabled;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.offlineFeatureDisabled = z;
                this.maintenanceJobPeriodInHrs = i;
            }

            public String toString() {
                return "OfflineConfig{offlineFeatureDisabled=" + this.offlineFeatureDisabled + ", maintenanceJobPeriodInHrs=" + this.maintenanceJobPeriodInHrs + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof OfflineConfig) {
                    OfflineConfig offlineConfig = (OfflineConfig) obj;
                    return this.offlineFeatureDisabled == offlineConfig.isOfflineFeatureDisabled() && this.maintenanceJobPeriodInHrs == offlineConfig.getMaintenanceJobPeriodInHrs();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<OfflineConfig> {
        private final TypeAdapter<Integer> maintenanceJobPeriodInHrsAdapter;
        private final TypeAdapter<Boolean> offlineFeatureDisabledAdapter;
        private boolean defaultOfflineFeatureDisabled = false;
        private int defaultMaintenanceJobPeriodInHrs = 0;

        public GsonTypeAdapter setDefaultMaintenanceJobPeriodInHrs(int i) {
            this.defaultMaintenanceJobPeriodInHrs = i;
            return this;
        }

        public GsonTypeAdapter setDefaultOfflineFeatureDisabled(boolean z) {
            this.defaultOfflineFeatureDisabled = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.offlineFeatureDisabledAdapter = gson.getAdapter(Boolean.class);
            this.maintenanceJobPeriodInHrsAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, OfflineConfig offlineConfig) {
            if (offlineConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("disableOfflineFeature");
            this.offlineFeatureDisabledAdapter.write(jsonWriter, Boolean.valueOf(offlineConfig.isOfflineFeatureDisabled()));
            jsonWriter.name("maintenanceJobPeriodInHrs");
            this.maintenanceJobPeriodInHrsAdapter.write(jsonWriter, Integer.valueOf(offlineConfig.getMaintenanceJobPeriodInHrs()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public OfflineConfig read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultOfflineFeatureDisabled;
            int i = this.defaultMaintenanceJobPeriodInHrs;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("disableOfflineFeature")) {
                        z = this.offlineFeatureDisabledAdapter.read(jsonReader).booleanValue();
                    } else if (nextName.equals("maintenanceJobPeriodInHrs")) {
                        i = this.maintenanceJobPeriodInHrsAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_OfflineConfig(z, i);
        }
    }
}
