package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8924fr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;

/* loaded from: classes5.dex */
public final class CoroutinesStateStore$setupTriggerFlushQueues$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8924fr<S> a;
    private /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$setupTriggerFlushQueues$1(C8924fr<S> c8924fr, InterfaceC8585dra<? super CoroutinesStateStore$setupTriggerFlushQueues$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c8924fr;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoroutinesStateStore$setupTriggerFlushQueues$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CoroutinesStateStore$setupTriggerFlushQueues$1 coroutinesStateStore$setupTriggerFlushQueues$1 = new CoroutinesStateStore$setupTriggerFlushQueues$1(this.a, interfaceC8585dra);
        coroutinesStateStore$setupTriggerFlushQueues$1.d = obj;
        return coroutinesStateStore$setupTriggerFlushQueues$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwU dwu;
        Object c;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dwu = (dwU) this.d;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwu = (dwU) this.d;
            C8556dpz.d(obj);
        }
        while (dwY.b(dwu)) {
            C8924fr<S> c8924fr = this.a;
            this.d = dwu;
            this.e = 1;
            c = c8924fr.c(this);
            if (c == e) {
                return e;
            }
        }
        return dpR.c;
    }
}
