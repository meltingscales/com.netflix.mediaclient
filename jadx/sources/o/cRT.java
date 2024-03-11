package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa;
import com.netflix.model.leafs.SearchSectionSummary;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.AbstractC6078cTd;
import o.AbstractC6094cTq;
import o.C6089cTl;
import o.C8632dsu;
import o.InterfaceC5272bvd;
import o.cRC;
import o.cRT;
import o.dpR;

/* loaded from: classes4.dex */
public final class cRT extends AbstractC9940zU<AbstractC6078cTd, AbstractC6078cTd> {
    public static final c d = new c(null);
    private final String a;
    private C6089cTl b;
    private final Observable<dpR> c;
    private final String e;
    private final InterfaceC6086cTi h;
    private final SearchUIViewOnNapa i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cRT(Observable<AbstractC6078cTd> observable, SearchUIViewOnNapa searchUIViewOnNapa, InterfaceC6086cTi interfaceC6086cTi, Observable<dpR> observable2, String str, String str2) {
        super(observable, searchUIViewOnNapa);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) searchUIViewOnNapa, "");
        C8632dsu.c((Object) interfaceC6086cTi, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.i = searchUIViewOnNapa;
        this.h = interfaceC6086cTi;
        this.c = observable2;
        this.a = str;
        this.e = str2;
        b(str, str2, false);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SearchSuggestionPresenter_Ab22078");
        }
    }

    @SuppressLint({"CheckResult"})
    private final void b(String str, String str2, boolean z) {
        this.i.z();
        TaskMode taskMode = z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK;
        InterfaceC6086cTi interfaceC6086cTi = this.h;
        Context context = this.i.r().getContext();
        C8632dsu.a(context, "");
        Observable<AbstractC6078cTd> takeUntil = interfaceC6086cTi.b(str, str2, 0L, taskMode, context).observeOn(AndroidSchedulers.mainThread()).takeUntil(this.c);
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaPresenter$fetchSearchEntity$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                SearchUIViewOnNapa searchUIViewOnNapa;
                SearchUIViewOnNapa searchUIViewOnNapa2;
                SearchUIViewOnNapa searchUIViewOnNapa3;
                C8632dsu.c((Object) th, "");
                searchUIViewOnNapa = cRT.this.i;
                searchUIViewOnNapa.u();
                searchUIViewOnNapa2 = cRT.this.i;
                searchUIViewOnNapa2.c();
                searchUIViewOnNapa3 = cRT.this.i;
                searchUIViewOnNapa3.k();
            }
        }, (drO) null, new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaPresenter$fetchSearchEntity$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                e(abstractC6078cTd);
                return dpR.c;
            }

            public final void e(AbstractC6078cTd abstractC6078cTd) {
                SearchUIViewOnNapa searchUIViewOnNapa;
                SearchUIViewOnNapa searchUIViewOnNapa2;
                SearchUIViewOnNapa searchUIViewOnNapa3;
                SearchUIViewOnNapa searchUIViewOnNapa4;
                SearchUIViewOnNapa searchUIViewOnNapa5;
                SearchUIViewOnNapa searchUIViewOnNapa6;
                SearchUIViewOnNapa searchUIViewOnNapa7;
                C6089cTl c6089cTl;
                SearchUIViewOnNapa searchUIViewOnNapa8;
                SearchUIViewOnNapa searchUIViewOnNapa9;
                SearchUIViewOnNapa searchUIViewOnNapa10;
                SearchUIViewOnNapa searchUIViewOnNapa11;
                SearchUIViewOnNapa searchUIViewOnNapa12;
                SearchUIViewOnNapa searchUIViewOnNapa13;
                SearchUIViewOnNapa searchUIViewOnNapa14;
                if (abstractC6078cTd instanceof AbstractC6078cTd.C) {
                    searchUIViewOnNapa7 = cRT.this.i;
                    C8632dsu.d(abstractC6078cTd);
                    searchUIViewOnNapa7.b((SearchUIViewOnNapa) abstractC6078cTd);
                    List<InterfaceC5272bvd> searchSections = ((AbstractC6078cTd.C) abstractC6078cTd).d().getSearchSections();
                    cRT.this.b = new C6089cTl(new ArrayList(), false, new LinkedHashMap(), new LinkedHashMap(), null, new LinkedHashMap(), null, null, AbstractC6094cTq.a.e, null, 0L, 528, null);
                    c6089cTl = cRT.this.b;
                    if (c6089cTl != null) {
                        cRT crt = cRT.this;
                        cRC.b bVar = cRC.c;
                        List<SearchSectionSummary> c2 = bVar.c(searchSections);
                        if (c2 == null) {
                            searchUIViewOnNapa14 = crt.i;
                            searchUIViewOnNapa14.b((SearchUIViewOnNapa) AbstractC6078cTd.g.e);
                        } else if (c2.isEmpty() && c6089cTl.h().isEmpty()) {
                            searchUIViewOnNapa11 = crt.i;
                            searchUIViewOnNapa11.u();
                            searchUIViewOnNapa12 = crt.i;
                            searchUIViewOnNapa12.c();
                            searchUIViewOnNapa13 = crt.i;
                            searchUIViewOnNapa13.k();
                        } else {
                            bVar.b(searchSections, c2, c6089cTl);
                            searchUIViewOnNapa8 = crt.i;
                            searchUIViewOnNapa8.a(c6089cTl);
                            searchUIViewOnNapa9 = crt.i;
                            searchUIViewOnNapa9.b((SearchUIViewOnNapa) AbstractC6078cTd.u.c);
                            searchUIViewOnNapa10 = crt.i;
                            searchUIViewOnNapa10.u();
                        }
                    }
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.C6079a) {
                    searchUIViewOnNapa4 = cRT.this.i;
                    searchUIViewOnNapa4.u();
                    searchUIViewOnNapa5 = cRT.this.i;
                    searchUIViewOnNapa5.c();
                    searchUIViewOnNapa6 = cRT.this.i;
                    searchUIViewOnNapa6.k();
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.C6080b) {
                    searchUIViewOnNapa = cRT.this.i;
                    searchUIViewOnNapa.u();
                    searchUIViewOnNapa2 = cRT.this.i;
                    searchUIViewOnNapa2.c();
                    searchUIViewOnNapa3 = cRT.this.i;
                    searchUIViewOnNapa3.k();
                }
            }
        }, 2, (Object) null);
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC6078cTd abstractC6078cTd) {
        C8632dsu.c((Object) abstractC6078cTd, "");
        if (abstractC6078cTd instanceof AbstractC6078cTd.x) {
            b(this.a, this.e, true);
        }
    }
}
