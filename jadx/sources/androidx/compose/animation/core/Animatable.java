package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private V upperBoundVector;
    private final T visibilityThreshold;

    public final State<T> asState() {
        return this.internalState;
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2, String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        V access$getNegativeInfinityBounds3D$p;
        V access$getPositiveInfinityBounds3D$p;
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue$delegate = mutableStateOf$default2;
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        V velocityVector = getVelocityVector();
        if (velocityVector instanceof AnimationVector1D) {
            access$getNegativeInfinityBounds3D$p = AnimatableKt.access$getNegativeInfinityBounds1D$p();
        } else if (velocityVector instanceof AnimationVector2D) {
            access$getNegativeInfinityBounds3D$p = AnimatableKt.access$getNegativeInfinityBounds2D$p();
        } else {
            access$getNegativeInfinityBounds3D$p = velocityVector instanceof AnimationVector3D ? AnimatableKt.access$getNegativeInfinityBounds3D$p() : AnimatableKt.access$getNegativeInfinityBounds4D$p();
        }
        C8632dsu.d(access$getNegativeInfinityBounds3D$p);
        this.negativeInfinityBounds = access$getNegativeInfinityBounds3D$p;
        V velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof AnimationVector1D) {
            access$getPositiveInfinityBounds3D$p = AnimatableKt.access$getPositiveInfinityBounds1D$p();
        } else if (velocityVector2 instanceof AnimationVector2D) {
            access$getPositiveInfinityBounds3D$p = AnimatableKt.access$getPositiveInfinityBounds2D$p();
        } else {
            access$getPositiveInfinityBounds3D$p = velocityVector2 instanceof AnimationVector3D ? AnimatableKt.access$getPositiveInfinityBounds3D$p() : AnimatableKt.access$getPositiveInfinityBounds4D$p();
        }
        C8632dsu.d(access$getPositiveInfinityBounds3D$p);
        this.positiveInfinityBounds = access$getPositiveInfinityBounds3D$p;
        this.lowerBoundVector = access$getNegativeInfinityBounds3D$p;
        this.upperBoundVector = access$getPositiveInfinityBounds3D$p;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i, C8627dsp c8627dsp) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, drM drm, InterfaceC8585dra interfaceC8585dra, int i, Object obj3) {
        SpringSpec<T> springSpec = animationSpec;
        if ((i & 2) != 0) {
            springSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = springSpec;
        T t = obj2;
        if ((i & 4) != 0) {
            t = animatable.getVelocity();
        }
        T t2 = t;
        drM<? super Animatable<T, V>, dpR> drm2 = drm;
        if ((i & 8) != 0) {
            drm2 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t2, drm2, interfaceC8585dra);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, drM<? super Animatable<T, V>, dpR> drm, InterfaceC8585dra<? super AnimationResult<T, V>> interfaceC8585dra) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, drm, interfaceC8585dra);
    }

    private final Object runAnimation(Animation<T, V> animation, T t, drM<? super Animatable<T, V>, dpR> drm, InterfaceC8585dra<? super AnimationResult<T, V>> interfaceC8585dra) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t, animation, this.internalState.getLastFrameTimeNanos(), drm, null), interfaceC8585dra, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t) {
        float a;
        if (C8632dsu.c(this.lowerBoundVector, this.negativeInfinityBounds) && C8632dsu.c(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(t);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        boolean z = false;
        for (int i = 0; i < size$animation_core_release; i++) {
            if (invoke.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || invoke.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                a = C8657dts.a(invoke.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i));
                invoke.set$animation_core_release(i, a);
                z = true;
            }
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(invoke) : t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    public final Object snapTo(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t, null), interfaceC8585dra, 1, null);
        e = C8586drb.e();
        return mutate$default == e ? mutate$default : dpR.c;
    }

    public final Object stop(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), interfaceC8585dra, 1, null);
        e = C8586drb.e();
        return mutate$default == e ? mutate$default : dpR.c;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue$delegate.setValue(t);
    }
}
