package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleableUtil;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class MediaItem implements Bundleable {
    public final ClippingConfiguration clippingConfiguration;
    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    @Deprecated
    public final LocalConfiguration playbackProperties;
    public final RequestMetadata requestMetadata;
    public static final MediaItem EMPTY = new Builder().build();
    private static final String FIELD_MEDIA_ID = Util.intToStringMaxRadix(0);
    private static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(1);
    private static final String FIELD_MEDIA_METADATA = Util.intToStringMaxRadix(2);
    private static final String FIELD_CLIPPING_PROPERTIES = Util.intToStringMaxRadix(3);
    private static final String FIELD_REQUEST_METADATA = Util.intToStringMaxRadix(4);
    private static final String FIELD_LOCAL_CONFIGURATION = Util.intToStringMaxRadix(5);
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            MediaItem fromBundle;
            fromBundle = MediaItem.fromBundle(bundle);
            return fromBundle;
        }
    };

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private AdsConfiguration adsConfiguration;
        private ClippingConfiguration.Builder clippingConfiguration;
        private String customCacheKey;
        private DrmConfiguration.Builder drmConfiguration;
        private long imageDurationMs;
        private LiveConfiguration.Builder liveConfiguration;
        private String mediaId;
        private MediaMetadata mediaMetadata;
        private String mimeType;
        private RequestMetadata requestMetadata;
        private List<StreamKey> streamKeys;
        private ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        private Object tag;
        private Uri uri;

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder() {
            this.clippingConfiguration = new ClippingConfiguration.Builder();
            this.drmConfiguration = new DrmConfiguration.Builder();
            this.streamKeys = Collections.emptyList();
            this.subtitleConfigurations = ImmutableList.of();
            this.liveConfiguration = new LiveConfiguration.Builder();
            this.requestMetadata = RequestMetadata.EMPTY;
            this.imageDurationMs = -9223372036854775807L;
        }

        private Builder(MediaItem mediaItem) {
            this();
            DrmConfiguration.Builder builder;
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                if (drmConfiguration != null) {
                    builder = drmConfiguration.buildUpon();
                } else {
                    builder = new DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
                this.imageDurationMs = localConfiguration.imageDurationMs;
            }
        }

        public Builder setMediaId(String str) {
            this.mediaId = (String) Assertions.checkNotNull(str);
            return this;
        }

        public Builder setUri(String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public Builder setDrmConfiguration(DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
            return this;
        }

        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.subtitleConfigurations = ImmutableList.copyOf((Collection) list);
            return this;
        }

        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        public MediaItem build() {
            Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            Uri uri = this.uri;
            LocalConfiguration localConfiguration = null;
            if (uri != null) {
                localConfiguration = new LocalConfiguration(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag, this.imageDurationMs);
            }
            LocalConfiguration localConfiguration2 = localConfiguration;
            String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            ClippingProperties buildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            LiveConfiguration build = this.liveConfiguration.build();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str2, buildClippingProperties, localConfiguration2, build, mediaMetadata, this.requestMetadata);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DrmConfiguration implements Bundleable {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        private final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;
        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;
        @Deprecated
        public final UUID uuid;
        private static final String FIELD_SCHEME = Util.intToStringMaxRadix(0);
        private static final String FIELD_LICENSE_URI = Util.intToStringMaxRadix(1);
        private static final String FIELD_LICENSE_REQUEST_HEADERS = Util.intToStringMaxRadix(2);
        private static final String FIELD_MULTI_SESSION = Util.intToStringMaxRadix(3);
        private static final String FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY = Util.intToStringMaxRadix(4);
        private static final String FIELD_FORCE_DEFAULT_LICENSE_URI = Util.intToStringMaxRadix(5);
        private static final String FIELD_FORCED_SESSION_TRACK_TYPES = Util.intToStringMaxRadix(6);
        private static final String FIELD_KEY_SET_ID = Util.intToStringMaxRadix(7);
        public static final Bundleable.Creator<DrmConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$DrmConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.DrmConfiguration fromBundle;
                fromBundle = MediaItem.DrmConfiguration.fromBundle(bundle);
                return fromBundle;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private ImmutableList<Integer> forcedSessionTrackTypes;
            private byte[] keySetId;
            private ImmutableMap<String, String> licenseRequestHeaders;
            private Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private UUID scheme;

            public Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
                return this;
            }

            public Builder setLicenseUri(Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            public Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            public Builder(UUID uuid) {
                this.scheme = uuid;
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }

            @Deprecated
            private Builder() {
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }

            private Builder(DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.licenseRequestHeaders = ImmutableMap.copyOf((Map) map);
                return this;
            }

            public Builder setForcedSessionTrackTypes(List<Integer> list) {
                this.forcedSessionTrackTypes = ImmutableList.copyOf((Collection) list);
                return this;
            }

            public Builder setKeySetId(byte[] bArr) {
                this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }
        }

        private DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrmConfiguration) {
                DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
                return this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.scheme.hashCode();
            Uri uri = this.licenseUri;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static DrmConfiguration fromBundle(Bundle bundle) {
            UUID fromString = UUID.fromString((String) Assertions.checkNotNull(bundle.getString(FIELD_SCHEME)));
            ImmutableMap<String, String> bundleToStringImmutableMap = BundleableUtil.bundleToStringImmutableMap(BundleableUtil.getBundleWithDefault(bundle, FIELD_LICENSE_REQUEST_HEADERS, Bundle.EMPTY));
            boolean z = bundle.getBoolean(FIELD_MULTI_SESSION, false);
            boolean z2 = bundle.getBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, false);
            boolean z3 = bundle.getBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, false);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) BundleableUtil.getIntegerArrayListWithDefault(bundle, FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList()));
            return new Builder(fromString).setLicenseUri((Uri) bundle.getParcelable(FIELD_LICENSE_URI)).setLicenseRequestHeaders(bundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(copyOf).setKeySetId(bundle.getByteArray(FIELD_KEY_SET_ID)).build();
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_SCHEME, this.scheme.toString());
            Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_LICENSE_URI, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(FIELD_LICENSE_REQUEST_HEADERS, BundleableUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z = this.multiSession;
            if (z) {
                bundle.putBoolean(FIELD_MULTI_SESSION, z);
            }
            boolean z2 = this.playClearContentWithoutKey;
            if (z2) {
                bundle.putBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, z2);
            }
            boolean z3 = this.forceDefaultLicenseUri;
            if (z3) {
                bundle.putBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, z3);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                bundle.putByteArray(FIELD_KEY_SET_ID, bArr);
            }
            return bundle;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AdsConfiguration implements Bundleable {
        public final Uri adTagUri;
        public final Object adsId;
        private static final String FIELD_AD_TAG_URI = Util.intToStringMaxRadix(0);
        public static final Bundleable.Creator<AdsConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$AdsConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.AdsConfiguration fromBundle;
                fromBundle = MediaItem.AdsConfiguration.fromBundle(bundle);
                return fromBundle;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Uri adTagUri;
            private Object adsId;

            public Builder(Uri uri) {
                this.adTagUri = uri;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }
        }

        private AdsConfiguration(Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdsConfiguration) {
                AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
                return this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.adTagUri.hashCode();
            Object obj = this.adsId;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AdsConfiguration fromBundle(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(FIELD_AD_TAG_URI);
            Assertions.checkNotNull(uri);
            return new Builder(uri).build();
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_AD_TAG_URI, this.adTagUri);
            return bundle;
        }
    }

    /* loaded from: classes2.dex */
    public static final class LocalConfiguration implements Bundleable {
        public final AdsConfiguration adsConfiguration;
        public final String customCacheKey;
        public final DrmConfiguration drmConfiguration;
        public final long imageDurationMs;
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @Deprecated
        public final List<Subtitle> subtitles;
        public final Object tag;
        public final Uri uri;
        private static final String FIELD_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        private static final String FIELD_DRM_CONFIGURATION = Util.intToStringMaxRadix(2);
        private static final String FIELD_ADS_CONFIGURATION = Util.intToStringMaxRadix(3);
        private static final String FIELD_STREAM_KEYS = Util.intToStringMaxRadix(4);
        private static final String FIELD_CUSTOM_CACHE_KEY = Util.intToStringMaxRadix(5);
        private static final String FIELD_SUBTITLE_CONFIGURATION = Util.intToStringMaxRadix(6);
        private static final String FIELD_IMAGE_DURATION_MS = Util.intToStringMaxRadix(7);
        public static final Bundleable.Creator<LocalConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.LocalConfiguration fromBundle;
                fromBundle = MediaItem.LocalConfiguration.fromBundle(bundle);
                return fromBundle;
            }
        };

        private LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, ImmutableList<SubtitleConfiguration> immutableList, Object obj, long j) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((ImmutableList.Builder) immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
            this.imageDurationMs = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LocalConfiguration) {
                LocalConfiguration localConfiguration = (LocalConfiguration) obj;
                return this.uri.equals(localConfiguration.uri) && Util.areEqual(this.mimeType, localConfiguration.mimeType) && Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && Util.areEqual(this.tag, localConfiguration.tag) && Util.areEqual(Long.valueOf(this.imageDurationMs), Long.valueOf(localConfiguration.imageDurationMs));
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode();
            String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int hashCode3 = drmConfiguration == null ? 0 : drmConfiguration.hashCode();
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int hashCode4 = adsConfiguration == null ? 0 : adsConfiguration.hashCode();
            int hashCode5 = this.streamKeys.hashCode();
            String str2 = this.customCacheKey;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            int hashCode7 = this.subtitleConfigurations.hashCode();
            Object obj = this.tag;
            return (int) ((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.imageDurationMs);
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(FIELD_DRM_CONFIGURATION, drmConfiguration.toBundle());
            }
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(FIELD_ADS_CONFIGURATION, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_STREAM_KEYS, BundleableUtil.toBundleArrayList(this.streamKeys));
            }
            String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(FIELD_CUSTOM_CACHE_KEY, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION, BundleableUtil.toBundleArrayList(this.subtitleConfigurations));
            }
            long j = this.imageDurationMs;
            if (j != -9223372036854775807L) {
                bundle.putLong(FIELD_IMAGE_DURATION_MS, j);
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LocalConfiguration fromBundle(Bundle bundle) {
            ImmutableList fromBundleList;
            ImmutableList fromBundleList2;
            Bundle bundle2 = bundle.getBundle(FIELD_DRM_CONFIGURATION);
            DrmConfiguration fromBundle = bundle2 == null ? null : DrmConfiguration.CREATOR.fromBundle(bundle2);
            Bundle bundle3 = bundle.getBundle(FIELD_ADS_CONFIGURATION);
            AdsConfiguration fromBundle2 = bundle3 != null ? AdsConfiguration.CREATOR.fromBundle(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_STREAM_KEYS);
            if (parcelableArrayList == null) {
                fromBundleList = ImmutableList.of();
            } else {
                fromBundleList = BundleableUtil.fromBundleList(new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda1
                    @Override // androidx.media3.common.Bundleable.Creator
                    public final Bundleable fromBundle(Bundle bundle4) {
                        return StreamKey.fromBundle(bundle4);
                    }
                }, parcelableArrayList);
            }
            ImmutableList immutableList = fromBundleList;
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION);
            if (parcelableArrayList2 == null) {
                fromBundleList2 = ImmutableList.of();
            } else {
                fromBundleList2 = BundleableUtil.fromBundleList(SubtitleConfiguration.CREATOR, parcelableArrayList2);
            }
            return new LocalConfiguration((Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI)), bundle.getString(FIELD_MIME_TYPE), fromBundle, fromBundle2, immutableList, bundle.getString(FIELD_CUSTOM_CACHE_KEY), fromBundleList2, null, bundle.getLong(FIELD_IMAGE_DURATION_MS, -9223372036854775807L));
        }
    }

    /* loaded from: classes2.dex */
    public static final class LiveConfiguration implements Bundleable {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();
        private static final String FIELD_TARGET_OFFSET_MS = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIN_OFFSET_MS = Util.intToStringMaxRadix(1);
        private static final String FIELD_MAX_OFFSET_MS = Util.intToStringMaxRadix(2);
        private static final String FIELD_MIN_PLAYBACK_SPEED = Util.intToStringMaxRadix(3);
        private static final String FIELD_MAX_PLAYBACK_SPEED = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$LiveConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.LiveConfiguration lambda$static$0;
                lambda$static$0 = MediaItem.LiveConfiguration.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            public Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            public Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            public Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            public Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            public Builder() {
                this.targetOffsetMs = -9223372036854775807L;
                this.minOffsetMs = -9223372036854775807L;
                this.maxOffsetMs = -9223372036854775807L;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }
        }

        private LiveConfiguration(Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LiveConfiguration) {
                LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
                return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
            }
            return false;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.minOffsetMs;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.maxOffsetMs;
            int i3 = (int) ((j3 >>> 32) ^ j3);
            float f = this.minPlaybackSpeed;
            int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
            float f2 = this.maxPlaybackSpeed;
            return (((((((i * 31) + i2) * 31) + i3) * 31) + floatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.targetOffsetMs;
            LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(FIELD_TARGET_OFFSET_MS, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(FIELD_MIN_OFFSET_MS, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(FIELD_MAX_OFFSET_MS, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(FIELD_MIN_PLAYBACK_SPEED, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(FIELD_MAX_PLAYBACK_SPEED, f2);
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LiveConfiguration lambda$static$0(Bundle bundle) {
            String str = FIELD_TARGET_OFFSET_MS;
            LiveConfiguration liveConfiguration = UNSET;
            return new LiveConfiguration(bundle.getLong(str, liveConfiguration.targetOffsetMs), bundle.getLong(FIELD_MIN_OFFSET_MS, liveConfiguration.minOffsetMs), bundle.getLong(FIELD_MAX_OFFSET_MS, liveConfiguration.maxOffsetMs), bundle.getFloat(FIELD_MIN_PLAYBACK_SPEED, liveConfiguration.minPlaybackSpeed), bundle.getFloat(FIELD_MAX_PLAYBACK_SPEED, liveConfiguration.maxPlaybackSpeed));
        }
    }

    /* loaded from: classes2.dex */
    public static class SubtitleConfiguration implements Bundleable {
        public final String id;
        public final String label;
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;
        private static final String FIELD_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        private static final String FIELD_LANGUAGE = Util.intToStringMaxRadix(2);
        private static final String FIELD_SELECTION_FLAGS = Util.intToStringMaxRadix(3);
        private static final String FIELD_ROLE_FLAGS = Util.intToStringMaxRadix(4);
        private static final String FIELD_LABEL = Util.intToStringMaxRadix(5);
        private static final String FIELD_ID = Util.intToStringMaxRadix(6);
        public static final Bundleable.Creator<SubtitleConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$SubtitleConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.SubtitleConfiguration fromBundle;
                fromBundle = MediaItem.SubtitleConfiguration.fromBundle(bundle);
                return fromBundle;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String id;
            private String label;
            private String language;
            private String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private Uri uri;

            public Builder setId(String str) {
                this.id = str;
                return this;
            }

            public Builder setLabel(String str) {
                this.label = str;
                return this;
            }

            public Builder setLanguage(String str) {
                this.language = str;
                return this;
            }

            public Builder setMimeType(String str) {
                this.mimeType = str;
                return this;
            }

            public Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            public Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            public Builder(Uri uri) {
                this.uri = uri;
            }

            private Builder(SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.id = subtitleConfiguration.id;
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Subtitle buildSubtitle() {
                return new Subtitle(this);
            }
        }

        private SubtitleConfiguration(Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.id = builder.id;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubtitleConfiguration) {
                SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
                return this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.id, subtitleConfiguration.id);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode();
            String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.language;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int i = this.selectionFlags;
            int i2 = this.roleFlags;
            String str3 = this.label;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.id;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + i2) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SubtitleConfiguration fromBundle(Bundle bundle) {
            String string = bundle.getString(FIELD_MIME_TYPE);
            String string2 = bundle.getString(FIELD_LANGUAGE);
            int i = bundle.getInt(FIELD_SELECTION_FLAGS, 0);
            int i2 = bundle.getInt(FIELD_ROLE_FLAGS, 0);
            String string3 = bundle.getString(FIELD_LABEL);
            return new Builder((Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI))).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(FIELD_ID)).build();
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            String str2 = this.language;
            if (str2 != null) {
                bundle.putString(FIELD_LANGUAGE, str2);
            }
            int i = this.selectionFlags;
            if (i != 0) {
                bundle.putInt(FIELD_SELECTION_FLAGS, i);
            }
            int i2 = this.roleFlags;
            if (i2 != 0) {
                bundle.putInt(FIELD_ROLE_FLAGS, i2);
            }
            String str3 = this.label;
            if (str3 != null) {
                bundle.putString(FIELD_LABEL, str3);
            }
            String str4 = this.id;
            if (str4 != null) {
                bundle.putString(FIELD_ID, str4);
            }
            return bundle;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Subtitle extends SubtitleConfiguration {
        private Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static class ClippingConfiguration implements Bundleable {
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();
        private static final String FIELD_START_POSITION_MS = Util.intToStringMaxRadix(0);
        private static final String FIELD_END_POSITION_MS = Util.intToStringMaxRadix(1);
        private static final String FIELD_RELATIVE_TO_LIVE_WINDOW = Util.intToStringMaxRadix(2);
        private static final String FIELD_RELATIVE_TO_DEFAULT_POSITION = Util.intToStringMaxRadix(3);
        private static final String FIELD_STARTS_AT_KEY_FRAME = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$ClippingConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.ClippingProperties lambda$static$0;
                lambda$static$0 = MediaItem.ClippingConfiguration.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        public int hashCode() {
            long j = this.startPositionMs;
            long j2 = this.endPositionMs;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        /* loaded from: classes2.dex */
        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            public Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            public Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
                return this;
            }

            public Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }

            public Builder() {
                this.endPositionMs = Long.MIN_VALUE;
            }

            private Builder(ClippingConfiguration clippingConfiguration) {
                this.startPositionMs = clippingConfiguration.startPositionMs;
                this.endPositionMs = clippingConfiguration.endPositionMs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            public Builder setStartPositionMs(long j) {
                Assertions.checkArgument(j >= 0);
                this.startPositionMs = j;
                return this;
            }

            public Builder setEndPositionMs(long j) {
                Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.endPositionMs = j;
                return this;
            }

            public ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @Deprecated
            public ClippingProperties buildClippingProperties() {
                return new ClippingProperties(this);
            }
        }

        private ClippingConfiguration(Builder builder) {
            this.startPositionMs = builder.startPositionMs;
            this.endPositionMs = builder.endPositionMs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ClippingConfiguration) {
                ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
                return this.startPositionMs == clippingConfiguration.startPositionMs && this.endPositionMs == clippingConfiguration.endPositionMs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
            }
            return false;
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.startPositionMs;
            ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(FIELD_START_POSITION_MS, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(FIELD_END_POSITION_MS, j2);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(FIELD_STARTS_AT_KEY_FRAME, z3);
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ClippingProperties lambda$static$0(Bundle bundle) {
            Builder builder = new Builder();
            String str = FIELD_START_POSITION_MS;
            ClippingConfiguration clippingConfiguration = UNSET;
            return builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(FIELD_END_POSITION_MS, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(FIELD_STARTS_AT_KEY_FRAME, clippingConfiguration.startsAtKeyFrame)).buildClippingProperties();
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RequestMetadata implements Bundleable {
        public final Bundle extras;
        public final Uri mediaUri;
        public final String searchQuery;
        public static final RequestMetadata EMPTY = new Builder().build();
        private static final String FIELD_MEDIA_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_SEARCH_QUERY = Util.intToStringMaxRadix(1);
        private static final String FIELD_EXTRAS = Util.intToStringMaxRadix(2);
        public static final Bundleable.Creator<RequestMetadata> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$RequestMetadata$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.RequestMetadata lambda$static$0;
                lambda$static$0 = MediaItem.RequestMetadata.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Bundle extras;
            private Uri mediaUri;
            private String searchQuery;

            public Builder setExtras(Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public Builder setMediaUri(Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            public Builder setSearchQuery(String str) {
                this.searchQuery = str;
                return this;
            }

            public RequestMetadata build() {
                return new RequestMetadata(this);
            }
        }

        private RequestMetadata(Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestMetadata) {
                RequestMetadata requestMetadata = (RequestMetadata) obj;
                return Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && Util.areEqual(this.searchQuery, requestMetadata.searchQuery);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.mediaUri;
            int hashCode = uri == null ? 0 : uri.hashCode();
            String str = this.searchQuery;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_MEDIA_URI, uri);
            }
            String str = this.searchQuery;
            if (str != null) {
                bundle.putString(FIELD_SEARCH_QUERY, str);
            }
            Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(FIELD_EXTRAS, bundle2);
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RequestMetadata lambda$static$0(Bundle bundle) {
            return new Builder().setMediaUri((Uri) bundle.getParcelable(FIELD_MEDIA_URI)).setSearchQuery(bundle.getString(FIELD_SEARCH_QUERY)).setExtras(bundle.getBundle(FIELD_EXTRAS)).build();
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaItem) {
            MediaItem mediaItem = (MediaItem) obj;
            return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && Util.areEqual(this.requestMetadata, mediaItem.requestMetadata);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode();
        LocalConfiguration localConfiguration = this.localConfiguration;
        int hashCode2 = localConfiguration != null ? localConfiguration.hashCode() : 0;
        int hashCode3 = this.liveConfiguration.hashCode();
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    private Bundle toBundle(boolean z) {
        LocalConfiguration localConfiguration;
        Bundle bundle = new Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(FIELD_MEDIA_ID, this.mediaId);
        }
        if (!this.liveConfiguration.equals(LiveConfiguration.UNSET)) {
            bundle.putBundle(FIELD_LIVE_CONFIGURATION, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(ClippingConfiguration.UNSET)) {
            bundle.putBundle(FIELD_CLIPPING_PROPERTIES, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(RequestMetadata.EMPTY)) {
            bundle.putBundle(FIELD_REQUEST_METADATA, this.requestMetadata.toBundle());
        }
        if (z && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(FIELD_LOCAL_CONFIGURATION, localConfiguration.toBundle());
        }
        return bundle;
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        return toBundle(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaItem fromBundle(Bundle bundle) {
        LiveConfiguration fromBundle;
        MediaMetadata fromBundle2;
        ClippingProperties fromBundle3;
        RequestMetadata fromBundle4;
        String str = (String) Assertions.checkNotNull(bundle.getString(FIELD_MEDIA_ID, ""));
        Bundle bundle2 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
        if (bundle2 == null) {
            fromBundle = LiveConfiguration.UNSET;
        } else {
            fromBundle = LiveConfiguration.CREATOR.fromBundle(bundle2);
        }
        LiveConfiguration liveConfiguration = fromBundle;
        Bundle bundle3 = bundle.getBundle(FIELD_MEDIA_METADATA);
        if (bundle3 == null) {
            fromBundle2 = MediaMetadata.EMPTY;
        } else {
            fromBundle2 = MediaMetadata.CREATOR.fromBundle(bundle3);
        }
        MediaMetadata mediaMetadata = fromBundle2;
        Bundle bundle4 = bundle.getBundle(FIELD_CLIPPING_PROPERTIES);
        if (bundle4 == null) {
            fromBundle3 = ClippingProperties.UNSET;
        } else {
            fromBundle3 = ClippingConfiguration.CREATOR.fromBundle(bundle4);
        }
        ClippingProperties clippingProperties = fromBundle3;
        Bundle bundle5 = bundle.getBundle(FIELD_REQUEST_METADATA);
        if (bundle5 == null) {
            fromBundle4 = RequestMetadata.EMPTY;
        } else {
            fromBundle4 = RequestMetadata.CREATOR.fromBundle(bundle5);
        }
        RequestMetadata requestMetadata = fromBundle4;
        Bundle bundle6 = bundle.getBundle(FIELD_LOCAL_CONFIGURATION);
        return new MediaItem(str, clippingProperties, bundle6 == null ? null : LocalConfiguration.CREATOR.fromBundle(bundle6), liveConfiguration, mediaMetadata, requestMetadata);
    }
}
