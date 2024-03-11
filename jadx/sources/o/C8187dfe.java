package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import o.C8187dfe;
import o.C8632dsu;

/* renamed from: o.dfe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8187dfe {
    private static final InterfaceC8554dpx b;
    public static final C8187dfe e = new C8187dfe();
    private static final Handler a = new Handler(Looper.getMainLooper());

    public final Handler a() {
        return a;
    }

    private C8187dfe() {
    }

    static {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<Handler>() { // from class: com.netflix.mediaclient.util.MainHandler$handlerAsync$2
            @Override // o.drO
            /* renamed from: c */
            public final Handler invoke() {
                Handler a2;
                if (Build.VERSION.SDK_INT >= 28) {
                    a2 = Handler.createAsync(Looper.getMainLooper());
                } else {
                    a2 = C8187dfe.e.a();
                }
                C8632dsu.d(a2);
                return a2;
            }
        });
        b = b2;
    }

    private final Handler d() {
        return (Handler) b.getValue();
    }

    public static final boolean c(Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        return a.post(runnable);
    }

    public static final boolean b(Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        return e.d().post(runnable);
    }

    public static final boolean a(Runnable runnable, long j) {
        C8632dsu.c((Object) runnable, "");
        return a.postDelayed(runnable, j);
    }

    public static final void e(Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        a.removeCallbacks(runnable);
    }
}
