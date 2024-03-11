package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaTimer extends C$AutoValue_UmaTimer {
    AutoValue_UmaTimer(final int i, final String str, final String str2) {
        new UmaTimer(i, str, str2) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaTimer
            private final String action;
            private final String actionType;
            private final int value;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer
            public String action() {
                return this.action;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer
            public String actionType() {
                return this.actionType;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer
            @SerializedName("millisecondValue")
            public int value() {
                return this.value;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.value = i;
                this.action = str;
                this.actionType = str2;
            }

            public String toString() {
                return "UmaTimer{value=" + this.value + ", action=" + this.action + ", actionType=" + this.actionType + "}";
            }

            public boolean equals(Object obj) {
                String str3;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaTimer) {
                    UmaTimer umaTimer = (UmaTimer) obj;
                    if (this.value == umaTimer.value() && ((str3 = this.action) != null ? str3.equals(umaTimer.action()) : umaTimer.action() == null)) {
                        String str4 = this.actionType;
                        if (str4 == null) {
                            if (umaTimer.actionType() == null) {
                                return true;
                            }
                        } else if (str4.equals(umaTimer.actionType())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i2 = this.value;
                String str3 = this.action;
                int hashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.actionType;
                return ((((i2 ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaTimer> {
        private final TypeAdapter<String> actionAdapter;
        private final TypeAdapter<String> actionTypeAdapter;
        private final TypeAdapter<Integer> valueAdapter;
        private int defaultValue = 0;
        private String defaultAction = null;
        private String defaultActionType = null;

        public GsonTypeAdapter setDefaultAction(String str) {
            this.defaultAction = str;
            return this;
        }

        public GsonTypeAdapter setDefaultActionType(String str) {
            this.defaultActionType = str;
            return this;
        }

        public GsonTypeAdapter setDefaultValue(int i) {
            this.defaultValue = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.valueAdapter = gson.getAdapter(Integer.class);
            this.actionAdapter = gson.getAdapter(String.class);
            this.actionTypeAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaTimer umaTimer) {
            if (umaTimer == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("millisecondValue");
            this.valueAdapter.write(jsonWriter, Integer.valueOf(umaTimer.value()));
            jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
            this.actionAdapter.write(jsonWriter, umaTimer.action());
            jsonWriter.name("actionType");
            this.actionTypeAdapter.write(jsonWriter, umaTimer.actionType());
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
        public com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer read(com.google.gson.stream.JsonReader r9) {
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
                int r0 = r8.defaultValue
                java.lang.String r1 = r8.defaultAction
                java.lang.String r2 = r8.defaultActionType
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
                r5 = -1422950858(0xffffffffab2f7e36, float:-6.234764E-13)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = 102347632(0x619b370, float:2.8907932E-35)
                if (r4 == r5) goto L50
                r5 = 1851881104(0x6e617690, float:1.7444365E28)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "actionType"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "millisecondValue"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "action"
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
                com.google.gson.TypeAdapter<java.lang.String> r2 = r8.actionTypeAdapter
                java.lang.Object r2 = r2.read(r9)
                java.lang.String r2 = (java.lang.String) r2
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r8.valueAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L16
            L86:
                com.google.gson.TypeAdapter<java.lang.String> r1 = r8.actionAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.String r1 = (java.lang.String) r1
                goto L16
            L8f:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaTimer r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaTimer
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaTimer.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer");
        }
    }
}
