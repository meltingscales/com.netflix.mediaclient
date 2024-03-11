package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6828ckf;
import o.C1596aHd;
import o.C6765cjV;
import o.C6832ckj;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;

/* renamed from: o.cjV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6765cjV implements InterfaceC6761cjR, NetworkRequestResponseListener, LifecycleOwner {
    public static final d e = new d(null);
    private AbstractC6833ckk a;
    private final C6827cke b;
    private final C9935zP c;
    private final LifecycleRegistry d;
    private final C6765cjV f;
    private final MoneyballDataSource g;
    private final LoginApi h;
    private final LifecycleRegistry i;
    private final InterfaceC6675chl j;
    private final NetflixActivity k;
    private TrackingInfo l;
    private final InterfaceC6829ckg m;

    /* renamed from: o.cjV$c */
    /* loaded from: classes4.dex */
    static final /* synthetic */ class c implements Observer, InterfaceC8631dst {
        private final /* synthetic */ drM c;

        c(drM drm) {
            C8632dsu.c((Object) drm, "");
            this.c = drm;
        }

        @Override // o.InterfaceC8631dst
        public final InterfaceC8555dpy<?> b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC8631dst)) {
                return C8632dsu.c(b(), ((InterfaceC8631dst) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.c.invoke(obj);
        }
    }

    @Override // o.InterfaceC6761cjR
    /* renamed from: f */
    public C6765cjV c() {
        return this.f;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: g */
    public LifecycleRegistry getLifecycle() {
        return this.d;
    }

    public final InterfaceC6675chl n() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onBeforeNetworkAction(Request request) {
        C8632dsu.c((Object) request, "");
    }

    @Inject
    public C6765cjV(Activity activity, InterfaceC6675chl interfaceC6675chl, LoginApi loginApi, InterfaceC6829ckg interfaceC6829ckg, MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        C8632dsu.c((Object) loginApi, "");
        C8632dsu.c((Object) interfaceC6829ckg, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        this.j = interfaceC6675chl;
        this.h = loginApi;
        this.m = interfaceC6829ckg;
        this.g = moneyballDataSource;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.k = netflixActivity;
        C9935zP d2 = C9935zP.b.d(netflixActivity);
        this.c = d2;
        this.b = new C6827cke();
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        this.i = lifecycleRegistry;
        this.f = this;
        d(d2);
        moneyballDataSource.getLiveMoneyballData().observe(netflixActivity, new c(new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApiImpl$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                e(moneyballData);
                return dpR.c;
            }

            public final void e(MoneyballData moneyballData) {
                C6765cjV c6765cjV = C6765cjV.this;
                FlowMode flowMode = moneyballData.getFlowMode();
                C8632dsu.a(flowMode, "");
                c6765cjV.e(flowMode);
            }
        }));
        this.d = lifecycleRegistry;
    }

    /* renamed from: o.cjV$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.InterfaceC6761cjR
    public void e(String str, String str2, String str3, drO<dpR> dro) {
        List<? extends NetworkRequestResponseListener> e2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        this.i.setCurrentState(Lifecycle.State.CREATED);
        SignupNetworkManager signupNetworkManager = this.m.signupNetworkManager();
        MoneyballCallData a = a(str);
        e2 = C8566dqi.e(this);
        signupNetworkManager.performActionRequest(str, a, e2);
        this.l = str3 != null ? CLv2Utils.e(str3) : null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final MoneyballCallData a(String str) {
        MoneyballCallData moneyballCallData;
        if (str != null) {
            switch (str.hashCode()) {
                case -1208857332:
                    if (str.equals(UmaCta.MANAGE_PRIMARY_LOCATION)) {
                        moneyballCallData = new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", "mhuUpdateHouseholdAction");
                        break;
                    }
                    break;
                case -270981616:
                    if (str.equals(UmaCta.MHU_TRAVEL_ALLOW_OTP)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", SignupConstants.Action.MHU_VERIFY_TRAVEL_ACTION);
                    }
                    break;
                case 247975198:
                    if (str.equals(SignupConstants.Action.RESEND_CODE_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuVerifyFactor", str);
                    }
                    break;
                case 1004001131:
                    if (str.equals(SignupConstants.Action.SMS_OTP_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", str);
                    }
                    break;
                case 2082533870:
                    if (str.equals(SignupConstants.Action.EMAIL_OTP_ACTION)) {
                        return new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", str);
                    }
                    break;
            }
            return moneyballCallData;
        }
        SignupErrorReporter signupErrorReporter = this.m.signupErrorReporter();
        SignupErrorReporter.onDataError$default(signupErrorReporter, SignupConstants.Error.UNKNOWN_MODE, "UMA_CTA_" + str, null, 4, null);
        moneyballCallData = new MoneyballCallData(SignupConstants.Flow.ANDROID_MEMBER, "mhuNudgeLanding", "mhuUpdateHouseholdAction");
        return moneyballCallData;
    }

    public final void p() {
        this.h.d(this.k);
    }

    public final void l() {
        new AlertDialog.Builder(new ContextThemeWrapper(this.k, com.netflix.mediaclient.ui.R.l.m)).setMessage(C6832ckj.a.q).setPositiveButton(C6832ckj.a.s, new DialogInterface.OnClickListener() { // from class: o.cjY
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6765cjV.d(dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void w() {
        d(false);
        C1645aIz.a(this.k, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApiImpl$showUMAAlert$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                c(serviceManager);
                return dpR.c;
            }

            public final void c(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                serviceManager.N();
            }
        });
    }

    static /* synthetic */ void d(C6765cjV c6765cjV, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c6765cjV.d(z);
    }

    private final void d(boolean z) {
        this.a = null;
        this.j.b("Multihousehold.General.Modal");
        this.b.d();
        if (z) {
            this.i.setCurrentState(Lifecycle.State.DESTROYED);
        }
    }

    public final void m() {
        e(e());
    }

    public final void s() {
        e(h());
    }

    public final void q() {
        e(j());
    }

    public final void t() {
        e(i());
    }

    public final void k() {
        e(b());
    }

    public final void o() {
        e(a());
    }

    public final void r() {
        e(d());
    }

    public final C6812ckP e() {
        C6817ckU c6817ckU = this.m.b().get();
        C8632dsu.a(c6817ckU, "");
        return new C6812ckP(c6817ckU, this.c);
    }

    public final C6885clj h() {
        C6891clp c6891clp = this.m.h().get();
        C8632dsu.a(c6891clp, "");
        return new C6885clj(c6891clp, this.c);
    }

    public final C6809ckM j() {
        C6807ckK c6807ckK = this.m.g().get();
        C8632dsu.a(c6807ckK, "");
        return new C6809ckM(c6807ckK, this.c);
    }

    public final C6894cls i() {
        C6851clB c6851clB = this.m.j().get();
        C8632dsu.a(c6851clB, "");
        return new C6894cls(c6851clB, this.c, this.l);
    }

    public final C6799ckC b() {
        C6803ckG c6803ckG = this.m.a().get();
        C8632dsu.a(c6803ckG, "");
        return new C6799ckC(c6803ckG, this.c);
    }

    public final C6838ckp a() {
        C6846ckx c6846ckx = this.m.d().get();
        C8632dsu.a(c6846ckx, "");
        return new C6838ckp(c6846ckx, this.c);
    }

    public final C6877clb d() {
        C6883clh c6883clh = this.m.c().get();
        C8632dsu.a(c6883clh, "");
        return new C6877clb(c6883clh, this.c);
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onAfterNetworkAction(Response response) {
        C8632dsu.c((Object) response, "");
        if (response.isValidState()) {
            this.g.getLiveMoneyballData().setValue(response.getMoneyballData());
            return;
        }
        v();
        l();
    }

    private final void v() {
        AbstractC6833ckk abstractC6833ckk = this.a;
        if (abstractC6833ckk != null) {
            e(abstractC6833ckk);
        }
    }

    private final void e(AbstractC6833ckk abstractC6833ckk) {
        this.a = abstractC6833ckk;
        this.b.d(abstractC6833ckk.b(), abstractC6833ckk.d());
        this.j.c(abstractC6833ckk, true);
    }

    private final void y() {
        Object systemService = this.k.getSystemService("input_method");
        C8632dsu.d(systemService);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = this.k.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(FlowMode flowMode) {
        y();
        String mode = flowMode.getMode();
        switch (mode.hashCode()) {
            case -1341516135:
                if (mode.equals("memberHome")) {
                    d(this, false, 1, null);
                    return;
                }
                break;
            case -1017574303:
                if (mode.equals("mhuResendOnly")) {
                    k();
                    return;
                }
                break;
            case -968838405:
                if (mode.equals("mhuUpdateHouseholdLanding")) {
                    m();
                    return;
                }
                break;
            case -728178046:
                if (mode.equals("mhuVerifyFactor")) {
                    k();
                    return;
                }
                break;
            case -616918058:
                if (mode.equals("mhuNudgeLanding")) {
                    w();
                    return;
                }
                break;
            case -311728051:
                if (mode.equals("mhuVerifyTravel")) {
                    t();
                    return;
                }
                break;
            case -291659555:
                if (mode.equals("mhuUpdateHouseholdHelp")) {
                    q();
                    return;
                }
                break;
            case -207048641:
                if (mode.equals("mhuChallengeError")) {
                    o();
                    return;
                }
                break;
            case 34844307:
                if (mode.equals("mhuUpdateHouseholdContext")) {
                    s();
                    return;
                }
                break;
            case 551504936:
                if (mode.equals("misdetectionResolutionMobileSessionStart")) {
                    r();
                    return;
                }
                break;
        }
        l();
    }

    @SuppressLint({"CheckResult"})
    private final void d(C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6828ckf.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApiImpl$subscribe$1
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
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC6828ckf, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApiImpl$subscribe$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6828ckf abstractC6828ckf) {
                e(abstractC6828ckf);
                return dpR.c;
            }

            public final void e(AbstractC6828ckf abstractC6828ckf) {
                C8632dsu.c((Object) abstractC6828ckf, "");
                if (abstractC6828ckf instanceof AbstractC6828ckf.e) {
                    C6765cjV.this.n().b("Multihousehold.General.Modal");
                } else if (abstractC6828ckf instanceof AbstractC6828ckf.b) {
                    C6765cjV.this.p();
                } else if (abstractC6828ckf instanceof AbstractC6828ckf.c) {
                    ((AbstractC6828ckf.c) abstractC6828ckf).a().invoke(C6765cjV.this);
                }
            }
        }, 2, (Object) null);
    }
}
