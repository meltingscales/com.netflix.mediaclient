package com.netflix.mediaclient.autologin.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.TX;

/* loaded from: classes3.dex */
public final class AutoLoginTokenProviderImpl$createAutoLoginToken$1 extends ContinuationImpl {
    public int a;
    public Object c;
    public /* synthetic */ Object d;
    final /* synthetic */ TX e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLoginTokenProviderImpl$createAutoLoginToken$1(TX tx, InterfaceC8585dra<? super AutoLoginTokenProviderImpl$createAutoLoginToken$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = tx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.e.e(null, this);
    }
}
