package com.netflix.clcs.client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C0723Af;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class InterstitialApolloClient$fetchInterstitialHook$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    final /* synthetic */ C0723Af c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialApolloClient$fetchInterstitialHook$1(C0723Af c0723Af, InterfaceC8585dra<? super InterstitialApolloClient$fetchInterstitialHook$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c0723Af;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
