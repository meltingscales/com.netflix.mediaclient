package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaDimensions extends C$AutoValue_UmaDimensions {
    AutoValue_UmaDimensions(final Float f, final Float f2) {
        new UmaDimensions(f, f2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaDimensions
            private final Float height;
            private final Float width;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaDimensions
            @SerializedName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)
            public Float height() {
                return this.height;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaDimensions
            @SerializedName(InteractiveAnimation.ANIMATION_TYPE.WIDTH)
            public Float width() {
                return this.width;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.width = f;
                this.height = f2;
            }

            public String toString() {
                return "UmaDimensions{width=" + this.width + ", height=" + this.height + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaDimensions) {
                    UmaDimensions umaDimensions = (UmaDimensions) obj;
                    Float f3 = this.width;
                    if (f3 != null ? f3.equals(umaDimensions.width()) : umaDimensions.width() == null) {
                        Float f4 = this.height;
                        if (f4 == null) {
                            if (umaDimensions.height() == null) {
                                return true;
                            }
                        } else if (f4.equals(umaDimensions.height())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                Float f3 = this.width;
                int hashCode = f3 == null ? 0 : f3.hashCode();
                Float f4 = this.height;
                return ((hashCode ^ 1000003) * 1000003) ^ (f4 != null ? f4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaDimensions> {
        private final TypeAdapter<Float> heightAdapter;
        private final TypeAdapter<Float> widthAdapter;
        private Float defaultWidth = null;
        private Float defaultHeight = null;

        public GsonTypeAdapter setDefaultHeight(Float f) {
            this.defaultHeight = f;
            return this;
        }

        public GsonTypeAdapter setDefaultWidth(Float f) {
            this.defaultWidth = f;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.widthAdapter = gson.getAdapter(Float.class);
            this.heightAdapter = gson.getAdapter(Float.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaDimensions umaDimensions) {
            if (umaDimensions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            this.widthAdapter.write(jsonWriter, umaDimensions.width());
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            this.heightAdapter.write(jsonWriter, umaDimensions.height());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaDimensions read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Float f = this.defaultWidth;
            Float f2 = this.defaultHeight;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                        f2 = this.heightAdapter.read(jsonReader);
                    } else if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                        f = this.widthAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaDimensions(f, f2);
        }
    }
}
