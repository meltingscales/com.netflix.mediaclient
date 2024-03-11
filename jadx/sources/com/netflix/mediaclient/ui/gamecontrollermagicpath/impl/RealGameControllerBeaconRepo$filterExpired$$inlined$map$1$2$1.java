package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bND;

/* loaded from: classes4.dex */
public final class RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object d;
    final /* synthetic */ bND.d.AnonymousClass2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1(bND.d.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
