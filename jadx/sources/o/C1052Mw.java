package o;

import com.netflix.mediaclient.service.api.diagnostics.IDiagnosis;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import io.reactivex.Completable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C1044Mm;
import o.C1052Mw;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.Mw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052Mw {
    private aOV b;
    private InterfaceC1912aSw c;
    private InterfaceC1251Um d;
    private boolean f;
    private aSE g;
    private IDiagnosis h;
    private InterfaceC5128bss i;
    private String j;
    private InterfaceC5131bsv k;
    private CompletableSubject l;
    private InterfaceC1926aTj m;
    private IClientLogging n;

    /* renamed from: o  reason: collision with root package name */
    private aMU f13377o;
    private Object p;
    private UserAgent q;
    private InterfaceC4208baF r;
    private ZuulAgent s;
    private Object t;
    private final String e = "NfAgents";
    private final List<Runnable> a = new ArrayList();

    public final InterfaceC1251Um a() {
        return this.d;
    }

    public final void a(String str) {
        this.j = str;
    }

    public final void a(aMU amu) {
        this.f13377o = amu;
    }

    public final void a(aOV aov) {
        this.b = aov;
    }

    public final void a(InterfaceC1912aSw interfaceC1912aSw) {
        C8632dsu.c((Object) interfaceC1912aSw, "");
        this.c = interfaceC1912aSw;
    }

    public final InterfaceC1912aSw b() {
        return this.c;
    }

    public final void b(UserAgent userAgent) {
        this.q = userAgent;
    }

    public final void b(Object obj) {
        this.p = obj;
    }

    public final void b(InterfaceC5128bss interfaceC5128bss) {
        this.i = interfaceC5128bss;
    }

    public final void b(InterfaceC5131bsv interfaceC5131bsv) {
        this.k = interfaceC5131bsv;
    }

    public final IDiagnosis c() {
        return this.h;
    }

    public final void c(aSE ase) {
        C8632dsu.c((Object) ase, "");
        this.g = ase;
    }

    public final void c(InterfaceC4208baF interfaceC4208baF) {
        this.r = interfaceC4208baF;
    }

    public final aOV d() {
        return this.b;
    }

    public final void d(IDiagnosis iDiagnosis) {
        this.h = iDiagnosis;
    }

    public final void d(IClientLogging iClientLogging) {
        this.n = iClientLogging;
    }

    public final void d(Object obj) {
        C8632dsu.c(obj, "");
        this.t = obj;
    }

    public final String e() {
        return this.j;
    }

    public final void e(ZuulAgent zuulAgent) {
        this.s = zuulAgent;
    }

    public final void e(InterfaceC1251Um interfaceC1251Um) {
        this.d = interfaceC1251Um;
    }

    public final void e(InterfaceC1926aTj interfaceC1926aTj) {
        this.m = interfaceC1926aTj;
    }

    public final IClientLogging f() {
        return this.n;
    }

    public final aSE g() {
        return this.g;
    }

    public final InterfaceC1926aTj h() {
        return this.m;
    }

    public final InterfaceC5131bsv i() {
        return this.k;
    }

    public final InterfaceC5128bss j() {
        return this.i;
    }

    public final UserAgent k() {
        return this.q;
    }

    public final InterfaceC4208baF l() {
        return this.r;
    }

    public final Object m() {
        return this.p;
    }

    public final aMU n() {
        return this.f13377o;
    }

    public final Object o() {
        return this.t;
    }

    public final ZuulAgent p() {
        return this.s;
    }

    public final boolean r() {
        return this.f;
    }

    public final CompletableSubject t() {
        return this.l;
    }

    public C1052Mw() {
        CompletableSubject create = CompletableSubject.create();
        C8632dsu.a(create, "");
        this.l = create;
    }

    public final void x() {
        if (this.l.hasComplete() || this.l.hasThrowable()) {
            CompletableSubject create = CompletableSubject.create();
            C8632dsu.a(create, "");
            this.l = create;
        }
    }

    public final void s() {
        synchronized (this) {
            this.f = true;
            w();
            this.l.onComplete();
        }
    }

    public final void q() {
        synchronized (this) {
            this.f = false;
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this) {
            C8632dsu.c((Object) runnable, "");
            this.a.add(runnable);
            if (this.f) {
                w();
            }
        }
    }

    public final void c(Runnable runnable) {
        synchronized (this) {
            C8632dsu.c((Object) runnable, "");
            this.a.remove(runnable);
        }
    }

    private final void w() {
        while (!this.a.isEmpty()) {
            this.a.remove(0).run();
        }
    }

    public final void a(long j, final drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        Completable timeout = AbstractApplicationC1040Mh.getInstance().i().l.timeout(j, TimeUnit.MILLISECONDS);
        C8632dsu.a(timeout, "");
        SubscribersKt.subscribeBy(timeout, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.NfAgentProvider$onAppStartOrTimeout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                String str;
                C8632dsu.c((Object) th, "");
                str = C1052Mw.this.e;
                C1044Mm.a(str, "onError");
                drm.invoke(Boolean.FALSE);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.NfAgentProvider$onAppStartOrTimeout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                String str;
                str = C1052Mw.this.e;
                C1044Mm.a(str, "onComplete");
                drm.invoke(Boolean.TRUE);
            }
        });
    }
}
