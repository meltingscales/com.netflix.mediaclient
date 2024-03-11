package o;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: o.kp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9187kp {
    private static final Object b = new Object();
    @SuppressLint({"StaticFieldLeak"})
    static C9191kt e;

    public static C9191kt a(Context context, C9196ky c9196ky) {
        synchronized (b) {
            if (e == null) {
                e = new C9191kt(context, c9196ky);
            } else {
                b();
            }
        }
        return e;
    }

    private static void b() {
        a().m.d("Multiple Bugsnag.start calls detected. Ignoring.");
    }

    public static void a(InterfaceC9218lT interfaceC9218lT) {
        a().d(interfaceC9218lT);
    }

    public static void a(Throwable th, InterfaceC9218lT interfaceC9218lT) {
        a().a(th, interfaceC9218lT);
    }

    public static void b(String str, String str2, Object obj) {
        a().c(str, str2, obj);
    }

    public static void c(String str) {
        a().e(str);
    }

    public static void d(String str, String str2) {
        a().d(str, str2);
    }

    public static void d() {
        a().b();
    }

    public static C9191kt a() {
        if (e == null) {
            synchronized (b) {
                if (e == null) {
                    throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                }
            }
        }
        return e;
    }
}
