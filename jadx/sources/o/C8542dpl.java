package o;

import j$.time.Instant;
import java.util.Date;

/* renamed from: o.dpl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8542dpl {
    public static Date b(Instant instant) {
        try {
            return new Date(instant.b());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Instant e(Date date) {
        return Instant.a(date.getTime());
    }
}
