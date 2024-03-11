package com.netflix.mediaclient.ui.mylist.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.android.widgetry.widget.ScrollAwayBehavior;
import com.netflix.cl.model.AppView;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC1017Lk;
import o.AbstractC1608aHp;
import o.AbstractC6915cmM;
import o.AbstractC6996cno;
import o.AbstractC7015coG;
import o.AbstractC8266dhD;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1045Mp;
import o.C1204Sr;
import o.C1596aHd;
import o.C1619aI;
import o.C1758aNd;
import o.C3786bKp;
import o.C6921cmS;
import o.C6923cmU;
import o.C6956cnA;
import o.C6969cnN;
import o.C6970cnO;
import o.C6971cnP;
import o.C7004cnw;
import o.C7006cny;
import o.C7010coB;
import o.C7011coC;
import o.C7017coI;
import o.C7049coq;
import o.C7056cox;
import o.C7058coz;
import o.C8054ddD;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.C8930fx;
import o.C8931fy;
import o.C8971gl;
import o.C8980gu;
import o.C9687vB;
import o.C9737vz;
import o.C9872yF;
import o.C9878yL;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5160btX;
import o.InterfaceC5223buh;
import o.InterfaceC6927cmY;
import o.InterfaceC6972cnQ;
import o.InterfaceC6973cnR;
import o.InterfaceC7303ctf;
import o.InterfaceC7365cuo;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.bNK;
import o.bNR;
import o.bNS;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dtQ;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class MyListFragment extends AbstractC6915cmM implements InterfaceC8894fN, InterfaceC6927cmY {
    static final /* synthetic */ dtC<Object>[] b;
    public static final int e;
    private static byte e$ss2$6815 = 0;
    public static final b j;
    private static int p = 1;
    private static int t;
    @Inject
    public bNS gamesInstallationAndLaunch;
    @Inject
    public bNR gamesTab;
    private final AppView k;
    private final boolean l;
    private d m;
    @Inject
    public C6923cmU myListEditMenuProvider;
    private C7004cnw n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8554dpx f13293o;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private boolean q;
    private boolean s;

    static void P() {
        e$ss2$6815 = (byte) 24;
    }

    public abstract Integer F();

    public abstract List<IntentFilter> J();

    public abstract AbstractC7015coG K();

    public final d M() {
        return this.m;
    }

    public abstract void O();

    public abstract MyListTabItems.Type R();

    public abstract void b(View view);

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.l;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bs_() {
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC8882fB<MyListFragment, C7010coB> {
        final /* synthetic */ boolean a;
        final /* synthetic */ drO b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ drM d;

        public i(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, drO dro) {
            this.c = interfaceC8660dtv;
            this.a = z;
            this.d = drm;
            this.b = dro;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<C7010coB> c(MyListFragment myListFragment, dtC<?> dtc) {
            C8632dsu.c((Object) myListFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.c;
            final drO dro = this.b;
            return d.d(myListFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$special$$inlined$activityViewModel$default$3$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    return (String) drO.this.invoke();
                }
            }, dsA.a(C7056cox.class), this.a, this.d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public a(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$onViewCreated$lambda$2$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    public MyListFragment() {
        final InterfaceC8660dtv a2 = dsA.a(C7010coB.class);
        final drO<String> dro = new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$special$$inlined$activityViewModel$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final String invoke() {
                String name = drI.e(InterfaceC8660dtv.this).getName();
                C8632dsu.a(name, "");
                return name;
            }
        };
        this.f13293o = new i(a2, false, new drM<InterfaceC8890fJ<C7010coB, C7056cox>, C7010coB>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$special$$inlined$activityViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [o.coB, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C7010coB invoke(InterfaceC8890fJ<C7010coB, C7056cox> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                return C8903fW.e(c8903fW, e2, C7056cox.class, new C8916fj(requireActivity, C8931fy.a(this), null, null, 12, null), (String) dro.invoke(), false, interfaceC8890fJ, 16, null);
            }
        }, dro).c(this, b[0]);
        this.k = AppView.myListGallery;
        this.l = true;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {

        /* loaded from: classes4.dex */
        public final /* synthetic */ class d {
            public static final /* synthetic */ int[] e;

            static {
                int[] iArr = new int[MyListTabItems.Type.values().length];
                try {
                    iArr[MyListTabItems.Type.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MyListTabItems.Type.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                e = iArr;
            }
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MyListFragment");
        }

        public final NetflixFrag d(MyListTabItems.Type type) {
            C8632dsu.c((Object) type, "");
            int i = d.e[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C7049coq();
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C6970cnO();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final C1619aI a;
        private final ViewGroup b;
        private final MyListEpoxyController c;
        private final C1758aNd d;
        private final C3786bKp e;
        private final View h;
        private final C1204Sr i;
        private ScrollAwayBehavior<View> j;

        public final C1619aI a() {
            return this.a;
        }

        public final C3786bKp b() {
            return this.e;
        }

        public final C1758aNd c() {
            return this.d;
        }

        public final ViewGroup d() {
            return this.b;
        }

        public final MyListEpoxyController e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.h, dVar.h) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.i, dVar.i) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.j, dVar.j);
            }
            return false;
        }

        public final ScrollAwayBehavior<View> f() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.h.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.e.hashCode();
            int hashCode4 = this.a.hashCode();
            int hashCode5 = this.b.hashCode();
            C1204Sr c1204Sr = this.i;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (c1204Sr == null ? 0 : c1204Sr.hashCode())) * 31) + this.d.hashCode()) * 31) + this.j.hashCode();
        }

        public final C1204Sr i() {
            return this.i;
        }

        public String toString() {
            View view = this.h;
            MyListEpoxyController myListEpoxyController = this.c;
            C3786bKp c3786bKp = this.e;
            C1619aI c1619aI = this.a;
            ViewGroup viewGroup = this.b;
            C1204Sr c1204Sr = this.i;
            C1758aNd c1758aNd = this.d;
            ScrollAwayBehavior<View> scrollAwayBehavior = this.j;
            return "Holder(rootView=" + view + ", epoxyController=" + myListEpoxyController + ", recyclerView=" + c3786bKp + ", epoxyVisibilityTracker=" + c1619aI + ", filterGroupContainer=" + viewGroup + ", selectedSortOrderView=" + c1204Sr + ", myListUpdater=" + c1758aNd + ", scrollBehavior=" + scrollAwayBehavior + ")";
        }

        public d(View view, MyListEpoxyController myListEpoxyController, C3786bKp c3786bKp, C1619aI c1619aI, ViewGroup viewGroup, C1204Sr c1204Sr, C1758aNd c1758aNd, ScrollAwayBehavior<View> scrollAwayBehavior) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) myListEpoxyController, "");
            C8632dsu.c((Object) c3786bKp, "");
            C8632dsu.c((Object) c1619aI, "");
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) c1758aNd, "");
            C8632dsu.c((Object) scrollAwayBehavior, "");
            this.h = view;
            this.c = myListEpoxyController;
            this.e = c3786bKp;
            this.a = c1619aI;
            this.b = viewGroup;
            this.i = c1204Sr;
            this.d = c1758aNd;
            this.j = scrollAwayBehavior;
        }
    }

    public final Lazy<PlaybackLauncher> Q() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final bNS G() {
        bNS bns = this.gamesInstallationAndLaunch;
        if (bns != null) {
            return bns;
        }
        C8632dsu.d("");
        return null;
    }

    public final bNR I() {
        bNR bnr = this.gamesTab;
        if (bnr != null) {
            return bnr;
        }
        C8632dsu.d("");
        return null;
    }

    static {
        P();
        b = new dtC[]{dsA.c(new PropertyReference1Impl(MyListFragment.class, "myListActivityModel", "getMyListActivityModel()Lcom/netflix/mediaclient/ui/mylist/impl/viewmodel/MyListActivityModel;", 0))};
        j = new b(null);
        e = 8;
    }

    public final C7010coB L() {
        return (C7010coB) this.f13293o.getValue();
    }

    public final C6923cmU N() {
        C6923cmU c6923cmU = this.myListEditMenuProvider;
        if (c6923cmU != null) {
            return c6923cmU;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(K(), new drM<C7011coC, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                return Boolean.valueOf(c7011coC.s());
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public InteractiveTrackerInterface bi_() {
        C7004cnw c7004cnw = this.n;
        if (c7004cnw != null) {
            return c7004cnw;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ImageLoader requireImageLoader = NetflixActivity.requireImageLoader(activity);
            C8632dsu.a(requireImageLoader, "");
            String name = R().name();
            C7004cnw c7004cnw2 = new C7004cnw(requireImageLoader, "my-list-latencyTracker-" + name);
            this.n = c7004cnw2;
            return c7004cnw2;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K().g();
        AbstractC7015coG.a(K(), false, 0, 3, null);
        X();
    }

    /* loaded from: classes4.dex */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC7015coG K = MyListFragment.this.K();
            final MyListFragment myListFragment = MyListFragment.this;
            C8980gu.c(K, new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$registerToMyListRefresh$myListRefreshListener$1$onReceive$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                    b(c7011coC);
                    return dpR.c;
                }

                public final void b(C7011coC c7011coC) {
                    C8632dsu.c((Object) c7011coC, "");
                    Integer F = MyListFragment.this.F();
                    MyListFragment.this.K().b(true, F != null ? F.intValue() + 1 : 25);
                }
            });
        }
    }

    private final void X() {
        e eVar = new e();
        for (IntentFilter intentFilter : J()) {
            a(eVar, intentFilter);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C6956cnA.b.c, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        C7006cny c2 = C7006cny.c(view);
        C8632dsu.a(c2, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        C3786bKp c3786bKp = c2.a;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        c3786bKp.setLayoutManager(new FillerGridLayoutManager(requireContext, 0, 0, false, false, 30, null));
        String name = R().name();
        c3786bKp.setTag("mylist_gallery_" + name);
        MyListEpoxyController myListEpoxyController = new MyListEpoxyController(d2, G());
        c3786bKp.setController(myListEpoxyController);
        ScrollAwayBehavior scrollAwayBehavior = new ScrollAwayBehavior(48);
        C8632dsu.d(c3786bKp);
        C1619aI c1619aI = new C1619aI();
        LinearLayout linearLayout = c2.d.c;
        C8632dsu.a(linearLayout, "");
        C1204Sr c1204Sr = c2.c.c;
        Observable subscribeOn = Observable.create(new a(getViewLifecycleOwner())).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        this.m = new d(view, myListEpoxyController, c3786bKp, c1619aI, linearLayout, c1204Sr, new C1758aNd(subscribeOn), scrollAwayBehavior);
        c(c3786bKp);
        View e2 = c2.c.e();
        C8632dsu.a(e2, "");
        b(e2);
        O();
        V();
        View view2 = c2.b;
        C8632dsu.a(view2, "");
        d(view2);
        b(d2);
        e();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(K(), new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$invalidate$1
            private static int a = 1;
            private static int e = 0;
            private static byte e$ss2$42 = 24;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                a(c7011coC);
                return dpR.c;
            }

            public final void a(C7011coC c7011coC) {
                boolean z;
                C1204Sr i2;
                MyListEpoxyController e2;
                int i3 = 2 % 2;
                C8632dsu.c((Object) c7011coC, "");
                z = MyListFragment.this.q;
                if (!z) {
                    int i4 = e + 23;
                    a = i4 % 128;
                    int i5 = i4 % 2;
                    if (!c7011coC.s()) {
                        MyListFragment.this.q = true;
                        if (!(c7011coC.h() instanceof C8971gl)) {
                            MyListFragment.this.d(new NetflixStatus(StatusCode.NETWORK_ERROR, 0));
                        } else {
                            MyListFragment myListFragment = MyListFragment.this;
                            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                            C8632dsu.a(netflixImmutableStatus, "");
                            myListFragment.d(netflixImmutableStatus);
                        }
                    }
                }
                MyListFragment.d M = MyListFragment.this.M();
                if (M != null && (e2 = M.e()) != null) {
                    e2.setData(c7011coC);
                }
                MyListFragment.this.b(c7011coC.a());
                MyListFragment.this.bD_();
                if (!c7011coC.n().b().isEmpty()) {
                    MyListSortOrderOption myListSortOrderOption = c7011coC.n().b().get(c7011coC.o());
                    MyListFragment.d M2 = MyListFragment.this.M();
                    if (M2 != null && (i2 = M2.i()) != null) {
                        int d2 = myListSortOrderOption.d();
                        Context context = i2.getContext();
                        String string = context.getString(d2);
                        if (string.startsWith("'!#+")) {
                            int i6 = a + 121;
                            e = i6 % 128;
                            int i7 = i6 % 2;
                            Object[] objArr = new Object[1];
                            c(string.substring(4), objArr);
                            string = ((String) objArr[0]).intern();
                            CharSequence text = context.getText(d2);
                            if (text instanceof Spanned) {
                                SpannableString spannableString = new SpannableString(string);
                                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                                string = spannableString;
                            }
                        }
                        i2.setText(string);
                    }
                    MyListFragment.d M3 = MyListFragment.this.M();
                    Object obj = null;
                    C1204Sr i8 = M3 != null ? M3.i() : null;
                    if (i8 == null) {
                        return;
                    }
                    String string2 = MyListFragment.this.requireContext().getResources().getString(myListSortOrderOption.b());
                    if (string2.startsWith("'!#+")) {
                        int i9 = a + 65;
                        e = i9 % 128;
                        if (i9 % 2 != 0) {
                            Object[] objArr2 = new Object[1];
                            c(string2.substring(4), objArr2);
                            ((String) objArr2[0]).intern();
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr3 = new Object[1];
                        c(string2.substring(4), objArr3);
                        string2 = ((String) objArr3[0]).intern();
                    }
                    i8.setContentDescription(string2);
                }
            }

            private void c(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i2 = 0; i2 < decode.length; i2++) {
                    bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$42);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C3786bKp b2;
        AbstractC7015coG K = K();
        PublishSubject create = PublishSubject.create();
        C8632dsu.a(create, "");
        K.a(new C1758aNd(create));
        super.onDestroyView();
        C7004cnw c7004cnw = this.n;
        if (c7004cnw != null) {
            c7004cnw.d();
        }
        d dVar = this.m;
        if (dVar != null && (b2 = dVar.b()) != null) {
            b((RecyclerView) b2);
        }
        this.m = null;
    }

    /* loaded from: classes4.dex */
    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View c;
        final /* synthetic */ MyListFragment e;

        g(View view, MyListFragment myListFragment) {
            this.c = view;
            this.e = myListFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C3786bKp b;
            int height = this.c.getHeight();
            d M = this.e.M();
            if (M != null && (b = M.b()) != null) {
                b.setPadding(0, height, 0, 0);
            }
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    private final void b(C9935zP c9935zP) {
        InterfaceC8894fN.b.e(this, L(), null, new MyListFragment$subscribeEvents$1(this, null), 1, null);
        DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6996cno.class), (drM) null, (drO) null, new drM<AbstractC6996cno, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$subscribeEvents$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6996cno abstractC6996cno) {
                b(abstractC6996cno);
                return dpR.c;
            }

            public final void b(AbstractC6996cno abstractC6996cno) {
                boolean z;
                C8632dsu.c((Object) abstractC6996cno, "");
                if (abstractC6996cno instanceof AbstractC6996cno.c) {
                    MyListFragment.this.K().h();
                } else if (abstractC6996cno instanceof AbstractC6996cno.f) {
                    AbstractC6996cno.f fVar = (AbstractC6996cno.f) abstractC6996cno;
                    MyListFragment.this.c(fVar.a(), fVar.e());
                } else if (abstractC6996cno instanceof AbstractC6996cno.g) {
                    MyListFragment.this.W();
                } else if (abstractC6996cno instanceof AbstractC6996cno.n) {
                    AbstractC7015coG.a(MyListFragment.this.K(), false, 0, 3, null);
                } else if (abstractC6996cno instanceof AbstractC6996cno.d) {
                    AbstractC6996cno.d dVar = (AbstractC6996cno.d) abstractC6996cno;
                    MyListFragment.this.b(dVar.a(), dVar.c());
                } else if (abstractC6996cno instanceof AbstractC6996cno.k) {
                    MyListFragment myListFragment = MyListFragment.this;
                    AbstractC6996cno.k kVar = (AbstractC6996cno.k) abstractC6996cno;
                    String id = kVar.c().getId();
                    C8632dsu.a(id, "");
                    VideoType type = kVar.c().getType();
                    C8632dsu.a(type, "");
                    myListFragment.b(id, type, false, kVar.d());
                } else if (abstractC6996cno instanceof AbstractC6996cno.e) {
                    MyListFragment.this.K().g();
                } else if (abstractC6996cno instanceof AbstractC6996cno.l) {
                    MyListFragment.this.L().a(MyListTabItems.Type.e, ((AbstractC6996cno.l) abstractC6996cno).e());
                } else if (abstractC6996cno instanceof AbstractC6996cno.a) {
                    MyListFragment.this.d((AbstractC6996cno.a) abstractC6996cno);
                } else if (abstractC6996cno instanceof AbstractC6996cno.h) {
                    AbstractC6996cno.h hVar = (AbstractC6996cno.h) abstractC6996cno;
                    MyListFragment.this.a(hVar.b(), hVar.a());
                } else if (abstractC6996cno instanceof AbstractC6996cno.m) {
                    AbstractC6996cno.m mVar = (AbstractC6996cno.m) abstractC6996cno;
                    MyListFragment.this.b(String.valueOf(mVar.c().c()), VideoType.GAMES, false, mVar.e());
                } else if (abstractC6996cno instanceof AbstractC6996cno.b) {
                    MyListFragment.this.K().h();
                } else if (abstractC6996cno instanceof AbstractC6996cno.j) {
                    MyListFragment.this.T();
                } else if (abstractC6996cno instanceof AbstractC6996cno.i) {
                    z = MyListFragment.this.s;
                    if (z) {
                        return;
                    }
                    MyListFragment.this.s = true;
                    AbstractC6996cno.i iVar = (AbstractC6996cno.i) abstractC6996cno;
                    C6921cmS.e.d(iVar.a(), iVar.c());
                } else if (abstractC6996cno instanceof AbstractC6996cno.o) {
                    MyListFragment.this.L().a(MyListTabItems.Type.a, ((AbstractC6996cno.o) abstractC6996cno).a());
                }
            }
        }, 3, (Object) null));
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    private final void V() {
        ViewGroup d2;
        int i2 = 2;
        int i3 = 2 % 2;
        boolean z = false;
        int i4 = 0;
        for (Object obj : (List) C8980gu.c(K(), new drM<C7011coC, List<? extends InterfaceC6972cnQ<?>>>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$setupMyListFilters$filterGroups$1
            @Override // o.drM
            /* renamed from: b */
            public final List<InterfaceC6972cnQ<?>> invoke(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                return c7011coC.a();
            }
        })) {
            int i5 = t + 93;
            p = i5 % 128;
            int i6 = i5 % i2;
            if (i4 < 0) {
                C8569dql.h();
            }
            InterfaceC6972cnQ interfaceC6972cnQ = (InterfaceC6972cnQ) obj;
            if (!interfaceC6972cnQ.c().isEmpty()) {
                Context requireContext = requireContext();
                C8632dsu.a(requireContext, "");
                ViewGroup c6969cnN = new C6969cnN(requireContext, null, i2, null);
                Iterator<T> it = interfaceC6972cnQ.c().iterator();
                int i7 = z ? 1 : 0;
                ?? r9 = z;
                while (!(!it.hasNext())) {
                    Object next = it.next();
                    if (i7 < 0) {
                        C8569dql.h();
                    }
                    final InterfaceC6973cnR interfaceC6973cnR = (InterfaceC6973cnR) next;
                    View inflate = getLayoutInflater().inflate(C6956cnA.b.b, c6969cnN, (boolean) r9);
                    C8632dsu.d(inflate);
                    final Chip chip = (Chip) inflate;
                    int d3 = interfaceC6973cnR.d();
                    Context context = chip.getContext();
                    String string = context.getString(d3);
                    if (string.startsWith("'!#+")) {
                        int i8 = t + 123;
                        p = i8 % 128;
                        int i9 = i8 % i2;
                        Object[] objArr = new Object[1];
                        u(string.substring(4), objArr);
                        string = ((String) objArr[r9]).intern();
                        CharSequence text = context.getText(d3);
                        if (text instanceof Spanned) {
                            SpannableString spannableString = new SpannableString(string);
                            TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                            string = spannableString;
                        }
                    }
                    chip.setText(string);
                    AccessibilityUtils.e(chip, null, getText(C6956cnA.c.b), null, 5, null);
                    final int i10 = i4;
                    final int i11 = i7;
                    chip.setOnClickListener(new View.OnClickListener() { // from class: o.cns
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MyListFragment.a(MyListFragment.this, i10, chip, i11, interfaceC6973cnR, view);
                        }
                    });
                    chip.setClickable(true);
                    chip.setTag("mylist_filter_" + R().name() + "_" + interfaceC6973cnR.c());
                    c6969cnN.addView(chip);
                    i7++;
                    i2 = 2;
                    r9 = 0;
                }
                d dVar = this.m;
                if (dVar != null && (d2 = dVar.d()) != null) {
                    int i12 = p + 121;
                    t = i12 % 128;
                    int i13 = i12 % i2;
                    d2.addView(c6969cnN);
                    int i14 = t + 87;
                    p = i14 % 128;
                    int i15 = i14 % i2;
                }
                if (i4 > 0) {
                    ViewGroup.LayoutParams layoutParams = c6969cnN.getLayoutParams();
                    C8632dsu.d(layoutParams);
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(requireContext().getResources().getDimensionPixelOffset(C6956cnA.d.c));
                }
            }
            i4++;
            i2 = 2;
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MyListFragment myListFragment, int i2, Chip chip, int i3, InterfaceC6973cnR interfaceC6973cnR, View view) {
        ScrollAwayBehavior<View> f;
        C8632dsu.c((Object) myListFragment, "");
        C8632dsu.c((Object) chip, "");
        C8632dsu.c((Object) interfaceC6973cnR, "");
        d dVar = myListFragment.m;
        if (dVar != null && (f = dVar.f()) != null) {
            f.d();
        }
        AbstractC7015coG K = myListFragment.K();
        if (!chip.isChecked()) {
            i3 = -1;
        }
        K.b(i2, i3);
        C6921cmS.e.a(interfaceC6973cnR.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(List<? extends InterfaceC6972cnQ<?>> list) {
        ViewGroup d2;
        dtQ<View> children;
        d dVar = this.m;
        if (dVar == null || (d2 = dVar.d()) == null || (children = ViewGroupKt.getChildren(d2)) == null) {
            return;
        }
        int i2 = 0;
        for (View view : children) {
            if (i2 < 0) {
                C8569dql.h();
            }
            View view2 = view;
            if (view2 instanceof C6969cnN) {
                C6969cnN c6969cnN = (C6969cnN) view2;
                c6969cnN.clearCheck();
                if (list.get(i2).a() != -1) {
                    View childAt = c6969cnN.getChildAt(list.get(i2).a());
                    C8632dsu.d(childAt);
                    ((Chip) childAt).setChecked(true);
                }
            }
            i2++;
        }
    }

    private final void c(RecyclerView recyclerView) {
        C1619aI a2;
        d dVar = this.m;
        if (dVar == null || (a2 = dVar.a()) == null) {
            return;
        }
        a2.d(recyclerView);
    }

    private final void b(RecyclerView recyclerView) {
        C1619aI a2;
        d dVar = this.m;
        if (dVar == null || (a2 = dVar.a()) == null) {
            return;
        }
        a2.c(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC5160btX interfaceC5160btX, TrackingInfoHolder trackingInfoHolder) {
        Map d2;
        Map k;
        Throwable th;
        String aH_ = interfaceC5160btX.aH_();
        if (aH_ == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("MyListFragment: playableId is null in launchPlayback()", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        aVar.a(requireContext).a(getContext(), aH_, new c(interfaceC5160btX, trackingInfoHolder));
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC7365cuo {
        final /* synthetic */ TrackingInfoHolder d;
        final /* synthetic */ InterfaceC5160btX e;

        c(InterfaceC5160btX interfaceC5160btX, TrackingInfoHolder trackingInfoHolder) {
            this.e = interfaceC5160btX;
            this.d = trackingInfoHolder;
        }

        @Override // o.InterfaceC7365cuo
        public void b() {
            PlayerExtras playerExtras;
            Object parcelable;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = MyListFragment.this.getArguments();
                if (arguments != null) {
                    parcelable = arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, PlayerExtras.class);
                    playerExtras = (PlayerExtras) parcelable;
                }
                playerExtras = null;
            } else {
                Bundle arguments2 = MyListFragment.this.getArguments();
                if (arguments2 != null) {
                    playerExtras = (PlayerExtras) arguments2.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
                }
                playerExtras = null;
            }
            InterfaceC5160btX interfaceC5160btX = this.e;
            MyListFragment myListFragment = MyListFragment.this;
            TrackingInfoHolder trackingInfoHolder = this.d;
            PlaybackLauncher playbackLauncher = myListFragment.Q().get();
            C8632dsu.a(playbackLauncher, "");
            PlaybackLauncher playbackLauncher2 = playbackLauncher;
            VideoType videoType = interfaceC5160btX.aY_() ? VideoType.EPISODE : VideoType.MOVIE;
            PlayContextImp b = TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.MY_LIST, "", false, 4, null);
            if (playerExtras == null) {
                playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
            }
            PlaybackLauncher.b.a(playbackLauncher2, interfaceC5160btX, videoType, b, playerExtras, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
        C7017coI.e d2 = C7017coI.c.e().d(AbstractC1608aHp.d.b).d(new AbstractC1608aHp.d.b(interfaceC5223buh, trackingInfoHolder, "my_list", null));
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        d2.b(C9737vz.e(requireContext, NetflixActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C6971cnP.a aVar, TrackingInfoHolder trackingInfoHolder) {
        C7017coI.e d2 = C7017coI.c.e().d(AbstractC1608aHp.d.b).d(new AbstractC1608aHp.d.b(aVar, trackingInfoHolder, "my_list", null));
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        d2.b(C9737vz.e(requireContext, NetflixActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AbstractC6996cno.a aVar) {
        bNS G = G();
        TrackingInfoHolder c2 = aVar.c();
        bNK.e eVar = bNK.c;
        NetflixActivity by_ = by_();
        String f = aVar.a().f();
        String title = aVar.a().getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String a2 = AbstractC8266dhD.a();
        boolean d2 = aVar.d();
        C8632dsu.d((Object) a2);
        G.c(c2, eVar.e(by_, f, a2, str, d2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        requireContext().startActivity(HomeActivity.d(requireContext(), AppView.browseTitlesGallery, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        Context requireContext = requireContext();
        bNR I = I();
        Context requireContext2 = requireContext();
        C8632dsu.a(requireContext2, "");
        requireContext.startActivity(I.e(requireContext2));
    }

    public final void b(final String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        final C7058coz c7058coz = new C7058coz(str, videoType, z, trackingInfoHolder, false, false, 48, null);
        K().b(c7058coz);
        if (!bn_()) {
            a(c7058coz);
            return;
        }
        C6921cmS.e.c(c7058coz.i(), c7058coz.d());
        C9872yF c9872yF = by_().composeViewOverlayManager;
        C8632dsu.a(c9872yF, "");
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "my_list_undo_toast");
        String string = requireContext().getString(C6956cnA.c.G);
        C8632dsu.a(string, "");
        String string2 = requireContext().getString(C6956cnA.c.f13750J);
        C8632dsu.a(string2, "");
        C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : testTag, string, (r22 & 4) != 0 ? null : null, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : new AbstractC1017Lk.a(string2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$removeItemFromMyListIntent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                MyListFragment.this.K().c(str);
            }
        }), (r22 & 32) != 0 ? Theme.b : null, (r22 & 64) != 0 ? 3000 : 0, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$removeItemFromMyListIntent$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                d(bool.booleanValue());
                return dpR.c;
            }

            public final void d(boolean z2) {
                MyListFragment.j.getLogTag();
                if (!MyListFragment.this.bn_()) {
                    MyListFragment.this.a(c7058coz);
                } else if (z2) {
                } else {
                    MyListFragment.this.d(c7058coz, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final C7058coz c7058coz, final boolean z) {
        C1758aNd c2;
        d dVar = this.m;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return;
        }
        K().a(c2, c7058coz.c(), new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$removeItemFromMyList$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                d(bool.booleanValue());
                return dpR.c;
            }

            public final void d(boolean z2) {
                MyListFragment.j.getLogTag();
                if (!z2) {
                    this.b(C6956cnA.c.v);
                } else if (z) {
                    this.b(C6956cnA.c.G);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C7058coz c7058coz) {
        AbstractC7015coG K = K();
        PublishSubject create = PublishSubject.create();
        C8632dsu.a(create, "");
        AbstractC7015coG.c(K, new C1758aNd(create), c7058coz.c(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2) {
        C8054ddD.c(getContext(), i2, 0);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean y() {
        return S();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        return S();
    }

    private final boolean S() {
        return ((Boolean) C8980gu.c(L(), new drM<C7056cox, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$clearIfInEditMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                Boolean valueOf = Boolean.valueOf(c7056cox.e());
                MyListFragment myListFragment = MyListFragment.this;
                if (valueOf.booleanValue()) {
                    myListFragment.L().f();
                }
                return valueOf;
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC6927cmY
    public void c(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        C8980gu.c(L(), new drM<C7056cox, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$onSelected$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7056cox c7056cox) {
                c(c7056cox);
                return dpR.c;
            }

            public final void c(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                MyListFragment.this.L().f();
                C6921cmS.e.d(c7056cox.e());
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        return ((Boolean) C8980gu.c(L(), new drM<C7056cox, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.MyListFragment$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                return Boolean.valueOf(MyListFragment.this.N().a(c7056cox));
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        int i2 = this.i;
        int i3 = ((NetflixFrag) this).d;
        int i4 = this.g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams.topMargin = i2 + i3 + i4;
            marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
            marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
            view.requestLayout();
        }
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), this.h);
    }

    private final void d(View view) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            d dVar = this.m;
            layoutParams2.setBehavior(dVar != null ? dVar.f() : null);
            view.requestLayout();
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new g(view, this));
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$6815);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
