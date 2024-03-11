package com.netflix.mediaclient.graphqlrepo.impl.client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.InterfaceC8999hM.c;
import o.aCT;

/* loaded from: classes3.dex */
public final class ApolloCallKt$queryCacheOrNetworkWithExpiry$1<D extends InterfaceC8999hM.c> extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public Object e;
    public /* synthetic */ Object j;

    public ApolloCallKt$queryCacheOrNetworkWithExpiry$1(InterfaceC8585dra<? super ApolloCallKt$queryCacheOrNetworkWithExpiry$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.d |= Integer.MIN_VALUE;
        return aCT.d(null, null, null, null, this);
    }
}
