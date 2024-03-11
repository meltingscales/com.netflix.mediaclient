package j$.time.temporal;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doX;
import o.doY;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum w uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class ChronoField implements InterfaceC8535dpe {
    public static final ChronoField A;
    public static final ChronoField B;
    public static final ChronoField C;
    public static final ChronoField D;
    private static final /* synthetic */ ChronoField[] I;
    public static final ChronoField a;
    public static final ChronoField b;
    public static final ChronoField c;
    public static final ChronoField d;
    public static final ChronoField e;
    public static final ChronoField f;
    public static final ChronoField g;
    public static final ChronoField h;
    public static final ChronoField i;
    public static final ChronoField j;
    public static final ChronoField k;
    public static final ChronoField l;
    public static final ChronoField m;
    public static final ChronoField n;

    /* renamed from: o  reason: collision with root package name */
    public static final ChronoField f13342o;
    public static final ChronoField p;
    public static final ChronoField q;
    public static final ChronoField r;
    public static final ChronoField s;
    public static final ChronoField t;
    public static final ChronoField u;
    public static final ChronoField v;
    public static final ChronoField w;
    public static final ChronoField x;
    public static final ChronoField y;
    public static final ChronoField z;
    private final String E;
    private final ValueRange F;
    private final InterfaceC8540dpj G;
    private final String H;
    private final InterfaceC8540dpj N;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoField chronoField = new ChronoField("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, ValueRange.b(0L, 999999999L));
        w = chronoField;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoField chronoField2 = new ChronoField("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, ValueRange.b(0L, 86399999999999L));
        x = chronoField2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoField chronoField3 = new ChronoField("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, ValueRange.b(0L, 999999L));
        p = chronoField3;
        ChronoField chronoField4 = new ChronoField("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, ValueRange.b(0L, 86399999999L));
        q = chronoField4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoField chronoField5 = new ChronoField("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, ValueRange.b(0L, 999L));
        r = chronoField5;
        ChronoField chronoField6 = new ChronoField("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, ValueRange.b(0L, 86399999L));
        t = chronoField6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoField chronoField7 = new ChronoField("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, ValueRange.b(0L, 59L), "second");
        D = chronoField7;
        ChronoField chronoField8 = new ChronoField("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, ValueRange.b(0L, 86399L));
        C = chronoField8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoField chronoField9 = new ChronoField("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, ValueRange.b(0L, 59L), "minute");
        v = chronoField9;
        ChronoField chronoField10 = new ChronoField("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, ValueRange.b(0L, 1439L));
        s = chronoField10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoField chronoField11 = new ChronoField("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, ValueRange.b(0L, 11L));
        f13342o = chronoField11;
        ChronoField chronoField12 = new ChronoField("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, ValueRange.b(1L, 12L));
        g = chronoField12;
        ChronoField chronoField13 = new ChronoField("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, ValueRange.b(0L, 23L), "hour");
        n = chronoField13;
        ChronoField chronoField14 = new ChronoField("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, ValueRange.b(1L, 24L));
        i = chronoField14;
        ChronoField chronoField15 = new ChronoField("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, ValueRange.b(0L, 1L), "dayperiod");
        b = chronoField15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoField chronoField16 = new ChronoField("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, ValueRange.b(1L, 7L), "weekday");
        j = chronoField16;
        ChronoField chronoField17 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, ValueRange.b(1L, 7L));
        c = chronoField17;
        ChronoField chronoField18 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, ValueRange.b(1L, 7L));
        a = chronoField18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoField chronoField19 = new ChronoField("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, ValueRange.a(1L, 28L, 31L), SignupConstants.Field.DEMO_COLLECT_BIRTH_DAY);
        h = chronoField19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoField chronoField20 = new ChronoField("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, ValueRange.a(1L, 365L, 366L));
        f = chronoField20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        ChronoField chronoField21 = new ChronoField("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, ValueRange.b(-365243219162L, 365241780471L));
        k = chronoField21;
        ChronoField chronoField22 = new ChronoField("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, ValueRange.a(1L, 4L, 5L));
        e = chronoField22;
        ChronoField chronoField23 = new ChronoField("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, ValueRange.b(1L, 53L));
        d = chronoField23;
        ChronoField chronoField24 = new ChronoField("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, ValueRange.b(1L, 12L), SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH);
        y = chronoField24;
        ChronoField chronoField25 = new ChronoField("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, ValueRange.b(-11999999988L, 11999999999L));
        z = chronoField25;
        ChronoField chronoField26 = new ChronoField("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, ValueRange.a(1L, 999999999L, 1000000000L));
        A = chronoField26;
        ChronoField chronoField27 = new ChronoField("YEAR", 26, "Year", chronoUnit11, chronoUnit12, ValueRange.b(-999999999L, 999999999L), SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR);
        B = chronoField27;
        ChronoField chronoField28 = new ChronoField("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, ValueRange.b(0L, 1L), "era");
        m = chronoField28;
        ChronoField chronoField29 = new ChronoField("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, ValueRange.b(Long.MIN_VALUE, Long.MAX_VALUE));
        l = chronoField29;
        ChronoField chronoField30 = new ChronoField("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, ValueRange.b(-64800L, 64800L));
        u = chronoField30;
        I = new ChronoField[]{chronoField, chronoField2, chronoField3, chronoField4, chronoField5, chronoField6, chronoField7, chronoField8, chronoField9, chronoField10, chronoField11, chronoField12, chronoField13, chronoField14, chronoField15, chronoField16, chronoField17, chronoField18, chronoField19, chronoField20, chronoField21, chronoField22, chronoField23, chronoField24, chronoField25, chronoField26, chronoField27, chronoField28, chronoField29, chronoField30};
    }

    private ChronoField(String str, int i2, String str2, InterfaceC8540dpj interfaceC8540dpj, InterfaceC8540dpj interfaceC8540dpj2, ValueRange valueRange) {
        this.E = str2;
        this.G = interfaceC8540dpj;
        this.N = interfaceC8540dpj2;
        this.F = valueRange;
        this.H = null;
    }

    private ChronoField(String str, int i2, String str2, InterfaceC8540dpj interfaceC8540dpj, InterfaceC8540dpj interfaceC8540dpj2, ValueRange valueRange, String str3) {
        this.E = str2;
        this.G = interfaceC8540dpj;
        this.N = interfaceC8540dpj2;
        this.F = valueRange;
        this.H = str3;
    }

    public static ChronoField valueOf(String str) {
        return (ChronoField) Enum.valueOf(ChronoField.class, str);
    }

    public static ChronoField[] values() {
        return (ChronoField[]) I.clone();
    }

    @Override // o.InterfaceC8535dpe
    public ValueRange a() {
        return this.F;
    }

    @Override // o.InterfaceC8535dpe
    public boolean a(doY doy) {
        return doy.e(this);
    }

    public int b(long j2) {
        return a().a(j2, this);
    }

    @Override // o.InterfaceC8535dpe
    public boolean b() {
        return ordinal() < j.ordinal();
    }

    public long d(long j2) {
        return a().c(j2, this);
    }

    @Override // o.InterfaceC8535dpe
    public long d(doY doy) {
        return doy.a(this);
    }

    @Override // o.InterfaceC8535dpe
    public doX d(doX dox, long j2) {
        return dox.d(this, j2);
    }

    @Override // o.InterfaceC8535dpe
    public boolean d() {
        return ordinal() >= j.ordinal() && ordinal() <= m.ordinal();
    }

    @Override // o.InterfaceC8535dpe
    public ValueRange e(doY doy) {
        return doy.d(this);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.E;
    }
}
