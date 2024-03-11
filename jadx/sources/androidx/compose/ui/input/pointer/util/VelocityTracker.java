package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;

/* loaded from: classes.dex */
public final class VelocityTracker {
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private long currentPointerPositionAccumulator = Offset.Companion.m1149getZeroF1C5BW0();

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release  reason: not valid java name */
    public final long m1779getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release  reason: not valid java name */
    public final void m1780setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j) {
        this.lastMoveEventTimeStamp = j;
    }

    /* renamed from: addPosition-Uv8p0NA  reason: not valid java name */
    public final void m1777addPositionUv8p0NA(long j, long j2) {
        this.xVelocityTracker.addDataPoint(j, Offset.m1137getXimpl(j2));
        this.yVelocityTracker.addDataPoint(j, Offset.m1138getYimpl(j2));
    }

    /* renamed from: calculateVelocity-AH228Gc  reason: not valid java name */
    public final long m1778calculateVelocityAH228Gc(long j) {
        if (Velocity.m2586getXimpl(j) <= 0.0f || Velocity.m2587getYimpl(j) <= 0.0f) {
            throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m2592toStringimpl(j))).toString());
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m2586getXimpl(j)), this.yVelocityTracker.calculateVelocity(Velocity.m2587getYimpl(j)));
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }
}
