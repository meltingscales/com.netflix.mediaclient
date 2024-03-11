package com.netflix.mediaclient.graphqlrepo.impl;

import com.apollographql.apollo3.exception.CacheMissException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8942gI;
import o.C8954gU;
import o.InterfaceC1471aCn;
import o.InterfaceC8585dra;
import o.aCO;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [Q] */
/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1<Q> extends SuspendLambda implements drX<C8954gU<Q>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8942gI<Q> a;
    final /* synthetic */ aCO b;
    int c;
    final /* synthetic */ String d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1(aCO aco, C8942gI<Q> c8942gI, String str, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = aco;
        this.a = c8942gI;
        this.d = str;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(C8954gU<Q> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1 graphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1 = new GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1(this.b, this.a, this.d, interfaceC8585dra);
        graphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1.e = obj;
        return graphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1471aCn interfaceC1471aCn;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            C8954gU c8954gU = (C8954gU) this.e;
            if (!(c8954gU.a instanceof CacheMissException)) {
                interfaceC1471aCn = this.b.b;
                interfaceC1471aCn.b(this.a, c8954gU, this.d);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
