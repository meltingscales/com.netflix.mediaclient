package o;

import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class HC {
    private static final NumberFormat e = NumberFormat.getInstance(Locale.US);

    public static final HT b(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d != Math.rint(d)) {
            return HP.c(d);
        }
        long j = (long) d;
        if (j < 2147483647L && j > -2147483648L) {
            return HP.c((int) j);
        }
        return HP.b(j);
    }
}
