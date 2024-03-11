package o;

import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import java.io.File;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: o.ky  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9196ky {
    final C9197kz e;

    public C9196ky(String str) {
        this.e = new C9197kz(str);
    }

    private void a(String str) {
        InterfaceC9200lB k = k();
        k.c("Invalid null value supplied to config." + str + ", ignoring");
    }

    public String a() {
        return this.e.d();
    }

    public String e() {
        return this.e.a();
    }

    public void d(String str) {
        this.e.a(str);
    }

    public Integer H() {
        return this.e.F();
    }

    public void a(Integer num) {
        this.e.a(num);
    }

    public String D() {
        return this.e.B();
    }

    public void c(String str) {
        this.e.c(str);
    }

    public ThreadSendPolicy A() {
        return this.e.A();
    }

    public boolean u() {
        return this.e.v();
    }

    public File x() {
        return this.e.u();
    }

    public boolean z() {
        return this.e.D();
    }

    public long o() {
        return this.e.n();
    }

    public boolean c() {
        return this.e.g();
    }

    public C9226lb f() {
        return this.e.m();
    }

    public boolean d() {
        return this.e.c();
    }

    public String b() {
        return this.e.e();
    }

    public InterfaceC9200lB k() {
        return this.e.t();
    }

    public void c(InterfaceC9200lB interfaceC9200lB) {
        this.e.c(interfaceC9200lB);
    }

    public InterfaceC9157kL g() {
        return this.e.j();
    }

    public void c(InterfaceC9157kL interfaceC9157kL) {
        if (interfaceC9157kL != null) {
            this.e.b(interfaceC9157kL);
        } else {
            a("delivery");
        }
    }

    public C9168kW m() {
        return this.e.k();
    }

    public int n() {
        return this.e.p();
    }

    public void a(int i) {
        if (i >= 0 && i <= 500) {
            this.e.a(i);
            return;
        }
        InterfaceC9200lB k = k();
        k.c("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i);
    }

    public int r() {
        return this.e.s();
    }

    public int s() {
        return this.e.r();
    }

    public long B() {
        return this.e.H();
    }

    public int t() {
        return this.e.q();
    }

    public int q() {
        return this.e.y();
    }

    public String j() {
        return this.e.i();
    }

    public Set<Pattern> v() {
        return this.e.C();
    }

    public Set<Pattern> i() {
        return this.e.f();
    }

    public Set<String> l() {
        return this.e.l();
    }

    public Set<BreadcrumbType> h() {
        return this.e.o();
    }

    public void b(Set<BreadcrumbType> set) {
        this.e.a(set);
    }

    public Set<Telemetry> C() {
        return this.e.I();
    }

    public Set<String> w() {
        return this.e.z();
    }

    public void d(Set<String> set) {
        if (C9195kx.a(set)) {
            a("projectPackages");
        } else {
            this.e.c(set);
        }
    }

    public C9294mq G() {
        return this.e.G();
    }

    public boolean I() {
        return this.e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<InterfaceC9217lS> y() {
        return this.e.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9209lK p() {
        return this.e.x();
    }
}
