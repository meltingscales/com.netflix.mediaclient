package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9061iV;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C9061iV.d.AnonymousClass5 a;
    public int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1(C9061iV.d.AnonymousClass5 anonymousClass5, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
