package o;

import java.io.IOException;
import o.dGX;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes5.dex */
public final class dGT {
    private dGQ a;
    private final dGS b;
    private final dFT c;
    private final dGR d;
    private int e;
    private dGX.b f;
    private int g;
    private C7828dGw h;
    private int i;
    private final AbstractC7820dGo j;

    /* renamed from: o  reason: collision with root package name */
    private dGX f13801o;

    public final dFT a() {
        return this.c;
    }

    public dGT(dGR dgr, dFT dft, dGS dgs, AbstractC7820dGo abstractC7820dGo) {
        C8632dsu.d(dgr, "");
        C8632dsu.d(dft, "");
        C8632dsu.d(dgs, "");
        C8632dsu.d(abstractC7820dGo, "");
        this.d = dgr;
        this.c = dft;
        this.b = dgs;
        this.j = abstractC7820dGo;
    }

    public final dGZ c(C7823dGr c7823dGr, C7834dHb c7834dHb) {
        C8632dsu.d(c7823dGr, "");
        C8632dsu.d(c7834dHb, "");
        try {
            return e(c7834dHb.a(), c7834dHb.i(), c7834dHb.g(), c7823dGr.w(), c7823dGr.z(), !C8632dsu.c((Object) c7834dHb.f().i(), (Object) "GET")).b(c7823dGr, c7834dHb);
        } catch (IOException e) {
            d(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            d(e2.c());
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        throw new java.io.IOException("exhausted all routes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.dGQ e(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r2 = this;
        L0:
            o.dGQ r0 = r2.e(r3, r4, r5, r6, r7)
            boolean r1 = r0.e(r8)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0.j()
            o.dGR r0 = r2.d
            monitor-enter(r0)
            o.dGw r1 = r2.h     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L16
            goto L34
        L16:
            o.dGX$b r1 = r2.f     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L34
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L21
            goto L34
        L21:
            o.dGX r1 = r2.f13801o     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L34
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L2c
            goto L34
        L2c:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "exhausted all routes"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L34:
            o.dpR r1 = o.dpR.c     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L0
        L38:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGT.e(int, int, int, int, boolean, boolean):o.dGQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
        if (r0.a() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, o.dGQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.dGQ e(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGT.e(int, int, int, int, boolean):o.dGQ");
    }

    public final boolean e() {
        synchronized (this.d) {
            if (this.g == 0 && this.e == 0 && this.i == 0) {
                return false;
            }
            if (this.h != null) {
                return true;
            }
            if (c()) {
                dGQ b = this.b.b();
                if (b == null) {
                    C8632dsu.e();
                }
                this.h = b.m();
                return true;
            }
            dGX.b bVar = this.f;
            if (bVar == null || !bVar.a()) {
                dGX dgx = this.f13801o;
                if (dgx != null) {
                    return dgx.d();
                }
                return true;
            }
            return true;
        }
    }

    private final boolean c() {
        dGQ b;
        return this.g <= 1 && this.e <= 1 && this.i <= 0 && (b = this.b.b()) != null && b.a() == 0 && dGB.b(b.m().c().l(), this.c.l());
    }

    public final boolean c(C7818dGm c7818dGm) {
        C8632dsu.d(c7818dGm, "");
        C7818dGm l = this.c.l();
        return c7818dGm.n() == l.n() && C8632dsu.c((Object) c7818dGm.f(), (Object) l.f());
    }

    public final dGQ d() {
        dGR dgr = this.d;
        if (!dGB.h || Thread.holdsLock(dgr)) {
            return this.a;
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

    public final void d(IOException iOException) {
        C8632dsu.d(iOException, "");
        dGR dgr = this.d;
        if (!dGB.h || !Thread.holdsLock(dgr)) {
            synchronized (this.d) {
                this.h = null;
                if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == ErrorCode.REFUSED_STREAM) {
                    this.g++;
                } else if (iOException instanceof ConnectionShutdownException) {
                    this.e++;
                } else {
                    this.i++;
                }
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
