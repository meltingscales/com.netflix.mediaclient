package o;

import j$.time.LocalTime;
import j$.time.chrono.ChronoLocalDateImpl;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.dow  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8526dow extends doX, doW, Comparable<InterfaceC8526dow> {
    @Override // o.doX
    long a(doX dox, InterfaceC8540dpj interfaceC8540dpj);

    default InterfaceC8529doz a(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.e(this, localTime);
    }

    default boolean a(InterfaceC8526dow interfaceC8526dow) {
        return l() < interfaceC8526dow.l();
    }

    @Override // o.doY
    default Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.h() || interfaceC8537dpg == AbstractC8538dph.g() || interfaceC8537dpg == AbstractC8538dph.b() || interfaceC8537dpg == AbstractC8538dph.e()) {
            return null;
        }
        return interfaceC8537dpg == AbstractC8538dph.c() ? d() : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.DAYS : interfaceC8537dpg.e(this);
    }

    default InterfaceC8526dow b(InterfaceC8533dpc interfaceC8533dpc) {
        return ChronoLocalDateImpl.d(d(), super.c(interfaceC8533dpc));
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    default int compareTo(InterfaceC8526dow interfaceC8526dow) {
        int compare = Long.compare(l(), interfaceC8526dow.l());
        return compare == 0 ? d().e(interfaceC8526dow.d()) : compare;
    }

    @Override // o.doX
    /* renamed from: c */
    default InterfaceC8526dow e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return ChronoLocalDateImpl.d(d(), super.e(j, interfaceC8540dpj));
    }

    @Override // o.doX
    /* renamed from: c */
    default InterfaceC8526dow d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return ChronoLocalDateImpl.d(d(), interfaceC8535dpe.d(this, j));
    }

    @Override // o.doX
    /* renamed from: d */
    default InterfaceC8526dow a(doW dow) {
        return ChronoLocalDateImpl.d(d(), super.a(dow));
    }

    InterfaceC8528doy d();

    default boolean d(InterfaceC8526dow interfaceC8526dow) {
        return l() > interfaceC8526dow.l();
    }

    default doX e(doX dox) {
        return dox.d(ChronoField.k, l());
    }

    @Override // o.doY
    default boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe.d() : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    boolean equals(Object obj);

    default doC g() {
        return d().c(b(ChronoField.m));
    }

    @Override // o.doX
    /* renamed from: h */
    default InterfaceC8526dow b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        if (interfaceC8540dpj instanceof ChronoUnit) {
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
        }
        return ChronoLocalDateImpl.d(d(), interfaceC8540dpj.e(this, j));
    }

    int hashCode();

    default int k() {
        return n() ? 366 : 365;
    }

    default long l() {
        return a(ChronoField.k);
    }

    default boolean n() {
        return d().c(a(ChronoField.B));
    }

    String toString();
}
