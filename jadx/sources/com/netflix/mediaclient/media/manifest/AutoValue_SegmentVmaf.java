package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SegmentVmaf extends C$AutoValue_SegmentVmaf {
    AutoValue_SegmentVmaf(final long j, final int i) {
        new SegmentVmaf(j, i) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_SegmentVmaf
            private final long offsetMs;
            private final int vmaf;

            public int hashCode() {
                long j2 = this.offsetMs;
                return ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.vmaf;
            }

            @Override // com.netflix.mediaclient.media.manifest.SegmentVmaf
            @SerializedName("offset")
            public long offsetMs() {
                return this.offsetMs;
            }

            @Override // com.netflix.mediaclient.media.manifest.SegmentVmaf
            @SerializedName("vmaf")
            public int vmaf() {
                return this.vmaf;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.offsetMs = j;
                this.vmaf = i;
            }

            public String toString() {
                return "SegmentVmaf{offsetMs=" + this.offsetMs + ", vmaf=" + this.vmaf + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SegmentVmaf) {
                    SegmentVmaf segmentVmaf = (SegmentVmaf) obj;
                    return this.offsetMs == segmentVmaf.offsetMs() && this.vmaf == segmentVmaf.vmaf();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<SegmentVmaf> {
        private long defaultOffsetMs = 0;
        private int defaultVmaf = 0;
        private final TypeAdapter<Long> offsetMsAdapter;
        private final TypeAdapter<Integer> vmafAdapter;

        public GsonTypeAdapter setDefaultOffsetMs(long j) {
            this.defaultOffsetMs = j;
            return this;
        }

        public GsonTypeAdapter setDefaultVmaf(int i) {
            this.defaultVmaf = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.offsetMsAdapter = gson.getAdapter(Long.class);
            this.vmafAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, SegmentVmaf segmentVmaf) {
            if (segmentVmaf == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("offset");
            this.offsetMsAdapter.write(jsonWriter, Long.valueOf(segmentVmaf.offsetMs()));
            jsonWriter.name("vmaf");
            this.vmafAdapter.write(jsonWriter, Integer.valueOf(segmentVmaf.vmaf()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public SegmentVmaf read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = this.defaultOffsetMs;
            int i = this.defaultVmaf;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("offset")) {
                        j = this.offsetMsAdapter.read(jsonReader).longValue();
                    } else if (nextName.equals("vmaf")) {
                        i = this.vmafAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_SegmentVmaf(j, i);
        }
    }
}
