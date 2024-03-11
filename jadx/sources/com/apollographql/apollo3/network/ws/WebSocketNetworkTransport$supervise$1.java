package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9110jR;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$supervise$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public int h;
    public Object i;
    public Object j;
    final /* synthetic */ C9110jR k;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$supervise$1(C9110jR c9110jR, InterfaceC8585dra<? super WebSocketNetworkTransport$supervise$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.k = c9110jR;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.n = obj;
        this.h |= Integer.MIN_VALUE;
        b = this.k.b(null, this);
        return b;
    }
}
