package com.netflix.mediaclient.ui.search.napa;

import com.netflix.android.org.json.zip.JSONzip;
import dagger.Lazy;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6089cTl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bZI;
import o.bZK;
import o.cRP;
import o.dpR;
import o.drX;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
final class SearchResultsOnNapaPresenter$observeLiveState$1$1$1 extends SuspendLambda implements drX<bZK, InterfaceC8585dra<? super dyS<? extends C6089cTl>>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ cRP c;
    int d;
    final /* synthetic */ C6089cTl e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaPresenter$observeLiveState$1$1$1(cRP crp, C6089cTl c6089cTl, InterfaceC8585dra<? super SearchResultsOnNapaPresenter$observeLiveState$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = crp;
        this.e = c6089cTl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SearchResultsOnNapaPresenter$observeLiveState$1$1$1 searchResultsOnNapaPresenter$observeLiveState$1$1$1 = new SearchResultsOnNapaPresenter$observeLiveState$1$1$1(this.c, this.e, interfaceC8585dra);
        searchResultsOnNapaPresenter$observeLiveState$1$1$1.a = obj;
        return searchResultsOnNapaPresenter$observeLiveState$1$1$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(bZK bzk, InterfaceC8585dra<? super dyS<C6089cTl>> interfaceC8585dra) {
        return ((SearchResultsOnNapaPresenter$observeLiveState$1$1$1) create(bzk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        bZK bzk;
        C6089cTl a;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            bZK bzk2 = (bZK) this.a;
            lazy = this.c.i;
            Set<String> b = bzk2.b();
            this.a = bzk2;
            this.d = 1;
            if (((bZI) lazy.get()).c(b, this) == e) {
                return e;
            }
            bzk = bzk2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            bzk = (bZK) this.a;
        }
        a = r4.a((r27 & 1) != 0 ? r4.i : null, (r27 & 2) != 0 ? r4.b : false, (r27 & 4) != 0 ? r4.m : null, (r27 & 8) != 0 ? r4.f : null, (r27 & 16) != 0 ? r4.g : null, (r27 & 32) != 0 ? r4.h : null, (r27 & 64) != 0 ? r4.c : null, (r27 & 128) != 0 ? r4.e : null, (r27 & JSONzip.end) != 0 ? r4.j : null, (r27 & 512) != 0 ? r4.a : bzk, (r27 & 1024) != 0 ? this.e.d : 0L);
        return dyR.c(a);
    }
}
