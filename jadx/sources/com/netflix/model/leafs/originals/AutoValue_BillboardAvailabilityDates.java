package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_BillboardAvailabilityDates extends C$AutoValue_BillboardAvailabilityDates {
    AutoValue_BillboardAvailabilityDates(final Long l) {
        new BillboardAvailabilityDates(l) { // from class: com.netflix.model.leafs.originals.$AutoValue_BillboardAvailabilityDates
            private final Long start;

            @Override // com.netflix.model.leafs.originals.BillboardAvailabilityDates
            @SerializedName("start")
            public Long start() {
                return this.start;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.start = l;
            }

            public String toString() {
                return "BillboardAvailabilityDates{start=" + this.start + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BillboardAvailabilityDates) {
                    Long l2 = this.start;
                    Long start = ((BillboardAvailabilityDates) obj).start();
                    return l2 == null ? start == null : l2.equals(start);
                }
                return false;
            }

            public int hashCode() {
                Long l2 = this.start;
                return (l2 == null ? 0 : l2.hashCode()) ^ 1000003;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<BillboardAvailabilityDates> {
        private Long defaultStart = null;
        private final TypeAdapter<Long> startAdapter;

        public GsonTypeAdapter setDefaultStart(Long l) {
            this.defaultStart = l;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.startAdapter = gson.getAdapter(Long.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BillboardAvailabilityDates billboardAvailabilityDates) {
            if (billboardAvailabilityDates == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("start");
            this.startAdapter.write(jsonWriter, billboardAvailabilityDates.start());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public BillboardAvailabilityDates read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Long l = this.defaultStart;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("start")) {
                        l = this.startAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_BillboardAvailabilityDates(l);
        }
    }
}
