package com.apollographql.apollo3;

import com.apollographql.apollo3.exception.ApolloException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class ApolloClient$executeAsFlow$1$1<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    int b;

    public ApolloClient$executeAsFlow$1$1(InterfaceC8585dra<? super ApolloClient$executeAsFlow$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloClient$executeAsFlow$1$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloClient$executeAsFlow$1$1 apolloClient$executeAsFlow$1$1 = new ApolloClient$executeAsFlow$1$1(interfaceC8585dra);
        apolloClient$executeAsFlow$1$1.a = obj;
        return apolloClient$executeAsFlow$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            ApolloException apolloException = ((C8954gU) this.a).a;
            if (apolloException != null) {
                C8632dsu.d(apolloException);
                throw apolloException;
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
