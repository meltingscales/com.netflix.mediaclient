package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_StreamingCodecPrefData extends C$AutoValue_StreamingCodecPrefData {
    AutoValue_StreamingCodecPrefData(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5) {
        new StreamingCodecPrefData(z, z2, z3, z4, z5) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_StreamingCodecPrefData
            private final boolean AV1CodecEnabled;
            private final boolean AVCHighCodecEnabled;
            private final boolean AVCHighCodecForceEnabled;
            private final boolean VP9HWCodecEnabled;
            private final boolean XHEAACCodecEnabled;

            public int hashCode() {
                int i = this.VP9HWCodecEnabled ? 1231 : 1237;
                int i2 = this.AVCHighCodecEnabled ? 1231 : 1237;
                int i3 = this.AV1CodecEnabled ? 1231 : 1237;
                return ((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (this.AVCHighCodecForceEnabled ? 1231 : 1237)) * 1000003) ^ (this.XHEAACCodecEnabled ? 1231 : 1237);
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData
            @SerializedName("isAV1CodecEnabled")
            public boolean isAV1CodecEnabled() {
                return this.AV1CodecEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData
            @SerializedName("isAVCHighCodecEnabled")
            public boolean isAVCHighCodecEnabled() {
                return this.AVCHighCodecEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData
            @SerializedName("isAVCHighCodecForceEnabled")
            public boolean isAVCHighCodecForceEnabled() {
                return this.AVCHighCodecForceEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData
            @SerializedName("isVP9HWCodecEnabled")
            public boolean isVP9HWCodecEnabled() {
                return this.VP9HWCodecEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData
            @SerializedName("isXHEAACCodecEnabled")
            public boolean isXHEAACCodecEnabled() {
                return this.XHEAACCodecEnabled;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.VP9HWCodecEnabled = z;
                this.AVCHighCodecEnabled = z2;
                this.AV1CodecEnabled = z3;
                this.AVCHighCodecForceEnabled = z4;
                this.XHEAACCodecEnabled = z5;
            }

            public String toString() {
                return "StreamingCodecPrefData{VP9HWCodecEnabled=" + this.VP9HWCodecEnabled + ", AVCHighCodecEnabled=" + this.AVCHighCodecEnabled + ", AV1CodecEnabled=" + this.AV1CodecEnabled + ", AVCHighCodecForceEnabled=" + this.AVCHighCodecForceEnabled + ", XHEAACCodecEnabled=" + this.XHEAACCodecEnabled + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof StreamingCodecPrefData) {
                    StreamingCodecPrefData streamingCodecPrefData = (StreamingCodecPrefData) obj;
                    return this.VP9HWCodecEnabled == streamingCodecPrefData.isVP9HWCodecEnabled() && this.AVCHighCodecEnabled == streamingCodecPrefData.isAVCHighCodecEnabled() && this.AV1CodecEnabled == streamingCodecPrefData.isAV1CodecEnabled() && this.AVCHighCodecForceEnabled == streamingCodecPrefData.isAVCHighCodecForceEnabled() && this.XHEAACCodecEnabled == streamingCodecPrefData.isXHEAACCodecEnabled();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<StreamingCodecPrefData> {
        private final TypeAdapter<Boolean> AV1CodecEnabledAdapter;
        private final TypeAdapter<Boolean> AVCHighCodecEnabledAdapter;
        private final TypeAdapter<Boolean> AVCHighCodecForceEnabledAdapter;
        private final TypeAdapter<Boolean> VP9HWCodecEnabledAdapter;
        private final TypeAdapter<Boolean> XHEAACCodecEnabledAdapter;
        private boolean defaultVP9HWCodecEnabled = false;
        private boolean defaultAVCHighCodecEnabled = false;
        private boolean defaultAV1CodecEnabled = false;
        private boolean defaultAVCHighCodecForceEnabled = false;
        private boolean defaultXHEAACCodecEnabled = false;

        public GsonTypeAdapter setDefaultAV1CodecEnabled(boolean z) {
            this.defaultAV1CodecEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultAVCHighCodecEnabled(boolean z) {
            this.defaultAVCHighCodecEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultAVCHighCodecForceEnabled(boolean z) {
            this.defaultAVCHighCodecForceEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultVP9HWCodecEnabled(boolean z) {
            this.defaultVP9HWCodecEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultXHEAACCodecEnabled(boolean z) {
            this.defaultXHEAACCodecEnabled = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.VP9HWCodecEnabledAdapter = gson.getAdapter(Boolean.class);
            this.AVCHighCodecEnabledAdapter = gson.getAdapter(Boolean.class);
            this.AV1CodecEnabledAdapter = gson.getAdapter(Boolean.class);
            this.AVCHighCodecForceEnabledAdapter = gson.getAdapter(Boolean.class);
            this.XHEAACCodecEnabledAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, StreamingCodecPrefData streamingCodecPrefData) {
            if (streamingCodecPrefData == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("isVP9HWCodecEnabled");
            this.VP9HWCodecEnabledAdapter.write(jsonWriter, Boolean.valueOf(streamingCodecPrefData.isVP9HWCodecEnabled()));
            jsonWriter.name("isAVCHighCodecEnabled");
            this.AVCHighCodecEnabledAdapter.write(jsonWriter, Boolean.valueOf(streamingCodecPrefData.isAVCHighCodecEnabled()));
            jsonWriter.name("isAV1CodecEnabled");
            this.AV1CodecEnabledAdapter.write(jsonWriter, Boolean.valueOf(streamingCodecPrefData.isAV1CodecEnabled()));
            jsonWriter.name("isAVCHighCodecForceEnabled");
            this.AVCHighCodecForceEnabledAdapter.write(jsonWriter, Boolean.valueOf(streamingCodecPrefData.isAVCHighCodecForceEnabled()));
            jsonWriter.name("isXHEAACCodecEnabled");
            this.XHEAACCodecEnabledAdapter.write(jsonWriter, Boolean.valueOf(streamingCodecPrefData.isXHEAACCodecEnabled()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public StreamingCodecPrefData read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultVP9HWCodecEnabled;
            boolean z2 = this.defaultAVCHighCodecEnabled;
            boolean z3 = z;
            boolean z4 = z2;
            boolean z5 = this.defaultAV1CodecEnabled;
            boolean z6 = this.defaultAVCHighCodecForceEnabled;
            boolean z7 = this.defaultXHEAACCodecEnabled;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2088277105:
                            if (nextName.equals("isVP9HWCodecEnabled")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1900531546:
                            if (nextName.equals("isAVCHighCodecForceEnabled")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1221791549:
                            if (nextName.equals("isXHEAACCodecEnabled")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1431954033:
                            if (nextName.equals("isAVCHighCodecEnabled")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1882386589:
                            if (nextName.equals("isAV1CodecEnabled")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        z3 = this.VP9HWCodecEnabledAdapter.read(jsonReader).booleanValue();
                    } else if (c == 1) {
                        z6 = this.AVCHighCodecForceEnabledAdapter.read(jsonReader).booleanValue();
                    } else if (c == 2) {
                        z7 = this.XHEAACCodecEnabledAdapter.read(jsonReader).booleanValue();
                    } else if (c == 3) {
                        z4 = this.AVCHighCodecEnabledAdapter.read(jsonReader).booleanValue();
                    } else if (c == 4) {
                        z5 = this.AV1CodecEnabledAdapter.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_StreamingCodecPrefData(z3, z4, z5, z6, z7);
        }
    }
}
