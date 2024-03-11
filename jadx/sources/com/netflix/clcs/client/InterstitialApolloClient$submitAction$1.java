package com.netflix.clcs.client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C0723Af;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class InterstitialApolloClient$submitAction$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ C0723Af c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialApolloClient$submitAction$1(C0723Af c0723Af, InterfaceC8585dra<? super InterstitialApolloClient$submitAction$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c0723Af;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(null, null, null, this);
    }
}
