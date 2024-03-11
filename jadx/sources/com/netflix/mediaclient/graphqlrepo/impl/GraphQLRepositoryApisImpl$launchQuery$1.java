package com.netflix.mediaclient.graphqlrepo.impl;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8942gI;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.InterfaceC8999hM.c;
import o.aCO;

/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$launchQuery$1<Q extends InterfaceC8999hM.c> extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public Object d;
    public int e;
    final /* synthetic */ aCO h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLRepositoryApisImpl$launchQuery$1(aCO aco, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$launchQuery$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.h = aco;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        a = this.h.a((C8942gI) null, (QueryMode) null, (RequestPriority) null, false, (InterfaceC8585dra) this);
        return a;
    }
}
