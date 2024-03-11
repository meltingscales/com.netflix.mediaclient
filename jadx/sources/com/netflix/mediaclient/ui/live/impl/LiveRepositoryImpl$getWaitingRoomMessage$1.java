package com.netflix.mediaclient.ui.live.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bZP;

/* loaded from: classes4.dex */
public final class LiveRepositoryImpl$getWaitingRoomMessage$1 extends ContinuationImpl {
    final /* synthetic */ bZP b;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRepositoryImpl$getWaitingRoomMessage$1(bZP bzp, InterfaceC8585dra<? super LiveRepositoryImpl$getWaitingRoomMessage$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = bzp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.d(0, this);
    }
}
