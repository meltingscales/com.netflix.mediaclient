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
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.ckK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6807ckK extends AbstractNetworkViewModel2 {
    private final C6802ckF a;
    private final String b;
    private final String c;
    private final CharSequence d;
    private final InterfaceC8554dpx e;

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final CharSequence e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6807ckK(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, C6808ckL c6808ckL, Activity activity) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) c6808ckL, "");
        C8632dsu.c((Object) activity, "");
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.e = new ViewModelLazy(dsA.a(C6804ckH.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsViewModel$special$$inlined$viewModels$default$2
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
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsViewModel$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsViewModel$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
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
        this.a = c6808ckL.b();
        this.c = stringProvider.getString(C6832ckj.a.Q);
        Spanned c = C8168dfL.c(stringProvider.getString(C6832ckj.a.P));
        C8632dsu.a(c, "");
        this.d = C1340Xx.a(c, activity);
        this.b = stringProvider.getString(C6832ckj.a.S);
    }

    private final C6804ckH b() {
        return (C6804ckH) this.e.getValue();
    }

    public final boolean a() {
        return C8632dsu.c(b().d().getValue(), Boolean.TRUE);
    }

    public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (a()) {
            return;
        }
        performAction(this.a.c(), b().d(), networkRequestResponseListener);
    }
}
