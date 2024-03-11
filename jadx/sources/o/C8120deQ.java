package o;

import android.app.ActivityManager;
import android.content.Context;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.deQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8120deQ {
    public static String a;
    private static String b;
    public static AtomicLong c = new AtomicLong(-1);
    public static AtomicInteger d = new AtomicInteger(-1);
    public static DeviceCategory e;

    public static String c() {
        return a;
    }

    public static void e(String str, Context context) {
    }

    public static long d(Context context) {
        if (c.get() == -1) {
            c.set(e(context));
        }
        return c.get();
    }

    private static int d() {
        if (d.get() == -1) {
            d.set(C9343nm.c());
        }
        return d.get();
    }

    private static long e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static String c(Context context) {
        long d2 = d(context);
        int d3 = d();
        String str = b;
        if (str != null) {
            a = str;
        } else {
            a = (C8054ddD.o(context) || (d3 <= 4 && d2 <= 2147483648L) || d2 <= 1610612736) ? "LOW" : "HIGH";
        }
        return a;
    }

    public static boolean a() {
        return e();
    }

    public static void d(String str) {
        DeviceCategory deviceCategory = e;
        if (deviceCategory == null) {
            C1044Mm.a("LiteUtils", "setForcedDeviceCategory from: %s to: %s", deviceCategory, DeviceCategory.c(str));
            e = DeviceCategory.c(str);
        }
    }

    public static String b() {
        if (a()) {
            return "Lite";
        }
        return null;
    }

    public static boolean e() {
        return "LOW".equals(a);
    }
}
