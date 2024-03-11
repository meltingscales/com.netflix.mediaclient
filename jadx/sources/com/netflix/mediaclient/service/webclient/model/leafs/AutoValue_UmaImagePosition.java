package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaImagePosition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaImagePosition extends C$AutoValue_UmaImagePosition {
    AutoValue_UmaImagePosition(final UmaImagePosition.HorizontalPositions horizontalPositions, final UmaImagePosition.VerticalPositions verticalPositions) {
        new UmaImagePosition(horizontalPositions, verticalPositions) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaImagePosition
            private final UmaImagePosition.HorizontalPositions horizontal;
            private final UmaImagePosition.VerticalPositions vertical;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImagePosition
            @SerializedName("horizontal")
            public UmaImagePosition.HorizontalPositions horizontal() {
                return this.horizontal;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImagePosition
            @SerializedName("vertical")
            public UmaImagePosition.VerticalPositions vertical() {
                return this.vertical;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.horizontal = horizontalPositions;
                this.vertical = verticalPositions;
            }

            public String toString() {
                return "UmaImagePosition{horizontal=" + this.horizontal + ", vertical=" + this.vertical + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaImagePosition) {
                    UmaImagePosition umaImagePosition = (UmaImagePosition) obj;
                    UmaImagePosition.HorizontalPositions horizontalPositions2 = this.horizontal;
                    if (horizontalPositions2 != null ? horizontalPositions2.equals(umaImagePosition.horizontal()) : umaImagePosition.horizontal() == null) {
                        UmaImagePosition.VerticalPositions verticalPositions2 = this.vertical;
                        if (verticalPositions2 == null) {
                            if (umaImagePosition.vertical() == null) {
                                return true;
                            }
                        } else if (verticalPositions2.equals(umaImagePosition.vertical())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                UmaImagePosition.HorizontalPositions horizontalPositions2 = this.horizontal;
                int hashCode = horizontalPositions2 == null ? 0 : horizontalPositions2.hashCode();
                UmaImagePosition.VerticalPositions verticalPositions2 = this.vertical;
                return ((hashCode ^ 1000003) * 1000003) ^ (verticalPositions2 != null ? verticalPositions2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaImagePosition> {
        private UmaImagePosition.HorizontalPositions defaultHorizontal = null;
        private UmaImagePosition.VerticalPositions defaultVertical = null;
        private final TypeAdapter<UmaImagePosition.HorizontalPositions> horizontalAdapter;
        private final TypeAdapter<UmaImagePosition.VerticalPositions> verticalAdapter;

        public GsonTypeAdapter setDefaultHorizontal(UmaImagePosition.HorizontalPositions horizontalPositions) {
            this.defaultHorizontal = horizontalPositions;
            return this;
        }

        public GsonTypeAdapter setDefaultVertical(UmaImagePosition.VerticalPositions verticalPositions) {
            this.defaultVertical = verticalPositions;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.horizontalAdapter = gson.getAdapter(UmaImagePosition.HorizontalPositions.class);
            this.verticalAdapter = gson.getAdapter(UmaImagePosition.VerticalPositions.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaImagePosition umaImagePosition) {
            if (umaImagePosition == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("horizontal");
            this.horizontalAdapter.write(jsonWriter, umaImagePosition.horizontal());
            jsonWriter.name("vertical");
            this.verticalAdapter.write(jsonWriter, umaImagePosition.vertical());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaImagePosition read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            UmaImagePosition.HorizontalPositions horizontalPositions = this.defaultHorizontal;
            UmaImagePosition.VerticalPositions verticalPositions = this.defaultVertical;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("vertical")) {
                        verticalPositions = this.verticalAdapter.read(jsonReader);
                    } else if (nextName.equals("horizontal")) {
                        horizontalPositions = this.horizontalAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaImagePosition(horizontalPositions, verticalPositions);
        }
    }
}
