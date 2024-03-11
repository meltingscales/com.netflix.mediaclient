package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.AbstractC8538dph;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public enum DayOfWeek implements doY, doW {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final DayOfWeek[] i = values();

    public static DayOfWeek a(int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new DateTimeException("Invalid value for DayOfWeek: " + i2);
        }
        return i[i2 - 1];
    }

    public int a() {
        return ordinal() + 1;
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.j) {
            return a();
        }
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.j ? a() : super.b(interfaceC8535dpe);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.DAYS : super.b(interfaceC8537dpg);
    }

    public DayOfWeek c(long j) {
        return i[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.j ? interfaceC8535dpe.a() : super.d(interfaceC8535dpe);
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.j, a());
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.j : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }
}
