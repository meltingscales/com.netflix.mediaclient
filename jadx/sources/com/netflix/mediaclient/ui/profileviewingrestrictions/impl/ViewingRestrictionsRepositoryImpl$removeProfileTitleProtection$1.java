package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.cPH;

/* loaded from: classes4.dex */
public final class ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1 extends ContinuationImpl {
    final /* synthetic */ cPH a;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1(cPH cph, InterfaceC8585dra<? super ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = cph;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.a.c(null, null, this);
    }
}
