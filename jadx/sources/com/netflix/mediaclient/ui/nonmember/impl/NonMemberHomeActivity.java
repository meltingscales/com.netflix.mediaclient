package com.netflix.mediaclient.ui.nonmember.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.clcs.ui.InterstitialCoordinator;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractActivityC7023coP;
import o.AbstractC7019coK;
import o.ActivityC7087cpb;
import o.C1045Mp;
import o.C1596aHd;
import o.C7028coU;
import o.C8051ddA;
import o.C8126deW;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.InterfaceC7020coL;
import o.aIA;
import o.aIJ;
import o.bXD;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class NonMemberHomeActivity extends AbstractActivityC7023coP implements InterstitialCoordinator.b {
    private final cQQ d = new cQQ();
    @Inject
    public Lazy<bXD> interstitials;
    @Inject
    public InterfaceC7020coL nonMember;
    @Inject
    public Provider<Boolean> signUpCopyLinkBannerEnabled;
    @Inject
    public String signUpCopyLinkDisplayUrl;
    @Inject
    public String signUpCopyLinkPath;
    public static final c e = new c(null);
    public static final int b = 8;

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public final Lazy<bXD> k() {
        Lazy<bXD> lazy = this.interstitials;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7020coL l() {
        InterfaceC7020coL interfaceC7020coL = this.nonMember;
        if (interfaceC7020coL != null) {
            return interfaceC7020coL;
        }
        C8632dsu.d("");
        return null;
    }

    public final Provider<Boolean> m() {
        Provider<Boolean> provider = this.signUpCopyLinkBannerEnabled;
        if (provider != null) {
            return provider;
        }
        C8632dsu.d("");
        return null;
    }

    public final String q() {
        String str = this.signUpCopyLinkPath;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String o() {
        String str = this.signUpCopyLinkDisplayUrl;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NonMemberHomeActivity");
        }

        public final Intent d(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, d());
        }

        private final Class<? extends NonMemberHomeActivity> d() {
            return NetflixApplication.getInstance().M() ? ActivityC7087cpb.class : NonMemberHomeActivity.class;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Observable d = C9935zP.b.d(this).d(AbstractC7019coK.a.class);
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a, "");
        Object as = d.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        final drM<AbstractC7019coK.a, dpR> drm = new drM<AbstractC7019coK.a, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC7019coK.a aVar) {
                c(aVar);
                return dpR.c;
            }

            public final void c(AbstractC7019coK.a aVar) {
                InterfaceC5283bvo a2 = C8126deW.a((NetflixActivity) NonMemberHomeActivity.this);
                if (a2 != null) {
                    bXD bxd = NonMemberHomeActivity.this.k().get();
                    C8632dsu.a(bxd, "");
                    int parseInt = Integer.parseInt(aVar.a());
                    NonMemberHomeActivity nonMemberHomeActivity = NonMemberHomeActivity.this;
                    FragmentManager supportFragmentManager = nonMemberHomeActivity.getSupportFragmentManager();
                    C8632dsu.a(supportFragmentManager, "");
                    C7028coU.c(bxd, parseInt, nonMemberHomeActivity, a2, supportFragmentManager);
                    Logger.INSTANCE.endSession(aVar.b());
                    return;
                }
                NonMemberHomeActivity.e.getLogTag();
            }
        };
        Consumer consumer = new Consumer() { // from class: o.coO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NonMemberHomeActivity.h(drM.this, obj);
            }
        };
        final NonMemberHomeActivity$onCreate$2 nonMemberHomeActivity$onCreate$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onCreate$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                NonMemberHomeActivity.c cVar = NonMemberHomeActivity.e;
            }
        };
        ((ObservableSubscribeProxy) as).b(consumer, new Consumer() { // from class: o.coM
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NonMemberHomeActivity.g(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Observable<Boolean> e2 = l().e();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a(this, event);
        C8632dsu.a(a, "");
        Object as = e2.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                b(bool);
                return dpR.c;
            }

            public final void b(Boolean bool) {
                C8632dsu.d(bool);
                if (bool.booleanValue()) {
                    NonMemberHomeActivity nonMemberHomeActivity = NonMemberHomeActivity.this;
                    Intent d = HomeActivity.d((Context) nonMemberHomeActivity, nonMemberHomeActivity.getUiScreen(), false);
                    d.addFlags(268468224);
                    nonMemberHomeActivity.startActivity(d);
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.coR
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NonMemberHomeActivity.i(drM.this, obj);
            }
        };
        final NonMemberHomeActivity$onResume$2 nonMemberHomeActivity$onResume$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onResume$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                NonMemberHomeActivity.c cVar = NonMemberHomeActivity.e;
            }
        };
        ((ObservableSubscribeProxy) as).b(consumer, new Consumer() { // from class: o.coQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NonMemberHomeActivity.f(drM.this, obj);
            }
        });
        Boolean bool = m().get();
        C8632dsu.a(bool, "");
        if (bool.booleanValue()) {
            Observable<cQQ.d> c2 = this.d.c(3600000L);
            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this, event);
            C8632dsu.a(a2, "");
            Object as2 = c2.as(AutoDispose.b(a2));
            C8632dsu.b(as2, "");
            final drM<cQQ.d, dpR> drm2 = new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onResume$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.d dVar) {
                    b(dVar);
                    return dpR.c;
                }

                public final void b(cQQ.d dVar) {
                    dpR dpr;
                    if (dVar.e().j()) {
                        String b2 = dVar.b();
                        if (b2 != null) {
                            NonMemberHomeActivity nonMemberHomeActivity = NonMemberHomeActivity.this;
                            nonMemberHomeActivity.c(C8051ddA.c(aIJ.a(nonMemberHomeActivity, nonMemberHomeActivity.q()), b2));
                            dpr = dpR.c;
                        } else {
                            dpr = null;
                        }
                        if (dpr == null) {
                            NonMemberHomeActivity.c cVar = NonMemberHomeActivity.e;
                            return;
                        }
                        return;
                    }
                    NonMemberHomeActivity.c cVar2 = NonMemberHomeActivity.e;
                }
            };
            Consumer consumer2 = new Consumer() { // from class: o.coT
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NonMemberHomeActivity.m(drM.this, obj);
                }
            };
            final NonMemberHomeActivity$onResume$4 nonMemberHomeActivity$onResume$4 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$onResume$4
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    Map d;
                    Map k;
                    Throwable th2;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("Error occurred while fetching auto login token", th, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c3 = errorType.c();
                            c1596aHd.a(c3 + " " + b2);
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
                    InterfaceC1598aHf a3 = dVar.a();
                    if (a3 != null) {
                        a3.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            };
            ((ObservableSubscribeProxy) as2).b(consumer2, new Consumer() { // from class: o.coV
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NonMemberHomeActivity.n(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        this.composeViewOverlayManager.a(true, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$1
            public final void a() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1873273166, true, new NonMemberHomeActivity$showCopyLinkBanner$2(this, str)));
    }

    @Override // o.MO
    public Fragment d() {
        UpNextFeedFragment upNextFeedFragment = new UpNextFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show-search-in-action-bar", false);
        upNextFeedFragment.setArguments(bundle);
        return upNextFeedFragment;
    }

    @Override // com.netflix.clcs.ui.InterstitialCoordinator.b
    public InterstitialCoordinator c() {
        return k().get().e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.nonMemberHome;
    }
}
