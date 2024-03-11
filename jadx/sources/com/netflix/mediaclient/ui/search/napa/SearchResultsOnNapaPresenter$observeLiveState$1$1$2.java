package com.netflix.mediaclient.ui.search.napa;

import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6089cTl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.cRP;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
final class SearchResultsOnNapaPresenter$observeLiveState$1$1$2 extends SuspendLambda implements drX<C6089cTl, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cRP a;
    int b;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaPresenter$observeLiveState$1$1$2(cRP crp, InterfaceC8585dra<? super SearchResultsOnNapaPresenter$observeLiveState$1$1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = crp;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(C6089cTl c6089cTl, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SearchResultsOnNapaPresenter$observeLiveState$1$1$2) create(c6089cTl, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SearchResultsOnNapaPresenter$observeLiveState$1$1$2 searchResultsOnNapaPresenter$observeLiveState$1$1$2 = new SearchResultsOnNapaPresenter$observeLiveState$1$1$2(this.a, interfaceC8585dra);
        searchResultsOnNapaPresenter$observeLiveState$1$1$2.e = obj;
        return searchResultsOnNapaPresenter$observeLiveState$1$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchResultsOnNapaUIView searchResultsOnNapaUIView;
        long j;
        C6089cTl a;
        SearchResultsOnNapaUIView searchResultsOnNapaUIView2;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            C6089cTl c6089cTl = (C6089cTl) this.e;
            searchResultsOnNapaUIView = this.a.m;
            if (searchResultsOnNapaUIView.f().getVisibility() != 0) {
                long b = c6089cTl.b();
                j = this.a.f;
                if (b == j) {
                    cRP crp = this.a;
                    a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                    crp.g = a;
                    searchResultsOnNapaUIView2 = this.a.m;
                    searchResultsOnNapaUIView2.a(c6089cTl);
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
