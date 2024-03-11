package com.netflix.mediaclient.ui.search.napa;

import com.netflix.model.leafs.SearchPageEntity;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3378axp;
import o.C6089cTl;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.GF;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.aDB;
import o.bZI;
import o.cRP;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class SearchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super C6089cTl>, C6089cTl, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    private /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cRP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1(InterfaceC8585dra interfaceC8585dra, cRP crp) {
        super(3, interfaceC8585dra);
        this.e = crp;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: d */
    public final Object invoke(dyQ<? super C6089cTl> dyq, C6089cTl c6089cTl, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        SearchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1 searchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1 = new SearchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1(interfaceC8585dra, this.e);
        searchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1.c = dyq;
        searchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1.d = c6089cTl;
        return searchResultsOnNapaPresenter$observeLiveState$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Set W;
        Lazy lazy;
        aDB adb;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq = (dyQ) this.c;
            C6089cTl c6089cTl = (C6089cTl) this.d;
            Map<String, SearchPageEntity> o2 = c6089cTl.o();
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, SearchPageEntity>> it = o2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, SearchPageEntity> next = it.next();
                Integer c = C8632dsu.c((Object) next.getValue().getEntityType(), (Object) C3378axp.e.d().b()) ? C8589dre.c(Integer.parseInt(next.getKey())) : null;
                if (c != null) {
                    arrayList.add(c);
                }
            }
            W = C8576dqs.W(arrayList);
            lazy = this.e.i;
            Object obj2 = lazy.get();
            C8632dsu.a(obj2, "");
            bZI bzi = (bZI) obj2;
            adb = this.e.d;
            dyS a = dyR.a(dyR.a(dyR.b(bZI.d.e(bzi, W, adb.b(), false, 4, null), new SearchResultsOnNapaPresenter$observeLiveState$1$1$1(this.e, c6089cTl, null)), GF.d()), (drX) new SearchResultsOnNapaPresenter$observeLiveState$1$1$2(this.e, null));
            this.a = 1;
            if (dyR.e(dyq, a, this) == e) {
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
