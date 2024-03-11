package com.netflix.mediaclient.graphqlrepo.impl.client;

import com.apollographql.apollo3.cache.normalized.FetchPolicy;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8942gI;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC1471aCn;
import o.InterfaceC1474aCq;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes3.dex */
public final class ApolloCallKt$watchWithExpiry$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC1474aCq a;
    int b;
    final /* synthetic */ InterfaceC1471aCn c;
    final /* synthetic */ C8942gI<D> d;
    final /* synthetic */ String e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCallKt$watchWithExpiry$1(InterfaceC1474aCq interfaceC1474aCq, InterfaceC1471aCn interfaceC1471aCn, String str, C8942gI<D> c8942gI, InterfaceC8585dra<? super ApolloCallKt$watchWithExpiry$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC1474aCq;
        this.c = interfaceC1471aCn;
        this.e = str;
        this.d = c8942gI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCallKt$watchWithExpiry$1 apolloCallKt$watchWithExpiry$1 = new ApolloCallKt$watchWithExpiry$1(this.a, this.c, this.e, this.d, interfaceC8585dra);
        apolloCallKt$watchWithExpiry$1.i = obj;
        return apolloCallKt$watchWithExpiry$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCallKt$watchWithExpiry$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyQ dyq = (dyQ) this.i;
            this.a.d();
            this.c.c(this.e, this.a);
            final dyS b = C9083ir.b((C8942gI) C9083ir.d(this.d, FetchPolicy.a));
            dyS a = dyR.a(b, 1);
            final InterfaceC1471aCn interfaceC1471aCn = this.c;
            final String str = this.e;
            final InterfaceC1474aCq interfaceC1474aCq = this.a;
            dyQ dyq2 = new dyQ() { // from class: com.netflix.mediaclient.graphqlrepo.impl.client.ApolloCallKt$watchWithExpiry$1.5
                @Override // o.dyQ
                /* renamed from: d */
                public final Object emit(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e2;
                    Object e3;
                    if (C9083ir.c(c8954gU)) {
                        InterfaceC1471aCn.this.a(str, interfaceC1474aCq);
                        Object e4 = dyR.e(dyq, b, interfaceC8585dra);
                        e3 = C8586drb.e();
                        return e4 == e3 ? e4 : dpR.c;
                    }
                    Object e5 = dyR.e(dyq, b, interfaceC8585dra);
                    e2 = C8586drb.e();
                    return e5 == e2 ? e5 : dpR.c;
                }
            };
            this.b = 1;
            if (a.collect(dyq2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
