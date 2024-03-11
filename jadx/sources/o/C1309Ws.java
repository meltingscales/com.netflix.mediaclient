package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

@ActivityScoped
/* renamed from: o.Ws  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1309Ws implements VF {
    public static final a e = new a(null);
    private final dwU a;
    private final VB b;
    private final dwQ c;
    private final VA d;

    @Inject
    public C1309Ws(VB vb, VA va, dwQ dwq, dwU dwu) {
        C8632dsu.c((Object) vb, "");
        C8632dsu.c((Object) va, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwu, "");
        this.b = vb;
        this.d = va;
        this.c = dwq;
        this.a = dwu;
    }

    /* renamed from: o.Ws$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TargetDiscoveryInfraImpl");
        }
    }

    /* renamed from: o.Ws$b */
    /* loaded from: classes3.dex */
    public static final class b extends dqT implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            a aVar = C1309Ws.e;
        }
    }

    @Override // o.VF
    public List<VQ> a() {
        return C1324Xh.a.a();
    }

    @Override // o.VF
    public boolean e() {
        return !C1324Xh.a.c().b().isEmpty();
    }

    @Override // o.VF
    public InterfaceC8822dzv<List<VZ>> b() {
        return C1324Xh.a.c();
    }

    @Override // o.VF
    public void c() {
        Map d;
        Map k;
        Throwable th;
        e.getLogTag();
        C1324Xh c1324Xh = C1324Xh.a;
        if (c1324Xh.b()) {
            return;
        }
        C1331Xo.b.b(this.d);
        InterfaceC1251Um a2 = C1329Xm.c.a();
        if (a2 != null) {
            a2.b(new WC());
            a2.a(new C1314Wx());
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: getOnlineDevices can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar.a();
            if (a3 != null) {
                a3.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        c1324Xh.e(true);
        this.b.e();
        this.b.c();
        d();
    }

    @Override // o.VF
    public void c(VQ vq) {
        C8632dsu.c((Object) vq, "");
        e.getLogTag();
        C1324Xh.a.a().add(vq);
    }

    @Override // o.VF
    public void a(VQ vq) {
        C8632dsu.c((Object) vq, "");
        e.getLogTag();
        C1324Xh.a.a().remove(vq);
    }

    private final void d() {
        C8737dwr.c(this.a, new b(CoroutineExceptionHandler.Key).plus(this.c), null, new TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C1295We c1295We) {
        e.getLogTag();
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d = c1317Xa.d();
        VX b2 = c1317Xa.d().b();
        d.d(b2 != null ? VX.e(b2, null, null, null, null, null, c1295We, null, 95, null) : null);
        VX b3 = c1317Xa.d().b();
        if (b3 == null || b3.a() != TargetDeviceUiState.d) {
            return;
        }
        if (c1295We.g() || c1295We.a()) {
            this.d.c();
            return;
        }
        this.d.b();
        this.d.e();
    }
}
