package o;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* renamed from: o.dAi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7652dAi {
    public static final void c(dqZ dqz, Throwable th) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : C7656dAm.b()) {
            try {
                coroutineExceptionHandler.handleException(dqz, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                C7656dAm.c(dwS.c(th, th2));
            }
        }
        try {
            C8553dpw.c(th, new DiagnosticCoroutineContextException(dqz));
        } catch (Throwable unused2) {
        }
        C7656dAm.c(th);
    }
}
