package o;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.ckG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6803ckG extends AbstractNetworkViewModel2 {
    private final boolean a;
    private final String b;
    private final String c;
    private final InterfaceC8554dpx d;
    private final C6797ckA e;
    private final String f;
    private final Spanned h;
    private final StringProvider i;

    public final String b() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.f;
    }

    public final Spanned j() {
        return this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6803ckG(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, C6842ckt c6842ckt, C6805ckI c6805ckI, Activity activity) {
        super(signupNetworkManager, stringProvider, c6842ckt);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) c6842ckt, "");
        C8632dsu.c((Object) c6805ckI, "");
        C8632dsu.c((Object) activity, "");
        this.i = stringProvider;
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.d = new ViewModelLazy(dsA.a(C6843cku.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryViewModel$special$$inlined$viewModels$default$2
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
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryViewModel$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                C8632dsu.a(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryViewModel$special$$inlined$viewModels$default$3
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
        C6797ckA b = c6805ckI.b();
        this.e = b;
        this.c = stringProvider.getString(C6832ckj.a.E);
        this.f = stringProvider.getString(C6832ckj.a.M);
        this.h = C8168dfL.c(stringProvider.getString(C6832ckj.a.G));
        this.b = b.c();
        this.a = b.j();
    }

    private final C6843cku k() {
        return (C6843cku) this.d.getValue();
    }

    public final String g() {
        return i().e();
    }

    public final int c() {
        return i().c();
    }

    public final CharSequence d() {
        Spanned c = C8168dfL.c(i().b());
        String d = i().d();
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) c);
        C8632dsu.a(append, "");
        SpannableStringBuilder append2 = C6840ckr.a(C6840ckr.a(append)).append((CharSequence) d);
        C8632dsu.a(append2, "");
        return SpannedString.valueOf(append2);
    }

    public final String a() {
        return i().a();
    }

    public final boolean h() {
        return l() || n() || o();
    }

    private final boolean l() {
        return C8632dsu.c(k().b().getValue(), Boolean.TRUE);
    }

    private final boolean n() {
        return C8632dsu.c(k().d().getValue(), Boolean.TRUE);
    }

    private final boolean o() {
        return C8632dsu.c(k().a().getValue(), Boolean.TRUE);
    }

    private final C6801ckE i() {
        boolean c = C8632dsu.c((Object) this.e.d(), (Object) "EMAIL");
        if (C8632dsu.c((Object) this.b, (Object) SignupConstants.Error.OTP_INVALID)) {
            return new C6801ckE("pin-entry-invalid", this.i.getString(C6832ckj.a.e), this.i.getString(C6832ckj.a.r), this.i.getFormatter(C6832ckj.a.a).d(SignupConstants.Field.EXPIRY_IN_MINUTES, this.e.e()).c(), C6832ckj.c.a);
        }
        if (C8632dsu.c((Object) this.b, (Object) SignupConstants.Error.OTP_EXPIRED)) {
            return new C6801ckE(null, this.i.getString(C6832ckj.a.c), this.i.getString(C6832ckj.a.F), this.i.getFormatter(C6832ckj.a.W).d(SignupConstants.Field.EXPIRY_IN_MINUTES, this.e.e()).c(), C6832ckj.c.a);
        }
        if (this.a) {
            String string = this.i.getString(C6832ckj.a.I);
            C1333Xq formatter = this.i.getFormatter(c ? C6832ckj.a.V : C6832ckj.a.T);
            String b = this.e.b();
            if (b == null) {
                b = this.e.f();
            }
            String c2 = formatter.d("destination", b).c();
            C8632dsu.a(c2, "");
            return new C6801ckE("pin-entry-resent", string, c2, this.i.getFormatter(C6832ckj.a.W).d(SignupConstants.Field.EXPIRY_IN_MINUTES, this.e.e()).c(), C6832ckj.c.d);
        }
        String string2 = this.i.getString(C6832ckj.a.U);
        C1333Xq formatter2 = this.i.getFormatter(c ? C6832ckj.a.V : C6832ckj.a.T);
        String b2 = this.e.b();
        if (b2 == null) {
            b2 = this.e.f();
        }
        String c3 = formatter2.d("destination", b2).c();
        C8632dsu.a(c3, "");
        return new C6801ckE("pin-entry", string2, c3, this.i.getFormatter(C6832ckj.a.W).d(SignupConstants.Field.EXPIRY_IN_MINUTES, this.e.e()).c(), C6832ckj.c.c);
    }

    public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h()) {
            return;
        }
        performAction(this.e.g(), k().d(), networkRequestResponseListener);
    }

    public final void c(String str, NetworkRequestResponseListener networkRequestResponseListener) {
        StringField h;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h() || (h = this.e.h()) == null || str.length() != h.getMaxLength()) {
            return;
        }
        this.e.h().setValue(str);
        performAction(this.e.i(), k().b(), networkRequestResponseListener);
    }

    public final void c(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (h()) {
            return;
        }
        performAction(this.e.a(), k().a(), networkRequestResponseListener);
    }

    public final boolean b(String str) {
        Integer valueOf = str != null ? Integer.valueOf(str.length()) : null;
        StringField h = this.e.h();
        return C8632dsu.c(valueOf, h != null ? Integer.valueOf(h.getMaxLength()) : null);
    }
}
