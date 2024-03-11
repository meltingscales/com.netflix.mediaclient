package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_FtlTarget extends C$AutoValue_FtlTarget {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_FtlTarget(final String str, final String str2) {
        new FtlTarget(str, str2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_FtlTarget
            private final String host;
            private final String name;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget, o.InterfaceC9818xE
            @SerializedName("host")
            public String host() {
                return this.host;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget, o.InterfaceC9818xE
            @SerializedName("name")
            public String name() {
                return this.name;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.name = str;
                this.host = str2;
            }

            public String toString() {
                return "FtlTarget{name=" + this.name + ", host=" + this.host + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof FtlTarget) {
                    FtlTarget ftlTarget = (FtlTarget) obj;
                    String str3 = this.name;
                    if (str3 != null ? str3.equals(ftlTarget.name()) : ftlTarget.name() == null) {
                        String str4 = this.host;
                        if (str4 == null) {
                            if (ftlTarget.host() == null) {
                                return true;
                            }
                        } else if (str4.equals(ftlTarget.host())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str3 = this.name;
                int hashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.host;
                return ((hashCode ^ 1000003) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }

            /* renamed from: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_FtlTarget$Builder */
            /* loaded from: classes.dex */
            static final class Builder extends FtlTarget.Builder {
                private String host;
                private String name;

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget.Builder
                public FtlTarget.Builder host(String str) {
                    this.host = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget.Builder
                public FtlTarget.Builder name(String str) {
                    this.name = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget.Builder
                public FtlTarget build() {
                    return new AutoValue_FtlTarget(this.name, this.host);
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<FtlTarget> {
        private final TypeAdapter<String> hostAdapter;
        private final TypeAdapter<String> nameAdapter;
        private String defaultName = null;
        private String defaultHost = null;

        public GsonTypeAdapter setDefaultHost(String str) {
            this.defaultHost = str;
            return this;
        }

        public GsonTypeAdapter setDefaultName(String str) {
            this.defaultName = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.nameAdapter = gson.getAdapter(String.class);
            this.hostAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, FtlTarget ftlTarget) {
            if (ftlTarget == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("name");
            this.nameAdapter.write(jsonWriter, ftlTarget.name());
            jsonWriter.name("host");
            this.hostAdapter.write(jsonWriter, ftlTarget.host());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public FtlTarget read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultName;
            String str2 = this.defaultHost;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("host")) {
                        str2 = this.hostAdapter.read(jsonReader);
                    } else if (nextName.equals("name")) {
                        str = this.nameAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_FtlTarget(str, str2);
        }
    }
}
