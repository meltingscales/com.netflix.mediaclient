package com.netflix.mediaclient.ui.home.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bSN;

/* loaded from: classes4.dex */
public final class HomeImpl$getLatestLolomoSummary$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ bSN b;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeImpl$getLatestLolomoSummary$1(bSN bsn, InterfaceC8585dra<? super HomeImpl$getLatestLolomoSummary$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = bsn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
