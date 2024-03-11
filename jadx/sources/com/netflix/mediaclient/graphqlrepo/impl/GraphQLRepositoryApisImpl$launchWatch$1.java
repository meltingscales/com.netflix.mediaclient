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
public final class GraphQLRepositoryApisImpl$launchWatch$1<Q> extends SuspendLambda implements drX<C8954gU<Q>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    /* synthetic */ Object b;
    int c;
    final /* synthetic */ C8942gI<Q> d;
    final /* synthetic */ aCO e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLRepositoryApisImpl$launchWatch$1(aCO aco, C8942gI<Q> c8942gI, String str, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$launchWatch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = aco;
        this.d = c8942gI;
        this.a = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C8954gU<Q> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLRepositoryApisImpl$launchWatch$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLRepositoryApisImpl$launchWatch$1 graphQLRepositoryApisImpl$launchWatch$1 = new GraphQLRepositoryApisImpl$launchWatch$1(this.e, this.d, this.a, interfaceC8585dra);
        graphQLRepositoryApisImpl$launchWatch$1.b = obj;
        return graphQLRepositoryApisImpl$launchWatch$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1471aCn interfaceC1471aCn;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            C8954gU c8954gU = (C8954gU) this.b;
            if (!(c8954gU.a instanceof CacheMissException)) {
                interfaceC1471aCn = this.e.b;
                interfaceC1471aCn.b(this.d, c8954gU, this.a);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
