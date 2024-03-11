package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import java.util.concurrent.atomic.AtomicReference;
import o.dpR;

/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    private T mainThreadValue;
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMap_jvmKt.getEmptyThreadMap());
    private final Object writeMutex = new Object();

    public final T get() {
        return Thread.currentThread().getId() == ActualAndroid_androidKt.getMainThreadId() ? this.mainThreadValue : (T) this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(T t) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.getMainThreadId()) {
            this.mainThreadValue = t;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(id, t)) {
                return;
            }
            this.map.set(threadMap.newWith(id, t));
            dpR dpr = dpR.c;
        }
    }
}
