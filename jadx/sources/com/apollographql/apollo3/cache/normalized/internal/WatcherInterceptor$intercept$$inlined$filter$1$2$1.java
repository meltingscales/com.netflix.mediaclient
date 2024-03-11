package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9123je;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class WatcherInterceptor$intercept$$inlined$filter$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C9123je.c.AnonymousClass4 a;
    public int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatcherInterceptor$intercept$$inlined$filter$1$2$1(C9123je.c.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
