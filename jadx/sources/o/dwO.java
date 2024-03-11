package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public class dwO {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dwO.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public dwO(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ dwO(Throwable th, boolean z, int i, C8627dsp c8627dsp) {
        this(th, (i & 2) != 0 ? false : z);
    }

    public final boolean d() {
        return e.get(this) != 0;
    }

    public final boolean c() {
        return e.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return dwW.c(this) + '[' + this.a + ']';
    }
}
