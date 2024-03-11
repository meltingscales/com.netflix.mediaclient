package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j, SizeAnimationModifierNode sizeAnimationModifierNode, InterfaceC8585dra<? super SizeAnimationModifierNode$animateTo$data$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_apply = animData;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        drX<IntSize, IntSize, dpR> listener;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize m2542boximpl = IntSize.m2542boximpl(this.$targetSize);
            AnimationSpec<IntSize> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            obj = Animatable.animateTo$default(anim, m2542boximpl, animationSpec, null, null, this, 12, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = this.this$0.getListener()) != null) {
            listener.invoke(IntSize.m2542boximpl(this.$this_apply.m50getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return dpR.c;
    }
}
