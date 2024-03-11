package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Threshold extends C$AutoValue_Threshold {
    AutoValue_Threshold(final int i, final int i2) {
        new Threshold(i, i2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_Threshold
            private final int red;
            private final int yellow;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.Threshold
            @SerializedName("red")
            public int getRed() {
                return this.red;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.Threshold
            @SerializedName("yellow")
            public int getYellow() {
                return this.yellow;
            }

            public int hashCode() {
                return ((this.red ^ 1000003) * 1000003) ^ this.yellow;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.red = i;
                this.yellow = i2;
            }

            public String toString() {
                return "Threshold{red=" + this.red + ", yellow=" + this.yellow + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Threshold) {
                    Threshold threshold = (Threshold) obj;
                    return this.red == threshold.getRed() && this.yellow == threshold.getYellow();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Threshold> {
        private int defaultRed = 0;
        private int defaultYellow = 0;
        private final TypeAdapter<Integer> redAdapter;
        private final TypeAdapter<Integer> yellowAdapter;

        public GsonTypeAdapter setDefaultRed(int i) {
            this.defaultRed = i;
            return this;
        }

        public GsonTypeAdapter setDefaultYellow(int i) {
            this.defaultYellow = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.redAdapter = gson.getAdapter(Integer.class);
            this.yellowAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Threshold threshold) {
            if (threshold == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("red");
            this.redAdapter.write(jsonWriter, Integer.valueOf(threshold.getRed()));
            jsonWriter.name("yellow");
            this.yellowAdapter.write(jsonWriter, Integer.valueOf(threshold.getYellow()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Threshold read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultRed;
            int i2 = this.defaultYellow;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("yellow")) {
                        i2 = this.yellowAdapter.read(jsonReader).intValue();
                    } else if (nextName.equals("red")) {
                        i = this.redAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Threshold(i, i2);
        }
    }
}
