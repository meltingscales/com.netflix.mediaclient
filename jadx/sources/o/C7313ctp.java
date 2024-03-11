package o;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.DownloadedEpisodesController;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C7186crU;
import o.C7313ctp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

/* renamed from: o.ctp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7313ctp extends OfflineFragmentV2 implements InterfaceC5091bsH {
    private String k;
    private String l;
    private C7263css n;

    /* renamed from: o  reason: collision with root package name */
    private DownloadedEpisodesController<? super C7186crU> f13771o;
    private String t;
    public static final c e = new c(null);
    public static final int b = 8;

    public final String I() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public boolean L() {
        return true;
    }

    /* renamed from: o.ctp$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("OfflineEpisodesFragmentV2");
        }

        public final C7313ctp a(String str) {
            C8632dsu.c((Object) str, "");
            Bundle bundle = new Bundle();
            bundle.putString("playable_id", str);
            C7313ctp c = c();
            c.setArguments(bundle);
            return c;
        }

        public final C7313ctp e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            Bundle bundle = new Bundle();
            bundle.putString("title_id", str);
            bundle.putString("profile_id", str2);
            C7313ctp c = c();
            c.setArguments(bundle);
            return c;
        }

        private final C7313ctp c() {
            return new C7313ctp();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = new C7232csN(by_(), R());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        CompositeDisposable compositeDisposable = this.f;
        C7263css c7263css = this.n;
        if (c7263css == null) {
            C8632dsu.d("");
            c7263css = null;
        }
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(c7263css.b(), (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineEpisodesFragmentV2$onViewCreated$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                c(dpr);
                return dpR.c;
            }

            public final void c(dpR dpr) {
                C8632dsu.c((Object) dpr, "");
                C7313ctp.this.d(true);
            }
        }, 3, (Object) null));
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void J() {
        C7263css c7263css = this.n;
        if (c7263css == null) {
            C8632dsu.d("");
            c7263css = null;
        }
        c7263css.c(e());
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public int F() {
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        if (downloadedEpisodesController != null) {
            return downloadedEpisodesController.getSelectedItemsCount();
        }
        return 0;
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void G() {
        List<AbstractC7258csn<?>> selectedItems;
        NetflixActivity bj_;
        ServiceManager serviceManager;
        InterfaceC4208baF t;
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        if (downloadedEpisodesController == null || (selectedItems = downloadedEpisodesController.getSelectedItems()) == null || (bj_ = bj_()) == null || (serviceManager = bj_.getServiceManager()) == null || (t = serviceManager.t()) == null) {
            return;
        }
        Iterator<T> it = selectedItems.iterator();
        while (it.hasNext()) {
            AbstractC7258csn abstractC7258csn = (AbstractC7258csn) it.next();
            if (abstractC7258csn instanceof AbstractC7260csp) {
                AbstractC7260csp abstractC7260csp = (AbstractC7260csp) abstractC7258csn;
                t.d(abstractC7260csp.w());
                DownloadButton.c(abstractC7260csp.w());
            }
        }
        d(false);
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public boolean e() {
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        return downloadedEpisodesController != null && downloadedEpisodesController.getHasVideos();
    }

    private final void c(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(str);
        }
        this.t = str;
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void N() {
        C9726vo.d(bj_(), this.k, this.l, new InterfaceC8612dsa<NetflixActivity, String, String, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineEpisodesFragmentV2$initAdapter$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(NetflixActivity netflixActivity, String str, String str2) {
                d(netflixActivity, str, str2);
                return dpR.c;
            }

            public final void d(NetflixActivity netflixActivity, String str, String str2) {
                DownloadedEpisodesController downloadedEpisodesController;
                String str3;
                C7186crU d2;
                CachingSelectableController.e a;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str2, "");
                downloadedEpisodesController = C7313ctp.this.f13771o;
                if (downloadedEpisodesController == null) {
                    DownloadedEpisodesController.a aVar = DownloadedEpisodesController.Companion;
                    OfflineFragmentV2.b P = C7313ctp.this.P();
                    a = C7313ctp.this.a(netflixActivity);
                    downloadedEpisodesController = DownloadedEpisodesController.a.b(aVar, str, P, null, a, str2, 4, null);
                    downloadedEpisodesController.getAdapter().registerAdapterDataObserver(new e(C7313ctp.this, netflixActivity));
                }
                RecyclerView Q = C7313ctp.this.Q();
                if (Q != null) {
                    Q.setAdapter(downloadedEpisodesController.getAdapter());
                }
                C7313ctp c7313ctp = C7313ctp.this;
                str3 = c7313ctp.l;
                d2 = c7313ctp.d(str3, C7313ctp.this.I());
                downloadedEpisodesController.setData(d2, C7313ctp.this.S());
                C7313ctp.this.f13771o = downloadedEpisodesController;
            }

            /* loaded from: classes4.dex */
            public static final class e extends RecyclerView.AdapterDataObserver {
                final /* synthetic */ NetflixActivity b;
                final /* synthetic */ C7313ctp c;

                e(C7313ctp c7313ctp, NetflixActivity netflixActivity) {
                    this.c = c7313ctp;
                    this.b = netflixActivity;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    this.c.bD_();
                    this.b.invalidateOptionsMenu();
                    RecyclerView Q = this.c.Q();
                    if (Q != null) {
                        Q.invalidateItemDecorations();
                    }
                }
            }
        });
    }

    /* renamed from: o.ctp$d */
    /* loaded from: classes4.dex */
    public static final class d implements CachingSelectableController.e {
        final /* synthetic */ NetflixActivity a;

        d(NetflixActivity netflixActivity) {
            this.a = netflixActivity;
        }

        @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController.e
        public void c(boolean z) {
            C7313ctp.this.d(z);
        }

        @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController.e
        public void e() {
            C7313ctp.this.bD_();
            this.a.invalidateOptionsMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CachingSelectableController.e a(NetflixActivity netflixActivity) {
        return new d(netflixActivity);
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void M() {
        Map d2;
        Map k;
        Throwable th;
        if (bn_()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.l = arguments.getString("title_id", null);
                this.k = arguments.getString("profile_id", null);
                String string = arguments.getString("playable_id");
                if (string != null) {
                    C7460cwd e2 = C7353cuc.e(string);
                    if (e2 == null) {
                        String str = "Video details not in realm, finish the activity : " + string;
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType.c() + " " + b2);
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
                        InterfaceC1598aHf a = dVar.a();
                        if (a != null) {
                            a.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                        C8187dfe.c(new Runnable() { // from class: o.ctv
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7313ctp.d(C7313ctp.this);
                            }
                        });
                    } else {
                        if (e2.getType() == VideoType.EPISODE) {
                            this.l = e2.aE_().aO_();
                            this.k = e2.ay();
                        } else if (e2.getType() == VideoType.SHOW) {
                            this.l = string;
                            this.k = e2.ay();
                        } else {
                            this.l = string;
                        }
                        if (C8168dfL.g(this.l)) {
                            InterfaceC1593aHa.c.a("SPY-16009: selectedTitleId is null");
                        }
                    }
                }
            }
            super.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7313ctp c7313ctp) {
        C8632dsu.c((Object) c7313ctp, "");
        FragmentActivity activity = c7313ctp.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    private final OfflineAdapterData a(String str, String str2) {
        boolean a;
        C7460cwd c7460cwd;
        String title;
        if (str2 != null) {
            List<OfflineAdapterData> a2 = C7353cuc.a().a();
            C8632dsu.a(a2, "");
            for (OfflineAdapterData offlineAdapterData : a2) {
                if (OfflineAdapterData.ViewType.SHOW == offlineAdapterData.a().b) {
                    a = C8691duz.a(offlineAdapterData.a().a.getId(), str, true);
                    if (a) {
                        C8632dsu.d(offlineAdapterData);
                        if (C8632dsu.c((Object) str2, (Object) e(offlineAdapterData))) {
                            OfflineAdapterData.b a3 = offlineAdapterData.a();
                            if (a3 != null && (c7460cwd = a3.a) != null && (title = c7460cwd.getTitle()) != null) {
                                C8632dsu.d((Object) title);
                                c(title);
                            }
                            return offlineAdapterData;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7186crU d(String str, String str2) {
        return new C7186crU(a(str, str2));
    }

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void K() {
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        if (downloadedEpisodesController != null) {
            downloadedEpisodesController.setData(d(this.l, this.k), S());
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

    @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        if (downloadedEpisodesController != null) {
            String aH_ = interfaceC5206buQ.aH_();
            C8632dsu.a(aH_, "");
            downloadedEpisodesController.progressUpdated(aH_);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        C7263css c7263css = this.n;
        if (c7263css == null) {
            C8632dsu.d("");
            c7263css = null;
        }
        boolean S = S();
        DownloadedEpisodesController<? super C7186crU> downloadedEpisodesController = this.f13771o;
        c7263css.d(S, downloadedEpisodesController != null ? downloadedEpisodesController.getSelectedItems() : null, this.t);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        d(menu, S());
    }

    private final String e(OfflineAdapterData offlineAdapterData) {
        C7460cwd[] b2 = offlineAdapterData.b();
        if (b2 != null) {
            if (!(b2.length == 0)) {
                C7460cwd[] b3 = offlineAdapterData.b();
                C8632dsu.a(b3, "");
                for (C7460cwd c7460cwd : b3) {
                    if (c7460cwd.getType() == VideoType.EPISODE) {
                        return c7460cwd.ay();
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
