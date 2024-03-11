package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.cPN;

/* loaded from: classes4.dex */
public final class ViewingRestrictionsViewModel$fetchMaturityRatings$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ cPN c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewingRestrictionsViewModel$fetchMaturityRatings$1(cPN cpn, InterfaceC8585dra<? super ViewingRestrictionsViewModel$fetchMaturityRatings$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = cpn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
