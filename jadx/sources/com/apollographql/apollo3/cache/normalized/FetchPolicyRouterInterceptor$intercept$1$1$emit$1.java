package com.apollographql.apollo3.cache.normalized;

import com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchPolicyRouterInterceptor$intercept$1$1$emit$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    final /* synthetic */ FetchPolicyRouterInterceptor$intercept$1.AnonymousClass4<T> c;
    Object d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FetchPolicyRouterInterceptor$intercept$1$1$emit$1(FetchPolicyRouterInterceptor$intercept$1.AnonymousClass4<? super T> anonymousClass4, InterfaceC8585dra<? super FetchPolicyRouterInterceptor$intercept$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
