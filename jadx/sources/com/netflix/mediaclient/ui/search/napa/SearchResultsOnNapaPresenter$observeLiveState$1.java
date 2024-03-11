package com.netflix.mediaclient.ui.search.napa;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8812dzl;
import o.cRP;
import o.dpR;
import o.drX;
import o.duI;
import o.duM;
import o.dwU;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class SearchResultsOnNapaPresenter$observeLiveState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cRP c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaPresenter$observeLiveState$1(cRP crp, InterfaceC8585dra<? super SearchResultsOnNapaPresenter$observeLiveState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = crp;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SearchResultsOnNapaPresenter$observeLiveState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SearchResultsOnNapaPresenter$observeLiveState$1(this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8812dzl interfaceC8812dzl;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC8812dzl = this.c.f13695o;
            duI.b bVar = duI.d;
            dyS c = dyR.c(dyR.e(interfaceC8812dzl, duM.a(1, DurationUnit.f)), (InterfaceC8612dsa) new SearchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.c));
            this.e = 1;
            if (dyR.a((dyS<?>) c, (InterfaceC8585dra<? super dpR>) this) == e) {
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
