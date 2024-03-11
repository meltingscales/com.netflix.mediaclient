package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_VideoAssets extends C$AutoValue_VideoAssets {
    AutoValue_VideoAssets(final BillboardVideo billboardVideo) {
        new VideoAssets(billboardVideo) { // from class: com.netflix.model.leafs.originals.$AutoValue_VideoAssets
            private final BillboardVideo horizontalBackground;

            @Override // com.netflix.model.leafs.originals.VideoAssets
            @SerializedName("horizontalBackground")
            public BillboardVideo horizontalBackground() {
                return this.horizontalBackground;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (billboardVideo == null) {
                    throw new NullPointerException("Null horizontalBackground");
                }
                this.horizontalBackground = billboardVideo;
            }

            public String toString() {
                return "VideoAssets{horizontalBackground=" + this.horizontalBackground + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof VideoAssets) {
                    return this.horizontalBackground.equals(((VideoAssets) obj).horizontalBackground());
                }
                return false;
            }

            public int hashCode() {
                return this.horizontalBackground.hashCode() ^ 1000003;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<VideoAssets> {
        private BillboardVideo defaultHorizontalBackground = null;
        private final TypeAdapter<BillboardVideo> horizontalBackgroundAdapter;

        public GsonTypeAdapter setDefaultHorizontalBackground(BillboardVideo billboardVideo) {
            this.defaultHorizontalBackground = billboardVideo;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.horizontalBackgroundAdapter = gson.getAdapter(BillboardVideo.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, VideoAssets videoAssets) {
            if (videoAssets == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("horizontalBackground");
            this.horizontalBackgroundAdapter.write(jsonWriter, videoAssets.horizontalBackground());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public VideoAssets read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BillboardVideo billboardVideo = this.defaultHorizontalBackground;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("horizontalBackground")) {
                        billboardVideo = this.horizontalBackgroundAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_VideoAssets(billboardVideo);
        }
    }
}
