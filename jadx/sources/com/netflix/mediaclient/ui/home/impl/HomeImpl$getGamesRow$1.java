package com.netflix.mediaclient.ui.home.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C4003bSq;
import o.InterfaceC8585dra;
import o.bSN;

/* loaded from: classes4.dex */
public final class HomeImpl$getGamesRow$1 extends ContinuationImpl {
    final /* synthetic */ bSN a;
    public /* synthetic */ Object b;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeImpl$getGamesRow$1(bSN bsn, InterfaceC8585dra<? super HomeImpl$getGamesRow$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = bsn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.a.a(0, false, (InterfaceC8585dra<? super C4003bSq>) this);
    }
}
