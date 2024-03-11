package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9110jR;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C9110jR.b.AnonymousClass4 b;
    public /* synthetic */ Object c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1(C9110jR.b.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
