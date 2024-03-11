package o;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import o.C7824dGs;
import o.C7826dGu;
import o.C7842dHj;
import o.C7866dIg;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes5.dex */
public final class dGQ extends C7842dHj.d implements InterfaceC7811dGf {
    public static final a b = new a(null);
    private int c;
    private final List<Reference<dGS>> e;
    private final dGR f;
    private C7821dGp g;
    private long h;
    private boolean i;
    private C7842dHj j;
    private boolean k;
    private final C7828dGw l;
    private Socket m;
    private Protocol n;

    /* renamed from: o  reason: collision with root package name */
    private int f13799o;
    private Socket p;
    private dIq q;
    private int r;
    private InterfaceC7871dIn s;
    private int t;

    public final int a() {
        return this.t;
    }

    public final void a(int i) {
        this.r = i;
    }

    public final List<Reference<dGS>> b() {
        return this.e;
    }

    public final boolean c() {
        return this.k;
    }

    public final long d() {
        return this.h;
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public final void e(long j) {
        this.h = j;
    }

    public final boolean f() {
        return this.j != null;
    }

    public C7821dGp g() {
        return this.g;
    }

    public final int h() {
        return this.r;
    }

    public C7828dGw m() {
        return this.l;
    }

    public dGQ(dGR dgr, C7828dGw c7828dGw) {
        C8632dsu.d(dgr, "");
        C8632dsu.d(c7828dGw, "");
        this.f = dgr;
        this.l = c7828dGw;
        this.c = 1;
        this.e = new ArrayList();
        this.h = Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: IOException -> 0x00f7, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f7, blocks: (B:18:0x0092, B:20:0x009a), top: B:62:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[EDGE_INSN: B:70:0x0146->B:57:0x0146 ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r17, int r18, int r19, int r20, boolean r21, o.dFY r22, o.AbstractC7820dGo r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGQ.b(int, int, int, int, boolean, o.dFY, o.dGo):void");
    }

    private final void a(int i, int i2, int i3, dFY dfy, AbstractC7820dGo abstractC7820dGo) {
        C7826dGu k = k();
        C7818dGm j = k.j();
        for (int i4 = 0; i4 < 21; i4++) {
            a(i, i2, dfy, abstractC7820dGo);
            k = c(i2, i3, k, j);
            if (k == null) {
                return;
            }
            Socket socket = this.m;
            if (socket != null) {
                dGB.d(socket);
            }
            this.m = null;
            this.q = null;
            this.s = null;
            abstractC7820dGo.b(dfy, this.l.e(), this.l.a(), null);
        }
    }

    private final void a(int i, int i2, dFY dfy, AbstractC7820dGo abstractC7820dGo) {
        Socket socket;
        int i3;
        Proxy a2 = this.l.a();
        dFT c = this.l.c();
        Proxy.Type type = a2.type();
        if (type != null && ((i3 = dGP.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = c.j().createSocket();
            if (socket == null) {
                C8632dsu.e();
            }
        } else {
            socket = new Socket(a2);
        }
        this.m = socket;
        abstractC7820dGo.c(dfy, this.l.e(), a2);
        socket.setSoTimeout(i2);
        try {
            dHG.i.b().a(socket, this.l.e(), i);
            try {
                this.s = dIw.e(dIw.c(socket));
                this.q = dIw.b(dIw.a(socket));
            } catch (NullPointerException e) {
                if (C8632dsu.c((Object) e.getMessage(), (Object) "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.l.e());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void c(dGN dgn, int i, dFY dfy, AbstractC7820dGo abstractC7820dGo) {
        if (this.l.c().h() == null) {
            List<Protocol> b2 = this.l.c().b();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (b2.contains(protocol)) {
                this.p = this.m;
                this.n = protocol;
                c(i);
                return;
            }
            this.p = this.m;
            this.n = Protocol.HTTP_1_1;
            return;
        }
        abstractC7820dGo.j(dfy);
        b(dgn);
        abstractC7820dGo.c(dfy, this.g);
        if (this.n == Protocol.HTTP_2) {
            c(i);
        }
    }

    private final void c(int i) {
        Socket socket = this.p;
        if (socket == null) {
            C8632dsu.e();
        }
        InterfaceC7871dIn interfaceC7871dIn = this.s;
        if (interfaceC7871dIn == null) {
            C8632dsu.e();
        }
        dIq diq = this.q;
        if (diq == null) {
            C8632dsu.e();
        }
        socket.setSoTimeout(0);
        C7842dHj c = new C7842dHj.b(true, dGL.e).a(socket, this.l.c().l().f(), interfaceC7871dIn, diq).e(this).e(i).c();
        this.j = c;
        this.c = C7842dHj.b.c().c();
        C7842dHj.a(c, false, null, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(o.dGN r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGQ.b(o.dGN):void");
    }

    private final C7826dGu c(int i, int i2, C7826dGu c7826dGu, C7818dGm c7818dGm) {
        boolean a2;
        String str = "CONNECT " + dGB.d(c7818dGm, true) + " HTTP/1.1";
        while (true) {
            InterfaceC7871dIn interfaceC7871dIn = this.s;
            if (interfaceC7871dIn == null) {
                C8632dsu.e();
            }
            dIq diq = this.q;
            if (diq == null) {
                C8632dsu.e();
            }
            C7838dHf c7838dHf = new C7838dHf(null, this, interfaceC7871dIn, diq);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC7871dIn.e().a(i, timeUnit);
            diq.e().a(i2, timeUnit);
            c7838dHf.e(c7826dGu.c(), str);
            c7838dHf.e();
            C7824dGs.b e = c7838dHf.e(false);
            if (e == null) {
                C8632dsu.e();
            }
            C7824dGs a3 = e.e(c7826dGu).a();
            c7838dHf.e(a3);
            int c = a3.c();
            if (c == 200) {
                if (interfaceC7871dIn.o().m() && diq.o().m()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (c == 407) {
                C7826dGu d = this.l.c().f().d(this.l, a3);
                if (d == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                a2 = C8691duz.a("close", C7824dGs.c(a3, "Connection", null, 2, null), true);
                if (a2) {
                    return d;
                }
                c7826dGu = d;
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a3.c());
            }
        }
    }

    private final C7826dGu k() {
        C7826dGu a2 = new C7826dGu.b().a(this.l.c().l()).e("CONNECT", (AbstractC7825dGt) null).a("Host", dGB.d(this.l.c().l(), true)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", "okhttp/4.7.2").a();
        C7826dGu d = this.l.c().f().d(this.l, new C7824dGs.b().e(a2).c(Protocol.HTTP_1_1).c(407).a("Preemptive Authenticate").e(dGB.a).c(-1L).e(-1L).d("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return d != null ? d : a2;
    }

    public final boolean a(dFT dft, List<C7828dGw> list) {
        C8632dsu.d(dft, "");
        if (this.e.size() >= this.c || this.k || !this.l.c().e(dft)) {
            return false;
        }
        if (C8632dsu.c((Object) dft.l().f(), (Object) m().c().l().f())) {
            return true;
        }
        if (this.j != null && list != null && a(list) && dft.d() == dHY.c && a(dft.l())) {
            try {
                dFX c = dft.c();
                if (c == null) {
                    C8632dsu.e();
                }
                String f = dft.l().f();
                C7821dGp g = g();
                if (g == null) {
                    C8632dsu.e();
                }
                c.b(f, g.a());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean a(C7818dGm c7818dGm) {
        C7821dGp c7821dGp;
        C8632dsu.d(c7818dGm, "");
        C7818dGm l = this.l.c().l();
        if (c7818dGm.n() != l.n()) {
            return false;
        }
        if (C8632dsu.c((Object) c7818dGm.f(), (Object) l.f())) {
            return true;
        }
        if (this.i || (c7821dGp = this.g) == null) {
            return false;
        }
        if (c7821dGp == null) {
            C8632dsu.e();
        }
        return c(c7818dGm, c7821dGp);
    }

    private final boolean c(C7818dGm c7818dGm, C7821dGp c7821dGp) {
        List<Certificate> a2 = c7821dGp.a();
        if (!a2.isEmpty()) {
            dHY dhy = dHY.c;
            String f = c7818dGm.f();
            Certificate certificate = a2.get(0);
            if (certificate != null) {
                if (dhy.d(f, (X509Certificate) certificate)) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return false;
    }

    public final dGZ b(C7823dGr c7823dGr, C7834dHb c7834dHb) {
        C8632dsu.d(c7823dGr, "");
        C8632dsu.d(c7834dHb, "");
        Socket socket = this.p;
        if (socket == null) {
            C8632dsu.e();
        }
        InterfaceC7871dIn interfaceC7871dIn = this.s;
        if (interfaceC7871dIn == null) {
            C8632dsu.e();
        }
        dIq diq = this.q;
        if (diq == null) {
            C8632dsu.e();
        }
        C7842dHj c7842dHj = this.j;
        if (c7842dHj != null) {
            return new C7844dHl(c7823dGr, this, c7834dHb, c7842dHj);
        }
        socket.setSoTimeout(c7834dHb.j());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        interfaceC7871dIn.e().a(c7834dHb.i(), timeUnit);
        diq.e().a(c7834dHb.g(), timeUnit);
        return new C7838dHf(c7823dGr, this, interfaceC7871dIn, diq);
    }

    public final C7866dIg.b d(dGO dgo) {
        C8632dsu.d(dgo, "");
        Socket socket = this.p;
        if (socket == null) {
            C8632dsu.e();
        }
        InterfaceC7871dIn interfaceC7871dIn = this.s;
        if (interfaceC7871dIn == null) {
            C8632dsu.e();
        }
        dIq diq = this.q;
        if (diq == null) {
            C8632dsu.e();
        }
        socket.setSoTimeout(0);
        j();
        return new b(dgo, interfaceC7871dIn, diq, true, interfaceC7871dIn, diq);
    }

    /* loaded from: classes5.dex */
    public static final class b extends C7866dIg.b {
        final /* synthetic */ dIq a;
        final /* synthetic */ dGO c;
        final /* synthetic */ InterfaceC7871dIn d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dGO dgo, InterfaceC7871dIn interfaceC7871dIn, dIq diq, boolean z, InterfaceC7871dIn interfaceC7871dIn2, dIq diq2) {
            super(z, interfaceC7871dIn2, diq2);
            this.c = dgo;
            this.d = interfaceC7871dIn;
            this.a = diq;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c.b(-1L, true, true, null);
        }
    }

    public final void e() {
        Socket socket = this.m;
        if (socket != null) {
            dGB.d(socket);
        }
    }

    public Socket l() {
        Socket socket = this.p;
        if (socket == null) {
            C8632dsu.e();
        }
        return socket;
    }

    public final boolean e(boolean z) {
        long nanoTime = System.nanoTime();
        Socket socket = this.m;
        if (socket == null) {
            C8632dsu.e();
        }
        Socket socket2 = this.p;
        if (socket2 == null) {
            C8632dsu.e();
        }
        InterfaceC7871dIn interfaceC7871dIn = this.s;
        if (interfaceC7871dIn == null) {
            C8632dsu.e();
        }
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C7842dHj c7842dHj = this.j;
        if (c7842dHj != null) {
            return c7842dHj.a(nanoTime);
        }
        if (nanoTime - this.h < 10000000000L || !z) {
            return true;
        }
        return dGB.c(socket2, interfaceC7871dIn);
    }

    @Override // o.C7842dHj.d
    public void d(C7848dHp c7848dHp) {
        C8632dsu.d(c7848dHp, "");
        c7848dHp.c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    @Override // o.C7842dHj.d
    public void a(C7842dHj c7842dHj, C7852dHt c7852dHt) {
        C8632dsu.d(c7842dHj, "");
        C8632dsu.d(c7852dHt, "");
        synchronized (this.f) {
            this.c = c7852dHt.c();
            dpR dpr = dpR.c;
        }
    }

    public final void b(C7823dGr c7823dGr, C7828dGw c7828dGw, IOException iOException) {
        C8632dsu.d(c7823dGr, "");
        C8632dsu.d(c7828dGw, "");
        C8632dsu.d(iOException, "");
        if (c7828dGw.a().type() != Proxy.Type.DIRECT) {
            dFT c = c7828dGw.c();
            c.i().connectFailed(c.l().k(), c7828dGw.a().address(), iOException);
        }
        c7823dGr.s().b(c7828dGw);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.l.c().l().f());
        sb.append(':');
        sb.append(this.l.c().l().n());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.l.a());
        sb.append(" hostAddress=");
        sb.append(this.l.e());
        sb.append(" cipherSuite=");
        C7821dGp c7821dGp = this.g;
        sb.append((c7821dGp == null || (r1 = c7821dGp.c()) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }
    }

    public final void j() {
        dGR dgr = this.f;
        if (!dGB.h || !Thread.holdsLock(dgr)) {
            synchronized (this.f) {
                this.k = true;
                dpR dpr = dpR.c;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(dgr);
        throw new AssertionError(sb.toString());
    }

    public final void i() {
        dGR dgr = this.f;
        if (!dGB.h || !Thread.holdsLock(dgr)) {
            synchronized (this.f) {
                this.i = true;
                dpR dpr = dpR.c;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(dgr);
        throw new AssertionError(sb.toString());
    }

    private final boolean a(List<C7828dGw> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C7828dGw c7828dGw : list) {
                Proxy.Type type = c7828dGw.a().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.l.a().type() == type2 && C8632dsu.c(this.l.e(), c7828dGw.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(dGS dgs, IOException iOException) {
        C8632dsu.d(dgs, "");
        dGR dgr = this.f;
        if (!dGB.h || !Thread.holdsLock(dgr)) {
            synchronized (this.f) {
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).a == ErrorCode.REFUSED_STREAM) {
                        int i = this.f13799o + 1;
                        this.f13799o = i;
                        if (i > 1) {
                            this.k = true;
                            this.t++;
                        }
                    } else if (((StreamResetException) iOException).a != ErrorCode.CANCEL || !dgs.l()) {
                        this.k = true;
                        this.t++;
                    }
                } else if (!f() || (iOException instanceof ConnectionShutdownException)) {
                    this.k = true;
                    if (this.r == 0) {
                        if (iOException != null) {
                            b(dgs.a(), this.l, iOException);
                        }
                        this.t++;
                    }
                }
                dpR dpr = dpR.c;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(dgr);
        throw new AssertionError(sb.toString());
    }
}
