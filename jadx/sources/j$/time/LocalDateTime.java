package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
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
import o.InterfaceC8529doz;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class LocalDateTime implements InterfaceC8529doz<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final LocalTime c;
    public static final LocalDateTime d = e(LocalDate.d, LocalTime.e);
    public static final LocalDateTime b = e(LocalDate.a, LocalTime.c);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalDateTime$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            c = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.c = localTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocalDateTime a(DataInput dataInput) {
        return e(LocalDate.a(dataInput), LocalTime.d(dataInput));
    }

    public static LocalDateTime c(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.a(i, i2, i3), LocalTime.c(i4, i5));
    }

    private LocalDateTime c(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.c == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime d(long j, int i, ZoneOffset zoneOffset) {
        long a;
        long floorDiv;
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.w.d(j2);
        floorDiv = Math.floorDiv(j + zoneOffset.a(), 86400L);
        return new LocalDateTime(LocalDate.b(floorDiv), LocalTime.b((AbstractC8515dol.e(a, 86400) * 1000000000) + j2));
    }

    public static LocalDateTime d(doY doy) {
        if (doy instanceof LocalDateTime) {
            return (LocalDateTime) doy;
        }
        if (doy instanceof ZonedDateTime) {
            return ((ZonedDateTime) doy).f();
        }
        if (doy instanceof OffsetDateTime) {
            return ((OffsetDateTime) doy).i();
        }
        try {
            return new LocalDateTime(LocalDate.e(doy), LocalTime.a(doy));
        } catch (DateTimeException e) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + doy + " of type " + name, e);
        }
    }

    private int e(LocalDateTime localDateTime) {
        int a = this.a.a(localDateTime.a());
        return a == 0 ? this.c.compareTo(localDateTime.f()) : a;
    }

    public static LocalDateTime e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.a(i, i2, i3), LocalTime.c(i4, i5, i6, i7));
    }

    private LocalDateTime e(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        LocalTime b2;
        LocalDate d2;
        if ((j | j2 | j3 | j4) == 0) {
            b2 = this.c;
            d2 = localDate;
        } else {
            long j5 = j4 / 86400000000000L;
            long j6 = j3 / 86400;
            long j7 = j2 / 1440;
            long j8 = j / 24;
            long j9 = i;
            long b3 = this.c.b();
            long j10 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j9) + b3;
            long floorDiv = Math.floorDiv(j10, 86400000000000L);
            long floorMod = Math.floorMod(j10, 86400000000000L);
            b2 = floorMod == b3 ? this.c : LocalTime.b(floorMod);
            d2 = localDate.d(((j5 + j6 + j7 + j8) * j9) + floorDiv);
        }
        return c(d2, b2);
    }

    public static LocalDateTime e(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        long j;
        long j2;
        long multiplyExact;
        long j3;
        LocalDateTime d2 = d(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            if (!interfaceC8540dpj.a()) {
                LocalDate localDate = d2.a;
                if (localDate.d((InterfaceC8526dow) this.a) && d2.c.e(this.c)) {
                    localDate = localDate.e(1L);
                } else if (localDate.a((InterfaceC8526dow) this.a) && d2.c.d(this.c)) {
                    localDate = localDate.d(1L);
                }
                return this.a.a(localDate, interfaceC8540dpj);
            }
            long c = this.a.c(d2.a);
            int i = (c > 0L ? 1 : (c == 0L ? 0 : -1));
            if (i == 0) {
                return this.c.a(d2.c, interfaceC8540dpj);
            }
            long b2 = d2.c.b() - this.c.b();
            if (i > 0) {
                j = c - 1;
                j2 = b2 + 86400000000000L;
            } else {
                j = c + 1;
                j2 = b2 - 86400000000000L;
            }
            switch (AnonymousClass4.c[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    j = Math.multiplyExact(j, 86400000000000L);
                    break;
                case 2:
                    multiplyExact = Math.multiplyExact(j, 86400000000L);
                    j3 = 1000;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
                case 3:
                    multiplyExact = Math.multiplyExact(j, 86400000L);
                    j3 = 1000000;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
                case 4:
                    multiplyExact = Math.multiplyExact(j, 86400L);
                    j3 = 1000000000;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
                case 5:
                    multiplyExact = Math.multiplyExact(j, 1440L);
                    j3 = 60000000000L;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
                case 6:
                    multiplyExact = Math.multiplyExact(j, 24L);
                    j3 = 3600000000000L;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
                case 7:
                    multiplyExact = Math.multiplyExact(j, 2L);
                    j3 = 43200000000000L;
                    j = multiplyExact;
                    j2 /= j3;
                    break;
            }
            return Math.addExact(j, j2);
        }
        return interfaceC8540dpj.d(this, d2);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.c.a(interfaceC8535dpe) : this.a.a(interfaceC8535dpe) : interfaceC8535dpe.d(this);
    }

    public LocalDateTime a(long j) {
        return e(this.a, j, 0L, 0L, 0L, 1);
    }

    public int b() {
        return this.c.d();
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.c.b(interfaceC8535dpe) : this.a.b(interfaceC8535dpe) : super.b(interfaceC8535dpe);
    }

    public LocalDateTime b(long j) {
        return e(this.a, 0L, j, 0L, 0L, 1);
    }

    @Override // o.InterfaceC8529doz, o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.a() ? this.a : super.b(interfaceC8537dpg);
    }

    public int c() {
        return this.c.c();
    }

    public LocalDateTime c(long j) {
        return e(this.a, 0L, 0L, j, 0L, 1);
    }

    @Override // o.InterfaceC8529doz, o.doX
    /* renamed from: c */
    public LocalDateTime e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, interfaceC8540dpj).f(1L, interfaceC8540dpj) : f(-j, interfaceC8540dpj);
    }

    @Override // o.InterfaceC8529doz
    public boolean c(InterfaceC8529doz interfaceC8529doz) {
        return interfaceC8529doz instanceof LocalDateTime ? e((LocalDateTime) interfaceC8529doz) < 0 : super.c(interfaceC8529doz);
    }

    @Override // o.InterfaceC8529doz, java.lang.Comparable
    /* renamed from: d */
    public int compareTo(InterfaceC8529doz<?> interfaceC8529doz) {
        return interfaceC8529doz instanceof LocalDateTime ? e((LocalDateTime) interfaceC8529doz) : super.compareTo((InterfaceC8529doz) interfaceC8529doz);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: d */
    public LocalDate a() {
        return this.a;
    }

    public LocalDateTime d(long j) {
        return e(this.a, 0L, 0L, 0L, j, 1);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: d */
    public LocalDateTime f(long j, InterfaceC8540dpj interfaceC8540dpj) {
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass4.c[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return d(j);
                case 2:
                    return e(j / 86400000000L).d((j % 86400000000L) * 1000);
                case 3:
                    return e(j / 86400000).d((j % 86400000) * 1000000);
                case 4:
                    return c(j);
                case 5:
                    return b(j);
                case 6:
                    return a(j);
                case 7:
                    return e(j / 256).a((j % 256) * 12);
                default:
                    return c(this.a.h(j, interfaceC8540dpj), this.c);
            }
        }
        return (LocalDateTime) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.c.d(interfaceC8535dpe) : this.a.d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    public int e() {
        return this.a.j();
    }

    public LocalDateTime e(long j) {
        return c(this.a.d(j), this.c);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: e */
    public LocalDateTime c(doW dow) {
        return dow instanceof LocalDate ? c((LocalDate) dow, this.c) : dow instanceof LocalTime ? c(this.a, (LocalTime) dow) : dow instanceof LocalDateTime ? (LocalDateTime) dow : (LocalDateTime) dow.e(this);
    }

    @Override // o.InterfaceC8529doz, o.doX
    /* renamed from: e */
    public LocalDateTime d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? c(this.a, this.c.d(interfaceC8535dpe, j)) : c(this.a.d(interfaceC8535dpe, j), this.c) : (LocalDateTime) interfaceC8535dpe.d(this, j);
    }

    public OffsetDateTime e(ZoneOffset zoneOffset) {
        return OffsetDateTime.c(this, zoneOffset);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: e */
    public ZonedDateTime b(ZoneId zoneId) {
        return ZonedDateTime.a(this, zoneId);
    }

    @Override // o.InterfaceC8529doz, o.doW
    public doX e(doX dox) {
        return super.e(dox);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(DataOutput dataOutput) {
        this.a.a(dataOutput);
        this.c.c(dataOutput);
    }

    @Override // o.InterfaceC8529doz
    public boolean e(InterfaceC8529doz interfaceC8529doz) {
        return interfaceC8529doz instanceof LocalDateTime ? e((LocalDateTime) interfaceC8529doz) > 0 : super.e(interfaceC8529doz);
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        if (!(interfaceC8535dpe instanceof ChronoField)) {
            return interfaceC8535dpe != null && interfaceC8535dpe.a(this);
        }
        ChronoField chronoField = (ChronoField) interfaceC8535dpe;
        return chronoField.d() || chronoField.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.a.equals(localDateTime.a) && this.c.equals(localDateTime.c);
        }
        return false;
    }

    @Override // o.InterfaceC8529doz
    public LocalTime f() {
        return this.c;
    }

    @Override // o.InterfaceC8529doz
    public int hashCode() {
        return this.a.hashCode() ^ this.c.hashCode();
    }

    @Override // o.InterfaceC8529doz
    public String toString() {
        String localDate = this.a.toString();
        String localTime = this.c.toString();
        return localDate + "T" + localTime;
    }
}
