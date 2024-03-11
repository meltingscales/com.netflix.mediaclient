package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Url extends C$AutoValue_Url {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Url(final int i, final String str, final List<String> list) {
        new Url(i, str, list) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_Url
            private final int cdnId;
            private final List<String> liveOcaCapabilities;
            private final String url;

            @Override // com.netflix.mediaclient.media.manifest.Url
            @SerializedName("cdn_id")
            public int cdnId() {
                return this.cdnId;
            }

            @Override // com.netflix.mediaclient.media.manifest.Url
            @SerializedName("liveOcaCapabilities")
            public List<String> liveOcaCapabilities() {
                return this.liveOcaCapabilities;
            }

            @Override // com.netflix.mediaclient.media.manifest.Url
            @SerializedName(SignupConstants.Field.URL)
            public String url() {
                return this.url;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.cdnId = i;
                if (str == null) {
                    throw new NullPointerException("Null url");
                }
                this.url = str;
                if (list == null) {
                    throw new NullPointerException("Null liveOcaCapabilities");
                }
                this.liveOcaCapabilities = list;
            }

            public String toString() {
                return "Url{cdnId=" + this.cdnId + ", url=" + this.url + ", liveOcaCapabilities=" + this.liveOcaCapabilities + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Url) {
                    Url url = (Url) obj;
                    return this.cdnId == url.cdnId() && this.url.equals(url.url()) && this.liveOcaCapabilities.equals(url.liveOcaCapabilities());
                }
                return false;
            }

            public int hashCode() {
                int i2 = this.cdnId;
                return ((((i2 ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.liveOcaCapabilities.hashCode();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Url> {
        private final TypeAdapter<Integer> cdnIdAdapter;
        private final TypeAdapter<List<String>> liveOcaCapabilitiesAdapter;
        private final TypeAdapter<String> urlAdapter;
        private int defaultCdnId = 0;
        private String defaultUrl = null;
        private List<String> defaultLiveOcaCapabilities = null;

        public GsonTypeAdapter setDefaultCdnId(int i) {
            this.defaultCdnId = i;
            return this;
        }

        public GsonTypeAdapter setDefaultLiveOcaCapabilities(List<String> list) {
            this.defaultLiveOcaCapabilities = list;
            return this;
        }

        public GsonTypeAdapter setDefaultUrl(String str) {
            this.defaultUrl = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.cdnIdAdapter = gson.getAdapter(Integer.class);
            this.urlAdapter = gson.getAdapter(String.class);
            this.liveOcaCapabilitiesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Url url) {
            if (url == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cdn_id");
            this.cdnIdAdapter.write(jsonWriter, Integer.valueOf(url.cdnId()));
            jsonWriter.name(SignupConstants.Field.URL);
            this.urlAdapter.write(jsonWriter, url.url());
            jsonWriter.name("liveOcaCapabilities");
            this.liveOcaCapabilitiesAdapter.write(jsonWriter, url.liveOcaCapabilities());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.mediaclient.media.manifest.Url read(com.google.gson.stream.JsonReader r9) {
            /*
                r8 = this;
                com.google.gson.stream.JsonToken r0 = r9.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r9.nextNull()
                r9 = 0
                return r9
            Ld:
                r9.beginObject()
                int r0 = r8.defaultCdnId
                java.lang.String r1 = r8.defaultUrl
                java.util.List<java.lang.String> r2 = r8.defaultLiveOcaCapabilities
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L8f
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = -1364957587(0xffffffffaea4666d, float:-7.476051E-11)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = -1261406505(0xffffffffb4d076d7, float:-3.8829486E-7)
                if (r4 == r5) goto L50
                r5 = 116079(0x1c56f, float:1.62661E-40)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "url"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "liveOcaCapabilities"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "cdn_id"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L65
            L63:
                r3 = -1
                goto L66
            L65:
                r3 = 0
            L66:
                if (r3 == 0) goto L82
                if (r3 == r7) goto L79
                if (r3 == r6) goto L70
                r9.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.String> r1 = r8.urlAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.String r1 = (java.lang.String) r1
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r2 = r8.liveOcaCapabilitiesAdapter
                java.lang.Object r2 = r2.read(r9)
                java.util.List r2 = (java.util.List) r2
                goto L16
            L82:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r8.cdnIdAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L16
            L8f:
                r9.endObject()
                com.netflix.mediaclient.media.manifest.AutoValue_Url r9 = new com.netflix.mediaclient.media.manifest.AutoValue_Url
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.media.manifest.AutoValue_Url.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.media.manifest.Url");
        }
    }
}
