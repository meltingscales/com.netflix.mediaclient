package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.extractor.ChunkIndex;

/* loaded from: classes2.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j2) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return this.chunkIndex.timesUs[(int) j] - this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return this.chunkIndex.durationsUs[(int) j];
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j) {
        ChunkIndex chunkIndex = this.chunkIndex;
        int i = (int) j;
        return new RangedUri(null, chunkIndex.offsets[i], chunkIndex.sizes[i]);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return this.chunkIndex.getChunkIndex(j + this.timeOffsetUs);
    }
}
