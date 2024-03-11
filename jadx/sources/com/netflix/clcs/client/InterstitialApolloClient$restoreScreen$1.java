package com.netflix.clcs.client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C0723Af;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class InterstitialApolloClient$restoreScreen$1 extends ContinuationImpl {
    final /* synthetic */ C0723Af a;
    public int b;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialApolloClient$restoreScreen$1(C0723Af c0723Af, InterfaceC8585dra<? super InterstitialApolloClient$restoreScreen$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c0723Af;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.c(null, this);
    }
}
