package com.apollographql.apollo3.cache.normalized;

import com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    int c;
    final /* synthetic */ FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.a.AnonymousClass1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1(FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.a.AnonymousClass1 anonymousClass1, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
