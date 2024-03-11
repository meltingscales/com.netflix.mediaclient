package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Descriptor;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {
    private static final Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final Allocator allocator;
    private final BaseUrlExclusionList baseUrlExclusionList;
    private MediaPeriod.Callback callback;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private List<EventStream> eventStreams;
    public final int id;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final PlayerEmsgHandler playerEmsgHandler;
    private final PlayerId playerId;
    private final TrackGroupInfo[] trackGroupInfos;
    private final TrackGroupArray trackGroups;
    private final TransferListener transferListener;
    private ChunkSampleStreamFactory chunkSampleStreamFactory = ChunkSampleStream.DEFAULT_FACTORY;
    private ChunkSampleStream<DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private EventSampleStream[] eventSampleStreams = new EventSampleStream[0];
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new IdentityHashMap<>();

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    public void setSampleStreamFactory(ChunkSampleStreamFactory chunkSampleStreamFactory) {
        this.chunkSampleStreamFactory = chunkSampleStreamFactory;
    }

    public DashMediaPeriod(int i, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i2, DashChunkSource.Factory factory, TransferListener transferListener, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, long j, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, PlayerId playerId, SubtitleParser.Factory factory2) {
        this.id = i;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i2;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.playerEmsgHandler = new PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.sampleStreams);
        Period period = dashManifest.getPeriod(i2);
        List<EventStream> list = period.eventStreams;
        this.eventStreams = list;
        Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups = buildTrackGroups(drmSessionManager, factory2, period.adaptationSets, list);
        this.trackGroups = (TrackGroupArray) buildTrackGroups.first;
        this.trackGroupInfos = (TrackGroupInfo[]) buildTrackGroups.second;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r11 == (r5 - 1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest r10, int r11) {
        /*
            r9 = this;
            r9.manifest = r10
            r9.periodIndex = r11
            androidx.media3.exoplayer.dash.PlayerEmsgHandler r0 = r9.playerEmsgHandler
            r0.updateManifest(r10)
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] r0 = r9.sampleStreams
            r1 = 0
            if (r0 == 0) goto L25
            int r2 = r0.length
            r3 = r1
        L10:
            if (r3 >= r2) goto L20
            r4 = r0[r3]
            androidx.media3.exoplayer.source.chunk.ChunkSource r4 = r4.getChunkSource()
            androidx.media3.exoplayer.dash.DashChunkSource r4 = (androidx.media3.exoplayer.dash.DashChunkSource) r4
            r4.updateManifest(r10, r11)
            int r3 = r3 + 1
            goto L10
        L20:
            androidx.media3.exoplayer.source.MediaPeriod$Callback r0 = r9.callback
            r0.onContinueLoadingRequested(r9)
        L25:
            androidx.media3.exoplayer.dash.manifest.Period r0 = r10.getPeriod(r11)
            java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> r0 = r0.eventStreams
            r9.eventStreams = r0
            androidx.media3.exoplayer.dash.EventSampleStream[] r0 = r9.eventSampleStreams
            int r2 = r0.length
            r3 = r1
        L31:
            if (r3 >= r2) goto L69
            r4 = r0[r3]
            java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> r5 = r9.eventStreams
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r5.next()
            androidx.media3.exoplayer.dash.manifest.EventStream r6 = (androidx.media3.exoplayer.dash.manifest.EventStream) r6
            java.lang.String r7 = r6.id()
            java.lang.String r8 = r4.eventStreamId()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3b
            int r5 = r10.getPeriodCount()
            boolean r7 = r10.dynamic
            if (r7 == 0) goto L62
            r7 = 1
            int r5 = r5 - r7
            if (r11 != r5) goto L62
            goto L63
        L62:
            r7 = r1
        L63:
            r4.updateEventStream(r6, r7)
        L66:
            int r3 = r3 + 1
            goto L31
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaPeriod.updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest, int):void");
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback
    public void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        synchronized (this) {
            PlayerEmsgHandler.PlayerTrackEmsgHandler remove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
            if (remove != null) {
                remove.release();
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j, streamIndexToTrackGroupIndex);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList2.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] newSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = newSampleStreamArray;
        arrayList.toArray(newSampleStreamArray);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.sampleStreams);
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }

    private int[] getStreamIndexToTrackGroupIndex(ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                iArr[i] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private void releaseDisabledStreams(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (exoTrackSelectionArr[i] == null || !zArr[i]) {
                SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i] = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void releaseOrphanEmbeddedStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r5, androidx.media3.exoplayer.source.SampleStream[] r6, int[] r7) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L3c
            r1 = r6[r0]
            boolean r2 = r1 instanceof androidx.media3.exoplayer.source.EmptySampleStream
            if (r2 != 0) goto Le
            boolean r1 = r1 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r1 == 0) goto L39
        Le:
            int r1 = r4.getPrimaryStreamIndex(r0, r7)
            r2 = -1
            if (r1 != r2) goto L1c
            r1 = r6[r0]
            boolean r1 = r1 instanceof androidx.media3.exoplayer.source.EmptySampleStream
            if (r1 != 0) goto L39
            goto L2b
        L1c:
            r2 = r6[r0]
            boolean r3 = r2 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r3 == 0) goto L2b
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream$EmbeddedSampleStream r2 = (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) r2
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T extends androidx.media3.exoplayer.source.chunk.ChunkSource> r2 = r2.parent
            r1 = r6[r1]
            if (r2 != r1) goto L2b
            goto L39
        L2b:
            r1 = r6[r0]
            boolean r2 = r1 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r2 == 0) goto L36
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream$EmbeddedSampleStream r1 = (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) r1
            r1.release()
        L36:
            r1 = 0
            r6[r0] = r1
        L39:
            int r0 = r0 + 1
            goto L1
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaPeriod.releaseOrphanEmbeddedStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], androidx.media3.exoplayer.source.SampleStream[], int[]):void");
    }

    private void selectNewStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream == null) {
                    zArr[i] = true;
                    TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i]];
                    int i2 = trackGroupInfo.trackGroupCategory;
                    if (i2 == 0) {
                        sampleStreamArr[i] = buildSampleStream(trackGroupInfo, exoTrackSelection, j);
                    } else if (i2 == 2) {
                        sampleStreamArr[i] = new EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            if (sampleStreamArr[i3] == null && exoTrackSelectionArr[i3] != null) {
                TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i3]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i3, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i3] = new EmptySampleStream();
                    } else {
                        sampleStreamArr[i3] = ((ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    private int getPrimaryStreamIndex(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.trackGroupInfos[i2].primaryTrackGroupIndex;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.trackGroupInfos[i5].trackGroupCategory == 0) {
                return i4;
            }
        }
        return -1;
    }

    private static Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups(DrmSessionManager drmSessionManager, SubtitleParser.Factory factory, List<AdaptationSet> list, List<EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length];
        int identifyEmbeddedTracks = identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[identifyEmbeddedTracks];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[identifyEmbeddedTracks];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    private static int[][] getGroupedAdaptationSetIndices(List<AdaptationSet> list) {
        Descriptor findAdaptationSetSwitchingProperty;
        Integer num;
        int size = list.size();
        HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            newHashMapWithExpectedSize.put(Long.valueOf(list.get(i).id), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            AdaptationSet adaptationSet = list.get(i2);
            Descriptor findTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (findTrickPlayProperty == null) {
                findTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            int intValue = (findTrickPlayProperty == null || (num = (Integer) newHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(findTrickPlayProperty.value)))) == null) ? i2 : num.intValue();
            if (intValue == i2 && (findAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (String str : Util.split(findAdaptationSetSwitchingProperty.value, ",")) {
                    Integer num2 = (Integer) newHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] array = Ints.toArray((Collection) arrayList.get(i3));
            iArr[i3] = array;
            Arrays.sort(array);
        }
        return iArr;
    }

    private static int identifyEmbeddedTracks(int i, List<AdaptationSet> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (hasEventMessageTrack(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i3]);
            formatArr[i3] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(DrmSessionManager drmSessionManager, SubtitleParser.Factory factory, List<AdaptationSet> list, int[][] iArr, int i, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr) {
        int i2;
        int i3;
        SubtitleParser.Factory factory2 = factory;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).representations);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            int i7 = 0;
            while (i7 < size) {
                Format format = ((Representation) arrayList.get(i7)).format;
                Format.Builder cryptoType = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format));
                if (factory2 != null && factory2.supportsFormat(format)) {
                    Format.Builder cueReplacementBehavior = cryptoType.setSampleMimeType("application/x-media3-cues").setCueReplacementBehavior(factory2.getCueReplacementBehavior(format));
                    StringBuilder sb = new StringBuilder();
                    sb.append(format.sampleMimeType);
                    sb.append(format.codecs != null ? " " + format.codecs : "");
                    cueReplacementBehavior.setCodecs(sb.toString()).setSubsampleOffsetUs(Long.MAX_VALUE);
                }
                formatArr2[i7] = cryptoType.build();
                i7++;
                factory2 = factory;
            }
            AdaptationSet adaptationSet = list.get(iArr2[0]);
            long j = adaptationSet.id;
            String l = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8;
                i8 = i5 + 2;
            } else {
                i2 = -1;
            }
            if (formatArr[i4].length != 0) {
                i3 = i8 + 1;
            } else {
                i3 = i8;
                i8 = -1;
            }
            trackGroupArr[i5] = new TrackGroup(l, formatArr2);
            trackGroupInfoArr[i5] = TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i5, i2, i8);
            if (i2 != -1) {
                String str = l + ":emsg";
                trackGroupArr[i2] = new TrackGroup(str, new Format.Builder().setId(str).setSampleMimeType("application/x-emsg").build());
                trackGroupInfoArr[i2] = TrackGroupInfo.embeddedEmsgTrack(iArr2, i5);
            }
            if (i8 != -1) {
                trackGroupArr[i8] = new TrackGroup(l + ":cc", formatArr[i4]);
                trackGroupInfoArr[i8] = TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i5);
            }
            i4++;
            factory2 = factory;
            i5 = i3;
        }
        return i5;
    }

    private static void buildManifestEventTrackGroupInfos(List<EventStream> list, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            EventStream eventStream = list.get(i2);
            Format build = new Format.Builder().setId(eventStream.id()).setSampleMimeType("application/x-emsg").build();
            trackGroupArr[i] = new TrackGroup(eventStream.id() + ":" + i2, build);
            trackGroupInfoArr[i] = TrackGroupInfo.mpdEventTrack(i2);
            i2++;
            i++;
        }
    }

    private ChunkSampleStream<DashChunkSource> buildSampleStream(TrackGroupInfo trackGroupInfo, ExoTrackSelection exoTrackSelection, long j) {
        int i;
        TrackGroup trackGroup;
        TrackGroup trackGroup2;
        int i2;
        int i3 = trackGroupInfo.embeddedEventMessageTrackGroupIndex;
        boolean z = i3 != -1;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = null;
        if (z) {
            trackGroup = this.trackGroups.get(i3);
            i = 1;
        } else {
            i = 0;
            trackGroup = null;
        }
        int i4 = trackGroupInfo.embeddedClosedCaptionTrackGroupIndex;
        boolean z2 = i4 != -1;
        if (z2) {
            trackGroup2 = this.trackGroups.get(i4);
            i += trackGroup2.length;
        } else {
            trackGroup2 = null;
        }
        Format[] formatArr = new Format[i];
        int[] iArr = new int[i];
        if (z) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < trackGroup2.length; i5++) {
                Format format = trackGroup2.getFormat(i5);
                formatArr[i2] = format;
                iArr[i2] = 3;
                arrayList.add(format);
                i2++;
            }
        }
        if (this.manifest.dynamic && z) {
            playerTrackEmsgHandler = this.playerEmsgHandler.newPlayerTrackEmsgHandler();
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = playerTrackEmsgHandler;
        ChunkSampleStream<DashChunkSource> create = this.chunkSampleStreamFactory.create(trackGroupInfo.trackType, iArr, formatArr, this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z, arrayList, playerTrackEmsgHandler2, this.transferListener, this.playerId, this.cmcdConfiguration), this, this.allocator, j, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(create, playerTrackEmsgHandler2);
        }
        return create;
    }

    private static Descriptor findAdaptationSetSwitchingProperty(List<Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static Descriptor findTrickPlayProperty(List<Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private static Descriptor findDescriptor(List<Descriptor> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    private static boolean hasEventMessageTrack(List<AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            List<Representation> list2 = list.get(i).representations;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Format[] getClosedCaptionTrackFormats(List<AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            AdaptationSet adaptationSet = list.get(i);
            List<Descriptor> list2 = list.get(i).accessibilityDescriptors;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Descriptor descriptor = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType("application/cea-608").setId(adaptationSet.id + ":cea608").build());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType("application/cea-708").setId(adaptationSet.id + ":cea708").build());
                }
            }
        }
        return new Format[0];
    }

    private static Format[] parseClosedCaptionDescriptor(Descriptor descriptor, Pattern pattern, Format format) {
        String str = descriptor.value;
        if (str == null) {
            return new Format[]{format};
        }
        String[] split = Util.split(str, ";");
        Format[] formatArr = new Format[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            Format.Builder buildUpon = format.buildUpon();
            formatArr[i] = buildUpon.setId(format.id + ":" + parseInt).setAccessibilityChannel(parseInt).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private static ChunkSampleStream<DashChunkSource>[] newSampleStreamArray(int i) {
        return new ChunkSampleStream[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TrackGroupInfo {
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        public static TrackGroupInfo primaryTrack(int i, int[] iArr, int i2, int i3, int i4) {
            return new TrackGroupInfo(i, 0, iArr, i2, i3, i4, -1);
        }

        public static TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i) {
            return new TrackGroupInfo(5, 1, iArr, i, -1, -1, -1);
        }

        public static TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i) {
            return new TrackGroupInfo(3, 1, iArr, i, -1, -1, -1);
        }

        public static TrackGroupInfo mpdEventTrack(int i) {
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i);
        }

        private TrackGroupInfo(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.trackType = i;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i2;
            this.primaryTrackGroupIndex = i3;
            this.embeddedEventMessageTrackGroupIndex = i4;
            this.embeddedClosedCaptionTrackGroupIndex = i5;
            this.eventStreamGroupIndex = i6;
        }
    }
}
