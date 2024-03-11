package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class dIK {
    public static final e b = new e(null);
    public static final dIK c = new b();
    private boolean a;
    private long d;
    private long e;

    public dIK cC_() {
        this.a = false;
        return this;
    }

    public dIK cD_() {
        this.d = 0L;
        return this;
    }

    public boolean cF_() {
        return this.a;
    }

    public dIK e(long j) {
        this.a = true;
        this.e = j;
        return this;
    }

    public long i() {
        return this.d;
    }

    public dIK a(long j, TimeUnit timeUnit) {
        C8632dsu.c((Object) timeUnit, "");
        if (j < 0) {
            throw new IllegalArgumentException(("timeout < 0: " + j).toString());
        }
        this.d = timeUnit.toNanos(j);
        return this;
    }

    public long cE_() {
        if (this.a) {
            return this.e;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public void h() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.e - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends dIK {
        @Override // o.dIK
        public dIK a(long j, TimeUnit timeUnit) {
            C8632dsu.c((Object) timeUnit, "");
            return this;
        }

        @Override // o.dIK
        public dIK e(long j) {
            return this;
        }

        @Override // o.dIK
        public void h() {
        }

        b() {
        }
    }
}
