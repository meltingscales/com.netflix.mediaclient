package o;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes5.dex */
public final class dBQ {
    public static final <T> Object e(Duration duration, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return C8779dyf.c(d(duration), drx, interfaceC8585dra);
    }

    private static final long d(Duration duration) {
        if (duration.compareTo(Duration.d) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.d()) <= 0) {
            return 1L;
        }
        if (duration.b() < 9223372036854775L || (duration.b() == 9223372036854775L && duration.c() < 807000000)) {
            return duration.i();
        }
        return Long.MAX_VALUE;
    }
}
