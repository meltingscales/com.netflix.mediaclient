package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_VoipConfiguration extends C$AutoValue_VoipConfiguration {
    AutoValue_VoipConfiguration(final boolean z, final boolean z2, final boolean z3, final boolean z4, final Threshold threshold, final Threshold threshold2, final Threshold threshold3, final Threshold threshold4, final int i, final boolean z5, final boolean z6, final boolean z7) {
        new VoipConfiguration(z, z2, z3, z4, threshold, threshold2, threshold3, threshold4, i, z5, z6, z7) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_VoipConfiguration
            private final boolean disableChatButton;
            private final boolean enableVoip;
            private final boolean enableVoipOverData;
            private final boolean enableVoipOverWiFi;
            private final Threshold jitterThresholdInMs;
            private final boolean openDialpadByDefault;
            private final Threshold packetLosThresholdInPercent;
            private final Threshold rttThresholdInMs;
            private final int sampleRateInHz;
            private final boolean showConfirmationDialog;
            private final boolean showHelpForNonMember;
            private final Threshold sipThresholdInMs;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("jitterThresholdInMs")
            public Threshold getJitterThresholdInMs() {
                return this.jitterThresholdInMs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("packetLosThresholdInPercent")
            public Threshold getPacketLosThresholdInPercent() {
                return this.packetLosThresholdInPercent;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("rttThresholdInMs")
            public Threshold getRttThresholdInMs() {
                return this.rttThresholdInMs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("sampleRateInHz")
            public int getSampleRateInHz() {
                return this.sampleRateInHz;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("sipThresholdInMs")
            public Threshold getSipThresholdInMs() {
                return this.sipThresholdInMs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("disableChatButton")
            public boolean isDisableChatButton() {
                return this.disableChatButton;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("enableVoip")
            public boolean isEnableVoip() {
                return this.enableVoip;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("enableVoipOverData")
            public boolean isEnableVoipOverData() {
                return this.enableVoipOverData;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("enableVoipOverWiFi")
            public boolean isEnableVoipOverWiFi() {
                return this.enableVoipOverWiFi;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("openDialpadByDefault")
            public boolean isOpenDialpadByDefault() {
                return this.openDialpadByDefault;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("showConfirmationDialog")
            public boolean isShowConfirmationDialog() {
                return this.showConfirmationDialog;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration
            @SerializedName("showHelpForNonMember")
            public boolean isShowHelpForNonMember() {
                return this.showHelpForNonMember;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.enableVoip = z;
                this.enableVoipOverData = z2;
                this.enableVoipOverWiFi = z3;
                this.disableChatButton = z4;
                this.rttThresholdInMs = threshold;
                this.jitterThresholdInMs = threshold2;
                this.sipThresholdInMs = threshold3;
                this.packetLosThresholdInPercent = threshold4;
                this.sampleRateInHz = i;
                this.showHelpForNonMember = z5;
                this.showConfirmationDialog = z6;
                this.openDialpadByDefault = z7;
            }

            public String toString() {
                return "VoipConfiguration{enableVoip=" + this.enableVoip + ", enableVoipOverData=" + this.enableVoipOverData + ", enableVoipOverWiFi=" + this.enableVoipOverWiFi + ", disableChatButton=" + this.disableChatButton + ", rttThresholdInMs=" + this.rttThresholdInMs + ", jitterThresholdInMs=" + this.jitterThresholdInMs + ", sipThresholdInMs=" + this.sipThresholdInMs + ", packetLosThresholdInPercent=" + this.packetLosThresholdInPercent + ", sampleRateInHz=" + this.sampleRateInHz + ", showHelpForNonMember=" + this.showHelpForNonMember + ", showConfirmationDialog=" + this.showConfirmationDialog + ", openDialpadByDefault=" + this.openDialpadByDefault + "}";
            }

            public boolean equals(Object obj) {
                Threshold threshold5;
                Threshold threshold6;
                Threshold threshold7;
                Threshold threshold8;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof VoipConfiguration) {
                    VoipConfiguration voipConfiguration = (VoipConfiguration) obj;
                    return this.enableVoip == voipConfiguration.isEnableVoip() && this.enableVoipOverData == voipConfiguration.isEnableVoipOverData() && this.enableVoipOverWiFi == voipConfiguration.isEnableVoipOverWiFi() && this.disableChatButton == voipConfiguration.isDisableChatButton() && ((threshold5 = this.rttThresholdInMs) != null ? threshold5.equals(voipConfiguration.getRttThresholdInMs()) : voipConfiguration.getRttThresholdInMs() == null) && ((threshold6 = this.jitterThresholdInMs) != null ? threshold6.equals(voipConfiguration.getJitterThresholdInMs()) : voipConfiguration.getJitterThresholdInMs() == null) && ((threshold7 = this.sipThresholdInMs) != null ? threshold7.equals(voipConfiguration.getSipThresholdInMs()) : voipConfiguration.getSipThresholdInMs() == null) && ((threshold8 = this.packetLosThresholdInPercent) != null ? threshold8.equals(voipConfiguration.getPacketLosThresholdInPercent()) : voipConfiguration.getPacketLosThresholdInPercent() == null) && this.sampleRateInHz == voipConfiguration.getSampleRateInHz() && this.showHelpForNonMember == voipConfiguration.isShowHelpForNonMember() && this.showConfirmationDialog == voipConfiguration.isShowConfirmationDialog() && this.openDialpadByDefault == voipConfiguration.isOpenDialpadByDefault();
                }
                return false;
            }

            public int hashCode() {
                int i2 = this.enableVoip ? 1231 : 1237;
                int i3 = this.enableVoipOverData ? 1231 : 1237;
                int i4 = this.enableVoipOverWiFi ? 1231 : 1237;
                int i5 = this.disableChatButton ? 1231 : 1237;
                Threshold threshold5 = this.rttThresholdInMs;
                int hashCode = threshold5 == null ? 0 : threshold5.hashCode();
                Threshold threshold6 = this.jitterThresholdInMs;
                int hashCode2 = threshold6 == null ? 0 : threshold6.hashCode();
                Threshold threshold7 = this.sipThresholdInMs;
                int hashCode3 = threshold7 == null ? 0 : threshold7.hashCode();
                Threshold threshold8 = this.packetLosThresholdInPercent;
                int hashCode4 = threshold8 != null ? threshold8.hashCode() : 0;
                int i6 = this.sampleRateInHz;
                int i7 = this.showHelpForNonMember ? 1231 : 1237;
                return ((((((((((((((((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ (this.showConfirmationDialog ? 1231 : 1237)) * 1000003) ^ (this.openDialpadByDefault ? 1231 : 1237);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<VoipConfiguration> {
        private final TypeAdapter<Boolean> disableChatButtonAdapter;
        private final TypeAdapter<Boolean> enableVoipAdapter;
        private final TypeAdapter<Boolean> enableVoipOverDataAdapter;
        private final TypeAdapter<Boolean> enableVoipOverWiFiAdapter;
        private final TypeAdapter<Threshold> jitterThresholdInMsAdapter;
        private final TypeAdapter<Boolean> openDialpadByDefaultAdapter;
        private final TypeAdapter<Threshold> packetLosThresholdInPercentAdapter;
        private final TypeAdapter<Threshold> rttThresholdInMsAdapter;
        private final TypeAdapter<Integer> sampleRateInHzAdapter;
        private final TypeAdapter<Boolean> showConfirmationDialogAdapter;
        private final TypeAdapter<Boolean> showHelpForNonMemberAdapter;
        private final TypeAdapter<Threshold> sipThresholdInMsAdapter;
        private boolean defaultEnableVoip = false;
        private boolean defaultEnableVoipOverData = false;
        private boolean defaultEnableVoipOverWiFi = false;
        private boolean defaultDisableChatButton = false;
        private Threshold defaultRttThresholdInMs = null;
        private Threshold defaultJitterThresholdInMs = null;
        private Threshold defaultSipThresholdInMs = null;
        private Threshold defaultPacketLosThresholdInPercent = null;
        private int defaultSampleRateInHz = 0;
        private boolean defaultShowHelpForNonMember = false;
        private boolean defaultShowConfirmationDialog = false;
        private boolean defaultOpenDialpadByDefault = false;

        public GsonTypeAdapter setDefaultDisableChatButton(boolean z) {
            this.defaultDisableChatButton = z;
            return this;
        }

        public GsonTypeAdapter setDefaultEnableVoip(boolean z) {
            this.defaultEnableVoip = z;
            return this;
        }

        public GsonTypeAdapter setDefaultEnableVoipOverData(boolean z) {
            this.defaultEnableVoipOverData = z;
            return this;
        }

        public GsonTypeAdapter setDefaultEnableVoipOverWiFi(boolean z) {
            this.defaultEnableVoipOverWiFi = z;
            return this;
        }

        public GsonTypeAdapter setDefaultJitterThresholdInMs(Threshold threshold) {
            this.defaultJitterThresholdInMs = threshold;
            return this;
        }

        public GsonTypeAdapter setDefaultOpenDialpadByDefault(boolean z) {
            this.defaultOpenDialpadByDefault = z;
            return this;
        }

        public GsonTypeAdapter setDefaultPacketLosThresholdInPercent(Threshold threshold) {
            this.defaultPacketLosThresholdInPercent = threshold;
            return this;
        }

        public GsonTypeAdapter setDefaultRttThresholdInMs(Threshold threshold) {
            this.defaultRttThresholdInMs = threshold;
            return this;
        }

        public GsonTypeAdapter setDefaultSampleRateInHz(int i) {
            this.defaultSampleRateInHz = i;
            return this;
        }

        public GsonTypeAdapter setDefaultShowConfirmationDialog(boolean z) {
            this.defaultShowConfirmationDialog = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShowHelpForNonMember(boolean z) {
            this.defaultShowHelpForNonMember = z;
            return this;
        }

        public GsonTypeAdapter setDefaultSipThresholdInMs(Threshold threshold) {
            this.defaultSipThresholdInMs = threshold;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.enableVoipAdapter = gson.getAdapter(Boolean.class);
            this.enableVoipOverDataAdapter = gson.getAdapter(Boolean.class);
            this.enableVoipOverWiFiAdapter = gson.getAdapter(Boolean.class);
            this.disableChatButtonAdapter = gson.getAdapter(Boolean.class);
            this.rttThresholdInMsAdapter = gson.getAdapter(Threshold.class);
            this.jitterThresholdInMsAdapter = gson.getAdapter(Threshold.class);
            this.sipThresholdInMsAdapter = gson.getAdapter(Threshold.class);
            this.packetLosThresholdInPercentAdapter = gson.getAdapter(Threshold.class);
            this.sampleRateInHzAdapter = gson.getAdapter(Integer.class);
            this.showHelpForNonMemberAdapter = gson.getAdapter(Boolean.class);
            this.showConfirmationDialogAdapter = gson.getAdapter(Boolean.class);
            this.openDialpadByDefaultAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, VoipConfiguration voipConfiguration) {
            if (voipConfiguration == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("enableVoip");
            this.enableVoipAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isEnableVoip()));
            jsonWriter.name("enableVoipOverData");
            this.enableVoipOverDataAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isEnableVoipOverData()));
            jsonWriter.name("enableVoipOverWiFi");
            this.enableVoipOverWiFiAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isEnableVoipOverWiFi()));
            jsonWriter.name("disableChatButton");
            this.disableChatButtonAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isDisableChatButton()));
            jsonWriter.name("rttThresholdInMs");
            this.rttThresholdInMsAdapter.write(jsonWriter, voipConfiguration.getRttThresholdInMs());
            jsonWriter.name("jitterThresholdInMs");
            this.jitterThresholdInMsAdapter.write(jsonWriter, voipConfiguration.getJitterThresholdInMs());
            jsonWriter.name("sipThresholdInMs");
            this.sipThresholdInMsAdapter.write(jsonWriter, voipConfiguration.getSipThresholdInMs());
            jsonWriter.name("packetLosThresholdInPercent");
            this.packetLosThresholdInPercentAdapter.write(jsonWriter, voipConfiguration.getPacketLosThresholdInPercent());
            jsonWriter.name("sampleRateInHz");
            this.sampleRateInHzAdapter.write(jsonWriter, Integer.valueOf(voipConfiguration.getSampleRateInHz()));
            jsonWriter.name("showHelpForNonMember");
            this.showHelpForNonMemberAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isShowHelpForNonMember()));
            jsonWriter.name("showConfirmationDialog");
            this.showConfirmationDialogAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isShowConfirmationDialog()));
            jsonWriter.name("openDialpadByDefault");
            this.openDialpadByDefaultAdapter.write(jsonWriter, Boolean.valueOf(voipConfiguration.isOpenDialpadByDefault()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public VoipConfiguration read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = this.defaultEnableVoip;
            boolean z2 = this.defaultEnableVoipOverData;
            boolean z3 = this.defaultEnableVoipOverWiFi;
            boolean z4 = this.defaultDisableChatButton;
            Threshold threshold = this.defaultRttThresholdInMs;
            Threshold threshold2 = this.defaultJitterThresholdInMs;
            Threshold threshold3 = this.defaultSipThresholdInMs;
            Threshold threshold4 = this.defaultPacketLosThresholdInPercent;
            int i = this.defaultSampleRateInHz;
            boolean z5 = this.defaultShowHelpForNonMember;
            boolean z6 = z;
            boolean z7 = z2;
            boolean z8 = z3;
            boolean z9 = z4;
            Threshold threshold5 = threshold;
            Threshold threshold6 = threshold2;
            Threshold threshold7 = threshold3;
            Threshold threshold8 = threshold4;
            int i2 = i;
            boolean z10 = z5;
            boolean z11 = this.defaultShowConfirmationDialog;
            boolean z12 = this.defaultOpenDialpadByDefault;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1904004612:
                            if (nextName.equals("sipThresholdInMs")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -895498244:
                            if (nextName.equals("showHelpForNonMember")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -799704703:
                            if (nextName.equals("enableVoipOverData")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -799132404:
                            if (nextName.equals("enableVoipOverWiFi")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -507543439:
                            if (nextName.equals("openDialpadByDefault")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -336248351:
                            if (nextName.equals("sampleRateInHz")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 134769594:
                            if (nextName.equals("showConfirmationDialog")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 282463076:
                            if (nextName.equals("rttThresholdInMs")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 566086442:
                            if (nextName.equals("jitterThresholdInMs")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1007632818:
                            if (nextName.equals("disableChatButton")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1139254013:
                            if (nextName.equals("packetLosThresholdInPercent")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1893298627:
                            if (nextName.equals("enableVoip")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            threshold7 = this.sipThresholdInMsAdapter.read(jsonReader);
                            continue;
                        case 1:
                            z10 = this.showHelpForNonMemberAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 2:
                            z7 = this.enableVoipOverDataAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 3:
                            z8 = this.enableVoipOverWiFiAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 4:
                            z12 = this.openDialpadByDefaultAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 5:
                            i2 = this.sampleRateInHzAdapter.read(jsonReader).intValue();
                            continue;
                        case 6:
                            z11 = this.showConfirmationDialogAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 7:
                            threshold5 = this.rttThresholdInMsAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            threshold6 = this.jitterThresholdInMsAdapter.read(jsonReader);
                            continue;
                        case '\t':
                            z9 = this.disableChatButtonAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\n':
                            threshold8 = this.packetLosThresholdInPercentAdapter.read(jsonReader);
                            continue;
                        case 11:
                            z6 = this.enableVoipAdapter.read(jsonReader).booleanValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_VoipConfiguration(z6, z7, z8, z9, threshold5, threshold6, threshold7, threshold8, i2, z10, z11, z12);
        }
    }
}
