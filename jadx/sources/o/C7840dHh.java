package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.text.Regex;
import o.C7826dGu;

/* renamed from: o.dHh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7840dHh implements InterfaceC7817dGl {
    public static final e d = new e(null);
    private final C7823dGr a;

    public C7840dHh(C7823dGr c7823dGr) {
        C8632dsu.d(c7823dGr, "");
        this.a = c7823dGr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r5 = r0;
        r0 = r1.f();
        r8 = c(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r0.j() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        r1.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        r0 = r8.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r0.e() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        r1.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        o.dGB.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r6 > 20) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r0.k().c(r5.k().e((o.AbstractC7829dGx) null).a()).a();
     */
    @Override // o.InterfaceC7817dGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C7824dGs a(o.InterfaceC7817dGl.e r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            o.C8632dsu.d(r11, r0)
            o.dHb r11 = (o.C7834dHb) r11
            o.dGu r0 = r11.f()
            o.dGS r1 = r11.d()
            java.util.List r2 = o.C8570dqm.c()
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        L17:
            r7 = 1
            r8 = r7
        L19:
            r1.c(r0, r8)
            boolean r8 = r1.l()     // Catch: java.lang.Throwable -> Ld2
            if (r8 != 0) goto Lca
            o.dGs r0 = r11.e(r0)     // Catch: java.io.IOException -> L94 okhttp3.internal.connection.RouteException -> La8 java.lang.Throwable -> Ld2
            if (r5 == 0) goto L40
            o.dGs$b r0 = r0.k()     // Catch: java.lang.Throwable -> Ld2
            o.dGs$b r5 = r5.k()     // Catch: java.lang.Throwable -> Ld2
            o.dGs$b r5 = r5.e(r4)     // Catch: java.lang.Throwable -> Ld2
            o.dGs r5 = r5.a()     // Catch: java.lang.Throwable -> Ld2
            o.dGs$b r0 = r0.c(r5)     // Catch: java.lang.Throwable -> Ld2
            o.dGs r0 = r0.a()     // Catch: java.lang.Throwable -> Ld2
        L40:
            r5 = r0
            o.dGO r0 = r1.f()     // Catch: java.lang.Throwable -> Ld2
            o.dGu r8 = r10.c(r5, r0)     // Catch: java.lang.Throwable -> Ld2
            if (r8 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.j()     // Catch: java.lang.Throwable -> Ld2
            if (r11 == 0) goto L56
            r1.m()     // Catch: java.lang.Throwable -> Ld2
        L56:
            r1.e(r3)
            return r5
        L5a:
            o.dGt r0 = r8.b()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L6a
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L6a
            r1.e(r3)
            return r5
        L6a:
            o.dGx r0 = r5.e()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L73
            o.dGB.e(r0)     // Catch: java.lang.Throwable -> Ld2
        L73:
            int r6 = r6 + r7
            r0 = 20
            if (r6 > r0) goto L7d
            r1.e(r7)
            r0 = r8
            goto L17
        L7d:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r0.<init>()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld2
            r0.append(r6)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld2
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld2
            throw r11     // Catch: java.lang.Throwable -> Ld2
        L94:
            r8 = move-exception
            boolean r9 = r8 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Ld2
            r9 = r9 ^ r7
            boolean r9 = r10.c(r8, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld2
            if (r9 == 0) goto La3
            java.util.List r2 = o.C8570dqm.c(r2, r8)     // Catch: java.lang.Throwable -> Ld2
            goto Lbb
        La3:
            java.lang.Throwable r11 = o.dGB.d(r8, r2)     // Catch: java.lang.Throwable -> Ld2
            throw r11     // Catch: java.lang.Throwable -> Ld2
        La8:
            r8 = move-exception
            java.io.IOException r9 = r8.c()     // Catch: java.lang.Throwable -> Ld2
            boolean r9 = r10.c(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld2
            if (r9 == 0) goto Lc1
            java.io.IOException r8 = r8.d()     // Catch: java.lang.Throwable -> Ld2
            java.util.List r2 = o.C8570dqm.c(r2, r8)     // Catch: java.lang.Throwable -> Ld2
        Lbb:
            r1.e(r7)
            r8 = r3
            goto L19
        Lc1:
            java.io.IOException r11 = r8.d()     // Catch: java.lang.Throwable -> Ld2
            java.lang.Throwable r11 = o.dGB.d(r11, r2)     // Catch: java.lang.Throwable -> Ld2
            throw r11     // Catch: java.lang.Throwable -> Ld2
        Lca:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld2
            throw r11     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r11 = move-exception
            r1.e(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7840dHh.a(o.dGl$e):o.dGs");
    }

    private final boolean c(IOException iOException, dGS dgs, C7826dGu c7826dGu, boolean z) {
        if (this.a.z()) {
            return !(z && a(iOException, c7826dGu)) && b(iOException, z) && dgs.o();
        }
        return false;
    }

    private final boolean a(IOException iOException, C7826dGu c7826dGu) {
        AbstractC7825dGt b = c7826dGu.b();
        return (b != null && b.e()) || (iOException instanceof FileNotFoundException);
    }

    private final boolean b(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final C7826dGu c(C7824dGs c7824dGs, dGO dgo) {
        dGQ g;
        C7828dGw m = (dgo == null || (g = dgo.g()) == null) ? null : g.m();
        int c = c7824dGs.c();
        String i = c7824dGs.n().i();
        if (c != 307 && c != 308) {
            if (c != 401) {
                if (c == 421) {
                    AbstractC7825dGt b = c7824dGs.n().b();
                    if ((b == null || !b.e()) && dgo != null && dgo.f()) {
                        dgo.g().i();
                        return c7824dGs.n();
                    }
                    return null;
                } else if (c == 503) {
                    C7824dGs l = c7824dGs.l();
                    if ((l == null || l.c() != 503) && d(c7824dGs, Integer.MAX_VALUE) == 0) {
                        return c7824dGs.n();
                    }
                    return null;
                } else if (c == 407) {
                    if (m == null) {
                        C8632dsu.e();
                    }
                    if (m.a().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return this.a.A().d(m, c7824dGs);
                } else if (c == 408) {
                    if (this.a.z()) {
                        AbstractC7825dGt b2 = c7824dGs.n().b();
                        if (b2 == null || !b2.e()) {
                            C7824dGs l2 = c7824dGs.l();
                            if ((l2 == null || l2.c() != 408) && d(c7824dGs, 0) <= 0) {
                                return c7824dGs.n();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (c) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.a.c().d(m, c7824dGs);
            }
        }
        return a(c7824dGs, i);
    }

    private final C7826dGu a(C7824dGs c7824dGs, String str) {
        String c;
        C7818dGm d2;
        if (!this.a.n() || (c = C7824dGs.c(c7824dGs, "Location", null, 2, null)) == null || (d2 = c7824dGs.n().j().d(c)) == null) {
            return null;
        }
        if (C8632dsu.c((Object) d2.l(), (Object) c7824dGs.n().j().l()) || this.a.r()) {
            C7826dGu.b g = c7824dGs.n().g();
            if (C7835dHc.c(str)) {
                int c2 = c7824dGs.c();
                C7835dHc c7835dHc = C7835dHc.a;
                boolean z = c7835dHc.e(str) || c2 == 308 || c2 == 307;
                if (c7835dHc.a(str) && c2 != 308 && c2 != 307) {
                    g.e("GET", (AbstractC7825dGt) null);
                } else {
                    g.e(str, z ? c7824dGs.n().b() : null);
                }
                if (!z) {
                    g.b("Transfer-Encoding");
                    g.b("Content-Length");
                    g.b("Content-Type");
                }
            }
            if (!dGB.b(c7824dGs.n().j(), d2)) {
                g.b("Authorization");
            }
            return g.a(d2).a();
        }
        return null;
    }

    private final int d(C7824dGs c7824dGs, int i) {
        String c = C7824dGs.c(c7824dGs, "Retry-After", null, 2, null);
        if (c != null) {
            if (new Regex("\\d+").e(c)) {
                Integer valueOf = Integer.valueOf(c);
                C8632dsu.b(valueOf, "");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    /* renamed from: o.dHh$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }
}
