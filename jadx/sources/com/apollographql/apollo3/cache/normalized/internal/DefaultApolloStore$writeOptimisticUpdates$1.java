package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9063iX;
import o.InterfaceC8585dra;
import o.InterfaceC8991hE;
import o.InterfaceC8991hE.b;

/* loaded from: classes2.dex */
public final class DefaultApolloStore$writeOptimisticUpdates$1<D extends InterfaceC8991hE.b> extends ContinuationImpl {
    final /* synthetic */ C9063iX a;
    public int b;
    public Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultApolloStore$writeOptimisticUpdates$1(C9063iX c9063iX, InterfaceC8585dra<? super DefaultApolloStore$writeOptimisticUpdates$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c9063iX;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.a(null, null, null, null, false, this);
    }
}
