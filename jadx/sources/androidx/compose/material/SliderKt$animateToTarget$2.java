package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements drX<DragScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f, float f2, float f3, InterfaceC8585dra<? super SliderKt$animateToTarget$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, interfaceC8585dra);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // o.drX
    public final Object invoke(DragScope dragScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SliderKt$animateToTarget$2) create(dragScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        TweenSpec tweenSpec;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f = this.$current;
            floatRef.d = f;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
            Float e2 = C8589dre.e(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float e3 = C8589dre.e(this.$velocity);
            drM<Animatable<Float, AnimationVector1D>, dpR> drm = new drM<Animatable<Float, AnimationVector1D>, dpR>() { // from class: androidx.compose.material.SliderKt$animateToTarget$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Animatable<Float, AnimationVector1D> animatable) {
                    invoke2(animatable);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                    DragScope.this.dragBy(animatable.getValue().floatValue() - floatRef.d);
                    floatRef.d = animatable.getValue().floatValue();
                }
            };
            this.label = 1;
            if (Animatable$default.animateTo(e2, tweenSpec, e3, drm, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
