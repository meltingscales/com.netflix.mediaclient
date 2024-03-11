package o;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;
import o.drO;

/* renamed from: o.bzF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5460bzF extends BaseViewModelInitializer {
    public static final d e = new d(null);
    private final SignupNetworkManager a;
    private final StringProvider b;
    private MoneyballDataSource c;
    private final ErrorMessageViewModelInitializer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C5460bzF(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, SignupNetworkManager signupNetworkManager) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        this.c = moneyballDataSource;
        this.b = stringProvider;
        this.d = errorMessageViewModelInitializer;
        this.a = signupNetworkManager;
    }

    /* renamed from: o.bzF$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x014b, code lost:
        if ((r13 instanceof com.netflix.android.moneyball.fields.StringField) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C5459bzE d() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5460bzF.d():o.bzE");
    }

    private static final C5462bzH d(InterfaceC8554dpx<C5462bzH> interfaceC8554dpx) {
        return interfaceC8554dpx.getValue();
    }

    public final C5458bzD d(final AppCompatActivity appCompatActivity) {
        C8632dsu.c((Object) appCompatActivity, "");
        return new C5458bzD(this.b, this.a, this.d.createErrorMessageViewModel(), d(), d(new ViewModelLazy(dsA.a(C5462bzH.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.screens.DemographicInterstitialLandingViewModelInitializer$createDemographicInterstitialParsedData$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.screens.DemographicInterstitialLandingViewModelInitializer$createDemographicInterstitialParsedData$$inlined$viewModels$default$1
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
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.screens.DemographicInterstitialLandingViewModelInitializer$createDemographicInterstitialParsedData$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                drO dro = drO.this;
                if (dro == null || (creationExtras = (CreationExtras) dro.invoke()) == null) {
                    CreationExtras defaultViewModelCreationExtras = appCompatActivity.getDefaultViewModelCreationExtras();
                    C8632dsu.a(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
                return creationExtras;
            }
        })));
    }
}
