package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.InterfaceC4525bgE;

/* renamed from: o.bbU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4276bbU implements InterfaceC4299bbr {
    private final C5332bwk b;

    public C5332bwk Z() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4276bbU(C5332bwk c5332bwk) {
        this.b = c5332bwk;
    }

    @Override // o.InterfaceC4299bbr
    public void Q() {
        this.b.i();
    }

    @Override // o.InterfaceC4299bbr
    public void a(Status status) {
        this.b.d(status);
    }

    @Override // o.InterfaceC4299bbr
    public void c(Status status) {
        this.b.e(status);
    }

    @Override // o.InterfaceC4299bbr
    public Status y() {
        return this.b.b();
    }

    @Override // o.InterfaceC4299bbr
    public void T() {
        this.b.g();
    }

    @Override // o.InterfaceC4299bbr
    public void ab() {
        this.b.m();
    }

    @Override // o.InterfaceC4299bbr
    public void W() {
        this.b.n();
    }

    @Override // o.InterfaceC4299bbr
    public void V() {
        this.b.j();
    }

    @Override // o.InterfaceC4299bbr
    public void d(StopReason stopReason) {
        this.b.c(stopReason);
    }

    @Override // o.InterfaceC4299bbr
    public void U() {
        this.b.f();
    }

    @Override // o.InterfaceC4299bbr
    public long M() {
        return this.b.a();
    }

    @Override // o.InterfaceC4299bbr
    public void b(boolean z) {
        this.b.e(z);
    }

    @Override // o.InterfaceC4299bbr
    public DownloadState t() {
        return this.b.d();
    }

    @Override // o.InterfaceC4299bbr
    public DownloadState q() {
        return this.b.e();
    }

    @Override // o.InterfaceC4299bbr
    public StopReason H() {
        return this.b.c();
    }

    @Override // o.InterfaceC4299bbr
    public String r() {
        return this.b.l;
    }

    @Override // o.InterfaceC4299bbr
    public boolean P() {
        return this.b.t;
    }

    public boolean Y() {
        long j = this.b.c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (j + timeUnit.toMillis(7L) > System.currentTimeMillis()) {
            return false;
        }
        if (this.b.K == StopReason.EncodesAreNotAvailableAnyMore.e() || this.b.K == StopReason.EncodesRevoked.e() || this.b.K == StopReason.ManifestError.e() || this.b.n == StatusCode.DL_MANIFEST_NOT_FOUND_IN_CACHE.getValue()) {
            return true;
        }
        return System.currentTimeMillis() - this.b.c > timeUnit.toMillis(60L) && System.currentTimeMillis() - this.b.c < timeUnit.toMillis(365L) && t() != DownloadState.Complete;
    }

    @Override // o.InterfaceC4297bbp
    public String h() {
        return this.b.z;
    }

    @Override // o.InterfaceC4299bbr
    public String u() {
        return this.b.p;
    }

    @Override // o.InterfaceC4299bbr
    public AbstractC4561bgo s() {
        return g(this.b.s);
    }

    @Override // o.InterfaceC4297bbp
    public String i() {
        return this.b.x;
    }

    @Override // o.InterfaceC4297bbp
    public String g() {
        return this.b.f13638o;
    }

    @Override // o.InterfaceC4299bbr
    public void a(long j) {
        this.b.m = j;
    }

    @Override // o.InterfaceC4299bbr
    public void e(long j) {
        this.b.R = j;
    }

    @Override // o.InterfaceC4299bbr
    public void a(String str) {
        this.b.p = str;
    }

    @Override // o.InterfaceC4299bbr
    public void d(long j) {
        this.b.A = j;
    }

    @Override // o.InterfaceC4299bbr
    public void d(boolean z) {
        this.b.D = z;
    }

    @Override // o.InterfaceC4299bbr
    public void a(boolean z) {
        this.b.G = z;
    }

    @Override // o.InterfaceC4299bbr
    public void c(long j) {
        this.b.C = j;
    }

    @Override // o.InterfaceC4299bbr
    public void b(long j) {
        this.b.E = j;
    }

    @Override // o.InterfaceC4299bbr
    public void j(boolean z) {
        this.b.H = z;
    }

    @Override // o.InterfaceC4299bbr
    public void i(boolean z) {
        this.b.I = z;
    }

    @Override // o.InterfaceC4299bbr
    public void d(String str) {
        this.b.s = str;
    }

    @Override // o.InterfaceC4299bbr
    public void b(String str) {
        this.b.u = str;
    }

    @Override // o.InterfaceC4299bbr
    public void c(String str) {
        this.b.d = str;
    }

    @Override // o.InterfaceC4299bbr
    public void e(String str) {
        this.b.r = str;
    }

    @Override // o.InterfaceC4297bbp
    public long a() {
        return this.b.c;
    }

    @Override // o.InterfaceC4297bbp
    public String b() {
        return this.b.f;
    }

    @Override // o.InterfaceC4297bbp
    public int c() {
        return this.b.j;
    }

    @Override // o.InterfaceC4297bbp
    public int e() {
        return this.b.h;
    }

    @Override // o.InterfaceC4297bbp
    public int d() {
        return this.b.a;
    }

    @Override // o.InterfaceC4299bbr
    public AbstractC4561bgo p() {
        return g(this.b.r);
    }

    @Override // o.InterfaceC4299bbr
    public List<DownloadablePersistentData> l() {
        return this.b.b;
    }

    @Override // o.InterfaceC4299bbr
    public List<DownloadablePersistentData> L() {
        return this.b.L;
    }

    @Override // o.InterfaceC4299bbr
    public List<DownloadablePersistentData> K() {
        return this.b.N;
    }

    @Override // o.InterfaceC4299bbr
    public List<DownloadablePersistentData> J() {
        return this.b.f13637J;
    }

    @Override // o.InterfaceC4299bbr
    public boolean D() {
        return this.b.D;
    }

    @Override // o.InterfaceC4299bbr
    public long C() {
        return this.b.C;
    }

    @Override // o.InterfaceC4299bbr
    public void o() {
        this.b.C--;
    }

    @Override // o.InterfaceC4299bbr
    public void X() {
        this.b.w = 0L;
    }

    @Override // o.InterfaceC4299bbr
    public boolean I() {
        return this.b.G;
    }

    @Override // o.InterfaceC4299bbr
    public long B() {
        return this.b.w;
    }

    @Override // o.InterfaceC4299bbr
    public boolean F() {
        return this.b.H;
    }

    @Override // o.InterfaceC4299bbr
    public long N() {
        return this.b.R;
    }

    @Override // o.InterfaceC4299bbr
    public long v() {
        return this.b.m;
    }

    @Override // o.InterfaceC4299bbr
    public long z() {
        return this.b.A;
    }

    @Override // o.InterfaceC4299bbr
    public void ac() {
        this.b.w = System.currentTimeMillis();
    }

    @Override // o.InterfaceC4299bbr
    public boolean G() {
        return this.b.I;
    }

    @Override // o.InterfaceC4299bbr
    public long A() {
        return this.b.E;
    }

    @Override // o.InterfaceC4299bbr
    public AbstractC4561bgo k() {
        return g(this.b.d);
    }

    @Override // o.InterfaceC4299bbr
    public AbstractC4561bgo E() {
        return g(this.b.u);
    }

    @Override // o.InterfaceC4299bbr
    public int w() {
        return this.b.n;
    }

    @Override // o.InterfaceC4299bbr
    public String x() {
        return this.b.k;
    }

    @Override // o.InterfaceC4297bbp
    public String j() {
        return this.b.B;
    }

    @Override // o.InterfaceC4297bbp
    public int n() {
        return this.b.F;
    }

    public int aa() {
        return this.b.F;
    }

    private AbstractC4561bgo g(String str) {
        return (AbstractC4561bgo) C8118deO.a().fromJson(str, (Class<Object>) AbstractC4561bgo.class);
    }

    @Override // o.InterfaceC4297bbp
    public String f() {
        return this.b.g;
    }

    @Override // o.InterfaceC4297bbp
    public int m() {
        return this.b.S;
    }

    @Override // o.InterfaceC4299bbr
    public boolean S() {
        return this.b.y;
    }

    @Override // o.InterfaceC4299bbr
    public void e(boolean z) {
        this.b.y = z;
    }

    @Override // o.InterfaceC4299bbr
    public boolean O() {
        return this.b.v;
    }

    @Override // o.InterfaceC4299bbr
    public void c(boolean z) {
        this.b.v = z;
    }

    @Override // o.InterfaceC4299bbr
    public C4284bbc R() {
        return C4284bbc.c(this.b.O);
    }

    @Override // o.InterfaceC4299bbr
    public void e(InterfaceC4525bgE.c cVar) {
        C4284bbc R = R();
        if (R != null) {
            R.d(cVar);
            this.b.O = C4284bbc.b(R);
        }
    }

    @Override // o.InterfaceC4299bbr
    public void f(String str) {
        C4284bbc R = R();
        if (R != null) {
            R.b = str;
            this.b.O = C4284bbc.b(R);
        }
    }
}
