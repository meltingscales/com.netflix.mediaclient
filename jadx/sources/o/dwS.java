package o;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class dwS {
    public static final void a(dqZ dqz, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) dqz.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(dqz, th);
            } else {
                C7652dAi.c(dqz, th);
            }
        } catch (Throwable th2) {
            C7652dAi.c(dqz, c(th, th2));
        }
    }

    public static final Throwable c(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C8553dpw.c(runtimeException, th);
        return runtimeException;
    }
}
