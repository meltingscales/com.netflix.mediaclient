package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class HistoricalChange {
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j, long j2, long j3, C8627dsp c8627dsp) {
        this(j, j2, j3);
    }

    public /* synthetic */ HistoricalChange(long j, long j2, C8627dsp c8627dsp) {
        this(j, j2);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release  reason: not valid java name */
    public final long m1685getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m1686getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    private HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
        this.originalEventPosition = Offset.Companion.m1149getZeroF1C5BW0();
    }

    private HistoricalChange(long j, long j2, long j3) {
        this(j, j2, (C8627dsp) null);
        this.originalEventPosition = j3;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1144toStringimpl(this.position)) + ')';
    }
}
