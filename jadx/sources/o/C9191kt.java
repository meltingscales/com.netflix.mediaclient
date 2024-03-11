package o;

import android.app.Application;
import android.content.Context;
import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.BreadcrumbState;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.Severity;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.internal.TaskType;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.kt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9191kt {
    private final C9295mr A;
    private final InterfaceC9257mF C;
    final C9184km a;
    final Context b;
    final C9192ku c;
    public final C9301mx d;
    final BreadcrumbState e;
    final InterfaceC9147kB f;
    final C9153kH g;
    final C9160kO h;
    final C9237lm i;
    protected final C9232lh j;
    final C9201lC k;
    public final C9258mG l;
    public final InterfaceC9200lB m;
    final C9247lw n;

    /* renamed from: o  reason: collision with root package name */
    final C9203lE f13876o;
    public final C9281md p;
    C9219lU q;
    final C9209lK r;
    final C9205lG s;
    final C9207lI t;
    private final C9150kE u;
    private final C9190ks v;
    final C9285mh w;
    private final C9239lo x;
    private final Map<String, Object> y;

    public C9184km c() {
        return this.a;
    }

    public C9258mG e() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9150kE f() {
        return this.u;
    }

    public C9247lw g() {
        return this.n;
    }

    public C9232lh h() {
        return this.j;
    }

    public C9237lm i() {
        return this.i;
    }

    public C9160kO j() {
        return this.h;
    }

    public C9281md k() {
        return this.p;
    }

    public C9207lI l() {
        return this.t;
    }

    public InterfaceC9200lB m() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9209lK o() {
        return this.r;
    }

    public C9191kt(Context context, C9196ky c9196ky) {
        C9205lG c9205lG = new C9205lG();
        this.s = c9205lG;
        C9301mx c9301mx = new C9301mx();
        this.d = c9301mx;
        C9268mQ c9268mQ = new C9268mQ(context);
        Context a = c9268mQ.a();
        this.b = a;
        C9209lK p = c9196ky.p();
        this.r = p;
        C9152kG c9152kG = new C9152kG(a, new drX<Boolean, String, dpR>() { // from class: o.kt.3
            @Override // o.drX
            /* renamed from: e */
            public dpR invoke(Boolean bool, String str) {
                HashMap hashMap = new HashMap();
                hashMap.put("hasConnection", bool);
                hashMap.put("networkState", str);
                C9191kt.this.c("Connectivity changed", BreadcrumbType.STATE, hashMap);
                if (bool.booleanValue()) {
                    C9191kt.this.j.c();
                    C9191kt.this.p.a();
                    return null;
                }
                return null;
            }
        });
        this.f = c9152kG;
        C9266mO c9266mO = new C9266mO(c9268mQ, c9196ky, c9152kG, c9301mx);
        C9258mG a2 = c9266mO.a();
        this.l = a2;
        InterfaceC9200lB m = a2.m();
        this.m = m;
        if (!(context instanceof Application)) {
            m.d("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        C9300mw.e(a2.x().getValue());
        C9283mf c9283mf = new C9283mf(a, a2, m);
        C9193kv c9193kv = new C9193kv(a2, c9196ky);
        this.c = c9193kv.e();
        C9190ks a3 = c9193kv.a();
        this.v = a3;
        this.e = c9193kv.d();
        this.u = c9193kv.b();
        this.t = c9193kv.f();
        this.i = c9193kv.c();
        C9270mS c9270mS = new C9270mS(c9268mQ);
        TaskType taskType = TaskType.IO;
        c9283mf.a(c9301mx, taskType);
        C9291mn c9291mn = new C9291mn(c9266mO, c9283mf, this, c9301mx, a3);
        this.f13876o = c9291mn.a();
        this.p = c9291mn.c();
        C9151kF c9151kF = new C9151kF(c9268mQ, c9266mO, c9270mS, c9291mn, c9301mx, c9152kG, c9283mf.b(), c9283mf.d(), c9205lG);
        c9151kF.a(c9301mx, taskType);
        this.a = c9151kF.c();
        this.h = c9151kF.a();
        this.A = c9283mf.h().e(c9196ky.G());
        c9283mf.j().b();
        C9234lj c9234lj = new C9234lj(c9268mQ, c9266mO, c9151kF, c9301mx, c9291mn, c9270mS, p, a3);
        c9234lj.a(c9301mx, taskType);
        C9232lh d = c9234lj.d();
        this.j = d;
        this.g = new C9153kH(m, d, a2, a3, p, c9301mx);
        this.x = new C9239lo(this, m);
        this.k = c9283mf.c();
        this.n = c9283mf.a();
        this.q = new C9219lU(c9196ky.y(), a2, m);
        if (c9196ky.C().contains(Telemetry.USAGE)) {
            this.C = new C9259mH();
        } else {
            this.C = new C9260mI();
        }
        this.y = c9196ky.e.h();
        this.w = new C9285mh(this, m);
        B();
    }

    private void B() {
        if (this.l.g().c()) {
            this.x.e();
        }
        NativeInterface.setClient(this);
        this.q.a(this);
        C9213lO c9213lO = C9213lO.e;
        c9213lO.b(this.q.d());
        if (this.l.B().contains(Telemetry.USAGE)) {
            c9213lO.a(true);
        }
        this.j.d();
        this.j.c();
        this.p.a();
        this.C.e(this.y);
        this.v.e(this.C);
        r();
        w();
        t();
        c("Bugsnag loaded", BreadcrumbType.STATE, new HashMap());
        this.m.b("Bugsnag loaded");
    }

    void r() {
        Context context = this.b;
        if (context instanceof Application) {
            Application application = (Application) context;
            C9303mz.d(application);
            C9303mz.e(this.p);
            if (this.l.e(BreadcrumbType.STATE)) {
                return;
            }
            application.registerActivityLifecycleCallbacks(new C9176ke(new drX<String, Map<String, ? extends Object>, dpR>() { // from class: o.kt.4
                @Override // o.drX
                /* renamed from: a */
                public dpR invoke(String str, Map<String, ?> map) {
                    C9191kt.this.d(str, map, BreadcrumbType.STATE);
                    return null;
                }
            }));
        }
    }

    void t() {
        try {
            this.d.e(TaskType.DEFAULT, new Runnable() { // from class: o.kt.5
                @Override // java.lang.Runnable
                public void run() {
                    C9191kt.this.f.e();
                    C9191kt c9191kt = C9191kt.this;
                    C9285mh.b(c9191kt.b, c9191kt.w, c9191kt.m);
                }
            });
        } catch (RejectedExecutionException e) {
            this.m.e("Failed to register for system events", e);
        }
    }

    private void d(final C9247lw c9247lw) {
        try {
            this.d.e(TaskType.IO, new Runnable() { // from class: o.kt.1
                @Override // java.lang.Runnable
                public void run() {
                    C9191kt.this.k.e(c9247lw);
                }
            });
        } catch (RejectedExecutionException e) {
            this.m.e("Failed to persist last run info", e);
        }
    }

    private void b(String str) {
        InterfaceC9200lB interfaceC9200lB = this.m;
        interfaceC9200lB.c("Invalid null value supplied to client." + str + ", ignoring");
    }

    private void w() {
        this.b.registerComponentCallbacks(new ComponentCallbacks2C9194kw(this.h, new drX<String, String, dpR>() { // from class: o.kt.2
            @Override // o.drX
            /* renamed from: d */
            public dpR invoke(String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put(NetflixActivity.EXTRA_FROM, str);
                hashMap.put("to", str2);
                C9191kt.this.c("Orientation changed", BreadcrumbType.STATE, hashMap);
                C9191kt.this.c.a(str2);
                return null;
            }
        }, new drX<Boolean, Integer, dpR>() { // from class: o.kt.8
            @Override // o.drX
            /* renamed from: c */
            public dpR invoke(Boolean bool, Integer num) {
                C9191kt.this.s.b(Boolean.TRUE.equals(bool));
                if (C9191kt.this.s.a(num)) {
                    C9191kt c9191kt = C9191kt.this;
                    c9191kt.c("Trim Memory", BreadcrumbType.STATE, Collections.singletonMap("trimLevel", c9191kt.s.c()));
                }
                C9191kt.this.s.a();
                return null;
            }
        }));
    }

    public void u() {
        if (!z()) {
            this.m.d("Failed to setup NDK directory.");
            return;
        }
        String absolutePath = this.k.c().getAbsolutePath();
        C9247lw c9247lw = this.n;
        this.c.d(this.l, absolutePath, c9247lw != null ? c9247lw.a() : 0);
        v();
        this.c.a();
    }

    private boolean z() {
        try {
            return ((Boolean) this.d.c(TaskType.IO, new Callable<Boolean>() { // from class: o.kt.9
                @Override // java.util.concurrent.Callable
                /* renamed from: e */
                public Boolean call() {
                    File nativeReportPath = NativeInterface.getNativeReportPath();
                    return Boolean.valueOf(nativeReportPath.exists() || nativeReportPath.mkdirs());
                }
            }).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void d(InterfaceC9263mL interfaceC9263mL) {
        this.t.addObserver(interfaceC9263mL);
        this.e.addObserver(interfaceC9263mL);
        this.p.addObserver(interfaceC9263mL);
        this.c.addObserver(interfaceC9263mL);
        this.A.addObserver(interfaceC9263mL);
        this.u.addObserver(interfaceC9263mL);
        this.g.addObserver(interfaceC9263mL);
        this.f13876o.addObserver(interfaceC9263mL);
        this.s.addObserver(interfaceC9263mL);
        this.i.addObserver(interfaceC9263mL);
    }

    public void a(InterfaceC9263mL interfaceC9263mL) {
        this.t.removeObserver(interfaceC9263mL);
        this.e.removeObserver(interfaceC9263mL);
        this.p.removeObserver(interfaceC9263mL);
        this.c.removeObserver(interfaceC9263mL);
        this.A.removeObserver(interfaceC9263mL);
        this.u.removeObserver(interfaceC9263mL);
        this.g.removeObserver(interfaceC9263mL);
        this.f13876o.removeObserver(interfaceC9263mL);
        this.s.removeObserver(interfaceC9263mL);
        this.i.removeObserver(interfaceC9263mL);
    }

    void v() {
        this.t.c();
        this.u.a();
        this.A.a();
        this.s.a();
        this.i.d();
    }

    public void y() {
        this.p.c(false);
    }

    public void s() {
        this.p.i();
    }

    public boolean x() {
        return this.p.j();
    }

    public String d() {
        return this.u.d();
    }

    public void a(String str) {
        this.u.d(str);
    }

    public void d(String str, String str2, String str3) {
        this.A.b(new C9294mq(str, str2, str3));
    }

    public C9294mq q() {
        return this.A.c();
    }

    public void d(InterfaceC9218lT interfaceC9218lT) {
        if (interfaceC9218lT != null) {
            this.v.c(interfaceC9218lT);
        } else {
            b("addOnError");
        }
    }

    public void a(Throwable th, InterfaceC9218lT interfaceC9218lT) {
        if (th != null) {
            if (this.l.b(th)) {
                return;
            }
            c(new C9229le(th, this.l, C9280mc.a("handledException"), this.t.a(), this.i.c(), this.m), interfaceC9218lT);
            return;
        }
        b("notify");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Throwable th, C9206lH c9206lH, String str, String str2) {
        c(new C9229le(th, this.l, C9280mc.d(str, Severity.ERROR, str2), C9206lH.c.b(this.t.a(), c9206lH), this.i.c(), this.m), (InterfaceC9218lT) null);
        C9247lw c9247lw = this.n;
        int a = c9247lw == null ? 0 : c9247lw.a();
        boolean b = this.f13876o.b();
        if (b) {
            a++;
        }
        d(new C9247lw(a, true, b));
        this.d.b();
    }

    public void c(C9229le c9229le, InterfaceC9218lT interfaceC9218lT) {
        c9229le.a(this.h.a(new Date().getTime()));
        c9229le.a("device", this.h.c());
        c9229le.b(this.a.a());
        c9229le.a("app", this.a.d());
        c9229le.a(this.e.copy());
        C9294mq c = this.A.c();
        c9229le.e(c.c(), c.b(), c.d());
        c9229le.a(this.u.d());
        c9229le.c(this.C);
        d(c9229le, interfaceC9218lT);
    }

    void d(C9229le c9229le, InterfaceC9218lT interfaceC9218lT) {
        c9229le.c(this.t.a().c());
        C9220lV c = this.p.c();
        if (c != null && (this.l.i() || !c.i())) {
            c9229le.c(c);
        }
        if (!this.v.d(c9229le, this.m) || (interfaceC9218lT != null && !interfaceC9218lT.c(c9229le))) {
            this.m.b("Skipping notification - onError task returned false");
            return;
        }
        d(c9229le);
        this.g.d(c9229le);
    }

    public List<Breadcrumb> a() {
        return this.e.copy();
    }

    public void c(String str, Map<String, ?> map) {
        if (str != null && map != null) {
            this.t.a(str, map);
        } else {
            b("addMetadata");
        }
    }

    public void c(String str, String str2, Object obj) {
        if (str != null && str2 != null) {
            this.t.c(str, str2, obj);
        } else {
            b("addMetadata");
        }
    }

    public void d(String str) {
        if (str != null) {
            this.t.b(str);
        } else {
            b("clearMetadata");
        }
    }

    public void b(String str, String str2) {
        if (str != null && str2 != null) {
            this.t.b(str, str2);
        } else {
            b("clearMetadata");
        }
    }

    public Map<String, Object> n() {
        return this.t.a().d();
    }

    public void e(String str) {
        if (str != null) {
            this.e.add(new Breadcrumb(str, this.m));
        } else {
            b("leaveBreadcrumb");
        }
    }

    public void d(String str, Map<String, Object> map, BreadcrumbType breadcrumbType) {
        if (str != null && breadcrumbType != null && map != null) {
            this.e.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.m));
        } else {
            b("leaveBreadcrumb");
        }
    }

    void c(String str, BreadcrumbType breadcrumbType, Map<String, Object> map) {
        if (this.l.e(breadcrumbType)) {
            return;
        }
        this.e.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.m));
    }

    private void d(C9229le c9229le) {
        List<C9170kY> c = c9229le.c();
        if (c.size() > 0) {
            String e = c.get(0).e();
            String d = c.get(0).d();
            HashMap hashMap = new HashMap();
            hashMap.put("errorClass", e);
            hashMap.put("message", d);
            hashMap.put("unhandled", String.valueOf(c9229le.g()));
            hashMap.put("severity", c9229le.i().toString());
            this.e.add(new Breadcrumb(e, BreadcrumbType.ERROR, hashMap, new Date(), this.m));
        }
    }

    public void d(String str, String str2) {
        if (str != null) {
            this.i.b(str, str2);
        } else {
            b("addFeatureFlag");
        }
    }

    public void b() {
        this.i.a();
    }

    public void p() {
        this.f13876o.d();
    }

    protected void finalize() {
        C9285mh c9285mh = this.w;
        if (c9285mh != null) {
            try {
                C9148kC.d(this.b, c9285mh, this.m);
            } catch (IllegalArgumentException unused) {
                this.m.d("Receiver not registered");
            }
        }
        super.finalize();
    }

    public void c(String str) {
        c().a(str);
    }

    public InterfaceC9217lS a(Class cls) {
        return this.q.e(cls);
    }

    public void a(boolean z) {
        this.q.a(this, z);
        if (z) {
            this.x.e();
        } else {
            this.x.c();
        }
    }

    public void d(boolean z) {
        this.q.b(this, z);
    }
}
