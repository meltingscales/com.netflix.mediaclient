package com.netflix.mediaclient.graphqlrepo.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.InterfaceC8990hD;
import o.InterfaceC8990hD.b;
import o.aCO;

/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$mutate$1<M extends InterfaceC8990hD.b> extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;
    final /* synthetic */ aCO g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLRepositoryApisImpl$mutate$1(aCO aco, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$mutate$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.g = aco;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return aCO.a(this.g, null, null, false, null, false, this);
    }
}
