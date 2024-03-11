package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaButtonStyle extends C$AutoValue_UmaButtonStyle {
    AutoValue_UmaButtonStyle(final String str, final String str2) {
        new UmaButtonStyle(str, str2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaButtonStyle
            private final String buttonColor;
            private final String textColor;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaButtonStyle
            @SerializedName("buttonColor")
            public String buttonColor() {
                return this.buttonColor;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaButtonStyle
            @SerializedName("textColor")
            public String textColor() {
                return this.textColor;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.textColor = str;
                this.buttonColor = str2;
            }

            public String toString() {
                return "UmaButtonStyle{textColor=" + this.textColor + ", buttonColor=" + this.buttonColor + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaButtonStyle) {
                    UmaButtonStyle umaButtonStyle = (UmaButtonStyle) obj;
                    String str3 = this.textColor;
                    if (str3 != null ? str3.equals(umaButtonStyle.textColor()) : umaButtonStyle.textColor() == null) {
                        String str4 = this.buttonColor;
                        if (str4 == null) {
                            if (umaButtonStyle.buttonColor() == null) {
                                return true;
                            }
                        } else if (str4.equals(umaButtonStyle.buttonColor())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str3 = this.textColor;
                int hashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.buttonColor;
                return ((hashCode ^ 1000003) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaButtonStyle> {
        private final TypeAdapter<String> buttonColorAdapter;
        private final TypeAdapter<String> textColorAdapter;
        private String defaultTextColor = null;
        private String defaultButtonColor = null;

        public GsonTypeAdapter setDefaultButtonColor(String str) {
            this.defaultButtonColor = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTextColor(String str) {
            this.defaultTextColor = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.textColorAdapter = gson.getAdapter(String.class);
            this.buttonColorAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaButtonStyle umaButtonStyle) {
            if (umaButtonStyle == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("textColor");
            this.textColorAdapter.write(jsonWriter, umaButtonStyle.textColor());
            jsonWriter.name("buttonColor");
            this.buttonColorAdapter.write(jsonWriter, umaButtonStyle.buttonColor());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaButtonStyle read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultTextColor;
            String str2 = this.defaultButtonColor;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("buttonColor")) {
                        str2 = this.buttonColorAdapter.read(jsonReader);
                    } else if (nextName.equals("textColor")) {
                        str = this.textColorAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaButtonStyle(str, str2);
        }
    }
}
