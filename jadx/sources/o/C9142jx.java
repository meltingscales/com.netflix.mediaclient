package o;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: o.jx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9142jx implements Closeable {
    private boolean b;
    private final AbstractC8766dxt e;

    public final dwQ e() {
        return this.e;
    }

    public C9142jx() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C8632dsu.a(newSingleThreadExecutor, "");
        this.e = C8767dxu.d(newSingleThreadExecutor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b) {
            return;
        }
        this.e.close();
        this.b = true;
    }
}
