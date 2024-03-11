package com.netflix.mediaclient.graphqlrepo.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [O] */
/* loaded from: classes3.dex */
public final class GraphQLRepositoryApisImpl$customRxSingle$1<O> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C8954gU<O>>, Object> {
    final /* synthetic */ drM<InterfaceC8585dra<? super C8954gU<O>>, Object> a;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLRepositoryApisImpl$customRxSingle$1(drM<? super InterfaceC8585dra<? super C8954gU<O>>, ? extends Object> drm, InterfaceC8585dra<? super GraphQLRepositoryApisImpl$customRxSingle$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLRepositoryApisImpl$customRxSingle$1(this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C8954gU<O>> interfaceC8585dra) {
        return ((GraphQLRepositoryApisImpl$customRxSingle$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            drM<InterfaceC8585dra<? super C8954gU<O>>, Object> drm = this.a;
            this.d = 1;
            obj = drm.invoke(this);
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
