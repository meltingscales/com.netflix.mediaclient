package j$.time;

import j$.time.OffsetDateTime;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8538dph;
import o.InterfaceC8529doz;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doE;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class OffsetDateTime implements doX, doW, Comparable<OffsetDateTime>, Serializable {
    public static final OffsetDateTime a = LocalDateTime.d.e(ZoneOffset.a);
    public static final OffsetDateTime b = LocalDateTime.b.e(ZoneOffset.b);
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime c;
    private final ZoneOffset d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.OffsetDateTime$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.c = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.d = zoneOffset;
    }

    public static OffsetDateTime b(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.e(localDate, localTime), zoneOffset);
    }

    public static OffsetDateTime b(CharSequence charSequence, doE doe) {
        Objects.requireNonNull(doe, "formatter");
        return (OffsetDateTime) doe.a(charSequence, new InterfaceC8537dpg() { // from class: o.dop
            @Override // o.InterfaceC8537dpg
            public final Object e(doY doy) {
                return OffsetDateTime.c(doy);
            }
        });
    }

    public static OffsetDateTime c(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime c(CharSequence charSequence) {
        return b(charSequence, doE.f);
    }

    public static OffsetDateTime c(doY doy) {
        if (doy instanceof OffsetDateTime) {
            return (OffsetDateTime) doy;
        }
        try {
            ZoneOffset e = ZoneOffset.e(doy);
            LocalDate localDate = (LocalDate) doy.b(AbstractC8538dph.a());
            LocalTime localTime = (LocalTime) doy.b(AbstractC8538dph.e());
            return (localDate == null || localTime == null) ? d(Instant.c(doy), e) : b(localDate, localTime, e);
        } catch (DateTimeException e2) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + doy + " of type " + name, e2);
        }
    }

    public static OffsetDateTime d(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset a2 = zoneId.c().a(instant);
        return new OffsetDateTime(LocalDateTime.d(instant.d(), instant.c(), a2), a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime d(ObjectInput objectInput) {
        return c(LocalDateTime.a(objectInput), ZoneOffset.d(objectInput));
    }

    private static int e(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        if (offsetDateTime.a().equals(offsetDateTime2.a())) {
            return offsetDateTime.i().compareTo((InterfaceC8529doz<?>) offsetDateTime2.i());
        }
        int compare = Long.compare(offsetDateTime.c(), offsetDateTime2.c());
        return compare == 0 ? offsetDateTime.h().d() - offsetDateTime2.h().d() : compare;
    }

    private OffsetDateTime e(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.c == localDateTime && this.d.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 10, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        OffsetDateTime c = c(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            return this.c.a(c.b(this.d).c, interfaceC8540dpj);
        }
        return interfaceC8540dpj.d(this, c);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass4.a[((ChronoField) interfaceC8535dpe).ordinal()];
            return i != 1 ? i != 2 ? this.c.a(interfaceC8535dpe) : a().a() : c();
        }
        return interfaceC8535dpe.d(this);
    }

    public ZoneOffset a() {
        return this.d;
    }

    public int b() {
        return this.c.b();
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass4.a[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i != 1) {
                return i != 2 ? this.c.b(interfaceC8535dpe) : a().a();
            }
            throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(interfaceC8535dpe);
    }

    public OffsetDateTime b(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.d)) {
            return this;
        }
        return new OffsetDateTime(this.c.c(zoneOffset.a() - this.d.a()), zoneOffset);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.b() || interfaceC8537dpg == AbstractC8538dph.g()) {
            return a();
        }
        if (interfaceC8537dpg == AbstractC8538dph.h()) {
            return null;
        }
        return interfaceC8537dpg == AbstractC8538dph.a() ? e() : interfaceC8537dpg == AbstractC8538dph.e() ? h() : interfaceC8537dpg == AbstractC8538dph.c() ? IsoChronology.d : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.NANOS : interfaceC8537dpg.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ObjectOutput objectOutput) {
        this.c.e(objectOutput);
        this.d.c(objectOutput);
    }

    public long c() {
        return this.c.b(this.d);
    }

    @Override // o.doX
    /* renamed from: c */
    public OffsetDateTime b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return interfaceC8540dpj instanceof ChronoUnit ? e(this.c.f(j, interfaceC8540dpj), this.d) : (OffsetDateTime) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doX
    /* renamed from: c */
    public OffsetDateTime a(doW dow) {
        return ((dow instanceof LocalDate) || (dow instanceof LocalTime) || (dow instanceof LocalDateTime)) ? e(this.c.c(dow), this.d) : dow instanceof Instant ? d((Instant) dow, this.d) : dow instanceof ZoneOffset ? e(this.c, (ZoneOffset) dow) : dow instanceof OffsetDateTime ? (OffsetDateTime) dow : (OffsetDateTime) dow.e(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(OffsetDateTime offsetDateTime) {
        int e = e(this, offsetDateTime);
        return e == 0 ? i().compareTo((InterfaceC8529doz<?>) offsetDateTime.i()) : e;
    }

    public Instant d() {
        return this.c.a(this.d);
    }

    @Override // o.doX
    /* renamed from: d */
    public OffsetDateTime e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? (interfaceC8535dpe == ChronoField.l || interfaceC8535dpe == ChronoField.u) ? interfaceC8535dpe.a() : this.c.d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    public LocalDate e() {
        return this.c.a();
    }

    @Override // o.doX
    /* renamed from: e */
    public OffsetDateTime d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass4.a[chronoField.ordinal()];
            return i != 1 ? i != 2 ? e(this.c.d(interfaceC8535dpe, j), this.d) : e(this.c, ZoneOffset.e(chronoField.b(j))) : d(Instant.e(j, b()), this.d);
        }
        return (OffsetDateTime) interfaceC8535dpe.d(this, j);
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.k, e().l()).d(ChronoField.x, h().b()).d(ChronoField.u, a().a());
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return (interfaceC8535dpe instanceof ChronoField) || (interfaceC8535dpe != null && interfaceC8535dpe.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.c.equals(offsetDateTime.c) && this.d.equals(offsetDateTime.d);
        }
        return false;
    }

    public LocalTime h() {
        return this.c.f();
    }

    public int hashCode() {
        return this.c.hashCode() ^ this.d.hashCode();
    }

    public LocalDateTime i() {
        return this.c;
    }

    public String toString() {
        String localDateTime = this.c.toString();
        String zoneOffset = this.d.toString();
        return localDateTime + zoneOffset;
    }
}
