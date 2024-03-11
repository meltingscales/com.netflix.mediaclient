package o;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MhuMisdetection;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.ckU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6817ckU extends AbstractNetworkViewModel2 {
    private final AppView a;
    private final String b;
    private final C6836ckn c;
    private final CharSequence d;
    private final CharSequence e;
    private final InterfaceC8554dpx f;
    private final String g;
    private final boolean h;
    private final C6811ckO i;
    private final String j;
    private final String m;
    private final TrackingInfo n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13742o;

    public final CharSequence b() {
        return this.d;
    }

    public final AppView c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final CharSequence e() {
        return this.e;
    }

    public final String f() {
        return this.j;
    }

    public final boolean g() {
        return this.h;
    }

    public final C6836ckn h() {
        return this.c;
    }

    public final String i() {
        return this.g;
    }

    public final TrackingInfo j() {
        return this.n;
    }

    public final String n() {
        return this.m;
    }

    public final String o() {
        return this.f13742o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6817ckU(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, C6836ckn c6836ckn, C6842ckt c6842ckt, C6818ckV c6818ckV, Activity activity) {
        super(signupNetworkManager, stringProvider, c6842ckt);
        String string;
        AppView appView;
        Map b;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) c6836ckn, "");
        C8632dsu.c((Object) c6842ckt, "");
        C8632dsu.c((Object) c6818ckV, "");
        C8632dsu.c((Object) activity, "");
        this.c = c6836ckn;
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        TrackingInfo trackingInfo = null;
        this.f = new ViewModelLazy(dsA.a(C6814ckR.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeViewModel$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                C8632dsu.a(viewModelStore, "");
                return viewModelStore;
            }
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeViewModel$special$$inlined$viewModels$default$1
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
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeViewModel$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
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
        C6811ckO a = c6818ckV.a();
        this.i = a;
        if (a()) {
            string = stringProvider.getString(C6832ckj.a.b);
        } else {
            string = stringProvider.getString(C6832ckj.a.k);
        }
        this.j = string;
        if (a()) {
            appView = AppView.mhuManageHouseholdError;
        } else {
            appView = AppView.mhuUpdateHouseholdLanding;
        }
        this.a = appView;
        String a2 = a.a();
        if (a2 != null) {
            b = dqD.b(dpD.a(UmaAlert.ICON_ERROR, a2));
            trackingInfo = CLv2Utils.a(b);
        }
        this.n = trackingInfo;
        if (a()) {
            this.d = "";
            this.e = "";
        } else {
            String string2 = stringProvider.getString(C6832ckj.a.f);
            CharSequence c = c6836ckn.c();
            String string3 = stringProvider.getString(C6832ckj.a.i);
            String string4 = stringProvider.getString(C6832ckj.a.j);
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2);
            C8632dsu.a(append, "");
            SpannableStringBuilder append2 = C6840ckr.a(C6840ckr.a(append)).append(c);
            C8632dsu.a(append2, "");
            this.d = SpannedString.valueOf(append2);
            SpannableStringBuilder append3 = new SpannableStringBuilder().append((CharSequence) string3);
            C8632dsu.a(append3, "");
            SpannableStringBuilder append4 = C6840ckr.a(C6840ckr.a(append3)).append((CharSequence) string4);
            C8632dsu.a(append4, "");
            this.e = SpannedString.valueOf(append4);
        }
        this.m = stringProvider.getString(C6832ckj.a.f13744o);
        this.f13742o = stringProvider.getString(C6832ckj.a.l);
        this.b = stringProvider.getString(C6832ckj.a.S);
        this.g = stringProvider.getString(com.netflix.mediaclient.ui.R.o.go);
        this.h = Config_FastProperty_MhuMisdetection.Companion.a();
    }

    private final C6814ckR l() {
        return (C6814ckR) this.f.getValue();
    }

    public final boolean a() {
        return C8632dsu.c((Object) this.i.a(), (Object) SignupConstants.Error.MHU_HOUSEHOLD_DATA_ERROR);
    }

    public final boolean m() {
        return q() || k();
    }

    private final boolean q() {
        return C8632dsu.c(l().d().getValue(), Boolean.TRUE);
    }

    private final boolean k() {
        return C8632dsu.c(l().c().getValue(), Boolean.TRUE);
    }

    public final void c(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (m()) {
            return;
        }
        performAction(this.i.c(), l().d(), networkRequestResponseListener);
    }

    public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (m()) {
            return;
        }
        performAction(this.i.d(), l().c(), networkRequestResponseListener);
    }

    public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (m()) {
            return;
        }
        performAction(this.i.e(), l().b(), networkRequestResponseListener);
    }
}
