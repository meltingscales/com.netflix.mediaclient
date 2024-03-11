package o;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.dGS;

/* loaded from: classes5.dex */
public final class dGR {
    public static final e d = new e(null);
    private final long a;
    private final c b;
    private final dGK c;
    private final ArrayDeque<dGQ> e;
    private final int f;

    public dGR(dGL dgl, int i, long j, TimeUnit timeUnit) {
        C8632dsu.d(dgl, "");
        C8632dsu.d(timeUnit, "");
        this.f = i;
        this.a = timeUnit.toNanos(j);
        this.c = dgl.b();
        this.b = new c(dGB.f + " ConnectionPool");
        this.e = new ArrayDeque<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    /* loaded from: classes5.dex */
    public static final class c extends dGH {
        c(String str) {
            super(str, false, 2, null);
        }

        @Override // o.dGH
        public long d() {
            return dGR.this.b(System.nanoTime());
        }
    }

    public final long b(long j) {
        synchronized (this) {
            Iterator<dGQ> it = this.e.iterator();
            int i = 0;
            dGQ dgq = null;
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            while (it.hasNext()) {
                dGQ next = it.next();
                C8632dsu.b(next, "");
                if (a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long d2 = j - next.d();
                    if (d2 > j2) {
                        dgq = next;
                        j2 = d2;
                    }
                }
            }
            long j3 = this.a;
            if (j2 < j3 && i <= this.f) {
                if (i > 0) {
                    return j3 - j2;
                }
                if (i2 > 0) {
                    return j3;
                }
                return -1L;
            }
            this.e.remove(dgq);
            if (this.e.isEmpty()) {
                this.c.c();
            }
            dpR dpr = dpR.c;
            if (dgq == null) {
                C8632dsu.e();
            }
            dGB.d(dgq.l());
            return 0L;
        }
    }

    private final int a(dGQ dgq, long j) {
        List<Reference<dGS>> b = dgq.b();
        int i = 0;
        while (i < b.size()) {
            Reference<dGS> reference = b.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                dHG.i.b().a("A connection to " + dgq.m().c().l() + " was leaked. Did you forget to close a response body?", ((dGS.a) reference).e());
                b.remove(i);
                dgq.d(true);
                if (b.isEmpty()) {
                    dgq.e(j - this.a);
                    return 0;
                }
            }
        }
        return b.size();
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }

    public final boolean b(dFT dft, dGS dgs, List<C7828dGw> list, boolean z) {
        C8632dsu.d(dft, "");
        C8632dsu.d(dgs, "");
        if (!dGB.h || Thread.holdsLock(this)) {
            Iterator<dGQ> it = this.e.iterator();
            while (it.hasNext()) {
                dGQ next = it.next();
                if (!z || next.f()) {
                    if (next.a(dft, list)) {
                        C8632dsu.b(next, "");
                        dgs.c(next);
                        return true;
                    }
                }
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void b(dGQ dgq) {
        C8632dsu.d(dgq, "");
        if (!dGB.h || Thread.holdsLock(this)) {
            this.e.add(dgq);
            dGK.b(this.c, this.b, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final boolean e(dGQ dgq) {
        C8632dsu.d(dgq, "");
        if (!dGB.h || Thread.holdsLock(this)) {
            if (dgq.c() || this.f == 0) {
                this.e.remove(dgq);
                if (this.e.isEmpty()) {
                    this.c.c();
                }
                return true;
            }
            dGK.b(this.c, this.b, 0L, 2, null);
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
