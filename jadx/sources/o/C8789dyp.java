package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;

/* renamed from: o.dyp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8789dyp {
    public static final AbstractC8788dyo c;
    private static volatile Choreographer choreographer;

    public static final AbstractC8788dyo d(Handler handler, String str) {
        return new C8781dyh(handler, str);
    }

    public static final Handler b(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                C8632dsu.d(invoke);
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    static {
        Object e;
        try {
            Result.c cVar = Result.e;
            e = Result.e(new C8781dyh(b(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        c = Result.a(e) ? null : e;
    }
}
