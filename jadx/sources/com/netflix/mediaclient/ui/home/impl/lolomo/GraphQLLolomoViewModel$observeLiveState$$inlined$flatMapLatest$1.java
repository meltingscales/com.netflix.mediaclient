package com.netflix.mediaclient.ui.home.impl.lolomo;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1888aRz;
import o.C2865aoD;
import o.C4049bUi;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.bTF;
import o.bTL;
import o.bZI;
import o.bZK;
import o.dpR;
import o.dqN;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super bZK>, C4049bUi, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    /* synthetic */ Object c;
    final /* synthetic */ bTF d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1(InterfaceC8585dra interfaceC8585dra, bTF btf) {
        super(3, interfaceC8585dra);
        this.d = btf;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: c */
    public final Object invoke(dyQ<? super bZK> dyq, C4049bUi c4049bUi, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1 graphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1 = new GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1(interfaceC8585dra, this.d);
        graphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1.e = dyq;
        graphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1.c = c4049bUi;
        return graphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        bZI bzi;
        Set<Integer> c;
        C2865aoD c2865aoD;
        bZI bzi2;
        Set b;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq = (dyQ) this.e;
            C4049bUi c4049bUi = (C4049bUi) this.c;
            bzi = this.d.n;
            c = this.d.c(c4049bUi);
            c2865aoD = this.d.b;
            C1888aRz.a aVar = C1888aRz.d;
            dyS a = dyR.a((dyS) bzi.c(c, c2865aoD, aVar.b()), (drX) new GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1(this.d, null));
            bTL c2 = c4049bUi.c();
            Integer c3 = c2 != null ? C8589dre.c(c2.b()) : null;
            bzi2 = this.d.n;
            b = dqN.b(c3);
            dyS a2 = dyR.a(dyR.d(a, bZI.d.e(bzi2, b, null, aVar.b(), 2, null), new GraphQLLolomoViewModel$observeLiveState$2$1(null)), (drX) new GraphQLLolomoViewModel$observeLiveState$2$2(this.d, null));
            this.a = 1;
            if (dyR.e(dyq, a2, this) == e) {
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
