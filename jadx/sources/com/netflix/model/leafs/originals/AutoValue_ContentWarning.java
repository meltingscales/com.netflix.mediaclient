package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ContentWarning extends C$AutoValue_ContentWarning {
    AutoValue_ContentWarning(final String str, final String str2) {
        new ContentWarning(str, str2) { // from class: com.netflix.model.leafs.originals.$AutoValue_ContentWarning
            private final String message;
            private final String url;

            @Override // com.netflix.model.leafs.originals.ContentWarning
            @SerializedName("message")
            public String message() {
                return this.message;
            }

            @Override // com.netflix.model.leafs.originals.ContentWarning
            @SerializedName(SignupConstants.Field.URL)
            public String url() {
                return this.url;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.url = str;
                this.message = str2;
            }

            public String toString() {
                return "ContentWarning{url=" + this.url + ", message=" + this.message + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ContentWarning) {
                    ContentWarning contentWarning = (ContentWarning) obj;
                    String str3 = this.url;
                    if (str3 != null ? str3.equals(contentWarning.url()) : contentWarning.url() == null) {
                        String str4 = this.message;
                        if (str4 == null) {
                            if (contentWarning.message() == null) {
                                return true;
                            }
                        } else if (str4.equals(contentWarning.message())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str3 = this.url;
                int hashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.message;
                return ((hashCode ^ 1000003) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ContentWarning> {
        private final TypeAdapter<String> messageAdapter;
        private final TypeAdapter<String> urlAdapter;
        private String defaultUrl = null;
        private String defaultMessage = null;

        public GsonTypeAdapter setDefaultMessage(String str) {
            this.defaultMessage = str;
            return this;
        }

        public GsonTypeAdapter setDefaultUrl(String str) {
            this.defaultUrl = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.urlAdapter = gson.getAdapter(String.class);
            this.messageAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ContentWarning contentWarning) {
            if (contentWarning == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.URL);
            this.urlAdapter.write(jsonWriter, contentWarning.url());
            jsonWriter.name("message");
            this.messageAdapter.write(jsonWriter, contentWarning.message());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public ContentWarning read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultUrl;
            String str2 = this.defaultMessage;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals(SignupConstants.Field.URL)) {
                        str = this.urlAdapter.read(jsonReader);
                    } else if (nextName.equals("message")) {
                        str2 = this.messageAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_ContentWarning(str, str2);
        }
    }
}
