package o;

import android.content.Context;

/* renamed from: o.dfN  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8170dfN {
    private static long c;
    private static long e;

    public static void a(long j) {
        c = j;
        e = System.currentTimeMillis();
        C8157dfA.e((Context) C1332Xp.b(Context.class), "netflix_server_time_ms", c);
        C8157dfA.e((Context) C1332Xp.b(Context.class), "netflix_device_time_ms", e);
    }

    public static long d() {
        long j;
        if (c == 0) {
            b();
        }
        long currentTimeMillis = System.currentTimeMillis() - e;
        if (currentTimeMillis >= 0) {
            j = c;
        } else {
            currentTimeMillis = System.currentTimeMillis() - AbstractApplicationC1040Mh.getInstance().g();
            j = c;
        }
        return j + currentTimeMillis;
    }

    private static void b() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractApplicationC1040Mh abstractApplicationC1040Mh = AbstractApplicationC1040Mh.getInstance();
        if (abstractApplicationC1040Mh != null) {
            c = C8157dfA.b(abstractApplicationC1040Mh, "netflix_server_time_ms", currentTimeMillis);
            e = C8157dfA.b(abstractApplicationC1040Mh, "netflix_device_time_ms", currentTimeMillis);
        }
    }

    public static boolean c(long j) {
        return Math.abs(System.currentTimeMillis() - d()) > j;
    }
}
