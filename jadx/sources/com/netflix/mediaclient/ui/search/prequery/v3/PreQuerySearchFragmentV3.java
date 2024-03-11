package com.netflix.mediaclient.ui.search.prequery.v3;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.ShowMoreCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.search.SearchActivity;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6048cSa;
import o.AbstractC6078cTd;
import o.C1045Mp;
import o.C1596aHd;
import o.C1645aIz;
import o.C6038cRr;
import o.C6051cSd;
import o.C6063cSp;
import o.C8150deu;
import o.C8627dsp;
import o.C8632dsu;
import o.C9867yA;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6083cTf;
import o.InterfaceC6086cTi;
import o.aDB;
import o.bDE;
import o.bNN;
import o.bZI;
import o.dpR;
import o.dqE;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class PreQuerySearchFragmentV3 extends AbstractC6048cSa {
    public static final a e = new a(null);
    @Inject
    public Lazy<bNN> gameModels;
    @Inject
    public aDB graphQLArtworkParams;
    private e k;
    @Inject
    public Lazy<bZI> liveStateManager;
    private InterfaceC6086cTi m;

    /* renamed from: o  reason: collision with root package name */
    private C6051cSd f13323o;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private C6063cSp s;
    @Inject
    public InterfaceC6083cTf searchRepositoryFactory;
    private final C9935zP n = C9935zP.b.d(this);
    private final c j = new c();
    private final boolean l = true;
    private final AppView b = AppView.preQuery;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public InteractiveTrackerInterface bi_() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.l;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PreQuerySearchFragmentV3");
        }
    }

    public final InterfaceC6083cTf G() {
        InterfaceC6083cTf interfaceC6083cTf = this.searchRepositoryFactory;
        if (interfaceC6083cTf != null) {
            return interfaceC6083cTf;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bZI> F() {
        Lazy<bZI> lazy = this.liveStateManager;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNN> e() {
        Lazy<bNN> lazy = this.gameModels;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> I() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final aDB a() {
        aDB adb = this.graphQLArtworkParams;
        if (adb != null) {
            return adb;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c implements SearchEpoxyController.b {
        c() {
        }

        @Override // com.netflix.mediaclient.ui.search.v2.SearchEpoxyController.b
        public bNN d() {
            bNN bnn = PreQuerySearchFragmentV3.this.e().get();
            C8632dsu.a(bnn, "");
            return bnn;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC6086cTi interfaceC6086cTi;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) layoutInflater, "");
        if (viewGroup == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("onCreateView container is null in PreQuerySearchFragmentV3", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return null;
        }
        if (bo_()) {
            C1645aIz.a(by_(), new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3$onCreateView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    e(serviceManager);
                    return dpR.c;
                }

                public final void e(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    PreQuerySearchFragmentV3 preQuerySearchFragmentV3 = PreQuerySearchFragmentV3.this;
                    ImageLoader requireImageLoader = NetflixActivity.requireImageLoader(preQuerySearchFragmentV3.requireActivity());
                    C8632dsu.a(requireImageLoader, "");
                    preQuerySearchFragmentV3.k = new PreQuerySearchFragmentV3.e(requireImageLoader);
                }
            });
        }
        C6063cSp d2 = d(viewGroup);
        this.s = d2;
        if ((d2 != null ? d2.e() : null) instanceof ViewGroup) {
            View e2 = d2 != null ? d2.e() : null;
            C8632dsu.d(e2);
            ((ViewGroup) e2).setTransitionGroup(true);
        }
        if (d2 != null) {
            CompositeDisposable compositeDisposable = this.f;
            Observable<AbstractC6078cTd> v = d2.v();
            final drM<AbstractC6078cTd, dpR> drm = new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3$onCreateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                    a(abstractC6078cTd);
                    return dpR.c;
                }

                public final void a(AbstractC6078cTd abstractC6078cTd) {
                    NetflixActivity bj_;
                    if (abstractC6078cTd instanceof AbstractC6078cTd.A) {
                        PreQuerySearchFragmentV3.this.d(((AbstractC6078cTd.A) abstractC6078cTd).b());
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.k) {
                        NetflixActivity bj_2 = PreQuerySearchFragmentV3.this.bj_();
                        SearchActivity searchActivity = bj_2 instanceof SearchActivity ? (SearchActivity) bj_2 : null;
                        if (searchActivity != null) {
                            searchActivity.c();
                        }
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.o) {
                        PreQuerySearchFragmentV3.this.M();
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.z) {
                        C6038cRr.e eVar = C6038cRr.e;
                        C8632dsu.d(abstractC6078cTd);
                        C6038cRr.e.b(eVar, (AbstractC6078cTd.z) abstractC6078cTd, PreQuerySearchFragmentV3.this.bj_(), "preQuerySearch", null, 8, null);
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.p) {
                        C6038cRr.e eVar2 = C6038cRr.e;
                        C8632dsu.d(abstractC6078cTd);
                        eVar2.a((AbstractC6078cTd.p) abstractC6078cTd, PreQuerySearchFragmentV3.this.I());
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.n) {
                        CLv2Utils.d(new ShowMoreCommand());
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.d) {
                        AbstractC6078cTd.d dVar2 = (AbstractC6078cTd.d) abstractC6078cTd;
                        CLv2Utils.INSTANCE.b(new Focus(AppView.categoryLabel, dVar2.d().g()), (Command) new SelectCommand(), false);
                        HomeActivity.e(PreQuerySearchFragmentV3.this.bj_(), dVar2.e());
                    } else if (abstractC6078cTd instanceof AbstractC6078cTd.j) {
                        C6038cRr.e eVar3 = C6038cRr.e;
                        C8632dsu.d(abstractC6078cTd);
                        eVar3.e((AbstractC6078cTd.j) abstractC6078cTd, PreQuerySearchFragmentV3.this.by_());
                    } else if (!(abstractC6078cTd instanceof AbstractC6078cTd.s) || (bj_ = PreQuerySearchFragmentV3.this.bj_()) == null) {
                    } else {
                        bj_.onScrolled(((AbstractC6078cTd.s) abstractC6078cTd).e());
                    }
                }
            };
            Disposable subscribe = v.subscribe(new Consumer() { // from class: o.cRX
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PreQuerySearchFragmentV3.a(drM.this, obj);
                }
            });
            C8632dsu.a(subscribe, "");
            DisposableKt.plusAssign(compositeDisposable, subscribe);
            this.m = G().d(this.n.d());
            Observable d3 = this.n.d(AbstractC6078cTd.class);
            InterfaceC6086cTi interfaceC6086cTi2 = this.m;
            if (interfaceC6086cTi2 == null) {
                C8632dsu.d("");
                interfaceC6086cTi = null;
            } else {
                interfaceC6086cTi = interfaceC6086cTi2;
            }
            this.f13323o = new C6051cSd(d3, d2, interfaceC6086cTi, this.n.d(), F(), LifecycleOwnerKt.getLifecycleScope(this), a());
            J();
        }
        if (d2 != null) {
            return d2.h();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final C6063cSp d(ViewGroup viewGroup) {
        C8632dsu.d(viewGroup);
        return new C6063cSp(viewGroup, AppView.preQuery, this.n, this.j);
    }

    public final void d(boolean z) {
        C6063cSp c6063cSp = this.s;
        if (c6063cSp == null) {
            return;
        }
        c6063cSp.d(z);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        e eVar = this.k;
        if (eVar != null) {
            eVar.d();
        }
        C6063cSp c6063cSp = this.s;
        if (c6063cSp != null) {
            c6063cSp.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        FragmentActivity activity = getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        if (currentFocus instanceof EditText) {
            C8150deu.b(getActivity(), (EditText) currentFocus);
        }
    }

    private final void J() {
        by_().getKeyboardState().c(new C9867yA.b() { // from class: o.cRZ
            @Override // o.C9867yA.b
            public final void onKeyboardStateChanged(boolean z) {
                PreQuerySearchFragmentV3.d(PreQuerySearchFragmentV3.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PreQuerySearchFragmentV3 preQuerySearchFragmentV3, boolean z) {
        C8632dsu.c((Object) preQuerySearchFragmentV3, "");
        C6063cSp c6063cSp = preQuerySearchFragmentV3.s;
        if (c6063cSp != null) {
            c6063cSp.e(z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bDE {
        public static final a e = new a(null);
        private final ImageLoader d;

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return "search-prequery-latencyTracker";
        }

        public e(ImageLoader imageLoader) {
            C8632dsu.c((Object) imageLoader, "");
            this.d = imageLoader;
            imageLoader.b(this);
        }

        /* loaded from: classes4.dex */
        public static final class a extends C1045Mp {
            public /* synthetic */ a(C8627dsp c8627dsp) {
                this();
            }

            private a() {
                super("PreQueryImageTracker");
            }
        }

        public final void d() {
            this.d.e(this);
        }

        @Override // o.bDE
        public boolean a(Activity activity) {
            return (activity instanceof SearchActivity) && (((SearchActivity) activity).getSupportFragmentManager().findFragmentByTag("PRE_QUERY_LIST") instanceof PreQuerySearchFragmentV3);
        }
    }
}
