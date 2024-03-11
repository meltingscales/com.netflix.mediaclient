package o;

import com.netflix.model.leafs.originals.interactive.Audio;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class dGS implements dFY {
    private final dGR a;
    private boolean b;
    private dGQ c;
    private final C7823dGr d;
    private Object e;
    private dGT f;
    private boolean g;
    private boolean h;
    private final AbstractC7820dGo i;
    private dGO j;
    private boolean k;
    private final C7826dGu l;
    private dGO m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13800o;
    private final e s;
    private boolean t;

    public final C7823dGr a() {
        return this.d;
    }

    public final dGQ b() {
        return this.c;
    }

    public final dGO f() {
        return this.m;
    }

    public final C7826dGu g() {
        return this.l;
    }

    public final AbstractC7820dGo h() {
        return this.i;
    }

    public final boolean i() {
        return this.n;
    }

    public dGS(C7823dGr c7823dGr, C7826dGu c7826dGu, boolean z) {
        C8632dsu.d(c7823dGr, "");
        C8632dsu.d(c7826dGu, "");
        this.d = c7823dGr;
        this.l = c7826dGu;
        this.n = z;
        this.a = c7823dGr.g().a();
        this.i = c7823dGr.k().c(this);
        e eVar = new e();
        eVar.a(c7823dGr.b(), TimeUnit.MILLISECONDS);
        this.s = eVar;
    }

    /* loaded from: classes5.dex */
    public static final class e extends C7869dIj {
        e() {
        }

        @Override // o.C7869dIj
        public void c() {
            dGS.this.d();
        }
    }

    /* renamed from: c */
    public dGS clone() {
        return new dGS(this.d, this.l, this.n);
    }

    @Override // o.dFY
    public void d() {
        dGQ dgq;
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            dGO dgo = this.j;
            dGT dgt = this.f;
            if (dgt == null || (dgq = dgt.d()) == null) {
                dgq = this.c;
            }
            dpR dpr = dpR.c;
            if (dgo != null) {
                dgo.a();
            } else if (dgq != null) {
                dgq.e();
            }
            this.i.a(this);
        }
    }

    public boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // o.dFY
    public C7824dGs e() {
        synchronized (this) {
            if (!(!this.f13800o)) {
                throw new IllegalStateException("Already Executed".toString());
            }
            this.f13800o = true;
            dpR dpr = dpR.c;
        }
        this.s.j();
        r();
        try {
            this.d.o().b(this);
            return j();
        } finally {
            this.d.o().d(this);
        }
    }

    @Override // o.dFY
    public void d(dFZ dfz) {
        C8632dsu.d(dfz, "");
        synchronized (this) {
            if (!(!this.f13800o)) {
                throw new IllegalStateException("Already Executed".toString());
            }
            this.f13800o = true;
            dpR dpr = dpR.c;
        }
        r();
        this.d.o().a(new c(this, dfz));
    }

    private final void r() {
        this.e = dHG.i.b().d("response.body().close()");
        this.i.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C7824dGs j() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            o.dGr r0 = r10.d
            java.util.List r0 = r0.t()
            o.C8570dqm.c(r2, r0)
            o.dHh r0 = new o.dHh
            o.dGr r1 = r10.d
            r0.<init>(r1)
            r2.add(r0)
            o.dGU r0 = new o.dGU
            o.dGr r1 = r10.d
            o.dGg r1 = r1.l()
            r0.<init>(r1)
            r2.add(r0)
            o.dGA r0 = new o.dGA
            o.dGr r1 = r10.d
            o.dFW r1 = r1.e()
            r0.<init>(r1)
            r2.add(r0)
            o.dGM r0 = o.dGM.c
            r2.add(r0)
            boolean r0 = r10.n
            if (r0 != 0) goto L46
            o.dGr r0 = r10.d
            java.util.List r0 = r0.x()
            o.C8570dqm.c(r2, r0)
        L46:
            o.dGV r0 = new o.dGV
            boolean r1 = r10.n
            r0.<init>(r1)
            r2.add(r0)
            o.dGu r5 = r10.l
            o.dGr r0 = r10.d
            int r6 = r0.h()
            o.dGr r0 = r10.d
            int r7 = r0.C()
            o.dGr r0 = r10.d
            int r8 = r0.I()
            o.dHb r9 = new o.dHb
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            o.dGu r1 = r10.l     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            o.dGs r1 = r9.e(r1)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            boolean r2 = r10.l()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            if (r2 != 0) goto L7e
            r10.c(r0)
            return r1
        L7e:
            o.dGB.e(r1)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            throw r1     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L89:
            r1 = move-exception
            r2 = 0
            goto L9e
        L8c:
            r1 = move-exception
            java.io.IOException r1 = r10.c(r1)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L9b
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9b:
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r2 = 1
        L9e:
            if (r2 != 0) goto La3
            r10.c(r0)
        La3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGS.j():o.dGs");
    }

    public final void c(C7826dGu c7826dGu, boolean z) {
        C8632dsu.d(c7826dGu, "");
        if (this.m != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.j != null) {
            throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
        }
        if (z) {
            this.f = new dGT(this.a, e(c7826dGu.j()), this, this.i);
        }
    }

    public final dGO a(C7834dHb c7834dHb) {
        C8632dsu.d(c7834dHb, "");
        synchronized (this.a) {
            if (!(!this.k)) {
                throw new IllegalStateException("released".toString());
            }
            if (this.j != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            dpR dpr = dpR.c;
        }
        dGT dgt = this.f;
        if (dgt == null) {
            C8632dsu.e();
        }
        dGZ c2 = dgt.c(this.d, c7834dHb);
        AbstractC7820dGo abstractC7820dGo = this.i;
        dGT dgt2 = this.f;
        if (dgt2 == null) {
            C8632dsu.e();
        }
        dGO dgo = new dGO(this, abstractC7820dGo, dgt2, c2);
        this.m = dgo;
        synchronized (this.a) {
            this.j = dgo;
            this.h = false;
            this.g = false;
        }
        return dgo;
    }

    public final <E extends IOException> E d(dGO dgo, boolean z, boolean z2, E e2) {
        boolean z3;
        C8632dsu.d(dgo, "");
        synchronized (this.a) {
            boolean z4 = true;
            if (!C8632dsu.c(dgo, this.j)) {
                return e2;
            }
            if (z) {
                z3 = !this.h;
                this.h = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.g) {
                    z3 = true;
                }
                this.g = true;
            }
            if (this.h && this.g && z3) {
                dGO dgo2 = this.j;
                if (dgo2 == null) {
                    C8632dsu.e();
                }
                dGQ g = dgo2.g();
                g.a(g.h() + 1);
                this.j = null;
            } else {
                z4 = false;
            }
            dpR dpr = dpR.c;
            return z4 ? (E) e(e2, false) : e2;
        }
    }

    public final IOException c(IOException iOException) {
        synchronized (this.a) {
            this.k = true;
            dpR dpr = dpR.c;
        }
        return e(iOException, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.dGQ] */
    private final <E extends IOException> E e(E e2, boolean z) {
        Socket n;
        boolean z2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.a) {
            if (z) {
                try {
                    if (this.j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ?? r2 = this.c;
            objectRef.d = r2;
            n = (r2 != 0 && this.j == null && (z || this.k)) ? n() : null;
            if (this.c != null) {
                objectRef.d = null;
            }
            z2 = this.k && this.j == null;
            dpR dpr = dpR.c;
        }
        if (n != null) {
            dGB.d(n);
        }
        InterfaceC7811dGf interfaceC7811dGf = (InterfaceC7811dGf) objectRef.d;
        if (interfaceC7811dGf != null) {
            AbstractC7820dGo abstractC7820dGo = this.i;
            if (interfaceC7811dGf == null) {
                C8632dsu.e();
            }
            abstractC7820dGo.c(this, interfaceC7811dGf);
        }
        if (z2) {
            boolean z3 = e2 != null;
            e2 = (E) b((dGS) e2);
            if (z3) {
                AbstractC7820dGo abstractC7820dGo2 = this.i;
                if (e2 == null) {
                    C8632dsu.e();
                }
                abstractC7820dGo2.d(this, e2);
            } else {
                this.i.b(this);
            }
        }
        return e2;
    }

    private final <E extends IOException> E b(E e2) {
        if (!this.t && this.s.f()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException(Audio.TYPE.timeout);
            if (e2 != null) {
                interruptedIOException.initCause(e2);
            }
            return interruptedIOException;
        }
        return e2;
    }

    public final void m() {
        if (!(!this.t)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.t = true;
        this.s.f();
    }

    public final void e(boolean z) {
        if (!(!this.k)) {
            throw new IllegalStateException("released".toString());
        }
        if (z) {
            dGO dgo = this.j;
            if (dgo != null) {
                dgo.c();
            }
            if (this.j != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.m = null;
    }

    private final dFT e(C7818dGm c7818dGm) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        dFX dfx;
        if (c7818dGm.i()) {
            sSLSocketFactory = this.d.G();
            hostnameVerifier = this.d.p();
            dfx = this.d.i();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            dfx = null;
        }
        return new dFT(c7818dGm.f(), c7818dGm.n(), this.d.m(), this.d.B(), sSLSocketFactory, hostnameVerifier, dfx, this.d.A(), this.d.u(), this.d.y(), this.d.f(), this.d.D());
    }

    public final boolean o() {
        dGT dgt = this.f;
        if (dgt == null) {
            C8632dsu.e();
        }
        return dgt.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q() {
        StringBuilder sb = new StringBuilder();
        sb.append(l() ? "canceled " : "");
        sb.append(this.n ? "web socket" : "call");
        sb.append(" to ");
        sb.append(k());
        return sb.toString();
    }

    public final String k() {
        return this.l.j().m();
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {
        private final dFZ a;
        final /* synthetic */ dGS c;
        private volatile AtomicInteger d;

        public final AtomicInteger a() {
            return this.d;
        }

        public final dGS d() {
            return this.c;
        }

        public c(dGS dgs, dFZ dfz) {
            C8632dsu.d(dfz, "");
            this.c = dgs;
            this.a = dfz;
            this.d = new AtomicInteger(0);
        }

        public final void c(c cVar) {
            C8632dsu.d(cVar, "");
            this.d = cVar.d;
        }

        public final String e() {
            return this.c.g().j().f();
        }

        public final void d(ExecutorService executorService) {
            C8632dsu.d(executorService, "");
            C7815dGj o2 = this.c.a().o();
            if (!dGB.h || !Thread.holdsLock(o2)) {
                try {
                    try {
                        executorService.execute(this);
                        return;
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        this.c.c(interruptedIOException);
                        this.a.b(this.c, interruptedIOException);
                        this.c.a().o().c(this);
                        return;
                    }
                } catch (Throwable th) {
                    this.c.a().o().c(this);
                    throw th;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(o2);
            throw new AssertionError(sb.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            C7823dGr a;
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.c.k());
            try {
                this.c.s.j();
                boolean z = false;
                try {
                    try {
                        this.a.e(this.c, this.c.j());
                        a = this.c.a();
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            dHG.i.b().d("Callback failure for " + this.c.q(), 4, e);
                        } else {
                            this.a.b(this.c, e);
                        }
                        a = this.c.a();
                        a.o().c(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.c.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.a.b(this.c, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                a.o().c(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class a extends WeakReference<dGS> {
        private final Object a;

        public final Object e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dGS dgs, Object obj) {
            super(dgs);
            C8632dsu.d(dgs, "");
            this.a = obj;
        }
    }

    public final void c(dGQ dgq) {
        C8632dsu.d(dgq, "");
        dGR dgr = this.a;
        if (!dGB.h || Thread.holdsLock(dgr)) {
            if (this.c != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.c = dgq;
            dgq.b().add(new a(this, this.e));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(dgr);
        throw new AssertionError(sb.toString());
    }

    public final Socket n() {
        dGR dgr = this.a;
        if (dGB.h && !Thread.holdsLock(dgr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(dgr);
            throw new AssertionError(sb.toString());
        }
        dGQ dgq = this.c;
        if (dgq == null) {
            C8632dsu.e();
        }
        Iterator<Reference<dGS>> it = dgq.b().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C8632dsu.c(it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        dGQ dgq2 = this.c;
        if (dgq2 == null) {
            C8632dsu.e();
        }
        dgq2.b().remove(i);
        this.c = null;
        if (dgq2.b().isEmpty()) {
            dgq2.e(System.nanoTime());
            if (this.a.e(dgq2)) {
                return dgq2.l();
            }
        }
        return null;
    }
}
