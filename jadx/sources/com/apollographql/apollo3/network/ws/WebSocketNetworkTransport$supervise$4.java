package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.AbstractC9107jO;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.C9110jR;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$supervise$4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Ref.ObjectRef<AbstractC9107jO> a;
    final /* synthetic */ C9110jR b;
    int c;
    final /* synthetic */ Ref.ObjectRef<dxD> d;
    final /* synthetic */ Ref.ObjectRef<dxD> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$supervise$4(C9110jR c9110jR, Ref.ObjectRef<AbstractC9107jO> objectRef, Ref.ObjectRef<dxD> objectRef2, Ref.ObjectRef<dxD> objectRef3, InterfaceC8585dra<? super WebSocketNetworkTransport$supervise$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c9110jR;
        this.a = objectRef;
        this.e = objectRef2;
        this.d = objectRef3;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WebSocketNetworkTransport$supervise$4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new WebSocketNetworkTransport$supervise$4(this.b, this.a, this.e, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        long j;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            j = this.b.e;
            this.c = 1;
            if (C8749dxc.b(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C9110jR.a(this.a, this.e, this.d);
        return dpR.c;
    }
}
