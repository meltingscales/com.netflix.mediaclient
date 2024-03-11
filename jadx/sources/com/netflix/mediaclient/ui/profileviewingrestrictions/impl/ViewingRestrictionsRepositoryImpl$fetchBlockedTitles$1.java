package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.cPH;

/* loaded from: classes4.dex */
public final class ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ cPH c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1(cPH cph, InterfaceC8585dra<? super ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = cph;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
