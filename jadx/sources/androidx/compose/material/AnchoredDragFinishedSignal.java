package androidx.compose.material;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
final class AnchoredDragFinishedSignal extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
