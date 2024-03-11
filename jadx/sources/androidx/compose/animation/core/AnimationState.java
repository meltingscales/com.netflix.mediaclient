package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning = z;
    }

    public final void setVelocityVector$animation_core_release(V v) {
        this.velocityVector = v;
    }

    public AnimationState(TwoWayConverter<T, V> twoWayConverter, T t, V v, long j, long j2, boolean z) {
        MutableState mutableStateOf$default;
        V v2;
        this.typeConverter = twoWayConverter;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(twoWayConverter, t) : v2;
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = j2;
        this.isRunning = z;
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z, int i, C8627dsp c8627dsp) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public void setValue$animation_core_release(T t) {
        this.value$delegate.setValue(t);
    }
}
