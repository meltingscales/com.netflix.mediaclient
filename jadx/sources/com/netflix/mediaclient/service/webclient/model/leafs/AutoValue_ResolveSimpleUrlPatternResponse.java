package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ResolveSimpleUrlPatternResponse extends C$AutoValue_ResolveSimpleUrlPatternResponse {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ResolveSimpleUrlPatternResponse(final String str, final String str2) {
        new ResolveSimpleUrlPatternResponse(str, str2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_ResolveSimpleUrlPatternResponse
            private final String error;
            private final String url;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse
            public String error() {
                return this.error;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse
            public String url() {
                return this.url;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.url = str;
                this.error = str2;
            }

            public String toString() {
                return "ResolveSimpleUrlPatternResponse{url=" + this.url + ", error=" + this.error + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ResolveSimpleUrlPatternResponse) {
                    ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse = (ResolveSimpleUrlPatternResponse) obj;
                    String str3 = this.url;
                    if (str3 != null ? str3.equals(resolveSimpleUrlPatternResponse.url()) : resolveSimpleUrlPatternResponse.url() == null) {
                        String str4 = this.error;
                        if (str4 == null) {
                            if (resolveSimpleUrlPatternResponse.error() == null) {
                                return true;
                            }
                        } else if (str4.equals(resolveSimpleUrlPatternResponse.error())) {
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
                String str4 = this.error;
                return ((hashCode ^ 1000003) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse
            public ResolveSimpleUrlPatternResponse.Builder toBuilder() {
                return new Builder(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_ResolveSimpleUrlPatternResponse$Builder */
            /* loaded from: classes.dex */
            public static final class Builder extends ResolveSimpleUrlPatternResponse.Builder {
                private String error;
                private String url;

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse.Builder
                public ResolveSimpleUrlPatternResponse.Builder error(String str) {
                    this.error = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse.Builder
                public ResolveSimpleUrlPatternResponse.Builder url(String str) {
                    this.url = str;
                    return this;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                public Builder() {
                }

                private Builder(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse) {
                    this.url = resolveSimpleUrlPatternResponse.url();
                    this.error = resolveSimpleUrlPatternResponse.error();
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse.Builder
                public ResolveSimpleUrlPatternResponse build() {
                    return new AutoValue_ResolveSimpleUrlPatternResponse(this.url, this.error);
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ResolveSimpleUrlPatternResponse> {
        private final TypeAdapter<String> errorAdapter;
        private final TypeAdapter<String> urlAdapter;
        private String defaultUrl = null;
        private String defaultError = null;

        public GsonTypeAdapter setDefaultError(String str) {
            this.defaultError = str;
            return this;
        }

        public GsonTypeAdapter setDefaultUrl(String str) {
            this.defaultUrl = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.urlAdapter = gson.getAdapter(String.class);
            this.errorAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse) {
            if (resolveSimpleUrlPatternResponse == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.URL);
            this.urlAdapter.write(jsonWriter, resolveSimpleUrlPatternResponse.url());
            jsonWriter.name(UmaAlert.ICON_ERROR);
            this.errorAdapter.write(jsonWriter, resolveSimpleUrlPatternResponse.error());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public ResolveSimpleUrlPatternResponse read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultUrl;
            String str2 = this.defaultError;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals(SignupConstants.Field.URL)) {
                        str = this.urlAdapter.read(jsonReader);
                    } else if (nextName.equals(UmaAlert.ICON_ERROR)) {
                        str2 = this.errorAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_ResolveSimpleUrlPatternResponse(str, str2);
        }
    }
}
