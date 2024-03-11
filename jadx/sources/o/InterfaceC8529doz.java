package o;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;
import o.InterfaceC8526dow;

/* renamed from: o.doz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8529doz<D extends InterfaceC8526dow> extends doX, doW, Comparable<InterfaceC8529doz<?>> {
    default Instant a(ZoneOffset zoneOffset) {
        return Instant.e(b(zoneOffset), f().d());
    }

    InterfaceC8526dow a();

    @Override // o.doX
    /* renamed from: a */
    default InterfaceC8529doz e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return ChronoLocalDateTimeImpl.a(i(), super.e(j, interfaceC8540dpj));
    }

    default long b(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((a().l() * 86400) + f().e()) - zoneOffset.a();
    }

    @Override // o.doY
    default Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.h() || interfaceC8537dpg == AbstractC8538dph.g() || interfaceC8537dpg == AbstractC8538dph.b()) {
            return null;
        }
        return interfaceC8537dpg == AbstractC8538dph.e() ? f() : interfaceC8537dpg == AbstractC8538dph.c() ? i() : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.NANOS : interfaceC8537dpg.e(this);
    }

    doA b(ZoneId zoneId);

    @Override // o.doX
    /* renamed from: c */
    default InterfaceC8529doz a(doW dow) {
        return ChronoLocalDateTimeImpl.a(i(), super.a(dow));
    }

    @Override // o.doX
    /* renamed from: c */
    InterfaceC8529doz d(InterfaceC8535dpe interfaceC8535dpe, long j);

    default boolean c(InterfaceC8529doz interfaceC8529doz) {
        int i = (a().l() > interfaceC8529doz.a().l() ? 1 : (a().l() == interfaceC8529doz.a().l() ? 0 : -1));
        return i < 0 || (i == 0 && f().b() < interfaceC8529doz.f().b());
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    default int compareTo(InterfaceC8529doz interfaceC8529doz) {
        int compareTo = a().compareTo(interfaceC8529doz.a());
        if (compareTo == 0) {
            int compareTo2 = f().compareTo(interfaceC8529doz.f());
            return compareTo2 == 0 ? i().e(interfaceC8529doz.i()) : compareTo2;
        }
        return compareTo;
    }

    default doX e(doX dox) {
        return dox.d(ChronoField.k, a().l()).d(ChronoField.x, f().b());
    }

    default boolean e(InterfaceC8529doz interfaceC8529doz) {
        int i = (a().l() > interfaceC8529doz.a().l() ? 1 : (a().l() == interfaceC8529doz.a().l() ? 0 : -1));
        return i > 0 || (i == 0 && f().b() > interfaceC8529doz.f().b());
    }

    LocalTime f();

    @Override // o.doX
    /* renamed from: f */
    InterfaceC8529doz b(long j, InterfaceC8540dpj interfaceC8540dpj);

    int hashCode();

    default InterfaceC8528doy i() {
        return a().d();
    }

    String toString();
}
