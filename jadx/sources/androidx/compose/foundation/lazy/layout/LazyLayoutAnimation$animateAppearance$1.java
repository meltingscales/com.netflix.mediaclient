package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$animateAppearance$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$animateAppearance$1(LazyLayoutAnimation lazyLayoutAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC8585dra<? super LazyLayoutAnimation$animateAppearance$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LazyLayoutAnimation$animateAppearance$1(this.this$0, this.$spec, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LazyLayoutAnimation$animateAppearance$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Animatable animatable;
        Animatable animatable2;
        e = C8586drb.e();
        int i = this.label;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                animatable = this.this$0.visibilityAnimation;
                Float e2 = C8589dre.e(0.0f);
                this.label = 1;
                if (animatable.snapTo(e2, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C8556dpz.d(obj);
                    this.this$0.setAppearanceAnimationInProgress(false);
                    return dpR.c;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            animatable2 = this.this$0.visibilityAnimation;
            Float e3 = C8589dre.e(1.0f);
            FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
            final LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
            drM<Animatable<Float, AnimationVector1D>, dpR> drm = new drM<Animatable<Float, AnimationVector1D>, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1.1
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Animatable<Float, AnimationVector1D> animatable3) {
                    invoke2(animatable3);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Animatable<Float, AnimationVector1D> animatable3) {
                    LazyLayoutAnimation.this.setVisibility(animatable3.getValue().floatValue());
                }
            };
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, e3, finiteAnimationSpec, null, drm, this, 4, null) == e) {
                return e;
            }
            this.this$0.setAppearanceAnimationInProgress(false);
            return dpR.c;
        } catch (Throwable th) {
            this.this$0.setAppearanceAnimationInProgress(false);
            throw th;
        }
    }
}
