package kotlinx.coroutines.internal;

import o.dqZ;

/* loaded from: classes5.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    private final transient dqZ d;

    public DiagnosticCoroutineContextException(dqZ dqz) {
        this.d = dqz;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.d.toString();
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
