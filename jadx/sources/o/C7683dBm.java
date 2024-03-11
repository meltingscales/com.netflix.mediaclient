package o;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: o.dBm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7683dBm extends AbstractC8766dxt {
    private final int b;
    private CoroutineScheduler c;
    private final long e;
    private final String g;
    private final int h;

    public C7683dBm() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ C7683dBm(int i, int i2, long j, String str, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? C7687dBq.a : i, (i3 & 2) != 0 ? C7687dBq.b : i2, (i3 & 4) != 0 ? C7687dBq.d : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public C7683dBm(int i, int i2, long j, String str) {
        this.b = i;
        this.h = i2;
        this.e = j;
        this.g = str;
        this.c = a();
    }

    private final CoroutineScheduler a() {
        return new CoroutineScheduler(this.b, this.h, this.e, this.g);
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        CoroutineScheduler.e(this.c, runnable, null, false, 6, null);
    }

    @Override // o.dwQ
    public void dispatchYield(dqZ dqz, Runnable runnable) {
        CoroutineScheduler.e(this.c, runnable, null, true, 2, null);
    }

    public final void d(Runnable runnable, InterfaceC7688dBr interfaceC7688dBr, boolean z) {
        this.c.a(runnable, interfaceC7688dBr, z);
    }

    @Override // o.AbstractC8766dxt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }
}
