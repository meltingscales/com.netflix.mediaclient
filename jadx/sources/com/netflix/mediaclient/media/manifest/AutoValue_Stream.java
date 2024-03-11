package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.media.manifest.Stream;
import java.util.List;
import o.AbstractC4559bgm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Stream extends C$AutoValue_Stream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Stream(final int i, final List<Url> list, final String str, final boolean z, final long j, final String str2, final String str3, final AbstractC4559bgm abstractC4559bgm, final AbstractC4559bgm abstractC4559bgm2, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final List<SegmentVmaf> list2, final String str4) {
        new Stream(i, list, str, z, j, str2, str3, abstractC4559bgm, abstractC4559bgm2, i2, i3, i4, i5, i6, i7, list2, str4) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_Stream
            private final int bitrate;
            private final String contentProfile;
            private final String downloadableId;
            private final int framerateScale;
            private final int framerateValue;
            private final boolean isDrm;
            private final AbstractC4559bgm moov;
            private final String newStreamId;
            private final int peakBitrate;
            private final String representationId;
            private final int resH;
            private final int resW;
            private final List<SegmentVmaf> segmentVmaf;
            private final AbstractC4559bgm sidx;
            private final long size;
            private final List<Url> urls;
            private final int vmaf;

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("bitrate")
            public int bitrate() {
                return this.bitrate;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("content_profile")
            public String contentProfile() {
                return this.contentProfile;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("downloadable_id")
            public String downloadableId() {
                return this.downloadableId;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("framerate_scale")
            public int framerateScale() {
                return this.framerateScale;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("framerate_value")
            public int framerateValue() {
                return this.framerateValue;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("isDrm")
            public boolean isDrm() {
                return this.isDrm;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("moov")
            public AbstractC4559bgm moov() {
                return this.moov;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("new_stream_id")
            public String newStreamId() {
                return this.newStreamId;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("peakBitrate")
            public int peakBitrate() {
                return this.peakBitrate;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("representationId")
            public String representationId() {
                return this.representationId;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("res_h")
            public int resH() {
                return this.resH;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("res_w")
            public int resW() {
                return this.resW;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("segmentVmaf")
            public List<SegmentVmaf> segmentVmaf() {
                return this.segmentVmaf;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("sidx")
            public AbstractC4559bgm sidx() {
                return this.sidx;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("size")
            public long size() {
                return this.size;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("urls")
            public List<Url> urls() {
                return this.urls;
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            @SerializedName("vmaf")
            public int vmaf() {
                return this.vmaf;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.bitrate = i;
                if (list == null) {
                    throw new NullPointerException("Null urls");
                }
                this.urls = list;
                if (str == null) {
                    throw new NullPointerException("Null contentProfile");
                }
                this.contentProfile = str;
                this.isDrm = z;
                this.size = j;
                if (str2 == null) {
                    throw new NullPointerException("Null downloadableId");
                }
                this.downloadableId = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null newStreamId");
                }
                this.newStreamId = str3;
                this.moov = abstractC4559bgm;
                this.sidx = abstractC4559bgm2;
                this.vmaf = i2;
                this.resW = i3;
                this.peakBitrate = i4;
                this.resH = i5;
                this.framerateValue = i6;
                this.framerateScale = i7;
                if (list2 == null) {
                    throw new NullPointerException("Null segmentVmaf");
                }
                this.segmentVmaf = list2;
                this.representationId = str4;
            }

            public String toString() {
                return "Stream{bitrate=" + this.bitrate + ", urls=" + this.urls + ", contentProfile=" + this.contentProfile + ", isDrm=" + this.isDrm + ", size=" + this.size + ", downloadableId=" + this.downloadableId + ", newStreamId=" + this.newStreamId + ", moov=" + this.moov + ", sidx=" + this.sidx + ", vmaf=" + this.vmaf + ", resW=" + this.resW + ", peakBitrate=" + this.peakBitrate + ", resH=" + this.resH + ", framerateValue=" + this.framerateValue + ", framerateScale=" + this.framerateScale + ", segmentVmaf=" + this.segmentVmaf + ", representationId=" + this.representationId + "}";
            }

            public boolean equals(Object obj) {
                AbstractC4559bgm abstractC4559bgm3;
                AbstractC4559bgm abstractC4559bgm4;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Stream) {
                    Stream stream = (Stream) obj;
                    if (this.bitrate == stream.bitrate() && this.urls.equals(stream.urls()) && this.contentProfile.equals(stream.contentProfile()) && this.isDrm == stream.isDrm() && this.size == stream.size() && this.downloadableId.equals(stream.downloadableId()) && this.newStreamId.equals(stream.newStreamId()) && ((abstractC4559bgm3 = this.moov) != null ? abstractC4559bgm3.equals(stream.moov()) : stream.moov() == null) && ((abstractC4559bgm4 = this.sidx) != null ? abstractC4559bgm4.equals(stream.sidx()) : stream.sidx() == null) && this.vmaf == stream.vmaf() && this.resW == stream.resW() && this.peakBitrate == stream.peakBitrate() && this.resH == stream.resH() && this.framerateValue == stream.framerateValue() && this.framerateScale == stream.framerateScale() && this.segmentVmaf.equals(stream.segmentVmaf())) {
                        String str5 = this.representationId;
                        if (str5 == null) {
                            if (stream.representationId() == null) {
                                return true;
                            }
                        } else if (str5.equals(stream.representationId())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i8 = this.bitrate;
                int hashCode = this.urls.hashCode();
                int hashCode2 = this.contentProfile.hashCode();
                int i9 = this.isDrm ? 1231 : 1237;
                long j2 = this.size;
                int i10 = (int) (j2 ^ (j2 >>> 32));
                int hashCode3 = this.downloadableId.hashCode();
                int hashCode4 = this.newStreamId.hashCode();
                AbstractC4559bgm abstractC4559bgm3 = this.moov;
                int hashCode5 = abstractC4559bgm3 == null ? 0 : abstractC4559bgm3.hashCode();
                AbstractC4559bgm abstractC4559bgm4 = this.sidx;
                int hashCode6 = abstractC4559bgm4 == null ? 0 : abstractC4559bgm4.hashCode();
                int i11 = this.vmaf;
                int i12 = this.resW;
                int i13 = this.peakBitrate;
                int i14 = this.resH;
                int i15 = this.framerateValue;
                int i16 = this.framerateScale;
                int hashCode7 = this.segmentVmaf.hashCode();
                String str5 = this.representationId;
                return ((((((((((((((((((((((((((((((((i8 ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ i9) * 1000003) ^ i10) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ i13) * 1000003) ^ i14) * 1000003) ^ i15) * 1000003) ^ i16) * 1000003) ^ hashCode7) * 1000003) ^ (str5 == null ? 0 : str5.hashCode());
            }

            @Override // com.netflix.mediaclient.media.manifest.Stream
            public Stream.Builder toBuilder() {
                return new Builder(this);
            }

            /* renamed from: com.netflix.mediaclient.media.manifest.$AutoValue_Stream$Builder */
            /* loaded from: classes.dex */
            static final class Builder extends Stream.Builder {
                private Integer bitrate;
                private String contentProfile;
                private String downloadableId;
                private Integer framerateScale;
                private Integer framerateValue;
                private Boolean isDrm;
                private AbstractC4559bgm moov;
                private String newStreamId;
                private Integer peakBitrate;
                private String representationId;
                private Integer resH;
                private Integer resW;
                private List<SegmentVmaf> segmentVmaf;
                private AbstractC4559bgm sidx;
                private Long size;
                private List<Url> urls;
                private Integer vmaf;

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder moov(AbstractC4559bgm abstractC4559bgm) {
                    this.moov = abstractC4559bgm;
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder representationId(String str) {
                    this.representationId = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder sidx(AbstractC4559bgm abstractC4559bgm) {
                    this.sidx = abstractC4559bgm;
                    return this;
                }

                Builder() {
                }

                private Builder(Stream stream) {
                    this.bitrate = Integer.valueOf(stream.bitrate());
                    this.urls = stream.urls();
                    this.contentProfile = stream.contentProfile();
                    this.isDrm = Boolean.valueOf(stream.isDrm());
                    this.size = Long.valueOf(stream.size());
                    this.downloadableId = stream.downloadableId();
                    this.newStreamId = stream.newStreamId();
                    this.moov = stream.moov();
                    this.sidx = stream.sidx();
                    this.vmaf = Integer.valueOf(stream.vmaf());
                    this.resW = Integer.valueOf(stream.resW());
                    this.peakBitrate = Integer.valueOf(stream.peakBitrate());
                    this.resH = Integer.valueOf(stream.resH());
                    this.framerateValue = Integer.valueOf(stream.framerateValue());
                    this.framerateScale = Integer.valueOf(stream.framerateScale());
                    this.segmentVmaf = stream.segmentVmaf();
                    this.representationId = stream.representationId();
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder bitrate(int i) {
                    this.bitrate = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder urls(List<Url> list) {
                    if (list != null) {
                        this.urls = list;
                        return this;
                    }
                    throw new NullPointerException("Null urls");
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder contentProfile(String str) {
                    if (str != null) {
                        this.contentProfile = str;
                        return this;
                    }
                    throw new NullPointerException("Null contentProfile");
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder isDrm(boolean z) {
                    this.isDrm = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder size(long j) {
                    this.size = Long.valueOf(j);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder downloadableId(String str) {
                    if (str != null) {
                        this.downloadableId = str;
                        return this;
                    }
                    throw new NullPointerException("Null downloadableId");
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder newStreamId(String str) {
                    if (str != null) {
                        this.newStreamId = str;
                        return this;
                    }
                    throw new NullPointerException("Null newStreamId");
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder vmaf(int i) {
                    this.vmaf = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder resW(int i) {
                    this.resW = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder peakBitrate(int i) {
                    this.peakBitrate = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder resH(int i) {
                    this.resH = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder framerateValue(int i) {
                    this.framerateValue = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder framerateScale(int i) {
                    this.framerateScale = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream.Builder segmentVmaf(List<SegmentVmaf> list) {
                    if (list != null) {
                        this.segmentVmaf = list;
                        return this;
                    }
                    throw new NullPointerException("Null segmentVmaf");
                }

                @Override // com.netflix.mediaclient.media.manifest.Stream.Builder
                public Stream build() {
                    String str = "";
                    if (this.bitrate == null) {
                        str = " bitrate";
                    }
                    if (this.urls == null) {
                        str = str + " urls";
                    }
                    if (this.contentProfile == null) {
                        str = str + " contentProfile";
                    }
                    if (this.isDrm == null) {
                        str = str + " isDrm";
                    }
                    if (this.size == null) {
                        str = str + " size";
                    }
                    if (this.downloadableId == null) {
                        str = str + " downloadableId";
                    }
                    if (this.newStreamId == null) {
                        str = str + " newStreamId";
                    }
                    if (this.vmaf == null) {
                        str = str + " vmaf";
                    }
                    if (this.resW == null) {
                        str = str + " resW";
                    }
                    if (this.peakBitrate == null) {
                        str = str + " peakBitrate";
                    }
                    if (this.resH == null) {
                        str = str + " resH";
                    }
                    if (this.framerateValue == null) {
                        str = str + " framerateValue";
                    }
                    if (this.framerateScale == null) {
                        str = str + " framerateScale";
                    }
                    if (this.segmentVmaf == null) {
                        str = str + " segmentVmaf";
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:" + str);
                    }
                    return new AutoValue_Stream(this.bitrate.intValue(), this.urls, this.contentProfile, this.isDrm.booleanValue(), this.size.longValue(), this.downloadableId, this.newStreamId, this.moov, this.sidx, this.vmaf.intValue(), this.resW.intValue(), this.peakBitrate.intValue(), this.resH.intValue(), this.framerateValue.intValue(), this.framerateScale.intValue(), this.segmentVmaf, this.representationId);
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Stream> {
        private final TypeAdapter<Integer> bitrateAdapter;
        private final TypeAdapter<String> contentProfileAdapter;
        private final TypeAdapter<String> downloadableIdAdapter;
        private final TypeAdapter<Integer> framerateScaleAdapter;
        private final TypeAdapter<Integer> framerateValueAdapter;
        private final TypeAdapter<Boolean> isDrmAdapter;
        private final TypeAdapter<AbstractC4559bgm> moovAdapter;
        private final TypeAdapter<String> newStreamIdAdapter;
        private final TypeAdapter<Integer> peakBitrateAdapter;
        private final TypeAdapter<String> representationIdAdapter;
        private final TypeAdapter<Integer> resHAdapter;
        private final TypeAdapter<Integer> resWAdapter;
        private final TypeAdapter<List<SegmentVmaf>> segmentVmafAdapter;
        private final TypeAdapter<AbstractC4559bgm> sidxAdapter;
        private final TypeAdapter<Long> sizeAdapter;
        private final TypeAdapter<List<Url>> urlsAdapter;
        private final TypeAdapter<Integer> vmafAdapter;
        private int defaultBitrate = 0;
        private List<Url> defaultUrls = null;
        private String defaultContentProfile = null;
        private boolean defaultIsDrm = false;
        private long defaultSize = 0;
        private String defaultDownloadableId = null;
        private String defaultNewStreamId = null;
        private AbstractC4559bgm defaultMoov = null;
        private AbstractC4559bgm defaultSidx = null;
        private int defaultVmaf = 0;
        private int defaultResW = 0;
        private int defaultPeakBitrate = 0;
        private int defaultResH = 0;
        private int defaultFramerateValue = 0;
        private int defaultFramerateScale = 0;
        private List<SegmentVmaf> defaultSegmentVmaf = null;
        private String defaultRepresentationId = null;

        public GsonTypeAdapter setDefaultBitrate(int i) {
            this.defaultBitrate = i;
            return this;
        }

        public GsonTypeAdapter setDefaultContentProfile(String str) {
            this.defaultContentProfile = str;
            return this;
        }

        public GsonTypeAdapter setDefaultDownloadableId(String str) {
            this.defaultDownloadableId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultFramerateScale(int i) {
            this.defaultFramerateScale = i;
            return this;
        }

        public GsonTypeAdapter setDefaultFramerateValue(int i) {
            this.defaultFramerateValue = i;
            return this;
        }

        public GsonTypeAdapter setDefaultIsDrm(boolean z) {
            this.defaultIsDrm = z;
            return this;
        }

        public GsonTypeAdapter setDefaultMoov(AbstractC4559bgm abstractC4559bgm) {
            this.defaultMoov = abstractC4559bgm;
            return this;
        }

        public GsonTypeAdapter setDefaultNewStreamId(String str) {
            this.defaultNewStreamId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultPeakBitrate(int i) {
            this.defaultPeakBitrate = i;
            return this;
        }

        public GsonTypeAdapter setDefaultRepresentationId(String str) {
            this.defaultRepresentationId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultResH(int i) {
            this.defaultResH = i;
            return this;
        }

        public GsonTypeAdapter setDefaultResW(int i) {
            this.defaultResW = i;
            return this;
        }

        public GsonTypeAdapter setDefaultSegmentVmaf(List<SegmentVmaf> list) {
            this.defaultSegmentVmaf = list;
            return this;
        }

        public GsonTypeAdapter setDefaultSidx(AbstractC4559bgm abstractC4559bgm) {
            this.defaultSidx = abstractC4559bgm;
            return this;
        }

        public GsonTypeAdapter setDefaultSize(long j) {
            this.defaultSize = j;
            return this;
        }

        public GsonTypeAdapter setDefaultUrls(List<Url> list) {
            this.defaultUrls = list;
            return this;
        }

        public GsonTypeAdapter setDefaultVmaf(int i) {
            this.defaultVmaf = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.bitrateAdapter = gson.getAdapter(Integer.class);
            this.urlsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Url.class));
            this.contentProfileAdapter = gson.getAdapter(String.class);
            this.isDrmAdapter = gson.getAdapter(Boolean.class);
            this.sizeAdapter = gson.getAdapter(Long.class);
            this.downloadableIdAdapter = gson.getAdapter(String.class);
            this.newStreamIdAdapter = gson.getAdapter(String.class);
            this.moovAdapter = gson.getAdapter(AbstractC4559bgm.class);
            this.sidxAdapter = gson.getAdapter(AbstractC4559bgm.class);
            this.vmafAdapter = gson.getAdapter(Integer.class);
            this.resWAdapter = gson.getAdapter(Integer.class);
            this.peakBitrateAdapter = gson.getAdapter(Integer.class);
            this.resHAdapter = gson.getAdapter(Integer.class);
            this.framerateValueAdapter = gson.getAdapter(Integer.class);
            this.framerateScaleAdapter = gson.getAdapter(Integer.class);
            this.segmentVmafAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, SegmentVmaf.class));
            this.representationIdAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Stream stream) {
            if (stream == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("bitrate");
            this.bitrateAdapter.write(jsonWriter, Integer.valueOf(stream.bitrate()));
            jsonWriter.name("urls");
            this.urlsAdapter.write(jsonWriter, stream.urls());
            jsonWriter.name("content_profile");
            this.contentProfileAdapter.write(jsonWriter, stream.contentProfile());
            jsonWriter.name("isDrm");
            this.isDrmAdapter.write(jsonWriter, Boolean.valueOf(stream.isDrm()));
            jsonWriter.name("size");
            this.sizeAdapter.write(jsonWriter, Long.valueOf(stream.size()));
            jsonWriter.name("downloadable_id");
            this.downloadableIdAdapter.write(jsonWriter, stream.downloadableId());
            jsonWriter.name("new_stream_id");
            this.newStreamIdAdapter.write(jsonWriter, stream.newStreamId());
            jsonWriter.name("moov");
            this.moovAdapter.write(jsonWriter, stream.moov());
            jsonWriter.name("sidx");
            this.sidxAdapter.write(jsonWriter, stream.sidx());
            jsonWriter.name("vmaf");
            this.vmafAdapter.write(jsonWriter, Integer.valueOf(stream.vmaf()));
            jsonWriter.name("res_w");
            this.resWAdapter.write(jsonWriter, Integer.valueOf(stream.resW()));
            jsonWriter.name("peakBitrate");
            this.peakBitrateAdapter.write(jsonWriter, Integer.valueOf(stream.peakBitrate()));
            jsonWriter.name("res_h");
            this.resHAdapter.write(jsonWriter, Integer.valueOf(stream.resH()));
            jsonWriter.name("framerate_value");
            this.framerateValueAdapter.write(jsonWriter, Integer.valueOf(stream.framerateValue()));
            jsonWriter.name("framerate_scale");
            this.framerateScaleAdapter.write(jsonWriter, Integer.valueOf(stream.framerateScale()));
            jsonWriter.name("segmentVmaf");
            this.segmentVmafAdapter.write(jsonWriter, stream.segmentVmaf());
            jsonWriter.name("representationId");
            this.representationIdAdapter.write(jsonWriter, stream.representationId());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Stream read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultBitrate;
            List<Url> list = this.defaultUrls;
            String str = this.defaultContentProfile;
            boolean z = this.defaultIsDrm;
            long j = this.defaultSize;
            String str2 = this.defaultDownloadableId;
            String str3 = this.defaultNewStreamId;
            AbstractC4559bgm abstractC4559bgm = this.defaultMoov;
            AbstractC4559bgm abstractC4559bgm2 = this.defaultSidx;
            int i2 = this.defaultVmaf;
            int i3 = this.defaultResW;
            int i4 = this.defaultPeakBitrate;
            int i5 = this.defaultResH;
            int i6 = this.defaultFramerateValue;
            int i7 = this.defaultFramerateScale;
            List<SegmentVmaf> list2 = this.defaultSegmentVmaf;
            String str4 = this.defaultRepresentationId;
            List<Url> list3 = list;
            String str5 = str;
            boolean z2 = z;
            long j2 = j;
            String str6 = str2;
            String str7 = str3;
            AbstractC4559bgm abstractC4559bgm3 = abstractC4559bgm;
            AbstractC4559bgm abstractC4559bgm4 = abstractC4559bgm2;
            int i8 = i2;
            int i9 = i3;
            int i10 = i4;
            int i11 = i5;
            int i12 = i;
            int i13 = i6;
            int i14 = i7;
            List<SegmentVmaf> list4 = list2;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -952857873:
                            if (nextName.equals("segmentVmaf")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -649239864:
                            if (nextName.equals("representationId")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -102270099:
                            if (nextName.equals("bitrate")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3357449:
                            if (nextName.equals("moov")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530090:
                            if (nextName.equals("sidx")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3598564:
                            if (nextName.equals("urls")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3623196:
                            if (nextName.equals("vmaf")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100464661:
                            if (nextName.equals("isDrm")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108403849:
                            if (nextName.equals("res_h")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108403864:
                            if (nextName.equals("res_w")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 112843747:
                            if (nextName.equals("content_profile")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1344474715:
                            if (nextName.equals("new_stream_id")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1456674392:
                            if (nextName.equals("framerate_scale")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1459396223:
                            if (nextName.equals("framerate_value")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1827452056:
                            if (nextName.equals("downloadable_id")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2066987406:
                            if (nextName.equals("peakBitrate")) {
                                c = 16;
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
                            list4 = this.segmentVmafAdapter.read(jsonReader);
                            continue;
                        case 1:
                            str4 = this.representationIdAdapter.read(jsonReader);
                            continue;
                        case 2:
                            i12 = this.bitrateAdapter.read(jsonReader).intValue();
                            continue;
                        case 3:
                            abstractC4559bgm3 = this.moovAdapter.read(jsonReader);
                            continue;
                        case 4:
                            abstractC4559bgm4 = this.sidxAdapter.read(jsonReader);
                            continue;
                        case 5:
                            j2 = this.sizeAdapter.read(jsonReader).longValue();
                            continue;
                        case 6:
                            list3 = this.urlsAdapter.read(jsonReader);
                            continue;
                        case 7:
                            i8 = this.vmafAdapter.read(jsonReader).intValue();
                            continue;
                        case '\b':
                            z2 = this.isDrmAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\t':
                            i11 = this.resHAdapter.read(jsonReader).intValue();
                            continue;
                        case '\n':
                            i9 = this.resWAdapter.read(jsonReader).intValue();
                            continue;
                        case 11:
                            str5 = this.contentProfileAdapter.read(jsonReader);
                            continue;
                        case '\f':
                            str7 = this.newStreamIdAdapter.read(jsonReader);
                            continue;
                        case '\r':
                            i14 = this.framerateScaleAdapter.read(jsonReader).intValue();
                            continue;
                        case 14:
                            i13 = this.framerateValueAdapter.read(jsonReader).intValue();
                            continue;
                        case 15:
                            str6 = this.downloadableIdAdapter.read(jsonReader);
                            continue;
                        case 16:
                            i10 = this.peakBitrateAdapter.read(jsonReader).intValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Stream(i12, list3, str5, z2, j2, str6, str7, abstractC4559bgm3, abstractC4559bgm4, i8, i9, i10, i11, i13, i14, list4, str4);
        }
    }
}
