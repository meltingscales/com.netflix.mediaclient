package o;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: o.an  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2808an {
    public static final Handler b = c(Looper.getMainLooper(), false);
    public static final Handler c = c(Looper.getMainLooper(), true);
    private static Handler e;

    public static Handler a() {
        if (e == null) {
            e = c(d("epoxy"), true);
        }
        return e;
    }

    public static Handler c(Looper looper, boolean z) {
        Handler createAsync;
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                createAsync = Handler.createAsync(looper);
                return createAsync;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (Throwable unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static Looper d(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
