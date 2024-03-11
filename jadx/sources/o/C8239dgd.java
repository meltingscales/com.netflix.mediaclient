package o;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.dgd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8239dgd {
    static final AtomicBoolean a = new AtomicBoolean(false);
    static long c;

    public static void e(long j) {
        c = j;
    }

    public static boolean b(long j) {
        C1044Mm.e("WidevineMonitor", "isWidevinePluginBlocked: starts");
        if (a.get()) {
            C1044Mm.e("WidevineMonitor", "isWidevinePluginBlocked: not initialized");
            return false;
        } else if (c >= j) {
            C1044Mm.a("WidevineMonitor", "isWidevinePluginBlocked: WIDEVINE.initializationTimeInMs >= %d", Long.valueOf(j));
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(boolean z) {
        a.set(true);
        c = SystemClock.elapsedRealtime() - c;
        return z;
    }
}
