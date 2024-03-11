package o;

import java.text.DecimalFormat;

/* loaded from: classes5.dex */
public final class duE {
    private static final ThreadLocal<DecimalFormat>[] a;
    private static final boolean b = false;

    public static final boolean a() {
        return b;
    }

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        a = threadLocalArr;
    }
}
