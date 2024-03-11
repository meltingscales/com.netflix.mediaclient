package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ErrorLoggingSpecification extends C$AutoValue_ErrorLoggingSpecification {
    AutoValue_ErrorLoggingSpecification(final String str, final boolean z, final int i) {
        new ErrorLoggingSpecification(str, z, i) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_ErrorLoggingSpecification
            private final int disableChancePercentage;
            private final boolean disabled;
            private final String implementation;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification
            @SerializedName("disableChancePercentage")
            public int getDisableChancePercentage() {
                return this.disableChancePercentage;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification
            @SerializedName("implementation")
            public String getImplementation() {
                return this.implementation;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification
            @SerializedName("disable")
            public boolean isDisabled() {
                return this.disabled;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.implementation = str;
                this.disabled = z;
                this.disableChancePercentage = i;
            }

            public String toString() {
                return "ErrorLoggingSpecification{implementation=" + this.implementation + ", disabled=" + this.disabled + ", disableChancePercentage=" + this.disableChancePercentage + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ErrorLoggingSpecification) {
                    ErrorLoggingSpecification errorLoggingSpecification = (ErrorLoggingSpecification) obj;
                    String str2 = this.implementation;
                    if (str2 != null ? str2.equals(errorLoggingSpecification.getImplementation()) : errorLoggingSpecification.getImplementation() == null) {
                        if (this.disabled == errorLoggingSpecification.isDisabled() && this.disableChancePercentage == errorLoggingSpecification.getDisableChancePercentage()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.implementation;
                return (((((str2 == null ? 0 : str2.hashCode()) ^ 1000003) * 1000003) ^ (this.disabled ? 1231 : 1237)) * 1000003) ^ this.disableChancePercentage;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<ErrorLoggingSpecification> {
        private final TypeAdapter<Integer> disableChancePercentageAdapter;
        private final TypeAdapter<Boolean> disabledAdapter;
        private final TypeAdapter<String> implementationAdapter;
        private String defaultImplementation = null;
        private boolean defaultDisabled = false;
        private int defaultDisableChancePercentage = 0;

        public GsonTypeAdapter setDefaultDisableChancePercentage(int i) {
            this.defaultDisableChancePercentage = i;
            return this;
        }

        public GsonTypeAdapter setDefaultDisabled(boolean z) {
            this.defaultDisabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultImplementation(String str) {
            this.defaultImplementation = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.implementationAdapter = gson.getAdapter(String.class);
            this.disabledAdapter = gson.getAdapter(Boolean.class);
            this.disableChancePercentageAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ErrorLoggingSpecification errorLoggingSpecification) {
            if (errorLoggingSpecification == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("implementation");
            this.implementationAdapter.write(jsonWriter, errorLoggingSpecification.getImplementation());
            jsonWriter.name("disable");
            this.disabledAdapter.write(jsonWriter, Boolean.valueOf(errorLoggingSpecification.isDisabled()));
            jsonWriter.name("disableChancePercentage");
            this.disableChancePercentageAdapter.write(jsonWriter, Integer.valueOf(errorLoggingSpecification.getDisableChancePercentage()));
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
        public com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification read(com.google.gson.stream.JsonReader r9) {
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
                java.lang.String r0 = r8.defaultImplementation
                boolean r1 = r8.defaultDisabled
                int r2 = r8.defaultDisableChancePercentage
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
                r5 = -1535178762(0xffffffffa47f07f6, float:-5.5301054E-17)
                r6 = 2
                r7 = 1
                if (r4 == r5) goto L5b
                r5 = 1671308008(0x639e22e8, float:5.8342016E21)
                if (r4 == r5) goto L50
                r5 = 1683336114(0x6455abb2, float:1.5766114E22)
                if (r4 == r5) goto L45
                goto L63
            L45:
                java.lang.String r4 = "implementation"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L4e
                goto L63
            L4e:
                r3 = r6
                goto L66
            L50:
                java.lang.String r4 = "disable"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L59
                goto L63
            L59:
                r3 = r7
                goto L66
            L5b:
                java.lang.String r4 = "disableChancePercentage"
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
                com.google.gson.TypeAdapter<java.lang.String> r0 = r8.implementationAdapter
                java.lang.Object r0 = r0.read(r9)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L79:
                com.google.gson.TypeAdapter<java.lang.Boolean> r1 = r8.disabledAdapter
                java.lang.Object r1 = r1.read(r9)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                goto L16
            L86:
                com.google.gson.TypeAdapter<java.lang.Integer> r2 = r8.disableChancePercentageAdapter
                java.lang.Object r2 = r2.read(r9)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                goto L16
            L93:
                r9.endObject()
                com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ErrorLoggingSpecification r9 = new com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ErrorLoggingSpecification
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ErrorLoggingSpecification.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification");
        }
    }
}
