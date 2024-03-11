package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.chrono.ChronoZonedDateTimeImpl;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.doy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8528doy extends Comparable<InterfaceC8528doy> {
    static InterfaceC8528doy a(String str) {
        return AbstractC8521dor.b(str);
    }

    static InterfaceC8528doy d(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        return (InterfaceC8528doy) AbstractC8524dou.d((InterfaceC8528doy) doy.b(AbstractC8538dph.c()), IsoChronology.d);
    }

    ValueRange a(ChronoField chronoField);

    List a();

    default doA a(doY doy) {
        try {
            ZoneId a = ZoneId.a(doy);
            try {
                return e(Instant.c(doy), a);
            } catch (DateTimeException unused) {
                return ChronoZonedDateTimeImpl.c(ChronoLocalDateTimeImpl.a(this, e(doy)), a, null);
            }
        } catch (DateTimeException e) {
            Class<?> cls = doy.getClass();
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + cls, e);
        }
    }

    String b();

    InterfaceC8526dow b(int i, int i2);

    InterfaceC8526dow b(int i, int i2, int i3);

    InterfaceC8526dow b(doY doy);

    doC c(int i);

    InterfaceC8526dow c();

    InterfaceC8526dow c(Map map, ResolverStyle resolverStyle);

    boolean c(long j);

    int e(doC doc, int i);

    int e(InterfaceC8528doy interfaceC8528doy);

    String e();

    default doA e(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.a(this, instant, zoneId);
    }

    InterfaceC8526dow e(long j);

    default InterfaceC8529doz e(doY doy) {
        try {
            return b(doy).a(LocalTime.a(doy));
        } catch (DateTimeException e) {
            Class<?> cls = doy.getClass();
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + cls, e);
        }
    }

    boolean equals(Object obj);

    int hashCode();

    String toString();
}
