package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T, V] */
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements drM<InterfaceC8585dra<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ drM<Animatable<T, V>, dpR> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, drM<? super Animatable<T, V>, dpR> drm, InterfaceC8585dra<? super Animatable$runAnimation$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC8585dra);
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(InterfaceC8585dra<? super AnimationResult<T, V>> interfaceC8585dra) {
        return ((Animatable$runAnimation$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        e = C8586drb.e();
        int i = this.label;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((V) ((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity)));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                final AnimationState copy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Animation<T, V> animation = this.$animation;
                long j = this.$startTime;
                final Animatable<T, V> animatable = this.this$0;
                final drM<Animatable<T, V>, dpR> drm = this.$block;
                drM<AnimationScope<T, V>, dpR> drm2 = new drM<AnimationScope<T, V>, dpR>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(Object obj2) {
                        invoke((AnimationScope) ((AnimationScope) obj2));
                        return dpR.c;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(AnimationScope<T, V> animationScope) {
                        Object clampToBounds;
                        SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                        clampToBounds = animatable.clampToBounds(animationScope.getValue());
                        if (C8632dsu.c(clampToBounds, animationScope.getValue())) {
                            drM<Animatable<T, V>, dpR> drm3 = drm;
                            if (drm3 != null) {
                                drm3.invoke(animatable);
                                return;
                            }
                            return;
                        }
                        animatable.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                        copy$default.setValue$animation_core_release(clampToBounds);
                        drM<Animatable<T, V>, dpR> drm4 = drm;
                        if (drm4 != null) {
                            drm4.invoke(animatable);
                        }
                        animationScope.cancelAnimation();
                        booleanRef2.a = true;
                    }
                };
                this.L$0 = copy$default;
                this.L$1 = booleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j, drm2, this) == e) {
                    return e;
                }
                animationState = copy$default;
                booleanRef = booleanRef2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                booleanRef = (Ref.BooleanRef) this.L$1;
                animationState = (AnimationState) this.L$0;
                C8556dpz.d(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e2) {
            this.this$0.endAnimation();
            throw e2;
        }
    }
}
