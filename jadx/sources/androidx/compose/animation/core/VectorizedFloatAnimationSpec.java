package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import java.util.Iterator;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.dqB;

/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i) {
                return FloatAnimationSpec.this;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v);
        }
        V v4 = this.valueVector;
        if (v4 == null) {
            C8632dsu.d("");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.valueVector;
            if (v5 == null) {
                C8632dsu.d("");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.anims.get(i).getValueFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.valueVector;
        if (v6 == null) {
            C8632dsu.d("");
            return null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v3);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            C8632dsu.d("");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.velocityVector;
            if (v5 == null) {
                C8632dsu.d("");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.anims.get(i).getVelocityFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            C8632dsu.d("");
            return null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(v3);
        }
        V v4 = this.endVelocityVector;
        if (v4 == null) {
            C8632dsu.d("");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.endVelocityVector;
            if (v5 == null) {
                C8632dsu.d("");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.anims.get(i).getEndVelocity(v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.endVelocityVector;
        if (v6 == null) {
            C8632dsu.d("");
            return null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        C8654dtp g;
        g = C8657dts.g(0, v.getSize$animation_core_release());
        Iterator<Integer> it = g.iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((dqB) it).nextInt();
            j = Math.max(j, this.anims.get(nextInt).getDurationNanos(v.get$animation_core_release(nextInt), v2.get$animation_core_release(nextInt), v3.get$animation_core_release(nextInt)));
        }
        return j;
    }
}
