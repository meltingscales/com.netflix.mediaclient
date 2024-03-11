package o;

import com.netflix.model.leafs.originals.interactive.Audio;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.TypeCastException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: o.dHp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7848dHp {
    public static final e e = new e(null);
    private IOException a;
    private ErrorCode b;
    private final C7842dHj c;
    private boolean d;
    private long f;
    private long g;
    private final ArrayDeque<C7819dGn> h;
    private final a i;
    private final int j;
    private final b k;
    private long l;
    private final d m;
    private final a n;

    /* renamed from: o  reason: collision with root package name */
    private long f13811o;

    public final void a(long j) {
        this.f = j;
    }

    public final C7842dHj b() {
        return this.c;
    }

    public final void c(long j) {
        this.g = j;
    }

    public final IOException d() {
        return this.a;
    }

    public final void e(long j) {
        this.f13811o = j;
    }

    public final long f() {
        return this.g;
    }

    public final a g() {
        return this.i;
    }

    public final long h() {
        return this.f;
    }

    public final int j() {
        return this.j;
    }

    public final long k() {
        return this.f13811o;
    }

    public final b l() {
        return this.k;
    }

    public final long m() {
        return this.l;
    }

    public final d n() {
        return this.m;
    }

    public final a o() {
        return this.n;
    }

    public final dIK p() {
        return this.i;
    }

    public final dIK u() {
        return this.n;
    }

    public C7848dHp(int i, C7842dHj c7842dHj, boolean z, boolean z2, C7819dGn c7819dGn) {
        C8632dsu.d(c7842dHj, "");
        this.j = i;
        this.c = c7842dHj;
        this.l = c7842dHj.f().d();
        ArrayDeque<C7819dGn> arrayDeque = new ArrayDeque<>();
        this.h = arrayDeque;
        this.m = new d(c7842dHj.h().d(), z2);
        this.k = new b(z);
        this.i = new a();
        this.n = new a();
        if (c7819dGn != null) {
            if (!(!r())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c7819dGn);
        } else if (!r()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final ErrorCode a() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.b;
        }
        return errorCode;
    }

    public final boolean q() {
        synchronized (this) {
            if (this.b != null) {
                return false;
            }
            if ((this.m.b() || this.m.a()) && (this.k.d() || this.k.b())) {
                if (this.d) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean r() {
        return this.c.a() == ((this.j & 1) == 1);
    }

    public final C7819dGn s() {
        C7819dGn c7819dGn;
        synchronized (this) {
            this.i.j();
            while (this.h.isEmpty() && this.b == null) {
                t();
            }
            this.i.a();
            if (!(!this.h.isEmpty())) {
                Throwable th = this.a;
                if (th == null) {
                    ErrorCode errorCode = this.b;
                    if (errorCode == null) {
                        C8632dsu.e();
                    }
                    th = new StreamResetException(errorCode);
                }
                throw th;
            }
            C7819dGn removeFirst = this.h.removeFirst();
            C8632dsu.b(removeFirst, "");
            c7819dGn = removeFirst;
        }
        return c7819dGn;
    }

    public final dIH i() {
        synchronized (this) {
            if (!this.d && !r()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            dpR dpr = dpR.c;
        }
        return this.k;
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        C8632dsu.d(errorCode, "");
        if (b(errorCode, iOException)) {
            this.c.b(this.j, errorCode);
        }
    }

    public final void a(ErrorCode errorCode) {
        C8632dsu.d(errorCode, "");
        if (b(errorCode, null)) {
            this.c.c(this.j, errorCode);
        }
    }

    /* renamed from: o.dHp$d */
    /* loaded from: classes5.dex */
    public final class d implements dIJ {
        private boolean b;
        private final long c;
        private boolean d;
        private C7819dGn j;
        private final C7872dIo g = new C7872dIo();
        private final C7872dIo e = new C7872dIo();

        public final void a(C7819dGn c7819dGn) {
            this.j = c7819dGn;
        }

        public final boolean a() {
            return this.d;
        }

        public final void b(boolean z) {
            this.b = z;
        }

        public final boolean b() {
            return this.b;
        }

        public d(long j, boolean z) {
            this.c = j;
            this.b = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // o.dIJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long b(o.C7872dIo r18, long r19) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7848dHp.d.b(o.dIo, long):long");
        }

        @Override // o.dIJ
        public dIK e() {
            return C7848dHp.this.g();
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long D;
            synchronized (C7848dHp.this) {
                this.d = true;
                D = this.e.D();
                this.e.d();
                C7848dHp c7848dHp = C7848dHp.this;
                if (c7848dHp != null) {
                    c7848dHp.notifyAll();
                    dpR dpr = dpR.c;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (D > 0) {
                c(D);
            }
            C7848dHp.this.e();
        }

        private final void c(long j) {
            C7848dHp c7848dHp = C7848dHp.this;
            if (!dGB.h || !Thread.holdsLock(c7848dHp)) {
                C7848dHp.this.b().b(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c7848dHp);
            throw new AssertionError(sb.toString());
        }

        public final void b(InterfaceC7871dIn interfaceC7871dIn, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C8632dsu.d(interfaceC7871dIn, "");
            C7848dHp c7848dHp = C7848dHp.this;
            if (dGB.h && Thread.holdsLock(c7848dHp)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C8632dsu.b(currentThread, "");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(c7848dHp);
                throw new AssertionError(sb.toString());
            }
            while (j > 0) {
                synchronized (C7848dHp.this) {
                    z = this.b;
                    z2 = true;
                    z3 = this.e.D() + j > this.c;
                    dpR dpr = dpR.c;
                }
                if (z3) {
                    interfaceC7871dIn.h(j);
                    C7848dHp.this.a(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    interfaceC7871dIn.h(j);
                    return;
                } else {
                    long b = interfaceC7871dIn.b(this.g, j);
                    if (b == -1) {
                        throw new EOFException();
                    }
                    j -= b;
                    synchronized (C7848dHp.this) {
                        if (this.d) {
                            j2 = this.g.D();
                            this.g.d();
                        } else {
                            if (this.e.D() != 0) {
                                z2 = false;
                            }
                            this.e.b(this.g);
                            if (z2) {
                                C7848dHp c7848dHp2 = C7848dHp.this;
                                if (c7848dHp2 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                }
                                c7848dHp2.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        c(j2);
                    }
                }
            }
        }
    }

    /* renamed from: o.dHp$b */
    /* loaded from: classes5.dex */
    public final class b implements dIH {
        private C7819dGn a;
        private boolean b;
        private final C7872dIo c = new C7872dIo();
        private boolean d;

        public final boolean b() {
            return this.d;
        }

        public final boolean d() {
            return this.b;
        }

        public b(boolean z) {
            this.b = z;
        }

        private final void d(boolean z) {
            long min;
            boolean z2;
            synchronized (C7848dHp.this) {
                C7848dHp.this.o().j();
                while (C7848dHp.this.k() >= C7848dHp.this.m() && !this.b && !this.d && C7848dHp.this.a() == null) {
                    C7848dHp.this.t();
                }
                C7848dHp.this.o().a();
                C7848dHp.this.c();
                min = Math.min(C7848dHp.this.m() - C7848dHp.this.k(), this.c.D());
                C7848dHp c7848dHp = C7848dHp.this;
                c7848dHp.e(c7848dHp.k() + min);
                z2 = z && min == this.c.D() && C7848dHp.this.a() == null;
                dpR dpr = dpR.c;
            }
            C7848dHp.this.o().j();
            try {
                C7848dHp.this.b().b(C7848dHp.this.j(), z2, this.c, min);
            } finally {
                C7848dHp.this.o().a();
            }
        }

        @Override // o.dIH
        public dIK e() {
            return C7848dHp.this.o();
        }

        @Override // o.dIH
        public void a(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            C7848dHp c7848dHp = C7848dHp.this;
            if (!dGB.h || !Thread.holdsLock(c7848dHp)) {
                this.c.a(c7872dIo, j);
                while (this.c.D() >= 16384) {
                    d(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c7848dHp);
            throw new AssertionError(sb.toString());
        }

        @Override // o.dIH, java.io.Flushable
        public void flush() {
            C7848dHp c7848dHp = C7848dHp.this;
            if (!dGB.h || !Thread.holdsLock(c7848dHp)) {
                synchronized (C7848dHp.this) {
                    C7848dHp.this.c();
                    dpR dpr = dpR.c;
                }
                while (this.c.D() > 0) {
                    d(false);
                    C7848dHp.this.b().e();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c7848dHp);
            throw new AssertionError(sb.toString());
        }

        @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7848dHp c7848dHp = C7848dHp.this;
            if (!dGB.h || !Thread.holdsLock(c7848dHp)) {
                synchronized (C7848dHp.this) {
                    if (this.d) {
                        return;
                    }
                    boolean z = C7848dHp.this.a() == null;
                    dpR dpr = dpR.c;
                    if (!C7848dHp.this.l().b) {
                        boolean z2 = this.c.D() > 0;
                        if (this.a != null) {
                            while (this.c.D() > 0) {
                                d(false);
                            }
                            C7842dHj b = C7848dHp.this.b();
                            int j = C7848dHp.this.j();
                            C7819dGn c7819dGn = this.a;
                            if (c7819dGn == null) {
                                C8632dsu.e();
                            }
                            b.b(j, z, dGB.c(c7819dGn));
                        } else if (z2) {
                            while (this.c.D() > 0) {
                                d(true);
                            }
                        } else if (z) {
                            C7848dHp.this.b().b(C7848dHp.this.j(), true, null, 0L);
                        }
                    }
                    synchronized (C7848dHp.this) {
                        this.d = true;
                        dpR dpr2 = dpR.c;
                    }
                    C7848dHp.this.b().e();
                    C7848dHp.this.e();
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c7848dHp);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: o.dHp$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }

    public final void c() {
        if (this.k.b()) {
            throw new IOException("stream closed");
        }
        if (this.k.d()) {
            throw new IOException("stream finished");
        }
        ErrorCode errorCode = this.b;
        if (errorCode != null) {
            IOException iOException = this.a;
            if (iOException != null) {
                throw iOException;
            }
            if (errorCode == null) {
                C8632dsu.e();
            }
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: o.dHp$a */
    /* loaded from: classes5.dex */
    public final class a extends C7869dIj {
        public a() {
        }

        @Override // o.C7869dIj
        public void c() {
            C7848dHp.this.a(ErrorCode.CANCEL);
            C7848dHp.this.b().o();
        }

        @Override // o.C7869dIj
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(Audio.TYPE.timeout);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void a() {
            if (f()) {
                throw b((IOException) null);
            }
        }
    }

    private final boolean b(ErrorCode errorCode, IOException iOException) {
        if (!dGB.h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.b != null) {
                    return false;
                }
                if (this.m.b() && this.k.d()) {
                    return false;
                }
                this.b = errorCode;
                this.a = iOException;
                notifyAll();
                dpR dpr = dpR.c;
                this.c.c(this.j);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void d(InterfaceC7871dIn interfaceC7871dIn, int i) {
        C8632dsu.d(interfaceC7871dIn, "");
        if (!dGB.h || !Thread.holdsLock(this)) {
            this.m.b(interfaceC7871dIn, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x003d, B:14:0x0045, B:17:0x0054, B:18:0x0059, B:15:0x004b), top: B:26:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o.C7819dGn r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.d(r3, r0)
            boolean r0 = o.dGB.h
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L3c
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r0 = ""
            o.C8632dsu.b(r4, r0)
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            r3.append(r4)
            r3.append(r2)
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L3c:
            monitor-enter(r2)
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L4b
            if (r4 != 0) goto L45
            goto L4b
        L45:
            o.dHp$d r0 = r2.m     // Catch: java.lang.Throwable -> L6d
            r0.a(r3)     // Catch: java.lang.Throwable -> L6d
            goto L52
        L4b:
            r2.d = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<o.dGn> r0 = r2.h     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L52:
            if (r4 == 0) goto L59
            o.dHp$d r3 = r2.m     // Catch: java.lang.Throwable -> L6d
            r3.b(r1)     // Catch: java.lang.Throwable -> L6d
        L59:
            boolean r3 = r2.q()     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            o.dpR r4 = o.dpR.c     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            o.dHj r3 = r2.c
            int r4 = r2.j
            r3.c(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7848dHp.c(o.dGn, boolean):void");
    }

    public final void d(ErrorCode errorCode) {
        synchronized (this) {
            C8632dsu.d(errorCode, "");
            if (this.b == null) {
                this.b = errorCode;
                notifyAll();
            }
        }
    }

    public final void e() {
        boolean z;
        boolean q;
        if (!dGB.h || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.m.b() && this.m.a() && (this.k.d() || this.k.b());
                q = q();
                dpR dpr = dpR.c;
            }
            if (z) {
                c(ErrorCode.CANCEL, (IOException) null);
                return;
            } else if (q) {
                return;
            } else {
                this.c.c(this.j);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void d(long j) {
        this.l += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
