package o;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.chrono.HijrahChronology;
import j$.time.chrono.IsoChronology;
import j$.time.chrono.JapaneseChronology;
import j$.time.chrono.MinguoChronology;
import j$.time.chrono.Ser;
import j$.time.chrono.ThaiBuddhistChronology;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.dor  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8521dor implements InterfaceC8528doy {
    private static final ConcurrentHashMap c = new ConcurrentHashMap();
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final Locale d = new Locale("ja", "JP", "JP");

    public static InterfaceC8528doy a(DataInput dataInput) {
        return InterfaceC8528doy.a(dataInput.readUTF());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.InterfaceC8528doy b(java.lang.String r3) {
        /*
            java.lang.String r0 = "id"
            java.util.Objects.requireNonNull(r3, r0)
        L5:
            o.doy r0 = e(r3)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            boolean r0 = d()
            if (r0 != 0) goto L5
            java.lang.Class<o.doy> r0 = o.InterfaceC8528doy.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            o.doy r1 = (o.InterfaceC8528doy) r1
            java.lang.String r2 = r1.b()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
            java.lang.String r2 = r1.e()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1c
        L3c:
            return r1
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown chronology: "
            r0.append(r1)
            r0.append(r3)
            j$.time.DateTimeException r3 = new j$.time.DateTimeException
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC8521dor.b(java.lang.String):o.doy");
    }

    static InterfaceC8528doy c(InterfaceC8528doy interfaceC8528doy) {
        return e(interfaceC8528doy, interfaceC8528doy.b());
    }

    private static boolean d() {
        if (c.get("ISO") == null) {
            c(HijrahChronology.c);
            c(JapaneseChronology.b);
            c(MinguoChronology.b);
            c(ThaiBuddhistChronology.d);
            Iterator it = ServiceLoader.load(AbstractC8521dor.class, null).iterator();
            while (it.hasNext()) {
                AbstractC8521dor abstractC8521dor = (AbstractC8521dor) it.next();
                if (!abstractC8521dor.b().equals("ISO")) {
                    c(abstractC8521dor);
                }
            }
            c(IsoChronology.d);
            return true;
        }
        return false;
    }

    private static InterfaceC8528doy e(String str) {
        InterfaceC8528doy interfaceC8528doy = (InterfaceC8528doy) c.get(str);
        return interfaceC8528doy == null ? (InterfaceC8528doy) a.get(str) : interfaceC8528doy;
    }

    public static InterfaceC8528doy e(InterfaceC8528doy interfaceC8528doy, String str) {
        String e;
        InterfaceC8528doy interfaceC8528doy2 = (InterfaceC8528doy) c.putIfAbsent(str, interfaceC8528doy);
        if (interfaceC8528doy2 == null && (e = interfaceC8528doy.e()) != null) {
            a.putIfAbsent(e, interfaceC8528doy);
        }
        return interfaceC8528doy2;
    }

    InterfaceC8526dow a(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.d)).longValue(), 1L);
            return b(a2, 1).b(subtractExact, ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(ChronoField.a)).longValue(), 1L), ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.d;
        int a3 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.a;
        InterfaceC8526dow b = b(a2, 1).b(((a3 - 1) * 7) + (a(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3) - 1), ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || b.b(chronoField) == a2) {
            return b;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    InterfaceC8526dow b(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return b(a2, 1).b(Math.subtractExact(((Long) map.remove(ChronoField.f)).longValue(), 1L), ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.f;
        return b(a2, a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2));
    }

    InterfaceC8526dow b(InterfaceC8526dow interfaceC8526dow, long j, long j2, long j3) {
        long j4;
        InterfaceC8526dow b = interfaceC8526dow.b(j, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC8526dow b2 = b.b(j2, chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                b2 = b2.b(Math.subtractExact(j3, 7L) / 7, chronoUnit);
                j4 = j3 + 6;
            }
            return b2.a(doV.c(DayOfWeek.a((int) j3)));
        }
        j4 = j3 - 1;
        b2 = b2.b(j4 / 7, chronoUnit);
        j3 = (j4 % 7) + 1;
        return b2.a(doV.c(DayOfWeek.a((int) j3)));
    }

    public void b(DataOutput dataOutput) {
        dataOutput.writeUTF(b());
    }

    @Override // o.InterfaceC8528doy
    public InterfaceC8526dow c(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.k;
        if (map.containsKey(chronoField)) {
            return e(((Long) map.remove(chronoField)).longValue());
        }
        d(map, resolverStyle);
        InterfaceC8526dow g = g(map, resolverStyle);
        if (g != null) {
            return g;
        }
        if (map.containsKey(ChronoField.B)) {
            if (map.containsKey(ChronoField.y)) {
                if (map.containsKey(ChronoField.h)) {
                    return f(map, resolverStyle);
                }
                if (map.containsKey(ChronoField.e)) {
                    if (map.containsKey(ChronoField.c)) {
                        return j(map, resolverStyle);
                    }
                    if (map.containsKey(ChronoField.j)) {
                        return i(map, resolverStyle);
                    }
                }
            }
            if (map.containsKey(ChronoField.f)) {
                return b(map, resolverStyle);
            }
            if (map.containsKey(ChronoField.d)) {
                if (map.containsKey(ChronoField.a)) {
                    return a(map, resolverStyle);
                }
                if (map.containsKey(ChronoField.j)) {
                    return e(map, resolverStyle);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    protected void d(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.z;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.d(l.longValue());
            }
            InterfaceC8526dow d2 = c().d(ChronoField.h, 1L).d(chronoField, l.longValue());
            ChronoField chronoField2 = ChronoField.y;
            d(map, chronoField2, d2.b(chronoField2));
            ChronoField chronoField3 = ChronoField.B;
            d(map, chronoField3, d2.b(chronoField3));
        }
    }

    public void d(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(InterfaceC8528doy interfaceC8528doy) {
        return b().compareTo(interfaceC8528doy.b());
    }

    InterfaceC8526dow e(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return b(b(a2, 1), 0L, Math.subtractExact(((Long) map.remove(ChronoField.d)).longValue(), 1L), Math.subtractExact(((Long) map.remove(ChronoField.j)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.d;
        int a3 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.j;
        InterfaceC8526dow a4 = b(a2, 1).b((a3 - 1) * 7, ChronoUnit.DAYS).a(doV.c(DayOfWeek.a(a(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3))));
        if (resolverStyle != ResolverStyle.STRICT || a4.b(chronoField) == a2) {
            return a4;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // o.InterfaceC8528doy
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8521dor) && compareTo((AbstractC8521dor) obj) == 0;
    }

    protected InterfaceC8526dow f(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.y)).longValue(), 1L);
            return b(a2, 1, 1).b(subtractExact, ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.h)).longValue(), 1L), ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.y;
        int a3 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.h;
        int a4 = a(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle == ResolverStyle.SMART) {
            try {
                return b(a2, a3, a4);
            } catch (DateTimeException unused) {
                return b(a2, a3, 1).a(doV.b());
            }
        }
        return b(a2, a3, a4);
    }

    protected InterfaceC8526dow g(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField;
        doC doc;
        long j;
        ChronoField chronoField2 = ChronoField.A;
        Long l = (Long) map.remove(chronoField2);
        if (l == null) {
            ChronoField chronoField3 = ChronoField.m;
            if (map.containsKey(chronoField3)) {
                a(chronoField3).c(((Long) map.get(chronoField3)).longValue(), chronoField3);
                return null;
            }
            return null;
        }
        Long l2 = (Long) map.remove(ChronoField.m);
        int a2 = resolverStyle != ResolverStyle.LENIENT ? a(chronoField2).a(l.longValue(), chronoField2) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            d(map, ChronoField.B, e(c(a(chronoField).a(l2.longValue(), chronoField)), a2));
            return null;
        }
        ChronoField chronoField4 = ChronoField.B;
        if (map.containsKey(chronoField4)) {
            doc = b(a(chronoField4).a(((Long) map.get(chronoField4)).longValue(), chronoField4), 1).g();
        } else if (resolverStyle == ResolverStyle.STRICT) {
            map.put(chronoField2, l);
            return null;
        } else {
            List a3 = a();
            if (a3.isEmpty()) {
                j = a2;
                d(map, chronoField4, j);
                return null;
            }
            doc = (doC) a3.get(a3.size() - 1);
        }
        j = e(doc, a2);
        d(map, chronoField4, j);
        return null;
    }

    @Override // o.InterfaceC8528doy
    public int hashCode() {
        return getClass().hashCode() ^ b().hashCode();
    }

    InterfaceC8526dow i(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return b(b(a2, 1, 1), Math.subtractExact(((Long) map.remove(ChronoField.y)).longValue(), 1L), Math.subtractExact(((Long) map.remove(ChronoField.e)).longValue(), 1L), Math.subtractExact(((Long) map.remove(ChronoField.j)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.y;
        int a3 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.e;
        int a4 = a(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.j;
        InterfaceC8526dow a5 = b(a2, a3, 1).b((a4 - 1) * 7, ChronoUnit.DAYS).a(doV.c(DayOfWeek.a(a(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4))));
        if (resolverStyle != ResolverStyle.STRICT || a5.b(chronoField2) == a3) {
            return a5;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    InterfaceC8526dow j(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.B;
        int a2 = a(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.y)).longValue(), 1L);
            long subtractExact2 = Math.subtractExact(((Long) map.remove(ChronoField.e)).longValue(), 1L);
            return b(a2, 1, 1).b(subtractExact, ChronoUnit.MONTHS).b(subtractExact2, ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(ChronoField.c)).longValue(), 1L), ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.y;
        int a3 = a(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.e;
        int a4 = a(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.c;
        InterfaceC8526dow b = b(a2, a3, 1).b(((a4 - 1) * 7) + (a(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1), ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || b.b(chronoField2) == a3) {
            return b;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    @Override // o.InterfaceC8528doy
    public String toString() {
        return b();
    }

    public Object writeReplace() {
        return new Ser((byte) 1, this);
    }
}
