package o;

import java.util.Random;

/* renamed from: o.deX  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8127deX {
    private static Long d;
    private static Long e;

    public static Long b() {
        synchronized (C8127deX.class) {
            Long l = e;
            if (l != null) {
                return l;
            }
            Long valueOf = Long.valueOf(g());
            e = valueOf;
            C1044Mm.a("nf_logids", "creating appId: %s", valueOf);
            return e;
        }
    }

    public static String d() {
        return a().toString();
    }

    public static Long a() {
        synchronized (C8127deX.class) {
            Long l = d;
            if (l != null) {
                return l;
            }
            Long valueOf = Long.valueOf(g());
            d = valueOf;
            C1044Mm.a("nf_logids", "creating sessionId %s", valueOf);
            return d;
        }
    }

    private static long g() {
        Random random = new Random();
        long d2 = C8170dfN.d();
        return Math.abs((d2 << 32) | random.nextInt());
    }

    public static void e() {
        synchronized (C8127deX.class) {
            e = null;
        }
    }

    public static void c() {
        synchronized (C8127deX.class) {
            d = null;
        }
    }
}
