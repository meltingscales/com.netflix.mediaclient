package androidx.lifecycle;

import java.io.Closeable;
import o.C8632dsu;
import o.dqZ;
import o.dwU;
import o.dxK;

/* loaded from: classes2.dex */
public final class CloseableCoroutineScope implements Closeable, dwU {
    private final dqZ coroutineContext;

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.coroutineContext;
    }

    public CloseableCoroutineScope(dqZ dqz) {
        C8632dsu.c((Object) dqz, "");
        this.coroutineContext = dqz;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dxK.b(getCoroutineContext(), null, 1, null);
    }
}
