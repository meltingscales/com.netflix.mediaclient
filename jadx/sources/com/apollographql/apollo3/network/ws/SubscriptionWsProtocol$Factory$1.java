package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes2.dex */
public final class SubscriptionWsProtocol$Factory$1 extends SuspendLambda implements drM<InterfaceC8585dra, Object> {
    int c;

    public SubscriptionWsProtocol$Factory$1(InterfaceC8585dra<? super SubscriptionWsProtocol$Factory$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new SubscriptionWsProtocol$Factory$1(interfaceC8585dra);
    }

    @Override // o.drM
    /* renamed from: d */
    public final Object invoke(InterfaceC8585dra interfaceC8585dra) {
        return ((SubscriptionWsProtocol$Factory$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
