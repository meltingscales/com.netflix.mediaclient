package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9061iV;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.InterfaceC8999hM.c;

/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$readFromCache$1<D extends InterfaceC8999hM.c> extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public Object c;
    public long d;
    public Object e;
    final /* synthetic */ C9061iV g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$readFromCache$1(C9061iV c9061iV, InterfaceC8585dra<? super ApolloCacheInterceptor$readFromCache$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.g = c9061iV;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        a = this.g.a(null, null, this);
        return a;
    }
}
