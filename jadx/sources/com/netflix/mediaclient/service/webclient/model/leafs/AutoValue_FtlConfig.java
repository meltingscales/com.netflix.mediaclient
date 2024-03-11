package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_FtlConfig extends C$AutoValue_FtlConfig {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_FtlConfig(final int i, final int i2, final List<String> list, final int i3, final List<FtlTarget> list2, final Map<String, String> map, final long j, final long j2, final boolean z) {
        new FtlConfig(i, i2, list, i3, list2, map, j, j2, z) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_FtlConfig
            private final int cell;
            private final int errorsThrottleLimit;
            private final Map<String, String> hostMap;
            private final List<String> hosts;
            private final int maxTries;
            private final long samuraiWarmAppThreshold;
            private final boolean sendFtlStatusOnFallback;
            private final long targetResetDelay;
            private final List<FtlTarget> targets;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("cell")
            public int cell() {
                return this.cell;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("errorsThrottleLimit")
            public int errorsThrottleLimit() {
                return this.errorsThrottleLimit;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("hostMap")
            public Map<String, String> hostMap() {
                return this.hostMap;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("hosts")
            public List<String> hosts() {
                return this.hosts;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("maxTries")
            public int maxTries() {
                return this.maxTries;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("samuraiWarmAppThreshold")
            public long samuraiWarmAppThreshold() {
                return this.samuraiWarmAppThreshold;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("sendFtlStatusOnFallback")
            public boolean sendFtlStatusOnFallback() {
                return this.sendFtlStatusOnFallback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("targetResetDelay")
            public long targetResetDelay() {
                return this.targetResetDelay;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            @SerializedName("targets")
            public List<FtlTarget> targets() {
                return this.targets;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.cell = i;
                this.maxTries = i2;
                if (list == null) {
                    throw new NullPointerException("Null hosts");
                }
                this.hosts = list;
                this.errorsThrottleLimit = i3;
                if (list2 == null) {
                    throw new NullPointerException("Null targets");
                }
                this.targets = list2;
                if (map == null) {
                    throw new NullPointerException("Null hostMap");
                }
                this.hostMap = map;
                this.targetResetDelay = j;
                this.samuraiWarmAppThreshold = j2;
                this.sendFtlStatusOnFallback = z;
            }

            public String toString() {
                return "FtlConfig{cell=" + this.cell + ", maxTries=" + this.maxTries + ", hosts=" + this.hosts + ", errorsThrottleLimit=" + this.errorsThrottleLimit + ", targets=" + this.targets + ", hostMap=" + this.hostMap + ", targetResetDelay=" + this.targetResetDelay + ", samuraiWarmAppThreshold=" + this.samuraiWarmAppThreshold + ", sendFtlStatusOnFallback=" + this.sendFtlStatusOnFallback + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof FtlConfig) {
                    FtlConfig ftlConfig = (FtlConfig) obj;
                    return this.cell == ftlConfig.cell() && this.maxTries == ftlConfig.maxTries() && this.hosts.equals(ftlConfig.hosts()) && this.errorsThrottleLimit == ftlConfig.errorsThrottleLimit() && this.targets.equals(ftlConfig.targets()) && this.hostMap.equals(ftlConfig.hostMap()) && this.targetResetDelay == ftlConfig.targetResetDelay() && this.samuraiWarmAppThreshold == ftlConfig.samuraiWarmAppThreshold() && this.sendFtlStatusOnFallback == ftlConfig.sendFtlStatusOnFallback();
                }
                return false;
            }

            public int hashCode() {
                int i4 = this.cell;
                int i5 = this.maxTries;
                int hashCode = this.hosts.hashCode();
                int i6 = this.errorsThrottleLimit;
                int hashCode2 = this.targets.hashCode();
                int hashCode3 = this.hostMap.hashCode();
                long j3 = this.targetResetDelay;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                long j4 = this.samuraiWarmAppThreshold;
                return ((((((((((((((((i4 ^ 1000003) * 1000003) ^ i5) * 1000003) ^ hashCode) * 1000003) ^ i6) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i7) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ (this.sendFtlStatusOnFallback ? 1231 : 1237);
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig
            public FtlConfig.Builder toBuilder() {
                return new Builder(this);
            }

            /* renamed from: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_FtlConfig$Builder */
            /* loaded from: classes.dex */
            static final class Builder extends FtlConfig.Builder {
                private Integer cell;
                private Integer errorsThrottleLimit;
                private Map<String, String> hostMap;
                private List<String> hosts;
                private Integer maxTries;
                private Long samuraiWarmAppThreshold;
                private Boolean sendFtlStatusOnFallback;
                private Long targetResetDelay;
                private List<FtlTarget> targets;

                /* JADX INFO: Access modifiers changed from: package-private */
                public Builder() {
                }

                private Builder(FtlConfig ftlConfig) {
                    this.cell = Integer.valueOf(ftlConfig.cell());
                    this.maxTries = Integer.valueOf(ftlConfig.maxTries());
                    this.hosts = ftlConfig.hosts();
                    this.errorsThrottleLimit = Integer.valueOf(ftlConfig.errorsThrottleLimit());
                    this.targets = ftlConfig.targets();
                    this.hostMap = ftlConfig.hostMap();
                    this.targetResetDelay = Long.valueOf(ftlConfig.targetResetDelay());
                    this.samuraiWarmAppThreshold = Long.valueOf(ftlConfig.samuraiWarmAppThreshold());
                    this.sendFtlStatusOnFallback = Boolean.valueOf(ftlConfig.sendFtlStatusOnFallback());
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder cell(int i) {
                    this.cell = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder maxTries(int i) {
                    this.maxTries = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder hosts(List<String> list) {
                    if (list != null) {
                        this.hosts = list;
                        return this;
                    }
                    throw new NullPointerException("Null hosts");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder errorsThrottleLimit(int i) {
                    this.errorsThrottleLimit = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder targets(List<FtlTarget> list) {
                    if (list != null) {
                        this.targets = list;
                        return this;
                    }
                    throw new NullPointerException("Null targets");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder hostMap(Map<String, String> map) {
                    if (map != null) {
                        this.hostMap = map;
                        return this;
                    }
                    throw new NullPointerException("Null hostMap");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder targetResetDelay(long j) {
                    this.targetResetDelay = Long.valueOf(j);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder samuraiWarmAppThreshold(long j) {
                    this.samuraiWarmAppThreshold = Long.valueOf(j);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig.Builder sendFtlStatusOnFallback(boolean z) {
                    this.sendFtlStatusOnFallback = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.Builder
                public FtlConfig build() {
                    String str = "";
                    if (this.cell == null) {
                        str = " cell";
                    }
                    if (this.maxTries == null) {
                        str = str + " maxTries";
                    }
                    if (this.hosts == null) {
                        str = str + " hosts";
                    }
                    if (this.errorsThrottleLimit == null) {
                        str = str + " errorsThrottleLimit";
                    }
                    if (this.targets == null) {
                        str = str + " targets";
                    }
                    if (this.hostMap == null) {
                        str = str + " hostMap";
                    }
                    if (this.targetResetDelay == null) {
                        str = str + " targetResetDelay";
                    }
                    if (this.samuraiWarmAppThreshold == null) {
                        str = str + " samuraiWarmAppThreshold";
                    }
                    if (this.sendFtlStatusOnFallback == null) {
                        str = str + " sendFtlStatusOnFallback";
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:" + str);
                    }
                    return new AutoValue_FtlConfig(this.cell.intValue(), this.maxTries.intValue(), this.hosts, this.errorsThrottleLimit.intValue(), this.targets, this.hostMap, this.targetResetDelay.longValue(), this.samuraiWarmAppThreshold.longValue(), this.sendFtlStatusOnFallback.booleanValue());
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<FtlConfig> {
        private final TypeAdapter<Integer> cellAdapter;
        private final TypeAdapter<Integer> errorsThrottleLimitAdapter;
        private final TypeAdapter<Map<String, String>> hostMapAdapter;
        private final TypeAdapter<List<String>> hostsAdapter;
        private final TypeAdapter<Integer> maxTriesAdapter;
        private final TypeAdapter<Long> samuraiWarmAppThresholdAdapter;
        private final TypeAdapter<Boolean> sendFtlStatusOnFallbackAdapter;
        private final TypeAdapter<Long> targetResetDelayAdapter;
        private final TypeAdapter<List<FtlTarget>> targetsAdapter;
        private int defaultCell = 0;
        private int defaultMaxTries = 0;
        private List<String> defaultHosts = null;
        private int defaultErrorsThrottleLimit = 0;
        private List<FtlTarget> defaultTargets = null;
        private Map<String, String> defaultHostMap = null;
        private long defaultTargetResetDelay = 0;
        private long defaultSamuraiWarmAppThreshold = 0;
        private boolean defaultSendFtlStatusOnFallback = false;

        public GsonTypeAdapter setDefaultCell(int i) {
            this.defaultCell = i;
            return this;
        }

        public GsonTypeAdapter setDefaultErrorsThrottleLimit(int i) {
            this.defaultErrorsThrottleLimit = i;
            return this;
        }

        public GsonTypeAdapter setDefaultHostMap(Map<String, String> map) {
            this.defaultHostMap = map;
            return this;
        }

        public GsonTypeAdapter setDefaultHosts(List<String> list) {
            this.defaultHosts = list;
            return this;
        }

        public GsonTypeAdapter setDefaultMaxTries(int i) {
            this.defaultMaxTries = i;
            return this;
        }

        public GsonTypeAdapter setDefaultSamuraiWarmAppThreshold(long j) {
            this.defaultSamuraiWarmAppThreshold = j;
            return this;
        }

        public GsonTypeAdapter setDefaultSendFtlStatusOnFallback(boolean z) {
            this.defaultSendFtlStatusOnFallback = z;
            return this;
        }

        public GsonTypeAdapter setDefaultTargetResetDelay(long j) {
            this.defaultTargetResetDelay = j;
            return this;
        }

        public GsonTypeAdapter setDefaultTargets(List<FtlTarget> list) {
            this.defaultTargets = list;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.cellAdapter = gson.getAdapter(Integer.class);
            this.maxTriesAdapter = gson.getAdapter(Integer.class);
            this.hostsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.errorsThrottleLimitAdapter = gson.getAdapter(Integer.class);
            this.targetsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, FtlTarget.class));
            this.hostMapAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
            this.targetResetDelayAdapter = gson.getAdapter(Long.class);
            this.samuraiWarmAppThresholdAdapter = gson.getAdapter(Long.class);
            this.sendFtlStatusOnFallbackAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, FtlConfig ftlConfig) {
            if (ftlConfig == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cell");
            this.cellAdapter.write(jsonWriter, Integer.valueOf(ftlConfig.cell()));
            jsonWriter.name("maxTries");
            this.maxTriesAdapter.write(jsonWriter, Integer.valueOf(ftlConfig.maxTries()));
            jsonWriter.name("hosts");
            this.hostsAdapter.write(jsonWriter, ftlConfig.hosts());
            jsonWriter.name("errorsThrottleLimit");
            this.errorsThrottleLimitAdapter.write(jsonWriter, Integer.valueOf(ftlConfig.errorsThrottleLimit()));
            jsonWriter.name("targets");
            this.targetsAdapter.write(jsonWriter, ftlConfig.targets());
            jsonWriter.name("hostMap");
            this.hostMapAdapter.write(jsonWriter, ftlConfig.hostMap());
            jsonWriter.name("targetResetDelay");
            this.targetResetDelayAdapter.write(jsonWriter, Long.valueOf(ftlConfig.targetResetDelay()));
            jsonWriter.name("samuraiWarmAppThreshold");
            this.samuraiWarmAppThresholdAdapter.write(jsonWriter, Long.valueOf(ftlConfig.samuraiWarmAppThreshold()));
            jsonWriter.name("sendFtlStatusOnFallback");
            this.sendFtlStatusOnFallbackAdapter.write(jsonWriter, Boolean.valueOf(ftlConfig.sendFtlStatusOnFallback()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public FtlConfig read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultCell;
            int i2 = this.defaultMaxTries;
            List<String> list = this.defaultHosts;
            int i3 = this.defaultErrorsThrottleLimit;
            List<FtlTarget> list2 = this.defaultTargets;
            Map<String, String> map = this.defaultHostMap;
            long j = this.defaultTargetResetDelay;
            int i4 = i;
            int i5 = i2;
            List<String> list3 = list;
            int i6 = i3;
            List<FtlTarget> list4 = list2;
            Map<String, String> map2 = map;
            long j2 = j;
            long j3 = this.defaultSamuraiWarmAppThreshold;
            boolean z = this.defaultSendFtlStatusOnFallback;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1732297101:
                            if (nextName.equals("samuraiWarmAppThreshold")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1538277118:
                            if (nextName.equals("targets")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1054301946:
                            if (nextName.equals("errorsThrottleLimit")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -726761399:
                            if (nextName.equals("sendFtlStatusOnFallback")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3049826:
                            if (nextName.equals("cell")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99467211:
                            if (nextName.equals("hosts")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 397883541:
                            if (nextName.equals("maxTries")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1098675860:
                            if (nextName.equals("hostMap")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1607528933:
                            if (nextName.equals("targetResetDelay")) {
                                c = '\b';
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
                            j3 = this.samuraiWarmAppThresholdAdapter.read(jsonReader).longValue();
                            continue;
                        case 1:
                            list4 = this.targetsAdapter.read(jsonReader);
                            continue;
                        case 2:
                            i6 = this.errorsThrottleLimitAdapter.read(jsonReader).intValue();
                            continue;
                        case 3:
                            z = this.sendFtlStatusOnFallbackAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 4:
                            i4 = this.cellAdapter.read(jsonReader).intValue();
                            continue;
                        case 5:
                            list3 = this.hostsAdapter.read(jsonReader);
                            continue;
                        case 6:
                            i5 = this.maxTriesAdapter.read(jsonReader).intValue();
                            continue;
                        case 7:
                            map2 = this.hostMapAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            j2 = this.targetResetDelayAdapter.read(jsonReader).longValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_FtlConfig(i4, i5, list3, i6, list4, map2, j2, j3, z);
        }
    }
}
