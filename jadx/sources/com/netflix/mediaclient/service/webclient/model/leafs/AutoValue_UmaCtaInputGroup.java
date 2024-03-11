package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaCtaInputGroup extends C$AutoValue_UmaCtaInputGroup {
    AutoValue_UmaCtaInputGroup(final UmaCtaInputGroup.InputType inputType, final String str, final String str2, final String str3, final String str4) {
        new UmaCtaInputGroup(inputType, str, str2, str3, str4) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaCtaInputGroup
            private final String copy;
            private final String iconUrlHigh;
            private final String iconUrlLow;
            private final String iconUrlMedium;
            private final UmaCtaInputGroup.InputType inputType;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup
            public String copy() {
                return this.copy;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup
            public String iconUrlHigh() {
                return this.iconUrlHigh;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup
            public String iconUrlLow() {
                return this.iconUrlLow;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup
            public String iconUrlMedium() {
                return this.iconUrlMedium;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup
            public UmaCtaInputGroup.InputType inputType() {
                return this.inputType;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (inputType == null) {
                    throw new NullPointerException("Null inputType");
                }
                this.inputType = inputType;
                if (str == null) {
                    throw new NullPointerException("Null copy");
                }
                this.copy = str;
                this.iconUrlLow = str2;
                this.iconUrlMedium = str3;
                this.iconUrlHigh = str4;
            }

            public String toString() {
                return "UmaCtaInputGroup{inputType=" + this.inputType + ", copy=" + this.copy + ", iconUrlLow=" + this.iconUrlLow + ", iconUrlMedium=" + this.iconUrlMedium + ", iconUrlHigh=" + this.iconUrlHigh + "}";
            }

            public boolean equals(Object obj) {
                String str5;
                String str6;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaCtaInputGroup) {
                    UmaCtaInputGroup umaCtaInputGroup = (UmaCtaInputGroup) obj;
                    if (this.inputType.equals(umaCtaInputGroup.inputType()) && this.copy.equals(umaCtaInputGroup.copy()) && ((str5 = this.iconUrlLow) != null ? str5.equals(umaCtaInputGroup.iconUrlLow()) : umaCtaInputGroup.iconUrlLow() == null) && ((str6 = this.iconUrlMedium) != null ? str6.equals(umaCtaInputGroup.iconUrlMedium()) : umaCtaInputGroup.iconUrlMedium() == null)) {
                        String str7 = this.iconUrlHigh;
                        if (str7 == null) {
                            if (umaCtaInputGroup.iconUrlHigh() == null) {
                                return true;
                            }
                        } else if (str7.equals(umaCtaInputGroup.iconUrlHigh())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.inputType.hashCode();
                int hashCode2 = this.copy.hashCode();
                String str5 = this.iconUrlLow;
                int hashCode3 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.iconUrlMedium;
                int hashCode4 = str6 == null ? 0 : str6.hashCode();
                String str7 = this.iconUrlHigh;
                return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str7 != null ? str7.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaCtaInputGroup> {
        private final TypeAdapter<String> copyAdapter;
        private final TypeAdapter<String> iconUrlHighAdapter;
        private final TypeAdapter<String> iconUrlLowAdapter;
        private final TypeAdapter<String> iconUrlMediumAdapter;
        private final TypeAdapter<UmaCtaInputGroup.InputType> inputTypeAdapter;
        private UmaCtaInputGroup.InputType defaultInputType = null;
        private String defaultCopy = null;
        private String defaultIconUrlLow = null;
        private String defaultIconUrlMedium = null;
        private String defaultIconUrlHigh = null;

        public GsonTypeAdapter setDefaultCopy(String str) {
            this.defaultCopy = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIconUrlHigh(String str) {
            this.defaultIconUrlHigh = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIconUrlLow(String str) {
            this.defaultIconUrlLow = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIconUrlMedium(String str) {
            this.defaultIconUrlMedium = str;
            return this;
        }

        public GsonTypeAdapter setDefaultInputType(UmaCtaInputGroup.InputType inputType) {
            this.defaultInputType = inputType;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.inputTypeAdapter = gson.getAdapter(UmaCtaInputGroup.InputType.class);
            this.copyAdapter = gson.getAdapter(String.class);
            this.iconUrlLowAdapter = gson.getAdapter(String.class);
            this.iconUrlMediumAdapter = gson.getAdapter(String.class);
            this.iconUrlHighAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaCtaInputGroup umaCtaInputGroup) {
            if (umaCtaInputGroup == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("inputType");
            this.inputTypeAdapter.write(jsonWriter, umaCtaInputGroup.inputType());
            jsonWriter.name("copy");
            this.copyAdapter.write(jsonWriter, umaCtaInputGroup.copy());
            jsonWriter.name("iconUrlLow");
            this.iconUrlLowAdapter.write(jsonWriter, umaCtaInputGroup.iconUrlLow());
            jsonWriter.name("iconUrlMedium");
            this.iconUrlMediumAdapter.write(jsonWriter, umaCtaInputGroup.iconUrlMedium());
            jsonWriter.name("iconUrlHigh");
            this.iconUrlHighAdapter.write(jsonWriter, umaCtaInputGroup.iconUrlHigh());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaCtaInputGroup read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            UmaCtaInputGroup.InputType inputType = this.defaultInputType;
            String str = this.defaultCopy;
            UmaCtaInputGroup.InputType inputType2 = inputType;
            String str2 = str;
            String str3 = this.defaultIconUrlLow;
            String str4 = this.defaultIconUrlMedium;
            String str5 = this.defaultIconUrlHigh;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1418982069:
                            if (nextName.equals("iconUrlMedium")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -810559240:
                            if (nextName.equals("iconUrlHigh")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -441785026:
                            if (nextName.equals("iconUrlLow")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3059573:
                            if (nextName.equals("copy")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1706976804:
                            if (nextName.equals("inputType")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str4 = this.iconUrlMediumAdapter.read(jsonReader);
                    } else if (c == 1) {
                        str5 = this.iconUrlHighAdapter.read(jsonReader);
                    } else if (c == 2) {
                        str3 = this.iconUrlLowAdapter.read(jsonReader);
                    } else if (c == 3) {
                        str2 = this.copyAdapter.read(jsonReader);
                    } else if (c == 4) {
                        inputType2 = this.inputTypeAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaCtaInputGroup(inputType2, str2, str3, str4, str5);
        }
    }
}
