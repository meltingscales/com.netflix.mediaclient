package com.netflix.mediaclient.hendrixconfig.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.aFT;

/* loaded from: classes3.dex */
public final class VolatileConfigManager$diffFieldJson$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ aFT e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolatileConfigManager$diffFieldJson$1(aFT aft, InterfaceC8585dra<? super VolatileConfigManager$diffFieldJson$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = aft;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
