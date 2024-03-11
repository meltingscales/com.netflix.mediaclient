package androidx.media3.common.util;

import androidx.media3.common.Fmp4TimestampAdjuster;

/* loaded from: classes2.dex */
public final class TimestampAdjuster implements Fmp4TimestampAdjuster {
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public long getFirstSampleTimestampUs() {
        long j;
        synchronized (this) {
            j = this.firstSampleTimestampUs;
            j = (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
        }
        return j;
    }

    public long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        synchronized (this) {
            long j = this.lastUnadjustedTimestampUs;
            firstSampleTimestampUs = j != -9223372036854775807L ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public long getTimestampOffsetUs() {
        long j;
        synchronized (this) {
            j = this.timestampOffsetUs;
        }
        return j;
    }

    public void reset(long j) {
        synchronized (this) {
            this.firstSampleTimestampUs = j;
            this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.lastUnadjustedTimestampUs = -9223372036854775807L;
        }
    }

    public long adjustTsTimestamp(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != -9223372036854775807L) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (4294967296L + usToNonWrappedPts) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                    j = j4;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j));
        }
    }

    @Override // androidx.media3.common.Fmp4TimestampAdjuster
    public long adjustSampleTimestamp(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            if (!isInitialized()) {
                long j2 = this.firstSampleTimestampUs;
                if (j2 == 9223372036854775806L) {
                    j2 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = j2 - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        }
    }

    @Override // androidx.media3.common.Fmp4TimestampAdjuster
    public boolean isInitialized() {
        boolean z;
        synchronized (this) {
            z = this.timestampOffsetUs != -9223372036854775807L;
        }
        return z;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }
}
