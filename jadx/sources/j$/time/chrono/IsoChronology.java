package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AbstractC8515dol;
import o.AbstractC8520doq;
import o.AbstractC8521dor;
import o.doC;
import o.doY;

/* loaded from: classes.dex */
public final class IsoChronology extends AbstractC8521dor implements Serializable {
    public static final IsoChronology d = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: a */
    public LocalDate e(long j) {
        return LocalDate.b(j);
    }

    @Override // o.InterfaceC8528doy
    public ValueRange a(ChronoField chronoField) {
        return chronoField.a();
    }

    @Override // o.InterfaceC8528doy
    public List a() {
        return AbstractC8520doq.a(IsoEra.values());
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: b */
    public ZonedDateTime e(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.e(instant, zoneId);
    }

    @Override // o.InterfaceC8528doy
    public String b() {
        return "ISO";
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public LocalDate b(doY doy) {
        return LocalDate.e(doy);
    }

    @Override // o.InterfaceC8528doy
    public boolean c(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public LocalDate c() {
        return e(Clock.c());
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public IsoEra c(int i) {
        return IsoEra.b(i);
    }

    @Override // o.AbstractC8521dor
    public void d(Map map, ResolverStyle resolverStyle) {
        long floorDiv;
        ChronoField chronoField = ChronoField.z;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.d(l.longValue());
            }
            d(map, ChronoField.y, AbstractC8515dol.e(l.longValue(), 12) + 1);
            ChronoField chronoField2 = ChronoField.B;
            floorDiv = Math.floorDiv(l.longValue(), 12L);
            d(map, chronoField2, floorDiv);
        }
    }

    @Override // o.InterfaceC8528doy
    public int e(doC doc, int i) {
        if (doc instanceof IsoEra) {
            return doc == IsoEra.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: e */
    public LocalDate b(int i, int i2) {
        return LocalDate.a(i, i2);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: e */
    public LocalDate b(int i, int i2, int i3) {
        return LocalDate.a(i, i2, i3);
    }

    public LocalDate e(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return b(LocalDate.e(clock));
    }

    @Override // o.InterfaceC8528doy
    public String e() {
        return "iso8601";
    }

    @Override // o.AbstractC8521dor, o.InterfaceC8528doy
    /* renamed from: h */
    public LocalDate c(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.c(map, resolverStyle);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: i */
    public ZonedDateTime a(doY doy) {
        return ZonedDateTime.c(doy);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: j */
    public LocalDateTime e(doY doy) {
        return LocalDateTime.d(doy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC8521dor
    /* renamed from: k */
    public LocalDate f(Map map, ResolverStyle resolverStyle) {
        int d2;
        ChronoField chronoField = ChronoField.B;
        int b = chronoField.b(((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.a(b, 1, 1).c(Math.subtractExact(((Long) map.remove(ChronoField.y)).longValue(), 1L)).d(Math.subtractExact(((Long) map.remove(ChronoField.h)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.y;
        int b2 = chronoField2.b(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.h;
        int b3 = chronoField3.b(((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (b2 != 4 && b2 != 6 && b2 != 9 && b2 != 11) {
                d2 = b2 == 2 ? Month.FEBRUARY.d(Year.b(b)) : 30;
            }
            b3 = Math.min(b3, d2);
        }
        return LocalDate.a(b, b2, b3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r7 > 0) goto L14;
     */
    @Override // o.AbstractC8521dor
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j$.time.LocalDate g(java.util.Map r10, j$.time.format.ResolverStyle r11) {
        /*
            r9 = this;
            j$.time.temporal.ChronoField r0 = j$.time.temporal.ChronoField.A
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L9a
            j$.time.format.ResolverStyle r2 = j$.time.format.ResolverStyle.LENIENT
            if (r11 == r2) goto L15
            long r2 = r1.longValue()
            r0.d(r2)
        L15:
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.m
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L5e
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.B
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.ResolverStyle r8 = j$.time.format.ResolverStyle.STRICT
            if (r11 != r8) goto L42
            if (r7 == 0) goto L3e
            long r7 = r7.longValue()
            long r0 = r1.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L51
            goto L5a
        L3e:
            r10.put(r0, r1)
            goto Laf
        L42:
            if (r7 == 0) goto L56
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L4d
            goto L56
        L4d:
            long r0 = r1.longValue()
        L51:
            long r0 = java.lang.Math.subtractExact(r5, r0)
            goto L5a
        L56:
            long r0 = r1.longValue()
        L5a:
            r9.d(r10, r2, r0)
            goto Laf
        L5e:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L6d
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.B
            long r0 = r1.longValue()
            goto L7f
        L6d:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L83
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.B
            long r0 = r1.longValue()
            long r0 = java.lang.Math.subtractExact(r5, r0)
        L7f:
            r9.d(r10, r11, r0)
            goto Laf
        L83:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Invalid value for era: "
            r10.append(r11)
            r10.append(r2)
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9a:
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.m
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto Laf
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.d(r0)
        Laf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.IsoChronology.g(java.util.Map, j$.time.format.ResolverStyle):j$.time.LocalDate");
    }

    @Override // o.AbstractC8521dor
    public Object writeReplace() {
        return super.writeReplace();
    }
}
