package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import o.dyQ;

/* loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {
    public final transient dyQ<?> c;

    public AbortFlowException(dyQ<?> dyq) {
        super("Flow was aborted, no more elements needed");
        this.c = dyq;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
