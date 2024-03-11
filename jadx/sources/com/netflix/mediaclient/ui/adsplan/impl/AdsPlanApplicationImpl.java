package com.netflix.mediaclient.ui.adsplan.impl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.features.api.FeatureExperience;
import com.netflix.mediaclient.features.api.FeatureProfileType;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC6677chn;
import o.C1045Mp;
import o.C1584aGs;
import o.C1596aHd;
import o.C4215baM;
import o.C5305bwJ;
import o.C8153dex;
import o.C8157dfA;
import o.C8166dfJ;
import o.C8242dgg;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4360bcz;
import o.InterfaceC5303bwH;
import o.InterfaceC5304bwI;
import o.InterfaceC5307bwL;
import o.XH;
import o.XI;
import o.cQF;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class AdsPlanApplicationImpl implements InterfaceC5304bwI {
    public static final b d = new b(null);
    private final Application a;
    private final cQF b;
    private XI c;
    @Inject
    public C8242dgg cacheHelper;
    private final List<InterfaceC5307bwL> e;
    private final C4215baM h;
    private boolean i;
    private final cQQ j;

    public final boolean c() {
        return this.i;
    }

    @Inject
    public AdsPlanApplicationImpl(Application application) {
        C8632dsu.c((Object) application, "");
        this.a = application;
        this.b = new cQF();
        this.j = new cQQ();
        this.h = new C4215baM();
        this.e = new ArrayList();
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("AdsPlanApplicationImpl");
        }
    }

    public final C8242dgg b() {
        C8242dgg c8242dgg = this.cacheHelper;
        if (c8242dgg != null) {
            return c8242dgg;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC5304bwI
    public void b(InterfaceC5307bwL interfaceC5307bwL) {
        C8632dsu.c((Object) interfaceC5307bwL, "");
        C8166dfJ.e(null, false, 3, null);
        this.e.add(interfaceC5307bwL);
    }

    @Override // o.InterfaceC5304bwI
    public void d(InterfaceC5307bwL interfaceC5307bwL) {
        C8632dsu.c((Object) interfaceC5307bwL, "");
        C8166dfJ.e(null, false, 3, null);
        this.e.remove(interfaceC5307bwL);
    }

    @Override // o.InterfaceC5304bwI
    public void a() {
        this.c = XH.c.d(this.a).d();
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("Cfour.ChangePlanScreen.Content.Modal", new e());
        dVar.d("Cfour.ChangePlanScreen.SwitchedIntoCfourPlan.Modal", new a());
        dVar.d("Cfour.ChangePlanScreen.SwitchedOutOfCfourPlan.Modal", new d());
        g();
    }

    /* loaded from: classes4.dex */
    public static final class e implements AbstractC6677chn.a {
        e() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC5303bwH d = C1584aGs.d(requireActivity);
            C8632dsu.d(d);
            final C5305bwJ c5305bwJ = (C5305bwJ) d;
            return c5305bwJ.c(fragment, new drM<String, AbstractC6677chn>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$onApplicationCreated$1$create$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final AbstractC6677chn invoke(String str) {
                    C8632dsu.c((Object) str, "");
                    return C5305bwJ.this.d(str);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements AbstractC6677chn.a {
        a() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC5303bwH d = C1584aGs.d(requireActivity);
            C8632dsu.d(d);
            return ((C5305bwJ) d).j();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC5303bwH d = C1584aGs.d(requireActivity);
            C8632dsu.d(d);
            C5305bwJ c5305bwJ = (C5305bwJ) d;
            c5305bwJ.m();
            return c5305bwJ.i();
        }
    }

    private final void g() {
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$setupObservers$appObserver$1
            private CompositeDisposable b = new CompositeDisposable();

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                boolean j;
                cQF cqf;
                cQQ cqq;
                C8632dsu.c((Object) lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                j = AdsPlanApplicationImpl.this.j();
                if (j) {
                    if (C8153dex.h()) {
                        CompositeDisposable compositeDisposable = this.b;
                        cqf = AdsPlanApplicationImpl.this.b;
                        cqq = AdsPlanApplicationImpl.this.j;
                        compositeDisposable.add(SubscribersKt.subscribeBy(cQF.b(cqf, cqq, false, 2, null), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$setupObservers$appObserver$1$onResume$1
                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Throwable th) {
                                d(th);
                                return dpR.c;
                            }

                            public final void d(Throwable th) {
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
                                    String b2 = c1596aHd.b();
                                    if (b2 != null) {
                                        String c2 = errorType.c();
                                        c1596aHd.a(c2 + " " + b2);
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
                        }, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$setupObservers$appObserver$1$onResume$2
                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Boolean bool) {
                                d(bool.booleanValue());
                                return dpR.c;
                            }

                            public final void d(boolean z) {
                                AdsPlanApplicationImpl.b bVar = AdsPlanApplicationImpl.d;
                            }
                        }));
                    }
                    AdsPlanApplicationImpl.this.d();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                this.b.dispose();
                super.onDestroy(lifecycleOwner);
            }
        };
        XH.c.d(this.a).c(new c());
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(defaultLifecycleObserver);
    }

    /* loaded from: classes4.dex */
    public static final class c implements XH.d {
        c() {
        }

        @Override // o.XH.d
        public void d() {
            final AdsPlanApplicationImpl adsPlanApplicationImpl = AdsPlanApplicationImpl.this;
            adsPlanApplicationImpl.c(new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$setupObservers$featureRepositoryListener$1$onUpdated$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return dpR.c;
                }

                public final void e(boolean z) {
                    AdsPlanApplicationImpl.this.b(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void b(boolean z) {
        if (z) {
            SubscribersKt.subscribeBy(InterfaceC4360bcz.b.a().a(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$notifyUiOfAdsPlanChange$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
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
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$notifyUiOfAdsPlanChange$2
                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    AdsPlanApplicationImpl.b bVar = AdsPlanApplicationImpl.d;
                }
            });
        }
        C8157dfA.d((Context) this.a, "PENDING_CFOUR_PLAN_ALERT", true);
        d();
        for (InterfaceC5307bwL interfaceC5307bwL : this.e) {
            XI xi = this.c;
            interfaceC5307bwL.a((xi != null ? xi.d() : null) == FeatureExperience.e);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void c(final drM<? super Boolean, dpR> drm) {
        FeatureExperience featureExperience;
        C8632dsu.c((Object) drm, "");
        XI d2 = XH.c.d(this.a).d();
        final FeatureExperience d3 = d2.d();
        XI xi = this.c;
        FeatureExperience d4 = xi != null ? xi.d() : null;
        if (c(this.c) && c(d2) && d4 != d3 && (d4 == (featureExperience = FeatureExperience.e) || d3 == featureExperience)) {
            SubscribersKt.subscribeBy(b().c(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$verifyUserAccountType$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    Map d5;
                    Map k;
                    Throwable th2;
                    C8632dsu.c((Object) th, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d5 = dqE.d();
                    k = dqE.k(d5);
                    C1596aHd c1596aHd = new C1596aHd("Unable to clear cache", th, null, true, k, false, false, 96, null);
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
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl$verifyUserAccountType$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }

                public final void c() {
                    drm.invoke(Boolean.valueOf(d3 == FeatureExperience.e));
                }
            });
        }
        this.c = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        C8157dfA.e(this.a, "CFOUR_LINK_COPIED_PREF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return C8157dfA.b((Context) this.a, "CFOUR_LINK_COPIED_PREF", 0L) > 0;
    }

    public final void e() {
        this.i = false;
        AbstractApplicationC1040Mh.getInstance().d(this.a, "CfourPlan.alertUserAndReloadApp");
    }

    private final boolean c(XI xi) {
        return (xi == null || xi.c() == FeatureProfileType.d || !xi.a()) ? false : true;
    }
}
