package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6745cjB;
import o.AbstractC6756cjM;
import o.AbstractC6764cjU;
import o.C1596aHd;
import o.C6754cjK;
import o.C6755cjL;
import o.C6763cjT;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6675chl;
import o.dpR;
import o.dqE;
import o.drO;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cjL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6755cjL implements InterfaceC6746cjC {
    public static final b d = new b(null);
    private final C6754cjK a;
    private final LoginApi b;
    private final C9935zP e;
    private C6762cjS f;
    private final NetflixActivity g;
    private final InterfaceC8554dpx h;
    private final InterfaceC6748cjE i;
    private final InterfaceC6675chl j;

    public final InterfaceC6748cjE d() {
        return this.i;
    }

    @Inject
    public C6755cjL(Activity activity, InterfaceC6748cjE interfaceC6748cjE, InterfaceC6675chl interfaceC6675chl, LoginApi loginApi) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6748cjE, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        C8632dsu.c((Object) loginApi, "");
        this.i = interfaceC6748cjE;
        this.j = interfaceC6675chl;
        this.b = loginApi;
        final NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.g = netflixActivity;
        C9935zP d2 = C9935zP.b.d(netflixActivity);
        this.e = d2;
        this.a = new C6754cjK();
        this.h = new ViewModelLazy(dsA.a(C6760cjQ.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
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
        a(d2);
        netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C6754cjK c6754cjK;
                C8632dsu.c((Object) lifecycleOwner, "");
                c6754cjK = C6755cjL.this.a;
                c6754cjK.e();
                super.onDestroy(lifecycleOwner);
            }
        });
    }

    /* renamed from: o.cjL$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MultihouseholdNudgeImpl");
        }
    }

    private final C6760cjQ i() {
        return (C6760cjQ) this.h.getValue();
    }

    private final boolean e(String str) {
        boolean g;
        Map d2;
        Map k;
        Throwable th;
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("CAN_SNOOZE")) {
                    return !jSONObject.getBoolean("CAN_SNOOZE");
                }
                return false;
            } catch (JSONException e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Error while parsing CTA params for Multihousehold nudge UMA", e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
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
                    return false;
                }
                dVar.e().b(c1596aHd, th);
                return false;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6746cjC
    public void b(String str, String str2, drM<? super LifecycleOwner, dpR> drm, drO<dpR> dro) {
        String str3;
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        if (C8632dsu.c((Object) str, (Object) "EMAIL_CODE_VALIDATION")) {
            str3 = SignupConstants.Action.EMAIL_OTP_ACTION;
        } else {
            str3 = C8632dsu.c((Object) str, (Object) "SMS_CODE_VALIDATION") ? SignupConstants.Action.SMS_OTP_ACTION : null;
        }
        C6760cjQ.e(i(), this, str3, e(str2), null, drm, dro, 8, null);
    }

    @Override // o.InterfaceC6746cjC
    public LifecycleOwner e() {
        return InterfaceC6675chl.a.b(this.j, b(), null, true, 2, null);
    }

    public final void j() {
        NetflixActivity netflixActivity = this.g;
        netflixActivity.startActivity(this.b.e(netflixActivity));
    }

    public final LifecycleOwner c(boolean z, C6762cjS c6762cjS) {
        this.f = c6762cjS;
        if ((c6762cjS != null ? c6762cjS.a() : null) == null) {
            if ((c6762cjS != null ? c6762cjS.d() : null) != null) {
                return InterfaceC6675chl.a.b(this.j, e(c6762cjS, z), null, true, 2, null);
            }
        }
        return InterfaceC6675chl.a.b(this.j, d(c6762cjS, z), null, true, 2, null);
    }

    public final LifecycleOwner a(boolean z, C6762cjS c6762cjS) {
        this.f = c6762cjS;
        if ((c6762cjS != null ? c6762cjS.a() : null) == null) {
            return InterfaceC6675chl.a.b(this.j, a(c6762cjS, z), null, true, 2, null);
        }
        return InterfaceC6675chl.a.b(this.j, d(c6762cjS, z), null, true, 2, null);
    }

    public final LifecycleOwner e(boolean z, C6762cjS c6762cjS) {
        this.f = c6762cjS;
        return InterfaceC6675chl.a.b(this.j, c(c6762cjS, z), null, true, 2, null);
    }

    public final LifecycleOwner b(boolean z, C6762cjS c6762cjS) {
        this.f = c6762cjS;
        if ((c6762cjS != null ? c6762cjS.a() : null) == null) {
            c();
        } else {
            c();
            if (C8632dsu.c((Object) c6762cjS.a(), (Object) SignupConstants.Error.USER_NOT_LOGGED_IN)) {
                j();
            } else {
                return InterfaceC6675chl.a.b(this.j, d(c6762cjS, z), null, false, 2, null);
            }
        }
        return null;
    }

    public final void a() {
        new AlertDialog.Builder(new ContextThemeWrapper(this.g, com.netflix.mediaclient.ui.R.l.m)).setMessage(C6763cjT.d.k).setPositiveButton(C6763cjT.d.l, new DialogInterface.OnClickListener() { // from class: o.cjO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6755cjL.e(dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final void h() {
        c();
        C1645aIz.a(this.g, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$showUMAAlert$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                serviceManager.N();
            }
        });
    }

    public final void c() {
        this.j.e("Multihousehold.General.Modal");
    }

    public final AbstractC6677chn c(C6762cjS c6762cjS, boolean z) {
        if ((c6762cjS != null ? c6762cjS.a() : null) != null) {
            return d(c6762cjS, z);
        }
        return new AbstractC6764cjU.i(c6762cjS, this.e, this.a, z);
    }

    public final AbstractC6677chn e(C6762cjS c6762cjS, boolean z) {
        return new AbstractC6764cjU.a(c6762cjS, this.e, this.a, z);
    }

    public final AbstractC6677chn d(C6762cjS c6762cjS, boolean z) {
        this.j.b("VerifyCode.Incorrect.Modal");
        return new AbstractC6764cjU.c(c6762cjS, this.e, this.a, z);
    }

    public final AbstractC6677chn a(C6762cjS c6762cjS, boolean z) {
        return new AbstractC6764cjU.f(c6762cjS, this.e, this.a, z);
    }

    public final AbstractC6677chn b() {
        return new AbstractC6745cjB.b("https://www.netflix.com/create", this.e, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, boolean z) {
        i().a(str, z, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(boolean z) {
        ActionField i;
        C6760cjQ i2 = i();
        C6762cjS c6762cjS = this.f;
        String id = (c6762cjS == null || (i = c6762cjS.i()) == null) ? null : i.getId();
        C6762cjS c6762cjS2 = this.f;
        C6760cjQ.e(i2, this, id, z, c6762cjS2 != null ? c6762cjS2.i() : null, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        ActionField e;
        C6760cjQ i = i();
        C6762cjS c6762cjS = this.f;
        String id = (c6762cjS == null || (e = c6762cjS.e()) == null) ? null : e.getId();
        C6762cjS c6762cjS2 = this.f;
        C6760cjQ.e(i, this, id, false, c6762cjS2 != null ? c6762cjS2.e() : null, null, null, 48, null);
    }

    @SuppressLint({"CheckResult"})
    private final void a(C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6756cjM.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$subscribe$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
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
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
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
        }, (drO) null, new drM<AbstractC6756cjM, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeImpl$subscribe$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6756cjM abstractC6756cjM) {
                b(abstractC6756cjM);
                return dpR.c;
            }

            public final void b(AbstractC6756cjM abstractC6756cjM) {
                C8632dsu.c((Object) abstractC6756cjM, "");
                if (abstractC6756cjM instanceof AbstractC6756cjM.g) {
                    AbstractC6756cjM.g gVar = (AbstractC6756cjM.g) abstractC6756cjM;
                    C6755cjL.this.a(gVar.a(), gVar.e());
                } else if (abstractC6756cjM instanceof AbstractC6756cjM.d) {
                    C6755cjL.this.d(((AbstractC6756cjM.d) abstractC6756cjM).a());
                } else if (C8632dsu.c(abstractC6756cjM, AbstractC6756cjM.c.d)) {
                    C6755cjL.this.h();
                } else if (C8632dsu.c(abstractC6756cjM, AbstractC6756cjM.h.c)) {
                    C6755cjL.this.g();
                } else if (C8632dsu.c(abstractC6756cjM, AbstractC6756cjM.b.c)) {
                    C6755cjL.this.e();
                } else if (C8632dsu.c(abstractC6756cjM, AbstractC6756cjM.f.e)) {
                    C6755cjL.this.j();
                } else if (C8632dsu.c(abstractC6756cjM, AbstractC6756cjM.e.e)) {
                    C6755cjL.this.c();
                }
            }
        }, 2, (Object) null);
    }
}
