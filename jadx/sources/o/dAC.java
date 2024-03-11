package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.dAC;

/* loaded from: classes5.dex */
public abstract class dAC<S extends dAC<S>> extends AbstractC7647dAd<S> implements dxW {
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(dAC.class, "cleanedAndPointers");
    public final long b;
    private volatile int cleanedAndPointers;

    public abstract int d();

    public abstract void e(int i, Throwable th, dqZ dqz);

    public dAC(long j, S s, int i) {
        super(s);
        this.b = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // o.AbstractC7647dAd
    public boolean g() {
        return c.get(this) == d() && !j();
    }

    public final boolean f() {
        return c.addAndGet(this, -65536) == d() && !j();
    }

    public final void k() {
        if (c.incrementAndGet(this) == d()) {
            h();
        }
    }

    public final boolean l() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == d() && !j()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, AleCryptoBouncyCastle.MAX_RANDOM_BYTES + i));
        return true;
    }
}
