package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1307Wq;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchFeatureEducationVideoAssets$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public Object c;
    public int d;
    final /* synthetic */ C1307Wq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$fetchFeatureEducationVideoAssets$1(C1307Wq c1307Wq, InterfaceC8585dra<? super PrefetchInfraImpl$fetchFeatureEducationVideoAssets$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = c1307Wq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        b = this.e.b(this);
        return b;
    }
}
