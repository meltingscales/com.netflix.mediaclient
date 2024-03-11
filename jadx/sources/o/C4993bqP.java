package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.volley.CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import dagger.Lazy;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C1354Yl;

/* renamed from: o.bqP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4993bqP {
    public static final d d = new d(null);
    private final Lazy<aCI> a;
    private final dwQ b;
    private final dwU c;

    /* renamed from: o.bqP$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a(Status status);

        void e(String str);
    }

    public C4993bqP(dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) lazy, "");
        this.c = dwu;
        this.b = dwq;
        this.a = lazy;
    }

    /* renamed from: o.bqP$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public final void c(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C1354Yl c1354Yl = new C1354Yl();
        aCI aci = this.a.get();
        C8737dwr.c(this.c, new a(CoroutineExceptionHandler.Key, bVar), null, new CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1(aci, c1354Yl, this, bVar, null), 2, null);
    }

    /* renamed from: o.bqP$a */
    /* loaded from: classes4.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.c cVar, b bVar) {
            super(cVar);
            this.b = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C1044Mm.b("nf_sso_CreateSSOTokenRequest", th, UmaAlert.ICON_ERROR, new Object[0]);
            this.b.a(InterfaceC1078Nw.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C8954gU<C1354Yl.d> c8954gU, b bVar) {
        C1354Yl.d dVar = c8954gU.d;
        String b2 = dVar != null ? dVar.b() : null;
        if (b2 != null) {
            bVar.e(b2);
        } else {
            bVar.a(InterfaceC1078Nw.c);
        }
    }
}
