package o;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
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
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.clB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6851clB extends AbstractNetworkViewModel2 {
    private final String a;
    private final InterfaceC8554dpx b;
    private final C6890clo c;
    private final String d;
    private final CharSequence e;
    private final boolean f;
    private final String g;
    private final boolean h;
    private final String i;
    private final String j;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.h;
    }

    public final CharSequence e() {
        return this.e;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.g;
    }

    public final String i() {
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6851clB(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, C6901clz c6901clz, Activity activity) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) c6901clz, "");
        C8632dsu.c((Object) activity, "");
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.b = new ViewModelLazy(dsA.a(C6893clr.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelViewModel$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelViewModel$special$$inlined$viewModels$default$1
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
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelViewModel$special$$inlined$viewModels$default$3
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
        C6890clo a = c6901clz.a();
        this.c = a;
        this.j = stringProvider.getString(C6832ckj.a.L);
        CharSequence e = C6840ckr.e(stringProvider.getFormatter(C6832ckj.a.H), a.a(), a.b(), a.j());
        String string = stringProvider.getString(C6832ckj.a.j);
        SpannableStringBuilder append = new SpannableStringBuilder().append(e);
        C8632dsu.a(append, "");
        SpannableStringBuilder append2 = C6840ckr.a(C6840ckr.a(append)).append((CharSequence) string);
        C8632dsu.a(append2, "");
        this.e = SpannedString.valueOf(append2);
        this.h = a.c() != null;
        this.a = stringProvider.getString(C6832ckj.a.f13743J);
        this.f = a.h() != null;
        this.g = stringProvider.getString(C6832ckj.a.K);
        this.i = stringProvider.getString(com.netflix.mediaclient.ui.R.o.go);
        this.d = a.d();
    }

    private final C6893clr j() {
        return (C6893clr) this.b.getValue();
    }

    public final boolean h() {
        return m() || l() || o();
    }

    private final boolean m() {
        return C8632dsu.c(j().c().getValue(), Boolean.TRUE);
    }

    private final boolean l() {
        return C8632dsu.c(j().e().getValue(), Boolean.TRUE);
    }

    private final boolean o() {
        return C8632dsu.c(j().d().getValue(), Boolean.TRUE);
    }

    public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h()) {
            return;
        }
        performAction(this.c.h(), j().e(), networkRequestResponseListener);
    }

    public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h()) {
            return;
        }
        performAction(this.c.c(), j().c(), networkRequestResponseListener);
    }

    public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h()) {
            return;
        }
        performAction(this.c.e(), j().d(), networkRequestResponseListener);
    }
}
