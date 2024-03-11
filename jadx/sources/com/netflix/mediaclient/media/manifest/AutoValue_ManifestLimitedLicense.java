package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Arrays;
import o.AbstractC4560bgn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ManifestLimitedLicense extends C$AutoValue_ManifestLimitedLicense {
    AutoValue_ManifestLimitedLicense(final byte[] bArr, final int i) {
        new ManifestLimitedLicense(bArr, i) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_ManifestLimitedLicense
            private final byte[] bytes;
            private final int drmSessionId;

            @Override // com.netflix.mediaclient.media.manifest.ManifestLimitedLicense
            @SerializedName("licenseResponseBase64")
            public byte[] bytes() {
                return this.bytes;
            }

            @Override // com.netflix.mediaclient.media.manifest.ManifestLimitedLicense
            @SerializedName("drmSessionId")
            public int drmSessionId() {
                return this.drmSessionId;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (bArr == null) {
                    throw new NullPointerException("Null bytes");
                }
                this.bytes = bArr;
                this.drmSessionId = i;
            }

            public String toString() {
                return "ManifestLimitedLicense{bytes=" + Arrays.toString(this.bytes) + ", drmSessionId=" + this.drmSessionId + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ManifestLimitedLicense) {
                    ManifestLimitedLicense manifestLimitedLicense = (ManifestLimitedLicense) obj;
                    return Arrays.equals(this.bytes, manifestLimitedLicense instanceof C$AutoValue_ManifestLimitedLicense ? ((C$AutoValue_ManifestLimitedLicense) manifestLimitedLicense).bytes : manifestLimitedLicense.bytes()) && this.drmSessionId == manifestLimitedLicense.drmSessionId();
                }
                return false;
            }

            public int hashCode() {
                return ((Arrays.hashCode(this.bytes) ^ 1000003) * 1000003) ^ this.drmSessionId;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ManifestLimitedLicense> {
        private final TypeAdapter<Integer> drmSessionIdAdapter;
        private byte[] defaultBytes = null;
        private int defaultDrmSessionId = 0;
        private final TypeAdapter<byte[]> bytesAdapter = new AbstractC4560bgn.e();

        public GsonTypeAdapter setDefaultBytes(byte[] bArr) {
            this.defaultBytes = bArr;
            return this;
        }

        public GsonTypeAdapter setDefaultDrmSessionId(int i) {
            this.defaultDrmSessionId = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.drmSessionIdAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ManifestLimitedLicense manifestLimitedLicense) {
            if (manifestLimitedLicense == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("licenseResponseBase64");
            this.bytesAdapter.write(jsonWriter, manifestLimitedLicense.bytes());
            jsonWriter.name("drmSessionId");
            this.drmSessionIdAdapter.write(jsonWriter, Integer.valueOf(manifestLimitedLicense.drmSessionId()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public ManifestLimitedLicense read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            byte[] bArr = this.defaultBytes;
            int i = this.defaultDrmSessionId;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("licenseResponseBase64")) {
                        bArr = this.bytesAdapter.read(jsonReader);
                    } else if (nextName.equals("drmSessionId")) {
                        i = this.drmSessionIdAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_ManifestLimitedLicense(bArr, i);
        }
    }
}
