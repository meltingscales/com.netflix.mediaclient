package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$Builder$serverUrl$1$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super String>, Object> {
    int a;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$Builder$serverUrl$1$1(String str, InterfaceC8585dra<? super WebSocketNetworkTransport$Builder$serverUrl$1$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new WebSocketNetworkTransport$Builder$serverUrl$1$1(this.e, interfaceC8585dra);
    }

    @Override // o.drM
    /* renamed from: e */
    public final Object invoke(InterfaceC8585dra<? super String> interfaceC8585dra) {
        return ((WebSocketNetworkTransport$Builder$serverUrl$1$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            return this.e;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
