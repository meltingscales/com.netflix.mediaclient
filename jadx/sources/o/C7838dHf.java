package o;

import com.netflix.android.org.json.HTTP;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import o.C7824dGs;

/* renamed from: o.dHf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7838dHf implements dGZ {
    public static final a a = new a(null);
    private final dGQ b;
    private final C7841dHi c;
    private final C7823dGr d;
    private C7819dGn g;
    private final dIq h;
    private final InterfaceC7871dIn i;
    private int j;

    @Override // o.dGZ
    public dGQ c() {
        return this.b;
    }

    public C7838dHf(C7823dGr c7823dGr, dGQ dgq, InterfaceC7871dIn interfaceC7871dIn, dIq diq) {
        C8632dsu.d(dgq, "");
        C8632dsu.d(interfaceC7871dIn, "");
        C8632dsu.d(diq, "");
        this.d = c7823dGr;
        this.b = dgq;
        this.i = interfaceC7871dIn;
        this.h = diq;
        this.c = new C7841dHi(interfaceC7871dIn);
    }

    private final boolean a(C7824dGs c7824dGs) {
        boolean a2;
        a2 = C8691duz.a("chunked", C7824dGs.c(c7824dGs, "Transfer-Encoding", null, 2, null), true);
        return a2;
    }

    private final boolean e(C7826dGu c7826dGu) {
        boolean a2;
        a2 = C8691duz.a("chunked", c7826dGu.a("Transfer-Encoding"), true);
        return a2;
    }

    @Override // o.dGZ
    public dIH e(C7826dGu c7826dGu, long j) {
        C8632dsu.d(c7826dGu, "");
        if (c7826dGu.b() == null || !c7826dGu.b().c()) {
            if (e(c7826dGu)) {
                return d();
            }
            if (j != -1) {
                return j();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // o.dGZ
    public void a() {
        c().e();
    }

    @Override // o.dGZ
    public void a(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        C7839dHg c7839dHg = C7839dHg.b;
        Proxy.Type type = c().m().a().type();
        C8632dsu.b(type, "");
        e(c7826dGu.c(), c7839dHg.b(c7826dGu, type));
    }

    @Override // o.dGZ
    public long b(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        if (C7833dHa.d(c7824dGs)) {
            if (a(c7824dGs)) {
                return -1L;
            }
            return dGB.e(c7824dGs);
        }
        return 0L;
    }

    @Override // o.dGZ
    public dIJ d(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        if (C7833dHa.d(c7824dGs)) {
            if (a(c7824dGs)) {
                return d(c7824dGs.n().j());
            }
            long e2 = dGB.e(c7824dGs);
            if (e2 != -1) {
                return a(e2);
            }
            return h();
        }
        return a(0L);
    }

    @Override // o.dGZ
    public void b() {
        this.h.flush();
    }

    @Override // o.dGZ
    public void e() {
        this.h.flush();
    }

    public final void e(C7819dGn c7819dGn, String str) {
        C8632dsu.d(c7819dGn, "");
        C8632dsu.d((Object) str, "");
        if (this.j != 0) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.h.b(str).b(HTTP.CRLF);
        int c2 = c7819dGn.c();
        for (int i2 = 0; i2 < c2; i2++) {
            this.h.b(c7819dGn.c(i2)).b(": ").b(c7819dGn.a(i2)).b(HTTP.CRLF);
        }
        this.h.b(HTTP.CRLF);
        this.j = 1;
    }

    @Override // o.dGZ
    public C7824dGs.b e(boolean z) {
        int i2 = this.j;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        try {
            C7837dHe e2 = C7837dHe.b.e(this.c.d());
            C7824dGs.b d2 = new C7824dGs.b().c(e2.e).c(e2.a).a(e2.d).d(this.c.c());
            if (z && e2.a == 100) {
                return null;
            }
            if (e2.a == 100) {
                this.j = 3;
                return d2;
            }
            this.j = 4;
            return d2;
        } catch (EOFException e3) {
            String m = c().m().c().l().m();
            throw new IOException("unexpected end of stream on " + m, e3);
        }
    }

    private final dIH d() {
        if (this.j != 1) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.j = 2;
        return new e();
    }

    private final dIH j() {
        if (this.j != 1) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.j = 2;
        return new f();
    }

    private final dIJ a(long j) {
        if (this.j != 4) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.j = 5;
        return new b(j);
    }

    private final dIJ d(C7818dGm c7818dGm) {
        if (this.j != 4) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.j = 5;
        return new c(this, c7818dGm);
    }

    private final dIJ h() {
        if (this.j != 4) {
            throw new IllegalStateException(("state: " + this.j).toString());
        }
        this.j = 5;
        c().j();
        return new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(dIs dis) {
        dIK e2 = dis.e();
        dis.e(dIK.c);
        e2.cC_();
        e2.cD_();
    }

    public final void e(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        long e2 = dGB.e(c7824dGs);
        if (e2 == -1) {
            return;
        }
        dIJ a2 = a(e2);
        dGB.e(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        a2.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$f */
    /* loaded from: classes5.dex */
    public final class f implements dIH {
        private final dIs c;
        private boolean e;

        @Override // o.dIH
        public dIK e() {
            return this.c;
        }

        public f() {
            this.c = new dIs(C7838dHf.this.h.e());
        }

        @Override // o.dIH
        public void a(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (!(!this.e)) {
                throw new IllegalStateException("closed".toString());
            }
            dGB.b(c7872dIo.D(), 0L, j);
            C7838dHf.this.h.a(c7872dIo, j);
        }

        @Override // o.dIH, java.io.Flushable
        public void flush() {
            if (this.e) {
                return;
            }
            C7838dHf.this.h.flush();
        }

        @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            C7838dHf.this.b(this.c);
            C7838dHf.this.j = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$e */
    /* loaded from: classes5.dex */
    public final class e implements dIH {
        private boolean c;
        private final dIs e;

        @Override // o.dIH
        public dIK e() {
            return this.e;
        }

        public e() {
            this.e = new dIs(C7838dHf.this.h.e());
        }

        @Override // o.dIH
        public void a(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (!(!this.c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            C7838dHf.this.h.l(j);
            C7838dHf.this.h.b(HTTP.CRLF);
            C7838dHf.this.h.a(c7872dIo, j);
            C7838dHf.this.h.b(HTTP.CRLF);
        }

        @Override // o.dIH, java.io.Flushable
        public void flush() {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                C7838dHf.this.h.flush();
            }
        }

        @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.c = true;
                C7838dHf.this.h.b("0\r\n\r\n");
                C7838dHf.this.b(this.e);
                C7838dHf.this.j = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$d */
    /* loaded from: classes5.dex */
    public abstract class d implements dIJ {
        private boolean c;
        private final dIs d;

        protected final boolean c() {
            return this.c;
        }

        protected final void d(boolean z) {
            this.c = z;
        }

        @Override // o.dIJ
        public dIK e() {
            return this.d;
        }

        public d() {
            this.d = new dIs(C7838dHf.this.i.e());
        }

        @Override // o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            try {
                return C7838dHf.this.i.b(c7872dIo, j);
            } catch (IOException e) {
                C7838dHf.this.c().j();
                b();
                throw e;
            }
        }

        public final void b() {
            if (C7838dHf.this.j == 6) {
                return;
            }
            if (C7838dHf.this.j == 5) {
                C7838dHf.this.b(this.d);
                C7838dHf.this.j = 6;
                return;
            }
            throw new IllegalStateException("state: " + C7838dHf.this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$b */
    /* loaded from: classes5.dex */
    public final class b extends d {
        private long d;

        public b(long j) {
            super();
            this.d = j;
            if (j == 0) {
                b();
            }
        }

        @Override // o.C7838dHf.d, o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!c()) {
                long j2 = this.d;
                if (j2 == 0) {
                    return -1L;
                }
                long b = super.b(c7872dIo, Math.min(j2, j));
                if (b == -1) {
                    C7838dHf.this.c().j();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                long j3 = this.d - b;
                this.d = j3;
                if (j3 == 0) {
                    b();
                }
                return b;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (c()) {
                return;
            }
            if (this.d != 0 && !dGB.c(this, 100, TimeUnit.MILLISECONDS)) {
                C7838dHf.this.c().j();
                b();
            }
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$c */
    /* loaded from: classes5.dex */
    public final class c extends d {
        private long a;
        private boolean b;
        private final C7818dGm c;
        final /* synthetic */ C7838dHf d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7838dHf c7838dHf, C7818dGm c7818dGm) {
            super();
            C8632dsu.d(c7818dGm, "");
            this.d = c7838dHf;
            this.c = c7818dGm;
            this.a = -1L;
            this.b = true;
        }

        @Override // o.C7838dHf.d, o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!c()) {
                if (this.b) {
                    long j2 = this.a;
                    if (j2 == 0 || j2 == -1) {
                        d();
                        if (!this.b) {
                            return -1L;
                        }
                    }
                    long b = super.b(c7872dIo, Math.min(j, this.a));
                    if (b != -1) {
                        this.a -= b;
                        return b;
                    }
                    this.d.c().j();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                return -1L;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
            if (r1 != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void d() {
            /*
                r7 = this;
                long r0 = r7.a
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                o.dHf r0 = r7.d
                o.dIn r0 = o.C7838dHf.c(r0)
                r0.z()
            L11:
                o.dHf r0 = r7.d     // Catch: java.lang.NumberFormatException -> Lb0
                o.dIn r0 = o.C7838dHf.c(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                long r0 = r0.s()     // Catch: java.lang.NumberFormatException -> Lb0
                r7.a = r0     // Catch: java.lang.NumberFormatException -> Lb0
                o.dHf r0 = r7.d     // Catch: java.lang.NumberFormatException -> Lb0
                o.dIn r0 = o.C7838dHf.c(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r0 = r0.z()     // Catch: java.lang.NumberFormatException -> Lb0
                if (r0 == 0) goto La8
                java.lang.CharSequence r0 = o.C8684dus.j(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lb0
                long r1 = r7.a     // Catch: java.lang.NumberFormatException -> Lb0
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L82
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> Lb0
                r2 = 0
                if (r1 <= 0) goto L4a
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = o.C8684dus.c(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> Lb0
                if (r1 == 0) goto L82
            L4a:
                long r0 = r7.a
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L81
                r7.b = r2
                o.dHf r0 = r7.d
                o.dHi r1 = o.C7838dHf.e(r0)
                o.dGn r1 = r1.c()
                o.C7838dHf.c(r0, r1)
                o.dHf r0 = r7.d
                o.dGr r0 = o.C7838dHf.b(r0)
                if (r0 != 0) goto L6a
                o.C8632dsu.e()
            L6a:
                o.dGg r0 = r0.l()
                o.dGm r1 = r7.c
                o.dHf r2 = r7.d
                o.dGn r2 = o.C7838dHf.f(r2)
                if (r2 != 0) goto L7b
                o.C8632dsu.e()
            L7b:
                o.C7833dHa.b(r0, r1, r2)
                r7.b()
            L81:
                return
            L82:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb0
                r2.<init>()     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r3 = "expected chunk size and optional extensions"
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r3 = " but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb0
                long r3 = r7.a     // Catch: java.lang.NumberFormatException -> Lb0
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb0
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> Lb0
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lb0
                throw r1     // Catch: java.lang.NumberFormatException -> Lb0
            La8:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch: java.lang.NumberFormatException -> Lb0
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lb0
                throw r0     // Catch: java.lang.NumberFormatException -> Lb0
            Lb0:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7838dHf.c.d():void");
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (c()) {
                return;
            }
            if (this.b && !dGB.c(this, 100, TimeUnit.MILLISECONDS)) {
                this.d.c().j();
                b();
            }
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dHf$i */
    /* loaded from: classes5.dex */
    public final class i extends d {
        private boolean c;

        public i() {
            super();
        }

        @Override // o.C7838dHf.d, o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!c()) {
                if (this.c) {
                    return -1L;
                }
                long b = super.b(c7872dIo, j);
                if (b == -1) {
                    this.c = true;
                    b();
                    return -1L;
                }
                return b;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (c()) {
                return;
            }
            if (!this.c) {
                b();
            }
            d(true);
        }
    }

    /* renamed from: o.dHf$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }
    }
}
