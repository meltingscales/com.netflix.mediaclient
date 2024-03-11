package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.dqT;
import o.dqZ;

/* loaded from: classes6.dex */
public final class AndroidExceptionPreHandler extends dqT implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.Key);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method preHandler() {
        /*
            r3 = this;
            java.lang.Object r0 = r3._preHandler
            if (r0 == r3) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L27
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L27
            int r1 = r0.getModifiers()     // Catch: java.lang.Throwable -> L27
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L27
            int r1 = r0.getModifiers()     // Catch: java.lang.Throwable -> L27
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            r3._preHandler = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.android.AndroidExceptionPreHandler.preHandler():java.lang.reflect.Method");
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(dqZ dqz, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Method preHandler = preHandler();
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
