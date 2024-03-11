package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9105jM;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class DefaultWebSocketEngine$open$1 extends ContinuationImpl {
    final /* synthetic */ C9105jM a;
    public /* synthetic */ Object b;
    public int c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketEngine$open$1(C9105jM c9105jM, InterfaceC8585dra<? super DefaultWebSocketEngine$open$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c9105jM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.c(null, null, this);
    }
}
