package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC9107jO;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WsProtocol$run$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    final /* synthetic */ AbstractC9107jO c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsProtocol$run$1(AbstractC9107jO abstractC9107jO, InterfaceC8585dra<? super WsProtocol$run$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = abstractC9107jO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return AbstractC9107jO.d(this.c, this);
    }
}
