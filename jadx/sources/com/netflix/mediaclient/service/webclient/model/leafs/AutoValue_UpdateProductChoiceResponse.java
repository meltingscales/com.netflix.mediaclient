package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UpdateProductChoiceResponse extends C$AutoValue_UpdateProductChoiceResponse {
    AutoValue_UpdateProductChoiceResponse(final boolean z, final boolean z2, final String str) {
        new UpdateProductChoiceResponse(z, z2, str) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UpdateProductChoiceResponse
            private final boolean fallback;
            private final boolean success;
            private final String trackingInfo;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse
            public boolean fallback() {
                return this.fallback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse
            public boolean success() {
                return this.success;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse
            public String trackingInfo() {
                return this.trackingInfo;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.success = z;
                this.fallback = z2;
                if (str == null) {
                    throw new NullPointerException("Null trackingInfo");
                }
                this.trackingInfo = str;
            }

            public String toString() {
                return "UpdateProductChoiceResponse{success=" + this.success + ", fallback=" + this.fallback + ", trackingInfo=" + this.trackingInfo + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UpdateProductChoiceResponse) {
                    UpdateProductChoiceResponse updateProductChoiceResponse = (UpdateProductChoiceResponse) obj;
                    return this.success == updateProductChoiceResponse.success() && this.fallback == updateProductChoiceResponse.fallback() && this.trackingInfo.equals(updateProductChoiceResponse.trackingInfo());
                }
                return false;
            }

            public int hashCode() {
                return (((((this.success ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.fallback ? 1231 : 1237)) * 1000003) ^ this.trackingInfo.hashCode();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UpdateProductChoiceResponse> {
        private final TypeAdapter<Boolean> fallbackAdapter;
        private final TypeAdapter<Boolean> successAdapter;
        private final TypeAdapter<String> trackingInfoAdapter;
        private boolean defaultSuccess = false;
        private boolean defaultFallback = false;
        private String defaultTrackingInfo = null;

        public GsonTypeAdapter setDefaultFallback(boolean z) {
            this.defaultFallback = z;
            return this;
        }

        public GsonTypeAdapter setDefaultSuccess(boolean z) {
            this.defaultSuccess = z;
            return this;
        }

        public GsonTypeAdapter setDefaultTrackingInfo(String str) {
            this.defaultTrackingInfo = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.successAdapter = gson.getAdapter(Boolean.class);
            this.fallbackAdapter = gson.getAdapter(Boolean.class);
            this.trackingInfoAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UpdateProductChoiceResponse updateProductChoiceResponse) {
            if (updateProductChoiceResponse == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("success");
            this.successAdapter.write(jsonWriter, Boolean.valueOf(updateProductChoiceResponse.success()));
            jsonWriter.name("fallback");
            this.fallbackAdapter.write(jsonWriter, Boolean.valueOf(updateProductChoiceResponse.fallback()));
            jsonWriter.name("trackingInfo");
            this.trackingInfoAdapter.write(jsonWriter, updateProductChoiceResponse.trackingInfo());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse read(com.google.gson.stream.JsonReader r9) {
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
                boolean r0 = r8.defaultSuccess
                boolean r1 = r8.defaultFallback
                java.lang.String r2 = r8.defaultTrackingInfo
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L93
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = -1884240891(0xffffffff8fb0c405, float:-1.7430444E-29)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
                if (r4 == r5) goto L50
                r5 = 761243362(0x2d5fa6e2, float:1.2713138E-11)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "fallback"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "success"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "trackingInfo"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L65
            L63:
                r3 = -1
                goto L66
            L65:
                r3 = 0
            L66:
                if (r3 == 0) goto L8a
                if (r3 == r7) goto L7d
                if (r3 == r6) goto L70
                r9.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.Boolean> r1 = r8.fallbackAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                goto L16
            L7d:
                com.google.gson.TypeAdapter<java.lang.Boolean> r0 = r8.successAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L16
            L8a:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r8.trackingInfoAdapter
                java.lang.Object r2 = r2.read(r9)
                java.lang.String r2 = (java.lang.String) r2
                goto L16
            L93:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UpdateProductChoiceResponse r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UpdateProductChoiceResponse
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UpdateProductChoiceResponse.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse");
        }
    }
}
