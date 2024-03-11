package com.netflix.mediaclient.ui.home.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bSN;

/* loaded from: classes4.dex */
public final class HomeImpl$fetchCollectTasteTitles$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ bSN e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeImpl$fetchCollectTasteTitles$1(bSN bsn, InterfaceC8585dra<? super HomeImpl$fetchCollectTasteTitles$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = bsn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.a(0, 0, this);
    }
}
