package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: o.dxu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8767dxu {
    public static final AbstractC8766dxt d(ExecutorService executorService) {
        return new C8770dxx(executorService);
    }

    public static final dwQ e(Executor executor) {
        dwQ dwq;
        ExecutorC8753dxg executorC8753dxg = executor instanceof ExecutorC8753dxg ? (ExecutorC8753dxg) executor : null;
        return (executorC8753dxg == null || (dwq = executorC8753dxg.b) == null) ? new C8770dxx(executor) : dwq;
    }
}
