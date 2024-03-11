package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9104jL;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class SubscriptionWsProtocol$connectionInit$1 extends ContinuationImpl {
    public Object a;
    public int b;
    final /* synthetic */ C9104jL c;
    public Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol$connectionInit$1(C9104jL c9104jL, InterfaceC8585dra<? super SubscriptionWsProtocol$connectionInit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c9104jL;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
