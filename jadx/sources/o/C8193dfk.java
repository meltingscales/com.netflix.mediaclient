package o;

import com.netflix.mediaclient.util.PositiveRandom;

/* renamed from: o.dfk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8193dfk {
    private static long e() {
        return (new PositiveRandom().e() & 4294967295L) | (((int) (System.currentTimeMillis() / 1000)) << 32);
    }

    public static String a() {
        return Long.toString(e());
    }

    public static String c() {
        return Long.toString(e());
    }

    public static String d() {
        return Long.toString(e());
    }

    public static String b() {
        return Long.toString(e());
    }
}
