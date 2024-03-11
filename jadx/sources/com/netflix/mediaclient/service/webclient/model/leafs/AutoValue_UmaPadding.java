package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaPadding extends C$AutoValue_UmaPadding {
    AutoValue_UmaPadding(final Float f, final Float f2, final Float f3, final Float f4) {
        new UmaPadding(f, f2, f3, f4) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaPadding
            private final Float bottom;
            private final Float end;
            private final Float start;
            private final Float top;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding
            public Float bottom() {
                return this.bottom;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding
            public Float end() {
                return this.end;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding
            public Float start() {
                return this.start;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding
            public Float top() {
                return this.top;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.top = f;
                this.bottom = f2;
                this.start = f3;
                this.end = f4;
            }

            public String toString() {
                return "UmaPadding{top=" + this.top + ", bottom=" + this.bottom + ", start=" + this.start + ", end=" + this.end + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaPadding) {
                    UmaPadding umaPadding = (UmaPadding) obj;
                    Float f5 = this.top;
                    if (f5 != null ? f5.equals(umaPadding.top()) : umaPadding.top() == null) {
                        Float f6 = this.bottom;
                        if (f6 != null ? f6.equals(umaPadding.bottom()) : umaPadding.bottom() == null) {
                            Float f7 = this.start;
                            if (f7 != null ? f7.equals(umaPadding.start()) : umaPadding.start() == null) {
                                Float f8 = this.end;
                                if (f8 == null) {
                                    if (umaPadding.end() == null) {
                                        return true;
                                    }
                                } else if (f8.equals(umaPadding.end())) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                Float f5 = this.top;
                int hashCode = f5 == null ? 0 : f5.hashCode();
                Float f6 = this.bottom;
                int hashCode2 = f6 == null ? 0 : f6.hashCode();
                Float f7 = this.start;
                int hashCode3 = f7 == null ? 0 : f7.hashCode();
                Float f8 = this.end;
                return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (f8 != null ? f8.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaPadding> {
        private final TypeAdapter<Float> bottomAdapter;
        private final TypeAdapter<Float> endAdapter;
        private final TypeAdapter<Float> startAdapter;
        private final TypeAdapter<Float> topAdapter;
        private Float defaultTop = null;
        private Float defaultBottom = null;
        private Float defaultStart = null;
        private Float defaultEnd = null;

        public GsonTypeAdapter setDefaultBottom(Float f) {
            this.defaultBottom = f;
            return this;
        }

        public GsonTypeAdapter setDefaultEnd(Float f) {
            this.defaultEnd = f;
            return this;
        }

        public GsonTypeAdapter setDefaultStart(Float f) {
            this.defaultStart = f;
            return this;
        }

        public GsonTypeAdapter setDefaultTop(Float f) {
            this.defaultTop = f;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.topAdapter = gson.getAdapter(Float.class);
            this.bottomAdapter = gson.getAdapter(Float.class);
            this.startAdapter = gson.getAdapter(Float.class);
            this.endAdapter = gson.getAdapter(Float.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaPadding umaPadding) {
            if (umaPadding == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("top");
            this.topAdapter.write(jsonWriter, umaPadding.top());
            jsonWriter.name("bottom");
            this.bottomAdapter.write(jsonWriter, umaPadding.bottom());
            jsonWriter.name("start");
            this.startAdapter.write(jsonWriter, umaPadding.start());
            jsonWriter.name("end");
            this.endAdapter.write(jsonWriter, umaPadding.end());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaPadding read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Float f = this.defaultTop;
            Float f2 = this.defaultBottom;
            Float f3 = this.defaultStart;
            Float f4 = this.defaultEnd;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1383228885:
                            if (nextName.equals("bottom")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100571:
                            if (nextName.equals("end")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115029:
                            if (nextName.equals("top")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109757538:
                            if (nextName.equals("start")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        f2 = this.bottomAdapter.read(jsonReader);
                    } else if (c == 1) {
                        f4 = this.endAdapter.read(jsonReader);
                    } else if (c == 2) {
                        f = this.topAdapter.read(jsonReader);
                    } else if (c == 3) {
                        f3 = this.startAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaPadding(f, f2, f3, f4);
        }
    }
}
