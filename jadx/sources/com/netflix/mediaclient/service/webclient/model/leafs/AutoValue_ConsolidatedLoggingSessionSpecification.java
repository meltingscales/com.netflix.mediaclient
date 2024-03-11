package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ConsolidatedLoggingSessionSpecification extends C$AutoValue_ConsolidatedLoggingSessionSpecification {
    AutoValue_ConsolidatedLoggingSessionSpecification(final String str, final int i, final int i2) {
        new ConsolidatedLoggingSessionSpecification(str, i, i2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_ConsolidatedLoggingSessionSpecification
            private final int disableChancePercentagePerUserSession;
            private final String session;
            private final int suppressPercentagePerEvent;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification
            @SerializedName("disableChancePercentagePerUserSession")
            public int getDisableChancePercentagePerUserSession() {
                return this.disableChancePercentagePerUserSession;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification
            @SerializedName("session")
            public String getSession() {
                return this.session;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification
            @SerializedName("suppressPercentagePerEvent")
            public int getSuppressPercentagePerEvent() {
                return this.suppressPercentagePerEvent;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.session = str;
                this.disableChancePercentagePerUserSession = i;
                this.suppressPercentagePerEvent = i2;
            }

            public String toString() {
                return "ConsolidatedLoggingSessionSpecification{session=" + this.session + ", disableChancePercentagePerUserSession=" + this.disableChancePercentagePerUserSession + ", suppressPercentagePerEvent=" + this.suppressPercentagePerEvent + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ConsolidatedLoggingSessionSpecification) {
                    ConsolidatedLoggingSessionSpecification consolidatedLoggingSessionSpecification = (ConsolidatedLoggingSessionSpecification) obj;
                    String str2 = this.session;
                    if (str2 != null ? str2.equals(consolidatedLoggingSessionSpecification.getSession()) : consolidatedLoggingSessionSpecification.getSession() == null) {
                        if (this.disableChancePercentagePerUserSession == consolidatedLoggingSessionSpecification.getDisableChancePercentagePerUserSession() && this.suppressPercentagePerEvent == consolidatedLoggingSessionSpecification.getSuppressPercentagePerEvent()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.session;
                return (((((str2 == null ? 0 : str2.hashCode()) ^ 1000003) * 1000003) ^ this.disableChancePercentagePerUserSession) * 1000003) ^ this.suppressPercentagePerEvent;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ConsolidatedLoggingSessionSpecification> {
        private final TypeAdapter<Integer> disableChancePercentagePerUserSessionAdapter;
        private final TypeAdapter<String> sessionAdapter;
        private final TypeAdapter<Integer> suppressPercentagePerEventAdapter;
        private String defaultSession = null;
        private int defaultDisableChancePercentagePerUserSession = 0;
        private int defaultSuppressPercentagePerEvent = 0;

        public GsonTypeAdapter setDefaultDisableChancePercentagePerUserSession(int i) {
            this.defaultDisableChancePercentagePerUserSession = i;
            return this;
        }

        public GsonTypeAdapter setDefaultSession(String str) {
            this.defaultSession = str;
            return this;
        }

        public GsonTypeAdapter setDefaultSuppressPercentagePerEvent(int i) {
            this.defaultSuppressPercentagePerEvent = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.sessionAdapter = gson.getAdapter(String.class);
            this.disableChancePercentagePerUserSessionAdapter = gson.getAdapter(Integer.class);
            this.suppressPercentagePerEventAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ConsolidatedLoggingSessionSpecification consolidatedLoggingSessionSpecification) {
            if (consolidatedLoggingSessionSpecification == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("session");
            this.sessionAdapter.write(jsonWriter, consolidatedLoggingSessionSpecification.getSession());
            jsonWriter.name("disableChancePercentagePerUserSession");
            this.disableChancePercentagePerUserSessionAdapter.write(jsonWriter, Integer.valueOf(consolidatedLoggingSessionSpecification.getDisableChancePercentagePerUserSession()));
            jsonWriter.name("suppressPercentagePerEvent");
            this.suppressPercentagePerEventAdapter.write(jsonWriter, Integer.valueOf(consolidatedLoggingSessionSpecification.getSuppressPercentagePerEvent()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification read(com.google.gson.stream.JsonReader r9) {
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
                java.lang.String r0 = r8.defaultSession
                int r1 = r8.defaultDisableChancePercentagePerUserSession
                int r2 = r8.defaultSuppressPercentagePerEvent
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
                r5 = -1764285308(0xffffffff96d72484, float:-3.4758168E-25)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = 501356492(0x1de217cc, float:5.9846307E-21)
                if (r4 == r5) goto L50
                r5 = 1984987798(0x76508296, float:1.0572718E33)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "session"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "suppressPercentagePerEvent"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "disableChancePercentagePerUserSession"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L65
            L63:
                r3 = -1
                goto L66
            L65:
                r3 = 0
            L66:
                if (r3 == 0) goto L86
                if (r3 == r7) goto L79
                if (r3 == r6) goto L70
                r9.skipValue()
                goto L16
            L70:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r8.sessionAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.Integer> r2 = r8.suppressPercentagePerEventAdapter
                java.lang.Object r2 = r2.read(r9)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                goto L16
            L86:
                com.google.gson.TypeAdapter<java.lang.Integer> r1 = r8.disableChancePercentagePerUserSessionAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L16
            L93:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ConsolidatedLoggingSessionSpecification r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ConsolidatedLoggingSessionSpecification
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ConsolidatedLoggingSessionSpecification.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification");
        }
    }
}
