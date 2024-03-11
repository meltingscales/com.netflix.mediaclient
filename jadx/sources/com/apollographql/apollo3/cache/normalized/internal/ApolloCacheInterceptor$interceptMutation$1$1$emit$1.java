package com.apollographql.apollo3.cache.normalized.internal;

import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$interceptMutation$1$1$emit$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    Object e;
    final /* synthetic */ ApolloCacheInterceptor$interceptMutation$1.AnonymousClass5<T> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApolloCacheInterceptor$interceptMutation$1$1$emit$1(ApolloCacheInterceptor$interceptMutation$1.AnonymousClass5<? super T> anonymousClass5, InterfaceC8585dra<? super ApolloCacheInterceptor$interceptMutation$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.j = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
