package com.netflix.mediaclient.ui.home.impl.lolomo;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bTF;
import o.bZI;
import o.bZK;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1 extends SuspendLambda implements drX<bZK, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    /* synthetic */ Object d;
    final /* synthetic */ bTF e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1(bTF btf, InterfaceC8585dra<? super GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = btf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1 graphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1 = new GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1(this.e, interfaceC8585dra);
        graphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1.d = obj;
        return graphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLLolomoViewModel$observeLiveState$2$allVideosWithoutBillboardFetch$1) create(bzk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        bZI bzi;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            bzi = this.e.n;
            Set<String> b = ((bZK) this.d).b();
            this.a = 1;
            if (bzi.c(b, this) == e) {
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
