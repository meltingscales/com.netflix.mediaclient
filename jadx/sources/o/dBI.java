package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dBI {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(InterfaceC8743dwx<? super T> interfaceC8743dwx, T t) {
        dwQ dwq = (dwQ) interfaceC8743dwx.getContext().get(dwQ.Key);
        if (dwq != null) {
            interfaceC8743dwx.e(dwq, t);
            return;
        }
        Result.c cVar = Result.e;
        interfaceC8743dwx.resumeWith(Result.e(t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC8743dwx<?> interfaceC8743dwx, Throwable th) {
        dwQ dwq = (dwQ) interfaceC8743dwx.getContext().get(dwQ.Key);
        if (dwq != null) {
            interfaceC8743dwx.c(dwq, th);
            return;
        }
        Result.c cVar = Result.e;
        interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(th)));
    }
}
