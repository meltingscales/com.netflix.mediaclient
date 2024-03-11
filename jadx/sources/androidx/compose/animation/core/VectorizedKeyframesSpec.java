package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import java.util.Map;
import kotlin.Pair;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    private final int delayMillis;
    private final int durationMillis;
    private final Map<Integer, Pair<V, Easing>> keyframes;
    private V valueVector;
    private V velocityVector;

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i, int i2) {
        this.keyframes = map;
        this.durationMillis = i;
        this.delayMillis = i2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        Object e;
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j / 1000000);
        if (this.keyframes.containsKey(Integer.valueOf(clampPlayTime))) {
            e = dqE.e(this.keyframes, Integer.valueOf(clampPlayTime));
            return (V) ((Pair) e).d();
        } else if (clampPlayTime >= getDurationMillis()) {
            return v2;
        } else {
            if (clampPlayTime <= 0) {
                return v;
            }
            int durationMillis = getDurationMillis();
            Easing linearEasing = EasingKt.getLinearEasing();
            int i = 0;
            V v4 = v;
            int i2 = 0;
            for (Map.Entry<Integer, Pair<V, Easing>> entry : this.keyframes.entrySet()) {
                int intValue = entry.getKey().intValue();
                Pair<V, Easing> value = entry.getValue();
                if (clampPlayTime > intValue && intValue >= i2) {
                    v4 = value.d();
                    linearEasing = value.a();
                    i2 = intValue;
                } else if (clampPlayTime < intValue && intValue <= durationMillis) {
                    v2 = value.d();
                    durationMillis = intValue;
                }
            }
            float transform = linearEasing.transform((clampPlayTime - i2) / (durationMillis - i2));
            init(v);
            int size$animation_core_release = v4.getSize$animation_core_release();
            while (true) {
                V v5 = null;
                if (i >= size$animation_core_release) {
                    break;
                }
                V v6 = this.valueVector;
                if (v6 == null) {
                    C8632dsu.d("");
                } else {
                    v5 = v6;
                }
                v5.set$animation_core_release(i, VectorConvertersKt.lerp(v4.get$animation_core_release(i), v2.get$animation_core_release(i), transform));
                i++;
            }
            V v7 = this.valueVector;
            if (v7 == null) {
                C8632dsu.d("");
                return null;
            }
            return v7;
        }
    }

    private final void init(V v) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j / 1000000);
        if (clampPlayTime <= 0) {
            return v3;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, v, v2, v3);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, v, v2, v3);
        init(v);
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        int i = 0;
        while (true) {
            V v4 = null;
            if (i >= size$animation_core_release) {
                break;
            }
            V v5 = this.velocityVector;
            if (v5 == null) {
                C8632dsu.d("");
            } else {
                v4 = v5;
            }
            v4.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
            i++;
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            C8632dsu.d("");
            return null;
        }
        return v6;
    }
}
