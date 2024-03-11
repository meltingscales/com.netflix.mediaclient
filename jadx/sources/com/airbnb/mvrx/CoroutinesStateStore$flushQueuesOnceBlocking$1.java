package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8924fr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class CoroutinesStateStore$flushQueuesOnceBlocking$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C8924fr<S> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$flushQueuesOnceBlocking$1(C8924fr<S> c8924fr, InterfaceC8585dra<? super CoroutinesStateStore$flushQueuesOnceBlocking$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c8924fr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CoroutinesStateStore$flushQueuesOnceBlocking$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoroutinesStateStore$flushQueuesOnceBlocking$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object c;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            C8924fr<S> c8924fr = this.d;
            this.a = 1;
            c = c8924fr.c(this);
            if (c == e) {
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
