package com.netflix.mediaclient.ui.memberrejoin.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.mediaclient.acquisition.components.creditCvvInfo.CreditCvvTakeoverDialogFragment;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC6589cgE;
import o.AbstractC6601cgQ;
import o.C1045Mp;
import o.C1596aHd;
import o.C6585cgA;
import o.C6596cgL;
import o.C6597cgM;
import o.C6670chg;
import o.C6672chi;
import o.C6673chj;
import o.C8153dex;
import o.C8168dfL;
import o.C8242dgg;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9725vn;
import o.C9726vo;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6590cgF;
import o.InterfaceC6629cgs;
import o.InterfaceC6634cgx;
import o.InterfaceC6636cgz;
import o.InterfaceC6675chl;
import o.InterfaceC8554dpx;
import o.cQQ;
import o.cVB;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.dsA;

/* loaded from: classes4.dex */
public final class MemberRejoinImpl implements InterfaceC6634cgx {
    public static final d d = new d(null);
    private final InterfaceC8554dpx b;
    private final C9935zP c;
    @Inject
    public C8242dgg cacheHelper;
    private final C6585cgA e;
    private final a f;
    private final InterfaceC6675chl g;
    private C6672chi h;
    private final NetflixActivity i;
    private final MoneyballDataSource j;
    @Inject
    public InterfaceC6636cgz memberRejoinFlags;
    @Inject
    public InterfaceC6590cgF moneyballEntryPoint;

