package com.netflix.mediaclient.android.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.transition.Transition;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import o.C1045Mp;
import o.C1596aHd;
import o.C8054ddD;
import o.C8166dfJ;
import o.C8347dif;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1077Nv;
import o.InterfaceC1078Nw;
import o.InterfaceC1573aGh;
import o.InterfaceC1577aGl;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5091bsH;
import o.NY;
import o.aIB;
import o.dpR;
import o.dqE;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes.dex */
public abstract class NetflixFrag extends NY implements InterfaceC1077Nv, InterfaceC5091bsH {
    private final Set<BroadcastReceiver> b;
    public int d;
    private final Set<BroadcastReceiver> e;
    public final CompositeDisposable f;
    public int g;
    public int h;
    public int i;
    private final Set<BroadcastReceiver> j;
    private boolean k;
    private boolean l;
    private final CompositeDisposable m;
    private InterfaceC1077Nv.e n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<BroadcastReceiver> f13160o;
    private InterfaceC1573aGh s;
    @Inject
    public Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;
    public static final c c = new c(null);
    public static final int a = 8;

    public boolean bD_() {
        return false;
    }

    public AppView bh_() {
        return null;
    }

    public InteractiveTrackerInterface bi_() {
        return null;
    }

    public final CompositeDisposable bk_() {
        return this.m;
    }

    public boolean bo_() {
        return false;
    }

    public void bp_() {
    }

    public void bq_() {
    }

    protected void br_() {
    }

    protected boolean bs_() {
        return false;
    }

    public void bt_() {
    }

    public void bu_() {
    }

    public void bv_() {
    }

    public boolean bw_() {
        return false;
    }

    protected void e(View view) {
        C8632dsu.c((Object) view, "");
    }

    public boolean o() {
        return false;
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public boolean y() {
        return false;
    }

    public final Provider<InterfaceC1573aGh> bm_() {
        Provider<InterfaceC1573aGh> provider = this.uiLatencyTrackerProvider;
        if (provider != null) {
            return provider;
        }
        C8632dsu.d("");
        return null;
    }

    public NetflixFrag() {
        this.f = new CompositeDisposable();
        this.m = new CompositeDisposable();
        this.j = new HashSet();
        this.b = new HashSet();
        this.f13160o = new HashSet();
        this.e = new HashSet();
    }

    public NetflixFrag(int i) {
        super(i);
        this.f = new CompositeDisposable();
        this.m = new CompositeDisposable();
        this.j = new HashSet();
        this.b = new HashSet();
        this.f13160o = new HashSet();
        this.e = new HashSet();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        InterfaceC1573aGh interfaceC1573aGh;
        super.onCreate(bundle);
        c.getLogTag();
        if (bo_()) {
            interfaceC1573aGh = bm_().get();
            interfaceC1573aGh.a(bx_(), this, by_()).a(bundle == null).b().a();
        } else {
            interfaceC1573aGh = null;
        }
        this.s = interfaceC1573aGh;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        e(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null || !bundle.getBoolean("NetflixFragHidden") || getFragmentManager() == null) {
            return;
        }
        getParentFragmentManager().beginTransaction().hide(this).commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("NetflixFragHidden", isHidden());
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        C8632dsu.c((Object) activity, "");
        super.onAttach(activity);
        c.getLogTag();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        c.getLogTag();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.m.clear();
        for (BroadcastReceiver broadcastReceiver : this.f13160o) {
            requireContext().unregisterReceiver(broadcastReceiver);
        }
        this.f13160o.clear();
        for (BroadcastReceiver broadcastReceiver2 : this.e) {
            LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(broadcastReceiver2);
        }
        this.e.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        c.getLogTag();
        this.f.clear();
        for (BroadcastReceiver broadcastReceiver : this.j) {
            requireContext().unregisterReceiver(broadcastReceiver);
        }
        this.j.clear();
        for (BroadcastReceiver broadcastReceiver2 : this.b) {
            LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(broadcastReceiver2);
        }
        this.b.clear();
        this.s = null;
        this.k = true;
    }

    public final NetflixActivity bj_() {
        return (NetflixActivity) getActivity();
    }

    public final NetflixActivity by_() {
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.d(requireActivity);
        return (NetflixActivity) requireActivity;
    }

    public final ServiceManager bz_() {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            return bl_;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final ServiceManager bl_() {
        return ServiceManager.c(bj_());
    }

    @Override // o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        if (isLoadingData() || eVar == null) {
            this.n = eVar;
        } else {
            eVar.c(InterfaceC1078Nw.aJ);
        }
    }

