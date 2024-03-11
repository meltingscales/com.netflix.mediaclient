package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PdsAndLogblobConfig extends C$AutoValue_PdsAndLogblobConfig {
    AutoValue_PdsAndLogblobConfig(final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        new PdsAndLogblobConfig(z, z2, z3, z4) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_PdsAndLogblobConfig
            private final boolean disableOfflineLogblobs;
            private final boolean disableOfflinePdsEvents;
            private final boolean disableStreamingLogblobs;
            private final boolean disableStreamingPdsEvents;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig
            @SerializedName("disableOfflineLogblobs")
            public boolean getDisableOfflineLogblobs() {
                return this.disableOfflineLogblobs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig
            @SerializedName("disableOfflinePdsEvents")
            public boolean getDisableOfflinePdsEvents() {
                return this.disableOfflinePdsEvents;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig
            @SerializedName("disableStreamingLogblobs")
            public boolean getDisableStreamingLogblobs() {
                return this.disableStreamingLogblobs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig
            @SerializedName("disableStreamingPdsEvents")
            public boolean getDisableStreamingPdsEvents() {
                return this.disableStreamingPdsEvents;
            }

            public int hashCode() {
                int i = this.disableStreamingPdsEvents ? 1231 : 1237;
                int i2 = this.disableStreamingLogblobs ? 1231 : 1237;
                return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (this.disableOfflinePdsEvents ? 1231 : 1237)) * 1000003) ^ (this.disableOfflineLogblobs ? 1231 : 1237);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.disableStreamingPdsEvents = z;
                this.disableStreamingLogblobs = z2;
                this.disableOfflinePdsEvents = z3;
                this.disableOfflineLogblobs = z4;
            }

            public String toString() {
                return "PdsAndLogblobConfig{disableStreamingPdsEvents=" + this.disableStreamingPdsEvents + ", disableStreamingLogblobs=" + this.disableStreamingLogblobs + ", disableOfflinePdsEvents=" + this.disableOfflinePdsEvents + ", disableOfflineLogblobs=" + this.disableOfflineLogblobs + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PdsAndLogblobConfig) {
                    PdsAndLogblobConfig pdsAndLogblobConfig = (PdsAndLogblobConfig) obj;
                    return this.disableStreamingPdsEvents == pdsAndLogblobConfig.getDisableStreamingPdsEvents() && this.disableStreamingLogblobs == pdsAndLogblobConfig.getDisableStreamingLogblobs() && this.disableOfflinePdsEvents == pdsAndLogblobConfig.getDisableOfflinePdsEvents() && this.disableOfflineLogblobs == pdsAndLogblobConfig.getDisableOfflineLogblobs();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<PdsAndLogblobConfig> {
        private final TypeAdapter<Boolean> disableOfflineLogblobsAdapter;
        private final TypeAdapter<Boolean> disableOfflinePdsEventsAdapter;
        private final TypeAdapter<Boolean> disableStreamingLogblobsAdapter;
        private final TypeAdapter<Boolean> disableStreamingPdsEventsAdapter;
        private boolean defaultDisableStreamingPdsEvents = false;
        private boolean defaultDisableStreamingLogblobs = false;
        private boolean defaultDisableOfflinePdsEvents = false;
        private boolean defaultDisableOfflineLogblobs = false;

        public GsonTypeAdapter setDefaultDisableOfflineLogblobs(boolean z) {
            this.defaultDisableOfflineLogblobs = z;
            return this;
        }

        public GsonTypeAdapter setDefaultDisableOfflinePdsEvents(boolean z) {
            this.defaultDisableOfflinePdsEvents = z;
            return this;
        }

        public GsonTypeAdapter setDefaultDisableStreamingLogblobs(boolean z) {
            this.defaultDisableStreamingLogblobs = z;
            return this;
        }

        public GsonTypeAdapter setDefaultDisableStreamingPdsEvents(boolean z) {
            this.defaultDisableStreamingPdsEvents = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.disableStreamingPdsEventsAdapter = gson.getAdapter(Boolean.class);
            this.disableStreamingLogblobsAdapter = gson.getAdapter(Boolean.class);
            this.disableOfflinePdsEventsAdapter = gson.getAdapter(Boolean.class);
            this.disableOfflineLogblobsAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, PdsAndLogblobConfig pdsAndLogblobConfig) {
            if (pdsAndLogblobConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("disableStreamingPdsEvents");
            this.disableStreamingPdsEventsAdapter.write(jsonWriter, Boolean.valueOf(pdsAndLogblobConfig.getDisableStreamingPdsEvents()));
            jsonWriter.name("disableStreamingLogblobs");
            this.disableStreamingLogblobsAdapter.write(jsonWriter, Boolean.valueOf(pdsAndLogblobConfig.getDisableStreamingLogblobs()));
            jsonWriter.name("disableOfflinePdsEvents");
            this.disableOfflinePdsEventsAdapter.write(jsonWriter, Boolean.valueOf(pdsAndLogblobConfig.getDisableOfflinePdsEvents()));
            jsonWriter.name("disableOfflineLogblobs");
            this.disableOfflineLogblobsAdapter.write(jsonWriter, Boolean.valueOf(pdsAndLogblobConfig.getDisableOfflineLogblobs()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public PdsAndLogblobConfig read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultDisableStreamingPdsEvents;
            boolean z2 = this.defaultDisableStreamingLogblobs;
            boolean z3 = this.defaultDisableOfflinePdsEvents;
            boolean z4 = this.defaultDisableOfflineLogblobs;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -999482531:
                            if (nextName.equals("disableOfflinePdsEvents")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -503329346:
                            if (nextName.equals("disableStreamingPdsEvents")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -51850579:
                            if (nextName.equals("disableOfflineLogblobs")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1626722348:
                            if (nextName.equals("disableStreamingLogblobs")) {
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
                        z3 = this.disableOfflinePdsEventsAdapter.read(jsonReader).booleanValue();
                    } else if (c == 1) {
                        z = this.disableStreamingPdsEventsAdapter.read(jsonReader).booleanValue();
                    } else if (c == 2) {
                        z4 = this.disableOfflineLogblobsAdapter.read(jsonReader).booleanValue();
                    } else if (c == 3) {
                        z2 = this.disableStreamingLogblobsAdapter.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_PdsAndLogblobConfig(z, z2, z3, z4);
        }
    }
}
