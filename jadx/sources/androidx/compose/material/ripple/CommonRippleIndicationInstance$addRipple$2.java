package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleIndicationInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, InterfaceC8585dra<? super CommonRippleIndicationInstance$addRipple$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleIndicationInstance;
        this.$interaction = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CommonRippleIndicationInstance$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        SnapshotStateMap snapshotStateMap;
        SnapshotStateMap snapshotStateMap2;
        e = C8586drb.e();
        int i = this.label;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                RippleAnimation rippleAnimation = this.$rippleAnimation;
                this.label = 1;
                if (rippleAnimation.animate(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            snapshotStateMap2 = this.this$0.ripples;
            snapshotStateMap2.remove(this.$interaction);
            return dpR.c;
        } catch (Throwable th) {
            snapshotStateMap = this.this$0.ripples;
            snapshotStateMap.remove(this.$interaction);
            throw th;
        }
    }
}
