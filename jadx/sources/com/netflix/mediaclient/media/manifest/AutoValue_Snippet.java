package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Snippet extends C$AutoValue_Snippet {
    AutoValue_Snippet(final String str, final long j, final long j2) {
        new Snippet(str, j, j2) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_Snippet
            private final long endTimeMs;
            private final String snippetSpec;
            private final long startTimeMs;

            @Override // com.netflix.mediaclient.media.manifest.Snippet
            @SerializedName("endTimeMs")
            public long endTimeMs() {
                return this.endTimeMs;
            }

            @Override // com.netflix.mediaclient.media.manifest.Snippet
            @SerializedName("snippetSpec")
            public String snippetSpec() {
                return this.snippetSpec;
            }

            @Override // com.netflix.mediaclient.media.manifest.Snippet
            @SerializedName("startTimeMs")
            public long startTimeMs() {
                return this.startTimeMs;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (str == null) {
                    throw new NullPointerException("Null snippetSpec");
                }
                this.snippetSpec = str;
                this.startTimeMs = j;
                this.endTimeMs = j2;
            }

            public String toString() {
                return "Snippet{snippetSpec=" + this.snippetSpec + ", startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Snippet) {
                    Snippet snippet = (Snippet) obj;
                    return this.snippetSpec.equals(snippet.snippetSpec()) && this.startTimeMs == snippet.startTimeMs() && this.endTimeMs == snippet.endTimeMs();
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.snippetSpec.hashCode();
                long j3 = this.startTimeMs;
                long j4 = this.endTimeMs;
                return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Snippet> {
        private final TypeAdapter<Long> endTimeMsAdapter;
        private final TypeAdapter<String> snippetSpecAdapter;
        private final TypeAdapter<Long> startTimeMsAdapter;
        private String defaultSnippetSpec = null;
        private long defaultStartTimeMs = 0;
        private long defaultEndTimeMs = 0;

        public GsonTypeAdapter setDefaultEndTimeMs(long j) {
            this.defaultEndTimeMs = j;
            return this;
        }

        public GsonTypeAdapter setDefaultSnippetSpec(String str) {
            this.defaultSnippetSpec = str;
            return this;
        }

        public GsonTypeAdapter setDefaultStartTimeMs(long j) {
            this.defaultStartTimeMs = j;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.snippetSpecAdapter = gson.getAdapter(String.class);
            this.startTimeMsAdapter = gson.getAdapter(Long.class);
            this.endTimeMsAdapter = gson.getAdapter(Long.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Snippet snippet) {
            if (snippet == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("snippetSpec");
            this.snippetSpecAdapter.write(jsonWriter, snippet.snippetSpec());
            jsonWriter.name("startTimeMs");
            this.startTimeMsAdapter.write(jsonWriter, Long.valueOf(snippet.startTimeMs()));
            jsonWriter.name("endTimeMs");
            this.endTimeMsAdapter.write(jsonWriter, Long.valueOf(snippet.endTimeMs()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x006b A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.mediaclient.media.manifest.Snippet read(com.google.gson.stream.JsonReader r12) {
            /*
                r11 = this;
                com.google.gson.stream.JsonToken r0 = r12.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r12.nextNull()
                r12 = 0
                return r12
            Ld:
                r12.beginObject()
                java.lang.String r0 = r11.defaultSnippetSpec
                long r1 = r11.defaultStartTimeMs
                long r3 = r11.defaultEndTimeMs
                r6 = r0
                r7 = r1
                r9 = r3
            L19:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L97
                java.lang.String r0 = r12.nextName()
                com.google.gson.stream.JsonToken r1 = r12.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L2f
                r12.nextNull()
                goto L19
            L2f:
                r0.hashCode()
                int r1 = r0.hashCode()
                r2 = -1847837611(0xffffffff91dc3c55, float:-3.4747062E-28)
                r3 = 2
                r4 = 1
                if (r1 == r2) goto L5e
                r2 = -193100168(0xfffffffff47d8678, float:-8.0345365E31)
                if (r1 == r2) goto L53
                r2 = 1627521550(0x6102020e, float:1.4988905E20)
                if (r1 == r2) goto L48
                goto L66
            L48:
                java.lang.String r1 = "endTimeMs"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L51
                goto L66
            L51:
                r0 = r3
                goto L69
            L53:
                java.lang.String r1 = "snippetSpec"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L5c
                goto L66
            L5c:
                r0 = r4
                goto L69
            L5e:
                java.lang.String r1 = "startTimeMs"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L68
            L66:
                r0 = -1
                goto L69
            L68:
                r0 = 0
            L69:
                if (r0 == 0) goto L8a
                if (r0 == r4) goto L80
                if (r0 == r3) goto L73
                r12.skipValue()
                goto L19
            L73:
                com.google.gson.TypeAdapter<java.lang.Long> r0 = r11.endTimeMsAdapter
                java.lang.Object r0 = r0.read(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                long r9 = r0.longValue()
                goto L19
            L80:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.snippetSpecAdapter
                java.lang.Object r0 = r0.read(r12)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L19
            L8a:
                com.google.gson.TypeAdapter<java.lang.Long> r0 = r11.startTimeMsAdapter
                java.lang.Object r0 = r0.read(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                long r7 = r0.longValue()
                goto L19
            L97:
                r12.endObject()
                com.netflix.mediaclient.media.manifest.AutoValue_Snippet r12 = new com.netflix.mediaclient.media.manifest.AutoValue_Snippet
                r5 = r12
                r5.<init>(r6, r7, r9)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.media.manifest.AutoValue_Snippet.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.media.manifest.Snippet");
        }
    }
}
