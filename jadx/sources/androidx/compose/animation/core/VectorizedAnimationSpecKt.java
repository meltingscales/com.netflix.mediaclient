package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8572dqo;
import o.C8654dtp;
import o.C8657dts;
import o.dqB;

/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    public static final /* synthetic */ Animations access$createSpringAnimations(AnimationVector animationVector, float f, float f2) {
        return createSpringAnimations(animationVector, f, f2);
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getValueFromNanos(j * 1000000, v, v2, v3);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        long b;
        b = C8657dts.b(j - vectorizedDurationBasedAnimationSpec.getDelayMillis(), 0L, vectorizedDurationBasedAnimationSpec.getDurationMillis());
        return b;
    }

    public static final <V extends AnimationVector> Animations createSpringAnimations(V v, float f, float f2) {
        if (v != null) {
            return new Animations(v, f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
                private final List<FloatSpringSpec> anims;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    C8654dtp g;
                    int d;
                    g = C8657dts.g(0, v.getSize$animation_core_release());
                    d = C8572dqo.d(g, 10);
                    ArrayList arrayList = new ArrayList(d);
                    Iterator<Integer> it = g.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FloatSpringSpec(f, f2, v.get$animation_core_release(((dqB) it).nextInt())));
                    }
                    this.anims = arrayList;
                }

                @Override // androidx.compose.animation.core.Animations
                public FloatSpringSpec get(int i) {
                    return this.anims.get(i);
                }
            };
        }
        return new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            private final FloatSpringSpec anim;

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i) {
                return this.anim;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.anim = new FloatSpringSpec(f, f2, 0.0f, 4, null);
            }
        };
    }
}
