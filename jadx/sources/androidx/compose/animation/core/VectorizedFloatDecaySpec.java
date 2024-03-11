package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8632dsu;

/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long j, V v, V v2) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            C8632dsu.d("");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.valueVector;
            if (v4 == null) {
                C8632dsu.d("");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getValueFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.valueVector;
        if (v5 == null) {
            C8632dsu.d("");
            return null;
        }
        return v5;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V v, V v2) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            C8632dsu.d("");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        long j = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            j = Math.max(j, this.floatDecaySpec.getDurationNanos(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            C8632dsu.d("");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.velocityVector;
            if (v4 == null) {
                C8632dsu.d("");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getVelocityFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.velocityVector;
        if (v5 == null) {
            C8632dsu.d("");
            return null;
        }
        return v5;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V v, V v2) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(v);
        }
        V v3 = this.targetVector;
        if (v3 == null) {
            C8632dsu.d("");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.targetVector;
            if (v4 == null) {
                C8632dsu.d("");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.floatDecaySpec.getTargetValue(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.targetVector;
        if (v5 == null) {
            C8632dsu.d("");
            return null;
        }
        return v5;
    }
}
