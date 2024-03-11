package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private AdViewProvider adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ MediaSource.Factory access$000(Class cls) {
        return newInstance(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ MediaSource.Factory access$100(Class cls, DataSource.Factory factory) {
        return newInstance(cls, factory);
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        this.delegateFactoryLoader.setCmcdConfigurationFactory((CmcdConfiguration.Factory) Assertions.checkNotNull(factory));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != -9223372036854775807L) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(inferContentTypeForUriAndMimeType);
        Assertions.checkStateNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + inferContentTypeForUriAndMimeType);
        MediaItem.LiveConfiguration.Builder buildUpon = mediaItem.liveConfiguration.buildUpon();
        if (mediaItem.liveConfiguration.targetOffsetMs == -9223372036854775807L) {
            buildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
        }
        if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
            buildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
        }
        if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
            buildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
        }
        if (mediaItem.liveConfiguration.minOffsetMs == -9223372036854775807L) {
            buildUpon.setMinOffsetMs(this.liveMinOffsetMs);
        }
        if (mediaItem.liveConfiguration.maxOffsetMs == -9223372036854775807L) {
            buildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
        }
        MediaItem.LiveConfiguration build = buildUpon.build();
        if (!build.equals(mediaItem.liveConfiguration)) {
            mediaItem = mediaItem.buildUpon().setLiveConfiguration(build).build();
        }
        MediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
        ImmutableList<MediaItem.SubtitleConfiguration> immutableList = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
        if (!immutableList.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
            mediaSourceArr[0] = createMediaSource;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.useProgressiveMediaSourceForSubtitles) {
                    final Format build2 = new Format.Builder().setSampleMimeType(immutableList.get(i).mimeType).setLanguage(immutableList.get(i).language).setSelectionFlags(immutableList.get(i).selectionFlags).setRoleFlags(immutableList.get(i).roleFlags).setLabel(immutableList.get(i).label).setId(immutableList.get(i).id).build();
                    final DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
                    ProgressiveMediaSource.Factory factory = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$$ExternalSyntheticLambda0
                        @Override // androidx.media3.extractor.ExtractorsFactory
                        public final Extractor[] createExtractors() {
                            Extractor[] lambda$createMediaSource$0;
                            lambda$createMediaSource$0 = DefaultMediaSourceFactory.lambda$createMediaSource$0(DefaultSubtitleParserFactory.this, build2);
                            return lambda$createMediaSource$0;
                        }
                    });
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy != null) {
                        factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                    }
                    mediaSourceArr[i + 1] = factory.createMediaSource(MediaItem.fromUri(immutableList.get(i).uri.toString()));
                } else {
                    SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy2 != null) {
                        factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                    }
                    mediaSourceArr[i + 1] = factory2.createMediaSource(immutableList.get(i), -9223372036854775807L);
                }
            }
            createMediaSource = new MergingMediaSource(mediaSourceArr);
        }
        return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, createMediaSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$createMediaSource$0(DefaultSubtitleParserFactory defaultSubtitleParserFactory, Format format) {
        Extractor unknownSubtitlesExtractor;
        Extractor[] extractorArr = new Extractor[1];
        if (defaultSubtitleParserFactory.supportsFormat(format)) {
            unknownSubtitlesExtractor = new SubtitleExtractor(defaultSubtitleParserFactory.create(format), format);
        } else {
            unknownSubtitlesExtractor = new UnknownSubtitlesExtractor(format);
        }
        extractorArr[0] = unknownSubtitlesExtractor;
        return extractorArr;
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        if (clippingConfiguration.startPositionMs == 0 && clippingConfiguration.endPositionMs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) {
            return mediaSource;
        }
        long msToUs = Util.msToUs(mediaItem.clippingConfiguration.startPositionMs);
        long msToUs2 = Util.msToUs(mediaItem.clippingConfiguration.endPositionMs);
        MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem.clippingConfiguration;
        return new ClippingMediaSource(mediaSource, msToUs, msToUs2, !clippingConfiguration2.startsAtKeyFrame, clippingConfiguration2.relativeToLiveWindow, clippingConfiguration2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object obj = adsConfiguration.adsId;
        return new AdsMediaSource(mediaSource, dataSpec, obj != null ? obj : ImmutableList.of((Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri), this, adsLoader, adViewProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DelegateFactoryLoader {
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private DataSource.Factory dataSourceFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final Map<Integer, Supplier<MediaSource.Factory>> mediaSourceFactorySuppliers = new HashMap();
        private final Set<Integer> supportedTypes = new HashSet();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory) {
            this.extractorsFactory = extractorsFactory;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return Ints.toArray(this.supportedTypes);
        }

        public MediaSource.Factory getMediaSourceFactory(int i) {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i));
            if (factory != null) {
                return factory;
            }
            Supplier<MediaSource.Factory> maybeLoadSupplier = maybeLoadSupplier(i);
            if (maybeLoadSupplier == null) {
                return null;
            }
            MediaSource.Factory factory2 = maybeLoadSupplier.get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            this.mediaSourceFactories.put(Integer.valueOf(i), factory2);
            return factory2;
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            for (MediaSource.Factory factory2 : this.mediaSourceFactories.values()) {
                factory2.setCmcdConfigurationFactory(factory);
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            for (MediaSource.Factory factory : this.mediaSourceFactories.values()) {
                factory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            for (MediaSource.Factory factory : this.mediaSourceFactories.values()) {
                factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setJpegExtractorFlags(int i) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i);
            }
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> maybeLoadSupplier(int r4) {
            /*
                r3 = this;
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource$Factory>> r0 = r3.mediaSourceFactorySuppliers
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource$Factory>> r0 = r3.mediaSourceFactorySuppliers
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r4 = r0.get(r4)
                com.google.common.base.Supplier r4 = (com.google.common.base.Supplier) r4
                return r4
            L19:
                androidx.media3.datasource.DataSource$Factory r0 = r3.dataSourceFactory
                java.lang.Object r0 = androidx.media3.common.util.Assertions.checkNotNull(r0)
                androidx.media3.datasource.DataSource$Factory r0 = (androidx.media3.datasource.DataSource.Factory) r0
                if (r4 == 0) goto L6c
                r1 = 1
                if (r4 == r1) goto L5a
                r1 = 2
                if (r4 == r1) goto L48
                r1 = 3
                if (r4 == r1) goto L36
                r1 = 4
                if (r4 == r1) goto L30
                goto L7f
            L30:
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda4 r1 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda4     // Catch: java.lang.ClassNotFoundException -> L7f
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L7f
                goto L80
            L36:
                java.lang.String r0 = "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
                java.lang.Class<androidx.media3.exoplayer.source.MediaSource$Factory> r1 = androidx.media3.exoplayer.source.MediaSource.Factory.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7f
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda3 r1 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda3     // Catch: java.lang.ClassNotFoundException -> L7f
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L7f
                goto L80
            L48:
                java.lang.String r1 = "androidx.media3.exoplayer.hls.HlsMediaSource$Factory"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L7f
                java.lang.Class<androidx.media3.exoplayer.source.MediaSource$Factory> r2 = androidx.media3.exoplayer.source.MediaSource.Factory.class
                java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7f
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda2 r2 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda2     // Catch: java.lang.ClassNotFoundException -> L7f
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L7f
                goto L7d
            L5a:
                java.lang.String r1 = "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L7f
                java.lang.Class<androidx.media3.exoplayer.source.MediaSource$Factory> r2 = androidx.media3.exoplayer.source.MediaSource.Factory.class
                java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7f
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1 r2 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1     // Catch: java.lang.ClassNotFoundException -> L7f
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L7f
                goto L7d
            L6c:
                java.lang.String r1 = "androidx.media3.exoplayer.dash.DashMediaSource$Factory"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L7f
                java.lang.Class<androidx.media3.exoplayer.source.MediaSource$Factory> r2 = androidx.media3.exoplayer.source.MediaSource.Factory.class
                java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7f
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0 r2 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0     // Catch: java.lang.ClassNotFoundException -> L7f
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L7f
            L7d:
                r1 = r2
                goto L80
            L7f:
                r1 = 0
            L80:
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource$Factory>> r0 = r3.mediaSourceFactorySuppliers
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.put(r2, r1)
                if (r1 == 0) goto L94
                java.util.Set<java.lang.Integer> r0 = r3.supportedTypes
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.add(r4)
            L94:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader.maybeLoadSupplier(int):com.google.common.base.Supplier");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$4(DataSource.Factory factory) {
            return new ProgressiveMediaSource.Factory(factory, this.extractorsFactory);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j, long j2) {
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput track = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.endTracks();
            track.format(this.format.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
