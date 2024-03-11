package com.netflix.mediaclient.uxconfigclientcapabilities.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8354dim;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class UxConfigClientCapabilitiesImpl$fetchUxConfigId$1 extends ContinuationImpl {
    public Object a;
    final /* synthetic */ C8354dim b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UxConfigClientCapabilitiesImpl$fetchUxConfigId$1(C8354dim c8354dim, InterfaceC8585dra<? super UxConfigClientCapabilitiesImpl$fetchUxConfigId$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c8354dim;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.b.a(false, (InterfaceC8585dra<? super String>) this);
    }
}
