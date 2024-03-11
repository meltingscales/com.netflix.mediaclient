package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import o.AbstractC8520doq;
import o.AbstractC8521dor;
import o.InterfaceC8526dow;
import o.InterfaceC8529doz;
import o.doA;
import o.doC;
import o.doV;
import o.doY;

/* loaded from: classes6.dex */
public final class JapaneseChronology extends AbstractC8521dor implements Serializable {
    public static final JapaneseChronology b = new JapaneseChronology();
    private static final long serialVersionUID = 459996390165777884L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.JapaneseChronology$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoField.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoField.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ChronoField.A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ChronoField.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ChronoField.B.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ChronoField.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private JapaneseChronology() {
    }

    private int b(JapaneseEra japaneseEra, int i) {
        return (japaneseEra.f().j() + i) - 1;
    }

    private InterfaceC8526dow b(JapaneseEra japaneseEra, int i, Map map, ResolverStyle resolverStyle) {
        JapaneseDate d;
        map.remove(ChronoField.m);
        map.remove(ChronoField.A);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int b2 = b(japaneseEra, i);
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.y)).longValue(), 1L);
            return b(b2, 1, 1).h(subtractExact, ChronoUnit.MONTHS).h(Math.subtractExact(((Long) map.remove(ChronoField.h)).longValue(), 1L), ChronoUnit.DAYS);
        }
        ChronoField chronoField = ChronoField.y;
        int a = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        ChronoField chronoField2 = ChronoField.h;
        int a2 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (resolverStyle == ResolverStyle.SMART) {
            if (i < 1) {
                throw new DateTimeException("Invalid YearOfEra: " + i);
            }
            int b3 = b(japaneseEra, i);
            try {
                d = b(b3, a, a2);
            } catch (DateTimeException unused) {
                d = b(b3, a, 1).d(doV.b());
            }
            if (d.g() == japaneseEra || d.b(ChronoField.A) <= 1 || i <= 1) {
                return d;
            }
            throw new DateTimeException("Invalid YearOfEra for Era: " + japaneseEra + " " + i);
        }
        return a(japaneseEra, i, a, a2);
    }

    private InterfaceC8526dow e(JapaneseEra japaneseEra, int i, Map map, ResolverStyle resolverStyle) {
        map.remove(ChronoField.m);
        map.remove(ChronoField.A);
        if (resolverStyle != ResolverStyle.LENIENT) {
            ChronoField chronoField = ChronoField.f;
            return b(japaneseEra, i, a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField));
        }
        int b2 = b(japaneseEra, i);
        return b(b2, 1).h(Math.subtractExact(((Long) map.remove(ChronoField.f)).longValue(), 1L), ChronoUnit.DAYS);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public JapaneseDate a(doC doc, int i, int i2, int i3) {
        if (doc instanceof JapaneseEra) {
            return JapaneseDate.b((JapaneseEra) doc, i, i2, i3);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // o.InterfaceC8528doy
    public ValueRange a(ChronoField chronoField) {
        switch (AnonymousClass4.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
            case 5:
                return ValueRange.a(1L, JapaneseEra.c(), 999999999 - JapaneseEra.d().f().j());
            case 6:
                return ValueRange.a(1L, JapaneseEra.e(), ChronoField.f.a().e());
            case 7:
                return ValueRange.b(JapaneseDate.c.j(), 999999999L);
            case 8:
                return ValueRange.b(JapaneseEra.a.b(), JapaneseEra.d().b());
            default:
                return chronoField.a();
        }
    }

    @Override // o.InterfaceC8528doy
    public List a() {
        return AbstractC8520doq.a(JapaneseEra.a());
    }

    @Override // o.InterfaceC8528doy
    public doA a(doY doy) {
        return super.a(doy);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: b */
    public JapaneseDate e(long j) {
        return new JapaneseDate(LocalDate.b(j));
    }

    public JapaneseDate b(doC doc, int i, int i2) {
        return JapaneseDate.a((JapaneseEra) doc, i, i2);
    }

    @Override // o.InterfaceC8528doy
    public String b() {
        return "Japanese";
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public JapaneseDate b(int i, int i2) {
        return new JapaneseDate(LocalDate.a(i, i2));
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public JapaneseDate b(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.a(i, i2, i3));
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public JapaneseDate b(doY doy) {
        return doy instanceof JapaneseDate ? (JapaneseDate) doy : new JapaneseDate(LocalDate.e(doy));
    }

    @Override // o.InterfaceC8528doy
    public boolean c(long j) {
        return IsoChronology.d.c(j);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public JapaneseDate c() {
        return d(Clock.c());
    }

    public JapaneseDate d(Clock clock) {
        return b(LocalDate.e(clock));
    }

    @Override // o.InterfaceC8528doy
    public int e(doC doc, int i) {
        if (doc instanceof JapaneseEra) {
            JapaneseEra japaneseEra = (JapaneseEra) doc;
            int j = (japaneseEra.f().j() + i) - 1;
            if (i == 1) {
                return j;
            }
            if (j < -999999999 || j > 999999999 || j < japaneseEra.f().j() || doc != JapaneseEra.c(LocalDate.a(j, 1, 1))) {
                throw new DateTimeException("Invalid yearOfEra value");
            }
            return j;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: e */
    public JapaneseEra c(int i) {
        return JapaneseEra.d(i);
    }

    @Override // o.InterfaceC8528doy
    public String e() {
        return "japanese";
    }

    @Override // o.InterfaceC8528doy
    public doA e(Instant instant, ZoneId zoneId) {
        return super.e(instant, zoneId);
    }

    @Override // o.InterfaceC8528doy
    public InterfaceC8529doz e(doY doy) {
        return super.e(doy);
    }

    @Override // o.AbstractC8521dor
    public InterfaceC8526dow g(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.m;
        Long l = (Long) map.get(chronoField);
        JapaneseEra c = l != null ? c(a(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.A;
        Long l2 = (Long) map.get(chronoField2);
        int a = l2 != null ? a(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (c == null && l2 != null && !map.containsKey(ChronoField.B) && resolverStyle != ResolverStyle.STRICT) {
            c = JapaneseEra.a()[JapaneseEra.a().length - 1];
        }
        if (l2 != null && c != null) {
            if (map.containsKey(ChronoField.y) && map.containsKey(ChronoField.h)) {
                return b(c, a, map, resolverStyle);
            }
            if (map.containsKey(ChronoField.f)) {
                return e(c, a, map, resolverStyle);
            }
        }
        return null;
    }

    @Override // o.AbstractC8521dor, o.InterfaceC8528doy
    /* renamed from: h */
    public JapaneseDate c(Map map, ResolverStyle resolverStyle) {
        return (JapaneseDate) super.c(map, resolverStyle);
    }

    @Override // o.AbstractC8521dor
    public Object writeReplace() {
        return super.writeReplace();
    }
}
