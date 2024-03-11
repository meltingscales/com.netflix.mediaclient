package com.netflix.mediaclient.ui.live.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bZP;

/* loaded from: classes4.dex */
public final class LiveRepositoryImpl$getLiveData$1 extends ContinuationImpl {
    public int a;
    public int b;
    public Object c;
    public /* synthetic */ Object d;
    public Object e;
    final /* synthetic */ bZP i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRepositoryImpl$getLiveData$1(bZP bzp, InterfaceC8585dra<? super LiveRepositoryImpl$getLiveData$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.i = bzp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.i.e(0, null, this);
    }
}
