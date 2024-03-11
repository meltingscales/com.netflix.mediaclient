package o;

import android.app.Activity;
import android.text.Spanned;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.clp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6891clp extends AbstractNetworkViewModel2 {
    private final InterfaceC8554dpx a;
    private final Spanned b;
    private final C6886clk c;
    private final String d;
    private final String e;
    private final String i;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.i;
    }

    public final Spanned c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6891clp(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, C6889cln c6889cln, Activity activity) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) c6889cln, "");
        C8632dsu.c((Object) activity, "");
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.a = new ViewModelLazy(dsA.a(C6888clm.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeViewModel$special$$inlined$viewModels$default$2
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
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeViewModel$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeViewModel$special$$inlined$viewModels$default$3
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
        C6886clk a = c6889cln.a();
        this.c = a;
        this.e = stringProvider.getString(C6832ckj.a.X);
        Spanned c = C8168dfL.c(stringProvider.getFormatter(C6832ckj.a.R).d(SignupConstants.Field.TRAVEL_DAYS_OF_ACCESS, a.d()).c());
        C8632dsu.a(c, "");
        this.b = C1340Xx.a(c, activity);
        this.d = stringProvider.getString(C6832ckj.a.O);
        this.i = stringProvider.getString(C6832ckj.a.t);
    }

    private final C6888clm f() {
        return (C6888clm) this.a.getValue();
    }

    public final boolean e() {
        return g() || j() || i();
    }

    private final boolean g() {
        return C8632dsu.c(f().d().getValue(), Boolean.TRUE);
    }

    private final boolean j() {
        return C8632dsu.c(f().e().getValue(), Boolean.TRUE);
    }

    private final boolean i() {
        return C8632dsu.c(f().a().getValue(), Boolean.TRUE);
    }

    public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (e()) {
            return;
        }
        performAction(this.c.b(), f().d(), networkRequestResponseListener);
    }

    public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (e()) {
            return;
        }
        performAction(this.c.e(), f().e(), networkRequestResponseListener);
    }

    public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (e()) {
            return;
        }
        performAction(this.c.a(), f().a(), networkRequestResponseListener);
    }
}
