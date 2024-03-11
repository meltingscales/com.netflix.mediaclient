package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8951gR;
import o.C8954gU;
import o.C9110jR;
import o.C9177kf;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8792dys;
import o.dpR;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$6<D> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super C8954gU<D>>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9110jR a;
    int d;
    final /* synthetic */ C8951gR<D> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$6(C9110jR c9110jR, C8951gR<D> c8951gR, InterfaceC8585dra<? super WebSocketNetworkTransport$execute$6> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.a = c9110jR;
        this.e = c8951gR;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return new WebSocketNetworkTransport$execute$6(this.a, this.e, interfaceC8585dra).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8792dys interfaceC8792dys = this.a.j;
            C9177kf c9177kf = new C9177kf(this.e);
            this.d = 1;
            if (interfaceC8792dys.a(c9177kf, this) == e) {
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
