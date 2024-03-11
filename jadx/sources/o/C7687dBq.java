package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.dBq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7687dBq {
    public static final int a;
    public static final int b;
    public static final InterfaceC7688dBr c;
    public static final long d;
    public static final String e = dAL.b("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long h;
    public static AbstractC7682dBl i;
    public static final InterfaceC7688dBr j;

    static {
        long b2;
        int b3;
        int c2;
        int c3;
        long b4;
        b2 = dAI.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        h = b2;
        b3 = C8657dts.b(dAL.d(), 2);
        c2 = dAI.c("kotlinx.coroutines.scheduler.core.pool.size", b3, 1, 0, 8, null);
        a = c2;
        c3 = dAI.c("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        b = c3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b4 = dAI.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        d = timeUnit.toNanos(b4);
        i = C7684dBn.a;
        j = new C7690dBt(0);
        c = new C7690dBt(1);
    }
}
