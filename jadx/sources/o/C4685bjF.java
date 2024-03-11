package o;

import androidx.media3.common.Fmp4TimestampAdjuster;

/* renamed from: o.bjF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4685bjF implements Fmp4TimestampAdjuster {
    private final long d;

    @Override // androidx.media3.common.Fmp4TimestampAdjuster
    public long adjustSampleTimestamp(long j) {
        return j - this.d;
    }

    @Override // androidx.media3.common.Fmp4TimestampAdjuster
    public boolean isInitialized() {
        return true;
    }

    public C4685bjF(long j) {
        this.d = j;
    }
}
