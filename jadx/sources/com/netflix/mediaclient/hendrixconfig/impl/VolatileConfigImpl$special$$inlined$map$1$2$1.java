package com.netflix.mediaclient.hendrixconfig.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.aFV;

/* loaded from: classes3.dex */
public final class VolatileConfigImpl$special$$inlined$map$1$2$1 extends ContinuationImpl {
    public int b;
    final /* synthetic */ aFV.e.AnonymousClass3 c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolatileConfigImpl$special$$inlined$map$1$2$1(aFV.e.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
