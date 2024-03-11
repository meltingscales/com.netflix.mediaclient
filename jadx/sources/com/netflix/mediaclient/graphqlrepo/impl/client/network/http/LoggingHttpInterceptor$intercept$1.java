package com.netflix.mediaclient.graphqlrepo.impl.client.network.http;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1496aDl;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class LoggingHttpInterceptor$intercept$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    final /* synthetic */ C1496aDl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingHttpInterceptor$intercept$1(C1496aDl c1496aDl, InterfaceC8585dra<? super LoggingHttpInterceptor$intercept$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.i = c1496aDl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.i.e(null, null, this);
    }
}
