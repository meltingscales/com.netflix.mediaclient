package com.apollographql.apollo3.cache.normalized.internal;

import com.apollographql.apollo3.exception.ApolloException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
final class ApolloCacheInterceptor$interceptMutation$1$networkResponses$1<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object b;
    int d;
    final /* synthetic */ Ref.ObjectRef<ApolloException> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$interceptMutation$1$networkResponses$1(Ref.ObjectRef<ApolloException> objectRef, InterfaceC8585dra<? super ApolloCacheInterceptor$interceptMutation$1$networkResponses$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCacheInterceptor$interceptMutation$1$networkResponses$1 apolloCacheInterceptor$interceptMutation$1$networkResponses$1 = new ApolloCacheInterceptor$interceptMutation$1$networkResponses$1(this.e, interfaceC8585dra);
        apolloCacheInterceptor$interceptMutation$1$networkResponses$1.b = obj;
        return apolloCacheInterceptor$interceptMutation$1$networkResponses$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$interceptMutation$1$networkResponses$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.apollographql.apollo3.exception.ApolloException, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            this.e.d = ((C8954gU) this.b).a;
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
