package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;
import com.netflix.mediaclient.service.user.volley.RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import dagger.Lazy;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C1401Zz;

/* renamed from: o.bra  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5057bra {
    public static final c a = new c(null);
    private final dwQ b;
    private final Lazy<aCI> c;
    private final dwU d;

    /* renamed from: o.bra$d */
    /* loaded from: classes4.dex */
    public interface d {
        void a(SSOTokenNotRenewedReason sSOTokenNotRenewedReason, Status status);

        void b();

        void c(String str);
    }

    public C5057bra(dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) lazy, "");
        this.d = dwu;
        this.b = dwq;
        this.c = lazy;
    }

    /* renamed from: o.bra$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public final void a(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dVar, "");
        C1401Zz c1401Zz = new C1401Zz(str);
        aCI aci = this.c.get();
        C8737dwr.c(this.d, new a(CoroutineExceptionHandler.Key, dVar), null, new RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1(aci, c1401Zz, this, dVar, null), 2, null);
        C1044Mm.a("nf_sso_RenewSSOTokenRequest", "Query: %s ", c1401Zz);
    }

    /* renamed from: o.bra$a */
    /* loaded from: classes4.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.c cVar, d dVar) {
            super(cVar);
            this.c = dVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C1044Mm.b("nf_sso_RenewSSOTokenRequest", th, UmaAlert.ICON_ERROR, new Object[0]);
            this.c.a(null, InterfaceC1078Nw.aL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C1401Zz.e eVar, d dVar) {
        C1401Zz.b c2;
        C1401Zz.d d2;
        C1401Zz.b c3;
        C1401Zz.c c4;
        String c5 = (eVar == null || (c3 = eVar.c()) == null || (c4 = c3.c()) == null) ? null : c4.c();
        if (c5 != null) {
            C1044Mm.e("nf_sso_RenewSSOTokenRequest", "SSO token renewed " + c5);
            dVar.c(c5);
            return;
        }
        SSOTokenNotRenewedReason b = (eVar == null || (c2 = eVar.c()) == null || (d2 = c2.d()) == null) ? null : d2.b();
        if (b != null) {
            if (b == SSOTokenNotRenewedReason.a) {
                C1044Mm.e("nf_sso_RenewSSOTokenRequest", "Reason: " + b + ", doing nothing.");
                dVar.b();
                return;
            }
            C1044Mm.d("nf_sso_RenewSSOTokenRequest", "Failure " + eVar + ", reason: " + b);
            dVar.a(b, InterfaceC1078Nw.aL);
            return;
        }
        C1044Mm.d("nf_sso_RenewSSOTokenRequest", "Failure " + eVar + ", missing reason!");
        dVar.a(null, InterfaceC1078Nw.aL);
    }
}
