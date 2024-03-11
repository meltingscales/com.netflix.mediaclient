package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9110jR;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int c;
    final /* synthetic */ C9110jR.a.AnonymousClass3 d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$$inlined$filter$1$2$1(C9110jR.a.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
