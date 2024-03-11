package com.netflix.mediaclient.ui.search.napa;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC6086cTi;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SearchResultsOnNapaFrag$clearSearchCache$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ SearchResultsOnNapaFrag b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaFrag$clearSearchCache$1(SearchResultsOnNapaFrag searchResultsOnNapaFrag, InterfaceC8585dra<? super SearchResultsOnNapaFrag$clearSearchCache$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = searchResultsOnNapaFrag;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SearchResultsOnNapaFrag$clearSearchCache$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SearchResultsOnNapaFrag$clearSearchCache$1(this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC6086cTi interfaceC6086cTi;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC6086cTi = this.b.D;
            if (interfaceC6086cTi == null) {
                C8632dsu.d("");
                interfaceC6086cTi = null;
            }
            this.a = 1;
            if (interfaceC6086cTi.c(this) == e) {
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
