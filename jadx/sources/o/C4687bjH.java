package o;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bjH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4687bjH implements DashChunkSource {
    private final InterfaceC4734bkH a;
    private final int[] b;
    private final AseConfig c;
    private final Handler d;
    protected final a[] e;
    private final C4617bhr f;
    private IOException g;
    private final C4628biB h;
    private final long i;
    private final DataSource j;
    private C4726bju k;
    private final C4691bjL l;
    private final boolean m;
    private final InterfaceC4683bjD n;

    /* renamed from: o  reason: collision with root package name */
    private final C4585bhL f13607o;
    private final LoaderErrorThrower p;
    private int q;
    private boolean r;
    private final long s;
    private final int t;
    private ExoTrackSelection u;
    private final InterfaceC4657bie v;
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler x;
    private final int y;

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.u = exoTrackSelection;
    }

    /* renamed from: o.bjH$b */
    /* loaded from: classes3.dex */
    public static final class b implements DashChunkSource.Factory {
        private final C4753bkr a;
        private final C4617bhr b;
        private final Handler c = new Handler();
        private final DataSource.Factory d;
        private final C4628biB e;
        private final InterfaceC4734bkH f;
        private final InterfaceC4683bjD g;
        private final C4691bjL h;
        private final C4585bhL i;
        private final InterfaceC4657bie j;
        private final C4617bhr l;

        /* renamed from: o  reason: collision with root package name */
        private final C4617bhr f13608o;

        private C4617bhr a(int i) {
            if (i == 1) {
                return this.b;
            }
            if (i == 2) {
                return this.f13608o;
            }
            if (i == 3) {
                return this.l;
            }
            return null;
        }

        public b(DataSource.Factory factory, C4753bkr c4753bkr, InterfaceC4734bkH interfaceC4734bkH, C4628biB c4628biB, InterfaceC4683bjD interfaceC4683bjD, C4617bhr c4617bhr, C4617bhr c4617bhr2, C4617bhr c4617bhr3, InterfaceC4657bie interfaceC4657bie, C4585bhL c4585bhL, C4691bjL c4691bjL) {
            this.d = factory;
            this.j = interfaceC4657bie;
            this.a = c4753bkr;
            this.f = interfaceC4734bkH;
            this.e = c4628biB;
            this.g = interfaceC4683bjD;
            this.b = c4617bhr;
            this.f13608o = c4617bhr2;
            this.l = c4617bhr3;
            this.i = c4585bhL;
            this.h = c4691bjL;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, TransferListener transferListener, PlayerId playerId, CmcdConfiguration cmcdConfiguration) {
            DataSource createDataSource = this.d.createDataSource();
            if (transferListener != null) {
                createDataSource.addTransferListener(transferListener);
            }
            return new C4687bjH(loaderErrorThrower, (C4726bju) dashManifest, i, iArr, exoTrackSelection, i2, createDataSource, j, 1, z, list, playerTrackEmsgHandler, this.a.d(), this.f, this.e, a(i2), this.c, this.g, this.j, this.i, this.h);
        }
    }

    public C4687bjH(LoaderErrorThrower loaderErrorThrower, C4726bju c4726bju, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, AseConfig aseConfig, InterfaceC4734bkH interfaceC4734bkH, C4628biB c4628biB, C4617bhr c4617bhr, Handler handler, InterfaceC4683bjD interfaceC4683bjD, InterfaceC4657bie interfaceC4657bie, C4585bhL c4585bhL, C4691bjL c4691bjL) {
        this.p = loaderErrorThrower;
        this.k = c4726bju;
        this.b = iArr;
        this.u = exoTrackSelection;
        this.y = i2;
        this.j = dataSource;
        this.q = i;
        this.i = j;
        this.t = i3;
        this.x = playerTrackEmsgHandler;
        long periodDurationUs = c4726bju.getPeriodDurationUs(i);
        ArrayList<Representation> c2 = c();
        this.e = new a[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.e.length) {
            int i5 = i4;
            this.e[i5] = new a(periodDurationUs, i2, c2.get(exoTrackSelection.getIndexInTrackGroup(i4)), z, list, playerTrackEmsgHandler, c4726bju.dynamic || c4726bju.availabilityStartTimeMs != -9223372036854775807L);
            i4 = i5 + 1;
            c2 = c2;
        }
        this.c = aseConfig;
        this.a = interfaceC4734bkH;
        this.h = c4628biB;
        this.f = c4617bhr;
        this.v = interfaceC4657bie;
        this.d = handler;
        this.n = interfaceC4683bjD;
        this.f13607o = c4585bhL;
        this.l = c4691bjL;
        this.m = c4726bju.l();
        this.s = (c4726bju.k() == null ? c4726bju.j() : c4726bju.k()).longValue();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        a[] aVarArr;
        for (a aVar : this.e) {
            if (aVar.c != null) {
                long a2 = aVar.a(j);
                long e = aVar.e(a2);
                long c2 = aVar.c();
                long resolveSeekPositionUs = seekParameters.resolveSeekPositionUs(j, e, (e >= j || (c2 != -1 && a2 >= (aVar.a() + c2) - 1)) ? e : aVar.e(a2 + 1));
                this.l.d(resolveSeekPositionUs);
                return resolveSeekPositionUs;
            }
        }
        if (j <= 0 || this.y != 2 || (seekParameters.toleranceAfterUs <= 0 && seekParameters.toleranceBeforeUs <= 0)) {
            return j;
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            C4726bju c4726bju = (C4726bju) dashManifest;
            this.k = c4726bju;
            this.q = i;
            long periodDurationUs = c4726bju.getPeriodDurationUs(i);
            ArrayList<Representation> c2 = c();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.e.length; i2++) {
                Representation representation = c2.get(this.u.getIndexInTrackGroup(i2));
                if (representation instanceof C4684bjE) {
                    a[] aVarArr = this.e;
                    aVarArr[i2] = aVarArr[i2].a(periodDurationUs, (C4684bjE) representation);
                } else {
                    a[] aVarArr2 = this.e;
                    aVarArr2[i2] = aVarArr2[i2].a(periodDurationUs, representation);
                }
                arrayList.add(representation.format);
            }
            ExoTrackSelection exoTrackSelection = this.u;
            if (((Class) C4755bkv.b((char) 41982, 5, 817)).isInstance(exoTrackSelection)) {
                Object[] objArr = {arrayList};
                Object obj = C4755bkv.q.get(-1136003838);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 41982, 5, 817)).getMethod("e", List.class);
                    C4755bkv.q.put(-1136003838, obj);
                }
                ((Method) obj).invoke(exoTrackSelection, objArr);
            }
        } catch (BehindLiveWindowException e) {
            this.g = e;
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() {
        IOException iOException = this.g;
        if (iOException != null) {
            throw iOException;
        }
        this.p.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.g != null || this.u.length() < 2) {
            return list.size();
        }
        return this.u.evaluateQueueSize(j, list);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.g != null) {
            return false;
        }
        return this.u.shouldCancelChunkLoad(j, chunk, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getNextChunk(androidx.media3.exoplayer.LoadingInfo r37, long r38, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> r40, androidx.media3.exoplayer.source.chunk.ChunkHolder r41) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4687bjH.getNextChunk(androidx.media3.exoplayer.LoadingInfo, long, java.util.List, androidx.media3.exoplayer.source.chunk.ChunkHolder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.n.d(this.k);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int indexOf = this.u.indexOf(((InitializationChunk) chunk).trackFormat);
            a aVar = this.e[indexOf];
            if (aVar.c == null && (chunkIndex = aVar.a.getChunkIndex()) != null) {
                this.e[indexOf] = aVar.c(new DashWrappingSegmentIndex(chunkIndex, aVar.b.presentationTimeOffsetUs));
            }
        }
        if (this.k.dynamic && (chunk instanceof MediaChunk) && this.c.ar().z()) {
            long b2 = C4761blb.b(chunk.getResponseHeaders());
            long b3 = NetflixDataSourceUtil.b(chunk.dataSpec);
            if (b2 != -9223372036854775807L && b3 != -9223372036854775807L && b2 < b3) {
                this.f13607o.d(chunk.type, b3 - b2);
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.x;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (z) {
            PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.x;
            if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.onChunkLoadError(chunk)) {
                if (!this.k.dynamic && (chunk instanceof MediaChunk)) {
                    IOException iOException = loadErrorInfo.exception;
                    if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                        a aVar = this.e[this.u.indexOf(chunk.trackFormat)];
                        long c2 = aVar.c();
                        if (c2 != -1 && c2 != 0) {
                            if (((MediaChunk) chunk).getNextChunkIndex() > (aVar.a() + c2) - 1) {
                                this.r = true;
                                return true;
                            }
                        }
                    }
                }
                if (this.k.dynamic && (chunk instanceof MediaChunk)) {
                    IOException iOException2 = loadErrorInfo.exception;
                    if ((iOException2 instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException2).responseCode == 404 && this.c.ar().D()) {
                        long b2 = C4761blb.b(loadErrorInfo.loadEventInfo.responseHeaders);
                        long nowUnixTimeMs = Util.getNowUnixTimeMs(this.i);
                        if (b2 != -9223372036854775807L && b2 < nowUnixTimeMs) {
                            this.f13607o.d(chunk.type, nowUnixTimeMs - b2);
                        }
                    }
                }
                LoadErrorHandlingPolicy.FallbackOptions b3 = b(this.u, this.e[this.u.indexOf(chunk.trackFormat)].b.baseUrls);
                if ((b3.isFallbackAvailable(2) || b3.isFallbackAvailable(1)) && (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(b3, loadErrorInfo)) != null && b3.isFallbackAvailable(fallbackSelectionFor.type) && fallbackSelectionFor.type == 2) {
                    ExoTrackSelection exoTrackSelection = this.u;
                    return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (a aVar : this.e) {
            ChunkExtractor chunkExtractor = aVar.a;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions b(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, elapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount, length, i);
    }

    private long c(a aVar, MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return Util.constrainValue(aVar.a(j), j2, j3);
    }

    private ArrayList<Representation> c() {
        List<AdaptationSet> list = this.k.getPeriod(this.q).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.b) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long d(long j, long j2) {
        if (this.k.dynamic) {
            return Math.max(0L, Math.min(a(j), this.e[0].d(this.e[0].b(j))) - j2);
        }
        return -9223372036854775807L;
    }

    private long a(long j) {
        C4726bju c4726bju = this.k;
        long j2 = c4726bju.availabilityStartTimeMs;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - androidx.media3.common.C.msToUs(j2 + c4726bju.getPeriod(this.q).startMs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.source.chunk.Chunk b(o.C4687bjH.a r20, androidx.media3.datasource.DataSource r21, androidx.media3.common.Format r22, int r23, java.lang.Object r24, androidx.media3.exoplayer.dash.manifest.RangedUri r25, androidx.media3.exoplayer.dash.manifest.RangedUri r26) {
        /*
            r19 = this;
            r0 = r20
            r1 = r25
            androidx.media3.exoplayer.dash.manifest.Representation r2 = r0.b
            androidx.media3.extractor.mp4.FragmentedMp4Extractor r3 = r0.e
            boolean r4 = com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyInitialRequestSize.useAseConfig()
            if (r4 == 0) goto L17
            r4 = r19
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig r5 = r4.c
            int r5 = r5.al()
            goto L1d
        L17:
            r4 = r19
            int r5 = com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyInitialRequestSize.requestSize()
        L1d:
            r6 = 0
            if (r3 == 0) goto L4b
            if (r5 <= 0) goto L4b
            if (r1 == 0) goto L30
            androidx.media3.exoplayer.dash.manifest.RangedUri r3 = new androidx.media3.exoplayer.dash.manifest.RangedUri
            java.lang.String r8 = r1.referenceUri
            long r9 = r1.start
            long r11 = (long) r5
            r7 = r3
            r7.<init>(r8, r9, r11)
            goto L60
        L30:
            long r15 = r3.getSidxOffset()
            long r17 = r3.getSidxSize()
            r7 = 0
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 <= 0) goto L62
            androidx.media3.exoplayer.dash.manifest.RangedUri r1 = new androidx.media3.exoplayer.dash.manifest.RangedUri
            androidx.media3.exoplayer.dash.manifest.RangedUri r3 = r2.getInitializationUri()
            java.lang.String r14 = r3.referenceUri
            r13 = r1
            r13.<init>(r14, r15, r17)
            goto L65
        L4b:
            if (r1 == 0) goto L62
            com.google.common.collect.ImmutableList<androidx.media3.exoplayer.dash.manifest.BaseUrl> r3 = r2.baseUrls
            java.lang.Object r3 = r3.get(r6)
            androidx.media3.exoplayer.dash.manifest.BaseUrl r3 = (androidx.media3.exoplayer.dash.manifest.BaseUrl) r3
            java.lang.String r3 = r3.url
            r5 = r26
            androidx.media3.exoplayer.dash.manifest.RangedUri r3 = r1.attemptMerge(r5, r3)
            if (r3 != 0) goto L60
            goto L65
        L60:
            r1 = r3
            goto L65
        L62:
            r5 = r26
            r1 = r5
        L65:
            androidx.media3.datasource.DataSpec r9 = androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(r2, r1, r6)
            androidx.media3.exoplayer.source.chunk.InitializationChunk r1 = new androidx.media3.exoplayer.source.chunk.InitializationChunk
            androidx.media3.exoplayer.source.chunk.ChunkExtractor r13 = r0.a
            r7 = r1
            r8 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4687bjH.b(o.bjH$a, androidx.media3.datasource.DataSource, androidx.media3.common.Format, int, java.lang.Object, androidx.media3.exoplayer.dash.manifest.RangedUri, androidx.media3.exoplayer.dash.manifest.RangedUri):androidx.media3.exoplayer.source.chunk.Chunk");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.source.chunk.Chunk d(o.C4687bjH.a r50, androidx.media3.datasource.DataSource r51, int r52, androidx.media3.common.Format r53, int r54, java.lang.Object r55, long r56, int r58, long r59, long r61, long r63, long r65, long r67) {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4687bjH.d(o.bjH$a, androidx.media3.datasource.DataSource, int, androidx.media3.common.Format, int, java.lang.Object, long, int, long, long, long, long, long):androidx.media3.exoplayer.source.chunk.Chunk");
    }

    /* renamed from: o.bjH$c */
    /* loaded from: classes3.dex */
    protected static final class c extends BaseMediaChunkIterator {
        private final a c;
        private final long e;

        public c(a aVar, long j, long j2, long j3) {
            super(j, j2);
            this.c = aVar;
            this.e = j3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.bjH$a */
    /* loaded from: classes3.dex */
    public static final class a {
        final ChunkExtractor a;
        public final Representation b;
        public final DashSegmentIndex c;
        private final long d;
        public FragmentedMp4Extractor e;
        private final long f;

        a(long j, int i, Representation representation, boolean z, List<Format> list, TrackOutput trackOutput, boolean z2) {
            this.d = j;
            this.b = representation;
            this.f = 0L;
            this.a = a(i, representation, z, list, trackOutput, z2);
            this.c = representation.getIndex();
        }

        private a(long j, Representation representation, ChunkExtractor chunkExtractor, long j2, DashSegmentIndex dashSegmentIndex) {
            this.d = j;
            this.b = representation;
            this.f = j2;
            this.a = chunkExtractor;
            this.c = dashSegmentIndex;
        }

        a a(long j, Representation representation) {
            DashSegmentIndex dashSegmentIndex;
            long segmentNum;
            long j2;
            DashSegmentIndex index = this.b.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new a(j, representation, this.a, this.f, index);
            }
            if (index2 == null) {
                return new a(j, representation, this.a, this.f, index2);
            }
            if (!index.isExplicit()) {
                return new a(j, representation, this.a, this.f, index2);
            }
            long segmentCount = index.getSegmentCount(j);
            if (segmentCount == 0) {
                return new a(j, representation, this.a, this.f, index2);
            }
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j3 = segmentCount + firstSegmentNum;
            long j4 = j3 - 1;
            long timeUs2 = index.getTimeUs(j4);
            long durationUs = index.getDurationUs(j4, j);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j5 = this.f;
            int i = ((timeUs2 + durationUs) > timeUs3 ? 1 : ((timeUs2 + durationUs) == timeUs3 ? 0 : -1));
            if (i == 0) {
                j2 = j5 + (j3 - firstSegmentNum2);
                dashSegmentIndex = index2;
            } else if (i < 0) {
                throw new BehindLiveWindowException();
            } else {
                if (timeUs3 < timeUs) {
                    dashSegmentIndex = index2;
                    segmentNum = j5 - (dashSegmentIndex.getSegmentNum(timeUs, j) - firstSegmentNum);
                } else {
                    dashSegmentIndex = index2;
                    segmentNum = j5 + (index.getSegmentNum(timeUs3, j) - firstSegmentNum2);
                }
                j2 = segmentNum;
            }
            return new a(j, representation, this.a, j2, dashSegmentIndex);
        }

        a c(DashSegmentIndex dashSegmentIndex) {
            return new a(this.d, this.b, this.a, this.f, dashSegmentIndex);
        }

        a a(long j, C4684bjE c4684bjE) {
            c4684bjE.c();
            return new a(j, c4684bjE, new BundledChunkExtractor(new C4681bjB(c4684bjE), 3, this.b.format), this.f, c4684bjE.getIndex());
        }

        public long a() {
            return this.c.getFirstSegmentNum() + this.f;
        }

        public long c(long j) {
            return this.c.getFirstAvailableSegmentNum(this.d, j) + this.f;
        }

        public long c() {
            return this.c.getSegmentCount(this.d);
        }

        public long e(long j) {
            return this.c.getTimeUs(j - this.f);
        }

        public long d(long j) {
            return e(j) + this.c.getDurationUs(j - this.f, this.d);
        }

        public long a(long j) {
            return this.c.getSegmentNum(j, this.d) + this.f;
        }

        public RangedUri j(long j) {
            return this.c.getSegmentUrl(j - this.f);
        }

        public long b(long j) {
            return (c(j) + this.c.getAvailableSegmentCount(this.d, j)) - 1;
        }

        public boolean e(long j, long j2) {
            return this.c.isExplicit() || j2 == -9223372036854775807L || d(j) <= j2;
        }

        private ChunkExtractor a(int i, Representation representation, boolean z, List<Format> list, TrackOutput trackOutput, boolean z2) {
            Extractor c4689bjJ;
            String str = representation.format.containerMimeType;
            if ("application/nflx-cmisc".equals(str)) {
                if (representation instanceof C4684bjE) {
                    ((C4684bjE) representation).c();
                }
                return new BundledChunkExtractor(new C4681bjB(representation), i, representation.format);
            }
            if (MimeTypes.isText(str)) {
                return null;
            }
            if (MimeTypes.isMatroska(str)) {
                c4689bjJ = new MatroskaExtractor(1);
            } else {
                FragmentedMp4Extractor fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, "audio/mp4a-latm".equals(representation.format.sampleMimeType) ? new C4685bjF(68000L) : null, null, list, trackOutput);
                this.e = fragmentedMp4Extractor;
                c4689bjJ = new C4689bjJ(fragmentedMp4Extractor, z2);
            }
            return new BundledChunkExtractor(c4689bjJ, i, representation.format);
        }
    }
}
