package com.netflix.mediaclient.ui.live.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bZP;

/* loaded from: classes4.dex */
public final class LiveRepositoryImpl$prefetchLiveData$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object c;
    final /* synthetic */ bZP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRepositoryImpl$prefetchLiveData$1(bZP bzp, InterfaceC8585dra<? super LiveRepositoryImpl$prefetchLiveData$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = bzp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.a |= Integer.MIN_VALUE;
        return this.e.c(null, null, this);
    }
}
