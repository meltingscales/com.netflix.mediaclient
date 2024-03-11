package com.netflix.clcs.client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C0723Af;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class InterstitialApolloClient$fetchDemoScreen$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ C0723Af d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialApolloClient$fetchDemoScreen$1(C0723Af c0723Af, InterfaceC8585dra<? super InterstitialApolloClient$fetchDemoScreen$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = c0723Af;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}
