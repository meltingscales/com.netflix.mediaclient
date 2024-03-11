package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import com.netflix.mediaclient.ui.offline.DownloadsListController;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7258csn;
import o.AbstractC7259cso;
import o.AbstractC7260csp;
import o.C7357cug;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.dpR;

/* renamed from: o.cug  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7357cug extends OfflineFragmentV2 {
    private C7232csN k;
    private DownloadsListController<? super C7266csv> n;
    private String p;
    private Boolean r;
    private a t;
    public static final e e = new e(null);
    public static final int b = 8;
    private final d l = new d();
    private final boolean q = true;

    /* renamed from: o  reason: collision with root package name */
    private final AppView f13777o = AppView.cachedVideos;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.f13777o;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public InteractiveTrackerInterface bi_() {
        return this.t;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.q;
    }

    /* renamed from: o.cug$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("OfflineTopFragmentV2");
        }
    }

    /* renamed from: o.cug$d */
    /* loaded from: classes4.dex */
    public static final class d implements DownloadsListController.b {
        d() {
        }

        @Override // com.netflix.mediaclient.ui.offline.DownloadsListController.b
        public void c(List<String> list) {
            C8632dsu.c((Object) list, "");
            FragmentManager fragmentManager = C7357cug.this.getFragmentManager();
            if (fragmentManager != null) {
                View$OnClickListenerC7404cva.c.d(list).show(fragmentManager, "DownloadedForYouOptInDialog");
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = new C7232csN(by_(), R());
        if (bundle != null) {
            this.r = Boolean.valueOf(bundle.getBoolean("show_only_current_profile"));
        }
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        if (bo_()) {
            C1645aIz.a(by_(), new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTopFragmentV2$onCreateView$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    c(serviceManager);
                    return dpR.c;
                }

                public final void c(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    FragmentActivity activity = C7357cug.this.getActivity();
                    if (activity != null) {
                        C7357cug c7357cug = C7357cug.this;
                        ImageLoader requireImageLoader = NetflixActivity.requireImageLoader(activity);
                        C8632dsu.a(requireImageLoader, "");
                        c7357cug.t = new C7357cug.a(requireImageLoader);
                    }
                }
            });
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        RecyclerView Q = Q();
        if (Q != null) {
            InterfaceC1659aJm.b.e().c(Q, bx_(), "downloads_scroll");
        }
        CompositeDisposable compositeDisposable = this.f;
        C7232csN c7232csN = this.k;
        if (c7232csN == null) {
            C8632dsu.d("");
            c7232csN = null;
        }
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(c7232csN.b(), (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTopFragmentV2$onViewCreated$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                e(dpr);
                return dpR.c;
            }

            public final void e(dpR dpr) {
                C8632dsu.c((Object) dpr, "");
                C7357cug.this.d(true);
            }
        }, 3, (Object) null));
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void J() {
        C7232csN c7232csN = this.k;
        if (c7232csN == null) {
            C8632dsu.d("");
            c7232csN = null;
        }
        c7232csN.c(e());
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public int F() {
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        if (downloadsListController != null) {
            return downloadsListController.getSelectedItemsCount();
        }
        return 0;
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public boolean e() {
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        return downloadsListController != null && downloadsListController.getHasVideos();
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void G() {
        ServiceManager serviceManager;
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        InterfaceC4208baF interfaceC4208baF = null;
        List<AbstractC7258csn<?>> selectedItems = downloadsListController != null ? downloadsListController.getSelectedItems() : null;
        NetflixActivity bj_ = bj_();
        if (bj_ != null && (serviceManager = bj_.getServiceManager()) != null) {
            interfaceC4208baF = serviceManager.t();
        }
        C9726vo.d(selectedItems, interfaceC4208baF, new drX<List<? extends AbstractC7258csn<?>>, InterfaceC4208baF, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTopFragmentV2$deleteSelected$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(List<? extends AbstractC7258csn<?>> list, InterfaceC4208baF interfaceC4208baF2) {
                b(list, interfaceC4208baF2);
                return dpR.c;
            }

            public final void b(List<? extends AbstractC7258csn<?>> list, InterfaceC4208baF interfaceC4208baF2) {
                int d2;
                C8632dsu.c((Object) list, "");
                C8632dsu.c((Object) interfaceC4208baF2, "");
                C7357cug c7357cug = C7357cug.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    AbstractC7258csn abstractC7258csn = (AbstractC7258csn) it.next();
                    if (abstractC7258csn instanceof AbstractC7259cso) {
                        List<AbstractC7259cso.e> k = ((AbstractC7259cso) abstractC7258csn).k();
                        d2 = C8572dqo.d(k, 10);
                        ArrayList arrayList = new ArrayList(d2);
                        for (AbstractC7259cso.e eVar : k) {
                            arrayList.add(eVar.e());
                        }
                        interfaceC4208baF2.e(arrayList);
                        DownloadButton.e(arrayList);
                    } else if (abstractC7258csn instanceof AbstractC7260csp) {
                        AbstractC7260csp abstractC7260csp = (AbstractC7260csp) abstractC7258csn;
                        interfaceC4208baF2.d(abstractC7260csp.w());
                        DownloadButton.c(abstractC7260csp.w());
                    }
                    c7357cug.d(false);
                }
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void N() {
        NetflixActivity by_ = by_();
        InterfaceC5283bvo a2 = C8126deW.a(by_());
        if (a2 != null) {
            DownloadsListController<? super C7266csv> downloadsListController = this.n;
            if (downloadsListController == null) {
                DownloadsListController.a aVar = DownloadsListController.Companion;
                Boolean bool = this.r;
                downloadsListController = aVar.c(by_, a2, bool != null ? bool.booleanValue() : a2.isKidsProfile(), P(), e(by_), this.l, R(), C9935zP.b.d(this).d());
                downloadsListController.getAdapter().registerAdapterDataObserver(new b(by_));
            }
            RecyclerView Q = Q();
            if (Q != null) {
                Q.setAdapter(downloadsListController.getAdapter());
            }
            C8632dsu.d(downloadsListController);
            downloadsListController.setData(I(), S());
            this.n = downloadsListController;
        }
    }

    /* renamed from: o.cug$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AdapterDataObserver {
        final /* synthetic */ NetflixActivity d;

        b(NetflixActivity netflixActivity) {
            this.d = netflixActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            C7357cug.this.bD_();
            this.d.invalidateOptionsMenu();
            RecyclerView Q = C7357cug.this.Q();
            if (Q != null) {
                Q.invalidateItemDecorations();
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public boolean L() {
        return !I().a().isEmpty();
    }

    /* renamed from: o.cug$c */
    /* loaded from: classes4.dex */
    public static final class c implements CachingSelectableController.e {
        final /* synthetic */ NetflixActivity e;

        c(NetflixActivity netflixActivity) {
            this.e = netflixActivity;
        }

        @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController.e
        public void c(boolean z) {
            C7357cug.this.d(z);
        }

        @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController.e
        public void e() {
            C7357cug.this.bD_();
            this.e.invalidateOptionsMenu();
        }
    }

    private final CachingSelectableController.e e(NetflixActivity netflixActivity) {
        return new c(netflixActivity);
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        if (downloadsListController != null) {
            downloadsListController.clearAllDropdowns();
        }
        super.onPause();
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void K() {
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        if (downloadsListController != null) {
            downloadsListController.setData(I(), S());
            bD_();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
                return;
            }
            return;
        }
        N();
    }

    private final C7266csv I() {
        InterfaceC5298bwC u = NetflixApplication.getInstance().u();
        C8632dsu.d(u);
        List<OfflineAdapterData> a2 = ((C7359cui) u).d().a();
        C8632dsu.a(a2, "");
        return new C7270csz(a2, ConnectivityUtils.n(requireContext()));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        C7232csN c7232csN;
        C7232csN c7232csN2 = this.k;
        if (c7232csN2 == null) {
            C8632dsu.d("");
            c7232csN = null;
        } else {
            c7232csN = c7232csN2;
        }
        boolean S = S();
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        C7263css.e(c7232csN, S, downloadsListController != null ? downloadsListController.getSelectedItems() : null, null, 4, null);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        d(menu, S());
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        DownloadsListController<? super C7266csv> downloadsListController = this.n;
        boolean z = true;
        this.r = Boolean.valueOf(downloadsListController != null && downloadsListController.getShowOnlyCurrentProfile());
        DownloadsListController<? super C7266csv> downloadsListController2 = this.n;
        if (downloadsListController2 == null || !downloadsListController2.getShowOnlyCurrentProfile()) {
            z = false;
        }
        bundle.putBoolean("show_only_current_profile", z);
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        DownloadsListController<? super C7266csv> downloadsListController;
        C8632dsu.c((Object) interfaceC5206buQ, "");
        String str = this.p;
        if (str == null || (downloadsListController = this.n) == null) {
            return;
        }
        downloadsListController.progressUpdated(str, interfaceC5206buQ);
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        a aVar = this.t;
        if (aVar != null) {
            aVar.d();
        }
        super.onDestroyView();
    }

    /* renamed from: o.cug$a */
    /* loaded from: classes4.dex */
    public static final class a extends bDE {
        public static final c b = new c(null);
        public static final int e = 8;
        private final ImageLoader a;

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return "downloads-latencyTracker";
        }

        public a(ImageLoader imageLoader) {
            C8632dsu.c((Object) imageLoader, "");
            this.a = imageLoader;
            imageLoader.b(this);
        }

        /* renamed from: o.cug$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends C1045Mp {
            public /* synthetic */ c(C8627dsp c8627dsp) {
                this();
            }

            private c() {
                super("DetailsPageImageTracker");
            }
        }

        public final void d() {
            this.a.e(this);
        }

        @Override // o.bDE
        public boolean a(Activity activity) {
            if (activity instanceof NetflixActivity) {
                return ((NetflixActivity) activity).getFragmentHelper().c() instanceof OfflineFragmentV2;
            }
            return false;
        }
    }
}
