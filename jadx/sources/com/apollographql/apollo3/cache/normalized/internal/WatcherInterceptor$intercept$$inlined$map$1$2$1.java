package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9123je;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WatcherInterceptor$intercept$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int c;
    final /* synthetic */ C9123je.e.AnonymousClass1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatcherInterceptor$intercept$$inlined$map$1$2$1(C9123je.e.AnonymousClass1 anonymousClass1, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
