package com.netflix.mediaclient.graphqlrepo.impl;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8990hD;
import o.aCO;
import o.dpR;
import o.drM;

/* JADX INFO: Add missing generic type declarations: [M] */
/* JADX WARN: Incorrect field signature: TM; */
/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$rxMutate$1<M> extends SuspendLambda implements drM<InterfaceC8585dra<? super C8954gU<M>>, Object> {
    final /* synthetic */ InterfaceC8990hD<M> a;
    final /* synthetic */ RequestPriority b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ InterfaceC8990hD.b e;
    final /* synthetic */ aCO f;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lo/aCO;Lo/hD<TM;>;TM;ZLcom/netflix/mediaclient/graphqlplatform/api/client/fetcher/RequestPriority;ZLo/dra<-Lcom/netflix/mediaclient/graphqlrepo/impl/GraphQLRepositoryApisImpl$rxMutate$1;>;)V */
    public GraphQLRepositoryApisImpl$rxMutate$1(aCO aco, InterfaceC8990hD interfaceC8990hD, InterfaceC8990hD.b bVar, boolean z, RequestPriority requestPriority, boolean z2, InterfaceC8585dra interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.f = aco;
        this.a = interfaceC8990hD;
        this.e = bVar;
        this.d = z;
        this.b = requestPriority;
        this.c = z2;
    }

    @Override // o.drM
    /* renamed from: a */
    public final Object invoke(InterfaceC8585dra<? super C8954gU<M>> interfaceC8585dra) {
        return ((GraphQLRepositoryApisImpl$rxMutate$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLRepositoryApisImpl$rxMutate$1(this.f, this.a, this.e, this.d, this.b, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.h;
        if (i == 0) {
            C8556dpz.d(obj);
            aCO aco = this.f;
            InterfaceC8990hD<M> interfaceC8990hD = this.a;
            InterfaceC8990hD.b bVar = this.e;
            boolean z = this.d;
            RequestPriority requestPriority = this.b;
            boolean z2 = this.c;
            this.h = 1;
            obj = aco.c((InterfaceC8990hD<InterfaceC8990hD<M>>) interfaceC8990hD, (InterfaceC8990hD<M>) bVar, z, requestPriority, z2, (InterfaceC8585dra<? super C8954gU<InterfaceC8990hD<M>>>) this);
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
