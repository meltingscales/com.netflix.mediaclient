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
public final class AutoValue_UmaImageDetails extends C$AutoValue_UmaImageDetails {
    AutoValue_UmaImageDetails(final String str, final String str2, final String str3, final Float f, final UmaImagePosition umaImagePosition, final UmaDimensions umaDimensions) {
        new UmaImageDetails(str, str2, str3, f, umaImagePosition, umaDimensions) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaImageDetails
            private final UmaDimensions dimensions;
            private final String imageUrlHigh;
            private final String imageUrlLow;
            private final String imageUrlMedium;
            private final Float opacity;
            private final UmaImagePosition position;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName("size")
            public UmaDimensions dimensions() {
                return this.dimensions;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName("imageUrlHigh")
            public String imageUrlHigh() {
                return this.imageUrlHigh;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName("imageUrlLow")
            public String imageUrlLow() {
                return this.imageUrlLow;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName("imageUrlMedium")
            public String imageUrlMedium() {
                return this.imageUrlMedium;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
            public Float opacity() {
                return this.opacity;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails
            @SerializedName("position")
            public UmaImagePosition position() {
                return this.position;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.imageUrlHigh = str;
                this.imageUrlMedium = str2;
                this.imageUrlLow = str3;
                this.opacity = f;
                this.position = umaImagePosition;
                this.dimensions = umaDimensions;
            }

            public String toString() {
                return "UmaImageDetails{imageUrlHigh=" + this.imageUrlHigh + ", imageUrlMedium=" + this.imageUrlMedium + ", imageUrlLow=" + this.imageUrlLow + ", opacity=" + this.opacity + ", position=" + this.position + ", dimensions=" + this.dimensions + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaImageDetails) {
                    UmaImageDetails umaImageDetails = (UmaImageDetails) obj;
                    String str4 = this.imageUrlHigh;
                    if (str4 != null ? str4.equals(umaImageDetails.imageUrlHigh()) : umaImageDetails.imageUrlHigh() == null) {
                        String str5 = this.imageUrlMedium;
                        if (str5 != null ? str5.equals(umaImageDetails.imageUrlMedium()) : umaImageDetails.imageUrlMedium() == null) {
                            String str6 = this.imageUrlLow;
                            if (str6 != null ? str6.equals(umaImageDetails.imageUrlLow()) : umaImageDetails.imageUrlLow() == null) {
                                Float f2 = this.opacity;
                                if (f2 != null ? f2.equals(umaImageDetails.opacity()) : umaImageDetails.opacity() == null) {
                                    UmaImagePosition umaImagePosition2 = this.position;
                                    if (umaImagePosition2 != null ? umaImagePosition2.equals(umaImageDetails.position()) : umaImageDetails.position() == null) {
                                        UmaDimensions umaDimensions2 = this.dimensions;
                                        if (umaDimensions2 == null) {
                                            if (umaImageDetails.dimensions() == null) {
                                                return true;
                                            }
                                        } else if (umaDimensions2.equals(umaImageDetails.dimensions())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str4 = this.imageUrlHigh;
                int hashCode = str4 == null ? 0 : str4.hashCode();
                String str5 = this.imageUrlMedium;
                int hashCode2 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.imageUrlLow;
                int hashCode3 = str6 == null ? 0 : str6.hashCode();
                Float f2 = this.opacity;
                int hashCode4 = f2 == null ? 0 : f2.hashCode();
                UmaImagePosition umaImagePosition2 = this.position;
                int hashCode5 = umaImagePosition2 == null ? 0 : umaImagePosition2.hashCode();
                UmaDimensions umaDimensions2 = this.dimensions;
                return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (umaDimensions2 != null ? umaDimensions2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaImageDetails> {
        private final TypeAdapter<UmaDimensions> dimensionsAdapter;
        private final TypeAdapter<String> imageUrlHighAdapter;
        private final TypeAdapter<String> imageUrlLowAdapter;
        private final TypeAdapter<String> imageUrlMediumAdapter;
        private final TypeAdapter<Float> opacityAdapter;
        private final TypeAdapter<UmaImagePosition> positionAdapter;
        private String defaultImageUrlHigh = null;
        private String defaultImageUrlMedium = null;
        private String defaultImageUrlLow = null;
        private Float defaultOpacity = null;
        private UmaImagePosition defaultPosition = null;
        private UmaDimensions defaultDimensions = null;

        public GsonTypeAdapter setDefaultDimensions(UmaDimensions umaDimensions) {
            this.defaultDimensions = umaDimensions;
            return this;
        }

        public GsonTypeAdapter setDefaultImageUrlHigh(String str) {
            this.defaultImageUrlHigh = str;
            return this;
        }

        public GsonTypeAdapter setDefaultImageUrlLow(String str) {
            this.defaultImageUrlLow = str;
            return this;
        }

        public GsonTypeAdapter setDefaultImageUrlMedium(String str) {
            this.defaultImageUrlMedium = str;
            return this;
        }

        public GsonTypeAdapter setDefaultOpacity(Float f) {
            this.defaultOpacity = f;
            return this;
        }

        public GsonTypeAdapter setDefaultPosition(UmaImagePosition umaImagePosition) {
            this.defaultPosition = umaImagePosition;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.imageUrlHighAdapter = gson.getAdapter(String.class);
            this.imageUrlMediumAdapter = gson.getAdapter(String.class);
            this.imageUrlLowAdapter = gson.getAdapter(String.class);
            this.opacityAdapter = gson.getAdapter(Float.class);
            this.positionAdapter = gson.getAdapter(UmaImagePosition.class);
            this.dimensionsAdapter = gson.getAdapter(UmaDimensions.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaImageDetails umaImageDetails) {
            if (umaImageDetails == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("imageUrlHigh");
            this.imageUrlHighAdapter.write(jsonWriter, umaImageDetails.imageUrlHigh());
            jsonWriter.name("imageUrlMedium");
            this.imageUrlMediumAdapter.write(jsonWriter, umaImageDetails.imageUrlMedium());
            jsonWriter.name("imageUrlLow");
            this.imageUrlLowAdapter.write(jsonWriter, umaImageDetails.imageUrlLow());
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            this.opacityAdapter.write(jsonWriter, umaImageDetails.opacity());
            jsonWriter.name("position");
            this.positionAdapter.write(jsonWriter, umaImageDetails.position());
            jsonWriter.name("size");
            this.dimensionsAdapter.write(jsonWriter, umaImageDetails.dimensions());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaImageDetails read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultImageUrlHigh;
            String str2 = this.defaultImageUrlMedium;
            String str3 = this.defaultImageUrlLow;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            Float f = this.defaultOpacity;
            UmaImagePosition umaImagePosition = this.defaultPosition;
            UmaDimensions umaDimensions = this.defaultDimensions;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2064408416:
                            if (nextName.equals("imageUrlLow")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1267206133:
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.OPACITY)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1135477079:
                            if (nextName.equals("imageUrlMedium")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 427723222:
                            if (nextName.equals("imageUrlHigh")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 747804969:
                            if (nextName.equals("position")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str6 = this.imageUrlLowAdapter.read(jsonReader);
                    } else if (c == 1) {
                        f = this.opacityAdapter.read(jsonReader);
                    } else if (c == 2) {
                        str5 = this.imageUrlMediumAdapter.read(jsonReader);
                    } else if (c == 3) {
                        umaDimensions = this.dimensionsAdapter.read(jsonReader);
                    } else if (c == 4) {
                        str4 = this.imageUrlHighAdapter.read(jsonReader);
                    } else if (c == 5) {
                        umaImagePosition = this.positionAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaImageDetails(str4, str5, str6, f, umaImagePosition, umaDimensions);
        }
    }
}
