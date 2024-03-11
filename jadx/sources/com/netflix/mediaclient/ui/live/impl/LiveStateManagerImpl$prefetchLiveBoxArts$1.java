package com.netflix.mediaclient.ui.live.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bZM;

/* loaded from: classes4.dex */
public final class LiveStateManagerImpl$prefetchLiveBoxArts$1 extends ContinuationImpl {
    final /* synthetic */ bZM a;
    public int c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStateManagerImpl$prefetchLiveBoxArts$1(bZM bzm, InterfaceC8585dra<? super LiveStateManagerImpl$prefetchLiveBoxArts$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = bzm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.c(null, this);
    }
}
