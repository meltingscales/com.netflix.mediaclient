package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1307Wq;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchVideoMetadata$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public Object g;
    final /* synthetic */ C1307Wq h;
    public int i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$fetchVideoMetadata$1(C1307Wq c1307Wq, InterfaceC8585dra<? super PrefetchInfraImpl$fetchVideoMetadata$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.h = c1307Wq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d((String) null, this);
    }
}
