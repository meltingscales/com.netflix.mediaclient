package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.C8632dsu;
import o.dxD;

/* loaded from: classes5.dex */
public final class JobCancellationException extends CancellationException {
    public final transient dxD d;

    public JobCancellationException(String str, Throwable th, dxD dxd) {
        super(str);
        this.d = dxd;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.d;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!C8632dsu.c((Object) jobCancellationException.getMessage(), (Object) getMessage()) || !C8632dsu.c(jobCancellationException.d, this.d) || !C8632dsu.c(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String message = getMessage();
        C8632dsu.d((Object) message);
        int hashCode = message.hashCode();
        int hashCode2 = this.d.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
