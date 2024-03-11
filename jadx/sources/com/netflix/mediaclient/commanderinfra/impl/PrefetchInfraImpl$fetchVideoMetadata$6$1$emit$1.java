package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1307Wq;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    final /* synthetic */ C1307Wq.d<T> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1(C1307Wq.d<? super T> dVar, InterfaceC8585dra<? super PrefetchInfraImpl$fetchVideoMetadata$6$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
