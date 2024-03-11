package com.netflix.mediaclient.hendrixconfig.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.aFT;

/* loaded from: classes3.dex */
public final class VolatileConfigManager$diffJsonObject$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    final /* synthetic */ aFT h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolatileConfigManager$diffJsonObject$1(aFT aft, InterfaceC8585dra<? super VolatileConfigManager$diffJsonObject$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.h = aft;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.f = obj;
        this.b |= Integer.MIN_VALUE;
        e = this.h.e(null, null, null, this);
        return e;
    }
}
