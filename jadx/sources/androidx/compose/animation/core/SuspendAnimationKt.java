package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import o.C8586drb;
import o.C8589dre;
import o.C8626dso;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, drX drx, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f4, animationSpec, drx, interfaceC8585dra);
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec<Float> animationSpec, drX<? super Float, ? super Float, dpR> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animate = animate(VectorConvertersKt.getVectorConverter(C8626dso.e), C8589dre.e(f), C8589dre.e(f2), C8589dre.e(f3), animationSpec, drx, interfaceC8585dra);
        e = C8586drb.e();
        return animate == e ? animate : dpR.c;
    }

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, final drX<? super T, ? super T, dpR> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        V newInstance;
        Object e;
        if (t3 == null || (newInstance = twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            newInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t));
        }
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t, newInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, newInstance), 0L, new drM<AnimationScope<T, V>, dpR>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Object obj) {
                invoke((AnimationScope) ((AnimationScope) obj));
                return dpR.c;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                drx.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animate$default == e ? animate$default : dpR.c;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, drM drm, InterfaceC8585dra interfaceC8585dra, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            drm = new drM<AnimationScope<Object, Object>, dpR>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return dpR.c;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, drm, interfaceC8585dra);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, drM<? super AnimationScope<T, V>, dpR> drm, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, drm, interfaceC8585dra);
        e = C8586drb.e();
        return animate == e ? animate : dpR.c;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, drM drm, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            drm = new drM<AnimationScope<Object, Object>, dpR>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return dpR.c;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, drm, interfaceC8585dra);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, drM<? super AnimationScope<T, V>, dpR> drm, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animate = animate(animationState, new DecayAnimation(decayAnimationSpec, animationState.getTypeConverter(), animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, drm, interfaceC8585dra);
        e = C8586drb.e();
        return animate == e ? animate : dpR.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00db A[Catch: CancellationException -> 0x004f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x004f, blocks: (B:78:0x0049, B:93:0x00ce, B:95:0x00db), top: B:115:0x0049 }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> r25, final androidx.compose.animation.core.Animation<T, V> r26, long r27, final o.drM<? super androidx.compose.animation.core.AnimationScope<T, V>, o.dpR> r29, o.InterfaceC8585dra<? super o.dpR> r30) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, o.drM, o.dra):java.lang.Object");
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, drM drm, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            drm = new drM<AnimationScope<Object, Object>, dpR>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return dpR.c;
                }
            };
        }
        return animate(animationState, animation, j2, drm, interfaceC8585dra);
    }

    private static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        if (animation.isInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(drm, interfaceC8585dra);
        }
        return MonotonicFrameClockKt.withFrameNanos(new drM<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Long l) {
                return invoke(l.longValue());
            }

            public final R invoke(long j) {
                return drm.invoke(Long.valueOf(j));
            }
        }, interfaceC8585dra);
    }

    public static final float getDurationScale(dqZ dqz) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) dqz.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("negative scale factor".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j, float f, Animation<T, V> animation, AnimationState<T, V> animationState, drM<? super AnimationScope<T, V>, dpR> drm) {
        long startTimeNanos;
        if (f == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = ((float) (j - animationScope.getStartTimeNanos())) / f;
        }
        doAnimationFrame(animationScope, j, startTimeNanos, animation, animationState, drm);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, drM<? super AnimationScope<T, V>, dpR> drm) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        drm.invoke(animationScope);
    }
}
