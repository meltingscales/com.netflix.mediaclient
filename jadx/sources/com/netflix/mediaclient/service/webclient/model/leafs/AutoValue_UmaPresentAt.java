package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaPresentAt extends C$AutoValue_UmaPresentAt {
    AutoValue_UmaPresentAt(final UmaPresentAt.Point point) {
        new UmaPresentAt(point) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaPresentAt
            private final UmaPresentAt.Point point;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt
            @SerializedName("point")
            public UmaPresentAt.Point point() {
                return this.point;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.point = point;
            }

            public String toString() {
                return "UmaPresentAt{point=" + this.point + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaPresentAt) {
                    UmaPresentAt.Point point2 = this.point;
                    UmaPresentAt.Point point3 = ((UmaPresentAt) obj).point();
                    return point2 == null ? point3 == null : point2.equals(point3);
                }
                return false;
            }

            public int hashCode() {
                UmaPresentAt.Point point2 = this.point;
                return (point2 == null ? 0 : point2.hashCode()) ^ 1000003;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaPresentAt> {
        private UmaPresentAt.Point defaultPoint = null;
        private final TypeAdapter<UmaPresentAt.Point> pointAdapter;

        public GsonTypeAdapter setDefaultPoint(UmaPresentAt.Point point) {
            this.defaultPoint = point;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.pointAdapter = gson.getAdapter(UmaPresentAt.Point.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaPresentAt umaPresentAt) {
            if (umaPresentAt == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("point");
            this.pointAdapter.write(jsonWriter, umaPresentAt.point());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaPresentAt read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            UmaPresentAt.Point point = this.defaultPoint;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("point")) {
                        point = this.pointAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaPresentAt(point);
        }
    }
}
