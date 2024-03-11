package o;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.util.Objects;

/* loaded from: classes.dex */
public interface doY {
    long a(InterfaceC8535dpe interfaceC8535dpe);

    default int b(InterfaceC8535dpe interfaceC8535dpe) {
        ValueRange d = d(interfaceC8535dpe);
        if (!d.c()) {
            throw new UnsupportedTemporalTypeException("Invalid field " + interfaceC8535dpe + " for get() method, use getLong() instead");
        }
        long a = a(interfaceC8535dpe);
        if (d.d(a)) {
            return (int) a;
        }
        throw new DateTimeException("Invalid value for " + interfaceC8535dpe + " (valid values " + d + "): " + a);
    }

    default Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.h() || interfaceC8537dpg == AbstractC8538dph.c() || interfaceC8537dpg == AbstractC8538dph.d()) {
            return null;
        }
        return interfaceC8537dpg.e(this);
    }

    default ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (!(interfaceC8535dpe instanceof ChronoField)) {
            Objects.requireNonNull(interfaceC8535dpe, "field");
            return interfaceC8535dpe.e(this);
        } else if (e(interfaceC8535dpe)) {
            return interfaceC8535dpe.a();
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
    }

    boolean e(InterfaceC8535dpe interfaceC8535dpe);
}