    /* renamed from: o  reason: collision with root package name */
    private final cQQ f13287o;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC6675chl o();
    }

    public final NetflixActivity g() {
        return this.i;
    }

    public final C6585cgA j() {
        return this.e;
    }

    @Inject
    public MemberRejoinImpl(Activity activity, MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.j = moneyballDataSource;
        final NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.i = netflixActivity;
        this.g = ((e) EntryPointAccessors.fromActivity(activity, e.class)).o();
        C9935zP d2 = C9935zP.b.d(netflixActivity);
        this.c = d2;
        this.b = new ViewModelLazy(dsA.a(C6596cgL.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                drO dro = drO.this;
                if (dro == null || (creationExtras = (CreationExtras) dro.invoke()) == null) {
                    CreationExtras defaultViewModelCreationExtras = netflixActivity.getDefaultViewModelCreationExtras();
                    C8632dsu.a(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
                return creationExtras;
            }
        });
        this.e = new C6585cgA();
        this.f13287o = new cQQ();
        this.f = new a();
        a(d2);
        netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                MemberRejoinImpl.this.j().a();
                super.onDestroy(lifecycleOwner);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MemberRejoinImpl");
        }
    }

    public final InterfaceC6636cgz h() {
        InterfaceC6636cgz interfaceC6636cgz = this.memberRejoinFlags;
        if (interfaceC6636cgz != null) {
            return interfaceC6636cgz;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6590cgF f() {
        InterfaceC6590cgF interfaceC6590cgF = this.moneyballEntryPoint;
        if (interfaceC6590cgF != null) {
            return interfaceC6590cgF;
        }
        C8632dsu.d("");
        return null;
    }

    public final C8242dgg i() {
        C8242dgg c8242dgg = this.cacheHelper;
        if (c8242dgg != null) {
            return c8242dgg;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6596cgL q() {
        return (C6596cgL) this.b.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class a implements NetworkRequestResponseListener {
        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onBeforeNetworkAction(Request request) {
            C8632dsu.c((Object) request, "");
        }

        a() {
        }

        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onAfterNetworkAction(Response response) {
            MoneyballData moneyballData;
            C8632dsu.c((Object) response, "");
            if (!response.isValidState() || (moneyballData = response.getMoneyballData()) == null) {
                return;
            }
            MemberRejoinImpl memberRejoinImpl = MemberRejoinImpl.this;
            memberRejoinImpl.c(moneyballData);
            memberRejoinImpl.o();
            memberRejoinImpl.e(moneyballData);
            C6596cgL q = memberRejoinImpl.q();
            NetflixActivity g = memberRejoinImpl.g();
            q.e(moneyballData, memberRejoinImpl, g instanceof InterfaceC6629cgs ? (InterfaceC6629cgs) g : null);
        }
    }

    @Override // o.InterfaceC6634cgx
    public InterfaceC6636cgz d() {
        return h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(MoneyballData moneyballData) {
        if (a(moneyballData)) {
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        boolean g;
        String c = c(this, false, 1, null).c();
        if (c != null) {
            g = C8691duz.g(c);
            if (g) {
                return;
            }
            new AlertDialog.Builder(new ContextThemeWrapper(this.i, R.l.m)).setMessage(c).setPositiveButton(R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.cgC
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MemberRejoinImpl.e(dialogInterface, i);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(MoneyballData moneyballData) {
        AUIContextData contextData = moneyballData.getContextData();
        if (C8632dsu.c((Object) (contextData != null ? contextData.getMembershipStatus() : null), (Object) SignupConstants.MemberStatus.CURRENT_MEMBER)) {
            Observable<cQQ.e> o2 = this.f13287o.o();
            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this.i, Lifecycle.Event.ON_DESTROY);
            C8632dsu.a(a2, "");
            Object as = o2.as(AutoDispose.b(a2));
            C8632dsu.b(as, "");
            C9725vn.a((ObservableSubscribeProxy) as, null, null, new drM<cQQ.e, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$checkMemberState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.e eVar) {
                    b(eVar);
                    return dpR.c;
                }

                public final void b(cQQ.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                    MemberRejoinImpl.this.e();
                    ((MemberRejoinFlagsImpl) C9726vo.d(MemberRejoinImpl.this.d(), MemberRejoinFlagsImpl.class)).b();
                }
            }, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ C6672chi c(MemberRejoinImpl memberRejoinImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return memberRejoinImpl.a(z);
    }

    private final C6672chi a(boolean z) {
        if (this.h == null || z) {
            C6673chj f = f().f();
            NetflixActivity netflixActivity = this.i;
            String d2 = C8168dfL.d(C6597cgM.d.g);
            C8632dsu.a(d2, "");
            this.h = f.d(netflixActivity, d2);
        }
        C6672chi c6672chi = this.h;
        C8632dsu.d(c6672chi);
        return c6672chi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        c(this, false, 1, null).a(this.f);
    }

    private final boolean a(MoneyballData moneyballData) {
        return C8632dsu.c((Object) moneyballData.getMode(), (Object) "planSelectionAndConfirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(MoneyballData moneyballData) {
        if (a(moneyballData) && c(this, false, 1, null).j()) {
            c(this, false, 1, null).d(this.i);
        }
    }

    @Override // o.InterfaceC6634cgx
    public void a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        q().c(this.i).c(str, str2);
        C6596cgL.a(q(), this.i, true, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$prefetchData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                a(moneyballData);
                return dpR.c;
            }

            public final void a(MoneyballData moneyballData) {
                MoneyballDataSource moneyballDataSource;
                C8632dsu.c((Object) moneyballData, "");
                moneyballDataSource = MemberRejoinImpl.this.j;
                moneyballDataSource.getLiveMoneyballData().setValue(moneyballData);
                MemberRejoinImpl.this.c(moneyballData);
                MemberRejoinImpl.this.b(moneyballData);
            }
        }, null, 8, null);
    }

    public void n() {
        if (!d().d()) {
            m();
            return;
        }
        if (!q().b(this.i)) {
            C6585cgA.a(this.e, null, false, 1, null);
            InterfaceC6675chl.a.a(this.g, new AbstractC6601cgQ.d(this.c, this.e, C8153dex.e(this.i)), false, 2, null);
        }
        C6596cgL.e(q(), this, null, null, null, 14, null);
    }

    @Override // o.InterfaceC6634cgx
    public void d(String str, String str2, InterfaceC6629cgs interfaceC6629cgs) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) interfaceC6629cgs, "");
        if (!q().b(this.i)) {
            C6585cgA.a(this.e, null, false, 1, null);
            InterfaceC6675chl.a.a(this.g, new AbstractC6601cgQ.d(this.c, this.e, C8153dex.e(this.i)), false, 2, null);
        }
        q().a(this, str, str2, interfaceC6629cgs);
    }

    public void l() {
        new AlertDialog.Builder(new ContextThemeWrapper(this.i, R.l.m)).setMessage(C6597cgM.d.c).setPositiveButton(R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.cgD
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MemberRejoinImpl.d(MemberRejoinImpl.this, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MemberRejoinImpl memberRejoinImpl, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) memberRejoinImpl, "");
        memberRejoinImpl.e();
    }

    public void e() {
        this.e.d();
        this.e.e();
        this.g.b("UpSellTray");
    }

    public final void e(String str, String str2, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        q().c(this.i).c();
        e();
        this.i.startActivityForResult(cVB.a(this.i, str, str2), i);
    }

    public final void k() {
        C6585cgA c6585cgA = this.e;
        C6670chg h = c(this, false, 1, null).h();
        c6585cgA.a(h != null ? h.a() : null, true);
        this.g.c(new AbstractC6601cgQ.e(a(true), this.c, this.e, C8153dex.e(this.i)), true);
    }

    @SuppressLint({"CheckResult"})
    private final void m() {
        Map d2;
        Map k;
        Throwable th;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("showUpSell called while user is not in test", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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
        final Completable cache = i().c().cache();
        C8632dsu.d(cache);
        SubscribersKt.subscribeBy$default(cache, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$alertUserAndReloadApp$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th2) {
                d(th2);
                return dpR.c;
            }

            public final void d(Throwable th2) {
                Map d3;
                Map k2;
                Throwable th3;
                C8632dsu.c((Object) th2, "");
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd2 = new C1596aHd(null, th2, null, true, k2, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        String c2 = errorType2.c();
                        c1596aHd2.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th3 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th3 = new Throwable(c1596aHd2.b());
                } else {
                    th3 = c1596aHd2.i;
                    if (th3 == null) {
                        th3 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar2.a();
                if (a3 != null) {
                    a3.e(c1596aHd2, th3);
                } else {
                    dVar2.e().b(c1596aHd2, th3);
                }
            }
        }, (drO) null, 2, (Object) null);
        new AlertDialog.Builder(new ContextThemeWrapper(this.i, R.l.m)).setMessage(C6597cgM.d.c).setPositiveButton(R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.cgG
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MemberRejoinImpl.d(Completable.this, this, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Completable completable, final MemberRejoinImpl memberRejoinImpl, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) memberRejoinImpl, "");
        C8632dsu.d(completable);
        SubscribersKt.subscribeBy(completable, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$alertUserAndReloadApp$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                C8632dsu.c((Object) th, "");
                AbstractApplicationC1040Mh.getInstance().d(MemberRejoinImpl.this.g(), "WWOAB.alertUserAndReloadApp");
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$alertUserAndReloadApp$2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                AbstractApplicationC1040Mh.getInstance().d(MemberRejoinImpl.this.g(), "WWOAB.alertUserAndReloadApp");
            }
        });
    }

    public final AbstractC6601cgQ.d c() {
        return new AbstractC6601cgQ.d(this.c, this.e, C8153dex.e(this.i));
    }

    public final AbstractC6601cgQ.e b() {
        return new AbstractC6601cgQ.e(a(true), this.c, this.e, C8153dex.e(this.i));
    }

    public final AbstractC6601cgQ.c a() {
        return new AbstractC6601cgQ.c(c(this, false, 1, null), this.c, this.e, false, false, C8153dex.e(this.i), 24, null);
    }

    @SuppressLint({"CheckResult"})
    private final void a(final C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6589cgE.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$subscribe$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC6589cgE, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl$subscribe$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6589cgE abstractC6589cgE) {
                c(abstractC6589cgE);
                return dpR.c;
            }

            public final void c(AbstractC6589cgE abstractC6589cgE) {
                InterfaceC6675chl interfaceC6675chl;
                InterfaceC6675chl interfaceC6675chl2;
                InterfaceC6675chl interfaceC6675chl3;
                Map k;
                Throwable th;
                C8632dsu.c((Object) abstractC6589cgE, "");
                if (abstractC6589cgE instanceof AbstractC6589cgE.e) {
                    MemberRejoinImpl.this.j().f();
                    AbstractC6589cgE.e eVar = (AbstractC6589cgE.e) abstractC6589cgE;
                    if (eVar.d() == null) {
                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                        k = dqE.k(new LinkedHashMap());
                        C1596aHd c1596aHd = new C1596aHd("Error event.nextSceen == null, cannot send users to edit payment", null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                String c = errorType.c();
                                c1596aHd.a(c + " " + b);
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
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1597aHe c2 = dVar2.c();
                        if (c2 != null) {
                            c2.d(c1596aHd, th);
                            return;
                        } else {
                            dVar2.e().b(c1596aHd, th);
                            return;
                        }
                    }
                    MemberRejoinImpl.this.j().g();
                    interfaceC6675chl3 = MemberRejoinImpl.this.g;
                    interfaceC6675chl3.c(eVar.d(), true);
                } else if (C8632dsu.c(abstractC6589cgE, AbstractC6589cgE.d.a)) {
                    MemberRejoinImpl.this.j().i();
                    MemberRejoinImpl.this.n();
                } else if (abstractC6589cgE instanceof AbstractC6589cgE.c) {
                    if (((AbstractC6589cgE.c) abstractC6589cgE).b() instanceof AbstractC6601cgQ.c) {
                        MemberRejoinImpl.this.j().e();
                        C6585cgA j = MemberRejoinImpl.this.j();
                        C6670chg h = MemberRejoinImpl.c(MemberRejoinImpl.this, false, 1, null).h();
                        j.a(h != null ? h.a() : null, true);
                        interfaceC6675chl2 = MemberRejoinImpl.this.g;
                        interfaceC6675chl2.c(new AbstractC6601cgQ.e(MemberRejoinImpl.c(MemberRejoinImpl.this, false, 1, null), c9935zP, MemberRejoinImpl.this.j(), C8153dex.e(MemberRejoinImpl.this.g())), true);
                        return;
                    }
                    MemberRejoinImpl.this.e();
                } else if (C8632dsu.c(abstractC6589cgE, AbstractC6589cgE.a.d)) {
                    MemberRejoinImpl.this.e();
                } else if (C8632dsu.c(abstractC6589cgE, AbstractC6589cgE.g.e)) {
                    MemberRejoinImpl.this.j().j();
                    MemberRejoinImpl.this.s();
                    interfaceC6675chl = MemberRejoinImpl.this.g;
                    interfaceC6675chl.c(new AbstractC6601cgQ.c(MemberRejoinImpl.c(MemberRejoinImpl.this, false, 1, null), c9935zP, MemberRejoinImpl.this.j(), false, true, C8153dex.e(MemberRejoinImpl.this.g()), 8, null), true);
                } else if (C8632dsu.c(abstractC6589cgE, AbstractC6589cgE.b.e)) {
                    CreditCvvTakeoverDialogFragment.Companion.newInstance(MemberRejoinImpl.c(MemberRejoinImpl.this, false, 1, null).f()).show(MemberRejoinImpl.this.g().getSupportFragmentManager(), CreditCvvTakeoverDialogFragment.TAG_CREDIT_CVV_TAKEOVER_DIALOG);
                }
            }
        }, 2, (Object) null);
    }
}
