package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.PostPlayAction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_BillboardVideo extends C$AutoValue_BillboardVideo {
    AutoValue_BillboardVideo(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        new BillboardVideo(str, str2, z, z2, z3) { // from class: com.netflix.model.leafs.originals.$AutoValue_BillboardVideo
            private final boolean autoPlay;
            private final boolean isTrailer;
            private final String motionId;
            private final boolean motionShouldLoop;
            private final String motionUrl;

            @Override // com.netflix.model.leafs.originals.BillboardVideo
            @SerializedName(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY)
            public boolean autoPlay() {
                return this.autoPlay;
            }

            @Override // com.netflix.model.leafs.originals.BillboardVideo
            @SerializedName("isTrailer")
            public boolean isTrailer() {
                return this.isTrailer;
            }

            @Override // com.netflix.model.leafs.originals.BillboardVideo
            @SerializedName("motionId")
            public String motionId() {
                return this.motionId;
            }

            @Override // com.netflix.model.leafs.originals.BillboardVideo
            @SerializedName("motionShouldLoop")
            public boolean motionShouldLoop() {
                return this.motionShouldLoop;
            }

            @Override // com.netflix.model.leafs.originals.BillboardVideo
            @SerializedName("motionUrl")
            public String motionUrl() {
                return this.motionUrl;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.motionId = str;
                this.motionUrl = str2;
                this.motionShouldLoop = z;
                this.isTrailer = z2;
                this.autoPlay = z3;
            }

            public String toString() {
                return "BillboardVideo{motionId=" + this.motionId + ", motionUrl=" + this.motionUrl + ", motionShouldLoop=" + this.motionShouldLoop + ", isTrailer=" + this.isTrailer + ", autoPlay=" + this.autoPlay + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BillboardVideo) {
                    BillboardVideo billboardVideo = (BillboardVideo) obj;
                    String str3 = this.motionId;
                    if (str3 != null ? str3.equals(billboardVideo.motionId()) : billboardVideo.motionId() == null) {
                        String str4 = this.motionUrl;
                        if (str4 != null ? str4.equals(billboardVideo.motionUrl()) : billboardVideo.motionUrl() == null) {
                            if (this.motionShouldLoop == billboardVideo.motionShouldLoop() && this.isTrailer == billboardVideo.isTrailer() && this.autoPlay == billboardVideo.autoPlay()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str3 = this.motionId;
                int hashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.motionUrl;
                int hashCode2 = str4 != null ? str4.hashCode() : 0;
                int i = this.motionShouldLoop ? 1231 : 1237;
                return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ (this.isTrailer ? 1231 : 1237)) * 1000003) ^ (this.autoPlay ? 1231 : 1237);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<BillboardVideo> {
        private final TypeAdapter<Boolean> autoPlayAdapter;
        private final TypeAdapter<Boolean> isTrailerAdapter;
        private final TypeAdapter<String> motionIdAdapter;
        private final TypeAdapter<Boolean> motionShouldLoopAdapter;
        private final TypeAdapter<String> motionUrlAdapter;
        private String defaultMotionId = null;
        private String defaultMotionUrl = null;
        private boolean defaultMotionShouldLoop = false;
        private boolean defaultIsTrailer = false;
        private boolean defaultAutoPlay = false;

        public GsonTypeAdapter setDefaultAutoPlay(boolean z) {
            this.defaultAutoPlay = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsTrailer(boolean z) {
            this.defaultIsTrailer = z;
            return this;
        }

        public GsonTypeAdapter setDefaultMotionId(String str) {
            this.defaultMotionId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultMotionShouldLoop(boolean z) {
            this.defaultMotionShouldLoop = z;
            return this;
        }

        public GsonTypeAdapter setDefaultMotionUrl(String str) {
            this.defaultMotionUrl = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.motionIdAdapter = gson.getAdapter(String.class);
            this.motionUrlAdapter = gson.getAdapter(String.class);
            this.motionShouldLoopAdapter = gson.getAdapter(Boolean.class);
            this.isTrailerAdapter = gson.getAdapter(Boolean.class);
            this.autoPlayAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BillboardVideo billboardVideo) {
            if (billboardVideo == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("motionId");
            this.motionIdAdapter.write(jsonWriter, billboardVideo.motionId());
            jsonWriter.name("motionUrl");
            this.motionUrlAdapter.write(jsonWriter, billboardVideo.motionUrl());
            jsonWriter.name("motionShouldLoop");
            this.motionShouldLoopAdapter.write(jsonWriter, Boolean.valueOf(billboardVideo.motionShouldLoop()));
            jsonWriter.name("isTrailer");
            this.isTrailerAdapter.write(jsonWriter, Boolean.valueOf(billboardVideo.isTrailer()));
            jsonWriter.name(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY);
            this.autoPlayAdapter.write(jsonWriter, Boolean.valueOf(billboardVideo.autoPlay()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public BillboardVideo read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultMotionId;
            String str2 = this.defaultMotionUrl;
            String str3 = str;
            String str4 = str2;
            boolean z = this.defaultMotionShouldLoop;
            boolean z2 = this.defaultIsTrailer;
            boolean z3 = this.defaultAutoPlay;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1646994263:
                            if (nextName.equals("isTrailer")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -577443367:
                            if (nextName.equals("motionUrl")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -483381427:
                            if (nextName.equals("motionShouldLoop")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -157174927:
                            if (nextName.equals("motionId")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1438608771:
                            if (nextName.equals(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY)) {
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
                        z2 = this.isTrailerAdapter.read(jsonReader).booleanValue();
                    } else if (c == 1) {
                        str4 = this.motionUrlAdapter.read(jsonReader);
                    } else if (c == 2) {
                        z = this.motionShouldLoopAdapter.read(jsonReader).booleanValue();
                    } else if (c == 3) {
                        str3 = this.motionIdAdapter.read(jsonReader);
                    } else if (c == 4) {
                        z3 = this.autoPlayAdapter.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_BillboardVideo(str3, str4, z, z2, z3);
        }
    }
}
