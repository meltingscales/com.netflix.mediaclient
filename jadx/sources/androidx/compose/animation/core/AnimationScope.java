package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    private long finishedTimeNanos;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final drO<dpR> onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setVelocityVector$animation_core_release(V v) {
        this.velocityVector = v;
    }

    public AnimationScope(T t, TwoWayConverter<T, V> twoWayConverter, V v, long j, T t2, long j2, boolean z, drO<dpR> dro) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.typeConverter = twoWayConverter;
        this.targetValue = t2;
        this.startTimeNanos = j2;
        this.onCancel = dro;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (V) AnimationVectorsKt.copy(v);
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final void setValue$animation_core_release(T t) {
        this.value$delegate.setValue(t);
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }
}
