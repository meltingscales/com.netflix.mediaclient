package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.AbstractC9107jO;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$supervise$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Ref.ObjectRef<AbstractC9107jO> d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$supervise$3(Ref.ObjectRef<AbstractC9107jO> objectRef, InterfaceC8585dra<? super WebSocketNetworkTransport$supervise$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = objectRef;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WebSocketNetworkTransport$supervise$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new WebSocketNetworkTransport$supervise$3(this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            AbstractC9107jO abstractC9107jO = this.d.d;
            C8632dsu.d(abstractC9107jO);
            this.e = 1;
            if (abstractC9107jO.c(this) == e) {
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
