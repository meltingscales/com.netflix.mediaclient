package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneOffsetTransition;
import j$.time.zone.ZoneRules;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.AbstractC8538dph;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doA;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class ZonedDateTime implements doA<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final ZoneId a;
    private final LocalDateTime b;
    private final ZoneOffset c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.ZonedDateTime$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoField.values().length];
            e = iArr;
            try {
                iArr[ChronoField.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoField.u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.b = localDateTime;
        this.c = zoneOffset;
        this.a = zoneId;
    }

    private ZonedDateTime a(LocalDateTime localDateTime) {
        return a(localDateTime, this.a, this.c);
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneId zoneId) {
        return a(localDateTime, zoneId, (ZoneOffset) null);
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules c = zoneId.c();
        List b = c.b(localDateTime);
        if (b.size() == 1) {
            zoneOffset = (ZoneOffset) b.get(0);
        } else if (b.size() == 0) {
            ZoneOffsetTransition d = c.d(localDateTime);
            localDateTime = localDateTime.c(d.c().b());
            zoneOffset = d.e();
        } else if (zoneOffset == null || !b.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) b.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.c().d(localDateTime, zoneOffset) ? new ZonedDateTime(localDateTime, zoneOffset, zoneId) : d(localDateTime.b(zoneOffset), localDateTime.b(), zoneId);
    }

    private ZonedDateTime a(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.c) || !this.a.c().d(this.b, zoneOffset)) ? this : new ZonedDateTime(this.b, zoneOffset, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime a(ObjectInput objectInput) {
        return c(LocalDateTime.a(objectInput), ZoneOffset.d(objectInput), (ZoneId) Ser.e(objectInput));
    }

    private ZonedDateTime c(LocalDateTime localDateTime) {
        return a(localDateTime, this.c, this.a);
    }

    private static ZonedDateTime c(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffset.equals(zoneId)) {
            return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static ZonedDateTime c(doY doy) {
        if (doy instanceof ZonedDateTime) {
            return (ZonedDateTime) doy;
        }
        try {
            ZoneId a = ZoneId.a(doy);
            ChronoField chronoField = ChronoField.l;
            return doy.e(chronoField) ? d(doy.a(chronoField), doy.b(ChronoField.w), a) : e(LocalDate.e(doy), LocalTime.a(doy), a);
        } catch (DateTimeException e) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + doy + " of type " + name, e);
        }
    }

    private static ZonedDateTime d(long j, int i, ZoneId zoneId) {
        ZoneOffset a = zoneId.c().a(Instant.e(j, i));
        return new ZonedDateTime(LocalDateTime.d(j, i, a), a, zoneId);
    }

    public static ZonedDateTime e(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return d(instant.d(), instant.c(), zoneId);
    }

    public static ZonedDateTime e(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return a(LocalDateTime.e(localDate, localTime), zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    public int a() {
        return this.b.b();
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        ZonedDateTime c = c(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            ZonedDateTime a = c.a(this.a);
            return interfaceC8540dpj.e() ? this.b.a(a.b, interfaceC8540dpj) : i().a(a.i(), interfaceC8540dpj);
        }
        return interfaceC8540dpj.d(this, c);
    }

    @Override // o.doA, o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass2.e[((ChronoField) interfaceC8535dpe).ordinal()];
            return i != 1 ? i != 2 ? this.b.a(interfaceC8535dpe) : d().a() : k();
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doA, o.doX
    /* renamed from: a */
    public ZonedDateTime d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass2.e[chronoField.ordinal()];
            return i != 1 ? i != 2 ? a(this.b.d(interfaceC8535dpe, j)) : a(ZoneOffset.e(chronoField.b(j))) : d(j, a(), this.a);
        }
        return (ZonedDateTime) interfaceC8535dpe.d(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataOutput dataOutput) {
        this.b.e(dataOutput);
        this.c.c(dataOutput);
        this.a.d(dataOutput);
    }

    @Override // o.doA, o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass2.e[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i != 1) {
                return i != 2 ? this.b.b(interfaceC8535dpe) : d().a();
            }
            throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(interfaceC8535dpe);
    }

    @Override // o.doA
    public ZoneId b() {
        return this.a;
    }

    @Override // o.doA
    /* renamed from: b */
    public ZonedDateTime a(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.a.equals(zoneId) ? this : d(this.b.b(this.c), this.b.b(), zoneId);
    }

    @Override // o.doA, o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.a() ? e() : super.b(interfaceC8537dpg);
    }

    @Override // o.doA
    /* renamed from: c */
    public LocalDate e() {
        return this.b.a();
    }

    @Override // o.doA
    /* renamed from: c */
    public ZonedDateTime f(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return interfaceC8540dpj instanceof ChronoUnit ? interfaceC8540dpj.e() ? a(this.b.f(j, interfaceC8540dpj)) : c(this.b.f(j, interfaceC8540dpj)) : (ZonedDateTime) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doA
    /* renamed from: c */
    public ZonedDateTime d(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.a.equals(zoneId) ? this : a(this.b, zoneId, this.c);
    }

    @Override // o.doA
    public ZoneOffset d() {
        return this.c;
    }

    @Override // o.doA, o.doX
    /* renamed from: d */
    public ZonedDateTime e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, interfaceC8540dpj).f(1L, interfaceC8540dpj) : f(-j, interfaceC8540dpj);
    }

    @Override // o.doA, o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? (interfaceC8535dpe == ChronoField.l || interfaceC8535dpe == ChronoField.u) ? interfaceC8535dpe.a() : this.b.d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    @Override // o.doA
    /* renamed from: e */
    public ZonedDateTime c(doW dow) {
        if (dow instanceof LocalDate) {
            return a(LocalDateTime.e((LocalDate) dow, this.b.f()));
        }
        if (dow instanceof LocalTime) {
            return a(LocalDateTime.e(this.b.a(), (LocalTime) dow));
        }
        if (dow instanceof LocalDateTime) {
            return a((LocalDateTime) dow);
        }
        if (dow instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) dow;
            return a(offsetDateTime.i(), this.a, offsetDateTime.a());
        } else if (!(dow instanceof Instant)) {
            return dow instanceof ZoneOffset ? a((ZoneOffset) dow) : (ZonedDateTime) dow.e(this);
        } else {
            Instant instant = (Instant) dow;
            return d(instant.d(), instant.c(), this.a);
        }
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return (interfaceC8535dpe instanceof ChronoField) || (interfaceC8535dpe != null && interfaceC8535dpe.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c) && this.a.equals(zonedDateTime.a);
        }
        return false;
    }

    @Override // o.doA
    /* renamed from: g */
    public LocalDateTime f() {
        return this.b;
    }

    @Override // o.doA
    public LocalTime h() {
        return this.b.f();
    }

    public int hashCode() {
        return (this.b.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.a.hashCode(), 3);
    }

    public OffsetDateTime i() {
        return OffsetDateTime.c(this.b, this.c);
    }

    public String toString() {
        String str = this.b.toString() + this.c.toString();
        ZoneOffset zoneOffset = this.c;
        ZoneId zoneId = this.a;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }
}
