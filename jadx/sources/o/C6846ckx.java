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
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import javax.inject.Inject;
import o.C6832ckj;
import o.C8632dsu;
import o.drO;

/* renamed from: o.ckx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6846ckx extends AbstractNetworkViewModel2 {
    private final String a;
    private final InterfaceC8554dpx b;
    private final String c;
    private final String d;
    private final String e;
    private final Spanned f;
    private final StringProvider g;
    private final C6839ckq h;

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final Spanned h() {
        return this.f;
    }

    public final String j() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6846ckx(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, C6842ckt c6842ckt, C6847cky c6847cky, Activity activity) {
        super(signupNetworkManager, stringProvider, c6842ckt);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) c6842ckt, "");
        C8632dsu.c((Object) c6847cky, "");
        C8632dsu.c((Object) activity, "");
        this.g = stringProvider;
        final NetflixActivity netflixActivity = (NetflixActivity) activity;
        this.b = new ViewModelLazy(dsA.a(C6841cks.class), new drO<ViewModelStore>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.challengeerror.ChallengeErrorViewModel$special$$inlined$viewModels$default$2
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
        }, new drO<ViewModelProvider.Factory>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.challengeerror.ChallengeErrorViewModel$special$$inlined$viewModels$default$1
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
        }, new drO<CreationExtras>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.challengeerror.ChallengeErrorViewModel$special$$inlined$viewModels$default$3
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
        C6839ckq d = c6847cky.d();
        this.h = d;
        this.c = d.e();
        this.d = "Netflix.com/Create";
        this.a = "Netflix.com/Create?netflixsource=android&fromApp=true";
        this.f = C8168dfL.c(stringProvider.getString(C6832ckj.a.G));
        this.e = stringProvider.getString(com.netflix.mediaclient.ui.R.o.go);
    }

    private final C6841cks o() {
        return (C6841cks) this.b.getValue();
    }

    public final String g() {
        return i().d();
    }

    public final CharSequence a() {
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) i().c());
        String b = i().b();
        if (b != null) {
            C8632dsu.d(append);
            Appendable append2 = append.append('\n');
            C8632dsu.a(append2, "");
            Appendable append3 = append2.append('\n');
            C8632dsu.a(append3, "");
            Appendable append4 = append3.append(b);
            C8632dsu.a(append4, "");
            C8632dsu.a(append4.append('\n'), "");
        }
        C8632dsu.d(append);
        return SpannedString.valueOf(append);
    }

    public final int e() {
        return i().a();
    }

    public final boolean f() {
        return m();
    }

    private final boolean m() {
        return C8632dsu.c(o().c().getValue(), Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0.equals(com.netflix.mediaclient.acquisition.lib.SignupConstants.Error.RESEND_ATTEMPTS_EXHASTED) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return new o.C6845ckw(r9.g.getString(o.C6832ckj.a.B), r9.g.getString(o.C6832ckj.a.N), null, o.C6832ckj.c.a, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r0.equals(com.netflix.mediaclient.acquisition.lib.SignupConstants.Error.OTP_CHALLENGE_ALL_ATTEMPTS_EXHAUSTED) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C6845ckw i() {
        /*
            r9 = this;
            java.lang.String r0 = r9.c
            if (r0 == 0) goto L9d
            int r1 = r0.hashCode()
            switch(r1) {
                case -1498627220: goto L63;
                case -336657698: goto L3e;
                case 893455553: goto L17;
                case 1037565889: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9d
        Ld:
            java.lang.String r1 = "mfa_challenge_all_attempts_exhausted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L9d
        L17:
            java.lang.String r1 = "mfa_challenge_verification_attempts_exhausted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L9d
        L21:
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.z
            java.lang.String r3 = r0.getString(r1)
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.N
            java.lang.String r4 = r0.getString(r1)
            int r6 = o.C6832ckj.c.a
            o.ckw r0 = new o.ckw
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto Lb8
        L3e:
            java.lang.String r1 = "resend_code_attempts_exceeded"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L9d
        L47:
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.B
            java.lang.String r3 = r0.getString(r1)
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.N
            java.lang.String r4 = r0.getString(r1)
            int r6 = o.C6832ckj.c.a
            o.ckw r0 = new o.ckw
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto Lb8
        L63:
            java.lang.String r1 = "mfa_factor_expired"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L9d
        L6c:
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.c
            java.lang.String r0 = r0.getString(r1)
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r1 = r9.g
            int r2 = o.C6832ckj.a.r
            java.lang.String r1 = r1.getString(r2)
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r2 = r9.g
            int r3 = o.C6832ckj.a.a
            o.Xq r2 = r2.getFormatter(r3)
            o.ckq r3 = r9.h
            java.lang.String r4 = "expiryInMinutes"
            java.lang.Integer r3 = r3.a()
            o.Xq r2 = r2.d(r4, r3)
            java.lang.String r2 = r2.c()
            int r3 = o.C6832ckj.c.a
            o.ckw r4 = new o.ckw
            r4.<init>(r0, r1, r2, r3)
            r0 = r4
            goto Lb8
        L9d:
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.e
            java.lang.String r3 = r0.getString(r1)
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r9.g
            int r1 = o.C6832ckj.a.N
            java.lang.String r4 = r0.getString(r1)
            int r6 = o.C6832ckj.c.a
            o.ckw r0 = new o.ckw
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6846ckx.i():o.ckw");
    }

    public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        if (f()) {
            return;
        }
        performAction(this.h.c(), o().e(), networkRequestResponseListener);
    }
}
