package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$cancelPlacementAnimation$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$cancelPlacementAnimation$1(LazyLayoutAnimation lazyLayoutAnimation, InterfaceC8585dra<? super LazyLayoutAnimation$cancelPlacementAnimation$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = lazyLayoutAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LazyLayoutAnimation$cancelPlacementAnimation$1(this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LazyLayoutAnimation$cancelPlacementAnimation$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Animatable animatable;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            animatable = this.this$0.placementDeltaAnimation;
            IntOffset m2525boximpl = IntOffset.m2525boximpl(IntOffset.Companion.m2538getZeronOccac());
            this.label = 1;
            if (animatable.snapTo(m2525boximpl, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.this$0.m359setPlacementDeltagyyYBs(IntOffset.Companion.m2538getZeronOccac());
        this.this$0.setPlacementAnimationInProgress(false);
        return dpR.c;
    }
}
