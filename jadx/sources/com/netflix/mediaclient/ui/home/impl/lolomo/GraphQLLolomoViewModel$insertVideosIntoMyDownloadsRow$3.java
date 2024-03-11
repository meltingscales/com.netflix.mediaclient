package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC7233csO;
import o.C4049bUi;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3 extends SuspendLambda implements InterfaceC8612dsa<C4049bUi, AbstractC7233csO, InterfaceC8585dra<? super C4049bUi>, Object> {
    int c;
    /* synthetic */ Object e;

    public GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3(InterfaceC8585dra<? super GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3> interfaceC8585dra) {
        super(3, interfaceC8585dra);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: c */
    public final Object invoke(C4049bUi c4049bUi, AbstractC7233csO abstractC7233csO, InterfaceC8585dra<? super C4049bUi> interfaceC8585dra) {
        GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3 graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3 = new GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3(interfaceC8585dra);
        graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3.e = c4049bUi;
        return graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            return (C4049bUi) this.e;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
