package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public enum Month implements doY, doW {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final Month[] n = values();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Month$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Month.values().length];
            d = iArr;
            try {
                iArr[Month.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Month.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Month.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[Month.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[Month.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[Month.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[Month.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[Month.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[Month.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[Month.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[Month.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static Month c(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i);
        }
        return n[i - 1];
    }

    public int a(boolean z) {
        switch (AnonymousClass3.d[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.y) {
            return c();
        }
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return interfaceC8535dpe.d(this);
    }

    public int b() {
        int i = AnonymousClass3.d[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.y ? c() : super.b(interfaceC8535dpe);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.c() ? IsoChronology.d : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.MONTHS : super.b(interfaceC8537dpg);
    }

    public int c() {
        return ordinal() + 1;
    }

    public Month c(long j) {
        return n[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public int d(boolean z) {
        int i = AnonymousClass3.d[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.y ? interfaceC8535dpe.a() : super.d(interfaceC8535dpe);
    }

    public int e() {
        int i = AnonymousClass3.d[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    @Override // o.doW
    public doX e(doX dox) {
        if (InterfaceC8528doy.d(dox).equals(IsoChronology.d)) {
            return dox.d(ChronoField.y, c());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.y : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }
}
