package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$1;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$startUpgradeAutoDismissTimer$1;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Single;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5316bwU;
import o.AbstractC5318bwW;
import o.C1026Lt;
import o.C1596aHd;
import o.C1815aPg;
import o.C5305bwJ;
import o.C5311bwP;
import o.C5319bwX;
import o.C8157dfA;
import o.C8206dfx;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6675chl;
import o.aIJ;
import o.cQQ;
import o.dpR;
import o.dqE;

/* renamed from: o.bwJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5305bwJ implements InterfaceC5303bwH, InterfaceC5307bwL {
    private final InterfaceC5304bwI a;
    private final C5311bwP b;
    private final InterfaceC1270Vf c;
    private final int f;
    private final int g;
    private final String h;
    private final C1333Xq i;
    private final boolean j;
    private final int k;
    private final String l;
    private final InterfaceC6675chl m;
    private final C9935zP n;

    /* renamed from: o  reason: collision with root package name */
    private final NetflixActivity f13632o;
    private boolean q;
    private final cQQ s;
    public static final d e = new d(null);
    private static long d = 7000;

    @Override // o.InterfaceC5303bwH
    public int b() {
        return this.g;
    }

    @Override // o.InterfaceC5303bwH
    public int c() {
        return this.f;
    }

    @Override // o.InterfaceC5303bwH
    public boolean d() {
        return this.j;
    }

    @Override // o.InterfaceC5303bwH
    /* renamed from: h */
    public String a() {
        return this.h;
    }

    @Override // o.InterfaceC5303bwH
    /* renamed from: k */
    public String e() {
        return this.l;
    }

    public final NetflixActivity o() {
        return this.f13632o;
    }

    @Inject
    public C5305bwJ(Activity activity, InterfaceC6675chl interfaceC6675chl, InterfaceC1270Vf interfaceC1270Vf, InterfaceC5304bwI interfaceC5304bwI) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) interfaceC5304bwI, "");
        this.m = interfaceC6675chl;
        this.c = interfaceC1270Vf;
        this.a = interfaceC5304bwI;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.f13632o = netflixActivity;
        C9935zP d2 = C9935zP.b.d(netflixActivity);
        this.n = d2;
        this.b = new C5311bwP();
        this.s = new cQQ();
        this.i = C1333Xq.d(C5319bwX.b.e);
        a(d2);
        netflixActivity.getLifecycle().addObserver(new AdsPlanApiImpl$1(this));
        this.j = !BrowseExperience.a();
        String d3 = C8168dfL.d(C5319bwX.b.a);
        C8632dsu.a(d3, "");
        this.l = d3;
        this.k = C5319bwX.d.c;
        this.f = C5319bwX.a.d;
        String d4 = C8168dfL.d(d() ? C5319bwX.b.c : C5319bwX.b.a);
        C8632dsu.a(d4, "");
        this.h = d4;
        this.g = C1026Lt.a.zf;
    }

    /* renamed from: o.bwJ$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AdsPlanApiImpl");
        }

        public final long a() {
            return C5305bwJ.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        C8157dfA.e(this.f13632o, "CFOUR_LINK_COPIED_PREF", this.c.c());
    }

    public final AbstractC6677chn d(String str) {
        C8632dsu.c((Object) str, "");
        return new AbstractC5318bwW.b(str, this.n, this.b);
    }

    private final void d(LifecycleOwner lifecycleOwner, final drM<? super String, dpR> drm) {
        List<String> e2;
        cQQ cqq = this.s;
        e2 = C8566dqi.e("CHANGE_PLAN_VIA_INAPP_LINK");
        Single<cQQ.d> a = cqq.a(e2);
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(lifecycleOwner, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = a.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.d((SingleSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$createUrlWithAutoLoginToken$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Unable to get token: error", th, null, true, k, false, false, 96, null);
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
        }, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$createUrlWithAutoLoginToken$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cQQ.d dVar) {
                c(dVar);
                return dpR.c;
            }

            public final void c(cQQ.d dVar) {
                Map d2;
                Map k;
                Throwable th;
                EdgeStack d3;
                C8632dsu.c((Object) dVar, "");
                String b = dVar.b();
                if (b != null) {
                    String str = "ChangePlan?nftoken=" + b;
                    C5305bwJ.d dVar2 = C5305bwJ.e;
                    dVar2.getLogTag();
                    if (C8206dfx.e() && ((d3 = C1815aPg.d(C5305bwJ.this.o())) == EdgeStack.INT || d3 == EdgeStack.TEST)) {
                        UserAgent k2 = AbstractApplicationC1040Mh.getInstance().i().k();
                        String a3 = k2 != null ? k2.a() : null;
                        if (a3 != null && a3.length() != 0) {
                            str = ((Object) str) + "&forceCountry=" + a3;
                            dVar2.getLogTag();
                        }
                        drm.invoke(aIJ.a(C5305bwJ.this.o(), str));
                        return;
                    }
                    drm.invoke(aIJ.a(C5305bwJ.this.o(), str));
                    return;
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Unable to get token: null", null, null, true, k, false, false, 96, null);
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
                InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a4 = dVar3.a();
                if (a4 != null) {
                    a4.e(c1596aHd, th);
                } else {
                    dVar3.e().b(c1596aHd, th);
                }
            }
        });
    }

    @Override // o.InterfaceC5303bwH
    public boolean g() {
        return C8153dex.h();
    }

    private final String p() {
        return aIJ.a(this.f13632o, "ChangePlan");
    }

    @Override // o.InterfaceC5303bwH
    public View b(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) onClickListener, "");
        if (g()) {
            View inflate = LayoutInflater.from(this.f13632o).inflate(c(), viewGroup, false);
            int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(C9834xU.a.v);
            int dimensionPixelSize2 = inflate.getResources().getDimensionPixelSize(C9834xU.a.C);
            C8632dsu.d(inflate);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = dimensionPixelSize;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                marginLayoutParams.setMarginStart(dimensionPixelSize2);
                marginLayoutParams.setMarginEnd(dimensionPixelSize2);
                inflate.requestLayout();
            }
            inflate.setOnClickListener(onClickListener);
            inflate.setClickable(true);
            ((C1203Sq) inflate.findViewById(C5319bwX.e.d)).setText(e());
            return inflate;
        }
        return null;
    }

    @Override // o.InterfaceC5307bwL
    public void a(boolean z) {
        this.q = false;
        if (z || !s()) {
            this.f13632o.getIntent().putExtra("IS_CFOUR_PLAN_EXTRA", !z);
            if (InterfaceC7306cti.c.e(this.f13632o).a(this.f13632o)) {
                this.f13632o.finish();
                return;
            }
            this.q = true;
            this.f13632o.recreate();
        }
    }

    private final boolean s() {
        return this.f13632o.getUiScreen() == AppView.playback;
    }

    public final boolean d(boolean z) {
        AbstractC6677chn i;
        LifecycleObserver a;
        if (this.f13632o.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED && !(this.f13632o instanceof LaunchActivity) && !s()) {
            if (z) {
                i = j();
            } else {
                m();
                i = i();
            }
            LifecycleOwner b = InterfaceC6675chl.a.b(this.m, i, null, false, 6, null);
            if (b != null) {
                if (z) {
                    this.b.j();
                    a = a(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$alertUserToOrFromAdsPlan$modalDismissObserver$1
                        {
                            super(0);
                        }

                        public final void b() {
                            C5311bwP c5311bwP;
                            c5311bwP = C5305bwJ.this.b;
                            c5311bwP.a();
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            b();
                            return dpR.c;
                        }
                    });
                } else {
                    this.b.g();
                    a = a(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$alertUserToOrFromAdsPlan$modalDismissObserver$2
                        {
                            super(0);
                        }

                        public final void e() {
                            C5311bwP c5311bwP;
                            c5311bwP = C5305bwJ.this.b;
                            c5311bwP.b();
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            e();
                            return dpR.c;
                        }
                    });
                }
                b.getLifecycle().addObserver(a);
            }
            if (b != null) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC5318bwW.d j() {
        return new AbstractC5318bwW.d(this.n, this.b);
    }

    public final AbstractC5318bwW.a i() {
        String d2;
        String d3 = this.s.d();
        if (d3 == null || BrowseExperience.a()) {
            d2 = C8168dfL.d(C5319bwX.b.f);
        } else {
            d2 = C1333Xq.d(C5319bwX.b.j).d(SignupConstants.Field.EMAIL, d3).c();
        }
        C9935zP c9935zP = this.n;
        C5311bwP c5311bwP = this.b;
        C8632dsu.d((Object) d2);
        return new AbstractC5318bwW.a(c9935zP, c5311bwP, d2);
    }

    public final void m() {
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.f13632o), null, null, new AdsPlanApiImpl$startUpgradeAutoDismissTimer$1(this, null), 3, null);
    }

    public boolean l() {
        return C8157dfA.b((Context) this.f13632o, "PENDING_CFOUR_PLAN_ALERT", false);
    }

    @Override // o.InterfaceC5303bwH
    public CharSequence d(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        if (g()) {
            return this.i.d(SignupConstants.Field.VIDEO_TITLE, charSequence).c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdsPlanApplicationImpl n() {
        InterfaceC5304bwI interfaceC5304bwI = this.a;
        C8632dsu.d(interfaceC5304bwI);
        return (AdsPlanApplicationImpl) interfaceC5304bwI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        new AlertDialog.Builder(new ContextThemeWrapper(this.f13632o, com.netflix.mediaclient.ui.R.l.m)).setMessage(C5319bwX.b.b).setCancelable(false).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.bwM
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5305bwJ.b(C5305bwJ.this, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5305bwJ c5305bwJ, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5305bwJ, "");
        c5305bwJ.n().e();
    }

    private final LifecycleObserver a(final drO<dpR> dro) {
        return new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$buildModalDismissObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                dro.invoke();
                super.onDestroy(lifecycleOwner);
            }
        };
    }

    public final AbstractC6677chn c(Fragment fragment, final drM<? super String, ? extends AbstractC6677chn> drm) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) drm, "");
        AbstractC6677chn invoke = drm.invoke(p());
        d(fragment, new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$createScreenAndRequestAutoLoginToken$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                e(str);
                return dpR.c;
            }

            public final void e(String str) {
                InterfaceC6675chl interfaceC6675chl;
                C8632dsu.c((Object) str, "");
                interfaceC6675chl = C5305bwJ.this.m;
                InterfaceC6675chl.a.b(interfaceC6675chl, drm.invoke(str), null, true, 2, null);
            }
        });
        return invoke;
    }

    @SuppressLint({"CheckResult"})
    private final void a(C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC5316bwU.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$subscribe$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
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
        }, (drO) null, new drM<AbstractC5316bwU, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApiImpl$subscribe$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5316bwU abstractC5316bwU) {
                b(abstractC5316bwU);
                return dpR.c;
            }

            public final void b(AbstractC5316bwU abstractC5316bwU) {
                C5311bwP c5311bwP;
                InterfaceC6675chl interfaceC6675chl;
                InterfaceC6675chl interfaceC6675chl2;
                C5311bwP c5311bwP2;
                C8632dsu.c((Object) abstractC5316bwU, "");
                if (abstractC5316bwU instanceof AbstractC5316bwU.a) {
                    c5311bwP2 = C5305bwJ.this.b;
                    c5311bwP2.h();
                    C8157dfA.a(C5305bwJ.this.o(), "CFOUR_UPSELL_GROUP_WHILE_LINK_COPIED_PREF", abstractC5316bwU.e());
                    C5305bwJ.this.t();
                } else if (abstractC5316bwU instanceof AbstractC5316bwU.d) {
                    interfaceC6675chl2 = C5305bwJ.this.m;
                    interfaceC6675chl2.e(abstractC5316bwU.e());
                } else if (abstractC5316bwU instanceof AbstractC5316bwU.e) {
                    c5311bwP = C5305bwJ.this.b;
                    c5311bwP.d();
                    interfaceC6675chl = C5305bwJ.this.m;
                    interfaceC6675chl.e(abstractC5316bwU.e());
                }
            }
        }, 2, (Object) null);
    }
}
