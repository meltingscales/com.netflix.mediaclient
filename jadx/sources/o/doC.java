package o;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;

/* loaded from: classes.dex */
public interface doC extends doY, doW {
    @Override // o.doY
    default long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.m) {
            return b();
        }
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return interfaceC8535dpe.d(this);
    }

    int b();

    @Override // o.doY
    default int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.m ? b() : super.b(interfaceC8535dpe);
    }

    @Override // o.doY
    default Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.ERAS : super.b(interfaceC8537dpg);
    }

    @Override // o.doY
    default ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return super.d(interfaceC8535dpe);
    }

    @Override // o.doW
    default doX e(doX dox) {
        return dox.d(ChronoField.m, b());
    }

    @Override // o.doY
    default boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.m : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }
}
