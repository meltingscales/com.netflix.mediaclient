package o;

import android.app.Activity;
import android.text.Spanned;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MhuMisdetection;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.clh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6883clh extends AbstractNetworkViewModel2 {
    private final String a;
    private final Spanned b;
    private final String c;
    private final Activity d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final C6822ckZ i;
    private final InterfaceC8554dpx j;
    private final String k;
    private final String l;
    private final String n;

    public final String a() {
        return this.f;
    }

    public final Spanned b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.l;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public final String j() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6883clh(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, C6881clf c6881clf, Activity activity) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C6822ckZ c;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) c6881clf, "");
        C8632dsu.c((Object) activity, "");
        this.d = activity;
        this.l = stringProvider.getString(C6832ckj.a.C);
        this.c = stringProvider.getString(C6832ckj.a.u);
        this.f = stringProvider.getString(C6832ckj.a.w);
        this.h = stringProvider.getString(C6832ckj.a.A);
        this.a = stringProvider.getString(C6832ckj.a.y);
        this.b = C8168dfL.c(stringProvider.getString(C6832ckj.a.v));
        this.g = stringProvider.getString(com.netflix.mediaclient.ui.R.o.go);
        this.n = stringProvider.getString(C6832ckj.a.D);
        this.e = stringProvider.getString(C6832ckj.a.x);
        C8632dsu.d(activity);
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.j = new ViewModelLazy(dsA.a(C6821ckY.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionViewModel$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionViewModel$special$$inlined$viewModels$default$1
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
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionViewModel$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
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
        this.i = c6881clf.c();
        String str = aIJ.a(activity) + "/" + Config_FastProperty_MhuMisdetection.Companion.e() + "?nftoken=" + c.a();
        C8632dsu.a(str, "");
        this.k = str;
    }

    public final boolean i() {
        Boolean value = l().b().getValue();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(value, bool) || C8632dsu.c(l().e().getValue(), bool);
    }

    private final C6821ckY l() {
        return (C6821ckY) this.j.getValue();
    }

    public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (i()) {
            return;
        }
        performAction(this.i.b(), l().b(), networkRequestResponseListener);
    }

    public final void k() {
        C8142dem.b(this.d, this.k);
    }

    public final void m() {
        C8142dem.b(this.d, Config_FastProperty_MhuMisdetection.Companion.b());
    }
}
