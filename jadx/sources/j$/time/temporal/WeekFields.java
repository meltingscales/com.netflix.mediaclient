package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.format.ResolverStyle;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class WeekFields implements Serializable {
    private static final long serialVersionUID = -1177360819670808121L;
    private final int f;
    private final DayOfWeek g;
    private static final ConcurrentMap d = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields e = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields a = e(DayOfWeek.SUNDAY, 1);
    public static final InterfaceC8540dpj b = IsoFields.a;
    private final transient InterfaceC8535dpe c = e.c(this);
    private final transient InterfaceC8535dpe i = e.e(this);
    private final transient InterfaceC8535dpe m = e.a(this);
    private final transient InterfaceC8535dpe h = e.b(this);
    private final transient InterfaceC8535dpe j = e.d(this);

    /* loaded from: classes5.dex */
    static class e implements InterfaceC8535dpe {
        private final InterfaceC8540dpj d;
        private final WeekFields f;
        private final InterfaceC8540dpj h;
        private final ValueRange i;
        private final String j;
        private static final ValueRange c = ValueRange.b(1, 7);
        private static final ValueRange a = ValueRange.b(0, 1, 4, 6);
        private static final ValueRange b = ValueRange.b(0, 1, 52, 54);
        private static final ValueRange e = ValueRange.a(1, 52, 53);

        private e(String str, WeekFields weekFields, InterfaceC8540dpj interfaceC8540dpj, InterfaceC8540dpj interfaceC8540dpj2, ValueRange valueRange) {
            this.j = str;
            this.f = weekFields;
            this.d = interfaceC8540dpj;
            this.h = interfaceC8540dpj2;
            this.i = valueRange;
        }

        private int a(int i) {
            return Math.floorMod(i - this.f.e().a(), 7) + 1;
        }

        private int a(int i, int i2) {
            int floorMod = Math.floorMod(i - i2, 7);
            return floorMod + 1 > this.f.a() ? 7 - floorMod : -floorMod;
        }

        private ValueRange a(doY doy, InterfaceC8535dpe interfaceC8535dpe) {
            int a2 = a(doy.b(interfaceC8535dpe), c(doy));
            ValueRange d = doy.d(interfaceC8535dpe);
            return ValueRange.b(b(a2, (int) d.d()), b(a2, (int) d.e()));
        }

        static e a(WeekFields weekFields) {
            return new e("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, b);
        }

        private int b(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        private int b(doY doy) {
            int c2 = c(doy);
            int b2 = doy.b(ChronoField.B);
            ChronoField chronoField = ChronoField.f;
            int b3 = doy.b(chronoField);
            int a2 = a(b3, c2);
            int b4 = b(a2, b3);
            return b4 == 0 ? b2 - 1 : b4 >= b(a2, ((int) doy.d(chronoField).e()) + this.f.a()) ? b2 + 1 : b2;
        }

        static e b(WeekFields weekFields) {
            return new e("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.a, e);
        }

        private InterfaceC8526dow b(Map map, InterfaceC8528doy interfaceC8528doy, int i, long j, long j2, int i2, ResolverStyle resolverStyle) {
            InterfaceC8526dow b2;
            long multiplyExact;
            if (resolverStyle == ResolverStyle.LENIENT) {
                InterfaceC8526dow b3 = interfaceC8528doy.b(i, 1, 1).b(Math.subtractExact(j, 1L), ChronoUnit.MONTHS);
                long subtractExact = Math.subtractExact(j2, f(b3));
                int c2 = c(b3);
                multiplyExact = Math.multiplyExact(subtractExact, 7L);
                b2 = b3.b(Math.addExact(multiplyExact, i2 - c2), ChronoUnit.DAYS);
            } else {
                ChronoField chronoField = ChronoField.y;
                InterfaceC8526dow b4 = interfaceC8528doy.b(i, chronoField.b(j), 1);
                b2 = b4.b((((int) (this.i.a(j2, this) - f(b4))) * 7) + (i2 - c(b4)), ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && b2.a(chronoField) != j) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
            map.remove(this);
            map.remove(ChronoField.B);
            map.remove(ChronoField.y);
            map.remove(ChronoField.j);
            return b2;
        }

        private InterfaceC8526dow b(Map map, InterfaceC8528doy interfaceC8528doy, int i, ResolverStyle resolverStyle) {
            InterfaceC8526dow c2;
            int a2 = this.f.j.a().a(((Long) map.get(this.f.j)).longValue(), this.f.j);
            if (resolverStyle == ResolverStyle.LENIENT) {
                c2 = c(interfaceC8528doy, a2, 1, i).b(Math.subtractExact(((Long) map.get(this.f.h)).longValue(), 1L), ChronoUnit.WEEKS);
            } else {
                c2 = c(interfaceC8528doy, a2, this.f.h.a().a(((Long) map.get(this.f.h)).longValue(), this.f.h), i);
                if (resolverStyle == ResolverStyle.STRICT && b(c2) != a2) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
            }
            map.remove(this);
            map.remove(this.f.j);
            map.remove(this.f.h);
            map.remove(ChronoField.j);
            return c2;
        }

        private int c(doY doy) {
            return Math.floorMod(doy.b(ChronoField.j) - this.f.e().a(), 7) + 1;
        }

        static e c(WeekFields weekFields) {
            return new e("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, c);
        }

        private InterfaceC8526dow c(Map map, InterfaceC8528doy interfaceC8528doy, int i, long j, int i2, ResolverStyle resolverStyle) {
            InterfaceC8526dow b2;
            long multiplyExact;
            InterfaceC8526dow b3 = interfaceC8528doy.b(i, 1, 1);
            if (resolverStyle == ResolverStyle.LENIENT) {
                long subtractExact = Math.subtractExact(j, g(b3));
                int c2 = c(b3);
                multiplyExact = Math.multiplyExact(subtractExact, 7L);
                b2 = b3.b(Math.addExact(multiplyExact, i2 - c2), ChronoUnit.DAYS);
            } else {
                b2 = b3.b((((int) (this.i.a(j, this) - g(b3))) * 7) + (i2 - c(b3)), ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && b2.a(ChronoField.B) != i) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                }
            }
            map.remove(this);
            map.remove(ChronoField.B);
            map.remove(ChronoField.j);
            return b2;
        }

        private InterfaceC8526dow c(InterfaceC8528doy interfaceC8528doy, int i, int i2, int i3) {
            InterfaceC8526dow b2 = interfaceC8528doy.b(i, 1, 1);
            int a2 = a(1, c(b2));
            return b2.b((-a2) + (i3 - 1) + ((Math.min(i2, b(a2, b2.k() + this.f.a()) - 1) - 1) * 7), ChronoUnit.DAYS);
        }

        static e d(WeekFields weekFields) {
            return new e("WeekBasedYear", weekFields, IsoFields.a, ChronoUnit.FOREVER, ChronoField.B.a());
        }

        static e e(WeekFields weekFields) {
            return new e("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, a);
        }

        private long f(doY doy) {
            int c2 = c(doy);
            int b2 = doy.b(ChronoField.h);
            return b(a(b2, c2), b2);
        }

        private long g(doY doy) {
            int c2 = c(doy);
            int b2 = doy.b(ChronoField.f);
            return b(a(b2, c2), b2);
        }

        private ValueRange i(doY doy) {
            ChronoField chronoField = ChronoField.f;
            if (doy.e(chronoField)) {
                int c2 = c(doy);
                int b2 = doy.b(chronoField);
                int a2 = a(b2, c2);
                int b3 = b(a2, b2);
                if (b3 == 0) {
                    return i(InterfaceC8528doy.d(doy).b(doy).e(b2 + 7, ChronoUnit.DAYS));
                }
                int e2 = (int) doy.d(chronoField).e();
                int b4 = b(a2, this.f.a() + e2);
                return b3 >= b4 ? i(InterfaceC8528doy.d(doy).b(doy).b((e2 - b2) + 8, ChronoUnit.DAYS)) : ValueRange.b(1L, b4 - 1);
            }
            return b;
        }

        private int j(doY doy) {
            int b2;
            int c2 = c(doy);
            ChronoField chronoField = ChronoField.f;
            int b3 = doy.b(chronoField);
            int a2 = a(b3, c2);
            int b4 = b(a2, b3);
            return b4 == 0 ? j(InterfaceC8528doy.d(doy).b(doy).e(b3, ChronoUnit.DAYS)) : (b4 <= 50 || b4 < (b2 = b(a2, ((int) doy.d(chronoField).e()) + this.f.a()))) ? b4 : (b4 - b2) + 1;
        }

        @Override // o.InterfaceC8535dpe
        public ValueRange a() {
            return this.i;
        }

        @Override // o.InterfaceC8535dpe
        public boolean a(doY doy) {
            ChronoField chronoField;
            if (doy.e(ChronoField.j)) {
                InterfaceC8540dpj interfaceC8540dpj = this.h;
                if (interfaceC8540dpj == ChronoUnit.WEEKS) {
                    return true;
                }
                if (interfaceC8540dpj == ChronoUnit.MONTHS) {
                    chronoField = ChronoField.h;
                } else if (interfaceC8540dpj == ChronoUnit.YEARS || interfaceC8540dpj == WeekFields.b) {
                    chronoField = ChronoField.f;
                } else if (interfaceC8540dpj != ChronoUnit.FOREVER) {
                    return false;
                } else {
                    chronoField = ChronoField.B;
                }
                return doy.e(chronoField);
            }
            return false;
        }

        @Override // o.InterfaceC8535dpe
        public boolean b() {
            return false;
        }

        @Override // o.InterfaceC8535dpe
        public long d(doY doy) {
            int b2;
            InterfaceC8540dpj interfaceC8540dpj = this.h;
            if (interfaceC8540dpj == ChronoUnit.WEEKS) {
                b2 = c(doy);
            } else if (interfaceC8540dpj == ChronoUnit.MONTHS) {
                return f(doy);
            } else {
                if (interfaceC8540dpj == ChronoUnit.YEARS) {
                    return g(doy);
                }
                if (interfaceC8540dpj == WeekFields.b) {
                    b2 = j(doy);
                } else if (interfaceC8540dpj != ChronoUnit.FOREVER) {
                    InterfaceC8540dpj interfaceC8540dpj2 = this.h;
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC8540dpj2 + ", this: " + this);
                } else {
                    b2 = b(doy);
                }
            }
            return b2;
        }

        @Override // o.InterfaceC8535dpe
        public doX d(doX dox, long j) {
            int a2 = this.i.a(j, this);
            int b2 = dox.b(this);
            if (a2 == b2) {
                return dox;
            }
            if (this.h == ChronoUnit.FOREVER) {
                int b3 = dox.b(this.f.c);
                return c(InterfaceC8528doy.d(dox), (int) j, dox.b(this.f.h), b3);
            }
            return dox.b(a2 - b2, this.d);
        }

        @Override // o.InterfaceC8535dpe
        public boolean d() {
            return true;
        }

        @Override // o.InterfaceC8535dpe
        public ValueRange e(doY doy) {
            InterfaceC8540dpj interfaceC8540dpj = this.h;
            if (interfaceC8540dpj == ChronoUnit.WEEKS) {
                return this.i;
            }
            if (interfaceC8540dpj == ChronoUnit.MONTHS) {
                return a(doy, ChronoField.h);
            }
            if (interfaceC8540dpj == ChronoUnit.YEARS) {
                return a(doy, ChronoField.f);
            }
            if (interfaceC8540dpj == WeekFields.b) {
                return i(doy);
            }
            if (interfaceC8540dpj == ChronoUnit.FOREVER) {
                return ChronoField.B.a();
            }
            InterfaceC8540dpj interfaceC8540dpj2 = this.h;
            throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC8540dpj2 + ", this: " + this);
        }

        @Override // o.InterfaceC8535dpe
        /* renamed from: e */
        public InterfaceC8526dow c(Map map, doY doy, ResolverStyle resolverStyle) {
            long longValue;
            int intExact = Math.toIntExact(((Long) map.get(this)).longValue());
            if (this.h == ChronoUnit.WEEKS) {
                long floorMod = Math.floorMod((this.f.e().a() - 1) + (this.i.a(longValue, this) - 1), 7) + 1;
                map.remove(this);
                map.put(ChronoField.j, Long.valueOf(floorMod));
                return null;
            }
            ChronoField chronoField = ChronoField.j;
            if (map.containsKey(chronoField)) {
                int a2 = a(chronoField.b(((Long) map.get(chronoField)).longValue()));
                InterfaceC8528doy d = InterfaceC8528doy.d(doy);
                ChronoField chronoField2 = ChronoField.B;
                if (map.containsKey(chronoField2)) {
                    int b2 = chronoField2.b(((Long) map.get(chronoField2)).longValue());
                    if (this.h == ChronoUnit.MONTHS) {
                        Object obj = ChronoField.y;
                        if (map.containsKey(obj)) {
                            return b(map, d, b2, ((Long) map.get(obj)).longValue(), intExact, a2, resolverStyle);
                        }
                    }
                    if (this.h == ChronoUnit.YEARS) {
                        return c(map, d, b2, intExact, a2, resolverStyle);
                    }
                } else {
                    InterfaceC8540dpj interfaceC8540dpj = this.h;
                    if ((interfaceC8540dpj == WeekFields.b || interfaceC8540dpj == ChronoUnit.FOREVER) && map.containsKey(this.f.j) && map.containsKey(this.f.h)) {
                        return b(map, d, a2, resolverStyle);
                    }
                }
                return null;
            }
            return null;
        }

        public String toString() {
            String str = this.j;
            String weekFields = this.f.toString();
            return str + "[" + weekFields + "]";
        }
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.g = dayOfWeek;
        this.f = i;
    }

    public static WeekFields a(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return e(DayOfWeek.SUNDAY.c(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
    }

    public static WeekFields e(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = d;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields == null) {
            concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
            return (WeekFields) concurrentMap.get(str);
        }
        return weekFields;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.g == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.f;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return e(this.g, this.f);
        } catch (IllegalArgumentException e2) {
            String message = e2.getMessage();
            throw new InvalidObjectException("Invalid serialized WeekFields: " + message);
        }
    }

    public int a() {
        return this.f;
    }

    public InterfaceC8535dpe b() {
        return this.j;
    }

    public InterfaceC8535dpe c() {
        return this.c;
    }

    public InterfaceC8535dpe d() {
        return this.i;
    }

    public DayOfWeek e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public int hashCode() {
        return (this.g.ordinal() * 7) + this.f;
    }

    public InterfaceC8535dpe j() {
        return this.h;
    }

    public String toString() {
        DayOfWeek dayOfWeek = this.g;
        int i = this.f;
        return "WeekFields[" + dayOfWeek + "," + i + "]";
    }
}
