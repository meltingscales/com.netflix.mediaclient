package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements drX<ScrollScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, InterfaceC8585dra<? super ScrollExtensionsKt$animateScrollBy$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$value = f;
        this.$animationSpec = animationSpec;
        this.$previousValue = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, interfaceC8585dra);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // o.drX
    public final Object invoke(ScrollScope scrollScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previousValue;
            drX<Float, Float, dpR> drx = new drX<Float, Float, dpR>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Float f2, Float f3) {
                    invoke(f2.floatValue(), f3.floatValue());
                    return dpR.c;
                }

                public final void invoke(float f2, float f3) {
                    Ref.FloatRef floatRef2 = Ref.FloatRef.this;
                    float f4 = floatRef2.d;
                    floatRef2.d = f4 + scrollScope.scrollBy(f2 - f4);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, drx, this, 4, null) == e) {
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
