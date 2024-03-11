package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.model.leafs.originals.interactive.Audio;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.dIj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7869dIj extends dIK {
    private static final long a;
    public static final b d = new b(null);
    private static final long e;
    private static C7869dIj i;
    private boolean f;
    private long g;
    private C7869dIj j;

    /* JADX INFO: Access modifiers changed from: private */
    public final long a(long j) {
        return this.g - j;
    }

    protected void c() {
    }

    public final void j() {
        if (!(!this.f)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long i2 = i();
        boolean cF_ = cF_();
        if (i2 != 0 || cF_) {
            this.f = true;
            d.d(this, i2, cF_);
        }
    }

    public final boolean f() {
        if (this.f) {
            this.f = false;
            return d.d(this);
        }
        return false;
    }

    /* renamed from: o.dIj$e */
    /* loaded from: classes5.dex */
    public static final class e implements dIH {
        final /* synthetic */ dIH c;

        @Override // o.dIH
        /* renamed from: a */
        public C7869dIj e() {
            return C7869dIj.this;
        }

        e(dIH dih) {
            this.c = dih;
        }

        @Override // o.dIH
        public void a(C7872dIo c7872dIo, long j) {
            C8632dsu.c((Object) c7872dIo, "");
            C7868dIi.a(c7872dIo.D(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                dIE die = c7872dIo.c;
                C8632dsu.d(die);
                while (true) {
                    if (j2 >= ((long) AleCryptoBouncyCastle.MAX_RANDOM_BYTES)) {
                        break;
                    }
                    j2 += die.d - die.g;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        die = die.c;
                        C8632dsu.d(die);
                    }
                }
                C7869dIj c7869dIj = C7869dIj.this;
                c7869dIj.j();
                try {
                    this.c.a(c7872dIo, j2);
                    dpR dpr = dpR.c;
                    if (c7869dIj.f()) {
                        throw c7869dIj.d((IOException) null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!c7869dIj.f()) {
                        throw e;
                    }
                    throw c7869dIj.d(e);
                } finally {
                    c7869dIj.f();
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.c + ')';
        }

        @Override // o.dIH, java.io.Flushable
        public void flush() {
            C7869dIj c7869dIj = C7869dIj.this;
            c7869dIj.j();
            try {
                this.c.flush();
                dpR dpr = dpR.c;
                if (c7869dIj.f()) {
                    throw c7869dIj.d((IOException) null);
                }
            } catch (IOException e) {
                if (!c7869dIj.f()) {
                    throw e;
                }
                throw c7869dIj.d(e);
            } finally {
                c7869dIj.f();
            }
        }

        @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7869dIj c7869dIj = C7869dIj.this;
            c7869dIj.j();
            try {
                this.c.close();
                dpR dpr = dpR.c;
                if (c7869dIj.f()) {
                    throw c7869dIj.d((IOException) null);
                }
            } catch (IOException e) {
                if (!c7869dIj.f()) {
                    throw e;
                }
                throw c7869dIj.d(e);
            } finally {
                c7869dIj.f();
            }
        }
    }

    public final dIH d(dIH dih) {
        C8632dsu.c((Object) dih, "");
        return new e(dih);
    }

    /* renamed from: o.dIj$c */
    /* loaded from: classes5.dex */
    public static final class c implements dIJ {
        final /* synthetic */ dIJ b;

        @Override // o.dIJ
        /* renamed from: a */
        public C7869dIj e() {
            return C7869dIj.this;
        }

        c(dIJ dij) {
            this.b = dij;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.b + ')';
        }

        @Override // o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.c((Object) c7872dIo, "");
            C7869dIj c7869dIj = C7869dIj.this;
            c7869dIj.j();
            try {
                long b = this.b.b(c7872dIo, j);
                if (c7869dIj.f()) {
                    throw c7869dIj.d((IOException) null);
                }
                return b;
            } catch (IOException e) {
                if (c7869dIj.f()) {
                    throw c7869dIj.d(e);
                }
                throw e;
            } finally {
                c7869dIj.f();
            }
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7869dIj c7869dIj = C7869dIj.this;
            c7869dIj.j();
            try {
                this.b.close();
                dpR dpr = dpR.c;
                if (c7869dIj.f()) {
                    throw c7869dIj.d((IOException) null);
                }
            } catch (IOException e) {
                if (!c7869dIj.f()) {
                    throw e;
                }
                throw c7869dIj.d(e);
            } finally {
                c7869dIj.f();
            }
        }
    }

    public final dIJ c(dIJ dij) {
        C8632dsu.c((Object) dij, "");
        return new c(dij);
    }

    public final IOException d(IOException iOException) {
        return b(iOException);
    }

    protected IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(Audio.TYPE.timeout);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dIj$d */
    /* loaded from: classes5.dex */
    public static final class d extends Thread {
        public d() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C7869dIj c;
            while (true) {
                try {
                    synchronized (C7869dIj.class) {
                        c = C7869dIj.d.c();
                        if (c == C7869dIj.i) {
                            C7869dIj.i = null;
                            return;
                        }
                        dpR dpr = dpR.c;
                    }
                    if (c != null) {
                        c.c();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: o.dIj$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final C7869dIj c() {
            C7869dIj c7869dIj = C7869dIj.i;
            C8632dsu.d(c7869dIj);
            C7869dIj c7869dIj2 = c7869dIj.j;
            if (c7869dIj2 != null) {
                long a = c7869dIj2.a(System.nanoTime());
                if (a > 0) {
                    long j = a / 1000000;
                    C7869dIj.class.wait(j, (int) (a - (1000000 * j)));
                    return null;
                }
                C7869dIj c7869dIj3 = C7869dIj.i;
                C8632dsu.d(c7869dIj3);
                c7869dIj3.j = c7869dIj2.j;
                c7869dIj2.j = null;
                return c7869dIj2;
            }
            long nanoTime = System.nanoTime();
            C7869dIj.class.wait(C7869dIj.a);
            C7869dIj c7869dIj4 = C7869dIj.i;
            C8632dsu.d(c7869dIj4);
            if (c7869dIj4.j != null || System.nanoTime() - nanoTime < C7869dIj.e) {
                return null;
            }
            return C7869dIj.i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(C7869dIj c7869dIj, long j, boolean z) {
            synchronized (C7869dIj.class) {
                if (C7869dIj.i == null) {
                    C7869dIj.i = new C7869dIj();
                    new d().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i != 0 && z) {
                    c7869dIj.g = Math.min(j, c7869dIj.cE_() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    c7869dIj.g = j + nanoTime;
                } else if (z) {
                    c7869dIj.g = c7869dIj.cE_();
                } else {
                    throw new AssertionError();
                }
                long a = c7869dIj.a(nanoTime);
                C7869dIj c7869dIj2 = C7869dIj.i;
                C8632dsu.d(c7869dIj2);
                while (c7869dIj2.j != null) {
                    C7869dIj c7869dIj3 = c7869dIj2.j;
                    C8632dsu.d(c7869dIj3);
                    if (a < c7869dIj3.a(nanoTime)) {
                        break;
                    }
                    c7869dIj2 = c7869dIj2.j;
                    C8632dsu.d(c7869dIj2);
                }
                c7869dIj.j = c7869dIj2.j;
                c7869dIj2.j = c7869dIj;
                if (c7869dIj2 == C7869dIj.i) {
                    C7869dIj.class.notify();
                }
                dpR dpr = dpR.c;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C7869dIj c7869dIj) {
            synchronized (C7869dIj.class) {
                for (C7869dIj c7869dIj2 = C7869dIj.i; c7869dIj2 != null; c7869dIj2 = c7869dIj2.j) {
                    if (c7869dIj2.j == c7869dIj) {
                        c7869dIj2.j = c7869dIj.j;
                        c7869dIj.j = null;
                        return false;
                    }
                }
                return true;
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        a = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
