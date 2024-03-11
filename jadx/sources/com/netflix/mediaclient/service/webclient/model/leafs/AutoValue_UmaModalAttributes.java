package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaModalAttributes extends C$AutoValue_UmaModalAttributes {
    AutoValue_UmaModalAttributes(final UmaStyle umaStyle, final UmaBackgroundStyle umaBackgroundStyle, final UmaImageDetails umaImageDetails, final UmaDimensions umaDimensions, final UmaPadding umaPadding) {
        new UmaModalAttributes(umaStyle, umaBackgroundStyle, umaImageDetails, umaDimensions, umaPadding) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaModalAttributes
            private final UmaBackgroundStyle background;
            private final UmaDimensions dialogDimensions;
            private final UmaPadding dialogPadding;
            private final UmaImageDetails foreground;
            private final UmaStyle scrim;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes
            @SerializedName("background")
            public UmaBackgroundStyle background() {
                return this.background;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes
            @SerializedName("size")
            public UmaDimensions dialogDimensions() {
                return this.dialogDimensions;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes
            @SerializedName("padding")
            public UmaPadding dialogPadding() {
                return this.dialogPadding;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes
            @SerializedName("foreground")
            public UmaImageDetails foreground() {
                return this.foreground;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes
            @SerializedName("scrim")
            public UmaStyle scrim() {
                return this.scrim;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.scrim = umaStyle;
                this.background = umaBackgroundStyle;
                this.foreground = umaImageDetails;
                this.dialogDimensions = umaDimensions;
                this.dialogPadding = umaPadding;
            }

            public String toString() {
                return "UmaModalAttributes{scrim=" + this.scrim + ", background=" + this.background + ", foreground=" + this.foreground + ", dialogDimensions=" + this.dialogDimensions + ", dialogPadding=" + this.dialogPadding + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaModalAttributes) {
                    UmaModalAttributes umaModalAttributes = (UmaModalAttributes) obj;
                    UmaStyle umaStyle2 = this.scrim;
                    if (umaStyle2 != null ? umaStyle2.equals(umaModalAttributes.scrim()) : umaModalAttributes.scrim() == null) {
                        UmaBackgroundStyle umaBackgroundStyle2 = this.background;
                        if (umaBackgroundStyle2 != null ? umaBackgroundStyle2.equals(umaModalAttributes.background()) : umaModalAttributes.background() == null) {
                            UmaImageDetails umaImageDetails2 = this.foreground;
                            if (umaImageDetails2 != null ? umaImageDetails2.equals(umaModalAttributes.foreground()) : umaModalAttributes.foreground() == null) {
                                UmaDimensions umaDimensions2 = this.dialogDimensions;
                                if (umaDimensions2 != null ? umaDimensions2.equals(umaModalAttributes.dialogDimensions()) : umaModalAttributes.dialogDimensions() == null) {
                                    UmaPadding umaPadding2 = this.dialogPadding;
                                    if (umaPadding2 == null) {
                                        if (umaModalAttributes.dialogPadding() == null) {
                                            return true;
                                        }
                                    } else if (umaPadding2.equals(umaModalAttributes.dialogPadding())) {
                                        return true;
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
                UmaStyle umaStyle2 = this.scrim;
                int hashCode = umaStyle2 == null ? 0 : umaStyle2.hashCode();
                UmaBackgroundStyle umaBackgroundStyle2 = this.background;
                int hashCode2 = umaBackgroundStyle2 == null ? 0 : umaBackgroundStyle2.hashCode();
                UmaImageDetails umaImageDetails2 = this.foreground;
                int hashCode3 = umaImageDetails2 == null ? 0 : umaImageDetails2.hashCode();
                UmaDimensions umaDimensions2 = this.dialogDimensions;
                int hashCode4 = umaDimensions2 == null ? 0 : umaDimensions2.hashCode();
                UmaPadding umaPadding2 = this.dialogPadding;
                return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (umaPadding2 != null ? umaPadding2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaModalAttributes> {
        private final TypeAdapter<UmaBackgroundStyle> backgroundAdapter;
        private final TypeAdapter<UmaDimensions> dialogDimensionsAdapter;
        private final TypeAdapter<UmaPadding> dialogPaddingAdapter;
        private final TypeAdapter<UmaImageDetails> foregroundAdapter;
        private final TypeAdapter<UmaStyle> scrimAdapter;
        private UmaStyle defaultScrim = null;
        private UmaBackgroundStyle defaultBackground = null;
        private UmaImageDetails defaultForeground = null;
        private UmaDimensions defaultDialogDimensions = null;
        private UmaPadding defaultDialogPadding = null;

        public GsonTypeAdapter setDefaultBackground(UmaBackgroundStyle umaBackgroundStyle) {
            this.defaultBackground = umaBackgroundStyle;
            return this;
        }

        public GsonTypeAdapter setDefaultDialogDimensions(UmaDimensions umaDimensions) {
            this.defaultDialogDimensions = umaDimensions;
            return this;
        }

        public GsonTypeAdapter setDefaultDialogPadding(UmaPadding umaPadding) {
            this.defaultDialogPadding = umaPadding;
            return this;
        }

        public GsonTypeAdapter setDefaultForeground(UmaImageDetails umaImageDetails) {
            this.defaultForeground = umaImageDetails;
            return this;
        }

        public GsonTypeAdapter setDefaultScrim(UmaStyle umaStyle) {
            this.defaultScrim = umaStyle;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.scrimAdapter = gson.getAdapter(UmaStyle.class);
            this.backgroundAdapter = gson.getAdapter(UmaBackgroundStyle.class);
            this.foregroundAdapter = gson.getAdapter(UmaImageDetails.class);
            this.dialogDimensionsAdapter = gson.getAdapter(UmaDimensions.class);
            this.dialogPaddingAdapter = gson.getAdapter(UmaPadding.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaModalAttributes umaModalAttributes) {
            if (umaModalAttributes == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("scrim");
            this.scrimAdapter.write(jsonWriter, umaModalAttributes.scrim());
            jsonWriter.name("background");
            this.backgroundAdapter.write(jsonWriter, umaModalAttributes.background());
            jsonWriter.name("foreground");
            this.foregroundAdapter.write(jsonWriter, umaModalAttributes.foreground());
            jsonWriter.name("size");
            this.dialogDimensionsAdapter.write(jsonWriter, umaModalAttributes.dialogDimensions());
            jsonWriter.name("padding");
            this.dialogPaddingAdapter.write(jsonWriter, umaModalAttributes.dialogPadding());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaModalAttributes read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            UmaStyle umaStyle = this.defaultScrim;
            UmaBackgroundStyle umaBackgroundStyle = this.defaultBackground;
            UmaStyle umaStyle2 = umaStyle;
            UmaBackgroundStyle umaBackgroundStyle2 = umaBackgroundStyle;
            UmaImageDetails umaImageDetails = this.defaultForeground;
            UmaDimensions umaDimensions = this.defaultDialogDimensions;
            UmaPadding umaPadding = this.defaultDialogPadding;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1332194002:
                            if (nextName.equals("background")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -806339567:
                            if (nextName.equals("padding")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109267142:
                            if (nextName.equals("scrim")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1984457027:
                            if (nextName.equals("foreground")) {
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
                        umaBackgroundStyle2 = this.backgroundAdapter.read(jsonReader);
                    } else if (c == 1) {
                        umaPadding = this.dialogPaddingAdapter.read(jsonReader);
                    } else if (c == 2) {
                        umaDimensions = this.dialogDimensionsAdapter.read(jsonReader);
                    } else if (c == 3) {
                        umaStyle2 = this.scrimAdapter.read(jsonReader);
                    } else if (c == 4) {
                        umaImageDetails = this.foregroundAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaModalAttributes(umaStyle2, umaBackgroundStyle2, umaImageDetails, umaDimensions, umaPadding);
        }
    }
}
