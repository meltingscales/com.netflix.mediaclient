package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Lazy;
import o.C4993bqP;
import o.C5057bra;

/* renamed from: o.bqf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5009bqf {
    private final NgpStoreApi a;
    private final Lazy<aCI> b;
    private final dwU c;
    private final dwQ d;
    private final Context e;
    private final String i;

    public C5009bqf(Context context, NgpStoreApi ngpStoreApi, dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        this.e = context;
        this.a = ngpStoreApi;
        this.i = context.getPackageName();
        this.c = dwu;
        this.d = dwq;
        this.b = lazy;
    }

    public void a() {
        final long currentTimeMillis = System.currentTimeMillis();
        this.a.readSsoStore(new NgpStoreApi.e<NgpStoreApi.c>() { // from class: o.bqf.5
            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: a */
            public void d(NgpStoreApi.c cVar) {
                C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s ngp_store read done. Took: %d, data: %s", C5009bqf.this.i, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), cVar);
                C5009bqf.this.b(cVar);
            }

            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: b */
            public boolean c(NgpStoreApi.c cVar) {
                return cVar != null && C8168dfL.h(cVar.e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NgpStoreApi.c cVar) {
        String str;
        if (!ConnectivityUtils.l(this.e)) {
            C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s handleReadFromSharedStorage:: no network connectivity, do nothing", this.i);
        } else if (cVar != null && (str = cVar.e) != null) {
            C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s handleReadFromSharedStorage:: SSO token found: go and renew it  %s", this.i, str);
            new C5057bra(this.c, this.d, this.b).a(cVar.e, e());
        } else {
            C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s handleReadFromSharedStorage:: SSO token is NOT found, fetch it!", this.i);
            c();
        }
    }

    private C5057bra.d e() {
        return new C5057bra.d() { // from class: o.bqf.1
            @Override // o.C5057bra.d
            public void b() {
                C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s Existing SSO token is still valid, do nothing", C5009bqf.this.i);
            }

            @Override // o.C5057bra.d
            public void c(String str) {
                C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s Received renewed SSO token: %s", C5009bqf.this.i, str);
                C5009bqf.this.e(str);
            }

            @Override // o.C5057bra.d
            public void a(SSOTokenNotRenewedReason sSOTokenNotRenewedReason, Status status) {
                if (sSOTokenNotRenewedReason == null) {
                    C1044Mm.e("nf_userAgent_FlowSsoMgr", "%s We failed to renew SSO token, but we do not know why, reason is missing, do nothing. Status: %s", C5009bqf.this.i, status);
                    return;
                }
                int i = AnonymousClass3.c[sSOTokenNotRenewedReason.ordinal()];
                if (i == 1) {
                    C1044Mm.j("nf_userAgent_FlowSsoMgr", "%s Existing SSO token is still valid, do nothing. This should not be delivered via this method.", C5009bqf.this.i);
                } else if (i == 2) {
                    C1044Mm.e("nf_userAgent_FlowSsoMgr", "%s Existing SSO token is invalid", C5009bqf.this.i);
                    C5009bqf.this.e((String) null);
                    C5009bqf.this.c();
                } else {
                    C1044Mm.e("nf_userAgent_FlowSsoMgr", "%s We failed to renew SSO token, but we do not know why, reason %s, do nothing. Status: %s", C5009bqf.this.i, sSOTokenNotRenewedReason, status);
                }
            }
        };
    }

    /* renamed from: o.bqf$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SSOTokenNotRenewedReason.values().length];
            c = iArr;
            try {
                iArr[SSOTokenNotRenewedReason.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SSOTokenNotRenewedReason.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private C4993bqP.b b() {
        return new C4993bqP.b() { // from class: o.bqf.4
            @Override // o.C4993bqP.b
            public void e(String str) {
                C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s Received new SSO token: %s", C5009bqf.this.i, str);
                C5009bqf.this.e(str);
            }

            @Override // o.C4993bqP.b
            public void a(Status status) {
                C1044Mm.e("nf_userAgent_FlowSsoMgr", "%s We failed to get a new SSO token. Status: %s", C5009bqf.this.i, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        new C4993bqP(this.c, this.d, this.b).c(b());
    }

    public void b(String str) {
        C1044Mm.a("nf_userAgent_FlowSsoMgr", "%s deleteSsoToken reason=%s", this.i, str);
        e((String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        NgpStoreApi.c cVar = new NgpStoreApi.c();
        cVar.a = System.currentTimeMillis();
        cVar.e = str;
        cVar.b = this.e.getPackageName();
        this.a.writeSsoStore(cVar);
    }
}
