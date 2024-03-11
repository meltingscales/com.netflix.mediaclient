package com.apollographql.apollo3.cache.normalized;

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
final class FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ Ref.ObjectRef<ApolloException> b;
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1(Ref.ObjectRef<ApolloException> objectRef, InterfaceC8585dra<? super FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = objectRef;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1 fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1 = new FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1(this.b, interfaceC8585dra);
        fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1.a = obj;
        return fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.apollographql.apollo3.exception.ApolloException, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            ?? r3 = ((C8954gU) this.a).a;
            if (r3 != 0) {
                Ref.ObjectRef<ApolloException> objectRef = this.b;
                if (objectRef.d == null) {
                    objectRef.d = r3;
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
