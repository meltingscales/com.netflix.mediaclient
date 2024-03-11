package com.netflix.mediaclient.graphqlrepo.impl.client.cache;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC9055iP;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C9083ir;
import o.InterfaceC8585dra;
import o.InterfaceC9080io;
import o.aCW;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    int d;
    final /* synthetic */ aCW e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1(aCW acw, String str, InterfaceC8585dra<? super GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = acw;
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1(this.e, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC9080io d = C9083ir.d(this.e.c());
            final String str = this.a;
            drM<AbstractC9055iP, dpR> drm = new drM<AbstractC9055iP, dpR>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.client.cache.GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(AbstractC9055iP abstractC9055iP) {
                    C8632dsu.c((Object) abstractC9055iP, "");
                    abstractC9055iP.a(str);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC9055iP abstractC9055iP) {
                    e(abstractC9055iP);
                    return dpR.c;
                }
            };
            this.d = 1;
            if (d.a(drm, this) == e) {
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
