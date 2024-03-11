package com.netflix.mediaclient.ui.home.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bSN;

/* loaded from: classes4.dex */
public final class HomeImpl$getContinueWatchingTitles$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ bSN d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeImpl$getContinueWatchingTitles$1(bSN bsn, InterfaceC8585dra<? super HomeImpl$getContinueWatchingTitles$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = bsn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.a |= Integer.MIN_VALUE;
        return this.d.e(0, false, this);
    }
}
