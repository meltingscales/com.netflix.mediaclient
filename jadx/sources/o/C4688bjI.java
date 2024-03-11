package o;

import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunk;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.source.chunk.SingleSampleMediaChunk;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: o.bjI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4688bjI<T extends ChunkSource> extends ChunkSampleStream<T> {
    private final C4617bhr a;
    private boolean b;
    private long d;

    /* renamed from: o.bjI$a */
    /* loaded from: classes3.dex */
    public static class a implements ChunkSampleStreamFactory {
        private final C4617bhr a;
        private final C4617bhr b;
        private final C4617bhr e;

        public a(C4617bhr c4617bhr, C4617bhr c4617bhr2, C4617bhr c4617bhr3) {
            this.e = c4617bhr;
            this.a = c4617bhr2;
            this.b = c4617bhr3;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory
        public ChunkSampleStream create(int i, int[] iArr, Format[] formatArr, ChunkSource chunkSource, SequenceableLoader.Callback callback, Allocator allocator, long j, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2) {
            return new C4688bjI(i, iArr, formatArr, chunkSource, callback, allocator, j, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2, i != 1 ? i != 2 ? i != 3 ? null : this.b : this.a : this.e);
        }
    }

    public C4688bjI(int i, int[] iArr, Format[] formatArr, T t, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, C4617bhr c4617bhr) {
        super(i, iArr, formatArr, t, callback, allocator, j, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2);
        this.d = -9223372036854775807L;
        this.a = c4617bhr;
        if (c4617bhr != null) {
            c4617bhr.b(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream
    public void release(ChunkSampleStream.ReleaseCallback<T> releaseCallback) {
        super.release(releaseCallback);
        C4617bhr c4617bhr = this.a;
        if (c4617bhr != null) {
            c4617bhr.c(this);
        }
    }

    public BaseMediaChunk[] e() {
        BaseMediaChunk[] baseMediaChunkArr;
        Object[] array = this.mediaChunks.toArray(new BaseMediaChunk[0]);
        while (true) {
            baseMediaChunkArr = (BaseMediaChunk[]) array;
            if (baseMediaChunkArr.length <= 0 || baseMediaChunkArr[0] != null) {
                break;
            }
            array = Arrays.copyOfRange(baseMediaChunkArr, 1, baseMediaChunkArr.length);
        }
        while (baseMediaChunkArr.length > 0 && baseMediaChunkArr[baseMediaChunkArr.length - 1] == null) {
            baseMediaChunkArr = (BaseMediaChunk[]) Arrays.copyOfRange(baseMediaChunkArr, 0, baseMediaChunkArr.length - 1);
        }
        return baseMediaChunkArr;
    }

    public BaseMediaChunk d() {
        BaseMediaChunk[] e = e();
        if (e.length > 0) {
            return e[e.length - 1];
        }
        return null;
    }

    public long a(long j) {
        long durationUs;
        long j2 = this.d;
        if (j2 >= 0) {
            j = j2;
        }
        BaseMediaChunk[] e = e();
        BaseMediaChunk baseMediaChunk = e.length > 0 ? e[0] : null;
        BaseMediaChunk baseMediaChunk2 = e.length > 0 ? e[e.length - 1] : null;
        if (baseMediaChunk == null || baseMediaChunk2 == null) {
            return 0L;
        }
        if (baseMediaChunk2.isLoadCompleted()) {
            durationUs = baseMediaChunk2.endTimeUs;
        } else {
            long j3 = baseMediaChunk2.startTimeUs;
            DataSpec dataSpec = baseMediaChunk2.dataSpec;
            durationUs = j3 + ((dataSpec == null || dataSpec.length <= 0) ? 0L : baseMediaChunk2.getDurationUs() * Math.min(Math.max(0L, baseMediaChunk2.bytesLoaded() / baseMediaChunk2.dataSpec.length), 1L));
        }
        if (j > durationUs || j < baseMediaChunk.startTimeUs) {
            if (this.b) {
                return 0L;
            }
            return durationUs - baseMediaChunk.startTimeUs;
        }
        return durationUs - j;
    }

    public long d(long j) {
        long j2;
        long j3;
        long j4 = this.d;
        long j5 = 0;
        if (j4 >= 0) {
            j = j4;
        }
        BaseMediaChunk[] e = e();
        if (e.length == 0 || e[e.length - 1].endTimeUs < j) {
            return 0L;
        }
        int length = e.length;
        int i = length - 1;
        if (!e[i].isLoadCompleted()) {
            j5 = e[i].bytesLoaded();
            i = length - 2;
        }
        while (i >= 0) {
            BaseMediaChunk baseMediaChunk = e[i];
            if (j >= baseMediaChunk.endTimeUs) {
                return j5;
            }
            if (j > baseMediaChunk.startTimeUs) {
                return j5 + ((long) (((j - j3) / (j2 - j3)) * baseMediaChunk.bytesLoaded()));
            }
            long j6 = baseMediaChunk.dataSpec.length;
            if (j6 == -1) {
                j6 = baseMediaChunk.bytesLoaded();
            }
            j5 += j6;
            i--;
        }
        return j5;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.d = j;
        super.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream
    public void seekToUs(long j) {
        super.seekToUs(j);
        this.b = false;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream, androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        int readData = super.readData(formatHolder, decoderInputBuffer, i);
        if (readData == -4 && decoderInputBuffer.isEndOfStream()) {
            this.b = true;
        }
        return readData;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream
    public void maybeNotifyPrimaryTrackFormatChanged(int i) {
        C4617bhr c4617bhr;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat) && (c4617bhr = this.a) != null) {
            c4617bhr.d(format, baseMediaChunk.startTimeUs);
        }
        super.maybeNotifyPrimaryTrackFormatChanged(i);
    }

    public String toString() {
        return String.format(Locale.US, "[%s, %s]", Util.getTrackTypeString(this.primaryTrackType), Integer.valueOf(hashCode()));
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream, androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        BaseMediaChunk d = d();
        if (d instanceof SingleSampleMediaChunk) {
            return d.isLoadCompleted();
        }
        return super.isReady();
    }
}
