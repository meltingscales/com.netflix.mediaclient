package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9110jR;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    final /* synthetic */ C9110jR.d.AnonymousClass2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$$inlined$map$1$2$1(C9110jR.d.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
