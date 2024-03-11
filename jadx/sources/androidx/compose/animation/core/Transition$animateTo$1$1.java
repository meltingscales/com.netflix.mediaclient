package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Transition$animateTo$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, InterfaceC8585dra<? super Transition$animateTo$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, interfaceC8585dra);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Transition$animateTo$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwU dwu;
        drM<Long, dpR> drm;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dwu = (dwU) this.L$0;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwu = (dwU) this.L$0;
            C8556dpz.d(obj);
        }
        do {
            final float durationScale = SuspendAnimationKt.getDurationScale(dwu.getCoroutineContext());
            final Transition<S> transition = this.this$0;
            drm = new drM<Long, dpR>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    invoke(l.longValue());
                    return dpR.c;
                }

                public final void invoke(long j) {
                    if (transition.isSeeking()) {
                        return;
                    }
                    transition.onFrame$animation_core_release(j, durationScale);
                }
            };
            this.L$0 = dwu;
            this.label = 1;
        } while (MonotonicFrameClockKt.withFrameNanos(drm, this) != e);
        return e;
    }
}
