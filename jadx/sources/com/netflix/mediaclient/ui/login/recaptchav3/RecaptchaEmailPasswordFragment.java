package com.netflix.mediaclient.ui.login.recaptchav3;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6323cbD;
import o.C1596aHd;
import o.C5007bqd;
import o.C6331cbL;
import o.C6360cbo;
import o.C6365cbt;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class RecaptchaEmailPasswordFragment extends AbstractC6323cbD {
    private C6331cbL l;

    /* renamed from: o  reason: collision with root package name */
    private RecaptchaV3Manager f13281o;
    @Inject
    public RecaptchaV3Manager.c recaptchaV3ManagerFactory;

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment
    public int e() {
        return R.i.at;
    }

    public final RecaptchaV3Manager.c F() {
        RecaptchaV3Manager.c cVar = this.recaptchaV3ManagerFactory;
        if (cVar != null) {
            return cVar;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G();
    }

    private final void G() {
        Map d;
        Map k;
        Throwable th;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Missing activity for reCAPTCHA", null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        this.l = new C6331cbL(activity, RecaptchaV3Manager.d.b(activity));
        RecaptchaV3Manager.c F = F();
        C6331cbL c6331cbL = this.l;
        if (c6331cbL == null) {
            C8632dsu.d("");
            c6331cbL = null;
        }
        this.f13281o = F.b(activity, c6331cbL);
    }

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C6360cbo c6360cbo = (C6360cbo) view.findViewById(R.g.fl);
        ScrollView scrollView = (ScrollView) view.findViewById(R.g.fu);
        C6331cbL c6331cbL = this.l;
        if (c6331cbL == null) {
            C8632dsu.d("");
            c6331cbL = null;
        }
        if (c6331cbL.d() instanceof C6331cbL.b.C0112b) {
            c6360cbo.setOnExpandListener(new RecaptchaEmailPasswordFragment$onViewCreated$1(scrollView));
        } else {
            c6360cbo.setVisibility(8);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RecaptchaV3Manager recaptchaV3Manager = this.f13281o;
        if (recaptchaV3Manager == null) {
            C8632dsu.d("");
            recaptchaV3Manager = null;
        }
        recaptchaV3Manager.e();
    }

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment
    public void a(final String str, final String str2, final String str3, final String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        RecaptchaV3Manager recaptchaV3Manager = this.f13281o;
        if (recaptchaV3Manager == null) {
            C8632dsu.d("");
            recaptchaV3Manager = null;
        }
        Single<C6365cbt> b = recaptchaV3Manager.b(new RecaptchaAction("login"));
        final drM<C6365cbt, SingleSource<? extends Status>> drm = new drM<C6365cbt, SingleSource<? extends Status>>() { // from class: com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment$sendLoginRequest$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final SingleSource<? extends Status> invoke(C6365cbt c6365cbt) {
                C8632dsu.c((Object) c6365cbt, "");
                return new cQQ().e(new C5007bqd(str, str2, str3, str4, false, c6365cbt.b(), c6365cbt.a(), c6365cbt.d()));
            }
        };
        Single observeOn = b.flatMap(new Function() { // from class: o.cbC
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource e;
                e = RecaptchaEmailPasswordFragment.e(drM.this, obj);
                return e;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a, "");
        Object as = observeOn.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        final drM<Status, dpR> drm2 = new drM<Status, dpR>() { // from class: com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment$sendLoginRequest$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Status status) {
                d(status);
                return dpR.c;
            }

            public final void d(Status status) {
                RecaptchaEmailPasswordFragment.this.e(status);
            }
        };
        ((SingleSubscribeProxy) as).a(new Consumer() { // from class: o.cbH
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecaptchaEmailPasswordFragment.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
