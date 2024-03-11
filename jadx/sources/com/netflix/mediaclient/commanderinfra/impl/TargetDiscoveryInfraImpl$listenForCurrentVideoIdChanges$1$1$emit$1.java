package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1 extends ContinuationImpl {
    final /* synthetic */ TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1.AnonymousClass3<T> a;
    Object b;
    /* synthetic */ Object c;
    int d;
    Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1(TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1.AnonymousClass3<? super T> anonymousClass3, InterfaceC8585dra<? super TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
