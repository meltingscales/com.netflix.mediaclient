package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class dGL {
    private static final Logger d;
    private final List<dGK> a;
    private final d b;
    private final List<dGK> f;
    private long g;
    private final Runnable h;
    private int i;
    private boolean j;
    public static final c c = new c(null);
    public static final dGL e = new dGL(new e(dGB.d(dGB.f + " TaskRunner", true)));

    /* loaded from: classes5.dex */
    public interface d {
        void b(dGL dgl, long j);

        void c(Runnable runnable);

        void c(dGL dgl);

        long e();
    }

    public final d a() {
        return this.b;
    }

    public dGL(d dVar) {
        C8632dsu.d(dVar, "");
        this.b = dVar;
        this.i = 10000;
        this.a = new ArrayList();
        this.f = new ArrayList();
        this.h = new a();
    }

    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dGH d;
            long j;
            while (true) {
                synchronized (dGL.this) {
                    d = dGL.this.d();
                }
                if (d == null) {
                    return;
                }
                dGK c = d.c();
                if (c == null) {
                    C8632dsu.e();
                }
                boolean isLoggable = dGL.c.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j = c.f().a().e();
                    dGG.b(d, c, "starting");
                } else {
                    j = -1;
                }
                try {
                    dGL.this.e(d);
                    dpR dpr = dpR.c;
                    if (isLoggable) {
                        long e = c.f().a().e();
                        dGG.b(d, c, "finished run in " + dGG.e(e - j));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long e2 = c.f().a().e();
                        dGG.b(d, c, "failed a run in " + dGG.e(e2 - j));
                    }
                    throw th;
                }
            }
        }
    }

    public final dGK b() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new dGK(this, sb.toString());
    }

    public final void e() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).b();
        }
        for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
            dGK dgk = this.f.get(size2);
            dgk.b();
            if (dgk.d().isEmpty()) {
                this.f.remove(size2);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements d {
        private final ThreadPoolExecutor a;

        public e(ThreadFactory threadFactory) {
            C8632dsu.d(threadFactory, "");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // o.dGL.d
        public long e() {
            return System.nanoTime();
        }

        @Override // o.dGL.d
        public void b(dGL dgl, long j) {
            C8632dsu.d(dgl, "");
            long j2 = j / 1000000;
            if (j2 > 0 || j > 0) {
                dgl.wait(j2, (int) (j - (1000000 * j2)));
            }
        }

        @Override // o.dGL.d
        public void c(Runnable runnable) {
            C8632dsu.d(runnable, "");
            this.a.execute(runnable);
        }

        @Override // o.dGL.d
        public void c(dGL dgl) {
            C8632dsu.d(dgl, "");
            dgl.notify();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final Logger a() {
            return dGL.d;
        }
    }

    static {
        Logger logger = Logger.getLogger(dGL.class.getName());
        C8632dsu.b(logger, "");
        d = logger;
    }

    public final void a(dGK dgk) {
        C8632dsu.d(dgk, "");
        if (!dGB.h || Thread.holdsLock(this)) {
            if (dgk.a() == null) {
                if (!dgk.d().isEmpty()) {
                    dGB.d(this.f, dgk);
                } else {
                    this.f.remove(dgk);
                }
            }
            if (this.j) {
                this.b.c(this);
                return;
            } else {
                this.b.c(this.h);
                return;
            }
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

    private final void d(dGH dgh) {
        if (!dGB.h || Thread.holdsLock(this)) {
            dgh.e(-1L);
            dGK c2 = dgh.c();
            if (c2 == null) {
                C8632dsu.e();
            }
            c2.d().remove(dgh);
            this.f.remove(c2);
            c2.c(dgh);
            this.a.add(c2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(dGH dgh) {
        if (dGB.h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        C8632dsu.b(currentThread2, "");
        String name = currentThread2.getName();
        currentThread2.setName(dgh.b());
        try {
            long d2 = dgh.d();
            synchronized (this) {
                e(dgh, d2);
                dpR dpr = dpR.c;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                e(dgh, -1L);
                dpR dpr2 = dpR.c;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    private final void e(dGH dgh, long j) {
        if (!dGB.h || Thread.holdsLock(this)) {
            dGK c2 = dgh.c();
            if (c2 == null) {
                C8632dsu.e();
            }
            if (c2.a() != dgh) {
                throw new IllegalStateException("Check failed.".toString());
            }
            boolean e2 = c2.e();
            c2.a(false);
            c2.c(null);
            this.a.remove(c2);
            if (j != -1 && !e2 && !c2.g()) {
                c2.e(dgh, j, true);
            }
            if (!c2.d().isEmpty()) {
                this.f.add(c2);
                return;
            }
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

    public final dGH d() {
        boolean z;
        if (!dGB.h || Thread.holdsLock(this)) {
            while (!this.f.isEmpty()) {
                long e2 = this.b.e();
                Iterator<dGK> it = this.f.iterator();
                long j = Long.MAX_VALUE;
                dGH dgh = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    dGH dgh2 = it.next().d().get(0);
                    long max = Math.max(0L, dgh2.a() - e2);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (dgh != null) {
                        z = true;
                        break;
                    } else {
                        dgh = dgh2;
                    }
                }
                if (dgh != null) {
                    d(dgh);
                    if (z || (!this.j && (!this.f.isEmpty()))) {
                        this.b.c(this.h);
                    }
                    return dgh;
                } else if (this.j) {
                    if (j < this.g - e2) {
                        this.b.c(this);
                    }
                    return null;
                } else {
                    this.j = true;
                    this.g = e2 + j;
                    try {
                        try {
                            this.b.b(this, j);
                        } catch (InterruptedException unused) {
                            e();
                        }
                    } finally {
                        this.j = false;
                    }
                }
            }
            return null;
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
