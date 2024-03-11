package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PartnerIntegrationConfig extends C$AutoValue_PartnerIntegrationConfig {
    AutoValue_PartnerIntegrationConfig(final SfinderConfig sfinderConfig, final MinusoneConfig minusoneConfig, final MdeConfig mdeConfig) {
        new PartnerIntegrationConfig(sfinderConfig, minusoneConfig, mdeConfig) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_PartnerIntegrationConfig
            private final MdeConfig mdeConfig;
            private final MinusoneConfig minusoneConfig;
            private final SfinderConfig sfinderConfig;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig
            @SerializedName("mdeConfig")
            public MdeConfig mdeConfig() {
                return this.mdeConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig
            @SerializedName("minusoneConfig")
            public MinusoneConfig minusoneConfig() {
                return this.minusoneConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig
            @SerializedName("sfinderConfig")
            public SfinderConfig sfinderConfig() {
                return this.sfinderConfig;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (sfinderConfig == null) {
                    throw new NullPointerException("Null sfinderConfig");
                }
                this.sfinderConfig = sfinderConfig;
                if (minusoneConfig == null) {
                    throw new NullPointerException("Null minusoneConfig");
                }
                this.minusoneConfig = minusoneConfig;
                if (mdeConfig == null) {
                    throw new NullPointerException("Null mdeConfig");
                }
                this.mdeConfig = mdeConfig;
            }

            public String toString() {
                return "PartnerIntegrationConfig{sfinderConfig=" + this.sfinderConfig + ", minusoneConfig=" + this.minusoneConfig + ", mdeConfig=" + this.mdeConfig + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PartnerIntegrationConfig) {
                    PartnerIntegrationConfig partnerIntegrationConfig = (PartnerIntegrationConfig) obj;
                    return this.sfinderConfig.equals(partnerIntegrationConfig.sfinderConfig()) && this.minusoneConfig.equals(partnerIntegrationConfig.minusoneConfig()) && this.mdeConfig.equals(partnerIntegrationConfig.mdeConfig());
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.sfinderConfig.hashCode();
                return ((((hashCode ^ 1000003) * 1000003) ^ this.minusoneConfig.hashCode()) * 1000003) ^ this.mdeConfig.hashCode();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<PartnerIntegrationConfig> {
        private final TypeAdapter<MdeConfig> mdeConfigAdapter;
        private final TypeAdapter<MinusoneConfig> minusoneConfigAdapter;
        private final TypeAdapter<SfinderConfig> sfinderConfigAdapter;
        private SfinderConfig defaultSfinderConfig = null;
        private MinusoneConfig defaultMinusoneConfig = null;
        private MdeConfig defaultMdeConfig = null;

        public GsonTypeAdapter setDefaultMdeConfig(MdeConfig mdeConfig) {
            this.defaultMdeConfig = mdeConfig;
            return this;
        }

        public GsonTypeAdapter setDefaultMinusoneConfig(MinusoneConfig minusoneConfig) {
            this.defaultMinusoneConfig = minusoneConfig;
            return this;
        }

        public GsonTypeAdapter setDefaultSfinderConfig(SfinderConfig sfinderConfig) {
            this.defaultSfinderConfig = sfinderConfig;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.sfinderConfigAdapter = gson.getAdapter(SfinderConfig.class);
            this.minusoneConfigAdapter = gson.getAdapter(MinusoneConfig.class);
            this.mdeConfigAdapter = gson.getAdapter(MdeConfig.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, PartnerIntegrationConfig partnerIntegrationConfig) {
            if (partnerIntegrationConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("sfinderConfig");
            this.sfinderConfigAdapter.write(jsonWriter, partnerIntegrationConfig.sfinderConfig());
            jsonWriter.name("minusoneConfig");
            this.minusoneConfigAdapter.write(jsonWriter, partnerIntegrationConfig.minusoneConfig());
            jsonWriter.name("mdeConfig");
            this.mdeConfigAdapter.write(jsonWriter, partnerIntegrationConfig.mdeConfig());
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
        public com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig read(com.google.gson.stream.JsonReader r9) {
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
                com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig r0 = r8.defaultSfinderConfig
                com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig r1 = r8.defaultMinusoneConfig
                com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig r2 = r8.defaultMdeConfig
            L16:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L8b
                java.lang.String r3 = r9.nextName()
                com.google.gson.stream.JsonToken r4 = r9.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                if (r4 != r5) goto L2c
                r9.nextNull()
                goto L16
            L2c:
                r3.hashCode()
                int r4 = r3.hashCode()
                r5 = 210934416(0xc929a90, float:2.2587886E-31)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = 750558971(0x2cbc9efb, float:5.3609318E-12)
                if (r4 == r5) goto L50
                r5 = 1525436120(0x5aec4ed8, float:3.32573921E16)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "minusoneConfig"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "sfinderConfig"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "mdeConfig"
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
                com.google.gson.TypeAdapter<com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig> r1 = r8.minusoneConfigAdapter
                java.lang.Object r1 = r1.read(r9)
                com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig r1 = (com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig) r1
                goto L16
            L79:
                com.google.gson.TypeAdapter<com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig> r0 = r8.sfinderConfigAdapter
                java.lang.Object r0 = r0.read(r9)
                com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig r0 = (com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig) r0
                goto L16
            L82:
                com.google.gson.TypeAdapter<com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig> r2 = r8.mdeConfigAdapter
                java.lang.Object r2 = r2.read(r9)
                com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig r2 = (com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig) r2
                goto L16
            L8b:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_PartnerIntegrationConfig r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_PartnerIntegrationConfig
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_PartnerIntegrationConfig.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig");
        }
    }
}
