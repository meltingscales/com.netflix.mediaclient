package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_BillboardCTA extends C$AutoValue_BillboardCTA {
    AutoValue_BillboardCTA(final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2, final int i, final String str5, final String str6, final String str7) {
        new BillboardCTA(str, str2, str3, str4, z, z2, i, str5, str6, str7) { // from class: com.netflix.model.leafs.originals.$AutoValue_BillboardCTA
            private final String billboardPhase;
            private final String bookmarkPosition;
            private final String galleryId;
            private final boolean ignoreBookmark;
            private final int index;
            private final String name;
            private final String sequenceNumber;
            private final boolean suppressPostPlay;
            private final String type;
            private final String videoId;

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String billboardPhase() {
                return this.billboardPhase;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String bookmarkPosition() {
                return this.bookmarkPosition;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String galleryId() {
                return this.galleryId;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public boolean ignoreBookmark() {
                return this.ignoreBookmark;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public int index() {
                return this.index;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String name() {
                return this.name;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String sequenceNumber() {
                return this.sequenceNumber;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public boolean suppressPostPlay() {
                return this.suppressPostPlay;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String type() {
                return this.type;
            }

            @Override // com.netflix.model.leafs.originals.BillboardCTA
            public String videoId() {
                return this.videoId;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.name = str;
                this.type = str2;
                this.billboardPhase = str3;
                this.videoId = str4;
                this.suppressPostPlay = z;
                this.ignoreBookmark = z2;
                this.index = i;
                this.sequenceNumber = str5;
                this.bookmarkPosition = str6;
                this.galleryId = str7;
            }

            public String toString() {
                return "BillboardCTA{name=" + this.name + ", type=" + this.type + ", billboardPhase=" + this.billboardPhase + ", videoId=" + this.videoId + ", suppressPostPlay=" + this.suppressPostPlay + ", ignoreBookmark=" + this.ignoreBookmark + ", index=" + this.index + ", sequenceNumber=" + this.sequenceNumber + ", bookmarkPosition=" + this.bookmarkPosition + ", galleryId=" + this.galleryId + "}";
            }

            public boolean equals(Object obj) {
                String str8;
                String str9;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BillboardCTA) {
                    BillboardCTA billboardCTA = (BillboardCTA) obj;
                    String str10 = this.name;
                    if (str10 != null ? str10.equals(billboardCTA.name()) : billboardCTA.name() == null) {
                        String str11 = this.type;
                        if (str11 != null ? str11.equals(billboardCTA.type()) : billboardCTA.type() == null) {
                            String str12 = this.billboardPhase;
                            if (str12 != null ? str12.equals(billboardCTA.billboardPhase()) : billboardCTA.billboardPhase() == null) {
                                String str13 = this.videoId;
                                if (str13 != null ? str13.equals(billboardCTA.videoId()) : billboardCTA.videoId() == null) {
                                    if (this.suppressPostPlay == billboardCTA.suppressPostPlay() && this.ignoreBookmark == billboardCTA.ignoreBookmark() && this.index == billboardCTA.index() && ((str8 = this.sequenceNumber) != null ? str8.equals(billboardCTA.sequenceNumber()) : billboardCTA.sequenceNumber() == null) && ((str9 = this.bookmarkPosition) != null ? str9.equals(billboardCTA.bookmarkPosition()) : billboardCTA.bookmarkPosition() == null)) {
                                        String str14 = this.galleryId;
                                        if (str14 == null) {
                                            if (billboardCTA.galleryId() == null) {
                                                return true;
                                            }
                                        } else if (str14.equals(billboardCTA.galleryId())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str8 = this.name;
                int hashCode = str8 == null ? 0 : str8.hashCode();
                String str9 = this.type;
                int hashCode2 = str9 == null ? 0 : str9.hashCode();
                String str10 = this.billboardPhase;
                int hashCode3 = str10 == null ? 0 : str10.hashCode();
                String str11 = this.videoId;
                int hashCode4 = str11 == null ? 0 : str11.hashCode();
                int i2 = this.suppressPostPlay ? 1231 : 1237;
                int i3 = this.ignoreBookmark ? 1231 : 1237;
                int i4 = this.index;
                String str12 = this.sequenceNumber;
                int hashCode5 = str12 == null ? 0 : str12.hashCode();
                String str13 = this.bookmarkPosition;
                int hashCode6 = str13 == null ? 0 : str13.hashCode();
                String str14 = this.galleryId;
                return ((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (str14 != null ? str14.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<BillboardCTA> {
        private final TypeAdapter<String> billboardPhaseAdapter;
        private final TypeAdapter<String> bookmarkPositionAdapter;
        private final TypeAdapter<String> galleryIdAdapter;
        private final TypeAdapter<Boolean> ignoreBookmarkAdapter;
        private final TypeAdapter<Integer> indexAdapter;
        private final TypeAdapter<String> nameAdapter;
        private final TypeAdapter<String> sequenceNumberAdapter;
        private final TypeAdapter<Boolean> suppressPostPlayAdapter;
        private final TypeAdapter<String> typeAdapter;
        private final TypeAdapter<String> videoIdAdapter;
        private String defaultName = null;
        private String defaultType = null;
        private String defaultBillboardPhase = null;
        private String defaultVideoId = null;
        private boolean defaultSuppressPostPlay = false;
        private boolean defaultIgnoreBookmark = false;
        private int defaultIndex = 0;
        private String defaultSequenceNumber = null;
        private String defaultBookmarkPosition = null;
        private String defaultGalleryId = null;

        public GsonTypeAdapter setDefaultBillboardPhase(String str) {
            this.defaultBillboardPhase = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBookmarkPosition(String str) {
            this.defaultBookmarkPosition = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGalleryId(String str) {
            this.defaultGalleryId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIgnoreBookmark(boolean z) {
            this.defaultIgnoreBookmark = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIndex(int i) {
            this.defaultIndex = i;
            return this;
        }

        public GsonTypeAdapter setDefaultName(String str) {
            this.defaultName = str;
            return this;
        }

        public GsonTypeAdapter setDefaultSequenceNumber(String str) {
            this.defaultSequenceNumber = str;
            return this;
        }

        public GsonTypeAdapter setDefaultSuppressPostPlay(boolean z) {
            this.defaultSuppressPostPlay = z;
            return this;
        }

        public GsonTypeAdapter setDefaultType(String str) {
            this.defaultType = str;
            return this;
        }

        public GsonTypeAdapter setDefaultVideoId(String str) {
            this.defaultVideoId = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.nameAdapter = gson.getAdapter(String.class);
            this.typeAdapter = gson.getAdapter(String.class);
            this.billboardPhaseAdapter = gson.getAdapter(String.class);
            this.videoIdAdapter = gson.getAdapter(String.class);
            this.suppressPostPlayAdapter = gson.getAdapter(Boolean.class);
            this.ignoreBookmarkAdapter = gson.getAdapter(Boolean.class);
            this.indexAdapter = gson.getAdapter(Integer.class);
            this.sequenceNumberAdapter = gson.getAdapter(String.class);
            this.bookmarkPositionAdapter = gson.getAdapter(String.class);
            this.galleryIdAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BillboardCTA billboardCTA) {
            if (billboardCTA == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("name");
            this.nameAdapter.write(jsonWriter, billboardCTA.name());
            jsonWriter.name("type");
            this.typeAdapter.write(jsonWriter, billboardCTA.type());
            jsonWriter.name("billboardPhase");
            this.billboardPhaseAdapter.write(jsonWriter, billboardCTA.billboardPhase());
            jsonWriter.name(SignupConstants.Field.VIDEO_ID);
            this.videoIdAdapter.write(jsonWriter, billboardCTA.videoId());
            jsonWriter.name("suppressPostPlay");
            this.suppressPostPlayAdapter.write(jsonWriter, Boolean.valueOf(billboardCTA.suppressPostPlay()));
            jsonWriter.name("ignoreBookmark");
            this.ignoreBookmarkAdapter.write(jsonWriter, Boolean.valueOf(billboardCTA.ignoreBookmark()));
            jsonWriter.name("index");
            this.indexAdapter.write(jsonWriter, Integer.valueOf(billboardCTA.index()));
            jsonWriter.name("sequenceNumber");
            this.sequenceNumberAdapter.write(jsonWriter, billboardCTA.sequenceNumber());
            jsonWriter.name("bookmarkPosition");
            this.bookmarkPositionAdapter.write(jsonWriter, billboardCTA.bookmarkPosition());
            jsonWriter.name("galleryId");
            this.galleryIdAdapter.write(jsonWriter, billboardCTA.galleryId());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public BillboardCTA read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultName;
            String str2 = this.defaultType;
            String str3 = this.defaultBillboardPhase;
            String str4 = this.defaultVideoId;
            boolean z = this.defaultSuppressPostPlay;
            boolean z2 = this.defaultIgnoreBookmark;
            int i = this.defaultIndex;
            String str5 = this.defaultSequenceNumber;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            boolean z3 = z;
            boolean z4 = z2;
            int i2 = i;
            String str10 = str5;
            String str11 = this.defaultBookmarkPosition;
            String str12 = this.defaultGalleryId;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1829827457:
                            if (nextName.equals("bookmarkPosition")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1353995670:
                            if (nextName.equals("sequenceNumber")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1041198724:
                            if (nextName.equals("billboardPhase")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3575610:
                            if (nextName.equals("type")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100346066:
                            if (nextName.equals("index")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 319550477:
                            if (nextName.equals("galleryId")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 452782838:
                            if (nextName.equals(SignupConstants.Field.VIDEO_ID)) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 994317608:
                            if (nextName.equals("ignoreBookmark")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1144180169:
                            if (nextName.equals("suppressPostPlay")) {
                                c = '\t';
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
                            str11 = this.bookmarkPositionAdapter.read(jsonReader);
                            continue;
                        case 1:
                            str10 = this.sequenceNumberAdapter.read(jsonReader);
                            continue;
                        case 2:
                            str8 = this.billboardPhaseAdapter.read(jsonReader);
                            continue;
                        case 3:
                            str6 = this.nameAdapter.read(jsonReader);
                            continue;
                        case 4:
                            str7 = this.typeAdapter.read(jsonReader);
                            continue;
                        case 5:
                            i2 = this.indexAdapter.read(jsonReader).intValue();
                            continue;
                        case 6:
                            str12 = this.galleryIdAdapter.read(jsonReader);
                            continue;
                        case 7:
                            str9 = this.videoIdAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            z4 = this.ignoreBookmarkAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\t':
                            z3 = this.suppressPostPlayAdapter.read(jsonReader).booleanValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_BillboardCTA(str6, str7, str8, str9, z3, z4, i2, str10, str11, str12);
        }
    }
}