    public void d(Status status) {
        C8632dsu.c((Object) status, "");
        if (!(this.l && bw_()) && bn_()) {
            this.l = true;
            InterfaceC1077Nv.e eVar = this.n;
            if (eVar != null) {
                eVar.c(status);
            }
            if (!bo_() || bs_()) {
                a(status);
                return;
            }
            InterfaceC1577aGl c2 = bA_().e(status.j()).b(status.c().name()).c(bC_()).c((Boolean) null);
            c2.b(new drO<dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixFrag$onLoaded$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                public final void e() {
                    NetflixFrag.this.F();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            });
            aIB.d dVar = aIB.e;
            FragmentActivity requireActivity = requireActivity();
            C8632dsu.a(requireActivity, "");
            dVar.c(requireActivity, new a(c2, this));
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements aIB.e {
        final /* synthetic */ NetflixFrag b;
        final /* synthetic */ InterfaceC1577aGl c;

        a(InterfaceC1577aGl interfaceC1577aGl, NetflixFrag netflixFrag) {
            this.c = interfaceC1577aGl;
            this.b = netflixFrag;
        }

        @Override // o.aIB.e
        public void run(ServiceManager serviceManager) {
            C8632dsu.c((Object) serviceManager, "");
            InteractiveTrackerInterface bi_ = NetflixFrag.this.bi_();
            if (bi_ != null) {
                InterfaceC1577aGl interfaceC1577aGl = this.c;
                final NetflixFrag netflixFrag = this.b;
                drO<View> dro = new drO<View>() { // from class: com.netflix.mediaclient.android.fragment.NetflixFrag$onLoaded$2$run$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: c */
                    public final View invoke() {
                        return NetflixFrag.this.getView();
                    }
                };
                Lifecycle lifecycle = this.b.getLifecycle();
                C8632dsu.a(lifecycle, "");
                interfaceC1577aGl.d(bi_, dro, lifecycle);
                return;
            }
            InterfaceC1577aGl interfaceC1577aGl2 = this.c;
            ImageLoader imageLoader = NetflixActivity.getImageLoader(NetflixFrag.this.requireContext());
            final NetflixFrag netflixFrag2 = NetflixFrag.this;
            drO<View> dro2 = new drO<View>() { // from class: com.netflix.mediaclient.android.fragment.NetflixFrag$onLoaded$2$run$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final View invoke() {
                    return NetflixFrag.this.getView();
                }
            };
            Lifecycle lifecycle2 = this.b.getLifecycle();
            C8632dsu.a(lifecycle2, "");
            interfaceC1577aGl2.e(imageLoader, dro2, lifecycle2);
        }
    }

    protected Map<String, String> bC_() {
        Map<String, String> d2;
        d2 = dqE.d();
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C8166dfJ.e(null, true);
        if (this.k) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d3 = dqE.d();
            k2 = dqE.k(d3);
            C1596aHd c1596aHd = new C1596aHd("ttr complete after destroy", null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                Throwable th3 = c1596aHd.i;
                if (th3 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th2 = th3;
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        } else if (isDetached()) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("ttr complete after detach", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c3 = errorType2.c();
                    c1596aHd2.a(c3 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar2.a();
            if (a3 != null) {
                a3.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
        } else {
            br_();
        }
    }

    private final void a(Status status) {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.endRenderNavigationLevelSession(status.j() ? IClientLogging.CompletionReason.success : IClientLogging.CompletionReason.failed, status);
        }
    }

    public boolean bn_() {
        return isAdded() && !C8054ddD.l(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        c.getLogTag();
        by_().onFragmentHiddenChanged(this, z);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.i = i;
        this.d = i2;
        this.g = i3;
        this.h = i4;
        I();
    }

    private final void I() {
        View view = getView();
        if (view != null) {
            e(view);
        }
    }

    public final void bg_() {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.exit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setEnterTransition(Object obj) {
        super.setEnterTransition(obj);
        if (obj instanceof Transition) {
            ((Transition) obj).addListener(new d());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends C8347dif {
        d() {
        }

        @Override // o.C8347dif, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            C8632dsu.c((Object) transition, "");
            NetflixFrag.this.bu_();
        }

        @Override // o.C8347dif, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C8632dsu.c((Object) transition, "");
            super.onTransitionEnd(transition);
            NetflixFrag.this.bv_();
        }
    }

    public final AppView bx_() {
        AppView bh_ = bh_();
        if (bh_ != null) {
            return bh_;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        String simpleName = getClass().getSimpleName();
        String hexString = Integer.toHexString(System.identityHashCode(getClass()));
        return simpleName + "(" + hexString + ")";
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Boolean bool) {
        C8632dsu.c((Object) broadcastReceiver, "");
        C8632dsu.c((Object) intentFilter, "");
        ContextCompat.registerReceiver(requireContext(), broadcastReceiver, intentFilter, (bool == null || !bool.booleanValue()) ? 4 : 2);
        this.j.add(broadcastReceiver);
    }

    public final void c(BroadcastReceiver broadcastReceiver, String str) {
        C8632dsu.c((Object) broadcastReceiver, "");
        a(broadcastReceiver, new IntentFilter(str));
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        C8632dsu.c((Object) broadcastReceiver, "");
        C8632dsu.c((Object) intentFilter, "");
        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(broadcastReceiver, intentFilter);
        this.b.add(broadcastReceiver);
    }

    public final void d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        C8632dsu.c((Object) broadcastReceiver, "");
        C8632dsu.c((Object) intentFilter, "");
        ContextCompat.registerReceiver(requireContext(), broadcastReceiver, intentFilter, 4);
        this.f13160o.add(broadcastReceiver);
    }

    public final InterfaceC1573aGh bA_() {
        InterfaceC1573aGh interfaceC1573aGh = this.s;
        if (interfaceC1573aGh != null) {
            return interfaceC1573aGh;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void bB_() {
        this.s = bm_().get();
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixFrag");
        }
    }
}
