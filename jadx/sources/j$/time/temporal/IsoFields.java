package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import java.util.Map;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public abstract class IsoFields {
    public static final InterfaceC8535dpe e = Field.b;
    public static final InterfaceC8535dpe d = Field.d;
    public static final InterfaceC8535dpe j = Field.e;
    public static final InterfaceC8535dpe c = Field.c;
    public static final InterfaceC8540dpj a = Unit.WEEK_BASED_YEARS;
    public static final InterfaceC8540dpj b = Unit.QUARTER_YEARS;

    /* renamed from: j$.time.temporal.IsoFields$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Unit.values().length];
            b = iArr;
            try {
                iArr[Unit.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Unit.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static abstract class Field implements InterfaceC8535dpe {
        private static final /* synthetic */ Field[] a;
        public static final Field b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        private static final int[] i;

        /* renamed from: j$.time.temporal.IsoFields$Field$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass1 extends Field {
            private AnonymousClass1(String str, int i) {
                super(str, i);
            }

            @Override // o.InterfaceC8535dpe
            public ValueRange a() {
                return ValueRange.a(1L, 90L, 92L);
            }

            @Override // o.InterfaceC8535dpe
            /* renamed from: a */
            public InterfaceC8526dow c(Map map, doY doy, ResolverStyle resolverStyle) {
                LocalDate a;
                long j;
                long multiplyExact;
                ChronoField chronoField = ChronoField.B;
                Long l = (Long) map.get(chronoField);
                InterfaceC8535dpe interfaceC8535dpe = Field.d;
                Long l2 = (Long) map.get(interfaceC8535dpe);
                if (l == null || l2 == null) {
                    return null;
                }
                int b = chronoField.b(l.longValue());
                long longValue = ((Long) map.get(Field.b)).longValue();
                Field.c(doy);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    LocalDate a2 = LocalDate.a(b, 1, 1);
                    multiplyExact = Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L);
                    a = a2.c(multiplyExact);
                    j = Math.subtractExact(longValue, 1L);
                } else {
                    a = LocalDate.a(b, ((interfaceC8535dpe.a().a(l2.longValue(), interfaceC8535dpe) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        (resolverStyle == ResolverStyle.STRICT ? e((doY) a) : a()).c(longValue, this);
                    }
                    j = longValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(interfaceC8535dpe);
                return a.d(j);
            }

            @Override // o.InterfaceC8535dpe
            public boolean a(doY doy) {
                return doy.e(ChronoField.f) && doy.e(ChronoField.y) && doy.e(ChronoField.B) && IsoFields.c(doy);
            }

            @Override // o.InterfaceC8535dpe
            public long d(doY doy) {
                if (a(doy)) {
                    return doy.b(ChronoField.f) - Field.i[((doy.b(ChronoField.y) - 1) / 3) + (IsoChronology.d.c(doy.a(ChronoField.B)) ? 4 : 0)];
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            @Override // o.InterfaceC8535dpe
            public doX d(doX dox, long j) {
                long d = d(dox);
                a().c(j, this);
                ChronoField chronoField = ChronoField.f;
                return dox.d(chronoField, dox.a(chronoField) + (j - d));
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC8535dpe
            public ValueRange e(doY doy) {
                if (a(doy)) {
                    long a = doy.a(Field.d);
                    if (a == 1) {
                        return IsoChronology.d.c(doy.a(ChronoField.B)) ? ValueRange.b(1L, 91L) : ValueRange.b(1L, 90L);
                    }
                    return a == 2 ? ValueRange.b(1L, 91L) : (a == 3 || a == 4) ? ValueRange.b(1L, 92L) : a();
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$2  reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass2 extends Field {
            private AnonymousClass2(String str, int i) {
                super(str, i);
            }

            @Override // o.InterfaceC8535dpe
            public ValueRange a() {
                return ValueRange.b(1L, 4L);
            }

            @Override // o.InterfaceC8535dpe
            public boolean a(doY doy) {
                return doy.e(ChronoField.y) && IsoFields.c(doy);
            }

            @Override // o.InterfaceC8535dpe
            public long d(doY doy) {
                if (a(doy)) {
                    return (doy.a(ChronoField.y) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // o.InterfaceC8535dpe
            public doX d(doX dox, long j) {
                long d = d(dox);
                a().c(j, this);
                ChronoField chronoField = ChronoField.y;
                return dox.d(chronoField, dox.a(chronoField) + ((j - d) * 3));
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC8535dpe
            public ValueRange e(doY doy) {
                if (a(doy)) {
                    return super.e(doy);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$3  reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass3 extends Field {
            private AnonymousClass3(String str, int i) {
                super(str, i);
            }

            @Override // o.InterfaceC8535dpe
            public ValueRange a() {
                return ValueRange.a(1L, 52L, 53L);
            }

            @Override // o.InterfaceC8535dpe
            public boolean a(doY doy) {
                return doy.e(ChronoField.k) && IsoFields.c(doy);
            }

            @Override // o.InterfaceC8535dpe
            public long d(doY doy) {
                if (a(doy)) {
                    return Field.b(LocalDate.e(doy));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // o.InterfaceC8535dpe
            public doX d(doX dox, long j) {
                a().c(j, this);
                return dox.b(Math.subtractExact(j, d(dox)), ChronoUnit.WEEKS);
            }

            @Override // o.InterfaceC8535dpe
            /* renamed from: d */
            public InterfaceC8526dow c(Map map, doY doy, ResolverStyle resolverStyle) {
                LocalDate d;
                long j;
                LocalDate f;
                long j2;
                InterfaceC8535dpe interfaceC8535dpe = Field.c;
                Long l = (Long) map.get(interfaceC8535dpe);
                ChronoField chronoField = ChronoField.j;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a = interfaceC8535dpe.a().a(l.longValue(), interfaceC8535dpe);
                long longValue = ((Long) map.get(Field.e)).longValue();
                Field.c(doy);
                LocalDate a2 = LocalDate.a(a, 1, 4);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        j2 = longValue2 - 1;
                        f = a2.f(j2 / 7);
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            f = a2.f(Math.subtractExact(longValue2, 7L) / 7);
                            j2 = longValue2 + 6;
                        }
                        d = a2.f(Math.subtractExact(longValue, j)).d(chronoField, longValue2);
                    }
                    a2 = f;
                    j = 1;
                    longValue2 = (j2 % 7) + 1;
                    d = a2.f(Math.subtractExact(longValue, j)).d(chronoField, longValue2);
                } else {
                    int b = chronoField.b(l2.longValue());
                    if (longValue < 1 || longValue > 52) {
                        (resolverStyle == ResolverStyle.STRICT ? Field.j(a2) : a()).c(longValue, this);
                    }
                    d = a2.f(longValue - 1).d(chronoField, b);
                }
                map.remove(this);
                map.remove(interfaceC8535dpe);
                map.remove(chronoField);
                return d;
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC8535dpe
            public ValueRange e(doY doy) {
                if (a(doy)) {
                    return Field.j(LocalDate.e(doy));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$4  reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass4 extends Field {
            private AnonymousClass4(String str, int i) {
                super(str, i);
            }

            @Override // o.InterfaceC8535dpe
            public ValueRange a() {
                return ChronoField.B.a();
            }

            @Override // o.InterfaceC8535dpe
            public boolean a(doY doy) {
                return doy.e(ChronoField.k) && IsoFields.c(doy);
            }

            @Override // o.InterfaceC8535dpe
            public long d(doY doy) {
                if (a(doy)) {
                    return Field.a(LocalDate.e(doy));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // o.InterfaceC8535dpe
            public doX d(doX dox, long j) {
                ChronoField chronoField;
                LocalDate a;
                if (a(dox)) {
                    int a2 = a().a(j, Field.c);
                    LocalDate e = LocalDate.e((doY) dox);
                    int b = e.b(ChronoField.j);
                    int b2 = Field.b(e);
                    if (b2 == 53 && Field.d(a2) == 52) {
                        b2 = 52;
                    }
                    return dox.a(LocalDate.a(a2, 1, 4).d((b - a.b(chronoField)) + ((b2 - 1) * 7)));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC8535dpe
            public ValueRange e(doY doy) {
                if (a(doy)) {
                    return super.e(doy);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("DAY_OF_QUARTER", 0);
            b = anonymousClass1;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("QUARTER_OF_YEAR", 1);
            d = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("WEEK_OF_WEEK_BASED_YEAR", 2);
            e = anonymousClass3;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4("WEEK_BASED_YEAR", 3);
            c = anonymousClass4;
            a = new Field[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4};
            i = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private Field(String str, int i2) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(LocalDate localDate) {
            int j = localDate.j();
            int e2 = localDate.e();
            if (e2 <= 3) {
                return e2 - localDate.a().ordinal() < -2 ? j - 1 : j;
            } else if (e2 >= 363) {
                return ((e2 - 363) - (localDate.n() ? 1 : 0)) - localDate.a().ordinal() >= 0 ? j + 1 : j;
            } else {
                return j;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(LocalDate localDate) {
            int ordinal = localDate.a().ordinal();
            int e2 = localDate.e() - 1;
            int i2 = (3 - ordinal) + e2;
            int i3 = i2 - ((i2 / 7) * 7);
            int i4 = i3 - 3;
            if (i4 < -3) {
                i4 = i3 + 4;
            }
            if (e2 < i4) {
                return (int) j(localDate.e(180).a(1L)).e();
            }
            int i5 = ((e2 - i4) / 7) + 1;
            if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.n())) {
                return i5;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(doY doy) {
            if (!IsoFields.c(doy)) {
                throw new DateTimeException("Resolve requires IsoChronology");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int d(int i2) {
            LocalDate a2 = LocalDate.a(i2, 1, 1);
            if (a2.a() != DayOfWeek.THURSDAY) {
                return (a2.a() == DayOfWeek.WEDNESDAY && a2.n()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ValueRange j(LocalDate localDate) {
            return ValueRange.b(1L, d(a(localDate)));
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) a.clone();
        }

        @Override // o.InterfaceC8535dpe
        public boolean b() {
            return false;
        }

        @Override // o.InterfaceC8535dpe
        public boolean d() {
            return true;
        }

        @Override // o.InterfaceC8535dpe
        public ValueRange e(doY doy) {
            return a();
        }
    }

    /* loaded from: classes5.dex */
    enum Unit implements InterfaceC8540dpj {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.b(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.b(7889238));
        
        private final String b;
        private final Duration c;

        Unit(String str, Duration duration) {
            this.b = str;
            this.c = duration;
        }

        @Override // o.InterfaceC8540dpj
        public boolean a() {
            return false;
        }

        @Override // o.InterfaceC8540dpj
        public long d(doX dox, doX dox2) {
            if (dox.getClass() != dox2.getClass()) {
                return dox.a(dox2, this);
            }
            int i = AnonymousClass5.b[ordinal()];
            if (i == 1) {
                InterfaceC8535dpe interfaceC8535dpe = IsoFields.c;
                return Math.subtractExact(dox2.a(interfaceC8535dpe), dox.a(interfaceC8535dpe));
            } else if (i == 2) {
                return dox.a(dox2, ChronoUnit.MONTHS) / 3;
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // o.InterfaceC8540dpj
        public doX e(doX dox, long j) {
            int i = AnonymousClass5.b[ordinal()];
            if (i == 1) {
                InterfaceC8535dpe interfaceC8535dpe = IsoFields.c;
                return dox.d(interfaceC8535dpe, Math.addExact(dox.b(interfaceC8535dpe), j));
            } else if (i == 2) {
                return dox.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // o.InterfaceC8540dpj
        public boolean e() {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.b;
        }
    }

    static boolean c(doY doy) {
        return InterfaceC8528doy.d(doy).equals(IsoChronology.d);
    }
}
