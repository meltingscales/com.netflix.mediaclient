package com.slack.circuit.retained;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8484dnh;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class AndroidContinuityKt$continuityRetainedStateRegistry$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8484dnh a;
    int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContinuityKt$continuityRetainedStateRegistry$2(C8484dnh c8484dnh, InterfaceC8585dra<? super AndroidContinuityKt$continuityRetainedStateRegistry$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c8484dnh;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AndroidContinuityKt$continuityRetainedStateRegistry$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AndroidContinuityKt$continuityRetainedStateRegistry$2(this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            AnonymousClass1 anonymousClass1 = new drM<Long, dpR>() { // from class: com.slack.circuit.retained.AndroidContinuityKt$continuityRetainedStateRegistry$2.1
                public final void d(long j) {
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    d(l.longValue());
                    return dpR.c;
                }
            };
            this.b = 1;
            if (MonotonicFrameClockKt.withFrameNanos(anonymousClass1, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.a.d();
        return dpR.c;
    }
}
