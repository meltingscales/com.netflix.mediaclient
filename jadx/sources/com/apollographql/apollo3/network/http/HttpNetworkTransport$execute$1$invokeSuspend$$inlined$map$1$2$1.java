package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    /* synthetic */ Object b;
    int c;
    final /* synthetic */ HttpNetworkTransport$execute$1.c.AnonymousClass2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1(HttpNetworkTransport$execute$1.c.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
