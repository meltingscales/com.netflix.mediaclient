package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import java.util.List;
import o.AbstractC4560bgn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_VideoTrack extends C$AutoValue_VideoTrack {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_VideoTrack(final int i, final int i2, final String str, final int i3, final int i4, final int i5, final int i6, final List<Stream> list, final String str2, final String str3, final String str4, final AbstractC4560bgn abstractC4560bgn, final ManifestLimitedLicense manifestLimitedLicense, final Snippets snippets) {
        new VideoTrack(i, i2, str, i3, i4, i5, i6, list, str2, str3, str4, abstractC4560bgn, manifestLimitedLicense, snippets) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_VideoTrack
            private final AbstractC4560bgn drmHeader;
            private final String flavor;
            private final ManifestLimitedLicense license;
            private final int maxCroppedHeight;
            private final int maxCroppedWidth;
            private final int maxHeight;
            private final int maxWidth;
            private final String newTrackId;
            private final int pixelAspectX;
            private final int pixelAspectY;
            private final String profile;
            private final Snippets snippets;
            private final List<Stream> streams;
            private final String trackId;

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("drmHeader")
            public AbstractC4560bgn drmHeader() {
                return this.drmHeader;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("flavor")
            public String flavor() {
                return this.flavor;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("license")
            public ManifestLimitedLicense license() {
                return this.license;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("maxCroppedHeight")
            public int maxCroppedHeight() {
                return this.maxCroppedHeight;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("maxCroppedWidth")
            public int maxCroppedWidth() {
                return this.maxCroppedWidth;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("maxHeight")
            public int maxHeight() {
                return this.maxHeight;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("maxWidth")
            public int maxWidth() {
                return this.maxWidth;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("new_track_id")
            public String newTrackId() {
                return this.newTrackId;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("pixelAspectX")
            public int pixelAspectX() {
                return this.pixelAspectX;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("pixelAspectY")
            public int pixelAspectY() {
                return this.pixelAspectY;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("profile")
            public String profile() {
                return this.profile;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("snippets")
            public Snippets snippets() {
                return this.snippets;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("streams")
            public List<Stream> streams() {
                return this.streams;
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            @SerializedName("track_id")
            public String trackId() {
                return this.trackId;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.pixelAspectY = i;
                this.pixelAspectX = i2;
                this.flavor = str;
                this.maxCroppedWidth = i3;
                this.maxHeight = i4;
                this.maxCroppedHeight = i5;
                this.maxWidth = i6;
                if (list == null) {
                    throw new NullPointerException("Null streams");
                }
                this.streams = list;
                if (str2 == null) {
                    throw new NullPointerException("Null profile");
                }
                this.profile = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null trackId");
                }
                this.trackId = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null newTrackId");
                }
                this.newTrackId = str4;
                this.drmHeader = abstractC4560bgn;
                this.license = manifestLimitedLicense;
                this.snippets = snippets;
            }

            public String toString() {
                return "VideoTrack{pixelAspectY=" + this.pixelAspectY + ", pixelAspectX=" + this.pixelAspectX + ", flavor=" + this.flavor + ", maxCroppedWidth=" + this.maxCroppedWidth + ", maxHeight=" + this.maxHeight + ", maxCroppedHeight=" + this.maxCroppedHeight + ", maxWidth=" + this.maxWidth + ", streams=" + this.streams + ", profile=" + this.profile + ", trackId=" + this.trackId + ", newTrackId=" + this.newTrackId + ", drmHeader=" + this.drmHeader + ", license=" + this.license + ", snippets=" + this.snippets + "}";
            }

            public boolean equals(Object obj) {
                String str5;
                AbstractC4560bgn abstractC4560bgn2;
                ManifestLimitedLicense manifestLimitedLicense2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof VideoTrack) {
                    VideoTrack videoTrack = (VideoTrack) obj;
                    if (this.pixelAspectY == videoTrack.pixelAspectY() && this.pixelAspectX == videoTrack.pixelAspectX() && ((str5 = this.flavor) != null ? str5.equals(videoTrack.flavor()) : videoTrack.flavor() == null) && this.maxCroppedWidth == videoTrack.maxCroppedWidth() && this.maxHeight == videoTrack.maxHeight() && this.maxCroppedHeight == videoTrack.maxCroppedHeight() && this.maxWidth == videoTrack.maxWidth() && this.streams.equals(videoTrack.streams()) && this.profile.equals(videoTrack.profile()) && this.trackId.equals(videoTrack.trackId()) && this.newTrackId.equals(videoTrack.newTrackId()) && ((abstractC4560bgn2 = this.drmHeader) != null ? abstractC4560bgn2.equals(videoTrack.drmHeader()) : videoTrack.drmHeader() == null) && ((manifestLimitedLicense2 = this.license) != null ? manifestLimitedLicense2.equals(videoTrack.license()) : videoTrack.license() == null)) {
                        Snippets snippets2 = this.snippets;
                        if (snippets2 == null) {
                            if (videoTrack.snippets() == null) {
                                return true;
                            }
                        } else if (snippets2.equals(videoTrack.snippets())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i7 = this.pixelAspectY;
                int i8 = this.pixelAspectX;
                String str5 = this.flavor;
                int hashCode = str5 == null ? 0 : str5.hashCode();
                int i9 = this.maxCroppedWidth;
                int i10 = this.maxHeight;
                int i11 = this.maxCroppedHeight;
                int i12 = this.maxWidth;
                int hashCode2 = this.streams.hashCode();
                int hashCode3 = this.profile.hashCode();
                int hashCode4 = this.trackId.hashCode();
                int hashCode5 = this.newTrackId.hashCode();
                AbstractC4560bgn abstractC4560bgn2 = this.drmHeader;
                int hashCode6 = abstractC4560bgn2 == null ? 0 : abstractC4560bgn2.hashCode();
                ManifestLimitedLicense manifestLimitedLicense2 = this.license;
                int hashCode7 = manifestLimitedLicense2 == null ? 0 : manifestLimitedLicense2.hashCode();
                Snippets snippets2 = this.snippets;
                return ((((((((((((((((((((((((((i7 ^ 1000003) * 1000003) ^ i8) * 1000003) ^ hashCode) * 1000003) ^ i9) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ (snippets2 != null ? snippets2.hashCode() : 0);
            }

            @Override // com.netflix.mediaclient.media.manifest.VideoTrack
            public VideoTrack.Builder toBuilder() {
                return new Builder(this);
            }

            /* renamed from: com.netflix.mediaclient.media.manifest.$AutoValue_VideoTrack$Builder */
            /* loaded from: classes.dex */
            static final class Builder extends VideoTrack.Builder {
                private AbstractC4560bgn drmHeader;
                private String flavor;
                private ManifestLimitedLicense license;
                private Integer maxCroppedHeight;
                private Integer maxCroppedWidth;
                private Integer maxHeight;
                private Integer maxWidth;
                private String newTrackId;
                private Integer pixelAspectX;
                private Integer pixelAspectY;
                private String profile;
                private Snippets snippets;
                private List<Stream> streams;
                private String trackId;

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder drmHeader(AbstractC4560bgn abstractC4560bgn) {
                    this.drmHeader = abstractC4560bgn;
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder flavor(String str) {
                    this.flavor = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder license(ManifestLimitedLicense manifestLimitedLicense) {
                    this.license = manifestLimitedLicense;
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder snippets(Snippets snippets) {
                    this.snippets = snippets;
                    return this;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                public Builder() {
                }

                private Builder(VideoTrack videoTrack) {
                    this.pixelAspectY = Integer.valueOf(videoTrack.pixelAspectY());
                    this.pixelAspectX = Integer.valueOf(videoTrack.pixelAspectX());
                    this.flavor = videoTrack.flavor();
                    this.maxCroppedWidth = Integer.valueOf(videoTrack.maxCroppedWidth());
                    this.maxHeight = Integer.valueOf(videoTrack.maxHeight());
                    this.maxCroppedHeight = Integer.valueOf(videoTrack.maxCroppedHeight());
                    this.maxWidth = Integer.valueOf(videoTrack.maxWidth());
                    this.streams = videoTrack.streams();
                    this.profile = videoTrack.profile();
                    this.trackId = videoTrack.trackId();
                    this.newTrackId = videoTrack.newTrackId();
                    this.drmHeader = videoTrack.drmHeader();
                    this.license = videoTrack.license();
                    this.snippets = videoTrack.snippets();
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder pixelAspectY(int i) {
                    this.pixelAspectY = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder pixelAspectX(int i) {
                    this.pixelAspectX = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder maxCroppedWidth(int i) {
                    this.maxCroppedWidth = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder maxHeight(int i) {
                    this.maxHeight = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder maxCroppedHeight(int i) {
                    this.maxCroppedHeight = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder maxWidth(int i) {
                    this.maxWidth = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder streams(List<Stream> list) {
                    if (list != null) {
                        this.streams = list;
                        return this;
                    }
                    throw new NullPointerException("Null streams");
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder profile(String str) {
                    if (str != null) {
                        this.profile = str;
                        return this;
                    }
                    throw new NullPointerException("Null profile");
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder trackId(String str) {
                    if (str != null) {
                        this.trackId = str;
                        return this;
                    }
                    throw new NullPointerException("Null trackId");
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack.Builder newTrackId(String str) {
                    if (str != null) {
                        this.newTrackId = str;
                        return this;
                    }
                    throw new NullPointerException("Null newTrackId");
                }

                @Override // com.netflix.mediaclient.media.manifest.VideoTrack.Builder
                public VideoTrack build() {
                    String str = "";
                    if (this.pixelAspectY == null) {
                        str = " pixelAspectY";
                    }
                    if (this.pixelAspectX == null) {
                        str = str + " pixelAspectX";
                    }
                    if (this.maxCroppedWidth == null) {
                        str = str + " maxCroppedWidth";
                    }
                    if (this.maxHeight == null) {
                        str = str + " maxHeight";
                    }
                    if (this.maxCroppedHeight == null) {
                        str = str + " maxCroppedHeight";
                    }
                    if (this.maxWidth == null) {
                        str = str + " maxWidth";
                    }
                    if (this.streams == null) {
                        str = str + " streams";
                    }
                    if (this.profile == null) {
                        str = str + " profile";
                    }
                    if (this.trackId == null) {
                        str = str + " trackId";
                    }
                    if (this.newTrackId == null) {
                        str = str + " newTrackId";
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:" + str);
                    }
                    return new AutoValue_VideoTrack(this.pixelAspectY.intValue(), this.pixelAspectX.intValue(), this.flavor, this.maxCroppedWidth.intValue(), this.maxHeight.intValue(), this.maxCroppedHeight.intValue(), this.maxWidth.intValue(), this.streams, this.profile, this.trackId, this.newTrackId, this.drmHeader, this.license, this.snippets);
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<VideoTrack> {
        private final TypeAdapter<AbstractC4560bgn> drmHeaderAdapter;
        private final TypeAdapter<String> flavorAdapter;
        private final TypeAdapter<ManifestLimitedLicense> licenseAdapter;
        private final TypeAdapter<Integer> maxCroppedHeightAdapter;
        private final TypeAdapter<Integer> maxCroppedWidthAdapter;
        private final TypeAdapter<Integer> maxHeightAdapter;
        private final TypeAdapter<Integer> maxWidthAdapter;
        private final TypeAdapter<String> newTrackIdAdapter;
        private final TypeAdapter<Integer> pixelAspectXAdapter;
        private final TypeAdapter<Integer> pixelAspectYAdapter;
        private final TypeAdapter<String> profileAdapter;
        private final TypeAdapter<Snippets> snippetsAdapter;
        private final TypeAdapter<List<Stream>> streamsAdapter;
        private final TypeAdapter<String> trackIdAdapter;
        private int defaultPixelAspectY = 0;
        private int defaultPixelAspectX = 0;
        private String defaultFlavor = null;
        private int defaultMaxCroppedWidth = 0;
        private int defaultMaxHeight = 0;
        private int defaultMaxCroppedHeight = 0;
        private int defaultMaxWidth = 0;
        private List<Stream> defaultStreams = null;
        private String defaultProfile = null;
        private String defaultTrackId = null;
        private String defaultNewTrackId = null;
        private AbstractC4560bgn defaultDrmHeader = null;
        private ManifestLimitedLicense defaultLicense = null;
        private Snippets defaultSnippets = null;

        public GsonTypeAdapter setDefaultDrmHeader(AbstractC4560bgn abstractC4560bgn) {
            this.defaultDrmHeader = abstractC4560bgn;
            return this;
        }

        public GsonTypeAdapter setDefaultFlavor(String str) {
            this.defaultFlavor = str;
            return this;
        }

        public GsonTypeAdapter setDefaultLicense(ManifestLimitedLicense manifestLimitedLicense) {
            this.defaultLicense = manifestLimitedLicense;
            return this;
        }

        public GsonTypeAdapter setDefaultMaxCroppedHeight(int i) {
            this.defaultMaxCroppedHeight = i;
            return this;
        }

        public GsonTypeAdapter setDefaultMaxCroppedWidth(int i) {
            this.defaultMaxCroppedWidth = i;
            return this;
        }

        public GsonTypeAdapter setDefaultMaxHeight(int i) {
            this.defaultMaxHeight = i;
            return this;
        }

        public GsonTypeAdapter setDefaultMaxWidth(int i) {
            this.defaultMaxWidth = i;
            return this;
        }

        public GsonTypeAdapter setDefaultNewTrackId(String str) {
            this.defaultNewTrackId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultPixelAspectX(int i) {
            this.defaultPixelAspectX = i;
            return this;
        }

        public GsonTypeAdapter setDefaultPixelAspectY(int i) {
            this.defaultPixelAspectY = i;
            return this;
        }

        public GsonTypeAdapter setDefaultProfile(String str) {
            this.defaultProfile = str;
            return this;
        }

        public GsonTypeAdapter setDefaultSnippets(Snippets snippets) {
            this.defaultSnippets = snippets;
            return this;
        }

        public GsonTypeAdapter setDefaultStreams(List<Stream> list) {
            this.defaultStreams = list;
            return this;
        }

        public GsonTypeAdapter setDefaultTrackId(String str) {
            this.defaultTrackId = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.pixelAspectYAdapter = gson.getAdapter(Integer.class);
            this.pixelAspectXAdapter = gson.getAdapter(Integer.class);
            this.flavorAdapter = gson.getAdapter(String.class);
            this.maxCroppedWidthAdapter = gson.getAdapter(Integer.class);
            this.maxHeightAdapter = gson.getAdapter(Integer.class);
            this.maxCroppedHeightAdapter = gson.getAdapter(Integer.class);
            this.maxWidthAdapter = gson.getAdapter(Integer.class);
            this.streamsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Stream.class));
            this.profileAdapter = gson.getAdapter(String.class);
            this.trackIdAdapter = gson.getAdapter(String.class);
            this.newTrackIdAdapter = gson.getAdapter(String.class);
            this.drmHeaderAdapter = gson.getAdapter(AbstractC4560bgn.class);
            this.licenseAdapter = gson.getAdapter(ManifestLimitedLicense.class);
            this.snippetsAdapter = gson.getAdapter(Snippets.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, VideoTrack videoTrack) {
            if (videoTrack == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("pixelAspectY");
            this.pixelAspectYAdapter.write(jsonWriter, Integer.valueOf(videoTrack.pixelAspectY()));
            jsonWriter.name("pixelAspectX");
            this.pixelAspectXAdapter.write(jsonWriter, Integer.valueOf(videoTrack.pixelAspectX()));
            jsonWriter.name("flavor");
            this.flavorAdapter.write(jsonWriter, videoTrack.flavor());
            jsonWriter.name("maxCroppedWidth");
            this.maxCroppedWidthAdapter.write(jsonWriter, Integer.valueOf(videoTrack.maxCroppedWidth()));
            jsonWriter.name("maxHeight");
            this.maxHeightAdapter.write(jsonWriter, Integer.valueOf(videoTrack.maxHeight()));
            jsonWriter.name("maxCroppedHeight");
            this.maxCroppedHeightAdapter.write(jsonWriter, Integer.valueOf(videoTrack.maxCroppedHeight()));
            jsonWriter.name("maxWidth");
            this.maxWidthAdapter.write(jsonWriter, Integer.valueOf(videoTrack.maxWidth()));
            jsonWriter.name("streams");
            this.streamsAdapter.write(jsonWriter, videoTrack.streams());
            jsonWriter.name("profile");
            this.profileAdapter.write(jsonWriter, videoTrack.profile());
            jsonWriter.name("track_id");
            this.trackIdAdapter.write(jsonWriter, videoTrack.trackId());
            jsonWriter.name("new_track_id");
            this.newTrackIdAdapter.write(jsonWriter, videoTrack.newTrackId());
            jsonWriter.name("drmHeader");
            this.drmHeaderAdapter.write(jsonWriter, videoTrack.drmHeader());
            jsonWriter.name("license");
            this.licenseAdapter.write(jsonWriter, videoTrack.license());
            jsonWriter.name("snippets");
            this.snippetsAdapter.write(jsonWriter, videoTrack.snippets());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public VideoTrack read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultPixelAspectY;
            int i2 = this.defaultPixelAspectX;
            String str = this.defaultFlavor;
            int i3 = this.defaultMaxCroppedWidth;
            int i4 = this.defaultMaxHeight;
            int i5 = this.defaultMaxCroppedHeight;
            int i6 = this.defaultMaxWidth;
            List<Stream> list = this.defaultStreams;
            String str2 = this.defaultProfile;
            String str3 = this.defaultTrackId;
            String str4 = this.defaultNewTrackId;
            AbstractC4560bgn abstractC4560bgn = this.defaultDrmHeader;
            int i7 = i;
            int i8 = i2;
            String str5 = str;
            int i9 = i3;
            int i10 = i4;
            int i11 = i5;
            int i12 = i6;
            List<Stream> list2 = list;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            AbstractC4560bgn abstractC4560bgn2 = abstractC4560bgn;
            ManifestLimitedLicense manifestLimitedLicense = this.defaultLicense;
            Snippets snippets = this.defaultSnippets;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1881890573:
                            if (nextName.equals("streams")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1272046946:
                            if (nextName.equals("flavor")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1057485813:
                            if (nextName.equals("maxCroppedWidth")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -906066005:
                            if (nextName.equals("maxHeight")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -338537394:
                            if (nextName.equals("new_track_id")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -309425751:
                            if (nextName.equals("profile")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 166757441:
                            if (nextName.equals("license")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 400381634:
                            if (nextName.equals("maxWidth")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 513815286:
                            if (nextName.equals("snippets")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 866279692:
                            if (nextName.equals("drmHeader")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1144683394:
                            if (nextName.equals("maxCroppedHeight")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1270478991:
                            if (nextName.equals("track_id")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2096986522:
                            if (nextName.equals("pixelAspectX")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2096986523:
                            if (nextName.equals("pixelAspectY")) {
                                c = '\r';
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
                            list2 = this.streamsAdapter.read(jsonReader);
                            continue;
                        case 1:
                            str5 = this.flavorAdapter.read(jsonReader);
                            continue;
                        case 2:
                            i9 = this.maxCroppedWidthAdapter.read(jsonReader).intValue();
                            continue;
                        case 3:
                            i10 = this.maxHeightAdapter.read(jsonReader).intValue();
                            continue;
                        case 4:
                            str8 = this.newTrackIdAdapter.read(jsonReader);
                            continue;
                        case 5:
                            str6 = this.profileAdapter.read(jsonReader);
                            continue;
                        case 6:
                            manifestLimitedLicense = this.licenseAdapter.read(jsonReader);
                            continue;
                        case 7:
                            i12 = this.maxWidthAdapter.read(jsonReader).intValue();
                            continue;
                        case '\b':
                            snippets = this.snippetsAdapter.read(jsonReader);
                            continue;
                        case '\t':
                            abstractC4560bgn2 = this.drmHeaderAdapter.read(jsonReader);
                            continue;
                        case '\n':
                            i11 = this.maxCroppedHeightAdapter.read(jsonReader).intValue();
                            continue;
                        case 11:
                            str7 = this.trackIdAdapter.read(jsonReader);
                            continue;
                        case '\f':
                            i8 = this.pixelAspectXAdapter.read(jsonReader).intValue();
                            continue;
                        case '\r':
                            i7 = this.pixelAspectYAdapter.read(jsonReader).intValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_VideoTrack(i7, i8, str5, i9, i10, i11, i12, list2, str6, str7, str8, abstractC4560bgn2, manifestLimitedLicense, snippets);
        }
    }
}
