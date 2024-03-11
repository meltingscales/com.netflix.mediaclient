package j$.time;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.chrono.IsoChronology;
import j$.time.chrono.IsoEra;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8515dol;
import o.AbstractC8538dph;
import o.InterfaceC8526dow;
import o.InterfaceC8533dpc;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class LocalDate implements InterfaceC8526dow, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final short b;
    private final short c;
    private final int g;
    public static final LocalDate d = a(-999999999, 1, 1);
    public static final LocalDate a = a(999999999, 12, 31);
    public static final LocalDate e = a(1970, 1, 1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalDate$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            b = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            c = iArr2;
            try {
                iArr2[ChronoField.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[ChronoField.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[ChronoField.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[ChronoField.A.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[ChronoField.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[ChronoField.c.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                c[ChronoField.a.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                c[ChronoField.k.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                c[ChronoField.d.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                c[ChronoField.y.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                c[ChronoField.z.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                c[ChronoField.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                c[ChronoField.m.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private LocalDate(int i, int i2, int i3) {
        this.g = i;
        this.c = (short) i2;
        this.b = (short) i3;
    }

    public static LocalDate a(int i, int i2) {
        long j = i;
        ChronoField.B.d(j);
        ChronoField.f.d(i2);
        boolean c = IsoChronology.d.c(j);
        if (i2 != 366 || c) {
            Month c2 = Month.c(((i2 - 1) / 31) + 1);
            if (i2 > (c2.a(c) + c2.d(c)) - 1) {
                c2 = c2.c(1L);
            }
            return new LocalDate(i, c2.c(), (i2 - c2.a(c)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    public static LocalDate a(int i, int i2, int i3) {
        ChronoField.B.d(i);
        ChronoField.y.d(i2);
        ChronoField.h.d(i3);
        return e(i, i2, i3);
    }

    public static LocalDate a(Instant instant, ZoneId zoneId) {
        long floorDiv;
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        floorDiv = Math.floorDiv(instant.d() + zoneId.c().a(instant).a(), 86400L);
        return b(floorDiv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocalDate a(DataInput dataInput) {
        return a(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static LocalDate b(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        i4 = IsoChronology.d.c((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate b(long j) {
        long j2;
        ChronoField.k.d(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.B.b(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private int c(InterfaceC8535dpe interfaceC8535dpe) {
        switch (AnonymousClass5.c[((ChronoField) interfaceC8535dpe).ordinal()]) {
            case 1:
                return this.b;
            case 2:
                return e();
            case 3:
                return ((this.b - 1) / 7) + 1;
            case 4:
                int i = this.g;
                return i >= 1 ? i : 1 - i;
            case 5:
                return a().a();
            case 6:
                return ((this.b - 1) % 7) + 1;
            case 7:
                return ((e() - 1) % 7) + 1;
            case 8:
                throw new UnsupportedTemporalTypeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((e() - 1) / 7) + 1;
            case 10:
                return this.c;
            case 11:
                throw new UnsupportedTemporalTypeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.g;
            case 13:
                return this.g >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
    }

    public static LocalDate c(int i, Month month, int i2) {
        ChronoField.B.d(i);
        Objects.requireNonNull(month, SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH);
        ChronoField.h.d(i2);
        return e(i, month.c(), i2);
    }

    private long d(LocalDate localDate) {
        return (((localDate.o() * 32) + localDate.c()) - ((o() * 32) + c())) / 32;
    }

    private static LocalDate e(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (IsoChronology.d.c(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.c(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate e(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return a(clock.b(), clock.d());
    }

    public static LocalDate e(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        LocalDate localDate = (LocalDate) doy.b(AbstractC8538dph.a());
        if (localDate != null) {
            return localDate;
        }
        String name = doy.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + doy + " of type " + name);
    }

    private long o() {
        return ((this.g * 12) + this.c) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(LocalDate localDate) {
        int i = this.g - localDate.g;
        if (i == 0) {
            int i2 = this.c - localDate.c;
            return i2 == 0 ? this.b - localDate.b : i2;
        }
        return i;
    }

    @Override // o.InterfaceC8526dow, o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        long c;
        long j;
        LocalDate e2 = e((doY) dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass5.b[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return c(e2);
                case 2:
                    c = c(e2);
                    j = 7;
                    break;
                case 3:
                    return d(e2);
                case 4:
                    c = d(e2);
                    j = 12;
                    break;
                case 5:
                    c = d(e2);
                    j = 120;
                    break;
                case 6:
                    c = d(e2);
                    j = 1200;
                    break;
                case 7:
                    c = d(e2);
                    j = 12000;
                    break;
                case 8:
                    ChronoField chronoField = ChronoField.m;
                    return e2.a(chronoField) - a(chronoField);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
            return c / j;
        }
        return interfaceC8540dpj.d(this, e2);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.k ? l() : interfaceC8535dpe == ChronoField.z ? o() : c(interfaceC8535dpe) : interfaceC8535dpe.d(this);
    }

    public DayOfWeek a() {
        return DayOfWeek.a(AbstractC8515dol.e(l() + 3, 7) + 1);
    }

    public LocalDate a(int i) {
        return this.b == i ? this : a(this.g, this.c, i);
    }

    public LocalDate a(long j) {
        return j == Long.MIN_VALUE ? h(Long.MAX_VALUE).h(1L) : h(-j);
    }

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public LocalDate e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? h(Long.MAX_VALUE, interfaceC8540dpj).h(1L, interfaceC8540dpj) : h(-j, interfaceC8540dpj);
    }

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public LocalDate d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            chronoField.d(j);
            switch (AnonymousClass5.c[chronoField.ordinal()]) {
                case 1:
                    return a((int) j);
                case 2:
                    return e((int) j);
                case 3:
                    return f(j - a(ChronoField.e));
                case 4:
                    if (this.g < 1) {
                        j = 1 - j;
                    }
                    return b((int) j);
                case 5:
                    return d(j - a().a());
                case 6:
                    return d(j - a(ChronoField.c));
                case 7:
                    return d(j - a(ChronoField.a));
                case 8:
                    return b(j);
                case 9:
                    return f(j - a(ChronoField.d));
                case 10:
                    return d((int) j);
                case 11:
                    return c(j - o());
                case 12:
                    return b((int) j);
                case 13:
                    return a(ChronoField.m) == j ? this : b(1 - this.g);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
        }
        return (LocalDate) interfaceC8535dpe.d(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.g);
        dataOutput.writeByte(this.c);
        dataOutput.writeByte(this.b);
    }

    @Override // o.InterfaceC8526dow
    public boolean a(InterfaceC8526dow interfaceC8526dow) {
        return interfaceC8526dow instanceof LocalDate ? a((LocalDate) interfaceC8526dow) < 0 : super.a(interfaceC8526dow);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? c(interfaceC8535dpe) : super.b(interfaceC8535dpe);
    }

    public LocalDate b(int i) {
        if (this.g == i) {
            return this;
        }
        ChronoField.B.d(i);
        return b(i, this.c, this.b);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: b */
    public IsoChronology d() {
        return IsoChronology.d;
    }

    @Override // o.InterfaceC8526dow, o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.a() ? this : super.b(interfaceC8537dpg);
    }

    public int c() {
        return this.b;
    }

    @Override // o.InterfaceC8526dow, java.lang.Comparable
    /* renamed from: c */
    public int compareTo(InterfaceC8526dow interfaceC8526dow) {
        return interfaceC8526dow instanceof LocalDate ? a((LocalDate) interfaceC8526dow) : super.compareTo(interfaceC8526dow);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c(LocalDate localDate) {
        return localDate.l() - l();
    }

    public LocalDate c(long j) {
        long floorDiv;
        if (j == 0) {
            return this;
        }
        long j2 = (this.g * 12) + (this.c - 1) + j;
        ChronoField chronoField = ChronoField.B;
        floorDiv = Math.floorDiv(j2, 12L);
        return b(chronoField.b(floorDiv), AbstractC8515dol.e(j2, 12) + 1, this.b);
    }

    public LocalDate d(int i) {
        if (this.c == i) {
            return this;
        }
        ChronoField.y.d(i);
        return b(this.g, i, this.b);
    }

    public LocalDate d(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.g, this.c, (int) j2);
            }
            if (j2 <= 59) {
                long m = m();
                if (j2 <= m) {
                    return new LocalDate(this.g, this.c, (int) j2);
                }
                short s = this.c;
                if (s < 12) {
                    return new LocalDate(this.g, s + 1, (int) (j2 - m));
                }
                ChronoField.B.d(this.g + 1);
                return new LocalDate(this.g + 1, 1, (int) (j2 - m));
            }
        }
        return b(Math.addExact(l(), j));
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: d */
    public LocalDate h(long j, InterfaceC8540dpj interfaceC8540dpj) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass5.b[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return d(j);
                case 2:
                    return f(j);
                case 3:
                    return c(j);
                case 4:
                    return h(j);
                case 5:
                    multiplyExact = Math.multiplyExact(j, 10L);
                    return h(multiplyExact);
                case 6:
                    multiplyExact2 = Math.multiplyExact(j, 100L);
                    return h(multiplyExact2);
                case 7:
                    multiplyExact3 = Math.multiplyExact(j, 1000L);
                    return h(multiplyExact3);
                case 8:
                    ChronoField chronoField = ChronoField.m;
                    return d(chronoField, Math.addExact(a(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return (LocalDate) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        int m;
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            if (!chronoField.d()) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
            int i = AnonymousClass5.c[chronoField.ordinal()];
            if (i == 1) {
                m = m();
            } else if (i != 2) {
                if (i == 3) {
                    return ValueRange.b(1L, (f() != Month.FEBRUARY || n()) ? 5L : 4L);
                } else if (i != 4) {
                    return interfaceC8535dpe.a();
                } else {
                    return ValueRange.b(1L, j() <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                m = k();
            }
            return ValueRange.b(1L, m);
        }
        return interfaceC8535dpe.e(this);
    }

    @Override // o.InterfaceC8526dow
    public boolean d(InterfaceC8526dow interfaceC8526dow) {
        return interfaceC8526dow instanceof LocalDate ? a((LocalDate) interfaceC8526dow) > 0 : super.d(interfaceC8526dow);
    }

    public int e() {
        return (f().a(n()) + this.b) - 1;
    }

    public LocalDate e(int i) {
        return e() == i ? this : a(this.g, i);
    }

    public LocalDate e(long j) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE).d(1L) : d(-j);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: e */
    public LocalDate d(doW dow) {
        return dow instanceof LocalDate ? (LocalDate) dow : (LocalDate) dow.e(this);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: e */
    public LocalDate b(InterfaceC8533dpc interfaceC8533dpc) {
        if (interfaceC8533dpc instanceof Period) {
            Period period = (Period) interfaceC8533dpc;
            return c(period.b()).d(period.e());
        }
        Objects.requireNonNull(interfaceC8533dpc, "amountToAdd");
        return (LocalDate) interfaceC8533dpc.b(this);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: e */
    public LocalDateTime a(LocalTime localTime) {
        return LocalDateTime.e(this, localTime);
    }

    @Override // o.InterfaceC8526dow, o.doW
    public doX e(doX dox) {
        return super.e(dox);
    }

    @Override // o.InterfaceC8526dow, o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return super.e(interfaceC8535dpe);
    }

    @Override // o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && a((LocalDate) obj) == 0;
    }

    public LocalDate f(long j) {
        long multiplyExact;
        multiplyExact = Math.multiplyExact(j, 7L);
        return d(multiplyExact);
    }

    public Month f() {
        return Month.c((int) this.c);
    }

    public int h() {
        return this.c;
    }

    public LocalDate h(long j) {
        return j == 0 ? this : b(ChronoField.B.b(this.g + j), this.c, this.b);
    }

    @Override // o.InterfaceC8526dow
    public int hashCode() {
        int i = this.g;
        return (i & (-2048)) ^ (((i << 11) + (this.c << 6)) + this.b);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: i */
    public IsoEra g() {
        return j() >= 1 ? IsoEra.CE : IsoEra.BCE;
    }

    public int j() {
        return this.g;
    }

    @Override // o.InterfaceC8526dow
    public int k() {
        return n() ? 366 : 365;
    }

    @Override // o.InterfaceC8526dow
    public long l() {
        long j = this.g;
        long j2 = this.c;
        long j3 = 365 * j;
        long j4 = (j >= 0 ? j3 + (((3 + j) / 4) - ((99 + j) / 100)) + ((j + 399) / 400) : j3 - (((j / (-4)) - (j / (-100))) + (j / (-400)))) + (((367 * j2) - 362) / 12) + (this.b - 1);
        if (j2 > 2) {
            j4 -= n() ? 1L : 2L;
        }
        return j4 - 719528;
    }

    public int m() {
        short s = this.c;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : n() ? 29 : 28;
    }

    @Override // o.InterfaceC8526dow
    public boolean n() {
        return IsoChronology.d.c(this.g);
    }

    @Override // o.InterfaceC8526dow
    public String toString() {
        int i;
        int i2 = this.g;
        short s = this.c;
        short s2 = this.b;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }
}
