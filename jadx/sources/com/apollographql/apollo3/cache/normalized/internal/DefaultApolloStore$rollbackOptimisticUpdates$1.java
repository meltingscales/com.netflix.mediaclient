package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9063iX;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class DefaultApolloStore$rollbackOptimisticUpdates$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C9063iX b;
    public /* synthetic */ Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultApolloStore$rollbackOptimisticUpdates$1(C9063iX c9063iX, InterfaceC8585dra<? super DefaultApolloStore$rollbackOptimisticUpdates$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c9063iX;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.c(null, false, this);
    }
}
