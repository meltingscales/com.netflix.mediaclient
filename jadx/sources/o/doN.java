package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class doN implements doY {
    InterfaceC8528doy a;
    boolean c;
    ZoneId d;
    private LocalTime h;
    private ResolverStyle i;
    private InterfaceC8526dow j;
    final Map b = new HashMap();
    Period e = Period.e;

    private void a() {
        f();
        d();
        j();
        if (this.b.size() > 0) {
            int i = 0;
            loop0: while (i < 50) {
                for (Map.Entry entry : this.b.entrySet()) {
                    InterfaceC8535dpe interfaceC8535dpe = (InterfaceC8535dpe) entry.getKey();
                    doY c = interfaceC8535dpe.c(this.b, this, this.i);
                    if (c != null) {
                        if (c instanceof doA) {
                            doA doa = (doA) c;
                            ZoneId zoneId = this.d;
                            if (zoneId == null) {
                                this.d = doa.b();
                            } else if (!zoneId.equals(doa.b())) {
                                ZoneId zoneId2 = this.d;
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + zoneId2);
                            }
                            c = doa.f();
                        }
                        if (c instanceof InterfaceC8529doz) {
                            InterfaceC8529doz interfaceC8529doz = (InterfaceC8529doz) c;
                            c(interfaceC8529doz.f(), Period.e);
                            b(interfaceC8529doz.a());
                        } else if (c instanceof InterfaceC8526dow) {
                            b((InterfaceC8526dow) c);
                        } else if (!(c instanceof LocalTime)) {
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        } else {
                            c((LocalTime) c, Period.e);
                        }
                    } else if (!this.b.containsKey(interfaceC8535dpe)) {
                        break;
                    }
                    i++;
                }
            }
            if (i == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i > 0) {
                f();
                d();
                j();
            }
        }
    }

    private void b() {
        InterfaceC8526dow interfaceC8526dow = this.j;
        if (interfaceC8526dow != null) {
            d(interfaceC8526dow);
        }
        LocalTime localTime = this.h;
        if (localTime != null) {
            d(localTime);
            if (this.j == null || this.b.size() <= 0) {
                return;
            }
            d(this.j.a(this.h));
        }
    }

    private void b(ZoneId zoneId) {
        Map map = this.b;
        ChronoField chronoField = ChronoField.l;
        doA e = this.a.e(Instant.d(((Long) map.remove(chronoField)).longValue()), zoneId);
        b(e.e());
        e(chronoField, ChronoField.C, Long.valueOf(e.h().e()));
    }

    private void b(InterfaceC8526dow interfaceC8526dow) {
        InterfaceC8526dow interfaceC8526dow2 = this.j;
        if (interfaceC8526dow2 != null) {
            if (interfaceC8526dow == null || interfaceC8526dow2.equals(interfaceC8526dow)) {
                return;
            }
            InterfaceC8526dow interfaceC8526dow3 = this.j;
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + interfaceC8526dow3 + " " + interfaceC8526dow);
        } else if (interfaceC8526dow != null) {
            if (this.a.equals(interfaceC8526dow.d())) {
                this.j = interfaceC8526dow;
                return;
            }
            InterfaceC8528doy interfaceC8528doy = this.a;
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + interfaceC8528doy);
        }
    }

    private void c(long j, long j2, long j3, long j4) {
        LocalTime c;
        Period period;
        if (this.i == ResolverStyle.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            c = LocalTime.b(Math.floorMod(addExact, 86400000000000L));
            period = Period.b((int) Math.floorDiv(addExact, 86400000000000L));
        } else {
            int b = ChronoField.v.b(j2);
            int b2 = ChronoField.w.b(j4);
            if (this.i == ResolverStyle.SMART && j == 24 && b == 0 && j3 == 0 && b2 == 0) {
                c = LocalTime.b;
                period = Period.b(1);
            } else {
                c = LocalTime.c(ChronoField.n.b(j), b, ChronoField.D.b(j3), b2);
                period = Period.e;
            }
        }
        c(c, period);
    }

    private void c(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.h;
        if (localTime2 == null) {
            this.h = localTime;
        } else if (!localTime2.equals(localTime)) {
            LocalTime localTime3 = this.h;
            throw new DateTimeException("Conflict found: Fields resolved to different times: " + localTime3 + " " + localTime);
        } else if (!this.e.a() && !period.a() && !this.e.equals(period)) {
            Period period2 = this.e;
            throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + period2 + " " + period);
        }
        this.e = period;
    }

    private void d() {
        b(this.a.c(this.b, this.i));
    }

    private void d(doY doy) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC8535dpe interfaceC8535dpe = (InterfaceC8535dpe) entry.getKey();
            if (doy.e(interfaceC8535dpe)) {
                try {
                    long a = doy.a(interfaceC8535dpe);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (a != longValue) {
                        throw new DateTimeException("Conflict found: Field " + interfaceC8535dpe + " " + a + " differs from " + interfaceC8535dpe + " " + longValue + " derived from " + doy);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void e() {
        if (this.h == null) {
            if (this.b.containsKey(ChronoField.l) || this.b.containsKey(ChronoField.C) || this.b.containsKey(ChronoField.D)) {
                Map map = this.b;
                ChronoField chronoField = ChronoField.w;
                if (map.containsKey(chronoField)) {
                    long longValue = ((Long) this.b.get(chronoField)).longValue();
                    this.b.put(ChronoField.p, Long.valueOf(longValue / 1000));
                    this.b.put(ChronoField.r, Long.valueOf(longValue / 1000000));
                    return;
                }
                this.b.put(chronoField, 0L);
                this.b.put(ChronoField.p, 0L);
                this.b.put(ChronoField.r, 0L);
            }
        }
    }

    private void e(InterfaceC8535dpe interfaceC8535dpe, InterfaceC8535dpe interfaceC8535dpe2, Long l) {
        Long l2 = (Long) this.b.put(interfaceC8535dpe2, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + interfaceC8535dpe2 + " " + l2 + " differs from " + interfaceC8535dpe2 + " " + l + " while resolving  " + interfaceC8535dpe);
    }

    private void f() {
        if (this.b.containsKey(ChronoField.l)) {
            ZoneId zoneId = this.d;
            if (zoneId == null) {
                Long l = (Long) this.b.get(ChronoField.u);
                if (l == null) {
                    return;
                }
                zoneId = ZoneOffset.e(l.intValue());
            }
            b(zoneId);
        }
    }

    private void g() {
        if (this.j == null || this.h == null || this.e.a()) {
            return;
        }
        this.j = this.j.b(this.e);
        this.e = Period.e;
    }

    private void h() {
        Map map;
        ChronoField chronoField;
        if (this.h == null) {
            Map map2 = this.b;
            ChronoField chronoField2 = ChronoField.r;
            long j = 1000;
            if (map2.containsKey(chronoField2)) {
                long longValue = ((Long) this.b.remove(chronoField2)).longValue();
                Map map3 = this.b;
                ChronoField chronoField3 = ChronoField.p;
                if (map3.containsKey(chronoField3)) {
                    longValue = (longValue * 1000) + (((Long) this.b.get(chronoField3)).longValue() % 1000);
                    e(chronoField2, chronoField3, Long.valueOf(longValue));
                    this.b.remove(chronoField3);
                    map = this.b;
                    chronoField = ChronoField.w;
                } else {
                    map = this.b;
                    chronoField = ChronoField.w;
                    j = 1000000;
                }
                map.put(chronoField, Long.valueOf(longValue * j));
            } else {
                Map map4 = this.b;
                ChronoField chronoField4 = ChronoField.p;
                if (map4.containsKey(chronoField4)) {
                    this.b.put(ChronoField.w, Long.valueOf(((Long) this.b.remove(chronoField4)).longValue() * 1000));
                }
            }
            Map map5 = this.b;
            ChronoField chronoField5 = ChronoField.n;
            Long l = (Long) map5.get(chronoField5);
            if (l != null) {
                Map map6 = this.b;
                ChronoField chronoField6 = ChronoField.v;
                Long l2 = (Long) map6.get(chronoField6);
                Map map7 = this.b;
                ChronoField chronoField7 = ChronoField.D;
                Long l3 = (Long) map7.get(chronoField7);
                Map map8 = this.b;
                ChronoField chronoField8 = ChronoField.w;
                Long l4 = (Long) map8.get(chronoField8);
                if (l2 == null && (l3 != null || l4 != null)) {
                    return;
                }
                if (l2 != null && l3 == null && l4 != null) {
                    return;
                }
                c(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                this.b.remove(chronoField5);
                this.b.remove(chronoField6);
                this.b.remove(chronoField7);
                this.b.remove(chronoField8);
            }
        }
        if (this.i == ResolverStyle.LENIENT || this.b.size() <= 0) {
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            InterfaceC8535dpe interfaceC8535dpe = (InterfaceC8535dpe) entry.getKey();
            if ((interfaceC8535dpe instanceof ChronoField) && interfaceC8535dpe.b()) {
                ((ChronoField) interfaceC8535dpe).d(((Long) entry.getValue()).longValue());
            }
        }
    }

    private void i() {
        doA b;
        if (this.j == null || this.h == null) {
            return;
        }
        Long l = (Long) this.b.get(ChronoField.u);
        if (l != null) {
            b = this.j.a(this.h).b((ZoneId) ZoneOffset.e(l.intValue()));
        } else if (this.d == null) {
            return;
        } else {
            b = this.j.a(this.h).b(this.d);
        }
        this.b.put(ChronoField.l, Long.valueOf(b.k()));
    }

    private void j() {
        InterfaceC8535dpe interfaceC8535dpe;
        Long valueOf;
        long multiplyExact;
        Map map = this.b;
        ChronoField chronoField = ChronoField.i;
        if (map.containsKey(chronoField)) {
            long longValue = ((Long) this.b.remove(chronoField)).longValue();
            ResolverStyle resolverStyle = this.i;
            if (resolverStyle == ResolverStyle.STRICT || (resolverStyle == ResolverStyle.SMART && longValue != 0)) {
                chronoField.d(longValue);
            }
            InterfaceC8535dpe interfaceC8535dpe2 = ChronoField.n;
            if (longValue == 24) {
                longValue = 0;
            }
            e(chronoField, interfaceC8535dpe2, Long.valueOf(longValue));
        }
        Map map2 = this.b;
        ChronoField chronoField2 = ChronoField.g;
        if (map2.containsKey(chronoField2)) {
            long longValue2 = ((Long) this.b.remove(chronoField2)).longValue();
            ResolverStyle resolverStyle2 = this.i;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && longValue2 != 0)) {
                chronoField2.d(longValue2);
            }
            e(chronoField2, ChronoField.f13342o, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.b;
        ChronoField chronoField3 = ChronoField.b;
        if (map3.containsKey(chronoField3)) {
            Map map4 = this.b;
            ChronoField chronoField4 = ChronoField.f13342o;
            if (map4.containsKey(chronoField4)) {
                long longValue3 = ((Long) this.b.remove(chronoField3)).longValue();
                long longValue4 = ((Long) this.b.remove(chronoField4)).longValue();
                if (this.i == ResolverStyle.LENIENT) {
                    interfaceC8535dpe = ChronoField.n;
                    multiplyExact = Math.multiplyExact(longValue3, 12L);
                    valueOf = Long.valueOf(Math.addExact(multiplyExact, longValue4));
                } else {
                    chronoField3.d(longValue3);
                    chronoField4.d(longValue3);
                    interfaceC8535dpe = ChronoField.n;
                    valueOf = Long.valueOf((longValue3 * 12) + longValue4);
                }
                e(chronoField3, interfaceC8535dpe, valueOf);
            }
        }
        Map map5 = this.b;
        ChronoField chronoField5 = ChronoField.x;
        if (map5.containsKey(chronoField5)) {
            long longValue5 = ((Long) this.b.remove(chronoField5)).longValue();
            if (this.i != ResolverStyle.LENIENT) {
                chronoField5.d(longValue5);
            }
            e(chronoField5, ChronoField.n, Long.valueOf(longValue5 / 3600000000000L));
            e(chronoField5, ChronoField.v, Long.valueOf((longValue5 / 60000000000L) % 60));
            e(chronoField5, ChronoField.D, Long.valueOf((longValue5 / 1000000000) % 60));
            e(chronoField5, ChronoField.w, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.b;
        ChronoField chronoField6 = ChronoField.q;
        if (map6.containsKey(chronoField6)) {
            long longValue6 = ((Long) this.b.remove(chronoField6)).longValue();
            if (this.i != ResolverStyle.LENIENT) {
                chronoField6.d(longValue6);
            }
            e(chronoField6, ChronoField.C, Long.valueOf(longValue6 / 1000000));
            e(chronoField6, ChronoField.p, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.b;
        ChronoField chronoField7 = ChronoField.t;
        if (map7.containsKey(chronoField7)) {
            long longValue7 = ((Long) this.b.remove(chronoField7)).longValue();
            if (this.i != ResolverStyle.LENIENT) {
                chronoField7.d(longValue7);
            }
            e(chronoField7, ChronoField.C, Long.valueOf(longValue7 / 1000));
            e(chronoField7, ChronoField.r, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.b;
        ChronoField chronoField8 = ChronoField.C;
        if (map8.containsKey(chronoField8)) {
            long longValue8 = ((Long) this.b.remove(chronoField8)).longValue();
            if (this.i != ResolverStyle.LENIENT) {
                chronoField8.d(longValue8);
            }
            e(chronoField8, ChronoField.n, Long.valueOf(longValue8 / 3600));
            e(chronoField8, ChronoField.v, Long.valueOf((longValue8 / 60) % 60));
            e(chronoField8, ChronoField.D, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.b;
        ChronoField chronoField9 = ChronoField.s;
        if (map9.containsKey(chronoField9)) {
            long longValue9 = ((Long) this.b.remove(chronoField9)).longValue();
            if (this.i != ResolverStyle.LENIENT) {
                chronoField9.d(longValue9);
            }
            e(chronoField9, ChronoField.n, Long.valueOf(longValue9 / 60));
            e(chronoField9, ChronoField.v, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.b;
        ChronoField chronoField10 = ChronoField.w;
        if (map10.containsKey(chronoField10)) {
            long longValue10 = ((Long) this.b.get(chronoField10)).longValue();
            ResolverStyle resolverStyle3 = this.i;
            ResolverStyle resolverStyle4 = ResolverStyle.LENIENT;
            if (resolverStyle3 != resolverStyle4) {
                chronoField10.d(longValue10);
            }
            Map map11 = this.b;
            ChronoField chronoField11 = ChronoField.p;
            if (map11.containsKey(chronoField11)) {
                long longValue11 = ((Long) this.b.remove(chronoField11)).longValue();
                if (this.i != resolverStyle4) {
                    chronoField11.d(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                e(chronoField11, chronoField10, Long.valueOf(longValue10));
            }
            Map map12 = this.b;
            ChronoField chronoField12 = ChronoField.r;
            if (map12.containsKey(chronoField12)) {
                long longValue12 = ((Long) this.b.remove(chronoField12)).longValue();
                if (this.i != resolverStyle4) {
                    chronoField12.d(longValue12);
                }
                e(chronoField12, chronoField10, Long.valueOf((longValue12 * 1000000) + (longValue10 % 1000000)));
            }
        }
        Map map13 = this.b;
        ChronoField chronoField13 = ChronoField.n;
        if (map13.containsKey(chronoField13)) {
            Map map14 = this.b;
            ChronoField chronoField14 = ChronoField.v;
            if (map14.containsKey(chronoField14)) {
                Map map15 = this.b;
                ChronoField chronoField15 = ChronoField.D;
                if (map15.containsKey(chronoField15) && this.b.containsKey(chronoField10)) {
                    c(((Long) this.b.remove(chronoField13)).longValue(), ((Long) this.b.remove(chronoField14)).longValue(), ((Long) this.b.remove(chronoField15)).longValue(), ((Long) this.b.remove(chronoField10)).longValue());
                }
            }
        }
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Long l = (Long) this.b.get(interfaceC8535dpe);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC8526dow interfaceC8526dow = this.j;
        if (interfaceC8526dow == null || !interfaceC8526dow.e(interfaceC8535dpe)) {
            LocalTime localTime = this.h;
            if (localTime == null || !localTime.e(interfaceC8535dpe)) {
                if (interfaceC8535dpe instanceof ChronoField) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
                }
                return interfaceC8535dpe.d(this);
            }
            return this.h.a(interfaceC8535dpe);
        }
        return this.j.a(interfaceC8535dpe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public doY a(ResolverStyle resolverStyle, Set set) {
        if (set != null) {
            this.b.keySet().retainAll(set);
        }
        this.i = resolverStyle;
        a();
        h();
        b();
        g();
        e();
        i();
        return this;
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.h()) {
            return this.d;
        }
        if (interfaceC8537dpg == AbstractC8538dph.c()) {
            return this.a;
        }
        if (interfaceC8537dpg == AbstractC8538dph.a()) {
            InterfaceC8526dow interfaceC8526dow = this.j;
            if (interfaceC8526dow != null) {
                return LocalDate.e((doY) interfaceC8526dow);
            }
            return null;
        } else if (interfaceC8537dpg == AbstractC8538dph.e()) {
            return this.h;
        } else {
            if (interfaceC8537dpg != AbstractC8538dph.b()) {
                if (interfaceC8537dpg != AbstractC8538dph.g() && interfaceC8537dpg == AbstractC8538dph.d()) {
                    return null;
                }
                return interfaceC8537dpg.e(this);
            }
            Long l = (Long) this.b.get(ChronoField.u);
            if (l != null) {
                return ZoneOffset.e(l.intValue());
            }
            ZoneId zoneId = this.d;
            return zoneId instanceof ZoneOffset ? zoneId : interfaceC8537dpg.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public doN c() {
        doN don = new doN();
        don.b.putAll(this.b);
        don.d = this.d;
        don.a = this.a;
        don.c = this.c;
        return don;
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        InterfaceC8526dow interfaceC8526dow;
        LocalTime localTime;
        return this.b.containsKey(interfaceC8535dpe) || ((interfaceC8526dow = this.j) != null && interfaceC8526dow.e(interfaceC8535dpe)) || (((localTime = this.h) != null && localTime.e(interfaceC8535dpe)) || !(interfaceC8535dpe == null || (interfaceC8535dpe instanceof ChronoField) || !interfaceC8535dpe.a(this)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.b);
        sb.append(',');
        sb.append(this.a);
        if (this.d != null) {
            sb.append(',');
            sb.append(this.d);
        }
        if (this.j != null || this.h != null) {
            sb.append(" resolved to ");
            InterfaceC8526dow interfaceC8526dow = this.j;
            if (interfaceC8526dow != null) {
                sb.append(interfaceC8526dow);
                if (this.h != null) {
                    sb.append('T');
                }
            }
            sb.append(this.h);
        }
        return sb.toString();
    }
}
