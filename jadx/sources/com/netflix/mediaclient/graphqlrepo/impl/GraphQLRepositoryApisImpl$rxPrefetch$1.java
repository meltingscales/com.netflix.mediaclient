package com.netflix.mediaclient.graphqlrepo.impl;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCO;
import o.dpR;
import o.drM;

/* JADX INFO: Add missing generic type declarations: [Q] */
/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$rxPrefetch$1<Q> extends SuspendLambda implements drM<InterfaceC8585dra<? super C8954gU<Q>>, Object> {
    final /* synthetic */ QueryMode a;
    final /* synthetic */ InterfaceC8999hM<Q> b;
    final /* synthetic */ RequestPriority c;
    int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ aCO j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLRepositoryApisImpl$rxPrefetch$1(aCO aco, InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$rxPrefetch$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.j = aco;
        this.b = interfaceC8999hM;
        this.a = queryMode;
        this.c = requestPriority;
        this.e = z;
    }

    @Override // o.drM
    /* renamed from: b */
    public final Object invoke(InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        return ((GraphQLRepositoryApisImpl$rxPrefetch$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLRepositoryApisImpl$rxPrefetch$1(this.j, this.b, this.a, this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            aCO aco = this.j;
            InterfaceC8999hM<Q> interfaceC8999hM = this.b;
            QueryMode queryMode = this.a;
            RequestPriority requestPriority = this.c;
            boolean z = this.e;
            this.d = 1;
            obj = aco.d(interfaceC8999hM, queryMode, requestPriority, z, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
