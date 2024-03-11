package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_MinusoneConfig extends C$AutoValue_MinusoneConfig {
    AutoValue_MinusoneConfig(final boolean z, final boolean z2, final boolean z3) {
        new MinusoneConfig(z, z2, z3) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_MinusoneConfig
            private final boolean disableExtras;
            private final boolean forceDisable;
            private final boolean forceEnable;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig
            @SerializedName("disableExtras")
            public boolean disableExtras() {
                return this.disableExtras;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig
            @SerializedName("forceDisable")
            public boolean forceDisable() {
                return this.forceDisable;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig
            @SerializedName("forceEnable")
            public boolean forceEnable() {
                return this.forceEnable;
            }

            public int hashCode() {
                int i = this.forceEnable ? 1231 : 1237;
                return ((((i ^ 1000003) * 1000003) ^ (this.forceDisable ? 1231 : 1237)) * 1000003) ^ (this.disableExtras ? 1231 : 1237);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.forceEnable = z;
                this.forceDisable = z2;
                this.disableExtras = z3;
            }

            public String toString() {
                return "MinusoneConfig{forceEnable=" + this.forceEnable + ", forceDisable=" + this.forceDisable + ", disableExtras=" + this.disableExtras + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MinusoneConfig) {
                    MinusoneConfig minusoneConfig = (MinusoneConfig) obj;
                    return this.forceEnable == minusoneConfig.forceEnable() && this.forceDisable == minusoneConfig.forceDisable() && this.disableExtras == minusoneConfig.disableExtras();
                }
                return false;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<MinusoneConfig> {
        private final TypeAdapter<Boolean> disableExtrasAdapter;
        private final TypeAdapter<Boolean> forceDisableAdapter;
        private final TypeAdapter<Boolean> forceEnableAdapter;
        private boolean defaultForceEnable = false;
        private boolean defaultForceDisable = false;
        private boolean defaultDisableExtras = false;

        public GsonTypeAdapter setDefaultDisableExtras(boolean z) {
            this.defaultDisableExtras = z;
            return this;
        }

        public GsonTypeAdapter setDefaultForceDisable(boolean z) {
            this.defaultForceDisable = z;
            return this;
        }

        public GsonTypeAdapter setDefaultForceEnable(boolean z) {
            this.defaultForceEnable = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.forceEnableAdapter = gson.getAdapter(Boolean.class);
            this.forceDisableAdapter = gson.getAdapter(Boolean.class);
            this.disableExtrasAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MinusoneConfig minusoneConfig) {
            if (minusoneConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("forceEnable");
            this.forceEnableAdapter.write(jsonWriter, Boolean.valueOf(minusoneConfig.forceEnable()));
            jsonWriter.name("forceDisable");
            this.forceDisableAdapter.write(jsonWriter, Boolean.valueOf(minusoneConfig.forceDisable()));
            jsonWriter.name("disableExtras");
            this.disableExtrasAdapter.write(jsonWriter, Boolean.valueOf(minusoneConfig.disableExtras()));
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
        public com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig read(com.google.gson.stream.JsonReader r9) {
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
                boolean r0 = r8.defaultForceEnable
                boolean r1 = r8.defaultForceDisable
                boolean r2 = r8.defaultDisableExtras
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L98
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = -2117459587(0xffffffff81ca217d, float:-7.4251134E-38)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = -1238225045(0xffffffffb6322f6b, float:-2.6551668E-6)
                if (r4 == r5) goto L50
                r5 = -866877362(0xffffffffcc54804e, float:-5.5705912E7)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "forceEnable"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "disableExtras"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "forceDisable"
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
                com.google.gson.TypeAdapter<java.lang.Boolean> r0 = r8.forceEnableAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L16
            L7d:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r8.disableExtrasAdapter
                java.lang.Object r2 = r2.read(r9)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                goto L16
            L8a:
                com.google.gson.TypeAdapter<java.lang.Boolean> r1 = r8.forceDisableAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                goto L16
            L98:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_MinusoneConfig r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_MinusoneConfig
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_MinusoneConfig.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig");
        }
    }
}
