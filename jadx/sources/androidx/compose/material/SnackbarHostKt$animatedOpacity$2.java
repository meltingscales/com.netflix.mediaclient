package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ drO<dpR> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, drO<dpR> dro, InterfaceC8585dra<? super SnackbarHostKt$animatedOpacity$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = animationSpec;
        this.$onAnimationFinish = dro;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SnackbarHostKt$animatedOpacity$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$alpha;
            Float e2 = C8589dre.e(this.$visible ? 1.0f : 0.0f);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, e2, animationSpec, null, null, this, 12, null) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.$onAnimationFinish.invoke();
        return dpR.c;
    }
}
