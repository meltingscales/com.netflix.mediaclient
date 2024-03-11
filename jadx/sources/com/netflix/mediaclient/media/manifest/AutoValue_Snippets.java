package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Snippets extends C$AutoValue_Snippets {
    AutoValue_Snippets(final Snippet snippet, final Snippet snippet2) {
        new Snippets(snippet, snippet2) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_Snippets
            private final Snippet EndIdent;
            private final Snippet StartIdent;

            @Override // com.netflix.mediaclient.media.manifest.Snippets
            @SerializedName("EndIdent")
            public Snippet EndIdent() {
                return this.EndIdent;
            }

            @Override // com.netflix.mediaclient.media.manifest.Snippets
            @SerializedName("StartIdent")
            public Snippet StartIdent() {
                return this.StartIdent;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.StartIdent = snippet;
                this.EndIdent = snippet2;
            }

            public String toString() {
                return "Snippets{StartIdent=" + this.StartIdent + ", EndIdent=" + this.EndIdent + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Snippets) {
                    Snippets snippets = (Snippets) obj;
                    Snippet snippet3 = this.StartIdent;
                    if (snippet3 != null ? snippet3.equals(snippets.StartIdent()) : snippets.StartIdent() == null) {
                        Snippet snippet4 = this.EndIdent;
                        if (snippet4 == null) {
                            if (snippets.EndIdent() == null) {
                                return true;
                            }
                        } else if (snippet4.equals(snippets.EndIdent())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                Snippet snippet3 = this.StartIdent;
                int hashCode = snippet3 == null ? 0 : snippet3.hashCode();
                Snippet snippet4 = this.EndIdent;
                return ((hashCode ^ 1000003) * 1000003) ^ (snippet4 != null ? snippet4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Snippets> {
        private final TypeAdapter<Snippet> EndIdentAdapter;
        private final TypeAdapter<Snippet> StartIdentAdapter;
        private Snippet defaultStartIdent = null;
        private Snippet defaultEndIdent = null;

        public GsonTypeAdapter setDefaultEndIdent(Snippet snippet) {
            this.defaultEndIdent = snippet;
            return this;
        }

        public GsonTypeAdapter setDefaultStartIdent(Snippet snippet) {
            this.defaultStartIdent = snippet;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.StartIdentAdapter = gson.getAdapter(Snippet.class);
            this.EndIdentAdapter = gson.getAdapter(Snippet.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Snippets snippets) {
            if (snippets == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("StartIdent");
            this.StartIdentAdapter.write(jsonWriter, snippets.StartIdent());
            jsonWriter.name("EndIdent");
            this.EndIdentAdapter.write(jsonWriter, snippets.EndIdent());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Snippets read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Snippet snippet = this.defaultStartIdent;
            Snippet snippet2 = this.defaultEndIdent;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("StartIdent")) {
                        snippet = this.StartIdentAdapter.read(jsonReader);
                    } else if (nextName.equals("EndIdent")) {
                        snippet2 = this.EndIdentAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Snippets(snippet, snippet2);
        }
    }
}
