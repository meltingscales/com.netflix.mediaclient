package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8951gR;
import o.C9110jR;
import o.C9118jZ;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.InterfaceC9116jX;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$1 extends SuspendLambda implements drX<dyQ<? super InterfaceC9116jX>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9110jR a;
    final /* synthetic */ C8951gR<D> b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$1(C9110jR c9110jR, C8951gR<D> c8951gR, InterfaceC8585dra<? super WebSocketNetworkTransport$execute$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c9110jR;
        this.b = c8951gR;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super InterfaceC9116jX> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WebSocketNetworkTransport$execute$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new WebSocketNetworkTransport$execute$1(this.a, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8792dys interfaceC8792dys = this.a.j;
            C9118jZ c9118jZ = new C9118jZ(this.b);
            this.c = 1;
            if (interfaceC8792dys.a(c9118jZ, this) == e) {
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
