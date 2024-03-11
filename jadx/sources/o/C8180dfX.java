package o;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: o.dfX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8180dfX {
    public static final C8180dfX e = new C8180dfX();

    private C8180dfX() {
    }

    public final String c() {
        dsE dse = dsE.b;
        Locale locale = Locale.US;
        String format = String.format(locale, "%08X", Arrays.copyOf(new Object[]{Long.valueOf(b())}, 1));
        C8632dsu.a(format, "");
        String format2 = String.format(locale, "%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ThreadLocalRandom.current().nextInt())}, 1));
        C8632dsu.a(format2, "");
        String format3 = String.format(locale, "%016X", Arrays.copyOf(new Object[]{Long.valueOf(ThreadLocalRandom.current().nextLong())}, 1));
        C8632dsu.a(format3, "");
        return format + "-" + format2 + "-" + format3;
    }

    private final long b() {
        return (System.currentTimeMillis() / 1000) & 4294967295L;
    }
}
