package com.apollographql.apollo3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8942gI;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class ApolloCall$singleSuccessOrException$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C8942gI<D> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCall$singleSuccessOrException$1(C8942gI<D> c8942gI, InterfaceC8585dra<? super ApolloCall$singleSuccessOrException$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c8942gI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        b = this.c.b(null, this);
        return b;
    }
}
