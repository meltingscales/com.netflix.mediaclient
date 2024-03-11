package o;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.playintegrity.impl.UserAgentEventsReceiver;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayIntegrity;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.functions.Action;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aKt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1693aKt implements InterfaceC1692aKs {
    public static final b e = new b(null);
    private final C1691aKr a;
    private final Context b;
    private final InterfaceC8286dhX c;
    private InterfaceC4938bpN d;
    private final C1689aKp f;
    private Runnable g;
    private final boolean h;
    private Handler i;
    private boolean j;

    @Override // o.InterfaceC1692aKs
    public void a(InterfaceC4938bpN interfaceC4938bpN, Handler handler) {
        C8632dsu.c((Object) interfaceC4938bpN, "");
        C8632dsu.c((Object) handler, "");
        this.d = interfaceC4938bpN;
        this.i = handler;
    }

    public final boolean a() {
        return this.h;
    }

    public final void b() {
        this.j = false;
    }

    public final C1691aKr e() {
        return this.a;
    }

    @Inject
    public C1693aKt(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
        this.c = C1699aKz.d.a();
        C1691aKr c1691aKr = new C1691aKr(context);
        this.a = c1691aKr;
        this.h = C8150deu.a(context);
        this.f = new C1689aKp(c1691aKr, null, 2, null);
        e.getLogTag();
        UserAgentEventsReceiver.b.c(this);
    }

    /* renamed from: o.aKt$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayIntegrityImpl");
        }
    }

    public final void d() {
        this.j = true;
        m();
    }

    private final void m() {
        if (Config_FastProperty_PlayIntegrity.Companion.a()) {
            e.getLogTag();
            d(false);
            return;
        }
        b bVar = e;
        bVar.getLogTag();
        if (AbstractApplicationC1040Mh.getInstance().n()) {
            bVar.getLogTag();
            d(false);
            return;
        }
        bVar.getLogTag();
        AbstractApplicationC1040Mh.getInstance().j().subscribe(new Action() { // from class: o.aKw
            @Override // io.reactivex.functions.Action
            public final void run() {
                C1693aKt.d(C1693aKt.this);
            }
        });
    }

    public boolean c() {
        return C8153dex.I();
    }

    private final boolean n() {
        InterfaceC4938bpN interfaceC4938bpN = this.d;
        if (interfaceC4938bpN != null) {
            return interfaceC4938bpN.isReady();
        }
        return false;
    }

    public void d(final boolean z) {
        if (!c()) {
            e.getLogTag();
            this.a.e();
        } else if (!this.h) {
            e.getLogTag();
            this.a.j();
        } else if (this.j) {
            if (n()) {
                if (!z) {
                    g();
                    if (!C1699aKz.d.b(this)) {
                        return;
                    }
                } else {
                    e.getLogTag();
                }
                if (this.a.d()) {
                    return;
                }
                e.getLogTag();
                this.a.f();
                InterfaceC4938bpN interfaceC4938bpN = this.d;
                if (interfaceC4938bpN != null) {
                    interfaceC4938bpN.a(f());
                    return;
                }
                return;
            }
            e.getLogTag();
            c(new Runnable() { // from class: o.aKv
                @Override // java.lang.Runnable
                public final void run() {
                    C1693aKt.d(C1693aKt.this, z);
                }
            }, 60000L);
        } else {
            e.getLogTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1693aKt c1693aKt, boolean z) {
        C8632dsu.c((Object) c1693aKt, "");
        c1693aKt.d(z);
    }

    private final void c(Runnable runnable, long j) {
        Handler handler;
        Runnable runnable2 = this.g;
        if (runnable2 != null && (handler = this.i) != null) {
            handler.removeCallbacks(runnable2);
        }
        Handler handler2 = this.i;
        if (handler2 != null) {
            handler2.postDelayed(runnable, j);
        }
        this.g = runnable;
    }

    private final void g() {
        c(new Runnable() { // from class: o.aKB
            @Override // java.lang.Runnable
            public final void run() {
                C1693aKt.b(C1693aKt.this);
            }
        }, Config_FastProperty_PlayIntegrity.Companion.c() * 3600000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1693aKt c1693aKt) {
        Throwable th;
        C8632dsu.c((Object) c1693aKt, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd b2 = new C1596aHd("SPY-37590: Start PlayIntegrity attestation after 24h in memory", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.r);
        ErrorType errorType = b2.a;
        if (errorType != null) {
            b2.e.put("errorType", errorType.c());
            String b3 = b2.b();
            if (b3 != null) {
                String c = errorType.c();
                b2.a(c + " " + b3);
            }
        }
        if (b2.b() != null && b2.i != null) {
            th = new Throwable(b2.b(), b2.i);
        } else if (b2.b() != null) {
            th = new Throwable(b2.b());
        } else {
            th = b2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(b2, th);
        } else {
            dVar.e().b(b2, th);
        }
        c1693aKt.d(false);
    }

    /* renamed from: o.aKt$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC1698aKy {
        a() {
        }

        @Override // o.InterfaceC1698aKy
        public void c(String str) {
            C1693aKt.this.e(str);
        }

        @Override // o.InterfaceC1698aKy
        public void a(Status status) {
            C1693aKt.this.a(status);
        }
    }

    private final aKG f() {
        return new aKG(new a());
    }

    /* renamed from: o.aKt$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC1688aKo {
        e() {
        }

        @Override // o.InterfaceC1688aKo
        public void a(String str) {
            C8632dsu.c((Object) str, "");
            C1693aKt.this.a(str);
        }

        @Override // o.InterfaceC1688aKo
        public void d(String str) {
            C8632dsu.c((Object) str, "");
            C1699aKz c1699aKz = C1699aKz.d;
            c1699aKz.c("handleAttestationVerification: error " + str + ", even if device has GPS");
            C1693aKt.this.e().b(str);
            C1693aKt.this.h();
        }

        @Override // o.InterfaceC1688aKo
        public void b() {
            C1699aKz.d.c("handleSafetyNetAttestation: error, even if device has GPS");
            C1693aKt.this.e().b("Not supported, even if device has GPS");
            C1693aKt.this.h();
        }
    }

    private final InterfaceC1688aKo i() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C1683aKj c1683aKj) {
        C1699aKz.d.c(this.a);
        this.f.b(true, c1683aKj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        C1699aKz.d.c(this.a);
        this.f.b(false, null);
    }

    /* renamed from: o.aKt$d */
    /* loaded from: classes3.dex */
    public static final class d implements aKH {
        d() {
        }

        @Override // o.aKH
        public void b(C1683aKj c1683aKj) {
            C8632dsu.c((Object) c1683aKj, "");
            C1693aKt.e.getLogTag();
            C1693aKt.this.e().a(c1683aKj);
            C1693aKt.this.d(c1683aKj);
        }

        @Override // o.aKH
        public void c(Status status) {
            C1693aKt.e.getLogTag();
            C1693aKt.this.e().d(status);
            C1693aKt.this.h();
        }
    }

    private final aKH j() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Status status) {
        if (status != null) {
            status.g();
        }
        this.a.c(status);
        h();
    }

    private final void b(String str, InterfaceC1688aKo interfaceC1688aKo) {
        Throwable th;
        if (!C8150deu.a(this.b)) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd b2 = new C1596aHd("getGoogleMetadata:: Device does not support PlayIntegrity, we should not progress to this point!", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.r);
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    String c = errorType.c();
                    b2.a(c + " " + b3);
                }
            }
            if (b2.b() != null && b2.i != null) {
                th = new Throwable(b2.b(), b2.i);
            } else if (b2.b() != null) {
                th = new Throwable(b2.b());
            } else {
                th = b2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(b2, th);
            } else {
                dVar2.e().b(b2, th);
            }
            interfaceC1688aKo.b();
            return;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        IntegrityManager create = IntegrityManagerFactory.create(this.b);
        C8632dsu.a(create, "");
        Task<IntegrityTokenResponse> requestIntegrityToken = create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).build());
        C8632dsu.a(requestIntegrityToken, "");
        requestIntegrityToken.addOnSuccessListener(newSingleThreadExecutor, d(interfaceC1688aKo));
        requestIntegrityToken.addOnFailureListener(newSingleThreadExecutor, d(str, interfaceC1688aKo));
    }

    private final boolean a(final String str, final InterfaceC1688aKo interfaceC1688aKo) {
        if (this.c.a()) {
            long d2 = this.c.d();
            e.getLogTag();
            Handler handler = this.i;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: o.aKC
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1693aKt.b(C1693aKt.this, str, interfaceC1688aKo);
                    }
                }, d2);
            }
            return true;
        }
        return false;
    }

    private final OnSuccessListener<IntegrityTokenResponse> d(final InterfaceC1688aKo interfaceC1688aKo) {
        return new OnSuccessListener() { // from class: o.aKu
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C1693aKt.d(InterfaceC1688aKo.this, (IntegrityTokenResponse) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1688aKo interfaceC1688aKo, IntegrityTokenResponse integrityTokenResponse) {
        C8632dsu.c((Object) interfaceC1688aKo, "");
        String str = integrityTokenResponse.token();
        C8632dsu.d((Object) str);
        interfaceC1688aKo.a(str);
    }

    private final OnFailureListener d(final String str, final InterfaceC1688aKo interfaceC1688aKo) {
        return new OnFailureListener() { // from class: o.aKx
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C1693aKt.c(C1693aKt.this, str, interfaceC1688aKo, exc);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1693aKt c1693aKt, String str, InterfaceC1688aKo interfaceC1688aKo, Exception exc) {
        C8632dsu.c((Object) c1693aKt, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1688aKo, "");
        C8632dsu.c((Object) exc, "");
        b bVar = e;
        if (exc instanceof IntegrityServiceException) {
            IntegrityServiceException integrityServiceException = (IntegrityServiceException) exc;
            if (!c1693aKt.e(integrityServiceException, str, interfaceC1688aKo)) {
                int errorCode = integrityServiceException.getErrorCode();
                String message = exc.getMessage();
                interfaceC1688aKo.d("Google PlayIntegrity API exception, status: " + errorCode + ", message: " + message);
                return;
            }
            bVar.getLogTag();
            return;
        }
        interfaceC1688aKo.d("Google Unknown type of error occurred");
    }

    private final boolean e(IntegrityServiceException integrityServiceException, String str, InterfaceC1688aKo interfaceC1688aKo) {
        int statusCode = integrityServiceException.getStatusCode();
        if (statusCode == -100 || statusCode == -17 || statusCode == -12 || statusCode == -3) {
            return a(str, interfaceC1688aKo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        e.getLogTag();
        if (str == null) {
            C1699aKz.d.c("handleOnNonceSuccess:: PlayIntegrity nonce received from server is null, bailing!");
            this.a.i();
            h();
            return;
        }
        this.a.n();
        this.a.b();
        b(str, i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        e.getLogTag();
        if (C8168dfL.g(str)) {
            C1699aKz.d.c("handleGetAttestationDataSuccess::verified: attestation data empty! Unable to verify it!");
            this.a.g();
            h();
            return;
        }
        this.a.h();
        aKE ake = new aKE(str, j());
        this.a.k();
        InterfaceC4938bpN interfaceC4938bpN = this.d;
        if (interfaceC4938bpN != null) {
            interfaceC4938bpN.a(ake);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1693aKt c1693aKt) {
        C8632dsu.c((Object) c1693aKt, "");
        e.getLogTag();
        c1693aKt.d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1693aKt c1693aKt, String str, InterfaceC1688aKo interfaceC1688aKo) {
        C8632dsu.c((Object) c1693aKt, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1688aKo, "");
        e.getLogTag();
        c1693aKt.b(str, interfaceC1688aKo);
    }
}
