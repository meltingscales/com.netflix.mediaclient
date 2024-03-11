package o;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.InterfaceC8526dow;

/* loaded from: classes.dex */
public interface doA<D extends InterfaceC8526dow> extends doX, Comparable<doA<?>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.doA$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.doY
    default long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass1.a[((ChronoField) interfaceC8535dpe).ordinal()];
            return i != 1 ? i != 2 ? f().a(interfaceC8535dpe) : d().a() : k();
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doX
    /* renamed from: a */
    default doA e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return ChronoZonedDateTimeImpl.a(j(), super.e(j, interfaceC8540dpj));
    }

    doA a(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* renamed from: b */
    default int compareTo(doA doa) {
        int compare = Long.compare(k(), doa.k());
        if (compare == 0) {
            int d = h().d() - doa.h().d();
            if (d == 0) {
                int compareTo = f().compareTo(doa.f());
                if (compareTo == 0) {
                    int compareTo2 = b().d().compareTo(doa.b().d());
                    return compareTo2 == 0 ? j().e(doa.j()) : compareTo2;
                }
                return compareTo;
            }
            return d;
        }
        return compare;
    }

    @Override // o.doY
    default int b(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass1.a[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i != 1) {
                return i != 2 ? f().b(interfaceC8535dpe) : d().a();
            }
            throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(interfaceC8535dpe);
    }

    ZoneId b();

    @Override // o.doY
    default Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return (interfaceC8537dpg == AbstractC8538dph.g() || interfaceC8537dpg == AbstractC8538dph.h()) ? b() : interfaceC8537dpg == AbstractC8538dph.b() ? d() : interfaceC8537dpg == AbstractC8538dph.e() ? h() : interfaceC8537dpg == AbstractC8538dph.c() ? j() : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.NANOS : interfaceC8537dpg.e(this);
    }

    @Override // o.doX
    /* renamed from: b */
    doA d(InterfaceC8535dpe interfaceC8535dpe, long j);

    @Override // o.doX
    /* renamed from: c */
    default doA a(doW dow) {
        return ChronoZonedDateTimeImpl.a(j(), super.a(dow));
    }

    ZoneOffset d();

    @Override // o.doY
    default ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? (interfaceC8535dpe == ChronoField.l || interfaceC8535dpe == ChronoField.u) ? interfaceC8535dpe.a() : f().d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    doA d(ZoneId zoneId);

    default InterfaceC8526dow e() {
        return f().a();
    }

    @Override // o.doX
    /* renamed from: f */
    doA b(long j, InterfaceC8540dpj interfaceC8540dpj);

    InterfaceC8529doz f();

    default LocalTime h() {
        return f().f();
    }

    default InterfaceC8528doy j() {
        return e().d();
    }

    default long k() {
        return ((e().l() * 86400) + h().e()) - d().a();
    }

    default Instant o() {
        return Instant.e(k(), h().d());
    }
}
