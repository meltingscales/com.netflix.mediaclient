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
public final class AutoValue_UmaStyle extends C$AutoValue_UmaStyle {
    AutoValue_UmaStyle(final String str, final Float f, final Float f2, final TextJustification textJustification) {
        new UmaStyle(str, f, f2, textJustification) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaStyle
            private final String color;
            private final Float fontSize;
            private final TextJustification justification;
            private final Float opacity;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaStyleCommonFields
            @SerializedName("color")
            public String color() {
                return this.color;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaStyleCommonFields
            @SerializedName("size")
            public Float fontSize() {
                return this.fontSize;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaStyleCommonFields
            @SerializedName("justification")
            public TextJustification justification() {
                return this.justification;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaStyleCommonFields
            @SerializedName(InteractiveAnimation.ANIMATION_TYPE.OPACITY)
            public Float opacity() {
                return this.opacity;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.color = str;
                this.fontSize = f;
                this.opacity = f2;
                this.justification = textJustification;
            }

            public String toString() {
                return "UmaStyle{color=" + this.color + ", fontSize=" + this.fontSize + ", opacity=" + this.opacity + ", justification=" + this.justification + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaStyle) {
                    UmaStyle umaStyle = (UmaStyle) obj;
                    String str2 = this.color;
                    if (str2 != null ? str2.equals(umaStyle.color()) : umaStyle.color() == null) {
                        Float f3 = this.fontSize;
                        if (f3 != null ? f3.equals(umaStyle.fontSize()) : umaStyle.fontSize() == null) {
                            Float f4 = this.opacity;
                            if (f4 != null ? f4.equals(umaStyle.opacity()) : umaStyle.opacity() == null) {
                                TextJustification textJustification2 = this.justification;
                                if (textJustification2 == null) {
                                    if (umaStyle.justification() == null) {
                                        return true;
                                    }
                                } else if (textJustification2.equals(umaStyle.justification())) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.color;
                int hashCode = str2 == null ? 0 : str2.hashCode();
                Float f3 = this.fontSize;
                int hashCode2 = f3 == null ? 0 : f3.hashCode();
                Float f4 = this.opacity;
                int hashCode3 = f4 == null ? 0 : f4.hashCode();
                TextJustification textJustification2 = this.justification;
                return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (textJustification2 != null ? textJustification2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaStyle> {
        private final TypeAdapter<String> colorAdapter;
        private final TypeAdapter<Float> fontSizeAdapter;
        private final TypeAdapter<TextJustification> justificationAdapter;
        private final TypeAdapter<Float> opacityAdapter;
        private String defaultColor = null;
        private Float defaultFontSize = null;
        private Float defaultOpacity = null;
        private TextJustification defaultJustification = null;

        public GsonTypeAdapter setDefaultColor(String str) {
            this.defaultColor = str;
            return this;
        }

        public GsonTypeAdapter setDefaultFontSize(Float f) {
            this.defaultFontSize = f;
            return this;
        }

        public GsonTypeAdapter setDefaultJustification(TextJustification textJustification) {
            this.defaultJustification = textJustification;
            return this;
        }

        public GsonTypeAdapter setDefaultOpacity(Float f) {
            this.defaultOpacity = f;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.colorAdapter = gson.getAdapter(String.class);
            this.fontSizeAdapter = gson.getAdapter(Float.class);
            this.opacityAdapter = gson.getAdapter(Float.class);
            this.justificationAdapter = gson.getAdapter(TextJustification.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaStyle umaStyle) {
            if (umaStyle == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("color");
            this.colorAdapter.write(jsonWriter, umaStyle.color());
            jsonWriter.name("size");
            this.fontSizeAdapter.write(jsonWriter, umaStyle.fontSize());
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            this.opacityAdapter.write(jsonWriter, umaStyle.opacity());
            jsonWriter.name("justification");
            this.justificationAdapter.write(jsonWriter, umaStyle.justification());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaStyle read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultColor;
            Float f = this.defaultFontSize;
            Float f2 = this.defaultOpacity;
            TextJustification textJustification = this.defaultJustification;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1267206133:
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.OPACITY)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94842723:
                            if (nextName.equals("color")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1864993522:
                            if (nextName.equals("justification")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        f2 = this.opacityAdapter.read(jsonReader);
                    } else if (c == 1) {
                        f = this.fontSizeAdapter.read(jsonReader);
                    } else if (c == 2) {
                        str = this.colorAdapter.read(jsonReader);
                    } else if (c == 3) {
                        textJustification = this.justificationAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaStyle(str, f, f2, textJustification);
        }
    }
}
