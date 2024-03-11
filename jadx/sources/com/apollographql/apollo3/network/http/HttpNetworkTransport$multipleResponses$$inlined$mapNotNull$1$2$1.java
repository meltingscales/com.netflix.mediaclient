package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.network.http.HttpNetworkTransport;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    int a;
    final /* synthetic */ HttpNetworkTransport.c.AnonymousClass5 b;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1(HttpNetworkTransport.c.AnonymousClass5 anonymousClass5, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
