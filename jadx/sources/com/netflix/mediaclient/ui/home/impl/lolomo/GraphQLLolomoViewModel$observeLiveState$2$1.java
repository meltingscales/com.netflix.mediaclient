package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.bZK;
import o.dpR;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$observeLiveState$2$1 extends SuspendLambda implements InterfaceC8612dsa<bZK, bZK, InterfaceC8585dra<? super bZK>, Object> {
    /* synthetic */ Object b;
    int c;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GraphQLLolomoViewModel$observeLiveState$2$1(InterfaceC8585dra<? super GraphQLLolomoViewModel$observeLiveState$2$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: c */
    public final Object invoke(bZK bzk, bZK bzk2, InterfaceC8585dra<? super bZK> interfaceC8585dra) {
        GraphQLLolomoViewModel$observeLiveState$2$1 graphQLLolomoViewModel$observeLiveState$2$1 = new GraphQLLolomoViewModel$observeLiveState$2$1(interfaceC8585dra);
        graphQLLolomoViewModel$observeLiveState$2$1.e = bzk;
        graphQLLolomoViewModel$observeLiveState$2$1.b = bzk2;
        return graphQLLolomoViewModel$observeLiveState$2$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            return ((bZK) this.b).a((bZK) this.e);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
