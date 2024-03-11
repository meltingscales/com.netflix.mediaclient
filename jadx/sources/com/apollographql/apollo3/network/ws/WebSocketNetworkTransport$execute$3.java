package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8951gR;
import o.C9108jP;
import o.C9112jT;
import o.C9114jV;
import o.C9172ka;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC9116jX;
import o.dpR;
import o.dyQ;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$3 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super InterfaceC9116jX>, InterfaceC9116jX, InterfaceC8585dra<? super Boolean>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ C8951gR<D> c;
    private /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$3(C8951gR<D> c8951gR, InterfaceC8585dra<? super WebSocketNetworkTransport$execute$3> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.c = c8951gR;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super InterfaceC9116jX> dyq, InterfaceC9116jX interfaceC9116jX, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        WebSocketNetworkTransport$execute$3 webSocketNetworkTransport$execute$3 = new WebSocketNetworkTransport$execute$3(this.c, interfaceC8585dra);
        webSocketNetworkTransport$execute$3.d = dyq;
        webSocketNetworkTransport$execute$3.a = interfaceC9116jX;
        return webSocketNetworkTransport$execute$3.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq = (dyQ) this.d;
            InterfaceC9116jX interfaceC9116jX = (InterfaceC9116jX) this.a;
            if (!(interfaceC9116jX instanceof C9172ka) && !(interfaceC9116jX instanceof C9108jP)) {
                if (interfaceC9116jX instanceof C9112jT) {
                    this.d = null;
                    this.e = 1;
                    if (dyq.emit(interfaceC9116jX, this) == e) {
                        return e;
                    }
                } else if (interfaceC9116jX instanceof C9114jV) {
                    System.out.println((Object) ("Received general error while executing operation " + this.c.h().f() + ": " + ((C9114jV) interfaceC9116jX).e()));
                } else {
                    this.d = null;
                    this.e = 2;
                    if (dyq.emit(interfaceC9116jX, this) == e) {
                        return e;
                    }
                }
            }
            z = false;
        } else if (i == 1) {
            C8556dpz.d(obj);
            z = false;
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return C8589dre.e(z);
    }
}
