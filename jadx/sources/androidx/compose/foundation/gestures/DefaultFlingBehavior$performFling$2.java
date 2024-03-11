package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, InterfaceC8585dra<? super DefaultFlingBehavior$performFling$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Float> interfaceC8585dra) {
        return ((DefaultFlingBehavior$performFling$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        float f;
        Ref.FloatRef floatRef;
        AnimationState animationState;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.d = this.$initialVelocity;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                try {
                    DecayAnimationSpec<Float> flingDecay = this.this$0.getFlingDecay();
                    final ScrollScope scrollScope = this.$this_performFling;
                    final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                    drM<AnimationScope<Float, AnimationVector1D>, dpR> drm = new drM<AnimationScope<Float, AnimationVector1D>, dpR>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                            float floatValue = animationScope.getValue().floatValue() - Ref.FloatRef.this.d;
                            float scrollBy = scrollScope.scrollBy(floatValue);
                            Ref.FloatRef.this.d = animationScope.getValue().floatValue();
                            floatRef2.d = animationScope.getVelocity().floatValue();
                            if (Math.abs(floatValue - scrollBy) > 0.5f) {
                                animationScope.cancelAnimation();
                            }
                            DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                            defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                        }
                    };
                    this.L$0 = floatRef2;
                    this.L$1 = AnimationState$default;
                    this.label = 1;
                    if (SuspendAnimationKt.animateDecay$default(AnimationState$default, flingDecay, false, drm, this, 2, null) == e) {
                        return e;
                    }
                    floatRef = floatRef2;
                } catch (CancellationException unused) {
                    floatRef = floatRef2;
                    animationState = AnimationState$default;
                    floatRef.d = ((Number) animationState.getVelocity()).floatValue();
                    f = floatRef.d;
                    return C8589dre.e(f);
                }
            } else {
                f = this.$initialVelocity;
                return C8589dre.e(f);
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            animationState = (AnimationState) this.L$1;
            floatRef = (Ref.FloatRef) this.L$0;
            try {
                C8556dpz.d(obj);
            } catch (CancellationException unused2) {
                floatRef.d = ((Number) animationState.getVelocity()).floatValue();
                f = floatRef.d;
                return C8589dre.e(f);
            }
        }
        f = floatRef.d;
        return C8589dre.e(f);
    }
}
