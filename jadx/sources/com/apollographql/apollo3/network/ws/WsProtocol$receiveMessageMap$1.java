package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC9107jO;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WsProtocol$receiveMessageMap$1 extends ContinuationImpl {
    final /* synthetic */ AbstractC9107jO a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsProtocol$receiveMessageMap$1(AbstractC9107jO abstractC9107jO, InterfaceC8585dra<? super WsProtocol$receiveMessageMap$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = abstractC9107jO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.a(this);
    }
}
