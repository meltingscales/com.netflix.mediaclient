package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8924fr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [S] */
/* loaded from: classes5.dex */
public final class CoroutinesStateStore$flushQueuesOnce$2$2<S> extends SuspendLambda implements drX<drM<? super S, ? extends dpR>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8924fr<S> c;
    /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$flushQueuesOnce$2$2(C8924fr<S> c8924fr, InterfaceC8585dra<? super CoroutinesStateStore$flushQueuesOnce$2$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c8924fr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CoroutinesStateStore$flushQueuesOnce$2$2 coroutinesStateStore$flushQueuesOnce$2$2 = new CoroutinesStateStore$flushQueuesOnce$2$2(this.c, interfaceC8585dra);
        coroutinesStateStore$flushQueuesOnce$2$2.d = obj;
        return coroutinesStateStore$flushQueuesOnce$2$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(drM<? super S, dpR> drm, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoroutinesStateStore$flushQueuesOnce$2$2) create(drm, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            ((drM) this.d).invoke(this.c.b());
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
